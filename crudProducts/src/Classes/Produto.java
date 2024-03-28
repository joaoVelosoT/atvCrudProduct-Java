package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Produto {
	private int codigoProduto;
	private String nomeProduto;
	private String descProduto;
	private int qtdProduto;
	private double precoProduto;
	
	
	
	
	public Produto(int codigoProduto, String nomeProduto, String descProduto, int qtdProduto, double precoProduto) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.descProduto = descProduto;
		this.qtdProduto = qtdProduto;
		this.precoProduto = precoProduto;
	}
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescProduto() {
		return descProduto;
	}
	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	public String exibirDetalhes(String fileName) {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler do arquivo: " + e.getMessage());
		}
		return content.toString();
	}
	public void gravaEstoque(String fileName, String produto) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
			writer.write(produto);
			writer.newLine();
		} catch (Exception e) {
			System.out.println("Erro ao escrever no produto");
		}
	}
}

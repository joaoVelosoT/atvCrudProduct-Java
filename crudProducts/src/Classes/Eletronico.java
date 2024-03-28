package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Eletronico extends Produto {
	private String marcaEletronico;
	private String modeloEletronico;

	public Eletronico(int codigoProduto, String nomeProduto, String descProduto, int qtdProduto, double precoProduto,
			String marcaEletronico, String modeloEletronico) {
		super(codigoProduto, nomeProduto, descProduto, qtdProduto, precoProduto);
		this.marcaEletronico = marcaEletronico;
		this.modeloEletronico = modeloEletronico;
	}

	public String getMarcaEletronico() {
		return marcaEletronico;
	}

	public void setMarcaEletronico(String marcaEletronico) {
		this.marcaEletronico = marcaEletronico;
	}

	public String getModeloEletronico() {
		return modeloEletronico;
	}

	public void setModeloEletronico(String modeloEletronico) {
		this.modeloEletronico = modeloEletronico;
	}

	@Override
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

	@Override
	public void gravaEstoque(String fileName, String produto) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
			writer.write(produto);
			writer.newLine();
		} catch (Exception e) {
			System.out.println("Erro ao escrever no produto");
		}
	}

}

package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
public class Alimento extends Produto {

	private LocalDate dataValidade = LocalDate.now();

	public Alimento(int codigoProduto, String nomeProduto, String descProduto, int qtdProduto, double precoProduto) {
		super(codigoProduto, nomeProduto, descProduto, qtdProduto, precoProduto);
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
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

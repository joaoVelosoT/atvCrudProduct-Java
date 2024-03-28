package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Scanner;

public class Sistem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("cade");
		do {

			menu();
			int escolha = sc.nextInt();

			switch (escolha) {

			case 1: {
				// produto
				int codigo = 0;
				String nome = "";
				String desc = "";
				int qtd = 0;
				double preco = 0;

				boolean codigoPositivo = false;
				while (codigoPositivo == false) {
					System.out.println("Digite o codigo do produto");
					try {
						codigo = sc.nextInt();
						if (codigo < 0) {
							System.err.println("Erro - Digite um codigo maior que 0");
						} else {
							codigoPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				boolean nomeVazio = false;
				while (nomeVazio == false) {
					System.out.println("Digite o nome");
					nome = sc.nextLine();
					if (nome.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						nomeVazio = true;
					}
				}
				boolean descVazio = false;
				while (descVazio == false) {
					System.out.println("Digite a desc");
					desc = sc.nextLine();
					if (desc.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						descVazio = true;
					}
				}

				boolean qtdPositivo = false;
				while (qtdPositivo == false) {
					System.out.println("Digite a quantidade de produtos");
					try {
						qtd = sc.nextInt();
						if (qtd < 0) {
							System.err.println("Erro - Digite um codigo maior que 0");
						} else {
							qtdPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				boolean precoPositivo = false;
				while (precoPositivo == false) {
					System.out.println("Digite o Preço");
					try {
						preco = sc.nextDouble();
						if (preco < 0) {
							System.err.println("Erro - Digite um valor maior que 0R$");
						} else {
							precoPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				Produto produto = new Produto(codigo, nome, desc, qtd, preco);
				String prodString = "Produto: " + nome + "| Codigo: " + codigo + "| Descrição: " + desc
						+ "| Quantidade: " + qtd + "| Preço: " + preco;
				System.out.println(prodString);
				produto.gravaEstoque("estoque.txt", prodString);
				continue;
			}
			case 2: {
				// produto
				int codigo = 0;
				String nome = "";
				String desc = "";
				int qtd = 0;
				double preco = 0;

				boolean codigoPositivo = false;
				while (codigoPositivo == false) {
					System.out.println("Digite o codigo do produto");
					try {
						codigo = sc.nextInt();
						if (codigo < 0) {
							System.err.println("Erro - Digite um codigo maior que 0");
						} else {
							codigoPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				boolean nomeVazio = false;
				while (nomeVazio == false) {
					System.out.println("Digite o nome");
					nome = sc.nextLine();
					if (nome.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						nomeVazio = true;
					}
				}
				boolean descVazio = false;
				while (descVazio == false) {
					System.out.println("Digite a desc");
					desc = sc.nextLine();
					if (desc.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						descVazio = true;
					}
				}

				boolean qtdPositivo = false;
				while (qtdPositivo == false) {
					System.out.println("Digite a quantidade de produtos");
					try {
						qtd = sc.nextInt();
						if (qtd < 0) {
							System.err.println("Erro - Digite um codigo maior que 0");
						} else {
							qtdPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				boolean precoPositivo = false;
				while (precoPositivo == false) {
					System.out.println("Digite o Preço");
					try {
						preco = sc.nextDouble();
						if (preco < 0) {
							System.err.println("Erro - Digite um valor maior que 0R$");
						} else {
							precoPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}
				Alimento alimento = new Alimento(codigo, nome, desc, qtd, preco);

				String data = "";
				boolean formatoCorreto = false;
				LocalDate newDate = LocalDate.now();
				while (formatoCorreto == false) {
					try {
						System.out.println("Digite a data de validade; yyyy-MM-dd");
						data = sc.nextLine();
						alimento.getDataValidade().parse(data);

						newDate = LocalDate.parse(data);
						alimento.setDataValidade(newDate);
						if (data.length() < 10) {
							System.out.println("Digite no formato correto!!!!!!");
						} else {
							formatoCorreto = true;
						}
					} catch (Exception e) {
						System.out.println("DIGITE NO FORMATO CORRETO");
					}
				}

				String alimentoString = "Alimento: " + nome + "| Codigo: " + codigo + "| Descrição: " + desc
						+ "| Quantidade: " + qtd + "| Preço: " + preco + "| Data De Validade:" + newDate;
				System.out.println(alimentoString);
				alimento.gravaEstoque("estoque.txt", alimentoString);
				continue;
			}
			case 3: {

				int codigo = 0;
				String nome = "";
				String desc = "";
				int qtd = 0;
				double preco = 0;
				String marca = "";
				String modelo = "";

				boolean codigoPositivo = false;
				while (codigoPositivo == false) {
					System.out.println("Digite o codigo do produto");
					try {
						codigo = sc.nextInt();
						if (codigo < 0) {
							System.err.println("Erro - Digite um codigo maior que 0");
						} else {
							codigoPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				boolean nomeVazio = false;
				while (nomeVazio == false) {
					System.out.println("Digite o nome");
					nome = sc.nextLine();
					if (nome.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						nomeVazio = true;
					}
				}
				boolean descVazio = false;
				while (descVazio == false) {
					System.out.println("Digite a desc");
					desc = sc.nextLine();
					if (desc.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						descVazio = true;
					}
				}

				boolean qtdPositivo = false;
				while (qtdPositivo == false) {
					System.out.println("Digite a quantidade de produtos");
					try {
						qtd = sc.nextInt();
						if (qtd < 0) {
							System.err.println("Erro - Digite um codigo maior que 0");
						} else {
							qtdPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				boolean precoPositivo = false;
				while (precoPositivo == false) {
					System.out.println("Digite o Preço");
					try {
						preco = sc.nextDouble();
						if (preco < 0) {
							System.err.println("Erro - Digite um valor maior que 0R$");
						} else {
							precoPositivo = true;
						}
					} catch (Exception e) {
						System.err.println("Erro - Digite um valor numerico");
					}
					sc.nextLine();
				}

				boolean marcaVazio = false;
				while (marcaVazio == false) {
					System.out.println("Digite a marca");
					marca = sc.nextLine();
					if (marca.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						marcaVazio = true;
					}
				}

				boolean modeloVazio = false;
				while (modeloVazio == false) {
					System.out.println("Digite o modelo");
					modelo = sc.nextLine();
					if (modelo.length() == 0) {
						System.err.println("Não deixe espaços vazios");

					} else {
						modeloVazio = true;
					}
				}

				Eletronico eletronico = new Eletronico(codigo, nome, desc, qtd, preco, marca, modelo);
				String eletroString = "Eletronico: " + nome + "| Codigo: " + codigo + "| Descrição: " + desc
						+ "| Quantidade: " + qtd + "| Preço: " + preco + "| Marca: " + marca + "| Modelo: " + modelo;
				System.out.println(eletroString);
				eletronico.gravaEstoque("estoque.txt", eletroString);
				continue;
			}
			case 4: {
				System.out.println(exibirDetalhes("Estoque.txt"));
			}
			}

		} while (true);

	}

	public static void menu() {
		System.out.println("-----------------------------");
		System.out.println("1 - Criar novo produto");
		System.out.println("2 - Criar novo alimento");
		System.out.println("3 - Cria novo eletronico");
		System.out.println("4 - Exibir estoque");
		System.out.println("-----------------------------");
	}

	public static String exibirDetalhes(String fileName) {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler do arquivo: " + e.getMessage());
		}
		return content.toString();
	}
}

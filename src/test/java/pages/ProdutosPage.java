package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class ProdutosPage {

	By user = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	By addCarrinho = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By addProduto1 = By.id("add-to-cart-sauce-labs-bike-light");
	By addProduto2 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By addProduto3 = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By addProduto4 = By.id("add-to-cart-sauce-labs-onesie");
	By addProduto5 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By carrinho = By.xpath("//*[@class = 'shopping_cart_link']");
	By produtoAdd = By.xpath("//*[@class='inventory_item_name']");
	By removerCarrinho = By.id("remove-sauce-labs-fleece-jacket");
	By btnFiltro = By.xpath("//select[@class = 'product_sort_container']");
	By nProdCarrinho = By.xpath("//span[@class='shopping_cart_badge' and text()='5']");
	
	Metodos metodos = new Metodos();

	public void login(String user, String password) {

		metodos.escrever(this.user, user);
		metodos.escrever(this.password, password);
		metodos.clicar(btnLogin);
	}

	public void adicionar() {
		metodos.addCarrinho(addCarrinho);

	}
	public void adicionarQuatroProdutos() {
		metodos.addCarrinho(addProduto1);
		metodos.addCarrinho(addProduto2);
		metodos.addCarrinho(addProduto3);
		metodos.addCarrinho(addProduto4);
		

	}
	
	public void validarNCarrinho() {
		
	}

	public void remover() {
		metodos.removerCarrinho(removerCarrinho);

	}

	public void ordenarProdutos(int opcao) {

		metodos.clicar(btnFiltro);
		switch (opcao) {
		case 1:
			By az = By.xpath("//option[@value = 'az']");
			metodos.clicar(az);

			break;
		case 2:
			By za = By.xpath("//option[@value = 'za']");
			metodos.clicar(za);

			break;

		case 3:
			By lohi = By.xpath("//option[@value = 'lohi']");
			metodos.clicar(lohi);

			break;

		case 4:
			By hilo = By.xpath("//option[@value = 'hilo']");
			metodos.clicar(hilo);

			break;
		default:
			System.out.println("***************escolha opcao**************");
			break;
		}

	}

	public void acessarCarrinho() {
		metodos.addCarrinho(carrinho);

	}

	public void validarCarrinho() {
		metodos.validarProduto(produtoAdd);
	}
	
	public void printInlcuirProdutos() {
		metodos.evidencia("Incluir Produtos");
	}
	
	public void printRemoverProduto() {
		metodos.evidencia("Remover Produto");
	}
	
	public void printOrdenarProdutos() {
		metodos.evidencia("Ordenar Produtos");
	}
	
	public void printAcessarCarrinho() {
		metodos.evidencia("Acessar Carrinho");
	}
	
	
}

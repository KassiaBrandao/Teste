package Automacao.Steps;

import static org.junit.Assert.assertTrue;

import Automacao.Pages.Usuario.UsuarioActions;
import Automacao.Setup.SetUp;
import io.cucumber.java.en.And;


public class UsuarioSteps {

    private UsuarioActions usuarioActions = new UsuarioActions(SetUp.getDriver());
    
    @And("acesso o modulo de usuário")
	public void Seleciono_Filtro_Usuario() {
		assertTrue("modulo de usuário não selecionado.", usuarioActions.SelecionoFiltroUsuario());
	}

    @And("Clico na opção de usuário {string}")
	public void Clico_Opcao_Usuario(String opcao) {
		assertTrue("opcao não selecionada.", usuarioActions.SelecionoFiltroUsuario());
	}

    
}

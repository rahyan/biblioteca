public class Bibliotecaria {

		private Biblioteca biblioteca;
		
		public Bibliotecaria(Biblioteca biblioteca){
			this.biblioteca = biblioteca;
		}
		
		public boolean adicionarUsuario(Usuario user){
			if(biblioteca.bancoUsuarios.contains(user)){
				//System.out.println("Usu�rio j� cadastrado!");
				return false;
			}
			else {
				biblioteca.bancoUsuarios.add(user);
				return true;
			}
		}
		
		public boolean removerUsuario(Usuario user){
			if(!biblioteca.bancoUsuarios.contains(user)){
				//System.out.println("Usu�rio n�o cadastrado, imposs�vel remover!");
				return false;
			}
			else {
				biblioteca.bancoUsuarios.remove(user);
				return true;
			}
		}
		
		public boolean bloquearUsuarioPorAtraso(Usuario user){
			if(!biblioteca.bancoUsuarios.contains(user)){
				//System.out.println("Usu�rio n�o cadastrado, imposs�vel bloquear!");
				return false;
			}
			else{
				user.status = 1;
				return true;
			}
		}
}
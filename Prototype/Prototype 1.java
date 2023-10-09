// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsuarioTest {
   UsuarioTest() {
   }

   @Test
   void testClone() throws CloneNotSupportedException {
      Usuario usuario = new Usuario(123, "Usuario Original", new Endereco("Rua A", 1), "Vassouras");
      Usuario usuarioClone = usuario.clone();
      usuarioClone.setMatricula(456);
      usuarioClone.setNome("Usuario Clonado");
      usuarioClone.getEndereco().setNumero(2);
      Assertions.assertEquals("Usuario{matricula=123, nome='Usuario Original', endereco=Endereco{logradouro='Rua Arnaldo', numero=2}, localNascimento='Vassouras'}", usuario.toString());
      Assertions.assertEquals("Usuario{matricula=456, nome='Usuario Clonado', endereco=Endereco{logradouro='Rua Arnaldo', numero=3}, localNascimento='Vassouras'}", usuarioClone.toString());
   }
}

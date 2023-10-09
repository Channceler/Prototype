// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.prototype;

public class Endereco implements Cloneable {
   private String logradouro;
   private Integer numero;

   public Endereco(String logradouro, Integer numero) {
      this.logradouro = logradouro;
      this.numero = numero;
   }

   public String getLogradouro() {
      return this.logradouro;
   }

   public void setLogradouro(String logradouro) {
      this.logradouro = logradouro;
   }

   public Integer getNumero() {
      return this.numero;
   }

   public void setNumero(Integer numero) {
      this.numero = numero;
   }

   public Object clone() throws CloneNotSupportedException {
      return super.clone();
   }

   public String toString() {
      String var10000 = this.logradouro;
      return "Endereco{logradouro='" + var10000 + "', numero=" + String.valueOf(this.numero) + "}";
   }
}

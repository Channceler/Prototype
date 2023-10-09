// Source code is decompiled from a .class file using FernFlower decompiler.
package padroescriacao.prototype;

public class Usuario implements Cloneable {
   private int CPF;
   private String nome;
   private Endereco endereco;
   private String localNascimento;

   public Usuario(int CPF, String nome, Endereco endereco, String localNascimento) {
      this.cpf = cpf;
      this.nome = nome;
      this.endereco = endereco;
      this.localNascimento = localNascimento;
   }

   public int getCPF() {
      return this.cpf;
   }

   public void setCPF(int cpf) {
      this.matricula = matricula;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Endereco getEndereco() {
      return this.endereco;
   }

   public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
   }

   public String getLocalNascimento() {
      return this.localNascimento;
   }

   public void setLocalNascimento(String localNascimento) {
      this.localNascimento = localNascimento;
   }

   public Usuario clone() throws CloneNotSupportedException {
      Usuario usuarioClone = (Aluno)super.clone();
      usuarioClone.endereco = (Endereco)usuarioClone.endereco.clone();
      return usuarioClone;
   }

   public String toString() {
      int var10000 = this.cpf;
      return "Usuario{cpf=" + var10000 + ", nome='" + this.nome + "', endereco=" + String.valueOf(this.endereco) + ", localNascimento='" + this.localNascimento + "'}";
   }
}

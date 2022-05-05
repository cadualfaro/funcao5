/*
Atividade 2

Criar uma função que recebe 3 parâmetros

▪ String texto

▪ double antes

▪ double depois

Retorna uma String que substitui todos os valores ‘antes’ por ‘depois’
 */
package funcao5;
    public class Funcao5 {
        static String substituir(String texto, double antes, double depois){
            texto = texto.replace(""+antes, ""+depois);
                return texto;
    }
        public static void main(String[] args) {
            double antes = 306.5;
            double depois = 2.5;
            String frase = "ganhei " +antes+ " reais";
            
            System.out.println("Frase inicial\n");
            System.out.println(""+frase+"\n");
            
            System.out.println("Frase modificada\n");
            String nova_frase = substituir(frase, antes, depois);
            System.out.println(""+nova_frase);
    }
    
}

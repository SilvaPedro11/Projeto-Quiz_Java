  package quiz;

import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
        int cont = 0;
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int q5 = 0;
        int q6 = 0;
        int q7 = 0;
        int q8 = 0;
        int q9 = 0;
        int q10 = 0;
        
        
        do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 1\n"
                    + "Quem foi o campeão da copa do mundo de 1990?\n"
                    + "1 - Argentina\n"
                    + "2 - Alemanha\n"
                    + "3 - Itália\n"
                    + "4 - Brasil");
             q1 = Integer.parseInt(X);
            
            switch(q1){
                case 1:
                break;
                
                case 2:
                cont++;    
                break;
                
                case 3:
                break;
                    
                case 4:
                break;
                    
                default:
                break;
                
            }
        }while(q1 <1 || q1 >=5);
        
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 2\n"
                    + "Qual é o maior artilheiro da história das Copas do Mundo?\n"
                    + " 1 - Ronaldo, do Brasil\n"
                    + " 2 - Just Fontaine, da França\n"
                    + " 3 - Lionel Messi, da Argentina\n"
                    + " 4 - Thomas Muller, da Alemanha\n");
             q2 = Integer.parseInt(X);
            
            switch(q2){
                case 1:
                break;
                
                case 2:
                break;
                
                case 3:
                break;
                    
                case 4:
                cont++;
                break;
                    
                default:
                break;
                
            }
        }while(q2 <1 || q2 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 3\n"
                    + "Qual país ganhou a primeira Copa do Mundo?\n"
                    + " 1 - Brasil \n"
                    + " 2 - Itália \n"
                    + " 3 - Uruguai \n"
                    + " 4 - Japão \n");
             q3 = Integer.parseInt(X);
            
            switch(q3){
                case 1:
                break;
                
                case 2:
                break;
                
                case 3:
                cont++;
                break;
                    
                case 4:
                    
                break;
                    
                default:
                break;
                
            }
        }while(q3 <1 || q3 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 4\n"
                    + "Quais foram os dois anos em que o Brasil sediou a Copa do Mundo?\n"
                    + " 1 - 1958 e 1962 \n"
                    + " 2 - 1994 e 2002 \n"
                    + " 3 - 1950 e 2014 \n"
                    + " 4 - 1958 e 2014 \n");
             q4 = Integer.parseInt(X);
            
            switch(q4){
                case 1:
                break;
                
                case 2:
                break;
                
                case 3:
                cont++;
                break;
                    
                case 4:
                    
                break;
                    
                default:
                break;
                
            }
        }while(q4 <1 || q4 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 5\n"
                    + "Qual é o atual campeão mundial?\n"
                    + " 1 - França \n"
                    + " 2 - Espanha \n"
                    + " 3 - Brasil \n"
                    + " 4 - Bélgica \n");
             q5 = Integer.parseInt(X);
            
            switch(q5){
                case 1:
                cont++;
                break;
                
                case 2:
                break;
                
                case 3:
 
                break;
                    
                case 4:
                    
                break;
                    
                default:
                break;
                
            }
        }while(q5 <1 || q5 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 6\n"
                    + "Qual foi o jogador que mais venceu a Copa do Mundo?\n"
                    + " 1 - Puskas \n"
                    + " 2 - Maradona \n"
                    + " 3 - Daniel Alves \n"
                    + " 4 - Pelé \n");
             q6 = Integer.parseInt(X);
            
            switch(q6){
                case 1:
                break;
                
                case 2:
                break;
                
                case 3:
                break;
                    
                case 4:
                cont++;    
                break;
                    
                default:
                break;
                
            }
        }while(q6 <1 || q6 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 7\n"
                    + "Quantas copas o Brasil tem?\n"
                    + " 1 - Quatro \n"
                    + " 2 - Cinco \n"
                    + " 3 - Seis \n"
                    + " 4 - Sete \n");
             q7 = Integer.parseInt(X);
            
            switch(q7){
                case 1:
                break;
                
                case 2:
                cont++;
                break;
                
                case 3:
                break;
                    
                case 4:    
                break;
                    
                default:
                break;
                
            }
        }while(q7 <1 || q7 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 8\n"
                    + "Quando foi a primeira vez que os cartões vermelhos e amarelos foram utilizados em uma Copa do Mundo?\n"
                    + " 1 - 1930 \n"
                    + " 2 - 1970 \n"
                    + " 3 - 1982 \n"
                    + " 4 - 1938 \n");
             q8 = Integer.parseInt(X);
            
            switch(q8){
                case 1:
                break;
                
                case 2:
                cont++;
                break;
                
                case 3:
                break;
                    
                case 4:   
                break;
                    
                default:
                break;
                
            }
        }while(q8 <1 || q8 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 9\n"
                    + "Quais foram os 2 países que chegaram mais vezes em finais da Copa do Mundo de todos os tempos?\n"
                    + " 1 - Argentina e Holanda \n"
                    + " 2 - Itália e Croácia \n"
                    + " 3 - Brasil e Alemanha \n"
                    + " 4 - França e Portugal \n");
             q9 = Integer.parseInt(X);
            
            switch(q9){
                case 1:
                break;
                
                case 2:
                break;
                
                case 3:
                cont++;
                break;
                    
                case 4:    
                break;
                    
                default:
                break;
                
            }
        }while(q9 <1 || q9 >=5);
         
         do{
            String X = JOptionPane.showInputDialog(null, 
            "Questão 10\n"
                    + "Qual é o único jogador que já participou de 3 finais de Copa do Mundo seguidas?\n"
                    + " 1 - Cafu \n"
                    + " 2 - Messi \n"
                    + " 3 - Cristiano Ronaldo \n"
                    + " 4 - Pelé \n");
             q10 = Integer.parseInt(X);
            
            switch(q10){
                case 1:
                cont++;
                break;
                
                case 2:
                break;
                
                case 3:
                break;
                    
                case 4:    
                break;
                    
                default:
                break;
                
            }
        }while(q10 <1 || q10 >=5);
       
        if(cont <=4){
            JOptionPane.showMessageDialog(null, "VOCÊ NÃO DOMINA O ASSUNTO");
            }
        else if(cont ==5 || cont ==6 ){ 
	    JOptionPane.showMessageDialog(null, "VOCÊ POSSUI CONHECIMENTO BÁSICO NO ASSUNTO");
	      
	}else if(cont ==7 || cont <=9 ){
	    JOptionPane.showMessageDialog(null, "VOCÊ É QUASE UM MESTRE");
        }
        
        else{
            JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ TEM PROFUNDOS CONHECIMENTOS SOBRE O ASSUNTO");
        }
    }
        
    }
    


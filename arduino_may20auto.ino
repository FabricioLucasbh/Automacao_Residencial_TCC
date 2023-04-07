int Quarto1 =  2;
int Quarto2 = 3;
int Banheiro = 4;
int Sala = 5;
int Cozinha = 6;
int AreaExterna = 7;
int Garagem = 8;

//atribui o pino 1 a 7 variável 
int dados
; //variável que receberá os dados da porta serial
 
void setup(){
  Serial.begin(9600);//frequência da porta serial
   pinMode(Quarto1,OUTPUT);
   pinMode(Quarto2,OUTPUT);
   pinMode(Banheiro,OUTPUT);
   pinMode(Sala,OUTPUT);
   pinMode(Cozinha,OUTPUT);
   pinMode(AreaExterna,OUTPUT);
   pinMode(Garagem,OUTPUT);
   
   
   //define o pino o ledPin como saída
}
 
void loop(){
  if(Serial.available() > 0){ //verifica se existe comunicação com a porta serial
      dados = Serial.read(); //lê os dados da porta serial
      
      switch(dados){
        case 1:
           digitalWrite(Quarto1,LOW); //liga o pino
                
        break;
        case 2:
           digitalWrite(Quarto1,HIGH); //desliga o pino
           break;
              
        case 3:
            digitalWrite(Quarto2, LOW);
            break;
        case 4:
            digitalWrite(Quarto2,HIGH); 
            break;

        case 5:
            digitalWrite(Banheiro, LOW);
            break;
        
        case 6:
            digitalWrite(Banheiro,HIGH); 
            break;
        
        case 7:
            digitalWrite(Sala, LOW);
            break;
        
        case 8:
            digitalWrite(Sala,HIGH); 
            break;
        
        case 9:
            digitalWrite(Cozinha, LOW);
            break;
        
        case 10:
            digitalWrite(Cozinha,HIGH); 
            break;
        case 11:
            digitalWrite(AreaExterna, LOW);
            break;
        case 12:
            digitalWrite(AreaExterna,HIGH); 
            break;
         case 13:
            digitalWrite(Garagem, LOW);
            break;
        case 14:
            digitalWrite(Garagem,HIGH); 
            break;   
       }
  }
      }
     
   
      

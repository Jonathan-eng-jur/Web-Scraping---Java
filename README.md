# Web-Scraping---Java
Programa para análise de HTML de uma URL de um site HTTP ou HTTPS.

Como usar essa aplicação:

1. Realizar o download ou realizar o clone desta aplicação pelo terminal;
2. Iniciar a aplicação no Eclipse ou outra IDE que possa executar programas em Java;
3. Para testar efetivamente nosso programa, deve startar a aplicação que irá solicitar um link (url) de site em HTTP ou HTTPS:
 ((https://cadastro-vacina.s3-sa-east-1.amazonaws.com/IMAGENS/axxur.jpg)) 

No caso acima o retorno foi: suspicious. 

Nosso programa está configurado para verificar o HTML e procurar as seguintes palavras:  
* "black friday", "promoção" e "senha";

Caso o site seja válido o retorno será: safe;

LOTOFÁCIL em Java com interface grafica
Este é um projeto onde vamos criar uma lotofácil para que os usuários possam realizar apostas e consecutivamente receber prêmios por elas. Essa lotofácil será dividida em três etapas: apostas de 1 a 100, apostas de A à Z e apostas entre par ou ímpar.

Regras para a aposta de 0 a 100:
Utilizei a biblioteca Scanner, para que o programa leia se o número escolhido está entre 0 e 100, e caso não esteja, seja imprida a mensagem de aposta inválida.
Utilizei a biblioteca Random para ser sorteado um número de 0 a 100.
Feito isso, o programa vai comparar o número escolhido pelo apostador e o número do sistema.
Regras para a aposta de A à Z:
Utilizei o método System.in.read() para ler um caractere de A à Z , sendo ele maiúsculo ou minúsculo. Se não for uma letra, a aposta será inválida. Utilizei o método Character.isLetter() para ver se a entrada digitada é uma letra válida.
A aposta do usuário será covertida para maiúscula pelo Character.toUpperCase().
Feito isso, o programa vai comparar a letra escolhida com a letra do sistema, que será a inicial do meu nome (B).
Regras para a aposta de número par ou ímpar:
Utilizei a biblioteca Scanner para ler um número inteiro escolhido pelo apostador.
Utilizei o operador de módulo (%) para verificar se o número é par ou ímpar.
Se a divisão do número por 2 for 0, o número é par.
REGRA LOTOFÁCIL:
O usuário poderá apostar quantas vezes ele quiser. Enquanto o usuário não digitar 0 para sair, novas apostas serão permitidas.

Como rodar o projeto
Certifique-se de ter o JDK instalado em sua máquina.

Siga as instruções do código.

Vá até o diretório do projeto.

Compile o código-fonte.

Execute o programa.

Siga as instruções para fazer suas apostas na LOTOFÁCIL.

Este projeto foi desenvolvido utilizando a versão do JDK 21. Bibliotecas usadas: Scanner,Random. Métodos usados: System.in.read(),Character.toUpperCase().

SUPORTE UTILIZADO NO TRABALHO: Chatgpt e Github/lucas-novaesm

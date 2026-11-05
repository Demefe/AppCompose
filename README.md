# AppCompose

1. O que é entrada em um sistema computacional? Dê dois exemplos.
   - Entrada é qualquer dado ou instrução enviado ao sistema para ser processado.
     
2. Qual é a diferença entre processamento e saída?
  - Processamento é a transformação ou cálculo dos dados de entrada e saída é o resultado visível ou utilizável desse processamento entregue ao usuário.
 
3. Por que o valor digitado em um TextField é inicialmente tratado como texto?
  - Porque os componentes de interface capturam caracteres brutos do teclado.
   
4. Qual é a finalidade de remember e mutableStateOf?
  - MutableStateOf cria um valor que o Compose consegue "observar". Quando esse valor muda, a tela sabe que precisa se atualizar. Remember faz com que o Compose "lembre" desse valor mesmo quando a tela é redesenhada, impedindo que a variável seja resetada para o valor inicial.

5. O que é um evento? Cite os eventos utilizados nesta aplicação.
  - Um evento é uma ação ou acontecimento detectado pelo sistema, geralmente iniciado pelo usuário. OnClick: disparado quando o usuário toca em um botão.
    
6. O que significa recomposição no Jetpack Compose?
  - Recomposição é o processo onde o Compose executa novamente as funções de interface para atualizar a tela com novos dados.
    
7. Qual é a responsabilidade da MainActivity neste projeto?
  - A MainActivity serve como a porta de entrada e o ponto de partida do aplicativo no Android.
    
8. Qual é a responsabilidade de CalculadoraDescontoScreen?
  - Ela organiza os elementos gráficos na tela.
    
9. Por que calcularPrecoComDesconto foi colocada em outro arquivo?
  - Para seguir o princípio de separação de conceitos.
    
10. Qual é a vantagem de uma função de regra de negócio não depender do Compose?
  - Testabilidade, você pode criar testes unitários automatizados para essa função de forma muito mais rápida e simples, sem precisar simular uma tela de celular. Reutilização, essa função matemática pode ser usada em qualquer outro lugar do sistema, até mesmo em versões web ou desktop, pois ela depende apenas de lógica pura e não de componentes visuais do Android.

# sistema-xadrez-java
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/PedroRSilveira/sistema-xadrez-java/blob/main/LICENSE)
# Sobre o projeto

sistema-xadrez-java é um jogo de xadrez que roda no terminal do computador. Seguindo as regras do jogo original para quantidade de peças (que são representadas na tela pela sua inicial em inglês), sua disposição no tabuleiro e seus movimentos.

# Demonstração do software

No terminal, conforme a imagem abaixo, é mostrado o tabuleiro com as peças já em suas posições para o jogo, com as peças pretas representadas em amarelo e as brancas em branco. Abaixo está uma lista das peças capturadas por cada jogador, a contagem de turnos, e qual jogador deve ser o próximo a jogar. Source indica qual peça o jogador quer mover.

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/89012e3d-b25d-4f11-96a1-c879909e437f)

> Para fazer uma jogada:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/da3e5117-e179-4420-b6ac-14df3abe8bb4)

Na linha source o jogador deve indicar pela letra e número a posição da peça que deseja mover, então os movimentos possíveis para essa peça serão destacados em azul no tabuleiro. Então a última linha será Target, onde o jogador deverá digitar a letra e número da posição que deseja se mover.

Tabuleiro após a jogada:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/95c489c0-cccd-4ad9-a09b-ca85820f20f4)

- Jogada especial Roque:

No caso em que as peças estão nessa posição, o rei pode fazer a jogada especial roque grande, em que vai trocar de lugar com a torre mais distante da sua posição.

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/e45c7570-1568-4700-a762-02b18732019f)

Tabuleiro após a jogada:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/f12e3b1e-cf49-4912-83b7-6d4b8eeb6875)

No caso em que as peças estão na seguinte posição, o rei pode fazer a jogada especial roque pequeno, em que vai trocar de lugar com a torre mais próxima da sua posição.

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/b7ecafa1-73c3-4328-98e0-e6ffbc69c7e8)

Tabuleiro após a jogada:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/d3f51cdf-5ecf-4acd-8d14-8052be29e3f8)

- Jogada especial En passant:

O jogador pode fazer essa jogada quando seu peão está na 5ª fila (em relação ao jogador) e um peão adversário avança duas casas "passando" do seu lado, como demonstrado na imagem a baixo.

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/b3dddebe-bf18-4610-b59f-b5c7852ef8aa)

Tabuleiro após a jogada:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/3b0f1b23-692f-413c-887a-a5faf72beb4e)

- Jogada especial Promoção:

Quando o peão chega do outro lado do tabuleiro ele é promovido e deve escolher tornar-se uma rainha, torre, bispo ou cavalo. Todos os peões podem fazer isso desde que chegem do outro lado sem serem capturados.
Escolhendo a peça para promover o peão:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/2f7b5429-3880-4c39-8d9d-87414564c4b4)

Tabuleiro após a promoção:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/5f5aa37a-eb9b-4bd5-b83e-e49632806186)

- Lógica de xeque:

Quando o rei está sob ameaça de ser capturado, o jogador entra no modo de xeque, em que só pode fazer movimentos para impedir que seu rei seja capturado, seja movendo o próprio rei ou outra peça que impeça que ele seja capturado.

Um exemplo de quando o rei está em xeque:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/83c7e3d7-4775-47ef-a08f-82243b9b0c21)

- Lógica de xeque-mate:

Ocorre quando o rei está em xeque e não tem uma jogada que o faça escapar, quando acontece um xeque-mate a partida termina imediatamente e o jogador que o fez vence.

Um exemplo de xeque-mate:

![image](https://github.com/PedroRSilveira/sistema-xadrez-java/assets/120536516/324711e7-49f1-4640-9ba4-cfaa580c01f4)

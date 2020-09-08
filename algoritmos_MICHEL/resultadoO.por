programa {
    inclua biblioteca Util
    inteiro numJog = 0
    funcao inicio() { 
        caracter jogo [3][3] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}
        realizarJogada(0,0,'X',jogo)
        realizarJogada(1,1,'O',jogo)
        realizarJogada(2,0,'X',jogo)
        realizarJogada(1,0,'O',jogo)
        realizarJogada(2,2,'X',jogo)
        realizarJogada(2,1,'O',jogo)
        realizarJogada(0,1,'X',jogo)
        realizarJogada(1,2,'O',jogo)
}

    funcao realizarJogada(inteiro linha, inteiro coluna, caracter marca, caracter jogo[][]) {
        jogo[linha][coluna] = marca
        numJog++
        imprimeJogo(jogo)
        verificaJogo(jogo)
}

    funcao imprimeJogo(caracter jogo[][]){
        limpa()
        escreva(jogo[0][0], " | ", jogo[0][1], " | ", jogo[0][2], '\n')
        escreva("--+---+---\n")
        escreva(jogo[1][0], " | ", jogo[1][1], " | ", jogo[1][2], '\n')
        escreva("--+---+---\n")
        escreva(jogo[2][0], " | ", jogo[2][1], " | ", jogo[2][2], '\n')
        Util.aguarde(1500)
    }
    
    funcao verificaJogo(caracter jogo[][]){
        se (jogo[0][0] == 'X' e jogo[0][1] == 'X' e jogo[0][2] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[1][0] == 'X' e jogo[1][1] == 'X' e jogo[1][2] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[2][0] == 'X' e jogo[2][1] == 'X' e jogo[2][2] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[0][0] == 'X' e jogo[1][0] == 'X' e jogo[2][0] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[0][1] == 'X' e jogo[1][1] == 'X' e jogo[2][1] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[0][2] == 'X' e jogo[1][2] == 'X' e jogo[2][2] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[0][0] == 'X' e jogo[1][1] == 'X' e jogo[2][2] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[0][2] == 'X' e jogo[1][1] == 'X' e jogo[2][0] == 'X') {
			escreva("VITÓRIA X \n")
		}
		senao se (jogo[0][0] == 'O' e jogo[0][1] == 'O' e jogo[0][2] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se (jogo[1][0] == 'O' e jogo[1][1] == 'O' e jogo[1][2] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se (jogo[2][0] == 'O' e jogo[2][1] == 'O' e jogo[2][2] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se (jogo[0][0] == 'O' e jogo[1][0] == 'O' e jogo[2][0] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se (jogo[0][1] == 'O' e jogo[1][1] == 'O' e jogo[2][1] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se (jogo[0][2] == 'O' e jogo[1][2] == 'O' e jogo[2][2] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se (jogo[0][0] == 'O' e jogo[1][1] == 'O' e jogo[2][2] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se (jogo[0][2] == 'O' e jogo[1][1] == 'O' e jogo[2][0] == 'O') {
			escreva("VITÓRIA O \n")
		}
		senao se(numJog == 9){
		    escreva("JOGO DEU VELHA!")
		}
    }
}
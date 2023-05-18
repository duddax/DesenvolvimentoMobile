import java.util.Scanner

fun main(args: Array<String>) {

    // Escreva um programa que peça ao usuário para digitar duas palavras e determine qual delas tem mais caracteres.

    println("Digite uma palavra")
    var terminalP1 = Scanner (System.`in`)
    var palavra01 = terminalP1.nextLine()

    println("Digite outra palavra")
    var terminalP2 = Scanner (System.`in`)
    var palavra02 = terminalP2.nextLine()

    if (palavra01 > palavra02) {
        println("Primeira palavra é maior")
    } else {
        println("Segunda palavra é maior")
    }

    //Escreva um programa que peça ao usuário para digitar um número inteiro e determine se ele é positivo ou negativo

    println("Digite um número")
    var numero = Scanner (System.`in`)
    var Numeros = numero.nextInt()

    if (Numeros >= 0) {
        println("Este número é positivo")
    } else {
        println("Este número é negativo")
    }

    //Escreva um programa que peça ao usuário para digitar sua idade e determine se ele é maior ou menor de idade.

    println("Digite sua idade")
    var terminalIdade = Scanner (System.`in`)
    var idade = terminalIdade.nextInt()

    if (idade >= 18) {
        println("Você é maior de idade")
    } else {
        println("Você é menor de idade")
    }

    //Escreva um programa que peça ao usuário para digitar um caractere e determine se ele é uma vogal ou uma consoante

    println("Digite uma letra")
    var terminalLetra = Scanner (System.`in`)
    var Letra = terminalLetra.nextLine()

    if (Letra == "a" || Letra == "e" || Letra == "i" || Letra == "o" || Letra == "u") {
        println("É uma vogal")
    } else {
        println("É uma consoante")
    }

    //Escreva um programa que peça ao usuário para digitar a idade de duas pessoas e determinar se elas têm a mesma idade

    println("Digite a idade de uma pessoa")
    var terminalIdade01 = Scanner(System.`in`)
    var idade01 = terminalIdade01.nextInt()

    println("Digite outra idade")
    var terminalIdade02 = Scanner(System.`in`)
    var idade02 = terminalIdade02.nextInt()

    if (idade01 == idade02) {
        println("Tem a mesma idade")
    } else {
        println("Não tem a mesma idade")
    }

    //Escreva um programa que peça ao usuário para digitar seu salário e determine se ele está abaixo ou acima de média nacional (R$ 2.500,00)

    println("Consulte se seu salário esta na média")
    var terminalSalario = Scanner(System.`in`)
    var salario = terminalSalario.nextDouble()

    if (salario >= 2.500) {
        println("Parabéns, seu salário esta na média")
    } else {
        println("Sinto muito, seu salário não esta na média")
    }

    //Escreva um programa que peça ao usuário para informar 3 números e determinar qual é o maior deles

    println("Informe um número")
    var terminaln1 = Scanner(System.`in`)
    var numero01 = terminaln1.nextInt()

    println("Informe outro número")
    var terminaln2 = Scanner(System.`in`)
    var numero02 = terminaln2.nextInt()

    println("Informe outro número")
    var terminaln3 = Scanner(System.`in`)
    var numero03 = terminaln3.nextInt()

    if (numero01 > numero02 && numero01 > numero03) {
        println("Primeiro numero é o maior")
    } else if (numero02 > numero01 && numero02 > numero03){
        println("Segundo número é o maior")
    } else {
        println("Terceiro número é o maior")
    }

    //Escreva um programa que peça ao usuário para digitar uma idade e determine se ele é adolescente (idade entre 13 e 17 anos).

    println("Digite uma idade")
    var terminalIdadeAd = Scanner(System.`in`)
    var idadeAdolescente = terminalIdadeAd.nextInt()

    if (idadeAdolescente >= 13 && idadeAdolescente <= 17) {
        println("É adolescente")
    } else {
        println("Não é adolescente")
    }


}
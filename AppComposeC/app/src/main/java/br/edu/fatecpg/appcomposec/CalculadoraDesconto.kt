package br.edu.fatecpg.appcomposec

fun calcularPrecoComDesconto(
    preco: Double,
    percentual: Double
): Double{
    val desconto = preco * percentual / 100.0
    return preco-desconto
}
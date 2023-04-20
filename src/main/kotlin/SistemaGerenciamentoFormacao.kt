// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
// @Version 1.0

//Enumeracao de niveis de conhecimento, com as opcoes Iniciante, Medio e Avancado.
enum class Nivel { INICIANTE, MEDIO, AVANCADO }

// Classe que representa um usuario com seu nome
class Usuario(val nome: String, val DDD: Int, val telefone: Int, val Email: String)

// Data class que representa um conteudo educacional, contendo nome e duracao
data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

// Data class que representa uma formacao, contendo nome, nivel de dificuldade, conteudos e lista de usuarios inscritos
data class Formacao(
    val nome: String,
    val nivel: Nivel,
    var conteudos: List<ConteudoEducacional>
) {
    val inscritos = mutableListOf<Usuario>() // Lista de usuarios inscritos

    // Funcao que permite a matricula de um usuario na formacao
    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("${usuario.nome} matriculado(a) na formacao de $nome")
        } else {
            println("${usuario.nome} ja esta matriculado(a) na formacao de $nome")
        }
    }

    //Funcao que permite a desmatricula de um usuario na formacao
    fun desmatricular(usuario: Usuario) {
        if (inscritos.contains(usuario)) {
            inscritos.remove(usuario)
            println("${usuario.nome} desmatriculado(a) da formacao de $nome")
        } else {
            println("${usuario.nome} nao esta matriculado(a) na formacao de $nome")
        }
    }
}

fun main() {
    val usuario1 = Usuario("Caio Bello", 48, 899784897, "desenvolvedorcaio@gmail.com")
    val usuario2 = Usuario("Julia Maria", 11, 878945687, "juliaficticio@uol.com")

    //objetos do tipo ConteudoEducacional para a formacao1, "Primeiros Passos com SQL"
    val conteudo1 = ConteudoEducacional("MySQL - Trabalhando com suas Primeiras Tabelas", 120)
    val conteudo2 = ConteudoEducacional("MySQL - Explorando Relacionamentos com MySQL Workbench", 120)
    val conteudo3 = ConteudoEducacional("MySQL - Consultas com Join", 60)

    val formacao1 = Formacao("Primeiros Passos com SQL", Nivel.INICIANTE, listOf(conteudo1, conteudo2, conteudo3)) //cria um objeto do tipo Formacao com nome "Primeiros Passos com SQL", nivel iniciante e com uma lista de conteudos educacionais

    //objetos do tipo ConteudoEducacional sobre a formação "Docker Fundamentals"
    val conteudo4 = ConteudoEducacional("Introdução ao Docker e containers", 60)
    val conteudo5 = ConteudoEducacional("Primeiros Passos com o Docker", 60)
    val conteudo6 = ConteudoEducacional("Armazenamento de Dados com Docker", 60)
    val conteudo7 = ConteudoEducacional("Processamento, Logs e Rede com Docker", 60)
    val conteudo8 = ConteudoEducacional("Definicao e criacao de um Docker File", 60)
    val conteudo9 = ConteudoEducacional("Docker Compose", 60)

    val formacao2 = Formacao("Docker Fundamentals", Nivel.MEDIO, listOf(conteudo4, conteudo5, conteudo6, conteudo7, conteudo8, conteudo9)) //cria um objeto do tipo Formacao com nome "Docker Fundamentals", nivel medio e com uma lista de conteudos educacionais

    formacao1.matricular(usuario1) //matricula o usuario1 na formacao1
    formacao1.matricular(usuario2) //matricula o usuario2 na formacao1
    formacao1.matricular(usuario1) // Tentando matricular o mesmo usuario duas vezes
    formacao2.matricular(usuario2) // Matricula o usuario2 na formacao2

    println("Informacoes da formacao 1: $formacao1") //
    println("Informacoes da formacao 2: $formacao2") // Imprime a formacao2, que inclui os inscritos

    formacao1.desmatricular(usuario2) // Desmatricula o usuario2 da formacao1

    formacao2.desmatricular(usuario1) // Tentativa de desmatricular o usuario1 da formacao2, que não esta matriculado

    formacao2.matricular(usuario1) // Matricula o usuario2 na formacao2

    println("Formação de ${formacao1.nome}: ${formacao1.inscritos}") // Imprime o nome da formacao1 e os usuarios incristos na formacao1

    println("Formação de ${formacao2.nome}: ${formacao2.inscritos}") // Imprime o nome da formacao1 e os usuarios incristos na formacao2
}
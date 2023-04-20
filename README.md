# sistema-gerenciamento-formacao-educacional-kotlin

Este código em Kotlin é um exemplo de um sistema de gerenciamento de formação educacional. Ele permite a criação de formações com diferentes níveis de dificuldade e conteúdos educacionais, e a matrícula e desmatrícula de usuários nessas formações.

O código consiste em uma enumeração que define os níveis de conhecimento (iniciante, médio e avançado), uma classe que representa um usuário com seu nome, e duas classes de dados: ConteudoEducacional e Formacao.

A classe ConteudoEducacional representa um conteúdo educacional com um nome e duração em minutos. A classe Formacao representa uma formação com um nome, nível de dificuldade, uma lista de conteúdos educacionais e uma lista de usuários inscritos.

O programa tem uma função principal main() que cria alguns usuários, conteúdos educacionais e formações, e executa algumas matrículas e desmatrículas para demonstrar o uso do sistema.

A função matricular() da classe Formacao permite a matrícula de um usuário na formação, e a função desmatricular() permite a desmatrícula. Ambas as funções verificam se o usuário já está matriculado ou não na formação.

Ao final do programa, são impressas as informações das formações, incluindo o número de usuários inscritos em cada uma delas.

O código está bem organizado e utiliza recursos da linguagem Kotlin, como data classes e listas mutáveis, para simplificar a implementação. Ele também inclui comentários explicativos para ajudar na compreensão do código.


#

## Dev. Caio Bello

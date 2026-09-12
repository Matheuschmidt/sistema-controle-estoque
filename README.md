# Sistema de Controle de Estoque

Sistema de controle de estoque desenvolvido em Java, executado via console.

O projeto foi desenvolvido com o objetivo de praticar e consolidar conceitos fundamentais de Java e Programação Orientada a Objetos, como classes, objetos, métodos, encapsulamento, listas e estruturas de repetição.

## Funcionalidades

- Cadastrar produtos
- Gerar ID automaticamente para cada produto
- Listar produtos cadastrados
- Buscar produto pelo ID
- Adicionar produtos ao estoque
- Remover produtos do estoque
- Impedir a remoção de uma quantidade maior que a disponível
- Remover produtos do sistema
- Exibir informações dos produtos
- Menu interativo via console

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

## Conceitos praticados

Durante o desenvolvimento foram utilizados conceitos fundamentais da linguagem Java:

- Classes e objetos
- Construtores
- Encapsulamento
- Getters e setters
- Métodos com parâmetros e retorno
- `List` e `ArrayList`
- Estruturas condicionais
- Estruturas de repetição
- `for`
- `while`
- `switch`
- `Scanner`
- Tratamento de diferentes situações através de condições

## Estrutura do projeto

```text
src/
├── Main.java
├── Produto.java
└── Estoque.java
Produto

Responsável por representar um produto do estoque.

Possui informações como:

ID
Nome
Preço
Quantidade em estoque
Estoque

Responsável pelo gerenciamento dos produtos.

Entre suas responsabilidades estão:

Cadastro de produtos
Busca por ID
Adição de estoque
Remoção de estoque
Exclusão de produtos
Listagem dos produtos
Main

Responsável pela interação com o usuário através do console e pelo funcionamento do menu principal do sistema.

Como executar
Clone o repositório:
git clone https://github.com/Matheuschmidt/sistema-controle-estoque.git
Abra o projeto em uma IDE compatível com Java, como o IntelliJ IDEA.
Execute a classe Main.
Utilize o menu exibido no console para interagir com o sistema.
Objetivo do projeto

Este projeto faz parte do meu processo de aprendizado em Java e foi desenvolvido de forma autoral para colocar em prática os fundamentos da linguagem antes de avançar para conceitos mais avançados, como desenvolvimento de APIs.

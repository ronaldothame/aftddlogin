# AF TDD Login

## Descrição do Projeto

Este projeto consiste na implementação de uma tela de login em Java utilizando TDD (Test-Driven Development) e JUnit para a criação e execução dos testes unitários.

## Estrutura do Projeto

O projeto está organizado em dois pacotes principais:

1. **LoginScreen:** Contém a implementação da classe `LoginScreen`, responsável pela lógica de autenticação do usuário.
2. **LoginScreenTest:** Contém os testes unitários para a classe `LoginScreen` utilizando o framework JUnit.

## Passos Realizados

Os seguintes passos foram realizados durante o desenvolvimento do projeto:

1. Escrever o teste unitário (JUnit) para a tela de login;
   - Foram criados testes para verificar a autenticação com credenciais válidas, credenciais inválidas, nome de usuário vazio e senha vazia.

2. Executar o teste unitário;
   - Todos os testes foram executados. Os testes falharam, uma vez que a classe LoginScreen ainda não tinha sido implementada.

3. Implementar a classe LoginScreen;
   - Foi implementada a classe `LoginScreen`, contendo o método `login` que realiza a verificação das credenciais.

4. Executar o teste unitário novamente;
   - Após a implementação da classe `LoginScreen`, os testes unitários foram executados novamente. Dessa vez todos os testes passaram, validando assim a implementação.

5. Documentação, exportar o JAVADOC;
   - Foi gerada a documentação Javadoc, proporcionando uma descrição detalhada dos métodos e parâmetros.

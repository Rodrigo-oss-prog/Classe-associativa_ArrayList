# Classe Associativa e utilizando ArrayList<>

## List:

Armazena um conjunto ordenado de elementos, podendo ter valores repetidos. Não é necessário definir sua capacidade de antemão. Seu tamanho é variável, aumentando conforme demanda.
Os principais métodos definidos por List são:
add(E elemento): adiciona o elemento no final da lista;
add(int index, E elemento): adiciona o elemento na posição index;
get(int index): retorna o objeto na posição especificada no índice;
indexOf(E elemento): retorna o índice no qual o elemento está alocado;
remove(E elemento): remove o elemento da lista;
remove(int index): remove o elemento na posição especificada pelo índice;
contains(E elemento): retorna se o elemento está ou não na lista;
clear(): remove todos os elementos da lista;
size(): retorna o número de elementos da lista;

## Método adicionarMatricula(), utilizado para adicionar um número variado de matriculas:

````
public void adicionarMatricula(Matricula...m){
        Collections.addAll(matriculas,m);
````
## Explicação:

public void adicionarMatricula(Matricula...m):

* public: Indica que este método é acessível a partir de qualquer classe.
* void: Este método não retorna nenhum valor.
* adicionarMatricula: Nome do método que indica a sua função de adicionar matrículas.
* Matricula...m: Parâmetro do método que recebe um ou mais objetos do tipo Matricula.
* O uso de "..." indica que o parâmetro pode receber um número variável de argumentos.
*Collections.addAll(matriculas,m):

* Collections: Classe utilitária do Java para manipulação de coleções.
* addAll: Método estático da classe Collections que adiciona todos os elementos de uma coleção a outra.
* matriculas: Variável que armazena a lista de matrículas.
* m: Parâmetro do método addAll que representa a coleção de matrículas a serem adicionadas.
  
Em resumo, este método adiciona um ou mais objetos do tipo Matricula à lista matriculas.

## Pontos importantes:

* O método usa o varargs (parâmetro variável) para receber um número variável de argumentos do tipo Matricula.
* O método utiliza a classe Collections para adicionar os elementos à lista de forma eficiente.

# Materias adicionais para consulta:
* Documentação oficial da linguagem Java: https://docs.oracle.com/javase/tutorial/
* Tutoriais e cursos online de Java: https://www.w3schools.com/java/
* Fóruns e comunidades online de Java: https://stackoverflow.com/questions/tagged/java

public class ClassesObjetos {
    public static void main(String[] args) {
        System.out.println("Classes criadas com sucesso!");
    }
}

// 1. Classe Pessoa
class Pessoa {
    String nome;
    int idade;
    String cpf;
    String email;
    double altura;

    void andar() {
        System.out.println(nome + " está andando.");
    }

    void comer() {
        System.out.println(nome + " está comendo.");
    }

    void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    void falar() {
        System.out.println(nome + " está falando.");
    }

    void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }
}

// 2. Classe Carro
class Carro {
    String marca;
    String modelo;
    String cor;
    String placa;
    int ano;

    void acelerar() {
        System.out.println("Carro acelerando.");
    }

    void frear() {
        System.out.println("Carro freando.");
    }

    void ligar() {
        System.out.println("Carro ligado.");
    }

    void desligar() {
        System.out.println("Carro desligado.");
    }

    void buzinar() {
        System.out.println("Biiiii!");
    }
}

// 3. Classe Cachorro (Animal)
class Cachorro {
    String nome;
    String raca;
    int idade;
    String cor;
    double peso;

    void latir() {
        System.out.println(nome + " está latindo.");
    }

    void comer() {
        System.out.println(nome + " está comendo.");
    }

    void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    void correr() {
        System.out.println(nome + " está correndo.");
    }

    void brincar() {
        System.out.println(nome + " está brincando.");
    }
}

// 4. Classe Celular
class Celular {
    String marca;
    String modelo;
    String cor;
    double tamanhoTela;
    int capacidadeMemoria;

    void ligar() {
        System.out.println("Celular ligado.");
    }

    void desligar() {
        System.out.println("Celular desligado.");
    }

    void fazerLigacao() {
        System.out.println("Fazendo uma ligação.");
    }

    void enviarMensagem() {
        System.out.println("Enviando mensagem.");
    }

    void tirarFoto() {
        System.out.println("Tirando foto.");
    }
}

// 5. Classe Bicicleta
class Bicicleta {
    String cor;
    String tipo;
    int tamanhoAro;
    int numeroMarchas;
    String material;

    void pedalar() {
        System.out.println("Pedalando.");
    }

    void frear() {
        System.out.println("Freando.");
    }

    void virar() {
        System.out.println("Virando.");
    }

    void acelerar() {
        System.out.println("Acelerando.");
    }

    void parar() {
        System.out.println("Parando.");
    }
}

// 6. Classe Computador
class Computador {
    String processador;
    int memoriaRAM;
    int armazenamento;
    String placaVideo;
    String sistemaOperacional;

    void ligar() {
        System.out.println("Computador ligado.");
    }

    void desligar() {
        System.out.println("Computador desligado.");
    }

    void processarDados() {
        System.out.println("Processando dados.");
    }

    void executarPrograma() {
        System.out.println("Executando programa.");
    }

    void conectarInternet() {
        System.out.println("Conectado à internet.");
    }
}

// 7. Classe Geladeira
class Geladeira {
    String marca;
    String modelo;
    String cor;
    int capacidade;
    String tipo;

    void gelar() {
        System.out.println("Gelar alimentos.");
    }

    void descongelar() {
        System.out.println("Descongelando.");
    }

    void controlarTemperatura() {
        System.out.println("Controlando temperatura.");
    }

    void acenderLuzInterna() {
        System.out.println("Luz interna acesa.");
    }

    void desligar() {
        System.out.println("Geladeira desligada.");
    }
}

// 8. Classe Televisao
class Televisao {
    String marca;
    int polegadas;
    String tipo;
    String resolucao;
    String cor;

    void ligar() {
        System.out.println("TV ligada.");
    }

    void desligar() {
        System.out.println("TV desligada.");
    }

    void aumentarVolume() {
        System.out.println("Aumentando volume.");
    }

    void trocarCanal() {
        System.out.println("Trocando canal.");
    }

    void acessarApps() {
        System.out.println("Acessando aplicativos.");
    }
}

// 9. Classe Fogao
class Fogao {
    String marca;
    int numeroBocas;
    String tipo;
    String cor;
    String tamanho;

    void acenderChama() {
        System.out.println("Chama acesa.");
    }

    void desligarChama() {
        System.out.println("Chama desligada.");
    }

    void assar() {
        System.out.println("Assando comida.");
    }

    void cozinhar() {
        System.out.println("Cozinhando.");
    }

    void aquecer() {
        System.out.println("Aquecendo comida.");
    }
}

// 🔟 Classe Livro
class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    String genero;
    String editora;

    void abrir() {
        System.out.println("Livro aberto.");
    }

    void fechar() {
        System.out.println("Livro fechado.");
    }

    void ler() {
        System.out.println("Lendo livro.");
    }

    void folhear() {
        System.out.println("Folheando livro.");
    }

    void emprestar() {
        System.out.println("Livro emprestado.");
    }
}

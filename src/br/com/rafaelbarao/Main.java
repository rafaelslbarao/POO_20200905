package br.com.rafaelbarao;

import br.com.rafaelbarao.entidades.Animal;
import br.com.rafaelbarao.interface_usuario.Console;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animalCachorroMarrom =
                new Animal("Cachorro", 15.5, "MARROM");
        Animal animaGatoBranco =
                new Animal("Gato", 7.5, "BRANCO", 10L);

        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(animalCachorroMarrom);
        listaAnimais.add(animaGatoBranco);

        for(int i = 0; i < listaAnimais.size(); i ++)
        {
            Animal animal = listaAnimais.get(i);
            new Console().escreveConsole(animal.comunica() + " posicao " + i);
        }

        for(Animal animal : listaAnimais)
        {
            new Console().escreveConsole(animal.comunica() + " posicao " + listaAnimais.indexOf(animal));
        }
    }
}

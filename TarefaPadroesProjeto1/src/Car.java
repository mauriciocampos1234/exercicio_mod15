/**
 * @author MauricioCampos
 */

// Interface para o carro
interface Car {
    void drive();
}

// Classe concreta Sedan
class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a Sedan.");
    }
}

// Classe concreta SUV
class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV.");
    }
}

// Interface da fábrica de carros
interface CarFactory {
    Car createSedan();
    Car createSUV();
}

// Fábrica de carros Toyota
class ToyotaFactory implements CarFactory {
    @Override
    public Car createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Car createSUV() {
        return new ToyotaSUV();
    }
}

// Fábrica de carros Ford
class FordFactory implements CarFactory {
    @Override
    public Car createSedan() {
        return new FordSedan();
    }

    @Override
    public Car createSUV() {
        return new FordSUV();
    }
}

// Implementações de Sedan e SUV específicas para Toyota
class ToyotaSedan extends Sedan {
    @Override
    public void drive() {
        System.out.println("Dirigindo um Toyota Sedan.");
    }
}

class ToyotaSUV extends SUV {
    @Override
    public void drive() {
        System.out.println("Dirigindo um Toyota SUV.");
    }
}

// Implementações de Sedan e SUV específicas para Ford
class FordSedan extends Sedan {
    @Override
    public void drive() {
        System.out.println("Dirigindo um Ford Sedan.");
    }
}

class FordSUV extends SUV {
    @Override
    public void drive() {
        System.out.println("Dirigindo um Ford SUV.");
    }
}

class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de carros Toyota
        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyotaSedan = toyotaFactory.createSedan();
        Car toyotaSUV = toyotaFactory.createSUV();

        // Usando os carros Toyota
        toyotaSedan.drive();
        toyotaSUV.drive();

        // Criando uma fábrica de carros Ford
        CarFactory fordFactory = new FordFactory();
        Car fordSedan = fordFactory.createSedan();
        Car fordSUV = fordFactory.createSUV();

        // Usando os carros Ford
        fordSedan.drive();
        fordSUV.drive();
    }
}










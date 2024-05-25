import static org.junit.Assert.assertTrue;

import static java.time.LocalDate.now;

import org.junit.Test;

import tp6_4.modelo.CalculadorGral;
import tp6_4.modelo.CalculadoraJubilado;
import tp6_4.modelo.CalculadoraNoJubilado;

public class TestCalculadorSupermercado {
    @Test
    public void testCalculadorSupermercado() {
        int mesEnPromocion = now().getMonthValue();
        CalculadorGral jubilado = new CalculadoraJubilado(mesEnPromocion);
        double precioProductos = 100;
        precioProductos += 200;
        precioProductos += 300;
        precioProductos += 400;
        precioProductos += 500;
        double precioTotal = jubilado.calcularPrecio(precioProductos);
        System.out.println(precioTotal);

        assertTrue(precioTotal == 1650);
    }

    @Test
    public void testCalculadorSupermercadoNoJubilado() {
        int mesEnPromocion = now().getMonthValue();
        CalculadorGral noJubilado = new CalculadoraNoJubilado(mesEnPromocion);
        double precioProductos = 100;
        precioProductos += 200;
        precioProductos += 300;
        precioProductos += 400;
        precioProductos += 500;
        double precioTotal = noJubilado.calcularPrecio(precioProductos);
        System.out.println(mesEnPromocion);

        // assertTrue(precioTotal == 1725);
        mesEnPromocion = now().plusMonths(2).getMonthValue();
        precioTotal = noJubilado.calcularPrecio(precioProductos);
        System.out.println(mesEnPromocion);

        // assertTrue(precioTotal == 1800);
    }

}

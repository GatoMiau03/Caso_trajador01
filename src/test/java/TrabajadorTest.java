package Modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabajadorTest {

    @Test
    public void testCrearTrabajador() {
        Trabajador trabajador = new Trabajador("Carlos", "Perez", "12345678-0", "IsapreB", "AFP2");

        assertEquals("Carlos", trabajador.getNombre());
        assertEquals("Perez", trabajador.getApellido());
        assertEquals("12345678-0", trabajador.getRut());
        assertEquals("IsapreB", trabajador.getIsapre());
        assertEquals("AFP2", trabajador.getAfp());
    }
}
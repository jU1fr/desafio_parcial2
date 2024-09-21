// Zapatos Deportivos para Hombre
class ZapatoDeportivoHombre implements ZapatoHombre {
    @Override
    public void mostrarDetalles() {
        System.out.println("Zapato Deportivo para Hombre: Color Azul, Material Sintético, Estilo Deportivo");
    }
}

// Zapatos Deportivos para Mujer
class ZapatoDeportivoMujer implements ZapatoMujer {
    @Override
    public void mostrarDetalles() {
        System.out.println("Zapato Deportivo para Mujer: Color Rosa, Material Sintético, Estilo Deportivo");
    }
}

// Zapatos Deportivos para Niño
class ZapatoDeportivoNiño implements ZapatoNiño {
    @Override
    public void mostrarDetalles() {
        System.out.println("Zapato Deportivo para Niño: Color Rojo, Material Sintético, Estilo Deportivo");
    }
}

// Zapatos Formales para Hombre
class ZapatoFormalHombre implements ZapatoHombre {
    @Override
    public void mostrarDetalles() {
        System.out.println("Zapato Formal para Hombre: Color Negro, Material Cuero, Estilo Formal");
    }
}

// Zapatos Formales para Mujer
class ZapatoFormalMujer implements ZapatoMujer {
    @Override
    public void mostrarDetalles() {
        System.out.println("Zapato Formal para Mujer: Color Marrón, Material Cuero, Estilo Formal");
    }
}

// Zapatos Formales para Niño
class ZapatoFormalNiño implements ZapatoNiño {
    @Override
    public void mostrarDetalles() {
        System.out.println("Zapato Formal para Niño: Color Azul Marino, Material Cuero, Estilo Formal");
    }
}

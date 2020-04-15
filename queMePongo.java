class Atuendo{
  Prenda[] prendas;
  void ingresarPrenda(Prenda prendaNueva){
    prendas.add(prendaNueva)
  }
}

class Prenda{
  Tipo tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Prenda(Tipo tipo, Material material, Color colorPrincipal){
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
  }
  void agregarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }
}

class Tipo{
  Categoria categoria;
  Tipo(Categoria categoria){
    this.categoria = categoria;
  }
}

class Categoria{

}

class Material{

}

class Color{
  
}

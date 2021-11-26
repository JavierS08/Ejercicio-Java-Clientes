class Cliente{
    private String nombre;
    private String ciudad;
    private float presupuesto;

    Cliente(String nombre, String ciudad, float presupuesto){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public void setPresupuesto(float presupuesto){
        this.presupuesto = presupuesto;
    }

    public float getPresupuesto(){
        return this.presupuesto;
    }

    public void getFicha(){
        System.out.println("El cliente " + this.getNombre()+"-"+this.getCiudad()+" tiene un presupuesto de "+this.getPresupuesto());
    }
} 

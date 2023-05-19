package UMLonline;


/**
* @generated
*/
public class Cliente extends Usuario {
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private Salones salon;
    
    
    /**
    * @generated
    */
    private Set<Usuario> estudiante;
    
    /**
    * @generated
    */
    private Categoria profesores;
    
    /**
    * @generated
    */
    private Salones salones;
    
    

    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public String setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /**
    * @generated
    */
    public Salones getSalon() {
        return this.salon;
    }
    
    /**
    * @generated
    */
    public Salones setSalon(Salones salon) {
        this.salon = salon;
    }
    
    
    
    /**
    * @generated
    */
    public Categoria getProfesores() {
        return this.profesores;
    }
    
    /**
    * @generated
    */
    public Categoria setProfesores(Categoria profesores) {
        this.profesores = profesores;
    }
    
    
    /**
    * @generated
    */
    public Set<Usuario> getEstudiante() {
        if (this.estudiante == null) {
            this.estudiante = new HashSet<Usuario>();
        }
        return this.estudiante;
    }
    
    /**
    * @generated
    */
    public Set<Usuario> setEstudiante(Usuario estudiante) {
        this.estudiante = estudiante;
    }
    
    
    /**
    * @generated
    */
    public Salones getSalones() {
        return this.salones;
    }
    
    /**
    * @generated
    */
    public Salones setSalones(Salones salones) {
        this.salones = salones;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public Cliente() {
        //TODO
    }
    /**
    * @generated
    */
    public Salones asignarSalon() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Cliente() {
        //TODO
    }
    
}

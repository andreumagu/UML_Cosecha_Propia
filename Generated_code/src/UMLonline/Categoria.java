package UMLonline;


/**
* @generated
*/
public class Categoria extends Producto {
    
    /**
    * @generated
    */
    private String profesion;
    
    /**
    * @generated
    */
    private boolean maestria;
    
    /**
    * @generated
    */
    private boolean doctorado;
    
    /**
    * @generated
    */
    private int ;
    
    /**
    * @generated
    */
    private Cliente curso;
    
    /**
    * @generated
    */
    private int Id;
    
    /**
    * @generated
    */
    private String Nombre;
    
    
    /**
    * @generated
    */
    private Set<Cliente> cursos;
    
    /**
    * @generated
    */
    private Producto producto;
    
    

    /**
    * @generated
    */
    public String getProfesion() {
        return this.profesion;
    }
    
    /**
    * @generated
    */
    public String setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    /**
    * @generated
    */
    public boolean getMaestria() {
        return this.maestria;
    }
    
    /**
    * @generated
    */
    public boolean setMaestria(Boolean maestria) {
        this.maestria = maestria;
    }
    
    
    /**
    * @generated
    */
    public boolean getDoctorado() {
        return this.doctorado;
    }
    
    /**
    * @generated
    */
    public boolean setDoctorado(Boolean doctorado) {
        this.doctorado = doctorado;
    }
    
    
    /**
    * @generated
    */
    public int get() {
        return this.;
    }
    
    /**
    * @generated
    */
    public int set(Integer ) {
        this. = ;
    }
    
    
    /**
    * @generated
    */
    public Cliente getCurso() {
        return this.curso;
    }
    
    /**
    * @generated
    */
    public Cliente setCurso(Cliente curso) {
        this.curso = curso;
    }
    
    
    /**
    * @generated
    */
    public int getId() {
        return this.Id;
    }
    
    /**
    * @generated
    */
    public int setId(Integer Id) {
        this.Id = Id;
    }
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.Nombre;
    }
    
    /**
    * @generated
    */
    public String setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    /**
    * @generated
    */
    public Producto getProducto() {
        return this.producto;
    }
    
    /**
    * @generated
    */
    public Producto setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    /**
    * @generated
    */
    public Set<Cliente> getCursos() {
        if (this.cursos == null) {
            this.cursos = new HashSet<Cliente>();
        }
        return this.cursos;
    }
    
    /**
    * @generated
    */
    public Set<Cliente> setCursos(Cliente cursos) {
        this.cursos = cursos;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public Categoria crearProfesor() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Cliente asignarCurso() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public int getId() {
        //TODO
        return 0;
    }
    
    /**
    * @generated
    */
    public String getNombre() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public void setId() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setNombre() {
        //TODO
    }
    
    
}

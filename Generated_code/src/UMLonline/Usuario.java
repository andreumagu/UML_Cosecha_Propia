package UMLonline;


/**
* @generated
*/
public class Usuario extends Producto {
    
    /**
    * @generated
    */
    private  attribute;
    
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
    private String Direccion;
    
    /**
    * @generated
    */
    private String Email;
    
    
    /**
    * @generated
    */
    private Set<Cliente> cursos;
    
    /**
    * @generated
    */
    private Pedido pedido;
    
    /**
    * @generated
    */
    private EComerce eComerce;
    
    

    /**
    * @generated
    */
    public  getAttribute() {
        return this.attribute;
    }
    
    /**
    * @generated
    */
    public  setAttribute(invalid attribute) {
        this.attribute = attribute;
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
    public String getDireccion() {
        return this.Direccion;
    }
    
    /**
    * @generated
    */
    public String setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    /**
    * @generated
    */
    public String getEmail() {
        return this.Email;
    }
    
    /**
    * @generated
    */
    public String setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
    /**
    * @generated
    */
    public EComerce getEComerce() {
        return this.eComerce;
    }
    
    /**
    * @generated
    */
    public EComerce setEComerce(EComerce eComerce) {
        this.eComerce = eComerce;
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
    
    
    /**
    * @generated
    */
    public Pedido getPedido() {
        return this.pedido;
    }
    
    /**
    * @generated
    */
    public Pedido setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public Usuario() {
        //TODO
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
    public Usuario obtenerEstudiante() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Usuario eliminarEstudiante() {
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
    public String getNombre() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String getDireccion() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String getEmail() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public void setEmail() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setNombre() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setDireccion() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void setEmail() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void IniciarSesion() {
        //TODO
    }
    
    /**
    * @generated
    */
    public void CerrarSesion() {
        //TODO
    }
    
    
}

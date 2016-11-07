
public class Profesor  extends Usuario{

   private String correo;
    public Profesor(String nombre,String correo)
    {
    	super(nombre);
    	this.correo=correo;
    }
	
    public String getcorreo()
    {
    	return correo;
    	
    }
      public void  setcorreo(String correo)
      {
    	  this.correo=correo;
      }
}

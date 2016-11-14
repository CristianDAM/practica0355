
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{

    private NumberDisplay hora;
    private NumberDisplay minutos;
    private  DisplayDosDigitos dia;

    private DisplayDosDigitos mes;

    private DisplayDosDigitos anio;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {

        hora = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        anio = new DisplayDosDigitos(100);
    }

    public void avanzarMomento(){
        minutos.increment();
        if(minutos.getValue() == 0){
            hora.increment();

        }
    }    

    public void setMomento(int horaAFijar, int minutosAFijar, int diaAFijar, int mesAFijar, int anioAFijar){
        hora.setValue(horaAFijar);
        minutos.setValue(minutosAFijar);
        dia.setValor(diaAFijar);
        mes.setValor(mesAFijar);
        anio.setValor(anioAFijar);

    }

    public String getMomento(){
        return hora.getDisplayValue() + ":" + minutos.getDisplayValue() + " " + dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" + anio.getValorDelDisplay();

    }
}

package model;
// Generated 01/10/2019 21:48:18 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VacinaId generated by hbm2java
 */
@Embeddable
public class VacinaId  implements java.io.Serializable {


     private int idVacina;
     private int estoqueIdEstoque;
     private int estoqueIdEstoque1;
     private int vacinaAplicadaIdVacinaAplicada;
     private int vacinaAplicadaDoseIdDose;

    public VacinaId() {
    }

    public VacinaId(int idVacina, int estoqueIdEstoque, int estoqueIdEstoque1, int vacinaAplicadaIdVacinaAplicada, int vacinaAplicadaDoseIdDose) {
       this.idVacina = idVacina;
       this.estoqueIdEstoque = estoqueIdEstoque;
       this.estoqueIdEstoque1 = estoqueIdEstoque1;
       this.vacinaAplicadaIdVacinaAplicada = vacinaAplicadaIdVacinaAplicada;
       this.vacinaAplicadaDoseIdDose = vacinaAplicadaDoseIdDose;
    }
   


    @Column(name="idVACINA", nullable=false)
    public int getIdVacina() {
        return this.idVacina;
    }
    
    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }


    @Column(name="ESTOQUE_idESTOQUE", nullable=false)
    public int getEstoqueIdEstoque() {
        return this.estoqueIdEstoque;
    }
    
    public void setEstoqueIdEstoque(int estoqueIdEstoque) {
        this.estoqueIdEstoque = estoqueIdEstoque;
    }


    @Column(name="ESTOQUE_idESTOQUE1", nullable=false)
    public int getEstoqueIdEstoque1() {
        return this.estoqueIdEstoque1;
    }
    
    public void setEstoqueIdEstoque1(int estoqueIdEstoque1) {
        this.estoqueIdEstoque1 = estoqueIdEstoque1;
    }


    @Column(name="VACINA_APLICADA_idVACINA_APLICADA", nullable=false)
    public int getVacinaAplicadaIdVacinaAplicada() {
        return this.vacinaAplicadaIdVacinaAplicada;
    }
    
    public void setVacinaAplicadaIdVacinaAplicada(int vacinaAplicadaIdVacinaAplicada) {
        this.vacinaAplicadaIdVacinaAplicada = vacinaAplicadaIdVacinaAplicada;
    }


    @Column(name="VACINA_APLICADA_DOSE_idDOSE", nullable=false)
    public int getVacinaAplicadaDoseIdDose() {
        return this.vacinaAplicadaDoseIdDose;
    }
    
    public void setVacinaAplicadaDoseIdDose(int vacinaAplicadaDoseIdDose) {
        this.vacinaAplicadaDoseIdDose = vacinaAplicadaDoseIdDose;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VacinaId) ) return false;
		 VacinaId castOther = ( VacinaId ) other; 
         
		 return (this.getIdVacina()==castOther.getIdVacina())
 && (this.getEstoqueIdEstoque()==castOther.getEstoqueIdEstoque())
 && (this.getEstoqueIdEstoque1()==castOther.getEstoqueIdEstoque1())
 && (this.getVacinaAplicadaIdVacinaAplicada()==castOther.getVacinaAplicadaIdVacinaAplicada())
 && (this.getVacinaAplicadaDoseIdDose()==castOther.getVacinaAplicadaDoseIdDose());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdVacina();
         result = 37 * result + this.getEstoqueIdEstoque();
         result = 37 * result + this.getEstoqueIdEstoque1();
         result = 37 * result + this.getVacinaAplicadaIdVacinaAplicada();
         result = 37 * result + this.getVacinaAplicadaDoseIdDose();
         return result;
   }   


}



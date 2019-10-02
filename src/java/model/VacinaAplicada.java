package model;
// Generated 01/10/2019 21:48:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VacinaAplicada generated by hbm2java
 */
@Entity
@Table(name="vacina_aplicada"
    ,catalog="pep_hl7"
)
public class VacinaAplicada  implements java.io.Serializable {


     private VacinaAplicadaId id;
     private Dose dose;
     private String lote;
     private Date dataAplicacao;
     private Set<Paciente> pacientes = new HashSet<Paciente>(0);
     private Set<Funcionario> funcionarios = new HashSet<Funcionario>(0);
     private Set<Vacina> vacinas = new HashSet<Vacina>(0);

    public VacinaAplicada() {
    }

	
    public VacinaAplicada(VacinaAplicadaId id, Dose dose) {
        this.id = id;
        this.dose = dose;
    }
    public VacinaAplicada(VacinaAplicadaId id, Dose dose, String lote, Date dataAplicacao, Set<Paciente> pacientes, Set<Funcionario> funcionarios, Set<Vacina> vacinas) {
       this.id = id;
       this.dose = dose;
       this.lote = lote;
       this.dataAplicacao = dataAplicacao;
       this.pacientes = pacientes;
       this.funcionarios = funcionarios;
       this.vacinas = vacinas;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idVacinaAplicada", column=@Column(name="idVACINA_APLICADA", nullable=false) ), 
        @AttributeOverride(name="doseIdDose", column=@Column(name="DOSE_idDOSE", nullable=false) ) } )
    public VacinaAplicadaId getId() {
        return this.id;
    }
    
    public void setId(VacinaAplicadaId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOSE_idDOSE", nullable=false, insertable=false, updatable=false)
    public Dose getDose() {
        return this.dose;
    }
    
    public void setDose(Dose dose) {
        this.dose = dose;
    }

    
    @Column(name="LOTE", length=45)
    public String getLote() {
        return this.lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATA_APLICACAO", length=10)
    public Date getDataAplicacao() {
        return this.dataAplicacao;
    }
    
    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vacinaAplicada")
    public Set<Paciente> getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Set<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vacinaAplicada")
    public Set<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vacinaAplicada")
    public Set<Vacina> getVacinas() {
        return this.vacinas;
    }
    
    public void setVacinas(Set<Vacina> vacinas) {
        this.vacinas = vacinas;
    }




}



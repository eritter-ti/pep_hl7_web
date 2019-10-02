package model;
// Generated 01/10/2019 21:48:18 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Vacina generated by hbm2java
 */
@Entity
@Table(name="vacina"
    ,catalog="pep_hl7"
)
public class Vacina  implements java.io.Serializable {


     private VacinaId id;
     private Estoque estoque;
     private VacinaAplicada vacinaAplicada;
     private Integer nome;
     private String indicacao;
     private String contraIndicacao;
     private String eventAdversos;
     private String doencas;

    public Vacina() {
    }

	
    public Vacina(VacinaId id, Estoque estoque, VacinaAplicada vacinaAplicada) {
        this.id = id;
        this.estoque = estoque;
        this.vacinaAplicada = vacinaAplicada;
    }
    public Vacina(VacinaId id, Estoque estoque, VacinaAplicada vacinaAplicada, Integer nome, String indicacao, String contraIndicacao, String eventAdversos, String doencas) {
       this.id = id;
       this.estoque = estoque;
       this.vacinaAplicada = vacinaAplicada;
       this.nome = nome;
       this.indicacao = indicacao;
       this.contraIndicacao = contraIndicacao;
       this.eventAdversos = eventAdversos;
       this.doencas = doencas;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idVacina", column=@Column(name="idVACINA", nullable=false) ), 
        @AttributeOverride(name="estoqueIdEstoque", column=@Column(name="ESTOQUE_idESTOQUE", nullable=false) ), 
        @AttributeOverride(name="estoqueIdEstoque1", column=@Column(name="ESTOQUE_idESTOQUE1", nullable=false) ), 
        @AttributeOverride(name="vacinaAplicadaIdVacinaAplicada", column=@Column(name="VACINA_APLICADA_idVACINA_APLICADA", nullable=false) ), 
        @AttributeOverride(name="vacinaAplicadaDoseIdDose", column=@Column(name="VACINA_APLICADA_DOSE_idDOSE", nullable=false) ) } )
    public VacinaId getId() {
        return this.id;
    }
    
    public void setId(VacinaId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ESTOQUE_idESTOQUE1", nullable=false, insertable=false, updatable=false)
    public Estoque getEstoque() {
        return this.estoque;
    }
    
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="VACINA_APLICADA_idVACINA_APLICADA", referencedColumnName="idVACINA_APLICADA", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="VACINA_APLICADA_DOSE_idDOSE", referencedColumnName="DOSE_idDOSE", nullable=false, insertable=false, updatable=false) } )
    public VacinaAplicada getVacinaAplicada() {
        return this.vacinaAplicada;
    }
    
    public void setVacinaAplicada(VacinaAplicada vacinaAplicada) {
        this.vacinaAplicada = vacinaAplicada;
    }

    
    @Column(name="NOME")
    public Integer getNome() {
        return this.nome;
    }
    
    public void setNome(Integer nome) {
        this.nome = nome;
    }

    
    @Column(name="INDICACAO", length=245)
    public String getIndicacao() {
        return this.indicacao;
    }
    
    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    
    @Column(name="CONTRA_INDICACAO", length=245)
    public String getContraIndicacao() {
        return this.contraIndicacao;
    }
    
    public void setContraIndicacao(String contraIndicacao) {
        this.contraIndicacao = contraIndicacao;
    }

    
    @Column(name="EVENT_ADVERSOS", length=245)
    public String getEventAdversos() {
        return this.eventAdversos;
    }
    
    public void setEventAdversos(String eventAdversos) {
        this.eventAdversos = eventAdversos;
    }

    
    @Column(name="DOENCAS", length=245)
    public String getDoencas() {
        return this.doencas;
    }
    
    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }




}



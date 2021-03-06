package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.DfeConsts;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class Arma {

    @NfeCampo(tipo = String.class
            , id = "L02", tag = "tpArma"
            , tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1
            , descricao = NfeConsts.DSC_TPARMA)
    private String tpArma;

    @NfeCampo(tipo = String.class
            , id = "L03", tag = "nSerie"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = DfeConsts.DSC_NSERIE)
    private String nSerie;

    @NfeCampo(tipo = String.class
            , id = "L04", tag = "nCano"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = NfeConsts.DSC_NCANO)
    private String nCano;

    @NfeCampo(tipo = String.class
            , id = "L05", tag = "descr"
            , tamanhoMinimo = 1, tamanhoMaximo = 256, ocorrencias = 1
            , descricao = NfeConsts.DSC_DESCR)
    private String descr;

    public TNFe.InfNFe.Det.Prod.Arma build() {
        TNFe.InfNFe.Det.Prod.Arma arma = new TNFe.InfNFe.Det.Prod.Arma();
        arma.setTpArma(this.getTpArma());
        arma.setNSerie(this.getnSerie());
        arma.setNCano(this.getnCano());
        arma.setDescr(this.getDescr());
        return arma;
    }

    public String getTpArma() {
        return tpArma;
    }

    public String getnSerie() {
        return nSerie;
    }

    public String getnCano() {
        return nCano;
    }

    public String getDescr() {
        return descr;
    }

    public Arma setTpArma(String tpArma) {
        this.tpArma = tpArma;
        return this;
    }

    public Arma setnSerie(String nSerie) {
        this.nSerie = nSerie;
        return this;
    }

    public Arma setnCano(String nCano) {
        this.nCano = nCano;
        return this;
    }

    public Arma setDescr(String descr) {
        this.descr = descr;
        return this;
    }

    public void validarRegraNegocio(InfNFe infNFe) {

    }
}
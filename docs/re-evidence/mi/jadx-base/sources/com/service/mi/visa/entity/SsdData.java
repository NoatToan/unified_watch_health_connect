package com.service.mi.visa.entity;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SsdData {
    private String CASDCert;
    private String VMPAVersion;
    private List<String> aidArray;
    private String generateScpKeysSdScript;
    private String keyVersionNumber;
    private String sdAID;
    private String sdScript;
    private String sequenceCounter;
    private String vEphemeralVisaPublicKeyID;

    public List<String> getAidArry() {
        return this.aidArray;
    }

    public String getCASDCert() {
        return this.CASDCert;
    }

    public String getGenerateScpKeysSdScript() {
        return this.generateScpKeysSdScript;
    }

    public String getKeyVersionNumber() {
        return this.keyVersionNumber;
    }

    public String getSdAID() {
        return this.sdAID;
    }

    public String getSdScript() {
        return this.sdScript;
    }

    public String getSequenceCounter() {
        return this.sequenceCounter;
    }

    public String getVMPAVersion() {
        return this.VMPAVersion;
    }

    public String getvEphemeralVisaPublicKeyID() {
        return this.vEphemeralVisaPublicKeyID;
    }

    public void setAidArry(List<String> list) {
        this.aidArray = list;
    }

    public void setCASDCert(String str) {
        this.CASDCert = str;
    }

    public void setGenerateScpKeysSdScript(String str) {
        this.generateScpKeysSdScript = str;
    }

    public void setKeyVersionNumber(String str) {
        this.keyVersionNumber = str;
    }

    public void setSdAID(String str) {
        this.sdAID = str;
    }

    public void setSdScript(String str) {
        this.sdScript = str;
    }

    public void setSequenceCounter(String str) {
        this.sequenceCounter = str;
    }

    public void setVMPAVersion(String str) {
        this.VMPAVersion = str;
    }

    public void setvEphemeralVisaPublicKeyID(String str) {
        this.vEphemeralVisaPublicKeyID = str;
    }
}

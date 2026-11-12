package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class Domain implements Serializable {

    @SerializedName(Configs.Params.ID_DNS)
    private String idDns;

    public Domain() {
    }

    public String getIdDns() {
        return this.idDns;
    }

    public void setIdDns(String str) {
        this.idDns = str;
    }

    public String toString() {
        return "idDns:" + this.idDns;
    }

    public Domain(String str) {
        this.idDns = str;
    }
}

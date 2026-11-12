package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class HttpDNS {

    @SerializedName(Configs.Params.CNAMES)
    private List<String> cnames;

    @SerializedName("host")
    private String host;

    @SerializedName(Configs.Params.IPS)
    private List<String> ips;

    @SerializedName("ttl")
    private long ttl;

    public List<String> getCnames() {
        return this.cnames;
    }

    public String getHost() {
        return this.host;
    }

    public List<String> getIps() {
        return this.ips;
    }

    public long getTtl() {
        return this.ttl;
    }

    public void setCnames(List<String> list) {
        this.cnames = list;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setIps(List<String> list) {
        this.ips = list;
    }

    public void setTtl(long j) {
        this.ttl = j;
    }
}

package com.xiaomi.infra.galaxy.fds.result;

import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class ApplySecretResult {
    private String a;
    private String b;

    public ApplySecretResult() {
    }

    public String getKey() {
        return this.a;
    }

    public String getSecret() {
        return this.b;
    }

    public void setKey(String str) {
        this.a = str;
    }

    public void setSecret(String str) {
        this.b = str;
    }

    public ApplySecretResult(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

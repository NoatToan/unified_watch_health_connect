package com.xiaomi.hm.health.speech.entity;

/* JADX INFO: loaded from: classes21.dex */
public class PayLoad {
    private int a;
    private String b;
    private String c;
    private String d;
    private DeployCustomReply e;

    public String getBundle() {
        return this.c;
    }

    public DeployCustomReply getDeployCustomReply() {
        return this.e;
    }

    public String getExtension() {
        return this.d;
    }

    public String getIntent() {
        return this.b;
    }

    public int getVersion() {
        return this.a;
    }

    public void setBundle(String bundle) {
        this.c = bundle;
    }

    public void setDeployCustomReply(DeployCustomReply deployCustomReply) {
        this.e = deployCustomReply;
    }

    public void setExtension(String extension) {
        this.d = extension;
    }

    public void setIntent(String intent) {
        this.b = intent;
    }

    public void setVersion(int version) {
        this.a = version;
    }
}

package com.huawei.hms.network.embedded;

/* JADX INFO: loaded from: classes34.dex */
public class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15077b = g2.n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15078c = g2.n;
    public boolean d;

    public String toString() {
        return "Host:" + this.f15076a + ", Port:" + this.f15077b + ", AlternatePort:" + this.f15078c + ", Enable:" + this.d;
    }

    public void setPort(int i) {
        this.f15077b = i;
    }

    public void setHost(String str) {
        this.f15076a = str;
    }

    public void setEnableQuic(boolean z) {
        this.d = z;
    }

    public void setAlternatePort(int i) {
        this.f15078c = i;
    }

    public int getPort() {
        return this.f15077b;
    }

    public String getHost() {
        return this.f15076a;
    }

    public boolean getEnableQuic() {
        return this.d;
    }

    public int getAlternatePort() {
        return this.f15078c;
    }
}

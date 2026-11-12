package com.xiaomi.hm.health.bt.profile.base;

/* JADX INFO: loaded from: classes11.dex */
public class ConnectionParameters {
    private int a;
    private int b;
    private int c;
    private int d;

    public ConnectionParameters() {
        this.a = 30;
        this.b = 40;
        this.c = 0;
        this.d = 2000;
    }

    public int getConnIntMax() {
        return this.b;
    }

    public int getConnIntMin() {
        return this.a;
    }

    public int getLatency() {
        return this.c;
    }

    public int getTimeout() {
        return this.d;
    }

    public void setConnIntMax(int connIntMax) {
        this.b = connIntMax;
    }

    public void setConnIntMin(int connIntMin) {
        this.a = connIntMin;
    }

    public void setLatency(int latency) {
        this.c = latency;
    }

    public void setTimeout(int timeout) {
        this.d = timeout;
    }

    public String toString() {
        return "ConnectionParameters{connIntMin=" + this.a + ", connIntMax=" + this.b + ", latency=" + this.c + ", timeout=" + this.d + '}';
    }

    public ConnectionParameters(int connIntMin, int connIntMax, int latency, int timeout) {
        this.a = 30;
        this.b = 40;
        this.c = 0;
        this.d = 2000;
        this.a = connIntMin;
        this.b = connIntMax;
        this.c = latency;
        this.d = timeout;
    }
}

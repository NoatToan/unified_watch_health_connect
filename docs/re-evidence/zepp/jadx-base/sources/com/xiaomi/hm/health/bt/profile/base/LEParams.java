package com.xiaomi.hm.health.bt.profile.base;

/* JADX INFO: loaded from: classes11.dex */
public final class LEParams {
    public static final float INTERVAL_UNIT = 1.25f;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LEParams() {
    }

    public int getAdvInt() {
        return this.f;
    }

    public int getConnInt() {
        return this.b;
    }

    public int getConnIntMax() {
        return this.c;
    }

    public int getConnIntMin() {
        return this.a;
    }

    public int getLatency() {
        return this.d;
    }

    public int getTimeout() {
        return this.e;
    }

    public void setAdvInt(int advInt) {
        this.f = advInt;
    }

    public void setConnInt(int connInt) {
        this.b = connInt;
    }

    public void setConnIntMax(int connIntMax) {
        this.c = connIntMax;
    }

    public void setConnIntMin(int connIntMin) {
        this.a = connIntMin;
    }

    public void setLatency(int latency) {
        this.d = latency;
    }

    public void setTimeout(int timeout) {
        this.e = timeout;
    }

    public String toString() {
        return "[[[ " + LEParams.class.getSimpleName() + " ]]]\n  connIntMin: " + ((int) (((double) this.a) * 1.25d)) + "ms\n  connIntMax: " + ((int) (((double) this.c) * 1.25d)) + "ms\n     latency: " + this.d + "ms\n     timeout: " + (this.e * 10) + "ms\n     connInt: " + ((int) (((double) this.b) * 1.25d)) + "ms\n      advInt: " + ((int) (((double) this.f) * 0.625d)) + "ms";
    }

    public LEParams(int connIntMin, int connIntMax, int latency, int timeout) {
        this.a = connIntMin;
        this.c = connIntMax;
        this.d = latency;
        this.e = timeout;
    }

    public LEParams(int connIntMin, int connIntMax, int latency, int timeout, int connInt, int advInt) {
        this.a = connIntMin;
        this.c = connIntMax;
        this.d = latency;
        this.e = timeout;
        this.b = connInt;
        this.f = advInt;
    }
}

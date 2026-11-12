package com.xiaomi.hm.health.locweather.location;

/* JADX INFO: loaded from: classes21.dex */
public class LocationOption {
    private a a;
    private int b;
    private boolean c = false;

    public enum a {
        HighAccuracy,
        BatterySave,
        GpsOnly
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public void c(boolean z) {
        this.c = z;
    }

    public void d(int i) {
        this.b = i;
    }

    public a getMode() {
        return this.a;
    }

    public void setMode(a aVar) {
        this.a = aVar;
    }
}

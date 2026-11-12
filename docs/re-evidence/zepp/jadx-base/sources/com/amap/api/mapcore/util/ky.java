package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ky {
    public String a = "";
    public String b = "";
    public int c = 99;
    public int d = Integer.MAX_VALUE;
    public long e = 0;
    public long f = 0;
    public int g = 0;
    public boolean h;
    public boolean i;

    public ky(boolean z, boolean z2) {
        this.i = true;
        this.h = z;
        this.i = z2;
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract ky clone();

    public final void a(ky kyVar) {
        this.a = kyVar.a;
        this.b = kyVar.b;
        this.c = kyVar.c;
        this.d = kyVar.d;
        this.e = kyVar.e;
        this.f = kyVar.f;
        this.g = kyVar.g;
        this.h = kyVar.h;
        this.i = kyVar.i;
    }

    public String toString() {
        return "AmapCell{mcc=" + this.a + ", mnc=" + this.b + ", signalStrength=" + this.c + ", asulevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newapi=" + this.i + '}';
    }
}

package com.amap.api.col.p0003sl;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ni implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3227c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract ni clone();

    public ni() {
        this.f3225a = "";
        this.f3226b = "";
        this.f3227c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.i = true;
    }

    public ni(boolean z, boolean z2) {
        this.f3225a = "";
        this.f3226b = "";
        this.f3227c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = z;
        this.i = z2;
    }

    public final int b() {
        return a(this.f3225a);
    }

    public final int c() {
        return a(this.f3226b);
    }

    private static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            ns.a(e);
            return 0;
        }
    }

    public final void a(ni niVar) {
        this.f3225a = niVar.f3225a;
        this.f3226b = niVar.f3226b;
        this.f3227c = niVar.f3227c;
        this.d = niVar.d;
        this.e = niVar.e;
        this.f = niVar.f;
        this.g = niVar.g;
        this.h = niVar.h;
        this.i = niVar.i;
    }

    public String toString() {
        return "AmapCell{mcc=" + this.f3225a + ", mnc=" + this.f3226b + ", signalStrength=" + this.f3227c + ", asulevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newapi=" + this.i + '}';
    }
}

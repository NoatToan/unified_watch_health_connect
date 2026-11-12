package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public abstract class cv {
    public String a = "";
    public String b = "";
    public int c = 99;
    public int d = Integer.MAX_VALUE;
    public long e = 0;
    public long f = 0;
    public int g = 0;
    public boolean h;
    public boolean i;

    public cv(boolean z, boolean z2) {
        this.i = true;
        this.h = z;
        this.i = z2;
    }

    private static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            df.a(e);
            return 0;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract cv clone();

    public final void a(cv cvVar) {
        if (cvVar != null) {
            this.a = cvVar.a;
            this.b = cvVar.b;
            this.c = cvVar.c;
            this.d = cvVar.d;
            this.e = cvVar.e;
            this.f = cvVar.f;
            this.g = cvVar.g;
            this.h = cvVar.h;
            this.i = cvVar.i;
        }
    }

    public final int b() {
        return a(this.a);
    }

    public final int c() {
        return a(this.b);
    }

    public String toString() {
        return "AmapCell{mcc=" + this.a + ", mnc=" + this.b + ", signalStrength=" + this.c + ", asulevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newapi=" + this.i + '}';
    }
}

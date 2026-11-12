package com.amap.api.col.p0003sl;

import defpackage.fbt;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ni implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6216b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    public ni() {
        this.f6215a = "";
        this.f6216b = "";
        this.c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.i = true;
    }

    private static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            fbt.a(e);
            return 0;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract ni clone();

    public final int b() {
        return a(this.f6215a);
    }

    public final int c() {
        return a(this.f6216b);
    }

    public String toString() {
        return "AmapCell{mcc=" + this.f6215a + ", mnc=" + this.f6216b + ", signalStrength=" + this.c + ", asulevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newapi=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public final void a(ni niVar) {
        this.f6215a = niVar.f6215a;
        this.f6216b = niVar.f6216b;
        this.c = niVar.c;
        this.d = niVar.d;
        this.e = niVar.e;
        this.f = niVar.f;
        this.g = niVar.g;
        this.h = niVar.h;
        this.i = niVar.i;
    }

    public ni(boolean z, boolean z2) {
        this.f6215a = "";
        this.f6216b = "";
        this.c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = z;
        this.i = z2;
    }
}

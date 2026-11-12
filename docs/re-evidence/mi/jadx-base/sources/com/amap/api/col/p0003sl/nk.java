package com.amap.api.col.p0003sl;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nk extends ni implements Serializable {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6218k;
    public int l;
    public int m;
    public int n;
    public int o;

    public nk() {
        this.j = 0;
        this.f6218k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nk nkVar = new nk(this.h, this.i);
        nkVar.a(this);
        nkVar.j = this.j;
        nkVar.f6218k = this.f6218k;
        nkVar.l = this.l;
        nkVar.m = this.m;
        nkVar.n = this.n;
        nkVar.o = this.o;
        return nkVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellGsm{lac=" + this.j + ", cid=" + this.f6218k + ", psc=" + this.l + ", arfcn=" + this.m + ", bsic=" + this.n + ", timingAdvance=" + this.o + ", mcc='" + this.f6215a + "', mnc='" + this.f6216b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public nk(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.f6218k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }
}

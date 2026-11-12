package com.amap.api.col.p0003sl;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nj extends ni implements Serializable {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6217k;
    public int l;
    public int m;
    public int n;

    public nj() {
        this.j = 0;
        this.f6217k = 0;
        this.l = 0;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nj njVar = new nj(this.h, this.i);
        njVar.a(this);
        njVar.j = this.j;
        njVar.f6217k = this.f6217k;
        njVar.l = this.l;
        njVar.m = this.m;
        njVar.n = this.n;
        return njVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellCdma{sid=" + this.j + ", nid=" + this.f6217k + ", bid=" + this.l + ", latitude=" + this.m + ", longitude=" + this.n + ", mcc='" + this.f6215a + "', mnc='" + this.f6216b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public nj(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.f6217k = 0;
        this.l = 0;
    }
}

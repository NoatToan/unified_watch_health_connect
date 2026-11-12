package com.amap.api.col.p0003sl;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nl extends ni implements Serializable {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6219k;
    public int l;
    public int m;
    public int n;

    public nl() {
        this.j = 0;
        this.f6219k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nl nlVar = new nl(this.h);
        nlVar.a(this);
        nlVar.j = this.j;
        nlVar.f6219k = this.f6219k;
        nlVar.l = this.l;
        nlVar.m = this.m;
        nlVar.n = this.n;
        return nlVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellLte{tac=" + this.j + ", ci=" + this.f6219k + ", pci=" + this.l + ", earfcn=" + this.m + ", timingAdvance=" + this.n + ", mcc='" + this.f6215a + "', mnc='" + this.f6216b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public nl(boolean z) {
        super(z, true);
        this.j = 0;
        this.f6219k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }
}

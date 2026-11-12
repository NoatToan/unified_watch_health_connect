package com.amap.api.col.p0003sl;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nm extends ni implements Serializable {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6220k;
    public int l;
    public int m;

    public nm() {
        this.j = 0;
        this.f6220k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.col.p0003sl.ni
    /* JADX INFO: renamed from: a */
    public final ni clone() {
        nm nmVar = new nm(this.h, this.i);
        nmVar.a(this);
        nmVar.j = this.j;
        nmVar.f6220k = this.f6220k;
        nmVar.l = this.l;
        nmVar.m = this.m;
        return nmVar;
    }

    @Override // com.amap.api.col.p0003sl.ni
    public final String toString() {
        return "AmapCellWcdma{lac=" + this.j + ", cid=" + this.f6220k + ", psc=" + this.l + ", uarfcn=" + this.m + ", mcc='" + this.f6215a + "', mnc='" + this.f6216b + "', signalStrength=" + this.c + ", asuLevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newApi=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public nm(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.f6220k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }
}

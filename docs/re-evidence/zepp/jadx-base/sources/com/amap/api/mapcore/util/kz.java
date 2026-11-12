package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class kz extends ky {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public kz(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // com.amap.api.mapcore.util.ky
    /* JADX INFO: renamed from: a */
    public final ky clone() {
        kz kzVar = new kz(this.h, this.i);
        kzVar.a(this);
        this.j = kzVar.j;
        this.k = kzVar.k;
        this.l = kzVar.l;
        this.m = kzVar.m;
        this.n = kzVar.n;
        return kzVar;
    }

    @Override // com.amap.api.mapcore.util.ky
    public final String toString() {
        return "AmapCellCdma{sid=" + this.j + ", nid=" + this.k + ", bid=" + this.l + ", latitude=" + this.m + ", longitude=" + this.n + '}' + super.toString();
    }
}

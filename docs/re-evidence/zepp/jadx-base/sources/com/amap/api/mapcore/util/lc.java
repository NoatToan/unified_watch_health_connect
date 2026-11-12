package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class lc extends ky {
    public int j;
    public int k;
    public int l;
    public int m;

    public lc(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.mapcore.util.ky
    /* JADX INFO: renamed from: a */
    public final ky clone() {
        lc lcVar = new lc(this.h, this.i);
        lcVar.a(this);
        lcVar.j = this.j;
        lcVar.k = this.k;
        lcVar.l = this.l;
        lcVar.m = this.m;
        return lcVar;
    }

    @Override // com.amap.api.mapcore.util.ky
    public final String toString() {
        return "AmapCellWcdma{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", uarfcn=" + this.m + '}' + super.toString();
    }
}

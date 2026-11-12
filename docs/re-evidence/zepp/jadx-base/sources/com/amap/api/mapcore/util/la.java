package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class la extends ky {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public la(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.mapcore.util.ky
    /* JADX INFO: renamed from: a */
    public final ky clone() {
        la laVar = new la(this.h, this.i);
        laVar.a(this);
        laVar.j = this.j;
        laVar.k = this.k;
        laVar.l = this.l;
        laVar.m = this.m;
        laVar.n = this.n;
        laVar.o = this.o;
        return laVar;
    }

    @Override // com.amap.api.mapcore.util.ky
    public final String toString() {
        return "AmapCellGsm{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", arfcn=" + this.m + ", bsic=" + this.n + ", timingAdvance=" + this.o + '}' + super.toString();
    }
}

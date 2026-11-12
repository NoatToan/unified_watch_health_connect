package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class lb extends ky {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public lb(boolean z) {
        super(z, true);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    @Override // com.amap.api.mapcore.util.ky
    /* JADX INFO: renamed from: a */
    public final ky clone() {
        lb lbVar = new lb(this.h);
        lbVar.a(this);
        lbVar.j = this.j;
        lbVar.k = this.k;
        lbVar.l = this.l;
        lbVar.m = this.m;
        lbVar.n = this.n;
        return lbVar;
    }

    @Override // com.amap.api.mapcore.util.ky
    public final String toString() {
        return "AmapCellLte{lac=" + this.j + ", cid=" + this.k + ", pci=" + this.l + ", earfcn=" + this.m + ", timingAdvance=" + this.n + '}' + super.toString();
    }
}

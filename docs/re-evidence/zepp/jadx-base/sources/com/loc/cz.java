package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class cz extends cv {
    public int j;
    public int k;
    public int l;
    public int m;

    public cz(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
    }

    @Override // com.loc.cv
    /* JADX INFO: renamed from: a */
    public final cv clone() {
        cz czVar = new cz(this.h, this.i);
        czVar.a(this);
        czVar.j = this.j;
        czVar.k = this.k;
        czVar.l = this.l;
        czVar.m = this.m;
        return czVar;
    }

    @Override // com.loc.cv
    public final String toString() {
        return "AmapCellWcdma{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", uarfcn=" + this.m + '}' + super.toString();
    }
}

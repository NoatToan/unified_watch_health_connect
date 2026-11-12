package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class cx extends cv {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public cx(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
    }

    @Override // com.loc.cv
    /* JADX INFO: renamed from: a */
    public final cv clone() {
        cx cxVar = new cx(this.h, this.i);
        cxVar.a(this);
        cxVar.j = this.j;
        cxVar.k = this.k;
        cxVar.l = this.l;
        cxVar.m = this.m;
        cxVar.n = this.n;
        cxVar.o = this.o;
        return cxVar;
    }

    @Override // com.loc.cv
    public final String toString() {
        return "AmapCellGsm{lac=" + this.j + ", cid=" + this.k + ", psc=" + this.l + ", arfcn=" + this.m + ", bsic=" + this.n + ", timingAdvance=" + this.o + '}' + super.toString();
    }
}

package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class cw extends cv {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public cw(boolean z, boolean z2) {
        super(z, z2);
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // com.loc.cv
    /* JADX INFO: renamed from: a */
    public final cv clone() {
        cw cwVar = new cw(this.h, this.i);
        cwVar.a(this);
        this.j = cwVar.j;
        this.k = cwVar.k;
        this.l = cwVar.l;
        this.m = cwVar.m;
        this.n = cwVar.n;
        return cwVar;
    }

    @Override // com.loc.cv
    public final String toString() {
        return "AmapCellCdma{sid=" + this.j + ", nid=" + this.k + ", bid=" + this.l + ", latitude=" + this.m + ", longitude=" + this.n + '}' + super.toString();
    }
}

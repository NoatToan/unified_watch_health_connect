package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public final class cy extends cv {
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public cy(boolean z) {
        super(z, true);
        this.j = 0;
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
    }

    @Override // com.loc.cv
    /* JADX INFO: renamed from: a */
    public final cv clone() {
        cy cyVar = new cy(this.h);
        cyVar.a(this);
        cyVar.j = this.j;
        cyVar.k = this.k;
        cyVar.l = this.l;
        cyVar.m = this.m;
        cyVar.n = this.n;
        return cyVar;
    }

    @Override // com.loc.cv
    public final String toString() {
        return "AmapCellLte{lac=" + this.j + ", cid=" + this.k + ", pci=" + this.l + ", earfcn=" + this.m + ", timingAdvance=" + this.n + '}' + super.toString();
    }
}

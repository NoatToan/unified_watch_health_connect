package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class n2 implements u {
    private /* synthetic */ m2 a;

    public n2(m2 m2Var) {
        this.a = m2Var;
    }

    @Override // com.sogou.map.loc.u
    public final /* synthetic */ void a(Object obj) {
        SGLocation sGLocation = (SGLocation) obj;
        if (this.a.a.e == 2 || this.a.a.e == 1) {
            if (sGLocation.getType() == 4) {
                this.a.a.k = true;
            } else if (sGLocation.getType() == 5 || sGLocation.getType() == 0) {
                this.a.a.k = false;
            }
        }
        this.a.a.q = j0.q();
        this.a.a.p = false;
        this.a.a.h.post(this.a.a.r);
        this.a.a.u(sGLocation);
    }
}

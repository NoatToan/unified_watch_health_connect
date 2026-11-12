package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class syp extends ryp {
    public syp(hwq hwqVar) {
        super(hwqVar);
    }

    @Override // defpackage.ryp
    public void l(boolean z) {
        this.f33074b.reset();
        if (!z) {
            this.f33074b.postTranslate(this.c.I(), this.c.m() - this.c.H());
        } else {
            this.f33074b.setTranslate(-(this.c.n() - this.c.J()), this.c.m() - this.c.H());
            this.f33074b.postScale(-1.0f, 1.0f);
        }
    }
}

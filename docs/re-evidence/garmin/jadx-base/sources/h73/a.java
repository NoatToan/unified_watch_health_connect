package h73;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends r {
    @Override // h73.r
    public final r c() {
        return (a) this.f82379a;
    }

    @Override // h73.r
    public final void d(r rVar) {
        if (rVar instanceof a) {
            this.f82379a = rVar;
        } else {
            vb.h.s("Parent of block must also be block (can not be inline)");
        }
    }
}

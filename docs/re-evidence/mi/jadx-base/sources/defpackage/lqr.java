package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class lqr extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge f25359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b87 f25360b;
    public i97 c;

    public lqr(i97 i97Var) {
        this(i97Var, false);
    }

    public i97 g() {
        if (this.c == null) {
            this.c = this.f25360b.g(this.f25359a.r()).w();
        }
        return this.c;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return this.f25359a;
    }

    public lqr(i97 i97Var, boolean z) {
        this.c = i97Var.w();
        this.f25359a = new pg5(i97Var.l(z));
    }

    public lqr(b87 b87Var, byte[] bArr) {
        this.f25360b = b87Var;
        this.f25359a = new pg5(wj1.d(bArr));
    }

    public lqr(b87 b87Var, ge geVar) {
        this(b87Var, geVar.r());
    }
}

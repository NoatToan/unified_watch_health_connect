package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class mqr extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he f27111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a87 f27112b;
    public h97 c;

    public mqr(a87 a87Var, he heVar) {
        this(a87Var, heVar.r());
    }

    public synchronized h97 g() {
        try {
            if (this.c == null) {
                this.c = this.f27112b.j(this.f27111a.r()).y();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return this.f27111a;
    }

    public mqr(a87 a87Var, byte[] bArr) {
        this.f27112b = a87Var;
        this.f27111a = new qg5(vj1.e(bArr));
    }

    public mqr(h97 h97Var) {
        this(h97Var, false);
    }

    public mqr(h97 h97Var, boolean z) {
        this.c = h97Var.y();
        this.f27111a = new qg5(h97Var.l(z));
    }
}

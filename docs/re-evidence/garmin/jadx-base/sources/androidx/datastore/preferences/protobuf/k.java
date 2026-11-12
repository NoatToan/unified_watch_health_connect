package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class k implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f6774a;

    private k(CodedOutputStream codedOutputStream) {
        z.a(codedOutputStream, "output");
        this.f6774a = codedOutputStream;
        codedOutputStream.f6656a = this;
    }

    public static k a(CodedOutputStream codedOutputStream) {
        k kVar = codedOutputStream.f6656a;
        return kVar != null ? kVar : new k(codedOutputStream);
    }

    public final void b(int i14, h hVar) {
        this.f6774a.n(i14, hVar);
    }

    public final void c(int i14, int i15) {
        this.f6774a.p(i14, i15);
    }

    public final void d(int i14, long j8) {
        this.f6774a.r(i14, j8);
    }

    public final void e(int i14, Object obj, g1 g1Var) {
        CodedOutputStream codedOutputStream = this.f6774a;
        codedOutputStream.B(i14, 3);
        g1Var.d((q0) obj, codedOutputStream.f6656a);
        codedOutputStream.B(i14, 4);
    }

    public final void f(int i14, int i15) {
        this.f6774a.t(i14, i15);
    }

    public final void g(int i14, long j8) {
        this.f6774a.E(i14, j8);
    }

    public final void h(int i14, Object obj, g1 g1Var) {
        this.f6774a.v(i14, (q0) obj, g1Var);
    }

    public final void i(int i14, Object obj) {
        boolean z14 = obj instanceof h;
        CodedOutputStream codedOutputStream = this.f6774a;
        if (z14) {
            codedOutputStream.y(i14, (h) obj);
        } else {
            codedOutputStream.x(i14, (q0) obj);
        }
    }
}

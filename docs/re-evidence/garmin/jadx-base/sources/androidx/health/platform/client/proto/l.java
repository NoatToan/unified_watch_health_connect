package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class l implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f7707a;

    private l(CodedOutputStream codedOutputStream) {
        l0.a(codedOutputStream, "output");
        this.f7707a = codedOutputStream;
        codedOutputStream.f7531a = this;
    }

    public static l a(CodedOutputStream codedOutputStream) {
        l lVar = codedOutputStream.f7531a;
        return lVar != null ? lVar : new l(codedOutputStream);
    }

    public final void b(int i14, i iVar) {
        this.f7707a.l(i14, iVar);
    }

    public final void c(int i14, int i15) {
        this.f7707a.n(i14, i15);
    }

    public final void d(int i14, long j8) {
        this.f7707a.p(i14, j8);
    }

    public final void e(int i14, Object obj, n2 n2Var) {
        CodedOutputStream codedOutputStream = this.f7707a;
        codedOutputStream.z(i14, 3);
        n2Var.c((c1) obj, codedOutputStream.f7531a);
        codedOutputStream.z(i14, 4);
    }

    public final void f(int i14, int i15) {
        this.f7707a.r(i14, i15);
    }

    public final void g(int i14, long j8) {
        this.f7707a.C(i14, j8);
    }

    public final void h(int i14, Object obj, n2 n2Var) {
        this.f7707a.t(i14, (c1) obj, n2Var);
    }

    public final void i(int i14, Object obj) {
        boolean z14 = obj instanceof i;
        CodedOutputStream codedOutputStream = this.f7707a;
        if (z14) {
            codedOutputStream.w(i14, (i) obj);
        } else {
            codedOutputStream.v(i14, (c1) obj);
        }
    }
}

package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class h7 extends xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yc f20178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e7 f20179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short f20182e;

    public h7(h7 h7Var) {
        c(h7Var.f20178a);
        this.f20179b = h7Var.f20179b;
        this.f20180c = h7Var.f20180c;
    }

    @Override // bs2.xc
    public final int a() {
        return this.f20180c;
    }

    public final short b() {
        yc ycVar = this.f20178a;
        Short shK = (ycVar == null || this.f20179b == null) ? null : ycVar.k(0);
        return shK == null ? sd.f20485e.shortValue() : shK.shortValue();
    }

    public final void c(yc ycVar) {
        this.f20178a = ycVar;
        this.f20182e = ycVar.k(1).shortValue();
        this.f20181d = this.f20178a.k(2).shortValue();
    }

    public h7(yc ycVar, e7 e7Var) {
        c(ycVar);
        this.f20179b = e7Var;
    }

    public h7() {
        this.f20178a = null;
        this.f20181d = 2;
    }

    public h7(g7 g7Var) {
        this(g7Var.f20153b);
        this.f20180c = g7Var.g();
    }
}

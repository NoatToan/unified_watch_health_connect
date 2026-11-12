package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cuf f14725b;

    public cuf(int i) {
        this(i, null);
    }

    public abstract jd1 A(int i, x4q x4qVar, String str, boolean z);

    public abstract void B(h2e h2eVar, h2e h2eVar2, h2e h2eVar3, String str);

    public abstract jd1 C(int i, x4q x4qVar, String str, boolean z);

    public abstract void D(int i, String str);

    public abstract void E(int i, int i2);

    public abstract void a(int i, boolean z);

    public abstract jd1 b(String str, boolean z);

    public abstract jd1 c();

    public abstract void d(em1 em1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(int i, String str, String str2, String str3);

    public abstract void h(int i, int i2, Object[] objArr, int i3, Object[] objArr2);

    public abstract void i(int i, int i2);

    public abstract void j(int i);

    public abstract jd1 k(int i, x4q x4qVar, String str, boolean z);

    public abstract void l(int i, int i2);

    public abstract void m(String str, String str2, gkb gkbVar, Object... objArr);

    public abstract void n(int i, h2e h2eVar);

    public abstract void o(h2e h2eVar);

    public abstract void p(Object obj);

    public abstract void q(int i, h2e h2eVar);

    public abstract void r(String str, String str2, String str3, h2e h2eVar, h2e h2eVar2, int i);

    public abstract jd1 s(int i, x4q x4qVar, h2e[] h2eVarArr, h2e[] h2eVarArr2, int[] iArr, String str, boolean z);

    public abstract void t(h2e h2eVar, int[] iArr, h2e[] h2eVarArr);

    public abstract void u(int i, int i2);

    public abstract void v(int i, String str, String str2, String str3, boolean z);

    public abstract void w(String str, int i);

    public abstract void x(String str, int i);

    public abstract jd1 y(int i, String str, boolean z);

    public abstract void z(int i, int i2, h2e h2eVar, h2e... h2eVarArr);

    public cuf(int i, cuf cufVar) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            tf4.a(this);
        }
        this.f14724a = i;
        this.f14725b = cufVar;
    }
}

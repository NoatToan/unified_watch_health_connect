package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m04 f25605b;

    public m04(int i) {
        this(i, null);
    }

    public abstract void a(int i, int i2, String str, String str2, String str3, String[] strArr);

    public abstract jd1 b(String str, boolean z);

    public abstract void c(em1 em1Var);

    public abstract void d();

    public abstract gl9 e(int i, String str, String str2, String str3, Object obj);

    public abstract void f(String str, String str2, String str3, int i);

    public abstract cuf g(int i, String str, String str2, String str3, String[] strArr);

    public abstract l7g h(String str, int i, String str2);

    public abstract void i(String str);

    public abstract void j(String str);

    public abstract void k(String str, String str2, String str3);

    public abstract void l(String str);

    public abstract sjj m(String str, String str2, String str3);

    public abstract void n(String str, String str2);

    public abstract jd1 o(int i, x4q x4qVar, String str, boolean z);

    public m04(int i, m04 m04Var) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            tf4.a(this);
        }
        this.f25604a = i;
        this.f25605b = m04Var;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l7g f24741b;

    public l7g(int i) {
        this(i, null);
    }

    public abstract void a();

    public abstract void b(String str, int i, String... strArr);

    public abstract void c(String str);

    public abstract void d(String str, int i, String... strArr);

    public abstract void e(String str);

    public abstract void f(String str, String... strArr);

    public abstract void g(String str, int i, String str2);

    public abstract void h(String str);

    public l7g(int i, l7g l7gVar) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            tf4.a(this);
        }
        this.f24740a = i;
        this.f24741b = l7gVar;
    }
}

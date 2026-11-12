package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jd1 f22659b;

    public jd1(int i) {
        this(i, null);
    }

    public abstract void a(String str, Object obj);

    public abstract jd1 b(String str, String str2);

    public abstract jd1 c(String str);

    public abstract void d();

    public abstract void e(String str, String str2, String str3);

    public jd1(int i, jd1 jd1Var) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            tf4.a(this);
        }
        this.f22658a = i;
        this.f22659b = jd1Var;
    }
}

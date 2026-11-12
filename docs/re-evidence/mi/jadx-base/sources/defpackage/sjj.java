package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sjj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sjj f33709b;

    public sjj(int i) {
        this(i, null);
    }

    public abstract jd1 a(String str, boolean z);

    public abstract void b(em1 em1Var);

    public abstract void c();

    public abstract jd1 d(int i, x4q x4qVar, String str, boolean z);

    public sjj(int i, sjj sjjVar) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            tf4.a(this);
        }
        this.f33708a = i;
        this.f33709b = sjjVar;
    }
}

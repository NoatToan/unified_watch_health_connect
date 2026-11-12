package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18166b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public int g;

    public fso(int i, int i2, String str, String str2, String str3, long j) {
        this.f18165a = i;
        this.f18166b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
    }

    public int a() {
        if (this.g == 0) {
            this.g = n4q.c(this.e);
        }
        return this.g;
    }
}

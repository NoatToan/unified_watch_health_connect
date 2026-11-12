package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class qfc {
    public static volatile long f = 10000;
    public static volatile long g = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31477b;
    public final long c;
    public final long d;
    public final int e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31478a = -1;

        public qfc a() {
            return new qfc(this);
        }

        public b b(int i) {
            this.f31478a = i;
            return this;
        }
    }

    public qfc(b bVar) {
        this.e = bVar.f31478a;
        this.f31476a = f;
        this.d = g;
        this.f31477b = 15000L;
        this.c = 15000L;
    }
}

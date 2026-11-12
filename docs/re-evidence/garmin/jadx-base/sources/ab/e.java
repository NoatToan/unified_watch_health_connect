package ab;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2440d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b[] f2441a;

        public a(b... bVarArr) {
            this.f2441a = bVarArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f2444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f2445d;

        public b(int i14, float[] fArr, float[] fArr2, int i15) {
            this.f2442a = i14;
            fa.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f2444c = fArr;
            this.f2445d = fArr2;
            this.f2443b = i15;
        }
    }

    public e(a aVar, a aVar2, int i14) {
        this.f2437a = aVar;
        this.f2438b = aVar2;
        this.f2439c = i14;
        this.f2440d = aVar == aVar2;
    }

    public e(a aVar, int i14) {
        this(aVar, aVar, i14);
    }
}

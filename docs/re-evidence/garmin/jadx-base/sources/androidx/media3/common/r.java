package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8428d;

    private r(i iVar, int i14, int i15, float f14, long j8) {
        fa.a.b(i14 > 0, "width must be positive, but is: " + i14);
        fa.a.b(i15 > 0, "height must be positive, but is: " + i15);
        this.f8425a = iVar;
        this.f8426b = i14;
        this.f8427c = i15;
        this.f8428d = j8;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f8429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f8432d;

        public b(r rVar) {
            this.f8429a = rVar.f8425a;
            this.f8430b = rVar.f8426b;
            this.f8431c = rVar.f8427c;
            this.f8432d = rVar.f8428d;
        }

        public b(i iVar, int i14, int i15) {
            this.f8429a = iVar;
            this.f8430b = i14;
            this.f8431c = i15;
        }
    }
}

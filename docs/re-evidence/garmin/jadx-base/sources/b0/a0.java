package b0;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f13841d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.d<Float, Float> f13843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7.d<Float, Float> f13844c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k7.d<Float, Float> f13845a;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            Float fValueOf2 = Float.valueOf(0.0f);
            this.f13845a = new k7.d<>(fValueOf2, fValueOf2);
            new k7.d(fValueOf, fValueOf);
        }
    }

    static {
        b bVar = new b();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        bVar.f13845a = new k7.d<>(fValueOf2, fValueOf2);
        f13841d = new a0(1.0f, bVar.f13845a, new k7.d(fValueOf, fValueOf));
    }

    private a0(float f14, k7.d<Float, Float> dVar, k7.d<Float, Float> dVar2) {
        this.f13842a = f14;
        this.f13843b = dVar;
        this.f13844c = dVar2;
    }
}

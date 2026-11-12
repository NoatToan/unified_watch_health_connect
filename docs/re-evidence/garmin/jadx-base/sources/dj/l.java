package dj;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f59837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f59838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f59839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f59840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f59841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ui.g<l> f59842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f59843g;

    public static class a extends l {
        @Override // dj.l
        public final g a(int i14, int i15, int i16, int i17) {
            return g.QUALITY;
        }

        @Override // dj.l
        public final float b(int i14, int i15, int i16, int i17) {
            int iMin = Math.min(i15 / i17, i14 / i16);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public static class b extends l {
        @Override // dj.l
        public final g a(int i14, int i15, int i16, int i17) {
            return g.MEMORY;
        }

        @Override // dj.l
        public final float b(int i14, int i15, int i16, int i17) {
            int iCeil = (int) Math.ceil(Math.max(i15 / i17, i14 / i16));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    public static class c extends l {
        @Override // dj.l
        public final g a(int i14, int i15, int i16, int i17) {
            return b(i14, i15, i16, i17) == 1.0f ? g.QUALITY : l.f59837a.a(i14, i15, i16, i17);
        }

        @Override // dj.l
        public final float b(int i14, int i15, int i16, int i17) {
            return Math.min(1.0f, l.f59837a.b(i14, i15, i16, i17));
        }
    }

    public static class d extends l {
        @Override // dj.l
        public final g a(int i14, int i15, int i16, int i17) {
            return g.QUALITY;
        }

        @Override // dj.l
        public final float b(int i14, int i15, int i16, int i17) {
            return Math.max(i16 / i14, i17 / i15);
        }
    }

    public static class e extends l {
        @Override // dj.l
        public final g a(int i14, int i15, int i16, int i17) {
            return l.f59843g ? g.QUALITY : g.MEMORY;
        }

        @Override // dj.l
        public final float b(int i14, int i15, int i16, int i17) {
            if (l.f59843g) {
                return Math.min(i16 / i14, i17 / i15);
            }
            int iMax = Math.max(i15 / i17, i14 / i16);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    public static class f extends l {
        @Override // dj.l
        public final g a(int i14, int i15, int i16, int i17) {
            return g.QUALITY;
        }

        @Override // dj.l
        public final float b(int i14, int i15, int i16, int i17) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        new a();
        new b();
        f59837a = new e();
        f59838b = new c();
        d dVar = new d();
        f59839c = dVar;
        f59840d = new f();
        f59841e = dVar;
        f59842f = ui.g.b(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f59843g = true;
    }

    public abstract g a(int i14, int i15, int i16, int i17);

    public abstract float b(int i14, int i15, int i16, int i17);
}

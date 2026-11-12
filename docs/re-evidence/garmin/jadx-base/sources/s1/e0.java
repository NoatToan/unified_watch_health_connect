package s1;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f155560a = new w(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f155561b = new w(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f155562c = new w(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f155563d = new b0() { // from class: s1.c0

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f155518a = 1;

        @Override // s1.b0
        public final float a(float f14) {
            float f15;
            float f16;
            switch (this.f155518a) {
                case 0:
                    if (f14 < 0.36363637f) {
                        return 7.5625f * f14 * f14;
                    }
                    if (f14 < 0.72727275f) {
                        float f17 = f14 - 0.54545456f;
                        f15 = 7.5625f * f17 * f17;
                        f16 = 0.75f;
                    } else if (f14 < 0.90909094f) {
                        float f18 = f14 - 0.8181818f;
                        f15 = 7.5625f * f18 * f18;
                        f16 = 0.9375f;
                    } else {
                        float f19 = f14 - 0.95454544f;
                        f15 = 7.5625f * f19 * f19;
                        f16 = 0.984375f;
                    }
                    return f15 + f16;
                default:
                    return f14;
            }
        }
    };
}

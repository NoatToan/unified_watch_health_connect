package hy1;

import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhy1/b;", "", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f86367a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhy1/b$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: hy1.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1714a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f86368a;

            static {
                int[] iArr = new int[hy1.a.values().length];
                try {
                    iArr[hy1.a.MALE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hy1.a.FEMALE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f86368a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static p a(hy1.a aVar, int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i24;
            Float fValueOf = Float.valueOf(48.3f);
            Float fValueOf2 = Float.valueOf(54.0f);
            Float fValueOf3 = Float.valueOf(41.7f);
            Float fValueOf4 = Float.valueOf(45.4f);
            Float fValueOf5 = Float.valueOf(51.1f);
            Float fValueOf6 = Float.valueOf(55.4f);
            Float fValueOf7 = Float.valueOf(25.9f);
            Float fValueOf8 = Float.valueOf(28.2f);
            Float fValueOf9 = Float.valueOf(30.9f);
            Float fValueOf10 = Float.valueOf(27.5f);
            Float fValueOf11 = Float.valueOf(30.0f);
            Float fValueOf12 = Float.valueOf(30.1f);
            Float fValueOf13 = Float.valueOf(41.1f);
            Float fValueOf14 = Float.valueOf(36.3f);
            Float fValueOf15 = Float.valueOf(39.7f);
            Float fValueOf16 = Float.valueOf(45.3f);
            Float fValueOf17 = Float.valueOf(34.4f);
            Float fValueOf18 = Float.valueOf(47.4f);
            Float fValueOf19 = Float.valueOf(36.1f);
            Float fValueOf20 = Float.valueOf(43.9f);
            Float fValueOf21 = Float.valueOf(49.6f);
            Float fValueOf22 = Float.valueOf(32.3f);
            Float fValueOf23 = Float.valueOf(37.8f);
            Float fValueOf24 = Float.valueOf(42.4f);
            Float fValueOf25 = Float.valueOf(39.5f);
            Float fValueOf26 = Float.valueOf(36.7f);
            Float fValueOf27 = Float.valueOf(33.0f);
            aVar.getClass();
            int i25 = C1714a.f86368a[aVar.ordinal()];
            if (i25 == 1) {
                if (20 <= i14) {
                    i15 = 30;
                    if (i14 < 30) {
                        return new p("20-29", new p[]{new p(fValueOf6, null), new p(fValueOf5, fValueOf6), new p(fValueOf4, fValueOf5), new p(fValueOf3, fValueOf4), new p(null, fValueOf3)});
                    }
                } else {
                    i15 = 30;
                }
                if (i15 <= i14) {
                    i16 = 40;
                    if (i14 < 40) {
                        return new p("30-39", new p[]{new p(fValueOf2, null), new p(fValueOf, fValueOf2), new p(Float.valueOf(44.0f), fValueOf), new p(Float.valueOf(40.5f), Float.valueOf(44.0f)), new p(null, Float.valueOf(40.5f))});
                    }
                } else {
                    i16 = 40;
                }
                if (i16 > i14) {
                    i17 = 50;
                } else {
                    if (i14 < 50) {
                        return new p("40-49", new p[]{new p(Float.valueOf(52.5f), null), new p(Float.valueOf(46.4f), Float.valueOf(52.5f)), new p(fValueOf24, Float.valueOf(46.4f)), new p(Float.valueOf(38.5f), fValueOf24), new p(null, Float.valueOf(38.5f))});
                    }
                    i17 = 50;
                }
                if (i17 <= i14 && i14 < 60) {
                    return new p("50-59", new p[]{new p(Float.valueOf(48.9f), null), new p(Float.valueOf(43.4f), Float.valueOf(48.9f)), new p(Float.valueOf(39.2f), Float.valueOf(43.4f)), new p(Float.valueOf(35.6f), Float.valueOf(39.2f)), new p(null, Float.valueOf(35.6f))});
                }
                if (60 <= i14) {
                    i18 = 70;
                    if (i14 < 70) {
                        return new p("60-69", new p[]{new p(Float.valueOf(45.7f), null), new p(fValueOf25, Float.valueOf(45.7f)), new p(Float.valueOf(35.5f), fValueOf25), new p(fValueOf22, Float.valueOf(35.5f)), new p(null, fValueOf22)});
                    }
                } else {
                    i18 = 70;
                }
                if (i18 <= i14 && i14 < 80) {
                    return new p("70-79", new p[]{new p(Float.valueOf(42.1f), null), new p(fValueOf26, Float.valueOf(42.1f)), new p(fValueOf22, fValueOf26), new p(Float.valueOf(29.4f), fValueOf22), new p(null, Float.valueOf(29.4f))});
                }
            } else if (i25 == 2) {
                if (20 <= i14 && i14 < 30) {
                    return new p("20-29", new p[]{new p(fValueOf21, null), new p(fValueOf20, fValueOf21), new p(fValueOf25, fValueOf20), new p(fValueOf19, fValueOf25), new p(null, fValueOf19)});
                }
                if (30 <= i14) {
                    i19 = 40;
                    if (i14 < 40) {
                        return new p("30-39", new p[]{new p(fValueOf18, null), new p(fValueOf24, fValueOf18), new p(fValueOf23, fValueOf24), new p(fValueOf17, fValueOf23), new p(null, fValueOf17)});
                    }
                } else {
                    i19 = 40;
                }
                if (i19 <= i14 && i14 < 50) {
                    return new p("40-49", new p[]{new p(fValueOf16, null), new p(fValueOf15, fValueOf16), new p(fValueOf14, fValueOf15), new p(fValueOf27, fValueOf14), new p(null, fValueOf27)});
                }
                if (50 <= i14 && i14 < 60) {
                    return new p("50-59", new p[]{new p(fValueOf13, null), new p(fValueOf26, fValueOf13), new p(fValueOf27, fValueOf26), new p(fValueOf12, fValueOf27), new p(null, fValueOf12)});
                }
                if (60 <= i14) {
                    i24 = 70;
                    if (i14 < 70) {
                        return new p("60-69", new p[]{new p(fValueOf23, null), new p(fValueOf27, fValueOf23), new p(fValueOf11, fValueOf27), new p(fValueOf10, fValueOf11), new p(null, fValueOf10)});
                    }
                } else {
                    i24 = 70;
                }
                if (i24 > i14 || i14 >= 80) {
                    return null;
                }
                return new p("70-79", new p[]{new p(fValueOf26, null), new p(fValueOf9, fValueOf26), new p(fValueOf8, fValueOf9), new p(fValueOf7, fValueOf8), new p(null, fValueOf7)});
            }
            return null;
        }

        private a() {
        }
    }
}

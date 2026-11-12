package t60;

import lc.u0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162704a;

        static {
            int[] iArr = new int[t60.a.values().length];
            try {
                iArr[t60.a.INDEX_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t60.a.SLEEP_BAND_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t60.a.BPM_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t60.a.EDGE_1050_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t60.a.HERMES_BANNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f162704a = iArr;
        }
    }

    public static final String a(t60.a aVar) {
        aVar.getClass();
        c cVar = (c) KoinJavaComponent.get$default(c.class, null, null, 6, null);
        int i14 = a.f162704a[aVar.ordinal()];
        if (i14 == 1) {
            return cVar.f();
        }
        if (i14 == 2) {
            return cVar.d();
        }
        if (i14 == 3) {
            return cVar.a();
        }
        if (i14 == 4) {
            return cVar.e();
        }
        if (i14 == 5) {
            return cVar.g();
        }
        u0.r();
        return null;
    }
}

package el0;

import com.garmin.proto.generated.GDIInternationalGolf;
import lc.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: el0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1368a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64525a;

        static {
            int[] iArr = new int[GDIInternationalGolf.MapType.values().length];
            try {
                iArr[GDIInternationalGolf.MapType.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIInternationalGolf.MapType.MEDIUM_PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDIInternationalGolf.MapType.COURSE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDIInternationalGolf.MapType.GREEN_CONTOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64525a = iArr;
        }
    }

    public static final int a(GDIInternationalGolf.MapType mapType) {
        mapType.getClass();
        int i14 = C1368a.f64525a[mapType.ordinal()];
        if (i14 == 1) {
            return 0;
        }
        if (i14 == 2) {
            return 1;
        }
        if (i14 == 3) {
            return 2;
        }
        if (i14 == 4) {
            return 3;
        }
        u0.r();
        return 0;
    }
}

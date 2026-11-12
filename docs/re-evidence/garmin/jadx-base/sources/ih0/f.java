package ih0;

import lc.u0;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93452a;

        static {
            int[] iArr = new int[dh0.g.values().length];
            try {
                iArr[dh0.g.VIGOROUS_DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dh0.g.VIGOROUS_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dh0.g.BMI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dh0.g.BODY_FAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dh0.g.RESTING_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93452a = iArr;
        }
    }

    public static boolean a(dh0.d dVar) {
        dh0.g gVar = dVar.f59564a;
        gVar.getClass();
        int i14 = g.a.f93453a[gVar.ordinal()];
        int i15 = (i14 == 1 || i14 == 2) ? 7 : Integer.MAX_VALUE;
        dVar.getClass();
        LocalDate localDate = dVar.f59569f;
        return localDate != null && Days.daysBetween(localDate, LocalDate.now()).getDays() >= i15;
    }

    public static final boolean b(dh0.d dVar) {
        dVar.getClass();
        Double d14 = dVar.f59565b;
        int i14 = a.f93452a[dVar.f59564a.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return d14 != null && d14.doubleValue() >= 0.0d;
        }
        if (i14 == 3 || i14 == 4 || i14 == 5) {
            return d14 != null && d14.doubleValue() > 0.0d;
        }
        u0.r();
        return false;
    }
}

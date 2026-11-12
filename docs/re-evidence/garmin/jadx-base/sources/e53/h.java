package e53;

import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
public class h extends g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63110a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.NANOSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.MICROSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f63110a = iArr;
        }
    }

    public static final long a(long j8, f fVar) {
        long j14;
        fVar.getClass();
        int i14 = a.f63110a[fVar.ordinal()];
        if (i14 == 1) {
            j14 = 86400000;
        } else if (i14 == 2) {
            j14 = 3600000;
        } else if (i14 == 3) {
            j14 = 60000;
        } else if (i14 == 4) {
            j14 = 1000;
        } else {
            if (i14 != 5) {
                e0.t(fVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j14 = 1;
        }
        if (j8 == 0) {
            return 0L;
        }
        if (j8 == 1) {
            if (j14 <= 4611686018427387903L) {
                return j14;
            }
        } else if (j14 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j8)) - Long.numberOfLeadingZeros(j14);
            if (iNumberOfLeadingZeros < 63) {
                return j8 * j14;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j15 = j8 * j14;
                if (j15 <= 4611686018427387903L) {
                    return j15;
                }
            }
        } else if (j8 <= 4611686018427387903L) {
            return j8;
        }
        return 4611686018427387903L;
    }
}

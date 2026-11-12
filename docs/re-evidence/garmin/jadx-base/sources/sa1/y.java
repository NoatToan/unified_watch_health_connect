package sa1;

import c22.l3;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158316a;

        static {
            int[] iArr = new int[gg0.i.values().length];
            try {
                iArr[gg0.i.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.i.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg0.i.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gg0.i.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f158316a = iArr;
        }
    }

    public static final double a(fg0.d dVar) {
        double d14;
        if (dVar == null) {
            return 0.0d;
        }
        Double value = dVar.getValue();
        double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
        gg0.i unit = dVar.getUnit();
        int i14 = unit == null ? -1 : a.f158316a[unit.ordinal()];
        if (i14 == 1) {
            return dDoubleValue;
        }
        if (i14 == 2) {
            l3.f23124b.getClass();
            d14 = 1000.0d;
        } else if (i14 == 3) {
            l3.f23124b.getClass();
            d14 = 1609.344d;
        } else {
            if (i14 != 4) {
                return 0.0d;
            }
            l3.f23124b.getClass();
            d14 = 0.9144d;
        }
        return dDoubleValue * d14;
    }
}

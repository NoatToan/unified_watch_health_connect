package ky0;

import am.i2;
import c22.l3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky0/d2;", "", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f107276a = new d2();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f107278b;

        static {
            int[] iArr = new int[ls.e.values().length];
            try {
                iArr[ls.e.TOTAL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ls.e.TOTAL_DIVE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ls.e.TOTAL_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ls.e.TOTAL_ASCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ls.e.MAX_DEPTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ls.e.AVERAGE_DEPTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ls.e.CALORIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ls.e.TOTAL_SWIMMING_STROKES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ls.e.AVERAGE_PACE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ls.e.AVERAGE_SPEED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ls.e.SWIMMING_PACE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ls.e.AVERAGE_POWER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ls.e.AVERAGE_HEART_RATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ls.e.MAX_HEART_RATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f107277a = iArr;
            int[] iArr2 = new int[am.x0.values().length];
            try {
                iArr2[am.x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[am.x0.f4312o.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[am.x0.f4316p.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[am.x0.f4324r.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[am.x0.f4331t.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[am.x0.f4320q.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[am.x0.D.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[am.x0.U1.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[am.x0.f4350y.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[am.x0.f4277d3.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[am.x0.f4268a3.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[am.x0.f4323q3.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[am.x0.C.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            f107278b = iArr2;
        }
    }

    private d2() {
    }

    public static String a(ls.e eVar) {
        eVar.getClass();
        switch (a.f107277a[eVar.ordinal()]) {
            case 1:
                return "duration";
            case 2:
                return "bottomTime";
            case 3:
                return "distance";
            case 4:
                return "elevationGain";
            case 5:
                return "maxDepth";
            case 6:
                return "avgDepth";
            case 7:
                return "calories";
            case 8:
                return "strokes";
            case 9:
            case 10:
            case 11:
                return "avgSpeed";
            case 12:
                return "avgPower";
            case 13:
                return "avgHr";
            case 14:
                return "maxHr";
            default:
                return "";
        }
    }

    public static i53.f b(am.x0 x0Var) {
        switch (a.f107278b[x0Var.ordinal()]) {
            case 1:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.AVERAGE_PACE, ls.e.TOTAL_ASCENT, ls.e.AVERAGE_HEART_RATE, ls.e.CALORIES);
            case 2:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.AVERAGE_SPEED, ls.e.TOTAL_ASCENT, ls.e.AVERAGE_HEART_RATE, ls.e.AVERAGE_POWER, ls.e.CALORIES);
            case 3:
                return i53.a.a(ls.e.TOTAL_TIME, ls.e.AVERAGE_HEART_RATE, ls.e.MAX_HEART_RATE, ls.e.CALORIES);
            case 4:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.SWIMMING_PACE, ls.e.AVERAGE_HEART_RATE, ls.e.TOTAL_SWIMMING_STROKES, ls.e.CALORIES);
            case 5:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.AVERAGE_PACE, ls.e.AVERAGE_HEART_RATE, ls.e.CALORIES);
            case 6:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.TOTAL_ASCENT, ls.e.AVERAGE_PACE, ls.e.AVERAGE_HEART_RATE, ls.e.CALORIES);
            case 7:
                return i53.a.a(ls.e.MAX_DEPTH, ls.e.AVERAGE_DEPTH, ls.e.TOTAL_DIVE_TIME);
            case 8:
            case 9:
            case 10:
            case 11:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.AVERAGE_SPEED, ls.e.AVERAGE_HEART_RATE, ls.e.CALORIES);
            case 12:
                return i53.a.a(ls.e.TOTAL_TIME, ls.e.CALORIES, ls.e.AVERAGE_HEART_RATE);
            case 13:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.AVERAGE_SPEED, ls.e.CALORIES);
            default:
                return i53.a.a(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.AVERAGE_SPEED, ls.e.AVERAGE_HEART_RATE, ls.e.CALORIES);
        }
    }

    public static Object c(ls.e eVar, i2 i2Var) {
        eVar.getClass();
        switch (a.f107277a[eVar.ordinal()]) {
            case 1:
            case 2:
                return Double.valueOf(i2Var.getSum() / ((double) 1000));
            case 3:
            case 4:
                return Double.valueOf(i2Var.getSum() / ((double) 100));
            case 5:
                return Double.valueOf(i2Var.getMax() / ((double) 100));
            case 6:
                return Double.valueOf(i2Var.getAvg() / ((double) 100));
            case 7:
                l3.a aVar = l3.f23124b;
                double sum = i2Var.getSum();
                aVar.getClass();
                return Double.valueOf(Double.isNaN(sum) ? 0.0d : sum / ((double) 4.19002f));
            case 8:
                return Double.valueOf(i2Var.getSum());
            case 9:
            case 10:
                return Double.valueOf(i2Var.getAvg() * ((double) 10));
            case 11:
                return new ls.h(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), i2Var.getAvg() * ((double) 10), 100);
            case 12:
            case 13:
                return Double.valueOf(i2Var.getAvg());
            case 14:
                return Double.valueOf(i2Var.getMax());
            default:
                return Double.valueOf(i2Var.getSum());
        }
    }
}

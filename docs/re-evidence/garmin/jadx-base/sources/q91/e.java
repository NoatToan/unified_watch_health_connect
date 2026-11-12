package q91;

import am.x0;
import am.z0;
import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import o13.p;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143584a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.P.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.B.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.D.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.I.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.T.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.f143578z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.X.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.Y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.Z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d.f143565k0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d.H0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[d.U0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[d.Y0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[d.Z0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[d.X0.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[d.f143555a1.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[d.W0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[d.V0.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f143584a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        p pVar;
        if (fVar != null) {
            if (dVar != null) {
                switch (a.f143584a[dVar.ordinal()]) {
                    case 11:
                        pVar = new p("BENCH_PRESS", "BARBELL_BENCH_PRESS");
                        break;
                    case 12:
                        pVar = new p("SHOULDER_PRESS", "OVERHEAD_BARBELL_PRESS");
                        break;
                    case 13:
                        pVar = new p("SQUAT", "BARBELL_BACK_SQUAT");
                        break;
                    case 14:
                        pVar = new p("DEADLIFT", "BARBELL_DEADLIFT");
                        break;
                    case 15:
                        pVar = new p("ROW", "BARBELL_ROW");
                        break;
                    case 16:
                        pVar = new p("BICEPS_CURL", "BARBELL_BICEPS_CURL");
                        break;
                    case 17:
                        pVar = new p("BICEPS_CURL", "DUMBBELL_BICEPS_CURL");
                        break;
                    case 18:
                        pVar = new p("BENCH_PRESS", "DUMBBELL_BENCH_PRESS");
                        break;
                    case 19:
                        pVar = new p("DEADLIFT", "DUMBBELL_DEADLIFT");
                        break;
                    case 20:
                        pVar = new p("SHOULDER_PRESS", "OVERHEAD_DUMBBELL_PRESS");
                        break;
                    case 21:
                        pVar = new p("ROW", "DUMBBELL_ROW");
                        break;
                    case 22:
                        pVar = new p("SQUAT", "DUMBBELL_SQUAT");
                        break;
                    default:
                        pVar = null;
                        break;
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                return zf.b.v(fVar, (String) pVar.f128594a, (String) pVar.f128595b);
            }
        }
        return null;
    }

    public static final String b(Context context, d dVar) {
        switch (dVar == null ? -1 : a.f143584a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                l3.a aVar = l3.f23124b;
                double d14 = dVar.f143582d;
                m3 m3Var = m3.METER;
                aVar.getClass();
                return l3.a.P(context, d14, m3Var, l3.f23131i, true, null);
            case 6:
            case 7:
            case 8:
            case 9:
                l3.a aVar2 = l3.f23124b;
                double d15 = dVar.f143582d;
                m3 m3Var2 = m3.YARD;
                aVar2.getClass();
                return l3.a.P(context, d15, m3Var2, l3.f23131i, true, null);
            case 10:
                return context.getString(R.string.personal_records_label_longest_poolswim);
            default:
                return null;
        }
    }

    public static final boolean c(x0 x0Var) {
        x0Var.getClass();
        String str = x0Var.f4358a;
        z0 z0Var = z0.f4390a;
        return z0.b(x0.f4308n, str) || z0.b(x0.f4312o, str) || z0.b(x0.f4324r, str) || z0.W(str) || z0.b(x0.f4271b3, str);
    }
}

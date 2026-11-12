package rg2;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Metadata;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrg2/b;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f152669a = new b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152670a;

        static {
            int[] iArr = new int[ag2.c.a.values().length];
            try {
                iArr[ag2.c.a.LAP_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.c.a.STEP_DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag2.c.a.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ag2.c.a.DISTANCE_METERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ag2.c.a.MAX_HEART_RATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ag2.c.a.LAP_AVG_HEART_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ag2.c.a.AVG_HEART_RATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ag2.c.a.HEART_RATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ag2.c.a.PACE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ag2.c.a.GRADE_ADJUSTED_PACE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ag2.c.a.LAP_PACE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ag2.c.a.AVG_PACE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ag2.c.a.LAP_AVG_POWER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ag2.c.a.LAP_POWER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ag2.c.a.AVG_POWER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ag2.c.a.POWER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ag2.c.a.SPEED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ag2.c.a.AVG_SPEED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ag2.c.a.AVG_STROKE_RATE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ag2.c.a.STROKE_RATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ag2.c.a.RUN_CADENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ag2.c.a.RESPIRATION_RATE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ag2.c.a.BIKE_CADENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ag2.c.a.TOTAL_DESCENT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ag2.c.a.TOTAL_ASCENT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ag2.c.a.ELEVATION.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ag2.c.a.FLOOR_CLIMB_RATE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ag2.c.a.ROW_PACE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ag2.c.a.AVG_ROW_PACE_500M.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f152670a = iArr;
        }
    }

    private b() {
    }

    public static String a(ag2.c.a aVar, boolean z14, zf2.d dVar, p3.m mVar) {
        String strA;
        aVar.getClass();
        dVar.getClass();
        x1 x1Var = n.f135158a;
        int i14 = a.f152670a[aVar.ordinal()];
        int i15 = R.string.lbl_m;
        switch (i14) {
            case 1:
            case 2:
            case 3:
                mVar.C(-618524149);
                if (z14) {
                    mVar.C(-1994363065);
                    strA = dVar.f204637i.a(mVar);
                    mVar.f();
                } else {
                    mVar.C(-1994272762);
                    strA = dVar.f204638j.a(mVar);
                    mVar.f();
                }
                mVar.f();
                return strA;
            case 4:
                return sn.a.h(mVar, -618516508, R.string.lbl_m, mVar);
            case 5:
            case 6:
            case 7:
            case 8:
                return sn.a.h(mVar, -618510042, R.string.lbl_bpm, mVar);
            case 9:
            case 10:
            case 11:
            case 12:
                mVar.C(-618503998);
                String strQ = y.Q(mVar, z14 ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi);
                mVar.f();
                return strQ;
            case 13:
            case 14:
            case 15:
            case 16:
                return sn.a.h(mVar, -618496245, R.string.common_watts, mVar);
            case 17:
            case 18:
                mVar.C(-618492656);
                String strQ2 = y.Q(mVar, z14 ? R.string.lbl_kmh : R.string.lbl_mph);
                mVar.f();
                return strQ2;
            case 19:
            case 20:
            case 21:
                return sn.a.h(mVar, -618486330, R.string.lbl_spm, mVar);
            case 22:
                return sn.a.h(mVar, -618483751, R.string.activities_brpm_common_lbl, mVar);
            case 23:
                return sn.a.h(mVar, -618480762, R.string.lbl_rpm, mVar);
            case 24:
            case 25:
            case 26:
                mVar.C(-618475799);
                if (!z14) {
                    i15 = R.string.ft;
                }
                String strQ3 = y.Q(mVar, i15);
                mVar.f();
                return strQ3;
            case 27:
                return sn.a.h(mVar, -618472147, R.string.floors_per_min, mVar);
            case 28:
            case 29:
                mVar.C(-618468174);
                String strP = y.P(R.string.per_n_meters, new Object[]{"500"}, mVar);
                mVar.f();
                return strP;
            default:
                mVar.C(-1992579977);
                mVar.f();
                return null;
        }
    }
}

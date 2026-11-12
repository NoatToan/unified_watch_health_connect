package wq;

import am.x0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import ps.o1;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwq/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f186536a;

    /* JADX INFO: renamed from: wq.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3471a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f186538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f186539c;

        static {
            int[] iArr = new int[uq.i.values().length];
            try {
                iArr[uq.i.ROUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uq.i.SPLIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uq.i.LAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uq.i.WAVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uq.i.WAKESPORTS_RUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uq.i.RUNS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[uq.i.SKI_RUN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[uq.i.INTERVALS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[uq.i.DIVE_NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[uq.i.MATCH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[uq.i.RUN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[uq.i.SPLIT_INDEX_OR_REST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[uq.i.RUN_ASCENT_DESCENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[uq.i.SPLIT_ASCENT_DESCENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[uq.i.SPLIT_OBSTACLE_RUN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[uq.i.DURATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[uq.i.SURF_DURATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[uq.i.WAKESPORTS_ACTIVE_TIME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[uq.i.TOTAL_TIME.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[uq.i.TIME.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[uq.i.CUMULATIVE_TIME.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[uq.i.START_TIME.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[uq.i.STOP_TIME.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[uq.i.MOVING_TIME.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[uq.i.RUN_MOVING_TIME.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[uq.i.IDLE_TIME.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[uq.i.BOTTOM_TIME.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[uq.i.SURFACE_INTERVAL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[uq.i.DIFFICULTY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[uq.i.MAX_PISTE_DIFFICULTY.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[uq.i.STATUS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[uq.i.FALLS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[uq.i.CALORIES.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[uq.i.MIN_HR.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[uq.i.AVG_HR_SHORT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[uq.i.AVG_HR.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[uq.i.MAX_HR_SHORT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[uq.i.MAX_HR.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[uq.i.ELEVATION_GAIN.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[uq.i.ASCENT_ELEVATION_GAIN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[uq.i.ELEVATION_LOSS.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[uq.i.DESCENT_ELEVATION_LOSS.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[uq.i.AVG_DESCENT_SPEED.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[uq.i.MAX_DEPTH.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[uq.i.MAX_SPEED.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[uq.i.MAX_NAUT_SOG.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[uq.i.AVG_SPEED.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[uq.i.AVG_NAUT_SOG.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[uq.i.AVG_MOVING_SPEED.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[uq.i.NORMALIZED_POWER.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[uq.i.LR_BALANCE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[uq.i.AVG_POWER.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[uq.i.MAX_POWER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[uq.i.WEIGHT_AVG_POWER.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[uq.i.WEIGHT_MAX_POWER.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[uq.i.CYCLING_AVG_POWER.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[uq.i.CYCLING_GOAL_POWER.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[uq.i.AVG_BIKE_FORCE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[uq.i.MAX_BIKE_FORCE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[uq.i.NORMALIZED_FORCE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[uq.i.AVG_RUN_CADENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[uq.i.MAX_RUN_CADENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[uq.i.AVG_BIKE_CADENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[uq.i.MAX_BIKE_CADENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[uq.i.AVG_STRIDE_LENGTH.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[uq.i.DISTANCE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[uq.i.DISTANCE_SHORT.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[uq.i.MIN_TEMPERATURE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[uq.i.MAX_TEMPERATURE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[uq.i.AVG_TEMPERATURE.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[uq.i.MIN_WATER_TEMPERATURE.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[uq.i.ENTRY_LOCATION.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[uq.i.AVG_GCT.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[uq.i.AVG_GCT_BAL.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[uq.i.AVG_STEP_SPEED_LOSS.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[uq.i.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[uq.i.AVG_VERT_OSC.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[uq.i.AVG_VERT_OSC_RATIO.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[uq.i.AVG_PACE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[uq.i.AVG_GAP.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[uq.i.AVG_MOVING_PACE.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[uq.i.BEST_PACE.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[uq.i.GOAL_PACE.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[uq.i.AVG_COMPARISON_PACE.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[uq.i.MAX_SPEED_2S_NAUTICAL.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[uq.i.MAX_SPEED_10S_NAUTICAL.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[uq.i.SPEED_10S_NAUTICAL.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[uq.i.AVG_SPEED_NAUTICAL.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[uq.i.MAX_SPEED_NAUTICAL.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[uq.i.MAX_SPEED_2S.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[uq.i.MAX_SPEED_10S.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[uq.i.AVG_SPEED_USER_UNIT.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[uq.i.MAX_SPEED_USER_UNIT.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[uq.i.CIQ_COLUMN.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[uq.i.OUTCOME.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[uq.i.PLACEMENT.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[uq.i.AVG_STRESS.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[uq.i.MAX_STRESS.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[uq.i.POOL_APNEA_DISCIPLINE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[uq.i.AVG_POOL_VELOCITY.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[uq.i.POOL_APNEA_DISTANCE.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[uq.i.PACK_WEIGHT.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            f186537a = iArr;
            int[] iArr2 = new int[x0.values().length];
            try {
                iArr2[x0.E2.ordinal()] = 1;
            } catch (NoSuchFieldError unused103) {
            }
            f186538b = iArr2;
            int[] iArr3 = new int[x.values().length];
            try {
                iArr3[x.ASCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr3[x.DESCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr3[x.TRANSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused106) {
            }
            f186539c = iArr3;
        }
    }

    public a(l22.b bVar) {
        bVar.getClass();
        this.f186536a = bVar;
    }

    public static int a(List list, uq.i iVar) {
        Object next;
        list.getClass();
        iVar.getClass();
        if (C3471a.f186537a[iVar.ordinal()] != 84) {
            return 0;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(x.PACE_PRO_SPLIT.f147220a, ((o1) next).getSplitType()));
        o1 o1Var = (o1) next;
        if (o1Var == null) {
            return 0;
        }
        int iA = f.a(o1Var.getTargetAvgSpeed(), true);
        double dAbs = Math.abs(((double) (iA - f.a(o1Var.getAverageSpeed(), true))) / ((double) iA)) * 100.0d;
        if (0.0d > dAbs || dAbs > 2.0d) {
            return (2.0d > dAbs || dAbs > 5.0d) ? R.drawable.split_comparison_dot_red : R.drawable.split_comparison_dot_yellow;
        }
        return R.drawable.split_comparison_dot_green;
    }
}

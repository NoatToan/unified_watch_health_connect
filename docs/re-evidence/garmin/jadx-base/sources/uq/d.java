package uq;

import am.x0;
import am.z0;
import g22.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p13.b1;
import ps.x1;
import u1.y1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172188a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.J0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.K0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.D2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.f4352y2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.A2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.O2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.B2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[x0.P2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[x0.I1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[x0.V2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[x0.K1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[x0.H2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[x0.G2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[x0.I2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[x0.J2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[x0.f4318p2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[x0.W2.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[x0.E2.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[x0.f4267a2.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[x0.f4270b2.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[x0.Z1.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[x0.R0.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[x0.S0.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[x0.T0.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[x0.O0.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[x0.f4296k0.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[x0.E3.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f172188a = iArr;
        }
    }

    public static final void a(ArrayList arrayList, List list, x0 x0Var) {
        String str = x0Var.f4358a;
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.E2, str)) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    x1 x1Var = (x1) it.next();
                    x1Var.getClass();
                    Integer gameRank = x1Var.getGameRank();
                    Double dValueOf = gameRank != null ? Double.valueOf(gameRank.intValue()) : null;
                    if (dValueOf != null && !Double.isNaN(dValueOf.doubleValue())) {
                        return;
                    }
                }
            }
            arrayList.removeIf(new s52.e(new y1(28), 15));
        }
    }

    public static final c b(x0 x0Var) {
        int[] iArr = a.f172188a;
        int iOrdinal = x0Var.ordinal();
        String str = x0Var.f4358a;
        switch (iArr[iOrdinal]) {
            case 1:
            case 2:
            case 3:
                LinkedHashSet linkedHashSetD = b1.d(new h(i.SPLIT_INDEX_OR_REST, false, 2, null));
                h hVar = new h(i.SPLIT, false, 2, null);
                i iVar = i.DURATION;
                h hVar2 = new h(iVar, false, 2, null);
                i iVar2 = i.DISTANCE;
                h hVar3 = new h(iVar2, false, 2, null);
                i iVar3 = i.AVG_COMPARISON_PACE;
                h hVar4 = new h(iVar3, false, 2, null);
                i iVar4 = i.GOAL_PACE;
                return new c(null, null, null, null, null, null, linkedHashSetD, b1.d(hVar, hVar2, hVar3, hVar4, new h(iVar4, false, 2, null)), b1.d(new h(iVar, false, 2, null), new h(iVar2, false, 2, null), new h(iVar3, false, 2, null), new h(iVar4, false, 2, null), new h(i.AVG_GAP, false, 2, null)), true, 63, null);
            case 4:
                i iVar5 = i.SPLIT_INDEX_OR_REST;
                h hVar5 = new h(iVar5, false, 2, null);
                i iVar6 = i.DURATION;
                h hVar6 = new h(iVar6, false, 2, null);
                i iVar7 = i.DISTANCE;
                h hVar7 = new h(iVar7, false, 2, null);
                i iVar8 = i.AVG_PACE;
                LinkedHashSet linkedHashSetD2 = b1.d(hVar5, hVar6, hVar7, new h(iVar8, false, 2, null));
                h hVar8 = new h(iVar6, false, 2, null);
                h hVar9 = new h(i.CUMULATIVE_TIME, false, 2, null);
                h hVar10 = new h(iVar7, false, 2, null);
                h hVar11 = new h(iVar8, false, 2, null);
                i iVar9 = i.AVG_GAP;
                LinkedHashSet linkedHashSetD3 = b1.d(hVar8, hVar9, hVar10, hVar11, new h(iVar9, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.ELEVATION_GAIN, false, 2, null), new h(i.ELEVATION_LOSS, false, 2, null), new h(i.AVG_RUN_CADENCE, false, 2, null), new h(i.AVG_STRIDE_LENGTH, false, 2, null), new h(i.CALORIES, false, 2, null), new h(i.AVG_TEMPERATURE, false, 2, null), new h(i.BEST_PACE, false, 2, null), new h(i.MAX_RUN_CADENCE, false, 2, null), new h(i.MOVING_TIME, false, 2, null), new h(i.AVG_MOVING_PACE, false, 2, null));
                LinkedHashSet linkedHashSetD4 = b1.d(new h(iVar5, false, 2, null));
                LinkedHashSet linkedHashSetD5 = b1.d(new h(iVar5, false, 2, null));
                h hVar12 = new h(i.SPLIT, false, 2, null);
                h hVar13 = new h(iVar6, false, 2, null);
                h hVar14 = new h(iVar7, false, 2, null);
                i iVar10 = i.AVG_COMPARISON_PACE;
                h hVar15 = new h(iVar10, false, 2, null);
                i iVar11 = i.GOAL_PACE;
                return new c(linkedHashSetD2, null, linkedHashSetD3, null, linkedHashSetD4, null, linkedHashSetD5, b1.d(hVar12, hVar13, hVar14, hVar15, new h(iVar11, false, 2, null)), b1.d(new h(iVar6, false, 2, null), new h(iVar7, false, 2, null), new h(iVar10, false, 2, null), new h(iVar11, false, 2, null), new h(iVar9, false, 2, null)), true, 42, null);
            case 5:
                i iVar12 = i.ROUTE;
                h hVar16 = new h(iVar12, false, 2, null);
                i iVar13 = i.DIFFICULTY;
                h hVar17 = new h(iVar13, false, 2, null);
                i iVar14 = i.FALLS;
                h hVar18 = new h(iVar14, false, 2, null);
                i iVar15 = i.STATUS;
                LinkedHashSet linkedHashSetD6 = b1.d(hVar16, hVar17, hVar18, new h(iVar15, false, 2, null));
                h hVar19 = new h(iVar12, false, 2, null);
                i iVar16 = i.DURATION;
                h hVar20 = new h(iVar16, false, 2, null);
                i iVar17 = i.ASCENT_ELEVATION_GAIN;
                h hVar21 = new h(iVar17, false, 2, null);
                i iVar18 = i.AVG_HR;
                LinkedHashSet linkedHashSetD7 = b1.d(hVar19, hVar20, hVar21, new h(iVar18, false, 2, null));
                LinkedHashSet linkedHashSetD8 = b1.d(new h(iVar12, false, 2, null), new h(iVar13, true), new h(iVar14, true), new h(iVar15, true));
                h hVar22 = new h(iVar13, false, 2, null);
                h hVar23 = new h(iVar14, false, 2, null);
                h hVar24 = new h(iVar15, false, 2, null);
                h hVar25 = new h(iVar16, false, 2, null);
                h hVar26 = new h(iVar17, false, 2, null);
                h hVar27 = new h(iVar18, false, 2, null);
                i iVar19 = i.MAX_HR;
                h hVar28 = new h(iVar19, false, 2, null);
                i iVar20 = i.CALORIES;
                return new c(linkedHashSetD6, linkedHashSetD7, b1.d(hVar22, hVar23, hVar24, hVar25, hVar26, hVar27, hVar28, new h(iVar20, false, 2, null)), b1.d(new h(iVar16, false, 2, null), new h(iVar17, false, 2, null), new h(iVar18, false, 2, null), new h(iVar19, false, 2, null), new h(iVar20, false, 2, null)), b1.d(new h(iVar12, false, 2, null)), linkedHashSetD8, null, null, null, false, 448, null);
            case 6:
                i iVar21 = i.ROUTE;
                h hVar29 = new h(iVar21, false, 2, null);
                i iVar22 = i.DIFFICULTY;
                h hVar30 = new h(iVar22, false, 2, null);
                i iVar23 = i.DURATION;
                h hVar31 = new h(iVar23, false, 2, null);
                i iVar24 = i.STATUS;
                return new c(b1.d(hVar29, hVar30, hVar31, new h(iVar24, false, 2, null)), null, b1.d(new h(iVar22, false, 2, null), new h(iVar23, false, 2, null), new h(iVar24, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.CALORIES, false, 2, null)), null, b1.d(new h(iVar21, false, 2, null)), b1.d(new h(iVar21, false, 2, null), new h(iVar22, true), new h(iVar24, true)), null, null, null, false, 458, null);
            case 7:
            case 8:
                i iVar25 = i.LAP;
                h hVar32 = new h(iVar25, false, 2, null);
                h hVar33 = new h(i.DURATION, false, 2, null);
                i iVar26 = i.MAX_NAUT_SOG;
                h hVar34 = new h(iVar26, false, 2, null);
                i iVar27 = i.AVG_POWER;
                return new c(b1.d(hVar32, hVar33, hVar34, new h(iVar27, false, 2, null)), null, b1.d(new h(i.AVG_NAUT_SOG, false, 2, null), new h(iVar26, false, 2, null), new h(i.TOTAL_TIME, false, 2, null), new h(i.MOVING_TIME, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.AVG_BIKE_CADENCE, false, 2, null), new h(i.MAX_BIKE_CADENCE, false, 2, null), new h(i.NORMALIZED_POWER, false, 2, null), new h(i.LR_BALANCE, false, 2, null), new h(iVar27, false, 2, null), new h(i.MAX_POWER, false, 2, null), new h(i.AVG_TEMPERATURE, false, 2, null), new h(i.CALORIES, false, 2, null), new h(i.DISTANCE, false, 2, null)), null, b1.d(new h(iVar25, false, 2, null)), null, null, null, null, true, 490, null);
            case 9:
            case 10:
                i iVar28 = i.LAP;
                h hVar35 = new h(iVar28, false, 2, null);
                h hVar36 = new h(i.DURATION, false, 2, null);
                i iVar29 = i.AVG_POWER;
                return new c(b1.d(hVar35, hVar36, new h(iVar29, false, 2, null), new h(i.AVG_HR_SHORT, false, 2, null)), null, b1.d(new h(i.TOTAL_TIME, false, 2, null), new h(i.MOVING_TIME, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.AVG_BIKE_CADENCE, false, 2, null), new h(i.MAX_BIKE_CADENCE, false, 2, null), new h(i.NORMALIZED_POWER, false, 2, null), new h(i.LR_BALANCE, false, 2, null), new h(iVar29, false, 2, null), new h(i.MAX_POWER, false, 2, null), new h(i.AVG_TEMPERATURE, false, 2, null), new h(i.CALORIES, false, 2, null), new h(i.DISTANCE, false, 2, null)), null, b1.d(new h(iVar28, false, 2, null)), null, null, null, null, true, 490, null);
            case 11:
            case 12:
                i iVar30 = i.WAVE;
                h hVar37 = new h(iVar30, false, 2, null);
                i iVar31 = i.SURF_DURATION;
                h hVar38 = new h(iVar31, false, 2, null);
                i iVar32 = i.DISTANCE;
                h hVar39 = new h(iVar32, false, 2, null);
                i iVar33 = i.MAX_SPEED;
                return new c(b1.d(hVar37, hVar38, hVar39, new h(iVar33, false, 2, null)), null, b1.d(new h(iVar31, false, 2, null), new h(iVar32, false, 2, null), new h(iVar33, false, 2, null), new h(i.AVG_SPEED, false, 2, null)), null, b1.d(new h(iVar30, false, 2, null)), null, null, null, null, true, 490, null);
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                i iVar34 = i.WAKESPORTS_RUN;
                h hVar40 = new h(iVar34, false, 2, null);
                i iVar35 = i.WAKESPORTS_ACTIVE_TIME;
                h hVar41 = new h(iVar35, false, 2, null);
                i iVar36 = i.DISTANCE;
                h hVar42 = new h(iVar36, false, 2, null);
                i iVar37 = i.MAX_SPEED;
                return new c(b1.d(hVar40, hVar41, hVar42, new h(iVar37, false, 2, null)), null, b1.d(new h(iVar35, false, 2, null), new h(iVar36, false, 2, null), new h(iVar37, false, 2, null), new h(i.AVG_SPEED, false, 2, null)), null, b1.d(new h(iVar34, false, 2, null)), null, null, null, null, true, 490, null);
            case 18:
            case 19:
                i iVar38 = i.RUN;
                h hVar43 = new h(iVar38, false, 2, null);
                i iVar39 = i.DURATION;
                h hVar44 = new h(iVar39, false, 2, null);
                i iVar40 = i.DISTANCE;
                LinkedHashSet linkedHashSetD9 = b1.d(hVar43, hVar44, new h(iVar40, false, 2, null), new h(i.SPEED_10S_NAUTICAL, false, 2, null));
                LinkedHashSet linkedHashSetD10 = b1.d(new h(iVar38, false, 2, null), new h(iVar39, false, 2, null), new h(iVar40, false, 2, null), new h(i.AVG_SPEED, false, 2, null));
                h hVar45 = new h(iVar39, false, 2, null);
                h hVar46 = new h(iVar40, false, 2, null);
                i iVar41 = i.AVG_SPEED_NAUTICAL;
                h hVar47 = new h(iVar41, false, 2, null);
                i iVar42 = i.MAX_SPEED_NAUTICAL;
                h hVar48 = new h(iVar42, false, 2, null);
                h hVar49 = new h(i.MAX_SPEED_10S_NAUTICAL, false, 2, null);
                h hVar50 = new h(i.MAX_SPEED_2S_NAUTICAL, false, 2, null);
                i iVar43 = i.AVG_SPEED_USER_UNIT;
                h hVar51 = new h(iVar43, false, 2, null);
                i iVar44 = i.MAX_SPEED_USER_UNIT;
                h hVar52 = new h(iVar44, false, 2, null);
                h hVar53 = new h(i.MAX_SPEED_10S, false, 2, null);
                h hVar54 = new h(i.MAX_SPEED_2S, false, 2, null);
                i iVar45 = i.AVG_HR;
                h hVar55 = new h(iVar45, false, 2, null);
                i iVar46 = i.MAX_HR;
                h hVar56 = new h(iVar46, false, 2, null);
                i iVar47 = i.CALORIES;
                return new c(linkedHashSetD9, linkedHashSetD10, b1.d(hVar45, hVar46, hVar47, hVar48, hVar49, hVar50, hVar51, hVar52, hVar53, hVar54, hVar55, hVar56, new h(iVar47, false, 2, null)), b1.d(new h(iVar39, false, 2, null), new h(iVar40, false, 2, null), new h(iVar41, false, 2, null), new h(iVar42, false, 2, null), new h(iVar43, false, 2, null), new h(iVar44, false, 2, null), new h(iVar45, false, 2, null), new h(iVar46, false, 2, null), new h(iVar47, false, 2, null)), b1.d(new h(iVar38, false, 2, null)), null, null, null, null, false, 480, null);
            case 20:
                i iVar48 = i.MATCH;
                h hVar57 = new h(iVar48, false, 2, null);
                i iVar49 = i.OUTCOME;
                h hVar58 = new h(iVar49, false, 2, null);
                i iVar50 = i.PLACEMENT;
                h hVar59 = new h(iVar50, false, 2, null);
                i iVar51 = i.AVG_STRESS;
                return new c(b1.d(hVar57, hVar58, hVar59, new h(iVar51, false, 2, null)), null, b1.d(new h(iVar49, false, 2, null), new h(iVar50, false, 2, null), new h(iVar51, false, 2, null), new h(i.MAX_STRESS, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.DURATION, false, 2, null)), null, b1.d(new h(iVar48, false, 2, null)), null, null, null, null, true, 490, null);
            case 21:
            case 22:
            case 23:
                i iVar52 = i.SKI_RUN;
                h hVar60 = new h(iVar52, false, 2, null);
                i iVar53 = i.DURATION;
                h hVar61 = new h(iVar53, false, 2, null);
                i iVar54 = i.DISTANCE_SHORT;
                h hVar62 = new h(iVar54, false, 2, null);
                i iVar55 = i.ELEVATION_LOSS;
                return new c(b1.d(hVar60, hVar61, hVar62, new h(iVar55, false, 2, null)), null, b1.d(new h(iVar53, false, 2, null), new h(i.RUN_MOVING_TIME, false, 2, null), new h(iVar54, false, 2, null), new h(iVar55, false, 2, null), new h(i.MAX_SPEED, false, 2, null), new h(i.AVG_SPEED, false, 2, null), new h(i.AVG_MOVING_SPEED, false, 2, null), new h(i.CALORIES, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.MAX_PISTE_DIFFICULTY, false, 2, null), new h(i.CUMULATIVE_TIME, false, 2, null), new h(i.IDLE_TIME, false, 2, null), new h(i.AVG_TEMPERATURE, false, 2, null)), null, b1.d(new h(iVar52, false, 2, null)), null, null, null, null, true, 490, null);
            case 24:
                i iVar56 = i.SKI_RUN;
                h hVar63 = new h(iVar56, false, 2, null);
                i iVar57 = i.ELEVATION_LOSS;
                h hVar64 = new h(iVar57, false, 2, null);
                i iVar58 = i.DISTANCE_SHORT;
                h hVar65 = new h(iVar58, false, 2, null);
                i iVar59 = i.MAX_SPEED;
                h hVar66 = new h(iVar59, false, 2, null);
                i iVar60 = i.DURATION;
                return new c(b1.d(hVar63, hVar64, hVar65, hVar66, new h(iVar60, false, 2, null)), null, b1.d(new h(iVar57, false, 2, null), new h(iVar58, false, 2, null), new h(iVar59, false, 2, null), new h(iVar60, false, 2, null), new h(i.RUN_MOVING_TIME, false, 2, null), new h(i.AVG_SPEED, false, 2, null), new h(i.AVG_DESCENT_SPEED, false, 2, null), new h(i.AVG_MOVING_SPEED, false, 2, null), new h(i.CALORIES, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.CUMULATIVE_TIME, false, 2, null), new h(i.IDLE_TIME, false, 2, null), new h(i.AVG_TEMPERATURE, false, 2, null), new h(i.GRIT, false, 2, null), new h(i.FLOW, false, 2, null), new h(i.JUMP_COUNT, false, 2, null)), null, b1.d(new h(iVar56, false, 2, null)), null, null, null, null, true, 490, null);
            case 25:
            case 26:
                i iVar61 = i.RUN_ASCENT_DESCENT;
                h hVar67 = new h(iVar61, false, 2, null);
                i iVar62 = i.DURATION;
                h hVar68 = new h(iVar62, false, 2, null);
                i iVar63 = i.DISTANCE;
                h hVar69 = new h(iVar63, false, 2, null);
                i iVar64 = i.ASCENT_ELEVATION_GAIN;
                h hVar70 = new h(iVar64, false, 2, null);
                i iVar65 = i.DESCENT_ELEVATION_LOSS;
                return new c(b1.d(hVar67, hVar68, hVar69, hVar70, new h(iVar65, false, 2, null)), null, b1.d(new h(iVar62, false, 2, null), new h(iVar63, false, 2, null), new h(iVar64, false, 2, null), new h(iVar65, false, 2, null), new h(i.AVG_DESCENT_SPEED, false, 2, null), new h(i.AVG_SPEED, false, 2, null), new h(i.MAX_SPEED, false, 2, null), new h(i.AVG_HR_SHORT, false, 2, null), new h(i.MAX_HR_SHORT, false, 2, null), new h(i.CUMULATIVE_TIME, false, 2, null), new h(i.MOVING_TIME, false, 2, null), new h(i.CALORIES, false, 2, null), new h(i.GRIT, false, 2, null), new h(i.FLOW, false, 2, null), new h(i.JUMP_COUNT, false, 2, null)), null, b1.d(new h(iVar61, false, 2, null)), null, null, null, null, true, 490, null);
            case 27:
                i iVar66 = i.SPLIT_OBSTACLE_RUN;
                h hVar71 = new h(iVar66, false, 2, null);
                i iVar67 = i.DURATION;
                h hVar72 = new h(iVar67, false, 2, null);
                i iVar68 = i.DISTANCE;
                h hVar73 = new h(iVar68, false, 2, null);
                i iVar69 = i.AVG_PACE;
                return new c(b1.d(hVar71, hVar72, hVar73, new h(iVar69, false, 2, null)), null, b1.d(new h(iVar67, false, 2, null), new h(i.CUMULATIVE_TIME, false, 2, null), new h(i.START_TIME, false, 2, null), new h(i.STOP_TIME, false, 2, null), new h(iVar68, false, 2, null), new h(iVar69, false, 2, null), new h(i.AVG_GAP, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null), new h(i.ELEVATION_GAIN, false, 2, null), new h(i.ELEVATION_LOSS, false, 2, null), new h(i.AVG_POWER, false, 2, null), new h(i.WEIGHT_AVG_POWER, false, 2, null), new h(i.MAX_POWER, false, 2, null), new h(i.WEIGHT_MAX_POWER, false, 2, null), new h(i.AVG_RUN_CADENCE, false, 2, null), new h(i.MAX_RUN_CADENCE, false, 2, null), new h(i.AVG_STRIDE_LENGTH, false, 2, null), new h(i.AVG_GCT, false, 2, null), new h(i.AVG_GCT_BAL, false, 2, null), new h(i.AVG_VERT_OSC, false, 2, null), new h(i.AVG_VERT_OSC_RATIO, false, 2, null), new h(i.CALORIES, false, 2, null), new h(i.AVG_TEMPERATURE, false, 2, null), new h(i.BEST_PACE, false, 2, null), new h(i.MOVING_TIME, false, 2, null), new h(i.AVG_MOVING_PACE, false, 2, null), new h(i.AVG_STEP_SPEED_LOSS, false, 2, null), new h(i.AVG_STEP_SPEED_LOSS_PERCENT, false, 2, null)), null, b1.d(new h(iVar66, false, 2, null)), null, null, null, null, true, 490, null);
            case 28:
                i iVar70 = i.INTERVALS;
                h hVar74 = new h(iVar70, false, 2, null);
                i iVar71 = i.POOL_APNEA_DISCIPLINE;
                h hVar75 = new h(iVar71, false, 2, null);
                i iVar72 = i.TIME;
                h hVar76 = new h(iVar72, false, 2, null);
                i iVar73 = i.POOL_APNEA_DISTANCE;
                return new c(b1.d(hVar74, hVar75, hVar76, new h(iVar73, false, 2, null)), null, b1.d(new h(iVar71, false, 2, null), new h(iVar72, false, 2, null), new h(iVar73, false, 2, null), new h(i.AVG_POOL_VELOCITY, false, 2, null), new h(i.MIN_HR, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null)), null, b1.d(new h(iVar70, false, 2, null)), null, null, null, null, true, 490, null);
            case 29:
                i iVar74 = i.SPLIT;
                h hVar77 = new h(iVar74, false, 2, null);
                i iVar75 = i.DURATION;
                h hVar78 = new h(iVar75, false, 2, null);
                i iVar76 = i.PACK_WEIGHT;
                h hVar79 = new h(iVar76, false, 2, null);
                i iVar77 = i.AVG_PACE;
                return new c(b1.d(hVar77, hVar78, hVar79, new h(iVar77, false, 2, null)), null, b1.d(new h(iVar75, false, 2, null), new h(iVar76, false, 2, null), new h(iVar77, false, 2, null), new h(i.DISTANCE, false, 2, null), new h(i.CALORIES, false, 2, null)), null, b1.d(new h(iVar74, false, 2, null)), b1.d(new h(iVar74, false, 2, null), new h(iVar75, false, 2, null), new h(iVar76, true), new h(iVar77, false, 2, null)), null, null, null, false, 970, null);
            default:
                z0 z0Var = z0.f4390a;
                if (z0.b(x0.f4312o, str)) {
                    return new c(null, null, null, null, null, null, null, b1.d(new h(i.SPLIT, false, 2, null), new h(i.DURATION, false, 2, null), new h(i.DISTANCE, false, 2, null), new h(i.CYCLING_AVG_POWER, false, 2, null), new h(i.CYCLING_GOAL_POWER, false, 2, null), new h(i.AVG_BIKE_FORCE, false, 2, null), new h(i.MAX_BIKE_FORCE, false, 2, null), new h(i.NORMALIZED_FORCE, false, 2, null)), null, true, 383, null);
                }
                if (z0.o(str)) {
                    i iVar78 = i.SPLIT_ASCENT_DESCENT;
                    h hVar80 = new h(iVar78, false, 2, null);
                    i iVar79 = i.DURATION;
                    h hVar81 = new h(iVar79, false, 2, null);
                    i iVar80 = i.DISTANCE;
                    h hVar82 = new h(iVar80, false, 2, null);
                    i iVar81 = i.ASCENT_ELEVATION_GAIN;
                    h hVar83 = new h(iVar81, false, 2, null);
                    i iVar82 = i.DESCENT_ELEVATION_LOSS;
                    return new c(b1.d(hVar80, hVar81, hVar82, hVar83, new h(iVar82, false, 2, null)), null, b1.d(new h(iVar79, false, 2, null), new h(iVar80, false, 2, null), new h(iVar81, false, 2, null), new h(iVar82, false, 2, null), new h(i.AVG_SPEED, false, 2, null), new h(i.MAX_SPEED, false, 2, null), new h(i.AVG_HR_SHORT, false, 2, null), new h(i.MAX_HR_SHORT, false, 2, null), new h(i.CUMULATIVE_TIME, false, 2, null), new h(i.MOVING_TIME, false, 2, null), new h(i.CALORIES, false, 2, null)), null, b1.d(new h(iVar78, false, 2, null)), null, null, null, null, true, 490, null);
                }
                if (z0.M(str)) {
                    i iVar83 = i.DIVE_NUMBER;
                    h hVar84 = new h(iVar83, false, 2, null);
                    i iVar84 = i.BOTTOM_TIME;
                    h hVar85 = new h(iVar84, false, 2, null);
                    i iVar85 = i.MAX_DEPTH;
                    h hVar86 = new h(iVar85, false, 2, null);
                    i iVar86 = i.SURFACE_INTERVAL;
                    return new c(b1.d(hVar84, hVar85, hVar86, new h(iVar86, false, 2, null)), null, b1.d(new h(iVar84, false, 2, null), new h(iVar85, false, 2, null), new h(iVar86, false, 2, null), new h(i.ENTRY_LOCATION, false, 2, null), new h(i.MIN_WATER_TEMPERATURE, false, 2, null), new h(i.AVG_HR, false, 2, null), new h(i.MAX_HR, false, 2, null)), null, b1.d(new h(iVar83, false, 2, null)), null, null, null, null, false, 490, null);
                }
                i iVar87 = i.SPLIT;
                h hVar87 = new h(iVar87, false, 2, null);
                i iVar88 = i.DURATION;
                h hVar88 = new h(iVar88, false, 2, null);
                i iVar89 = i.DISTANCE;
                h hVar89 = new h(iVar89, false, 2, null);
                i iVar90 = i.AVG_HR;
                return new c(b1.d(hVar87, hVar88, hVar89, new h(iVar90, false, 2, null)), null, b1.d(new h(iVar88, false, 2, null), new h(iVar89, false, 2, null), new h(i.ELEVATION_GAIN, false, 2, null), new h(i.ELEVATION_LOSS, false, 2, null), new h(iVar90, false, 2, null), new h(i.MAX_HR, false, 2, null)), null, b1.d(new h(iVar87, false, 2, null)), null, null, null, null, false, 1002, null);
        }
    }

    public static final ArrayList c(List list, List list2, x0 x0Var, boolean z14) {
        list.getClass();
        list2.getClass();
        x0Var.getClass();
        String str = x0Var.f4358a;
        ArrayList arrayList = new ArrayList(list);
        if (!list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.removeIf(new s52.e(new y1(27), 14));
                    break;
                }
                x1 x1Var = (x1) it.next();
                x1Var.getClass();
                Double avgGradeAdjustedSpeed = x1Var.getAvgGradeAdjustedSpeed();
                if (avgGradeAdjustedSpeed != null && !Double.isNaN(avgGradeAdjustedSpeed.doubleValue()) && avgGradeAdjustedSpeed.doubleValue() > 0.0d) {
                    break;
                }
            }
        } else {
            arrayList.removeIf(new s52.e(new y1(27), 14));
            break;
        }
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.f4308n, str) && z0.b(x0.O0, str)) {
            if (!list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        arrayList.removeIf(new s52.e(new y1(22), 8));
                        arrayList.removeIf(new s52.e(new y1(23), 9));
                        break;
                    }
                    x1 x1Var2 = (x1) it3.next();
                    x1Var2.getClass();
                    Double avgPower = x1Var2.getAvgPower();
                    if (avgPower != null && !Double.isNaN(avgPower.doubleValue())) {
                        if (!z14) {
                            arrayList.removeIf(new s52.e(new y1(24), 10));
                            break;
                        }
                        break;
                    }
                }
            } else {
                arrayList.removeIf(new s52.e(new y1(22), 8));
                arrayList.removeIf(new s52.e(new y1(23), 9));
                break;
            }
            if (!list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        arrayList.removeIf(new s52.e(new y1(25), 11));
                        arrayList.removeIf(new s52.e(new y1(29), 16));
                        break;
                    }
                    x1 x1Var3 = (x1) it4.next();
                    x1Var3.getClass();
                    Double maxPower = x1Var3.getMaxPower();
                    if (maxPower != null && !Double.isNaN(maxPower.doubleValue())) {
                        if (!z14) {
                            arrayList.removeIf(new s52.e(new y1(21), 7));
                            break;
                        }
                        break;
                    }
                }
            } else {
                arrayList.removeIf(new s52.e(new y1(25), 11));
                arrayList.removeIf(new s52.e(new y1(29), 16));
                break;
            }
        }
        a(arrayList, list2, x0Var);
        if (z0.P(str) || z0.b(x0.R0, str)) {
            if (!list2.isEmpty()) {
                Iterator it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        arrayList.removeIf(new s52.e(new y1(26), 13));
                        break;
                    }
                    x1 x1Var4 = (x1) it5.next();
                    x1Var4.getClass();
                    Double avgTemperature = x1Var4.getAvgTemperature();
                    if (avgTemperature != null && !Double.isNaN(avgTemperature.doubleValue())) {
                        break;
                    }
                }
            } else {
                arrayList.removeIf(new s52.e(new y1(26), 13));
                break;
            }
        }
        if (!list2.isEmpty()) {
            Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                if (n.d(((x1) it6.next()).getMaxPisteDifficulty())) {
                    return arrayList;
                }
            }
        }
        arrayList.removeIf(new s52.e(new y1(20), 12));
        return arrayList;
    }
}

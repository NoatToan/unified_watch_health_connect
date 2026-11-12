package fr;

import am.x0;
import c22.l3;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import com.garmin.android.apps.connectmobile.activities.newmodel.p;
import com.garmin.android.apps.connectmobile.activities.newmodel.s;
import com.garmin.android.apps.connectmobile.activities.newmodel.t;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.repcounting.model.e;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ns.v;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.math.MathKt;
import ps.a1;
import ps.a2;
import ps.k0;
import ps.m0;
import ps.o1;
import ps.q;
import ps.q1;
import ps.r;
import ps.r0;
import ps.s0;
import ps.z1;
import qs.a0;
import qs.i;
import qs.x;
import qs.y;
import ss.l;
import to.o;
import tq.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: fr.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1477a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73283a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.D2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4352y2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.E2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.f4267a2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.f4270b2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.R0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f73283a = iArr;
        }
    }

    public static final x a(x0 x0Var) {
        switch (C1477a.f73283a[x0Var.ordinal()]) {
            case 1:
                return x.RUN_REST;
            case 2:
            case 3:
                return x.CLIMB_REST;
            case 4:
                return x.ROUND_REST;
            case 5:
            case 6:
                return x.SKI_LIFT;
            case 7:
                return x.DOWNHILL_LIFT;
            default:
                return null;
        }
    }

    public static final o1 b(h hVar) {
        x0 x0VarC;
        x xVarA;
        ArrayList arrayList;
        if (hVar == null || (x0VarC = hVar.C()) == null || (xVarA = a(x0VarC)) == null || (arrayList = hVar.f29464q) == null) {
            return null;
        }
        return l.c(arrayList, xVarA);
    }

    public static final o1 c(r rVar) {
        x0 x0VarH;
        x xVarA;
        List<o1> listT;
        if (rVar == null || (x0VarH = rVar.h()) == null || (xVarA = a(x0VarH)) == null || (listT = rVar.t()) == null) {
            return null;
        }
        return l.c(listT, xVarA);
    }

    public static final boolean d(List<o1> list, x... xVarArr) {
        Object obj;
        if (list != null && !list.isEmpty() && xVarArr.length != 0) {
            int length = xVarArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                Iterator<T> it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    o1 o1Var = (o1) next;
                    x xVar = xVarArr[i14];
                    obj = xVar != null ? xVar.f147220a : null;
                    String splitType = o1Var.getSplitType();
                    if (obj != null && splitType != null && splitType.equals(obj)) {
                        obj = next;
                        break;
                    }
                }
                if (((o1) obj) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0206  */
    /* JADX WARN: Code duplicated, block: B:115:0x021b  */
    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0235  */
    /* JADX WARN: Code duplicated, block: B:126:0x023c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0247  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0263  */
    /* JADX WARN: Code duplicated, block: B:141:0x0271  */
    /* JADX WARN: Code duplicated, block: B:148:0x0286  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:168:0x0308  */
    /* JADX WARN: Code duplicated, block: B:170:0x030c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0313  */
    /* JADX WARN: Code duplicated, block: B:174:0x0319  */
    /* JADX WARN: Code duplicated, block: B:175:0x032a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0340  */
    /* JADX WARN: Code duplicated, block: B:179:0x0347  */
    /* JADX WARN: Code duplicated, block: B:182:0x034f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0356  */
    /* JADX WARN: Code duplicated, block: B:186:0x035e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0365  */
    /* JADX WARN: Code duplicated, block: B:193:0x037a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0386  */
    /* JADX WARN: Code duplicated, block: B:198:0x038d  */
    /* JADX WARN: Code duplicated, block: B:201:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:205:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:210:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x0167  */
    /* JADX WARN: Code duplicated, block: B:80:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c9  */
    public static final q e(h hVar) {
        Double dValueOf;
        double d14;
        String str;
        v vVar;
        s sVar;
        Integer num;
        Double d15;
        Double dValueOf2;
        i0 i0Var;
        Double dValueOf3;
        Boolean bool;
        boolean zBooleanValue;
        Integer lapCount;
        int iIntValue;
        double d16;
        long jD;
        ExerciseSetsDTO exerciseSetsDTO;
        int i14;
        o1 o1VarD;
        int iIntValue2;
        o1 o1VarD2;
        double dDoubleValue;
        o1 o1VarD3;
        String strI0;
        String associatedWorkoutId;
        Long lJ;
        int iIntValue3;
        double dDoubleValue2;
        o1 o1VarD4;
        double dDoubleValue3;
        o1 o1VarD5;
        String mode;
        o1 o1VarD6;
        Double movingDuration;
        o1 o1VarD7;
        Double dValueOf4;
        Double duration;
        ArrayList arrayList;
        o1 o1VarC;
        o1 o1VarD8;
        Double maxSpeed;
        o1 o1VarD9;
        Double distance;
        o1 o1VarD10;
        Double elevationLoss;
        o1 o1VarD11;
        int iIntValue4;
        o1 o1VarD12;
        Double maxDuration;
        o1 o1VarD13;
        Double maxPackWeight;
        o1 o1VarD14;
        Double avgPackWeight;
        p pVar;
        String speedDisplayMeasure;
        Integer noOfSplits;
        Double duration2;
        double dDoubleValue4;
        Double movingDuration2;
        double dDoubleValue5;
        Double maxSpeed2;
        Double maxDistance;
        Integer noOfSplits2;
        Double duration3;
        Integer noOfSplits3;
        e[] eVarArr;
        t tVar;
        t tVar2;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.r> list;
        Object next;
        Double elevationGain;
        z1 z1Var;
        Double factor;
        z1 z1Var2;
        y yVarH;
        Integer unitId;
        hVar.getClass();
        o1 o1VarD15 = k.d(hVar);
        o1 o1VarB = b(hVar);
        long j8 = hVar.f29448a;
        String str2 = hVar.f29449b;
        int typeId = hVar.f29455h.getTypeId();
        String strJ = hVar.f29455h.j();
        a1 a1Var = hVar.f29459l;
        String displayName = (a1Var == null || a1Var.getUserInfoDto() == null) ? null : hVar.f29459l.getUserInfoDto().getDisplayName();
        i0 i0Var2 = hVar.f29460m;
        String str3 = i0Var2.f29484a;
        z1 z1Var3 = i0Var2.f29509g1;
        int iIntValue5 = (z1Var3 == null || (unitId = z1Var3.getUnitId()) == null) ? 0 : unitId.intValue();
        i0 i0Var3 = hVar.f29460m;
        String str4 = (i0Var3 == null || (z1Var2 = i0Var3.f29509g1) == null || (yVarH = z1Var2.h()) == null) ? null : yVarH.f147239a;
        i0 i0Var4 = hVar.f29460m;
        double dDoubleValue6 = (i0Var4 == null || (z1Var = i0Var4.f29509g1) == null || (factor = z1Var.getFactor()) == null) ? 0.0d : factor.doubleValue();
        i0 i0Var5 = hVar.f29460m;
        int i15 = iIntValue5;
        double d17 = i0Var5.f29516i;
        String str5 = str4;
        double d18 = i0Var5.f29538p;
        o1 o1VarD16 = k.d(hVar);
        double dDoubleValue7 = (o1VarD16 == null || (elevationGain = o1VarD16.getElevationGain()) == null) ? hVar.f29460m.f29526l : elevationGain.doubleValue();
        i0 i0Var6 = hVar.f29460m;
        double d19 = dDoubleValue7;
        double d24 = i0Var6.f29526l;
        double d25 = i0Var6.f29529m;
        double d26 = i0Var6.f29560x;
        double d27 = i0Var6.T;
        double d28 = i0Var6.f29549t;
        double d29 = i0Var6.f29554v;
        double d34 = i0Var6.f29513h1;
        ExerciseSetsDTO exerciseSetsDTO2 = hVar.f29462o;
        if (exerciseSetsDTO2 != null) {
            Iterator it = new ArrayList(Arrays.asList(exerciseSetsDTO2.f41089a)).iterator();
            double dDoubleValue8 = 0.0d;
            while (it.hasNext()) {
                Double D = ((e) it.next()).D();
                dDoubleValue8 = ((D != null ? D.doubleValue() : 0.0d) / 1000.0d) + dDoubleValue8;
            }
            dValueOf = Double.valueOf(dDoubleValue8);
        } else {
            dValueOf = Double.valueOf(i0Var6.f29519j);
        }
        double d35 = hVar.f29460m.V1;
        s sVar2 = hVar.f29461n;
        if (sVar2 != null && (list = sVar2.f29669n) != null) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    d14 = d35;
                    next = null;
                    break;
                }
                next = it3.next();
                d14 = d35;
                if (((com.garmin.android.apps.connectmobile.activities.newmodel.r) next).f29646e == 0) {
                    break;
                }
                d35 = d14;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = (com.garmin.android.apps.connectmobile.activities.newmodel.r) next;
            if (rVar != null) {
                str = displayName;
                vVar = new v(Integer.valueOf((int) rVar.f29644c), Integer.valueOf((int) rVar.f29643b));
            }
            sVar = hVar.f29461n;
            if (sVar != null || (tVar2 = sVar.f29668m) == null) {
                num = null;
            } else {
                num = tVar2.f29674e;
            }
            if (sVar != null || (tVar = sVar.f29668m) == null) {
                d15 = null;
            } else {
                d15 = tVar.f29675f;
            }
            v vVar2 = vVar;
            if (sVar != null) {
                dValueOf2 = Double.valueOf(sVar.f29667l);
            } else {
                dValueOf2 = null;
            }
            i0Var = hVar.f29460m;
            Integer num2 = num;
            if (i0Var != null) {
                dValueOf3 = Double.valueOf(i0Var.X1);
            } else {
                dValueOf3 = null;
            }
            double dA = b.a(dValueOf2, dValueOf3);
            bool = hVar.f29460m.f29494c2;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            i0 i0Var7 = hVar.f29460m;
            boolean z14 = zBooleanValue;
            double d36 = i0Var7.f29502e2;
            double d37 = i0Var7.f29498d2;
            double d38 = i0Var7.f29563y;
            lapCount = hVar.f29459l.getLapCount();
            if (lapCount != null) {
                iIntValue = lapCount.intValue();
            } else {
                iIntValue = 0;
            }
            l3.a aVar = l3.f23124b;
            double d39 = hVar.f29460m.f29565y2;
            aVar.getClass();
            d16 = ((double) 1000) * d39;
            if (Double.isNaN(d16)) {
                jD = -1;
            } else {
                jD = MathKt.d(d16);
            }
            long j14 = jD;
            i0 i0Var8 = hVar.f29460m;
            int i16 = iIntValue;
            double d44 = i0Var8.f29512h;
            double d45 = i0Var8.f29544r;
            int i17 = (int) i0Var8.R1;
            double d46 = i0Var8.T1;
            double d47 = i0Var8.f29553u2;
            int i18 = i0Var8.F2;
            exerciseSetsDTO = hVar.f29462o;
            if (exerciseSetsDTO != null || (eVarArr = exerciseSetsDTO.f41089a) == null) {
                i14 = 0;
            } else {
                i14 = 0;
                for (e eVar : eVarArr) {
                    if (eVar.e0()) {
                        i14++;
                    }
                }
            }
            o1VarD = k.d(hVar);
            if (o1VarD != null || (noOfSplits3 = o1VarD.getNoOfSplits()) == null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = noOfSplits3.intValue();
            }
            o1VarD2 = k.d(hVar);
            if (o1VarD2 != null || (duration3 = o1VarD2.getDuration()) == null) {
                dDoubleValue = 0.0d;
            } else {
                dDoubleValue = duration3.doubleValue();
            }
            o1VarD3 = k.d(hVar);
            if (o1VarD3 != null) {
                strI0 = o1VarD3.i0();
            } else {
                strI0 = null;
            }
            int i19 = iIntValue2;
            associatedWorkoutId = hVar.f29459l.getAssociatedWorkoutId();
            if (associatedWorkoutId != null) {
                lJ = d53.t.j(associatedWorkoutId);
            } else {
                lJ = null;
            }
            double d48 = dDoubleValue;
            double d49 = hVar.f29460m.B;
            if (o1VarD15 != 0 || (noOfSplits2 = o1VarD15.getNoOfSplits()) == null) {
                iIntValue3 = 0;
            } else {
                iIntValue3 = noOfSplits2.intValue();
            }
            if (o1VarD15 != 0 || (maxDistance = o1VarD15.getMaxDistance()) == null) {
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue2 = maxDistance.doubleValue();
            }
            o1VarD4 = k.d(hVar);
            if (o1VarD4 != null || (maxSpeed2 = o1VarD4.getMaxSpeed()) == null) {
                dDoubleValue3 = 0.0d;
            } else {
                dDoubleValue3 = maxSpeed2.doubleValue();
            }
            i0 i0Var9 = hVar.f29460m;
            int i24 = iIntValue3;
            double d54 = i0Var9.C2;
            double d55 = i0Var9.D2;
            double d56 = i0Var9.B2;
            int i25 = (int) i0Var9.S2;
            o1VarD5 = k.d(hVar);
            if (o1VarD5 != null) {
                mode = o1VarD5.getMode();
            } else {
                mode = null;
            }
            String str6 = hVar.f29454g;
            i0 i0Var10 = hVar.f29460m;
            String str7 = mode;
            double d57 = i0Var10.f29496d;
            double d58 = i0Var10.f29500e;
            long j15 = hVar.f29451d;
            double d59 = i0Var10.f29505f1;
            int i26 = i0Var10.W2;
            double d64 = i0Var10.X2;
            double d65 = i0Var10.f29566z;
            double d66 = i0Var10.A;
            o1VarD6 = k.d(hVar);
            if (o1VarD6 != null) {
                movingDuration = o1VarD6.getMovingDuration();
            } else {
                movingDuration = null;
            }
            o1VarD7 = k.d(hVar);
            if (o1VarD7 != null) {
                duration2 = o1VarD7.getDuration();
                if (duration2 != null) {
                    dDoubleValue4 = duration2.doubleValue();
                } else {
                    dDoubleValue4 = 0.0d;
                }
                movingDuration2 = o1VarD7.getMovingDuration();
                if (movingDuration2 != null) {
                    dDoubleValue5 = movingDuration2.doubleValue();
                } else {
                    dDoubleValue5 = 0.0d;
                }
                dValueOf4 = Double.valueOf(dDoubleValue4 - dDoubleValue5);
            } else {
                dValueOf4 = null;
            }
            if (o1VarB != 0) {
                duration = o1VarB.getDuration();
            } else {
                duration = null;
            }
            arrayList = hVar.f29464q;
            if (arrayList != null) {
                o1VarC = l.c(arrayList, k.f(hVar.C()));
            } else {
                o1VarC = null;
            }
            i0 i0Var11 = hVar.f29460m;
            int i27 = i0Var11.Y2;
            double d67 = i0Var11.Z2;
            double d68 = i0Var11.f29487a3;
            o1VarD8 = k.d(hVar);
            if (o1VarD8 != null) {
                maxSpeed = o1VarD8.getMaxSpeed();
            } else {
                maxSpeed = null;
            }
            o1VarD9 = k.d(hVar);
            if (o1VarD9 != null) {
                distance = o1VarD9.getDistance();
            } else {
                distance = null;
            }
            o1VarD10 = k.d(hVar);
            if (o1VarD10 != null) {
                elevationLoss = o1VarD10.getElevationLoss();
            } else {
                elevationLoss = null;
            }
            o1VarD11 = k.d(hVar);
            if (o1VarD11 != null || (noOfSplits = o1VarD11.getNoOfSplits()) == null) {
                iIntValue4 = 0;
            } else {
                iIntValue4 = noOfSplits.intValue();
            }
            int i28 = hVar.f29460m.f29503e3;
            o1VarD12 = k.d(hVar);
            if (o1VarD12 != null) {
                maxDuration = o1VarD12.getMaxDuration();
            } else {
                maxDuration = null;
            }
            double d69 = hVar.f29460m.f29495c3;
            o1VarD13 = k.d(hVar);
            if (o1VarD13 != null) {
                maxPackWeight = o1VarD13.getMaxPackWeight();
            } else {
                maxPackWeight = null;
            }
            o1VarD14 = k.d(hVar);
            if (o1VarD14 != null) {
                avgPackWeight = o1VarD14.getAvgPackWeight();
            } else {
                avgPackWeight = null;
            }
            double d74 = hVar.f29460m.f29501e1;
            pVar = hVar.f29466t;
            if (pVar != null) {
                speedDisplayMeasure = pVar.getSpeedDisplayMeasure();
            } else {
                speedDisplayMeasure = null;
            }
            i0 i0Var12 = hVar.f29460m;
            return new q(j8, str2, typeId, strJ, str, str3, i15, Double.valueOf(d74), str5, dDoubleValue6, d17, d18, d19, d24, d25, d26, d27, Double.valueOf(d28), Double.valueOf(d29), d34, lJ, dValueOf, d14, vVar2, num2, d15, Double.valueOf(dA), d36, Double.valueOf(d37), maxDuration, z14, d38, i16, j14, d44, d45, i17, d46, d47, i18, i14, i19, d48, strI0, d49, i24, dDoubleValue2, dDoubleValue3, "", -1, -1, -1, "", d54, d55, d56, Integer.valueOf(i25), str7, str6, d57, d58, null, null, j15, Double.valueOf(d59), null, 0L, Integer.valueOf(i26), d64, d65, d66, movingDuration, dValueOf4, duration, o1VarC, Integer.valueOf(i27), Double.valueOf(d67), Double.valueOf(d68), maxSpeed, iIntValue4, distance, elevationLoss, null, Integer.valueOf(i28), Double.valueOf(d69), maxPackWeight, avgPackWeight, pVar, speedDisplayMeasure, Double.valueOf(i0Var12.f29507f3), Double.valueOf(i0Var12.f29511g3), Double.valueOf(i0Var12.f29515h3), 0, 1610612736, 6, null);
        }
        d14 = d35;
        str = displayName;
        vVar = null;
        sVar = hVar.f29461n;
        if (sVar != null) {
            num = null;
        } else {
            num = null;
        }
        if (sVar != null) {
            d15 = null;
        } else {
            d15 = null;
        }
        v vVar3 = vVar;
        if (sVar != null) {
            dValueOf2 = Double.valueOf(sVar.f29667l);
        } else {
            dValueOf2 = null;
        }
        i0Var = hVar.f29460m;
        Integer num3 = num;
        if (i0Var != null) {
            dValueOf3 = Double.valueOf(i0Var.X1);
        } else {
            dValueOf3 = null;
        }
        double dA2 = b.a(dValueOf2, dValueOf3);
        bool = hVar.f29460m.f29494c2;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        i0 i0Var13 = hVar.f29460m;
        boolean z15 = zBooleanValue;
        double d310 = i0Var13.f29502e2;
        double d311 = i0Var13.f29498d2;
        double d312 = i0Var13.f29563y;
        lapCount = hVar.f29459l.getLapCount();
        if (lapCount != null) {
            iIntValue = lapCount.intValue();
        } else {
            iIntValue = 0;
        }
        l3.a aVar2 = l3.f23124b;
        double d313 = hVar.f29460m.f29565y2;
        aVar2.getClass();
        d16 = ((double) 1000) * d313;
        if (Double.isNaN(d16)) {
            jD = -1;
        } else {
            jD = MathKt.d(d16);
        }
        long j16 = jD;
        i0 i0Var14 = hVar.f29460m;
        int i110 = iIntValue;
        double d410 = i0Var14.f29512h;
        double d411 = i0Var14.f29544r;
        int i111 = (int) i0Var14.R1;
        double d412 = i0Var14.T1;
        double d413 = i0Var14.f29553u2;
        int i112 = i0Var14.F2;
        exerciseSetsDTO = hVar.f29462o;
        if (exerciseSetsDTO != null) {
            i14 = 0;
        } else {
            i14 = 0;
        }
        o1VarD = k.d(hVar);
        if (o1VarD != null) {
            iIntValue2 = 0;
        } else {
            iIntValue2 = 0;
        }
        o1VarD2 = k.d(hVar);
        if (o1VarD2 != null) {
            dDoubleValue = 0.0d;
        } else {
            dDoubleValue = 0.0d;
        }
        o1VarD3 = k.d(hVar);
        if (o1VarD3 != null) {
            strI0 = o1VarD3.i0();
        } else {
            strI0 = null;
        }
        int i113 = iIntValue2;
        associatedWorkoutId = hVar.f29459l.getAssociatedWorkoutId();
        if (associatedWorkoutId != null) {
            lJ = d53.t.j(associatedWorkoutId);
        } else {
            lJ = null;
        }
        double d414 = dDoubleValue;
        double d415 = hVar.f29460m.B;
        if (o1VarD15 != 0) {
            iIntValue3 = 0;
        } else {
            iIntValue3 = 0;
        }
        if (o1VarD15 != 0) {
            dDoubleValue2 = 0.0d;
        } else {
            dDoubleValue2 = 0.0d;
        }
        o1VarD4 = k.d(hVar);
        if (o1VarD4 != null) {
            dDoubleValue3 = 0.0d;
        } else {
            dDoubleValue3 = 0.0d;
        }
        i0 i0Var15 = hVar.f29460m;
        int i29 = iIntValue3;
        double d510 = i0Var15.C2;
        double d511 = i0Var15.D2;
        double d512 = i0Var15.B2;
        int i210 = (int) i0Var15.S2;
        o1VarD5 = k.d(hVar);
        if (o1VarD5 != null) {
            mode = o1VarD5.getMode();
        } else {
            mode = null;
        }
        String str8 = hVar.f29454g;
        i0 i0Var16 = hVar.f29460m;
        String str9 = mode;
        double d513 = i0Var16.f29496d;
        double d514 = i0Var16.f29500e;
        long j17 = hVar.f29451d;
        double d515 = i0Var16.f29505f1;
        int i211 = i0Var16.W2;
        double d610 = i0Var16.X2;
        double d611 = i0Var16.f29566z;
        double d612 = i0Var16.A;
        o1VarD6 = k.d(hVar);
        if (o1VarD6 != null) {
            movingDuration = o1VarD6.getMovingDuration();
        } else {
            movingDuration = null;
        }
        o1VarD7 = k.d(hVar);
        if (o1VarD7 != null) {
            duration2 = o1VarD7.getDuration();
            if (duration2 != null) {
                dDoubleValue4 = duration2.doubleValue();
            } else {
                dDoubleValue4 = 0.0d;
            }
            movingDuration2 = o1VarD7.getMovingDuration();
            if (movingDuration2 != null) {
                dDoubleValue5 = movingDuration2.doubleValue();
            } else {
                dDoubleValue5 = 0.0d;
            }
            dValueOf4 = Double.valueOf(dDoubleValue4 - dDoubleValue5);
        } else {
            dValueOf4 = null;
        }
        if (o1VarB != 0) {
            duration = o1VarB.getDuration();
        } else {
            duration = null;
        }
        arrayList = hVar.f29464q;
        if (arrayList != null) {
            o1VarC = l.c(arrayList, k.f(hVar.C()));
        } else {
            o1VarC = null;
        }
        i0 i0Var17 = hVar.f29460m;
        int i212 = i0Var17.Y2;
        double d613 = i0Var17.Z2;
        double d614 = i0Var17.f29487a3;
        o1VarD8 = k.d(hVar);
        if (o1VarD8 != null) {
            maxSpeed = o1VarD8.getMaxSpeed();
        } else {
            maxSpeed = null;
        }
        o1VarD9 = k.d(hVar);
        if (o1VarD9 != null) {
            distance = o1VarD9.getDistance();
        } else {
            distance = null;
        }
        o1VarD10 = k.d(hVar);
        if (o1VarD10 != null) {
            elevationLoss = o1VarD10.getElevationLoss();
        } else {
            elevationLoss = null;
        }
        o1VarD11 = k.d(hVar);
        if (o1VarD11 != null) {
            iIntValue4 = 0;
        } else {
            iIntValue4 = 0;
        }
        int i213 = hVar.f29460m.f29503e3;
        o1VarD12 = k.d(hVar);
        if (o1VarD12 != null) {
            maxDuration = o1VarD12.getMaxDuration();
        } else {
            maxDuration = null;
        }
        double d615 = hVar.f29460m.f29495c3;
        o1VarD13 = k.d(hVar);
        if (o1VarD13 != null) {
            maxPackWeight = o1VarD13.getMaxPackWeight();
        } else {
            maxPackWeight = null;
        }
        o1VarD14 = k.d(hVar);
        if (o1VarD14 != null) {
            avgPackWeight = o1VarD14.getAvgPackWeight();
        } else {
            avgPackWeight = null;
        }
        double d75 = hVar.f29460m.f29501e1;
        pVar = hVar.f29466t;
        if (pVar != null) {
            speedDisplayMeasure = pVar.getSpeedDisplayMeasure();
        } else {
            speedDisplayMeasure = null;
        }
        i0 i0Var18 = hVar.f29460m;
        return new q(j8, str2, typeId, strJ, str, str3, i15, Double.valueOf(d75), str5, dDoubleValue6, d17, d18, d19, d24, d25, d26, d27, Double.valueOf(d28), Double.valueOf(d29), d34, lJ, dValueOf, d14, vVar3, num3, d15, Double.valueOf(dA2), d310, Double.valueOf(d311), maxDuration, z15, d312, i110, j16, d410, d411, i111, d412, d413, i112, i14, i113, d414, strI0, d415, i29, dDoubleValue2, dDoubleValue3, "", -1, -1, -1, "", d510, d511, d512, Integer.valueOf(i210), str9, str8, d513, d514, null, null, j17, Double.valueOf(d515), null, 0L, Integer.valueOf(i211), d610, d611, d612, movingDuration, dValueOf4, duration, o1VarC, Integer.valueOf(i212), Double.valueOf(d613), Double.valueOf(d614), maxSpeed, iIntValue4, distance, elevationLoss, null, Integer.valueOf(i213), Double.valueOf(d615), maxPackWeight, avgPackWeight, pVar, speedDisplayMeasure, Double.valueOf(i0Var18.f29507f3), Double.valueOf(i0Var18.f29511g3), Double.valueOf(i0Var18.f29515h3), 0, 1610612736, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00da A[PHI: r2
      0x00da: PHI (r2v32 java.lang.Double) = (r2v18 java.lang.Double), (r2v33 java.lang.Double) binds: [B:71:0x00eb, B:65:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    public static final q f(r rVar, v vVar, s0 s0Var) {
        String strJ;
        Double elevationGain;
        double dDoubleValue;
        Double movingDuration;
        int i14;
        int i15;
        Double dValueOf;
        Integer noOfSplits;
        Double maxJumpRopeCadence;
        Double avgJumpRopeCadence;
        Double maxRunCadence;
        Double averageRunCadence;
        Double maxLapAvgRunCadence;
        Double startLongitude;
        Double startLatitude;
        Integer differenceBodyBattery;
        Double differenceStress;
        Double maxStress;
        Double averageStress;
        Double maxSpeed;
        Double maxDistance;
        Integer noOfSplits2;
        Double averageBikeCadence;
        String associatedWorkoutId;
        Double duration;
        Integer noOfSplits3;
        List<r0> listD;
        int i16;
        Integer activeSets;
        Double averageRespirationRate;
        Double averageVerticalSpeed;
        Double floorsClimbed;
        Double maxSpeed2;
        Double distance;
        Double minActivityLapDuration;
        Integer lapCount;
        Double maxHR;
        Double bottomTime;
        m0 diveSettingsDTO;
        m0 diveSettingsDTO2;
        a0 a0VarM;
        Double maxDepth;
        List<r0> listD2;
        Double totalNumberOfStrokes;
        Double averagePower;
        Double averageHR;
        Double elevationLoss;
        Double elevationGain2;
        Double averageSpeed;
        Double duration2;
        z1 unitOfPoolLength;
        Double factor;
        z1 unitOfPoolLength2;
        z1 unitOfPoolLength3;
        Integer unitId;
        a2 userInfoDto;
        rVar.getClass();
        o1 o1VarE = k.e(rVar);
        o1 o1VarC = c(rVar);
        Long activityId = rVar.getActivityId();
        long jLongValue = activityId != null ? activityId.longValue() : -1L;
        String activityName = rVar.getActivityName();
        o typeDTO = rVar.getTypeDTO();
        int typeId = typeDTO != null ? typeDTO.getTypeId() : -1;
        o typeDTO2 = rVar.getTypeDTO();
        if (typeDTO2 == null || (strJ = typeDTO2.j()) == null) {
            strJ = x0.f4346x.f4358a;
        }
        String str = strJ;
        a1 metadataDTO = rVar.getMetadataDTO();
        String displayName = (metadataDTO == null || (userInfoDto = metadataDTO.getUserInfoDto()) == null) ? null : userInfoDto.getDisplayName();
        q1 summaryDTO = rVar.getSummaryDTO();
        String startTimeLocal = summaryDTO != null ? summaryDTO.getStartTimeLocal() : null;
        q1 summaryDTO2 = rVar.getSummaryDTO();
        int iIntValue = (summaryDTO2 == null || (unitOfPoolLength3 = summaryDTO2.getUnitOfPoolLength()) == null || (unitId = unitOfPoolLength3.getUnitId()) == null) ? 0 : unitId.intValue();
        q1 summaryDTO3 = rVar.getSummaryDTO();
        String unitKey = (summaryDTO3 == null || (unitOfPoolLength2 = summaryDTO3.getUnitOfPoolLength()) == null) ? null : unitOfPoolLength2.getUnitKey();
        q1 summaryDTO4 = rVar.getSummaryDTO();
        double dDoubleValue2 = 0.0d;
        double dDoubleValue3 = (summaryDTO4 == null || (unitOfPoolLength = summaryDTO4.getUnitOfPoolLength()) == null || (factor = unitOfPoolLength.getFactor()) == null) ? 0.0d : factor.doubleValue();
        q1 summaryDTO5 = rVar.getSummaryDTO();
        double dDoubleValue4 = (summaryDTO5 == null || (duration2 = summaryDTO5.getDuration()) == null) ? 0.0d : duration2.doubleValue();
        q1 summaryDTO6 = rVar.getSummaryDTO();
        double dDoubleValue5 = (summaryDTO6 == null || (averageSpeed = summaryDTO6.getAverageSpeed()) == null) ? 0.0d : averageSpeed.doubleValue();
        o1 o1VarE2 = k.e(rVar);
        if (o1VarE2 == null || (elevationGain = o1VarE2.getElevationGain()) == null) {
            q1 summaryDTO7 = rVar.getSummaryDTO();
            elevationGain = summaryDTO7 != null ? summaryDTO7.getElevationGain() : null;
            if (elevationGain != null) {
                dDoubleValue = elevationGain.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
        } else {
            dDoubleValue = elevationGain.doubleValue();
        }
        q1 summaryDTO8 = rVar.getSummaryDTO();
        double dDoubleValue6 = (summaryDTO8 == null || (elevationGain2 = summaryDTO8.getElevationGain()) == null) ? 0.0d : elevationGain2.doubleValue();
        q1 summaryDTO9 = rVar.getSummaryDTO();
        double dDoubleValue7 = (summaryDTO9 == null || (elevationLoss = summaryDTO9.getElevationLoss()) == null) ? 0.0d : elevationLoss.doubleValue();
        q1 summaryDTO10 = rVar.getSummaryDTO();
        double dDoubleValue8 = (summaryDTO10 == null || (averageHR = summaryDTO10.getAverageHR()) == null) ? 0.0d : averageHR.doubleValue();
        q1 summaryDTO11 = rVar.getSummaryDTO();
        double dDoubleValue9 = Double.NaN;
        double dDoubleValue10 = (summaryDTO11 == null || (averagePower = summaryDTO11.getAveragePower()) == null) ? Double.NaN : averagePower.doubleValue();
        q1 summaryDTO12 = rVar.getSummaryDTO();
        Double calories = summaryDTO12 != null ? summaryDTO12.getCalories() : null;
        q1 summaryDTO13 = rVar.getSummaryDTO();
        Double packWeightCalories = summaryDTO13 != null ? summaryDTO13.getPackWeightCalories() : null;
        q1 summaryDTO14 = rVar.getSummaryDTO();
        double dDoubleValue11 = (summaryDTO14 == null || (totalNumberOfStrokes = summaryDTO14.getTotalNumberOfStrokes()) == null) ? 0.0d : totalNumberOfStrokes.doubleValue();
        if (s0Var == null || (listD2 = s0Var.d()) == null) {
            q1 summaryDTO15 = rVar.getSummaryDTO();
            movingDuration = summaryDTO15 != null ? summaryDTO15.getMovingDuration() : null;
        } else {
            Iterator<T> it = listD2.iterator();
            double dDoubleValue12 = 0.0d;
            while (it.hasNext()) {
                Double duration3 = ((r0) it.next()).getDuration();
                dDoubleValue12 += duration3 != null ? duration3.doubleValue() : 0.0d;
            }
            movingDuration = Double.valueOf(dDoubleValue12);
        }
        q1 summaryDTO16 = rVar.getSummaryDTO();
        if (summaryDTO16 != null && (maxDepth = summaryDTO16.getMaxDepth()) != null) {
            dDoubleValue9 = maxDepth.doubleValue();
        }
        double d14 = dDoubleValue9;
        k0 diveInfoDTO = rVar.getDiveInfoDTO();
        int i17 = (diveInfoDTO == null || (diveSettingsDTO2 = diveInfoDTO.getDiveSettingsDTO()) == null || (a0VarM = diveSettingsDTO2.m()) == null) ? 0 : a0VarM.f146995a;
        k0 diveInfoDTO2 = rVar.getDiveInfoDTO();
        Double dK = (diveInfoDTO2 == null || (diveSettingsDTO = diveInfoDTO2.getDiveSettingsDTO()) == null) ? null : diveSettingsDTO.getWaterDensity();
        k0 diveInfoDTO3 = rVar.getDiveInfoDTO();
        Double totalSurfaceTime = diveInfoDTO3 != null ? diveInfoDTO3.getTotalSurfaceTime() : null;
        q1 summaryDTO17 = rVar.getSummaryDTO();
        double dA = b.a(totalSurfaceTime, summaryDTO17 != null ? summaryDTO17.getSurfaceInterval() : null);
        q1 summaryDTO18 = rVar.getSummaryDTO();
        boolean zG = summaryDTO18 != null ? p005kotlin.jvm.internal.s.g(summaryDTO18.getIsDecoDive(), Boolean.TRUE) : false;
        q1 summaryDTO19 = rVar.getSummaryDTO();
        double dDoubleValue13 = (summaryDTO19 == null || (bottomTime = summaryDTO19.getBottomTime()) == null) ? 0.0d : bottomTime.doubleValue();
        q1 summaryDTO20 = rVar.getSummaryDTO();
        Double maxBottomTime = summaryDTO20 != null ? summaryDTO20.getMaxBottomTime() : null;
        q1 summaryDTO21 = rVar.getSummaryDTO();
        double dDoubleValue14 = (summaryDTO21 == null || (maxHR = summaryDTO21.getMaxHR()) == null) ? 0.0d : maxHR.doubleValue();
        a1 metadataDTO2 = rVar.getMetadataDTO();
        int iIntValue2 = (metadataDTO2 == null || (lapCount = metadataDTO2.getLapCount()) == null) ? 0 : lapCount.intValue();
        l3.a aVar = l3.f23124b;
        q1 summaryDTO22 = rVar.getSummaryDTO();
        double dDoubleValue15 = (summaryDTO22 == null || (minActivityLapDuration = summaryDTO22.getMinActivityLapDuration()) == null) ? 0.0d : minActivityLapDuration.doubleValue();
        aVar.getClass();
        double d15 = dDoubleValue15 * ((double) 1000);
        long jD = Double.isNaN(d15) ? -1L : MathKt.d(d15);
        q1 summaryDTO23 = rVar.getSummaryDTO();
        double dDoubleValue16 = (summaryDTO23 == null || (distance = summaryDTO23.getDistance()) == null) ? 0.0d : distance.doubleValue();
        q1 summaryDTO24 = rVar.getSummaryDTO();
        double dDoubleValue17 = (summaryDTO24 == null || (maxSpeed2 = summaryDTO24.getMaxSpeed()) == null) ? 0.0d : maxSpeed2.doubleValue();
        q1 summaryDTO25 = rVar.getSummaryDTO();
        int iDoubleValue = (int) ((summaryDTO25 == null || (floorsClimbed = summaryDTO25.getFloorsClimbed()) == null) ? 0.0d : floorsClimbed.doubleValue());
        q1 summaryDTO26 = rVar.getSummaryDTO();
        double dDoubleValue18 = (summaryDTO26 == null || (averageVerticalSpeed = summaryDTO26.getAverageVerticalSpeed()) == null) ? 0.0d : averageVerticalSpeed.doubleValue();
        q1 summaryDTO27 = rVar.getSummaryDTO();
        double dDoubleValue19 = (summaryDTO27 == null || (averageRespirationRate = summaryDTO27.getAverageRespirationRate()) == null) ? 0.0d : averageRespirationRate.doubleValue();
        q1 summaryDTO28 = rVar.getSummaryDTO();
        int iIntValue3 = (summaryDTO28 == null || (activeSets = summaryDTO28.getActiveSets()) == null) ? 0 : activeSets.intValue();
        if (s0Var == null || (listD = s0Var.d()) == null) {
            i14 = iDoubleValue;
            i15 = 0;
        } else {
            if (listD.isEmpty()) {
                i16 = 0;
            } else {
                Iterator it3 = listD.iterator();
                i16 = 0;
                while (it3.hasNext()) {
                    int i18 = iDoubleValue;
                    Iterator it4 = it3;
                    if (((r0) it3.next()).j() == i.ACTIVE && (i16 = i16 + 1) < 0) {
                        p13.x.p();
                        throw null;
                    }
                    it3 = it4;
                    iDoubleValue = i18;
                }
            }
            i14 = iDoubleValue;
            i15 = i16;
        }
        o1 o1VarE3 = k.e(rVar);
        int iIntValue4 = (o1VarE3 == null || (noOfSplits3 = o1VarE3.getNoOfSplits()) == null) ? 0 : noOfSplits3.intValue();
        o1 o1VarE4 = k.e(rVar);
        double dDoubleValue20 = (o1VarE4 == null || (duration = o1VarE4.getDuration()) == null) ? 0.0d : duration.doubleValue();
        o1 o1VarE5 = k.e(rVar);
        String strI0 = o1VarE5 != null ? o1VarE5.i0() : null;
        a1 metadataDTO3 = rVar.getMetadataDTO();
        Long lJ = (metadataDTO3 == null || (associatedWorkoutId = metadataDTO3.getAssociatedWorkoutId()) == null) ? null : d53.t.j(associatedWorkoutId);
        q1 summaryDTO29 = rVar.getSummaryDTO();
        double dDoubleValue21 = (summaryDTO29 == null || (averageBikeCadence = summaryDTO29.getAverageBikeCadence()) == null) ? 0.0d : averageBikeCadence.doubleValue();
        int iIntValue5 = (o1VarE == 0 || (noOfSplits2 = o1VarE.getNoOfSplits()) == null) ? 0 : noOfSplits2.intValue();
        double dDoubleValue22 = (o1VarE == 0 || (maxDistance = o1VarE.getMaxDistance()) == null) ? 0.0d : maxDistance.doubleValue();
        o1 o1VarE6 = k.e(rVar);
        double dDoubleValue23 = (o1VarE6 == null || (maxSpeed = o1VarE6.getMaxSpeed()) == null) ? 0.0d : maxSpeed.doubleValue();
        q1 summaryDTO30 = rVar.getSummaryDTO();
        double dDoubleValue24 = (summaryDTO30 == null || (averageStress = summaryDTO30.getAverageStress()) == null) ? 0.0d : averageStress.doubleValue();
        q1 summaryDTO31 = rVar.getSummaryDTO();
        double dDoubleValue25 = (summaryDTO31 == null || (maxStress = summaryDTO31.getMaxStress()) == null) ? 0.0d : maxStress.doubleValue();
        q1 summaryDTO32 = rVar.getSummaryDTO();
        double dDoubleValue26 = (summaryDTO32 == null || (differenceStress = summaryDTO32.getDifferenceStress()) == null) ? 0.0d : differenceStress.doubleValue();
        q1 summaryDTO33 = rVar.getSummaryDTO();
        int iIntValue6 = (summaryDTO33 == null || (differenceBodyBattery = summaryDTO33.getDifferenceBodyBattery()) == null) ? 0 : differenceBodyBattery.intValue();
        o1 o1VarE7 = k.e(rVar);
        String mode = o1VarE7 != null ? o1VarE7.getMode() : null;
        String locationName = rVar.getLocationName();
        q1 summaryDTO34 = rVar.getSummaryDTO();
        double dDoubleValue27 = (summaryDTO34 == null || (startLatitude = summaryDTO34.getStartLatitude()) == null) ? 0.0d : startLatitude.doubleValue();
        q1 summaryDTO35 = rVar.getSummaryDTO();
        double dDoubleValue28 = (summaryDTO35 == null || (startLongitude = summaryDTO35.getStartLongitude()) == null) ? 0.0d : startLongitude.doubleValue();
        Long userProfileId = rVar.getUserProfileId();
        long jLongValue2 = userProfileId != null ? userProfileId.longValue() : 0L;
        q1 summaryDTO36 = rVar.getSummaryDTO();
        Double numberOfActiveLengths = summaryDTO36 != null ? summaryDTO36.getNumberOfActiveLengths() : null;
        q1 summaryDTO37 = rVar.getSummaryDTO();
        Integer steps = summaryDTO37 != null ? summaryDTO37.getSteps() : null;
        q1 summaryDTO38 = rVar.getSummaryDTO();
        double dDoubleValue29 = (summaryDTO38 == null || (maxLapAvgRunCadence = summaryDTO38.getMaxLapAvgRunCadence()) == null) ? 0.0d : maxLapAvgRunCadence.doubleValue();
        q1 summaryDTO39 = rVar.getSummaryDTO();
        double dDoubleValue30 = (summaryDTO39 == null || (averageRunCadence = summaryDTO39.getAverageRunCadence()) == null) ? 0.0d : averageRunCadence.doubleValue();
        q1 summaryDTO40 = rVar.getSummaryDTO();
        double dDoubleValue31 = (summaryDTO40 == null || (maxRunCadence = summaryDTO40.getMaxRunCadence()) == null) ? 0.0d : maxRunCadence.doubleValue();
        o1 o1VarE8 = k.e(rVar);
        Double movingDuration2 = o1VarE8 != null ? o1VarE8.getMovingDuration() : null;
        o1 o1VarE9 = k.e(rVar);
        if (o1VarE9 != null) {
            Double duration4 = o1VarE9.getDuration();
            double dDoubleValue32 = duration4 != null ? duration4.doubleValue() : 0.0d;
            Double movingDuration3 = o1VarE9.getMovingDuration();
            dValueOf = Double.valueOf(dDoubleValue32 - (movingDuration3 != null ? movingDuration3.doubleValue() : 0.0d));
        } else {
            dValueOf = null;
        }
        Double duration5 = o1VarC != null ? o1VarC.getDuration() : null;
        List<o1> listT = rVar.t();
        o1 o1VarC2 = listT != null ? l.c(listT, k.f(rVar.h())) : null;
        q1 summaryDTO41 = rVar.getSummaryDTO();
        Integer totalReps = summaryDTO41 != null ? summaryDTO41.getTotalReps() : null;
        q1 summaryDTO42 = rVar.getSummaryDTO();
        double dDoubleValue33 = (summaryDTO42 == null || (avgJumpRopeCadence = summaryDTO42.getAvgJumpRopeCadence()) == null) ? 0.0d : avgJumpRopeCadence.doubleValue();
        q1 summaryDTO43 = rVar.getSummaryDTO();
        if (summaryDTO43 != null && (maxJumpRopeCadence = summaryDTO43.getMaxJumpRopeCadence()) != null) {
            dDoubleValue2 = maxJumpRopeCadence.doubleValue();
        }
        o1 o1VarE10 = k.e(rVar);
        Double maxSpeed3 = o1VarE10 != null ? o1VarE10.getMaxSpeed() : null;
        o1 o1VarE11 = k.e(rVar);
        Double distance2 = o1VarE11 != null ? o1VarE11.getDistance() : null;
        o1 o1VarE12 = k.e(rVar);
        Double elevationLoss2 = o1VarE12 != null ? o1VarE12.getElevationLoss() : null;
        o1 o1VarE13 = k.e(rVar);
        int iIntValue7 = (o1VarE13 == null || (noOfSplits = o1VarE13.getNoOfSplits()) == null) ? 0 : noOfSplits.intValue();
        q1 summaryDTO44 = rVar.getSummaryDTO();
        Integer diveCount = summaryDTO44 != null ? summaryDTO44.getDiveCount() : null;
        o1 o1VarE14 = k.e(rVar);
        Double maxDuration = o1VarE14 != null ? o1VarE14.getMaxDuration() : null;
        q1 summaryDTO45 = rVar.getSummaryDTO();
        Double packWeight = summaryDTO45 != null ? summaryDTO45.getPackWeight() : null;
        o1 o1VarE15 = k.e(rVar);
        Double maxPackWeight = o1VarE15 != null ? o1VarE15.getMaxPackWeight() : null;
        o1 o1VarE16 = k.e(rVar);
        Double avgPackWeight = o1VarE16 != null ? o1VarE16.getAvgPackWeight() : null;
        q1 summaryDTO46 = rVar.getSummaryDTO();
        Double poolLength = summaryDTO46 != null ? summaryDTO46.getPoolLength() : null;
        p deviceDisplayUnitsDTO = rVar.getDeviceDisplayUnitsDTO();
        p deviceDisplayUnitsDTO2 = rVar.getDeviceDisplayUnitsDTO();
        String speedDisplayMeasure = deviceDisplayUnitsDTO2 != null ? deviceDisplayUnitsDTO2.getSpeedDisplayMeasure() : null;
        q1 summaryDTO47 = rVar.getSummaryDTO();
        Double averageSpO2 = summaryDTO47 != null ? summaryDTO47.getAverageSpO2() : null;
        q1 summaryDTO48 = rVar.getSummaryDTO();
        Double maxSpO2 = summaryDTO48 != null ? summaryDTO48.getMaxSpO2() : null;
        q1 summaryDTO49 = rVar.getSummaryDTO();
        return new q(jLongValue, activityName, typeId, str, displayName, startTimeLocal, iIntValue, poolLength, unitKey, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue, dDoubleValue6, dDoubleValue7, dDoubleValue8, dDoubleValue10, calories, packWeightCalories, dDoubleValue11, lJ, movingDuration, d14, vVar, Integer.valueOf(i17), dK, Double.valueOf(dA), dDoubleValue13, maxBottomTime, maxDuration, zG, dDoubleValue14, iIntValue2, jD, dDoubleValue16, dDoubleValue17, i14, dDoubleValue18, dDoubleValue19, iIntValue3, i15, iIntValue4, dDoubleValue20, strI0, dDoubleValue21, iIntValue5, dDoubleValue22, dDoubleValue23, "", -1, -1, -1, "", dDoubleValue24, dDoubleValue25, dDoubleValue26, Integer.valueOf(iIntValue6), mode, locationName, dDoubleValue27, dDoubleValue28, null, null, jLongValue2, numberOfActiveLengths, null, 0L, steps, dDoubleValue29, dDoubleValue30, dDoubleValue31, movingDuration2, dValueOf, duration5, o1VarC2, totalReps, Double.valueOf(dDoubleValue33), Double.valueOf(dDoubleValue2), maxSpeed3, iIntValue7, distance2, elevationLoss2, null, diveCount, packWeight, maxPackWeight, avgPackWeight, deviceDisplayUnitsDTO, speedDisplayMeasure, averageSpO2, maxSpO2, summaryDTO49 != null ? summaryDTO49.getMinSpO2() : null, 0, 1610612736, 6, null);
    }

    public static final h g(r rVar, s0 s0Var) throws JSONException {
        rVar.getClass();
        h hVar = new h();
        hVar.k(new JSONObject(GsonUtil.a(rVar)));
        if (s0Var != null) {
            ExerciseSetsDTO exerciseSetsDTO = new ExerciseSetsDTO();
            exerciseSetsDTO.k(new JSONObject(GsonUtil.a(s0Var)));
            hVar.f29462o = exerciseSetsDTO;
        }
        return hVar;
    }
}

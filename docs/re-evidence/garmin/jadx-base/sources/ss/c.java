package ss;

import am.x0;
import am.y0;
import am.z0;
import c22.l3;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.r;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.util.ArrayList;
import java.util.Iterator;
import ns.v;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p13.h0;
import ps.o1;
import ps.q;
import ps.u0;
import ps.z1;
import qs.x;
import qs.y;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160595a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4352y2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f160595a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:121:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x0237  */
    /* JADX WARN: Code duplicated, block: B:134:0x0250 A[PHI: r1
      0x0250: PHI (r1v94 java.lang.String) = (r1v47 java.lang.String), (r1v97 java.lang.String) binds: [B:139:0x025c, B:132:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x0252  */
    /* JADX WARN: Code duplicated, block: B:137:0x0256  */
    /* JADX WARN: Code duplicated, block: B:138:0x025b  */
    /* JADX WARN: Code duplicated, block: B:147:0x027a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0298  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02da  */
    /* JADX WARN: Code duplicated, block: B:176:0x0301 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303  */
    /* JADX WARN: Code duplicated, block: B:179:0x0307  */
    /* JADX WARN: Code duplicated, block: B:180:0x0310  */
    /* JADX WARN: Code duplicated, block: B:181:0x0313  */
    /* JADX WARN: Code duplicated, block: B:182:0x0316  */
    /* JADX WARN: Code duplicated, block: B:185:0x0346 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0348  */
    /* JADX WARN: Code duplicated, block: B:187:0x034c A[PHI: r1
      0x034c: PHI (r1v82 java.lang.Double) = (r1v81 java.lang.Double), (r1v85 java.lang.Double) binds: [B:184:0x0344, B:186:0x0348] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x034f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0353  */
    /* JADX WARN: Code duplicated, block: B:191:0x035a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b0  */
    public static final q a(ActivityListItemDTO activityListItemDTO) {
        o1 o1VarC;
        o1 o1VarC2;
        o1 o1Var;
        o1 o1Var2;
        String str;
        double d14;
        Double elevationGain;
        double dDoubleValue;
        ArrayList arrayList;
        double d15;
        bb2.d dVar;
        v vVar;
        bb2.d dVar2;
        Integer num;
        Double d16;
        Double dValueOf;
        double dDoubleValue2;
        int iIntValue;
        double dDoubleValue3;
        ArrayList arrayList2;
        u0 u0Var;
        String valueKey;
        String str2;
        ArrayList arrayList3;
        int iIntValue2;
        ArrayList arrayList4;
        double dDoubleValue4;
        ArrayList arrayList5;
        double dDoubleValue5;
        ArrayList arrayList6;
        String mode;
        o1 o1Var3;
        Double maxPackWeight;
        Double d17;
        Double avgPackWeight;
        ArrayList arrayList7;
        o1 o1Var4;
        o1 o1Var5;
        Double maxSpeed;
        o1 o1Var6;
        Double maxDistance;
        o1 o1Var7;
        Integer noOfSplits;
        o1 o1Var8;
        Double duration;
        Integer noOfSplits2;
        Double maxDuration;
        ArrayList arrayList8;
        Object next;
        Iterator it;
        Double duration2;
        double dDoubleValue6;
        Double factor;
        y yVarH;
        Integer unitId;
        Object next2;
        Object next3;
        Double dValueOf2 = Double.valueOf(Double.NaN);
        activityListItemDTO.getClass();
        ArrayList arrayList9 = activityListItemDTO.E1;
        if (arrayList9 != null) {
            y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
            x0 x0Var = activityListItemDTO.f29265g;
            x0Var.getClass();
            o1VarC = l.c(arrayList9, y0Var.h(x0Var));
        } else {
            o1VarC = null;
        }
        ArrayList arrayList10 = activityListItemDTO.E1;
        if (arrayList10 == null || (o1VarC2 = l.c(arrayList10, x.CLIMB_ACTIVE)) == null) {
            ArrayList arrayList11 = activityListItemDTO.E1;
            o1VarC2 = arrayList11 != null ? (o1) h0.d0(arrayList11) : null;
        }
        ArrayList arrayList12 = activityListItemDTO.E1;
        if (arrayList12 != null) {
            Iterator it3 = arrayList12.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!s.g(((o1) next3).getMode(), to.i.SIMPLE.f165805a));
            o1Var = (o1) next3;
        } else {
            o1Var = null;
        }
        ArrayList arrayList13 = activityListItemDTO.E1;
        if (arrayList13 != null) {
            Iterator it4 = arrayList13.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!s.g(((o1) next2).getSplitType(), x.DIVE_SECTION.f147220a));
            o1Var2 = (o1) next2;
        } else {
            o1Var2 = null;
        }
        o1 o1Var9 = o1Var;
        long j8 = activityListItemDTO.f29250b;
        o1 o1Var10 = o1Var2;
        String str3 = activityListItemDTO.f29253c;
        int iN = z0.n(activityListItemDTO.f29265g);
        String str4 = activityListItemDTO.f29265g.f4358a;
        String str5 = activityListItemDTO.B;
        String str6 = activityListItemDTO.f29259e;
        z1 z1Var = activityListItemDTO.f29254c1;
        int iIntValue3 = (z1Var == null || (unitId = z1Var.getUnitId()) == null) ? 0 : unitId.intValue();
        z1 z1Var2 = activityListItemDTO.f29254c1;
        if (z1Var2 == null || (yVarH = z1Var2.h()) == null || (str = yVarH.f147239a) == null) {
            str = "";
        }
        z1 z1Var3 = activityListItemDTO.f29254c1;
        double dDoubleValue7 = (z1Var3 == null || (factor = z1Var3.getFactor()) == null) ? 0.0d : factor.doubleValue();
        o1 o1Var11 = o1VarC;
        double d18 = activityListItemDTO.f29275k;
        double d19 = activityListItemDTO.f29284o;
        double d24 = activityListItemDTO.J1;
        x0 x0Var2 = activityListItemDTO.f29265g;
        int i14 = x0Var2 == null ? -1 : a.f160595a[x0Var2.ordinal()];
        if (i14 == 1 || i14 == 2) {
            if (o1VarC2 == null || (elevationGain = o1VarC2.getElevationGain()) == null) {
                d14 = 0.0d;
            } else {
                dDoubleValue = elevationGain.doubleValue();
            }
            double d25 = activityListItemDTO.f29282n;
            double d26 = activityListItemDTO.X;
            double d27 = activityListItemDTO.f29276k0;
            double d28 = activityListItemDTO.T;
            double d29 = activityListItemDTO.f29294t1;
            long j14 = activityListItemDTO.f29292s1;
            arrayList = activityListItemDTO.M1;
            if (arrayList != null) {
                it = arrayList.iterator();
                d15 = 0.0d;
                while (it.hasNext()) {
                    duration2 = ((com.garmin.android.apps.connectmobile.repcounting.model.g) it.next()).getDuration();
                    if (duration2 != null) {
                        dDoubleValue6 = duration2.doubleValue();
                    } else {
                        dDoubleValue6 = 0.0d;
                    }
                    d15 = (dDoubleValue6 / 1000.0d) + d15;
                }
            } else {
                d15 = activityListItemDTO.f29303y1;
            }
            l3.a aVar = l3.f23124b;
            float f14 = (float) activityListItemDTO.f29272i1;
            aVar.getClass();
            double dB = l3.a.b(f14);
            dVar = activityListItemDTO.f29277k1;
            if (dVar != null || (arrayList8 = dVar.f17347o) == null) {
                vVar = null;
            } else {
                Iterator it5 = arrayList8.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                    Iterator it6 = it5;
                    if (((r) next).f29646e == 0) {
                        break;
                    }
                    it5 = it6;
                }
                r rVar = (r) next;
                if (rVar != null) {
                    vVar = new v(Integer.valueOf((int) rVar.f29644c), Integer.valueOf((int) rVar.f29643b));
                } else {
                    vVar = null;
                }
            }
            dVar2 = activityListItemDTO.f29277k1;
            if (dVar2 != null) {
                num = dVar2.f17345m;
            } else {
                num = null;
            }
            if (dVar2 != null) {
                d16 = dVar2.f17346n;
            } else {
                d16 = null;
            }
            v vVar2 = vVar;
            if (dVar2 != null) {
                dValueOf = Double.valueOf(dVar2.f17344l);
            } else {
                dValueOf = null;
            }
            double d34 = activityListItemDTO.f29279l1;
            double d35 = activityListItemDTO.f29281m1;
            if (o1Var10 != null || (maxDuration = o1Var10.getMaxDuration()) == null) {
                dDoubleValue2 = activityListItemDTO.f29258d2;
            } else {
                dDoubleValue2 = maxDuration.doubleValue();
            }
            boolean z14 = activityListItemDTO.f29274j1;
            double d36 = dDoubleValue2;
            double d37 = activityListItemDTO.Y;
            int i15 = activityListItemDTO.f29285o1;
            long j15 = activityListItemDTO.f29295u1;
            double d38 = activityListItemDTO.f29273j;
            double d39 = activityListItemDTO.f29286p;
            int i16 = activityListItemDTO.f29287p1;
            double d44 = activityListItemDTO.f29289q1;
            double d45 = activityListItemDTO.f29297v1;
            int i17 = activityListItemDTO.f29301x1;
            if (o1VarC2 != 0 || (noOfSplits2 = o1VarC2.getNoOfSplits()) == null) {
                iIntValue = (int) activityListItemDTO.C1;
            } else {
                iIntValue = noOfSplits2.intValue();
            }
            if (o1VarC2 != 0 || (duration = o1VarC2.getDuration()) == null) {
                dDoubleValue3 = activityListItemDTO.H1;
            } else {
                dDoubleValue3 = duration.doubleValue();
            }
            arrayList2 = activityListItemDTO.E1;
            if (arrayList2 != null || (o1Var8 = (o1) h0.d0(arrayList2)) == null || (valueKey = o1Var8.i0()) == null) {
                u0Var = activityListItemDTO.D1;
                if (u0Var != null) {
                    valueKey = u0Var.getValueKey();
                } else {
                    valueKey = null;
                }
                str2 = valueKey != null ? valueKey : "";
            }
            double d46 = activityListItemDTO.J0;
            arrayList3 = activityListItemDTO.E1;
            if (arrayList3 != null || (o1Var7 = (o1) h0.d0(arrayList3)) == null || (noOfSplits = o1Var7.getNoOfSplits()) == null) {
                iIntValue2 = (int) activityListItemDTO.C1;
            } else {
                iIntValue2 = noOfSplits.intValue();
            }
            arrayList4 = activityListItemDTO.E1;
            if (arrayList4 != null || (o1Var6 = (o1) h0.d0(arrayList4)) == null || (maxDistance = o1Var6.getMaxDistance()) == null) {
                dDoubleValue4 = activityListItemDTO.F1;
            } else {
                dDoubleValue4 = maxDistance.doubleValue();
            }
            arrayList5 = activityListItemDTO.E1;
            if (arrayList5 != null || (o1Var5 = (o1) h0.d0(arrayList5)) == null || (maxSpeed = o1Var5.getMaxSpeed()) == null) {
                dDoubleValue5 = activityListItemDTO.G1;
            } else {
                dDoubleValue5 = maxSpeed.doubleValue();
            }
            double d47 = dDoubleValue5;
            double d48 = activityListItemDTO.Z;
            double d49 = activityListItemDTO.A1;
            int i18 = activityListItemDTO.B1;
            arrayList6 = activityListItemDTO.E1;
            if (arrayList6 != null || (o1Var4 = (o1) h0.d0(arrayList6)) == null || (mode = o1Var4.getMode()) == null) {
                mode = activityListItemDTO.I1;
            }
            String str7 = mode;
            String str8 = activityListItemDTO.Z1;
            double d54 = activityListItemDTO.f29288q;
            double d55 = activityListItemDTO.f29290r;
            long j16 = activityListItemDTO.A;
            double d56 = activityListItemDTO.N0;
            String str9 = activityListItemDTO.L1;
            long j17 = activityListItemDTO.K1;
            int i19 = activityListItemDTO.O0;
            if (o1Var11 == null) {
                o1Var3 = o1Var11;
            } else if (o1Var9 == null) {
                arrayList7 = activityListItemDTO.E1;
                if (arrayList7 != null) {
                    o1Var3 = (o1) h0.d0(arrayList7);
                } else {
                    o1Var3 = null;
                }
            } else {
                o1Var3 = o1Var9;
            }
            Integer num2 = activityListItemDTO.P1;
            double d57 = activityListItemDTO.Q1;
            double d58 = activityListItemDTO.R1;
            double d59 = activityListItemDTO.G1;
            double d64 = activityListItemDTO.S1;
            double d65 = activityListItemDTO.T1;
            int i24 = (int) activityListItemDTO.C1;
            double d66 = activityListItemDTO.f29252b2;
            int i25 = activityListItemDTO.f29255c2;
            double d67 = activityListItemDTO.U1;
            maxPackWeight = activityListItemDTO.V1;
            if (maxPackWeight != null) {
                d17 = maxPackWeight;
            } else if (o1Var11 != null) {
                maxPackWeight = o1Var11.getMaxPackWeight();
                d17 = maxPackWeight;
            } else {
                d17 = null;
            }
            if (o1Var11 != null) {
                avgPackWeight = o1Var11.getAvgPackWeight();
            } else {
                avgPackWeight = null;
            }
            return new q(j8, str3, iN, str4, str5, str6, iIntValue3, Double.valueOf(activityListItemDTO.f29251b1), str, dDoubleValue7, d18, d19, d24, d14, d25, d26, d27, Double.valueOf(d28), null, d29, Long.valueOf(j14), Double.valueOf(d15), dB, vVar2, num, d16, dValueOf, d34, Double.valueOf(d35), Double.valueOf(d36), z14, d37, i15, j15, d38, d39, i16, d44, d45, i17, i17, iIntValue, dDoubleValue3, str2, d46, iIntValue2, dDoubleValue4, d47, "", 0, 0, 0, "", d48, 0.0d, d49, Integer.valueOf(i18), str7, str8, d54, d55, null, null, j16, Double.valueOf(d56), str9, j17, Integer.valueOf(i19), Double.NaN, Double.NaN, Double.NaN, null, null, null, o1Var3, num2, Double.valueOf(d57), Double.valueOf(d58), Double.valueOf(d59), i24, Double.valueOf(d64), Double.valueOf(d65), Double.valueOf(d66), Integer.valueOf(i25), Double.valueOf(d67), d17, avgPackWeight, null, activityListItemDTO.f29261e2, dValueOf2, dValueOf2, dValueOf2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 1610612736, 896, null);
        }
        dDoubleValue = activityListItemDTO.f29280m;
        d14 = dDoubleValue;
        double d210 = activityListItemDTO.f29282n;
        double d211 = activityListItemDTO.X;
        double d212 = activityListItemDTO.f29276k0;
        double d213 = activityListItemDTO.T;
        double d214 = activityListItemDTO.f29294t1;
        long j18 = activityListItemDTO.f29292s1;
        arrayList = activityListItemDTO.M1;
        if (arrayList != null) {
            it = arrayList.iterator();
            d15 = 0.0d;
            while (it.hasNext()) {
                duration2 = ((com.garmin.android.apps.connectmobile.repcounting.model.g) it.next()).getDuration();
                if (duration2 != null) {
                    dDoubleValue6 = duration2.doubleValue();
                } else {
                    dDoubleValue6 = 0.0d;
                }
                d15 = (dDoubleValue6 / 1000.0d) + d15;
            }
        } else {
            d15 = activityListItemDTO.f29303y1;
        }
        l3.a aVar2 = l3.f23124b;
        float f15 = (float) activityListItemDTO.f29272i1;
        aVar2.getClass();
        double dB2 = l3.a.b(f15);
        dVar = activityListItemDTO.f29277k1;
        if (dVar != null) {
            vVar = null;
        } else {
            vVar = null;
        }
        dVar2 = activityListItemDTO.f29277k1;
        if (dVar2 != null) {
            num = dVar2.f17345m;
        } else {
            num = null;
        }
        if (dVar2 != null) {
            d16 = dVar2.f17346n;
        } else {
            d16 = null;
        }
        v vVar3 = vVar;
        if (dVar2 != null) {
            dValueOf = Double.valueOf(dVar2.f17344l);
        } else {
            dValueOf = null;
        }
        double d310 = activityListItemDTO.f29279l1;
        double d311 = activityListItemDTO.f29281m1;
        if (o1Var10 != null) {
            dDoubleValue2 = activityListItemDTO.f29258d2;
        } else {
            dDoubleValue2 = activityListItemDTO.f29258d2;
        }
        boolean z15 = activityListItemDTO.f29274j1;
        double d312 = dDoubleValue2;
        double d313 = activityListItemDTO.Y;
        int i110 = activityListItemDTO.f29285o1;
        long j19 = activityListItemDTO.f29295u1;
        double d314 = activityListItemDTO.f29273j;
        double d315 = activityListItemDTO.f29286p;
        int i111 = activityListItemDTO.f29287p1;
        double d410 = activityListItemDTO.f29289q1;
        double d411 = activityListItemDTO.f29297v1;
        int i112 = activityListItemDTO.f29301x1;
        if (o1VarC2 != 0) {
            iIntValue = (int) activityListItemDTO.C1;
        } else {
            iIntValue = (int) activityListItemDTO.C1;
        }
        if (o1VarC2 != 0) {
            dDoubleValue3 = activityListItemDTO.H1;
        } else {
            dDoubleValue3 = activityListItemDTO.H1;
        }
        arrayList2 = activityListItemDTO.E1;
        if (arrayList2 != null) {
            u0Var = activityListItemDTO.D1;
            if (u0Var != null) {
                valueKey = u0Var.getValueKey();
            } else {
                valueKey = null;
            }
            if (valueKey != null) {
            }
        } else {
            u0Var = activityListItemDTO.D1;
            if (u0Var != null) {
                valueKey = u0Var.getValueKey();
            } else {
                valueKey = null;
            }
            if (valueKey != null) {
            }
        }
        double d412 = activityListItemDTO.J0;
        arrayList3 = activityListItemDTO.E1;
        if (arrayList3 != null) {
            iIntValue2 = (int) activityListItemDTO.C1;
        } else {
            iIntValue2 = (int) activityListItemDTO.C1;
        }
        arrayList4 = activityListItemDTO.E1;
        if (arrayList4 != null) {
            dDoubleValue4 = activityListItemDTO.F1;
        } else {
            dDoubleValue4 = activityListItemDTO.F1;
        }
        arrayList5 = activityListItemDTO.E1;
        if (arrayList5 != null) {
            dDoubleValue5 = activityListItemDTO.G1;
        } else {
            dDoubleValue5 = activityListItemDTO.G1;
        }
        double d413 = dDoubleValue5;
        double d414 = activityListItemDTO.Z;
        double d415 = activityListItemDTO.A1;
        int i113 = activityListItemDTO.B1;
        arrayList6 = activityListItemDTO.E1;
        if (arrayList6 != null) {
            mode = activityListItemDTO.I1;
        } else {
            mode = activityListItemDTO.I1;
        }
        String str10 = mode;
        String str11 = activityListItemDTO.Z1;
        double d510 = activityListItemDTO.f29288q;
        double d511 = activityListItemDTO.f29290r;
        long j110 = activityListItemDTO.A;
        double d512 = activityListItemDTO.N0;
        String str12 = activityListItemDTO.L1;
        long j111 = activityListItemDTO.K1;
        int i114 = activityListItemDTO.O0;
        if (o1Var11 == null) {
            o1Var3 = o1Var11;
        } else if (o1Var9 == null) {
            arrayList7 = activityListItemDTO.E1;
            if (arrayList7 != null) {
                o1Var3 = (o1) h0.d0(arrayList7);
            } else {
                o1Var3 = null;
            }
        } else {
            o1Var3 = o1Var9;
        }
        Integer num3 = activityListItemDTO.P1;
        double d513 = activityListItemDTO.Q1;
        double d514 = activityListItemDTO.R1;
        double d515 = activityListItemDTO.G1;
        double d68 = activityListItemDTO.S1;
        double d69 = activityListItemDTO.T1;
        int i26 = (int) activityListItemDTO.C1;
        double d610 = activityListItemDTO.f29252b2;
        int i27 = activityListItemDTO.f29255c2;
        double d611 = activityListItemDTO.U1;
        maxPackWeight = activityListItemDTO.V1;
        if (maxPackWeight != null) {
            d17 = maxPackWeight;
        } else if (o1Var11 != null) {
            maxPackWeight = o1Var11.getMaxPackWeight();
            d17 = maxPackWeight;
        } else {
            d17 = null;
        }
        if (o1Var11 != null) {
            avgPackWeight = o1Var11.getAvgPackWeight();
        } else {
            avgPackWeight = null;
        }
        return new q(j8, str3, iN, str4, str5, str6, iIntValue3, Double.valueOf(activityListItemDTO.f29251b1), str, dDoubleValue7, d18, d19, d24, d14, d210, d211, d212, Double.valueOf(d213), null, d214, Long.valueOf(j18), Double.valueOf(d15), dB2, vVar3, num, d16, dValueOf, d310, Double.valueOf(d311), Double.valueOf(d312), z15, d313, i110, j19, d314, d315, i111, d410, d411, i112, i112, iIntValue, dDoubleValue3, str2, d412, iIntValue2, dDoubleValue4, d413, "", 0, 0, 0, "", d414, 0.0d, d415, Integer.valueOf(i113), str10, str11, d510, d511, null, null, j110, Double.valueOf(d512), str12, j111, Integer.valueOf(i114), Double.NaN, Double.NaN, Double.NaN, null, null, null, o1Var3, num3, Double.valueOf(d513), Double.valueOf(d514), Double.valueOf(d515), i26, Double.valueOf(d68), Double.valueOf(d69), Double.valueOf(d610), Integer.valueOf(i27), Double.valueOf(d611), d17, avgPackWeight, null, activityListItemDTO.f29261e2, dValueOf2, dValueOf2, dValueOf2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 1610612736, 896, null);
    }
}

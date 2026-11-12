package zb0;

import android.net.Uri;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import rx.schedulers.Schedulers;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<u0, vg1.t> f203577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableList<String> f203578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableList<String> f203579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<u0> f203580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p1.z<sd2.f> f203581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<u0> f203582f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203583a;

        static {
            int[] iArr = new int[u0.values().length];
            f203583a = iArr;
            try {
                iArr[u0.W1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f203583a[u0.X1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f203583a[u0.Y1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f203583a[u0.Z1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f203583a[u0.f203711d2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f203583a[u0.f203693a2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f203583a[u0.f203699b2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f203583a[u0.f203705c2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f203583a[u0.P1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f203583a[u0.Q1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f203583a[u0.R1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f203583a[u0.S1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f203583a[u0.V1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f203583a[u0.T1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f203583a[u0.E1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f203583a[u0.F1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f203583a[u0.G1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f203583a[u0.H1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f203583a[u0.J1.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f203583a[u0.T2.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f203583a[u0.U2.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f203583a[u0.V2.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f203583a[u0.W2.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f203583a[u0.X2.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f203583a[u0.Z2.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f203583a[u0.K1.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f203583a[u0.L1.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f203583a[u0.f203785o2.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f203583a[u0.f203764l2.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f203583a[u0.I1.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f203583a[u0.f203717e2.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f203583a[u0.f203722f2.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f203583a[u0.f203728g2.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f203583a[u0.f203735h2.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f203583a[u0.f203742i2.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f203583a[u0.f203749j2.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f203583a[u0.f203757k2.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f203583a[u0.f203792p2.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f203583a[u0.f203798q2.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f203583a[u0.W0.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f203583a[u0.U0.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f203583a[u0.V0.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f203583a[u0.D.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f203583a[u0.E.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f203583a[u0.f203836x.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f203583a[u0.F.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f203583a[u0.I.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f203583a[u0.P.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f203583a[u0.T.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f203583a[u0.f203848z.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f203583a[u0.X.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f203583a[u0.Y.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f203583a[u0.Z.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f203583a[u0.f203755k0.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f203583a[u0.f203842y.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f203583a[u0.f203830w.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f203583a[u0.B.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f203583a[u0.C.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f203583a[u0.f203824v.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        u0 u0Var = u0.f203849z1;
        vg1.t tVar = vg1.y.f178216a;
        linkedHashMap.put(u0Var, tVar);
        linkedHashMap.put(u0.A1, vg1.y.f178217b);
        linkedHashMap.put(u0.B1, vg1.y.f178218c);
        linkedHashMap.put(u0.U0, vg1.y.f178221f);
        linkedHashMap.put(u0.V0, vg1.y.f178222g);
        linkedHashMap.put(u0.f203699b2, vg1.y.f178225j);
        u0 u0Var2 = u0.f203705c2;
        linkedHashMap.put(u0Var2, vg1.y.f178226k);
        u0 u0Var3 = u0.f203717e2;
        vg1.t tVar2 = vg1.y.f178228m;
        linkedHashMap.put(u0Var3, tVar2);
        u0 u0Var4 = u0.f203722f2;
        linkedHashMap.put(u0Var4, tVar2);
        u0 u0Var5 = u0.f203792p2;
        linkedHashMap.put(u0Var5, tVar2);
        u0 u0Var6 = u0.f203798q2;
        linkedHashMap.put(u0Var6, tVar2);
        u0 u0Var7 = u0.f203804r2;
        vg1.t tVar3 = vg1.y.f178229n;
        linkedHashMap.put(u0Var7, tVar3);
        u0 u0Var8 = u0.f203809s2;
        linkedHashMap.put(u0Var8, tVar3);
        u0 u0Var9 = u0.f203820u2;
        linkedHashMap.put(u0Var9, tVar3);
        u0 u0Var10 = u0.f203815t2;
        linkedHashMap.put(u0Var10, tVar3);
        u0 u0Var11 = u0.f203826v2;
        vg1.t tVar4 = vg1.y.f178230o;
        linkedHashMap.put(u0Var11, tVar4);
        u0 u0Var12 = u0.f203832w2;
        linkedHashMap.put(u0Var12, tVar4);
        u0 u0Var13 = u0.f203844y2;
        linkedHashMap.put(u0Var13, tVar4);
        u0 u0Var14 = u0.f203850z2;
        linkedHashMap.put(u0Var14, tVar4);
        u0 u0Var15 = u0.A2;
        linkedHashMap.put(u0Var15, tVar4);
        u0 u0Var16 = u0.B2;
        linkedHashMap.put(u0Var16, tVar4);
        u0 u0Var17 = u0.C2;
        linkedHashMap.put(u0Var17, tVar4);
        u0 u0Var18 = u0.D2;
        linkedHashMap.put(u0Var18, tVar4);
        u0 u0Var19 = u0.f203838x2;
        linkedHashMap.put(u0Var19, tVar4);
        u0 u0Var20 = u0.f203728g2;
        linkedHashMap.put(u0Var20, tVar2);
        u0 u0Var21 = u0.f203735h2;
        linkedHashMap.put(u0Var21, tVar2);
        u0 u0Var22 = u0.f203742i2;
        linkedHashMap.put(u0Var22, tVar2);
        u0 u0Var23 = u0.f203749j2;
        linkedHashMap.put(u0Var23, tVar2);
        u0 u0Var24 = u0.f203757k2;
        linkedHashMap.put(u0Var24, tVar2);
        u0 u0Var25 = u0.E2;
        linkedHashMap.put(u0Var25, tVar3);
        u0 u0Var26 = u0.F2;
        linkedHashMap.put(u0Var26, tVar3);
        u0 u0Var27 = u0.f203764l2;
        vg1.t tVar5 = vg1.y.f178227l;
        linkedHashMap.put(u0Var27, tVar5);
        u0 u0Var28 = u0.f203785o2;
        linkedHashMap.put(u0Var28, tVar2);
        linkedHashMap.put(u0.G2, tVar3);
        linkedHashMap.put(u0.F5, tVar);
        u0 u0Var29 = u0.G5;
        vg1.t tVar6 = vg1.y.K;
        linkedHashMap.put(u0Var29, tVar6);
        u0 u0Var30 = u0.H5;
        linkedHashMap.put(u0Var30, tVar6);
        linkedHashMap.put(u0.f203813t, vg1.y.f178235t);
        linkedHashMap.put(u0.f203830w, vg1.y.f178236u);
        linkedHashMap.put(u0.f203842y, vg1.y.f178237v);
        linkedHashMap.put(u0.A, vg1.y.f178238w);
        u0 u0Var31 = u0.T1;
        linkedHashMap.put(u0Var31, vg1.y.B);
        u0 u0Var32 = u0.U1;
        linkedHashMap.put(u0Var32, tVar5);
        u0 u0Var33 = u0.K1;
        vg1.t tVar7 = vg1.y.C;
        linkedHashMap.put(u0Var33, tVar7);
        u0 u0Var34 = u0.L1;
        linkedHashMap.put(u0Var34, tVar7);
        linkedHashMap.put(u0.M1, tVar7);
        linkedHashMap.put(u0.N1, vg1.y.D);
        u0 u0Var35 = u0.N2;
        vg1.t tVar8 = vg1.y.E;
        linkedHashMap.put(u0Var35, tVar8);
        linkedHashMap.put(u0.P2, tVar8);
        linkedHashMap.put(u0.O2, tVar8);
        u0 u0Var36 = u0.Q2;
        vg1.t tVar9 = vg1.y.F;
        linkedHashMap.put(u0Var36, tVar9);
        linkedHashMap.put(u0.S2, tVar9);
        linkedHashMap.put(u0.R2, tVar9);
        linkedHashMap.put(u0.f203852z4, tVar9);
        linkedHashMap.put(u0.A4, tVar9);
        linkedHashMap.put(u0.B4, tVar9);
        linkedHashMap.put(u0.B, vg1.y.f178239x);
        linkedHashMap.put(u0.C, vg1.y.f178240y);
        linkedHashMap.put(u0.f203824v, vg1.y.f178241z);
        linkedHashMap.put(u0.f203848z, vg1.y.A);
        linkedHashMap.put(u0.O0, vg1.y.f178219d);
        linkedHashMap.put(u0.P0, vg1.y.f178220e);
        u0 u0Var37 = u0.X0;
        linkedHashMap.put(u0Var37, vg1.y.f178224i);
        u0 u0Var38 = u0.M2;
        vg1.t tVar10 = vg1.y.G;
        linkedHashMap.put(u0Var38, tVar10);
        linkedHashMap.put(u0.Y2, tVar10);
        u0 u0Var39 = u0.T2;
        vg1.t tVar11 = vg1.y.H;
        linkedHashMap.put(u0Var39, tVar11);
        linkedHashMap.put(u0.U2, tVar11);
        linkedHashMap.put(u0.V2, tVar11);
        u0 u0Var40 = u0.Z2;
        vg1.t tVar12 = vg1.y.I;
        linkedHashMap.put(u0Var40, tVar12);
        linkedHashMap.put(u0.f203818t5, vg1.y.N);
        u0 u0Var41 = u0.f203823u5;
        linkedHashMap.put(u0Var41, tVar11);
        u0 u0Var42 = u0.f203829v5;
        linkedHashMap.put(u0Var42, tVar11);
        u0 u0Var43 = u0.f203847y5;
        linkedHashMap.put(u0Var43, tVar3);
        u0 u0Var44 = u0.f203853z5;
        linkedHashMap.put(u0Var44, tVar3);
        linkedHashMap.put(u0.W2, tVar12);
        linkedHashMap.put(u0.X2, tVar12);
        u0 u0Var45 = u0.f203694a3;
        linkedHashMap.put(u0Var45, tVar11);
        u0 u0Var46 = u0.f203700b3;
        linkedHashMap.put(u0Var46, tVar11);
        u0 u0Var47 = u0.f203750j3;
        linkedHashMap.put(u0Var47, tVar11);
        linkedHashMap.put(u0.f203772m3, tVar11);
        linkedHashMap.put(u0.f203779n3, tVar11);
        linkedHashMap.put(u0.f203758k3, tVar11);
        linkedHashMap.put(u0.f203765l3, tVar11);
        u0 u0Var48 = u0.f203706c3;
        linkedHashMap.put(u0Var48, tVar11);
        u0 u0Var49 = u0.f203712d3;
        linkedHashMap.put(u0Var49, tVar11);
        u0 u0Var50 = u0.J5;
        linkedHashMap.put(u0Var50, tVar11);
        u0 u0Var51 = u0.K5;
        linkedHashMap.put(u0Var51, tVar11);
        u0 u0Var52 = u0.f203773m4;
        vg1.t tVar13 = vg1.y.J;
        linkedHashMap.put(u0Var52, tVar13);
        u0 u0Var53 = u0.f203780n4;
        linkedHashMap.put(u0Var53, tVar13);
        u0 u0Var54 = u0.f203787o4;
        linkedHashMap.put(u0Var54, tVar13);
        u0 u0Var55 = u0.f203794p4;
        linkedHashMap.put(u0Var55, tVar13);
        u0 u0Var56 = u0.f203800q4;
        linkedHashMap.put(u0Var56, tVar13);
        u0 u0Var57 = u0.f203806r4;
        linkedHashMap.put(u0Var57, tVar13);
        u0 u0Var58 = u0.f203811s4;
        linkedHashMap.put(u0Var58, tVar13);
        u0 u0Var59 = u0.f203817t4;
        linkedHashMap.put(u0Var59, tVar13);
        linkedHashMap.put(u0.M5, vg1.y.L);
        linkedHashMap.put(u0.P5, vg1.y.M);
        linkedHashMap.put(u0.S5, vg1.y.O);
        u0 u0Var60 = u0.N5;
        vg1.t tVar14 = vg1.y.f178231p;
        linkedHashMap.put(u0Var60, tVar14);
        linkedHashMap.put(u0.O5, tVar14);
        linkedHashMap.put(u0.Q5, vg1.y.f178232q);
        linkedHashMap.put(u0.T5, vg1.y.f178233r);
        linkedHashMap.put(u0.V5, vg1.y.f178234s);
        u0 u0Var61 = u0.f203831w1;
        linkedHashMap.put(u0Var61, vg1.y.f178223h);
        linkedHashMap.put(u0.R5, vg1.y.P);
        linkedHashMap.put(u0.U5, vg1.y.Q);
        linkedHashMap.put(u0.W5, vg1.y.R);
        u0 u0Var62 = u0.X5;
        vg1.t tVar15 = vg1.y.S;
        linkedHashMap.put(u0Var62, tVar15);
        linkedHashMap.put(u0.f203715d6, vg1.y.T);
        linkedHashMap.put(u0.f203732g6, tVar15);
        linkedHashMap.put(u0.f203726f6, tVar15);
        f203577a = Collections.unmodifiableMap(linkedHashMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(u0.P4.f203854a.split(",")));
        linkedHashSet.addAll(Arrays.asList(u0.Q4.f203854a.split(",")));
        linkedHashSet.addAll(Arrays.asList(u0.R4.f203854a.split(",")));
        linkedHashSet.addAll(Arrays.asList(u0.S4.f203854a.split(",")));
        f203578b = ImmutableList.builder().addAll((Iterable) linkedHashSet).build();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(Arrays.asList(u0.f203739h6.f203854a.split(",")));
        linkedHashSet2.addAll(Arrays.asList(u0.f203720e6.f203854a.split(",")));
        f203579c = ImmutableList.builder().addAll((Iterable) linkedHashSet2).build();
        f203580d = Arrays.asList(u0Var31, u0Var4, u0Var20, u0Var3, u0Var25, u0Var26, u0Var27, u0Var5, u0Var6, u0Var7, u0Var8, u0Var10, u0Var9, u0Var11, u0Var12, u0Var13, u0Var14, u0.U3, u0Var15, u0Var16, u0Var17, u0Var18, u0Var19, u0Var61, u0Var37, u0.Y0, u0.Z0, u0.f203692a1, u0.f203698b1, u0.f203704c1, u0.R0, u0.T0, u0.Q0, u0.S0, u0Var45, u0Var48, u0Var47, u0Var49, u0Var46, u0Var30, u0Var29, u0.I5, u0Var50, u0Var51, u0Var32, u0.f203786o3, u0.f203793p3, u0.f203799q3, u0.f203718e3, u0.f203723f3, u0.f203729g3, u0.f203736h3, u0.f203743i3, u0Var41, u0Var42, u0Var43, u0Var44, u0.f203805r3, u0.f203810s3, u0.f203816t3, u0.f203821u3, u0.f203833w3, u0.f203839x3, u0.f203845y3, u0.f203827v3, u0.f203851z3, u0.A3, u0.B3, u0.C3, u0.D3, u0.E3, u0.F3, u0.G3, u0.H3, u0.I3, u0.J3, u0.K3, u0.L3, u0.M3, u0.N3, u0.P3, u0.Q3, u0.O3, u0.R3, u0.S3, u0.T3, u0.f203822u4, u0.f203828v4, u0.f203834w4, u0.W3, u0Var58, u0Var52, u0Var53, u0Var54, u0Var56, u0Var55, u0Var57, u0Var59, u0.f203695a4, u0.f203701b4, u0.f203707c4, u0.e4, u0.f203724f4, u0.f203721f1, u0.f203727g1, u0.f203734h1, u0.f203713d4, u0.f203730g4, u0.f203791p1, u0.f203797q1, u0.f203803r1, u0.f203840x4, u0.f203737h4, u0.f203744i4, u0.f203751j4, u0.f203759k4, u0.f203766l4, u0.f203741i1, u0.f203748j1, u0.f203756k1, u0.f203763l1, u0.f203770m1, u0.f203777n1, u0.f203784o1);
        f203581e = new p1.z<>();
        f203582f = Arrays.asList(u0Var31, u0Var2, u0Var3, u0Var20, u0Var23, u0Var24, u0Var21, u0Var22, u0Var4, u0Var25, u0Var26, u0Var7, u0Var8, u0Var10, u0Var9, u0Var11, u0Var12, u0Var13, u0Var14, u0Var15, u0Var16, u0Var17, u0Var18, u0Var19, u0Var28, u0Var33, u0Var34, u0Var27, u0Var5, u0Var6, u0Var41, u0Var42, u0Var43, u0Var44);
    }

    public static void a(long j8, String str) {
        if (j8 > -1) {
            rd2.f.a().f152047c.getClass();
            int iD = rd2.i.d(j8);
            i2.a(a2.DEVICES, str, ".deletePairing(): " + iD + " record(s) cleared.");
            ed0.a aVar = ed0.a.f63825a;
            str.getClass();
            ed0.a.k(str);
            hk0.a.f().i(j8);
        }
    }

    public static List<sd2.f> b() {
        ArrayList arrayList = new ArrayList();
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        return (arrayListE == null || arrayListE.isEmpty()) ? arrayList : (List) arrayListE.stream().filter(new im.c(12)).collect(Collectors.toList());
    }

    public static String c(DeviceProfile deviceProfile) {
        return "006-B" + String.valueOf(deviceProfile.getF172495c()) + "-00";
    }

    public static vg1.z d(u0 u0Var) {
        Map<u0, vg1.t> map = f203577a;
        if (map.containsKey(u0Var)) {
            return map.get(u0Var);
        }
        if (u0Var != null) {
            return vg1.y.U;
        }
        return null;
    }

    public static Uri e(long j8) {
        String str = String.format("https://support.garmin.com/%1$s/sas/gcm/?productId=%2$s", c22.s1.b(Locale.getDefault()), Long.valueOf(j8));
        i2.a(a2.DEVICES, "DeviceUtil", "Support Center URL : ".concat(str));
        return Uri.parse(str);
    }

    public static Integer f(sd2.f fVar) {
        u0 u0Var = (u0) u0.f203782n6.get(fVar.getProductNumber());
        return (u0Var == u0.M1 || u0Var == u0.K1 || u0Var == u0.L1) ? 10 : 6;
    }

    public static void g(j1 j1Var) {
        j83.e eVarE;
        j83.e eVarE2;
        f203581e.a();
        j83.e eVarE3 = j83.e.e(new o83.s(new j83.l(new o83.r(j83.l.a(new jr2.f(3)).d(Schedulers.io()), new l2(23))).f97754a));
        if (eVarE3.getClass() == s83.i.class) {
            eVarE = j83.e.e(new s83.h((s83.i) eVarE3, s83.l.INSTANCE));
        } else {
            eVarE = j83.e.e(new o83.h(eVarE3.f97747a, o83.j.a.f130889a));
        }
        l2 l2Var = new l2(24);
        if (eVarE.getClass() == s83.i.class) {
            eVarE2 = j83.e.e(new s83.h((s83.i) eVarE, l2Var));
        } else {
            j83.e eVarE4 = j83.e.e(new o83.i(eVarE, l2Var));
            if (eVarE4.getClass() == s83.i.class) {
                eVarE2 = j83.e.e(new s83.h((s83.i) eVarE4, s83.l.INSTANCE));
            } else {
                eVarE2 = j83.e.e(new o83.h(eVarE4.f97747a, o83.j.a.f130889a));
            }
        }
        eVarE2.b(l83.a.a()).d(new l0(j1Var));
    }

    public static boolean h() {
        return bo1.a.a().c().M0();
    }

    public static boolean i(u0 u0Var, String str) {
        return !TextUtils.isEmpty(str) && u0Var == u0.f203782n6.get(str);
    }

    public static boolean j(String str) {
        u0[] u0VarArr = {u0.E1, u0.F1, u0.G1, u0.H1};
        for (int i14 = 0; i14 < 4; i14++) {
            if (i(u0VarArr[i14], str)) {
                return true;
            }
        }
        return false;
    }
}

package cn1;

import android.content.Context;
import c2.a0;
import c2.b0;
import c2.k3;
import c2.l1;
import c2.n0;
import c2.n3;
import c2.x2;
import c2.y;
import c2.z;
import c53.f0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import cw1.w;
import f5.b1;
import f5.k2;
import f5.v1;
import f5.y0;
import gg1.o0;
import h5.e0;
import i3.bi;
import i3.fe;
import i3.k6;
import i3.kb;
import i3.l6;
import i3.lb;
import i3.mc;
import i3.ph;
import i3.ri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lc.m0;
import o62.q0;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p006l2.a2;
import p006l2.z1;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p40.r0;
import s5.x0;
import sk0.h1;
import w52.v0;
import x5.l0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f28040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f28041i;

    public /* synthetic */ o(k3 k3Var, e23.p pVar, e23.p pVar2, e23.p pVar3, int i14, e23.p pVar4, kb.d dVar, e23.p pVar5) {
        this.f28033a = 9;
        this.f28036d = k3Var;
        this.f28034b = pVar;
        this.f28037e = pVar2;
        this.f28038f = pVar3;
        this.f28035c = i14;
        this.f28039g = pVar4;
        this.f28040h = dVar;
        this.f28041i = pVar5;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0417  */
    /* JADX WARN: Code duplicated, block: B:104:0x043a  */
    /* JADX WARN: Code duplicated, block: B:109:0x044a  */
    /* JADX WARN: Code duplicated, block: B:113:0x046a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0476  */
    /* JADX WARN: Code duplicated, block: B:118:0x0480  */
    /* JADX WARN: Code duplicated, block: B:120:0x0490  */
    /* JADX WARN: Code duplicated, block: B:123:0x049a  */
    /* JADX WARN: Code duplicated, block: B:127:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:129:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:132:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:136:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:139:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x0511  */
    /* JADX WARN: Code duplicated, block: B:145:0x0518  */
    /* JADX WARN: Code duplicated, block: B:149:0x0555  */
    /* JADX WARN: Code duplicated, block: B:156:0x057d  */
    /* JADX WARN: Code duplicated, block: B:158:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:219:0x0854  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0561 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x05b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x030f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0335  */
    /* JADX WARN: Code duplicated, block: B:67:0x033f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0346  */
    /* JADX WARN: Code duplicated, block: B:71:0x0350  */
    /* JADX WARN: Code duplicated, block: B:77:0x0363  */
    /* JADX WARN: Code duplicated, block: B:79:0x0367  */
    /* JADX WARN: Code duplicated, block: B:85:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:95:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:98:0x0405  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47, types: [j23.g] */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v2, types: [tw1.j] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3, types: [m52.k] */
    /* JADX WARN: Type inference failed for: r27v4 */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int iF0;
        int iF1;
        int i14;
        final k6 k6Var;
        Integer numValueOf;
        final int i15;
        int iIntValue;
        int iC;
        String str;
        boolean z14;
        ?? r14;
        String strJ;
        vw1.d dVarF;
        j23.g<LocalDate> gVar;
        boolean z15;
        j23.g<LocalDate> gVar2;
        j23.g<LocalDate> gVar3;
        String str2;
        String string;
        p3.m.a aVar;
        DateTime dateTimeWithTimeAtStartOfDay;
        fg0.k kVar;
        boolean z16;
        ArrayList arrayListD1;
        f0.a aVar2;
        p3.m.a aVar3;
        boolean zR;
        Object objQ;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String strD;
        Object arrayList2;
        DateTime dateTime;
        ArrayList arrayListY;
        f0.a aVar4;
        p3.m.a aVar5;
        boolean z17;
        ?? r24;
        Object associatedActivityId;
        boolean z18;
        Iterator it;
        Object next;
        DateTime dateTimeJ;
        fg0.d completionTarget;
        boolean zB;
        Object objQ2;
        int i16 = this.f28033a;
        int i17 = this.f28035c;
        Object obj3 = this.f28037e;
        Object obj4 = this.f28041i;
        Object obj5 = this.f28034b;
        Object obj6 = this.f28040h;
        Object obj7 = this.f28039g;
        Object obj8 = this.f28038f;
        Object obj9 = this.f28036d;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                r.b((a0) obj9, (String) obj5, (String) obj3, (String) obj8, (String) obj7, (String) obj6, (String) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                cw1.j.b((h4.r) obj9, (String) obj5, (LocalDate) obj3, (LocalDate) obj8, (LocalDate) obj7, (LocalDate) obj6, (e23.l) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                cw1.j.a((String) obj5, (LocalDate) obj9, (LocalDate) obj3, (LocalDate) obj8, (LocalDate) obj7, (e23.l) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                w.a((h4.r) obj9, (String) obj5, (i53.c) obj8, (e23.l) obj7, (String) obj3, (e23.a) obj6, (e23.l) obj4, this.f28035c, (p3.m) obj, p0.t(12582913));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                ((WorkoutActivityProfileSelectionActivity) obj9).fa((List) obj3, (d62.i) obj8, (String) obj5, (e23.l) obj7, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                da0.t.a((h4.r) obj9, (c2.j.e) obj5, this.f28035c, this.f28037e, (ArrayList) obj8, (x0) obj7, (e23.q) obj6, (e23.l) obj4, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).intValue();
                e62.d.a((v0) obj9, (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj5, (m0) obj3, (e62.c) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                gn1.d.b((j23.i) obj9, (b63.u) obj3, (j23.g) obj8, (b63.u) obj7, (gn1.f) obj6, (String) obj5, (e23.l) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                gw0.c.a((gw0.u) obj9, (b63.t) obj5, (o82.g) obj3, (pv0.c) obj8, (mc) obj7, (e23.a) obj6, (e23.l) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 9:
                final k3 k3Var = (k3) obj9;
                e23.p pVar = (e23.p) obj7;
                kb.d dVar = (kb.d) obj6;
                e23.p pVar2 = (e23.p) obj4;
                final k2 k2Var = (k2) obj;
                g6.a aVar6 = (g6.a) obj2;
                float f14 = kb.f88687a;
                final int iJ = g6.a.j(aVar6.f75988a);
                final int i18 = g6.a.i(aVar6.f75988a);
                long jC = g6.a.c(0, 0, 0, 0, 10, aVar6.f75988a);
                int iB = k3Var.b(k2Var, k2Var.getF68910b());
                int iD = k3Var.d(k2Var, k2Var.getF68910b());
                int iC2 = k3Var.c(k2Var);
                final v1 v1VarQ = ((y0) h0.b0(k2Var.F0((e23.p) obj5, lb.TopBar))).Q(jC);
                int i19 = (-iB) - iD;
                int i24 = -iC2;
                final v1 v1VarQ2 = ((y0) h0.b0(k2Var.F0((e23.p) obj3, lb.Snackbar))).Q(g6.b.i(i19, i24, jC));
                final v1 v1VarQ3 = ((y0) h0.b0(k2Var.F0((e23.p) obj8, lb.Fab))).Q(g6.b.i(i19, i24, jC));
                int i25 = v1VarQ3.f69144a;
                if (i25 == 0 && v1VarQ3.f69145b == 0) {
                    k6Var = null;
                } else {
                    int i26 = v1VarQ3.f69145b;
                    l6.f88830b.getClass();
                    if (i17 == 0) {
                        if (k2Var.getF68910b() == g6.o.Ltr) {
                            iF0 = k2Var.f0(f14);
                            i14 = iF0 + iB;
                        } else {
                            iF1 = k2Var.f0(f14);
                            i14 = ((iJ - iF1) - i25) - iD;
                        }
                    } else if (i17 != l6.f88832d && i17 != l6.f88833e) {
                        i14 = (((iJ - i25) + iB) - iD) / 2;
                    } else if (k2Var.getF68910b() == g6.o.Ltr) {
                        iF1 = k2Var.f0(f14);
                        i14 = ((iJ - iF1) - i25) - iD;
                    } else {
                        iF0 = k2Var.f0(f14);
                        i14 = iF0 + iB;
                    }
                    k6Var = new k6(i14, i25, i26);
                }
                final v1 v1VarQ4 = ((y0) h0.b0(k2Var.F0(pVar, lb.BottomBar))).Q(jC);
                boolean z19 = v1VarQ4.f69144a == 0 && v1VarQ4.f69145b == 0;
                if (k6Var != null) {
                    int i27 = k6Var.f88669b;
                    if (z19) {
                        iC = k3Var.c(k2Var) + k2Var.f0(f14) + i27;
                    } else {
                        l6.f88830b.getClass();
                        if (i17 == l6.f88833e) {
                            iC = k3Var.c(k2Var) + k2Var.f0(f14) + i27;
                        } else {
                            iC = k2Var.f0(f14) + v1VarQ4.f69145b + i27;
                        }
                    }
                    numValueOf = Integer.valueOf(iC);
                } else {
                    numValueOf = null;
                }
                int i28 = v1VarQ2.f69145b;
                if (i28 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = Integer.valueOf(v1VarQ4.f69145b);
                        if (z19) {
                            numValueOf2 = null;
                        }
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : k3Var.c(k2Var);
                    }
                    i15 = i28 + iIntValue;
                } else {
                    i15 = 0;
                }
                n0 n0Var = n3.f22788a;
                l1 l1Var = new l1(k3Var, k2Var);
                final Integer num = numValueOf;
                dVar.f88698a.setValue(c2.l.d(c2.l.i(l1Var, k2Var.getF68910b()), (v1VarQ.f69144a == 0 && v1VarQ.f69145b == 0) ? l1Var.getF22737b() : k2Var.c1(v1VarQ.f69145b), c2.l.h(l1Var, k2Var.getF68910b()), z19 ? l1Var.getF22739d() : k2Var.c1(v1VarQ4.f69145b)));
                final v1 v1VarQ5 = ((y0) h0.b0(k2Var.F0(pVar2, lb.MainContent))).Q(jC);
                return b1.h0(k2Var, iJ, i18, new e23.l() { // from class: i3.jb
                    @Override // e23.l
                    public final Object invoke(Object obj10) {
                        f5.v1.a aVar7 = (f5.v1.a) obj10;
                        aVar7.r(v1VarQ5, 0, 0, 0.0f);
                        aVar7.r(v1VarQ, 0, 0, 0.0f);
                        f5.v1 v1Var = v1VarQ2;
                        int i29 = iJ - v1Var.f69144a;
                        f5.k2 k2Var2 = k2Var;
                        g6.o f68910b = k2Var2.getF68910b();
                        c2.k3 k3Var2 = k3Var;
                        int iB2 = ((k3Var2.b(k2Var2, f68910b) + i29) - k3Var2.d(k2Var2, k2Var2.getF68910b())) / 2;
                        int i30 = i18;
                        aVar7.r(v1Var, iB2, i30 - i15, 0.0f);
                        f5.v1 v1Var2 = v1VarQ4;
                        aVar7.r(v1Var2, 0, i30 - v1Var2.f69145b, 0.0f);
                        k6 k6Var2 = k6Var;
                        if (k6Var2 != null) {
                            int i34 = k6Var2.f88668a;
                            Integer num2 = num;
                            num2.getClass();
                            aVar7.r(v1VarQ3, i34, i30 - num2.intValue(), 0.0f);
                        }
                        return Unit.INSTANCE;
                    }
                });
            case 10:
                ((Integer) obj2).getClass();
                bi.m((h4.r) obj9, (l0) obj5, (e23.l) obj3, (ri) obj8, this.f28035c, (a2) obj7, (z1) obj6, (ph) obj4, (p3.m) obj, p0.t(24577));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).intValue();
                jy0.u.a((jy0.h) obj9, (c12.h) obj5, (sy0.j) obj3, (sy0.g) obj8, (e23.l) obj7, (e23.l) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                q0.f((o62.j) obj9, (e23.l) obj5, (e23.l) obj3, (e23.l) obj8, (e23.l) obj7, (e23.l) obj6, (e23.l) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                p21.d.a((q21.a) obj9, (v21.e) obj5, (fe) obj3, (e23.a) obj8, (e23.a) obj7, (e23.p) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                p21.e.a((q21.d) obj9, (v21.e) obj5, (e23.l) obj3, (e23.l) obj8, (e23.a) obj7, (e23.p) obj6, (fe) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                r0.d((h4.r) obj9, (q40.b) obj5, (e23.l) obj3, (e23.l) obj8, (e23.l) obj7, (e23.l) obj6, (e23.l) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).intValue();
                pk0.n.a((String) obj5, (String) obj3, (i53.c) obj9, (String) obj8, (e23.p) obj7, (e23.a) obj6, (e23.l) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                r11.f.a((v21.e) obj9, (s11.a) obj5, (fe) obj3, (i01.a) obj8, (i53.c) obj7, (e23.p) obj6, (NutritionActivity.g) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 18:
                sw1.a aVar7 = (sw1.a) obj9;
                LocalDate localDate = (LocalDate) obj5;
                Context context = (Context) obj3;
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) obj8;
                e23.a aVar8 = (e23.a) obj7;
                e23.a aVar9 = (e23.a) obj6;
                e23.a aVar10 = (e23.a) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    h4.r rVarB = u1.a2.b(x2.f(aVar11, 1.0f), u1.a2.a(mVar2), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar12);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    tw1.m mVar3 = aVar7.f161085a;
                    if (mVar3.e0()) {
                        mVar2.C(-966175552);
                        ku1.f.a(null, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-966124619);
                        mVar2.f();
                    }
                    rw1.c.a(mVar3, i17, mVar2, 0);
                    ku1.m.a(aVar7.f161089e, mVar3.e0(), aVar7.f161091g, aVar7.f161092h, mVar2, fg0.k.X);
                    localDate.getClass();
                    context.getClass();
                    vw1.d dVarF2 = vw1.c.f(mVar3);
                    j23.g<LocalDate> gVar4 = dVarF2.f180566c;
                    j23.g<LocalDate> gVar5 = dVarF2.f180565b;
                    j23.g<LocalDate> gVar6 = dVarF2.f180564a;
                    if (gVar6 != null) {
                        str = null;
                        z14 = true;
                        if (gVar6.contains(localDate)) {
                            r14 = gVar6;
                        }
                        if (r14 != 0) {
                            fy1.i.a aVar13 = fy1.i.f73924a;
                            DateTime dateTimeAtStartOfDay = ((LocalDate) r14.getStart()).toDateTimeAtStartOfDay();
                            dateTimeAtStartOfDay.getClass();
                            DateTime dateTimeAtStartOfDay2 = ((LocalDate) r14.b()).toDateTimeAtStartOfDay();
                            dateTimeAtStartOfDay2.getClass();
                            aVar13.getClass();
                            strJ = fy1.i.a.j(context, dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
                        } else {
                            strJ = str;
                        }
                        dVarF = vw1.c.f(mVar3);
                        gVar = dVarF.f180564a;
                        if (gVar != null) {
                            z15 = true;
                            if (gVar.contains(localDate)) {
                                string = context.getString(R.string.itp_base_phase_name);
                            }
                            str2 = string;
                            mVar2.C(-723878895);
                            aVar = p3.m.f135153a;
                            if (str2 != null && strJ != null) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar = j92.b.f97899b;
                                h4.r rVarC2 = c2.l.C(c2.l.A(aVar11, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                                zB = mVar2.B(aVar10);
                                objQ2 = mVar2.q();
                                if (zB) {
                                    objQ2 = new rk0.y(aVar10, 9);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new rk0.y(aVar10, 9);
                                        mVar2.K(objQ2);
                                    }
                                }
                                ku1.j.a(0, (e23.a) objQ2, rVarC2, str2, strJ, strJ, mVar2);
                            }
                            mVar2.f();
                            if (mVar3.e0()) {
                                mVar2.C(-964667371);
                                mVar2.f();
                            } else {
                                mVar2.C(-964887440);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                rw1.d.a(mVar, c2.l.A(aVar11, j92.b.f97899b.f97920e, 0.0f, 2), aVar7, mVar2, 0);
                                mVar2.f();
                            }
                            if (mVar3.e0() || mVar3.o() == null) {
                                dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                            } else {
                                DateTime dateTimeO = mVar3.o();
                                dateTimeO.getClass();
                                dateTimeWithTimeAtStartOfDay = dateTimeO.withTimeAtStartOfDay();
                            }
                            dateTimeWithTimeAtStartOfDay.getClass();
                            DateTime dateTimeO2 = g22.k.o(i17, dateTimeWithTimeAtStartOfDay);
                            DateTime dateTimeA = g22.k.A(g22.k.b(i17, dateTimeWithTimeAtStartOfDay));
                            boolean zE0 = mVar3.e0();
                            kVar = aVar7.f161089e;
                            Double d14 = aVar7.f161092h;
                            Double d15 = aVar7.f161091g;
                            if (kVar == null && (completionTarget = kVar.getCompletionTarget()) != null && completionTarget.o()) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            fg0.t tVar = aVar7.f161090f;
                            Interval interval = new Interval(dateTimeO2, dateTimeA);
                            arrayListD1 = h0.d1(j0.f134944a);
                            aVar2 = new f0.a(gg.b.Q(interval));
                            while (aVar2.hasNext()) {
                                dateTime = (DateTime) aVar2.next();
                                arrayListY = mVar3.y();
                                if (arrayListY != null) {
                                    it = arrayListY.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            aVar4 = aVar2;
                                            dateTimeJ = ((tw1.j) next).j();
                                            if (dateTimeJ != null) {
                                                aVar5 = aVar;
                                                z17 = true;
                                                if (g22.k.f(dateTimeJ, dateTime)) {
                                                }
                                            } else {
                                                aVar5 = aVar;
                                            }
                                            aVar2 = aVar4;
                                            aVar = aVar5;
                                        } else {
                                            aVar4 = aVar2;
                                            aVar5 = aVar;
                                            z17 = true;
                                            next = str;
                                        }
                                    }
                                    r24 = (tw1.j) next;
                                } else {
                                    aVar4 = aVar2;
                                    aVar5 = aVar;
                                    z17 = true;
                                    r24 = str;
                                }
                                ?? T = ((r24 == 0 && r24.A() == z17) || r24 == 0) ? str : r24.t();
                                if (r24 != 0) {
                                    associatedActivityId = r24.getAssociatedActivityId();
                                } else {
                                    associatedActivityId = str;
                                }
                                if (associatedActivityId != null) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                arrayListD1.add(new lu1.e(T, dateTime, z18, g22.k.f(dateTime, mVar3.o()), g22.k.k(dateTime), false, null, false, false, 448, null));
                                aVar2 = aVar4;
                                aVar = aVar5;
                            }
                            aVar3 = aVar;
                            zR = mVar2.r(mVar) | mVar2.r(aVar7);
                            objQ = mVar2.q();
                            if (zR) {
                                objQ = new rk0.f(12, mVar, aVar7);
                                mVar2.K(objQ);
                            } else {
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new rk0.f(12, mVar, aVar7);
                                    mVar2.K(objQ);
                                }
                            }
                            ku1.c.a(zE0, kVar, d14, d15, z16, tVar, dateTimeO2, dateTimeA, arrayListD1, (e23.a) objQ, aVar8, aVar9, mVar2, (fg0.k.X << 6) | 6 | (fg0.t.f71346c << 18));
                            vt1.o oVar = vt1.o.f180176g;
                            List<ActivityListItemDTO> list = aVar7.f161093i;
                            arrayList = new ArrayList();
                            for (Object obj10 : list) {
                                if (((ActivityListItemDTO) obj10).f29259e != null) {
                                    arrayList.add(obj10);
                                }
                            }
                            List listN0 = h0.N0(arrayList, new sw1.b());
                            linkedHashMap = new LinkedHashMap();
                            for (Object obj11 : listN0) {
                                LocalDate localDate2 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(((ActivityListItemDTO) obj11).f29259e).toLocalDate();
                                pi0.e eVar2 = new pi0.e(context);
                                localDate2.getClass();
                                strD = eVar2.d(localDate2, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                                arrayList2 = linkedHashMap.get(strD);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    linkedHashMap.put(strD, arrayList2);
                                }
                                ((List) arrayList2).add(obj11);
                            }
                            ku1.d.a(oVar, linkedHashMap, mVar2, 6);
                            mVar2.y();
                            x1 x1Var2 = p3.n.f135158a;
                        } else {
                            z15 = true;
                        }
                        gVar2 = dVarF.f180565b;
                        if (gVar2 == null && gVar2.contains(localDate) == z15) {
                            string = context.getString(R.string.itp_build_phase_name);
                        } else {
                            gVar3 = dVarF.f180566c;
                            if (gVar3 == null && gVar3.contains(localDate) == z15) {
                                string = context.getString(R.string.itp_peak_phase_name);
                            } else {
                                str2 = str;
                            }
                            mVar2.C(-723878895);
                            aVar = p3.m.f135153a;
                            if (str2 != null) {
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar3 = j92.b.f97899b;
                                h4.r rVarC3 = c2.l.C(c2.l.A(aVar11, eVar3.f97920e, 0.0f, 2), 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                                zB = mVar2.B(aVar10);
                                objQ2 = mVar2.q();
                                if (zB) {
                                    aVar.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new rk0.y(aVar10, 9);
                                        mVar2.K(objQ2);
                                    }
                                } else {
                                    objQ2 = new rk0.y(aVar10, 9);
                                    mVar2.K(objQ2);
                                }
                                ku1.j.a(0, (e23.a) objQ2, rVarC3, str2, strJ, strJ, mVar2);
                            }
                            mVar2.f();
                            if (mVar3.e0()) {
                                mVar2.C(-964887440);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                rw1.d.a(mVar, c2.l.A(aVar11, j92.b.f97899b.f97920e, 0.0f, 2), aVar7, mVar2, 0);
                                mVar2.f();
                            } else {
                                mVar2.C(-964667371);
                                mVar2.f();
                            }
                            if (mVar3.e0()) {
                                dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                            } else {
                                dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                            }
                            dateTimeWithTimeAtStartOfDay.getClass();
                            DateTime dateTimeO3 = g22.k.o(i17, dateTimeWithTimeAtStartOfDay);
                            DateTime dateTimeA2 = g22.k.A(g22.k.b(i17, dateTimeWithTimeAtStartOfDay));
                            boolean zE1 = mVar3.e0();
                            kVar = aVar7.f161089e;
                            Double d16 = aVar7.f161092h;
                            Double d17 = aVar7.f161091g;
                            if (kVar == null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            fg0.t tVar2 = aVar7.f161090f;
                            Interval interval2 = new Interval(dateTimeO3, dateTimeA2);
                            arrayListD1 = h0.d1(j0.f134944a);
                            aVar2 = new f0.a(gg.b.Q(interval2));
                            while (aVar2.hasNext()) {
                                dateTime = (DateTime) aVar2.next();
                                arrayListY = mVar3.y();
                                if (arrayListY != null) {
                                    it = arrayListY.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            aVar4 = aVar2;
                                            dateTimeJ = ((tw1.j) next).j();
                                            if (dateTimeJ != null) {
                                                aVar5 = aVar;
                                                z17 = true;
                                                if (g22.k.f(dateTimeJ, dateTime)) {
                                                }
                                            } else {
                                                aVar5 = aVar;
                                            }
                                            aVar2 = aVar4;
                                            aVar = aVar5;
                                        } else {
                                            aVar4 = aVar2;
                                            aVar5 = aVar;
                                            z17 = true;
                                            next = str;
                                        }
                                    }
                                    r24 = (tw1.j) next;
                                } else {
                                    aVar4 = aVar2;
                                    aVar5 = aVar;
                                    z17 = true;
                                    r24 = str;
                                }
                                if (r24 == 0) {
                                }
                                if (r24 != 0) {
                                    associatedActivityId = r24.getAssociatedActivityId();
                                } else {
                                    associatedActivityId = str;
                                }
                                if (associatedActivityId != null) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                arrayListD1.add(new lu1.e(T, dateTime, z18, g22.k.f(dateTime, mVar3.o()), g22.k.k(dateTime), false, null, false, false, 448, null));
                                aVar2 = aVar4;
                                aVar = aVar5;
                            }
                            aVar3 = aVar;
                            zR = mVar2.r(mVar) | mVar2.r(aVar7);
                            objQ = mVar2.q();
                            if (zR) {
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new rk0.f(12, mVar, aVar7);
                                    mVar2.K(objQ);
                                }
                            } else {
                                objQ = new rk0.f(12, mVar, aVar7);
                                mVar2.K(objQ);
                            }
                            ku1.c.a(zE1, kVar, d16, d17, z16, tVar2, dateTimeO3, dateTimeA2, arrayListD1, (e23.a) objQ, aVar8, aVar9, mVar2, (fg0.k.X << 6) | 6 | (fg0.t.f71346c << 18));
                            vt1.o oVar2 = vt1.o.f180176g;
                            List<ActivityListItemDTO> list2 = aVar7.f161093i;
                            arrayList = new ArrayList();
                            while (r3.hasNext()) {
                                if (((ActivityListItemDTO) obj10).f29259e != null) {
                                    arrayList.add(obj10);
                                }
                            }
                            List listN1 = h0.N0(arrayList, new sw1.b());
                            linkedHashMap = new LinkedHashMap();
                            while (r3.hasNext()) {
                                LocalDate localDate3 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(((ActivityListItemDTO) obj11).f29259e).toLocalDate();
                                pi0.e eVar4 = new pi0.e(context);
                                localDate3.getClass();
                                strD = eVar4.d(localDate3, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                                arrayList2 = linkedHashMap.get(strD);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    linkedHashMap.put(strD, arrayList2);
                                }
                                ((List) arrayList2).add(obj11);
                            }
                            ku1.d.a(oVar2, linkedHashMap, mVar2, 6);
                            mVar2.y();
                            x1 x1Var3 = p3.n.f135158a;
                        }
                        str2 = string;
                        mVar2.C(-723878895);
                        aVar = p3.m.f135153a;
                        if (str2 != null) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar5 = j92.b.f97899b;
                            h4.r rVarC4 = c2.l.C(c2.l.A(aVar11, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97920e, 0.0f, 0.0f, 13);
                            zB = mVar2.B(aVar10);
                            objQ2 = mVar2.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new rk0.y(aVar10, 9);
                                    mVar2.K(objQ2);
                                }
                            } else {
                                objQ2 = new rk0.y(aVar10, 9);
                                mVar2.K(objQ2);
                            }
                            ku1.j.a(0, (e23.a) objQ2, rVarC4, str2, strJ, strJ, mVar2);
                        }
                        mVar2.f();
                        if (mVar3.e0()) {
                            mVar2.C(-964887440);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            rw1.d.a(mVar, c2.l.A(aVar11, j92.b.f97899b.f97920e, 0.0f, 2), aVar7, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-964667371);
                            mVar2.f();
                        }
                        if (mVar3.e0()) {
                            dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                        } else {
                            dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                        }
                        dateTimeWithTimeAtStartOfDay.getClass();
                        DateTime dateTimeO4 = g22.k.o(i17, dateTimeWithTimeAtStartOfDay);
                        DateTime dateTimeA3 = g22.k.A(g22.k.b(i17, dateTimeWithTimeAtStartOfDay));
                        boolean zE2 = mVar3.e0();
                        kVar = aVar7.f161089e;
                        Double d18 = aVar7.f161092h;
                        Double d19 = aVar7.f161091g;
                        if (kVar == null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        fg0.t tVar3 = aVar7.f161090f;
                        Interval interval3 = new Interval(dateTimeO4, dateTimeA3);
                        arrayListD1 = h0.d1(j0.f134944a);
                        aVar2 = new f0.a(gg.b.Q(interval3));
                        while (aVar2.hasNext()) {
                            dateTime = (DateTime) aVar2.next();
                            arrayListY = mVar3.y();
                            if (arrayListY != null) {
                                it = arrayListY.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        aVar4 = aVar2;
                                        dateTimeJ = ((tw1.j) next).j();
                                        if (dateTimeJ != null) {
                                            aVar5 = aVar;
                                            z17 = true;
                                            if (g22.k.f(dateTimeJ, dateTime)) {
                                            }
                                        } else {
                                            aVar5 = aVar;
                                        }
                                        aVar2 = aVar4;
                                        aVar = aVar5;
                                    } else {
                                        aVar4 = aVar2;
                                        aVar5 = aVar;
                                        z17 = true;
                                        next = str;
                                    }
                                }
                                r24 = (tw1.j) next;
                            } else {
                                aVar4 = aVar2;
                                aVar5 = aVar;
                                z17 = true;
                                r24 = str;
                            }
                            if (r24 == 0) {
                            }
                            if (r24 != 0) {
                                associatedActivityId = r24.getAssociatedActivityId();
                            } else {
                                associatedActivityId = str;
                            }
                            if (associatedActivityId != null) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            arrayListD1.add(new lu1.e(T, dateTime, z18, g22.k.f(dateTime, mVar3.o()), g22.k.k(dateTime), false, null, false, false, 448, null));
                            aVar2 = aVar4;
                            aVar = aVar5;
                        }
                        aVar3 = aVar;
                        zR = mVar2.r(mVar) | mVar2.r(aVar7);
                        objQ = mVar2.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new rk0.f(12, mVar, aVar7);
                                mVar2.K(objQ);
                            }
                        } else {
                            objQ = new rk0.f(12, mVar, aVar7);
                            mVar2.K(objQ);
                        }
                        ku1.c.a(zE2, kVar, d18, d19, z16, tVar3, dateTimeO4, dateTimeA3, arrayListD1, (e23.a) objQ, aVar8, aVar9, mVar2, (fg0.k.X << 6) | 6 | (fg0.t.f71346c << 18));
                        vt1.o oVar3 = vt1.o.f180176g;
                        List<ActivityListItemDTO> list3 = aVar7.f161093i;
                        arrayList = new ArrayList();
                        while (r3.hasNext()) {
                            if (((ActivityListItemDTO) obj10).f29259e != null) {
                                arrayList.add(obj10);
                            }
                        }
                        List listN2 = h0.N0(arrayList, new sw1.b());
                        linkedHashMap = new LinkedHashMap();
                        while (r3.hasNext()) {
                            LocalDate localDate4 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(((ActivityListItemDTO) obj11).f29259e).toLocalDate();
                            pi0.e eVar6 = new pi0.e(context);
                            localDate4.getClass();
                            strD = eVar6.d(localDate4, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                            arrayList2 = linkedHashMap.get(strD);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap.put(strD, arrayList2);
                            }
                            ((List) arrayList2).add(obj11);
                        }
                        ku1.d.a(oVar3, linkedHashMap, mVar2, 6);
                        mVar2.y();
                        x1 x1Var4 = p3.n.f135158a;
                    } else {
                        str = null;
                        z14 = true;
                    }
                    if (gVar5 != null && gVar5.contains(localDate) == z14) {
                        r14 = gVar5;
                    } else if (gVar4 == null || gVar4.contains(localDate) != z14) {
                        r14 = gVar4;
                        r14 = str;
                    }
                    if (r14 != 0) {
                        fy1.i.a aVar14 = fy1.i.f73924a;
                        DateTime dateTimeAtStartOfDay3 = ((LocalDate) r14.getStart()).toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay3.getClass();
                        DateTime dateTimeAtStartOfDay4 = ((LocalDate) r14.b()).toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay4.getClass();
                        aVar14.getClass();
                        strJ = fy1.i.a.j(context, dateTimeAtStartOfDay3, dateTimeAtStartOfDay4);
                    } else {
                        strJ = str;
                    }
                    dVarF = vw1.c.f(mVar3);
                    gVar = dVarF.f180564a;
                    if (gVar != null) {
                        z15 = true;
                        if (gVar.contains(localDate)) {
                            string = context.getString(R.string.itp_base_phase_name);
                        }
                        str2 = string;
                        mVar2.C(-723878895);
                        aVar = p3.m.f135153a;
                        if (str2 != null) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar7 = j92.b.f97899b;
                            h4.r rVarC5 = c2.l.C(c2.l.A(aVar11, eVar7.f97920e, 0.0f, 2), 0.0f, eVar7.f97920e, 0.0f, 0.0f, 13);
                            zB = mVar2.B(aVar10);
                            objQ2 = mVar2.q();
                            if (zB) {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new rk0.y(aVar10, 9);
                                    mVar2.K(objQ2);
                                }
                            } else {
                                objQ2 = new rk0.y(aVar10, 9);
                                mVar2.K(objQ2);
                            }
                            ku1.j.a(0, (e23.a) objQ2, rVarC5, str2, strJ, strJ, mVar2);
                        }
                        mVar2.f();
                        if (mVar3.e0()) {
                            mVar2.C(-964887440);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            rw1.d.a(mVar, c2.l.A(aVar11, j92.b.f97899b.f97920e, 0.0f, 2), aVar7, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-964667371);
                            mVar2.f();
                        }
                        if (mVar3.e0()) {
                            dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                        } else {
                            dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                        }
                        dateTimeWithTimeAtStartOfDay.getClass();
                        DateTime dateTimeO5 = g22.k.o(i17, dateTimeWithTimeAtStartOfDay);
                        DateTime dateTimeA4 = g22.k.A(g22.k.b(i17, dateTimeWithTimeAtStartOfDay));
                        boolean zE3 = mVar3.e0();
                        kVar = aVar7.f161089e;
                        Double d110 = aVar7.f161092h;
                        Double d111 = aVar7.f161091g;
                        if (kVar == null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        fg0.t tVar4 = aVar7.f161090f;
                        Interval interval4 = new Interval(dateTimeO5, dateTimeA4);
                        arrayListD1 = h0.d1(j0.f134944a);
                        aVar2 = new f0.a(gg.b.Q(interval4));
                        while (aVar2.hasNext()) {
                            dateTime = (DateTime) aVar2.next();
                            arrayListY = mVar3.y();
                            if (arrayListY != null) {
                                it = arrayListY.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        aVar4 = aVar2;
                                        dateTimeJ = ((tw1.j) next).j();
                                        if (dateTimeJ != null) {
                                            aVar5 = aVar;
                                            z17 = true;
                                            if (g22.k.f(dateTimeJ, dateTime)) {
                                            }
                                        } else {
                                            aVar5 = aVar;
                                        }
                                        aVar2 = aVar4;
                                        aVar = aVar5;
                                    } else {
                                        aVar4 = aVar2;
                                        aVar5 = aVar;
                                        z17 = true;
                                        next = str;
                                    }
                                }
                                r24 = (tw1.j) next;
                            } else {
                                aVar4 = aVar2;
                                aVar5 = aVar;
                                z17 = true;
                                r24 = str;
                            }
                            if (r24 == 0) {
                            }
                            if (r24 != 0) {
                                associatedActivityId = r24.getAssociatedActivityId();
                            } else {
                                associatedActivityId = str;
                            }
                            if (associatedActivityId != null) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            arrayListD1.add(new lu1.e(T, dateTime, z18, g22.k.f(dateTime, mVar3.o()), g22.k.k(dateTime), false, null, false, false, 448, null));
                            aVar2 = aVar4;
                            aVar = aVar5;
                        }
                        aVar3 = aVar;
                        zR = mVar2.r(mVar) | mVar2.r(aVar7);
                        objQ = mVar2.q();
                        if (zR) {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new rk0.f(12, mVar, aVar7);
                                mVar2.K(objQ);
                            }
                        } else {
                            objQ = new rk0.f(12, mVar, aVar7);
                            mVar2.K(objQ);
                        }
                        ku1.c.a(zE3, kVar, d110, d111, z16, tVar4, dateTimeO5, dateTimeA4, arrayListD1, (e23.a) objQ, aVar8, aVar9, mVar2, (fg0.k.X << 6) | 6 | (fg0.t.f71346c << 18));
                        vt1.o oVar4 = vt1.o.f180176g;
                        List<ActivityListItemDTO> list4 = aVar7.f161093i;
                        arrayList = new ArrayList();
                        while (r3.hasNext()) {
                            if (((ActivityListItemDTO) obj10).f29259e != null) {
                                arrayList.add(obj10);
                            }
                        }
                        List listN3 = h0.N0(arrayList, new sw1.b());
                        linkedHashMap = new LinkedHashMap();
                        while (r3.hasNext()) {
                            LocalDate localDate5 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(((ActivityListItemDTO) obj11).f29259e).toLocalDate();
                            pi0.e eVar8 = new pi0.e(context);
                            localDate5.getClass();
                            strD = eVar8.d(localDate5, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                            arrayList2 = linkedHashMap.get(strD);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap.put(strD, arrayList2);
                            }
                            ((List) arrayList2).add(obj11);
                        }
                        ku1.d.a(oVar4, linkedHashMap, mVar2, 6);
                        mVar2.y();
                        x1 x1Var5 = p3.n.f135158a;
                    } else {
                        z15 = true;
                    }
                    gVar2 = dVarF.f180565b;
                    if (gVar2 == null) {
                        gVar3 = dVarF.f180566c;
                        if (gVar3 == null) {
                        }
                        str2 = str;
                    } else {
                        gVar3 = dVarF.f180566c;
                        if (gVar3 == null) {
                        }
                        str2 = str;
                    }
                    mVar2.C(-723878895);
                    aVar = p3.m.f135153a;
                    if (str2 != null) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar9 = j92.b.f97899b;
                        h4.r rVarC6 = c2.l.C(c2.l.A(aVar11, eVar9.f97920e, 0.0f, 2), 0.0f, eVar9.f97920e, 0.0f, 0.0f, 13);
                        zB = mVar2.B(aVar10);
                        objQ2 = mVar2.q();
                        if (zB) {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new rk0.y(aVar10, 9);
                                mVar2.K(objQ2);
                            }
                        } else {
                            objQ2 = new rk0.y(aVar10, 9);
                            mVar2.K(objQ2);
                        }
                        ku1.j.a(0, (e23.a) objQ2, rVarC6, str2, strJ, strJ, mVar2);
                    }
                    mVar2.f();
                    if (mVar3.e0()) {
                        mVar2.C(-964887440);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        rw1.d.a(mVar, c2.l.A(aVar11, j92.b.f97899b.f97920e, 0.0f, 2), aVar7, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-964667371);
                        mVar2.f();
                    }
                    if (mVar3.e0()) {
                        dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                    } else {
                        dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                    }
                    dateTimeWithTimeAtStartOfDay.getClass();
                    DateTime dateTimeO6 = g22.k.o(i17, dateTimeWithTimeAtStartOfDay);
                    DateTime dateTimeA5 = g22.k.A(g22.k.b(i17, dateTimeWithTimeAtStartOfDay));
                    boolean zE4 = mVar3.e0();
                    kVar = aVar7.f161089e;
                    Double d112 = aVar7.f161092h;
                    Double d113 = aVar7.f161091g;
                    if (kVar == null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    fg0.t tVar5 = aVar7.f161090f;
                    Interval interval5 = new Interval(dateTimeO6, dateTimeA5);
                    arrayListD1 = h0.d1(j0.f134944a);
                    aVar2 = new f0.a(gg.b.Q(interval5));
                    while (aVar2.hasNext()) {
                        dateTime = (DateTime) aVar2.next();
                        arrayListY = mVar3.y();
                        if (arrayListY != null) {
                            it = arrayListY.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    aVar4 = aVar2;
                                    dateTimeJ = ((tw1.j) next).j();
                                    if (dateTimeJ != null) {
                                        aVar5 = aVar;
                                        z17 = true;
                                        if (g22.k.f(dateTimeJ, dateTime)) {
                                        }
                                    } else {
                                        aVar5 = aVar;
                                    }
                                    aVar2 = aVar4;
                                    aVar = aVar5;
                                } else {
                                    aVar4 = aVar2;
                                    aVar5 = aVar;
                                    z17 = true;
                                    next = str;
                                }
                            }
                            r24 = (tw1.j) next;
                        } else {
                            aVar4 = aVar2;
                            aVar5 = aVar;
                            z17 = true;
                            r24 = str;
                        }
                        if (r24 == 0) {
                        }
                        if (r24 != 0) {
                            associatedActivityId = r24.getAssociatedActivityId();
                        } else {
                            associatedActivityId = str;
                        }
                        if (associatedActivityId != null) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        arrayListD1.add(new lu1.e(T, dateTime, z18, g22.k.f(dateTime, mVar3.o()), g22.k.k(dateTime), false, null, false, false, 448, null));
                        aVar2 = aVar4;
                        aVar = aVar5;
                    }
                    aVar3 = aVar;
                    zR = mVar2.r(mVar) | mVar2.r(aVar7);
                    objQ = mVar2.q();
                    if (zR) {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new rk0.f(12, mVar, aVar7);
                            mVar2.K(objQ);
                        }
                    } else {
                        objQ = new rk0.f(12, mVar, aVar7);
                        mVar2.K(objQ);
                    }
                    ku1.c.a(zE4, kVar, d112, d113, z16, tVar5, dateTimeO6, dateTimeA5, arrayListD1, (e23.a) objQ, aVar8, aVar9, mVar2, (fg0.k.X << 6) | 6 | (fg0.t.f71346c << 18));
                    vt1.o oVar5 = vt1.o.f180176g;
                    List<ActivityListItemDTO> list5 = aVar7.f161093i;
                    arrayList = new ArrayList();
                    while (r3.hasNext()) {
                        if (((ActivityListItemDTO) obj10).f29259e != null) {
                            arrayList.add(obj10);
                        }
                    }
                    List listN4 = h0.N0(arrayList, new sw1.b());
                    linkedHashMap = new LinkedHashMap();
                    while (r3.hasNext()) {
                        LocalDate localDate6 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(((ActivityListItemDTO) obj11).f29259e).toLocalDate();
                        pi0.e eVar10 = new pi0.e(context);
                        localDate6.getClass();
                        strD = eVar10.d(localDate6, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                        arrayList2 = linkedHashMap.get(strD);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(strD, arrayList2);
                        }
                        ((List) arrayList2).add(obj11);
                    }
                    ku1.d.a(oVar5, linkedHashMap, mVar2, 6);
                    mVar2.y();
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                sk0.y0.d((h1) obj9, (o0) obj5, (e23.a) obj3, (e23.l) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                t21.b.c((u21.c) obj9, (v21.e) obj5, (e23.l) obj3, (e23.l) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                t21.m.a((u21.l0) obj9, (v21.e) obj5, (e23.l) obj3, (e23.l) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ta0.m.a((String) obj5, (o90.a) obj9, (String) obj3, (String) obj8, (e23.l) obj7, (e23.l) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ta0.v0.a((String) obj5, (o90.a) obj9, (ArrayList) obj8, (e23.l) obj7, (String) obj3, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).intValue();
                ta0.h1.b((zb0.l) obj9, (List) obj3, (String) obj5, (e23.l) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                o72.t.g((uc.g) obj9, (xc.e) obj5, (h4.r) obj3, (h4.d) obj8, (e23.l) obj7, (e23.l) obj6, (e23.p) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                vz1.k.b((DateTime) obj9, (DateTime) obj5, (oz1.a) obj3, (sz1.t) obj8, (oz1.b) obj7, (mc) obj6, (o53.b0) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).intValue();
                w11.i.a((x11.f) obj9, (v21.e) obj5, (fe) obj3, (e23.l) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                wn0.g.g((u82.f) obj9, (wn0.l) obj5, (e23.a) obj3, (nk0.l) obj8, (e23.a) obj7, (nk0.l) obj6, (nk0.l) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                yz1.k.b((h4.r) obj9, (yz1.d) obj3, (u4.d) obj8, (z3.e) obj7, (e23.a) obj6, (String) obj5, (yz1.i) obj4, (p3.m) obj, p0.t(i17 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity, List list, d62.i iVar, String str, e23.l lVar, e23.a aVar, e23.a aVar2, int i14) {
        this.f28033a = 4;
        this.f28036d = workoutActivityProfileSelectionActivity;
        this.f28037e = list;
        this.f28038f = iVar;
        this.f28034b = str;
        this.f28039g = lVar;
        this.f28040h = aVar;
        this.f28041i = aVar2;
        this.f28035c = i14;
    }

    public /* synthetic */ o(h4.r rVar, c2.j.e eVar, int i14, Object obj, ArrayList arrayList, x0 x0Var, e23.q qVar, e23.l lVar, int i15) {
        this.f28033a = 5;
        this.f28036d = rVar;
        this.f28034b = eVar;
        this.f28035c = i14;
        this.f28037e = obj;
        this.f28038f = arrayList;
        this.f28039g = x0Var;
        this.f28040h = qVar;
        this.f28041i = lVar;
    }

    public /* synthetic */ o(h4.r rVar, String str, i53.c cVar, e23.l lVar, String str2, e23.a aVar, e23.l lVar2, int i14, int i15) {
        this.f28033a = 3;
        this.f28036d = rVar;
        this.f28034b = str;
        this.f28038f = cVar;
        this.f28039g = lVar;
        this.f28037e = str2;
        this.f28040h = aVar;
        this.f28041i = lVar2;
        this.f28035c = i14;
    }

    public /* synthetic */ o(h4.r rVar, l0 l0Var, e23.l lVar, ri riVar, int i14, a2 a2Var, z1 z1Var, ph phVar, int i15) {
        this.f28033a = 10;
        this.f28036d = rVar;
        this.f28034b = l0Var;
        this.f28037e = lVar;
        this.f28038f = riVar;
        this.f28035c = i14;
        this.f28039g = a2Var;
        this.f28040h = z1Var;
        this.f28041i = phVar;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i14, int i15) {
        this.f28033a = i15;
        this.f28036d = obj;
        this.f28034b = obj2;
        this.f28037e = obj3;
        this.f28038f = obj4;
        this.f28039g = obj5;
        this.f28040h = obj6;
        this.f28041i = obj7;
        this.f28035c = i14;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, Object obj6, int i14, int i15) {
        this.f28033a = i15;
        this.f28036d = obj;
        this.f28037e = obj2;
        this.f28038f = obj3;
        this.f28039g = obj4;
        this.f28040h = obj5;
        this.f28034b = str;
        this.f28041i = obj6;
        this.f28035c = i14;
    }

    public /* synthetic */ o(String str, Object obj, Object obj2, Object obj3, Object obj4, e23.l lVar, e23.a aVar, int i14, int i15) {
        this.f28033a = i15;
        this.f28034b = str;
        this.f28036d = obj;
        this.f28037e = obj2;
        this.f28038f = obj3;
        this.f28039g = obj4;
        this.f28040h = lVar;
        this.f28041i = aVar;
        this.f28035c = i14;
    }

    public /* synthetic */ o(String str, String str2, i53.c cVar, String str3, e23.p pVar, e23.a aVar, e23.l lVar, int i14) {
        this.f28033a = 16;
        this.f28034b = str;
        this.f28037e = str2;
        this.f28036d = cVar;
        this.f28038f = str3;
        this.f28039g = pVar;
        this.f28040h = aVar;
        this.f28041i = lVar;
        this.f28035c = i14;
    }

    public /* synthetic */ o(String str, o90.a aVar, ArrayList arrayList, e23.l lVar, String str2, e23.a aVar2, e23.a aVar3, int i14) {
        this.f28033a = 23;
        this.f28034b = str;
        this.f28036d = aVar;
        this.f28038f = arrayList;
        this.f28039g = lVar;
        this.f28037e = str2;
        this.f28040h = aVar2;
        this.f28041i = aVar3;
        this.f28035c = i14;
    }

    public /* synthetic */ o(sw1.a aVar, int i14, LocalDate localDate, Context context, androidx.fragment.app.m mVar, e23.a aVar2, e23.a aVar3, e23.a aVar4) {
        this.f28033a = 18;
        this.f28036d = aVar;
        this.f28035c = i14;
        this.f28034b = localDate;
        this.f28037e = context;
        this.f28038f = mVar;
        this.f28039g = aVar2;
        this.f28040h = aVar3;
        this.f28041i = aVar4;
    }

    public /* synthetic */ o(zb0.l lVar, List list, String str, e23.l lVar2, e23.l lVar3, e23.a aVar, e23.a aVar2, int i14) {
        this.f28033a = 24;
        this.f28036d = lVar;
        this.f28037e = list;
        this.f28034b = str;
        this.f28038f = lVar2;
        this.f28039g = lVar3;
        this.f28040h = aVar;
        this.f28041i = aVar2;
        this.f28035c = i14;
    }
}

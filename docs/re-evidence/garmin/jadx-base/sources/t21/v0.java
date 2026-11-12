package t21;

import android.content.Context;
import android.content.res.Resources;
import android.util.LongSparseArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideEnabledActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import com.garmin.android.library.livetrack.LivetrackService;
import f72.a2;
import fe2.p1;
import i3.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import v2.w1;
import v62.e9;
import z2.h2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f161968b;

    public /* synthetic */ v0(Object obj, int i14) {
        this.f161967a = i14;
        this.f161968b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        xn.k kVar = (xn.k) this.f161968b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = xn.k.f191611f;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            kVar.g(mVar, h82.c.f82429e);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0376  */
    /* JADX WARN: Code duplicated, block: B:258:0x064e  */
    /* JADX WARN: Code duplicated, block: B:448:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v110, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v114, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v25, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r6v27, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? C;
        Object obj4;
        int i14 = this.f161967a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 3;
        String str = null;
        int i16 = 2;
        z = true;
        z = true;
        boolean z14 = true;
        boolean z15 = true;
        Object obj5 = this.f161968b;
        switch (i14) {
            case 0:
                String strP = (String) obj;
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                strP.getClass();
                mVar.C(-1783720920);
                x1 x1Var = p3.n.f135158a;
                if (strP.equals(((s21.u) obj5).f156180e)) {
                    mVar.C(-1494469686);
                    strP = gl1.y.P(R.string.lbl_language_recommendation, new Object[]{strP}, mVar);
                    mVar.f();
                } else {
                    mVar.C(-1494354304);
                    mVar.f();
                }
                mVar.f();
                return strP;
            case 1:
                BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView = (BenchmarkExerciseOneRepMaxView) obj5;
                h4.r rVar = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                int i17 = BenchmarkExerciseOneRepMaxView.f48406i;
                rVar.getClass();
                mVar2.C(456575675);
                x1 x1Var2 = p3.n.f135158a;
                boolean zR = mVar2.r(benchmarkExerciseOneRepMaxView);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new t52.b(benchmarkExerciseOneRepMaxView, 1);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new t52.b(benchmarkExerciseOneRepMaxView, 1);
                        mVar2.K(objQ);
                    }
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, rVar, false);
                mVar2.f();
                return rVarC;
            case 2:
                sg1.d dVar = (sg1.d) obj5;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String str2 = dVar.f159214d;
                    String strP2 = gl1.y.P(R.string.lbl_device_migration_backup_list_footer, new Object[]{str2 != null ? str2 : ""}, mVar3);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
                    d92.b.f58624b.getClass();
                    mh.c(strP2, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar3), mVar3, 0, 0, 131068);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                yl.c cVar = (yl.c) obj5;
                Float f14 = (Float) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar4.B(f14) ? 4 : 2;
                }
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    yl.b bVar = cVar != null ? cVar.f197638f.get(f14 != null ? Integer.valueOf((int) f14.floatValue()) : null) : null;
                    if (bVar == null) {
                        mVar4.C(-545826369);
                        mVar4.f();
                    } else {
                        mVar4.C(-545826368);
                        h4.r.a aVar3 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarY2 = c2.l.y(u1.n.e(l4.k.b(aVar3, k2.i.a(eVar.f97918c)), d92.b.a(mVar4).c().g(), m1.f128891a), eVar.f97918c);
                        c2.j jVar = c2.j.f22691a;
                        float f15 = eVar.f97920e;
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(f15);
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, mVar4, 0);
                        int iHashCode = Long.hashCode(mVar4.getU());
                        i2 i2VarX = mVar4.x();
                        h4.r rVarC2 = h4.k.c(rVarY2, mVar4);
                        h5.g.V.getClass();
                        h5.e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar4.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar4);
                        } else {
                            mVar4.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                        u2 u2Var = u2.f22900a;
                        tl.e.a(bVar, mVar4, 0);
                        mVar4.y();
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                tn.u uVar = (tn.u) obj5;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i18 = tn.u.f165495e;
                ((e2.d) obj).getClass();
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    b82.n.d(a2.a(t62.c.f162799a), gl1.y.Q(mVar5, R.string.lbl_no_health_snapshots), gl1.y.Q(mVar5, R.string.msg_health_snapshot_general_info), x2.d(h4.r.S, 1.0f), gl1.y.Q(mVar5, R.string.common_learn_more), uVar.f165497b, null, null, mVar5, 3072, 192);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Long l14 = (Long) obj2;
                String str3 = (String) obj3;
                ut1.e eVar2 = ((ActiveTrainingPlansActivity) obj5).f45108n;
                if (eVar2 != null) {
                    ge1.b.T(v1.a(eVar2), null, null, new ut1.c(eVar2, zBooleanValue, l14, str3, null), 3);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            case 6:
                o13.u uVar2 = (o13.u) obj5;
                t2 t2Var = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar6.B(t2Var) ? 4 : 2;
                }
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String str4 = (String) uVar2.f128605a;
                    String str5 = (String) uVar2.f128606b;
                    String str6 = (String) uVar2.f128607c;
                    int i19 = iIntValue4 & 14;
                    int i24 = l72.x0.f111348c;
                    x0Var.a(i19 | (i24 << 24), 116, null, t2Var, null, null, str4, str5, str6, null, mVar6);
                    x0Var.h(t2Var, mVar6, i19 | (i24 << 3));
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                kw.i iVar = (kw.i) obj5;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    for (Map.Entry<kw.b, kw.f> entry : iVar.f106860b.f106878b.entrySet()) {
                        if (entry.getKey() == kw.b.FIVE) {
                            List<kw.l> listD = iVar.f106859a.d();
                            if (listD != null) {
                                C = new ArrayList();
                                Iterator it = listD.iterator();
                                while (it.hasNext()) {
                                    String categoryName = ((kw.l) it.next()).getCategoryName();
                                    if (categoryName != null) {
                                        C.add(categoryName);
                                    }
                                }
                            } else {
                                C = p13.w.c("");
                            }
                            Iterator it3 = C.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (p005kotlin.jvm.internal.s.g((String) it3.next(), "HYPERTENSIVE_CRISIS")) {
                                        mVar7.C(-1948640526);
                                        tw.d.a(entry.getValue().f106844i, 0, entry.getValue().f106837b, mVar7);
                                        mVar7.f();
                                    }
                                }
                            }
                        }
                        if (entry.getKey() != kw.b.FIVE) {
                            mVar7.C(-1948483790);
                            tw.d.a(entry.getValue().f106844i, 0, entry.getValue().f106837b, mVar7);
                            mVar7.f();
                        } else {
                            mVar7.C(-1948386729);
                            mVar7.f();
                        }
                    }
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                u40.k kVar = (u40.k) obj5;
                RecyclerView.f0 f0Var = (RecyclerView.f0) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj3;
                int i25 = u40.k.f168576g;
                f0Var.getClass();
                fVar.getClass();
                if (f0Var instanceof u40.k.d) {
                    GCMCheckableRow gCMCheckableRow = ((u40.k.d) f0Var).f168584a;
                    gCMCheckableRow.setChecked(fVar == kVar.f168579f);
                    gCMCheckableRow.setOnClickListener(new u12.e(i15, kVar, fVar));
                }
                return Unit.INSTANCE;
            case 9:
                Map map = (Map) obj5;
                sc.h hVar = (sc.h) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar8.B(hVar) ? 4 : 2;
                }
                if (mVar8.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    Object obj6 = hVar.f158452b;
                    if (((Set) mVar8.A(uc.f.f169925a)).contains(obj6)) {
                        mVar8.C(1572214353);
                    } else {
                        mVar8.C(1574916499);
                        mVar8.N(1159182959, obj6);
                        Object objQ2 = mVar8.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            Object obj7 = map.get(obj6);
                            if (obj7 == null) {
                                uc.a.f169921a.getClass();
                                z3.e eVar3 = new z3.e(1032736913, true, new o62.s0(new p3.h1(uc.a.f169922b), i16));
                                map.put(obj6, eVar3);
                                obj7 = eVar3;
                            }
                            objQ2 = (e23.q) obj7;
                            mVar8.K(objQ2);
                        }
                        ((e23.q) objQ2).invoke(z3.f.c(-804085656, new sc.g(hVar, 3, (byte) 0), mVar8), mVar8, 54);
                        mVar8.Q();
                    }
                    mVar8.f();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                dy1.m mVar9 = (dy1.m) obj5;
                t2 t2Var2 = (t2) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar10.B(t2Var2) ? 4 : 2;
                }
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    r22.p pVar = mVar9.f61577a;
                    String str7 = pVar.f149774a;
                    String str8 = pVar.f149776c;
                    int i26 = (iIntValue7 & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i26, 124, null, t2Var2, null, null, str7, str8, null, null, mVar10);
                    r22.p pVar2 = mVar9.f61578b;
                    x0Var2.a(i26, 124, null, t2Var2, null, null, pVar2.f149774a, pVar2.f149776c, null, null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                v2.y yVar = (v2.y) obj5;
                int iIntValue8 = ((Integer) obj).intValue();
                int iIntValue9 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue2) {
                    iIntValue8 = yVar.f175260i.a(iIntValue8);
                }
                if (!zBooleanValue2) {
                    iIntValue9 = yVar.f175260i.a(iIntValue9);
                }
                if (yVar.f175258g) {
                    long j8 = yVar.f175255d.f188879b;
                    s5.w0.a aVar5 = s5.w0.f157315b;
                    if (iIntValue8 == ((int) (j8 >> 32)) && iIntValue9 == ((int) (4294967295L & j8))) {
                        z15 = false;
                    } else if (Math.min(iIntValue8, iIntValue9) < 0 || Math.max(iIntValue8, iIntValue9) > yVar.f175255d.f188878a.f157138b.length()) {
                        h2 h2Var = yVar.f175261j;
                        h2Var.D(false);
                        h2Var.z(p006l2.m1.None);
                        z15 = false;
                    } else {
                        if (zBooleanValue2 || iIntValue8 == iIntValue9) {
                            h2 h2Var2 = yVar.f175261j;
                            h2Var2.D(false);
                            h2Var2.z(p006l2.m1.None);
                        } else {
                            yVar.f175261j.n(true);
                        }
                        yVar.f175256e.f108412v.invoke(new x5.l0(yVar.f175255d.f188878a, og.a.l(iIntValue8, iIntValue9), (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    }
                } else {
                    z15 = false;
                }
                return Boolean.valueOf(z15);
            case 12:
                w1 w1Var = (w1) obj5;
                int iIntValue10 = ((Integer) obj).intValue();
                int iIntValue11 = ((Integer) obj2).intValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                v2.h2 h2Var3 = w1Var.f175192c;
                u2.e eVarB = zBooleanValue3 ? h2Var3.f175039a.b() : h2Var3.d();
                long j14 = eVarB.f167840d;
                if (!w1Var.f175195f || Math.min(iIntValue10, iIntValue11) < 0 || Math.max(iIntValue10, iIntValue11) > eVarB.f167839c.length()) {
                    z14 = false;
                } else {
                    s5.w0.a aVar6 = s5.w0.f157315b;
                    if (iIntValue10 != ((int) (j14 >> 32)) || iIntValue11 != ((int) (4294967295L & j14))) {
                        long jL = og.a.l(iIntValue10, iIntValue11);
                        if (zBooleanValue3 || iIntValue10 == iIntValue11) {
                            w1Var.f175194e.D(w2.j0.None);
                        } else {
                            w1Var.f175194e.D(w2.j0.Selection);
                        }
                        v2.h2 h2Var4 = w1Var.f175192c;
                        if (zBooleanValue3) {
                            h2Var4.k(jL);
                        } else {
                            h2Var4.j(jL);
                        }
                    }
                }
                return Boolean.valueOf(z14);
            case 13:
                vg1.c cVar2 = (vg1.c) obj5;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i27 = vg1.c.f178079f;
                if (mVar11.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    cVar2.g(mVar11, h82.c.f82429e);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 14:
                vx1.d dVar2 = (vx1.d) obj5;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i28 = vx1.d.f180657g;
                if (mVar12.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    dVar2.g(mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 15:
                vx1.e eVar4 = (vx1.e) obj5;
                ?? r14 = (h82.r) obj;
                ?? r15 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i29 = vx1.e.f180659j;
                r14.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= r15.B(r14) ? 4 : 2;
                }
                if (r15.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String str9 = eVar4.f180660f;
                    if (str9 == null) {
                        p005kotlin.jvm.internal.s.m("title");
                        throw null;
                    }
                    int i30 = (iIntValue14 << 6) & 896;
                    r14.E(str9, r15, i30);
                    r14.l(R.string.lbl_get_fit_help_body, i30, 2, null, r15);
                } else {
                    r15.e();
                }
                return Unit.INSTANCE;
            case 16:
                ix1.g gVar = (ix1.g) obj5;
                ?? r16 = (h82.r) obj;
                ?? r17 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i34 = vx1.e.f180659j;
                r16.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= r17.B(r16) ? 4 : 2;
                }
                if (r17.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var14 = p3.n.f135158a;
                    r16.D(gVar.f95742a, r17, (iIntValue15 << 3) & 112);
                    r16.o(gVar.f95743b, (iIntValue15 << 6) & 896, 2, null, r17);
                } else {
                    r17.e();
                }
                return Unit.INSTANCE;
            case 17:
                b63.o oVar = (b63.o) obj5;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar13.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    w51.v.c(oVar, mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 18:
                wd0.c cVar3 = (wd0.c) obj5;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                int i35 = wd0.c.f184361f;
                if (mVar14.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var16 = p3.n.f135158a;
                    cVar3.g(mVar14, h82.c.f82429e);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 19:
                LivetrackService livetrackService = (LivetrackService) obj5;
                de2.g0.a aVar7 = (de2.g0.a) obj;
                long jLongValue = ((Long) obj2).longValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                int i36 = LivetrackService.f50160k;
                aVar7.getClass();
                Logger logger = livetrackService.f50162b;
                LongSparseArray<p1> longSparseArray = livetrackService.f50167g;
                logger.debug("Processing event from device " + aVar7 + " and device unit id " + jLongValue);
                if (aVar7.equals(de2.g0.a.b.f59293a)) {
                    wd2.l lVar = livetrackService.f50164d;
                    if (lVar == null) {
                        p005kotlin.jvm.internal.s.m("applicationDelegate");
                        throw null;
                    }
                    livetrackService.e(jLongValue, zBooleanValue4, null, lVar);
                } else if (aVar7.equals(de2.g0.a.c.f59294a)) {
                    p1 p1Var = longSparseArray.get(jLongValue);
                    if (p1Var != null) {
                        p1Var.m();
                    }
                } else if (aVar7.equals(de2.g0.a.d.f59295a)) {
                    livetrackService.j(jLongValue, com.garmin.android.library.livetrack.i.b.f50229a);
                } else {
                    if (!aVar7.equals(de2.g0.a.C1266a.f59292a)) {
                        lc.u0.r();
                        return null;
                    }
                    wr.g.w("cancelAutoStart ", jLongValue, logger);
                    if (longSparseArray.indexOfKey(jLongValue) >= 0) {
                        ge1.b.T(livetrackService, null, null, new com.garmin.android.library.livetrack.e(livetrackService, jLongValue, null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 20:
                LivetrackGroupRideEnabledActivity livetrackGroupRideEnabledActivity = (LivetrackGroupRideEnabledActivity) obj5;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                int i37 = LivetrackGroupRideEnabledActivity.f38673a;
                ((t2) obj).getClass();
                if (mVar15.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    s5.c cVar4 = new s5.c(gl1.y.Q(mVar15, R.string.lbl_dismiss), null, 2, null);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarA = s5.x0.a(j92.f.f97932i, ds.e0.e(mVar15), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = c2.l.C(aVar8, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11);
                    boolean zR2 = mVar15.r(livetrackGroupRideEnabledActivity);
                    Object objQ3 = mVar15.q();
                    if (zR2) {
                        objQ3 = new vu1.b(livetrackGroupRideEnabledActivity, 23);
                        mVar15.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new vu1.b(livetrackGroupRideEnabledActivity, 23);
                            mVar15.K(objQ3);
                        }
                    }
                    p006l2.c0.a(cVar4, rVarC3, x0VarA, false, 0, 0, null, (e23.l) objQ3, mVar15, 0, 120);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 21:
                dy1.p pVar3 = (dy1.p) obj5;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar16.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    x1 x1Var18 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar16, R.string.common_end_date);
                    pVar3.getClass();
                    Long l15 = pVar3.f61602h;
                    if (l15 == null) {
                        mVar16.C(493660499);
                        mVar16.f();
                    } else {
                        mVar16.C(493660500);
                        pi0.e eVar5 = new pi0.e((Context) mVar16.A(AndroidCompositionLocals_androidKt.f6042b));
                        LocalDateTime localDateTime = new DateTime(l15.longValue(), DateTimeZone.UTC).toLocalDateTime();
                        localDateTime.getClass();
                        qi0.a aVar9 = qi0.a.RELATIVE_YEAR_MONTH_DAY_WEEKDAY;
                        aVar9.getClass();
                        String strA = eVar5.a(g22.k.r(localDateTime), aVar9);
                        mx1.f fVar2 = pVar3.f61598d;
                        int i38 = fVar2 != null ? fVar2.f121400f.f96796a : 0;
                        Boolean bool = pVar3.f61599e;
                        Boolean bool2 = Boolean.TRUE;
                        int i39 = (p005kotlin.jvm.internal.s.g(pVar3.f61600f, bool2) ? 1 : 0) + (p005kotlin.jvm.internal.s.g(bool, bool2) ? 1 : 0) + i38;
                        str = strA + " (" + ((Resources) mVar16.A(AndroidCompositionLocals_androidKt.f6043c)).getQuantityString(R.plurals.lbl_duration_week, i39, Arrays.copyOf(new Object[]{Integer.valueOf(i39)}, 1)) + ")";
                        mVar16.f();
                    }
                    qx1.i.a(strQ, str == null ? "" : str, false, null, mVar16, 384, 8);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 22:
                x01.k kVar2 = (x01.k) obj5;
                p3.m mVar17 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                NutritionActivity.a aVar10 = NutritionActivity.f39581f;
                ((r1.e0) obj).getClass();
                x1 x1Var19 = p3.n.f135158a;
                Context context = (Context) mVar17.A(AndroidCompositionLocals_androidKt.f6042b);
                boolean zR3 = mVar17.r(kVar2);
                Object objQ4 = mVar17.q();
                if (zR3) {
                    objQ4 = new x01.a(kVar2, false ? 1 : 0);
                    mVar17.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new x01.a(kVar2, false ? 1 : 0);
                        mVar17.K(objQ4);
                    }
                }
                e23.a aVar11 = (e23.a) objQ4;
                boolean zR4 = mVar17.r(kVar2) | mVar17.r(context);
                Object objQ5 = mVar17.q();
                if (zR4) {
                    objQ5 = new wz1.c(true ? 1 : 0, kVar2, context);
                    mVar17.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new wz1.c(true ? 1 : 0, kVar2, context);
                        mVar17.K(objQ5);
                    }
                }
                y11.a.a(aVar11, (e23.a) objQ5, mVar17, 0);
                return Unit.INSTANCE;
            case 23:
                CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) obj5;
                List list = (List) obj;
                String str10 = (String) obj2;
                CreateCustomCourseActivity.a aVar12 = CreateCustomCourseActivity.f33013f;
                list.getClass();
                str10.getClass();
                androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.q(supportFragmentManager, list, new x40.c(createCustomCourseActivity, 8), new wn2.f(createCustomCourseActivity, str10, (String) obj3));
                return Unit.INSTANCE;
            case 24:
                y1 y1Var = (y1) obj5;
                sc.h hVar2 = (sc.h) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar18.B(hVar2) ? 4 : 2;
                }
                if (mVar18.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var20 = p3.n.f135158a;
                    x9.a aVarA = x9.e.a(y1Var);
                    Object obj8 = hVar2.f158452b;
                    LinkedHashMap linkedHashMap = aVarA.f189586a;
                    Object obj9 = linkedHashMap.get(obj8);
                    if (obj9 == null) {
                        obj4 = obj9;
                        y1 y1Var2 = new y1();
                        linkedHashMap.put(obj8, y1Var2);
                        obj4 = y1Var2;
                    }
                    obj4 = obj9;
                    y1 y1Var3 = (y1) obj4;
                    nd.e eVar6 = (nd.e) mVar18.A(od.a.f131173a);
                    Object objQ6 = mVar18.q();
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new x9.c.a(eVar6, y1Var3);
                        mVar18.K(objQ6);
                    }
                    v9.a.f176280a.getClass();
                    p3.v.a(v9.a.f176281b.c((x9.c.a) objQ6), z3.f.c(1108866301, new sc.g(hVar2, 4, (byte) 0), mVar18), mVar18, 56);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 25:
                aa1.e eVar7 = (aa1.e) obj5;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar19.n(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = e9.a(t62.b.f162798a);
                    String strQ2 = gl1.y.Q(mVar19, R.string.lbl_new_personal_record);
                    String str11 = eVar7.f2265g;
                    String str12 = eVar7.f2266h;
                    u91.d.a(dVarA, strQ2, str11, str12 == null ? str11 : str12, eVar7.f2267i, gl1.y.Q(mVar19, R.string.personal_records_all_time_record), mVar19, 0, 32);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 26:
                xc1.b bVar3 = (xc1.b) obj5;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                int i44 = xc1.b.f189966f;
                if (mVar20.n(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x1 x1Var22 = p3.n.f135158a;
                    bVar3.g(mVar20, h82.c.f82429e);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 27:
                xn.h hVar3 = (xn.h) obj5;
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                int i45 = xn.h.f191606f;
                if (mVar21.n(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    x1 x1Var23 = p3.n.f135158a;
                    hVar3.g(mVar21, h82.c.f82429e);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 28:
                return a(obj, obj2, obj3);
            default:
                xn.l lVar2 = (xn.l) obj5;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                int i46 = xn.l.f191612f;
                if (mVar22.n(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    x1 x1Var24 = p3.n.f135158a;
                    lVar2.g(mVar22, h82.c.f82429e);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
        }
    }
}

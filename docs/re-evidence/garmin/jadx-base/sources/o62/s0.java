package o62;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.c1;
import c2.t2;
import c2.x2;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import f5.b1;
import f5.v1;
import f5.y0;
import f5.z0;
import i3.e5;
import i3.i7;
import i3.mh;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.apache.commons.io.IOUtils;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.h1;
import p3.i2;
import p3.x1;
import p3.z1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f129771b;

    public /* synthetic */ s0(Object obj, int i14) {
        this.f129770a = i14;
        this.f129771b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0358 A[PHI: r7
      0x0358: PHI (r7v43 java.lang.String) = (r7v39 java.lang.String), (r7v40 java.lang.String), (r7v44 java.lang.String) binds: [B:151:0x0365, B:154:0x036d, B:144:0x0355] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:289:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:294:0x0932  */
    /* JADX WARN: Code duplicated, block: B:322:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
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
        String string;
        String string2;
        Object obj4;
        Object obj5;
        Double d14;
        Double d15;
        List listB1;
        String strA;
        String str;
        String str2;
        int i14 = this.f129770a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 10;
        int i16 = 5;
        boolean z14 = false;
        int i17 = 1;
        Object obj6 = this.f129771b;
        switch (i14) {
            case 0:
                t0 t0Var = (t0) obj6;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i18 = t0.f129774f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    t0Var.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                o81.a aVar2 = (o81.a) obj6;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i19 = o81.a.f130834f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    aVar2.i(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                h1<?> h1Var = (h1) obj6;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? mVar3.B(obj) : mVar3.r(obj) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    mVar3.s(h1Var, obj);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p40.j jVar = (p40.j) obj6;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i24 = p40.j.f135685f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    jVar.g(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p50.c cVar = (p50.c) obj6;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i25 = p50.c.f136108f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    cVar.g(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                ph1.b bVar = (ph1.b) obj6;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i26 = ph1.b.f137710f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    bVar.g(mVar6, h82.c.f82429e);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                qp.a aVar3 = (qp.a) obj6;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String str3 = aVar3.f145991d;
                    String str4 = aVar3.f145992e;
                    String str5 = aVar3.f145993f;
                    String str6 = aVar3.f145994g;
                    h4.d.f81522a.getClass();
                    pp.a.c(str3, str4, str5, str6, h4.d.a.f81538p, mVar7, 24576, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                pq1.e eVar = (pq1.e) obj6;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i27 = pq1.e.f139571f;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    eVar.g(mVar8, h82.c.f82429e);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                sc.f fVar = (sc.f) obj6;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ox0.b) obj).getClass();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    mVar9.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar9);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(qx0.d.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar9, 0), null);
                    mVar9.R();
                    qx0.d dVar = (qx0.d) u1VarResolveViewModel;
                    boolean zR = mVar9.r(fVar);
                    Object objQ = mVar9.q();
                    if (zR) {
                        objQ = new bv0.k(fVar, 5);
                        mVar9.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new bv0.k(fVar, 5);
                            mVar9.K(objQ);
                        }
                    }
                    qx0.b.a(dVar, (e23.l) objQ, mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                AtomicLongFieldUpdater atomicLongFieldUpdater = q53.b.f142949d;
                return new ng2.i(obj3, i15, (q53.b) obj6, (y53.h) obj);
            case 10:
                qk1.a aVar4 = (qk1.a) obj6;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i28 = qk1.a.f145169f;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    aVar4.g(mVar10, h82.c.f82429e);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                nq1.k kVar = (nq1.k) obj6;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    Context context = (Context) mVar11.A(AndroidCompositionLocals_androidKt.f6042b);
                    NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = (kVar == null || (d15 = kVar.f126954e) == null) ? 0.0d : d15.doubleValue();
                    if (kVar != null && (d14 = kVar.f126955f) != null) {
                        dDoubleValue = d14.doubleValue();
                    }
                    String str7 = integerInstance.format(dDoubleValue2);
                    String str8 = integerInstance.format(dDoubleValue);
                    str7.getClass();
                    String strP = gl1.y.P(R.string.mct_num_days_label, new Object[]{str7}, mVar11);
                    str8.getClass();
                    String strP2 = gl1.y.P(R.string.mct_num_days_label, new Object[]{str8}, mVar11);
                    if (dDoubleValue2 == 1.0d) {
                        string = context.getString(R.string.mct_next_phase_day);
                        string.getClass();
                    } else {
                        string = context.getString(R.string.mct_next_phase_days, str7);
                        string.getClass();
                    }
                    if (dDoubleValue == 1.0d) {
                        string2 = context.getString(R.string.mct_next_phase_day);
                        string2.getClass();
                    } else {
                        string2 = context.getString(R.string.mct_next_phase_days, str8);
                        string2.getClass();
                    }
                    h4.r.a aVar5 = h4.r.S;
                    boolean zR2 = mVar11.r(context) | mVar11.B(string);
                    Object objQ2 = mVar11.q();
                    if (zR2) {
                        obj4 = objQ2;
                        a42.b bVar2 = new a42.b(context, string, i15);
                        mVar11.K(bVar2);
                        obj4 = bVar2;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            obj4 = objQ2;
                            a42.b bVar3 = new a42.b(context, string, i15);
                            mVar11.K(bVar3);
                            obj4 = bVar3;
                        }
                    }
                    obj4 = objQ2;
                    h4.r rVarC = p5.v.c((e23.l) obj4, aVar5, false);
                    String strP3 = gl1.y.P(R.string.lbl_current_streak, new Object[]{strP}, mVar11);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97935l;
                    x0 x0VarF = d92.c.f(x0Var, mVar11);
                    d6.h.f57752b.getClass();
                    mh.c(strP3, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, mVar11, 0, 0, 130044);
                    boolean zR3 = mVar11.r(context) | mVar11.B(string2);
                    Object objQ3 = mVar11.q();
                    if (zR3) {
                        obj5 = objQ3;
                        a42.b bVar4 = new a42.b(context, string2, 11);
                        mVar11.K(bVar4);
                        obj5 = bVar4;
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            obj5 = objQ3;
                            a42.b bVar5 = new a42.b(context, string2, 11);
                            mVar11.K(bVar5);
                            obj5 = bVar5;
                        }
                    }
                    obj5 = objQ3;
                    mh.c(gl1.y.P(R.string.lbl_longest_streak, new Object[]{strP2}, mVar11), p5.v.c((e23.l) obj5, aVar5, false), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar11), mVar11, 0, 0, 130044);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                qw1.b bVar6 = (qw1.b) obj6;
                c2.t tVar = (c2.t) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(tVar) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC2 = tVar.c(aVar6, h4.d.a.f81528f);
                    Object objQ4 = mVar12.q();
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new qv1.l(2);
                        mVar12.K(objQ4);
                    }
                    h4.r rVarC3 = p5.v.c((e23.l) objQ4, rVarC2, true);
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar12, 0);
                    int iHashCode = Long.hashCode(mVar12.getU());
                    i2 i2VarX = mVar12.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar7);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar12);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar12, iHashCode, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar12);
                    lg.d.a(0.0f, 0.0f, z3.f.c(1419893890, new q72.f(5, bVar6, c2.b0.f22601a), mVar12), mVar12, 384, 3);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                r02.m mVar13 = (r02.m) obj6;
                b1 b1Var = (b1) obj;
                y0 y0Var = (y0) obj2;
                g6.a aVar8 = (g6.a) obj3;
                b1Var.getClass();
                y0Var.getClass();
                int iJ = g6.a.j(aVar8.f75988a);
                int i29 = g6.a.i(aVar8.f75988a);
                z1 z1Var = mVar13.f148895c;
                v1 v1VarQ = y0Var.Q(g6.b.b(MathKt.c(z1Var.getFloatValue() * iJ), MathKt.c(z1Var.getFloatValue() * i29), 5));
                long j8 = (((long) iJ) << 32) | (((long) i29) & 4294967295L);
                g6.m.a aVar9 = g6.m.f76012b;
                if (!g6.m.c(mVar13.g(), j8)) {
                    mVar13.f148898f.setValue(g6.m.a(j8));
                    mVar13.m();
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(v1VarQ.f69144a / z1Var.getFloatValue())) << 32) | (((long) Float.floatToRawIntBits(v1VarQ.f69145b / z1Var.getFloatValue())) & 4294967295L);
                n4.g.a aVar10 = n4.g.f123559b;
                if (!n4.g.c(mVar13.f(), jFloatToRawIntBits)) {
                    mVar13.f148899g.setValue(n4.g.a(jFloatToRawIntBits));
                    mVar13.m();
                }
                return b1.h0(b1Var, iJ, i29, new ph1.d(21, v1VarQ, mVar13));
            case 14:
                com.garmin.android.apps.connectmobile.badges.service.model.r rVar = (com.garmin.android.apps.connectmobile.badges.service.model.r) obj6;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar14, rVar.f30668b);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar14), mVar14, 0, 0, 131070);
                    b3.b.a aVar11 = b3.b.a.f15503a;
                    u4.d dVarA = d3.c.a();
                    long jF = lc.u0.f(mVar14);
                    h4.r.a aVar12 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(c2.l.C(aVar12, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97905d), jF, mVar14, 48, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 15:
                CoursePointListActivity coursePointListActivity = (CoursePointListActivity) obj6;
                List list = (List) obj;
                String str9 = (String) obj2;
                CoursePointListActivity.a aVar13 = CoursePointListActivity.f33079c;
                list.getClass();
                str9.getClass();
                androidx.fragment.app.v supportFragmentManager = coursePointListActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.q(supportFragmentManager, list, new r50.f(coursePointListActivity, i17), new p90.h(coursePointListActivity, 22, str9, (String) obj3));
                return Unit.INSTANCE;
            case 16:
                m4.b0 b0Var = (m4.b0) obj6;
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar15 = (p3.m) obj2;
                v.h.y(-1682251067, rVar2, (Integer) obj3, mVar15);
                x1 x1Var14 = p3.n.f135158a;
                b0Var.getClass();
                h4.r rVarA = m4.e.a(rVar2, b0Var);
                mVar15.f();
                return rVarA;
            case 17:
                rc.i iVar = (rc.i) obj6;
                int iIntValue14 = ((Integer) obj).intValue();
                String str10 = (String) obj2;
                lc.q0 q0Var = (lc.q0) obj3;
                str10.getClass();
                q0Var.getClass();
                int i30 = rc.i.b.f151844a[(((q0Var instanceof lc.g) || iVar.f151837a.getF158591b().i(iIntValue14)) ? rc.i.a.QUERY : rc.i.a.PATH).ordinal()];
                if (i30 == 1) {
                    iVar.f151839c += IOUtils.DIR_SEPARATOR_UNIX + o2.c.c(CoreConstants.CURLY_RIGHT, "{", str10);
                } else {
                    if (i30 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    iVar.a(str10, "{" + str10 + CoreConstants.CURLY_RIGHT);
                }
                return Unit.INSTANCE;
            case 18:
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) obj6;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar16.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var15 = p3.n.f135158a;
                    String str11 = (String) r0Var.f105810a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var2 = j92.f.f97931h;
                    gl.c.f77766a.getClass();
                    x0 x0VarA = x0.a(x0Var2, gl.c.f77767b.f77774c0, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(str11, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar16, 0, 0, 130046);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 19:
                yw1.u uVar = (yw1.u) obj6;
                t2 t2Var = (t2) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar17.B(t2Var) ? 4 : 2;
                }
                if (mVar17.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var16 = p3.n.f135158a;
                    int i34 = uVar.f199983a;
                    String str12 = uVar.f199984b;
                    String strValueOf = String.valueOf(i34);
                    String strQ2 = gl1.y.Q(mVar17, R.string.strength_training_sets);
                    String strQ3 = gl1.y.Q(mVar17, R.string.strength_training_total_sets_label);
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    String strQ4 = gl1.y.Q(mVar17, R.string.strength_training_total_sets_label);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", e5.g(strQ3, " , ", strValueOf));
                    b92.a aVarB = c0235a.b();
                    int i35 = b92.a.f16960b;
                    int i36 = (iIntValue16 & 14) | (l72.x0.f111348c << 24);
                    x0Var3.a(i36, 52, aVarB, t2Var, null, null, strValueOf, strQ4, strQ2, null, mVar17);
                    String strQ5 = gl1.y.Q(mVar17, R.string.total_work_time);
                    String strQ6 = gl1.y.Q(mVar17, R.string.total_work_time);
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put("merge", e5.g(strQ5, " , ", str12));
                    x0Var3.a(i36, 60, c0235a2.b(), t2Var, null, null, str12, strQ6, null, null, mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 20:
                com.garmin.android.apps.connectmobile.userprofile.model.q qVar = (com.garmin.android.apps.connectmobile.userprofile.model.q) obj6;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((h4.r) obj).getClass();
                if (mVar18.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var17 = p3.n.f135158a;
                    do1.o oVar = (do1.o) KoinJavaComponent.get$default(do1.o.class, null, null, 6, null);
                    Integer followByCount = qVar.getFollowByCount();
                    int iIntValue18 = followByCount != null ? followByCount.intValue() : 0;
                    List<hi0.a> listF = qVar.f();
                    if (listF != null) {
                        ArrayList arrayList = new ArrayList(p13.y.r(listF, 10));
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((hi0.a) it.next()).getFullName());
                        }
                        listB1 = p13.h0.b1(arrayList);
                    } else {
                        listB1 = null;
                    }
                    l22.b bVar8 = oVar.f60607a;
                    if (listB1 == null || listB1.isEmpty() || iIntValue18 <= 0) {
                        strA = null;
                    } else if (iIntValue18 == 1) {
                        String str13 = (String) listB1.get(0);
                        if (str13 != null) {
                            strA = bVar8.a(R.string.msg_followed_by_single_description, str13);
                        } else {
                            strA = null;
                        }
                    } else if (iIntValue18 == 2) {
                        Object obj7 = listB1.get(0);
                        Object obj8 = listB1.get(1);
                        if (obj7 == null || obj8 == null) {
                            strA = null;
                        } else {
                            strA = bVar8.a(R.string.msg_followed_by_double_description, (String) obj7, (String) obj8);
                        }
                    } else {
                        String str14 = (String) listB1.get(0);
                        if (str14 != null) {
                            strA = bVar8.a(R.string.msg_followed_by_multiple_description, str14, Integer.valueOf(iIntValue18 - 1));
                        } else {
                            strA = null;
                        }
                    }
                    if (strA == null || strA.length() == 0) {
                        x1 x1Var18 = p3.n.f135158a;
                        return Unit.INSTANCE;
                    }
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC5 = c2.l.C(aVar14, 0.0f, 0.0f, j92.b.f97899b.f97919d, 0.0f, 11);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var19 = p3.n.f135158a;
                    int iHashCode2 = Long.hashCode(mVar18.getU());
                    i2 i2VarX2 = mVar18.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar18);
                    h5.g.V.getClass();
                    h5.e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar18.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar18.z();
                    if (mVar18.getT()) {
                        mVar18.M(aVar15);
                    } else {
                        mVar18.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar18);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar18);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar18.getT() || !p005kotlin.jvm.internal.s.g(mVar18.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar18, iHashCode2, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar18);
                    c2.u uVar2 = c2.u.f22885a;
                    List<hi0.a> listF2 = qVar.f();
                    List listS0 = listF2 != null ? p13.h0.S0(listF2, 5) : null;
                    if (listS0 == null) {
                        mVar18.C(-115352033);
                        mVar18.f();
                    } else {
                        mVar18.C(-115352032);
                        int i37 = 0;
                        for (Object obj9 : listS0) {
                            int i38 = i37 + 1;
                            if (i37 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            hi0.a aVar16 = (hi0.a) obj9;
                            h4.r rVarB = h4.p.b(h4.r.S, i16 - i37);
                            float f14 = i37 == 0 ? 0 : i37 * 20;
                            g6.f.a aVar17 = g6.f.f75994b;
                            float f15 = 1;
                            h4.r rVarY = c2.l.y(u1.q.b(f15, p6.b.a(d92.b.f58623a, mVar18), c2.l.C(rVarB, f14, 0.0f, 0.0f, 0.0f, 14), k2.i.f102406a), f15);
                            d92.b.f58625c.getClass();
                            float f16 = j92.b.f97901d.f97905d;
                            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = aVar16.getProfileImageUrls();
                            if (profileImageUrls == null || (str = profileImageUrls.f46877f) == null) {
                                com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2 = aVar16.getProfileImageUrls();
                                str = profileImageUrls2 != null ? profileImageUrls2.f46876e : null;
                                if (str != null) {
                                    str2 = str;
                                } else {
                                    com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3 = aVar16.getProfileImageUrls();
                                    if (profileImageUrls3 != null) {
                                        str = profileImageUrls3.f46875d;
                                        str2 = str;
                                    } else {
                                        str2 = null;
                                    }
                                }
                            } else {
                                str2 = str;
                            }
                            b12.k.b(rVarY, null, f16, new b12.b(str2, null, null, null, null, 30, null), mVar18, (b12.b.f14385f << 9) | 48, 16);
                            i37 = i38;
                            i16 = 5;
                        }
                        mVar18.f();
                    }
                    mVar18.y();
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar18);
                    d92.b.f58624b.getClass();
                    mh.c(strA, x2.f(h4.r.S, 1.0f), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(18), null, null, 16646143), mVar18, 48, 0, 131064);
                    x1 x1Var20 = p3.n.f135158a;
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 21:
                s52.g gVar = (s52.g) obj6;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                int i39 = s52.g.f157408g;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    gVar.g(mVar19, 0);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 22:
                d4.c cVar2 = (d4.c) obj6;
                sc.h hVar = (sc.h) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar20.B(hVar) ? 4 : 2;
                }
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var22 = p3.n.f135158a;
                    cVar2.d(hVar.f158452b, z3.f.c(121262920, new sc.g(hVar, i17, z14 ? (byte) 1 : (byte) 0), mVar20), mVar20, 48);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 23:
                sf0.h hVar2 = (sf0.h) obj6;
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                int i44 = sf0.h.f158850f;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x1 x1Var23 = p3.n.f135158a;
                    hVar2.g(mVar21, h82.c.f82429e);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 24:
                sg0.s sVar = (sg0.s) obj6;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                int i45 = sg0.s.f159150f;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x1 x1Var24 = p3.n.f135158a;
                    sVar.g(mVar22, h82.c.f82429e);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj3).getClass();
                ((lc.v) obj).getClass();
                x1 x1Var25 = p3.n.f135158a;
                og2.k.i((sg0.p0) obj6, (p3.m) obj2, 0);
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj3).getClass();
                ((lc.v) obj).getClass();
                x1 x1Var26 = p3.n.f135158a;
                og.a.b((sg0.p0) obj6, (p3.m) obj2, 0);
                return Unit.INSTANCE;
            case 27:
                sz1.p pVar = (sz1.p) obj6;
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                int i46 = sz1.p.f161567f;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    x1 x1Var27 = p3.n.f135158a;
                    pVar.g(mVar23, h82.c.f82429e);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 28:
                t12.c cVar3 = (t12.c) obj6;
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                int i47 = t12.c.f161741f;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    x1 x1Var28 = p3.n.f135158a;
                    cVar3.g(mVar24, h82.c.f82429e);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar25 = (p3.m) obj2;
                v.h.y(1238805288, rVar3, (Integer) obj3, mVar25);
                x1 x1Var29 = p3.n.f135158a;
                g6.f.a aVar18 = g6.f.f75994b;
                d92.b.f58623a.getClass();
                h4.r rVarB2 = u1.q.b(1, d92.b.a(mVar25).j().e(), rVar3, (k2.h) obj6);
                mVar25.f();
                return rVarB2;
        }
    }
}

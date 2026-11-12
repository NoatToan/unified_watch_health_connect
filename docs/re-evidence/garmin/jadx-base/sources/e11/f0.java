package e11;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.w1;
import c2.l2;
import c2.x2;
import c22.o2;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.follow.domain.OthersFriendListActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.setup.presentation.RecordActivitySettingsActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import et1.b2;
import ew1.m0;
import ew1.t0;
import f5.z0;
import i3.c1;
import i3.h1;
import i3.i7;
import i3.mc;
import i3.mh;
import ii0.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.i3;
import l72.p2;
import l72.x0;
import lc.u0;
import nr.l0;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import u1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f61883d;

    public /* synthetic */ f0(o53.b0 b0Var, e23.p pVar, mc mcVar) {
        this.f61880a = 28;
        this.f61882c = b0Var;
        this.f61881b = pVar;
        this.f61883d = mcVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        OthersFriendListActivity othersFriendListActivity = (OthersFriendListActivity) this.f61881b;
        p003ji0.k kVar = (p003ji0.k) this.f61882c;
        w1 w1Var = (w1) this.f61883d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        OthersFriendListActivity.a aVar = OthersFriendListActivity.f35271a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = s3.b();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                mVar.C(386546351);
                String str = (String) p0.c(((mi0.j) w1Var.getValue()).f118914r, mVar, 0).getF182175a();
                boolean zR = mVar.r(othersFriendListActivity);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new OthersFriendListActivity.d(othersFriendListActivity);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new OthersFriendListActivity.d(othersFriendListActivity);
                        mVar.K(objQ);
                    }
                }
                gg.b.c(0, (e23.a) objQ, str, mVar);
                mVar.f();
            } else {
                mVar.C(386787748);
                mi0.j jVar = (mi0.j) w1Var.getValue();
                boolean zR2 = mVar.r(othersFriendListActivity);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new OthersFriendListActivity.e(othersFriendListActivity);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new OthersFriendListActivity.e(othersFriendListActivity);
                        mVar.K(objQ2);
                    }
                }
                o0.a(jVar, kVar, (e23.a) objQ2, mVar, mi0.j.f118893v);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        gr2.f.a((String) this.f61883d, (ms2.a) this.f61881b, (String) this.f61882c, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        float f14;
        h4.r rVar = (h4.r) this.f61881b;
        ds.n nVar = (ds.n) this.f61882c;
        nr.p0 p0Var = (nr.p0) this.f61883d;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarThen = x2.d(aVar, 1.0f).then(rVar);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarThen, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarE, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(eVar, zVarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = p0Var.f127282a;
            List<l0> list = p0Var.f127285d;
            String str2 = p0Var.f127283b;
            Integer num = p0Var.f127284c;
            Integer numValueOf = Integer.valueOf(R.drawable.bg_orange_gradient);
            float f15 = nVar == ds.n.f61012i ? 48 : 0;
            g6.f.a aVar3 = g6.f.f75994b;
            ds.f0.a(str, str2, num, numValueOf, null, 0L, 0L, 0L, f15, null, mVar, 0, 752);
            c2.l.f(b0Var.a(aVar, 1.0f, true), mVar);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                r22.p pVar = ((l0) it.next()).f127250a;
                arrayList.add(new c02.b(pVar.f149774a, pVar.f149776c, pVar.f149775b, pVar.f149780g));
            }
            int i14 = 0;
            o13.u uVar2 = new o13.u(arrayList.get(0), arrayList.get(1), arrayList.get(2));
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarF = x2.f(aVar4, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f16 = eVar2.f97920e;
            c02.l.b(uVar2, c2.l.A(rVarF, f16, 0.0f, 2), mVar, 0);
            c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar);
            l0 l0Var = (l0) p13.h0.e0(3, list);
            r22.p pVar2 = l0Var != null ? l0Var.f127250a : null;
            l0 l0Var2 = (l0) p13.h0.e0(4, list);
            r22.p pVar3 = l0Var2 != null ? l0Var2.f127250a : null;
            x0 x0Var = x0.f111346a;
            h4.r rVarA = c2.l.A(x2.f(aVar4, 1.0f), f16, 0.0f, 2);
            ds.n nVar2 = ds.n.f61012i;
            if (nVar == nVar2) {
                f16 = 88;
                g6.f.a aVar5 = g6.f.f75994b;
            }
            x0Var.e(c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, f16, 7), z3.f.c(-2088071654, new gs.b(pVar2, pVar3, i14), mVar), mVar, (x0.f111348c << 6) | 48, 0);
            mVar.y();
            t4.d dVarA = n5.c.a(R.drawable.garmin_logo_tag_vertical, mVar, 0);
            if (nVar == nVar2) {
                f14 = 64;
                g6.f.a aVar6 = g6.f.f75994b;
            } else {
                f14 = eVar2.f97922g;
            }
            h4.r rVarC3 = c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            y0.a(dVarA, null, uVar.c(rVarC3, h4.d.a.f81526d), null, null, 0.0f, null, mVar, 48, 120);
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        o53.b0 b0Var = (o53.b0) this.f61882c;
        e23.p pVar = (e23.p) this.f61881b;
        mc mcVar = (mc) this.f61883d;
        pv0.h hVar = (pv0.h) obj;
        hVar.getClass();
        ge1.b.T(b0Var, null, null, new gw0.j.k(mcVar, null), 3);
        pVar.invoke(hVar, (pv0.y) obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:193:0x065e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:228:0x0735 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x0737  */
    /* JADX WARN: Code duplicated, block: B:230:0x073a  */
    /* JADX WARN: Code duplicated, block: B:233:0x073f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0743  */
    /* JADX WARN: Code duplicated, block: B:237:0x0746  */
    /* JADX WARN: Code duplicated, block: B:239:0x0751 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x0753  */
    /* JADX WARN: Code duplicated, block: B:241:0x075f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0775  */
    /* JADX WARN: Code duplicated, block: B:243:0x078b  */
    /* JADX WARN: Code duplicated, block: B:245:0x0795  */
    /* JADX WARN: Code duplicated, block: B:250:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:296:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:330:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:332:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:347:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:407:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:416:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:58:0x01af  */
    /* JADX WARN: Code duplicated, block: B:72:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        jv1.h hVar;
        aw1.h hVarY6;
        List listB1;
        jv1.e eVarY5;
        vt1.o oVar;
        int i14;
        jv1.f fVar;
        int i15 = this.f61880a;
        int i16 = 28;
        p3.m.a aVar = p3.m.f135153a;
        int i17 = 3;
        boolean z14 = false;
        int i18 = 2;
        Object obj3 = this.f61883d;
        Object obj4 = this.f61882c;
        Object obj5 = this.f61881b;
        switch (i15) {
            case 0:
                e23.p pVar = (e23.p) obj5;
                f11.j jVar = (f11.j) obj4;
                String str = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_quick_add);
                    boolean zB = mVar.B(pVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new h0(pVar, 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(pVar, 0);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    i53.f fVarA = i53.a.a(new i3("SAVE_FOOD", gl1.y.Q(mVar, jVar.f67966c == null ? R.string.lbl_add : R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR = mVar.r(jVar) | mVar.B(str);
                    Object objQ2 = mVar.q();
                    if (zR) {
                        objQ2 = new cn1.d(i16, jVar, str);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cn1.d(i16, jVar, str);
                            mVar.K(objQ2);
                        }
                    }
                    z02.f.e(strQ, null, aVar2, fVarA, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                e52.f.b((Integer) obj5, (Integer) obj4, (d52.e) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                list.getClass();
                ((p1) obj5).setValue(list);
                ((e23.l) obj4).invoke(((List) obj3).get(iIntValue2));
                return Unit.INSTANCE;
            case 3:
                String str2 = (String) obj3;
                x71.a aVar3 = (x71.a) obj5;
                j70.x xVar = (j70.x) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarD = x2.d(aVar4, 1.0f);
                    boolean zB2 = mVar2.B(str2);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new cq.t(str2, 18);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cq.t(str2, 18);
                            mVar2.K(objQ3);
                        }
                    }
                    h4.r rVarC = p5.v.c((e23.l) objQ3, rVarD, false);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22698h, aVar5, mVar2, 54);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC2, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarF = x2.f(aVar4, 1.0f);
                    Integer num = aVar3 != null ? aVar3.f189419b : null;
                    n61.b bVar2 = aVar3 != null ? aVar3.f189421d : null;
                    n61.d dVar = aVar3 != null ? aVar3.f189420c : null;
                    Parcelable.Creator<n61.d> creator = n61.d.CREATOR;
                    e81.a.a(rVarF, num, dVar, bVar2, mVar2, 6);
                    h4.r rVarX = x2.x(x2.f(aVar4, 1.0f), null, 3);
                    c2.z zVarA2 = c2.y.a(c2.j.f22695e, h4.d.a.f81536n, mVar2, 6);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarX, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC3, mVar2);
                    if (xVar == null) {
                        mVar2.C(-1049230475);
                        mVar2.f();
                    } else {
                        mVar2.C(-1049230474);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.a(n5.c.a(xVar.f97674c, mVar2, 0), gl1.y.Q(mVar2, xVar.f97673b), x2.q(aVar4, j92.b.f97901d.f97905d), u0.f(mVar2), mVar2, 0, 0);
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_trending);
                        h4.r rVarX2 = x2.x(x2.f(aVar4, 1.0f), null, 3);
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, rVarX2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 48, 0, 131068);
                        mVar2.f();
                    }
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar7 = (e23.a) obj5;
                zs.c cVar = (zs.c) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    vs.a aVar8 = ((ys.b) p1Var.getF182175a()).f199162d;
                    if ((aVar8 != null ? aVar8.f179693b : null) instanceof ys.a.c) {
                        mVar3.C(540347734);
                        mVar3.f();
                        aVar7.invoke();
                    } else {
                        vs.a aVar9 = ((ys.b) p1Var.getF182175a()).f199162d;
                        if ((aVar9 != null ? aVar9.f179693b : null) instanceof ys.a.g) {
                            mVar3.C(540347734);
                            mVar3.f();
                            aVar7.invoke();
                        } else {
                            mVar3.C(540397427);
                            ys.b bVar3 = (ys.b) p1Var.getF182175a();
                            boolean zR2 = mVar3.r(cVar) | mVar3.B(aVar7);
                            Object objQ4 = mVar3.q();
                            if (zR2) {
                                objQ4 = new e52.b(4, cVar, aVar7);
                                mVar3.K(objQ4);
                            } else {
                                aVar.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new e52.b(4, cVar, aVar7);
                                    mVar3.K(objQ4);
                                }
                            }
                            et.n.b(bVar3, (e23.l) objQ4, mVar3, 0);
                            mVar3.f();
                        }
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                et1.o0.a((String) obj3, (i53.c) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                eu.c cVar2 = eu.c.f66055a;
                ((eu.c) obj4).a((eu.h) obj3, (e23.p) obj5, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ew0.c.a((ew0.m) obj5, (vc0.v) obj4, (gk1.b) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                m0 m0Var = (m0) obj5;
                String str3 = (String) obj3;
                String str4 = (String) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m0.a aVar10 = m0.f66573c;
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zR5 = m0Var.y6().R5();
                    int iC5 = m0Var.y6().C5("FBTFindRaceFragmentCompose");
                    int iY5 = m0Var.y6().Y5();
                    boolean zR3 = mVar4.r(m0Var) | mVar4.B(str4);
                    Object objQ5 = mVar4.q();
                    if (zR3) {
                        objQ5 = new dl0.g(24, m0Var, str4);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new dl0.g(24, m0Var, str4);
                            mVar4.K(objQ5);
                        }
                    }
                    m0Var.w6(str3, zR5, iC5, iY5, (e23.a) objQ5, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                t0 t0Var = (t0) obj5;
                String str5 = (String) obj3;
                String str6 = (String) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                t0.a aVar11 = t0.f66754g;
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    p1 p1VarG = o53.f0.G(t0Var.y6().j6(), mVar5);
                    Object objQ6 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ6 == c2565a) {
                        jv1.s sVar = (jv1.s) p1VarG.getF182175a();
                        objQ6 = p0.n(sVar != null ? sVar.f101128g : null);
                        mVar5.K(objQ6);
                    }
                    p1 p1Var2 = (p1) objQ6;
                    vt1.f fVar3 = (vt1.f) p1Var2.getF182175a();
                    jv1.s sVar2 = (jv1.s) p1VarG.getF182175a();
                    if (sVar2 == null || sVar2.f101125d != vt1.o.f180175f) {
                        if (sVar2 != null) {
                            hVar = sVar2.f101127f;
                        } else {
                            hVar = null;
                        }
                        if (hVar instanceof jv1.i) {
                            oVar = sVar2.f101125d;
                            if (oVar == null) {
                                i14 = -1;
                            } else {
                                i14 = t0.b.f66761b[oVar.ordinal()];
                            }
                            if (i14 == 1) {
                                vt1.i.f180124b.getClass();
                                listB1 = p13.x.k(vt1.i.FINISH, vt1.i.GOAL_PACE_DISTANCE);
                            } else if (i14 != 2) {
                                vt1.g.f180106c.getClass();
                                listB1 = p13.h0.b1(vt1.g.f180110g);
                            } else {
                                vt1.i.f180124b.getClass();
                                listB1 = p13.x.k(vt1.i.FINISH, vt1.i.GOAL_DISTANCE_SPEED);
                            }
                        } else {
                            hVarY6 = t0Var.y6();
                            if (hVarY6.J6() || (eVarY5 = hVarY6.y5()) == null || eVarY5.f101039h) {
                                vt1.g.f180106c.getClass();
                                listB1 = p13.h0.b1(vt1.g.f180110g);
                            } else {
                                listB1 = p13.w.c(vt1.g.FINISH);
                            }
                        }
                    } else {
                        jv1.h hVar2 = sVar2.f101127f;
                        if (hVar2 instanceof jv1.g) {
                            jv1.g gVar = (jv1.g) hVar2;
                            vt1.n nVar = gVar.f101054c;
                            vt1.n nVar2 = vt1.n.FIVE_K;
                            if (nVar != nVar2) {
                                if (nVar == vt1.n.OTHER) {
                                    tu1.i.f166483a.getClass();
                                    if (tu1.i.a.b(gVar) == nVar2) {
                                    }
                                }
                                if (sVar2 != null) {
                                    hVar = sVar2.f101127f;
                                } else {
                                    hVar = null;
                                }
                                if (hVar instanceof jv1.i) {
                                    oVar = sVar2.f101125d;
                                    if (oVar == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = t0.b.f66761b[oVar.ordinal()];
                                    }
                                    if (i14 == 1) {
                                        vt1.i.f180124b.getClass();
                                        listB1 = p13.x.k(vt1.i.FINISH, vt1.i.GOAL_PACE_DISTANCE);
                                    } else if (i14 != 2) {
                                        vt1.g.f180106c.getClass();
                                        listB1 = p13.h0.b1(vt1.g.f180110g);
                                    } else {
                                        vt1.i.f180124b.getClass();
                                        listB1 = p13.x.k(vt1.i.FINISH, vt1.i.GOAL_DISTANCE_SPEED);
                                    }
                                } else {
                                    hVarY6 = t0Var.y6();
                                    if (hVarY6.J6()) {
                                        vt1.g.f180106c.getClass();
                                        listB1 = p13.h0.b1(vt1.g.f180110g);
                                    } else {
                                        vt1.g.f180106c.getClass();
                                        listB1 = p13.h0.b1(vt1.g.f180110g);
                                    }
                                }
                            }
                            vt1.c.f180082c.getClass();
                            listB1 = p13.h0.b1(vt1.c.f180087h);
                        } else {
                            if (sVar2 != null) {
                                hVar = sVar2.f101127f;
                            } else {
                                hVar = null;
                            }
                            if (hVar instanceof jv1.i) {
                                oVar = sVar2.f101125d;
                                if (oVar == null) {
                                    i14 = -1;
                                } else {
                                    i14 = t0.b.f66761b[oVar.ordinal()];
                                }
                                if (i14 == 1) {
                                    vt1.i.f180124b.getClass();
                                    listB1 = p13.x.k(vt1.i.FINISH, vt1.i.GOAL_PACE_DISTANCE);
                                } else if (i14 != 2) {
                                    vt1.g.f180106c.getClass();
                                    listB1 = p13.h0.b1(vt1.g.f180110g);
                                } else {
                                    vt1.i.f180124b.getClass();
                                    listB1 = p13.x.k(vt1.i.FINISH, vt1.i.GOAL_DISTANCE_SPEED);
                                }
                            } else {
                                hVarY6 = t0Var.y6();
                                if (hVarY6.J6()) {
                                    vt1.g.f180106c.getClass();
                                    listB1 = p13.h0.b1(vt1.g.f180110g);
                                } else {
                                    vt1.g.f180106c.getClass();
                                    listB1 = p13.h0.b1(vt1.g.f180110g);
                                }
                            }
                        }
                    }
                    List list2 = listB1;
                    Object objQ7 = mVar5.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new b2(p1Var2, i18);
                        mVar5.K(objQ7);
                    }
                    e23.l lVar = (e23.l) objQ7;
                    boolean zR6 = t0Var.y6().R5();
                    int iC6 = t0Var.y6().C5("FBTGoalTypeSelectionFragment");
                    int iY6 = t0Var.y6().Y5();
                    boolean z15 = ((vt1.f) p1Var2.getF182175a()) != null;
                    boolean zR4 = mVar5.r(t0Var);
                    Object objQ8 = mVar5.q();
                    if (zR4 || objQ8 == c2565a) {
                        objQ8 = new dl0.g(25, p1Var2, t0Var);
                        mVar5.K(objQ8);
                    }
                    t0Var.w6(str5, str6, fVar3, list2, lVar, zR6, iC6, iY6, z15, (e23.a) objQ8, mVar5, 24576);
                    if (t0Var.y6().f13385r1) {
                        mVar5.C(-403632761);
                        mVar5.f();
                    } else {
                        mVar5.C(-404511115);
                        p1 p1VarG2 = o53.f0.G(t0Var.y6().A5(), mVar5);
                        g3 g3Var = (g3) p1VarG2.getF182175a();
                        fw.p pVar2 = g3Var != null ? g3Var.f35300a : null;
                        int i19 = pVar2 != null ? t0.b.f66760a[pVar2.ordinal()] : -1;
                        if (i19 == 1) {
                            g22.e.l(t0Var);
                        } else if (i19 == 2) {
                            g22.e.f(t0Var);
                            g3 g3Var2 = (g3) p1VarG2.getF182175a();
                            if (g3Var2 != null && (fVar = (jv1.f) g3Var2.f35301b) != null) {
                                t0Var.y6().r7(fVar);
                            }
                        } else if (i19 == 3) {
                            g22.e.f(t0Var);
                            g22.e.a(t0Var, null);
                            t0Var.y6().l5();
                        }
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                f10.d.b((h4.r) obj5, (f10.b) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                e23.a aVar12 = (e23.a) obj5;
                Context context = (Context) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar6, R.string.activities_respiration_title);
                    String string = context.getString(R.string.lbl_help);
                    string.getClass();
                    i53.f fVarA2 = i53.a.a(new i3("HELP", string, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB3 = mVar6.B(p1Var3) | mVar6.r(context);
                    Object objQ9 = mVar6.q();
                    if (zB3) {
                        objQ9 = new as.d(context, p1Var3, 8);
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new as.d(context, p1Var3, 8);
                            mVar6.K(objQ9);
                        }
                    }
                    z02.f.d(strQ3, null, null, aVar12, fVarA2, null, (e23.l) objQ9, mVar6, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 12:
                p1 p1Var4 = (p1) obj5;
                Context context2 = (Context) obj4;
                fe1.n nVar3 = (fe1.n) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar13, 1.0f), vb.h.e(d92.b.f58623a, mVar7), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar14 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA3 = c2.y.a(c2.j.f22694d, aVar14, mVar7, 48);
                    int iHashCode3 = Long.hashCode(mVar7.getU());
                    i2 i2VarX3 = mVar7.x();
                    h4.r rVarC4 = h4.k.c(rVarE, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar15);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar7);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar7);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    g6.f.a aVar16 = g6.f.f75994b;
                    c2.l.f(c2.l.C(aVar13, 0.0f, 16, 0.0f, 0.0f, 13), mVar7);
                    Object objQ10 = mVar7.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    Object obj6 = objQ10;
                    if (objQ10 == c2565a2) {
                        i53.f fVarA3 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f);
                        mVar7.K(fVarA3);
                        obj6 = fVarA3;
                    }
                    i53.f fVar4 = (i53.f) obj6;
                    Object objQ11 = mVar7.q();
                    if (objQ11 == c2565a2) {
                        objQ11 = new n82.f.a(((fe1.o) p1Var4.getF182175a()).f70580b, null, ((fe1.o) p1Var4.getF182175a()).f70581c, 2, null);
                        mVar7.K(objQ11);
                    }
                    n82.f fVarA4 = n82.j.a((n82.f.a) objQ11, null, mVar7, 2);
                    Object objQ12 = mVar7.q();
                    Object obj7 = objQ12;
                    if (objQ12 == c2565a2) {
                        yd1.a aVar17 = new yd1.a(context2);
                        mVar7.K(aVar17);
                        obj7 = aVar17;
                    }
                    yd1.a aVar18 = (yd1.a) obj7;
                    i53.c cVarE = i53.a.e(o2.b(fVar4, mVar7));
                    int iIndexOf = fVar4.indexOf(fVarA4.f124961b.a());
                    boolean zB4 = mVar7.B(fVarA4);
                    Object objQ13 = mVar7.q();
                    Object obj8 = objQ13;
                    if (zB4 || objQ13 == c2565a2) {
                        a42.f0 f0Var = new a42.f0(fVarA4, fVar4, 5);
                        mVar7.K(f0Var);
                        obj8 = f0Var;
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) obj8, mVar7, 0, 26);
                    q82.a.a(x2.f(aVar13, 1.0f), new n82.n(fVarA4, aVar18), null, mVar7, 6, 4);
                    n82.c.a(b0Var2.a(aVar13, 1.0f, true), fVarA4, 3, false, z3.f.c(1002651526, new aa2.r(nVar3, 20, fVarA4, p1Var4), mVar7), mVar7, 24960, 8);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 13:
                ff2.i iVar = (ff2.i) obj5;
                e23.l lVar2 = (e23.l) obj4;
                ff2.a aVar19 = (ff2.a) obj3;
                ff2.a aVar20 = (ff2.a) obj;
                kf2.d dVar2 = (kf2.d) obj2;
                dVar2.getClass();
                iVar.b().debug("validateActiveCampaign: Status " + dVar2);
                int i24 = ff2.i.a.f71161a[dVar2.ordinal()];
                if (i24 != 1) {
                    if (i24 == 2) {
                        iVar.d(aVar19.getCampaignId());
                        lVar2.invoke(null);
                    } else if (i24 != 3) {
                        lVar2.invoke(null);
                    } else {
                        lVar2.invoke(null);
                    }
                } else if (aVar20 != null) {
                    ge1.b.T(iVar, null, null, new ff2.m(iVar, aVar20, null), 3);
                    lVar2.invoke(aVar20);
                } else {
                    lVar2.invoke(null);
                }
                return Unit.INSTANCE;
            case 14:
                g3 g3Var3 = (g3) obj5;
                ak0.a aVar21 = (ak0.a) obj4;
                Context context3 = (Context) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strQ4 = gl1.y.Q(mVar8, R.string.nutrition_settings);
                    boolean zR7 = mVar8.r(g3Var3) | mVar8.r(aVar21) | mVar8.r(context3);
                    Object objQ14 = mVar8.q();
                    if (zR7) {
                        objQ14 = new fk0.a(g3Var3, z14 ? 1 : 0, aVar21, context3);
                        mVar8.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new fk0.a(g3Var3, z14 ? 1 : 0, aVar21, context3);
                            mVar8.K(objQ14);
                        }
                    }
                    p2Var.g(strQ4, null, null, null, null, false, false, (e23.a) objQ14, mVar8, 0, 254);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 15:
                ak0.a aVar22 = (ak0.a) obj5;
                Context context4 = (Context) obj4;
                p1 p1Var5 = (p1) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    p2 p2Var2 = p2.f111205a;
                    String strQ5 = gl1.y.Q(mVar9, R.string.live_track_config_title);
                    h4.r.a aVar23 = h4.r.S;
                    Object objQ15 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ15 == c2565a3) {
                        objQ15 = new fh0.b(7);
                        mVar9.K(objQ15);
                    }
                    h4.r rVarC5 = p5.v.c((e23.l) objQ15, aVar23, false);
                    boolean zR8 = mVar9.r(aVar22) | mVar9.r(context4);
                    Object objQ16 = mVar9.q();
                    if (zR8 || objQ16 == c2565a3) {
                        objQ16 = new fk0.a(aVar22, context4, p1Var5);
                        mVar9.K(objQ16);
                    }
                    p2Var2.g(strQ5, rVarC5, null, null, null, false, false, (e23.a) objQ16, mVar9, 0, 252);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 16:
                km1.r rVar = (km1.r) obj5;
                km1.p pVar3 = (km1.p) obj4;
                km1.c cVar3 = (km1.c) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar24 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA4 = c2.y.a(kVar, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode4 = Long.hashCode(mVar10.getU());
                    i2 i2VarX4 = mVar10.x();
                    h4.r rVarC6 = h4.k.c(aVar24, mVar10);
                    h5.g.V.getClass();
                    h5.e0.a aVar25 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar25);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar10);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar10, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar10);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    fn1.m.d(rVar, pVar3 != null ? km1.q.a(pVar3) : null, mVar10, 0, 0);
                    fn1.m.b(cVar3, mVar10, km1.c.B);
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                o53.f0.b((wo0.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d dVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d) obj5;
                p1 p1Var6 = (p1) obj4;
                p1 p1Var7 = (p1) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.a aVar26 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.d.f46013c;
                if (mVar11.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    boolean zBooleanValue = ((Boolean) p1Var6.getF182175a()).booleanValue();
                    String strQ6 = gl1.y.Q(mVar11, R.string.lbl_next);
                    boolean zR9 = mVar11.r(dVar3);
                    Object objQ17 = mVar11.q();
                    if (zR9) {
                        objQ17 = new fz1.j(dVar3, p1Var7, 1);
                        mVar11.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new fz1.j(dVar3, p1Var7, 1);
                            mVar11.K(objQ17);
                        }
                    }
                    f0Var2.d(384, 1, (e23.a) objQ17, rVarF2, strQ6, mVar11, null, zBooleanValue);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 19:
                e23.a aVar27 = (e23.a) obj5;
                String str7 = (String) obj3;
                s5.x0 x0Var = (s5.x0) obj4;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar28 = h4.r.S;
                    float f14 = 1;
                    g6.f.a aVar29 = g6.f.f75994b;
                    h4.r rVarA = x2.a(aVar28, f14, f14);
                    c1.f87691a.getClass();
                    l2 l2Var = c1.f87693c;
                    l2 l2VarE = c2.l.e(0.0f, l2Var.f22737b, 0.0f, l2Var.f22739d, 5);
                    boolean zB5 = mVar12.B(aVar27);
                    Object objQ18 = mVar12.q();
                    if (zB5) {
                        objQ18 = new eu.a(aVar27, 28);
                        mVar12.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            objQ18 = new eu.a(aVar27, 28);
                            mVar12.K(objQ18);
                        }
                    }
                    h1.c((e23.a) objQ18, rVarA, false, null, null, null, l2VarE, null, z3.f.c(1991798619, new a31.c(str7, x0Var, i17), mVar12), mVar12, 805306416, 380);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                g11.j.c((h4.r) obj5, (v21.e) obj4, (q01.f.d) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                g11.j.d((h4.r) obj5, (v21.e) obj4, (q01.f.C2664f) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                g11.m.a((h4.r) obj5, (v21.e) obj4, (q01.f) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                UserProfileActivity userProfileActivity = (UserProfileActivity) obj5;
                x3 x3Var = (x3) obj4;
                x3 x3Var2 = (x3) obj3;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                UserProfileActivity.a aVar30 = UserProfileActivity.f46494x;
                if (mVar13.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.userprofile.i iVarGa = userProfileActivity.ga();
                    boolean zR10 = mVar13.r(userProfileActivity) | mVar13.B(x3Var) | mVar13.B(x3Var2);
                    Object objQ19 = mVar13.q();
                    if (zR10) {
                        objQ19 = new com.garmin.android.apps.connectmobile.userprofile.h(userProfileActivity, x3Var, x3Var2);
                        mVar13.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new com.garmin.android.apps.connectmobile.userprofile.h(userProfileActivity, x3Var, x3Var2);
                            mVar13.K(objQ19);
                        }
                    }
                    s12.m.e(userProfileActivity, iVarGa, (e23.l) ((k23.g) objQ19), mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 24:
                return a(obj, obj2);
            case 25:
                Long l14 = (Long) obj5;
                String str8 = (String) obj3;
                RecordActivitySettingsActivity recordActivitySettingsActivity = (RecordActivitySettingsActivity) obj4;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                RecordActivitySettingsActivity.a aVar31 = RecordActivitySettingsActivity.f44210b;
                if (mVar14.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    kl1.a aVar32 = ((gl1.z) recordActivitySettingsActivity.f44211a.getValue()).f77871a;
                    ws.a aVar33 = (ws.a) KoinJavaComponent.get$default(ws.a.class, null, null, 6, null);
                    l80.b bVar6 = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                    boolean zR11 = mVar14.r(recordActivitySettingsActivity);
                    Object objQ20 = mVar14.q();
                    if (zR11) {
                        objQ20 = new g12.f(recordActivitySettingsActivity, 15);
                        mVar14.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = new g12.f(recordActivitySettingsActivity, 15);
                            mVar14.K(objQ20);
                        }
                    }
                    gl1.d.f(l14, str8, aVar32, aVar33, bVar6, (e23.l) objQ20, mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 26:
                return b(obj, obj2);
            case 27:
                return c(obj, obj2);
            case 28:
                return d(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                gw0.t.d((pv0.r) obj5, (e23.l) obj4, (z3.e) obj3, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f0(Object obj, int i14, Object obj2, Object obj3) {
        this.f61880a = i14;
        this.f61881b = obj;
        this.f61882c = obj2;
        this.f61883d = obj3;
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f61880a = i15;
        this.f61881b = obj;
        this.f61882c = obj2;
        this.f61883d = obj3;
    }

    public /* synthetic */ f0(Object obj, String str, int i14, Object obj2) {
        this.f61880a = i14;
        this.f61881b = obj;
        this.f61883d = str;
        this.f61882c = obj2;
    }

    public /* synthetic */ f0(String str, Object obj, Object obj2, int i14, int i15) {
        this.f61880a = i15;
        this.f61883d = str;
        this.f61881b = obj;
        this.f61882c = obj2;
    }

    public /* synthetic */ f0(String str, x71.a aVar, j70.x xVar) {
        this.f61880a = 3;
        this.f61883d = str;
        this.f61881b = aVar;
        this.f61882c = xVar;
    }

    public /* synthetic */ f0(eu.c cVar, eu.h hVar, e23.p pVar, int i14) {
        this.f61880a = 6;
        this.f61882c = cVar;
        this.f61883d = hVar;
        this.f61881b = pVar;
    }
}

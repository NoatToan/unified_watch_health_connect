package a3;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import aq.f2;
import b21.gb;
import b21.l4;
import c2.h2;
import c2.l2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import i3.mh;
import i3.p7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.i3;
import l72.p2;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import p3.x3;
import p3.y3;
import r53.d2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f640d;

    public /* synthetic */ e(Fragment fragment, bw2.i iVar, dx2.c cVar, Map map) {
        this.f637a = 24;
        this.f638b = iVar;
        this.f639c = cVar;
        this.f640d = map;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:115:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:155:0x049e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0821  */
    /* JADX WARN: Code duplicated, block: B:232:0x082a  */
    /* JADX WARN: Code duplicated, block: B:233:0x082e  */
    /* JADX WARN: Code duplicated, block: B:238:0x084b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0861  */
    /* JADX WARN: Code duplicated, block: B:244:0x086d  */
    /* JADX WARN: Code duplicated, block: B:246:0x087a  */
    /* JADX WARN: Code duplicated, block: B:249:0x089b  */
    /* JADX WARN: Code duplicated, block: B:251:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:254:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:304:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:309:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:329:0x0ab9  */
    /* JADX WARN: Code duplicated, block: B:362:0x08ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x019e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0334  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        String str;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        String strH;
        boolean zB;
        Object objQ;
        b11.l lVar;
        b11.u aVar;
        Object value;
        Object next;
        int i15 = this.f637a;
        int i16 = 7;
        p3.m.a aVar2 = p3.m.f135153a;
        final int i17 = 1;
        Object obj3 = this.f640d;
        Object obj4 = this.f639c;
        Object obj5 = this.f638b;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                f.a((c2.a0) obj5, (e23.p) obj4, (e23.p) obj3, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 1:
                x3 x3Var = (x3) obj5;
                h2 h2Var = (h2) obj4;
                z3.e eVar = (z3.e) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p3.v.a(w.f867a.c(Float.valueOf(o4.d0.e(((o4.d0) x3Var.getF182175a()).f128833a))), z3.f.c(-869936862, new r(h2Var, eVar, 0), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                e23.a aVar3 = (e23.a) obj5;
                e23.a aVar4 = (e23.a) obj4;
                x3 x3Var2 = (x3) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_vo2_max);
                    i53.f fVarA = i53.a.a(new i3("menu_item_help", gl1.y.Q(mVar2, R.string.lbl_help), !(((e42.a) x3Var2.getF182175a()) instanceof e42.a.b), (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB2 = mVar2.B(aVar4);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new a03.h0(aVar4, 2);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a03.h0(aVar4, 2);
                            mVar2.K(objQ2);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar3, fVarA, null, (e23.l) objQ2, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                dh.b.d((t41.g) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                final i53.c cVar = (i53.c) obj5;
                Context context = (Context) obj4;
                final p3.p1 p1Var = (p3.p1) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarF, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    c2.u uVar = c2.u.f22885a;
                    Iterator<E> it = cVar.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i14 = -1;
                        } else if (p005kotlin.jvm.internal.s.g(((t41.i) it.next()).f162321a, (String) p1Var.getF182175a())) {
                            i14 = i18;
                        } else {
                            i18++;
                        }
                    }
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    boolean zR = mVar3.r(context);
                    Object objQ3 = mVar3.q();
                    if (zR) {
                        objQ3 = new a51.m(context, 0);
                        mVar3.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new a51.m(context, 0);
                            mVar3.K(objQ3);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    boolean zB3 = mVar3.B(p1Var) | mVar3.B(cVar);
                    Object objQ4 = mVar3.q();
                    if (zB3) {
                        final int i19 = 0;
                        objQ4 = new e23.l() { // from class: a51.n
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj6) {
                                int i24 = i19;
                                int iIntValue4 = ((Integer) obj6).intValue();
                                switch (i24) {
                                    case 0:
                                        p1Var.setValue(((t41.i) cVar.get(iIntValue4)).f162321a);
                                        break;
                                    default:
                                        p1Var.setValue((bt1.j) cVar.get(iIntValue4));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i110 = 0;
                            objQ4 = new e23.l() { // from class: a51.n
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj6) {
                                    int i24 = i110;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    switch (i24) {
                                        case 0:
                                            p1Var.setValue(((t41.i) cVar.get(iIntValue4)).f162321a);
                                            break;
                                        default:
                                            p1Var.setValue((bt1.j) cVar.get(iIntValue4));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ4);
                        }
                    }
                    r82.k.a(null, cVar, i14, lVar2, 0.0f, false, false, 0L, null, (e23.l) objQ4, mVar3, 0, 497);
                    mVar3.y();
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                e23.r rVar = (e23.r) obj5;
                u4.d dVar = (u4.d) obj4;
                String str2 = (String) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    rVar.invoke(dVar, str2, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                String str3 = (String) obj5;
                List<ad0.j> list = (List) obj4;
                e23.l lVar3 = (e23.l) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar6, 1.0f);
                    long jE = vb.h.e(d92.b.f58623a, mVar5);
                    o4.m1.a aVar7 = o4.m1.f128891a;
                    h4.r rVarE = u1.n.e(rVarF2, jE, aVar7);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar8 = h4.d.a.f81536n;
                    c2.z zVarA2 = c2.y.a(kVar, aVar8, mVar5, 0);
                    int iHashCode3 = Long.hashCode(mVar5.getU());
                    i2 i2VarX3 = mVar5.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar9);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA2, mVar5);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT()) {
                        str = str3;
                    } else {
                        str = str3;
                        if (!p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar5);
                        c2.b0 b0Var = c2.b0.f22601a;
                        h4.r rVarF3 = x2.f(aVar6, 1.0f);
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        float f14 = eVar3.f97920e;
                        h4.r rVarA = c2.l.A(c2.l.C(rVarF3, 0.0f, 0.0f, 0.0f, f14, 7), f14, 0.0f, 2);
                        String strP = gl1.y.P(R.string.lbl_using_your_device, new Object[]{str}, mVar5);
                        d92.b.f58624b.getClass();
                        mh.c(strP, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar5), mVar5, 0, 0, 131068);
                        mh.c(gl1.y.P(R.string.msg_navigating_your_device_basics, new Object[]{str}, mVar5), c2.l.A(c2.l.C(x2.f(aVar6, 1.0f), 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7), f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar5), mVar5, 0, 0, 131068);
                        h4.r rVarA2 = c2.l.A(u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(mVar5).c().b(), aVar7), 0.0f, f14, 1);
                        zVarA = c2.y.a(kVar, aVar8, mVar5, 0);
                        iHashCode = Long.hashCode(mVar5.getU());
                        i2VarX = mVar5.x();
                        rVarC = h4.k.c(rVarA2, mVar5);
                        if (mVar5.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar9);
                        } else {
                            mVar5.c();
                        }
                        b4.c(eVar2, zVarA, mVar5);
                        b4.c(c1623g, i2VarX, mVar5);
                        if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar5);
                        mVar5.C(1773102111);
                        for (ad0.j jVar : list) {
                            p2 p2Var = p2.f111205a;
                            strH = jVar.f2744a;
                            if (strH == null) {
                                strH = sn.a.h(mVar5, 728993582, R.string.lbl_device_tutorial_generic, mVar5);
                            } else {
                                mVar5.C(728993024);
                                mVar5.f();
                            }
                            String str4 = strH;
                            h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                            zB = mVar5.B(lVar3) | mVar5.B(jVar);
                            objQ = mVar5.q();
                            if (zB) {
                                objQ = new a11.n(13, lVar3, jVar);
                                mVar5.K(objQ);
                            } else {
                                aVar2.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new a11.n(13, lVar3, jVar);
                                    mVar5.K(objQ);
                                }
                            }
                            p2Var.g(str4, rVarF4, null, null, null, false, false, (e23.a) objQ, mVar5, 48, 252);
                        }
                        mVar5.f();
                        mVar5.y();
                        mVar5.y();
                        x1 x1Var7 = p3.n.f135158a;
                    }
                    v.h.z(iHashCode3, mVar5, iHashCode3, bVar2);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar5);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.r rVarF5 = x2.f(aVar6, 1.0f);
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f15 = eVar4.f97920e;
                    h4.r rVarA3 = c2.l.A(c2.l.C(rVarF5, 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                    String strP2 = gl1.y.P(R.string.lbl_using_your_device, new Object[]{str}, mVar5);
                    d92.b.f58624b.getClass();
                    mh.c(strP2, rVarA3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar5), mVar5, 0, 0, 131068);
                    mh.c(gl1.y.P(R.string.msg_navigating_your_device_basics, new Object[]{str}, mVar5), c2.l.A(c2.l.C(x2.f(aVar6, 1.0f), 0.0f, 0.0f, 0.0f, eVar4.f97920e, 7), f15, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar5), mVar5, 0, 0, 131068);
                    h4.r rVarA4 = c2.l.A(u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(mVar5).c().b(), aVar7), 0.0f, f15, 1);
                    zVarA = c2.y.a(kVar, aVar8, mVar5, 0);
                    iHashCode = Long.hashCode(mVar5.getU());
                    i2VarX = mVar5.x();
                    rVarC = h4.k.c(rVarA4, mVar5);
                    if (mVar5.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar9);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar2, zVarA, mVar5);
                    b4.c(c1623g, i2VarX, mVar5);
                    if (mVar5.getT()) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar5);
                    mVar5.C(1773102111);
                    while (r0.hasNext()) {
                        p2 p2Var2 = p2.f111205a;
                        strH = jVar.f2744a;
                        if (strH == null) {
                            strH = sn.a.h(mVar5, 728993582, R.string.lbl_device_tutorial_generic, mVar5);
                        } else {
                            mVar5.C(728993024);
                            mVar5.f();
                        }
                        String str5 = strH;
                        h4.r rVarF6 = x2.f(h4.r.S, 1.0f);
                        zB = mVar5.B(lVar3) | mVar5.B(jVar);
                        objQ = mVar5.q();
                        if (zB) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a11.n(13, lVar3, jVar);
                                mVar5.K(objQ);
                            }
                        } else {
                            objQ = new a11.n(13, lVar3, jVar);
                            mVar5.K(objQ);
                        }
                        p2Var2.g(str5, rVarF6, null, null, null, false, false, (e23.a) objQ, mVar5, 48, 252);
                    }
                    mVar5.f();
                    mVar5.y();
                    mVar5.y();
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                am.p1.d((String) obj5, (gr.b) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                e23.a aVar10 = (e23.a) obj5;
                u2.h hVar = (u2.h) obj4;
                m4.b0 b0Var3 = (m4.b0) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    z02.f.f(null, aVar10, null, z3.f.c(-1055770262, new aa2.f(hVar, b0Var3), mVar6), mVar6, 24576, 13);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                DateTime dateTimeWithTime = ((DateTime) obj4).withTime(((Integer) obj).intValue(), ((Integer) obj2).intValue(), 0, 0);
                dateTimeWithTime.getClass();
                ((e23.l) obj5).invoke(dateTimeWithTime);
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 10:
                f2.g gVar = (f2.g) obj5;
                Long l14 = (Long) obj4;
                f2 f2Var = (f2) obj3;
                long jLongValue = ((Long) obj).longValue();
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) obj2;
                int i24 = f2.f11937h;
                TextView textView = gVar.f11958g;
                EditText editText = gVar.f11959h;
                textView.setText(editText.getText());
                v22.e.q(textView);
                v22.e.l(editText);
                if (l14 == null || l14.longValue() != jLongValue) {
                    f2Var.f11940c.x0(gVar.getBindingAdapterPosition(), jLongValue, dVar2);
                }
                return Unit.INSTANCE;
            case 11:
                e23.a aVar11 = (e23.a) obj5;
                pt1.y yVar = (pt1.y) obj3;
                e23.p pVar = (e23.p) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    k2.h hVarA = k2.i.a(j92.b.f97900c.f97912d);
                    i3.l1 l1Var = i3.l1.f88793a;
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar7);
                    long jB = d92.b.a(mVar7).k().b();
                    l1Var.getClass();
                    i3.o1.a(null, hVarA, i3.l1.a(0, 12, jC, jB, mVar7), null, z3.f.c(2144566937, new a42.a(i16, aVar11, yVar, pVar), mVar7), mVar7, 196608, 25);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                au0.m0.b bVar3 = au0.m0.f12967d;
                ((au0.m0) obj5).w6((String) obj4, (String) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                b02.b.b((Boolean) obj5, (String) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                i21.d dVar3 = (i21.d) obj4;
                NutritionActivity.g gVar2 = (NutritionActivity.g) obj3;
                b63.o oVar = (b63.o) obj;
                oVar.getClass();
                ((b11.i.b) obj2).getClass();
                if (((l4.l) obj5).b() == j11.c.DAILY_LOG) {
                    dVar3.Q4(p13.w.c(oVar));
                }
                gVar2.invoke();
                return Unit.INSTANCE;
            case 15:
                i21.d dVar4 = (i21.d) obj5;
                lc.m0 m0Var = (lc.m0) obj4;
                NutritionActivity.g gVar3 = (NutritionActivity.g) obj3;
                b63.o oVar2 = (b63.o) obj;
                b11.i.c cVar2 = (b11.i.c) obj2;
                if (oVar2 != null) {
                    dVar4.getClass();
                    dVar4.Q4(p13.w.c(oVar2));
                    i53.c cVar3 = dVar4.f87282n;
                    if (cVar3 != null) {
                        ArrayList arrayList = new ArrayList(p13.y.r(cVar3, 10));
                        Iterator<E> it3 = cVar3.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((g21.p) it3.next()).f75473a);
                        }
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                b11.l lVar4 = (b11.l) next;
                                if (cVar2 == null || lVar4.f14331a != cVar2.f14318d) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        lVar = (b11.l) next;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null && lVar.f14333c) {
                        aVar = new b11.u.b(lVar.f14332b);
                    } else if (lVar != null) {
                        String str6 = lVar.f14332b;
                        if (lVar.f14333c) {
                            aVar = new b11.u.a(c22.i.b(b11.c.SNACKS.f14251b), null, 2, null);
                        } else {
                            b11.c.f14245d.getClass();
                            c3 c3VarA = b11.c.a.a(str6);
                            aVar = c3VarA != null ? new b11.u.a(c3VarA, null, 2, null) : new b11.u.b(str6);
                        }
                    } else {
                        aVar = new b11.u.a(c22.i.b(b11.c.SNACKS.f14251b), null, 2, null);
                    }
                    r53.p2 p2Var3 = dVar4.f87285q;
                    do {
                        value = p2Var3.getValue();
                    } while (!p2Var3.b(value, i21.c.a((i21.c) value, new i21.a(new i21.b.c(aVar), null, 2, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
                }
                b21.d1.b(m0Var, true, (oVar2 == null || cVar2 == null) ? false : true, "quickAddResult", cVar2 != null ? new gb(b11.b.FOOD, cVar2.f14317c, Long.valueOf(cVar2.f14318d)) : null, gVar3);
                return Unit.INSTANCE;
            case 16:
                i21.d dVar5 = (i21.d) obj4;
                NutritionActivity.g gVar4 = (NutritionActivity.g) obj3;
                b63.o oVar3 = (b63.o) obj;
                oVar3.getClass();
                ((b11.i.a) obj2).getClass();
                if (((l4.k) obj5).b() == j11.c.DAILY_LOG) {
                    dVar5.Q4(p13.w.c(oVar3));
                }
                gVar4.invoke();
                return Unit.INSTANCE;
            case 17:
                h4.r rVar2 = (h4.r) obj5;
                CustomLineChart customLineChart = (CustomLineChart) obj4;
                e23.a aVar12 = (e23.a) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r rVarThen = x2.h(x2.f(h4.r.S, 1.0f), b40.b.f15697a).then(rVar2);
                    boolean zR2 = mVar8.r(customLineChart);
                    Object objQ5 = mVar8.q();
                    if (zR2) {
                        objQ5 = new b40.a(customLineChart, 0);
                        mVar8.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new b40.a(customLineChart, 0);
                            mVar8.K(objQ5);
                        }
                    }
                    e23.l lVar5 = (e23.l) objQ5;
                    boolean zB4 = mVar8.B(aVar12);
                    Object objQ6 = mVar8.q();
                    if (zB4) {
                        objQ6 = new a03.h0(aVar12, 5);
                        mVar8.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a03.h0(aVar12, 5);
                            mVar8.K(objQ6);
                        }
                    }
                    p002j6.c.b(lVar5, rVarThen, (e23.l) objQ6, mVar8, 0, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 18:
                List<r30.b> list2 = (List) obj5;
                e23.l lVar6 = (e23.l) obj4;
                r30.a aVar13 = (r30.a) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    mVar9.C(-1804170356);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                    for (r30.b bVar4 : list2) {
                        arrayList2.add(new l72.j0(gl1.y.Q(mVar9, bVar4.f149981a.f149980a), null, null, false, aVar13 == bVar4.f149981a, 14, null));
                    }
                    mVar9.f();
                    e2.i0 i0VarA = e2.k0.a(0, 0, 3, mVar9);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l2 l2VarC = c2.l.c(j92.b.f97899b.f97920e, 0.0f, 2);
                    boolean zR3 = mVar9.r(arrayList2) | mVar9.r(list2) | mVar9.B(lVar6) | mVar9.k(aVar13 == null ? -1 : aVar13.ordinal());
                    Object objQ7 = mVar9.q();
                    if (zR3) {
                        a03.n0 n0Var = new a03.n0(arrayList2, list2, lVar6, aVar13, 5);
                        mVar9.K(n0Var);
                        objQ7 = n0Var;
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            a03.n0 n0Var2 = new a03.n0(arrayList2, list2, lVar6, aVar13, 5);
                            mVar9.K(n0Var2);
                            objQ7 = n0Var2;
                        }
                    }
                    e2.c.c(null, i0VarA, l2VarC, null, null, null, false, null, (e23.l) objQ7, mVar9, 0, 505);
                    x1 x1Var13 = p3.n.f135158a;
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                b40.c.a((e50.f) obj5, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 20:
                String str7 = (String) obj5;
                e23.p pVar2 = (e23.p) obj4;
                m4.q qVar = (m4.q) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                b82.t0 t0Var = b82.t0.f16792a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    if (str7.length() > 0) {
                        mVar10.C(865687726);
                        y3 y3Var = p7.f89282d;
                        g6.f.f75994b.getClass();
                        p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-938757443, new a03.t0(18, pVar2, qVar), mVar10), mVar10, 56);
                        mVar10.f();
                    } else {
                        mVar10.C(866575690);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                bb0.b.a((bb0.c) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                bb0.e.a((bb0.f) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 23:
                final i53.c cVar4 = (i53.c) obj5;
                bt1.j jVar2 = (bt1.j) obj4;
                final p3.p1 p1Var2 = (p3.p1) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    h4.r rVarF7 = x2.f(aVar14, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar15 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA3 = c2.y.a(c2.j.f22694d, aVar15, mVar11, 48);
                    int iHashCode4 = Long.hashCode(mVar11.getU());
                    i2 i2VarX4 = mVar11.x();
                    h4.r rVarC4 = h4.k.c(rVarF7, mVar11);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar16);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar11);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar11, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar11);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    h4.r rVarX = x2.x(x2.z(aVar14, null, 3), null, 3);
                    ArrayList arrayList3 = new ArrayList(p13.y.r(cVar4, 10));
                    Iterator<E> it5 = cVar4.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(((bt1.j) it5.next()).f21113b);
                    }
                    i53.c cVarE = i53.a.e(arrayList3);
                    int iIndexOf = (jVar2 == null || !cVar4.contains(jVar2)) ? 0 : cVar4.indexOf(jVar2);
                    boolean zB5 = mVar11.B(cVar4);
                    Object objQ8 = mVar11.q();
                    if (zB5) {
                        objQ8 = new e23.l() { // from class: a51.n
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj6) {
                                int i25 = i17;
                                int iIntValue12 = ((Integer) obj6).intValue();
                                switch (i25) {
                                    case 0:
                                        p1Var2.setValue(((t41.i) cVar4.get(iIntValue12)).f162321a);
                                        break;
                                    default:
                                        p1Var2.setValue((bt1.j) cVar4.get(iIntValue12));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar11.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new e23.l() { // from class: a51.n
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj6) {
                                    int i25 = i17;
                                    int iIntValue12 = ((Integer) obj6).intValue();
                                    switch (i25) {
                                        case 0:
                                            p1Var2.setValue(((t41.i) cVar4.get(iIntValue12)).f162321a);
                                            break;
                                        default:
                                            p1Var2.setValue((bt1.j) cVar4.get(iIntValue12));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar11.K(objQ8);
                        }
                    }
                    r82.k.a(rVarX, cVarE, iIndexOf, null, 0.0f, false, false, 0L, null, (e23.l) objQ8, mVar11, 6, 504);
                    mVar11.y();
                    x1 x1Var16 = p3.n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Fragment) obj).getClass();
                ((dx2.c) obj2).getClass();
                ((bw2.i) obj5).h((dx2.c) obj4, (Map) obj3, Boolean.TRUE);
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                c02.l.a((h4.r) obj5, (c02.b) obj4, (List) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                jg.b.g((c11.a) obj5, (v21.e) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                c42.h0.c((c42.i0) obj5, (c42.p) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                c50.c.a((e50.h) obj5, (e50.e) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c50.d.a((e50.d) obj5, (d2) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(e23.a aVar, pt1.y yVar, e23.p pVar) {
        this.f637a = 11;
        this.f638b = aVar;
        this.f640d = yVar;
        this.f639c = pVar;
    }

    public /* synthetic */ e(Object obj, int i14, Object obj2, Object obj3) {
        this.f637a = i14;
        this.f638b = obj;
        this.f639c = obj2;
        this.f640d = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f637a = i15;
        this.f638b = obj;
        this.f639c = obj2;
        this.f640d = obj3;
    }
}

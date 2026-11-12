package d50;

import a03.n0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.y0;
import c2.b0;
import c2.l2;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.garmin.proto.generated.GDIInReachMessaging;
import cq.t;
import cw1.g0;
import dv0.o;
import e2.i0;
import e2.k0;
import e23.p;
import et1.b2;
import ew0.c0;
import ew1.m2;
import f5.z0;
import f72.a2;
import g02.h0;
import g02.z1;
import gt1.v;
import h4.r;
import h5.e0;
import i3.mh;
import j23.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import l72.i3;
import m92.f0;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import pt1.s;
import s5.s0;
import s5.t0;
import s5.x0;
import w2.a0;
import w52.v0;
import xd2.m0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f57532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f57533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f57534e;

    public /* synthetic */ i(com.garmin.android.library.mapsdkadapter.i.d dVar, String str, s sVar, e23.a aVar, int i14) {
        this.f57530a = 15;
        this.f57531b = dVar;
        this.f57533d = str;
        this.f57534e = sVar;
        this.f57532c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:105:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x019d  */
    /* JADX WARN: Code duplicated, block: B:87:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0418  */
    /* JADX WARN: Code duplicated, block: B:99:0x0473  */
    private final Object a(Object obj, Object obj2) throws Throwable {
        e23.l lVar;
        p1 p1Var;
        h5.g.a.f fVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        boolean zB;
        Object objQ;
        p1 p1Var2;
        boolean zB2;
        Object objQ2;
        Throwable th3;
        h5.g.a.f fVar2;
        z zVarA;
        int iHashCode2;
        i2 i2VarX2;
        r rVarC2;
        pt1.h hVar = (pt1.h) this.f57531b;
        e23.l lVar2 = (e23.l) this.f57533d;
        e23.l lVar3 = (e23.l) this.f57534e;
        e23.l lVar4 = (e23.l) this.f57532c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = hVar.f140854e;
            us1.k kVar = hVar.f140852c;
            if (z14) {
                mVar.C(-1492745806);
                r.a aVar = r.S;
                r rVarD = x2.d(aVar, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA2 = y.a(kVar2, h4.d.a.f81536n, mVar, 0);
                int iHashCode3 = Long.hashCode(mVar.getU());
                i2 i2VarX3 = mVar.x();
                r rVarC3 = h4.k.c(rVarD, mVar);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
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
                b4.c(eVar, zVarA2, mVar);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX3, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar.getT()) {
                    th3 = null;
                } else {
                    th3 = null;
                    if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                    }
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC3, mVar);
                    b0 b0Var = b0.f22601a;
                    c2.l.f(b0Var.a(aVar, 0.2f, true), mVar);
                    r rVarA = b0Var.a(aVar, 1.0f, true);
                    zVarA = y.a(kVar2, h4.d.a.f81537o, mVar, 48);
                    iHashCode2 = Long.hashCode(mVar.getU());
                    i2VarX2 = mVar.x();
                    rVarC2 = h4.k.c(rVarA, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw th3;
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
                    b4.c(fVar2, rVarC2, mVar);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarC4 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar2.f97918c, 7);
                    String strQ = gl1.y.Q(mVar, R.string.trail_filter_no_matching_trails_title);
                    d6.h.f57752b.getClass();
                    int i14 = d6.h.f57755e;
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar), mVar, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar, R.string.trail_filter_no_matching_saved_trails_caption), c2.l.A(aVar, eVar2.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
                    mVar.y();
                    mVar.y();
                    mVar.f();
                }
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC3, mVar);
                b0 b0Var2 = b0.f22601a;
                c2.l.f(b0Var2.a(aVar, 0.2f, true), mVar);
                r rVarA2 = b0Var2.a(aVar, 1.0f, true);
                zVarA = y.a(kVar2, h4.d.a.f81537o, mVar, 48);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(rVarA2, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw th3;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar2);
                } else {
                    mVar.c();
                }
                b4.c(eVar, zVarA, mVar);
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                } else {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                }
                b4.c(fVar2, rVarC2, mVar);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar3 = j92.b.f97899b;
                r rVarC5 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7);
                String strQ2 = gl1.y.Q(mVar, R.string.trail_filter_no_matching_trails_title);
                d6.h.f57752b.getClass();
                int i15 = d6.h.f57755e;
                d92.b.f58624b.getClass();
                mh.c(strQ2, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar), mVar, 0, 0, 130044);
                mh.c(gl1.y.Q(mVar, R.string.trail_filter_no_matching_saved_trails_caption), c2.l.A(aVar, eVar3.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
                mVar.y();
                mVar.y();
                mVar.f();
            } else if (hVar.f140853d.isEmpty()) {
                mVar.C(-1491706810);
                r.a aVar3 = r.S;
                r rVarD2 = x2.d(aVar3, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA3 = y.a(kVar3, h4.d.a.f81536n, mVar, 0);
                int iHashCode4 = Long.hashCode(mVar.getU());
                i2 i2VarX4 = mVar.x();
                r rVarC6 = h4.k.c(rVarD2, mVar);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar4);
                } else {
                    mVar.c();
                }
                h5.g.a.e eVar4 = h5.g.a.f81810g;
                b4.c(eVar4, zVarA3, mVar);
                h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                b4.c(c1623g2, i2VarX4, mVar);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                    v.h.z(iHashCode4, mVar, iHashCode4, bVar2);
                }
                h5.g.a.f fVar3 = h5.g.a.f81807d;
                b4.c(fVar3, rVarC6, mVar);
                b0 b0Var3 = b0.f22601a;
                c2.l.f(b0Var3.a(aVar3, 0.2f, true), mVar);
                r rVarA3 = b0Var3.a(aVar3, 1.0f, true);
                z zVarA4 = y.a(kVar3, h4.d.a.f81537o, mVar, 48);
                int iHashCode5 = Long.hashCode(mVar.getU());
                i2 i2VarX5 = mVar.x();
                r rVarC7 = h4.k.c(rVarA3, mVar);
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar4);
                } else {
                    mVar.c();
                }
                b4.c(eVar4, zVarA4, mVar);
                b4.c(c1623g2, i2VarX5, mVar);
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode5))) {
                    v.h.z(iHashCode5, mVar, iHashCode5, bVar2);
                }
                b4.c(fVar3, rVarC7, mVar);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar5 = j92.b.f97899b;
                r rVarC8 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar5.f97918c, 7);
                String strQ3 = gl1.y.Q(mVar, R.string.saved_trails_empty_state_title);
                d6.h.f57752b.getClass();
                int i16 = d6.h.f57755e;
                d92.b.f58624b.getClass();
                mh.c(strQ3, rVarC8, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar), mVar, 0, 0, 130044);
                mh.c(gl1.y.Q(mVar, R.string.saved_trails_empty_state_message), c2.l.A(aVar3, eVar5.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
                mVar.y();
                mVar.y();
                mVar.f();
            } else {
                mVar.C(-1490693916);
                i0 i0VarA = k0.a(0, 0, 3, mVar);
                Object objQ3 = mVar.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(kVar);
                    mVar.K(objQ3);
                }
                p1 p1Var3 = (p1) objQ3;
                r.a aVar5 = r.S;
                long jA = tn.k.a(d92.b.f58623a, mVar);
                m1.a aVar6 = m1.f128891a;
                r rVarE = u1.n.e(aVar5, jA, aVar6);
                c2.j.f22691a.getClass();
                c2.j.k kVar4 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA5 = y.a(kVar4, h4.d.a.f81536n, mVar, 0);
                int iHashCode6 = Long.hashCode(mVar.getU());
                i2 i2VarX6 = mVar.x();
                r rVarC9 = h4.k.c(rVarE, mVar);
                h5.g.V.getClass();
                e0.a aVar7 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar7);
                } else {
                    mVar.c();
                }
                h5.g.a.e eVar6 = h5.g.a.f81810g;
                b4.c(eVar6, zVarA5, mVar);
                h5.g.a.C1623g c1623g3 = h5.g.a.f81809f;
                b4.c(c1623g3, i2VarX6, mVar);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (mVar.getT()) {
                    lVar = lVar4;
                    p1Var = p1Var3;
                } else {
                    lVar = lVar4;
                    p1Var = p1Var3;
                    if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode6))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC9, mVar);
                    b0 b0Var4 = b0.f22601a;
                    r rVarE2 = u1.n.e(x2.f(aVar5, 1.0f), d92.b.a(mVar).c().c(), aVar6);
                    z0VarD = q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarE2, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar7);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar6, z0VarD, mVar);
                    b4.c(c1623g3, i2VarX, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, mVar);
                    u uVar = u.f22885a;
                    r rVarF = x2.f(aVar5, 0.5f);
                    d92.b.f58625c.getClass();
                    j92.e eVar7 = j92.b.f97899b;
                    float f14 = eVar7.f97920e;
                    float f15 = eVar7.f97918c;
                    v.a(uVar.c(c2.l.C(rVarF, 0.0f, 0.0f, f14, 0.0f, 11), h4.d.a.f81529g), hVar.f140852c, null, lVar, mVar, 0, 4);
                    mVar.y();
                    c2.j.i iVarI = c2.j.i(f15);
                    l2 l2VarE = c2.l.e(0.0f, f15, 0.0f, 0.0f, 13);
                    zB = mVar.B(hVar) | mVar.B(lVar2) | mVar.B(lVar3);
                    objQ = mVar.q();
                    if (zB || objQ == c2565a) {
                        objQ = new ci0.b(hVar, 16, lVar2, lVar3);
                        mVar.K(objQ);
                    }
                    p1Var2 = p1Var;
                    e2.c.b(null, i0VarA, l2VarE, iVarI, null, null, false, null, (e23.l) objQ, mVar, 0, 489);
                    zB2 = mVar.B(hVar) | mVar.B(i0VarA);
                    objQ2 = mVar.q();
                    if (zB2 || objQ2 == c2565a) {
                        objQ2 = new et1.j(p1Var2, hVar, i0VarA, null);
                        mVar.K(objQ2);
                    }
                    l0.e((p) objQ2, kVar, mVar);
                    mVar.y();
                    mVar.f();
                }
                v.h.z(iHashCode6, mVar, iHashCode6, bVar3);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC9, mVar);
                b0 b0Var5 = b0.f22601a;
                r rVarE3 = u1.n.e(x2.f(aVar5, 1.0f), d92.b.a(mVar).c().c(), aVar6);
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarE3, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar7);
                } else {
                    mVar.c();
                }
                b4.c(eVar6, z0VarD, mVar);
                b4.c(c1623g3, i2VarX, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar3);
                } else {
                    v.h.z(iHashCode, mVar, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, mVar);
                u uVar2 = u.f22885a;
                r rVarF2 = x2.f(aVar5, 0.5f);
                d92.b.f58625c.getClass();
                j92.e eVar8 = j92.b.f97899b;
                float f16 = eVar8.f97920e;
                float f17 = eVar8.f97918c;
                v.a(uVar2.c(c2.l.C(rVarF2, 0.0f, 0.0f, f16, 0.0f, 11), h4.d.a.f81529g), hVar.f140852c, null, lVar, mVar, 0, 4);
                mVar.y();
                c2.j.i iVarI2 = c2.j.i(f17);
                l2 l2VarE2 = c2.l.e(0.0f, f17, 0.0f, 0.0f, 13);
                zB = mVar.B(hVar) | mVar.B(lVar2) | mVar.B(lVar3);
                objQ = mVar.q();
                if (zB) {
                    objQ = new ci0.b(hVar, 16, lVar2, lVar3);
                    mVar.K(objQ);
                } else {
                    objQ = new ci0.b(hVar, 16, lVar2, lVar3);
                    mVar.K(objQ);
                }
                p1Var2 = p1Var;
                e2.c.b(null, i0VarA, l2VarE2, iVarI2, null, null, false, null, (e23.l) objQ, mVar, 0, 489);
                zB2 = mVar.B(hVar) | mVar.B(i0VarA);
                objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new et1.j(p1Var2, hVar, i0VarA, null);
                    mVar.K(objQ2);
                } else {
                    objQ2 = new et1.j(p1Var2, hVar, i0VarA, null);
                    mVar.K(objQ2);
                }
                l0.e((p) objQ2, kVar, mVar);
                mVar.y();
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x0416  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:156:0x05af  */
    /* JADX WARN: Code duplicated, block: B:163:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:202:0x0779  */
    /* JADX WARN: Code duplicated, block: B:209:0x07ad  */
    private final Object b(Object obj, Object obj2) {
        x0 x0Var;
        p3.m mVar;
        e0.a aVar;
        h5.g.a.b bVar;
        String strZ0;
        e0.a aVar2;
        h5.g.a.b bVar2;
        String strZ1;
        e0.a aVar3;
        h5.g.a.b bVar3;
        final int i14;
        Integer num;
        final int i15;
        Integer num2;
        final int i16;
        Integer num3;
        String str = (String) this.f57531b;
        d71.i iVar = (d71.i) this.f57532c;
        String str2 = (String) this.f57533d;
        String str3 = (String) this.f57534e;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar4 = r.S;
            r rVarD = x2.d(aVar4, 1.0f);
            boolean zB = mVar2.B(str);
            Object objQ = mVar2.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zB) {
                objQ = new t(str, 29);
                mVar2.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t(str, 29);
                    mVar2.K(objQ);
                }
            }
            r rVarC = p5.v.c((e23.l) objQ, rVarD, false);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81536n;
            z zVarA = y.a(gVar, aVar6, mVar2, 6);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            r rVarC2 = h4.k.c(rVarC, mVar2);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar7);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar2);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar4);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar2);
            b0 b0Var = b0.f22601a;
            Integer num4 = iVar != null ? iVar.f58155d : null;
            Integer num5 = iVar != null ? iVar.f58158g : null;
            Integer num6 = iVar != null ? iVar.f58161j : null;
            float fMax = (num4 == null || num5 == null || num6 == null) ? Float.NaN : Math.max(Math.max(num4.intValue(), num5.intValue()), num6.intValue());
            Integer num7 = iVar != null ? iVar.f58153b : null;
            Integer num8 = iVar != null ? iVar.f58156e : null;
            Integer num9 = iVar != null ? iVar.f58159h : null;
            final float fMax2 = Math.max(fMax, (num7 == null || num8 == null || num9 == null) ? Float.NaN : Math.max(Math.max(num7.intValue(), num8.intValue()), num9.intValue()));
            boolean zIsNaN = Float.isNaN(fMax2);
            r rVarA = b0Var.a(aVar4, 1.0f, true);
            z zVarA2 = y.a(c2.j.f22694d, aVar6, mVar2, 0);
            int iHashCode2 = Long.hashCode(mVar2.getU());
            i2 i2VarX2 = mVar2.x();
            r rVarC3 = h4.k.c(rVarA, mVar2);
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar7);
            } else {
                mVar2.c();
            }
            b4.c(eVar, zVarA2, mVar2);
            b4.c(c1623g, i2VarX2, mVar2);
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar2, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC3, mVar2);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, mVar2);
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar2 = j92.b.f97899b;
            mh.c(str3, c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, eVar2.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97933j;
            x0 x0VarB2 = d92.c.b(x0Var2, mVar2);
            s0 s0VarA = t0.a(mVar2);
            s5.c.b bVar6 = new s5.c.b(0, 1, null);
            int iJ = bVar6.j(x0VarB2.f157322a);
            try {
                Unit unit = Unit.INSTANCE;
                bVar6.f(iJ);
                float fC1 = ((g6.c) mVar2.A(t1.f91490h)).c1((int) (s0.b(s0VarA, bVar6.k(), null, 0, false, 0, null, 0L, null, null, null, 2046).f157282c & 4294967295L)) / 2;
                g6.f.a aVar8 = g6.f.f75994b;
                if (zIsNaN) {
                    x0Var = x0Var2;
                    mVar = mVar2;
                    mVar.C(217958760);
                    mVar.f();
                } else {
                    mVar2.C(210667653);
                    r rVarF = x2.f(aVar4, 1.0f);
                    bVar5.getClass();
                    r rVarC4 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar2.f97917b, 7);
                    h4.g.b bVar7 = h4.d.a.f81534l;
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    s2 s2VarA = q2.a(c0343j, bVar7, mVar2, 48);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC5 = h4.k.c(rVarC4, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        aVar = aVar7;
                        mVar2.M(aVar);
                    } else {
                        aVar = aVar7;
                        mVar2.c();
                    }
                    b4.c(eVar, s2VarA, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        bVar = bVar4;
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    } else {
                        bVar = bVar4;
                    }
                    b4.c(fVar, rVarC5, mVar2);
                    u2 u2Var = u2.f22900a;
                    String strZ2 = "";
                    if (iVar == null || (num3 = iVar.f58153b) == null) {
                        strZ0 = "";
                    } else {
                        int iIntValue2 = num3.intValue();
                        l3.f23124b.getClass();
                        strZ0 = l3.a.Z0(iIntValue2);
                    }
                    h5.g.a.b bVar8 = bVar;
                    e0.a aVar9 = aVar;
                    mh.c(strZ0, x2.f(aVar4, 0.33f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 48, 0, 131068);
                    p3.m mVar3 = mVar2;
                    m92.z zVarB = f71.h.b(mVar3);
                    f02.s.f67747a.getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    gl.c cVar = gl.c.f77766a;
                    cVar.getClass();
                    long jK = gl.c.a(mVar3).k();
                    float f14 = f71.h.f69448a;
                    final m92.z zVar = new m92.z(jK, f14, null, 4, null);
                    mVar3.C(-1621409043);
                    Integer num10 = iVar != null ? iVar.f58153b : null;
                    Integer num11 = iVar != null ? iVar.f58154c : null;
                    Integer num12 = iVar != null ? iVar.f58155d : null;
                    if (num10 != null && num11 != null && num12 != null) {
                        int iIntValue3 = num12.intValue();
                        int iIntValue4 = num11.intValue();
                        final int iIntValue5 = num10.intValue();
                        boolean zK = mVar3.k(iIntValue4) | mVar3.k(iIntValue3) | mVar3.r(zVarB) | mVar3.i(fMax2);
                        Object objQ2 = mVar3.q();
                        if (zK) {
                            objQ2 = new f71.f(iIntValue4, iIntValue3, zVarB, fMax2, 0);
                            mVar3.K(objQ2);
                        } else {
                            aVar5.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f71.f(iIntValue4, iIntValue3, zVarB, fMax2, 0);
                                mVar3.K(objQ2);
                            }
                        }
                        e23.l lVar = (e23.l) objQ2;
                        boolean zK2 = mVar3.k(iIntValue5) | mVar3.r(zVar) | mVar3.i(fMax2);
                        Object objQ3 = mVar3.q();
                        if (zK2) {
                            i16 = 0;
                            objQ3 = new e23.l() { // from class: f71.g
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    q4.f fVar3 = (q4.f) obj3;
                                    switch (i16) {
                                        case 0:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue5), zVar, Float.valueOf(fMax2), null);
                                        case 1:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue5), zVar, Float.valueOf(fMax2), null);
                                        default:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue5), zVar, Float.valueOf(fMax2), null);
                                    }
                                }
                            };
                            mVar3.K(objQ3);
                        } else {
                            aVar5.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                i16 = 0;
                                objQ3 = new e23.l() { // from class: f71.g
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        q4.f fVar3 = (q4.f) obj3;
                                        switch (i16) {
                                            case 0:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue5), zVar, Float.valueOf(fMax2), null);
                                            case 1:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue5), zVar, Float.valueOf(fMax2), null);
                                            default:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue5), zVar, Float.valueOf(fMax2), null);
                                        }
                                    }
                                };
                                mVar3.K(objQ3);
                            } else {
                                i16 = 0;
                            }
                        }
                        r rVarH = x2.h(x2.f(aVar4, 1.0f), fC1);
                        e23.l[] lVarArr = new e23.l[2];
                        lVarArr[i16] = (e23.l) objQ3;
                        lVarArr[1] = lVar;
                        m92.r.b(rVarH, i53.a.a(lVarArr), null, null, false, gl1.y.Q(mVar3, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar3, 0, 0, 2012);
                        mVar3 = mVar3;
                    }
                    mVar3.f();
                    mVar3.y();
                    r rVarF2 = x2.f(aVar4, 1.0f);
                    bVar5.getClass();
                    r rVarC6 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar2.f97917b, 7);
                    s2 s2VarA2 = q2.a(c0343j, bVar7, mVar3, 48);
                    int iHashCode4 = Long.hashCode(mVar3.getU());
                    i2 i2VarX4 = mVar3.x();
                    r rVarC7 = h4.k.c(rVarC6, mVar3);
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        aVar2 = aVar9;
                        mVar3.M(aVar2);
                    } else {
                        aVar2 = aVar9;
                        mVar3.c();
                    }
                    b4.c(eVar, s2VarA2, mVar3);
                    b4.c(c1623g, i2VarX4, mVar3);
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                        bVar2 = bVar8;
                        v.h.z(iHashCode4, mVar3, iHashCode4, bVar2);
                    } else {
                        bVar2 = bVar8;
                    }
                    b4.c(fVar, rVarC7, mVar3);
                    if (iVar == null || (num2 = iVar.f58156e) == null) {
                        strZ1 = "";
                    } else {
                        int iIntValue6 = num2.intValue();
                        l3.f23124b.getClass();
                        strZ1 = l3.a.Z0(iIntValue6);
                    }
                    h5.g.a.b bVar9 = bVar2;
                    e0.a aVar10 = aVar2;
                    p3.m mVar4 = mVar3;
                    mh.c(strZ1, x2.f(aVar4, 0.33f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 48, 0, 131068);
                    p3.m mVar5 = mVar4;
                    m92.z zVarB2 = f71.h.b(mVar5);
                    cVar.getClass();
                    final m92.z zVar2 = new m92.z(gl.c.a(mVar5).i(), f14, null, 4, null);
                    mVar5.C(-435516630);
                    Integer num13 = iVar != null ? iVar.f58156e : null;
                    Integer num14 = iVar != null ? iVar.f58157f : null;
                    Integer num15 = iVar != null ? iVar.f58158g : null;
                    if (num13 != null && num14 != null && num15 != null) {
                        int iIntValue7 = num15.intValue();
                        int iIntValue8 = num14.intValue();
                        final int iIntValue9 = num13.intValue();
                        boolean zK3 = mVar5.k(iIntValue8) | mVar5.k(iIntValue7) | mVar5.r(zVarB2) | mVar5.i(fMax2);
                        Object objQ4 = mVar5.q();
                        if (zK3) {
                            objQ4 = new f71.f(iIntValue8, iIntValue7, zVarB2, fMax2, 1);
                            mVar5.K(objQ4);
                        } else {
                            aVar5.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new f71.f(iIntValue8, iIntValue7, zVarB2, fMax2, 1);
                                mVar5.K(objQ4);
                            }
                        }
                        e23.l lVar2 = (e23.l) objQ4;
                        boolean zK4 = mVar5.k(iIntValue9) | mVar5.r(zVar2) | mVar5.i(fMax2);
                        Object objQ5 = mVar5.q();
                        if (zK4) {
                            i15 = 1;
                            objQ5 = new e23.l() { // from class: f71.g
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    q4.f fVar3 = (q4.f) obj3;
                                    switch (i15) {
                                        case 0:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue9), zVar2, Float.valueOf(fMax2), null);
                                        case 1:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue9), zVar2, Float.valueOf(fMax2), null);
                                        default:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue9), zVar2, Float.valueOf(fMax2), null);
                                    }
                                }
                            };
                            mVar5.K(objQ5);
                        } else {
                            aVar5.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                i15 = 1;
                                objQ5 = new e23.l() { // from class: f71.g
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        q4.f fVar3 = (q4.f) obj3;
                                        switch (i15) {
                                            case 0:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue9), zVar2, Float.valueOf(fMax2), null);
                                            case 1:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue9), zVar2, Float.valueOf(fMax2), null);
                                            default:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue9), zVar2, Float.valueOf(fMax2), null);
                                        }
                                    }
                                };
                                mVar5.K(objQ5);
                            } else {
                                i15 = 1;
                            }
                        }
                        r rVarH2 = x2.h(x2.f(aVar4, 1.0f), fC1);
                        e23.l[] lVarArr2 = new e23.l[2];
                        lVarArr2[0] = (e23.l) objQ5;
                        lVarArr2[i15] = lVar2;
                        m92.r.b(rVarH2, i53.a.a(lVarArr2), null, null, false, gl1.y.Q(mVar5, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar5, 0, 0, 2012);
                        mVar5 = mVar5;
                    }
                    mVar5.f();
                    mVar5.y();
                    r rVarF3 = x2.f(aVar4, 1.0f);
                    bVar5.getClass();
                    r rVarC8 = c2.l.C(rVarF3, 0.0f, 0.0f, 0.0f, eVar2.f97917b, 7);
                    s2 s2VarA3 = q2.a(c0343j, bVar7, mVar5, 48);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    r rVarC9 = h4.k.c(rVarC8, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        aVar3 = aVar10;
                        mVar5.M(aVar3);
                    } else {
                        aVar3 = aVar10;
                        mVar5.c();
                    }
                    b4.c(eVar, s2VarA3, mVar5);
                    b4.c(c1623g, i2VarX5, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        bVar3 = bVar9;
                        v.h.z(iHashCode5, mVar5, iHashCode5, bVar3);
                    } else {
                        bVar3 = bVar9;
                    }
                    b4.c(fVar, rVarC9, mVar5);
                    if (iVar != null && (num = iVar.f58159h) != null) {
                        int iIntValue10 = num.intValue();
                        l3.f23124b.getClass();
                        strZ2 = l3.a.Z0(iIntValue10);
                    }
                    h5.g.a.b bVar10 = bVar3;
                    e0.a aVar11 = aVar3;
                    p3.m mVar6 = mVar5;
                    mh.c(strZ2, x2.f(aVar4, 0.33f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar6, 48, 0, 131068);
                    p3.m mVar7 = mVar6;
                    m92.z zVarB3 = f71.h.b(mVar7);
                    cVar.getClass();
                    final m92.z zVar3 = new m92.z(gl.c.a(mVar7).o(), f14, null, 4, null);
                    mVar7.C(-213605048);
                    Integer num16 = iVar != null ? iVar.f58159h : null;
                    Integer num17 = iVar != null ? iVar.f58160i : null;
                    Integer num18 = iVar != null ? iVar.f58161j : null;
                    if (num16 != null && num17 != null && num18 != null) {
                        int iIntValue11 = num18.intValue();
                        int iIntValue12 = num17.intValue();
                        final int iIntValue13 = num16.intValue();
                        boolean zK5 = mVar7.k(iIntValue12) | mVar7.k(iIntValue11) | mVar7.r(zVarB3) | mVar7.i(fMax2);
                        Object objQ6 = mVar7.q();
                        if (zK5) {
                            objQ6 = new f71.f(iIntValue12, iIntValue11, zVarB3, fMax2, 2);
                            mVar7.K(objQ6);
                        } else {
                            aVar5.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new f71.f(iIntValue12, iIntValue11, zVarB3, fMax2, 2);
                                mVar7.K(objQ6);
                            }
                        }
                        e23.l lVar3 = (e23.l) objQ6;
                        boolean zK6 = mVar7.k(iIntValue13) | mVar7.r(zVar3) | mVar7.i(fMax2);
                        Object objQ7 = mVar7.q();
                        if (zK6) {
                            i14 = 2;
                            objQ7 = new e23.l() { // from class: f71.g
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    q4.f fVar3 = (q4.f) obj3;
                                    switch (i14) {
                                        case 0:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue13), zVar3, Float.valueOf(fMax2), null);
                                        case 1:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue13), zVar3, Float.valueOf(fMax2), null);
                                        default:
                                            fVar3.getClass();
                                            return f0.b(fVar3, new l(0, iIntValue13), zVar3, Float.valueOf(fMax2), null);
                                    }
                                }
                            };
                            mVar7.K(objQ7);
                        } else {
                            aVar5.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                i14 = 2;
                                objQ7 = new e23.l() { // from class: f71.g
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        q4.f fVar3 = (q4.f) obj3;
                                        switch (i14) {
                                            case 0:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue13), zVar3, Float.valueOf(fMax2), null);
                                            case 1:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue13), zVar3, Float.valueOf(fMax2), null);
                                            default:
                                                fVar3.getClass();
                                                return f0.b(fVar3, new l(0, iIntValue13), zVar3, Float.valueOf(fMax2), null);
                                        }
                                    }
                                };
                                mVar7.K(objQ7);
                            } else {
                                i14 = 2;
                            }
                        }
                        r rVarH3 = x2.h(x2.f(aVar4, 1.0f), fC1);
                        e23.l[] lVarArr3 = new e23.l[i14];
                        lVarArr3[0] = (e23.l) objQ7;
                        lVarArr3[1] = lVar3;
                        m92.r.b(rVarH3, i53.a.a(lVarArr3), null, null, false, gl1.y.Q(mVar7, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar7, 0, 0, 2012);
                        mVar7 = mVar7;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    mVar7.f();
                    mVar7.y();
                    r rVarF4 = x2.f(aVar4, 1.0f);
                    s2 s2VarA4 = q2.a(c0343j, bVar7, mVar7, 48);
                    int iHashCode6 = Long.hashCode(mVar7.getU());
                    i2 i2VarX6 = mVar7.x();
                    r rVarC10 = h4.k.c(rVarF4, mVar7);
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar11);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar, s2VarA4, mVar7);
                    b4.c(c1623g, i2VarX6, mVar7);
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar7, iHashCode6, bVar10);
                    }
                    b4.c(fVar, rVarC10, mVar7);
                    m92.z zVarB4 = f71.h.b(mVar7);
                    r rVarH4 = x2.h(x2.f(aVar4, 0.3f), fC1);
                    bVar5.getClass();
                    f0.a(c2.l.C(rVarH4, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11), new j23.l(0, 1), zVarB4, mVar7, 512);
                    String strQ = gl1.y.Q(mVar7, R.string.lbl_optimal_range);
                    fVar2.getClass();
                    x0Var = x0Var2;
                    p3.m mVar8 = mVar7;
                    mh.c(strQ, x2.f(aVar4, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar7), mVar8, 48, 0, 131068);
                    mVar = mVar8;
                    mVar.y();
                    mVar.f();
                }
                mVar.y();
                if (zIsNaN) {
                    mVar.C(1684712766);
                    mVar.f();
                } else {
                    mVar.C(1684612822);
                    fVar2.getClass();
                    p3.m mVar9 = mVar;
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar9, 0, 0, 131070);
                    mVar = mVar9;
                    mVar.f();
                }
                mVar.y();
            } catch (Throwable th3) {
                bVar6.f(iJ);
                throw th3;
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        String string;
        j92.e eVar;
        b63.u uVar;
        b63.u uVarE;
        km1.r rVar = (km1.r) this.f57531b;
        km1.c cVar = (km1.c) this.f57532c;
        km1.p pVar = (km1.p) this.f57533d;
        p1 p1Var = (p1) this.f57534e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarY = c2.l.y(aVar, eVar2.f97921f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            b63.u uVarE2 = null;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            g8.i.h(rVar, mVar, 0);
            if (rVar == null) {
                mVar.C(-959729174);
                mVar.f();
                string = null;
            } else {
                mVar.C(661777655);
                l22.a aVarS = a0.s(mVar);
                int i14 = gn1.g.f78087a[rVar.ordinal()];
                if (i14 == 1) {
                    string = aVarS.getString(R.string.lbl_with_internal_rhythm);
                } else if (i14 == 2) {
                    string = aVarS.getString(R.string.lbl_of_internal_rhythm);
                } else if (i14 == 3) {
                    string = aVarS.getString(R.string.lbl_internal_rhythm);
                } else if (i14 != 4) {
                    string = i14 != 8 ? null : aVarS.getString(R.string.lbl_internal_rhythm);
                } else {
                    string = aVarS.getString(R.string.lbl_with_internal_rhythm);
                }
                mVar.f();
            }
            if (string != null) {
                mVar.C(-959624362);
                r rVarC2 = c2.l.C(aVar, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                String str = string;
                eVar = eVar2;
                mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar), mVar, 0, 0, 131068);
                mVar = mVar;
                mVar.f();
            } else {
                eVar = eVar2;
                mVar.C(-959396047);
                mVar.f();
            }
            r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            sn1.a aVar4 = sn1.a.f160413a;
            km1.v dailySleep = cVar != null ? cVar.getDailySleep() : null;
            aVar4.getClass();
            j23.i iVarA = sn1.a.a(dailySleep);
            if (pVar != null) {
                b63.z.INSTANCE.getClass();
                b63.z zVarA2 = b63.z.Companion.a();
                b63.u uVarB = km1.q.b(pVar);
                e53.j jVarC = uVarB != null ? b63.b.c(uVarB, zVarA2) : null;
                if (jVarC == null || pVar.getLastSleepMidpointMins() == null) {
                    uVarE = null;
                } else {
                    int iIntValue2 = pVar.getLastSleepMidpointMins().intValue();
                    b63.i.INSTANCE.getClass();
                    b63.i.e eVar3 = b63.i.f16188b;
                    eVar3.getClass();
                    uVarE = b63.b.e(b63.m.a(jVarC, iIntValue2, eVar3), zVarA2);
                }
                uVar = uVarE;
            } else {
                uVar = null;
            }
            j23.i iVarA2 = pVar != null ? km1.q.a(pVar) : null;
            if (pVar != null) {
                b63.z.INSTANCE.getClass();
                b63.z zVarA3 = b63.z.Companion.a();
                b63.u uVarB2 = km1.q.b(pVar);
                e53.j jVarC2 = uVarB2 != null ? b63.b.c(uVarB2, zVarA3) : null;
                if (jVarC2 != null && pVar.getOptimalSleepWindowMidpointMins() != null) {
                    int iIntValue3 = pVar.getOptimalSleepWindowMidpointMins().intValue();
                    b63.i.INSTANCE.getClass();
                    b63.i.e eVar4 = b63.i.f16188b;
                    eVar4.getClass();
                    uVarE2 = b63.b.e(b63.m.a(jVarC2, iIntValue3, eVar4), zVarA3);
                }
            }
            b63.u uVar2 = uVarE2;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new b2(p1Var, 14);
                mVar.K(objQ);
            }
            gn1.d.a(rVarC3, iVarA, uVar, iVarA2, uVar2, (e23.l) objQ, mVar, 196608);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    private final Object d(Object obj, Object obj2) {
        g02.l0 l0Var = (g02.l0) this.f57531b;
        e23.a aVar = (e23.a) this.f57532c;
        String str = (String) this.f57533d;
        String str2 = (String) this.f57534e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22696f, aVar3, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            if (l0Var instanceof g02.l0.c) {
                mVar.C(-277669133);
                g02.l0.c cVar = (g02.l0.c) l0Var;
                g02.k0.b(cVar.f74466b, 0, mVar, cVar.f74465a);
                mVar.f();
            } else {
                boolean z14 = l0Var instanceof g02.l0.b;
                p3.m.a aVar5 = p3.m.f135153a;
                if (z14) {
                    mVar.C(-277350019);
                    int i14 = ((g02.l0.b) l0Var).f74464a;
                    boolean zB = mVar.B(aVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new h0(aVar, 0);
                        mVar.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(aVar, 0);
                            mVar.K(objQ);
                        }
                    }
                    g02.k0.a((e23.a) objQ, i14, mVar, 0);
                    mVar.f();
                } else {
                    if (!(l0Var instanceof g02.l0.a)) {
                        throw n23.j.m(mVar, -147506376);
                    }
                    mVar.C(-277137018);
                    int i15 = ((g02.l0.a) l0Var).f74463a;
                    boolean zB2 = mVar.B(aVar);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new h0(aVar, 1);
                        mVar.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h0(aVar, 1);
                            mVar.K(objQ2);
                        }
                    }
                    g02.k0.d((e23.a) objQ2, i15, mVar, 0);
                    mVar.f();
                }
            }
            o13.p pVar = new o13.p(str, str2);
            xz1.a.f192853a.getClass();
            m0 m0Var = new m0(14);
            g02.l.f74461a.getClass();
            r1.b.a(pVar, null, m0Var, null, null, null, g02.l.f74462b, mVar, 1572864, 58);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x055d  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:213:0x072f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0753  */
    /* JADX WARN: Code duplicated, block: B:232:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:237:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:252:0x0845  */
    /* JADX WARN: Code duplicated, block: B:257:0x0895  */
    /* JADX WARN: Code duplicated, block: B:306:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:311:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:363:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:65:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0302  */
    /* JADX WARN: Multi-variable type inference failed */
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
        Object obj3;
        Object obj4;
        int i14;
        int i15;
        String strH;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        i53.c cVarB;
        Unit unit;
        int i25 = this.f57530a;
        int i26 = 7;
        int i27 = 16;
        Object objA = null;
        p3.m.a aVar = p3.m.f135153a;
        int i28 = 2;
        boolean z14 = false;
        Object obj5 = this.f57532c;
        int i29 = 1;
        Object obj6 = this.f57534e;
        Object obj7 = this.f57533d;
        Object obj8 = this.f57531b;
        switch (i25) {
            case 0:
                i53.c cVar = (i53.c) obj8;
                e23.a aVar2 = (e23.a) obj5;
                e23.l lVar = (e23.l) obj7;
                e23.l lVar2 = (e23.l) obj6;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ArrayList<q51.e> arrayListA = t41.e.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), cVar);
                    if (arrayListA == null) {
                        mVar.C(1748847206);
                        mVar.f();
                    } else {
                        mVar.C(1748847207);
                        for (q51.e eVar : arrayListA) {
                            boolean zR = mVar.r(cVar) | mVar.B(lVar2);
                            Object objQ = mVar.q();
                            if (zR) {
                                objQ = new j(z14 ? 1 : 0, lVar2, cVar);
                                mVar.K(objQ);
                            } else {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new j(z14 ? 1 : 0, lVar2, cVar);
                                    mVar.K(objQ);
                                }
                            }
                            q51.d.b(eVar, lVar, (e23.l) objQ, mVar, 384);
                        }
                        mVar.f();
                    }
                    boolean zB = mVar.B(aVar2);
                    Object objQ2 = mVar.q();
                    if (zB) {
                        objQ2 = new cw1.p0(aVar2, 10);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cw1.p0(aVar2, 10);
                            mVar.K(objQ2);
                        }
                    }
                    q51.d.a(0, 1, (e23.a) objQ2, mVar, false);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                LocalDate localDate = (LocalDate) obj5;
                LocalDate localDate2 = (LocalDate) obj7;
                c61.a aVar3 = (c61.a) obj6;
                i53.c cVar2 = (i53.c) obj8;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    r rVarC = x2.c(x2.f(r.S, 1.0f), 1.0f);
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new com.google.maps.android.compose.clustering.d(27);
                        mVar2.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    boolean zR2 = mVar2.r(localDate) | mVar2.r(localDate2) | mVar2.k(aVar3.ordinal()) | mVar2.r(cVar2);
                    Object objQ4 = mVar2.q();
                    if (zR2 || objQ4 == c2565a) {
                        n0 n0Var = new n0(localDate, localDate2, aVar3, cVar2, 21);
                        mVar2.K(n0Var);
                        objQ4 = n0Var;
                    }
                    p002j6.c.b(lVar3, rVarC, (e23.l) objQ4, mVar2, 54, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                i53.f<o82.g> fVar = (i53.f) obj8;
                Context context = (Context) obj7;
                i81.a aVar4 = (i81.a) obj6;
                e23.a aVar5 = (e23.a) obj5;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    n82.f fVarA = n82.j.a(new n82.f.a((o82.g) p13.h0.b0(fVar), null, null, 6, null), null, mVar3, 2);
                    Object objQ5 = mVar3.q();
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        obj3 = objQ5;
                        yd1.a aVar6 = new yd1.a(context);
                        mVar3.K(aVar6);
                        obj3 = aVar6;
                    }
                    obj3 = objQ5;
                    yd1.a aVar7 = (yd1.a) obj3;
                    r.a aVar8 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar8, 1.0f), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a);
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarI, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC2 = h4.k.c(rVarE, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar9);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    b0 b0Var = b0.f22601a;
                    r rVarB = b0Var.b(aVar8, h4.d.a.f81537o);
                    mVar3.C(391396654);
                    ArrayList arrayList = new ArrayList(p13.y.r(fVar, 10));
                    for (o82.g gVar : fVar) {
                        int[] iArr = d81.y.a.f58371a;
                        int i30 = iArr[gVar.ordinal()];
                        if (i30 != 1) {
                            if (i30 != i28) {
                                strH = sn.a.h(mVar3, -434337894, R.string.lbl_one_year_abbr, mVar3);
                            } else {
                                i14 = -434340608;
                                i15 = R.string.common_lbl_twelve_weeks;
                            }
                            i16 = iArr[gVar.ordinal()];
                            if (i16 != 1) {
                                i17 = -434331717;
                                i18 = R.string.mct_next_phase_day;
                            } else if (i16 != 2) {
                                i17 = -434325995;
                                i18 = R.string.lbl_one_year;
                            } else {
                                i17 = -434328363;
                                i18 = R.string.twelve_weeks;
                            }
                            arrayList.add(new t82.a(strH, sn.a.h(mVar3, i17, i18, mVar3)));
                            i28 = 2;
                        } else {
                            i14 = -434343911;
                            i15 = R.string.lbl_one_day_abbr;
                        }
                        strH = sn.a.h(mVar3, i14, i15, mVar3);
                        i16 = iArr[gVar.ordinal()];
                        if (i16 != 1) {
                            i17 = -434331717;
                            i18 = R.string.mct_next_phase_day;
                        } else if (i16 != 2) {
                            i17 = -434325995;
                            i18 = R.string.lbl_one_year;
                        } else {
                            i17 = -434328363;
                            i18 = R.string.twelve_weeks;
                        }
                        arrayList.add(new t82.a(strH, sn.a.h(mVar3, i17, i18, mVar3)));
                        i28 = 2;
                    }
                    mVar3.f();
                    i53.c cVarE = i53.a.e(arrayList);
                    int iIndexOf = fVar.indexOf(fVarA.f124961b.a());
                    boolean zB2 = mVar3.B(fVarA);
                    Object objQ6 = mVar3.q();
                    if (zB2 || objQ6 == p3.m.a.f135155b) {
                        obj4 = objQ6;
                        a42.f0 f0Var = new a42.f0(fVarA, fVar, 2);
                        mVar3.K(f0Var);
                        obj4 = f0Var;
                    }
                    obj4 = objQ6;
                    t82.c.a(cVarE, rVarB, iIndexOf, 0.0f, (e23.l) obj4, mVar3, 0, 24);
                    r.a aVar10 = r.S;
                    q82.a.a(x2.f(aVar10, 1.0f), new n82.n(fVarA, aVar7), null, mVar3, 6, 4);
                    n82.c.a(b0Var.a(aVar10, 1.0f, true), fVarA, 1, false, z3.f.c(-923732999, new d81.b(aVar4, aVar5, i29), mVar3), mVar3, 24960, 8);
                    mVar3.y();
                    x1 x1Var5 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar11 = (e23.a) obj5;
                i53.c cVar3 = (i53.c) obj8;
                i53.c cVar4 = (i53.c) obj6;
                e23.l lVar4 = (e23.l) obj7;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (aVar11 != null) {
                        int i34 = b3.a.f15501a;
                        objA = c3.a.a();
                    }
                    da0.m0.d(objA, aVar11, null, cVar3, cVar4, lVar4, mVar4, 18874368, 46);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                CustomBarChart customBarChart = (CustomBarChart) obj8;
                rz.a aVar12 = (rz.a) obj5;
                sh0.a aVar13 = (sh0.a) obj7;
                Context context2 = (Context) obj6;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean zR3 = mVar5.r(customBarChart);
                    Object objQ7 = mVar5.q();
                    if (zR3) {
                        objQ7 = new di0.c(customBarChart, 0);
                        mVar5.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new di0.c(customBarChart, 0);
                            mVar5.K(objQ7);
                        }
                    }
                    e23.l lVar5 = (e23.l) objQ7;
                    g6.f.a aVar14 = g6.f.f75994b;
                    r rVarH = x2.h(x2.f(r.S, 1.0f), 290);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97920e;
                    r rVarC3 = c2.l.C(rVarH, f15, 0.0f, f15, f15, 2);
                    boolean zR4 = mVar5.r(aVar12) | mVar5.r(aVar13) | mVar5.r(context2);
                    Object objQ8 = mVar5.q();
                    if (zR4) {
                        objQ8 = new ci0.b(aVar12, i26, aVar13, context2);
                        mVar5.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new ci0.b(aVar12, i26, aVar13, context2);
                            mVar5.K(objQ8);
                        }
                    }
                    p002j6.c.b(lVar5, rVarC3, (e23.l) objQ8, mVar5, 0, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                CustomBarChart customBarChart2 = (CustomBarChart) obj8;
                rz.a aVar15 = (rz.a) obj5;
                sh0.e eVar2 = (sh0.e) obj7;
                Context context3 = (Context) obj6;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    boolean zR5 = mVar6.r(customBarChart2);
                    Object objQ9 = mVar6.q();
                    if (zR5) {
                        objQ9 = new di0.c(customBarChart2, 1);
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new di0.c(customBarChart2, 1);
                            mVar6.K(objQ9);
                        }
                    }
                    e23.l lVar6 = (e23.l) objQ9;
                    g6.f.a aVar16 = g6.f.f75994b;
                    r rVarH2 = x2.h(x2.f(r.S, 1.0f), 290);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f16 = j92.b.f97899b.f97920e;
                    r rVarC4 = c2.l.C(rVarH2, f16, 0.0f, f16, f16, 2);
                    boolean zR6 = mVar6.r(aVar15) | mVar6.r(eVar2) | mVar6.r(context3);
                    Object objQ10 = mVar6.q();
                    if (zR6) {
                        objQ10 = new ci0.b(aVar15, 8, eVar2, context3);
                        mVar6.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ci0.b(aVar15, 8, eVar2, context3);
                            mVar6.K(objQ10);
                        }
                    }
                    p002j6.c.b(lVar6, rVarC4, (e23.l) objQ10, mVar6, 0, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                String str = (String) obj8;
                yu0.f fVar2 = (yu0.f) obj5;
                x3 x3Var = (x3) obj7;
                x3 x3Var2 = (x3) obj6;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    r.a aVar17 = r.S;
                    String strQ = gl1.y.Q(mVar7, R.string.lbl_your_livetrack_url);
                    String strG = tn.k.g(str, (String) x3Var.getF182175a());
                    boolean zContains = x.k(yu0.c.ERROR, yu0.c.ERROR_INVALID_CHARACTERS).contains((yu0.c) x3Var2.getF182175a());
                    boolean zB3 = mVar7.B(str);
                    Object objQ11 = mVar7.q();
                    if (zB3) {
                        objQ11 = new t(str, 15);
                        mVar7.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new t(str, 15);
                            mVar7.K(objQ11);
                        }
                    }
                    e23.l lVar7 = (e23.l) objQ11;
                    boolean zR7 = mVar7.r(fVar2) | mVar7.B(str);
                    Object objQ12 = mVar7.q();
                    if (zR7) {
                        objQ12 = new cn1.d(25, fVar2, str);
                        mVar7.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new cn1.d(25, fVar2, str);
                            mVar7.K(objQ12);
                        }
                    }
                    o.b(aVar17, strQ, strG, zContains, lVar7, (e23.l) objQ12, mVar7, 3078);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                d11.i iVar = (d11.i) obj8;
                m4.q qVar = (m4.q) obj7;
                e23.a aVar18 = (e23.a) obj5;
                p1 p1Var = (p1) obj6;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strT = gl1.d.T(iVar.f57079a, mVar8, 0);
                    Object objQ13 = mVar8.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ13 == c2565a2) {
                        objQ13 = new dv0.f(p1Var, 14);
                        mVar8.K(objQ13);
                    }
                    e23.a aVar19 = (e23.a) objQ13;
                    i53.f fVarA2 = i53.a.a(new i3("SAVE", gl1.y.Q(mVar8, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR8 = mVar8.r(qVar) | mVar8.B(aVar18);
                    Object objQ14 = mVar8.q();
                    if (zR8 || objQ14 == c2565a2) {
                        objQ14 = new e11.s(qVar, aVar18, 0);
                        mVar8.K(objQ14);
                    }
                    z02.f.e(strT, null, aVar19, fVarA2, (e23.l) objQ14, mVar8, 265216);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                f11.g gVar2 = (f11.g) obj8;
                m4.q qVar2 = (m4.q) obj5;
                Context context4 = (Context) obj7;
                p1 p1Var2 = (p1) obj6;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    f11.g.b bVar2 = gVar2.f67929a;
                    if (bVar2 instanceof f11.g.b.a) {
                        i19 = 2444278;
                        i24 = R.string.create_meal;
                    } else {
                        if (!(bVar2 instanceof f11.g.b.C1412b)) {
                            throw n23.j.m(mVar9, 2441943);
                        }
                        i19 = 2447412;
                        i24 = R.string.edit_meal;
                    }
                    String strH2 = sn.a.h(mVar9, i19, i24, mVar9);
                    Object objQ15 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ15 == c2565a3) {
                        objQ15 = new dv0.f(p1Var2, 16);
                        mVar9.K(objQ15);
                    }
                    e23.a aVar20 = (e23.a) objQ15;
                    i53.f fVarA3 = i53.a.a(new i3("SAVE_MEAL", gl1.y.Q(mVar9, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR9 = mVar9.r(qVar2) | mVar9.r(gVar2) | mVar9.r(context4);
                    Object objQ16 = mVar9.q();
                    if (zR9 || objQ16 == c2565a3) {
                        objQ16 = new ci0.b(qVar2, 13, gVar2, context4);
                        mVar9.K(objQ16);
                    }
                    z02.f.e(strH2, null, aVar20, fVarA3, (e23.l) objQ16, mVar9, 265216);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj8;
                v0 v0Var = (v0) obj5;
                e23.l lVar8 = (e23.l) obj7;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj6;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    if (eVar3 == null) {
                        mVar10.C(1384664749);
                        mVar10.f();
                    } else {
                        mVar10.C(1384664750);
                        boolean zD = g22.n.d(eVar3.getF48577a().f48056p);
                        r rVarD = x2.d(r.S, 1.0f);
                        boolean zR10 = mVar10.r(v0Var) | mVar10.r(eVar3) | mVar10.B(lVar8) | mVar10.h(zD) | mVar10.r(fVar3);
                        Object objQ17 = mVar10.q();
                        if (zR10) {
                            cq.m mVar11 = new cq.m(eVar3, zD, v0Var, lVar8, fVar3, 1);
                            mVar10.K(mVar11);
                            objQ17 = mVar11;
                        } else {
                            aVar.getClass();
                            if (objQ17 == p3.m.a.f135155b) {
                                cq.m mVar12 = new cq.m(eVar3, zD, v0Var, lVar8, fVar3, 1);
                                mVar10.K(mVar12);
                                objQ17 = mVar12;
                            }
                        }
                        e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ17, mVar10, 6, 510);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj8;
                com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj5;
                v0 v0Var2 = (v0) obj7;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj6;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    boolean zR11 = mVar13.r(eVar4) | mVar13.r(h0Var) | mVar13.r(v0Var2) | mVar13.r(fVar4);
                    Object objQ18 = mVar13.q();
                    if (zR11) {
                        n0 n0Var2 = new n0(eVar4, h0Var, v0Var2, fVar4, 25);
                        mVar13.K(n0Var2);
                        objQ18 = n0Var2;
                    } else {
                        aVar.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            n0 n0Var3 = new n0(eVar4, h0Var, v0Var2, fVar4, 25);
                            mVar13.K(n0Var3);
                            objQ18 = n0Var3;
                        }
                    }
                    e2.c.b(rVarF, null, null, null, null, null, false, null, (e23.l) objQ18, mVar13, 6, 510);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                e81.a.a((r) obj8, (Integer) obj5, (n61.d) obj7, (n61.b) obj6, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                eb0.b.a((z80.k) obj8, (e23.l) obj7, (e23.a) obj5, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                et.l.a((zs.c) obj8, (e23.l) obj7, (e23.a) obj5, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                return a(obj, obj2);
            case 15:
                ((Integer) obj2).getClass();
                et1.r.a((com.garmin.android.library.mapsdkadapter.i.d) obj8, (String) obj7, (s) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                e23.a aVar21 = (e23.a) obj5;
                pt1.o oVar = (pt1.o) obj8;
                pt1.p pVar = (pt1.p) obj7;
                p pVar2 = (p) obj6;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar14, R.string.trail_details_title);
                    if (oVar == null || !oVar.f140927y) {
                        mVar14.C(1274431057);
                        mVar14.f();
                        cVarB = j53.l.b();
                    } else {
                        mVar14.C(1273842119);
                        String strQ3 = gl1.y.Q(mVar14, R.string.lbl_send_to_device);
                        u4.d.b bVar3 = u4.d.f168373k;
                        cVarB = i53.a.a(new i3("menu_item_send_to_device", strQ3, false, n5.e.b(R.drawable.send_to_device_wearable_icon, mVar14, 6), gl1.y.Q(mVar14, R.string.lbl_send_to_device), 4, (p005kotlin.jvm.internal.j) null));
                        mVar14.f();
                    }
                    i53.c cVar5 = cVarB;
                    boolean zB4 = mVar14.B(pVar) | mVar14.B(pVar2);
                    Object objQ19 = mVar14.q();
                    if (zB4) {
                        objQ19 = new e52.b(5, pVar, pVar2);
                        mVar14.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new e52.b(5, pVar, pVar2);
                            mVar14.K(objQ19);
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar21, cVar5, null, (e23.l) objQ19, mVar14, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                eu.c cVar6 = eu.c.f66055a;
                ((eu.c) obj8).d((String) obj5, (List) obj7, (p) obj6, (p3.m) obj, p0.t(3505));
                return Unit.INSTANCE;
            case 18:
                e23.a aVar22 = (e23.a) obj5;
                ew0.m mVar15 = (ew0.m) obj8;
                p1 p1Var3 = (p1) obj7;
                e23.a aVar23 = (e23.a) obj6;
                p3.m mVar16 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    if (((ew0.l) p1Var3.getF182175a()).f66232c) {
                        mVar16.C(-1728147771);
                        Integer numValueOf = Integer.valueOf(R.drawable.lifestyle_logging_onboarding);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = a2.a(t62.c.f162799a);
                        String strQ4 = gl1.y.Q(mVar16, R.string.lbl_tracking_your_lifestyle_health);
                        String strQ5 = gl1.y.Q(mVar16, R.string.msg_with_lifestyle_logging);
                        String strQ6 = gl1.y.Q(mVar16, R.string.lbl_set_up_lifestyle_logging);
                        boolean zB5 = mVar16.B(aVar22);
                        Object objQ20 = mVar16.q();
                        if (zB5) {
                            objQ20 = new eu.a(aVar22, 1);
                            mVar16.K(objQ20);
                        } else {
                            aVar.getClass();
                            if (objQ20 == p3.m.a.f135155b) {
                                objQ20 = new eu.a(aVar22, 1);
                                mVar16.K(objQ20);
                            }
                        }
                        y0.c(numValueOf, dVarA, strQ4, strQ5, strQ6, (e23.a) objQ20, z3.f.c(-884981816, new cq0.p(aVar23, i27), mVar16), mVar16, 1572864, 0);
                        mVar16.f();
                    } else if (((ew0.l) p1Var3.getF182175a()).f66231b) {
                        mVar16.C(-1727013915);
                        boolean zR12 = mVar16.r(mVar15);
                        Object objQ21 = mVar16.q();
                        if (zR12) {
                            objQ21 = new ew0.a(mVar15, i29);
                            mVar16.K(objQ21);
                        } else {
                            aVar.getClass();
                            if (objQ21 == p3.m.a.f135155b) {
                                objQ21 = new ew0.a(mVar15, i29);
                                mVar16.K(objQ21);
                            }
                        }
                        wv0.x.a(null, (e23.a) objQ21, mVar16, 0, 1);
                        mVar16.f();
                    } else {
                        mVar16.C(-1726934152);
                        mVar16.f();
                    }
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                c0.c((ew0.m) obj8, (e23.a) obj5, (gk1.b) obj7, (gk1.b) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                p pVar3 = (p) obj8;
                vt1.o oVar2 = (vt1.o) obj5;
                p1 p1Var4 = (p1) obj7;
                p1 p1Var5 = (p1) obj6;
                p3.m mVar17 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                m2.a aVar24 = m2.f66581d;
                if (mVar17.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    boolean zBooleanValue = ((Boolean) p1Var4.getF182175a()).booleanValue();
                    String strQ7 = gl1.y.Q(mVar17, R.string.lbl_next);
                    boolean zB6 = mVar17.B(pVar3) | mVar17.k(oVar2 == null ? -1 : oVar2.ordinal());
                    Object objQ22 = mVar17.q();
                    if (zB6) {
                        objQ22 = new g0(p1Var5, 18, pVar3, oVar2);
                        mVar17.K(objQ22);
                    } else {
                        aVar.getClass();
                        if (objQ22 == p3.m.a.f135155b) {
                            objQ22 = new g0(p1Var5, 18, pVar3, oVar2);
                            mVar17.K(objQ22);
                        }
                    }
                    f0Var2.d(384, 1, (e23.a) objQ22, rVarF2, strQ7, mVar17, null, zBooleanValue);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 21:
                f62.r rVar = (f62.r) obj8;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.p pVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.p) obj7;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj6;
                p3.m mVar18 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    l52.i.a<j0> aVar25 = rVar.f69316a;
                    Object objQ23 = mVar18.q();
                    aVar.getClass();
                    if (objQ23 == p3.m.a.f135155b) {
                        objQ23 = new f21.g0(9);
                        mVar18.K(objQ23);
                    }
                    e23.l lVar9 = (e23.l) objQ23;
                    lVar9.getClass();
                    l52.i.a<j0> aVarE = l52.o.e(aVar25, lVar9);
                    if (aVarE == null) {
                        mVar18.C(-984260312);
                        mVar18.f();
                    } else {
                        mVar18.C(-984260311);
                        mVar18.C(1769365773);
                        rVar.f69317b.invoke(aVarE).a(pVar4, qVar3, mVar18, 0);
                        mVar18.f();
                        mVar18.f();
                        unit = Unit.INSTANCE;
                    }
                    if (objA == null) {
                        objA = unit;
                        mVar18.C(-984171992);
                        rVar.b(mVar18, 0);
                        mVar18.f();
                    } else {
                        objA = unit;
                        mVar18.C(1769363866);
                        mVar18.f();
                    }
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 22:
                return b(obj, obj2);
            case 23:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.devices.targetedselection.c.a((com.garmin.android.apps.connectmobile.devices.targetedselection.l.a) obj8, (e23.a) obj5, (e23.a) obj7, (e23.a) obj6, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 24:
                return c(obj, obj2);
            case 25:
                ((Integer) obj2).getClass();
                fs.j.b((r) obj8, (fs.e) obj6, (e23.l) obj7, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                p1 p1Var6 = (p1) obj8;
                String str2 = (String) obj5;
                gz1.a aVar26 = (gz1.a) obj7;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar4 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj6;
                p3.m mVar19 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar27 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                if (mVar19.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    l72.f0 f0Var3 = l72.f0.f110999a;
                    r rVarF3 = x2.f(r.S, 1.0f);
                    boolean zBooleanValue2 = ((Boolean) p1Var6.getF182175a()).booleanValue();
                    boolean zR13 = mVar19.r(aVar26) | mVar19.r(bVar4);
                    Object objQ24 = mVar19.q();
                    if (zR13) {
                        objQ24 = new fz1.e(aVar26, bVar4, z14 ? 1 : 0);
                        mVar19.K(objQ24);
                    } else {
                        aVar.getClass();
                        if (objQ24 == p3.m.a.f135155b) {
                            objQ24 = new fz1.e(aVar26, bVar4, z14 ? 1 : 0);
                            mVar19.K(objQ24);
                        }
                    }
                    f0Var3.d(384, 1, (e23.a) objQ24, rVarF3, str2, mVar19, null, zBooleanValue2);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 27:
                return d(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                z1.a((String) obj8, (s5.i0) obj5, (String) obj7, (s5.i0) obj6, (p3.m) obj, p0.t(391));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                g11.d.a((r) obj8, (String) obj5, (String) obj7, (l72.x0.b) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(int i14, e23.a aVar, Object obj, Object obj2, o13.h hVar) {
        this.f57530a = i14;
        this.f57532c = aVar;
        this.f57531b = obj;
        this.f57533d = obj2;
        this.f57534e = hVar;
    }

    public /* synthetic */ i(d11.i iVar, m4.q qVar, e23.a aVar, p1 p1Var) {
        this.f57530a = 7;
        this.f57531b = iVar;
        this.f57533d = qVar;
        this.f57532c = aVar;
        this.f57534e = p1Var;
    }

    public /* synthetic */ i(e23.a aVar, i53.c cVar, i53.c cVar2, e23.l lVar) {
        this.f57530a = 3;
        this.f57532c = aVar;
        this.f57531b = cVar;
        this.f57534e = cVar2;
        this.f57533d = lVar;
    }

    public /* synthetic */ i(r rVar, fs.e eVar, e23.l lVar, e23.a aVar, int i14) {
        this.f57530a = 25;
        this.f57531b = rVar;
        this.f57534e = eVar;
        this.f57533d = lVar;
        this.f57532c = aVar;
    }

    public /* synthetic */ i(Object obj, e23.l lVar, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f57530a = i15;
        this.f57531b = obj;
        this.f57533d = lVar;
        this.f57532c = aVar;
        this.f57534e = aVar2;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f57530a = i14;
        this.f57531b = obj;
        this.f57532c = obj2;
        this.f57533d = obj3;
        this.f57534e = obj4;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f57530a = i15;
        this.f57531b = obj;
        this.f57532c = obj2;
        this.f57533d = obj3;
        this.f57534e = obj4;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, o13.h hVar, int i14) {
        this.f57530a = i14;
        this.f57531b = obj;
        this.f57533d = obj2;
        this.f57534e = obj3;
        this.f57532c = hVar;
    }

    public /* synthetic */ i(LocalDate localDate, LocalDate localDate2, c61.a aVar, i53.c cVar) {
        this.f57530a = 1;
        this.f57532c = localDate;
        this.f57533d = localDate2;
        this.f57534e = aVar;
        this.f57531b = cVar;
    }
}

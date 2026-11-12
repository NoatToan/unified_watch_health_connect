package qy0;

import am.w0;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.u1;
import c2.b0;
import c2.l;
import c2.l2;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity.e;
import e2.k0;
import e23.p;
import f5.g0;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.c1;
import i3.h1;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.ve;
import j70.x;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jy0.i0;
import l72.f0;
import l72.i3;
import l72.v2;
import lc.u0;
import ly0.r;
import o4.d0;
import o62.s0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.w;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p5.v;
import qk0.o;
import rv1.t;
import s70.c0;
import s70.r0;
import sg0.o0;
import sg0.y0;
import sk0.l1;
import sk0.n1;
import u1.a2;
import u1.d2;
import v62.b3;
import v62.o2;
import yg2.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f148478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f148479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f148480e;

    public /* synthetic */ d(d2 d2Var, im.k kVar, p1 p1Var, p1 p1Var2) {
        this.f148476a = 13;
        this.f148478c = d2Var;
        this.f148479d = kVar;
        this.f148480e = p1Var;
        this.f148477b = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        ry0.c cVar = (ry0.c) this.f148477b;
        String str = (String) this.f148478c;
        r rVar = (r) this.f148479d;
        Context context = (Context) this.f148480e;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zB = mVar.B(cVar.f155065b.f115385c);
            Object objQ = mVar.q();
            m.a aVar = m.f135153a;
            if (zB) {
                objQ = p0.n(Boolean.valueOf(cVar.f155065b.f115385c != null));
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(Boolean.valueOf(cVar.f155065b.f115385c != null));
                    mVar.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u uVar = u.f22885a;
            ly0.s sVar = cVar.f155065b;
            boolean zR = mVar.r(context) | mVar.B(str);
            Object objQ2 = mVar.q();
            if (zR) {
                objQ2 = new ry0.a(context, str, i14);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ry0.a(context, str, i14);
                    mVar.K(objQ2);
                }
            }
            ly0.q.b(sVar, str, rVar, (e23.a) objQ2, mVar, 0);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(526515324);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = uVar.c(l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97917b, 7), h4.d.a.f81531i);
                j82.f fVar = new j82.f(y.Q(mVar, R.string.title_course), null, null, 6, null);
                gl.c.f77766a.getClass();
                j82.e.k(0, rVarC2, i53.a.e(w.c(j82.e.y(fVar, gl.c.a(mVar).q()))), mVar);
                mVar.f();
            } else {
                mVar.C(526907009);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        h5.g.a.b bVar;
        w0 w0Var = (w0) this.f148477b;
        l22.a aVar = (l22.a) this.f148478c;
        i53.c cVar = (i53.c) this.f148479d;
        u00.a aVar2 = (u00.a) this.f148480e;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            h4.r rVarA = l.A(aVar3, 0.0f, f14, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarA, mVar);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            h4.r rVarZ = l.z(aVar3, f15, f14);
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.g.b bVar3 = h4.d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar3, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarZ, mVar);
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
            b4.c(eVar2, s2VarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, mVar);
            u2 u2Var = u2.f22900a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.N9);
            d92.b.f58624b.getClass();
            int i14 = 0;
            mh.c(strW, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar, 0, 0, 131070);
            mVar.y();
            s2 s2VarA2 = q2.a(c0343j, bVar3, mVar, 0);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC3 = h4.k.c(aVar3, mVar);
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
            b4.c(eVar2, s2VarA2, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                bVar = bVar2;
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            } else {
                bVar = bVar2;
            }
            b4.c(fVar, rVarC3, mVar);
            l72.x0 x0Var = l72.x0.f111346a;
            h4.r rVarZ2 = l.z(aVar3, f15, f14);
            z3.e eVarC = z3.f.c(-21208063, new ry0.g(i14, w0Var, aVar), mVar);
            int i15 = (l72.x0.f111348c << 6) | 48;
            x0Var.e(rVarZ2, eVarC, mVar, i15, 0);
            mVar.y();
            s2 s2VarA3 = q2.a(c0343j, bVar3, mVar, 0);
            int iHashCode4 = Long.hashCode(mVar.getU());
            i2 i2VarX4 = mVar.x();
            h4.r rVarC4 = h4.k.c(aVar3, mVar);
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
            b4.c(eVar2, s2VarA3, mVar);
            b4.c(c1623g, i2VarX4, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                v.h.z(iHashCode4, mVar, iHashCode4, bVar);
            }
            b4.c(fVar, rVarC4, mVar);
            x0Var.e(l.z(aVar3, f15, f14), z3.f.c(-174981118, new ng2.i(cVar, 16, w0Var, aVar2), mVar), mVar, i15, 0);
            mVar.y();
            s2 s2VarA4 = q2.a(c0343j, bVar3, mVar, 0);
            int iHashCode5 = Long.hashCode(mVar.getU());
            i2 i2VarX5 = mVar.x();
            h4.r rVarC5 = h4.k.c(aVar3, mVar);
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
            b4.c(eVar2, s2VarA4, mVar);
            b4.c(c1623g, i2VarX5, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode5))) {
                v.h.z(iHashCode5, mVar, iHashCode5, bVar);
            }
            b4.c(fVar, rVarC5, mVar);
            x0Var.e(l.z(aVar3, f15, f14), z3.f.c(-328754173, new ry0.g(cVar, w0Var), mVar), mVar, i15, 0);
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        String str = (String) this.f148477b;
        p pVar = (p) this.f148478c;
        String str2 = (String) this.f148479d;
        p pVar2 = (p) this.f148480e;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = l.y(aVar, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            h4.r rVarC2 = l.C(u2Var.a(aVar, 0.9f, true), 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
            c2.j.c cVar = c2.j.f22696f;
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = c2.y.a(cVar, aVar3, mVar, 6);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarC2, mVar);
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
            b4.c(eVar2, zVarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, mVar);
            b0 b0Var = b0.f22601a;
            d92.b.f58624b.getClass();
            mh.c(str, v2.a(aVar, false, new s50.b(3), mVar, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
            if (pVar == null) {
                mVar.C(-996636459);
                mVar.f();
            } else {
                v.h.D(mVar, -863433556, pVar, mVar, 0);
                Unit unit = Unit.INSTANCE;
            }
            mh.c(str2, v2.a(aVar, false, new s50.b(4), mVar, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
            mVar.y();
            h4.r rVarA = u2Var.a(aVar, 0.1f, true);
            z zVarA2 = c2.y.a(c2.j.f22694d, aVar3, mVar, 6);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC4 = h4.k.c(rVarA, mVar);
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
            b4.c(eVar2, zVarA2, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC4, mVar);
            if (pVar2 == null) {
                mVar.C(834612140);
                mVar.f();
            } else {
                v.h.D(mVar, 858206965, pVar2, mVar, 0);
                Unit unit2 = Unit.INSTANCE;
            }
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        y0.b((List) this.f148477b, (o0) this.f148478c, (o0) this.f148479d, (nw0.n) this.f148480e, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        sg2.l.a((h4.r) this.f148477b, (Map) this.f148478c, (h0) this.f148479d, (e23.a) this.f148480e, (m) obj, p0.t(7));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    private final Object f(Object obj, Object obj2) {
        i53.c cVarB;
        String str = (String) this.f148477b;
        String str2 = (String) this.f148478c;
        ti0.a aVar = (ti0.a) this.f148479d;
        x xVar = (x) this.f148480e;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            boolean zB = mVar.B(str);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new r0(str, 7);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new r0(str, 7);
                    mVar.K(objQ);
                }
            }
            h4.r rVarC = v.c((e23.l) objQ, rVarD, false);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = c2.y.a(gVar, aVar3, mVar, 6);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar);
            b0 b0Var = b0.f22601a;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            if (aVar == null || (cVarB = aVar.f164569c) == null) {
                cVarB = j53.l.b();
            }
            c02.i.a(rVarF, str2, cVarB, aVar != null ? aVar.f164570d : null, null, aVar != null ? aVar.f164571e : null, mVar, 6, 16);
            h4.r rVarX = x2.x(x2.f(aVar2, 1.0f), null, 3);
            z zVarA2 = c2.y.a(c2.j.f22695e, aVar3, mVar, 6);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarX, mVar);
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
            b4.c(eVar, zVarA2, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, mVar);
            if (xVar == null) {
                mVar.C(820780616);
                mVar.f();
            } else {
                mVar.C(820780617);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                i7.a(n5.c.a(xVar.f97674c, mVar, 0), "", x2.q(aVar2, j92.b.f97901d.f97905d), u0.f(mVar), mVar, 48, 0);
                String strQ = y.Q(mVar, R.string.lbl_trending);
                h4.r rVarX2 = x2.x(x2.f(aVar2, 1.0f), null, 3);
                d92.b.f58624b.getClass();
                g02.c.a(strQ, rVarX2, 0L, null, 0, false, 0, d92.c.f(j92.f.f97933j, mVar), 0.0d, mVar, 48, 380);
                mVar.f();
            }
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0625  */
    /* JADX WARN: Code duplicated, block: B:187:0x064e  */
    /* JADX WARN: Code duplicated, block: B:201:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:210:0x0759  */
    /* JADX WARN: Code duplicated, block: B:263:0x0993  */
    /* JADX WARN: Code duplicated, block: B:268:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:310:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:327:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:332:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:65:0x027d  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0301  */
    /* JADX WARN: Code duplicated, block: B:89:0x032a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, java.lang.String] */
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
        i53.f fVar;
        Object obj3;
        int i14 = this.f148476a;
        int i15 = 9;
        m.a aVar = m.f135153a;
        int i16 = 3;
        int i17 = 1;
        Object obj4 = this.f148479d;
        Object obj5 = this.f148478c;
        Object obj6 = this.f148480e;
        Object obj7 = this.f148477b;
        switch (i14) {
            case 0:
                x3 x3Var = (x3) obj7;
                MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = (MultiDayActivitiesEditActivity) obj5;
                sy0.j jVar = (sy0.j) obj4;
                e23.l lVar = (e23.l) obj6;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    boolean zB = mVar.B(x3Var) | mVar.r(multiDayActivitiesEditActivity);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = multiDayActivitiesEditActivity.new e(x3Var, null);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = multiDayActivitiesEditActivity.new e(x3Var, null);
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ;
                    sy0.b bVar = (sy0.b) x3Var.getF182175a();
                    Long l14 = jVar.f161227b;
                    Long l15 = jVar.f161228c;
                    i53.e<ActivityListItemDTO> eVar = jVar.f161229d;
                    boolean zR = mVar.r(multiDayActivitiesEditActivity);
                    Object objQ2 = mVar.q();
                    if (zR) {
                        objQ2 = new f(multiDayActivitiesEditActivity, i15);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new f(multiDayActivitiesEditActivity, i15);
                            mVar.K(objQ2);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ2;
                    Object objQ3 = mVar.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new a(4);
                        mVar.K(objQ3);
                    }
                    e23.a aVar3 = (e23.a) objQ3;
                    boolean zR2 = mVar.r(multiDayActivitiesEditActivity);
                    Object objQ4 = mVar.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new ov1.q(multiDayActivitiesEditActivity, 28);
                        mVar.K(objQ4);
                    }
                    p pVar = (p) objQ4;
                    boolean zR3 = mVar.r(multiDayActivitiesEditActivity);
                    Object objQ5 = mVar.q();
                    if (zR3 || objQ5 == c2565a) {
                        objQ5 = new f(multiDayActivitiesEditActivity, 10);
                        mVar.K(objQ5);
                    }
                    i0.f(lVar2, bVar, l14, l15, eVar, lVar, lVar3, aVar3, pVar, (e23.l) objQ5, mVar, 12779520);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                g21.p pVar2 = (g21.p) obj7;
                Set set = (Set) obj5;
                p pVar3 = (p) obj4;
                v21.e eVar2 = (v21.e) obj6;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.r.a aVar4 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar4, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    mVar2.C(147192732);
                    for (b11.i iVar : pVar2.f75476d) {
                        boolean zR4 = p13.h0.R(set, iVar.getF14315a());
                        h4.r.a aVar6 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarF = x2.f(l.A(aVar6, j92.b.f97899b.f97920e, 0.0f, 2), 1.0f);
                        p5.l.f136032b.getClass();
                        p5.l lVarA = p5.l.a(p5.l.f136033c);
                        boolean zB2 = mVar2.B(pVar3) | mVar2.B(iVar);
                        Object objQ6 = mVar2.q();
                        if (zB2) {
                            objQ6 = new ph1.d(23, pVar3, iVar);
                            mVar2.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == m.a.f135155b) {
                                objQ6 = new ph1.d(23, pVar3, iVar);
                                mVar2.K(objQ6);
                            }
                        }
                        ve.a(j2.g.b(rVarF, zR4, false, lVarA, (e23.l) objQ6, 10), k2.i.a(j92.b.f97900c.f97911c), d92.b.a(mVar2).c().a(), 0L, 0.0f, 0.0f, null, z3.f.c(-970015507, new r11.l(zR4, eVar2, iVar, false ? 1 : 0), mVar2), mVar2, 12582912, 120);
                    }
                    mVar2.f();
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p1 p1Var = (p1) obj7;
                e23.a aVar7 = (e23.a) obj5;
                zc.d dVar = (zc.d) obj4;
                r12.f fVar2 = (r12.f) obj6;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    z02.d.a(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(341981329, new p40.r(aVar7, 17), mVar3), null, null, null, z3.f.c(-882192627, new q72.f(17, dVar, fVar2), mVar3), mVar3, 196656, 28);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                r21.a.a((mc) obj7, (l01.a) obj5, (e23.l) obj6, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                CustomLineChart customLineChart = (CustomLineChart) obj7;
                tz.a aVar8 = (tz.a) obj5;
                n60.b bVar3 = (n60.b) obj4;
                String str = (String) obj6;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar9 = g6.f.f75994b;
                    h4.r rVarH = x2.h(l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), 330);
                    boolean zR5 = mVar4.r(customLineChart);
                    Object objQ7 = mVar4.q();
                    if (zR5) {
                        objQ7 = new b40.a(customLineChart, 10);
                        mVar4.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new b40.a(customLineChart, 10);
                            mVar4.K(objQ7);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ7;
                    boolean zR6 = mVar4.r(aVar8) | mVar4.r(bVar3) | mVar4.B(str);
                    Object objQ8 = mVar4.q();
                    if (zR6) {
                        objQ8 = new p90.h(aVar8, 23, bVar3, str);
                        mVar4.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new p90.h(aVar8, 23, bVar3, str);
                            mVar4.K(objQ8);
                        }
                    }
                    p002j6.c.b(lVar4, rVarH, (e23.l) objQ8, mVar4, 0, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                r60.c.a((LocalDate) obj7, (LocalDate) obj5, (o82.g) obj4, (n60.b) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVar2 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d) obj7;
                e23.a aVar10 = (e23.a) obj5;
                e23.a aVar11 = (e23.a) obj4;
                e23.a aVar12 = (e23.a) obj6;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a aVar13 = dVar2.f35035a;
                    AuthorizedViewerDetailActivity.b bVar4 = aVar13.f35049g;
                    int i18 = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.c.a.C0599a.f35033a[bVar4.ordinal()];
                    if (i18 == 1 || i18 == 2) {
                        mVar5.C(1562652446);
                        ue0.c cVar = aVar13.f35045c;
                        AuthorizedViewerDetailActivity.b bVar5 = AuthorizedViewerDetailActivity.b.ViewerOfThisAccount;
                        if ((bVar4 == bVar5 && cVar == ue0.c.ACCEPTED) || (bVar4 == AuthorizedViewerDetailActivity.b.ViewableAccount && cVar == ue0.c.ACCEPTED)) {
                            mVar5.C(1562709982);
                            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                            if (bVar4 == AuthorizedViewerDetailActivity.b.ViewableAccount) {
                                mVar5.C(1562912877);
                                r0Var.f105810a = y.Q(mVar5, R.string.remove_my_account_access);
                                mVar5.f();
                            } else {
                                mVar5.C(1563140696);
                                r0Var.f105810a = y.Q(mVar5, R.string.revoke_access);
                                mVar5.f();
                                aVar10 = aVar11;
                            }
                            h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            l2 l2VarA = l.a(j92.b.f97899b.f97920e);
                            c1 c1Var = c1.f87691a;
                            long jE = ds.e0.e(mVar5);
                            long jC = d0.c(0.5f, d92.b.a(mVar5).k().a(), 14);
                            c1Var.getClass();
                            h1.c(aVar10, rVarF3, false, null, c1.c(0L, jE, jC, mVar5, 5), null, l2VarA, null, z3.f.c(-2065060315, new s0(r0Var, 18), mVar5), mVar5, 805306416, 364);
                            mVar5.f();
                        } else if (bVar4 == bVar5 && cVar == ue0.c.PENDING) {
                            mVar5.C(1564169772);
                            f0.f110999a.d(384, 9, aVar12, x2.f(h4.r.S, 1.0f), y.Q(mVar5, R.string.connections_cancel_request), mVar5, null, false);
                            mVar5.f();
                        } else {
                            mVar5.C(1564539757);
                            mVar5.f();
                        }
                        mVar5.f();
                    } else {
                        if (i18 != 3 && i18 != 4) {
                            throw n23.j.m(mVar5, 743139162);
                        }
                        mVar5.C(1564792624);
                        h4.r.a aVar14 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarA = l.A(aVar14, 0.0f, j92.b.f97899b.f97923h, 1);
                        String strQ = y.Q(mVar5, R.string.msg_authorized_viewer_admin_cannot_be_removed);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar5);
                        d6.h.f57752b.getClass();
                        mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar5, 0, 0, 130044);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                e23.a aVar15 = (e23.a) obj7;
                rk0.j jVar3 = (rk0.j) obj5;
                e23.l lVar5 = (e23.l) obj6;
                p1 p1Var2 = (p1) obj4;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strQ2 = y.Q(mVar6, R.string.lbl_gear_collection);
                    boolean zB3 = mVar6.B(aVar15);
                    Object objQ9 = mVar6.q();
                    if (zB3) {
                        objQ9 = new o(aVar15, 24);
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new o(aVar15, 24);
                            mVar6.K(objQ9);
                        }
                    }
                    e23.a aVar16 = (e23.a) objQ9;
                    if (jVar3.f153165a != null) {
                        mVar6.C(-135787754);
                        String strQ3 = y.Q(mVar6, R.string.lbl_edit);
                        s62.a.f157643a.getClass();
                        t62.b bVar6 = t62.b.f162798a;
                        i3 i3Var = new i3("MENU_ITEM_EDIT", strQ3, false, b3.a(bVar6), (String) null, 20, (p005kotlin.jvm.internal.j) null);
                        String strQ4 = y.Q(mVar6, R.string.lbl_delete);
                        d92.b.f58623a.getClass();
                        i53.f fVarA = i53.a.a(i3Var, new i3("MENU_ITEM_DELETE", strQ4, false, d0.a(d92.b.a(mVar6).k().e()), d0.a(d92.b.a(mVar6).f().f()), true, o2.a(bVar6), null, 132, null));
                        mVar6.f();
                        fVar = fVarA;
                    } else {
                        mVar6.C(-135083713);
                        mVar6.f();
                        fVar = null;
                    }
                    boolean zR7 = mVar6.r(jVar3) | mVar6.B(lVar5) | mVar6.B(p1Var2);
                    Object objQ10 = mVar6.q();
                    if (zR7) {
                        objQ10 = new p90.h(jVar3, 25, lVar5, p1Var2);
                        mVar6.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new p90.h(jVar3, 25, lVar5, p1Var2);
                            mVar6.K(objQ10);
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar16, null, fVar, (e23.l) objQ10, mVar6, 2097152, 54);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                CustomLineChart customLineChart2 = (CustomLineChart) obj7;
                mm1.b bVar7 = (mm1.b) obj5;
                tz.a aVar17 = (tz.a) obj4;
                String str2 = (String) obj6;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar18 = g6.f.f75994b;
                    h4.r rVarH2 = x2.h(l.A(rVarF4, j92.b.f97899b.f97920e, 0.0f, 2), 350);
                    boolean zR8 = mVar7.r(customLineChart2);
                    Object objQ11 = mVar7.q();
                    if (zR8) {
                        objQ11 = new b40.a(customLineChart2, 11);
                        mVar7.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new b40.a(customLineChart2, 11);
                            mVar7.K(objQ11);
                        }
                    }
                    e23.l lVar6 = (e23.l) objQ11;
                    boolean zR9 = mVar7.r(bVar7) | mVar7.r(aVar17) | mVar7.B(str2);
                    Object objQ12 = mVar7.q();
                    if (zR9) {
                        objQ12 = new p90.h(bVar7, 28, aVar17, str2);
                        mVar7.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new p90.h(bVar7, 28, aVar17, str2);
                            mVar7.K(objQ12);
                        }
                    }
                    p002j6.c.b(lVar6, rVarH2, (e23.l) objQ12, mVar7, 0, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                LocalDate localDate = (LocalDate) obj7;
                LocalDate localDate2 = (LocalDate) obj5;
                mm1.b bVar8 = (mm1.b) obj4;
                String str3 = (String) obj6;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    h4.r rVarF5 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar19 = g6.f.f75994b;
                    h4.r rVarH3 = x2.h(l.A(rVarF5, j92.b.f97899b.f97920e, 0.0f, 2), 350);
                    Object objQ13 = mVar8.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ13 == c2565a2) {
                        objQ13 = new rk0.n(4);
                        mVar8.K(objQ13);
                    }
                    e23.l lVar7 = (e23.l) objQ13;
                    boolean zR10 = mVar8.r(localDate) | mVar8.r(localDate2) | mVar8.r(bVar8) | mVar8.B(str3);
                    Object objQ14 = mVar8.q();
                    if (zR10 || objQ14 == c2565a2) {
                        mt0.e0 e0Var = new mt0.e0(localDate, localDate2, (Object) bVar8, str3, 18);
                        mVar8.K(e0Var);
                        objQ14 = e0Var;
                    }
                    p002j6.c.b(lVar7, rVarH3, (e23.l) objQ14, mVar8, 6, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                DateTime dateTime = (DateTime) obj7;
                DateTime dateTime2 = (DateTime) obj5;
                zm1.s sVar = (zm1.s) obj4;
                rl1.i iVar2 = (rl1.i) obj6;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    h4.r rVarF6 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar20 = g6.f.f75994b;
                    h4.r rVarH4 = x2.h(l.A(rVarF6, j92.b.f97899b.f97920e, 0.0f, 2), 350);
                    Object objQ15 = mVar9.q();
                    aVar.getClass();
                    m.a.C2565a c2565a3 = m.a.f135155b;
                    if (objQ15 == c2565a3) {
                        objQ15 = new rk0.n(8);
                        mVar9.K(objQ15);
                    }
                    e23.l lVar8 = (e23.l) objQ15;
                    boolean zR11 = mVar9.r(dateTime) | mVar9.r(dateTime2) | mVar9.r(sVar) | mVar9.k(iVar2 == null ? -1 : iVar2.ordinal());
                    Object objQ16 = mVar9.q();
                    if (zR11 || objQ16 == c2565a3) {
                        mt0.e0 e0Var2 = new mt0.e0(dateTime, dateTime2, sVar, iVar2, 19);
                        mVar9.K(e0Var2);
                        objQ16 = e0Var2;
                    }
                    p002j6.c.b(lVar8, rVarH4, (e23.l) objQ16, mVar9, 6, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                i53.c cVar2 = (i53.c) obj7;
                List list = (List) obj5;
                e23.l lVar9 = (e23.l) obj6;
                rl1.i iVar3 = (rl1.i) obj4;
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    e2.i0 i0VarA = k0.a(0, 0, 3, mVar10);
                    Object objQ17 = mVar10.q();
                    aVar.getClass();
                    m.a.C2565a c2565a4 = m.a.f135155b;
                    if (objQ17 == c2565a4) {
                        obj3 = objQ17;
                        o53.b0 b0VarJ = l0.j(t13.h.f161748a, mVar10);
                        mVar10.K(b0VarJ);
                        obj3 = b0VarJ;
                    }
                    obj3 = objQ17;
                    o53.b0 b0Var2 = (o53.b0) obj3;
                    f82.b bVar9 = new f82.b();
                    boolean zR12 = mVar10.r(list) | mVar10.B(lVar9);
                    Object objQ18 = mVar10.q();
                    Object obj8 = objQ18;
                    if (zR12 || objQ18 == c2565a4) {
                        c42.e0 e0Var3 = new c42.e0(list, lVar9, 18);
                        mVar10.K(e0Var3);
                        obj8 = e0Var3;
                    }
                    e82.a.b(cVar2, bVar9, i0VarA, null, null, (p) obj8, mVar10, 0, 24);
                    boolean zR13 = mVar10.r(list) | mVar10.k(iVar3 == null ? -1 : iVar3.ordinal()) | mVar10.r(b0Var2) | mVar10.B(i0VarA);
                    Object objQ19 = mVar10.q();
                    if (zR13 || objQ19 == c2565a4) {
                        objQ19 = new rn1.l.a(list, iVar3, b0Var2, i0VarA, null);
                        mVar10.K(objQ19);
                    }
                    l0.e((p) objQ19, iVar3, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                LocalDate localDate3 = (LocalDate) obj7;
                LocalDate localDate4 = (LocalDate) obj5;
                mm1.f fVar3 = (mm1.f) obj4;
                String str4 = (String) obj6;
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    h4.r rVarF7 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar21 = g6.f.f75994b;
                    h4.r rVarH5 = x2.h(l.A(rVarF7, j92.b.f97899b.f97920e, 0.0f, 2), 350);
                    Object objQ20 = mVar11.q();
                    aVar.getClass();
                    m.a.C2565a c2565a5 = m.a.f135155b;
                    if (objQ20 == c2565a5) {
                        objQ20 = new rk0.n(i15);
                        mVar11.K(objQ20);
                    }
                    e23.l lVar10 = (e23.l) objQ20;
                    boolean zR14 = mVar11.r(localDate3) | mVar11.r(localDate4) | mVar11.r(fVar3) | mVar11.B(str4);
                    Object objQ21 = mVar11.q();
                    if (zR14 || objQ21 == c2565a5) {
                        mt0.e0 e0Var4 = new mt0.e0(localDate3, localDate4, (Object) fVar3, str4, 20);
                        mVar11.K(e0Var4);
                        objQ21 = e0Var4;
                    }
                    p002j6.c.b(lVar10, rVarH5, (e23.l) objQ21, mVar11, 6, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                d2 d2Var = (d2) obj5;
                im.k kVar = (im.k) obj4;
                p1 p1Var3 = (p1) obj6;
                x3 x3Var2 = (x3) obj7;
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    h4.r rVarB = a2.b(x2.d(h4.r.S, 1.0f), d2Var, true);
                    boolean zR15 = mVar12.r(kVar);
                    Object objQ22 = mVar12.q();
                    if (zR15) {
                        objQ22 = new qw0.y(kVar, 22);
                        mVar12.K(objQ22);
                    } else {
                        aVar.getClass();
                        if (objQ22 == m.a.f135155b) {
                            objQ22 = new qw0.y(kVar, 22);
                            mVar12.K(objQ22);
                        }
                    }
                    e23.l lVar11 = (e23.l) objQ22;
                    boolean zR16 = mVar12.r(kVar) | mVar12.B(p1Var3) | mVar12.B(x3Var2);
                    Object objQ23 = mVar12.q();
                    if (zR16) {
                        objQ23 = new rp.b(kVar, i17, p1Var3, x3Var2);
                        mVar12.K(objQ23);
                    } else {
                        aVar.getClass();
                        if (objQ23 == m.a.f135155b) {
                            objQ23 = new rp.b(kVar, i17, p1Var3, x3Var2);
                            mVar12.K(objQ23);
                        }
                    }
                    p002j6.c.b(lVar11, rVarB, (e23.l) objQ23, mVar12, 0, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                CustomBarChart customBarChart = (CustomBarChart) obj7;
                rz.a aVar22 = (rz.a) obj5;
                List list2 = (List) obj4;
                x00.a aVar23 = (x00.a) obj6;
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    h4.r rVarF8 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f15 = eVar3.f97920e;
                    g6.f.a aVar24 = g6.f.f75994b;
                    h4.r rVarH6 = x2.h(l.C(rVarF8, f15, 0.0f, f15, eVar3.f97921f, 2), 290);
                    boolean zR17 = mVar13.r(customBarChart);
                    Object objQ24 = mVar13.q();
                    if (zR17) {
                        objQ24 = new di0.c(customBarChart, 7);
                        mVar13.K(objQ24);
                    } else {
                        aVar.getClass();
                        if (objQ24 == m.a.f135155b) {
                            objQ24 = new di0.c(customBarChart, 7);
                            mVar13.K(objQ24);
                        }
                    }
                    e23.l lVar12 = (e23.l) objQ24;
                    boolean zR18 = mVar13.r(aVar22) | mVar13.r(list2) | mVar13.r(aVar23);
                    Object objQ25 = mVar13.q();
                    if (zR18) {
                        objQ25 = new rp.b(aVar22, i16, list2, aVar23);
                        mVar13.K(objQ25);
                    } else {
                        aVar.getClass();
                        if (objQ25 == m.a.f135155b) {
                            objQ25 = new rp.b(aVar22, i16, list2, aVar23);
                            mVar13.K(objQ25);
                        }
                    }
                    p002j6.c.b(lVar12, rVarH6, (e23.l) objQ25, mVar13, 0, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                t.b((Activity) obj7, (vv1.c) obj5, (uv1.c) obj4, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                rx1.v.a((String) obj7, (String) obj5, (e23.l) obj6, (e23.a) obj4, (m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                rx1.v.b((x5.l0) obj7, (h4.r) obj5, (Integer) obj4, (e23.l) obj6, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 18:
                return a(obj, obj2);
            case 19:
                ((Integer) obj2).getClass();
                ry0.i.c((List) obj7, (List) obj5, (ry0.m) obj4, (e23.l) obj6, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 20:
                return b(obj, obj2);
            case 21:
                h4.r rVar = (h4.r) obj7;
                p1 p1Var4 = (p1) obj5;
                z3.e eVar4 = (z3.e) obj4;
                s2.b bVar10 = (s2.b) obj6;
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    Object objQ26 = mVar14.q();
                    aVar.getClass();
                    m.a.C2565a c2565a6 = m.a.f135155b;
                    if (objQ26 == c2565a6) {
                        objQ26 = new pp.b(p1Var4, 21);
                        mVar14.K(objQ26);
                    }
                    h4.r rVarF9 = g0.f(rVar, (e23.l) objQ26);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, true);
                    int iHashCode2 = Long.hashCode(mVar14.getU());
                    i2 i2VarX2 = mVar14.x();
                    h4.r rVarC2 = h4.k.c(rVarF9, mVar14);
                    h5.g.V.getClass();
                    e0.a aVar25 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar25);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar14);
                    b4.a(mVar14, Integer.valueOf(iHashCode2), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, mVar14);
                    b4.c(h5.g.a.f81807d, rVarC2, mVar14);
                    u uVar = u.f22885a;
                    eVar4.invoke(mVar14, 0);
                    Object objQ27 = mVar14.q();
                    if (objQ27 == c2565a6) {
                        objQ27 = new rk0.w(p1Var4, 7);
                        mVar14.K(objQ27);
                    }
                    bVar10.b((e23.a) objQ27, mVar14, 6);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                c0.a((i53.c) obj7, (List) obj5, (e23.l) obj6, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                return c(obj, obj2);
            case 24:
                ((Integer) obj2).getClass();
                s70.p1.b((r70.x) obj7, (e23.l) obj6, (e23.a) obj5, (e23.l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                sa0.h.b((sa0.n.b) obj7, (sa0.n) obj5, (e23.a) obj4, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                return d(obj, obj2);
            case 27:
                return e(obj, obj2);
            case 28:
                return f(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                l1.a((n1) obj7, (e23.l) obj6, (e23.a) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Object obj, e23.l lVar, Object obj2, Object obj3, int i14) {
        this.f148476a = i14;
        this.f148477b = obj;
        this.f148478c = obj2;
        this.f148480e = lVar;
        this.f148479d = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, e23.l lVar, e23.a aVar, int i14, int i15) {
        this.f148476a = i15;
        this.f148477b = obj;
        this.f148478c = obj2;
        this.f148480e = lVar;
        this.f148479d = aVar;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f148476a = i14;
        this.f148477b = obj;
        this.f148478c = obj2;
        this.f148479d = obj3;
        this.f148480e = obj4;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f148476a = i15;
        this.f148477b = obj;
        this.f148478c = obj2;
        this.f148479d = obj3;
        this.f148480e = obj4;
    }

    public /* synthetic */ d(u1 u1Var, e23.l lVar, e23.a aVar, o13.h hVar, int i14, int i15) {
        this.f148476a = i15;
        this.f148477b = u1Var;
        this.f148480e = lVar;
        this.f148478c = aVar;
        this.f148479d = hVar;
    }
}

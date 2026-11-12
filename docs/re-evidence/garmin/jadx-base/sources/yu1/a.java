package yu1;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c80.o0;
import c80.s0;
import c80.w0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import f02.a0;
import f5.z0;
import f72.kb;
import f72.nb;
import f72.rb;
import g02.s1;
import g02.z1;
import h4.k;
import h4.r;
import hk1.v;
import i3.e5;
import i3.i7;
import i3.mh;
import i3.ve;
import java.util.Iterator;
import kotlin.t1;
import m92.c0;
import o4.d0;
import o4.f0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.i0;
import s5.x0;
import u1.y0;
import u62.f3;
import v62.s9;
import yz1.u;
import yz1.y;
import z10.e0;
import z10.h3;
import z12.o;
import z2.r1;
import zd0.g1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199772a;

    private final Object a(Object obj, Object obj2) {
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        yz1.b bVar = yz1.b.f200243a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r rVarJ = y.j(r.S, ((g6.c) mVar.A(t1.f91490h)).getF69051c());
            yz1.d dVar = new yz1.d(u.ERROR, yz1.c.SERVER, false, 4, null);
            s62.a.f157643a.getClass();
            u4.d dVarA = f3.a(t62.a.f162797a);
            gl.c.f77766a.getClass();
            d0 d0VarA = d0.a(gl.c.a(mVar).c());
            d92.b.f58623a.getClass();
            y.c(rVarJ, dVar, "Running Lactate Threshold", null, dVarA, d0VarA, 0.0f, 0, d0.a(d92.b.a(mVar).f().a()), 0.0f, null, null, null, null, null, null, null, null, null, null, mVar, 384, 0, 1048264);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        e0 e0Var = e0.f200969a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = s9.a(t62.b.f162798a);
            String strQ = gl1.y.Q(mVar, R.string.image_content_description);
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            y0.b(dVarA, strQ, x2.q(aVar, j92.b.f97901d.f97904c), null, mVar, 0, 120);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        z11.c cVar = z11.c.f201355a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            wf.f.a aVar = new wf.f.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
            h3.f201031a.getClass();
            aVar.f184930c = h3.b("MY_FITNESS_PAL");
            wf.g.a(aVar);
            wf.f fVarA = aVar.a();
            String strQ = gl1.y.Q(mVar, R.string.default_image_view_content_description);
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarH = x2.h(r.S, 100);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            jf.r.b(fVarA, strQ, l.y(rVarH, j92.b.f97899b.f97919d), null, n5.c.a(2131231982, mVar, 0), n5.c.a(2131231982, mVar, 0), null, null, null, null, null, null, mVar, 0, 0, 32712);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        z11.c cVar = z11.c.f201355a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            b82.n.a(z11.c.f201356b, gl1.y.Q(mVar, R.string.lbl_feature_not_supported), gl1.y.P(R.string.msg_third_party_not_supported, new Object[]{v.f84199e.f84204a}, mVar), null, null, mVar, 6, 24);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    private final Object e(Object obj, Object obj2) {
        Object next;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        o oVar = o.f201454a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Iterator it = ((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null)).h(s0.PROFILE, new z81.b(5)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                w0 w0Var = ((o0) next).f25511g;
                if ((w0Var instanceof c80.d0) && ((c80.d0) w0Var).f25324b == c80.d0.b.ANNUAL_REPORT) {
                    break;
                }
            }
            o0 o0Var = (o0) next;
            if (o0Var != null) {
                mVar.C(682201933);
                String strG = e5.g(gl1.y.Q(mVar, R.string.garmin_connect_name), StringUtils.SPACE, g22.n.a(gl1.y.Q(mVar, R.string.annual_report_intro_rundown)));
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarZ = l.z(aVar, eVar.f97920e, eVar.f97921f);
                String str = o0Var.f25506b;
                String str2 = o0Var.f25507c;
                String str3 = o0Var.f25508d;
                t4.d dVar = o0Var.f25509e;
                boolean zR = mVar.r(o0Var);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new yw2.h(o0Var, 4);
                    mVar.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new yw2.h(o0Var, 4);
                        mVar.K(objQ);
                    }
                }
                z12.d.a(rVarZ, strG, str, str2, str3, dVar, (e23.l) objQ, mVar, 0);
                mVar.f();
            } else {
                mVar.C(683078086);
                ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), s0.PROFILE, null, 6);
                if (lVarU == null) {
                    mVar.C(683078085);
                    mVar.f();
                } else {
                    mVar.C(-947796548);
                    lVarU.a(r.S, mVar, 6);
                    mVar.f();
                    Unit unit = Unit.INSTANCE;
                }
                mVar.f();
            }
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        o oVar = o.f201454a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, o.f201455b, mVar, 196608, 31);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        h5.g.a.b bVar;
        h5.g.a.b bVar2;
        switch (this.f199772a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar3 = b.f199773a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    ve.a(null, null, 0L, 0L, 0.0f, 0.0f, null, b.f199776d, mVar, 12582912, 127);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Fragment) obj).getClass();
                ((dx2.c) obj2).getClass();
                return Unit.INSTANCE;
            case 2:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                int i14 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                dialogInterface.getClass();
                dialogInterface.cancel();
                return Unit.INSTANCE;
            case 3:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                int i15 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                dialogInterface2.getClass();
                dialogInterface2.cancel();
                return Unit.INSTANCE;
            case 4:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                int i16 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                dialogInterface3.getClass();
                dialogInterface3.cancel();
                return Unit.INSTANCE;
            case 5:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                yy1.b bVar4 = yy1.b.f200132a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar2, 0), gl1.y.Q(mVar2, R.string.lbl_delete), null, 0L, mVar2, 0, 12);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                yy1.v.g((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                yz1.a aVar = yz1.a.f200232a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                yz1.a aVar2 = yz1.a.f200232a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar3 = r.S;
                    r rVarF = x2.f(aVar3, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarA = l.A(rVarF, 0.0f, eVar.f97920e, 1);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81536n;
                    z zVarA = c2.y.a(kVar, aVar4, mVar4, 0);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    r rVarC = k.c(rVarA, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar4);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar4);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar5);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar4);
                    b0 b0Var = b0.f22601a;
                    r rVarF2 = x2.f(aVar3, 1.0f);
                    s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81534l, mVar4, 48);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    r rVarC2 = k.c(rVarF2, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar2, s2VarA, mVar4);
                    b4.c(c1623g, i2VarX2, mVar4);
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar5);
                    }
                    b4.c(fVar, rVarC2, mVar4);
                    u2 u2Var = u2.f22900a;
                    r rVarA2 = u2Var.a(aVar3, 1.0f, true);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97928e, mVar4);
                    d6.p.f57793b.getClass();
                    int i17 = d6.p.f57795d;
                    mh.c("90", rVarA2, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, x0VarB, mVar4, 6, 24960, 110588);
                    r rVarA3 = u2Var.a(aVar3, 1.0f, true);
                    z zVarA2 = c2.y.a(kVar, aVar4, mVar4, 0);
                    int iHashCode3 = Long.hashCode(mVar4.getU());
                    i2 i2VarX3 = mVar4.x();
                    r rVarC3 = k.c(rVarA3, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar2, zVarA2, mVar4);
                    b4.c(c1623g, i2VarX3, mVar4);
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                        bVar = bVar5;
                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar);
                    } else {
                        bVar = bVar5;
                    }
                    b4.c(fVar, rVarC3, mVar4);
                    x0 x0Var = j92.f.f97932i;
                    h5.g.a.b bVar6 = bVar;
                    mh.c("Good", null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, d92.c.b(x0Var, mVar4), mVar4, 6, 24960, 110590);
                    x0 x0Var2 = j92.f.f97935l;
                    mh.c("Quality", null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, d92.c.b(x0Var2, mVar4), mVar4, 6, 24960, 110590);
                    mVar4.y();
                    r rVarA4 = u2Var.a(aVar3, 1.0f, true);
                    z zVarA3 = c2.y.a(kVar, aVar4, mVar4, 0);
                    int iHashCode4 = Long.hashCode(mVar4.getU());
                    i2 i2VarX4 = mVar4.x();
                    r rVarC4 = k.c(rVarA4, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar2, zVarA3, mVar4);
                    b4.c(c1623g, i2VarX4, mVar4);
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode4))) {
                        bVar2 = bVar6;
                        v.h.z(iHashCode4, mVar4, iHashCode4, bVar2);
                    } else {
                        bVar2 = bVar6;
                    }
                    b4.c(fVar, rVarC4, mVar4);
                    mh.c("7h 45m", null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, d92.c.b(x0Var, mVar4), mVar4, 6, 24960, 110590);
                    mh.c("Duration", null, 0L, null, 0L, null, 0L, null, 0L, i17, false, 1, 0, null, d92.c.b(x0Var2, mVar4), mVar4, 6, 24960, 110590);
                    mVar4.y();
                    mVar4.y();
                    r rVarC5 = l.C(b0Var.a(x2.f(aVar3, 1.0f), 1.0f, true), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar4.getU());
                    i2 i2VarX5 = mVar4.x();
                    r rVarC6 = k.c(rVarC5, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar2, z0VarD, mVar4);
                    b4.c(c1623g, i2VarX5, mVar4);
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar4, iHashCode5, bVar2);
                    }
                    b4.c(fVar, rVarC6, mVar4);
                    c2.u uVar = c2.u.f22885a;
                    m92.u.a(x2.d(aVar3, 1.0f), e02.a.f61840a, null, false, null, null, 0.0f, gl1.y.Q(mVar4, R.string.common_no_data), mVar4, 6, 7930);
                    mVar4.y();
                    r rVarC7 = l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    s2 s2VarA2 = q2.a(j.f22698h, h4.d.a.f81533k, mVar4, 6);
                    int iHashCode6 = Long.hashCode(mVar4.getU());
                    i2 i2VarX6 = mVar4.x();
                    r rVarC8 = k.c(rVarC7, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar2, s2VarA2, mVar4);
                    b4.c(c1623g, i2VarX6, mVar4);
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar4, iHashCode6, bVar2);
                    }
                    b4.c(fVar, rVarC8, mVar4);
                    mh.c("10pm", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar4), mVar4, 6, 0, 131070);
                    mh.c("7am", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar4), mVar4, 6, 0, 131070);
                    mVar4.y();
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                yz1.a aVar6 = yz1.a.f200232a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar7 = r.S;
                    j.f22691a.getClass();
                    j.k kVar2 = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA4 = c2.y.a(kVar2, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode7 = Long.hashCode(mVar5.getU());
                    i2 i2VarX7 = mVar5.x();
                    r rVarC9 = k.c(aVar7, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar8);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, zVarA4, mVar5);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX7, mVar5);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar5, iHashCode7, bVar7);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC9, mVar5);
                    r rVarA5 = b0.f22601a.a(x2.f(aVar7, 1.0f), 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    r rVarC10 = l.C(rVarA5, 0.0f, eVar4.f97918c, 0.0f, 0.0f, 13);
                    z0 z0VarD2 = q.d(h4.d.a.f81524b, false);
                    int iHashCode8 = Long.hashCode(mVar5.getU());
                    i2 i2VarX8 = mVar5.x();
                    r rVarC11 = k.c(rVarC10, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar8);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar3, z0VarD2, mVar5);
                    b4.c(c1623g2, i2VarX8, mVar5);
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode8))) {
                        v.h.z(iHashCode8, mVar5, iHashCode8, bVar7);
                    }
                    b4.c(fVar2, rVarC11, mVar5);
                    c2.u uVar2 = c2.u.f22885a;
                    c0.c(x2.d(aVar7, 1.0f), y.i(mVar5), new m92.m.d(com.nimbusds.jose.shaded.gson.internal.a.x(mVar5), null), e02.a.f61841b, 0.0f, null, Float.valueOf(28.0f), false, gl1.y.Q(mVar5, R.string.common_no_data), mVar5, 1572870);
                    mVar5.y();
                    r rVarC12 = l.C(x2.f(aVar7, 1.0f), 0.0f, eVar4.f97917b, 0.0f, eVar4.f97920e, 5);
                    d92.b.f58624b.getClass();
                    mh.c("4w Sleep Score", rVarC12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar5), mVar5, 6, 0, 131068);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                yz1.a aVar9 = yz1.a.f200232a;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r rVarI = yz1.s.i(r.S, ((g6.c) mVar6.A(t1.f91490h)).getF69051c());
                    yz1.d dVar = new yz1.d(u.SUCCESS, null, false, 6, null);
                    s62.a.f157643a.getClass();
                    yz1.s.b(rVarI, dVar, "Sleep Results", null, kb.a(t62.c.f162799a), null, 0.0f, 0, null, 0.0f, null, null, yz1.a.f200235d, yz1.a.f200236e, false, false, null, null, null, mVar6, 384, 3456, 511976);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                yz1.a aVar10 = yz1.a.f200232a;
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    r rVarI2 = yz1.s.i(r.S, ((g6.c) mVar7.A(t1.f91490h)).getF69051c());
                    yz1.d dVar2 = new yz1.d(u.SUCCESS, null, false, 6, null);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = nb.a(t62.c.f162799a);
                    f02.z.f67754a.getClass();
                    gl.c.f77766a.getClass();
                    yz1.s.d(rVarI2, dVar2, "Sleep Score", "See how well you slept", "Wear your watch while sleeping to reveal in-depth sleep data and features.", dVarA, d0.a(gl.c.a(mVar7).c()), 0.0f, null, 0.0f, null, null, null, mVar7, 28032, 0, 65408);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                yz1.a aVar11 = yz1.a.f200232a;
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                yz1.a aVar12 = yz1.a.f200232a;
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r rVarI3 = yz1.s.i(r.S, ((g6.c) mVar9.A(t1.f91490h)).getF69051c());
                    yz1.d dVar3 = new yz1.d(u.ERROR, null, false, 6, null);
                    s62.a.f157643a.getClass();
                    yz1.s.c(rVarI3, dVar3, "Sleep Score", null, nb.a(t62.c.f162799a), null, 0.0f, 0, null, 0.0f, null, null, yz1.a.f200237f, null, mVar9, 384, 384, 12264);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                yz1.b bVar8 = yz1.b.f200243a;
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                yz1.b bVar9 = yz1.b.f200243a;
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    Double dValueOf = Double.valueOf(11548.0d);
                    Double dValueOf2 = Double.valueOf(10000.0d);
                    Object objQ = mVar11.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new yq.d(9);
                        mVar11.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar11.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new yq.d(10);
                        mVar11.K(objQ2);
                    }
                    c02.h.a(rVarD, dValueOf, dValueOf2, lVar, (e23.l) objQ2, "", mVar11, 224694);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 16:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                yz1.b bVar10 = yz1.b.f200243a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    r.a aVar13 = r.S;
                    r rVarD2 = x2.d(aVar13, 1.0f);
                    j.f22691a.getClass();
                    j.b bVar11 = j.f22695e;
                    h4.d.f81522a.getClass();
                    z zVarA5 = c2.y.a(bVar11, h4.d.a.f81536n, mVar12, 6);
                    int iHashCode9 = Long.hashCode(mVar12.getU());
                    i2 i2VarX9 = mVar12.x();
                    r rVarC13 = k.c(rVarD2, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar14);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX9, mVar12);
                    h5.g.a.b bVar12 = h5.g.a.f81813j;
                    if (mVar12.getT() || !s.g(mVar12.q(), Integer.valueOf(iHashCode9))) {
                        v.h.z(iHashCode9, mVar12, iHashCode9, bVar12);
                    }
                    b4.c(h5.g.a.f81807d, rVarC13, mVar12);
                    b0 b0Var2 = b0.f22601a;
                    c02.n.a(x2.f(aVar13, 1.0f), i53.a.a(c02.c.FRIDAY, c02.c.SATURDAY), c02.c.SUNDAY, "Goal achieved on FRIDAY and SATURDAY", c02.c.MONDAY, 0, null, false, mVar12, 28086, 224);
                    r rVarF3 = x2.f(aVar13, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    r rVarC14 = l.C(rVarF3, 0.0f, eVar5.f97917b, 0.0f, eVar5.f97920e, 5);
                    d92.b.f58624b.getClass();
                    mh.c("Last 7d", rVarC14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar12), mVar12, 6, 0, 131068);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                yz1.b bVar13 = yz1.b.f200243a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r rVarJ = y.j(r.S, ((g6.c) mVar13.A(t1.f91490h)).getF69051c());
                    yz1.d dVar4 = new yz1.d(u.SUCCESS, yz1.c.SERVER, false, 4, null);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = rb.a(t62.c.f162799a);
                    a0.f67723a.getClass();
                    gl.c.f77766a.getClass();
                    y.d(rVarJ, dVar4, "Steps", null, dVarA2, d0.a(gl.c.a(mVar13).c()), 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, null, null, false, 0L, null, yz1.b.f200245c, yz1.b.f200246d, null, null, null, null, null, null, null, mVar13, 384, 1769472, 0, 16678728);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                yz1.b bVar14 = yz1.b.f200243a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r.a aVar15 = r.S;
                    j.f22691a.getClass();
                    j.k kVar3 = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA6 = c2.y.a(kVar3, h4.d.a.f81536n, mVar14, 0);
                    int iHashCode10 = Long.hashCode(mVar14.getU());
                    i2 i2VarX10 = mVar14.x();
                    r rVarC15 = k.c(aVar15, mVar14);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar16);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA6, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX10, mVar14);
                    h5.g.a.b bVar15 = h5.g.a.f81813j;
                    if (mVar14.getT() || !s.g(mVar14.q(), Integer.valueOf(iHashCode10))) {
                        v.h.z(iHashCode10, mVar14, iHashCode10, bVar15);
                    }
                    b4.c(h5.g.a.f81807d, rVarC15, mVar14);
                    b0 b0Var3 = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var3 = j92.f.f97931h;
                    i0 i0Var = d92.c.b(x0Var3, mVar14).f157322a;
                    x0 x0Var4 = j92.f.f97933j;
                    z1.a("180", i0Var, "bpm", d92.c.b(x0Var4, mVar14).f157322a, mVar14, 390);
                    s1.a(gl1.y.Q(mVar14, R.string.activity_details_heart_rate), d92.c.f(x0Var4, mVar14), R.drawable.ic_circle, d0.a(f0.d(4292026400L)), 0.0f, 0.0f, null, mVar14, 3072, PsExtractor.VIDEO_STREAM_MASK);
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    l.f(x2.h(aVar15, f14), mVar14);
                    z1.a("7:32", d92.c.b(x0Var3, mVar14).f157322a, "min/mi", d92.c.b(x0Var4, mVar14).f157322a, mVar14, 390);
                    s1.a(gl1.y.Q(mVar14, R.string.lbl_pace), d92.c.f(x0Var4, mVar14), R.drawable.ic_rectangle, d0.a(f0.d(4280977638L)), 0.0f, 0.0f, null, mVar14, 3072, PsExtractor.VIDEO_STREAM_MASK);
                    l.f(x2.h(aVar15, f14), mVar14);
                    z1.a("265", d92.c.b(x0Var3, mVar14).f157322a, "W", d92.c.b(x0Var4, mVar14).f157322a, mVar14, 390);
                    s1.a(gl1.y.Q(mVar14, R.string.activity_details_power), d92.c.f(x0Var4, mVar14), R.drawable.ic_circle, d0.a(f0.d(4284758500L)), 0.0f, 0.0f, null, mVar14, 3072, PsExtractor.VIDEO_STREAM_MASK);
                    l.f(x2.h(aVar15, f14), mVar14);
                    z1.a("4.90", d92.c.b(x0Var3, mVar14).f157322a, "W/kg", d92.c.b(x0Var4, mVar14).f157322a, mVar14, 390);
                    s1.a(gl1.y.Q(mVar14, R.string.lbl_power_watts_per_kilogram_abbreviation), d92.c.f(x0Var4, mVar14), R.drawable.ic_circle, d0.a(f0.d(4291567041L)), 0.0f, 0.0f, null, mVar14, 3072, PsExtractor.VIDEO_STREAM_MASK);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                yz1.b bVar16 = yz1.b.f200243a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    r rVarJ2 = y.j(r.S, ((g6.c) mVar15.A(t1.f91490h)).getF69051c());
                    yz1.d dVar5 = new yz1.d(u.SUCCESS, yz1.c.SERVER, false, 4, null);
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = f3.a(t62.a.f162797a);
                    gl.c.f77766a.getClass();
                    d0 d0VarA = d0.a(gl.c.a(mVar15).c());
                    d92.b.f58623a.getClass();
                    y.c(rVarJ2, dVar5, "Running Lactate Threshold", null, dVarA3, d0VarA, 0.0f, 0, d0.a(d92.b.a(mVar15).f().a()), 0.0f, null, null, null, null, yz1.b.f200247e, null, null, null, null, null, mVar15, 384, 24576, 1031880);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                yz1.b bVar17 = yz1.b.f200243a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r rVarJ3 = y.j(r.S, ((g6.c) mVar16.A(t1.f91490h)).getF69051c());
                    yz1.d dVar6 = new yz1.d(u.SUCCESS, yz1.c.SERVER, false, 4, null);
                    yz1.z zVar = yz1.z.EMPTY;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = f3.a(t62.a.f162797a);
                    gl.c.f77766a.getClass();
                    y.c(rVarJ3, dVar6, "Running Lactate Threshold", null, dVarA4, d0.a(gl.c.a(mVar16).c()), 0.0f, 0, d0.a(fb1.c.g(d92.b.f58623a, mVar16)), 0.0f, null, null, null, null, null, null, zVar, "Wear your device to track Running Lactate Threshold.", gl1.y.Q(mVar16, R.string.smart_scale_label_get_started), null, mVar16, 384, 14155776, 589512);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 21:
                return a(obj, obj2);
            case 22:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                z02.a aVar17 = z02.a.f200730a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                z02.a aVar18 = z02.a.f200730a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 24:
                return b(obj, obj2);
            case 25:
                return c(obj, obj2);
            case 26:
                return d(obj, obj2);
            case 27:
                return e(obj, obj2);
            case 28:
                return f(obj, obj2);
            default:
                return Long.valueOf(((r1) obj2).f201769d.get());
        }
    }

    public /* synthetic */ a(byte b14, int i14) {
        this.f199772a = i14;
    }
}

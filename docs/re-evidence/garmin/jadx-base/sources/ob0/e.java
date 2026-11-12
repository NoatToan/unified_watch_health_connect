package ob0;

import a11.a0;
import am.w0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import b82.a1;
import b82.f1;
import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import com.garmin.android.apps.ui.catalog.library.help.HelpActivity;
import ds.c0;
import e23.p;
import f5.g0;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.fe;
import i3.i7;
import i3.mc;
import i3.mh;
import j70.x;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l72.c1;
import l72.p2;
import l72.r1;
import l72.w1;
import l72.y2;
import lc.m0;
import lc.u0;
import lc.v0;
import ng2.i;
import o4.d0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.l1;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p5.v;
import qb0.t;
import rk0.w;
import s5.x0;
import s70.r0;
import sg0.e1;
import sg0.o0;
import sg0.y0;
import u1.a2;
import u1.q;
import v62.s0;
import vt1.o;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f131119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f131120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f131121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f131122f;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4) {
        this.f131117a = 18;
        this.f131120d = dVar;
        this.f131118b = aVar;
        this.f131119c = aVar2;
        this.f131121e = aVar3;
        this.f131122f = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        long jA;
        p1 p1Var;
        p1 p1Var2 = (p1) this.f131120d;
        Context context = (Context) this.f131121e;
        String str = (String) this.f131122f;
        p1 p1Var3 = (p1) this.f131118b;
        p1 p1Var4 = (p1) this.f131119c;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = k.c(rVarF, mVar);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            float f14 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            r rVarC2 = l.C(aVar, f14, 0.0f, f14, f14, 2);
            String strQ = gl1.y.Q(mVar, R.string.lbl_intensity_minutes_weekly_goal);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97935l;
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar), mVar, 0, 0, 131068);
            float f15 = 2;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar.C(1253185686);
                jA = d92.b.a(mVar).j().a();
                mVar.f();
            } else {
                mVar.C(1253186267);
                mVar.f();
                d0.f128823b.getClass();
                jA = d0.f128831j;
            }
            r rVarB = q.b(f15, jA, aVar, m1.f128891a);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC3 = k.c(rVarB, mVar);
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
            b4.c(eVar, z0VarD, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, mVar);
            u uVar = u.f22885a;
            String str2 = (String) p1Var3.getF182175a();
            String str3 = rr0.m.d(context, (String) p1Var3.getF182175a()) ? str : null;
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new pp.b(p1Var2, 14);
                mVar.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                p1Var = p1Var3;
                objQ2 = new pp.b(p1Var, 15);
                mVar.K(objQ2);
            } else {
                p1Var = p1Var3;
            }
            rr0.m.a(str2, null, str3, 5, lVar, (e23.l) objQ2, mVar, 224256);
            mVar.y();
            r rVarY = l.y(aVar, f14);
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = new w(p1Var, 3);
                mVar.K(objQ3);
            }
            mh.c(gl1.y.Q(mVar, R.string.common_use_default), u1.w.d(rVarY, false, null, null, (e23.a) objQ3, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131068);
            m mVar2 = mVar;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                mVar2.C(195063746);
                r rVarC4 = l.C(aVar, 0.0f, 8, 0.0f, 0.0f, 13);
                String str4 = NumberFormat.getInstance().format(150L);
                str4.getClass();
                mh.c(gl1.y.P(R.string.lbl_im_minimum_goal_error_message, new Object[]{str4}, mVar2), rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, d92.b.a(mVar2).k().e(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar2, 48, 0, 131068);
                mVar2 = mVar2;
                mVar2.f();
            } else {
                mVar2.C(195527506);
                mVar2.f();
            }
            m mVar3 = mVar2;
            mh.c(gl1.y.Q(mVar2, R.string.msg_implicit_consent_goal), l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar2), mVar3, 48, 0, 131068);
            mVar3.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        rw1.a.a((androidx.fragment.app.m) this.f131120d, (sw1.a) this.f131121e, (e23.a) this.f131118b, (e23.a) this.f131119c, (e23.a) this.f131122f, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x052e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0537  */
    /* JADX WARN: Code duplicated, block: B:114:0x053b  */
    /* JADX WARN: Code duplicated, block: B:119:0x055a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0571  */
    /* JADX WARN: Code duplicated, block: B:128:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:130:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:132:0x061f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0623  */
    /* JADX WARN: Code duplicated, block: B:136:0x0627  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:31:0x0111  */
    /* JADX WARN: Code duplicated, block: B:34:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0246  */
    /* JADX WARN: Code duplicated, block: B:52:0x025c  */
    /* JADX WARN: Code duplicated, block: B:53:0x029c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0349  */
    /* JADX WARN: Code duplicated, block: B:61:0x0361  */
    /* JADX WARN: Code duplicated, block: B:63:0x0379  */
    /* JADX WARN: Code duplicated, block: B:65:0x0385  */
    /* JADX WARN: Code duplicated, block: B:67:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x042f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0433  */
    private final Object c(Object obj, Object obj2) {
        w0 w0Var;
        h5.g.a.f fVar;
        j.C0343j c0343j;
        h4.g.b bVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        cy0.q qVar;
        float f14;
        m mVar;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarX2;
        r rVarC2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        ry0.m.c cVar;
        ry0.m.c cVar2;
        r.a aVar;
        h5.g.a.f fVar2;
        h5.g.a.b bVar3;
        h5.g.a.e eVar;
        ry0.m mVar2;
        j92.e eVar2;
        m mVar3;
        DateTime dateTimeG;
        ry0.m mVar4;
        String summary;
        h4.g.b bVar4;
        h5.g.a.b bVar5;
        h5.g.a.f fVar3;
        int i14;
        s2 s2VarA3;
        int iHashCode3;
        i2 i2VarX3;
        r rVarC3;
        h5.g.a.b bVar6;
        i53.c<p<m, Integer, Unit>> cVar3;
        h5.g.a.b bVar7;
        h5.g.a.C1623g c1623g2;
        h5.g.a.f fVar4;
        s2 s2VarA4;
        int iHashCode4;
        i2 i2VarX4;
        r rVarC4;
        m mVar5;
        DateTime dateTimeG2;
        h5.g.a.b bVar8;
        ry0.c cVar4 = (ry0.c) this.f131120d;
        ry0.m mVar6 = (ry0.m) this.f131121e;
        w0 w0Var2 = (w0) this.f131122f;
        l22.a aVar2 = (l22.a) this.f131118b;
        u00.a aVar3 = (u00.a) this.f131119c;
        m mVar7 = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar7.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar4 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f15 = eVar3.f97918c;
            float f16 = eVar3.f97920e;
            r rVarA = l.A(aVar4, 0.0f, f15, 1);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar7, 0);
            int iHashCode5 = Long.hashCode(mVar7.getU());
            i2 i2VarX5 = mVar7.x();
            r rVarC5 = k.c(rVarA, mVar7);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (mVar7.F() == null) {
                p0.l();
                throw null;
            }
            mVar7.z();
            if (mVar7.getT()) {
                mVar7.M(aVar5);
            } else {
                mVar7.c();
            }
            h5.g.a.e eVar4 = h5.g.a.f81810g;
            b4.c(eVar4, zVarA, mVar7);
            h5.g.a.C1623g c1623g3 = h5.g.a.f81809f;
            b4.c(c1623g3, i2VarX5, mVar7);
            h5.g.a.b bVar9 = h5.g.a.f81813j;
            if (mVar7.getT()) {
                w0Var = w0Var2;
            } else {
                w0Var = w0Var2;
                if (!s.g(mVar7.q(), Integer.valueOf(iHashCode5))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC5, mVar7);
                b0 b0Var = b0.f22601a;
                r rVarZ = l.z(aVar4, f16, f15);
                c0343j = j.f22692b;
                bVar = h4.d.a.f81533k;
                s2VarA = q2.a(c0343j, bVar, mVar7, 0);
                iHashCode = Long.hashCode(mVar7.getU());
                i2VarX = mVar7.x();
                rVarC = k.c(rVarZ, mVar7);
                if (mVar7.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar7.z();
                if (mVar7.getT()) {
                    mVar7.M(aVar5);
                } else {
                    mVar7.c();
                }
                b4.c(eVar4, s2VarA, mVar7);
                b4.c(c1623g3, i2VarX, mVar7);
                if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar7, iHashCode, bVar9);
                }
                b4.c(fVar, rVarC, mVar7);
                u2 u2Var = u2.f22900a;
                qVar = cVar4.f155064a;
                String name = qVar.getName();
                d92.b.f58624b.getClass();
                f14 = f16;
                mh.c(name, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar7), mVar7, 0, 0, 131070);
                mVar = mVar7;
                mVar.y();
                r rVarA2 = l.A(aVar4, f14, 0.0f, 2);
                s2VarA2 = q2.a(c0343j, h4.d.a.f81534l, mVar, 48);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = k.c(rVarA2, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
                } else {
                    mVar.c();
                }
                b4.c(eVar4, s2VarA2, mVar);
                c1623g = c1623g3;
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT() && s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    bVar2 = bVar9;
                } else {
                    bVar2 = bVar9;
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, mVar);
                cVar = ry0.m.c.f155182a;
                if (s.g(mVar6, cVar)) {
                    mVar.C(1410477887);
                    eVar2 = eVar3;
                    aVar = aVar4;
                    cVar2 = cVar;
                    fVar2 = fVar;
                    eVar = eVar4;
                    bVar3 = bVar2;
                    mVar2 = mVar6;
                    es1.c.a(l.C(aVar4, 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11), gl1.d.T(mVar6.b(), mVar, 0), 0L, fb1.c.i(gl.c.f77766a, mVar), mVar, 0, 4);
                    mVar = mVar;
                    mVar.f();
                } else {
                    cVar2 = cVar;
                    aVar = aVar4;
                    fVar2 = fVar;
                    bVar3 = bVar2;
                    eVar = eVar4;
                    mVar2 = mVar6;
                    eVar2 = eVar3;
                    if (s.g(mVar2, ry0.m.a.f155176a)) {
                        mVar.C(1410772480);
                        String strT = gl1.d.T(mVar2.b(), mVar, 0);
                        gl.c.f77766a.getClass();
                        mVar2 = mVar2;
                        es1.c.a(l.C(aVar, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11), strT, 0L, gl.c.a(mVar).l(), mVar, 0, 4);
                        mVar = mVar;
                        mVar.f();
                    } else {
                        mVar.C(1411034864);
                        mVar.f();
                    }
                }
                s62.a.f157643a.getClass();
                m mVar8 = mVar;
                i7.b(s0.a(t62.b.f162798a), null, null, sn.a.b(mVar8), mVar8, 48, 4);
                mVar3 = mVar8;
                dateTimeG = qVar.g();
                DateTime dateTimeB = qVar.b();
                if (dateTimeG != null || dateTimeB == null) {
                    mVar4 = mVar2;
                    mVar3.C(1411908754);
                    mVar3.f();
                } else {
                    mVar3.C(1411473824);
                    mVar4 = mVar2;
                    mh.c(e5.g(j0.a(dateTimeG.toLocalDate().toDateTimeAtStartOfDay(), 'S'), " - ", j0.a(dateTimeB.toLocalDate().toDateTimeAtStartOfDay(), 'S')), l.C(aVar, eVar2.f97917b, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, mVar3), mVar3, 0, 0, 131068);
                    mVar3 = mVar3;
                    mVar3.f();
                }
                mVar3.y();
                summary = qVar.getSummary();
                if (summary == null) {
                    mVar3.C(576497942);
                    mVar3.f();
                    f14 = f14;
                    c1623g = c1623g;
                    bVar4 = bVar;
                    bVar5 = bVar3;
                    fVar3 = fVar2;
                    i14 = 0;
                } else {
                    mVar3.C(576497943);
                    if (summary.length() > 0) {
                        mVar3.C(-1368245924);
                        r rVarZ2 = l.z(aVar, f14, f15);
                        s2VarA3 = q2.a(c0343j, bVar, mVar3, 0);
                        iHashCode3 = Long.hashCode(mVar3.getU());
                        i2VarX3 = mVar3.x();
                        rVarC3 = k.c(rVarZ2, mVar3);
                        if (mVar3.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar5);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar, s2VarA3, mVar3);
                        b4.c(c1623g, i2VarX3, mVar3);
                        if (mVar3.getT() && s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                            bVar6 = bVar3;
                        } else {
                            bVar6 = bVar3;
                            v.h.z(iHashCode3, mVar3, iHashCode3, bVar6);
                        }
                        h5.g.a.f fVar5 = fVar2;
                        b4.c(fVar5, rVarC3, mVar3);
                        d6.p.f57793b.getClass();
                        m mVar9 = mVar3;
                        bVar4 = bVar;
                        i14 = 0;
                        bVar5 = bVar6;
                        fVar3 = fVar5;
                        mh.c(summary, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 5, 0, null, j92.f.f97932i, mVar9, 0, 24960, 110590);
                        mVar3 = mVar9;
                        mVar3.y();
                        mVar3.f();
                    } else {
                        bVar4 = bVar;
                        bVar5 = bVar3;
                        fVar3 = fVar2;
                        i14 = 0;
                        mVar3.C(-1367849031);
                        mVar3.f();
                    }
                    Unit unit = Unit.INSTANCE;
                    mVar3.f();
                }
                cVar3 = cVar4.f155066c;
                if (cVar3 == null && (!cVar3.isEmpty())) {
                    mVar3.C(577063538);
                    s2 s2VarA5 = q2.a(c0343j, bVar4, mVar3, i14);
                    int iHashCode6 = Long.hashCode(mVar3.getU());
                    i2 i2VarX6 = mVar3.x();
                    r rVarC6 = k.c(aVar, mVar3);
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar, s2VarA5, mVar3);
                    h5.g.a.C1623g c1623g4 = c1623g;
                    b4.c(c1623g4, i2VarX6, mVar3);
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode6))) {
                        bVar8 = bVar5;
                        v.h.z(iHashCode6, mVar3, iHashCode6, bVar8);
                    } else {
                        bVar8 = bVar5;
                    }
                    h5.g.a.f fVar6 = fVar3;
                    b4.c(fVar6, rVarC6, mVar3);
                    float f17 = eVar2.f97920e;
                    r.a aVar6 = aVar;
                    m mVar10 = mVar3;
                    c1623g2 = c1623g4;
                    bVar7 = bVar8;
                    fVar4 = fVar6;
                    aVar = aVar6;
                    m82.d.b(l.C(aVar6, 0.0f, f17, 0.0f, 0.0f, 13), cVar4.f155066c, 0.0f, null, 0.0f, null, null, null, null, 0, false, z1.u.b.f200876a, mVar10, 0, 48, 2044);
                    mVar3 = mVar10;
                    mVar3.y();
                    mVar3.f();
                } else {
                    bVar7 = bVar5;
                    c1623g2 = c1623g;
                    fVar4 = fVar3;
                    mVar3.C(577375863);
                    mVar3.f();
                }
                s2VarA4 = q2.a(c0343j, bVar4, mVar3, i14);
                iHashCode4 = Long.hashCode(mVar3.getU());
                i2VarX4 = mVar3.x();
                rVarC4 = k.c(aVar, mVar3);
                if (mVar3.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar5);
                } else {
                    mVar3.c();
                }
                b4.c(eVar, s2VarA4, mVar3);
                b4.c(c1623g2, i2VarX4, mVar3);
                if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                    v.h.z(iHashCode4, mVar3, iHashCode4, bVar7);
                }
                b4.c(fVar4, rVarC4, mVar3);
                if (s.g(mVar4, cVar2)) {
                    mVar3.C(-1058876634);
                    dateTimeG2 = qVar.g();
                    DateTime dateTimeB2 = qVar.b();
                    if (dateTimeG2 != null || dateTimeB2 == null) {
                        mVar3.C(-1057928685);
                        mVar3.f();
                    } else {
                        mVar3.C(-1058669616);
                        l72.x0.f111346a.e(l.y(aVar, f14), z3.f.c(1320812768, new ct1.f(((int) new Duration(DateTime.now().getMillis(), dateTimeG2.getMillis()).getStandardDays()) + 1, ((int) new Duration(dateTimeG2.getMillis(), dateTimeB2.getMillis()).getStandardDays()) + 1, 3), mVar3), mVar3, (l72.x0.f111348c << 6) | 48, 0);
                        mVar3.f();
                    }
                    mVar3.f();
                    mVar5 = mVar3;
                } else {
                    mVar3.C(-1057855029);
                    l72.x0.f111346a.e(l.y(aVar, f14), z3.f.c(-450423438, new i(w0Var, 17, aVar2, aVar3), mVar3), mVar3, (l72.x0.f111348c << 6) | 48, 0);
                    mVar5 = mVar3;
                    mVar5.f();
                }
                mVar5.y();
                mVar5.y();
            }
            v.h.z(iHashCode5, mVar7, iHashCode5, bVar9);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC5, mVar7);
            b0 b0Var2 = b0.f22601a;
            r rVarZ3 = l.z(aVar4, f16, f15);
            c0343j = j.f22692b;
            bVar = h4.d.a.f81533k;
            s2VarA = q2.a(c0343j, bVar, mVar7, 0);
            iHashCode = Long.hashCode(mVar7.getU());
            i2VarX = mVar7.x();
            rVarC = k.c(rVarZ3, mVar7);
            if (mVar7.F() != null) {
                p0.l();
                throw null;
            }
            mVar7.z();
            if (mVar7.getT()) {
                mVar7.M(aVar5);
            } else {
                mVar7.c();
            }
            b4.c(eVar4, s2VarA, mVar7);
            b4.c(c1623g3, i2VarX, mVar7);
            if (mVar7.getT()) {
                v.h.z(iHashCode, mVar7, iHashCode, bVar9);
            } else {
                v.h.z(iHashCode, mVar7, iHashCode, bVar9);
            }
            b4.c(fVar, rVarC, mVar7);
            u2 u2Var2 = u2.f22900a;
            qVar = cVar4.f155064a;
            String name2 = qVar.getName();
            d92.b.f58624b.getClass();
            f14 = f16;
            mh.c(name2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar7), mVar7, 0, 0, 131070);
            mVar = mVar7;
            mVar.y();
            r rVarA3 = l.A(aVar4, f14, 0.0f, 2);
            s2VarA2 = q2.a(c0343j, h4.d.a.f81534l, mVar, 48);
            iHashCode2 = Long.hashCode(mVar.getU());
            i2VarX2 = mVar.x();
            rVarC2 = k.c(rVarA3, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar4, s2VarA2, mVar);
            c1623g = c1623g3;
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT()) {
                bVar2 = bVar9;
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            } else {
                bVar2 = bVar9;
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, mVar);
            cVar = ry0.m.c.f155182a;
            if (s.g(mVar6, cVar)) {
                mVar.C(1410477887);
                eVar2 = eVar3;
                aVar = aVar4;
                cVar2 = cVar;
                fVar2 = fVar;
                eVar = eVar4;
                bVar3 = bVar2;
                mVar2 = mVar6;
                es1.c.a(l.C(aVar4, 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11), gl1.d.T(mVar6.b(), mVar, 0), 0L, fb1.c.i(gl.c.f77766a, mVar), mVar, 0, 4);
                mVar = mVar;
                mVar.f();
            } else {
                cVar2 = cVar;
                aVar = aVar4;
                fVar2 = fVar;
                bVar3 = bVar2;
                eVar = eVar4;
                mVar2 = mVar6;
                eVar2 = eVar3;
                if (s.g(mVar2, ry0.m.a.f155176a)) {
                    mVar.C(1410772480);
                    String strT2 = gl1.d.T(mVar2.b(), mVar, 0);
                    gl.c.f77766a.getClass();
                    mVar2 = mVar2;
                    es1.c.a(l.C(aVar, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11), strT2, 0L, gl.c.a(mVar).l(), mVar, 0, 4);
                    mVar = mVar;
                    mVar.f();
                } else {
                    mVar.C(1411034864);
                    mVar.f();
                }
            }
            s62.a.f157643a.getClass();
            m mVar11 = mVar;
            i7.b(s0.a(t62.b.f162798a), null, null, sn.a.b(mVar11), mVar11, 48, 4);
            mVar3 = mVar11;
            dateTimeG = qVar.g();
            DateTime dateTimeB3 = qVar.b();
            if (dateTimeG != null) {
                mVar4 = mVar2;
                mVar3.C(1411908754);
                mVar3.f();
            } else {
                mVar4 = mVar2;
                mVar3.C(1411908754);
                mVar3.f();
            }
            mVar3.y();
            summary = qVar.getSummary();
            if (summary == null) {
                mVar3.C(576497942);
                mVar3.f();
                f14 = f14;
                c1623g = c1623g;
                bVar4 = bVar;
                bVar5 = bVar3;
                fVar3 = fVar2;
                i14 = 0;
            } else {
                mVar3.C(576497943);
                if (summary.length() > 0) {
                    mVar3.C(-1368245924);
                    r rVarZ4 = l.z(aVar, f14, f15);
                    s2VarA3 = q2.a(c0343j, bVar, mVar3, 0);
                    iHashCode3 = Long.hashCode(mVar3.getU());
                    i2VarX3 = mVar3.x();
                    rVarC3 = k.c(rVarZ4, mVar3);
                    if (mVar3.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar, s2VarA3, mVar3);
                    b4.c(c1623g, i2VarX3, mVar3);
                    if (mVar3.getT()) {
                        bVar6 = bVar3;
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar6);
                    } else {
                        bVar6 = bVar3;
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar6);
                    }
                    h5.g.a.f fVar7 = fVar2;
                    b4.c(fVar7, rVarC3, mVar3);
                    d6.p.f57793b.getClass();
                    m mVar12 = mVar3;
                    bVar4 = bVar;
                    i14 = 0;
                    bVar5 = bVar6;
                    fVar3 = fVar7;
                    mh.c(summary, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 5, 0, null, j92.f.f97932i, mVar12, 0, 24960, 110590);
                    mVar3 = mVar12;
                    mVar3.y();
                    mVar3.f();
                } else {
                    bVar4 = bVar;
                    bVar5 = bVar3;
                    fVar3 = fVar2;
                    i14 = 0;
                    mVar3.C(-1367849031);
                    mVar3.f();
                }
                Unit unit2 = Unit.INSTANCE;
                mVar3.f();
            }
            cVar3 = cVar4.f155066c;
            if (cVar3 == null) {
            }
            bVar7 = bVar5;
            c1623g2 = c1623g;
            fVar4 = fVar3;
            mVar3.C(577375863);
            mVar3.f();
            s2VarA4 = q2.a(c0343j, bVar4, mVar3, i14);
            iHashCode4 = Long.hashCode(mVar3.getU());
            i2VarX4 = mVar3.x();
            rVarC4 = k.c(aVar, mVar3);
            if (mVar3.F() != null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar5);
            } else {
                mVar3.c();
            }
            b4.c(eVar, s2VarA4, mVar3);
            b4.c(c1623g2, i2VarX4, mVar3);
            if (mVar3.getT()) {
                v.h.z(iHashCode4, mVar3, iHashCode4, bVar7);
            } else {
                v.h.z(iHashCode4, mVar3, iHashCode4, bVar7);
            }
            b4.c(fVar4, rVarC4, mVar3);
            if (s.g(mVar4, cVar2)) {
                mVar3.C(-1058876634);
                dateTimeG2 = qVar.g();
                DateTime dateTimeB4 = qVar.b();
                if (dateTimeG2 != null) {
                    mVar3.C(-1057928685);
                    mVar3.f();
                } else {
                    mVar3.C(-1057928685);
                    mVar3.f();
                }
                mVar3.f();
                mVar5 = mVar3;
            } else {
                mVar3.C(-1057855029);
                l72.x0.f111346a.e(l.y(aVar, f14), z3.f.c(-450423438, new i(w0Var, 17, aVar2, aVar3), mVar3), mVar3, (l72.x0.f111348c << 6) | 48, 0);
                mVar5 = mVar3;
                mVar5.f();
            }
            mVar5.y();
            mVar5.y();
        } else {
            mVar7.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    private final Object d(Object obj, Object obj2) {
        t72.f fVar = (t72.f) this.f131120d;
        Bundle bundle = (Bundle) this.f131121e;
        i82.a aVar = (i82.a) this.f131122f;
        p1 p1Var = (p1) this.f131118b;
        p1 p1Var2 = (p1) this.f131119c;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        HelpActivity.a aVar2 = HelpActivity.f49800a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            m0 m0VarI = gl1.y.I(new v0[0], mVar);
            int i14 = h82.c.f82429e;
            fVar.a(bundle, mVar, i14 << 3);
            fVar.b(m0VarI, aVar, mVar, i14 << 6, 0);
            boolean zR = mVar.r(m0VarI) | mVar.r(fVar);
            Object objQ = mVar.q();
            if (zR) {
                Object bVar = new s72.b(m0VarI, fVar, p1Var, p1Var2, null);
                mVar.K(bVar);
                objQ = bVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    Object bVar2 = new s72.b(m0VarI, fVar, p1Var, p1Var2, null);
                    mVar.K(bVar2);
                    objQ = bVar2;
                }
            }
            l0.e((p) objQ, m0VarI, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    private final Object e(Object obj, Object obj2) {
        List<q81.k> listL0;
        long jA;
        String str = (String) this.f131120d;
        Integer num = (Integer) this.f131121e;
        n81.e eVar = (n81.e) this.f131122f;
        String str2 = (String) this.f131118b;
        x xVar = (x) this.f131119c;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            boolean zB = mVar.B(str);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new r0(str, 6);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new r0(str, 6);
                    mVar.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVarD, false);
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = y.a(gVar, aVar2, mVar, 6);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC2 = k.c(rVarC, mVar);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar);
            b0 b0Var = b0.f22601a;
            z zVarA2 = y.a(j.f22694d, aVar2, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC3 = k.c(aVar, mVar);
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
            b4.c(eVar2, zVarA2, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, mVar);
            r rVarH = x2.h(aVar, yz1.y.k(mVar));
            q81.k[] kVarArrValues = q81.k.values();
            ArrayList arrayList = new ArrayList();
            mVar.C(-196244229);
            kVarArrValues.getClass();
            if (kVarArrValues.length == 0) {
                listL0 = p13.j0.f134944a;
            } else {
                listL0 = p13.u.l0(kVarArrValues);
                Collections.reverse(listL0);
            }
            for (q81.k kVar : listL0) {
                j23.l lVar = kVar.f143336a;
                float f14 = (lVar.f96797b - lVar.f96796a) + 1;
                if (num == null) {
                    mVar.C(-385381365);
                    f02.e.f67730a.getClass();
                    jA = f02.e.c(mVar);
                } else {
                    mVar.C(-385380195);
                    q81.k.f143328e.getClass();
                    jA = q81.k.a.a(kVar, mVar);
                }
                mVar.f();
                arrayList.add(new z72.l(f14, jA, null));
            }
            mVar.f();
            i53.f fVarJ = i53.a.j(arrayList);
            x1 x1Var2 = n.f135158a;
            z72.k.a(rVarH, fVarJ, eVar != null ? eVar.f124942c : null, null, null, yz1.y.g(mVar), 3.0f, false, false, z3.f.c(-1911398671, new c0(num, 2), mVar), mVar, 806879232, 408);
            r.a aVar4 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC4 = l.C(aVar4, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            r rVarB = b0Var.b(rVarC4, h4.d.a.f81537o);
            d92.b.f58624b.getClass();
            mh.c(str2, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 131068);
            m mVar2 = mVar;
            mVar2.y();
            r rVarX = x2.x(x2.f(aVar4, 1.0f), null, 3);
            j.f22691a.getClass();
            z zVarA3 = y.a(j.f22695e, h4.d.a.f81536n, mVar2, 6);
            int iHashCode3 = Long.hashCode(mVar2.getU());
            i2 i2VarX3 = mVar2.x();
            r rVarC5 = k.c(rVarX, mVar2);
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
            b4.c(h5.g.a.f81810g, zVarA3, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX3, mVar2);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC5, mVar2);
            b0 b0Var2 = b0.f22601a;
            if (xVar == null) {
                mVar2.C(-404846400);
                mVar2.f();
            } else {
                mVar2.C(-404846399);
                i7.a(n5.c.a(xVar.f97674c, mVar2, 0), gl1.y.Q(mVar2, xVar.f97673b), x2.q(aVar4, j92.b.f97901d.f97905d), u0.f(mVar2), mVar2, 0, 0);
                mh.c(gl1.y.Q(mVar2, R.string.lbl_trending), x2.x(x2.f(aVar4, 1.0f), null, 3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 48, 0, 131068);
                mVar2 = mVar2;
                Unit unit = Unit.INSTANCE;
                mVar2.f();
            }
            mVar2.y();
            mVar2.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        sg0.h.a((ve2.e) this.f131120d, (String) this.f131122f, (mc) this.f131118b, (e23.q) this.f131119c, (e23.l) this.f131121e, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2) {
        e1 e1Var = (e1) this.f131120d;
        nw0.n nVar = (nw0.n) this.f131121e;
        o0 o0Var = (o0) this.f131122f;
        o0 o0Var2 = (o0) this.f131118b;
        p1 p1Var = (p1) this.f131119c;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (((sg0.z0) p1Var.getF182175a()).f159186b) {
                return Unit.INSTANCE;
            }
            if (((sg0.z0) p1Var.getF182175a()).f159187c != null) {
                mVar.C(-2080547692);
                boolean zR = mVar.r(e1Var);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new ro0.g(e1Var, 29);
                    mVar.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ro0.g(e1Var, 29);
                        mVar.K(objQ);
                    }
                }
                sg0.i.a(0, (e23.a) objQ, null, mVar);
                mVar.f();
            } else {
                List<ue0.l> list = ((sg0.z0) p1Var.getF182175a()).f159185a;
                if (list == null || list.isEmpty()) {
                    mVar.C(-2080414578);
                    y0.c(nVar, e1Var.f159074b.c(), mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(-2080319005);
                    y0.b(((sg0.z0) p1Var.getF182175a()).f159185a, o0Var, o0Var2, nVar, mVar, 0);
                    mVar.f();
                }
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x036b  */
    /* JADX WARN: Code duplicated, block: B:103:0x038c  */
    /* JADX WARN: Code duplicated, block: B:125:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:161:0x0709  */
    /* JADX WARN: Code duplicated, block: B:238:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:271:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:276:0x0b75  */
    /* JADX WARN: Code duplicated, block: B:285:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:319:0x0cf7  */
    /* JADX WARN: Code duplicated, block: B:330:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ff A[LOOP:1: B:89:0x02f9->B:91:0x02ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0322  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        m.a aVar;
        h5.g.a.f fVar;
        u uVar;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        boolean zB;
        Object objQ;
        ArrayList arrayList;
        Iterator<T> it;
        Object obj4;
        m mVar;
        int i14 = this.f131117a;
        int i15 = 5;
        m.a aVar2 = m.f135153a;
        Object obj5 = this.f131119c;
        Object obj6 = this.f131118b;
        Object obj7 = this.f131122f;
        Object obj8 = this.f131121e;
        Object obj9 = this.f131120d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                g.a((h) obj9, (e23.l) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ok0.s.b((ok0.n) obj9, (am.x0) obj8, (e23.a) obj6, (e23.a) obj5, (e23.a) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                o53.b0 b0Var = (o53.b0) obj9;
                zc.d dVar = (zc.d) obj8;
                GroupManageMembersActivity groupManageMembersActivity = (GroupManageMembersActivity) obj7;
                p1 p1Var = (p1) obj6;
                p1 p1Var2 = (p1) obj5;
                m mVar2 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupManageMembersActivity.a aVar3 = GroupManageMembersActivity.f36194d;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    boolean zR = mVar2.r(b0Var) | mVar2.r(dVar) | mVar2.r(groupManageMembersActivity);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        ok0.d dVar2 = new ok0.d(b0Var, dVar, groupManageMembersActivity, p1Var2, 2);
                        mVar2.K(dVar2);
                        objQ2 = dVar2;
                    } else {
                        aVar2.getClass();
                        if (objQ2 == m.a.f135155b) {
                            ok0.d dVar3 = new ok0.d(b0Var, dVar, groupManageMembersActivity, p1Var2, 2);
                            mVar2.K(dVar3);
                            objQ2 = dVar3;
                        }
                    }
                    m3.l.b(zBooleanValue, (e23.a) objQ2, null, null, null, null, z3.f.c(1044575723, new o72.b(4, dVar, groupManageMembersActivity), mVar2), mVar2, 1572864, 60);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                oo0.c.a((mc) obj9, (o53.b0) obj7, (List) obj6, (DateTime) obj5, (e23.l) obj8, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                Set set = (Set) obj9;
                Set set2 = (Set) obj8;
                p1 p1Var3 = (p1) obj7;
                Map map = (Map) obj6;
                p1 p1Var4 = (p1) obj5;
                sy0.q qVar = (sy0.q) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                qVar.getClass();
                ActivityListItemDTO activityListItemDTO = qVar.f161276a;
                if (qVar.f161277b) {
                    if (zBooleanValue2) {
                        set.remove(activityListItemDTO);
                        p1Var3.setValue(Boolean.TRUE);
                    } else {
                        set.add(activityListItemDTO);
                    }
                } else if (zBooleanValue2) {
                    set2.add(activityListItemDTO);
                    p1Var3.setValue(Boolean.TRUE);
                } else {
                    set2.remove(activityListItemDTO);
                }
                oy0.f.e(map, set2, set, p1Var4);
                return Unit.INSTANCE;
            case 5:
                u21.s sVar = (u21.s) obj9;
                e23.l lVar = (e23.l) obj8;
                e23.a aVar4 = (e23.a) obj6;
                p pVar = (p) obj7;
                p1 p1Var5 = (p1) obj5;
                m mVar3 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarB = a2.b(l.D(x2.f(r.S, 1.0f)), a2.a(mVar3), true);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    r rVarC2 = k.c(rVarB, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    b0 b0Var2 = b0.f22601a;
                    v.h.B(pVar, mVar3, 0);
                    if (sVar.f168123l) {
                        mVar3.C(-1674194391);
                        c1 c1Var = c1.f110940a;
                        String strB = g22.n.b(gl1.y.Q(mVar3, R.string.delete_food_entries));
                        String strQ = gl1.y.Q(mVar3, R.string.msg_updating_your_meal_windows_warning);
                        String strQ2 = gl1.y.Q(mVar3, R.string.lbl_common_continue);
                        String strQ3 = gl1.y.Q(mVar3, R.string.lbl_cancel);
                        boolean zB2 = mVar3.B(lVar);
                        Object objQ3 = mVar3.q();
                        if (zB2) {
                            objQ3 = new me2.d(lVar, 9);
                            mVar3.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new me2.d(lVar, 9);
                                mVar3.K(objQ3);
                            }
                        }
                        e23.a<Unit> aVar6 = (e23.a) objQ3;
                        boolean zB3 = mVar3.B(lVar);
                        Object objQ4 = mVar3.q();
                        if (zB3) {
                            objQ4 = new me2.d(lVar, 10);
                            mVar3.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new me2.d(lVar, 10);
                                mVar3.K(objQ4);
                            }
                        }
                        c1Var.a(false, strB, strQ, null, null, strQ2, false, false, aVar6, strQ3, (e23.a) objQ4, mVar3, 0, 0, 217);
                        mVar3.f();
                    } else {
                        mVar3.C(-1673730879);
                        mVar3.f();
                    }
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        mVar3.C(-1673670987);
                        c1 c1Var2 = c1.f110940a;
                        String strQ4 = gl1.y.Q(mVar3, R.string.message_common_confirm_leaving_screen);
                        String strQ5 = gl1.y.Q(mVar3, R.string.lbl_yes);
                        String strQ6 = gl1.y.Q(mVar3, R.string.common_cancel);
                        boolean zB4 = mVar3.B(aVar4);
                        Object objQ5 = mVar3.q();
                        if (zB4) {
                            objQ5 = new a0(aVar4, p1Var5, 29);
                            mVar3.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == m.a.f135155b) {
                                objQ5 = new a0(aVar4, p1Var5, 29);
                                mVar3.K(objQ5);
                            }
                        }
                        e23.a<Unit> aVar7 = (e23.a) objQ5;
                        Object objQ6 = mVar3.q();
                        aVar2.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new om0.h(p1Var5, 11);
                            mVar3.K(objQ6);
                        }
                        c1Var2.a(false, strQ4, null, null, null, strQ5, false, false, aVar7, strQ6, (e23.a) objQ6, mVar3, 0, 6, 221);
                        mVar3.f();
                    } else {
                        mVar3.C(-1673219007);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                p40.u.d((String) obj9, (String) obj7, (o53.b0) obj5, (e23.a) obj6, (e23.l) obj8, (m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                p40.u.f((r) obj9, (String) obj6, (String) obj5, (e23.l) obj8, (e23.l) obj7, (m) obj, p0.t(27655));
                return Unit.INSTANCE;
            case 8:
                o53.b0 b0Var3 = (o53.b0) obj9;
                mc mcVar = (mc) obj8;
                p pVar2 = (p) obj7;
                p1 p1Var6 = (p1) obj6;
                l1 l1Var = (l1) obj5;
                m mVar4 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    l72.w wVar = l72.w.f111301a;
                    String strQ7 = gl1.y.Q(mVar4, R.string.lbl_done);
                    boolean zR2 = mVar4.r(b0Var3) | mVar4.B(mcVar) | mVar4.B(pVar2);
                    Object objQ7 = mVar4.q();
                    if (zR2) {
                        p50.d dVar4 = new p50.d(b0Var3, mcVar, pVar2, p1Var6, l1Var, 0);
                        mVar4.K(dVar4);
                        objQ7 = dVar4;
                    } else {
                        aVar2.getClass();
                        if (objQ7 == m.a.f135155b) {
                            p50.d dVar5 = new p50.d(b0Var3, mcVar, pVar2, p1Var6, l1Var, 0);
                            mVar4.K(dVar5);
                            objQ7 = dVar5;
                        }
                    }
                    wVar.j(0, (e23.a) objQ7, strQ7, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                DeviceBackupActivity.a aVar8 = DeviceBackupActivity.f42558c;
                ((DeviceBackupActivity) obj9).ea((e23.a) obj6, (e23.a) obj5, (e23.l) obj8, (pg1.d) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                pk1.k.a aVar9 = pk1.k.f138297g;
                ((pk1.k) obj9).h((String) obj8, (String) obj7, (r) obj6, (h4.d.b) obj5, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 11:
                p1 p1Var7 = (p1) obj9;
                e23.a aVar10 = (e23.a) obj6;
                UpdateBirthdateActivity updateBirthdateActivity = (UpdateBirthdateActivity) obj8;
                p1 p1Var8 = (p1) obj7;
                p1 p1Var9 = (p1) obj5;
                m mVar5 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i16 = UpdateBirthdateActivity.f44011d;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    z02.d.a(((Boolean) p1Var7.getF182175a()).booleanValue(), z3.f.c(2024252532, new p40.r(aVar10, i15), mVar5), null, null, null, z3.f.c(-332167440, new na0.a(updateBirthdateActivity, p1Var7, p1Var8, p1Var9, 22), mVar5), mVar5, 196656, 28);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                pq1.h.a((yq1.e) obj9, (e23.a) obj6, (e23.a) obj5, (e23.a) obj8, (e23.a) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                r rVar = (r) obj9;
                p1 p1Var10 = (p1) obj8;
                z3.e eVar = (z3.e) obj7;
                s2.b bVar2 = (s2.b) obj5;
                e23.a<? extends f5.c0> aVar11 = (e23.a) obj6;
                m mVar6 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    Object objQ8 = mVar6.q();
                    aVar2.getClass();
                    if (objQ8 == m.a.f135155b) {
                        objQ8 = new pp.b(p1Var10, 3);
                        mVar6.K(objQ8);
                    }
                    r rVarF = g0.f(rVar, (e23.l) objQ8);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
                    int iHashCode3 = Long.hashCode(mVar6.getU());
                    i2 i2VarX3 = mVar6.x();
                    r rVarC3 = k.c(rVarF, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar12);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                    b4.a(mVar6, Integer.valueOf(iHashCode3), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, mVar6);
                    b4.c(h5.g.a.f81807d, rVarC3, mVar6);
                    u uVar2 = u.f22885a;
                    eVar.invoke(mVar6, 0);
                    bVar2.b(aVar11, mVar6, 6);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                t.c((qb0.v) obj9, (e23.a) obj6, (u1) obj5, (e23.l) obj8, (e23.l) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                FBTProgressReportActivity fBTProgressReportActivity = (FBTProgressReportActivity) obj9;
                tw1.m mVar7 = (tw1.m) obj8;
                uv1.c cVar = (uv1.c) obj7;
                pi0.e eVar2 = (pi0.e) obj6;
                Long l14 = (Long) obj5;
                m mVar8 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                FBTProgressReportActivity.a aVar13 = FBTProgressReportActivity.f45512b;
                if (mVar8.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(59666255, new qv1.a(fBTProgressReportActivity, mVar7, cVar, eVar2, l14, gl1.y.I(new v0[0], mVar8), s9.c.c(fBTProgressReportActivity.ca().f147947n, mVar8)), mVar8), mVar8, 196608, 31);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 16:
                final r31.j jVar = (r31.j) obj9;
                fe feVar = (fe) obj8;
                p pVar3 = (p) obj7;
                x3 x3Var = (x3) obj6;
                final p1 p1Var11 = (p1) obj5;
                m mVar9 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    if (jVar.f150034g) {
                        return Unit.INSTANCE;
                    }
                    r.a aVar14 = r.S;
                    r rVarB2 = a2.b(x2.d(aVar14, 1.0f), a2.a(mVar9), true);
                    j.f22691a.getClass();
                    j.k kVar2 = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(kVar2, h4.d.a.f81536n, mVar9, 0);
                    int iHashCode4 = Long.hashCode(mVar9.getU());
                    i2 i2VarX4 = mVar9.x();
                    r rVarC4 = k.c(rVarB2, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar15);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar9);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar9.getT() || !s.g(mVar9.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar9, iHashCode4, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar9);
                    b0 b0Var4 = b0.f22601a;
                    String strP = gl1.y.P(R.string.onboarding_set_up_your_device_heading, new Object[]{jVar.f150029b}, mVar9);
                    r rVarF2 = x2.f(aVar14, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    float f15 = eVar3.f97921f;
                    r rVarY = l.y(rVarF2, f14);
                    d6.h.f57752b.getClass();
                    int i17 = d6.h.f57755e;
                    d6.h hVarA = d6.h.a(i17);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97930g;
                    mh.c(strP, rVarY, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar9), mVar9, 0, 0, 130044);
                    String strQ8 = gl1.y.Q(mVar9, R.string.onboarding_device_setup_description);
                    r rVarA = l.A(x2.f(aVar14, 1.0f), f15, 0.0f, 2);
                    d6.h hVarA2 = d6.h.a(i17);
                    x0 x0Var2 = j92.f.f97931h;
                    mh.c(strQ8, rVarA, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, mVar9), mVar9, 0, 0, 130044);
                    int i18 = ((r31.s) x3Var.getF182175a()).f150089a;
                    int i19 = ((r31.s) x3Var.getF182175a()).f150090b;
                    int iH = d53.w.H(gl1.y.P(R.string.onboarding_device_setup_completion_progress, new Object[]{"@#", Integer.valueOf(i19)}, mVar9), "@#", 0, false, 6);
                    int length = String.valueOf(i19).length() + iH;
                    String strP2 = gl1.y.P(R.string.onboarding_device_setup_completion_progress, new Object[]{String.valueOf(i18), String.valueOf(i19)}, mVar9);
                    mVar9.C(1167954339);
                    s5.c.b bVar4 = new s5.c.b(0, 1, null);
                    int iJ = bVar4.j(d92.c.f(x0Var2, mVar9).f157322a);
                    try {
                        bVar4.b(strP2);
                        Unit unit = Unit.INSTANCE;
                        bVar4.f(iJ);
                        bVar4.a(d92.c.b(x0Var, mVar9).f157322a, iH, length);
                        s5.c cVarK = bVar4.k();
                        mVar9.f();
                        mh.d(cVarK, l.y(x2.f(aVar14, 1.0f), f15), 0L, 0L, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, null, null, mVar9, 0, 0, 523260);
                        y2.f111386a.a(((Number) s1.f.b(((r31.s) x3Var.getF182175a()).f150091c, s1.l.d(500, 0, s1.e0.f155561b, 2), null, mVar9, 0, 28).getF182175a()).floatValue(), 0.0f, 0, 0, 124, 0L, 0L, l.A(x2.f(aVar14, 1.0f), eVar3.f97922g, 0.0f, 2), mVar9);
                        i53.c<k31.c> cVar2 = jVar.f150031d;
                        long jE = d92.b.a(mVar9).e().e();
                        d31.c cVar3 = d31.c.NOT_STARTED;
                        boolean zB5 = mVar9.B(pVar3);
                        Object objQ9 = mVar9.q();
                        if (zB5) {
                            objQ9 = new a3.d(pVar3, 28);
                            mVar9.K(objQ9);
                        } else {
                            aVar2.getClass();
                            if (objQ9 == m.a.f135155b) {
                                objQ9 = new a3.d(pVar3, 28);
                                mVar9.K(objQ9);
                            }
                        }
                        r31.f.c(cVar2, jE, cVar3, feVar, (p) objQ9, (e23.l) p1Var11.getF182175a(), mVar9, 221184);
                        final int i24 = 1;
                        final int i25 = 0;
                        r1.b(gl1.y.Q(mVar9, R.string.lbl_completed), z3.f.c(-1975951319, new p() { // from class: r31.d
                            @Override // e23.p
                            public final Object invoke(Object obj10, Object obj11) {
                                int i26 = i24;
                                p1 p1Var12 = p1Var11;
                                j jVar2 = jVar;
                                switch (i26) {
                                    case 0:
                                        p3.m mVar10 = (p3.m) obj10;
                                        int iIntValue8 = ((Integer) obj11).intValue();
                                        if (mVar10.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                            x1 x1Var8 = p3.n.f135158a;
                                            Iterator<k31.c> it3 = jVar2.f150033f.iterator();
                                            while (it3.hasNext()) {
                                                f.b(it3.next(), d31.c.IGNORED, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar10), null, (e23.l) p1Var12.getF182175a(), mVar10, 48, 8);
                                            }
                                            x1 x1Var9 = p3.n.f135158a;
                                        } else {
                                            mVar10.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar11 = (p3.m) obj10;
                                        int iIntValue9 = ((Integer) obj11).intValue();
                                        if (mVar11.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                            x1 x1Var10 = p3.n.f135158a;
                                            p2 p2Var = p2.f111205a;
                                            String strQ9 = gl1.y.Q(mVar11, R.string.onboarding_complete_initial_setup);
                                            String strQ10 = gl1.y.Q(mVar11, R.string.onboarding_complete_initial_setup_subtitle);
                                            a.f149985a.getClass();
                                            p2Var.h(strQ9, strQ10, null, null, null, false, false, a.f149986b, a.f149987c, null, null, mVar11, 113246208, 0, 1660);
                                            for (k31.c cVar4 : jVar2.f150032e) {
                                                long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar11);
                                                s62.a.f157643a.getClass();
                                                f.b(cVar4, d31.c.COMPLETED, jA, v62.e1.a(t62.b.f162798a), (e23.l) p1Var12.getF182175a(), mVar11, 48, 0);
                                            }
                                            x1 x1Var11 = p3.n.f135158a;
                                        } else {
                                            mVar11.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar9), mVar9, 48, 0);
                        if (jVar.f150033f.isEmpty()) {
                            mVar9.C(2097953342);
                            mVar9.f();
                        } else {
                            mVar9.C(2097456505);
                            r1.b(gl1.y.Q(mVar9, R.string.onboarding_device_setup_not_interested), z3.f.c(-301188498, new p() { // from class: r31.d
                                @Override // e23.p
                                public final Object invoke(Object obj10, Object obj11) {
                                    int i26 = i25;
                                    p1 p1Var12 = p1Var11;
                                    j jVar2 = jVar;
                                    switch (i26) {
                                        case 0:
                                            p3.m mVar10 = (p3.m) obj10;
                                            int iIntValue8 = ((Integer) obj11).intValue();
                                            if (mVar10.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                                x1 x1Var8 = p3.n.f135158a;
                                                Iterator<k31.c> it3 = jVar2.f150033f.iterator();
                                                while (it3.hasNext()) {
                                                    f.b(it3.next(), d31.c.IGNORED, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar10), null, (e23.l) p1Var12.getF182175a(), mVar10, 48, 8);
                                                }
                                                x1 x1Var9 = p3.n.f135158a;
                                            } else {
                                                mVar10.e();
                                            }
                                            break;
                                        default:
                                            p3.m mVar11 = (p3.m) obj10;
                                            int iIntValue9 = ((Integer) obj11).intValue();
                                            if (mVar11.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                                x1 x1Var10 = p3.n.f135158a;
                                                p2 p2Var = p2.f111205a;
                                                String strQ9 = gl1.y.Q(mVar11, R.string.onboarding_complete_initial_setup);
                                                String strQ10 = gl1.y.Q(mVar11, R.string.onboarding_complete_initial_setup_subtitle);
                                                a.f149985a.getClass();
                                                p2Var.h(strQ9, strQ10, null, null, null, false, false, a.f149986b, a.f149987c, null, null, mVar11, 113246208, 0, 1660);
                                                for (k31.c cVar4 : jVar2.f150032e) {
                                                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar11);
                                                    s62.a.f157643a.getClass();
                                                    f.b(cVar4, d31.c.COMPLETED, jA, v62.e1.a(t62.b.f162798a), (e23.l) p1Var12.getF182175a(), mVar11, 48, 0);
                                                }
                                                x1 x1Var11 = p3.n.f135158a;
                                            } else {
                                                mVar11.e();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar9), mVar9, 48, 0);
                            mVar9.f();
                        }
                        mVar9.y();
                    } catch (Throwable th3) {
                        bVar4.f(iJ);
                        throw th3;
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar6 = (com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj9;
                List<r70.s> list = ((com.garmin.android.apps.connectmobile.dashboard.presentation.c.b) obj8).f33538a;
                com.garmin.android.apps.connectmobile.dashboard.presentation.a.d dVar7 = (com.garmin.android.apps.connectmobile.dashboard.presentation.a.d) obj7;
                p1 p1Var12 = (p1) obj6;
                p1 p1Var13 = (p1) obj5;
                m mVar10 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    m3.s sVarE = m3.l.e(mVar10);
                    p1 p1VarB = s9.c.b(dVar6.f33556m, Boolean.FALSE, mVar10, 48);
                    r.a aVar16 = r.S;
                    r rVarD = x2.d(aVar16, 1.0f);
                    boolean zBooleanValue3 = ((Boolean) p1VarB.getF182175a()).booleanValue();
                    boolean zR3 = mVar10.r(dVar6);
                    Object objQ10 = mVar10.q();
                    if (zR3) {
                        obj3 = objQ10;
                        r70.t tVar = new r70.t(dVar6, false ? 1 : 0);
                        mVar10.K(tVar);
                        obj3 = tVar;
                    } else {
                        aVar2.getClass();
                        if (objQ10 == m.a.f135155b) {
                            obj3 = objQ10;
                            r70.t tVar2 = new r70.t(dVar6, false ? 1 : 0);
                            mVar10.K(tVar2);
                            obj3 = tVar2;
                        }
                    }
                    obj3 = objQ10;
                    r rVarD2 = m3.l.d(rVarD, zBooleanValue3, sVarE, false, (e23.a) obj3, 12);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar10.getU());
                    i2 i2VarX5 = mVar10.x();
                    r rVarC5 = k.c(rVarD2, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar17);
                    } else {
                        mVar10.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, z0VarD2, mVar10);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX5, mVar10);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar10.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!s.g(mVar10.q(), Integer.valueOf(iHashCode5))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC5, mVar10);
                        uVar = u.f22885a;
                        r rVarB3 = a2.b(x2.d(aVar16, 1.0f), a2.a(mVar10), true);
                        j.f22691a.getClass();
                        zVarA = y.a(j.f22694d, h4.d.a.f81536n, mVar10, 0);
                        iHashCode = Long.hashCode(mVar10.getU());
                        i2VarX = mVar10.x();
                        rVarC = k.c(rVarB3, mVar10);
                        if (mVar10.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar10.z();
                        if (mVar10.getT()) {
                            mVar10.M(aVar17);
                        } else {
                            mVar10.c();
                        }
                        b4.c(eVar4, zVarA, mVar10);
                        b4.c(c1623g, i2VarX, mVar10);
                        if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar10, iHashCode, bVar5);
                        }
                        b4.c(fVar, rVarC, mVar10);
                        b0 b0Var5 = b0.f22601a;
                        zB = mVar10.B(list);
                        objQ = mVar10.q();
                        if (zB) {
                            obj4 = objQ;
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(m70.f.a((r70.s) it.next()));
                            }
                            mVar10.K(arrayList);
                            obj4 = arrayList;
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                obj4 = objQ;
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(m70.f.a((r70.s) it.next()));
                                }
                                mVar10.K(arrayList);
                                obj4 = arrayList;
                            }
                        }
                        obj4 = objQ;
                        mVar10.C(721316137);
                        for (r70.r rVar2 : (List) obj4) {
                            if (rVar2 == null) {
                                mVar10.C(302164541);
                                mVar10.f();
                            } else {
                                mVar10.C(841031236);
                                rVar2.a(x2.x(x2.f(r.S, 1.0f), null, 3), dVar7, mVar10, 6);
                                mVar10.f();
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        mVar10.f();
                        if (((Boolean) s9.c.b(dVar6.f33555l, Boolean.TRUE, mVar10, 48).getF182175a()).booleanValue()) {
                            mVar10.C(886379696);
                            r.a aVar18 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            l.f(x2.q(aVar18, j92.b.f97899b.f97922g), mVar10);
                            mVar10.f();
                        } else {
                            mVar10.C(886482244);
                            mVar10.f();
                            dVar6.x4();
                        }
                        mVar10.y();
                        f1.a(uVar, ((Boolean) p1VarB.getF182175a()).booleanValue(), sVarE, mVar10, 6);
                        if (((Boolean) p1Var12.getF182175a()).booleanValue() || !((Boolean) p1Var13.getF182175a()).booleanValue()) {
                            m mVar11 = mVar10;
                            mVar11.C(624882504);
                            mVar11.f();
                            mVar = mVar11;
                        } else {
                            mVar10.C(623896518);
                            r.a aVar19 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            r rVarC6 = l.C(aVar19, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                            h4.d.f81522a.getClass();
                            z0 z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                            x1 x1Var9 = n.f135158a;
                            int iHashCode6 = Long.hashCode(mVar10.getU());
                            i2 i2VarX6 = mVar10.x();
                            r rVarC7 = k.c(rVarC6, mVar10);
                            h5.g.V.getClass();
                            e0.a aVar20 = h5.g.a.f81805b;
                            if (mVar10.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar10.z();
                            if (mVar10.getT()) {
                                mVar10.M(aVar20);
                            } else {
                                mVar10.c();
                            }
                            b4.c(h5.g.a.f81810g, z0VarD3, mVar10);
                            b4.c(h5.g.a.f81809f, i2VarX6, mVar10);
                            h5.g.a.b bVar6 = h5.g.a.f81813j;
                            if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode6))) {
                                v.h.z(iHashCode6, mVar10, iHashCode6, bVar6);
                            }
                            b4.c(h5.g.a.f81807d, rVarC7, mVar10);
                            u uVar3 = u.f22885a;
                            w1 w1Var = w1.BottomStart;
                            l72.x1 x1Var10 = l72.x1.StartSmall;
                            ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).getClass();
                            String strP3 = gl1.y.P(R.string.msg_annual_report_promotion_tooltip, new Object[]{2025}, mVar10);
                            Object objQ11 = mVar10.q();
                            aVar.getClass();
                            Object obj10 = objQ11;
                            if (objQ11 == m.a.f135155b) {
                                qk0.m mVar12 = new qk0.m(p1Var13, 25);
                                mVar10.K(mVar12);
                                obj10 = mVar12;
                            }
                            r70.c.f151042a.getClass();
                            a1.a(strP3, w1Var, x1Var10, 182, 0L, true, (e23.a) obj10, r70.c.f151043b, mVar10, 114847104, 34);
                            m mVar13 = mVar10;
                            mVar13.y();
                            mVar13.f();
                            mVar = mVar13;
                        }
                        mVar.y();
                        x1 x1Var11 = n.f135158a;
                    }
                    v.h.z(iHashCode5, mVar10, iHashCode5, bVar5);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC5, mVar10);
                    uVar = u.f22885a;
                    r rVarB4 = a2.b(x2.d(aVar16, 1.0f), a2.a(mVar10), true);
                    j.f22691a.getClass();
                    zVarA = y.a(j.f22694d, h4.d.a.f81536n, mVar10, 0);
                    iHashCode = Long.hashCode(mVar10.getU());
                    i2VarX = mVar10.x();
                    rVarC = k.c(rVarB4, mVar10);
                    if (mVar10.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar17);
                    } else {
                        mVar10.c();
                    }
                    b4.c(eVar4, zVarA, mVar10);
                    b4.c(c1623g, i2VarX, mVar10);
                    if (mVar10.getT()) {
                        v.h.z(iHashCode, mVar10, iHashCode, bVar5);
                    } else {
                        v.h.z(iHashCode, mVar10, iHashCode, bVar5);
                    }
                    b4.c(fVar, rVarC, mVar10);
                    b0 b0Var6 = b0.f22601a;
                    zB = mVar10.B(list);
                    objQ = mVar10.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            obj4 = objQ;
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(m70.f.a((r70.s) it.next()));
                            }
                            mVar10.K(arrayList);
                            obj4 = arrayList;
                        }
                    } else {
                        obj4 = objQ;
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(m70.f.a((r70.s) it.next()));
                        }
                        mVar10.K(arrayList);
                        obj4 = arrayList;
                    }
                    obj4 = objQ;
                    mVar10.C(721316137);
                    while (r0.hasNext()) {
                        if (rVar2 == null) {
                            mVar10.C(302164541);
                            mVar10.f();
                        } else {
                            mVar10.C(841031236);
                            rVar2.a(x2.x(x2.f(r.S, 1.0f), null, 3), dVar7, mVar10, 6);
                            mVar10.f();
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                    mVar10.f();
                    if (((Boolean) s9.c.b(dVar6.f33555l, Boolean.TRUE, mVar10, 48).getF182175a()).booleanValue()) {
                        mVar10.C(886379696);
                        r.a aVar110 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        l.f(x2.q(aVar110, j92.b.f97899b.f97922g), mVar10);
                        mVar10.f();
                    } else {
                        mVar10.C(886482244);
                        mVar10.f();
                        dVar6.x4();
                    }
                    mVar10.y();
                    f1.a(uVar, ((Boolean) p1VarB.getF182175a()).booleanValue(), sVarE, mVar10, 6);
                    if (((Boolean) p1Var12.getF182175a()).booleanValue()) {
                        m mVar14 = mVar10;
                        mVar14.C(624882504);
                        mVar14.f();
                        mVar = mVar14;
                    } else {
                        m mVar15 = mVar10;
                        mVar15.C(624882504);
                        mVar15.f();
                        mVar = mVar15;
                    }
                    mVar.y();
                    x1 x1Var12 = n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 18:
                com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVar8 = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d) obj9;
                e23.a aVar21 = (e23.a) obj6;
                e23.a aVar22 = (e23.a) obj5;
                e23.a aVar23 = (e23.a) obj8;
                e23.a aVar24 = (e23.a) obj7;
                m mVar16 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    b82.c.c(z3.f.c(1378167818, new com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.c.a(dVar8, aVar21, aVar22, aVar23), mVar16), z3.f.c(-1633334908, new o72.b(23, dVar8, aVar24), mVar16), mVar16, 54);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 19:
                LocalDate localDate = (LocalDate) obj9;
                LocalDate localDate2 = (LocalDate) obj8;
                mm1.f fVar2 = (mm1.f) obj7;
                mm1.e eVar5 = (mm1.e) obj6;
                String str = (String) obj5;
                m mVar17 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r rVarF3 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar25 = g6.f.f75994b;
                    r rVarH = x2.h(l.A(rVarF3, j92.b.f97899b.f97920e, 0.0f, 2), 350);
                    Object objQ12 = mVar17.q();
                    aVar2.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ12 == c2565a) {
                        objQ12 = new rk0.n(i15);
                        mVar17.K(objQ12);
                    }
                    e23.l lVar2 = (e23.l) objQ12;
                    boolean zR4 = mVar17.r(localDate) | mVar17.r(localDate2) | mVar17.r(fVar2) | mVar17.r(eVar5) | mVar17.B(str);
                    Object objQ13 = mVar17.q();
                    if (zR4 || objQ13 == c2565a) {
                        jv0.c cVar4 = new jv0.c(localDate, localDate2, fVar2, eVar5, str, 17);
                        mVar17.K(cVar4);
                        objQ13 = cVar4;
                    }
                    p002j6.c.b(lVar2, rVarH, (e23.l) objQ13, mVar17, 6, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 20:
                return a(obj, obj2);
            case 21:
                ((Integer) obj2).getClass();
                rr0.z.a((pr0.d) obj9, (hz.b) obj8, (hz.f) obj7, (ArrayList) obj6, (List) obj5, (m) obj, p0.t(577));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                rv1.h.a((qv1.b) obj9, (o) obj7, (e23.l) obj8, (e23.a) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                return b(obj, obj2);
            case 24:
                return c(obj, obj2);
            case 25:
                return d(obj, obj2);
            case 26:
                return e(obj, obj2);
            case 27:
                return f(obj, obj2);
            case 28:
                return g(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                y0.d((e1) obj9, (rk0.y) obj8, (o0) obj7, (nw0.n) obj6, (o0) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(r rVar, p1 p1Var, z3.e eVar, s2.b bVar, e23.a aVar) {
        this.f131117a = 13;
        this.f131120d = rVar;
        this.f131121e = p1Var;
        this.f131122f = eVar;
        this.f131119c = bVar;
        this.f131118b = aVar;
    }

    public /* synthetic */ e(Object obj, Parcelable parcelable, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f131117a = i15;
        this.f131120d = obj;
        this.f131121e = parcelable;
        this.f131118b = aVar;
        this.f131119c = aVar2;
        this.f131122f = aVar3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, e23.l lVar, int i14, int i15) {
        this.f131117a = i15;
        this.f131120d = obj;
        this.f131122f = obj2;
        this.f131118b = obj3;
        this.f131119c = obj4;
        this.f131121e = lVar;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f131117a = i14;
        this.f131120d = obj;
        this.f131121e = obj2;
        this.f131122f = obj3;
        this.f131118b = obj4;
        this.f131119c = obj5;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14, int i15) {
        this.f131117a = i15;
        this.f131120d = obj;
        this.f131121e = obj2;
        this.f131122f = obj3;
        this.f131118b = obj4;
        this.f131119c = obj5;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, o13.h hVar, o13.h hVar2, int i14, int i15) {
        this.f131117a = i15;
        this.f131120d = obj;
        this.f131118b = obj2;
        this.f131119c = obj3;
        this.f131121e = hVar;
        this.f131122f = hVar2;
    }

    public /* synthetic */ e(String str, String str2, o53.b0 b0Var, e23.a aVar, e23.l lVar, int i14) {
        this.f131117a = 6;
        this.f131120d = str;
        this.f131122f = str2;
        this.f131119c = b0Var;
        this.f131118b = aVar;
        this.f131121e = lVar;
    }

    public /* synthetic */ e(p1 p1Var, e23.a aVar, UpdateBirthdateActivity updateBirthdateActivity, p1 p1Var2, p1 p1Var3) {
        this.f131117a = 11;
        this.f131120d = p1Var;
        this.f131118b = aVar;
        this.f131121e = updateBirthdateActivity;
        this.f131122f = p1Var2;
        this.f131119c = p1Var3;
    }

    public /* synthetic */ e(qv1.b bVar, o oVar, e23.l lVar, e23.a aVar, e23.a aVar2, int i14) {
        this.f131117a = 22;
        this.f131120d = bVar;
        this.f131122f = oVar;
        this.f131121e = lVar;
        this.f131118b = aVar;
        this.f131119c = aVar2;
    }

    public /* synthetic */ e(u21.s sVar, e23.l lVar, e23.a aVar, p pVar, p1 p1Var) {
        this.f131117a = 5;
        this.f131120d = sVar;
        this.f131121e = lVar;
        this.f131118b = aVar;
        this.f131122f = pVar;
        this.f131119c = p1Var;
    }
}

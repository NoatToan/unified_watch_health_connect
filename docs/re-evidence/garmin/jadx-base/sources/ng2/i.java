package ng2;

import am.i2;
import am.w0;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.lifecycle.v1;
import b63.o;
import b82.t0;
import c2.a0;
import c2.b0;
import c2.c1;
import c2.q2;
import c2.s2;
import c2.t;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.w;
import e23.l;
import e23.q;
import gl1.y;
import h4.r;
import i3.fe;
import i3.mc;
import i3.mh;
import i3.mj;
import i3.nj;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ky0.d2;
import l72.j0;
import l72.n0;
import l72.x0;
import lc.u0;
import mt0.s1;
import o4.m1;
import o53.s0;
import o72.d0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p40.q0;
import q42.v;
import r1.e0;
import r53.p2;
import r70.z;
import s70.j1;
import s70.p;
import s70.r1;
import t70.k0;
import t70.l0;
import ta0.h0;
import tn.u;
import u1.a2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f126103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f126104d;

    public /* synthetic */ i(List list, Context context, q42.h hVar, l lVar) {
        this.f126101a = 23;
        this.f126102b = list;
        this.f126103c = context;
        this.f126104d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
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
    private final Object a(Object obj, Object obj2, Object obj3) {
        Object objC;
        int iR;
        i53.c cVar = (i53.c) this.f126102b;
        w0 w0Var = (w0) this.f126103c;
        u00.a aVar = (u00.a) this.f126104d;
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Iterator<E> it = cVar.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ry0.c cVar2 = (ry0.c) it.next();
                cVar2.getClass();
                cy0.q qVar = cVar2.f155064a;
                DateTime dateTimeG = qVar.g();
                LocalDate localDate = dateTimeG != null ? dateTimeG.toLocalDate() : null;
                DateTime dateTimeB = qVar.b();
                LocalDate localDate2 = dateTimeB != null ? dateTimeB.toLocalDate() : null;
                LocalDate localDateH = g22.l.h(g22.l.d(o.INSTANCE));
                if (localDate == null || localDate2 == null || localDate.compareTo((ReadablePartial) localDateH) > 0) {
                    iR = 0;
                } else {
                    iR = localDate2.compareTo((ReadablePartial) localDateH) > 0 ? jg.b.r(localDate, localDateH) : jg.b.r(localDate, localDate2);
                }
                i14 += iR;
            }
            x0 x0Var = x0.f111346a;
            String strValueOf = String.valueOf(i14);
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.f23378db);
            String strQ = y.Q(mVar, R.string.common_days);
            int i15 = (x0.f111348c << 24) | (iIntValue & 14);
            x0Var.a(i15, 116, null, t2Var, null, null, strValueOf, strW, strQ, null, mVar);
            Map<String, i2> map = w0Var.f().get(TtmlNode.COMBINE_ALL);
            if (map != null) {
                d2 d2Var = d2.f107276a;
                ls.e eVar = ls.e.TOTAL_TIME;
                d2Var.getClass();
                i2 i2Var = map.get(d2.a(eVar));
                if (i2Var != null) {
                    objC = d2.c(eVar, i2Var);
                } else {
                    objC = null;
                }
            } else {
                objC = null;
            }
            String strB = objC != null ? aVar.b((int) ((Double) objC).doubleValue()) : null;
            if (strB == null || w.J(strB)) {
                strB = sn.a.h(mVar, -653107284, R.string.no_duration_value, mVar);
            } else {
                mVar.C(-653107921);
                mVar.f();
            }
            x0Var.a(i15, 124, null, t2Var, null, null, strB, y.Q(mVar, R.string.lbl_time), null, null, mVar);
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        Object objC;
        int i14;
        int i15;
        Object objC2;
        Map<String, i2> map;
        Map<String, i2> map2;
        w0 w0Var = (w0) this.f126102b;
        l22.a aVar = (l22.a) this.f126103c;
        u00.a aVar2 = (u00.a) this.f126104d;
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            if (w0Var == null || (map2 = w0Var.f().get(TtmlNode.COMBINE_ALL)) == null) {
                objC = null;
            } else {
                d2 d2Var = d2.f107276a;
                ls.e eVar = ls.e.TOTAL_DISTANCE;
                d2Var.getClass();
                i2 i2Var = map2.get(d2.a(eVar));
                if (i2Var != null) {
                    objC = d2.c(eVar, i2Var);
                } else {
                    objC = null;
                }
            }
            String strB = ss.k.b(ls.e.TOTAL_DISTANCE, aVar, objC, 16);
            if (strB == null) {
                strB = sn.a.h(mVar, 934785811, R.string.no_value, mVar);
            } else {
                mVar.C(934782711);
                mVar.f();
            }
            String str = strB;
            int i16 = iIntValue;
            x0 x0Var = x0.f111346a;
            String strQ = y.Q(mVar, R.string.lbl_distance);
            if (zY) {
                i14 = 934791341;
                i15 = R.string.f28709km;
            } else {
                i14 = 934792397;
                i15 = R.string.f28711mi;
            }
            String strH = sn.a.h(mVar, i14, i15, mVar);
            int i17 = (x0.f111348c << 24) | (i16 & 14);
            x0Var.a(i17, 116, null, t2Var, null, null, str, strQ, strH, null, mVar);
            if (w0Var == null || (map = w0Var.f().get(TtmlNode.COMBINE_ALL)) == null) {
                objC2 = null;
            } else {
                d2 d2Var2 = d2.f107276a;
                ls.e eVar2 = ls.e.TOTAL_TIME;
                d2Var2.getClass();
                i2 i2Var2 = map.get(d2.a(eVar2));
                if (i2Var2 != null) {
                    objC2 = d2.c(eVar2, i2Var2);
                } else {
                    objC2 = null;
                }
            }
            String strB2 = objC2 != null ? aVar2.b((int) ((Double) objC2).doubleValue()) : null;
            if (strB2 == null || w.J(strB2)) {
                strB2 = sn.a.h(mVar, 934807132, R.string.no_duration_value, mVar);
            } else {
                mVar.C(934806495);
                mVar.f();
            }
            x0Var.a(i17, 124, null, t2Var, null, null, strB2, y.Q(mVar, R.string.lbl_time), null, null, mVar);
            Integer numValueOf = w0Var != null ? Integer.valueOf(w0Var.getCountOfActivities()) : null;
            String strValueOf = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
            if (strValueOf == null) {
                strValueOf = sn.a.h(mVar, 934814899, R.string.no_value, mVar);
            } else {
                mVar.C(934814000);
                mVar.f();
            }
            x0Var.a(i17, 124, null, t2Var, null, null, strValueOf, y.Q(mVar, R.string.concept_activities), null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        bc0.a aVar = (bc0.a) this.f126102b;
        e23.a aVar2 = (e23.a) this.f126103c;
        e23.a aVar3 = (e23.a) this.f126104d;
        m mVar = (m) obj2;
        ((Integer) obj3).getClass();
        ((e0) obj).getClass();
        x1 x1Var = n.f135158a;
        r rVarX = x2.x(x2.f(r.S, 1.0f), null, 3);
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        r rVarC = c2.l.C(rVarX, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
        String str = aVar.f17404b;
        GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus = aVar.f17405c;
        boolean z14 = true;
        if (remoteDeviceBatteryStatusBatteryStatus != GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.CRITICAL) {
            z14 = false;
        }
        p.a(rVarC, str, z14, remoteDeviceBatteryStatusBatteryStatus == GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.LOW_PULSE_OX, aVar2, aVar3, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2, Object obj3) {
        z zVar = (z) this.f126102b;
        e23.a aVar = (e23.a) this.f126103c;
        e23.a aVar2 = (e23.a) this.f126104d;
        a0 a0Var = (a0) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        int i14 = iIntValue;
        int i15 = 1;
        if (mVar.n(i14 & 1, (i14 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ro0.h(24);
                mVar.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, mVar, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new ro0.h(25);
                mVar.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, mVar, 48);
            c2.j.f22691a.getClass();
            c2.j.f fVar = c2.j.f22699i;
            r.a aVar3 = r.S;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(fVar, h4.d.a.f81533k, mVar, 6);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(aVar3, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            nj njVar = nj.f89109a;
            long jE = vb.h.e(d92.b.f58623a, mVar);
            long jF = u0.f(mVar);
            long jB = d92.b.a(mVar).k().b();
            njVar.getClass();
            mj mjVarB = nj.b(jE, jF, jB, mVar, 50);
            s70.z.f157837a.getClass();
            i3.y.b(s70.z.f157839c, null, z3.f.c(1142162027, new s70.a0(aVar2, i15), mVar), z3.f.c(-1963239916, new cb0.a(p1Var2, p1Var, 3), mVar), 0.0f, null, mjVarB, mVar, 3462, 178);
            mVar.y();
            j70.r rVar = (j70.r) p1Var.getF182175a();
            boolean zB = mVar.B(p1Var);
            Object objQ3 = mVar.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new pp.b(p1Var, 23);
                mVar.K(objQ3);
            }
            l lVar = (l) objQ3;
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            boolean zB2 = mVar.B(p1Var2);
            Object objQ4 = mVar.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new rk0.w(p1Var2, 21);
                mVar.K(objQ4);
            }
            r1.a(a0Var, zVar, aVar, rVar, lVar, zBooleanValue, (e23.a) objQ4, mVar, i14 & 14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = (ArrayList) this.f126102b;
        p1 p1Var = (p1) this.f126103c;
        p1 p1Var2 = (p1) this.f126104d;
        a0 a0Var = (a0) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            c2.l.f(x2.h(aVar, f14), mVar);
            t0 t0Var = t0.f16792a;
            String str = (String) p1Var.getF182175a();
            r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            String strQ = y.Q(mVar, R.string.wifi_ssid);
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new pp.b(p1Var, 24);
                mVar.K(objQ);
            }
            t0Var.e(str, rVarA, null, strQ, null, false, false, null, null, null, 0, 0L, 0L, null, null, (l) objQ, mVar, 0, 196608, 32756);
            c2.l.f(x2.h(aVar, f14), mVar);
            String strQ2 = y.Q(mVar, R.string.wifi_security);
            d92.b.f58624b.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 131070);
            r rVarA2 = a0Var.a(x2.f(c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 1.0f), 1.0f, true);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            boolean zR = mVar.r(arrayList);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new h2.y(arrayList, p1Var2);
                mVar.K(objQ2);
            }
            e2.c.b(rVarA2, null, null, kVar, aVar2, null, false, null, (l) objQ2, mVar, 221184, 462);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        double dDoubleValue;
        String str;
        String str2;
        Float f14;
        List list = (List) this.f126102b;
        o13.p pVar = (o13.p) this.f126103c;
        ah2.e eVar = (ah2.e) this.f126104d;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            if (eVar == null || (f14 = eVar.f3290b) == null) {
                Double dF = (eVar == null || (str = eVar.f3289a) == null) ? null : d53.s.f(str);
                dDoubleValue = dF != null ? dF.doubleValue() : 0.0d;
            } else {
                dDoubleValue = f14.floatValue();
            }
            double d14 = dDoubleValue;
            if (eVar == null || (str2 = eVar.f3289a) == null) {
                str2 = "";
            }
            sg2.n.a(null, list, null, pVar, d14, str2, null, null, y.Q(mVar, ag2.c.a.HEART_RATE_ZONE.f3219b), mVar, 14156160);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        jq1.g gVar = (jq1.g) this.f126102b;
        l lVar = (l) this.f126103c;
        l lVar2 = (l) this.f126104d;
        r rVar = (r) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            oi0.c.d(rVar, gVar, lVar, lVar2, mVar, (iIntValue & 14) | (jq1.g.f100008e << 3));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x017d  */
    private final Object h(Object obj, Object obj2, Object obj3) {
        String strP;
        List list = (List) this.f126102b;
        Context context = (Context) this.f126103c;
        l lVar = (l) this.f126104d;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        int i14 = 1;
        int i15 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(r.S, p6.b.a(d92.b.f58623a, mVar), m1.f128891a);
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            r rVarS = c2.l.s(c2.l.C(rVarE, f14, 0.0f, f14, 0.0f, 10));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarS, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            mVar.C(-1984892911);
            for (Object obj4 : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x.q();
                    throw null;
                }
                l42.c cVar = (l42.c) obj4;
                if (cVar.m() > 0) {
                    mVar.C(-468073439);
                    mVar.f();
                    strP = DateFormat.getTimeFormat(context).format(new Date(cVar.m()));
                } else {
                    mVar.C(-467946897);
                    strP = y.P(R.string.lbl_weight_index, new Object[]{String.valueOf(list.size() - i15)}, mVar);
                    mVar.f();
                }
                Double weight = cVar.getWeight();
                String strB = q42.h.b(context, weight != null ? weight.doubleValue() : Double.NaN);
                strP.getClass();
                String strP2 = y.P(R.string.string_line_string_pattern, new Object[]{strP, strB}, mVar);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                r.a aVar2 = r.S;
                d92.b.f58625c.getClass();
                r rVarF = x2.f(c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97918c, i14), 1.0f);
                boolean zB = mVar.B(lVar) | mVar.r(cVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new j1(19, lVar, cVar);
                    mVar.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new j1(19, lVar, cVar);
                        mVar.K(objQ);
                    }
                }
                m mVar2 = mVar;
                g02.c.a(strP2, u1.w.d(rVarF, false, null, null, (e23.a) objQ, 15), 0L, null, 0, false, 0, x0VarB, 0.0d, mVar2, 0, 380);
                mVar = mVar2;
                i15 = i16;
                i14 = i14;
            }
            m mVar3 = mVar;
            mVar3.f();
            mVar3.y();
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        t70.q qVar = (t70.q) this.f126102b;
        p1 p1Var = (p1) this.f126103c;
        p1 p1Var2 = (p1) this.f126104d;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fe) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            Object objQ = mVar.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new q0(p1Var, p1Var2, 9);
                mVar.K(objQ);
            }
            t70.i.a(qVar, (e23.a) objQ, mVar, 48);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        l0 l0Var = (l0) this.f126102b;
        p1 p1Var = (p1) this.f126103c;
        p1 p1Var2 = (p1) this.f126104d;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fe) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            Object objQ = mVar.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new q0(p1Var, p1Var2, 10);
                mVar.K(objQ);
            }
            k0.b(l0Var, (e23.a) objQ, mVar, 48);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    private final Object k(Object obj, Object obj2, Object obj3) {
        t4.d dVar = (t4.d) this.f126102b;
        String str = (String) this.f126103c;
        l lVar = (l) this.f126104d;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            if (dVar == null) {
                mVar.C(-1337682303);
                mVar.f();
            } else {
                mVar.C(-1337682302);
                r.a aVar = r.S;
                boolean zB = mVar.B(lVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new ta0.j(lVar, 3);
                    mVar.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ta0.j(lVar, 3);
                        mVar.K(objQ);
                    }
                }
                h0.c(str, dVar, x80.c.a(aVar, (l) objQ), mVar, 0);
                mVar.f();
            }
            String strQ = y.Q(mVar, R.string.is_this_the_code);
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar);
            d6.h.f57752b.getClass();
            int i14 = d6.h.f57755e;
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            mh.c(str, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97929f), mVar), mVar, 0, 0, 130044);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    private final Object l(Object obj, Object obj2, Object obj3) {
        zc.d dVar = (zc.d) this.f126102b;
        u uVar = (u) this.f126103c;
        wn.c cVar = (wn.c) this.f126104d;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = u.f165495e;
        ((t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            boolean zR = mVar.r(dVar) | mVar.r(uVar) | mVar.r(cVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new rp.b(dVar, 25, uVar, cVar);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new rp.b(dVar, 25, uVar, cVar);
                    mVar.K(objQ);
                }
            }
            e2.c.b(rVarD, null, null, null, null, null, false, null, (l) objQ, mVar, 6, 510);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    private final Object n(Object obj, Object obj2, Object obj3) {
        aa1.d dVar = (aa1.d) this.f126102b;
        e23.p pVar = (e23.p) this.f126103c;
        q91.d dVar2 = (q91.d) this.f126104d;
        e23.a aVar = (e23.a) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        aVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.r(aVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i14 = iIntValue & 14;
            boolean zR = (i14 == 4) | mVar.r(dVar) | mVar.B(pVar) | mVar.k(dVar2.ordinal());
            Object objQ = mVar.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new ok0.d(aVar, dVar, pVar, dVar2, 28);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ok0.d(aVar, dVar, pVar, dVar2, 28);
                    mVar.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z14 = i14 == 4;
            Object objQ2 = mVar.q();
            if (z14) {
                objQ2 = new u11.b(aVar, 7);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new u11.b(aVar, 7);
                    mVar.K(objQ2);
                }
            }
            og2.k.e(aVar3, (e23.a) objQ2, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0068  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:172:0x0481  */
    /* JADX WARN: Code duplicated, block: B:194:0x0532  */
    /* JADX WARN: Code duplicated, block: B:289:0x0803  */
    /* JADX WARN: Code duplicated, block: B:372:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:392:0x0b55  */
    /* JADX WARN: Code duplicated, block: B:410:0x0c64  */
    /* JADX WARN: Code duplicated, block: B:53:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x0254  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.ArrayList] */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m mVar;
        Object arrayList;
        String str;
        Object value;
        com.garmin.android.apps.connectmobile.training.itp.a aVar;
        DateTime dateTimeWithTimeAtStartOfDay;
        String strC;
        gs1.i currentDayDailySleepDTO;
        gs1.i.b payload;
        Integer sleepTimeSeconds;
        int i14 = this.f126101a;
        int i15 = 15;
        int i16 = 5;
        int i17 = 14;
        int i18 = 6;
        m.a aVar2 = m.f135153a;
        int i19 = 1;
        Object obj4 = this.f126104d;
        Object obj5 = this.f126103c;
        Object obj6 = this.f126102b;
        switch (i14) {
            case 0:
                yg2.h0 h0Var = (yg2.h0) obj6;
                e23.p pVar = (e23.p) obj5;
                bg2.h hVar = (bg2.h) obj4;
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                v.h.y(1081770605, rVar, (Integer) obj3, mVar2);
                x1 x1Var = n.f135158a;
                boolean zR = mVar2.r(h0Var) | mVar2.B(pVar) | mVar2.r(hVar);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new kk1.a(h0Var, 27, pVar, hVar);
                    mVar2.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new kk1.a(h0Var, 27, pVar, hVar);
                        mVar2.K(objQ);
                    }
                }
                r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ, 15);
                mVar2.f();
                return rVarD;
            case 1:
                nv.e eVar = (nv.e) obj6;
                String str2 = (String) obj5;
                l lVar = (l) obj4;
                m mVar3 = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97920e;
                    r rVarB = a2.b(c2.l.B(aVar3, f14, f14, f14, eVar2.f97923h), a2.a(mVar3), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    p3.i2 i2VarX = mVar3.x();
                    r rVarC = h4.k.c(rVarB, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    b0 b0Var = b0.f22601a;
                    Integer num = eVar != null ? eVar.f127942c : null;
                    if (num == null) {
                        mVar3.C(1919696580);
                        mVar3.f();
                        mVar = mVar3;
                    } else {
                        mVar3.C(1919696581);
                        String strQ = y.Q(mVar3, num.intValue());
                        d92.b.f58624b.getClass();
                        mh.c(strQ, c2.l.C(x2.f(aVar3, 1.0f), 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar3, 0, 0, 131068);
                        mVar = mVar3;
                        Unit unit = Unit.INSTANCE;
                        mVar.f();
                    }
                    nv.f[] fVarArr = eVar != null ? eVar.f127943d : null;
                    if (fVarArr == null) {
                        mVar.C(1920093783);
                        mVar.f();
                    } else {
                        mVar.C(1920093784);
                        int length = fVarArr.length;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < length) {
                            nv.f fVar = fVarArr[i24];
                            int i26 = i25 + 1;
                            fVar.getClass();
                            nv.a[] aVarArr = fVar.f127960b;
                            if (aVarArr != null) {
                                arrayList = new ArrayList(aVarArr.length);
                                int length2 = aVarArr.length;
                                int i27 = 0;
                                while (i27 < length2) {
                                    int i28 = nv.f.a.f127961a[aVarArr[i27].ordinal()];
                                    if (i28 == i19) {
                                        str = str2;
                                    } else {
                                        if (i28 != 2) {
                                            u0.r();
                                            return null;
                                        }
                                        str = "4";
                                    }
                                    arrayList.add(str);
                                    i27++;
                                    i19 = 1;
                                }
                            } else {
                                arrayList = 0;
                            }
                            int size = arrayList != 0 ? arrayList.size() : 0;
                            if (size == 1) {
                                if (arrayList == 0 || (arrayList = (String) arrayList.get(0)) == 0) {
                                    arrayList = "";
                                }
                            } else if (size <= 1 || arrayList == 0) {
                                arrayList = "";
                            }
                            r.a aVar5 = r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            nv.d.a(c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), i26, y.P(fVar.f127959a, new Object[]{arrayList}, mVar), null, null, mVar, 0, 24);
                            i24++;
                            i25 = i26;
                            i19 = 1;
                        }
                        mVar.f();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Integer num2 = eVar != null ? eVar.f127944e : null;
                    if (num2 == null) {
                        mVar.C(1920880997);
                        mVar.f();
                    } else {
                        mVar.C(1920880998);
                        String strQ2 = y.Q(mVar, num2.intValue());
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarA = s5.x0.a(j92.f.f97932i, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        r.a aVar6 = r.S;
                        boolean zB = mVar.B(lVar) | mVar.k(eVar == null ? -1 : eVar.ordinal());
                        Object objQ2 = mVar.q();
                        if (zB) {
                            objQ2 = new s1(16, lVar, eVar);
                            mVar.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new s1(16, lVar, eVar);
                                mVar.K(objQ2);
                            }
                        }
                        r rVarF = x2.f(u1.w.d(aVar6, false, null, null, (e23.a) objQ2, 15), 1.0f);
                        d92.b.f58625c.getClass();
                        mh.c(strQ2, c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, mVar, 0, 0, 131068);
                        Unit unit3 = Unit.INSTANCE;
                        mVar.f();
                    }
                    Integer num3 = eVar != null ? eVar.f127946g : null;
                    if (num3 == null) {
                        mVar.C(1921431650);
                        mVar.f();
                    } else {
                        mVar.C(1921431651);
                        String strQ3 = y.Q(mVar, num3.intValue());
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF = d92.c.f(j92.f.f97932i, mVar);
                        r rVarF2 = x2.f(r.S, 1.0f);
                        d92.b.f58625c.getClass();
                        mh.c(strQ3, c2.l.A(rVarF2, 0.0f, j92.b.f97899b.f97920e, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 131068);
                        Unit unit4 = Unit.INSTANCE;
                        mVar.f();
                    }
                    mVar.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                nw0.r rVar2 = (nw0.r) obj6;
                o53.b0 b0Var2 = (o53.b0) obj5;
                mc mcVar = (mc) obj4;
                String str3 = (String) obj;
                pv0.k kVar2 = (pv0.k) obj2;
                pv0.p pVar2 = (pv0.p) obj3;
                str3.getClass();
                kVar2.getClass();
                pVar2.getClass();
                rVar2.getClass();
                p2 p2Var = rVar2.f128107h;
                do {
                    value = p2Var.getValue();
                    rVar2.f128100a.getClass();
                } while (!p2Var.b(value, tv0.a.a(str3, kVar2, pVar2, (List) value)));
                ge1.b.T(b0Var2, null, null, new nw0.q.g(mcVar, null), 3);
                return Unit.INSTANCE;
            case 3:
                r rVar3 = (r) obj6;
                j0 j0Var = (j0) obj5;
                j0 j0Var2 = (j0) obj4;
                m mVar4 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar4.n(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    j0 j0VarA = j0.a(j0Var, "Filter Chip", false, 6);
                    Object objQ3 = mVar4.q();
                    aVar2.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new o62.a(14);
                        mVar4.K(objQ3);
                    }
                    n0.d(rVar3, j0VarA, (l) objQ3, mVar4, 390, 0);
                    j0 j0VarA2 = j0.a(j0Var2, "Filter Chip", false, 6);
                    Object objQ4 = mVar4.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new o62.a(15);
                        mVar4.K(objQ4);
                    }
                    n0.d(null, j0VarA2, (l) objQ4, mVar4, 384, 1);
                    d0.f130348a.getClass();
                    z3.e eVar3 = d0.f130351d;
                    j0 j0VarA3 = j0.a(j0Var2, "Chip", false, 6);
                    Object objQ5 = mVar4.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new o62.a(16);
                        mVar4.K(objQ5);
                    }
                    n0.c(null, eVar3, j0VarA3, (l) objQ5, mVar4, 3120, 1);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m4.b0 b0Var3 = (m4.b0) obj6;
                Context context = (Context) obj5;
                p1 p1Var = (p1) obj4;
                t2 t2Var = (t2) obj;
                m mVar5 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar5.B(t2Var) ? 4 : 2;
                }
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    t0 t0Var = t0.f16792a;
                    r rVarA = t2Var.a(r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA2 = m4.e.a(c2.l.C(rVarA, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), b0Var3);
                    String str4 = (String) p1Var.getF182175a();
                    boolean zR2 = mVar5.r(context);
                    Object objQ6 = mVar5.q();
                    if (zR2) {
                        objQ6 = new o72.e(context, p1Var, 4);
                        mVar5.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new o72.e(context, p1Var, 4);
                            mVar5.K(objQ6);
                        }
                    }
                    t0Var.g(rVarA2, str4, "Enter search text", null, null, 0L, (e23.p) objQ6, mVar5, 384, 56);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                qt1.k kVar3 = (qt1.k) obj6;
                Context context2 = (Context) obj5;
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                String str5 = (String) obj3;
                ot1.u uVar = ot1.u.f133824a;
                str5.getClass();
                ot1.d dVar = new ot1.d((c.q) obj4, 5);
                context2.getClass();
                w9.a aVarA = v1.a(kVar3);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new qt1.w(kVar3, context2, jLongValue, jLongValue2, str5, dVar, null), 2);
                return Unit.INSTANCE;
            case 6:
                String str6 = (String) obj6;
                List<vw1.e> list = (List) obj5;
                com.garmin.android.apps.connectmobile.training.itp.a aVar7 = (com.garmin.android.apps.connectmobile.training.itp.a) obj4;
                m mVar6 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                ((e2.d) obj).getClass();
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    r rVarF3 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    r rVarC2 = c2.l.C(rVarF3, 0.0f, eVar4.f97920e, 0.0f, eVar4.f97918c, 5);
                    d92.b.f58624b.getClass();
                    mh.c(str6, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar6), mVar6, 0, 0, 131068);
                    for (vw1.e eVar5 : list) {
                        DateTime dateTime = eVar5.f180583q;
                        boolean z14 = dateTime != null && g22.k.k(dateTime);
                        boolean z15 = (dateTime == null || (dateTimeWithTimeAtStartOfDay = dateTime.withTimeAtStartOfDay()) == null || !dateTimeWithTimeAtStartOfDay.isAfter(DateTime.now().withTimeAtStartOfDay())) ? false : true;
                        if (eVar5.f180573g) {
                            mVar6.C(164523936);
                            String str7 = eVar5.f180578l;
                            String str8 = str7 == null ? "" : str7;
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            hw1.j.a(null, str8, d92.c.f(j92.f.f97933j, mVar6), null, mVar6, 0, 9);
                            mVar6.f();
                        } else {
                            if (eVar5.f180572f) {
                                mVar6.C(164915590);
                                hw1.j.a(null, y.Q(mVar6, z15 ? R.string.scheduled_rest_day : R.string.lbl_rest_day), null, null, mVar6, 0, 13);
                                mVar6.f();
                            } else if (eVar5.f180571e) {
                                mVar6.C(165743662);
                                if (!eVar5.f180585t || eVar5.f180586v == null) {
                                    boolean z16 = z14;
                                    if (eVar5.f180569c != null) {
                                        mVar6.C(167914313);
                                        aVar7.u6(eVar5, z16, mVar6, 0);
                                        mVar6.f();
                                    } else {
                                        mVar6.C(168216470);
                                        aVar = aVar7;
                                        aVar.v6(eVar5, z16, g22.k.f(aVar7.w6().f134303d, dateTime), mVar6, 0);
                                        mVar6.f();
                                    }
                                    mVar6.f();
                                } else {
                                    mVar6.C(165868499);
                                    hw1.b.a(null, z14, 0.0f, 0L, null, z3.f.c(945844342, new o72.b(i16, eVar5, aVar7), mVar6), mVar6, 196608);
                                    mVar6.f();
                                }
                                aVar = aVar7;
                                mVar6.f();
                            } else {
                                aVar = aVar7;
                                mVar6.C(168716252);
                                mVar6.f();
                            }
                            aVar7 = aVar;
                        }
                        aVar = aVar7;
                        aVar7 = aVar;
                    }
                    x1 x1Var7 = n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                jx.a aVar8 = (jx.a) obj6;
                gt.a aVar9 = (gt.a) obj5;
                ix.j jVar = (ix.j) obj4;
                r rVar4 = (r) obj;
                m mVar7 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                rVar4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar7.B(rVar4) ? 4 : 2;
                }
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    px.a.a(rVar4, aVar8, aVar9, jVar, false, null, mVar7, (iIntValue5 & 14) | 512, 48);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                m4.b0 b0Var4 = (m4.b0) obj6;
                p1 p1Var2 = (p1) obj5;
                String str9 = (String) obj4;
                t2 t2Var2 = (t2) obj;
                m mVar8 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar8.B(t2Var2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var9 = n.f135158a;
                    t0 t0Var2 = t0.f16792a;
                    r rVarA3 = t2Var2.a(r.S, 1.0f, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA4 = m4.e.a(c2.l.C(rVarA3, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), b0Var4);
                    String str10 = (String) p1Var2.getF182175a();
                    boolean zB2 = mVar8.B(p1Var2);
                    Object objQ7 = mVar8.q();
                    if (zB2) {
                        objQ7 = new li0.w(p1Var2, 22);
                        mVar8.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new li0.w(p1Var2, 22);
                            mVar8.K(objQ7);
                        }
                    }
                    t0Var2.g(rVarA4, str10, str9, null, null, 0L, (e23.p) objQ7, mVar8, 0, 56);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 9:
                o53.b0 b0Var5 = (o53.b0) obj6;
                mc mcVar2 = (mc) obj5;
                p1 p1Var3 = (p1) obj4;
                m mVar9 = (m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var10 = n.f135158a;
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ4 = y.Q(mVar9, R.string.title_exit_without_saving);
                String strQ5 = y.Q(mVar9, R.string.msg_training_exit_plan_info);
                String strQ6 = y.Q(mVar9, R.string.lbl_exit);
                String strQ7 = y.Q(mVar9, R.string.lbl_cancel);
                boolean zR3 = mVar9.r(b0Var5) | mVar9.B(mcVar2);
                Object objQ8 = mVar9.q();
                if (zR3) {
                    objQ8 = new fo.j(b0Var5, p1Var3, mcVar2, i17);
                    mVar9.K(objQ8);
                } else {
                    aVar2.getClass();
                    if (objQ8 == m.a.f135155b) {
                        objQ8 = new fo.j(b0Var5, p1Var3, mcVar2, i17);
                        mVar9.K(objQ8);
                    }
                }
                e23.a<Unit> aVar10 = (e23.a) objQ8;
                Object objQ9 = mVar9.q();
                aVar2.getClass();
                if (objQ9 == m.a.f135155b) {
                    objQ9 = new p40.k0(p1Var3, 14);
                    mVar9.K(objQ9);
                }
                c1Var.a(false, strQ4, strQ5, null, null, strQ6, false, false, aVar10, strQ7, (e23.a) objQ9, mVar9, 6, 6, 216);
                return Unit.INSTANCE;
            case 10:
                q53.b bVar2 = (q53.b) obj5;
                y53.h hVar2 = (y53.h) obj4;
                AtomicLongFieldUpdater atomicLongFieldUpdater = q53.b.f142949d;
                if (obj6 != q53.h.f142986l) {
                    og.a.t(bVar2.f142959b, obj6, hVar2.getF194557a());
                }
                return Unit.INSTANCE;
            case 11:
                p1.z zVar = (p1.z) obj6;
                Context context3 = (Context) obj5;
                l lVar2 = (l) obj4;
                m mVar10 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                q80.b bVar3 = q80.b.f143300a;
                ((a0) obj).getClass();
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var11 = n.f135158a;
                    if (zVar == null || !(!zVar.d())) {
                        mVar10.C(1101010920);
                        mVar10.f();
                    } else {
                        mVar10.C(1099762581);
                        boolean zR4 = mVar10.r(zVar) | mVar10.r(context3) | mVar10.B(lVar2);
                        Object objQ10 = mVar10.q();
                        if (zR4) {
                            objQ10 = new p90.h(zVar, 12, lVar2, context3);
                            mVar10.K(objQ10);
                        } else {
                            aVar2.getClass();
                            if (objQ10 == m.a.f135155b) {
                                objQ10 = new p90.h(zVar, 12, lVar2, context3);
                                mVar10.K(objQ10);
                            }
                        }
                        e2.c.b(null, null, null, null, null, null, false, null, (l) objQ10, mVar10, 0, 511);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                rx.a aVar11 = (rx.a) obj6;
                bx.b bVar4 = (bx.b) obj5;
                gs1.t tVar = (gs1.t) obj4;
                t2 t2Var3 = (t2) obj;
                m mVar11 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar11.B(t2Var3) ? 4 : 2;
                }
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var12 = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    hx.b event = bVar4.getEvent();
                    String strD = aVar11.d(event != null ? event.getBodyBatteryImpact() : null);
                    Context context4 = aVar11.f154899a;
                    String string = context4.getString(R.string.lbl_body_battery_net_impact);
                    string.getClass();
                    int i29 = (iIntValue8 & 14) | (x0.f111348c << 24);
                    x0Var.a(i29, 124, null, t2Var3, null, null, strD, string, null, null, mVar11);
                    qx.e.f148394a.getClass();
                    hx.b event2 = bVar4.getEvent();
                    Integer numF = event2 != null ? event2.f() : null;
                    hx.c cVarB = event2 != null ? event2.b() : null;
                    if ((cVarB == null ? -1 : qx.e.a.f148395a[cVarB.ordinal()]) == 5 && tVar != null && (currentDayDailySleepDTO = tVar.getCurrentDayDailySleepDTO()) != null && (payload = currentDayDailySleepDTO.getPayload()) != null && (sleepTimeSeconds = payload.getSleepTimeSeconds()) != null) {
                        Integer num4 = sleepTimeSeconds.intValue() > 0 ? sleepTimeSeconds : null;
                        if (num4 != null) {
                            numF = num4;
                        }
                    }
                    if (numF != null) {
                        u00.a aVar12 = aVar11.f154901c;
                        int iIntValue9 = numF.intValue();
                        int i30 = u00.a.f167335c;
                        strC = aVar12.c(iIntValue9);
                    } else {
                        strC = aVar11.f154900b;
                    }
                    String str11 = strC;
                    String string2 = context4.getString(R.string.txt_duration);
                    string2.getClass();
                    x0Var.a(i29, 124, null, t2Var3, null, null, str11, string2, null, null, mVar11);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                l lVar3 = (l) obj6;
                p1 p1Var4 = (p1) obj5;
                com.garmin.android.apps.connectmobile.badges.service.model.r rVar5 = (com.garmin.android.apps.connectmobile.badges.service.model.r) obj4;
                m mVar12 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar12.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var13 = n.f135158a;
                    for (com.garmin.android.apps.connectmobile.badges.service.model.r rVar6 : com.garmin.android.apps.connectmobile.badges.service.model.r.f30666e) {
                        z3.e eVarC = z3.f.c(1632365180, new r12.a(rVar6, i19), mVar12);
                        boolean zB3 = mVar12.B(lVar3) | mVar12.k(rVar6.ordinal());
                        Object objQ11 = mVar12.q();
                        if (zB3) {
                            objQ11 = new v(lVar3, i18, rVar6, p1Var4);
                            mVar12.K(objQ11);
                        } else {
                            aVar2.getClass();
                            if (objQ11 == m.a.f135155b) {
                                objQ11 = new v(lVar3, i18, rVar6, p1Var4);
                                mVar12.K(objQ11);
                            }
                        }
                        i3.u.b(eVarC, (e23.a) objQ11, null, null, z3.f.c(-672630280, new q72.f(19, rVar5, rVar6), mVar12), false, null, null, mVar12, 24582, 492);
                    }
                    x1 x1Var14 = n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                r72.i iVar = (r72.i) obj6;
                r0 r0Var = (r0) obj5;
                l lVar4 = (l) obj4;
                m mVar13 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar13.n(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    x1 x1Var15 = n.f135158a;
                    r72.n.b(iVar.f151178a, new r72.m(r0Var, lVar4, 0), mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                ArrayList arrayList2 = (ArrayList) obj6;
                l lVar5 = (l) obj5;
                n1 n1Var = (n1) obj4;
                m mVar14 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar14.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var16 = n.f135158a;
                    String upperCase = y.Q(mVar14, R.string.startup_available_languages_label).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF2 = d92.c.f(j92.f.f97934k, mVar14);
                    r.a aVar13 = r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    mh.c(upperCase, c2.l.C(aVar13, 0.0f, eVar6.f97921f, 0.0f, eVar6.f97920e, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar14, 0, 0, 131068);
                    r rVarB2 = l4.k.b(aVar13, k2.i.a(da0.u.f58858a));
                    boolean zR5 = mVar14.r(arrayList2);
                    Object objQ12 = mVar14.q();
                    if (zR5) {
                        objQ12 = new gr2.a(lVar5, arrayList2);
                        mVar14.K(objQ12);
                    } else {
                        aVar2.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new gr2.a(lVar5, arrayList2);
                            mVar14.K(objQ12);
                        }
                    }
                    l lVar6 = (l) objQ12;
                    boolean zR6 = mVar14.r(arrayList2);
                    Object objQ13 = mVar14.q();
                    if (zR6) {
                        objQ13 = new ph1.d(29, arrayList2, n1Var);
                        mVar14.K(objQ13);
                    } else {
                        aVar2.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new ph1.d(29, arrayList2, n1Var);
                            mVar14.K(objQ13);
                        }
                    }
                    da0.w.a(rVarB2, arrayList2, lVar6, (l) objQ13, null, new qk0.a(21), mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2, obj3);
            case 17:
                return b(obj, obj2, obj3);
            case 18:
                return c(obj, obj2, obj3);
            case 19:
                return d(obj, obj2, obj3);
            case 20:
                return e(obj, obj2, obj3);
            case 21:
                return f(obj, obj2, obj3);
            case 22:
                return g(obj, obj2, obj3);
            case 23:
                return h(obj, obj2, obj3);
            case 24:
                return i(obj, obj2, obj3);
            case 25:
                return j(obj, obj2, obj3);
            case 26:
                return k(obj, obj2, obj3);
            case 27:
                return l(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                zc.d dVar2 = (zc.d) obj6;
                oe0.g gVar = (oe0.g) obj5;
                Context context5 = (Context) obj4;
                m mVar15 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar15.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var17 = n.f135158a;
                    r rVarF4 = x2.f(r.S, 1.0f);
                    boolean zR7 = mVar15.r(dVar2) | mVar15.r(gVar) | mVar15.r(context5);
                    Object objQ14 = mVar15.q();
                    if (zR7) {
                        objQ14 = new tn2.s0(dVar2, i15, gVar, context5);
                        mVar15.K(objQ14);
                    } else {
                        aVar2.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new tn2.s0(dVar2, i15, gVar, context5);
                            mVar15.K(objQ14);
                        }
                    }
                    e2.c.b(rVarF4, null, null, null, null, null, false, null, (l) objQ14, mVar15, 6, 510);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(Object obj, int i14, Object obj2, Object obj3) {
        this.f126101a = i14;
        this.f126102b = obj;
        this.f126103c = obj2;
        this.f126104d = obj3;
    }
}

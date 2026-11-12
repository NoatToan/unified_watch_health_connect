package hv0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.s0;
import c2.a0;
import c2.b0;
import c2.c1;
import c2.c3;
import c2.h2;
import c2.j;
import c2.k3;
import c2.l;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.t;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.o;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.google.android.exoplayer2.C;
import da0.u;
import e23.p;
import e23.q;
import f72.gd;
import g2.m1;
import h4.k;
import h4.r;
import i3.bf;
import i3.f2;
import i3.fe;
import i3.h1;
import i3.i7;
import i3.mh;
import i3.ve;
import i3.wd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import km1.v;
import kq.c0;
import ky0.a2;
import ky0.z1;
import l72.v1;
import l72.w;
import li0.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.a3;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import pt1.x;
import r1.e0;
import s5.x0;
import u1.y0;
import v62.l9;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f85797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f85798c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f85796a = i14;
        this.f85797b = obj;
        this.f85798c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        Integer sleepVersion;
        km1.c cVar = (km1.c) this.f85797b;
        p pVar = (p) this.f85798c;
        m mVar = (m) obj2;
        ((Integer) obj3).getClass();
        ((e0) obj).getClass();
        x1 x1Var = n.f135158a;
        if (cVar != null) {
            mVar.C(1214207640);
            ArrayList<mn1.b> arrayListD1 = h0.d1(mn1.b.f119767k);
            v dailySleep = cVar.getDailySleep();
            if (dailySleep == null || (sleepVersion = dailySleep.getSleepVersion()) == null || sleepVersion.intValue() != 2) {
                arrayListD1.remove(mn1.b.f119765i);
            } else {
                arrayListD1.remove(mn1.b.f119763g);
                arrayListD1.remove(mn1.b.f119764h);
            }
            if (arrayListD1.isEmpty()) {
                mVar.C(1214971201);
                mVar.f();
            } else {
                mVar.C(1214608904);
                g6.f.a aVar = g6.f.f75994b;
                r rVarA = l.A(r.S, 16, 0.0f, 2);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                r rVarC = k.c(rVarA, mVar);
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
                b4.c(h5.g.a.f81810g, zVarA, mVar);
                b4.c(h5.g.a.f81809f, i2VarX, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar);
                b0 b0Var = b0.f22601a;
                mVar.C(-1867828219);
                for (mn1.b bVar2 : arrayListD1) {
                    boolean zB = mVar.B(pVar) | mVar.k(bVar2.ordinal()) | mVar.r(cVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new kk1.a(pVar, 1, bVar2, cVar);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new kk1.a(pVar, 1, bVar2, cVar);
                            mVar.K(objQ);
                        }
                    }
                    kn1.k.f(bVar2, cVar, (e23.a) objQ, mVar, km1.c.B << 3);
                }
                mVar.f();
                mVar.y();
                mVar.f();
            }
            mVar.f();
        } else {
            mVar.C(1214985089);
            mVar.f();
        }
        x1 x1Var2 = n.f135158a;
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        c0 c0Var = (c0) this.f85797b;
        Context context = (Context) this.f85798c;
        h82.r rVar = (h82.r) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = c0.f106052g;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        int i15 = iIntValue;
        if (mVar.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            y0.a(n5.c.a(R.drawable.gcm3_cycling_help_pco_pedal, mVar, 0), gl1.y.Q(mVar, R.string.default_image_view_content_description), l.C(x2.f(aVar, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13), null, null, 0.0f, null, mVar, 384, 120);
            r rVarF = x2.f(aVar, 1.0f);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = k.c(rVarF, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            float f14 = 20;
            r rVarC2 = l.C(u2Var.a(aVar, 0.5f, true), f14, 0.0f, 0.0f, 0.0f, 14);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(gl1.y.Q(mVar, R.string.activities_details_pco_left_pedal), rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 130044);
            mh.c(gl1.y.Q(mVar, R.string.activities_details_pco_right_pedal), l.C(u2Var.a(aVar, 0.5f, true), 0.0f, 0.0f, f14, 0.0f, 11), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 130044);
            mVar.y();
            rVar.l(R.string.activity_details_pco_help_details, (i15 << 6) & 896, 2, null, mVar);
            o.a aVar4 = c0Var.f106053f;
            if (aVar4 == null) {
                mVar.C(-1379898933);
                mVar.f();
            } else {
                double d14 = aVar4.f29603b;
                double d15 = aVar4.f29602a;
                mVar.C(-1379898932);
                String strQ = gl1.y.Q(mVar, R.string.common_lbl_left);
                String strQ2 = gl1.y.Q(mVar, R.string.common_lbl_right);
                String strI = c0.i(context, d15);
                String strI2 = c0.i(context, d14);
                String strH = c0.h(context, d15);
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                s5.c cVarC = v1.c(String.format(strI, Arrays.copyOf(new Object[]{strQ, strH}, 2)), new String[]{strH}, mVar);
                int i17 = (i15 << 3) & 112;
                rVar.r(cVarC, mVar, i17);
                String strH2 = c0.h(context, d14);
                rVar.r(v1.c(String.format(strI2, Arrays.copyOf(new Object[]{strQ2, strH2}, 2)), new String[]{strH2}, mVar), mVar, i17);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        Map.Entry entry = (Map.Entry) this.f85797b;
        p pVar = (p) this.f85798c;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            String strQ = gl1.y.Q(mVar, ((a2) entry.getKey()).f107188a);
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean zB = mVar.B(pVar) | mVar.r(entry);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new jt1.d(20, pVar, entry);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new jt1.d(20, pVar, entry);
                    mVar.K(objQ);
                }
            }
            z1.a(0, (e23.l) objQ, strQ, mVar, zBooleanValue);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f85797b;
        a2.j jVar = (a2.j) this.f85798c;
        m mVar = (m) obj2;
        ((Integer) obj3).getClass();
        mVar.C(-102778667);
        x1 x1Var = n.f135158a;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = l0.j(t13.h.f161748a, mVar);
            mVar.K(objQ);
        }
        o53.b0 b0Var = (o53.b0) objQ;
        Object objQ2 = mVar.q();
        if (objQ2 == c2565a) {
            objQ2 = p0.n(null);
            mVar.K(objQ2);
        }
        p1 p1Var = (p1) objQ2;
        p1 p1VarQ = p0.q(lVar, mVar);
        boolean zB = mVar.B(jVar);
        Object objQ3 = mVar.q();
        if (zB || objQ3 == c2565a) {
            objQ3 = new jt1.d(p1Var, jVar);
            mVar.K(objQ3);
        }
        l0.a(jVar, (e23.l) objQ3, mVar);
        r.a aVar = r.S;
        boolean zR = mVar.r(b0Var) | mVar.B(jVar) | mVar.B(p1VarQ);
        Object objQ4 = mVar.q();
        if (zR || objQ4 == c2565a) {
            objQ4 = new a3(b0Var, p1Var, jVar, p1VarQ);
            mVar.K(objQ4);
        }
        r rVarB = s0.b(aVar, jVar, (PointerInputEventHandler) objQ4);
        mVar.f();
        return rVarB;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        m21.e eVar = (m21.e) this.f85797b;
        e23.l lVar = (e23.l) this.f85798c;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            if (eVar.b()) {
                mVar.C(-113608722);
                List<b11.l> list = eVar.f116100q;
                b11.l lVar2 = eVar.f116101r;
                Long lValueOf = lVar2 != null ? Long.valueOf(lVar2.f14331a) : null;
                r rVarF = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                y01.l.a(l.C(rVarF, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), list, lValueOf, lVar, mVar, 0, 0);
                mVar.f();
            } else {
                mVar.C(-113157207);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        CreateCourseActivity createCourseActivity = (CreateCourseActivity) this.f85797b;
        List list = (List) this.f85798c;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
        ((ClimbDTO) obj).getClass();
        androidx.fragment.app.v supportFragmentManager = createCourseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.g(list, iIntValue, iIntValue2, supportFragmentManager, new l30.b(createCourseActivity, 2), new l30.c(createCourseActivity, 3), new l30.c(createCourseActivity, 4));
        createCourseActivity.ea().C4(createCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
        l30.z zVarEa = createCourseActivity.ea();
        zVarEa.getClass();
        zVarEa.z4(new n30.c.n(iIntValue));
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f85797b;
        p<? super m, ? super Integer, Unit> pVar = (p) this.f85798c;
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        w wVar = w.f111301a;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            w.a.f111302a.c(t2Var, "Header", str, pVar, mVar, (iIntValue & 14) | 24576, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        float f14;
        wd wdVar = (wd) this.f85797b;
        x0 x0Var = (x0) this.f85798c;
        c1 c1Var = (c1) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        c1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(c1Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String f88111a = wdVar.getF88109a().getF88111a();
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f15 = j92.b.f97899b.f97920e;
            if (wdVar.getF88109a().getF88112b() != null) {
                f14 = 0;
                g6.f.a aVar2 = g6.f.f75994b;
            } else {
                f14 = f15;
            }
            r rVarB = l.B(aVar, f15, f15, f15, f14);
            d6.h.f57752b.getClass();
            mh.c(f88111a, rVarB, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, null, mVar, 0, 0, 261116);
            String f88112b = wdVar.getF88109a().getF88112b();
            if (f88112b == null) {
                mVar.C(1145384584);
                mVar.f();
            } else {
                mVar.C(1145384585);
                p3.v.a(mh.f89022a.c(x0Var), z3.f.c(-1760952744, new jt1.m((Object) c1Var, (Object) f88112b, (Object) wdVar, false, 28), mVar), mVar, 56);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        String string;
        String strQ;
        Double d14 = (Double) this.f85797b;
        l22.a aVar = ((ih0.i) this.f85798c).f93454a;
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i14 = iIntValue & 14;
            lh0.n.d(t2Var, mVar, i14);
            if (d14 == null || d14.doubleValue() <= 0.0d) {
                mVar.C(-532767236);
                mVar.f();
                string = aVar.getString(R.string.no_value_card);
                strQ = null;
            } else {
                mVar.C(-532909681);
                strQ = gl1.y.Q(mVar, R.string.lbl_bpm);
                int iDoubleValue = (int) d14.doubleValue();
                string = String.valueOf(iDoubleValue > 0 ? iDoubleValue : 0);
                mVar.f();
            }
            lh0.n.e(t2Var, aVar.getString(R.string.lbl_avg_resting_heart_rate), string, strQ, mVar, i14, 0);
            lh0.n.d(t2Var, mVar, i14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00be  */
    private final Object j(Object obj, Object obj2, Object obj3) {
        n72.j jVar = (n72.j) this.f85797b;
        e23.a aVar = (e23.a) this.f85798c;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            int i14 = k3.f22728a;
            c3 c3VarB = q3.b(mVar);
            p3.f22815b.getClass();
            r rVarG = l.G(aVar2, n3.d(c3VarB, p3.f22823j));
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = k.c(rVarG, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            q<e23.a<Unit>, m, Integer, Unit> qVar = jVar.f124895c;
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new ll0.a(aVar, 11);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ll0.a(aVar, 11);
                    mVar.K(objQ);
                }
            }
            qVar.invoke((e23.a) objQ, mVar, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    private final Object k(Object obj, Object obj2, Object obj3) {
        ?? arrayList;
        double dFloor;
        ?? arrayList2;
        List list = (List) this.f85797b;
        a10.a aVar = (a10.a) this.f85798c;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(aVar2, j92.b.f97899b.f97920e);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (((be1.b) obj4).f17740c != null) {
                        arrayList3.add(obj4);
                    }
                }
                arrayList = new ArrayList(p13.y.r(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Double d14 = ((be1.b) it.next()).f17740c;
                    d14.getClass();
                    arrayList.add(d14);
                }
            } else {
                arrayList = j0.f134944a;
            }
            double dFloor2 = 0.0d;
            if (((Collection) arrayList).isEmpty()) {
                dFloor = 0.0d;
            } else {
                l3.a aVar4 = l3.f23124b;
                Iterator it3 = ((Iterable) arrayList).iterator();
                double dDoubleValue = 0.0d;
                while (it3.hasNext()) {
                    dDoubleValue += ((Number) it3.next()).doubleValue();
                }
                double size = dDoubleValue / ((double) arrayList.size());
                aVar4.getClass();
                dFloor = Math.floor(size + 0.5d);
            }
            if (list != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list) {
                    if (((be1.b) obj5).f17739b != null) {
                        arrayList4.add(obj5);
                    }
                }
                arrayList2 = new ArrayList(p13.y.r(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Double d15 = ((be1.b) it4.next()).f17739b;
                    d15.getClass();
                    arrayList2.add(d15);
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            if (!((Collection) arrayList2).isEmpty()) {
                l3.a aVar5 = l3.f23124b;
                Iterator it5 = ((Iterable) arrayList2).iterator();
                while (it5.hasNext()) {
                    dFloor2 += ((Number) it5.next()).doubleValue();
                }
                double size2 = dFloor2 / ((double) arrayList2.size());
                aVar5.getClass();
                dFloor2 = Math.floor(size2 + 0.5d);
            }
            l72.x0.f111346a.e(null, z3.f.c(641714466, new cg1.n(aVar, dFloor, aVar.f244c, dFloor2, 1), mVar), mVar, (l72.x0.f111348c << 6) | 48, 1);
            r.a aVar6 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            l.f(l.C(aVar6, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar);
            mVar.y();
            x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x029f  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:144:0x0442  */
    /* JADX WARN: Code duplicated, block: B:149:0x0464  */
    /* JADX WARN: Code duplicated, block: B:211:0x0634  */
    /* JADX WARN: Code duplicated, block: B:302:0x0bfb  */
    /* JADX WARN: Code duplicated, block: B:318:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:80:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v dailySleep;
        int i14 = this.f85796a;
        int i15 = 26;
        int i16 = 4;
        numValueOf = null;
        Integer numValueOf = null;
        int i17 = 2;
        m.a aVar = m.f135153a;
        int i18 = 1;
        Object obj4 = this.f85798c;
        Object obj5 = this.f85797b;
        switch (i14) {
            case 0:
                p1 p1Var = (p1) obj5;
                gv0.d dVar = (gv0.d) obj4;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    boolean zB = mVar.B(p1Var) | mVar.r(dVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new m1(i15, p1Var, dVar);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new m1(i15, p1Var, dVar);
                            mVar.K(objQ);
                        }
                    }
                    e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 6, 510);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                wd2.a aVar2 = (wd2.a) obj5;
                Activity activity = (Activity) obj4;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    r rVarB = u1.a2.b(x2.f(aVar3, 1.0f), u1.a2.a(mVar2), true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarA = l.A(rVarB, eVar.f97920e, 0.0f, 2);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81537o;
                    j.f22691a.getClass();
                    z zVarA = y.a(j.f22694d, aVar4, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(rVarA, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
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
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    y0.a(n5.c.a(2131231989, mVar2, 0), gl1.y.Q(mVar2, R.string.default_image_view_content_description), l.C(aVar3, 0.0f, eVar.f97923h, 0.0f, 0.0f, 13), null, null, 0.0f, null, mVar2, 0, 120);
                    String strQ = gl1.y.Q(mVar2, R.string.live_track_non_livetrack_compatible_device_2);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    x0 x0VarF = d92.c.f(x0Var, mVar2);
                    d6.h.f57752b.getClass();
                    int i19 = d6.h.f57755e;
                    mh.c(strQ, l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, eVar.f97922g, 5), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                    y0.a(n5.c.a(2131232038, mVar2, 0), gl1.y.Q(mVar2, R.string.default_image_view_content_description), l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), null, null, 0.0f, null, mVar2, 0, 120);
                    mh.c(gl1.y.Q(mVar2, R.string.live_track_share_sessions_using_strava_beacon), l.C(aVar3, 0.0f, eVar.f97920e, 0.0f, eVar.f97922g, 5), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar2), mVar2, 0, 0, 130044);
                    boolean zR = mVar2.r(aVar2) | mVar2.r(activity);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new gp.f(23, aVar2, activity);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new gp.f(23, aVar2, activity);
                            mVar2.K(objQ2);
                        }
                    }
                    r rVarC2 = l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                    a.f85792a.getClass();
                    h1.c((e23.a) objQ2, rVarC2, false, null, null, null, null, null, a.f85793b, mVar2, C.ENCODING_PCM_32BIT, 508);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                b11.f fVar = (b11.f) obj5;
                v21.e eVar2 = (v21.e) obj4;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    i11.m.b(fVar.f14266a, i53.a.a(new b11.q(R.string.total_fat, fVar.f14269d, R.string.unit_g, R.string.lbl_grams_lowercase, i53.a.a(new b11.q(R.string.saturated_fat, fVar.f14273h, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null), new b11.q(R.string.trans_fat, fVar.f14276k, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null), new b11.q(R.string.polyunsaturated_fat, fVar.f14275j, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null), new b11.q(R.string.monounsaturated_fat, fVar.f14274i, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null))), new b11.q(R.string.cholesterol, fVar.f14277l, R.string.milligrams_abbreviation, R.string.milligrams, null, 16, null), new b11.q(R.string.sodium, fVar.f14278m, R.string.milligrams_abbreviation, R.string.milligrams, null, 16, null), new b11.q(R.string.total_carbs, fVar.f14267b, R.string.unit_g, R.string.lbl_grams_lowercase, i53.a.a(new b11.q(R.string.fiber, fVar.f14270e, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null), new b11.q(R.string.sugar, fVar.f14271f, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null), new b11.q(R.string.added_sugar, fVar.f14272g, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null))), new b11.q(R.string.protein, fVar.f14268c, R.string.unit_g, R.string.lbl_grams_lowercase, null, 16, null), new b11.q(R.string.vitamin_a, fVar.f14280o, R.string.micrograms_abbreviation, R.string.micrograms, null, 16, null), new b11.q(R.string.vitamin_c, fVar.f14281p, R.string.milligrams_abbreviation, R.string.milligrams, null, 16, null), new b11.q(R.string.vitamin_d, fVar.f14282q, R.string.micrograms_abbreviation, R.string.micrograms, null, 16, null), new b11.q(R.string.calcium, fVar.f14283r, R.string.milligrams_abbreviation, R.string.milligrams, null, 16, null), new b11.q(R.string.iron, fVar.f14284t, R.string.milligrams_abbreviation, R.string.milligrams, null, 16, null), new b11.q(R.string.potassium, fVar.f14279n, R.string.milligrams_abbreviation, R.string.milligrams, null, 16, null)), eVar2, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                u4.d dVar2 = (u4.d) obj5;
                String str = (String) obj4;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar6 = r.S;
                    r rVarF = x2.f(aVar6, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    r rVarY = l.y(rVarF, eVar3.f97922g);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    j jVar = j.f22691a;
                    float f14 = eVar3.f97921f;
                    jVar.getClass();
                    z zVarA2 = y.a(j.i(f14), aVar7, mVar4, 48);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    r rVarC3 = k.c(rVarY, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar8);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar4);
                    b0 b0Var2 = b0.f22601a;
                    i7.a(u4.p.b(dVar2, mVar4), null, x2.q(aVar6, j92.b.f97901d.f97907f), androidx.room.a0.c(mVar4), mVar4, 56, 0);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar4);
                    d6.h.f57752b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 130046);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ia0.b bVar3 = (ia0.b) obj5;
                e23.l lVar = (e23.l) obj4;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    int i24 = bVar3.f92412e;
                    String[] strArr = (String[]) bVar3.f92411d.toArray(new String[0]);
                    String strP = gl1.y.P(i24, Arrays.copyOf(strArr, strArr.length), mVar5);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97932i, mVar5);
                    r.a aVar9 = r.S;
                    d92.b.f58625c.getClass();
                    mh.c(strP, l.A(aVar9, 0.0f, j92.b.f97899b.f97918c, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar5, 0, 0, 131068);
                    r rVarB2 = l4.k.b(aVar9, k2.i.a(u.f58858a));
                    List<j90.b> list = bVar3.f92408a;
                    Object objQ3 = mVar5.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new bf(26);
                        mVar5.K(objQ3);
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    boolean zB2 = mVar5.B(lVar);
                    Object objQ4 = mVar5.q();
                    if (zB2 || objQ4 == c2565a) {
                        objQ4 = new fb0.d(lVar, 21);
                        mVar5.K(objQ4);
                    }
                    da0.w.a(rVarB2, list, lVar2, (e23.l) objQ4, null, new h81.a(27), mVar5, 384);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                d0 d0Var = (d0) obj5;
                li0.f fVar2 = (li0.f) obj4;
                e2.d dVar3 = (e2.d) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                dVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(dVar3) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    li0.c0.f112641a.d(d0Var, fVar2, e2.d.c(dVar3, r.S), mVar6, d0.f112647j | (li0.f.f112658h << 3), 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                gi0.a aVar10 = (gi0.a) obj5;
                Context context = (Context) obj4;
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = l9.a(t62.b.f162798a);
                    String strQ2 = gl1.y.Q(mVar7, R.string.msg_no_followers_title);
                    String strQ3 = gl1.y.Q(mVar7, R.string.msg_no_followers_description);
                    String strQ4 = gl1.y.Q(mVar7, R.string.lbl_share_profile);
                    boolean zR2 = mVar7.r(aVar10) | mVar7.r(context);
                    Object objQ5 = mVar7.q();
                    if (zR2) {
                        objQ5 = new i91.c(8, aVar10, context);
                        mVar7.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new i91.c(8, aVar10, context);
                            mVar7.K(objQ5);
                        }
                    }
                    b82.n.d(dVarA, strQ2, strQ3, null, strQ4, (e23.a) objQ5, null, null, mVar7, 0, 200);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                ix.f fVar3 = (ix.f) obj5;
                Context context2 = (Context) obj4;
                h82.r rVar = (h82.r) obj;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i25 = ix.f.f95592j;
                rVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    int i26 = (iIntValue8 << 3) & 112;
                    rVar.D(R.string.gcm_help_body_battery_section3_title, mVar8, i26);
                    rVar.l(R.string.gcm_help_body_battery_section3_subtitle, (iIntValue8 << 6) & 896, 2, null, mVar8);
                    int i27 = i26 | 6;
                    rVar.j(z3.f.c(-316140033, new c70.b(rVar, context2, i18), mVar8), mVar8, i27);
                    if (fVar3.f95593f) {
                        mVar8.C(-737111190);
                    } else {
                        mVar8.C(391863720);
                        fVar3.h(rVar, mVar8, iIntValue8 & 14);
                    }
                    mVar8.f();
                    rVar.j(z3.f.c(904911592, new ix.c(rVar, fVar3, i17), mVar8), mVar8, i27);
                    if (fVar3.f95593f) {
                        mVar8.C(-736624118);
                    } else {
                        mVar8.C(391879277);
                        fVar3.g(rVar, mVar8, iIntValue8 & 14);
                    }
                    mVar8.f();
                    rVar.j(z3.f.c(-1271004729, new ix.c(fVar3, rVar), mVar8), mVar8, i27);
                    if (fVar3.f95593f) {
                        mVar8.C(-736036854);
                    } else {
                        mVar8.C(391898345);
                        fVar3.i(rVar, mVar8, iIntValue8 & 14);
                    }
                    mVar8.f();
                    rVar.c(mVar8, iIntValue8 & 14);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                e23.a aVar11 = (e23.a) obj5;
                b92.a aVar12 = (b92.a) obj4;
                r rVar2 = (r) obj;
                m mVar9 = (m) obj2;
                v.h.y(-27790250, rVar2, (Integer) obj3, mVar9);
                x1 x1Var9 = n.f135158a;
                boolean z14 = aVar11 != null;
                if (aVar11 == null) {
                    mVar9.C(1029512138);
                    Object objQ6 = mVar9.q();
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new ik2.b(28);
                        mVar9.K(objQ6);
                    }
                    aVar11 = (e23.a) objQ6;
                } else {
                    mVar9.C(-936621597);
                }
                mVar9.f();
                r rVarF2 = u1.w.f(236, null, aVar11, rVar2, aVar12 != null ? aVar12.f16961a.get("onClickLabel") : null, z14);
                mVar9.f();
                return rVarF2;
            case 9:
                jf1.b bVar4 = (jf1.b) obj5;
                lc.y yVar = (lc.y) obj4;
                m mVar10 = (m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var10 = n.f135158a;
                if (((Boolean) bVar4.f98700c.getF182175a()).booleanValue()) {
                    mVar10.C(379592457);
                    r.a aVar13 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f15 = eVar4.f97917b;
                    float f16 = eVar4.f97920e;
                    r rVarF3 = x2.f(u1.n.e(l.A(aVar13, 0.0f, f15, 1), d92.b.a(mVar10).c().b(), o4.m1.f128891a), 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(kVar, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode3 = Long.hashCode(mVar10.getU());
                    i2 i2VarX3 = mVar10.x();
                    r rVarC4 = k.c(rVarF3, mVar10);
                    h5.g.V.getClass();
                    h5.e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar14);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar10);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar10, iHashCode3, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar10);
                    b0 b0Var3 = b0.f22601a;
                    l72.s sVar = l72.s.f111232a;
                    r rVarZ = l.z(aVar13, f16, f16);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = gd.a(t62.c.f162799a);
                    String strQ5 = gl1.y.Q(mVar10, R.string.running_tolerance_banner_title);
                    String strQ6 = gl1.y.Q(mVar10, R.string.running_tolerance_banner_message);
                    String strQ7 = gl1.y.Q(mVar10, R.string.lbl_go_to_home_settings);
                    boolean zR3 = mVar10.r(bVar4);
                    Object objQ7 = mVar10.q();
                    int i28 = 22;
                    if (zR3) {
                        objQ7 = new f2(bVar4, 22);
                        mVar10.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new f2(bVar4, 22);
                            mVar10.K(objQ7);
                        }
                    }
                    e23.a aVar15 = (e23.a) objQ7;
                    boolean zR4 = mVar10.r(bVar4) | mVar10.r(yVar);
                    Object objQ8 = mVar10.q();
                    if (zR4) {
                        objQ8 = new i91.c(i28, bVar4, yVar);
                        mVar10.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new i91.c(i28, bVar4, yVar);
                            mVar10.K(objQ8);
                        }
                    }
                    sVar.c(rVarZ, dVarA2, null, null, strQ5, strQ6, strQ7, false, aVar15, (e23.a) objQ8, mVar10, 0, 0, 396);
                    mVar10.y();
                    mVar10.f();
                } else {
                    mVar10.C(380618805);
                    mVar10.f();
                }
                return Unit.INSTANCE;
            case 10:
                jk1.f fVar4 = (jk1.f) obj5;
                hk1.r rVar3 = (hk1.r) obj4;
                String str2 = (String) obj;
                hk1.d dVar4 = (hk1.d) obj2;
                hk1.n nVar = (hk1.n) obj3;
                str2.getClass();
                dVar4.getClass();
                nVar.getClass();
                String applicationName = rVar3.getApplicationName();
                fVar4.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(fVar4), null, null, new jk1.j(fVar4, str2, applicationName, dVar4, nVar, null), 3);
                return Unit.INSTANCE;
            case 11:
                e23.l lVar3 = (e23.l) obj5;
                x xVar = (x) obj4;
                r rVar4 = (r) obj;
                m mVar11 = (m) obj2;
                v.h.y(-221136982, rVar4, (Integer) obj3, mVar11);
                x1 x1Var11 = n.f135158a;
                boolean z15 = lVar3 != null;
                boolean zB3 = mVar11.B(lVar3) | mVar11.r(xVar);
                Object objQ9 = mVar11.q();
                if (zB3) {
                    objQ9 = new i91.c(i15, lVar3, xVar);
                    mVar11.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == m.a.f135155b) {
                        objQ9 = new i91.c(i15, lVar3, xVar);
                        mVar11.K(objQ9);
                    }
                }
                r rVarD2 = u1.w.d(rVar4, z15, null, null, (e23.a) objQ9, 14);
                mVar11.f();
                return rVarD2;
            case 12:
                e23.a aVar16 = (e23.a) obj4;
                p1 p1Var2 = (p1) obj5;
                m mVar12 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var12 = n.f135158a;
                    k11.e.f102189a.getClass();
                    z3.e eVar5 = k11.e.f102192d;
                    boolean zB4 = mVar12.B(aVar16);
                    Object objQ10 = mVar12.q();
                    if (zB4) {
                        objQ10 = new a11.a0(aVar16, p1Var2, 25);
                        mVar12.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new a11.a0(aVar16, p1Var2, 25);
                            mVar12.K(objQ10);
                        }
                    }
                    i3.u.b(eVar5, (e23.a) objQ10, null, null, null, false, null, null, mVar12, 6, 508);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.developer.tutorials.b bVar6 = (com.garmin.android.apps.connectmobile.developer.tutorials.b) obj5;
                e23.l lVar4 = (e23.l) obj4;
                h2 h2Var = (h2) obj;
                m mVar13 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar17 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                h2Var.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar13.B(h2Var) ? 4 : 2;
                }
                if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var13 = n.f135158a;
                    r rVarJ = l.j(l.x(r.S, h2Var), h2Var);
                    o4.d0.f128823b.getClass();
                    ve.a(rVarJ, null, o4.d0.f128831j, 0L, 0.0f, 0.0f, null, z3.f.c(1899722886, new k41.e(i16, bVar6, lVar4), mVar13), mVar13, 12583296, 122);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 14:
                List list2 = (List) obj5;
                p pVar = (p) obj4;
                m mVar14 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar14.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var14 = n.f135158a;
                    r.a aVar18 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar18, j92.b.f97899b.f97920e), mVar14);
                    r rVarF4 = x2.f(aVar18, 1.0f);
                    ka0.i.f103747a.getClass();
                    z3.e eVar6 = ka0.i.f103748b;
                    boolean zB5 = mVar14.B(pVar);
                    Object objQ11 = mVar14.q();
                    if (zB5) {
                        objQ11 = new a3.d(pVar, 18);
                        mVar14.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new a3.d(pVar, 18);
                            mVar14.K(objQ11);
                        }
                    }
                    ka0.f.c(rVarF4, eVar6, list2, (p) objQ11, mVar14, 54);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 15:
                kk1.g gVar = (kk1.g) obj5;
                hk1.a0 a0Var = (hk1.a0) obj4;
                String str3 = (String) obj;
                hk1.d dVar5 = (hk1.d) obj2;
                hk1.n nVar2 = (hk1.n) obj3;
                str3.getClass();
                dVar5.getClass();
                nVar2.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(gVar), null, null, new kk1.i(gVar, str3, a0Var.getApplicationName(), dVar5, nVar2, null), 3);
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2, obj3);
            case 17:
                b10.d dVar6 = (b10.d) obj5;
                l22.a aVar19 = dVar6.f14215a;
                km1.c cVar = (km1.c) obj4;
                t2 t2Var = (t2) obj;
                m mVar15 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar15.B(t2Var) ? 4 : 2;
                }
                if (mVar15.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var15 = n.f135158a;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    String strC = dVar6.c(cVar != null ? cVar.Z() : null);
                    String string = aVar19.getString(R.string.lbl_quality);
                    int i29 = (iIntValue12 & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i29, 124, null, t2Var, null, null, strC, string, null, null, mVar15);
                    if (cVar != null && (dailySleep = cVar.getDailySleep()) != null) {
                        numValueOf = Integer.valueOf(dailySleep.getSleepTimeSeconds());
                    }
                    x0Var2.a(i29, 124, null, t2Var, null, null, dVar6.d(numValueOf), aVar19.getString(R.string.txt_duration), null, null, mVar15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 18:
                return b(obj, obj2, obj3);
            case 19:
                Map map = (Map) obj;
                Set set = (Set) obj2;
                Set set2 = (Set) obj3;
                map.getClass();
                set.getClass();
                set2.getClass();
                ((p1) obj5).setValue(Boolean.FALSE);
                ((q) obj4).invoke(map, set, set2);
                return Unit.INSTANCE;
            case 20:
                return c(obj, obj2, obj3);
            case 21:
                return d(obj, obj2, obj3);
            case 22:
                return e(obj, obj2, obj3);
            case 23:
                return f(obj, obj2, obj3);
            case 24:
                return g(obj, obj2, obj3);
            case 25:
                return h(obj, obj2, obj3);
            case 26:
                return i(obj, obj2, obj3);
            case 27:
                return j(obj, obj2, obj3);
            case 28:
                return k(obj, obj2, obj3);
            default:
                e23.l lVar5 = (e23.l) obj5;
                i53.c cVar2 = (i53.c) obj4;
                int iIntValue13 = ((Integer) obj).intValue();
                m mVar16 = (m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar16.k(iIntValue13) ? 4 : 2;
                }
                if (mVar16.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var16 = n.f135158a;
                    lVar5.invoke(cVar2.get(iIntValue13));
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(o13.h hVar, p1 p1Var, int i14) {
        this.f85796a = i14;
        this.f85798c = hVar;
        this.f85797b = p1Var;
    }
}

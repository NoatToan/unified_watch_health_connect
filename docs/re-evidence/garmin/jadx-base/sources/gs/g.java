package gs;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ds.f0;
import f5.z0;
import h5.e0;
import java.util.List;
import kotlin.t1;
import l72.x0;
import lc.u0;
import nr.p0;
import o4.m1;
import o4.v0;
import o53.b0;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n2;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78615a;

        static {
            int[] iArr = new int[ds.n.values().length];
            try {
                iArr[ds.n.f61014k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ds.n.f61012i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ds.n.f61013j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78615a = iArr;
        }
    }

    public static final void a(final h4.r rVar, final p0 p0Var, float f14, final ds.n nVar, p3.m mVar, int i14) {
        float f15;
        p0Var.getClass();
        o0 o0VarE = mVar.E(2055648635);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.k(nVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p0.a aVar = p0Var.f127286e;
            boolean z14 = aVar instanceof p0.a.d;
            p0.a.d dVar = z14 ? (p0.a.d) aVar : null;
            final List<com.garmin.android.library.mapsdkadapter.q> list = dVar != null ? dVar.f127294a : null;
            p0.a.d dVar2 = z14 ? (p0.a.d) aVar : null;
            final List<com.garmin.android.library.mapsdkadapter.p> list2 = dVar2 != null ? dVar2.f127295b : null;
            p0.a.d dVar3 = z14 ? (p0.a.d) aVar : null;
            boolean z15 = dVar3 != null ? dVar3.f127296c : false;
            p0.a.d dVar4 = z14 ? (p0.a.d) aVar : null;
            List<ps.i> list3 = dVar4 != null ? dVar4.f127297d : null;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            final b0 b0Var = (b0) objQ;
            int i16 = a.f78615a[nVar.ordinal()];
            if (i16 == 1) {
                f15 = 1.875f;
            } else if (i16 == 2) {
                f15 = 1.053f;
            } else {
                if (i16 != 3) {
                    u0.r();
                    return;
                }
                f15 = 1.275f;
            }
            y3 y3Var = t1.f91490h;
            is.n nVar2 = new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(null);
                o0VarE.K(objQ2);
            }
            final p1 p1Var = (p1) objQ2;
            n2 n2VarC = y3Var.c(nVar2);
            final List<ps.i> list4 = list3;
            final boolean z16 = z15;
            final float f16 = f15;
            v.a(n2VarC, z3.f.c(77936827, new e23.p() { // from class: gs.e
                /* JADX WARN: Code duplicated, block: B:54:0x01e0  */
                /* JADX WARN: Code duplicated, block: B:61:0x022f  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    float f17;
                    e0.a aVar2;
                    h5.g.a.b bVar;
                    p1 p1Var2;
                    float f18;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean z17 = false;
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar3 = h4.r.S;
                        h4.r rVarThen = u1.n.e(x2.d(aVar3, 1.0f), vb.h.e(d92.b.f58623a, mVar2), m1.f128891a).then(rVar);
                        h4.d.f81522a.getClass();
                        h4.g gVar = h4.d.a.f81524b;
                        z0 z0VarD = c2.q.d(gVar, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarThen, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, z0VarD, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        h4.r rVarD = x2.d(aVar3, 1.0f);
                        c2.j.f22691a.getClass();
                        z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarD, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC2, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        p0 p0Var2 = p0Var;
                        String str = p0Var2.f127282a;
                        List<nr.l0> list5 = p0Var2.f127285d;
                        String str2 = p0Var2.f127283b;
                        Integer num = p0Var2.f127284c;
                        Integer numValueOf = Integer.valueOf(R.drawable.bg_blue_gradient);
                        ds.n nVar3 = ds.n.f61012i;
                        ds.n nVar4 = nVar;
                        if (nVar4 == nVar3) {
                            g6.f.a aVar5 = g6.f.f75994b;
                            f17 = 48;
                            z17 = false;
                        } else {
                            f17 = 0;
                            g6.f.a aVar6 = g6.f.f75994b;
                        }
                        f0.a(str, str2, num, numValueOf, null, 0L, 0L, 0L, f17, null, mVar2, 0, 752);
                        z0 z0VarD2 = c2.q.d(gVar, false);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX3 = mVar2.x();
                        h4.r rVarC3 = h4.k.c(aVar3, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            aVar2 = aVar4;
                            mVar2.M(aVar2);
                        } else {
                            aVar2 = aVar4;
                            mVar2.c();
                        }
                        b4.c(eVar, z0VarD2, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            bVar = bVar2;
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                        } else {
                            bVar = bVar2;
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        h4.r rVarF = x2.f(aVar3, 1.0f);
                        float f19 = f16;
                        h4.r rVarG = c2.l.g(rVarF, f19);
                        Context context2 = context;
                        boolean zR = mVar2.r(context2);
                        Object objQ3 = mVar2.q();
                        p3.m.a aVar7 = p3.m.f135153a;
                        if (zR) {
                            objQ3 = new a51.m(context2, 12);
                            mVar2.K(objQ3);
                        } else {
                            aVar7.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new a51.m(context2, 12);
                                mVar2.K(objQ3);
                            }
                        }
                        h4.r rVarB = p5.v.b(rVarG, (e23.l) objQ3);
                        b0 b0Var3 = b0Var;
                        boolean zR2 = mVar2.r(b0Var3);
                        boolean z18 = z16;
                        boolean zH = zR2 | mVar2.h(z18);
                        List list6 = list4;
                        boolean zR3 = zH | mVar2.r(list6);
                        List list7 = list;
                        boolean zR4 = zR3 | mVar2.r(list7);
                        List list8 = list2;
                        boolean zR5 = zR4 | mVar2.r(list8);
                        Object objQ4 = mVar2.q();
                        p1 p1Var3 = p1Var;
                        if (zR5) {
                            p1Var2 = p1Var3;
                            objQ4 = new ds.e(b0Var3, z18, list6, list7, list8, p1Var2);
                            mVar2.K(objQ4);
                        } else {
                            aVar7.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                p1Var2 = p1Var3;
                                objQ4 = new ds.e(b0Var3, z18, list6, list7, list8, p1Var2);
                                mVar2.K(objQ4);
                            } else {
                                p1Var2 = p1Var3;
                            }
                        }
                        p002j6.c.b((e23.l) objQ4, rVarB, null, mVar2, 0, 4);
                        v0 v0Var = (v0) p1Var2.getF182175a();
                        if (v0Var == null) {
                            mVar2.C(-1091883916);
                            mVar2.f();
                            f18 = 1.0f;
                        } else {
                            mVar2.C(-1091883915);
                            f18 = 1.0f;
                            y0.c(v0Var, null, c2.l.g(x2.f(aVar3, 1.0f), f19), null, mVar2, 48, 248);
                            Unit unit = Unit.INSTANCE;
                            mVar2.f();
                        }
                        mVar2.y();
                        nr.l0 l0Var = (nr.l0) h0.e0(0, list5);
                        r22.p pVar = l0Var != null ? l0Var.f127250a : null;
                        nr.l0 l0Var2 = (nr.l0) h0.e0(1, list5);
                        r22.p pVar2 = l0Var2 != null ? l0Var2.f127250a : null;
                        h4.r rVarD2 = x2.d(aVar3, f18);
                        t4.d dVarA = n5.c.a(R.drawable.bg_blue_strokes_bottom, mVar2, 0);
                        f5.k.f68985a.getClass();
                        h4.r rVarA = l4.r.a(rVarD2, dVarA, null, f5.k.a.f68993h, 0.0f, null, 54);
                        z0 z0VarD3 = c2.q.d(gVar, false);
                        int iHashCode4 = Long.hashCode(mVar2.getU());
                        i2 i2VarX4 = mVar2.x();
                        h4.r rVarC4 = h4.k.c(rVarA, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar2);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, z0VarD3, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar);
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        x0 x0Var = x0.f111346a;
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        x0Var.e(c2.l.A(aVar3, eVar2.f97920e, 0.0f, 2), z3.f.c(1958655593, new b(pVar, pVar2, 1), mVar2), mVar2, (x0.f111348c << 6) | 48, 0);
                        mVar2.y();
                        mVar2.y();
                        y0.a(n5.c.a(R.drawable.garmin_logo_tag_vertical, mVar2, 0), null, uVar.c(c2.l.C(aVar3, 0.0f, nVar4 == nVar3 ? 64 : eVar2.f97922g, 0.0f, 0.0f, 13), h4.d.a.f81526d), null, null, 0.0f, null, mVar2, 48, 120);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gs.a(rVar, p0Var, f14, nVar, i14, 1);
        }
    }
}

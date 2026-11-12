package fp0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import e23.p;
import ep0.c0;
import ep0.d0;
import et1.a2;
import f5.z0;
import h4.r;
import hk1.v;
import i3.v5;
import java.util.Iterator;
import l72.c1;
import o70.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
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
    public static final void a(final r rVar, final i53.c<d0> cVar, final gp0.c cVar2, p3.m mVar, final int i14) {
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        boolean z14;
        o4.d0 d0VarA;
        long j8;
        int i15;
        float f14;
        rVar.getClass();
        o0 o0VarE = mVar.E(1113091777);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int iA = o0VarE.a();
        int i16 = i14 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(cVar2) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            long jW = e0.w(o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            r rVarE = u1.n.e(rVarC, jW, k2.i.a(8));
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u uVar = u.f22885a;
            o0VarE.C(266342138);
            if (cVar.isEmpty()) {
                o0VarE.w(iA);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new p(rVar, cVar, cVar2, i14, i17) { // from class: fp0.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f73181a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f73182b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ i53.c f73183c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ gp0.c f73184d;

                    {
                        this.f73181a = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = this.f73181a;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i18) {
                            case 0:
                                m.a(this.f73182b, this.f73183c, this.f73184d, mVar2, p0.t(7));
                                break;
                            default:
                                m.a(this.f73182b, this.f73183c, this.f73184d, mVar2, p0.t(7));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                float f15 = 1.0f;
                r rVarF = x2.f(r.S, 1.0f);
                c2.j.f22691a.getClass();
                z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC3 = h4.k.c(rVarF, o0VarE);
                if (cVar3 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(833973170);
                Iterator<d0> it = cVar.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    d0 next = it.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        x.q();
                        throw null;
                    }
                    d0 d0Var = next;
                    ep0.b0 b0Var2 = d0Var.f64872a;
                    String str = b0Var2.f64869b;
                    if (str == null) {
                        str = b0Var2.f64868a;
                    }
                    t.f130062f.getClass();
                    u4.d dVarC = t.a.c(str);
                    String strE = t.a.e(str, a0.s(o0VarE));
                    x1 x1Var2 = n.f135158a;
                    t.b bVarD = t.a.d(str);
                    t tVarA = t.a.a(str);
                    if (bVarD == null) {
                        o0VarE.C(693026101);
                        z14 = false;
                        o0VarE.g0(false);
                        d0VarA = null;
                    } else {
                        z14 = false;
                        o0VarE.C(-670380980);
                        long jB = t.a.b(bVarD, o0VarE);
                        o0VarE.g0(false);
                        d0VarA = o4.d0.a(jB);
                    }
                    if (d0VarA == null) {
                        o0VarE.C(693046066);
                        if (tVarA == null) {
                            o0VarE.C(693046065);
                            o0VarE.g0(z14);
                            d0VarA = null;
                        } else {
                            o0VarE.C(-670380336);
                            o4.d0 d0VarE = tVarA.e(null, o0VarE, 1);
                            o0VarE.g0(z14);
                            d0VarA = d0VarE;
                        }
                    } else {
                        o0VarE.C(-670381235);
                    }
                    o0VarE.g0(z14);
                    if (d0VarA == null) {
                        o0VarE.C(320311644);
                        gl.c.f77766a.getClass();
                        long jC = gl.c.a(o0VarE).c();
                        o0VarE.g0(z14);
                        j8 = jC;
                    } else {
                        o0VarE.C(320309753);
                        o0VarE.g0(z14);
                        j8 = d0VarA.f128833a;
                    }
                    if (strE == null || dVarC == null) {
                        i15 = i16;
                        context = context;
                        f14 = f15;
                    } else {
                        r.a aVar3 = r.S;
                        int i24 = i18;
                        r rVarF2 = x2.f(aVar3, f15);
                        String str2 = d0Var.f64873b;
                        String str3 = d0Var.f64874c;
                        c0 c0Var = d0Var.f64875d;
                        z3.e eVarC = z3.f.c(2109543201, new l(d0Var, 0), o0VarE);
                        boolean zB = o0VarE.B(b0Var2) | ((i16 & 896) == 256) | o0VarE.r(context);
                        Object objQ2 = o0VarE.q();
                        if (zB || objQ2 == p3.m.a.f135155b) {
                            af0.e eVar2 = new af0.e((Object) b0Var2, (Object) cVar2, (Object) context, (Object) p1Var, 25);
                            o0VarE.K(eVar2);
                            objQ2 = eVar2;
                        }
                        i15 = i16;
                        f14 = 1.0f;
                        j.a(rVarF2, dVarC, j8, strE, str2, str3, null, null, c0Var, eVarC, (e23.a) objQ2, o0VarE, 805306374, 192);
                        r rVarA = l4.k.a(x2.f(aVar3, 1.0f), i24 < cVar.size() - 1 ? 1.0f : 0.0f);
                        d92.b.f58623a.getClass();
                        v5.a(0.0f, 0, 2, d92.b.a(o0VarE).j().c(), rVarA, o0VarE);
                    }
                    p1Var = p1Var;
                    f15 = f14;
                    i16 = i15;
                    i18 = i19;
                    it = it;
                    context = context;
                }
                p1 p1Var2 = p1Var;
                o0VarE.g0(false);
                o0VarE.g0(true);
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(268165154);
                    c1 c1Var = c1.f110940a;
                    v vVar = v.f84199e;
                    String strP = gl1.y.P(R.string.lbl_unable_to_connect_to_app, new Object[]{vVar.f84204a}, o0VarE);
                    String strP2 = gl1.y.P(R.string.msg_unable_to_connect_to_app, new Object[]{vVar.f84204a}, o0VarE);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    Object objQ3 = o0VarE.q();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a2(p1Var2, 22);
                        o0VarE.K(objQ3);
                    }
                    c1Var.a(false, strP, strP2, null, null, strQ, false, false, (e23.a) objQ3, null, null, o0VarE, 100663302, 0, 1752);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(268650459);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var3 = n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i25 = 1;
            pVar = new p(rVar, cVar, cVar2, i14, i25) { // from class: fp0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f73181a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f73182b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i53.c f73183c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ gp0.c f73184d;

                {
                    this.f73181a = i25;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = this.f73181a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i110) {
                        case 0:
                            m.a(this.f73182b, this.f73183c, this.f73184d, mVar2, p0.t(7));
                            break;
                        default:
                            m.a(this.f73182b, this.f73183c, this.f73184d, mVar2, p0.t(7));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}

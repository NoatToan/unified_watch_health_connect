package ao1;

import am.l1;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q;
import c2.q1;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import i3.ua;
import l72.f0;
import li0.b0;
import li0.d0;
import o4.u1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11554a;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.REQUEST_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11554a = iArr;
        }
    }

    public static final void a(m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(935609434);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.smart_scale_label_accepted);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, 0, 0, 131070);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a90.m(i14, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void b(d0 d0Var, li0.f fVar, m mVar, int i14) {
        int i15;
        d0Var.getClass();
        fVar.getClass();
        o0 o0VarE = mVar.E(-1619170318);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.smart_scale_label_invite);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            f0.a aVar = f0.a.f111000a;
            z3.e eVarC = z3.f.c(-1855060357, new l1(p1Var, 1, (byte) 0), o0VarE);
            r rVarF = x2.f(r.S, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new defpackage.b(strQ, 12);
                o0VarE.K(objQ2);
            }
            r rVarC = v.c((l) objQ2, rVarF, false);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var))) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(fVar))) | o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                c cVar = new c(fVar, context, d0Var, p1Var, 0);
                o0VarE.K(cVar);
                objQ3 = cVar;
            }
            aVar.e(eVarC, strQ, rVarC, z14, (e23.a) objQ3, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(d0Var, fVar, i14, 0);
        }
    }

    public static final void c(d0 d0Var, li0.f fVar, @SuppressLint({"ModifierParameter"}) r rVar, m mVar, int i14) {
        int i15;
        r rVar2;
        d0Var.getClass();
        fVar.getClass();
        o0 o0VarE = mVar.E(-1005383600);
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        int i16 = i15 | 384;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            r rVarE = c2.l.E(r.S, q1.Max);
            x1 x1Var = n.f135158a;
            if (d0Var.f112652e) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b(d0Var, fVar, rVarE, i14, 0);
                    return;
                }
                return;
            }
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            b0 b0Var = d0Var.f112649b;
            int i17 = b0Var == null ? -1 : a.f11554a[b0Var.ordinal()];
            if (i17 == 1) {
                o0VarE.C(704720424);
                e(o0VarE, 0);
                o0VarE.g0(false);
            } else if (i17 != 2) {
                o0VarE.C(704723600);
                b(d0Var, fVar, o0VarE, (i16 & 112) | d0.f112647j | (i16 & 14) | (li0.f.f112658h << 3));
                o0VarE.g0(false);
            } else {
                o0VarE.C(704722437);
                a(o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            rVar2 = rVarE;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new b(d0Var, fVar, rVar2, i14, 1);
        }
    }

    public static final void d(m mVar, int i14) {
        o0 o0VarE = mVar.E(1487587474);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            bVar.getClass();
            r rVarQ = x2.q(rVarC, j92.b.f97901d.f97903b);
            long jC = o4.d0.c(0.5f, d92.b.a(o0VarE).f().b(), 14);
            o4.d0.f128823b.getClass();
            long j8 = o4.d0.f128831j;
            bVar.getClass();
            float f14 = eVar.f97916a;
            u1.f129010b.getClass();
            ua.a(f14, 0.0f, u1.f129012d, 3072, 32, jC, j8, rVarQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a90.m(i14, 17);
        }
    }

    public static final void e(m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1384579678);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.connection_request_sent);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, 0, 0, 131070);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a90.m(i14, 18);
        }
    }
}

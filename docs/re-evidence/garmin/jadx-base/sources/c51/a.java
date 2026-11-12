package c51;

import a03.n0;
import b82.t0;
import bv0.b;
import c2.b0;
import c2.j;
import c2.o3;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import d92.c;
import e23.l;
import gl1.y;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j92.f;
import p005kotlin.Unit;
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
import s5.x0;
import v.h;
import x5.l0;
import x5.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: c51.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0354a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24503a;

        static {
            int[] iArr = new int[t0.a.values().length];
            try {
                iArr[t0.a.ON_FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.a.ON_FOCUS_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24503a = iArr;
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
    public static final void a(String str, String str2, l lVar, r rVar, m mVar, int i14) {
        r rVar2;
        p1 p1Var;
        str.getClass();
        str2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(537466571);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | 3072;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b(26);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            String strQ = y.Q(o0VarE, R.string.txt_untitle);
            String str3 = (((Boolean) p1Var2.getF182175a()).booleanValue() && str2.equals(strQ)) ? "" : str2;
            r rVarF = x2.f(aVar, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            t0 t0Var = t0.f16792a;
            v.f188954b.getClass();
            int i16 = v.f188955c;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new o3(14);
                o0VarE.K(objQ2);
            }
            l<? super l0, l0> lVar2 = (l) objQ2;
            int i17 = i15 & 896;
            boolean zB = (i17 == 256) | o0VarE.B(strQ);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new au0.g(lVar, strQ, 3);
                o0VarE.K(objQ3);
            }
            l<? super String, Unit> lVar3 = (l) objQ3;
            boolean zB2 = (i17 == 256) | ((i15 & 112) == 32) | o0VarE.B(strQ) | o0VarE.B(p1Var2);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == c2565a) {
                n0 n0Var = new n0(str2, strQ, lVar, p1Var2, 11);
                p1Var = p1Var2;
                o0VarE.K(n0Var);
                objQ4 = n0Var;
            } else {
                p1Var = p1Var2;
            }
            String str4 = str3;
            t0Var.j(null, str, str4, 1024, false, lVar2, lVar3, (l) objQ4, i16, 0, null, o0VarE, ((i15 << 3) & 112) | 100887552, 0, 1537);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1030913809);
                String strP = y.P(R.string.value_slash_value, new Object[]{Integer.valueOf(str4.length()), 1024}, o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = c.f(f.f97935l, o0VarE);
                d6.h.f57752b.getClass();
                int i18 = d6.h.f57758h;
                r rVarF2 = x2.f(aVar, 1.0f);
                d92.b.f58625c.getClass();
                mh.c(strP, c2.l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1031277377);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(str, str2, lVar, rVar2, i14, 19);
        }
    }
}

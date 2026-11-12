package lm0;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.List;
import l72.p2;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<GroupDTO.e> f113586a = x.k(GroupDTO.e.VISIBLE, GroupDTO.e.HIDDEN);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113587a;

        static {
            int[] iArr = new int[GroupDTO.e.values().length];
            try {
                iArr[GroupDTO.e.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupDTO.e.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f113587a = iArr;
        }
    }

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
    public static final void a(GroupDTO.e eVar, e23.l<? super GroupDTO.e, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        Object objO;
        eVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(499556816);
        int i15 = (o0VarE.k(eVar.ordinal()) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i16 = i15;
        int i17 = 18;
        byte b14 = 1;
        byte b15 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            List<GroupDTO.e> list = f113586a;
            if (objQ == obj) {
                int iIndexOf = list.indexOf(eVar);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf < 0) {
                    objO = objQ;
                    numValueOf = null;
                }
                objO = e5.o(numValueOf != null ? numValueOf.intValue() : 0, o0VarE);
            }
            objO = objQ;
            n1 n1Var = (n1) objO;
            r rVarF = x2.f(u1.n.e(r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1532599689);
            int i18 = 0;
            o0 o0Var2 = o0VarE;
            for (Object obj2 : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    x.q();
                    throw null;
                }
                GroupDTO.e eVar2 = (GroupDTO.e) obj2;
                boolean z14 = n1Var.getIntValue() == i18 ? b14 : b15;
                p2 p2Var = p2.f111205a;
                String strQ = gl1.y.Q(o0Var2, eVar2.f31605a);
                e23.p pVarC = z3.f.c(-1019474321, new j30.d(z14, i17, b15), o0Var2);
                int i24 = (o0Var2.k(i18) ? 1 : 0) | ((i16 & 112) == 32 ? b14 : b15) | (o0Var2.k(eVar2.ordinal()) ? 1 : 0);
                Object objQ2 = o0Var2.q();
                if (i24 != 0 || objQ2 == p3.m.a.f135155b) {
                    Object kVar2 = new b21.k(i18, lVar, eVar2, n1Var, 8);
                    o0Var2.K(kVar2);
                    objQ2 = kVar2;
                }
                o0 o0Var3 = o0Var2;
                p2Var.g(strQ, null, null, null, pVarC, false, z14, (e23.a) objQ2, o0Var3, 24576, 174);
                b14 = b14;
                b15 = b15;
                list = list;
                o0Var2 = o0Var3;
                i18 = i19;
                i17 = 18;
            }
            boolean z15 = b14;
            boolean z16 = b15;
            o0Var2.g0(z16);
            int i25 = a.f113587a[list.get(n1Var.getIntValue()).ordinal()];
            String strJ = i25 != z15 ? i25 != 2 ? com.airbnb.lottie.animation.keyframe.a.j(o0Var2, 1532631747, R.string.lbl_empty_string, o0Var2, z16) : com.airbnb.lottie.animation.keyframe.a.j(o0Var2, 1532628736, R.string.msg_group_visibility_private_description, o0Var2, z16) : com.airbnb.lottie.animation.keyframe.a.j(o0Var2, 1532624863, R.string.msg_group_visibility_public_description, o0Var2, z16);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0Var2);
            r.a aVar2 = r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            bVar2.getClass();
            o0 o0Var4 = o0Var2;
            mh.c(strJ, c2.l.z(aVar2, f14, eVar3.f97919d), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var4, 0, 0, 131068);
            o0 o0Var5 = o0Var4;
            o0Var5.g0(z15);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var5;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(eVar, lVar, i14, 26);
        }
    }
}

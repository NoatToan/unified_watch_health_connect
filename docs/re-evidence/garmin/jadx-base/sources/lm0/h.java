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
import kd0.h6;
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
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<GroupDTO.d> f113541a = x.k(GroupDTO.d.PUBLIC, GroupDTO.d.PRIVATE, GroupDTO.d.INVITE);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113542a;

        static {
            int[] iArr = new int[GroupDTO.d.values().length];
            try {
                iArr[GroupDTO.d.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupDTO.d.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupDTO.d.INVITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f113542a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
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
    public static final void a(GroupDTO.d dVar, GroupDTO.e eVar, e23.l<? super GroupDTO.d, Unit> lVar, p3.m mVar, int i14) {
        Object obj;
        GroupDTO.d dVar2;
        o0 o0Var;
        int iIndexOf;
        Integer numValueOf;
        int iIntValue;
        Object objO;
        String strJ;
        dVar.getClass();
        eVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1893141407);
        int i15 = (o0VarE.k(dVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.k(eVar.ordinal()) ? 32 : 16);
        int i16 = 256;
        if ((i14 & 384) == 0) {
            obj = lVar;
            i15 |= o0VarE.r(obj) ? 256 : 128;
        } else {
            obj = lVar;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            List<GroupDTO.d> list = f113541a;
            if (z14) {
                dVar2 = dVar;
                iIndexOf = list.indexOf(dVar2);
                numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                objO = e5.o(iIntValue, o0VarE);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    dVar2 = dVar;
                    iIndexOf = list.indexOf(dVar2);
                    numValueOf = Integer.valueOf(iIndexOf);
                    if (iIndexOf < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    objO = e5.o(iIntValue, o0VarE);
                } else {
                    dVar2 = dVar;
                    objO = objQ;
                }
            }
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
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1091112317);
            int i17 = 0;
            for (Object obj2 : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                GroupDTO.d dVar3 = (GroupDTO.d) obj2;
                boolean z15 = n1Var.getIntValue() == i17 ? 1 : b14;
                p2 p2Var = p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, dVar3.f31600a);
                byte b15 = (eVar != GroupDTO.e.HIDDEN || dVar3 == GroupDTO.d.INVITE) ? (byte) 1 : b14;
                e23.p pVarC = z3.f.c(1437088464, new j30.d(z15, 14, b14), o0VarE);
                int i19 = (o0VarE.B(n1Var) ? 1 : 0) | (o0VarE.k(i17) ? 1 : 0) | ((i15 & 896) == i16 ? (byte) 1 : b14) | (o0VarE.k(dVar3.ordinal()) ? 1 : 0);
                Object objQ2 = o0VarE.q();
                if (i19 == 0) {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        Object kVar2 = new b21.k(i17, obj, dVar3, n1Var, 7);
                        o0VarE.K(kVar2);
                        objQ2 = kVar2;
                    }
                } else {
                    Object kVar3 = new b21.k(i17, obj, dVar3, n1Var, 7);
                    o0VarE.K(kVar3);
                    objQ2 = kVar3;
                }
                p2Var.g(strQ, null, null, null, pVarC, b15, z15, (e23.a) objQ2, o0VarE, 24576, 142);
                b14 = b14;
                list = list;
                n1Var = n1Var;
                i17 = i18;
                i16 = i16;
                i15 = i15;
                obj = lVar;
            }
            boolean z16 = b14;
            o0VarE.g0(z16);
            int i24 = a.f113542a[list.get(n1Var.getIntValue()).ordinal()];
            if (i24 == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1091141045, R.string.msg_group_joining_instant_description, o0VarE, z16);
            } else if (i24 != 2) {
                strJ = i24 != 3 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1091150912, R.string.lbl_empty_string, o0VarE, z16) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1091148180, R.string.msg_group_joining_invite_description, o0VarE, z16);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1091144629, R.string.msg_group_joining_request_description, o0VarE, z16);
            }
            String str = strJ;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            r.a aVar3 = r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            mh.c(str, c2.l.z(aVar3, f14, eVar2.f97919d), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0 o0Var2 = o0VarE;
            o0Var2.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            dVar2 = dVar;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(dVar2, eVar, lVar, i14, 23);
        }
    }
}

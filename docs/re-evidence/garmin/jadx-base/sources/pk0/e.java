package pk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.t0;
import c2.n0;
import c2.n3;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.u;
import d53.w;
import gl1.y;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import m4.b0;
import o72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import u1.a2;
import x5.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:107:0x018d A[EDGE_INSN: B:107:0x018d->B:108:0x018e BREAK  A[LOOP:3: B:101:0x0173->B:106:0x018a]] */
    /* JADX WARN: Code duplicated, block: B:130:0x01df  */
    /* JADX WARN: Code duplicated, block: B:141:0x0221  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    public static final void a(List list, String str, final String str2, e23.a aVar, e23.p pVar, boolean z14, boolean z15, final e23.a aVar2, final e23.a aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        Object next;
        ?? arrayList;
        boolean z16;
        int i15;
        Object dVar;
        int i16;
        Object bVar;
        p1 p1Var;
        String str3;
        final p1 p1Var2;
        List<String> list2;
        list.getClass();
        aVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(993165746);
        int i17 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar3) ? 67108864 : 33554432);
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String string = str != null ? w.i0(str).toString() : null;
            if (string == null) {
                string = "";
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!w.J(((jk0.h) obj).f99254a)) {
                    arrayList2.add(obj);
                }
            }
            String string2 = str2 != null ? w.i0(str2).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u.q(((jk0.h) next).f99254a, string, true));
            jk0.h hVar = (jk0.h) next;
            boolean zIsEmpty = arrayList2.isEmpty();
            boolean z17 = (zIsEmpty || aVar2 == null) ? false : true;
            boolean z18 = z14 || zIsEmpty || hVar == null;
            if (hVar == null || (list2 = hVar.f99255b) == null) {
                arrayList = 0;
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!w.J((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
            }
            if (arrayList == 0) {
                arrayList = j0.f134944a;
            }
            if (str2 == null) {
                z16 = false;
                break;
            }
            Iterable iterable = (Iterable) arrayList;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                z16 = false;
                break;
            }
            Iterator it3 = iterable.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z16 = false;
                    break;
                }
                Iterator it4 = it3;
                if (u.q((String) it3.next(), str2, true)) {
                    z16 = true;
                    break;
                }
                it3 = it4;
            }
            boolean z19 = (((Collection) arrayList).isEmpty() || aVar3 == null) ? false : true;
            boolean z24 = z15 || arrayList.isEmpty() || !z16;
            Object[] objArr = {string, Boolean.valueOf(z18), Boolean.valueOf(z14)};
            int i18 = i17 & 458752;
            boolean zH = (i18 == 131072) | o0VarE.h(z18) | o0VarE.B(string);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zH) {
                i15 = 0;
                objQ = new a(z18, z14, string, 0);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i15 = 0;
                    objQ = new a(z18, z14, string, 0);
                    o0VarE.K(objQ);
                } else {
                    i15 = 0;
                }
            }
            p1 p1Var3 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, i15);
            Object[] objArr2 = {string2, Boolean.valueOf(z24), Boolean.valueOf(z15)};
            int i19 = i17 & 3670016;
            boolean zH2 = (i19 == 1048576) | o0VarE.h(z24) | o0VarE.B(string2);
            Object objQ2 = o0VarE.q();
            if (zH2) {
                objQ2 = new a(z24, z15, string2, 1);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(z24, z15, string2, 1);
                    o0VarE.K(objQ2);
                }
            }
            p1 p1Var4 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
            Object objQ3 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = kg.f.j(o0VarE);
            }
            b0 b0Var = (b0) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = kg.f.j(o0VarE);
            }
            final b0 b0Var2 = (b0) objQ4;
            Object[] objArr3 = {Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf(z18), Boolean.valueOf(z24)};
            boolean zH3 = (i18 == 131072) | o0VarE.h(z18) | (i19 == 1048576) | o0VarE.h(z24);
            Object objQ5 = o0VarE.q();
            if (zH3 || objQ5 == c2565a) {
                i16 = 256;
                dVar = new d(z14, z18, b0Var, z15, z24, b0Var2, null);
                b0Var = b0Var;
                o0VarE.K(dVar);
            } else {
                dVar = objQ5;
                i16 = 256;
            }
            l0.h(objArr3, (e23.p) dVar, o0VarE);
            boolean zH4 = ((i17 & 896) == i16) | o0VarE.h(z18) | o0VarE.B(p1Var3) | o0VarE.B(string) | o0VarE.h(z24) | o0VarE.B(p1Var4) | ((57344 & i17) == 16384) | ((i17 & 7168) == 2048);
            Object objQ6 = o0VarE.q();
            if (zH4 || objQ6 == c2565a) {
                o0Var = o0VarE;
                p1Var = p1Var4;
                str3 = string;
                boolean z25 = z18;
                bVar = new b(z25, str3, z24, str2, pVar, aVar, p1Var3, p1Var);
                p1Var2 = p1Var3;
                z18 = z25;
                o0Var.K(bVar);
            } else {
                p1Var2 = p1Var3;
                p1Var = p1Var4;
                o0Var = o0VarE;
                bVar = objQ6;
                str3 = string;
            }
            e23.a aVar5 = (e23.a) bVar;
            c.w.a(0, 1, aVar5, o0Var, false);
            final String strQ = y.Q(o0Var, R.string.lbl_brand);
            final String strQ2 = y.Q(o0Var, R.string.lbl_model);
            final String strQ3 = y.Q(o0Var, R.string.other_brand);
            final String strQ4 = y.Q(o0Var, R.string.other_model);
            z3.e eVarC = z3.f.c(-1366715507, new p40.r(aVar5, 4), o0Var);
            n0 n0Var = n3.f22788a;
            final boolean z26 = z18;
            final String str4 = str3;
            final boolean z27 = z24;
            final boolean z28 = z17;
            final boolean z29 = z19;
            final p1 p1Var5 = p1Var;
            final b0 b0Var3 = b0Var;
            z02.d.a(false, eVarC, null, null, new n0(0, 0, 0, 0), z3.f.c(1180920585, new e23.p() { // from class: pk0.c
                /* JADX WARN: Code duplicated, block: B:35:0x0109  */
                /* JADX WARN: Code duplicated, block: B:57:0x0233  */
                /* JADX WARN: Code duplicated, block: B:74:0x02f9  */
                /* JADX WARN: Code duplicated, block: B:89:0x037e  */
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
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    String strH;
                    h4.r.a aVar6;
                    float f14;
                    boolean z34;
                    boolean z35;
                    float f15;
                    boolean z36;
                    boolean z37;
                    String str5;
                    Context context2;
                    int i24;
                    float f16;
                    String string3;
                    c cVar;
                    boolean z38;
                    boolean z39;
                    p3.m mVar2 = (p3.m) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar7 = h4.r.S;
                        h4.r rVarD = c2.l.D(a2.b(aVar7, a2.a(mVar2), true));
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar8 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar8);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        c2.b0 b0Var4 = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f17 = eVar.f97920e;
                        float f18 = eVar.f97917b;
                        c2.l.f(x2.h(aVar7, f17), mVar2);
                        boolean z44 = z28;
                        boolean z45 = z26;
                        String str6 = strQ;
                        if (!z44 || z45) {
                            mVar2.C(-1466235899);
                            mVar2.f();
                            strH = str6;
                        } else {
                            mVar2.C(-1466298891);
                            uk0.i.f171830a.getClass();
                            strH = uk0.i.h(str6, mVar2);
                            mVar2.f();
                        }
                        Context context3 = context;
                        String string4 = (z44 && z45) ? context3.getString(R.string.lbl_other) : str4;
                        string4.getClass();
                        p3.m.a aVar9 = p3.m.f135153a;
                        if (z44) {
                            mVar2.C(-1465956279);
                            p2 p2Var = p2.f111205a;
                            e23.a aVar10 = aVar2;
                            boolean zB = mVar2.B(aVar10);
                            Object objQ7 = mVar2.q();
                            if (zB) {
                                objQ7 = new pf0.j(aVar10, 1);
                                mVar2.K(objQ7);
                            } else {
                                aVar9.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new pf0.j(aVar10, 1);
                                    mVar2.K(objQ7);
                                }
                            }
                            aVar6 = aVar7;
                            f15 = f17;
                            z36 = z44;
                            z37 = z45;
                            f14 = f18;
                            context2 = context3;
                            z35 = false;
                            z34 = true;
                            str5 = str6;
                            p2Var.h(strH, string4, null, null, null, false, false, null, null, null, (e23.a) objQ7, mVar2, 0, 0, 1020);
                            i24 = 0;
                            mVar2.f();
                        } else {
                            aVar6 = aVar7;
                            f14 = f18;
                            z34 = true;
                            z35 = false;
                            f15 = f17;
                            z36 = z44;
                            z37 = z45;
                            str5 = str6;
                            context2 = context3;
                            i24 = 0;
                            mVar2.C(-1465735249);
                            mVar2.f();
                        }
                        if (!z36 || z37) {
                            f16 = f15;
                            mVar2.C(-1465148977);
                            mVar2.f();
                        } else {
                            mVar2.C(-1465576095);
                            float f19 = f15;
                            h4.r rVarF = x2.f(c2.l.z(aVar6, f19, f14), 1.0f);
                            String strQ5 = y.Q(mVar2, R.string.required_field_star);
                            d92.b.f58624b.getClass();
                            f16 = f19;
                            mh.c(strQ5, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar2), mVar2, 0, 0, 131068);
                            mVar2 = mVar2;
                            mVar2.f();
                        }
                        if (z37) {
                            mVar2.C(-1465068842);
                            uk0.i iVar = uk0.i.f171830a;
                            String str7 = z36 ? strQ3 : str5;
                            iVar.getClass();
                            String strH2 = uk0.i.h(str7, mVar2);
                            t0 t0Var = t0.f16792a;
                            h4.r rVarA = m4.e.a(aVar6, b0Var3);
                            p1 p1Var6 = p1Var2;
                            String str8 = (String) p1Var6.getF182175a();
                            boolean z46 = ((String) p1Var6.getF182175a()).length() > 250 ? z34 : z35;
                            boolean zB2 = mVar2.B(p1Var6);
                            Object objQ8 = mVar2.q();
                            if (zB2) {
                                objQ8 = new i3(p1Var6, 25);
                                mVar2.K(objQ8);
                            } else {
                                aVar9.getClass();
                                if (objQ8 == p3.m.a.f135155b) {
                                    objQ8 = new i3(p1Var6, 25);
                                    mVar2.K(objQ8);
                                }
                            }
                            v.f188954b.getClass();
                            p3.m mVar3 = mVar2;
                            t0Var.i(rVarA, strH2, str8, null, z46, (e23.l) objQ8, null, v.f188955c, 0, z3.f.c(1198673408, new li0.w(p1Var6, 21), mVar2), mVar3, 817892352, 320);
                            h4.r rVarF2 = x2.f(c2.l.z(aVar6, f16, f14), 1.0f);
                            String strQ6 = y.Q(mVar3, R.string.required_field_star);
                            d92.b.f58624b.getClass();
                            mh.c(strQ6, rVarF2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar3), mVar3, 0, 0, 131068);
                            mVar2 = mVar3;
                            mVar2.f();
                        } else {
                            mVar2.C(-1463845489);
                            mVar2.f();
                        }
                        boolean z47 = z29;
                        boolean z48 = z27;
                        if (z47 && z48) {
                            string3 = context2.getString(R.string.lbl_other);
                        } else {
                            string3 = str2;
                            if (string3 == null) {
                                string3 = "";
                            }
                        }
                        string3.getClass();
                        String str9 = strQ2;
                        if (z47) {
                            mVar2.C(-1463594358);
                            p2 p2Var2 = p2.f111205a;
                            e23.a aVar11 = aVar3;
                            boolean zB3 = mVar2.B(aVar11);
                            Object objQ9 = mVar2.q();
                            if (zB3) {
                                objQ9 = new pf0.j(aVar11, 2);
                                mVar2.K(objQ9);
                            } else {
                                aVar9.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    objQ9 = new pf0.j(aVar11, 2);
                                    mVar2.K(objQ9);
                                }
                            }
                            z38 = z48;
                            cVar = this;
                            z39 = z47;
                            p2Var2.h(str9, string3, null, null, null, false, false, null, null, null, (e23.a) objQ9, mVar2, 0, i24, 1020);
                            mVar2.f();
                        } else {
                            cVar = this;
                            z38 = z48;
                            z39 = z47;
                            mVar2.C(-1463374289);
                            mVar2.f();
                        }
                        if (z38) {
                            mVar2.C(-1463308259);
                            if (z39) {
                                str9 = strQ4;
                            }
                            String str10 = str9;
                            t0 t0Var2 = t0.f16792a;
                            h4.r rVarA2 = m4.e.a(aVar6, b0Var2);
                            p1 p1Var7 = p1Var5;
                            String str11 = (String) p1Var7.getF182175a();
                            boolean z49 = ((String) p1Var7.getF182175a()).length() > 250 ? z34 : z35;
                            boolean zB4 = mVar2.B(p1Var7);
                            Object objQ10 = mVar2.q();
                            if (zB4) {
                                objQ10 = new i3(p1Var7, 24);
                                mVar2.K(objQ10);
                            } else {
                                aVar9.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new i3(p1Var7, 24);
                                    mVar2.K(objQ10);
                                }
                            }
                            v.f188954b.getClass();
                            p3.m mVar4 = mVar2;
                            t0Var2.i(rVarA2, str10, str11, null, z49, (e23.l) objQ10, null, v.f188955c, 0, z3.f.c(1465847230, new li0.w(p1Var7, 20), mVar2), mVar4, 817892352, 320);
                            mVar2 = mVar4;
                            mVar2.f();
                        } else {
                            mVar2.C(-1462522161);
                            mVar2.f();
                        }
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var), o0Var, 196656, 13);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j21.g(list, str, str2, aVar, pVar, z14, z15, aVar2, aVar3, i14);
        }
    }
}

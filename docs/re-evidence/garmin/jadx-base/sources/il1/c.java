package il1;

import as.q;
import b82.y1;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d62.o;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.g0;
import s1.f0;
import v.h;
import v62.s6;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(i53.d<a, ? extends List<? extends zf2.d>> dVar, kl1.a aVar, boolean z14, int i14, l<? super Integer, Unit> lVar, l<? super zf2.d, Unit> lVar2, l<? super zf2.d, Unit> lVar3, m mVar, int i15, int i16) {
        l<? super zf2.d, Unit> lVar4;
        int i17;
        l<? super zf2.d, Unit> lVar5;
        int i18;
        o0 o0Var;
        l<? super zf2.d, Unit> lVar6;
        l<? super zf2.d, Unit> lVar7;
        l<? super zf2.d, Unit> lVar8;
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-525596424);
        int i19 = i15 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 2048 : 1024);
        int i24 = i16 & 32;
        if (i24 != 0) {
            i17 = i19 | 196608;
            lVar4 = lVar2;
        } else {
            lVar4 = lVar2;
            i17 = i19 | (o0VarE.r(lVar4) ? 131072 : 65536);
        }
        int i25 = i16 & 64;
        if (i25 != 0) {
            i18 = i17 | 1572864;
            lVar5 = lVar3;
        } else {
            lVar5 = lVar3;
            i18 = i17 | (o0VarE.r(lVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i26 = i18;
        if (o0VarE.n(i26 & 1, (599187 & i26) != 599186)) {
            m.a aVar2 = m.f135153a;
            if (i24 != 0) {
                Object objQ = o0VarE.q();
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ig2.d(12);
                    o0VarE.K(objQ);
                }
                lVar4 = (l) objQ;
            }
            if (i25 != 0) {
                Object objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ig2.d(13);
                    o0VarE.K(objQ2);
                }
                lVar8 = (l) objQ2;
            } else {
                lVar8 = lVar5;
            }
            x1 x1Var = n.f135158a;
            o0VarE.C(1707991140);
            Set<a> setKeySet = dVar.keySet();
            ArrayList arrayList = new ArrayList(y.r(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(gl1.y.Q(o0VarE, aVar.b((a) it.next())));
            }
            o0VarE.g0(false);
            l<? super zf2.d, Unit> lVar9 = lVar8;
            o0Var = o0VarE;
            b(i53.a.e(arrayList), i14, lVar, z3.f.c(-986479264, new d62.f(dVar, aVar, z14, lVar4, lVar8, 3), o0VarE), o0Var, ((i26 >> 6) & 112) | 3456);
            x1 x1Var2 = n.f135158a;
            lVar7 = lVar4;
            lVar6 = lVar9;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            lVar6 = lVar5;
            lVar7 = lVar4;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(dVar, aVar, z14, i14, lVar, lVar7, lVar6, i15, i16);
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
    public static final void b(i53.c cVar, int i14, l lVar, z3.e eVar, m mVar, int i15) {
        i53.c cVar2;
        int i16;
        o0 o0VarE = mVar.E(-528404696);
        if ((i15 & 6) == 0) {
            cVar2 = cVar;
            i16 = (o0VarE.B(cVar2) ? 4 : 2) | i15;
        } else {
            cVar2 = cVar;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            y1.f16902a.c(cVar2, i14, true, true, true, 0L, 0L, z3.f.c(532627984, new q(i14, lVar, eVar, 2), o0VarE), o0VarE, (i16 & 14) | 12610944 | (i16 & 112), 96);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(cVar, i14, lVar, eVar, i15, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0231  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(kl1.a aVar, i53.c<? extends zf2.d> cVar, boolean z14, final l<? super zf2.d, Unit> lVar, final l<? super zf2.d, Unit> lVar2, m mVar, int i14) {
        u4.d dVarA;
        d0 d0VarA;
        int i15;
        Object obj;
        e23.a aVar2;
        char c14;
        boolean z15;
        Object obj2;
        o0 o0VarE = mVar.E(-1376132249);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar3 = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar3, o0VarE);
            g.V.getClass();
            e0.a aVar4 = g.a.f81805b;
            f0 f0Var = null;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            o0VarE.C(-1830923202);
            for (final zf2.d dVar : cVar) {
                String strA = aVar.a(dVar);
                u4.d dVarC = aVar.c(dVar);
                r rVarA = g0.a(r.S, f0Var, 3);
                j.f22691a.getClass();
                j.C0343j c0343j = j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, i17);
                x1 x1Var2 = n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = k.c(rVarA, o0VarE);
                g.V.getClass();
                e0.a aVar5 = g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, s2VarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA1, o0VarE);
                g.a.b bVar2 = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                if (z14) {
                    s62.a.f157643a.getClass();
                    dVarA = s6.a(t62.b.f162798a);
                } else {
                    dVarA = null;
                }
                if (z14) {
                    o0VarE.C(1112725191);
                    d92.b.f58623a.getClass();
                    long jA = d92.b.a(o0VarE).f().a();
                    o0VarE.g0(false);
                    d0VarA = d0.a(jA);
                } else {
                    o0VarE.C(134754396);
                    o0VarE.g0(false);
                    d0VarA = null;
                }
                m.a aVar6 = m.f135153a;
                if (z14) {
                    i15 = 57344;
                    o0VarE.C(134905832);
                    boolean zK = ((i16 & 57344) == 16384) | o0VarE.k(dVar.ordinal());
                    Object objQ = o0VarE.q();
                    if (zK) {
                        final int i18 = 1;
                        Object obj3 = new e23.a() { // from class: il1.b
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        lVar2.invoke(dVar);
                                        break;
                                    default:
                                        lVar2.invoke(dVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(obj3);
                        obj = obj3;
                    } else {
                        aVar6.getClass();
                        if (objQ == m.a.f135155b) {
                            final int i19 = 1;
                            Object obj4 = new e23.a() { // from class: il1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            lVar2.invoke(dVar);
                                            break;
                                        default:
                                            lVar2.invoke(dVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(obj4);
                            obj = obj4;
                        } else {
                            obj = objQ;
                        }
                    }
                    aVar2 = (e23.a) obj;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(134809670);
                    i15 = 57344;
                    boolean zK2 = o0VarE.k(dVar.ordinal()) | ((i16 & 7168) == 2048);
                    Object objQ2 = o0VarE.q();
                    if (zK2) {
                        z15 = false;
                        final boolean z16 = false ? 1 : 0;
                        Object obj5 = new e23.a() { // from class: il1.b
                            @Override // e23.a
                            public final Object invoke() {
                                switch (z16) {
                                    case 0:
                                        lVar.invoke(dVar);
                                        break;
                                    default:
                                        lVar.invoke(dVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(obj5);
                        obj2 = obj5;
                    } else {
                        aVar6.getClass();
                        if (objQ2 == m.a.f135155b) {
                            z15 = false;
                            final int z17 = false ? 1 : 0;
                            Object obj6 = new e23.a() { // from class: il1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (z17) {
                                        case 0:
                                            lVar.invoke(dVar);
                                            break;
                                        default:
                                            lVar.invoke(dVar);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(obj6);
                            obj2 = obj6;
                        } else {
                            z15 = false;
                            obj2 = objQ2;
                        }
                    }
                    aVar2 = (e23.a) obj2;
                    o0VarE.g0(z15);
                }
                int i24 = i16 & i15;
                p3.c<?> cVar3 = cVar2;
                boolean zK3 = ((i16 & 896) == 256) | (i24 == 16384) | o0VarE.k(dVar.ordinal());
                Object objQ3 = o0VarE.q();
                if (zK3) {
                    c14 = 4;
                    objQ3 = new c.e(z14, lVar2, dVar, 4);
                    o0VarE.K(objQ3);
                } else {
                    aVar6.getClass();
                    if (objQ3 == m.a.f135155b) {
                        c14 = 4;
                        objQ3 = new c.e(z14, lVar2, dVar, 4);
                        o0VarE.K(objQ3);
                    } else {
                        c14 = 4;
                    }
                }
                f.a(strA, dVarC, dVarA, d0VarA, aVar2, (e23.a) objQ3, null, null, null, o0VarE, 0, 448);
                o0VarE.g0(true);
                cVar2 = cVar3;
                f0Var = null;
                i17 = 0;
            }
            o0VarE.g0(i17);
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(aVar, cVar, lVar, lVar2, z14, i14, 14);
        }
    }
}

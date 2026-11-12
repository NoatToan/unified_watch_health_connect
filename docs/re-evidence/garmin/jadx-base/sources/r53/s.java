package r53;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.maps.android.compose.clustering.d f150847a = new com.google.maps.android.compose.clustering.d(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qx1.p f150848b = new qx1.p(29);

    public static final i A(i iVar, t13.g gVar) {
        if (gVar.get(o53.l1.f129368i0) != null) {
            vb.h.y(gVar, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (gVar.equals(t13.h.f161748a)) {
            return iVar;
        }
        if (iVar instanceof s53.t) {
            return s53.t.a.a((s53.t) iVar, gVar, 0, null, 6);
        }
        return new s53.j(iVar, gVar, 0, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(i iVar, v13.c cVar) {
        y0 y0Var;
        p005kotlin.jvm.internal.r0 r0Var;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i14 = y0Var.f150950c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y0Var.f150950c = i14 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(cVar);
            }
        } else {
            y0Var = new y0(cVar);
        }
        Object obj = y0Var.f150949b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = y0Var.f150950c;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            z0 z0Var = new z0(r0VarS);
            y0Var.f150948a = r0VarS;
            y0Var.f150950c = 1;
            if (iVar.collect(z0Var, y0Var) == obj2) {
                return obj2;
            }
            r0Var = r0VarS;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = y0Var.f150948a;
            o13.r.b(obj);
        }
        return r0Var.f105810a;
    }

    public static final o53.c2 C(i iVar, o53.b0 b0Var) {
        return ge1.b.T(b0Var, null, null, new o(iVar, null), 3);
    }

    public static final s53.k D(i iVar, e23.p pVar) {
        int i14 = p0.f150790a;
        return N(iVar, new o0(pVar, null));
    }

    public static final s53.l E(i... iVarArr) {
        int i14 = p0.f150790a;
        return new s53.l(iVarArr.length == 0 ? p13.j0.f134944a : new p13.t(iVarArr), null, 0, null, 14, null);
    }

    public static final e F(q53.v vVar) {
        return new e(vVar, false, null, 0, null, 28, null);
    }

    public static final a2 G(i iVar, o53.b0 b0Var, k2 k2Var) {
        j2 j2VarA = h1.a(iVar);
        e2 e2VarA = g2.a(1, j2VarA.f150679b, j2VarA.f150680c);
        t13.g gVar = j2VarA.f150681d;
        i<T> iVar2 = j2VarA.f150678a;
        u53.x xVar = g2.f150633a;
        k2.f150703a.getClass();
        return new a2(e2VarA, ge1.b.S(b0Var, gVar, p005kotlin.jvm.internal.s.g(k2Var, k2.a.f150705b) ? o53.d0.DEFAULT : o53.d0.UNDISPATCHED, new e1(k2Var, iVar2, e2VarA, xVar, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, u53.x] */
    public static final Object H(i iVar, v13.c cVar) {
        a1 a1Var;
        p005kotlin.jvm.internal.r0 r0Var;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f150525c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f150525c = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(cVar);
            }
        } else {
            a1Var = new a1(cVar);
        }
        Object obj = a1Var.f150524b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f150525c;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            r0VarS.f105810a = s53.w.f157598a;
            b1 b1Var = new b1(r0VarS);
            a1Var.f150523a = r0VarS;
            a1Var.f150525c = 1;
            if (iVar.collect(b1Var, a1Var) == obj2) {
                return obj2;
            }
            r0Var = r0VarS;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = a1Var.f150523a;
            o13.r.b(obj);
        }
        T t7 = r0Var.f105810a;
        if (t7 != s53.w.f157598a) {
            return t7;
        }
        n23.j.s("Flow is empty");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, u53.x] */
    public static final Object I(w wVar, v13.c cVar) {
        d1 d1Var;
        p005kotlin.jvm.internal.r0 r0Var;
        AbortFlowException e4;
        c1 c1Var;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i14 = d1Var.f150562d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d1Var.f150562d = i14 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(cVar);
            }
        } else {
            d1Var = new d1(cVar);
        }
        Object obj = d1Var.f150561c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = d1Var.f150562d;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            r0VarS.f105810a = s53.w.f157598a;
            c1 c1Var2 = new c1(r0VarS);
            try {
                d1Var.f150559a = r0VarS;
                d1Var.f150560b = c1Var2;
                d1Var.f150562d = 1;
                if (wVar.collect(c1Var2, d1Var) == obj2) {
                    return obj2;
                }
                r0Var = r0VarS;
            } catch (AbortFlowException e14) {
                r0Var = r0VarS;
                e4 = e14;
                c1Var = c1Var2;
                if (e4.owner == c1Var) {
                    throw e4;
                }
                g8.i.v(d1Var.getF157466b());
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1Var = d1Var.f150560b;
            r0Var = d1Var.f150559a;
            try {
                o13.r.b(obj);
            } catch (AbortFlowException e15) {
                e4 = e15;
                if (e4.owner == c1Var) {
                    throw e4;
                }
                g8.i.v(d1Var.getF157466b());
            }
        }
        T t7 = r0Var.f105810a;
        if (t7 == s53.w.f157598a) {
            return null;
        }
        return t7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object J(s1 s1Var, u53.d dVar, v13.c cVar) {
        g1 g1Var;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i14 = g1Var.f150632b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g1Var.f150632b = i14 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(cVar);
            }
        } else {
            g1Var = new g1(cVar);
        }
        Object objC = g1Var.f150631a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g1Var.f150632b;
        if (i15 == 0) {
            o13.r.b(objC);
            j2 j2VarA = h1.a(s1Var);
            o53.s sVar = new o53.s((o53.l1) dVar.f168725a.get(o53.l1.f129368i0));
            ge1.b.T(dVar, j2VarA.f150681d, null, new f1(j2VarA.f150678a, sVar, null), 2);
            g1Var.f150632b = 1;
            objC = sVar.C(g1Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        Object obj = ((o13.q) objC).f128597a;
        o13.r.b(obj);
        return obj;
    }

    public static final b2 K(i iVar, o53.b0 b0Var, k2 k2Var, Object obj) {
        j2 j2VarA = h1.a(iVar);
        p2 p2VarA = q2.a(obj);
        t13.g gVar = j2VarA.f150681d;
        i<T> iVar2 = j2VarA.f150678a;
        k2.f150703a.getClass();
        return new b2(p2VarA, ge1.b.S(b0Var, gVar, p005kotlin.jvm.internal.s.g(k2Var, k2.a.f150705b) ? o53.d0.DEFAULT : o53.d0.UNDISPATCHED, new e1(k2Var, iVar2, p2VarA, obj, null)));
    }

    public static final f0 L(i iVar, int i14) {
        if (i14 > 0) {
            return new f0(iVar, i14);
        }
        vb.h.x(v.e0.f(i14, "Requested element count ", " should be positive"));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object M(i iVar, ArrayList arrayList, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f150789c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f150789c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(cVar);
            }
        } else {
            pVar = new p(cVar);
        }
        Object obj = pVar.f150788b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f150789c;
        if (i15 == 0) {
            o13.r.b(obj);
            q qVar = new q(arrayList);
            pVar.f150787a = arrayList;
            pVar.f150789c = 1;
            return iVar.collect(qVar, pVar) == obj2 ? obj2 : arrayList;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList2 = pVar.f150787a;
        o13.r.b(obj);
        return arrayList2;
    }

    public static final s53.k N(i iVar, e23.q qVar) {
        int i14 = p0.f150790a;
        return new s53.k(qVar, iVar, null, 0, null, 28, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final u13.a a(j jVar, Object obj, Object obj2, v13.c cVar) {
        e0 e0Var;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f150568c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f150568c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(cVar);
            }
        } else {
            e0Var = new e0(cVar);
        }
        Object obj3 = e0Var.f150567b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f150568c;
        if (i15 == 0) {
            o13.r.b(obj3);
            e0Var.f150566a = obj2;
            e0Var.f150568c = 1;
            if (jVar.emit(obj, e0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = e0Var.f150566a;
            o13.r.b(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(v2 v2Var, e23.q qVar, Throwable th3, v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f150866c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f150866c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(cVar);
            }
        } else {
            tVar = new t(cVar);
        }
        Object obj = tVar.f150865b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f150866c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                tVar.f150864a = th3;
                tVar.f150866c = 1;
                if (qVar.invoke(v2Var, th3, tVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th3 = tVar.f150864a;
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            if (th3 != null && th3 != th4) {
                o13.g.a(th4, th3);
            }
            throw th4;
        }
    }

    public static final a2 c(y1 y1Var) {
        return new a2(y1Var, null);
    }

    public static final b2 d(z1 z1Var) {
        return new b2(z1Var, null);
    }

    public static final i e(i iVar, int i14, q53.a aVar) {
        if (i14 < 0 && i14 != -2 && i14 != -1) {
            vb.h.x(am.j.h(i14, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i14 == -1 && aVar != q53.a.SUSPEND) {
            vb.h.s("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i14 == -1) {
            aVar = q53.a.DROP_OLDEST;
            i14 = 0;
        }
        int i15 = i14;
        q53.a aVar2 = aVar;
        if (iVar instanceof s53.t) {
            return s53.t.a.a((s53.t) iVar, null, i15, aVar2, 1);
        }
        return new s53.j(iVar, null, i15, aVar2, 2, null);
    }

    public static final b f(e23.p pVar) {
        return new b(pVar, null, 0, null, 14, null);
    }

    public static final c g(i iVar) {
        if (!(iVar instanceof c)) {
            iVar = new d(iVar);
        }
        return (c) iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable h(i iVar, j jVar, v13.c cVar) throws Throwable {
        x xVar;
        p005kotlin.jvm.internal.r0 r0Var;
        o53.l1 l1Var;
        CancellationException cancellationExceptionQ;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f150936c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f150936c = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(cVar);
            }
        } else {
            xVar = new x(cVar);
        }
        Object obj = xVar.f150935b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f150936c;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            try {
                y yVar = new y(jVar, r0VarS);
                xVar.f150934a = r0VarS;
                xVar.f150936c = 1;
                if (iVar.collect(yVar, xVar) == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                r0Var = r0VarS;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = xVar.f150934a;
            try {
                o13.r.b(obj);
                return null;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        Throwable th5 = (Throwable) r0Var.f105810a;
        if ((th5 != null && th5.equals(th)) || ((l1Var = (o53.l1) xVar.getF157466b().get(o53.l1.f129368i0)) != null && l1Var.isCancelled() && (cancellationExceptionQ = l1Var.Q()) != null && cancellationExceptionQ.equals(th))) {
            throw th;
        }
        if (th5 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            o13.g.a(th5, th);
            throw th5;
        }
        o13.g.a(th, th5);
        throw th;
    }

    public static final f i(e23.p pVar) {
        return new f(pVar, null, 0, null, 14, null);
    }

    public static final Object j(i iVar, t13.d dVar) {
        Object objCollect = iVar.collect(s53.v.f157597a, dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }

    public static final Object k(i iVar, e23.p pVar, t13.d dVar) {
        Object objJ = j(e(D(iVar, pVar), 0, q53.a.SUSPEND), dVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    public static final r1 l(i iVar, i iVar2, i iVar3, e23.r rVar) {
        return new r1(new i[]{iVar, iVar2, iVar3}, rVar);
    }

    public static final s1 m(i iVar, i iVar2, i iVar3, i iVar4, e23.s sVar) {
        return new s1(new i[]{iVar, iVar2, iVar3, iVar4}, sVar);
    }

    public static final t1 n(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, e23.t tVar) {
        return new t1(new i[]{iVar, iVar2, iVar3, iVar4, iVar5}, tVar);
    }

    public static final i o(i iVar) {
        return e(iVar, -1, q53.a.SUSPEND);
    }

    public static final e p(q53.v vVar) {
        return new e(vVar, true, null, 0, null, 28, null);
    }

    public static final i q(i iVar, long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? iVar : new s53.r(new r(new j82.d(j8, 20), iVar, null));
        }
        vb.h.s("Debounce timeout should not be negative");
        return null;
    }

    public static final g r(i iVar, e23.p pVar) {
        pVar.getClass();
        p005kotlin.jvm.internal.y0.e(2, pVar);
        return t(iVar, f150847a, pVar);
    }

    public static final i s(i iVar) {
        return iVar instanceof o2 ? iVar : t(iVar, f150847a, f150848b);
    }

    public static final g t(i iVar, e23.l lVar, e23.p pVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f150616b == lVar && gVar.f150617c == pVar) {
                return gVar;
            }
        }
        return new g(iVar, lVar, pVar);
    }

    public static final a0 u(i iVar, int i14) {
        if (i14 >= 0) {
            return new a0(iVar, i14);
        }
        vb.h.x(am.j.h(i14, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final Object v(j jVar, i iVar, t13.d dVar) throws Throwable {
        if (jVar instanceof v2) {
            throw ((v2) jVar).f150914a;
        }
        Object objCollect = iVar.collect(jVar, dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, u53.x] */
    public static final Object w(i iVar, e23.p pVar, v13.c cVar) {
        t0 t0Var;
        p005kotlin.jvm.internal.r0 r0Var;
        AbortFlowException e4;
        r0 r0Var2;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i14 = t0Var.f150870d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f150870d = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(cVar);
            }
        } else {
            t0Var = new t0(cVar);
        }
        Object obj = t0Var.f150869c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f150870d;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            r0VarS.f105810a = s53.w.f157598a;
            r0 r0Var3 = new r0(pVar, r0VarS);
            try {
                t0Var.f150867a = r0VarS;
                t0Var.f150868b = r0Var3;
                t0Var.f150870d = 1;
                if (iVar.collect(r0Var3, t0Var) == obj2) {
                    return obj2;
                }
                r0Var = r0VarS;
            } catch (AbortFlowException e14) {
                r0Var = r0VarS;
                e4 = e14;
                r0Var2 = r0Var3;
                if (e4.owner == r0Var2) {
                    throw e4;
                }
                g8.i.v(t0Var.getF157466b());
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var2 = t0Var.f150868b;
            r0Var = t0Var.f150867a;
            try {
                o13.r.b(obj);
            } catch (AbortFlowException e15) {
                e4 = e15;
                if (e4.owner == r0Var2) {
                    throw e4;
                }
                g8.i.v(t0Var.getF157466b());
            }
        }
        T t7 = r0Var.f105810a;
        if (t7 != s53.w.f157598a) {
            return t7;
        }
        n23.j.s("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, u53.x] */
    public static final Object x(i iVar, t13.d dVar) {
        s0 s0Var;
        p005kotlin.jvm.internal.r0 r0Var;
        AbortFlowException e4;
        q0 q0Var;
        if (dVar instanceof s0) {
            s0Var = (s0) dVar;
            int i14 = s0Var.f150852d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f150852d = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(dVar);
            }
        } else {
            s0Var = new s0(dVar);
        }
        Object obj = s0Var.f150851c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f150852d;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            r0VarS.f105810a = s53.w.f157598a;
            q0 q0Var2 = new q0(r0VarS);
            try {
                s0Var.f150849a = r0VarS;
                s0Var.f150850b = q0Var2;
                s0Var.f150852d = 1;
                if (iVar.collect(q0Var2, s0Var) == obj2) {
                    return obj2;
                }
                r0Var = r0VarS;
            } catch (AbortFlowException e14) {
                r0Var = r0VarS;
                e4 = e14;
                q0Var = q0Var2;
                if (e4.owner == q0Var) {
                    throw e4;
                }
                g8.i.v(s0Var.getF157466b());
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q0Var = s0Var.f150850b;
            r0Var = s0Var.f150849a;
            try {
                o13.r.b(obj);
            } catch (AbortFlowException e15) {
                e4 = e15;
                if (e4.owner == q0Var) {
                    throw e4;
                }
                g8.i.v(s0Var.getF157466b());
            }
        }
        T t7 = r0Var.f105810a;
        if (t7 != s53.w.f157598a) {
            return t7;
        }
        n23.j.s("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(i iVar, v13.c cVar) {
        w0 w0Var;
        p005kotlin.jvm.internal.r0 r0Var;
        AbortFlowException e4;
        u0 u0Var;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f150925d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f150925d = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(cVar);
            }
        } else {
            w0Var = new w0(cVar);
        }
        Object obj = w0Var.f150924c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f150925d;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            u0 u0Var2 = new u0(r0VarS);
            try {
                w0Var.f150922a = r0VarS;
                w0Var.f150923b = u0Var2;
                w0Var.f150925d = 1;
                if (iVar.collect(u0Var2, w0Var) == obj2) {
                    return obj2;
                }
                r0Var = r0VarS;
            } catch (AbortFlowException e14) {
                r0Var = r0VarS;
                e4 = e14;
                u0Var = u0Var2;
                if (e4.owner == u0Var) {
                    throw e4;
                }
                g8.i.v(w0Var.getF157466b());
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u0Var = w0Var.f150923b;
            r0Var = w0Var.f150922a;
            try {
                o13.r.b(obj);
            } catch (AbortFlowException e15) {
                e4 = e15;
                if (e4.owner == u0Var) {
                    throw e4;
                }
                g8.i.v(w0Var.getF157466b());
            }
        }
        return r0Var.f105810a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z(s53.t tVar, e23.p pVar, v13.c cVar) {
        x0 x0Var;
        p005kotlin.jvm.internal.r0 r0Var;
        AbortFlowException e4;
        v0 v0Var;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f150940d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f150940d = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(cVar);
            }
        } else {
            x0Var = new x0(cVar);
        }
        Object obj = x0Var.f150939c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f150940d;
        if (i15 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            v0 v0Var2 = new v0(pVar, r0VarS);
            try {
                x0Var.f150937a = r0VarS;
                x0Var.f150938b = v0Var2;
                x0Var.f150940d = 1;
                if (tVar.collect(v0Var2, x0Var) == obj2) {
                    return obj2;
                }
                r0Var = r0VarS;
            } catch (AbortFlowException e14) {
                r0Var = r0VarS;
                e4 = e14;
                v0Var = v0Var2;
                if (e4.owner == v0Var) {
                    throw e4;
                }
                g8.i.v(x0Var.getF157466b());
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v0Var = x0Var.f150938b;
            r0Var = x0Var.f150937a;
            try {
                o13.r.b(obj);
            } catch (AbortFlowException e15) {
                e4 = e15;
                if (e4.owner == v0Var) {
                    throw e4;
                }
                g8.i.v(x0Var.getF157466b());
            }
        }
        return r0Var.f105810a;
    }
}

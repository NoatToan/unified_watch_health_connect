package h5;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1.p0<Object> f81824a = p1.z0.a();

    public static final void a(h4.r.c cVar) {
        if (!cVar.getIsAttached()) {
            e5.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(h4.r.c cVar, int i14, int i15) {
        if (!(cVar instanceof m)) {
            c(cVar, i14 & cVar.getKindSet(), i15);
            return;
        }
        m mVar = (m) cVar;
        int i16 = mVar.f81887a;
        c(cVar, i16 & i14, i15);
        int i17 = (~i16) & i14;
        for (h4.r.c child = mVar.f81888b; child != null; child = child.getChild()) {
            b(child, i17, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h4.r.c cVar, int i14, int i15) {
        if (i15 != 0 || cVar.getF69013b()) {
            if ((i14 & 2) != 0 && (cVar instanceof c0)) {
                k.g((c0) cVar).T();
                if (i15 == 2) {
                    k.e(cVar, 2).W1();
                }
            }
            if ((i14 & 128) != 0 && i15 != 2) {
                k.g(cVar).T();
            }
            if ((4194304 & i14) != 0 && i15 != 2) {
                e0 e0VarG = k.g(cVar);
                e0.d dVar = e0.N0;
                e0VarG.i0(false);
            }
            if ((i14 & 256) != 0 && (cVar instanceof u)) {
                if (i15 == 1) {
                    e0 e0VarG2 = k.g(cVar);
                    e0VarG2.n0(e0VarG2.L0 + 1);
                } else if (i15 == 2) {
                    e0 e0VarG3 = k.g(cVar);
                    e0VarG3.n0(e0VarG3.L0 - 1);
                }
                if (i15 != 2) {
                    e0 e0VarG4 = k.g(cVar);
                    if (e0VarG4.L0 != 0 && !e0VarG4.F() && !e0VarG4.G() && !e0VarG4.K0) {
                        i0.a(e0VarG4).J(e0VarG4);
                    }
                }
            }
            if ((i14 & 4) != 0 && (cVar instanceof s)) {
                t.a((s) cVar);
            }
            if ((i14 & 8) != 0 && (cVar instanceof y1)) {
                k.g(cVar).f81778r = true;
            }
            if ((i14 & 64) != 0 && (cVar instanceof s1)) {
                j0 j0Var = k.g((s1) cVar).T;
                j0Var.f81853p.f81968r = true;
                n0 n0Var = j0Var.f81854q;
                if (n0Var != null) {
                    n0Var.f81916z = true;
                }
            }
            if ((i14 & 2048) != 0 && (cVar instanceof m4.a0)) {
                m4.a0 a0Var = (m4.a0) cVar;
                f fVar = f.f81800b;
                fVar.getClass();
                f.f81801c = null;
                a0Var.P1(fVar);
                if (f.f81801c != null) {
                    if (!a0Var.getNode().getIsAttached()) {
                        e5.a.b("visitChildren called on an unattached node");
                    }
                    q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
                    h4.r.c child = a0Var.getNode().getChild();
                    if (child == null) {
                        k.a(cVar2, a0Var.getNode());
                    } else {
                        cVar2.b(child);
                    }
                    while (true) {
                        int i16 = cVar2.f142358c;
                        if (i16 == 0) {
                            break;
                        }
                        h4.r.c cVarB = (h4.r.c) cVar2.k(i16 - 1);
                        if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                            k.a(cVar2, cVarB);
                        } else {
                            while (cVarB != null) {
                                if ((cVarB.getKindSet() & 1024) != 0) {
                                    q3.c cVar3 = null;
                                    while (cVarB != null) {
                                        if (cVarB instanceof m4.j0) {
                                            m4.j0 j0Var2 = (m4.j0) cVarB;
                                            k.h(j0Var2).getFocusOwner().d(j0Var2);
                                        } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof m)) {
                                            int i17 = 0;
                                            for (h4.r.c child2 = ((m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                                if ((child2.getKindSet() & 1024) != 0) {
                                                    i17++;
                                                    if (i17 == 1) {
                                                        cVarB = child2;
                                                    } else {
                                                        if (cVar3 == null) {
                                                            cVar3 = new q3.c(new h4.r.c[16], 0);
                                                        }
                                                        if (cVarB != null) {
                                                            cVar3.b(cVarB);
                                                            cVarB = null;
                                                        }
                                                        cVar3.b(child2);
                                                    }
                                                }
                                            }
                                            if (i17 == 1) {
                                            }
                                        }
                                        cVarB = k.b(cVar3);
                                    }
                                    break;
                                }
                                cVarB = cVarB.getChild();
                            }
                        }
                    }
                }
            }
            if ((i14 & 4096) != 0 && (cVar instanceof m4.k)) {
                m4.k kVar = (m4.k) cVar;
                k.h(kVar).getFocusOwner().c(kVar);
            }
            if ((i14 & 2097152) != 0 && (cVar instanceof y4.e) && i15 == 2) {
                ((y4.e) cVar).u0();
            }
        }
    }

    public static final void d(h4.r.c cVar) {
        if (!cVar.getIsAttached()) {
            e5.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int e(h4.r.b bVar) {
        int i14 = bVar instanceof f5.o0 ? 3 : 1;
        if (bVar instanceof l4.j) {
            i14 |= 4;
        }
        if (bVar instanceof p5.u) {
            i14 |= 8;
        }
        if (bVar instanceof b5.g0) {
            i14 |= 16;
        }
        if ((bVar instanceof g5.d) || (bVar instanceof g5.h)) {
            i14 |= 32;
        }
        if (bVar instanceof m4.j) {
            i14 |= 4096;
        }
        if (bVar instanceof m4.s) {
            i14 |= 2048;
        }
        if (bVar instanceof f5.i1) {
            i14 |= 256;
        }
        if (bVar instanceof f5.s1) {
            i14 |= 64;
        }
        if (bVar instanceof f5.k1) {
            i14 |= 4194304;
        }
        if (bVar instanceof f5.m1) {
            i14 |= 128;
        }
        return bVar instanceof m5.a ? 524288 | i14 : i14;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0061  */
    /* JADX WARN: Code duplicated, block: B:47:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x006d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0073  */
    /* JADX WARN: Code duplicated, block: B:56:0x0079  */
    /* JADX WARN: Code duplicated, block: B:59:0x007f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085  */
    /* JADX WARN: Code duplicated, block: B:65:0x008d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0094  */
    /* JADX WARN: Code duplicated, block: B:71:0x009b  */
    /* JADX WARN: Code duplicated, block: B:74:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00b0  */
    public static final int f(h4.r.c cVar) {
        int i14;
        if (cVar.getKindSet() != 0) {
            return cVar.getKindSet();
        }
        Class<?> cls = cVar.getClass();
        p1.p0<Object> p0Var = f81824a;
        int iA = p0Var.a(cls);
        if (iA >= 0) {
            return p0Var.f134875c[iA];
        }
        int i15 = cVar instanceof c0 ? 3 : 1;
        if (cVar instanceof s) {
            i15 |= 4;
        }
        if (cVar instanceof y1) {
            i15 |= 8;
        }
        if (cVar instanceof u1) {
            i15 |= 16;
        }
        if (cVar instanceof g5.g) {
            i15 |= 32;
        }
        if (cVar instanceof s1) {
            i15 |= 64;
        }
        if (!(cVar instanceof f5.l1)) {
            if (cVar instanceof b0) {
                i14 = 4194432;
            } else if (cVar instanceof w0) {
                i15 |= 128;
            }
            if (cVar instanceof u) {
                i15 |= 256;
            }
            if (cVar instanceof f5.e) {
                i15 |= 512;
            }
            if (cVar instanceof m4.j0) {
                i15 |= 1024;
            }
            if (cVar instanceof m4.a0) {
                i15 |= 2048;
            }
            if (cVar instanceof m4.k) {
                i15 |= 4096;
            }
            if (cVar instanceof z4.g) {
                i15 |= 8192;
            }
            if (cVar instanceof d5.a) {
                i15 |= 16384;
            }
            if (cVar instanceof h) {
                i15 |= 32768;
            }
            if (cVar instanceof z4.i) {
                i15 |= 131072;
            }
            if (cVar instanceof e2) {
                i15 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
            }
            if (cVar instanceof m5.a) {
                i15 |= 524288;
            }
            if (cVar instanceof g2) {
                i15 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            }
            if (cVar instanceof y4.e) {
                i15 |= 2097152;
            }
            if (cVar instanceof f5.i) {
                i15 |= 8388608;
            }
            p0Var.h(cls, i15);
            return i15;
        }
        i14 = 4194304;
        i15 |= i14;
        if (cVar instanceof u) {
            i15 |= 256;
        }
        if (cVar instanceof f5.e) {
            i15 |= 512;
        }
        if (cVar instanceof m4.j0) {
            i15 |= 1024;
        }
        if (cVar instanceof m4.a0) {
            i15 |= 2048;
        }
        if (cVar instanceof m4.k) {
            i15 |= 4096;
        }
        if (cVar instanceof z4.g) {
            i15 |= 8192;
        }
        if (cVar instanceof d5.a) {
            i15 |= 16384;
        }
        if (cVar instanceof h) {
            i15 |= 32768;
        }
        if (cVar instanceof z4.i) {
            i15 |= 131072;
        }
        if (cVar instanceof e2) {
            i15 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        }
        if (cVar instanceof m5.a) {
            i15 |= 524288;
        }
        if (cVar instanceof g2) {
            i15 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }
        if (cVar instanceof y4.e) {
            i15 |= 2097152;
        }
        if (cVar instanceof f5.i) {
            i15 |= 8388608;
        }
        p0Var.h(cls, i15);
        return i15;
    }

    public static final int g(h4.r.c cVar) {
        if (!(cVar instanceof m)) {
            return f(cVar);
        }
        m mVar = (m) cVar;
        int iG = mVar.f81887a;
        for (h4.r.c child = mVar.f81888b; child != null; child = child.getChild()) {
            iG |= g(child);
        }
        return iG;
    }

    public static final boolean h(int i14) {
        return ((i14 & 128) != 0) | ((i14 & 4194304) != 0);
    }
}

package vr1;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f02.b0;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:0: B:70:0x0140->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final r rVar, final int i14, final int i15, final int i16, final int i17, p<? super p3.m, ? super Integer, Unit> pVar, float f14, p3.m mVar, final int i18, final int i19) {
        p<? super p3.m, ? super Integer, Unit> pVar2;
        int i24;
        float f15;
        int i25;
        boolean z14;
        final p<? super p3.m, ? super Integer, Unit> pVar3;
        final float f16;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar4;
        float f17;
        long jC;
        long jB;
        long j8;
        long j14;
        long j15;
        int i26;
        ArrayList arrayList;
        p005kotlin.jvm.internal.j jVar;
        float f18;
        Iterator<E> it;
        Object obj;
        Object next;
        o0 o0VarE = mVar.E(1857619667);
        int i27 = i18 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.k(i16) ? 2048 : 1024) | (o0VarE.k(i17) ? 16384 : 8192);
        int i28 = i19 & 32;
        if (i28 == 0) {
            if ((i18 & 196608) == 0) {
                pVar2 = pVar;
                i27 |= o0VarE.r(pVar2) ? 131072 : 65536;
            }
            i24 = i19 & 64;
            if (i24 != 0) {
                if ((i18 & 1572864) == 0) {
                    f15 = f14;
                    if (o0VarE.i(f15)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i27 |= i25;
                }
                if ((599187 & i27) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i27 & 1, z14)) {
                    if (i28 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    if (i24 != 0) {
                        f17 = 8;
                        g6.f.a aVar = g6.f.f75994b;
                    } else {
                        f17 = f15;
                    }
                    x1 x1Var = p3.n.f135158a;
                    int i29 = i27 >> 3;
                    f02.e.f67730a.getClass();
                    jC = f02.e.c(o0VarE);
                    b0.f67725a.getClass();
                    gl.c cVar = gl.c.f77766a;
                    cVar.getClass();
                    jB = gl.c.a(o0VarE).b();
                    cVar.getClass();
                    gl.e eVar = gl.c.f77767b;
                    float f19 = f17;
                    j8 = eVar.K;
                    cVar.getClass();
                    j14 = eVar.N;
                    cVar.getClass();
                    int i30 = i27;
                    p<? super p3.m, ? super Integer, Unit> pVar5 = pVar4;
                    j15 = eVar.P;
                    i26 = i14 + i15 + i16 + i17;
                    arrayList = new ArrayList();
                    if (i26 > 0) {
                        if (i14 > 0) {
                            jVar = null;
                            arrayList.add(new z72.l(dh.b.J(i14, i26), jB, null));
                        } else {
                            jVar = null;
                        }
                        if (i15 > 0) {
                            arrayList.add(new z72.l(dh.b.J(i15, i26), j8, jVar));
                        }
                        if (i16 > 0) {
                            arrayList.add(new z72.l(dh.b.J(i16, i26), j14, jVar));
                        }
                        if (i17 > 0) {
                            arrayList.add(new z72.l(dh.b.J(i17, i26), j15, jVar));
                        }
                    } else {
                        jVar = null;
                        arrayList.add(new z72.l(1.0f, jC, null));
                    }
                    if (i26 > 0) {
                        it = i53.a.j(arrayList).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = jVar;
                                break;
                            }
                            next = it.next();
                            if (((z72.l) next).f202960a == 100.0f) {
                                obj = next;
                                break;
                            }
                        }
                        if (obj != null) {
                            f18 = 0.0f;
                        } else {
                            f18 = 3.0f;
                        }
                    } else {
                        f18 = 0.0f;
                    }
                    o13.p pVar6 = new o13.p(i53.a.j(arrayList), Float.valueOf(f18));
                    x1 x1Var2 = p3.n.f135158a;
                    o0VarE = o0VarE;
                    z72.k.c(rVar, (i53.f) pVar6.f128594a, null, null, f19, ((Number) pVar6.f128595b).floatValue(), z3.f.c(-2134976715, new ba2.i(pVar5, 7), o0VarE), o0VarE, (i30 & 14) | 12582912 | (i29 & 458752), 28);
                    pVar3 = pVar5;
                    f16 = f19;
                } else {
                    o0VarE.e();
                    pVar3 = pVar2;
                    f16 = f15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: vr1.f
                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            g.a(rVar, i14, i15, i16, i17, pVar3, f16, (p3.m) obj2, p0.t(i18 | 1), i19);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i27 |= 1572864;
            f15 = f14;
            if ((599187 & i27) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i27 & 1, z14)) {
                if (i28 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                if (i24 != 0) {
                    f17 = 8;
                    g6.f.a aVar2 = g6.f.f75994b;
                } else {
                    f17 = f15;
                }
                x1 x1Var3 = p3.n.f135158a;
                int i210 = i27 >> 3;
                f02.e.f67730a.getClass();
                jC = f02.e.c(o0VarE);
                b0.f67725a.getClass();
                gl.c cVar2 = gl.c.f77766a;
                cVar2.getClass();
                jB = gl.c.a(o0VarE).b();
                cVar2.getClass();
                gl.e eVar2 = gl.c.f77767b;
                float f110 = f17;
                j8 = eVar2.K;
                cVar2.getClass();
                j14 = eVar2.N;
                cVar2.getClass();
                int i34 = i27;
                p<? super p3.m, ? super Integer, Unit> pVar7 = pVar4;
                j15 = eVar2.P;
                i26 = i14 + i15 + i16 + i17;
                arrayList = new ArrayList();
                if (i26 > 0) {
                    if (i14 > 0) {
                        jVar = null;
                        arrayList.add(new z72.l(dh.b.J(i14, i26), jB, null));
                    } else {
                        jVar = null;
                    }
                    if (i15 > 0) {
                        arrayList.add(new z72.l(dh.b.J(i15, i26), j8, jVar));
                    }
                    if (i16 > 0) {
                        arrayList.add(new z72.l(dh.b.J(i16, i26), j14, jVar));
                    }
                    if (i17 > 0) {
                        arrayList.add(new z72.l(dh.b.J(i17, i26), j15, jVar));
                    }
                } else {
                    jVar = null;
                    arrayList.add(new z72.l(1.0f, jC, null));
                }
                if (i26 > 0) {
                    it = i53.a.j(arrayList).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = jVar;
                            break;
                        }
                        next = it.next();
                        if (((z72.l) next).f202960a == 100.0f) {
                            obj = next;
                            break;
                        }
                    }
                    if (obj != null) {
                        f18 = 0.0f;
                    } else {
                        f18 = 3.0f;
                    }
                } else {
                    f18 = 0.0f;
                }
                o13.p pVar8 = new o13.p(i53.a.j(arrayList), Float.valueOf(f18));
                x1 x1Var4 = p3.n.f135158a;
                o0VarE = o0VarE;
                z72.k.c(rVar, (i53.f) pVar8.f128594a, null, null, f110, ((Number) pVar8.f128595b).floatValue(), z3.f.c(-2134976715, new ba2.i(pVar7, 7), o0VarE), o0VarE, (i34 & 14) | 12582912 | (i210 & 458752), 28);
                pVar3 = pVar7;
                f16 = f110;
            } else {
                o0VarE.e();
                pVar3 = pVar2;
                f16 = f15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: vr1.f
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        g.a(rVar, i14, i15, i16, i17, pVar3, f16, (p3.m) obj2, p0.t(i18 | 1), i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i27 |= 196608;
        pVar2 = pVar;
        i24 = i19 & 64;
        if (i24 != 0) {
            if ((i18 & 1572864) == 0) {
                f15 = f14;
                if (o0VarE.i(f15)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i27 |= i25;
            }
            if ((599187 & i27) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i27 & 1, z14)) {
                if (i28 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                if (i24 != 0) {
                    f17 = 8;
                    g6.f.a aVar3 = g6.f.f75994b;
                } else {
                    f17 = f15;
                }
                x1 x1Var5 = p3.n.f135158a;
                int i211 = i27 >> 3;
                f02.e.f67730a.getClass();
                jC = f02.e.c(o0VarE);
                b0.f67725a.getClass();
                gl.c cVar3 = gl.c.f77766a;
                cVar3.getClass();
                jB = gl.c.a(o0VarE).b();
                cVar3.getClass();
                gl.e eVar3 = gl.c.f77767b;
                float f111 = f17;
                j8 = eVar3.K;
                cVar3.getClass();
                j14 = eVar3.N;
                cVar3.getClass();
                int i35 = i27;
                p<? super p3.m, ? super Integer, Unit> pVar9 = pVar4;
                j15 = eVar3.P;
                i26 = i14 + i15 + i16 + i17;
                arrayList = new ArrayList();
                if (i26 > 0) {
                    if (i14 > 0) {
                        jVar = null;
                        arrayList.add(new z72.l(dh.b.J(i14, i26), jB, null));
                    } else {
                        jVar = null;
                    }
                    if (i15 > 0) {
                        arrayList.add(new z72.l(dh.b.J(i15, i26), j8, jVar));
                    }
                    if (i16 > 0) {
                        arrayList.add(new z72.l(dh.b.J(i16, i26), j14, jVar));
                    }
                    if (i17 > 0) {
                        arrayList.add(new z72.l(dh.b.J(i17, i26), j15, jVar));
                    }
                } else {
                    jVar = null;
                    arrayList.add(new z72.l(1.0f, jC, null));
                }
                if (i26 > 0) {
                    it = i53.a.j(arrayList).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = jVar;
                            break;
                        }
                        next = it.next();
                        if (((z72.l) next).f202960a == 100.0f) {
                            obj = next;
                            break;
                        }
                    }
                    if (obj != null) {
                        f18 = 0.0f;
                    } else {
                        f18 = 3.0f;
                    }
                } else {
                    f18 = 0.0f;
                }
                o13.p pVar10 = new o13.p(i53.a.j(arrayList), Float.valueOf(f18));
                x1 x1Var6 = p3.n.f135158a;
                o0VarE = o0VarE;
                z72.k.c(rVar, (i53.f) pVar10.f128594a, null, null, f111, ((Number) pVar10.f128595b).floatValue(), z3.f.c(-2134976715, new ba2.i(pVar9, 7), o0VarE), o0VarE, (i35 & 14) | 12582912 | (i211 & 458752), 28);
                pVar3 = pVar9;
                f16 = f111;
            } else {
                o0VarE.e();
                pVar3 = pVar2;
                f16 = f15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: vr1.f
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        g.a(rVar, i14, i15, i16, i17, pVar3, f16, (p3.m) obj2, p0.t(i18 | 1), i19);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i27 |= 1572864;
        f15 = f14;
        if ((599187 & i27) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i27 & 1, z14)) {
            if (i28 != 0) {
                pVar4 = null;
            } else {
                pVar4 = pVar2;
            }
            if (i24 != 0) {
                f17 = 8;
                g6.f.a aVar4 = g6.f.f75994b;
            } else {
                f17 = f15;
            }
            x1 x1Var7 = p3.n.f135158a;
            int i212 = i27 >> 3;
            f02.e.f67730a.getClass();
            jC = f02.e.c(o0VarE);
            b0.f67725a.getClass();
            gl.c cVar4 = gl.c.f77766a;
            cVar4.getClass();
            jB = gl.c.a(o0VarE).b();
            cVar4.getClass();
            gl.e eVar4 = gl.c.f77767b;
            float f112 = f17;
            j8 = eVar4.K;
            cVar4.getClass();
            j14 = eVar4.N;
            cVar4.getClass();
            int i36 = i27;
            p<? super p3.m, ? super Integer, Unit> pVar11 = pVar4;
            j15 = eVar4.P;
            i26 = i14 + i15 + i16 + i17;
            arrayList = new ArrayList();
            if (i26 > 0) {
                if (i14 > 0) {
                    jVar = null;
                    arrayList.add(new z72.l(dh.b.J(i14, i26), jB, null));
                } else {
                    jVar = null;
                }
                if (i15 > 0) {
                    arrayList.add(new z72.l(dh.b.J(i15, i26), j8, jVar));
                }
                if (i16 > 0) {
                    arrayList.add(new z72.l(dh.b.J(i16, i26), j14, jVar));
                }
                if (i17 > 0) {
                    arrayList.add(new z72.l(dh.b.J(i17, i26), j15, jVar));
                }
            } else {
                jVar = null;
                arrayList.add(new z72.l(1.0f, jC, null));
            }
            if (i26 > 0) {
                it = i53.a.j(arrayList).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = jVar;
                        break;
                    }
                    next = it.next();
                    if (((z72.l) next).f202960a == 100.0f) {
                        obj = next;
                        break;
                    }
                }
                if (obj != null) {
                    f18 = 0.0f;
                } else {
                    f18 = 3.0f;
                }
            } else {
                f18 = 0.0f;
            }
            o13.p pVar12 = new o13.p(i53.a.j(arrayList), Float.valueOf(f18));
            x1 x1Var8 = p3.n.f135158a;
            o0VarE = o0VarE;
            z72.k.c(rVar, (i53.f) pVar12.f128594a, null, null, f112, ((Number) pVar12.f128595b).floatValue(), z3.f.c(-2134976715, new ba2.i(pVar11, 7), o0VarE), o0VarE, (i36 & 14) | 12582912 | (i212 & 458752), 28);
            pVar3 = pVar11;
            f16 = f112;
        } else {
            o0VarE.e();
            pVar3 = pVar2;
            f16 = f15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: vr1.f
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    g.a(rVar, i14, i15, i16, i17, pVar3, f16, (p3.m) obj2, p0.t(i18 | 1), i19);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

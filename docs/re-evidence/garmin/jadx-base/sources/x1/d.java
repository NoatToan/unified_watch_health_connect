package x1;

import b5.s0;
import c2.q;
import c2.u;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final k kVar, final e23.a aVar, r rVar, final e23.l lVar, m mVar, final int i14) {
        int i15;
        o0 o0Var;
        final r rVar2;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(-195055274);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(kVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i16 = i15 | 384;
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            rVar2 = r.S;
            x1 x1Var = n.f135158a;
            k.a aVar2 = (k.a) kVar.f188365a.getF182175a();
            if (aVar2 instanceof k.a.b) {
                k.a.b bVar = (k.a.b) aVar2;
                boolean zB = o0VarE.B(bVar);
                Object objQ = o0VarE.q();
                if (zB) {
                    h hVar = new h(jg.b.N(bVar.f188367a), (p) null, 2, (p005kotlin.jvm.internal.j) null);
                    o0VarE.K(hVar);
                    objQ = hVar;
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        h hVar2 = new h(jg.b.N(bVar.f188367a), (p) null, 2, (p005kotlin.jvm.internal.j) null);
                        o0VarE.K(hVar2);
                        objQ = hVar2;
                    }
                }
                o0Var = o0VarE;
                l.d((h) objQ, aVar, rVar2, lVar, o0Var, i16 & 8176);
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new p() { // from class: x1.c
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i17) {
                            case 0:
                                ((Integer) obj2).getClass();
                                d.a(kVar, aVar, rVar2, lVar, (m) obj, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                d.a(kVar, aVar, rVar2, lVar, (m) obj, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        rVar2 = rVar;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            pVar = new p() { // from class: x1.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i18) {
                        case 0:
                            ((Integer) obj2).getClass();
                            d.a(kVar, aVar, rVar2, lVar, (m) obj, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            d.a(kVar, aVar, rVar2, lVar, (m) obj, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019c  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0143  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x018a  */
    /* JADX WARN: Code duplicated, block: B:98:0x018f  */
    public static final void b(k kVar, e23.a aVar, e23.l lVar, r rVar, boolean z14, e23.a aVar2, z3.e eVar, m mVar, int i14, int i15) {
        int i16;
        e23.a aVar3;
        e23.l lVar2;
        boolean z15;
        int i17;
        e23.a aVar4;
        int i18;
        int i19;
        boolean z16;
        r rVar2;
        boolean z17;
        e23.a aVar5;
        p2 p2VarI0;
        boolean z18;
        m.a aVar6;
        e23.a aVar7;
        r rVarB;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar8;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objQ;
        Object objQ2;
        int i24;
        o0 o0VarE = mVar.E(1195420540);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(kVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar3 = aVar;
            i16 |= o0VarE.r(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 384) == 0) {
            lVar2 = lVar;
            i16 |= o0VarE.r(lVar2) ? 256 : 128;
        } else {
            lVar2 = lVar;
        }
        int i25 = i16 | 3072;
        int i26 = i15 & 16;
        if (i26 == 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                i25 |= o0VarE.h(z15) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    aVar4 = aVar2;
                    if (o0VarE.r(aVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i25 |= i18;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(eVar)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i25 |= i24;
                }
                i19 = 0;
                if ((599187 & i25) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    rVar2 = r.S;
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    aVar6 = m.f135153a;
                    if (i17 != 0) {
                        objQ2 = o0VarE.q();
                        aVar6.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new b(i19);
                            o0VarE.K(objQ2);
                        }
                        aVar7 = (e23.a) objQ2;
                    } else {
                        aVar7 = aVar4;
                    }
                    x1 x1Var = n.f135158a;
                    if (z18) {
                        o0VarE.C(-1095188022);
                        if ((458752 & i25) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i25 & 14) == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z19 | z24;
                        objQ = o0VarE.q();
                        if (z25) {
                            objQ = new w02.b(25, aVar7, kVar);
                            o0VarE.K(objQ);
                        } else {
                            aVar6.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new w02.b(25, aVar7, kVar);
                                o0VarE.K(objQ);
                            }
                        }
                        rVarB = s0.b(rVar2, g.f188343a, new f((e23.l) objQ));
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1095031162);
                        o0VarE.g0(false);
                        rVarB = rVar2;
                    }
                    h4.d.f81522a.getClass();
                    z0VarD = q.d(h4.d.a.f81524b, true);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB, o0VarE);
                    h5.g.V.getClass();
                    aVar8 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar8);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, o0VarE);
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    u uVar = u.f22885a;
                    eVar.invoke(o0VarE, Integer.valueOf((i25 >> 18) & 14));
                    a(kVar, aVar3, null, lVar2, o0VarE, (i25 & 126) | ((i25 << 3) & 7168));
                    o0VarE.g0(true);
                    z17 = z18;
                    aVar5 = aVar7;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    z17 = z15;
                    aVar5 = aVar4;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(kVar, aVar, lVar, rVar2, z17, aVar5, eVar, i14, i15);
                }
            }
            i25 |= 196608;
            aVar4 = aVar2;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(eVar)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i25 |= i24;
            }
            i19 = 0;
            if ((599187 & i25) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                rVar2 = r.S;
                if (i26 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                aVar6 = m.f135153a;
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar6.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new b(i19);
                        o0VarE.K(objQ2);
                    }
                    aVar7 = (e23.a) objQ2;
                } else {
                    aVar7 = aVar4;
                }
                x1 x1Var2 = n.f135158a;
                if (z18) {
                    o0VarE.C(-1095188022);
                    if ((458752 & i25) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if ((i25 & 14) == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z19 | z24;
                    objQ = o0VarE.q();
                    if (z25) {
                        aVar6.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new w02.b(25, aVar7, kVar);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new w02.b(25, aVar7, kVar);
                        o0VarE.K(objQ);
                    }
                    rVarB = s0.b(rVar2, g.f188343a, new f((e23.l) objQ));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1095031162);
                    o0VarE.g0(false);
                    rVarB = rVar2;
                }
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, true);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                aVar8 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar2 = u.f22885a;
                eVar.invoke(o0VarE, Integer.valueOf((i25 >> 18) & 14));
                a(kVar, aVar3, null, lVar2, o0VarE, (i25 & 126) | ((i25 << 3) & 7168));
                o0VarE.g0(true);
                z17 = z18;
                aVar5 = aVar7;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                z17 = z15;
                aVar5 = aVar4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(kVar, aVar, lVar, rVar2, z17, aVar5, eVar, i14, i15);
            }
        }
        i25 = i16 | 27648;
        z15 = z14;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                aVar4 = aVar2;
                if (o0VarE.r(aVar4)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i25 |= i18;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(eVar)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i25 |= i24;
            }
            i19 = 0;
            if ((599187 & i25) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                rVar2 = r.S;
                if (i26 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                aVar6 = m.f135153a;
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar6.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new b(i19);
                        o0VarE.K(objQ2);
                    }
                    aVar7 = (e23.a) objQ2;
                } else {
                    aVar7 = aVar4;
                }
                x1 x1Var3 = n.f135158a;
                if (z18) {
                    o0VarE.C(-1095188022);
                    if ((458752 & i25) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if ((i25 & 14) == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z19 | z24;
                    objQ = o0VarE.q();
                    if (z25) {
                        aVar6.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new w02.b(25, aVar7, kVar);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new w02.b(25, aVar7, kVar);
                        o0VarE.K(objQ);
                    }
                    rVarB = s0.b(rVar2, g.f188343a, new f((e23.l) objQ));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1095031162);
                    o0VarE.g0(false);
                    rVarB = rVar2;
                }
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, true);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                aVar8 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar3 = u.f22885a;
                eVar.invoke(o0VarE, Integer.valueOf((i25 >> 18) & 14));
                a(kVar, aVar3, null, lVar2, o0VarE, (i25 & 126) | ((i25 << 3) & 7168));
                o0VarE.g0(true);
                z17 = z18;
                aVar5 = aVar7;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                z17 = z15;
                aVar5 = aVar4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(kVar, aVar, lVar, rVar2, z17, aVar5, eVar, i14, i15);
            }
        }
        i25 |= 196608;
        aVar4 = aVar2;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(eVar)) {
                i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i24 = 524288;
            }
            i25 |= i24;
        }
        i19 = 0;
        if ((599187 & i25) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i25 & 1, z16)) {
            rVar2 = r.S;
            if (i26 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            aVar6 = m.f135153a;
            if (i17 != 0) {
                objQ2 = o0VarE.q();
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new b(i19);
                    o0VarE.K(objQ2);
                }
                aVar7 = (e23.a) objQ2;
            } else {
                aVar7 = aVar4;
            }
            x1 x1Var4 = n.f135158a;
            if (z18) {
                o0VarE.C(-1095188022);
                if ((458752 & i25) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((i25 & 14) == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z19 | z24;
                objQ = o0VarE.q();
                if (z25) {
                    aVar6.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new w02.b(25, aVar7, kVar);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new w02.b(25, aVar7, kVar);
                    o0VarE.K(objQ);
                }
                rVarB = s0.b(rVar2, g.f188343a, new f((e23.l) objQ));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1095031162);
                o0VarE.g0(false);
                rVarB = rVar2;
            }
            h4.d.f81522a.getClass();
            z0VarD = q.d(h4.d.a.f81524b, true);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            aVar8 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar4 = u.f22885a;
            eVar.invoke(o0VarE, Integer.valueOf((i25 >> 18) & 14));
            a(kVar, aVar3, null, lVar2, o0VarE, (i25 & 126) | ((i25 << 3) & 7168));
            o0VarE.g0(true);
            z17 = z18;
            aVar5 = aVar7;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            z17 = z15;
            aVar5 = aVar4;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(kVar, aVar, lVar, rVar2, z17, aVar5, eVar, i14, i15);
        }
    }
}

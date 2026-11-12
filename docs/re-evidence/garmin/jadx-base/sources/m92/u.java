package m92;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o4.f1;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:101:0x0165  */
    /* JADX WARN: Code duplicated, block: B:104:0x016f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0172  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x010b A[LOOP:0: B:81:0x0105->B:83:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x0150  */
    /* JADX WARN: Code duplicated, block: B:95:0x0153  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    @o13.e
    public static final void a(final h4.r rVar, final i53.c cVar, Float f14, boolean z14, Float f15, Float f16, float f17, final String str, p3.m mVar, final int i14, final int i15) {
        int i16;
        Float f18;
        int i17;
        boolean z15;
        int i18;
        int i19;
        Float f19;
        int i24;
        int i25;
        Float f22;
        int i26;
        int i27;
        int i28;
        boolean z16;
        p3.o0 o0Var;
        final float f24;
        final Float f25;
        final boolean z17;
        final Float f26;
        final Float f27;
        p2 p2VarI0;
        final Float f28;
        final boolean z18;
        final Float f29;
        final Float f34;
        float f35;
        final ArrayList arrayList;
        Iterator<E> it;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objQ;
        final float f36;
        cVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(2009514651);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i29 = i16 | 48 | (o0VarE.B(cVar) ? 256 : 128);
        int i30 = i15 & 8;
        if (i30 == 0) {
            if ((i14 & 3072) == 0) {
                f18 = f14;
                i29 |= o0VarE.B(f18) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i29 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    if ((196608 & i14) == 0) {
                        f19 = f15;
                        if (o0VarE.B(f19)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i29 |= i24;
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i29 |= 1572864;
                        f22 = f16;
                    } else {
                        f22 = f16;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarE.B(f22)) {
                                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i26 = 524288;
                            }
                            i29 |= i26;
                        }
                    }
                    int i34 = i29 | 12582912;
                    if (o0VarE.B(str)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i28 = i34 | i27 | C.ENCODING_PCM_32BIT;
                    if ((i28 & 306783379) == 306783378) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (o0VarE.n(i28 & 1, z16)) {
                        if (i30 != 0) {
                            f28 = null;
                        } else {
                            f28 = f18;
                        }
                        if (i17 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i19 != 0) {
                            f29 = null;
                        } else {
                            f29 = f19;
                        }
                        if (i25 != 0) {
                            f34 = null;
                        } else {
                            f34 = f22;
                        }
                        f35 = 0;
                        g6.f.a aVar = g6.f.f75994b;
                        x1 x1Var = p3.n.f135158a;
                        arrayList = new ArrayList(p13.y.r(cVar, 10));
                        it = cVar.iterator();
                        while (it.hasNext()) {
                            h0.e.c cVar2 = (h0.e.c) it.next();
                            cVar2.getClass();
                            arrayList.add(new e(cVar2, 0.0f, 0.0f, 0.0f, 0.0f));
                        }
                        boolean zIsEmpty = cVar.isEmpty();
                        boolean zR = o0VarE.r(arrayList);
                        if ((i28 & 7168) == 2048) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z27 = zR | z19;
                        if ((57344 & i28) == 16384) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z28 = z27 | z24;
                        if ((458752 & i28) == 131072) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = ((3670016 & i28) == 1048576) | z28 | z25;
                        objQ = o0VarE.q();
                        if (z26) {
                            f36 = f35;
                            objQ = new e23.l() { // from class: m92.s
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                                }
                            };
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                f36 = f35;
                                objQ = new e23.l() { // from class: m92.s
                                    @Override // e23.l
                                    public final Object invoke(Object obj) {
                                        q4.f fVar = (q4.f) obj;
                                        fVar.getClass();
                                        return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                                    }
                                };
                                o0VarE.K(objQ);
                            } else {
                                f36 = f35;
                            }
                        }
                        o0Var = o0VarE;
                        l.b(rVar, null, null, str, zIsEmpty, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
                        x1 x1Var2 = p3.n.f135158a;
                        f25 = f28;
                        z17 = z18;
                        f26 = f29;
                        f27 = f34;
                        f24 = f36;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        f24 = f17;
                        f25 = f18;
                        z17 = z15;
                        f26 = f19;
                        f27 = f22;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: m92.t
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i29 |= 196608;
                f19 = f15;
                i25 = i15 & 64;
                if (i25 != 0) {
                    i29 |= 1572864;
                    f22 = f16;
                } else {
                    f22 = f16;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(f22)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i29 |= i26;
                    }
                }
                int i35 = i29 | 12582912;
                if (o0VarE.B(str)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i28 = i35 | i27 | C.ENCODING_PCM_32BIT;
                if ((i28 & 306783379) == 306783378) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i28 & 1, z16)) {
                    if (i30 != 0) {
                        f28 = null;
                    } else {
                        f28 = f18;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        f29 = null;
                    } else {
                        f29 = f19;
                    }
                    if (i25 != 0) {
                        f34 = null;
                    } else {
                        f34 = f22;
                    }
                    f35 = 0;
                    g6.f.a aVar2 = g6.f.f75994b;
                    x1 x1Var3 = p3.n.f135158a;
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    it = cVar.iterator();
                    while (it.hasNext()) {
                        h0.e.c cVar3 = (h0.e.c) it.next();
                        cVar3.getClass();
                        arrayList.add(new e(cVar3, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    boolean zIsEmpty2 = cVar.isEmpty();
                    boolean zR2 = o0VarE.r(arrayList);
                    if ((i28 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z29 = zR2 | z19;
                    if ((57344 & i28) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z210 = z29 | z24;
                    if ((458752 & i28) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = ((3670016 & i28) == 1048576) | z210 | z25;
                    objQ = o0VarE.q();
                    if (z26) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            f36 = f35;
                            objQ = new e23.l() { // from class: m92.s
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                                }
                            };
                            o0VarE.K(objQ);
                        } else {
                            f36 = f35;
                        }
                    } else {
                        f36 = f35;
                        objQ = new e23.l() { // from class: m92.s
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                            }
                        };
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    l.b(rVar, null, null, str, zIsEmpty2, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
                    x1 x1Var4 = p3.n.f135158a;
                    f25 = f28;
                    z17 = z18;
                    f26 = f29;
                    f27 = f34;
                    f24 = f36;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f24 = f17;
                    f25 = f18;
                    z17 = z15;
                    f26 = f19;
                    f27 = f22;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.t
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i29 |= 24576;
            z15 = z14;
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    f19 = f15;
                    if (o0VarE.B(f19)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i29 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i29 |= 1572864;
                    f22 = f16;
                } else {
                    f22 = f16;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(f22)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i29 |= i26;
                    }
                }
                int i36 = i29 | 12582912;
                if (o0VarE.B(str)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i28 = i36 | i27 | C.ENCODING_PCM_32BIT;
                if ((i28 & 306783379) == 306783378) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i28 & 1, z16)) {
                    if (i30 != 0) {
                        f28 = null;
                    } else {
                        f28 = f18;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        f29 = null;
                    } else {
                        f29 = f19;
                    }
                    if (i25 != 0) {
                        f34 = null;
                    } else {
                        f34 = f22;
                    }
                    f35 = 0;
                    g6.f.a aVar3 = g6.f.f75994b;
                    x1 x1Var5 = p3.n.f135158a;
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    it = cVar.iterator();
                    while (it.hasNext()) {
                        h0.e.c cVar4 = (h0.e.c) it.next();
                        cVar4.getClass();
                        arrayList.add(new e(cVar4, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    boolean zIsEmpty3 = cVar.isEmpty();
                    boolean zR3 = o0VarE.r(arrayList);
                    if ((i28 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z211 = zR3 | z19;
                    if ((57344 & i28) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z212 = z211 | z24;
                    if ((458752 & i28) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = ((3670016 & i28) == 1048576) | z212 | z25;
                    objQ = o0VarE.q();
                    if (z26) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            f36 = f35;
                            objQ = new e23.l() { // from class: m92.s
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                                }
                            };
                            o0VarE.K(objQ);
                        } else {
                            f36 = f35;
                        }
                    } else {
                        f36 = f35;
                        objQ = new e23.l() { // from class: m92.s
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                            }
                        };
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    l.b(rVar, null, null, str, zIsEmpty3, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
                    x1 x1Var6 = p3.n.f135158a;
                    f25 = f28;
                    z17 = z18;
                    f26 = f29;
                    f27 = f34;
                    f24 = f36;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f24 = f17;
                    f25 = f18;
                    z17 = z15;
                    f26 = f19;
                    f27 = f22;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.t
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i29 |= 196608;
            f19 = f15;
            i25 = i15 & 64;
            if (i25 != 0) {
                i29 |= 1572864;
                f22 = f16;
            } else {
                f22 = f16;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(f22)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i29 |= i26;
                }
            }
            int i37 = i29 | 12582912;
            if (o0VarE.B(str)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i28 = i37 | i27 | C.ENCODING_PCM_32BIT;
            if ((i28 & 306783379) == 306783378) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i28 & 1, z16)) {
                if (i30 != 0) {
                    f28 = null;
                } else {
                    f28 = f18;
                }
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i19 != 0) {
                    f29 = null;
                } else {
                    f29 = f19;
                }
                if (i25 != 0) {
                    f34 = null;
                } else {
                    f34 = f22;
                }
                f35 = 0;
                g6.f.a aVar4 = g6.f.f75994b;
                x1 x1Var7 = p3.n.f135158a;
                arrayList = new ArrayList(p13.y.r(cVar, 10));
                it = cVar.iterator();
                while (it.hasNext()) {
                    h0.e.c cVar5 = (h0.e.c) it.next();
                    cVar5.getClass();
                    arrayList.add(new e(cVar5, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                boolean zIsEmpty4 = cVar.isEmpty();
                boolean zR4 = o0VarE.r(arrayList);
                if ((i28 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z213 = zR4 | z19;
                if ((57344 & i28) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z214 = z213 | z24;
                if ((458752 & i28) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = ((3670016 & i28) == 1048576) | z214 | z25;
                objQ = o0VarE.q();
                if (z26) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        f36 = f35;
                        objQ = new e23.l() { // from class: m92.s
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        f36 = f35;
                    }
                } else {
                    f36 = f35;
                    objQ = new e23.l() { // from class: m92.s
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                        }
                    };
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                l.b(rVar, null, null, str, zIsEmpty4, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
                x1 x1Var8 = p3.n.f135158a;
                f25 = f28;
                z17 = z18;
                f26 = f29;
                f27 = f34;
                f24 = f36;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f24 = f17;
                f25 = f18;
                z17 = z15;
                f26 = f19;
                f27 = f22;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.t
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i29 |= 3072;
        f18 = f14;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i29 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    f19 = f15;
                    if (o0VarE.B(f19)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i29 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i29 |= 1572864;
                    f22 = f16;
                } else {
                    f22 = f16;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.B(f22)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i29 |= i26;
                    }
                }
                int i38 = i29 | 12582912;
                if (o0VarE.B(str)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i28 = i38 | i27 | C.ENCODING_PCM_32BIT;
                if ((i28 & 306783379) == 306783378) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (o0VarE.n(i28 & 1, z16)) {
                    if (i30 != 0) {
                        f28 = null;
                    } else {
                        f28 = f18;
                    }
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i19 != 0) {
                        f29 = null;
                    } else {
                        f29 = f19;
                    }
                    if (i25 != 0) {
                        f34 = null;
                    } else {
                        f34 = f22;
                    }
                    f35 = 0;
                    g6.f.a aVar5 = g6.f.f75994b;
                    x1 x1Var9 = p3.n.f135158a;
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    it = cVar.iterator();
                    while (it.hasNext()) {
                        h0.e.c cVar6 = (h0.e.c) it.next();
                        cVar6.getClass();
                        arrayList.add(new e(cVar6, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    boolean zIsEmpty5 = cVar.isEmpty();
                    boolean zR5 = o0VarE.r(arrayList);
                    if ((i28 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z215 = zR5 | z19;
                    if ((57344 & i28) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z216 = z215 | z24;
                    if ((458752 & i28) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = ((3670016 & i28) == 1048576) | z216 | z25;
                    objQ = o0VarE.q();
                    if (z26) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            f36 = f35;
                            objQ = new e23.l() { // from class: m92.s
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    q4.f fVar = (q4.f) obj;
                                    fVar.getClass();
                                    return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                                }
                            };
                            o0VarE.K(objQ);
                        } else {
                            f36 = f35;
                        }
                    } else {
                        f36 = f35;
                        objQ = new e23.l() { // from class: m92.s
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                            }
                        };
                        o0VarE.K(objQ);
                    }
                    o0Var = o0VarE;
                    l.b(rVar, null, null, str, zIsEmpty5, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
                    x1 x1Var10 = p3.n.f135158a;
                    f25 = f28;
                    z17 = z18;
                    f26 = f29;
                    f27 = f34;
                    f24 = f36;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    f24 = f17;
                    f25 = f18;
                    z17 = z15;
                    f26 = f19;
                    f27 = f22;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: m92.t
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i29 |= 196608;
            f19 = f15;
            i25 = i15 & 64;
            if (i25 != 0) {
                i29 |= 1572864;
                f22 = f16;
            } else {
                f22 = f16;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(f22)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i29 |= i26;
                }
            }
            int i39 = i29 | 12582912;
            if (o0VarE.B(str)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i28 = i39 | i27 | C.ENCODING_PCM_32BIT;
            if ((i28 & 306783379) == 306783378) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i28 & 1, z16)) {
                if (i30 != 0) {
                    f28 = null;
                } else {
                    f28 = f18;
                }
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i19 != 0) {
                    f29 = null;
                } else {
                    f29 = f19;
                }
                if (i25 != 0) {
                    f34 = null;
                } else {
                    f34 = f22;
                }
                f35 = 0;
                g6.f.a aVar6 = g6.f.f75994b;
                x1 x1Var11 = p3.n.f135158a;
                arrayList = new ArrayList(p13.y.r(cVar, 10));
                it = cVar.iterator();
                while (it.hasNext()) {
                    h0.e.c cVar7 = (h0.e.c) it.next();
                    cVar7.getClass();
                    arrayList.add(new e(cVar7, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                boolean zIsEmpty6 = cVar.isEmpty();
                boolean zR6 = o0VarE.r(arrayList);
                if ((i28 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z217 = zR6 | z19;
                if ((57344 & i28) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z218 = z217 | z24;
                if ((458752 & i28) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = ((3670016 & i28) == 1048576) | z218 | z25;
                objQ = o0VarE.q();
                if (z26) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        f36 = f35;
                        objQ = new e23.l() { // from class: m92.s
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        f36 = f35;
                    }
                } else {
                    f36 = f35;
                    objQ = new e23.l() { // from class: m92.s
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                        }
                    };
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                l.b(rVar, null, null, str, zIsEmpty6, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
                x1 x1Var12 = p3.n.f135158a;
                f25 = f28;
                z17 = z18;
                f26 = f29;
                f27 = f34;
                f24 = f36;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f24 = f17;
                f25 = f18;
                z17 = z15;
                f26 = f19;
                f27 = f22;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.t
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i29 |= 24576;
        z15 = z14;
        i19 = i15 & 32;
        if (i19 != 0) {
            if ((196608 & i14) == 0) {
                f19 = f15;
                if (o0VarE.B(f19)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i29 |= i24;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i29 |= 1572864;
                f22 = f16;
            } else {
                f22 = f16;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.B(f22)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i29 |= i26;
                }
            }
            int i310 = i29 | 12582912;
            if (o0VarE.B(str)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i28 = i310 | i27 | C.ENCODING_PCM_32BIT;
            if ((i28 & 306783379) == 306783378) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (o0VarE.n(i28 & 1, z16)) {
                if (i30 != 0) {
                    f28 = null;
                } else {
                    f28 = f18;
                }
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i19 != 0) {
                    f29 = null;
                } else {
                    f29 = f19;
                }
                if (i25 != 0) {
                    f34 = null;
                } else {
                    f34 = f22;
                }
                f35 = 0;
                g6.f.a aVar7 = g6.f.f75994b;
                x1 x1Var13 = p3.n.f135158a;
                arrayList = new ArrayList(p13.y.r(cVar, 10));
                it = cVar.iterator();
                while (it.hasNext()) {
                    h0.e.c cVar8 = (h0.e.c) it.next();
                    cVar8.getClass();
                    arrayList.add(new e(cVar8, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                boolean zIsEmpty7 = cVar.isEmpty();
                boolean zR7 = o0VarE.r(arrayList);
                if ((i28 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z219 = zR7 | z19;
                if ((57344 & i28) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z2110 = z219 | z24;
                if ((458752 & i28) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = ((3670016 & i28) == 1048576) | z2110 | z25;
                objQ = o0VarE.q();
                if (z26) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        f36 = f35;
                        objQ = new e23.l() { // from class: m92.s
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                q4.f fVar = (q4.f) obj;
                                fVar.getClass();
                                return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        f36 = f35;
                    }
                } else {
                    f36 = f35;
                    objQ = new e23.l() { // from class: m92.s
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                        }
                    };
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                l.b(rVar, null, null, str, zIsEmpty7, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
                x1 x1Var14 = p3.n.f135158a;
                f25 = f28;
                z17 = z18;
                f26 = f29;
                f27 = f34;
                f24 = f36;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                f24 = f17;
                f25 = f18;
                z17 = z15;
                f26 = f19;
                f27 = f22;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: m92.t
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i29 |= 196608;
        f19 = f15;
        i25 = i15 & 64;
        if (i25 != 0) {
            i29 |= 1572864;
            f22 = f16;
        } else {
            f22 = f16;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.B(f22)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i29 |= i26;
            }
        }
        int i311 = i29 | 12582912;
        if (o0VarE.B(str)) {
            i27 = 67108864;
        } else {
            i27 = 33554432;
        }
        i28 = i311 | i27 | C.ENCODING_PCM_32BIT;
        if ((i28 & 306783379) == 306783378) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i28 & 1, z16)) {
            if (i30 != 0) {
                f28 = null;
            } else {
                f28 = f18;
            }
            if (i17 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i19 != 0) {
                f29 = null;
            } else {
                f29 = f19;
            }
            if (i25 != 0) {
                f34 = null;
            } else {
                f34 = f22;
            }
            f35 = 0;
            g6.f.a aVar8 = g6.f.f75994b;
            x1 x1Var15 = p3.n.f135158a;
            arrayList = new ArrayList(p13.y.r(cVar, 10));
            it = cVar.iterator();
            while (it.hasNext()) {
                h0.e.c cVar9 = (h0.e.c) it.next();
                cVar9.getClass();
                arrayList.add(new e(cVar9, 0.0f, 0.0f, 0.0f, 0.0f));
            }
            boolean zIsEmpty8 = cVar.isEmpty();
            boolean zR8 = o0VarE.r(arrayList);
            if ((i28 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z2111 = zR8 | z19;
            if ((57344 & i28) == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z2112 = z2111 | z24;
            if ((458752 & i28) == 131072) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = ((3670016 & i28) == 1048576) | z2112 | z25;
            objQ = o0VarE.q();
            if (z26) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    f36 = f35;
                    objQ = new e23.l() { // from class: m92.s
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            q4.f fVar = (q4.f) obj;
                            fVar.getClass();
                            return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    f36 = f35;
                }
            } else {
                f36 = f35;
                objQ = new e23.l() { // from class: m92.s
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        q4.f fVar = (q4.f) obj;
                        fVar.getClass();
                        return u.f(fVar, arrayList, f28, z18, f29, f34, f36);
                    }
                };
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            l.b(rVar, null, null, str, zIsEmpty8, 0.0f, null, null, null, (e23.l) objQ, o0Var, ((i28 >> 15) & 7168) | (i28 & 126) | 384 | 918552576, 96);
            x1 x1Var16 = p3.n.f135158a;
            f25 = f28;
            z17 = z18;
            f26 = f29;
            f27 = f34;
            f24 = f36;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f24 = f17;
            f25 = f18;
            z17 = z15;
            f26 = f19;
            f27 = f22;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: m92.t
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u.a(rVar, cVar, f25, z17, f26, f27, f24, str, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    @o13.e
    public static final void b(h4.r rVar, i53.c cVar, float f14, String str, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        int i17;
        p3.o0 o0Var;
        cVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(2009514651);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(null) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(null) ? 2048 : 1024;
        }
        int i18 = i16 | 1794048;
        if ((12582912 & i14) == 0) {
            i18 |= o0VarE.i(f14) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i18 |= o0VarE.B(str) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i18 |= o0VarE.B(null) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? o0VarE.B(null) : o0VarE.r(null) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(null) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(null) ? 256 : 128;
        }
        int i19 = 1;
        if (o0VarE.n(i18 & 1, ((306783379 & i18) == 306783378 && (i17 & 147) == 146) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            boolean zIsEmpty = cVar.isEmpty();
            boolean z14 = ((i18 & 896) == 256) | ((i18 & 7168) == 2048) | ((57344 & i18) == 16384) | ((458752 & i18) == 131072) | ((3670016 & i18) == 1048576) | ((i18 & 29360128) == 8388608);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new l02.l(cVar, f14, i19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l02.l(cVar, f14, i19);
                    o0VarE.K(objQ);
                }
            }
            int i24 = i17 << 21;
            o0Var = o0VarE;
            l.b(rVar2, null, null, str, zIsEmpty, 0.0f, null, null, null, (e23.l) objQ, o0Var, (i18 & 126) | ((i18 >> 21) & 896) | ((i18 >> 15) & 7168) | (i24 & 29360128) | (234881024 & i24) | (i24 & 1879048192), 96);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b12.c(rVar, cVar, f14, str, i14, i15);
        }
    }

    @o13.e
    public static final void c(h4.r rVar, i53.c cVar, float f14, String str, p3.m mVar, int i14) {
        cVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1000178997);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 48 | (o0VarE.B(cVar) ? 256 : 128) | 3072 | (o0VarE.i(f14) ? 16384 : 8192) | (o0VarE.B(str) ? 131072 : 65536) | 920125440;
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 8190;
            int i17 = i15 << 9;
            b(rVar, cVar, f14, str, o0VarE, (i17 & 234881024) | i16 | (29360128 & i17) | C.ENCODING_PCM_32BIT, 438);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hz0.w(rVar, cVar, f14, str, i14, 2);
        }
    }

    public static i53.g d(q4.f fVar, List list, Float f14, Float f15, Float f16, int i14) {
        Float f17 = (i14 & 2) != 0 ? null : f14;
        boolean z14 = (i14 & 4) == 0;
        float f18 = 0;
        g6.f.a aVar = g6.f.f75994b;
        fVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return i53.a.c();
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h0.e.c cVar = (h0.e.c) it.next();
            cVar.getClass();
            arrayList.add(new e(cVar, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        return f(fVar, arrayList, f17, z14, f15, f16, f18);
    }

    public static final void e(q4.f fVar, long j8, long j14, long j15, float f14, float f15, float f16, float f17) {
        fVar.getClass();
        o4.j jVarA = o4.m.a();
        n4.d dVarG = g8.i.g(j14, j15);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
        n4.a.C2318a c2318a = n4.a.f123535b;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
        jVarA.k(n4.f.a(dVarG, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), jFloatToRawIntBits2, jFloatToRawIntBits), f1.b.CounterClockwise);
        q4.f.L(fVar, jVarA, j8, 0.0f, null, 60);
    }

    public static final i53.g<Float, Float> f(q4.f fVar, List<e> list, Float f14, boolean z14, Float f15, Float f16, float f17) {
        float f18;
        float fFloatValue;
        float fE;
        fVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return i53.a.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q4.f fVar2 = fVar;
        float fS0 = fVar2.s0(f17);
        float f19 = 0.0f;
        if (f14 == null) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            float fB = i0.b(((e) it.next()).f117288a);
            while (it.hasNext()) {
                fB = Math.min(fB, i0.b(((e) it.next()).f117288a));
            }
            f18 = fB;
        } else {
            f18 = 0.0f;
        }
        if (f14 != null) {
            fFloatValue = f14.floatValue();
        } else {
            Iterator<T> it3 = list.iterator();
            if (!it3.hasNext()) {
                c22.t.g();
                return null;
            }
            float fB2 = i0.b(((e) it3.next()).f117288a);
            while (it3.hasNext()) {
                fB2 = Math.max(fB2, i0.b(((e) it3.next()).f117288a));
            }
            fFloatValue = fB2;
        }
        float fFloatValue2 = f15 != null ? f15.floatValue() : 0.0f;
        if (f16 != null) {
            fE = f16.floatValue();
        } else {
            Iterator<T> it4 = list.iterator();
            if (!it4.hasNext()) {
                c22.t.g();
                return null;
            }
            fE = i0.e(((e) it4.next()).f117288a);
            while (it4.hasNext()) {
                fE = Math.max(fE, i0.e(((e) it4.next()).f117288a));
            }
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar2.b() >> 32)) / (f14 != null ? (int) f14.floatValue() : list.size());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar2.b() >> 32)) - ((list.size() - 1) * fS0);
        float f22 = 0.0f;
        float f24 = 0.0f;
        for (e eVar : list) {
            h0.e.c cVar = eVar.f117288a;
            float fH = i0.h(i0.b(cVar), f18, fFloatValue, f19, Float.intBitsToFloat((int) (fVar2.b() >> 32)));
            float fE2 = i0.e(cVar);
            Float f25 = cVar.f117352c;
            float f26 = f18;
            float fH2 = i0.h(fE2, fFloatValue2, fE, Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)), 0.0f);
            float fIntBitsToFloat3 = z14 ? fH2 : Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)) - fH2;
            float f27 = z14 ? 0.0f : fH2;
            float fFloatValue3 = f25 != null ? f25.floatValue() * fIntBitsToFloat2 : fIntBitsToFloat;
            if (f25 != null && fH > 0.0f) {
                fH = f14 == null ? f22 + f24 : fH + (i0.b(cVar) * fS0);
            }
            float f28 = fH;
            linkedHashMap.put(Float.valueOf(f28), Float.valueOf(i0.b(cVar)));
            long j8 = cVar.f117351b;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f28)) << 32) | (((long) Float.floatToRawIntBits(f27)) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue3)) << 32);
            n4.g.a aVar2 = n4.g.f123559b;
            fVar2 = fVar;
            e(fVar2, j8, jFloatToRawIntBits, jFloatToRawIntBits2, eVar.f117291d, eVar.f117292e, eVar.f117289b, eVar.f117290c);
            f22 = f28 + fS0;
            fFloatValue2 = fFloatValue2;
            linkedHashMap = linkedHashMap2;
            f24 = fFloatValue3;
            f19 = 0.0f;
            fE = fE;
            f18 = f26;
        }
        return i53.a.k(linkedHashMap);
    }

    public static e g(h0.e.c cVar, float f14, float f15, float f16, float f17, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0.0f;
        }
        if ((i14 & 2) != 0) {
            f15 = 0.0f;
        }
        if ((i14 & 4) != 0) {
            f16 = 0.0f;
        }
        if ((i14 & 8) != 0) {
            f17 = 0.0f;
        }
        cVar.getClass();
        return new e(cVar, f16, f17, f14, f15);
    }

    public static final i53.c h(float f14, List list) {
        e eVar;
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            h0.e.c cVar = (h0.e.c) obj;
            if (i14 == 0 && list.size() == 1) {
                cVar.getClass();
                eVar = new e(cVar, f14, f14, f14, f14);
            } else {
                float f15 = f14;
                if (i14 == 0) {
                    eVar = g(cVar, f15, 0.0f, f15, 0.0f, 10);
                    f14 = f15;
                } else if (i14 == list.size() - 1) {
                    eVar = g(cVar, 0.0f, f15, 0.0f, f15, 5);
                    f14 = f15;
                } else {
                    f14 = f15;
                    cVar.getClass();
                    eVar = new e(cVar, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            arrayList.add(eVar);
            i14 = i15;
        }
        return i53.a.e(arrayList);
    }
}

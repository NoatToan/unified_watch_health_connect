package j02;

import am.j1;
import c2.l2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.f2;
import kotlin.t1;
import lc.u0;
import o4.s0;
import o4.t0;
import p005kotlin.Unit;
import p008y1.b2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96043a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96043a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01da  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:121:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x023f  */
    /* JADX WARN: Code duplicated, block: B:126:0x024d  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130  */
    /* JADX WARN: Code duplicated, block: B:80:0x0145  */
    /* JADX WARN: Code duplicated, block: B:82:0x014e  */
    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    /* JADX WARN: Code duplicated, block: B:85:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0168  */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ac  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e2.d dVar, final h0 h0Var, Object obj, h4.r rVar, boolean z14, h4.r rVar2, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        z3.e eVar2;
        boolean z16;
        h4.r rVar3;
        boolean z17;
        h4.r rVar4;
        p2 p2VarI0;
        h4.r rVar5;
        int i17;
        h4.r rVarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        x3 x3Var;
        p3.d0 d0VarF;
        h4.r rVarThen;
        h4.r.a aVar;
        int i18;
        boolean z18;
        Object objQ2;
        h4.r rVarA;
        boolean z19;
        boolean z24;
        Object objQ3;
        h4.r.a aVar2;
        int i19;
        boolean z25;
        Object objQ4;
        boolean z26;
        h4.r rVarA2;
        boolean z27;
        Object objQ5;
        int i24;
        dVar.getClass();
        h0Var.getClass();
        obj.getClass();
        o0 o0VarE = mVar.E(599997811);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(h0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(obj) ? 256 : 128;
        }
        int i25 = i16 | 3072;
        int i26 = i15 & 8;
        if (i26 == 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                i25 |= o0VarE.h(z15) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                i25 |= 65536;
            }
            if ((1572864 & i14) == 0) {
                eVar2 = eVar;
                if (o0VarE.r(eVar2)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i25 |= i24;
            } else {
                eVar2 = eVar;
            }
            if ((599187 & i25) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    rVar5 = h4.r.S;
                    if (i26 != 0) {
                        z15 = true;
                    }
                    i17 = i25 & (-458753);
                    rVarC = e2.d.c(dVar, rVar5);
                } else {
                    o0VarE.e();
                    i17 = i25 & (-458753);
                    rVar5 = rVar;
                    rVarC = rVar2;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.f(new f2(h0Var, 14));
                    o0VarE.K(objQ);
                }
                x3Var = (x3) objQ;
                d0VarF = p0.f(new i91.c(19, obj, h0Var));
                if (((Boolean) d0VarF.getF182175a()).booleanValue()) {
                    o0VarE.C(-1118625079);
                    aVar2 = h4.r.S;
                    h4.r rVarB = h4.p.b(aVar2, 1.0f);
                    i19 = a.f96043a[((b2) x3Var.getF182175a()).ordinal()];
                    if (i19 != 1) {
                        o0VarE.C(1072298490);
                        if ((i17 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objQ4 = o0VarE.q();
                        if (!z25 || objQ4 == c2565a) {
                            z26 = false;
                            final Object[] objArr = 0 == true ? 1 : 0;
                            objQ4 = new e23.l() { // from class: j02.c0
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    t0 t0Var = (t0) obj2;
                                    switch (objArr) {
                                        case 0:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                            break;
                                        case 1:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                            break;
                                        case 2:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                            break;
                                        default:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ4);
                        } else {
                            z26 = false;
                        }
                        rVarA2 = s0.a(aVar2, (e23.l) objQ4);
                        o0VarE.g0(z26);
                    } else {
                        if (i19 == 2) {
                            throw kg.f.h(o0VarE, 1072296374, false);
                        }
                        o0VarE.C(1072303610);
                        if ((i17 & 112) == 32) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objQ5 = o0VarE.q();
                        if (z27 || objQ5 == c2565a) {
                            final int i27 = 1;
                            objQ5 = new e23.l() { // from class: j02.c0
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    t0 t0Var = (t0) obj2;
                                    switch (i27) {
                                        case 0:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                            break;
                                        case 1:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                            break;
                                        case 2:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                            break;
                                        default:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ5);
                        }
                        rVarA2 = s0.a(aVar2, (e23.l) objQ5);
                        o0VarE.g0(false);
                        z26 = false;
                    }
                    rVarThen = rVarB.then(rVarA2);
                    o0VarE.g0(z26);
                } else if (obj.equals(h0Var.f96144s.getF182175a())) {
                    o0VarE.C(-1118126227);
                    aVar = h4.r.S;
                    h4.r rVarB2 = h4.p.b(aVar, 1.0f);
                    i18 = a.f96043a[((b2) x3Var.getF182175a()).ordinal()];
                    if (i18 != 1) {
                        o0VarE.C(1072314568);
                        if ((i17 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objQ2 = o0VarE.q();
                        if (z18 || objQ2 == c2565a) {
                            final int i28 = 2;
                            objQ2 = new e23.l() { // from class: j02.c0
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    t0 t0Var = (t0) obj2;
                                    switch (i28) {
                                        case 0:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                            break;
                                        case 1:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                            break;
                                        case 2:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                            break;
                                        default:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ2);
                        }
                        rVarA = s0.a(aVar, (e23.l) objQ2);
                        z19 = false;
                        o0VarE.g0(false);
                    } else {
                        if (i18 == 2) {
                            throw kg.f.h(o0VarE, 1072312466, false);
                        }
                        o0VarE.C(1072320136);
                        if ((i17 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z24 || objQ3 == c2565a) {
                            final int i29 = 3;
                            objQ3 = new e23.l() { // from class: j02.c0
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    t0 t0Var = (t0) obj2;
                                    switch (i29) {
                                        case 0:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                            break;
                                        case 1:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                            break;
                                        case 2:
                                            t0Var.getClass();
                                            t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                            break;
                                        default:
                                            t0Var.getClass();
                                            t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ3);
                        }
                        rVarA = s0.a(aVar, (e23.l) objQ3);
                        z19 = false;
                        o0VarE.g0(false);
                    }
                    rVarThen = rVarB2.then(rVarA);
                    o0VarE.g0(z19);
                } else {
                    o0VarE.C(-1117655988);
                    o0VarE.g0(false);
                    rVarThen = rVarC;
                }
                z17 = z15;
                p.a(h0Var, obj, rVar5.then(rVarThen), z17, ((Boolean) d0VarF.getF182175a()).booleanValue(), eVar2, o0VarE, 466046 & (i17 >> 3));
                rVar4 = rVar5;
                rVar3 = rVarC;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                z17 = z15;
                rVar4 = rVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(dVar, h0Var, obj, rVar4, z17, rVar3, eVar, i14, i15);
            }
        }
        i25 = i16 | 27648;
        z15 = z14;
        if ((196608 & i14) == 0) {
            i25 |= 65536;
        }
        if ((1572864 & i14) == 0) {
            eVar2 = eVar;
            if (o0VarE.r(eVar2)) {
                i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i24 = 524288;
            }
            i25 |= i24;
        } else {
            eVar2 = eVar;
        }
        if ((599187 & i25) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i25 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                rVar5 = h4.r.S;
                if (i26 != 0) {
                    z15 = true;
                }
                i17 = i25 & (-458753);
                rVarC = e2.d.c(dVar, rVar5);
            } else {
                rVar5 = h4.r.S;
                if (i26 != 0) {
                    z15 = true;
                }
                i17 = i25 & (-458753);
                rVarC = e2.d.c(dVar, rVar5);
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.f(new f2(h0Var, 14));
                o0VarE.K(objQ);
            }
            x3Var = (x3) objQ;
            d0VarF = p0.f(new i91.c(19, obj, h0Var));
            if (((Boolean) d0VarF.getF182175a()).booleanValue()) {
                o0VarE.C(-1118625079);
                aVar2 = h4.r.S;
                h4.r rVarB3 = h4.p.b(aVar2, 1.0f);
                i19 = a.f96043a[((b2) x3Var.getF182175a()).ordinal()];
                if (i19 != 1) {
                    o0VarE.C(1072298490);
                    if ((i17 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z25) {
                        z26 = false;
                        final int objArr2 = 0 == true ? 1 : 0;
                        objQ4 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (objArr2) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ4);
                    } else {
                        z26 = false;
                        final int objArr3 = 0 == true ? 1 : 0;
                        objQ4 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (objArr3) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ4);
                    }
                    rVarA2 = s0.a(aVar2, (e23.l) objQ4);
                    o0VarE.g0(z26);
                } else {
                    if (i19 == 2) {
                        throw kg.f.h(o0VarE, 1072296374, false);
                    }
                    o0VarE.C(1072303610);
                    if ((i17 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objQ5 = o0VarE.q();
                    if (z27) {
                        final int i210 = 1;
                        objQ5 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i210) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ5);
                    } else {
                        final int i211 = 1;
                        objQ5 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i211) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ5);
                    }
                    rVarA2 = s0.a(aVar2, (e23.l) objQ5);
                    o0VarE.g0(false);
                    z26 = false;
                }
                rVarThen = rVarB3.then(rVarA2);
                o0VarE.g0(z26);
            } else if (obj.equals(h0Var.f96144s.getF182175a())) {
                o0VarE.C(-1118126227);
                aVar = h4.r.S;
                h4.r rVarB4 = h4.p.b(aVar, 1.0f);
                i18 = a.f96043a[((b2) x3Var.getF182175a()).ordinal()];
                if (i18 != 1) {
                    o0VarE.C(1072314568);
                    if ((i17 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objQ2 = o0VarE.q();
                    if (z18) {
                        final int i212 = 2;
                        objQ2 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i212) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    } else {
                        final int i213 = 2;
                        objQ2 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i213) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    }
                    rVarA = s0.a(aVar, (e23.l) objQ2);
                    z19 = false;
                    o0VarE.g0(false);
                } else {
                    if (i18 == 2) {
                        throw kg.f.h(o0VarE, 1072312466, false);
                    }
                    o0VarE.C(1072320136);
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objQ3 = o0VarE.q();
                    if (z24) {
                        final int i214 = 3;
                        objQ3 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i214) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    } else {
                        final int i215 = 3;
                        objQ3 = new e23.l() { // from class: j02.c0
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i215) {
                                    case 0:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.e() & 4294967295L)));
                                        break;
                                    case 1:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.e() >> 32)));
                                        break;
                                    case 2:
                                        t0Var.getClass();
                                        t0Var.q(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a & 4294967295L)));
                                        break;
                                    default:
                                        t0Var.getClass();
                                        t0Var.x(Float.intBitsToFloat((int) (h0Var.f96145t.e().f123544a >> 32)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    }
                    rVarA = s0.a(aVar, (e23.l) objQ3);
                    z19 = false;
                    o0VarE.g0(false);
                }
                rVarThen = rVarB4.then(rVarA);
                o0VarE.g0(z19);
            } else {
                o0VarE.C(-1117655988);
                o0VarE.g0(false);
                rVarThen = rVarC;
            }
            z17 = z15;
            p.a(h0Var, obj, rVar5.then(rVarThen), z17, ((Boolean) d0VarF.getF182175a()).booleanValue(), eVar2, o0VarE, 466046 & (i17 >> 3));
            rVar4 = rVar5;
            rVar3 = rVarC;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            z17 = z15;
            rVar4 = rVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(dVar, h0Var, obj, rVar4, z17, rVar3, eVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002c  */
    public static final h0 b(e2.i0 i0Var, e23.r rVar, p3.m mVar) {
        in2.e eVar;
        i0Var.getClass();
        rVar.getClass();
        g6.f.a aVar = g6.f.f75994b;
        l2 l2VarA = c2.l.a(0);
        n.f96116a.getClass();
        float f14 = n.f96117b;
        boolean zB = mVar.B(i0Var);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zB) {
            objQ = new ct1.c(i0Var, 4);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ct1.c(i0Var, 4);
                mVar.K(objQ);
            }
        }
        e23.a aVar3 = (e23.a) objQ;
        aVar3.getClass();
        x1 x1Var = p3.n.f135158a;
        Object objQ2 = mVar.q();
        aVar2.getClass();
        Object obj = p3.m.a.f135155b;
        if (objQ2 == obj) {
            objQ2 = p3.l0.j(t13.h.f161748a, mVar);
            mVar.K(objQ2);
        }
        o53.b0 b0Var = (o53.b0) objQ2;
        p1 p1VarQ = p0.q(aVar3, mVar);
        p1 p1VarQ2 = p0.q(100L, mVar);
        boolean zL = mVar.l(100L) | mVar.B(i0Var) | mVar.B(b0Var);
        Object objQ3 = mVar.q();
        if (zL || objQ3 == obj) {
            objQ3 = new j0(i0Var, b0Var, new j1(p1VarQ, p1VarQ2, 10));
            mVar.K(objQ3);
        }
        j0 j0Var = (j0) objQ3;
        g6.c cVar = (g6.c) mVar.A(t1.f91490h);
        float fS0 = cVar.s0(f14);
        Object objQ4 = mVar.q();
        aVar2.getClass();
        if (objQ4 == obj) {
            objQ4 = p3.l0.j(t13.h.f161748a, mVar);
            mVar.K(objQ4);
        }
        o53.b0 b0Var2 = (o53.b0) objQ4;
        p1 p1VarQ3 = p0.q(rVar, mVar);
        g6.o oVar = (g6.o) mVar.A(t1.f91496n);
        j02.a aVar4 = new j02.a(cVar.s0(c2.l.i(l2VarA, oVar)), cVar.s0(c2.l.h(l2VarA, oVar)), cVar.s0(l2VarA.f22737b), cVar.s0(l2VarA.f22739d));
        Object objQ5 = mVar.q();
        if (objQ5 == obj) {
            objQ5 = p0.f(new ct1.c(i0Var, 5));
            mVar.K(objQ5);
        }
        x3 x3Var = (x3) objQ5;
        boolean zB2 = mVar.B(l2VarA) | mVar.i(f14) | mVar.B(b0Var2) | mVar.B(i0Var) | mVar.B(j0Var) | mVar.k(((b2) x3Var.getF182175a()).ordinal());
        Object objQ6 = mVar.q();
        if (zB2 || objQ6 == obj) {
            int i14 = a.f96043a[((b2) x3Var.getF182175a()).ordinal()];
            if (i14 == 1) {
                eVar = new in2.e((byte) 0, 7);
            } else {
                if (i14 != 2) {
                    u0.r();
                    return null;
                }
                eVar = new in2.e((byte) 0, 8);
            }
            Object h0Var = new h0(i0Var, b0Var2, p1VarQ3, fS0, aVar4, j0Var, oVar, eVar);
            mVar.K(h0Var);
            objQ6 = h0Var;
        }
        return (h0) objQ6;
    }
}

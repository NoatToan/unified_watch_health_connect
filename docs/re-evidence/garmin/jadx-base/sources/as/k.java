package as;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d2;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.e5;
import java.util.List;
import l72.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    public static final void a(List list, boolean z14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        e23.a aVar3;
        o0 o0VarE = mVar.E(1313586115);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(g6.f.a(0));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(g6.f.a(0));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(g6.f.a(0));
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(g6.f.a(0));
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(g6.f.a(0));
                o0VarE.K(objQ5);
            }
            p1 p1Var5 = (p1) objQ5;
            Integer numValueOf = Integer.valueOf(R.string.strength_training_add_exercise);
            boolean z15 = (i15 & 896) == 256;
            Object objQ6 = o0VarE.q();
            if (z15 || objQ6 == c2565a) {
                objQ6 = new defpackage.c(aVar, 23);
                o0VarE.K(objQ6);
            }
            e23.a aVar4 = (e23.a) objQ6;
            if (aVar2 != null) {
                o0VarE.C(1597719430);
                boolean z16 = (i15 & 7168) == 2048;
                Object objQ7 = o0VarE.q();
                if (z16 || objQ7 == c2565a) {
                    objQ7 = new defpackage.c(aVar2, 24);
                    o0VarE.K(objQ7);
                }
                aVar3 = (e23.a) objQ7;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1597781275);
                o0VarE.g0(false);
                aVar3 = null;
            }
            c(R.string.strength_training_exercises, numValueOf, z14, aVar4, aVar3, z3.f.c(-1712132770, new a42.c(context, p1Var, p1Var2, p1Var3, p1Var4, p1Var5, 5), o0VarE), z3.f.c(-529900035, new a42.c(list, p1Var, p1Var2, p1Var3, p1Var4, p1Var5), o0VarE), o0VarE, ((i15 << 3) & 896) | 1769472, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(list, z14, aVar, aVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    public static final void b(e23.a aVar, int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(-120162644);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d2 d2Var = d2.f16532a;
            h4.r.a aVar2 = h4.r.S;
            boolean z14 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new defpackage.c(aVar, 22);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 22);
                    o0VarE.K(objQ);
                }
            }
            d2Var.b(w.d(aVar2, false, null, null, (e23.a) objQ, 15), z3.f.c(498257399, new e(i14, i17), o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(i14, aVar, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x018d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0197  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:120:0x0201  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x011e  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0155  */
    /* JADX WARN: Code duplicated, block: B:93:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x015f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    public static final void c(int i14, Integer num, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i15, int i16) {
        int i17;
        Integer num2;
        int i18;
        int i19;
        boolean z15;
        Integer num3;
        e23.a<Unit> aVar3;
        p2 p2VarI0;
        e23.a<Unit> aVar4;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar5;
        h5.g.a.b bVar;
        String strJ;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ;
        boolean z19;
        boolean z24;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        o0 o0VarE = mVar.E(643321070);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                num2 = num;
                i17 |= o0VarE.B(num2) ? 32 : 16;
            }
            if ((i15 & 384) == 0) {
                if (o0VarE.h(z14)) {
                    i28 = 256;
                } else {
                    i28 = 128;
                }
                i17 |= i28;
            }
            if ((i15 & 3072) == 0) {
                if (o0VarE.r(aVar)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i17 |= i27;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i17 |= i19;
                }
                if ((196608 & i15) == 0) {
                    if (o0VarE.r(pVar)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i17 |= i26;
                }
                if ((1572864 & i15) == 0) {
                    if (o0VarE.r(pVar2)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
                if ((599187 & i17) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i17 & 1, z15)) {
                    if (i29 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarF, o0VarE);
                    h5.g.V.getClass();
                    aVar5 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(o0VarE, i14);
                    if (z14) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1373231298, R.string.lbl_edit, o0VarE, false);
                    } else {
                        o0VarE.C(379545254);
                        o0VarE.g0(false);
                        strJ = "";
                    }
                    if ((i17 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i17 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | z16;
                    objQ = o0VarE.q();
                    if (z18) {
                        z19 = false;
                        objQ = new i(z14, aVar, 0);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            z19 = false;
                            objQ = new i(z14, aVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            z19 = false;
                        }
                    }
                    z24 = z19;
                    i24 = i17;
                    r1.c(strQ, strJ, (e23.a) objQ, false, null, null, o0VarE, 0, 56);
                    if (pVar == null) {
                        o0VarE.C(379646625);
                        o0VarE.g0(z24);
                    } else {
                        o0VarE.C(-1373226656);
                        e5.q((i24 >> 15) & 14, pVar, o0VarE, z24);
                    }
                    if (pVar2 == null) {
                        o0VarE.C(379673409);
                        o0VarE.g0(z24);
                    } else {
                        o0VarE.C(-1373225792);
                        e5.q((i24 >> 18) & 14, pVar2, o0VarE, z24);
                    }
                    if (z14 || num2 == null || aVar4 == null) {
                        o0VarE.C(379822954);
                        o0VarE.g0(z24);
                    } else {
                        o0VarE.C(379757606);
                        b(aVar4, num2.intValue(), o0VarE, ((i24 >> 3) & 14) | ((i24 >> 9) & 112));
                        o0VarE.g0(z24);
                    }
                    o0VarE.g0(true);
                    Integer num4 = num2;
                    aVar3 = aVar4;
                    num3 = num4;
                } else {
                    o0VarE.e();
                    num3 = num2;
                    aVar3 = aVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new j(i14, num3, z14, aVar, aVar3, pVar, pVar2, i15, i16);
                }
            }
            i17 |= 24576;
            if ((196608 & i15) == 0) {
                if (o0VarE.r(pVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i17 |= i26;
            }
            if ((1572864 & i15) == 0) {
                if (o0VarE.r(pVar2)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
            if ((599187 & i17) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i17 & 1, z15)) {
                if (i29 != 0) {
                    num2 = null;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                x1 x1Var2 = p3.n.f135158a;
                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF2, o0VarE);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                String strQ2 = gl1.y.Q(o0VarE, i14);
                if (z14) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1373231298, R.string.lbl_edit, o0VarE, false);
                } else {
                    o0VarE.C(379545254);
                    o0VarE.g0(false);
                    strJ = "";
                }
                if ((i17 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i17 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | z16;
                objQ = o0VarE.q();
                if (z18) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z19 = false;
                        objQ = new i(z14, aVar, 0);
                        o0VarE.K(objQ);
                    } else {
                        z19 = false;
                    }
                } else {
                    z19 = false;
                    objQ = new i(z14, aVar, 0);
                    o0VarE.K(objQ);
                }
                z24 = z19;
                i24 = i17;
                r1.c(strQ2, strJ, (e23.a) objQ, false, null, null, o0VarE, 0, 56);
                if (pVar == null) {
                    o0VarE.C(379646625);
                    o0VarE.g0(z24);
                } else {
                    o0VarE.C(-1373226656);
                    e5.q((i24 >> 15) & 14, pVar, o0VarE, z24);
                }
                if (pVar2 == null) {
                    o0VarE.C(379673409);
                    o0VarE.g0(z24);
                } else {
                    o0VarE.C(-1373225792);
                    e5.q((i24 >> 18) & 14, pVar2, o0VarE, z24);
                }
                if (z14) {
                    o0VarE.C(379822954);
                    o0VarE.g0(z24);
                } else {
                    o0VarE.C(379822954);
                    o0VarE.g0(z24);
                }
                o0VarE.g0(true);
                Integer num5 = num2;
                aVar3 = aVar4;
                num3 = num5;
            } else {
                o0VarE.e();
                num3 = num2;
                aVar3 = aVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new j(i14, num3, z14, aVar, aVar3, pVar, pVar2, i15, i16);
            }
        }
        i17 |= 48;
        num2 = num;
        if ((i15 & 384) == 0) {
            if (o0VarE.h(z14)) {
                i28 = 256;
            } else {
                i28 = 128;
            }
            i17 |= i28;
        }
        if ((i15 & 3072) == 0) {
            if (o0VarE.r(aVar)) {
                i27 = 2048;
            } else {
                i27 = 1024;
            }
            i17 |= i27;
        }
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                if (o0VarE.r(aVar2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i17 |= i19;
            }
            if ((196608 & i15) == 0) {
                if (o0VarE.r(pVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i17 |= i26;
            }
            if ((1572864 & i15) == 0) {
                if (o0VarE.r(pVar2)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
            if ((599187 & i17) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i17 & 1, z15)) {
                if (i29 != 0) {
                    num2 = null;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                x1 x1Var3 = p3.n.f135158a;
                h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF3, o0VarE);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var3 = b0.f22601a;
                String strQ3 = gl1.y.Q(o0VarE, i14);
                if (z14) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1373231298, R.string.lbl_edit, o0VarE, false);
                } else {
                    o0VarE.C(379545254);
                    o0VarE.g0(false);
                    strJ = "";
                }
                if ((i17 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i17 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | z16;
                objQ = o0VarE.q();
                if (z18) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        z19 = false;
                        objQ = new i(z14, aVar, 0);
                        o0VarE.K(objQ);
                    } else {
                        z19 = false;
                    }
                } else {
                    z19 = false;
                    objQ = new i(z14, aVar, 0);
                    o0VarE.K(objQ);
                }
                z24 = z19;
                i24 = i17;
                r1.c(strQ3, strJ, (e23.a) objQ, false, null, null, o0VarE, 0, 56);
                if (pVar == null) {
                    o0VarE.C(379646625);
                    o0VarE.g0(z24);
                } else {
                    o0VarE.C(-1373226656);
                    e5.q((i24 >> 15) & 14, pVar, o0VarE, z24);
                }
                if (pVar2 == null) {
                    o0VarE.C(379673409);
                    o0VarE.g0(z24);
                } else {
                    o0VarE.C(-1373225792);
                    e5.q((i24 >> 18) & 14, pVar2, o0VarE, z24);
                }
                if (z14) {
                    o0VarE.C(379822954);
                    o0VarE.g0(z24);
                } else {
                    o0VarE.C(379822954);
                    o0VarE.g0(z24);
                }
                o0VarE.g0(true);
                Integer num6 = num2;
                aVar3 = aVar4;
                num3 = num6;
            } else {
                o0VarE.e();
                num3 = num2;
                aVar3 = aVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new j(i14, num3, z14, aVar, aVar3, pVar, pVar2, i15, i16);
            }
        }
        i17 |= 24576;
        if ((196608 & i15) == 0) {
            if (o0VarE.r(pVar)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i17 |= i26;
        }
        if ((1572864 & i15) == 0) {
            if (o0VarE.r(pVar2)) {
                i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i25 = 524288;
            }
            i17 |= i25;
        }
        if ((599187 & i17) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i17 & 1, z15)) {
            if (i29 != 0) {
                num2 = null;
            }
            if (i18 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            x1 x1Var4 = p3.n.f135158a;
            h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF4, o0VarE);
            h5.g.V.getClass();
            aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var4 = b0.f22601a;
            String strQ4 = gl1.y.Q(o0VarE, i14);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1373231298, R.string.lbl_edit, o0VarE, false);
            } else {
                o0VarE.C(379545254);
                o0VarE.g0(false);
                strJ = "";
            }
            if ((i17 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i17 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | z16;
            objQ = o0VarE.q();
            if (z18) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    z19 = false;
                    objQ = new i(z14, aVar, 0);
                    o0VarE.K(objQ);
                } else {
                    z19 = false;
                }
            } else {
                z19 = false;
                objQ = new i(z14, aVar, 0);
                o0VarE.K(objQ);
            }
            z24 = z19;
            i24 = i17;
            r1.c(strQ4, strJ, (e23.a) objQ, false, null, null, o0VarE, 0, 56);
            if (pVar == null) {
                o0VarE.C(379646625);
                o0VarE.g0(z24);
            } else {
                o0VarE.C(-1373226656);
                e5.q((i24 >> 15) & 14, pVar, o0VarE, z24);
            }
            if (pVar2 == null) {
                o0VarE.C(379673409);
                o0VarE.g0(z24);
            } else {
                o0VarE.C(-1373225792);
                e5.q((i24 >> 18) & 14, pVar2, o0VarE, z24);
            }
            if (z14) {
                o0VarE.C(379822954);
                o0VarE.g0(z24);
            } else {
                o0VarE.C(379822954);
                o0VarE.g0(z24);
            }
            o0VarE.g0(true);
            Integer num7 = num2;
            aVar3 = aVar4;
            num3 = num7;
        } else {
            o0VarE.e();
            num3 = num2;
            aVar3 = aVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(i14, num3, z14, aVar, aVar3, pVar, pVar2, i15, i16);
        }
    }

    public static final h4.r d(h4.r rVar) {
        rVar.getClass();
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        float f14 = eVar.f97918c;
        bVar.getClass();
        float f15 = eVar.f97918c;
        g6.f.a aVar = g6.f.f75994b;
        return c2.l.B(rVar, f14, 10, f15, 7);
    }

    public static final h4.r e(h4.r rVar) {
        rVar.getClass();
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        float f14 = eVar.f97918c;
        bVar.getClass();
        return c2.l.z(rVar, f14, eVar.f97920e);
    }
}

package dv0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import cw1.p0;
import cw1.v0;
import g02.b0;
import gl1.y;
import o4.m1;
import o4.q1;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.i0;
import w5.c0;
import w5.f0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x013a  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z14, boolean z15, String str, String str2, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.a<Unit> aVar2;
        boolean z16;
        p2 p2VarI0;
        s5.c.b bVarH;
        int iJ;
        z3.e eVar;
        boolean z17;
        Object objQ;
        o0 o0VarE = mVar.E(1936537790);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        int i17 = i15 & 16;
        if (i17 == 0) {
            if ((i14 & 24576) == 0) {
                aVar2 = aVar;
                i16 |= o0VarE.r(aVar2) ? 16384 : 8192;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    aVar2 = null;
                }
                x1 x1Var = p3.n.f135158a;
                b0 b0Var = b0.f74326a;
                h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                String strQ = y.Q(o0VarE, R.string.lbl_livetrack_profile);
                bVarH = l2.h(o0VarE, 1291992095, 0, 1, null);
                bVarH.b(str + "/");
                iJ = bVarH.j(new i0(com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                try {
                    bVarH.b(str2);
                    Unit unit = Unit.INSTANCE;
                    bVarH.f(iJ);
                    s5.c cVarK = bVarH.k();
                    o0VarE.g0(false);
                    if (z15) {
                        c.f61357a.getClass();
                        eVar = c.f61358b;
                    } else {
                        eVar = null;
                    }
                    if ((i16 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ = o0VarE.q();
                    if (z17) {
                        objQ = new p0(aVar2, 22);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p0(aVar2, 22);
                            o0VarE.K(objQ);
                        }
                    }
                    b0Var.b(strQ, cVarK, rVarE, z14, eVar, (e23.a) objQ, o0VarE, 57344 & (i16 << 12), 200);
                } catch (Throwable th3) {
                    bVarH.f(iJ);
                    throw th3;
                }
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(z14, z15, str, str2, aVar2, i14, i15);
            }
        }
        i16 |= 24576;
        aVar2 = aVar;
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i17 != 0) {
                aVar2 = null;
            }
            x1 x1Var2 = p3.n.f135158a;
            b0 b0Var2 = b0.f74326a;
            h4.r rVarE2 = u1.n.e(x2.f(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            String strQ2 = y.Q(o0VarE, R.string.lbl_livetrack_profile);
            bVarH = l2.h(o0VarE, 1291992095, 0, 1, null);
            bVarH.b(str + "/");
            iJ = bVarH.j(new i0(com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
            bVarH.b(str2);
            Unit unit2 = Unit.INSTANCE;
            bVarH.f(iJ);
            s5.c cVarK2 = bVarH.k();
            o0VarE.g0(false);
            if (z15) {
                c.f61357a.getClass();
                eVar = c.f61358b;
            } else {
                eVar = null;
            }
            if ((i16 & 57344) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            objQ = o0VarE.q();
            if (z17) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p0(aVar2, 22);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new p0(aVar2, 22);
                o0VarE.K(objQ);
            }
            b0Var2.b(strQ2, cVarK2, rVarE2, z14, eVar, (e23.a) objQ, o0VarE, 57344 & (i16 << 12), 200);
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(z14, z15, str, str2, aVar2, i14, i15);
        }
    }
}

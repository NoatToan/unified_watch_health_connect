package t60;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q;
import c2.u;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x014d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01af  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:132:0x0215  */
    /* JADX WARN: Code duplicated, block: B:134:0x0219  */
    /* JADX WARN: Code duplicated, block: B:137:0x0226  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void a(String str, r rVar, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, e23.a aVar, e23.a aVar2, p3.m mVar, int i14, int i15) {
        int i16;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer num2;
        char c14;
        boolean z14;
        String str12;
        Integer num3;
        p2 p2VarI0;
        String strQ;
        Integer num4;
        String str13;
        g gVar;
        boolean zB;
        Object objQ;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar3;
        int i17;
        h5.g.a.b bVar;
        int i18;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1324445202);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= ((i15 & 4) == 0 && o0VarE.B(str2)) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            str8 = str4;
            i16 |= o0VarE.B(str8) ? 16384 : 8192;
        } else {
            str8 = str4;
        }
        if ((196608 & i14) == 0) {
            str9 = str5;
            i16 |= o0VarE.B(str9) ? 131072 : 65536;
        } else {
            str9 = str5;
        }
        if ((1572864 & i14) == 0) {
            str10 = str6;
            i16 |= o0VarE.B(str10) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            str10 = str6;
        }
        if ((12582912 & i14) == 0) {
            str11 = str7;
            i16 |= o0VarE.B(str11) ? 8388608 : 4194304;
        } else {
            str11 = str7;
        }
        int i19 = i15 & 256;
        if (i19 == 0) {
            if ((100663296 & i14) == 0) {
                num2 = num;
                i16 |= o0VarE.B(num2) ? 67108864 : 33554432;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(aVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
            if (o0VarE.r(aVar2)) {
                c14 = 4;
            } else {
                c14 = 2;
            }
            if ((i16 & 306783379) == 306783378 || (c14 & 3) != 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 4) != 0) {
                        strQ = y.Q(o0VarE, R.string.lbl_close);
                        i16 &= -897;
                    } else {
                        strQ = str2;
                    }
                    if (i19 != 0) {
                        str13 = strQ;
                        num4 = null;
                    } else {
                        num4 = num2;
                        str13 = strQ;
                    }
                } else {
                    o0VarE.e();
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                    }
                    num4 = num2;
                    str13 = str2;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                gVar = new g(str);
                Unit unit = Unit.INSTANCE;
                zB = o0VarE.B(gVar);
                objQ = o0VarE.q();
                if (zB) {
                    objQ = new e(gVar, null);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e(gVar, null);
                        o0VarE.K(objQ);
                    }
                }
                l0.e((p) objQ, unit, o0VarE);
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                i17 = i16;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar = u.f22885a;
                l72.l.c(z3.f.c(1067511450, new et1.u(str13, gVar, aVar2, num4, str11, str3, str8, str9, str10), o0VarE), null, null, null, false, aVar, o0VarE, ((i17 >> 12) & 458752) | 6, 30);
                o0VarE.g0(true);
                str12 = str13;
                num3 = num4;
            } else {
                o0VarE.e();
                str12 = str2;
                num3 = num2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new go.a(str, rVar, str12, str3, str4, str5, str6, str7, num3, aVar, aVar2, i14, i15);
            }
        }
        i16 |= 100663296;
        num2 = num;
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(aVar)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i16 |= i18;
        }
        if (o0VarE.r(aVar2)) {
            c14 = 4;
        } else {
            c14 = 2;
        }
        if ((i16 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 4) != 0) {
                    strQ = y.Q(o0VarE, R.string.lbl_close);
                    i16 &= -897;
                } else {
                    strQ = str2;
                }
                if (i19 != 0) {
                    str13 = strQ;
                    num4 = null;
                } else {
                    num4 = num2;
                    str13 = strQ;
                }
            } else {
                if ((i15 & 4) != 0) {
                    strQ = y.Q(o0VarE, R.string.lbl_close);
                    i16 &= -897;
                } else {
                    strQ = str2;
                }
                if (i19 != 0) {
                    str13 = strQ;
                    num4 = null;
                } else {
                    num4 = num2;
                    str13 = strQ;
                }
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            gVar = new g(str);
            Unit unit2 = Unit.INSTANCE;
            zB = o0VarE.B(gVar);
            objQ = o0VarE.q();
            if (zB) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e(gVar, null);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new e(gVar, null);
                o0VarE.K(objQ);
            }
            l0.e((p) objQ, unit2, o0VarE);
            h4.d.f81522a.getClass();
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            i17 = i16;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            l72.l.c(z3.f.c(1067511450, new et1.u(str13, gVar, aVar2, num4, str11, str3, str8, str9, str10), o0VarE), null, null, null, false, aVar, o0VarE, ((i17 >> 12) & 458752) | 6, 30);
            o0VarE.g0(true);
            str12 = str13;
            num3 = num4;
        } else {
            o0VarE.e();
            str12 = str2;
            num3 = num2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new go.a(str, rVar, str12, str3, str4, str5, str6, str7, num3, aVar, aVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0166  */
    public static final void b(String str, r rVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        r rVar2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        aVar.getClass();
        o0 o0VarE = mVar.E(459089485);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.B(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        if ((i14 & 384) == 0) {
            str9 = str2;
            i15 |= o0VarE.B(str9) ? 256 : 128;
        } else {
            str9 = str2;
        }
        if ((i14 & 3072) == 0) {
            str10 = str3;
            i15 |= o0VarE.B(str10) ? 2048 : 1024;
        } else {
            str10 = str3;
        }
        if ((i14 & 24576) == 0) {
            str11 = str4;
            i15 |= o0VarE.B(str11) ? 16384 : 8192;
        } else {
            str11 = str4;
        }
        if ((196608 & i14) == 0) {
            str12 = str5;
            i15 |= o0VarE.B(str12) ? 131072 : 65536;
        } else {
            str12 = str5;
        }
        if ((1572864 & i14) == 0) {
            str13 = str6;
            i15 |= o0VarE.B(str13) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            str13 = str6;
        }
        if ((12582912 & i14) == 0) {
            str14 = str7;
            i15 |= o0VarE.B(str14) ? 8388608 : 4194304;
        } else {
            str14 = str7;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.B(str8) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i15 |= o0VarE.B(num) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && ((o0VarE.r(aVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g gVar = new g(str);
            String strN = og2.k.n(context, gVar.f162711a);
            int i16 = i15;
            boolean zB = ((i16 & 3670016) == 1048576) | o0VarE.B(gVar) | o0VarE.r(context) | o0VarE.B(strN);
            Object objQ = o0VarE.q();
            if (zB) {
                d dVar = new d(str13, gVar, context, strN, 0);
                o0VarE.K(dVar);
                objQ = dVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    d dVar2 = new d(str13, gVar, context, strN, 0);
                    o0VarE.K(dVar2);
                    objQ = dVar2;
                }
            }
            int i17 = i16 >> 3;
            a(str, rVar2, str9, str10, str11, str12, str14, str8, num, (e23.a) objQ, aVar, o0VarE, (i16 & 524286) | (i17 & 3670016) | (29360128 & i17) | (i17 & 234881024), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bv0.h(str, rVar, str2, str3, str4, str5, str6, str7, str8, num, aVar, i14);
        }
    }
}

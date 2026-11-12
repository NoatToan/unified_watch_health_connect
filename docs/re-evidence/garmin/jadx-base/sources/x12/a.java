package x12;

import com.google.firebase.messaging.Constants;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import q32.b;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void a(r rVar, String str, String str2, String str3, p<? super m, ? super Integer, Unit> pVar, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        String str4;
        int i17;
        int i18;
        int i19;
        boolean z14;
        r rVar3;
        String str5;
        p2 p2VarI0;
        r rVar4;
        int i24;
        r rVar5;
        String str6;
        b92.a aVarB;
        String str7;
        r rVar6;
        o0 o0VarL = h.l(-521583222, aVar, str, mVar);
        int i25 = i15 & 1;
        if (i25 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarL.B(rVar2) ? 4 : 2);
        }
        int i26 = i16 | (o0VarL.B(str) ? 32 : 16);
        if ((i15 & 4) == 0) {
            str4 = str2;
            int i27 = o0VarL.B(str4) ? 256 : 128;
            int i28 = i26 | i27;
            if (o0VarL.B(str3)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            int i29 = i28 | i17;
            if (o0VarL.r(aVar)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i19 = i29 | i18;
            if ((74899 & i19) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarL.n(i19 & 1, z14)) {
                o0VarL.G0();
                if ((i14 & 1) != 0 || o0VarL.o0()) {
                    if (i25 != 0) {
                        rVar4 = r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i15 & 4) != 0) {
                        i19 &= -897;
                        str4 = str;
                    }
                    i24 = i19;
                    rVar5 = rVar4;
                } else {
                    o0VarL.e();
                    if ((i15 & 4) != 0) {
                        i19 &= -897;
                    }
                    int i30 = i19;
                    rVar5 = rVar2;
                    i24 = i30;
                }
                str6 = str4;
                o0VarL.h0();
                x1 x1Var = n.f135158a;
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str6);
                aVarB = c0235a.b();
                if (str3 != null) {
                    o0VarL.C(706320334);
                    int i34 = b92.a.f16960b;
                    str7 = str6;
                    l72.p2.f111205a.h(str, str3, null, rVar5, aVarB, false, false, null, pVar, null, aVar, o0VarL, ((i24 >> 3) & 14) | ((i24 >> 6) & 112) | ((i24 << 9) & 7168) | 100663296, (i24 >> 15) & 14, 740);
                    rVar6 = rVar5;
                    o0VarL = o0VarL;
                    o0VarL.g0(false);
                } else {
                    str7 = str6;
                    rVar6 = rVar5;
                    o0VarL.C(706563901);
                    int i35 = b92.a.f16960b;
                    l72.p2.f111205a.g(str, rVar6, aVarB, null, pVar, false, false, aVar, o0VarL, ((i24 >> 3) & 14) | ((i24 << 3) & 112) | 24576 | ((i24 << 9) & 234881024), 232);
                    o0VarL.g0(false);
                }
                rVar3 = rVar6;
                str5 = str7;
            } else {
                o0VarL.e();
                rVar3 = rVar2;
                str5 = str4;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b(rVar3, str, str5, str3, (p) pVar, (e23.a) aVar, i14, i15);
            }
        }
        str4 = str2;
        int i210 = i26 | i27;
        if (o0VarL.B(str3)) {
            i17 = 2048;
        } else {
            i17 = 1024;
        }
        int i211 = i210 | i17;
        if (o0VarL.r(aVar)) {
            i18 = 131072;
        } else {
            i18 = 65536;
        }
        i19 = i211 | i18;
        if ((74899 & i19) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarL.n(i19 & 1, z14)) {
            o0VarL.G0();
            if ((i14 & 1) != 0) {
                if (i25 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 4) != 0) {
                    i19 &= -897;
                    str4 = str;
                }
                i24 = i19;
                rVar5 = rVar4;
            } else {
                if (i25 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if ((i15 & 4) != 0) {
                    i19 &= -897;
                    str4 = str;
                }
                i24 = i19;
                rVar5 = rVar4;
            }
            str6 = str4;
            o0VarL.h0();
            x1 x1Var2 = n.f135158a;
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            c0235a2.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str6);
            aVarB = c0235a2.b();
            if (str3 != null) {
                o0VarL.C(706320334);
                int i36 = b92.a.f16960b;
                str7 = str6;
                l72.p2.f111205a.h(str, str3, null, rVar5, aVarB, false, false, null, pVar, null, aVar, o0VarL, ((i24 >> 3) & 14) | ((i24 >> 6) & 112) | ((i24 << 9) & 7168) | 100663296, (i24 >> 15) & 14, 740);
                rVar6 = rVar5;
                o0VarL = o0VarL;
                o0VarL.g0(false);
            } else {
                str7 = str6;
                rVar6 = rVar5;
                o0VarL.C(706563901);
                int i37 = b92.a.f16960b;
                l72.p2.f111205a.g(str, rVar6, aVarB, null, pVar, false, false, aVar, o0VarL, ((i24 >> 3) & 14) | ((i24 << 3) & 112) | 24576 | ((i24 << 9) & 234881024), 232);
                o0VarL.g0(false);
            }
            rVar3 = rVar6;
            str5 = str7;
        } else {
            o0VarL.e();
            rVar3 = rVar2;
            str5 = str4;
        }
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar3, str, str5, str3, (p) pVar, (e23.a) aVar, i14, i15);
        }
    }
}

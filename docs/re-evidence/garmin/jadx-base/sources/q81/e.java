package q81;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import gl1.y;
import h4.r;
import java.util.LinkedHashMap;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120  */
    /* JADX WARN: Code duplicated, block: B:80:0x0150  */
    /* JADX WARN: Code duplicated, block: B:83:0x015a  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, int i15, e23.a aVar, String str, String str2, String str3, String str4, p3.m mVar) {
        String str5;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        String str6;
        p2 p2VarI0;
        String str7;
        String strQ;
        String strQ2;
        int i24;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ;
        p3.m.a aVar2;
        LinkedHashMap linkedHashMap;
        Object objQ2;
        str.getClass();
        str3.getClass();
        str4.getClass();
        o0 o0VarE = mVar.E(-409618292);
        int i25 = i14 | (o0VarE.B(str) ? 4 : 2);
        if ((i15 & 2) == 0) {
            str5 = str2;
            int i26 = o0VarE.B(str5) ? 32 : 16;
            int i27 = i25 | i26;
            if (o0VarE.B(str3)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            int i28 = i27 | i16;
            if (o0VarE.B(str4)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            int i29 = i28 | i17;
            if (o0VarE.r(aVar)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i19 = i29 | i18;
            if ((i19 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) == 0 && !o0VarE.o0()) {
                    o0VarE.e();
                    if ((i15 & 2) != 0) {
                        i19 &= -113;
                    }
                } else if ((i15 & 2) != 0) {
                    i19 &= -113;
                    str5 = str;
                }
                str7 = str5;
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                strQ = y.Q(o0VarE, R.string.no_value);
                strQ2 = y.Q(o0VarE, R.string.no_data_label);
                i24 = i19 & 14;
                if (i24 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z19 = z15 | ((((i19 & 112) ^ 48) <= 32 && o0VarE.B(str7)) || (i19 & 48) == 32);
                if ((i19 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z24 = z19 | z16;
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z24 | z17;
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (z18) {
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    linkedHashMap = c0235a.f16962a;
                    linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, str7);
                    if (str3.equals(strQ)) {
                        linkedHashMap.put("label_secondary", strQ2);
                    }
                    if (str4.equals(strQ)) {
                        linkedHashMap.put("value", strQ2);
                    }
                    objQ = c0235a.b();
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                        linkedHashMap = c0235a2.f16962a;
                        linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, str7);
                        if (str3.equals(strQ)) {
                            linkedHashMap.put("label_secondary", strQ2);
                        }
                        if (str4.equals(strQ) && !str3.equals(strQ)) {
                            linkedHashMap.put("value", strQ2);
                        }
                        objQ = c0235a2.b();
                        o0VarE.K(objQ);
                    }
                }
                b92.a aVar3 = (b92.a) objQ;
                r.a aVar4 = r.S;
                objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new po2.o(23);
                    o0VarE.K(objQ2);
                }
                r rVarC = v.c((e23.l) objQ2, aVar4, true);
                int i30 = i19 >> 3;
                int i34 = b92.a.f16960b;
                l72.l.e(str, str3, str4, null, null, null, rVarC, aVar3, false, aVar, o0VarE, (i30 & 896) | (i30 & 112) | i24 | ((i19 << 15) & 1879048192), 312);
                str6 = str7;
            } else {
                o0VarE.e();
                str6 = str5;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ka0.e(str, str6, str3, str4, aVar, i14, i15);
            }
        }
        str5 = str2;
        int i210 = i25 | i26;
        if (o0VarE.B(str3)) {
            i16 = 256;
        } else {
            i16 = 128;
        }
        int i211 = i210 | i16;
        if (o0VarE.B(str4)) {
            i17 = 2048;
        } else {
            i17 = 1024;
        }
        int i212 = i211 | i17;
        if (o0VarE.r(aVar)) {
            i18 = 16384;
        } else {
            i18 = 8192;
        }
        i19 = i212 | i18;
        if ((i19 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) == 0) {
                if ((i15 & 2) != 0) {
                    i19 &= -113;
                    str5 = str;
                }
            } else if ((i15 & 2) != 0) {
                i19 &= -113;
                str5 = str;
            }
            str7 = str5;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            strQ = y.Q(o0VarE, R.string.no_value);
            strQ2 = y.Q(o0VarE, R.string.no_data_label);
            i24 = i19 & 14;
            if (i24 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z110 = z15 | ((((i19 & 112) ^ 48) <= 32 && o0VarE.B(str7)) || (i19 & 48) == 32);
            if ((i19 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z25 = z110 | z16;
            if ((i19 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z25 | z17;
            objQ = o0VarE.q();
            aVar2 = p3.m.f135153a;
            if (z18) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    linkedHashMap = c0235a3.f16962a;
                    linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, str7);
                    if (str3.equals(strQ)) {
                        linkedHashMap.put("label_secondary", strQ2);
                    }
                    if (str4.equals(strQ)) {
                        linkedHashMap.put("value", strQ2);
                    }
                    objQ = c0235a3.b();
                    o0VarE.K(objQ);
                }
            } else {
                b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                linkedHashMap = c0235a4.f16962a;
                linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, str7);
                if (str3.equals(strQ)) {
                    linkedHashMap.put("label_secondary", strQ2);
                }
                if (str4.equals(strQ)) {
                    linkedHashMap.put("value", strQ2);
                }
                objQ = c0235a4.b();
                o0VarE.K(objQ);
            }
            b92.a aVar5 = (b92.a) objQ;
            r.a aVar6 = r.S;
            objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new po2.o(23);
                o0VarE.K(objQ2);
            }
            r rVarC2 = v.c((e23.l) objQ2, aVar6, true);
            int i35 = i19 >> 3;
            int i36 = b92.a.f16960b;
            l72.l.e(str, str3, str4, null, null, null, rVarC2, aVar5, false, aVar, o0VarE, (i35 & 896) | (i35 & 112) | i24 | ((i19 << 15) & 1879048192), 312);
            str6 = str7;
        } else {
            o0VarE.e();
            str6 = str5;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(str, str6, str3, str4, aVar, i14, i15);
        }
    }
}

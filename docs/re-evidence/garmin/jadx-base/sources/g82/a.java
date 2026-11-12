package g82;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import et.p;
import f21.k0;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.List;
import l72.c1;
import p13.u;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x0113  */
    /* JADX WARN: Code duplicated, block: B:79:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x0186  */
    /* JADX WARN: Code duplicated, block: B:86:0x0196  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z14, String str, String str2, e23.a aVar, String str3, e23.a aVar2, List list, Calendar calendar, Calendar calendar2, Calendar calendar3, l lVar, m mVar, int i14, int i15, int i16) {
        Calendar calendar4;
        int i17;
        Calendar calendar5;
        int i18;
        l lVar2;
        boolean z15;
        List list2;
        Calendar calendar6;
        Calendar calendar7;
        p2 p2VarI0;
        int i19;
        Calendar calendar8;
        boolean z16;
        Calendar calendar9;
        List list3;
        Calendar calendar10;
        int i24;
        o0 o0VarL = h.l(846463311, aVar, str2, mVar);
        int i25 = i14 | 6;
        if ((i14 & 48) == 0) {
            i25 |= o0VarL.B(str) ? 32 : 16;
        }
        int i26 = i25 | 384;
        if ((i14 & 3072) == 0) {
            i26 |= o0VarL.B(str2) ? 2048 : 1024;
        }
        int i27 = i26 | (o0VarL.r(aVar) ? 16384 : 8192);
        if ((196608 & i14) == 0) {
            i27 |= o0VarL.B(str3) ? 131072 : 65536;
        }
        int i28 = i27 | (o0VarL.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 4194304;
        if ((i16 & 256) == 0) {
            calendar4 = calendar;
            int i29 = o0VarL.r(calendar4) ? 67108864 : 33554432;
            i17 = i28 | i29 | 268435456;
            if ((i16 & 1024) == 0) {
                calendar5 = calendar3;
                int i30 = o0VarL.r(calendar5) ? 4 : 2;
                i18 = i15 | i30;
                if ((i15 & 48) == 0) {
                    lVar2 = lVar;
                    i18 |= o0VarL.r(lVar2) ? 32 : 16;
                } else {
                    lVar2 = lVar;
                }
                if (o0VarL.n(i17 & 1, (306783379 & i17) == 306783378 || (i18 & 19) != 18)) {
                    o0VarL.G0();
                    if ((i14 & 1) != 0 || o0VarL.o0()) {
                        String[] shortMonths = new DateFormatSymbols().getShortMonths();
                        shortMonths.getClass();
                        List listI0 = u.i0(shortMonths);
                        i19 = i17 & (-29360129);
                        if ((i16 & 256) != 0) {
                            calendar8 = Calendar.getInstance();
                            calendar8.getClass();
                            i19 = i17 & (-264241153);
                        } else {
                            calendar8 = calendar4;
                        }
                        Calendar calendar11 = Calendar.getInstance();
                        calendar11.set(1969, 11, 31);
                        int i34 = i19 & (-1879048193);
                        if ((i16 & 1024) != 0) {
                            calendar5 = Calendar.getInstance();
                            z16 = true;
                            calendar5.set(2050, 0, 1);
                        } else {
                            z16 = true;
                        }
                        calendar9 = calendar11;
                        list3 = listI0;
                        calendar10 = calendar8;
                        i24 = i34;
                    } else {
                        o0VarL.e();
                        int i35 = i17 & (-29360129);
                        if ((i16 & 256) != 0) {
                            i35 = i17 & (-264241153);
                        }
                        i24 = i35 & (-1879048193);
                        z16 = z14;
                        list3 = list;
                        calendar9 = calendar2;
                        calendar10 = calendar4;
                    }
                    Calendar calendar12 = calendar5;
                    o0VarL.h0();
                    x1 x1Var = n.f135158a;
                    z15 = z16;
                    int i36 = i24 << 12;
                    c1.f110940a.a(z15, str, null, f.c(1527212715, new p(list3, calendar10, lVar2, calendar9, calendar12, 9), o0VarL), null, str2, false, false, aVar, str3, aVar2, o0VarL, (i24 & 112) | 3462 | (458752 & (i24 << 6)) | (234881024 & i36) | (i36 & 1879048192), (i24 >> 18) & 14, 208);
                    list2 = list3;
                    calendar4 = calendar10;
                    calendar7 = calendar9;
                    calendar6 = calendar12;
                } else {
                    o0VarL.e();
                    z15 = z14;
                    list2 = list;
                    calendar6 = calendar5;
                    calendar7 = calendar2;
                }
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new k0(z15, str, str2, aVar, str3, aVar2, list2, calendar4, calendar7, calendar6, lVar, i14, i15, i16);
                }
            }
            calendar5 = calendar3;
            i18 = i15 | i30;
            if ((i15 & 48) == 0) {
                lVar2 = lVar;
                i18 |= o0VarL.r(lVar2) ? 32 : 16;
            } else {
                lVar2 = lVar;
            }
            if (o0VarL.n(i17 & 1, (306783379 & i17) == 306783378 || (i18 & 19) != 18)) {
                o0VarL.G0();
                if ((i14 & 1) != 0) {
                    String[] shortMonths2 = new DateFormatSymbols().getShortMonths();
                    shortMonths2.getClass();
                    List listI1 = u.i0(shortMonths2);
                    i19 = i17 & (-29360129);
                    if ((i16 & 256) != 0) {
                        calendar8 = Calendar.getInstance();
                        calendar8.getClass();
                        i19 = i17 & (-264241153);
                    } else {
                        calendar8 = calendar4;
                    }
                    Calendar calendar13 = Calendar.getInstance();
                    calendar13.set(1969, 11, 31);
                    int i37 = i19 & (-1879048193);
                    if ((i16 & 1024) != 0) {
                        calendar5 = Calendar.getInstance();
                        z16 = true;
                        calendar5.set(2050, 0, 1);
                    } else {
                        z16 = true;
                    }
                    calendar9 = calendar13;
                    list3 = listI1;
                    calendar10 = calendar8;
                    i24 = i37;
                } else {
                    String[] shortMonths3 = new DateFormatSymbols().getShortMonths();
                    shortMonths3.getClass();
                    List listI2 = u.i0(shortMonths3);
                    i19 = i17 & (-29360129);
                    if ((i16 & 256) != 0) {
                        calendar8 = Calendar.getInstance();
                        calendar8.getClass();
                        i19 = i17 & (-264241153);
                    } else {
                        calendar8 = calendar4;
                    }
                    Calendar calendar14 = Calendar.getInstance();
                    calendar14.set(1969, 11, 31);
                    int i38 = i19 & (-1879048193);
                    if ((i16 & 1024) != 0) {
                        calendar5 = Calendar.getInstance();
                        z16 = true;
                        calendar5.set(2050, 0, 1);
                    } else {
                        z16 = true;
                    }
                    calendar9 = calendar14;
                    list3 = listI2;
                    calendar10 = calendar8;
                    i24 = i38;
                }
                Calendar calendar15 = calendar5;
                o0VarL.h0();
                x1 x1Var2 = n.f135158a;
                z15 = z16;
                int i39 = i24 << 12;
                c1.f110940a.a(z15, str, null, f.c(1527212715, new p(list3, calendar10, lVar2, calendar9, calendar15, 9), o0VarL), null, str2, false, false, aVar, str3, aVar2, o0VarL, (i24 & 112) | 3462 | (458752 & (i24 << 6)) | (234881024 & i39) | (i39 & 1879048192), (i24 >> 18) & 14, 208);
                list2 = list3;
                calendar4 = calendar10;
                calendar7 = calendar9;
                calendar6 = calendar15;
            } else {
                o0VarL.e();
                z15 = z14;
                list2 = list;
                calendar6 = calendar5;
                calendar7 = calendar2;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new k0(z15, str, str2, aVar, str3, aVar2, list2, calendar4, calendar7, calendar6, lVar, i14, i15, i16);
            }
        }
        calendar4 = calendar;
        i17 = i28 | i29 | 268435456;
        if ((i16 & 1024) == 0) {
            calendar5 = calendar3;
            if (o0VarL.r(calendar5)) {
            }
            i18 = i15 | i30;
            if ((i15 & 48) == 0) {
                lVar2 = lVar;
                i18 |= o0VarL.r(lVar2) ? 32 : 16;
            } else {
                lVar2 = lVar;
            }
            if (o0VarL.n(i17 & 1, (306783379 & i17) == 306783378 || (i18 & 19) != 18)) {
                o0VarL.G0();
                if ((i14 & 1) != 0) {
                    String[] shortMonths4 = new DateFormatSymbols().getShortMonths();
                    shortMonths4.getClass();
                    List listI3 = u.i0(shortMonths4);
                    i19 = i17 & (-29360129);
                    if ((i16 & 256) != 0) {
                        calendar8 = Calendar.getInstance();
                        calendar8.getClass();
                        i19 = i17 & (-264241153);
                    } else {
                        calendar8 = calendar4;
                    }
                    Calendar calendar16 = Calendar.getInstance();
                    calendar16.set(1969, 11, 31);
                    int i310 = i19 & (-1879048193);
                    if ((i16 & 1024) != 0) {
                        calendar5 = Calendar.getInstance();
                        z16 = true;
                        calendar5.set(2050, 0, 1);
                    } else {
                        z16 = true;
                    }
                    calendar9 = calendar16;
                    list3 = listI3;
                    calendar10 = calendar8;
                    i24 = i310;
                } else {
                    String[] shortMonths5 = new DateFormatSymbols().getShortMonths();
                    shortMonths5.getClass();
                    List listI4 = u.i0(shortMonths5);
                    i19 = i17 & (-29360129);
                    if ((i16 & 256) != 0) {
                        calendar8 = Calendar.getInstance();
                        calendar8.getClass();
                        i19 = i17 & (-264241153);
                    } else {
                        calendar8 = calendar4;
                    }
                    Calendar calendar17 = Calendar.getInstance();
                    calendar17.set(1969, 11, 31);
                    int i311 = i19 & (-1879048193);
                    if ((i16 & 1024) != 0) {
                        calendar5 = Calendar.getInstance();
                        z16 = true;
                        calendar5.set(2050, 0, 1);
                    } else {
                        z16 = true;
                    }
                    calendar9 = calendar17;
                    list3 = listI4;
                    calendar10 = calendar8;
                    i24 = i311;
                }
                Calendar calendar18 = calendar5;
                o0VarL.h0();
                x1 x1Var3 = n.f135158a;
                z15 = z16;
                int i312 = i24 << 12;
                c1.f110940a.a(z15, str, null, f.c(1527212715, new p(list3, calendar10, lVar2, calendar9, calendar18, 9), o0VarL), null, str2, false, false, aVar, str3, aVar2, o0VarL, (i24 & 112) | 3462 | (458752 & (i24 << 6)) | (234881024 & i312) | (i312 & 1879048192), (i24 >> 18) & 14, 208);
                list2 = list3;
                calendar4 = calendar10;
                calendar7 = calendar9;
                calendar6 = calendar18;
            } else {
                o0VarL.e();
                z15 = z14;
                list2 = list;
                calendar6 = calendar5;
                calendar7 = calendar2;
            }
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new k0(z15, str, str2, aVar, str3, aVar2, list2, calendar4, calendar7, calendar6, lVar, i14, i15, i16);
            }
        }
        calendar5 = calendar3;
        i18 = i15 | i30;
        if ((i15 & 48) == 0) {
            lVar2 = lVar;
            i18 |= o0VarL.r(lVar2) ? 32 : 16;
        } else {
            lVar2 = lVar;
        }
        if (o0VarL.n(i17 & 1, (306783379 & i17) == 306783378 || (i18 & 19) != 18)) {
            o0VarL.G0();
            if ((i14 & 1) != 0) {
                String[] shortMonths6 = new DateFormatSymbols().getShortMonths();
                shortMonths6.getClass();
                List listI5 = u.i0(shortMonths6);
                i19 = i17 & (-29360129);
                if ((i16 & 256) != 0) {
                    calendar8 = Calendar.getInstance();
                    calendar8.getClass();
                    i19 = i17 & (-264241153);
                } else {
                    calendar8 = calendar4;
                }
                Calendar calendar19 = Calendar.getInstance();
                calendar19.set(1969, 11, 31);
                int i313 = i19 & (-1879048193);
                if ((i16 & 1024) != 0) {
                    calendar5 = Calendar.getInstance();
                    z16 = true;
                    calendar5.set(2050, 0, 1);
                } else {
                    z16 = true;
                }
                calendar9 = calendar19;
                list3 = listI5;
                calendar10 = calendar8;
                i24 = i313;
            } else {
                String[] shortMonths7 = new DateFormatSymbols().getShortMonths();
                shortMonths7.getClass();
                List listI6 = u.i0(shortMonths7);
                i19 = i17 & (-29360129);
                if ((i16 & 256) != 0) {
                    calendar8 = Calendar.getInstance();
                    calendar8.getClass();
                    i19 = i17 & (-264241153);
                } else {
                    calendar8 = calendar4;
                }
                Calendar calendar110 = Calendar.getInstance();
                calendar110.set(1969, 11, 31);
                int i314 = i19 & (-1879048193);
                if ((i16 & 1024) != 0) {
                    calendar5 = Calendar.getInstance();
                    z16 = true;
                    calendar5.set(2050, 0, 1);
                } else {
                    z16 = true;
                }
                calendar9 = calendar110;
                list3 = listI6;
                calendar10 = calendar8;
                i24 = i314;
            }
            Calendar calendar111 = calendar5;
            o0VarL.h0();
            x1 x1Var4 = n.f135158a;
            z15 = z16;
            int i315 = i24 << 12;
            c1.f110940a.a(z15, str, null, f.c(1527212715, new p(list3, calendar10, lVar2, calendar9, calendar111, 9), o0VarL), null, str2, false, false, aVar, str3, aVar2, o0VarL, (i24 & 112) | 3462 | (458752 & (i24 << 6)) | (234881024 & i315) | (i315 & 1879048192), (i24 >> 18) & 14, 208);
            list2 = list3;
            calendar4 = calendar10;
            calendar7 = calendar9;
            calendar6 = calendar111;
        } else {
            o0VarL.e();
            z15 = z14;
            list2 = list;
            calendar6 = calendar5;
            calendar7 = calendar2;
        }
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(z15, str, str2, aVar, str3, aVar2, list2, calendar4, calendar7, calendar6, lVar, i14, i15, i16);
        }
    }
}

package rn1;

import a11.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.c0;
import gl1.y;
import h4.r;
import l72.v2;
import m92.o;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void a(mm1.b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, e23.l<? super c0, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        LocalDate localDate3;
        boolean z15;
        int i17;
        e23.l<? super c0, Unit> lVar2;
        int i18;
        boolean z16;
        boolean z17;
        e23.l<? super c0, Unit> lVar3;
        p2 p2VarI0;
        boolean z18;
        boolean zF;
        int i19;
        Object obj = bVar;
        o0 o0VarE = mVar.E(-260938115);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(obj) : o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            localDate3 = localDate;
            i16 |= o0VarE.r(localDate3) ? 32 : 16;
        } else {
            localDate3 = localDate;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(localDate2) ? 256 : 128;
        }
        int i24 = i15 & 8;
        if (i24 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((i16 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i24 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i17 != 0) {
                        lVar2 = null;
                    }
                    x1 x1Var = p3.n.f135158a;
                    sn1.b.f160414a.getClass();
                    zF = sn1.b.f();
                    String strQ = y.Q(o0VarE, R.string.msg_no_sleep_duration_data);
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), o0VarE);
                    r rVarB = v2.b(aVar, lVar2, new b82.i(25), o0VarE, ((i16 >> 9) & 112) | 6);
                    if (zF) {
                        i19 = R.string.lbl_sleep_duration_vs_sleep_need;
                    } else {
                        i19 = R.string.lbl_sleep_duration;
                    }
                    String strQ2 = y.Q(o0VarE, i19);
                    bt1.m mVar2 = new bt1.m(localDate3, localDate2, zF, obj, strQ, 24);
                    obj = obj;
                    o.a(rVarB, strQ2, null, null, z3.f.c(-1100082691, mVar2, o0VarE), null, z3.f.c(196372223, new u(obj, z18, zF, 5), o0VarE), o0VarE, 1597440, 44);
                    lVar3 = lVar2;
                    z17 = z18;
                } else {
                    o0VarE.e();
                    z17 = z15;
                    lVar3 = lVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a82.a(obj, localDate, localDate2, z17, lVar3, i14, i15, 14);
                }
            }
            i16 |= 24576;
            lVar2 = lVar;
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i17 != 0) {
                    lVar2 = null;
                }
                x1 x1Var2 = p3.n.f135158a;
                sn1.b.f160414a.getClass();
                zF = sn1.b.f();
                String strQ3 = y.Q(o0VarE, R.string.msg_no_sleep_duration_data);
                r.a aVar2 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar2, j92.b.f97899b.f97920e), o0VarE);
                r rVarB2 = v2.b(aVar2, lVar2, new b82.i(25), o0VarE, ((i16 >> 9) & 112) | 6);
                if (zF) {
                    i19 = R.string.lbl_sleep_duration_vs_sleep_need;
                } else {
                    i19 = R.string.lbl_sleep_duration;
                }
                String strQ4 = y.Q(o0VarE, i19);
                bt1.m mVar3 = new bt1.m(localDate3, localDate2, zF, obj, strQ3, 24);
                obj = obj;
                o.a(rVarB2, strQ4, null, null, z3.f.c(-1100082691, mVar3, o0VarE), null, z3.f.c(196372223, new u(obj, z18, zF, 5), o0VarE), o0VarE, 1597440, 44);
                lVar3 = lVar2;
                z17 = z18;
            } else {
                o0VarE.e();
                z17 = z15;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(obj, localDate, localDate2, z17, lVar3, i14, i15, 14);
            }
        }
        i16 |= 3072;
        z15 = z14;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((i16 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i24 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i17 != 0) {
                    lVar2 = null;
                }
                x1 x1Var3 = p3.n.f135158a;
                sn1.b.f160414a.getClass();
                zF = sn1.b.f();
                String strQ5 = y.Q(o0VarE, R.string.msg_no_sleep_duration_data);
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar3, j92.b.f97899b.f97920e), o0VarE);
                r rVarB3 = v2.b(aVar3, lVar2, new b82.i(25), o0VarE, ((i16 >> 9) & 112) | 6);
                if (zF) {
                    i19 = R.string.lbl_sleep_duration_vs_sleep_need;
                } else {
                    i19 = R.string.lbl_sleep_duration;
                }
                String strQ6 = y.Q(o0VarE, i19);
                bt1.m mVar4 = new bt1.m(localDate3, localDate2, zF, obj, strQ5, 24);
                obj = obj;
                o.a(rVarB3, strQ6, null, null, z3.f.c(-1100082691, mVar4, o0VarE), null, z3.f.c(196372223, new u(obj, z18, zF, 5), o0VarE), o0VarE, 1597440, 44);
                lVar3 = lVar2;
                z17 = z18;
            } else {
                o0VarE.e();
                z17 = z15;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(obj, localDate, localDate2, z17, lVar3, i14, i15, 14);
            }
        }
        i16 |= 24576;
        lVar2 = lVar;
        if ((i16 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i24 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            if (i17 != 0) {
                lVar2 = null;
            }
            x1 x1Var4 = p3.n.f135158a;
            sn1.b.f160414a.getClass();
            zF = sn1.b.f();
            String strQ7 = y.Q(o0VarE, R.string.msg_no_sleep_duration_data);
            r.a aVar4 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar4, j92.b.f97899b.f97920e), o0VarE);
            r rVarB4 = v2.b(aVar4, lVar2, new b82.i(25), o0VarE, ((i16 >> 9) & 112) | 6);
            if (zF) {
                i19 = R.string.lbl_sleep_duration_vs_sleep_need;
            } else {
                i19 = R.string.lbl_sleep_duration;
            }
            String strQ8 = y.Q(o0VarE, i19);
            bt1.m mVar5 = new bt1.m(localDate3, localDate2, zF, obj, strQ7, 24);
            obj = obj;
            o.a(rVarB4, strQ8, null, null, z3.f.c(-1100082691, mVar5, o0VarE), null, z3.f.c(196372223, new u(obj, z18, zF, 5), o0VarE), o0VarE, 1597440, 44);
            lVar3 = lVar2;
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z15;
            lVar3 = lVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(obj, localDate, localDate2, z17, lVar3, i14, i15, 14);
        }
    }
}

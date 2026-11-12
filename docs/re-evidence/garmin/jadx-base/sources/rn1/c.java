package rn1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import m92.o;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void a(mm1.b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, p3.m mVar, int i14, int i15) {
        int i16;
        Object obj;
        Object obj2;
        boolean z15;
        boolean z16;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        String strJ;
        mm1.b bVar2 = bVar;
        o0 o0VarE = mVar.E(1700150198);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(bVar2) : o0VarE.r(bVar2) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = localDate;
            i16 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = localDate;
        }
        if ((i14 & 384) == 0) {
            obj2 = localDate2;
            i16 |= o0VarE.r(obj2) ? 256 : 128;
        } else {
            obj2 = localDate2;
        }
        int i17 = i15 & 8;
        if (i17 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                String strQ = y.Q(o0VarE, R.string.msg_no_sleep_consistency_data);
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), o0VarE);
                if (z18) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1756779876, R.string.lbl_sleep_consistency, o0VarE, false);
                } else {
                    o0VarE.C(-1374348409);
                    o0VarE.g0(false);
                    strJ = null;
                }
                String str = strJ;
                qy0.d dVar = new qy0.d(obj, obj2, bVar2, strQ, 9);
                bVar2 = bVar2;
                o.a(null, str, null, null, z3.f.c(1593026358, dVar, o0VarE), null, z3.f.c(1931529528, new a(bVar2, 1), o0VarE), o0VarE, 1597440, 45);
                z17 = z18;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aa2.g(bVar2, localDate, localDate2, z17, i14, i15, 16);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i17 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = p3.n.f135158a;
            String strQ2 = y.Q(o0VarE, R.string.msg_no_sleep_consistency_data);
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar2, j92.b.f97899b.f97920e), o0VarE);
            if (z18) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1756779876, R.string.lbl_sleep_consistency, o0VarE, false);
            } else {
                o0VarE.C(-1374348409);
                o0VarE.g0(false);
                strJ = null;
            }
            String str2 = strJ;
            qy0.d dVar2 = new qy0.d(obj, obj2, bVar2, strQ2, 9);
            bVar2 = bVar2;
            o.a(null, str2, null, null, z3.f.c(1593026358, dVar2, o0VarE), null, z3.f.c(1931529528, new a(bVar2, 1), o0VarE), o0VarE, 1597440, 45);
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(bVar2, localDate, localDate2, z17, i14, i15, 16);
        }
    }

    public static final b92.a b(String str) {
        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
        c0235a.f16962a.put("merge", str);
        return c0235a.b();
    }
}

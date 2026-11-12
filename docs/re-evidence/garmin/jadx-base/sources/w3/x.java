package w3;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import l72.c1;
import lc.h0;
import lc.k0;
import lc.m0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.p0;
import s5.q0;
import s5.x0;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    public static final void a(int i14, e23.a aVar, e23.a aVar2, String str, p3.m mVar, boolean z14) {
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-211640848);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(19673080);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.pregnancy_something_went_wrong);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_retry);
                String strQ3 = gl1.y.Q(o0VarE, R.string.common_cancel);
                boolean z15 = (i15 & 896) == 256;
                Object objQ = o0VarE.q();
                p3.m.a aVar3 = p3.m.f135153a;
                if (z15) {
                    objQ = new wv0.v(aVar, 5);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new wv0.v(aVar, 5);
                        o0VarE.K(objQ);
                    }
                }
                e23.a<Unit> aVar4 = (e23.a) objQ;
                boolean z16 = (i15 & 7168) == 2048;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new wv0.v(aVar2, 6);
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new wv0.v(aVar2, 6);
                        o0VarE.K(objQ2);
                    }
                }
                c1Var.a(false, strQ, str, null, null, strQ2, false, false, aVar4, strQ3, (e23.a) objQ2, o0VarE, ((i15 << 3) & 896) | 6, 0, 216);
                o0VarE.g0(false);
            } else {
                o0VarE.C(20073042);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x70.f(z14, str, aVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    public static final void b(qi2.c cVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        Object value;
        Object obj;
        o0 o0VarE = mVar.E(-1638091134);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 16;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        int i17 = 8;
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            v9.a aVar = v9.a.f176280a;
            o0VarE.C(1172442918);
            int iP = o0VarE.P();
            d53.a.a(36);
            String string = Integer.toString(iP, 36);
            string.getClass();
            String strConcat = "rememberViewModelStoreOwner#".concat(string);
            b0 lifecycle = ((n0) o0VarE.A(s9.j.f158018a)).getF158016a();
            o0VarE.C(-1633490746);
            boolean zR = o0VarE.r(cVar) | o0VarE.r(lifecycle);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new w02.b(i16, cVar, lifecycle);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w02.b(i16, cVar, lifecycle);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            o0VarE.g0(false);
            o0VarE.L(419377738);
            aVar.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            t0 t0Var = s0.f105811a;
            k23.d dVarB = t0Var.b(wi2.p.class);
            u9.b bVar = new u9.b();
            bVar.a(t0Var.b(wi2.p.class), lVar);
            u1 u1VarA = v9.b.a(dVarB, viewModelStoreOwnerA, strConcat, bVar.b(), viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            o0VarE.g0(false);
            wi2.p pVar = (wi2.p) u1VarA;
            wi2.p.c cVar2 = pVar.f185683d;
            lifecycle.getClass();
            if (!cVar.equals(pVar.f185680a)) {
                pVar.f185680a = cVar;
                cVar2.f185700a.a();
            }
            r53.p2 p2Var = pVar.f185681b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, lifecycle));
            Unit unit = Unit.INSTANCE;
            o0VarE.C(5004770);
            boolean zB = o0VarE.B(pVar);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new vu1.b(pVar, 15);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new vu1.b(pVar, 15);
                    o0VarE.K(objQ2);
                }
            }
            o0VarE.g0(false);
            l0.a(unit, (e23.l) objQ2, o0VarE);
            o0VarE.C(5004770);
            boolean zB2 = o0VarE.B(pVar);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                o0VarE.K(cVar2);
                obj = cVar2;
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    o0VarE.K(cVar2);
                    obj = cVar2;
                } else {
                    obj = objQ3;
                }
            }
            o0VarE.g0(false);
            x1 x1Var2 = p3.n.f135158a;
            o0VarE.g0(false);
            p3.v.a(v9.a.f176281b.c((ViewModelStoreOwner) obj), eVar, o0VarE, (i15 & 112) | 8);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(cVar, eVar, i14, i17);
        }
    }

    public static String c(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Object[] d(Object[] objArr, int i14, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        p13.s.j(objArr, objArr2, 0, i14, 6);
        p13.s.h(objArr, objArr2, i14 + 2, i14, objArr.length);
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] e(int i14, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        p13.s.j(objArr, objArr2, 0, i14, 6);
        p13.s.h(objArr, objArr2, i14, i14 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] f(int i14, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        p13.s.j(objArr, objArr2, 0, i14, 6);
        p13.s.h(objArr, objArr2, i14, i14 + 1, objArr.length);
        return objArr2;
    }

    public static final x0 g(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        d92.b.f58623a.getClass();
        d92.b.f58624b.getClass();
        return d92.c.b(d92.c.e(j92.f.f97932i), mVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int h(int i14, int i15, int i16, boolean z14) {
        if (i15 >= i16) {
            if (z14) {
                return 0;
            }
            return i16 - i15;
        }
        if (z14) {
            if (z14) {
                if (z14) {
                    return i16 - i15;
                }
                return 0;
            }
            if (z14) {
                return 0;
            }
            return i16 - i15;
        }
        if (z14 ? i16 - i15 <= i14 : i15 > i14) {
            if (z14) {
                return 0;
            }
            return i16 - i15;
        }
        if (z14) {
            return i14 - i15;
        }
        return i14;
    }

    public static final x0 i(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        d92.b.f58623a.getClass();
        d92.b.f58624b.getClass();
        return d92.c.f(j92.f.f97933j, mVar);
    }

    public static final String j(Context context, String str) {
        context.getClass();
        if (str == null || d53.w.J(str)) {
            return "";
        }
        pi0.e eVar = new pi0.e(context);
        DateTime dateTimeN = j0.N(str, false);
        return dateTimeN == null ? "" : eVar.a(dateTimeN, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
    }

    public static final String k(Context context, String str) {
        context.getClass();
        if (str == null || d53.w.J(str)) {
            return "";
        }
        pi0.e eVar = new pi0.e(context);
        DateTime dateTimeN = j0.N(str, false);
        return dateTimeN == null ? "" : eVar.c(dateTimeN, qi0.f.RELATIVE_24H_AM_PM_TIME);
    }

    public static final ww0.a l(Integer num) {
        for (ww0.a aVar : ww0.a.values()) {
            int iOrdinal = aVar.ordinal();
            if (num != null && iOrdinal == num.intValue()) {
                return aVar;
            }
        }
        return ww0.a.NONE;
    }

    public static final String m(fs2.a aVar) {
        zo2.a aVar2;
        if (aVar != null) {
            try {
                aVar2 = (zo2.a) fs2.a.f(aVar, zo2.a.class);
            } catch (Exception unused) {
                aVar2 = null;
            }
            if (aVar2 != null) {
                try {
                    return aVar2.getPaymentCardId();
                } catch (Exception unused2) {
                }
            }
        }
        return null;
    }

    public static final d6.g n(q0 q0Var, int i14) {
        p0 p0Var = q0Var.f157280a;
        s5.o oVar = q0Var.f157281b;
        if (p0Var.f157265a.length() != 0) {
            int iD = oVar.d(i14);
            if ((i14 != 0 && iD == oVar.d(i14 - 1)) || (i14 != q0Var.f157280a.f157265a.f157138b.length() && iD == oVar.d(i14 + 1))) {
                return q0Var.a(i14);
            }
        }
        return q0Var.j(i14);
    }

    public static final void o(Throwable th3, t13.g gVar) {
        if (th3 instanceof CancellationException) {
            return;
        }
        try {
            k13.a.b(th3);
        } catch (Throwable th4) {
            o13.g.a(th3, th4);
            kotlinx.coroutines.a.a(th3, gVar);
        }
    }

    public static final int p(int i14, int i15) {
        return (i14 >> i15) & 31;
    }

    public static final boolean q(fs2.a aVar) {
        qs2.a aVar2;
        qs2.e[] eVarArr;
        return aVar.f73432g == qs2.g.PAYMENT_CARD && aVar.f73427b == is2.b.FITPAY && (aVar2 = aVar.f73428c) != null && (eVarArr = aVar2.f147397b) != null && p13.u.z(eVarArr, qs2.e.PAYMENT);
    }

    public static final boolean r(fs2.a aVar) {
        qs2.e[] eVarArr;
        aVar.getClass();
        qs2.a aVar2 = aVar.f73428c;
        return (aVar2 == null || (eVarArr = aVar2.f147397b) == null || !p13.u.z(eVarArr, qs2.e.TRANSIT)) ? false : true;
    }

    public static final void s(lc.y yVar, String str, Bundle bundle) {
        yVar.getClass();
        h0 h0VarB = yVar.b(str);
        if (h0VarB != null) {
            yVar.g(h0VarB.f111773b.f144346e, bundle);
        }
    }

    public static void t(k0 k0Var, m0 m0Var, zx1.a aVar, fe feVar, int i14) {
        if ((i14 & 8) != 0) {
            feVar = null;
        }
        k0Var.getClass();
        m0Var.getClass();
        aVar.getClass();
        nc.n.b(k0Var, aVar.c(), aVar.b(), p13.j0.f134944a, null, null, null, null, new z3.e(1139088385, true, new ul.a(aVar, m0Var, feVar, 10)), 248);
    }

    public static final Boolean u(String str) {
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static final xw2.b v(sd2.f fVar) {
        long unitID = fVar.getUnitID();
        String strD0 = fVar.d0();
        if (strD0 == null && (strD0 = fVar.Q()) == null) {
            return null;
        }
        String productDisplayName = fVar.getProductDisplayName();
        productDisplayName.getClass();
        return new xw2.b(unitID, strD0, productDisplayName, zb0.t.d(fVar));
    }

    public static final String w(String str) {
        str.getClass();
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (d53.w.A("!#$&'\"()*+,/:;=?@[]{}% ", cCharAt)) {
                d53.a.a(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                String upperCase = "%".concat(string).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb3.append(upperCase);
            } else {
                sb3.append(cCharAt);
            }
        }
        return sb3.toString();
    }
}

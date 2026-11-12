package g63;

import org.apache.commons.lang3.StringUtils;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static final <Target> o<Target> a(Integer num, Integer num2, Integer num3, a<? super Target, Integer> aVar, String str, boolean z14) {
        int iIntValue;
        aVar.getClass();
        str.getClass();
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z14 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z14) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return b(z14, aVar, str, iIntValue2, iIntValue);
        }
        o<Target> oVarB = b(z14, aVar, str, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            j0 j0Var = j0.f134944a;
            iIntValue2++;
            oVarB = new o<>(j0Var, p13.x.k(b(z14, aVar, str, iIntValue2, iIntValue2), zf.b.j(p13.x.k(new o(p13.w.c(new q(StringUtils.SPACE)), j0Var), oVarB))));
        }
        if (iIntValue3 > iIntValue) {
            return zf.b.j(p13.x.k(new o(p13.w.c(new q(d53.u.u(StringUtils.SPACE, iIntValue3 - iIntValue))), j0.f134944a), oVarB));
        }
        return iIntValue3 == iIntValue ? oVarB : new o<>(j0.f134944a, p13.x.k(b(z14, aVar, str, iIntValue3 + 1, iIntValue), oVarB));
    }

    public static final <Target> o<Target> b(boolean z14, a<? super Target, Integer> aVar, String str, int i14, int i15) {
        if (i15 < (z14 ? 1 : 0) + 1) {
            vb.h.z("Check failed.");
            return null;
        }
        q13.b bVarB = p13.w.b();
        if (z14) {
            bVarB.add(new q("-"));
        }
        bVarB.add(new g(p13.w.c(new x(Integer.valueOf(i14 - (z14 ? 1 : 0)), Integer.valueOf(i15 - (z14 ? 1 : 0)), aVar, str, z14))));
        return new o<>(p13.w.a(bVarB), j0.f134944a);
    }
}

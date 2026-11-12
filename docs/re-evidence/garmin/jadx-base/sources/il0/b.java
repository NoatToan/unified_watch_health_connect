package il0;

import android.util.SparseArray;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import sd2.i;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final a a(i iVar, m3 m3Var, c cVar) {
        m3 m3Var2;
        m3Var.getClass();
        String name = iVar.getName();
        Integer numR = iVar.r();
        String strR = null;
        if (name == null || numR == null) {
            return null;
        }
        int iIntValue = numR.intValue();
        Long lD = iVar.d();
        if (lD != null) {
            long jLongValue = lD.longValue();
            l3.a aVar = l3.f23124b;
            DecimalFormat decimalFormat = l3.f23137o;
            aVar.getClass();
            m3Var2 = m3Var;
            strR = l3.a.R(null, jLongValue, m3Var2, decimalFormat, false, null);
        } else {
            m3Var2 = m3Var;
        }
        String str = strR;
        int i14 = m3Var2.f23160a ? R.string.lbl_km : R.string.lbl_mile;
        Integer numJ = iVar.j();
        String strT = iVar.t();
        String city = iVar.getCity();
        String state = iVar.getState();
        String strB = iVar.b();
        String country = iVar.getCountry();
        Integer numQ = iVar.q();
        Integer numO = iVar.o();
        String strF = iVar.f();
        String email = iVar.getEmail();
        String strH = iVar.h();
        String strI = iVar.i();
        String strK = iVar.k();
        String strY = iVar.y();
        Integer numG = iVar.g();
        d.f93967d.getClass();
        SparseArray<d> sparseArray = d.f93968e;
        Integer numU = iVar.u();
        numU.getClass();
        d dVar = sparseArray.get(numU.intValue());
        if (dVar == null) {
            dVar = d.NO_VALUE;
        }
        return new a(iIntValue, name, cVar, str, i14, numJ, strT, city, state, strB, country, numQ, numO, strF, email, strH, strI, strK, strY, numG, dVar, iVar.getVersion());
    }
}

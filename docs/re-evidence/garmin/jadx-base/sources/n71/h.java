package n71;

import a61.i0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final String a(Context context, g gVar) {
        String strV;
        context.getClass();
        gVar.getClass();
        if (gVar instanceof g.a) {
            String string = context.getString(((g.a) gVar).f124840a);
            string.getClass();
            return string;
        }
        if (!(gVar instanceof g.b)) {
            u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.performance.dto.c cVar = ((g.b) gVar).f124841a;
        String str = cVar.f39883a;
        if (str.equalsIgnoreCase("Unknown")) {
            String string2 = context.getString(R.string.lbl_unknown);
            string2.getClass();
            return string2;
        }
        i0.f1604c.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = i0.f1606e;
        return (fVar == null || (strV = zf.b.v(fVar, str, cVar.b())) == null) ? cVar.b() : strV;
    }
}

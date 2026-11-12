package qp0;

import androidx.core.view.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp0.e;
import sp0.b;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final float a(double d14, double d15) {
        if (d14 <= d15) {
            d14 = d15;
        }
        if (d14 < 100.0d) {
            float f14 = 10;
            float fCeil = ((float) Math.ceil(((float) d14) / f14)) * f14;
            return fCeil % ((float) 20) == 0.0f ? fCeil : fCeil + f14;
        }
        if (d14 < 100.0d) {
            return (float) d14;
        }
        float f15 = 100;
        float fCeil2 = ((float) Math.ceil(((float) d14) / f15)) * f15;
        return fCeil2 % ((float) 200) == 0.0f ? fCeil2 : fCeil2 + f15;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayListL = j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            arrayListL.add(new b(eVar.d(), eVar.getValue(), eVar.b()));
        }
        return arrayListL;
    }
}

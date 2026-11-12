package ss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public static final List a(int i14, List list) {
        g gVar;
        if (list == null || list.isEmpty()) {
            gVar = new g(0.0d, 0.0d, 3, null);
        } else {
            Iterator it = list.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                Double d14 = (Double) it.next();
                if (d14 != null && !Double.isNaN(d14.doubleValue())) {
                    dDoubleValue += d14.doubleValue();
                }
            }
            double size = dDoubleValue / ((double) list.size());
            Iterator it3 = list.iterator();
            double dPow = 0.0d;
            while (it3.hasNext()) {
                Double d15 = (Double) it3.next();
                if (d15 != null && !Double.isNaN(d15.doubleValue())) {
                    dPow += Math.pow(d15.doubleValue() - size, 2);
                }
            }
            double dSqrt = size - (Math.sqrt(dPow / ((double) list.size())) * 1.5d);
            Iterator it4 = list.iterator();
            double dDoubleValue2 = Double.MIN_VALUE;
            double dDoubleValue3 = Double.MAX_VALUE;
            while (it4.hasNext()) {
                Double d16 = (Double) it4.next();
                if (d16 != null && d16.doubleValue() >= dSqrt && d16.doubleValue() < dDoubleValue3) {
                    dDoubleValue3 = d16.doubleValue();
                }
                if (d16 != null && d16.doubleValue() < ((double) 2) * size && d16.doubleValue() > dDoubleValue2) {
                    dDoubleValue2 = d16.doubleValue();
                }
            }
            if (dDoubleValue3 == Double.MAX_VALUE) {
                dDoubleValue3 = 0.0d;
            }
            gVar = new g(dDoubleValue3, dDoubleValue2 == Double.MIN_VALUE ? 0.0d : dDoubleValue2);
        }
        double d17 = gVar.f160602a;
        double d18 = gVar.f160603b;
        if (d17 == d18) {
            return w.c(Double.valueOf(d17));
        }
        if (Double.isNaN(d18) || Double.isNaN(d17)) {
            return j0.f134944a;
        }
        double d19 = (d18 - d17) / ((double) i14);
        ArrayList arrayList = new ArrayList();
        while (d17 <= d18) {
            arrayList.add(Double.valueOf(d17));
            d17 += d19;
        }
        return arrayList;
    }
}

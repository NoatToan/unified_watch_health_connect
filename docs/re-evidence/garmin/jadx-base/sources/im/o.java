package im;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94168a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.SEATED_STANDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.AUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.LUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94168a = iArr;
        }
    }

    public static final ArrayList a(com.garmin.android.apps.connectmobile.activities.newmodel.o.d dVar, n nVar) {
        List listK;
        nVar.getClass();
        double d14 = dVar.f29622d;
        double d15 = dVar.f29620b;
        int i14 = a.f94168a[nVar.ordinal()];
        if (i14 == 1) {
            listK = p13.x.k(Double.valueOf(dVar.f29619a), Double.valueOf(d15));
        } else if (i14 == 2) {
            listK = p13.x.k(Double.valueOf(dVar.f29621c), Double.valueOf(d14), Double.valueOf(d15));
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            listK = p13.x.k(Double.valueOf(dVar.f29623e), Double.valueOf(d14), Double.valueOf(d15));
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            Double dValueOf = Double.valueOf(dDoubleValue);
            if (Double.isNaN(dDoubleValue)) {
                dValueOf = null;
            }
            arrayList.add(dValueOf);
        }
        return arrayList;
    }
}

package tv0;

import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv0/b;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public static ArrayList a(ArrayList arrayList, boolean z14) {
        boolean zK;
        pv0.w.f141433b.getClass();
        ?? K = x.k(pv0.w.LIGHT_EXERCISE, pv0.w.MODERATE_EXERCISE, pv0.w.VIGOROUS_EXERCISE, pv0.w.LIGHT_EXERCISE_BEFORE_BED, pv0.w.MODERATE_EXERCISE_BEFORE_BED, pv0.w.VIGOROUS_EXERCISE_BEFORE_BED);
        ArrayList arrayList2 = new ArrayList(y.r(K, 10));
        Iterator it = K.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((pv0.w) it.next()).f141457a));
        }
        Set setG1 = h0.g1(arrayList2);
        if (!z14) {
            K = new ArrayList();
            for (Object obj : arrayList) {
                if (setG1.contains(Long.valueOf(((pv0.w) obj).f141457a))) {
                    K.add(obj);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : K) {
            pv0.w wVar = (pv0.w) obj2;
            switch (wVar == null ? -1 : pv0.x.a.f141458a[wVar.ordinal()]) {
                case 4:
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    zK = k1.f37122a.k();
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    k1.f37122a.getClass();
                    zK = bo1.a.a().c().J0();
                    break;
                default:
                    zK = true;
                    break;
            }
            if (zK) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }
}

package tv0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv0/a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    public static ArrayList a(String str, pv0.k kVar, pv0.p pVar, List list) {
        Long l14;
        str.getClass();
        kVar.getClass();
        pVar.getClass();
        list.getClass();
        ow0.a.f134291a.getClass();
        boolean zA = ow0.a.a(list);
        pv0.d.Companion companion = pv0.d.INSTANCE;
        List<pv0.d> listA = pv0.f.a(list, pv0.b.CUSTOM);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            pv0.d dVar = (pv0.d) obj;
            dVar.getClass();
            if (dVar.f141358a < 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((pv0.d) it.next()).f141358a);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((pv0.d) it.next()).f141358a);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
            l14 = lValueOf;
        } else {
            l14 = null;
        }
        long jLongValue = l14 != null ? l14.longValue() - 1 : -1000L;
        String str2 = kVar.f141387a;
        boolean z14 = pVar == pv0.p.SLEEP_RELATED;
        companion.getClass();
        str2.getClass();
        return h0.D0(list, new pv0.d(jLongValue, (Long) null, str2, str, (Boolean) null, (List) null, (z14 ? pv0.b.CUSTOM_SLEEP_RELATED : pv0.b.CUSTOM).f141351a, Boolean.valueOf(zA), Boolean.valueOf(z14), (Integer) null, 562, (p005kotlin.jvm.internal.j) null));
    }
}

package tv0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv0/w;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {
    public static List a(long j8, List list) {
        list.getClass();
        pv0.d dVarC = pv0.f.c(j8, list);
        if (dVarC == null || !pv0.f.f(dVarC)) {
            ow0.a.f134291a.getClass();
            if (!ow0.a.a(list)) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pv0.d dVarA = (pv0.d) it.next();
            if (dVarA.f141358a == j8) {
                Boolean bool = dVarA.f141365h;
                dVarA = pv0.d.a(dVarA, null, bool != null ? Boolean.valueOf(!bool.booleanValue()) : null, 895);
            }
            arrayList.add(dVarA);
        }
        return arrayList;
    }
}

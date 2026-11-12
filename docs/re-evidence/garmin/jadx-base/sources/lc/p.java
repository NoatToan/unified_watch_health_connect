package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llc/p;", "Llc/g;", "", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends g<List<? extends Long>> {
    public p() {
        super(true);
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return p13.u.h0(longArray);
        }
        gg.b.J(str);
        throw null;
    }

    @Override // lc.q0
    public final String b() {
        return "List<Long>";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        q qVar = q0.f111842g;
        return list != null ? p13.h0.C0(list, p13.w.c(qVar.h(str))) : p13.w.c(qVar.h(str));
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return p13.w.c(q0.f111842g.h(str));
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            bundle.putLongArray(str, p13.h0.c1(list));
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return p13.m.b(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
    }

    @Override // lc.g
    public final List<? extends Long> h() {
        return p13.j0.f134944a;
    }

    @Override // lc.g
    public final List i(List<? extends Long> list) {
        List<? extends Long> list2 = list;
        if (list2 == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }
}

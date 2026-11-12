package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llc/b1;", "Llc/g;", "", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b1 extends g<List<? extends String>> {
    public b1() {
        super(true);
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        return p13.u.i0(nd.b.i(bundle, str));
    }

    @Override // lc.q0
    public final String b() {
        return "List<String>";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        return list != null ? p13.h0.C0(list, p13.w.c(str)) : p13.w.c(str);
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return p13.w.c(str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list == null) {
            bundle.putString(str, null);
            return;
        }
        String[] strArr = (String[]) list.toArray(new String[0]);
        strArr.getClass();
        bundle.putStringArray(str, strArr);
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return p13.m.b(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
    }

    @Override // lc.g
    public final List<? extends String> h() {
        return p13.j0.f134944a;
    }

    @Override // lc.g
    public final List i(List<? extends String> list) {
        List<? extends String> list2 = list;
        if (list2 == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(r0.a(r0.f111862a, (String) it.next()));
        }
        return arrayList;
    }
}

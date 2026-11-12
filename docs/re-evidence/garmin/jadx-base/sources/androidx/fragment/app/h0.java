package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/h0;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f7262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f7263b;

    static {
        new h0();
        f7262a = new i0();
        l0 l0Var = null;
        try {
            l0Var = (l0) androidx.transition.e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f7263b = l0Var;
    }

    private h0() {
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z14, p1.a aVar) {
        aVar.getClass();
        if ((z14 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(aVar.size());
            Iterator it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(aVar.size());
            Iterator it3 = aVar.entrySet().iterator();
            while (it3.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it3.next()).getKey());
            }
        }
    }

    public static final String b(p1.a<String, String> aVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (p1.a.C2557a) aVar.entrySet()) {
            if (p005kotlin.jvm.internal.s.g(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) p13.h0.d0(arrayList);
    }

    public static final void c(int i14, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i14);
        }
    }
}

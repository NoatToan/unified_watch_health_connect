package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class fdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<b> f17681a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<a, Set<String>> f17682b = new ConcurrentHashMap();

    public interface a {
        void a(View view, String str);
    }

    public interface b {
        String a();

        void b(View view);
    }

    public static String a(View view) {
        Object tag = view.getTag(fqi.f18090r);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void addViewListener(b bVar) {
        f17681a.add(bVar);
    }

    public static void b(View view) {
        String strA = a(view);
        if (strA == null) {
            return;
        }
        Iterator<b> it = f17681a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (strA.equals(next.a())) {
                next.b(view);
                it.remove();
            }
        }
        for (Map.Entry<a, Set<String>> entry : f17682b.entrySet()) {
            Set<String> value = entry.getValue();
            if (value != null && value.contains(strA)) {
                entry.getKey().a(view, strA);
            }
        }
    }

    public static void removeViewListener(b bVar) {
        f17681a.remove(bVar);
    }

    public static void removeViewsListener(a aVar) {
        f17682b.remove(aVar);
    }
}

package dw2;

import fb1.c;
import gw2.i;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldw2/b;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f61449a = new b();

    private b() {
    }

    public static Map a(int i14, Map map) {
        List list;
        map.getClass();
        Object obj = map.get(i.ROWS.f79975a);
        try {
            if (!(obj instanceof List)) {
                obj = null;
            }
            list = (List) obj;
        } catch (ClassCastException unused) {
            list = null;
        }
        if (list != null) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                Map map2 = (Map) listIterator.next();
                if (c.f(map2, i.ROW_ID.f79975a, cx2.b.f56665a) == i14) {
                    return map2;
                }
            }
        }
        return null;
    }
}

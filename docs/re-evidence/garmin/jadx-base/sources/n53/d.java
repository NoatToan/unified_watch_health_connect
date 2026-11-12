package n53;

import java.util.Map;
import p005kotlin.Metadata;
import p13.g;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln53/d;", "", "<init>", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f123789a = new d();

    private d() {
    }

    public static boolean a(Map map, Map.Entry entry) {
        map.getClass();
        entry.getClass();
        Object obj = map.get(entry.getKey());
        if (obj != null) {
            return obj.equals(entry.getValue());
        }
        return entry.getValue() == null && map.containsKey(entry.getKey());
    }

    public static boolean b(g gVar, Map map) {
        map.getClass();
        if (gVar.size() != map.size()) {
            h.s("Failed requirement.");
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            f123789a.getClass();
            if (!a(gVar, entry)) {
                return false;
            }
        }
        return true;
    }
}

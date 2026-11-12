package di;

import androidx.core.view.j;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi/g;", "", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f59707a = new g();

    private g() {
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 4;
        }
        if (obj instanceof String) {
            return x63.b.b((String) obj).length;
        }
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return 8;
        }
        boolean z14 = obj instanceof List;
        g gVar = f59707a;
        int iA = 0;
        if (z14) {
            for (Object obj2 : (Iterable) obj) {
                gVar.getClass();
                iA += a(obj2);
            }
            return 16 + iA;
        }
        if (obj instanceof ci.b) {
            return x63.b.b(((ci.b) obj).f27597a).length + 16;
        }
        if (!(obj instanceof Map)) {
            j.A(obj, "Unknown field type in Record: '");
            return 0;
        }
        Map map = (Map) obj;
        int iA2 = 0;
        for (Object obj3 : map.keySet()) {
            gVar.getClass();
            iA2 += a(obj3);
        }
        int i14 = 16 + iA2;
        for (Object obj4 : map.values()) {
            gVar.getClass();
            iA += a(obj4);
        }
        return i14 + iA;
    }
}

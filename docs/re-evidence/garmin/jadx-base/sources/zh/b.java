package zh;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final void a(g gVar, Object obj) {
        if (obj == null) {
            gVar.l4();
            return;
        }
        if (obj instanceof Map) {
            gVar.y();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                gVar.v1(String.valueOf(key));
                a(gVar, value);
            }
            gVar.A();
            return;
        }
        if (obj instanceof List) {
            gVar.q();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                a(gVar, it.next());
            }
            gVar.g();
            return;
        }
        if (obj instanceof Boolean) {
            gVar.e1(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            gVar.R0(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            gVar.P0(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            gVar.S0(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof e) {
            gVar.U1((e) obj);
        } else if (obj instanceof String) {
            gVar.n0((String) obj);
        } else {
            l2.m("Cannot write ", obj, " to Json");
        }
    }
}

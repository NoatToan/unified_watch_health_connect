package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xos {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f53245b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53246c;
    private String d;

    public xos(String str, String str2) {
        this.d = str;
        this.f53246c = str2;
    }

    public String d() {
        return this.d;
    }

    public String b() {
        return this.f53246c;
    }

    public void e(String str, String str2) {
        this.f53245b.put(str, str2);
    }

    public boolean d(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return this.f53245b.isEmpty();
        }
        if (this.f53245b.isEmpty() || map.size() != this.f53245b.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!this.f53245b.containsKey(entry.getKey()) || !this.f53245b.get(entry.getKey()).equalsIgnoreCase(entry.getValue())) {
                return false;
            }
            xnd.b("AddressName", "conditionMatch", false);
        }
        return true;
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xow {
    private Map<String, xpa> e = new HashMap(16);

    public void c(String str, xpa xpaVar) {
        this.e.put(str, xpaVar);
    }

    public xpa e(String str) {
        return this.e.get(str);
    }
}

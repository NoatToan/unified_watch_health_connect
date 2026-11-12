package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xpa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, xoy> f53262c = new HashMap(16);
    private String d;
    private String e;

    public void d(String str) {
        this.d = str;
    }

    public void e(String str, xoy xoyVar) {
        this.f53262c.put(str, xoyVar);
    }

    public xoy c(String str) {
        return this.f53262c.get(str);
    }

    public void e(String str) {
        this.e = str;
    }
}

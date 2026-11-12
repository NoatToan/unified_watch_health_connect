package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ogz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44303b;
    private final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, byte[]> f44304c = new HashMap();

    int d() {
        int size;
        synchronized (this.d) {
            size = this.f44304c.size();
        }
        return size;
    }

    String e() {
        String str = this.f44303b;
        return str == null ? "" : str;
    }

    Map<String, byte[]> c() {
        Map<String, byte[]> map;
        synchronized (this.d) {
            map = this.f44304c;
        }
        return map;
    }

    public ogz(String str) {
        this.f44303b = str;
    }

    public ogz() {
    }
}

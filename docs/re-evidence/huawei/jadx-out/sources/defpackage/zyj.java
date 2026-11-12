package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class zyj {
    private static final Map<String, Object> d = new HashMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f54773b;

    private zyj(Map<String, Object> map) {
        if (map == null) {
            this.f54773b = d;
        } else {
            this.f54773b = new HashMap(map);
        }
    }

    public static zyj a() {
        return new zyj(null);
    }
}

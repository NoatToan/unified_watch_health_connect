package ha;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f82612a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, String> f82613b;

    public final synchronized Map<String, String> a() {
        try {
            if (this.f82613b == null) {
                this.f82613b = Collections.unmodifiableMap(new HashMap(this.f82612a));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f82613b;
    }
}

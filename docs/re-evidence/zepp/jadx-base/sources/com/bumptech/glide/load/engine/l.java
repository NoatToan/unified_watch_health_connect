package com.bumptech.glide.load.engine;

import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class l {
    private final Map<Key, g<?>> a = new HashMap();
    private final Map<Key, g<?>> b = new HashMap();

    private Map<Key, g<?>> c(boolean z) {
        return z ? this.b : this.a;
    }

    public g<?> a(Key key, boolean z) {
        return c(z).get(key);
    }

    @VisibleForTesting
    public Map<Key, g<?>> b() {
        return Collections.unmodifiableMap(this.a);
    }

    public void d(Key key, g<?> gVar) {
        c(gVar.l()).put(key, gVar);
    }

    public void e(Key key, g<?> gVar) {
        Map<Key, g<?>> mapC = c(gVar.l());
        if (gVar.equals(mapC.get(key))) {
            mapC.remove(key);
        }
    }
}

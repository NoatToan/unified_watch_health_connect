package io.sentry.metrics;

import io.sentry.protocol.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Map<String, b>> f21746a = new HashMap();

    @NotNull
    public Map<String, List<i>> a() {
        HashMap map = new HashMap();
        synchronized (this.f21746a) {
            try {
                for (Map.Entry<String, Map<String, b>> entry : this.f21746a.entrySet()) {
                    String key = entry.getKey();
                    Objects.requireNonNull(key);
                    ArrayList arrayList = new ArrayList();
                    for (b bVar : entry.getValue().values()) {
                        arrayList.add(new i(bVar.i(), bVar.h(), bVar.j(), bVar.g(), bVar.b()));
                    }
                    map.put(key, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}

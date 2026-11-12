package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<f> f21705a;

    public c(@NotNull List<f> list) {
        this.f21705a = list;
    }

    @Override // io.sentry.config.f
    @NotNull
    public Map<String, String> getMap(@NotNull String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<f> it = this.f21705a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.f
    @Nullable
    public String getProperty(@NotNull String str) {
        Iterator<f> it = this.f21705a.iterator();
        while (it.hasNext()) {
            String property = it.next().getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}

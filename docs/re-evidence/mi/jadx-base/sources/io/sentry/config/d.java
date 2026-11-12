package io.sentry.config;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import io.sentry.util.u;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {
    @NotNull
    public final String f(@NotNull String str) {
        return "SENTRY_" + str.replace(".", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR).replace("-", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR).toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.f
    @NotNull
    public Map<String, String> getMap(@NotNull String str) {
        String strF;
        String str2 = f(str) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (strF = u.f(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), strF);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.f
    @Nullable
    public String getProperty(@NotNull String str) {
        return u.f(System.getenv(f(str)), "\"");
    }
}

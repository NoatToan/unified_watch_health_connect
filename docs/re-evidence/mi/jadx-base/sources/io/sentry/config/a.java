package io.sentry.config;

import io.sentry.util.p;
import io.sentry.util.u;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Properties f21702b;

    public a(@NotNull String str, @NotNull Properties properties) {
        this.f21701a = (String) p.c(str, "prefix is required");
        this.f21702b = (Properties) p.c(properties, "properties are required");
    }

    @Override // io.sentry.config.f
    @NotNull
    public Map<String, String> getMap(@NotNull String str) {
        String str2 = this.f21701a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f21702b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), u.f((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.f
    @Nullable
    public String getProperty(@NotNull String str) {
        return u.f(this.f21702b.getProperty(this.f21701a + str), "\"");
    }

    public a(@NotNull Properties properties) {
        this("", properties);
    }
}

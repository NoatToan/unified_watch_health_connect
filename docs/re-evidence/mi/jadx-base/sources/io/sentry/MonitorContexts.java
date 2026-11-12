package io.sentry;

import defpackage.cud;
import defpackage.h4h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Experimental
public final class MonitorContexts extends ConcurrentHashMap<String, Object> implements cud {
    private static final long serialVersionUID = 3987329379811822556L;

    public MonitorContexts() {
    }

    @Nullable
    private <T> T toContextType(@NotNull String str, @NotNull Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Nullable
    public v getTrace() {
        return (v) toContextType("trace", v.class);
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                h4hVar.g(str).j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void setTrace(@Nullable v vVar) {
        io.sentry.util.p.c(vVar, "traceContext is required");
        put("trace", vVar);
    }

    public MonitorContexts(@NotNull MonitorContexts monitorContexts) {
        for (Map.Entry<String, Object> entry : monitorContexts.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("trace".equals(entry.getKey()) && (value instanceof v)) {
                    setTrace(new v((v) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}

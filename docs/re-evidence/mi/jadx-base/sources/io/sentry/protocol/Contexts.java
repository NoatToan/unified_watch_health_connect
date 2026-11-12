package io.sentry.protocol;

import com.mibi.sdk.common.CommonConstants;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Contexts extends ConcurrentHashMap<String, Object> implements cud {
    public static final String REPLAY_ID = "replay_id";
    private static final long serialVersionUID = 252445813254943011L;

    @NotNull
    private final Object responseLock = new Object();

    public static final class a implements fsd<Contexts> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Contexts a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            Contexts contexts = new Contexts();
            f4hVar.beginObject();
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "device":
                        contexts.setDevice(new Device.a().a(f4hVar, iLogger));
                        break;
                    case "response":
                        contexts.setResponse(new l.a().a(f4hVar, iLogger));
                        break;
                    case "os":
                        contexts.setOperatingSystem(new j.a().a(f4hVar, iLogger));
                        break;
                    case "app":
                        contexts.setApp(new io.sentry.protocol.a.C0970a().a(f4hVar, iLogger));
                        break;
                    case "gpu":
                        contexts.setGpu(new e.a().a(f4hVar, iLogger));
                        break;
                    case "trace":
                        contexts.setTrace(new io.sentry.v.a().a(f4hVar, iLogger));
                        break;
                    case "browser":
                        contexts.setBrowser(new b.a().a(f4hVar, iLogger));
                        break;
                    case "runtime":
                        contexts.setRuntime(new r.a().a(f4hVar, iLogger));
                        break;
                    default:
                        Object objQ0 = f4hVar.q0();
                        if (objQ0 == null) {
                            break;
                        } else {
                            contexts.put(strNextName, objQ0);
                            break;
                        }
                        break;
                }
            }
            f4hVar.endObject();
            return contexts;
        }
    }

    public Contexts() {
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
    public io.sentry.protocol.a getApp() {
        return (io.sentry.protocol.a) toContextType("app", io.sentry.protocol.a.class);
    }

    @Nullable
    public b getBrowser() {
        return (b) toContextType("browser", b.class);
    }

    @Nullable
    public Device getDevice() {
        return (Device) toContextType("device", Device.class);
    }

    @Nullable
    public e getGpu() {
        return (e) toContextType("gpu", e.class);
    }

    @Nullable
    public j getOperatingSystem() {
        return (j) toContextType(CommonConstants.KEY_OS, j.class);
    }

    @Nullable
    public l getResponse() {
        return (l) toContextType(com.xiaomi.onetrack.api.b.I, l.class);
    }

    @Nullable
    public r getRuntime() {
        return (r) toContextType("runtime", r.class);
    }

    @Nullable
    public io.sentry.v getTrace() {
        return (io.sentry.v) toContextType("trace", io.sentry.v.class);
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

    public void setApp(@NotNull io.sentry.protocol.a aVar) {
        put("app", aVar);
    }

    public void setBrowser(@NotNull b bVar) {
        put("browser", bVar);
    }

    public void setDevice(@NotNull Device device) {
        put("device", device);
    }

    public void setGpu(@NotNull e eVar) {
        put("gpu", eVar);
    }

    public void setOperatingSystem(@NotNull j jVar) {
        put(CommonConstants.KEY_OS, jVar);
    }

    public void setResponse(@NotNull l lVar) {
        synchronized (this.responseLock) {
            put(com.xiaomi.onetrack.api.b.I, lVar);
        }
    }

    public void setRuntime(@NotNull r rVar) {
        put("runtime", rVar);
    }

    public void setTrace(@Nullable io.sentry.v vVar) {
        io.sentry.util.p.c(vVar, "traceContext is required");
        put("trace", vVar);
    }

    public void withResponse(io.sentry.util.j.a<l> aVar) {
        synchronized (this.responseLock) {
            try {
                l response = getResponse();
                if (response != null) {
                    aVar.accept(response);
                } else {
                    l lVar = new l();
                    setResponse(lVar);
                    aVar.accept(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Contexts(@NotNull Contexts contexts) {
        for (Map.Entry<String, Object> entry : contexts.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    setApp(new io.sentry.protocol.a((io.sentry.protocol.a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    setBrowser(new b((b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof Device)) {
                    setDevice(new Device((Device) value));
                } else if (CommonConstants.KEY_OS.equals(entry.getKey()) && (value instanceof j)) {
                    setOperatingSystem(new j((j) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof r)) {
                    setRuntime(new r((r) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof e)) {
                    setGpu(new e((e) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof io.sentry.v)) {
                    setTrace(new io.sentry.v((io.sentry.v) value));
                } else if (com.xiaomi.onetrack.api.b.I.equals(entry.getKey()) && (value instanceof l)) {
                    setResponse(new l((l) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}

package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.qkp;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class n implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Double f21754b;
    public boolean c;

    @Nullable
    public Double d;

    @Nullable
    public String e;
    public boolean f;
    public int g;

    @Nullable
    public Map<String, Object> h;

    public static final class a implements fsd<n> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "trace_sampled":
                        Boolean boolT = f4hVar.t();
                        if (boolT == null) {
                            break;
                        } else {
                            nVar.c = boolT.booleanValue();
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        String strB = f4hVar.B();
                        if (strB == null) {
                            break;
                        } else {
                            nVar.e = strB;
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        Boolean boolT2 = f4hVar.t();
                        if (boolT2 == null) {
                            break;
                        } else {
                            nVar.f = boolT2.booleanValue();
                            break;
                        }
                        break;
                    case "profile_sampled":
                        Boolean boolT3 = f4hVar.t();
                        if (boolT3 == null) {
                            break;
                        } else {
                            nVar.f21753a = boolT3.booleanValue();
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        Integer numH0 = f4hVar.h0();
                        if (numH0 == null) {
                            break;
                        } else {
                            nVar.g = numH0.intValue();
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        Double dW = f4hVar.W();
                        if (dW == null) {
                            break;
                        } else {
                            nVar.d = dW;
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        Double dW2 = f4hVar.W();
                        if (dW2 == null) {
                            break;
                        } else {
                            nVar.f21754b = dW2;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            nVar.h(concurrentHashMap);
            f4hVar.endObject();
            return nVar;
        }
    }

    @VisibleForTesting
    public n() {
        this.c = false;
        this.d = null;
        this.f21753a = false;
        this.f21754b = null;
        this.e = null;
        this.f = false;
        this.g = 0;
    }

    @Nullable
    public Double a() {
        return this.f21754b;
    }

    @Nullable
    public String b() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    @Nullable
    public Double d() {
        return this.d;
    }

    public boolean e() {
        return this.f21753a;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.c;
    }

    public void h(@Nullable Map<String, Object> map) {
        this.h = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("profile_sampled").j(iLogger, Boolean.valueOf(this.f21753a));
        h4hVar.g("profile_sample_rate").j(iLogger, this.f21754b);
        h4hVar.g("trace_sampled").j(iLogger, Boolean.valueOf(this.c));
        h4hVar.g("trace_sample_rate").j(iLogger, this.d);
        h4hVar.g("profiling_traces_dir_path").j(iLogger, this.e);
        h4hVar.g("is_profiling_enabled").j(iLogger, Boolean.valueOf(this.f));
        h4hVar.g("profiling_traces_hz").j(iLogger, Integer.valueOf(this.g));
        Map<String, Object> map = this.h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.h.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public n(@NotNull SentryOptions sentryOptions, @NotNull qkp qkpVar) {
        this.c = qkpVar.d().booleanValue();
        this.d = qkpVar.c();
        this.f21753a = qkpVar.b().booleanValue();
        this.f21754b = qkpVar.a();
        this.e = sentryOptions.getProfilingTracesDirPath();
        this.f = sentryOptions.isProfilingEnabled();
        this.g = sentryOptions.getProfilingTracesHz();
    }
}

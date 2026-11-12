package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<t> f21816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, String> f21817b;

    @Nullable
    public Boolean c;

    @Nullable
    public Map<String, Object> d;

    public static final class a implements fsd<u> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            u uVar = new u();
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "frames":
                        uVar.f21816a = f4hVar.C(iLogger, new t.a());
                        break;
                    case "registers":
                        uVar.f21817b = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "snapshot":
                        uVar.c = f4hVar.t();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            uVar.f(concurrentHashMap);
            f4hVar.endObject();
            return uVar;
        }
    }

    public u() {
    }

    public u(@Nullable List<t> list) {
        this.f21816a = list;
    }

    @Nullable
    public List<t> d() {
        return this.f21816a;
    }

    public void e(@Nullable Boolean bool) {
        this.c = bool;
    }

    public void f(@Nullable Map<String, Object> map) {
        this.d = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21816a != null) {
            h4hVar.g("frames").j(iLogger, this.f21816a);
        }
        if (this.f21817b != null) {
            h4hVar.g("registers").j(iLogger, this.f21817b);
        }
        if (this.c != null) {
            h4hVar.g("snapshot").k(this.c);
        }
        Map<String, Object> map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.d.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }
}

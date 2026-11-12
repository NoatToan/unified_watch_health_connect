package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final transient Thread f21784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21785b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public Boolean e;

    @Nullable
    public Map<String, Object> f;

    @Nullable
    public Map<String, Object> g;

    @Nullable
    public Boolean h;

    @Nullable
    public Map<String, Object> i;

    public static final class a implements fsd<g> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            g gVar = new g();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "description":
                        gVar.c = f4hVar.B();
                        break;
                    case "data":
                        gVar.g = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "meta":
                        gVar.f = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "type":
                        gVar.f21785b = f4hVar.B();
                        break;
                    case "handled":
                        gVar.e = f4hVar.t();
                        break;
                    case "synthetic":
                        gVar.h = f4hVar.t();
                        break;
                    case "help_link":
                        gVar.d = f4hVar.B();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        f4hVar.l0(iLogger, map, strNextName);
                        break;
                }
            }
            f4hVar.endObject();
            gVar.k(map);
            return gVar;
        }
    }

    public g() {
        this(null);
    }

    @Nullable
    public Boolean h() {
        return this.e;
    }

    public void i(@Nullable Boolean bool) {
        this.e = bool;
    }

    public void j(@Nullable String str) {
        this.f21785b = str;
    }

    public void k(@Nullable Map<String, Object> map) {
        this.i = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21785b != null) {
            h4hVar.g("type").c(this.f21785b);
        }
        if (this.c != null) {
            h4hVar.g("description").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("help_link").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("handled").k(this.e);
        }
        if (this.f != null) {
            h4hVar.g("meta").j(iLogger, this.f);
        }
        if (this.g != null) {
            h4hVar.g("data").j(iLogger, this.g);
        }
        if (this.h != null) {
            h4hVar.g("synthetic").k(this.h);
        }
        Map<String, Object> map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.i.get(str));
            }
        }
        h4hVar.endObject();
    }

    public g(@Nullable Thread thread) {
        this.f21784a = thread;
    }
}

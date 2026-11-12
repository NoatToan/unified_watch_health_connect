package io.sentry.protocol;

import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Date f21769b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String f;

    @Nullable
    public String g;

    @Nullable
    public Map<String, String> h;

    @Nullable
    public List<String> i;

    @Nullable
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Boolean f21770k;

    @Nullable
    public Map<String, Object> l;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C0970a implements fsd<a> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "device_app_hash":
                        aVar.c = f4hVar.B();
                        break;
                    case "start_type":
                        aVar.j = f4hVar.B();
                        break;
                    case "view_names":
                        List<String> list = (List) f4hVar.q0();
                        if (list == null) {
                            break;
                        } else {
                            aVar.u(list);
                            break;
                        }
                        break;
                    case "app_version":
                        aVar.f = f4hVar.B();
                        break;
                    case "in_foreground":
                        aVar.f21770k = f4hVar.t();
                        break;
                    case "build_type":
                        aVar.d = f4hVar.B();
                        break;
                    case "app_identifier":
                        aVar.f21768a = f4hVar.B();
                        break;
                    case "app_start_time":
                        aVar.f21769b = f4hVar.r(iLogger);
                        break;
                    case "permissions":
                        aVar.h = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "app_name":
                        aVar.e = f4hVar.B();
                        break;
                    case "app_build":
                        aVar.g = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            aVar.t(concurrentHashMap);
            f4hVar.endObject();
            return aVar;
        }
    }

    public a() {
    }

    public a(@NotNull a aVar) {
        this.g = aVar.g;
        this.f21768a = aVar.f21768a;
        this.e = aVar.e;
        this.f21769b = aVar.f21769b;
        this.f = aVar.f;
        this.d = aVar.d;
        this.c = aVar.c;
        this.h = io.sentry.util.b.c(aVar.h);
        this.f21770k = aVar.f21770k;
        this.i = io.sentry.util.b.b(aVar.i);
        this.j = aVar.j;
        this.l = io.sentry.util.b.c(aVar.l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.p.a(this.f21768a, aVar.f21768a) && io.sentry.util.p.a(this.f21769b, aVar.f21769b) && io.sentry.util.p.a(this.c, aVar.c) && io.sentry.util.p.a(this.d, aVar.d) && io.sentry.util.p.a(this.e, aVar.e) && io.sentry.util.p.a(this.f, aVar.f) && io.sentry.util.p.a(this.g, aVar.g) && io.sentry.util.p.a(this.h, aVar.h) && io.sentry.util.p.a(this.f21770k, aVar.f21770k) && io.sentry.util.p.a(this.i, aVar.i) && io.sentry.util.p.a(this.j, aVar.j);
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21768a, this.f21769b, this.c, this.d, this.e, this.f, this.g, this.h, this.f21770k, this.i, this.j);
    }

    @Nullable
    public Boolean k() {
        return this.f21770k;
    }

    public void l(@Nullable String str) {
        this.g = str;
    }

    public void m(@Nullable String str) {
        this.f21768a = str;
    }

    public void n(@Nullable String str) {
        this.e = str;
    }

    public void o(@Nullable Date date) {
        this.f21769b = date;
    }

    public void p(@Nullable String str) {
        this.f = str;
    }

    public void q(@Nullable Boolean bool) {
        this.f21770k = bool;
    }

    public void r(@Nullable Map<String, String> map) {
        this.h = map;
    }

    public void s(@Nullable String str) {
        this.j = str;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21768a != null) {
            h4hVar.g("app_identifier").c(this.f21768a);
        }
        if (this.f21769b != null) {
            h4hVar.g("app_start_time").j(iLogger, this.f21769b);
        }
        if (this.c != null) {
            h4hVar.g("device_app_hash").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("build_type").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g(FeedbackConstants.KEY_APP_NAME).c(this.e);
        }
        if (this.f != null) {
            h4hVar.g("app_version").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("app_build").c(this.g);
        }
        Map<String, String> map = this.h;
        if (map != null && !map.isEmpty()) {
            h4hVar.g("permissions").j(iLogger, this.h);
        }
        if (this.f21770k != null) {
            h4hVar.g("in_foreground").k(this.f21770k);
        }
        if (this.i != null) {
            h4hVar.g("view_names").j(iLogger, this.i);
        }
        if (this.j != null) {
            h4hVar.g("start_type").c(this.j);
        }
        Map<String, Object> map2 = this.l;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                h4hVar.g(str).j(iLogger, this.l.get(str));
            }
        }
        h4hVar.endObject();
    }

    public void t(@Nullable Map<String, Object> map) {
        this.l = map;
    }

    public void u(@Nullable List<String> list) {
        this.i = list;
    }
}

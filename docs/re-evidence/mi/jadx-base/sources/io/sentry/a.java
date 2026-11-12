package io.sentry;

import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.yq5;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f21365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Date f21366b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @NotNull
    public Map<String, Object> e;

    @Nullable
    public String f;

    @Nullable
    public String g;

    @Nullable
    public SentryLevel h;

    @Nullable
    public Map<String, Object> i;

    /* JADX INFO: renamed from: io.sentry.a$a, reason: collision with other inner class name */
    public static final class C0967a implements fsd<a> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            Date dateC = yq5.c();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strB = null;
            String strB2 = null;
            String strB3 = null;
            String strB4 = null;
            SentryLevel sentryLevelA = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "origin":
                        strB4 = f4hVar.B();
                        break;
                    case "data":
                        Map mapC = io.sentry.util.b.c((Map) f4hVar.q0());
                        if (mapC == null) {
                            break;
                        } else {
                            concurrentHashMap = mapC;
                            break;
                        }
                        break;
                    case "type":
                        strB2 = f4hVar.B();
                        break;
                    case "category":
                        strB3 = f4hVar.B();
                        break;
                    case "timestamp":
                        Date dateR = f4hVar.r(iLogger);
                        if (dateR == null) {
                            break;
                        } else {
                            dateC = dateR;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            sentryLevelA = new SentryLevel.a().a(f4hVar, iLogger);
                            break;
                        } catch (Exception e) {
                            iLogger.b(SentryLevel.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strB = f4hVar.B();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap2, strNextName);
                        break;
                }
            }
            a aVar = new a(dateC);
            aVar.c = strB;
            aVar.d = strB2;
            aVar.e = concurrentHashMap;
            aVar.f = strB3;
            aVar.g = strB4;
            aVar.h = sentryLevelA;
            aVar.r(concurrentHashMap2);
            f4hVar.endObject();
            return aVar;
        }
    }

    public a(@NotNull Date date) {
        this.e = new ConcurrentHashMap();
        this.f21366b = date;
        this.f21365a = null;
    }

    @NotNull
    public static a s(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull Map<String, Object> map) {
        a aVar = new a();
        aVar.q(SceneRecogBroadcastReceiver.FROM_USER);
        aVar.m("ui." + str);
        if (str2 != null) {
            aVar.n("view.id", str2);
        }
        if (str3 != null) {
            aVar.n("view.class", str3);
        }
        if (str4 != null) {
            aVar.n("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            aVar.h().put(entry.getKey(), entry.getValue());
        }
        aVar.o(SentryLevel.INFO);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return k().getTime() == aVar.k().getTime() && io.sentry.util.p.a(this.c, aVar.c) && io.sentry.util.p.a(this.d, aVar.d) && io.sentry.util.p.a(this.f, aVar.f) && io.sentry.util.p.a(this.g, aVar.g) && this.h == aVar.h;
    }

    @Nullable
    public String g() {
        return this.f;
    }

    @ApiStatus.Internal
    @NotNull
    public Map<String, Object> h() {
        return this.e;
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21366b, this.c, this.d, this.f, this.g, this.h);
    }

    @Nullable
    public SentryLevel i() {
        return this.h;
    }

    @Nullable
    public String j() {
        return this.c;
    }

    @NotNull
    public Date k() {
        Date date = this.f21366b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.f21365a;
        if (l == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateD = yq5.d(l.longValue());
        this.f21366b = dateD;
        return dateD;
    }

    @Nullable
    public String l() {
        return this.d;
    }

    public void m(@Nullable String str) {
        this.f = str;
    }

    public void n(@NotNull String str, @NotNull Object obj) {
        this.e.put(str, obj);
    }

    public void o(@Nullable SentryLevel sentryLevel) {
        this.h = sentryLevel;
    }

    public void p(@Nullable String str) {
        this.c = str;
    }

    public void q(@Nullable String str) {
        this.d = str;
    }

    public void r(@Nullable Map<String, Object> map) {
        this.i = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("timestamp").j(iLogger, k());
        if (this.c != null) {
            h4hVar.g("message").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("type").c(this.d);
        }
        h4hVar.g("data").j(iLogger, this.e);
        if (this.f != null) {
            h4hVar.g("category").c(this.f);
        }
        if (this.g != null) {
            h4hVar.g("origin").c(this.g);
        }
        if (this.h != null) {
            h4hVar.g("level").j(iLogger, this.h);
        }
        Map<String, Object> map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.i.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public a(long j) {
        this.e = new ConcurrentHashMap();
        this.f21365a = Long.valueOf(j);
        this.f21366b = null;
    }

    public a(@NotNull a aVar) {
        this.e = new ConcurrentHashMap();
        this.f21366b = aVar.f21366b;
        this.f21365a = aVar.f21365a;
        this.c = aVar.c;
        this.d = aVar.d;
        this.f = aVar.f;
        this.g = aVar.g;
        Map<String, Object> mapC = io.sentry.util.b.c(aVar.e);
        if (mapC != null) {
            this.e = mapC;
        }
        this.i = io.sentry.util.b.c(aVar.i);
        this.h = aVar.h;
    }

    public a() {
        this(System.currentTimeMillis());
    }
}

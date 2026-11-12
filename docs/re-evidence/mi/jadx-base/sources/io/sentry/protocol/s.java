package io.sentry.protocol;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import defpackage.a5n;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class s implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Double f21809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Double f21810b;

    @NotNull
    public final p c;

    @NotNull
    public final io.sentry.w d;

    @Nullable
    public final io.sentry.w e;

    @NotNull
    public final String f;

    @Nullable
    public final String g;

    @Nullable
    public final SpanStatus h;

    @Nullable
    public final String i;

    @NotNull
    public final Map<String, String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21811k;

    @NotNull
    public final Map<String, f> l;

    @Nullable
    public final Map<String, List<i>> m;

    @Nullable
    public Map<String, Object> n;

    public static final class a implements fsd<s> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            Map map = null;
            Double dValueOf = null;
            Double dValueOf2 = null;
            p pVarA = null;
            io.sentry.w wVarA = null;
            io.sentry.w wVar = null;
            String strB = null;
            String strB2 = null;
            SpanStatus spanStatus = null;
            String strB3 = null;
            Map mapV = null;
            ConcurrentHashMap concurrentHashMap = null;
            Map mapE0 = null;
            Map map2 = null;
            while (true) {
                String str = strB3;
                SpanStatus spanStatus2 = spanStatus;
                String str2 = strB2;
                io.sentry.w wVar2 = wVar;
                if (f4hVar.peek() != JsonToken.NAME) {
                    if (dValueOf == null) {
                        throw c("start_timestamp", iLogger);
                    }
                    if (pVarA == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (wVarA == null) {
                        throw c("span_id", iLogger);
                    }
                    if (strB == null) {
                        throw c("op", iLogger);
                    }
                    Map map3 = map == null ? new HashMap() : map;
                    Map map4 = mapV == null ? new HashMap() : mapV;
                    s sVar = new s(dValueOf, dValueOf2, pVarA, wVarA, wVar2, strB, str2, spanStatus2, str, map3, map4, mapE0, map2);
                    sVar.i(concurrentHashMap);
                    f4hVar.endObject();
                    return sVar;
                }
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                byte b2 = -1;
                switch (strNextName.hashCode()) {
                    case -2011840976:
                        if (strNextName.equals("span_id")) {
                            b2 = 0;
                        }
                        break;
                    case -1757797477:
                        if (strNextName.equals("parent_span_id")) {
                            b2 = 1;
                        }
                        break;
                    case -1724546052:
                        if (strNextName.equals("description")) {
                            b2 = 2;
                        }
                        break;
                    case -1526966919:
                        if (strNextName.equals("start_timestamp")) {
                            b2 = 3;
                        }
                        break;
                    case -1008619738:
                        if (strNextName.equals("origin")) {
                            b2 = 4;
                        }
                        break;
                    case -892481550:
                        if (strNextName.equals("status")) {
                            b2 = 5;
                        }
                        break;
                    case -682561045:
                        if (strNextName.equals("_metrics_summary")) {
                            b2 = 6;
                        }
                        break;
                    case -362243017:
                        if (strNextName.equals("measurements")) {
                            b2 = 7;
                        }
                        break;
                    case 3553:
                        if (strNextName.equals("op")) {
                            b2 = 8;
                        }
                        break;
                    case 3076010:
                        if (strNextName.equals("data")) {
                            b2 = 9;
                        }
                        break;
                    case 3552281:
                        if (strNextName.equals("tags")) {
                            b2 = 10;
                        }
                        break;
                    case 55126294:
                        if (strNextName.equals("timestamp")) {
                            b2 = 11;
                        }
                        break;
                    case 1270300245:
                        if (strNextName.equals("trace_id")) {
                            b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        wVarA = new io.sentry.w.a().a(f4hVar, iLogger);
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 1:
                        wVar = (io.sentry.w) f4hVar.A(iLogger, new io.sentry.w.a());
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        break;
                    case 2:
                        strB2 = f4hVar.B();
                        strB3 = str;
                        spanStatus = spanStatus2;
                        wVar = wVar2;
                        break;
                    case 3:
                        try {
                            dValueOf = f4hVar.W();
                        } catch (NumberFormatException unused) {
                            Date dateR = f4hVar.r(iLogger);
                            dValueOf = dateR != null ? Double.valueOf(yq5.b(dateR)) : null;
                        }
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 4:
                        strB3 = f4hVar.B();
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 5:
                        spanStatus = (SpanStatus) f4hVar.A(iLogger, new SpanStatus.a());
                        strB3 = str;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 6:
                        mapE0 = f4hVar.e0(iLogger, new i.a());
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 7:
                        mapV = f4hVar.v(iLogger, new f.a());
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 8:
                        strB = f4hVar.B();
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 9:
                        map2 = (Map) f4hVar.q0();
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 10:
                        map = (Map) f4hVar.q0();
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 11:
                        try {
                            dValueOf2 = f4hVar.W();
                        } catch (NumberFormatException unused2) {
                            Date dateR2 = f4hVar.r(iLogger);
                            dValueOf2 = dateR2 != null ? Double.valueOf(yq5.b(dateR2)) : null;
                        }
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    case 12:
                        pVarA = new p.a().a(f4hVar, iLogger);
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        strB3 = str;
                        spanStatus = spanStatus2;
                        strB2 = str2;
                        wVar = wVar2;
                        break;
                }
            }
        }
    }

    public s(@NotNull a5n a5nVar) {
        this(a5nVar, a5nVar.t());
    }

    @NotNull
    public final BigDecimal a(@NotNull Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @Nullable
    public Map<String, Object> b() {
        return this.f21811k;
    }

    @NotNull
    public Map<String, f> c() {
        return this.l;
    }

    @NotNull
    public String d() {
        return this.f;
    }

    @NotNull
    public io.sentry.w e() {
        return this.d;
    }

    @NotNull
    public Double f() {
        return this.f21809a;
    }

    @Nullable
    public Double g() {
        return this.f21810b;
    }

    public void h(@Nullable Map<String, Object> map) {
        this.f21811k = map;
    }

    public void i(@Nullable Map<String, Object> map) {
        this.n = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("start_timestamp").j(iLogger, a(this.f21809a));
        if (this.f21810b != null) {
            h4hVar.g("timestamp").j(iLogger, a(this.f21810b));
        }
        h4hVar.g("trace_id").j(iLogger, this.c);
        h4hVar.g("span_id").j(iLogger, this.d);
        if (this.e != null) {
            h4hVar.g("parent_span_id").j(iLogger, this.e);
        }
        h4hVar.g("op").c(this.f);
        if (this.g != null) {
            h4hVar.g("description").c(this.g);
        }
        if (this.h != null) {
            h4hVar.g("status").j(iLogger, this.h);
        }
        if (this.i != null) {
            h4hVar.g("origin").j(iLogger, this.i);
        }
        if (!this.j.isEmpty()) {
            h4hVar.g("tags").j(iLogger, this.j);
        }
        if (this.f21811k != null) {
            h4hVar.g("data").j(iLogger, this.f21811k);
        }
        if (!this.l.isEmpty()) {
            h4hVar.g("measurements").j(iLogger, this.l);
        }
        Map<String, List<i>> map = this.m;
        if (map != null && !map.isEmpty()) {
            h4hVar.g("_metrics_summary").j(iLogger, this.m);
        }
        Map<String, Object> map2 = this.n;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.n.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    @ApiStatus.Internal
    public s(@NotNull a5n a5nVar, @Nullable Map<String, Object> map) {
        io.sentry.util.p.c(a5nVar, "span is required");
        this.g = a5nVar.getDescription();
        this.f = a5nVar.x();
        this.d = a5nVar.C();
        this.e = a5nVar.z();
        this.c = a5nVar.E();
        this.h = a5nVar.getStatus();
        this.i = a5nVar.d().c();
        Map<String, String> mapC = io.sentry.util.b.c(a5nVar.D());
        this.j = mapC == null ? new ConcurrentHashMap<>() : mapC;
        Map<String, f> mapC2 = io.sentry.util.b.c(a5nVar.w());
        this.l = mapC2 == null ? new ConcurrentHashMap<>() : mapC2;
        this.f21810b = a5nVar.q() == null ? null : Double.valueOf(yq5.l(a5nVar.r().e(a5nVar.q())));
        this.f21809a = Double.valueOf(yq5.l(a5nVar.r().h()));
        this.f21811k = map;
        io.sentry.metrics.d dVarV = a5nVar.v();
        if (dVarV != null) {
            this.m = dVarV.a();
        } else {
            this.m = null;
        }
    }

    @ApiStatus.Internal
    public s(@NotNull Double d, @Nullable Double d2, @NotNull p pVar, @NotNull io.sentry.w wVar, @Nullable io.sentry.w wVar2, @NotNull String str, @Nullable String str2, @Nullable SpanStatus spanStatus, @Nullable String str3, @NotNull Map<String, String> map, @NotNull Map<String, f> map2, @Nullable Map<String, List<i>> map3, @Nullable Map<String, Object> map4) {
        this.f21809a = d;
        this.f21810b = d2;
        this.c = pVar;
        this.d = wVar;
        this.e = wVar2;
        this.f = str;
        this.g = str2;
        this.h = spanStatus;
        this.i = str3;
        this.j = map;
        this.l = map2;
        this.m = map3;
        this.f21811k = map4;
    }
}

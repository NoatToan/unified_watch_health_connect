package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.yq5;
import io.sentry.protocol.Contexts;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryReplayEvent extends o implements cud {

    @Nullable
    public File p;
    public int t;

    @Nullable
    public Date v;

    @Nullable
    public Map<String, Object> z;

    @Nullable
    public io.sentry.protocol.p s = new io.sentry.protocol.p();

    @NotNull
    public String q = "replay_event";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public ReplayType f21352r = ReplayType.SESSION;

    @Nullable
    public List<String> x = new ArrayList();

    @Nullable
    public List<String> y = new ArrayList();

    @Nullable
    public List<String> w = new ArrayList();

    @NotNull
    public Date u = yq5.c();

    public enum ReplayType implements cud {
        SESSION,
        BUFFER;

        public static final class a implements fsd<ReplayType> {
            @Override // defpackage.fsd
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ReplayType a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
                return ReplayType.valueOf(f4hVar.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // defpackage.cud
        public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            h4hVar.c(name().toLowerCase(Locale.ROOT));
        }
    }

    public static final class a implements fsd<SentryReplayEvent> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SentryReplayEvent a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            o.a aVar = new o.a();
            SentryReplayEvent sentryReplayEvent = new SentryReplayEvent();
            f4hVar.beginObject();
            String strB = null;
            ReplayType replayType = null;
            Integer numH0 = null;
            Date dateR = null;
            HashMap map = null;
            io.sentry.protocol.p pVar = null;
            Date dateR2 = null;
            List<String> list = null;
            List<String> list2 = null;
            List<String> list3 = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "replay_id":
                        pVar = (io.sentry.protocol.p) f4hVar.A(iLogger, new io.sentry.protocol.p.a());
                        break;
                    case "replay_start_timestamp":
                        dateR2 = f4hVar.r(iLogger);
                        break;
                    case "type":
                        strB = f4hVar.B();
                        break;
                    case "urls":
                        list = (List) f4hVar.q0();
                        break;
                    case "timestamp":
                        dateR = f4hVar.r(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) f4hVar.q0();
                        break;
                    case "trace_ids":
                        list3 = (List) f4hVar.q0();
                        break;
                    case "replay_type":
                        replayType = (ReplayType) f4hVar.A(iLogger, new ReplayType.a());
                        break;
                    case "segment_id":
                        numH0 = f4hVar.h0();
                        break;
                    default:
                        if (!aVar.a(sentryReplayEvent, strNextName, f4hVar, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            f4hVar.l0(iLogger, map, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            f4hVar.endObject();
            if (strB != null) {
                sentryReplayEvent.p0(strB);
            }
            if (replayType != null) {
                sentryReplayEvent.l0(replayType);
            }
            if (numH0 != null) {
                sentryReplayEvent.m0(numH0.intValue());
            }
            if (dateR != null) {
                sentryReplayEvent.n0(dateR);
            }
            sentryReplayEvent.j0(pVar);
            sentryReplayEvent.k0(dateR2);
            sentryReplayEvent.r0(list);
            sentryReplayEvent.i0(list2);
            sentryReplayEvent.o0(list3);
            sentryReplayEvent.q0(map);
            return sentryReplayEvent;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SentryReplayEvent.class != obj.getClass()) {
            return false;
        }
        SentryReplayEvent sentryReplayEvent = (SentryReplayEvent) obj;
        return this.t == sentryReplayEvent.t && io.sentry.util.p.a(this.q, sentryReplayEvent.q) && this.f21352r == sentryReplayEvent.f21352r && io.sentry.util.p.a(this.s, sentryReplayEvent.s) && io.sentry.util.p.a(this.w, sentryReplayEvent.w) && io.sentry.util.p.a(this.x, sentryReplayEvent.x) && io.sentry.util.p.a(this.y, sentryReplayEvent.y);
    }

    @NotNull
    public Date g0() {
        return this.u;
    }

    @Nullable
    public File h0() {
        return this.p;
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.q, this.f21352r, this.s, Integer.valueOf(this.t), this.w, this.x, this.y);
    }

    public void i0(@Nullable List<String> list) {
        this.x = list;
    }

    public void j0(@Nullable io.sentry.protocol.p pVar) {
        this.s = pVar;
    }

    public void k0(@Nullable Date date) {
        this.v = date;
    }

    public void l0(@NotNull ReplayType replayType) {
        this.f21352r = replayType;
    }

    public void m0(int i) {
        this.t = i;
    }

    public void n0(@NotNull Date date) {
        this.u = date;
    }

    public void o0(@Nullable List<String> list) {
        this.y = list;
    }

    public void p0(@NotNull String str) {
        this.q = str;
    }

    public void q0(@Nullable Map<String, Object> map) {
        this.z = map;
    }

    public void r0(@Nullable List<String> list) {
        this.w = list;
    }

    public void s0(@Nullable File file) {
        this.p = file;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("type").c(this.q);
        h4hVar.g("replay_type").j(iLogger, this.f21352r);
        h4hVar.g("segment_id").d(this.t);
        h4hVar.g("timestamp").j(iLogger, this.u);
        if (this.s != null) {
            h4hVar.g(Contexts.REPLAY_ID).j(iLogger, this.s);
        }
        if (this.v != null) {
            h4hVar.g("replay_start_timestamp").j(iLogger, this.v);
        }
        if (this.w != null) {
            h4hVar.g("urls").j(iLogger, this.w);
        }
        if (this.x != null) {
            h4hVar.g("error_ids").j(iLogger, this.x);
        }
        if (this.y != null) {
            h4hVar.g("trace_ids").j(iLogger, this.y);
        }
        new o.b().a(this, h4hVar, iLogger);
        Map<String, Object> map = this.z;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.z.get(str));
            }
        }
        h4hVar.endObject();
    }
}

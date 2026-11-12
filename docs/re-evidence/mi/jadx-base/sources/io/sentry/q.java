package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.yq5;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class q implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final io.sentry.protocol.p f21828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final io.sentry.protocol.n f21829b;

    @Nullable
    public final y c;

    @Nullable
    public Date d;

    @Nullable
    public Map<String, Object> e;

    public static final class a implements fsd<q> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            io.sentry.protocol.p pVar = null;
            io.sentry.protocol.n nVar = null;
            y yVar = null;
            Date dateR = null;
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "sdk":
                        nVar = (io.sentry.protocol.n) f4hVar.A(iLogger, new io.sentry.protocol.n.a());
                        break;
                    case "trace":
                        yVar = (y) f4hVar.A(iLogger, new y.b());
                        break;
                    case "event_id":
                        pVar = (io.sentry.protocol.p) f4hVar.A(iLogger, new io.sentry.protocol.p.a());
                        break;
                    case "sent_at":
                        dateR = f4hVar.r(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        f4hVar.l0(iLogger, map, strNextName);
                        break;
                }
            }
            q qVar = new q(pVar, nVar, yVar);
            qVar.d(dateR);
            qVar.e(map);
            f4hVar.endObject();
            return qVar;
        }
    }

    public q(@Nullable io.sentry.protocol.p pVar, @Nullable io.sentry.protocol.n nVar) {
        this(pVar, nVar, null);
    }

    @Nullable
    public io.sentry.protocol.p a() {
        return this.f21828a;
    }

    @Nullable
    public io.sentry.protocol.n b() {
        return this.f21829b;
    }

    @Nullable
    public y c() {
        return this.c;
    }

    public void d(@Nullable Date date) {
        this.d = date;
    }

    public void e(@Nullable Map<String, Object> map) {
        this.e = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21828a != null) {
            h4hVar.g("event_id").j(iLogger, this.f21828a);
        }
        if (this.f21829b != null) {
            h4hVar.g("sdk").j(iLogger, this.f21829b);
        }
        if (this.c != null) {
            h4hVar.g("trace").j(iLogger, this.c);
        }
        if (this.d != null) {
            h4hVar.g("sent_at").j(iLogger, yq5.g(this.d));
        }
        Map<String, Object> map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.e.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public q(@Nullable io.sentry.protocol.p pVar, @Nullable io.sentry.protocol.n nVar, @Nullable y yVar) {
        this.f21828a = pVar;
        this.f21829b = nVar;
        this.c = yVar;
    }

    public q(@Nullable io.sentry.protocol.p pVar) {
        this(pVar, null);
    }

    public q() {
        this(new io.sentry.protocol.p());
    }
}

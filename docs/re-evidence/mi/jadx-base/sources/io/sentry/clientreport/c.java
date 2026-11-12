package io.sentry.clientreport;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class c implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Date f21693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<f> f21694b;

    @Nullable
    public Map<String, Object> c;

    public static final class a implements fsd<c> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            f4hVar.beginObject();
            Date dateR = null;
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("discarded_events")) {
                    arrayList.addAll(f4hVar.C(iLogger, new f.a()));
                } else if (strNextName.equals("timestamp")) {
                    dateR = f4hVar.r(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            f4hVar.endObject();
            if (dateR == null) {
                throw c("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            c cVar = new c(dateR, arrayList);
            cVar.b(map);
            return cVar;
        }
    }

    public c(@NotNull Date date, @NotNull List<f> list) {
        this.f21693a = date;
        this.f21694b = list;
    }

    @NotNull
    public List<f> a() {
        return this.f21694b;
    }

    public void b(@Nullable Map<String, Object> map) {
        this.c = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("timestamp").c(yq5.g(this.f21693a));
        h4hVar.g("discarded_events").j(iLogger, this.f21694b);
        Map<String, Object> map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.c.get(str));
            }
        }
        h4hVar.endObject();
    }
}

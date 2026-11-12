package io.sentry.rrweb;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends RRWebIncrementalSnapshotEvent implements cud {
    public int d;

    @Nullable
    public List<b> e;

    @Nullable
    public Map<String, Object> f;

    @Nullable
    public Map<String, Object> g;

    public static final class a implements fsd<c> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            c cVar = new c();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("data")) {
                    c(cVar, f4hVar, iLogger);
                } else if (!aVar.a(cVar, strNextName, f4hVar, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            cVar.o(map);
            f4hVar.endObject();
            return cVar;
        }

        public final void c(@NotNull c cVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            RRWebIncrementalSnapshotEvent.a aVar = new RRWebIncrementalSnapshotEvent.a();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("pointerId")) {
                    cVar.d = f4hVar.nextInt();
                } else if (strNextName.equals("positions")) {
                    cVar.e = f4hVar.C(iLogger, new b.a());
                } else if (!aVar.a(cVar, strNextName, f4hVar, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            cVar.l(map);
            f4hVar.endObject();
        }
    }

    public static final class b implements cud {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f21837b;
        public float c;
        public long d;

        @Nullable
        public Map<String, Object> e;

        public static final class a implements fsd<b> {
            @Override // defpackage.fsd
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
                f4hVar.beginObject();
                b bVar = new b();
                HashMap map = null;
                while (f4hVar.peek() == JsonToken.NAME) {
                    String strNextName = f4hVar.nextName();
                    strNextName.hashCode();
                    switch (strNextName) {
                        case "x":
                            bVar.f21837b = f4hVar.nextFloat();
                            break;
                        case "y":
                            bVar.c = f4hVar.nextFloat();
                            break;
                        case "id":
                            bVar.f21836a = f4hVar.nextInt();
                            break;
                        case "timeOffset":
                            bVar.d = f4hVar.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            f4hVar.l0(iLogger, map, strNextName);
                            break;
                    }
                }
                bVar.h(map);
                f4hVar.endObject();
                return bVar;
            }
        }

        public long e() {
            return this.d;
        }

        public void f(int i) {
            this.f21836a = i;
        }

        public void g(long j) {
            this.d = j;
        }

        public void h(@Nullable Map<String, Object> map) {
            this.e = map;
        }

        public void i(float f) {
            this.f21837b = f;
        }

        public void j(float f) {
            this.c = f;
        }

        @Override // defpackage.cud
        public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            h4hVar.beginObject();
            h4hVar.g("id").d(this.f21836a);
            h4hVar.g("x").e(this.f21837b);
            h4hVar.g("y").e(this.c);
            h4hVar.g("timeOffset").d(this.d);
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
    }

    public c() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove);
    }

    private void k(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new RRWebIncrementalSnapshotEvent.b().a(this, h4hVar, iLogger);
        List<b> list = this.e;
        if (list != null && !list.isEmpty()) {
            h4hVar.g("positions").j(iLogger, this.e);
        }
        h4hVar.g("pointerId").d(this.d);
        Map<String, Object> map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.g.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void l(@Nullable Map<String, Object> map) {
        this.g = map;
    }

    public void m(int i) {
        this.d = i;
    }

    public void n(@Nullable List<b> list) {
        this.e = list;
    }

    public void o(@Nullable Map<String, Object> map) {
        this.f = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new io.sentry.rrweb.b.C0972b().a(this, h4hVar, iLogger);
        h4hVar.g("data");
        k(h4hVar, iLogger);
        Map<String, Object> map = this.f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }
}

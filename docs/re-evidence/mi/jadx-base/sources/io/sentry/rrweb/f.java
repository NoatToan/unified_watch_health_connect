package io.sentry.rrweb;

import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends b implements cud {

    @NotNull
    public String c;
    public int d;
    public long e;
    public long f;

    @NotNull
    public String g;

    @NotNull
    public String h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21839k;

    @NotNull
    public String l;
    public int m;
    public int n;
    public int o;

    @Nullable
    public Map<String, Object> p;

    @Nullable
    public Map<String, Object> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21840r;

    public static final class a implements fsd<f> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            f fVar = new f();
            b.a aVar = new b.a();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("data")) {
                    c(fVar, f4hVar, iLogger);
                } else if (!aVar.a(fVar, strNextName, f4hVar, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            fVar.F(map);
            f4hVar.endObject();
            return fVar;
        }

        public final void c(@NotNull f fVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals(TSMAuthContants.PARAM_PAYLOAD)) {
                    d(fVar, f4hVar, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strB = f4hVar.B();
                    if (strB == null) {
                        strB = "";
                    }
                    fVar.c = strB;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            fVar.v(concurrentHashMap);
            f4hVar.endObject();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void d(@NotNull f fVar, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                byte b2 = -1;
                switch (strNextName.hashCode()) {
                    case -1992012396:
                        if (strNextName.equals("duration")) {
                            b2 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strNextName.equals("segmentId")) {
                            b2 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strNextName.equals("height")) {
                            b2 = 2;
                        }
                        break;
                    case -410956671:
                        if (strNextName.equals("container")) {
                            b2 = 3;
                        }
                        break;
                    case -296512606:
                        if (strNextName.equals("frameCount")) {
                            b2 = 4;
                        }
                        break;
                    case 115029:
                        if (strNextName.equals("top")) {
                            b2 = 5;
                        }
                        break;
                    case 3317767:
                        if (strNextName.equals("left")) {
                            b2 = 6;
                        }
                        break;
                    case 3530753:
                        if (strNextName.equals(MediaStoreUtil.MediaInfo.SIZE)) {
                            b2 = 7;
                        }
                        break;
                    case 113126854:
                        if (strNextName.equals("width")) {
                            b2 = 8;
                        }
                        break;
                    case 545057773:
                        if (strNextName.equals("frameRate")) {
                            b2 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strNextName.equals("encoding")) {
                            b2 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strNextName.equals("frameRateType")) {
                            b2 = 11;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        fVar.f = f4hVar.nextLong();
                        break;
                    case 1:
                        fVar.d = f4hVar.nextInt();
                        break;
                    case 2:
                        Integer numH0 = f4hVar.h0();
                        fVar.i = numH0 != null ? numH0.intValue() : 0;
                        break;
                    case 3:
                        String strB = f4hVar.B();
                        fVar.h = strB != null ? strB : "";
                        break;
                    case 4:
                        Integer numH1 = f4hVar.h0();
                        fVar.f21839k = numH1 != null ? numH1.intValue() : 0;
                        break;
                    case 5:
                        Integer numH2 = f4hVar.h0();
                        fVar.o = numH2 != null ? numH2.intValue() : 0;
                        break;
                    case 6:
                        Integer numH3 = f4hVar.h0();
                        fVar.n = numH3 != null ? numH3.intValue() : 0;
                        break;
                    case 7:
                        Long lJ0 = f4hVar.j0();
                        fVar.e = lJ0 == null ? 0L : lJ0.longValue();
                        break;
                    case 8:
                        Integer numH4 = f4hVar.h0();
                        fVar.j = numH4 != null ? numH4.intValue() : 0;
                        break;
                    case 9:
                        Integer numH5 = f4hVar.h0();
                        fVar.m = numH5 != null ? numH5.intValue() : 0;
                        break;
                    case 10:
                        String strB2 = f4hVar.B();
                        fVar.g = strB2 != null ? strB2 : "";
                        break;
                    case 11:
                        String strB3 = f4hVar.B();
                        fVar.l = strB3 != null ? strB3 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            fVar.B(concurrentHashMap);
            f4hVar.endObject();
        }
    }

    public f() {
        super(RRWebEventType.Custom);
        this.g = "h264";
        this.h = "mp4";
        this.l = "constant";
        this.c = "video";
    }

    private void t(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("tag").c(this.c);
        h4hVar.g(TSMAuthContants.PARAM_PAYLOAD);
        u(h4hVar, iLogger);
        Map<String, Object> map = this.f21840r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21840r.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    private void u(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("segmentId").d(this.d);
        h4hVar.g(MediaStoreUtil.MediaInfo.SIZE).d(this.e);
        h4hVar.g("duration").d(this.f);
        h4hVar.g("encoding").c(this.g);
        h4hVar.g("container").c(this.h);
        h4hVar.g("height").d(this.i);
        h4hVar.g("width").d(this.j);
        h4hVar.g("frameCount").d(this.f21839k);
        h4hVar.g("frameRate").d(this.m);
        h4hVar.g("frameRateType").c(this.l);
        h4hVar.g("left").d(this.n);
        h4hVar.g("top").d(this.o);
        Map<String, Object> map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.q.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void A(int i) {
        this.n = i;
    }

    public void B(@Nullable Map<String, Object> map) {
        this.q = map;
    }

    public void C(int i) {
        this.d = i;
    }

    public void D(long j) {
        this.e = j;
    }

    public void E(int i) {
        this.o = i;
    }

    public void F(@Nullable Map<String, Object> map) {
        this.p = map;
    }

    public void G(int i) {
        this.j = i;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        return this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.i == fVar.i && this.j == fVar.j && this.f21839k == fVar.f21839k && this.m == fVar.m && this.n == fVar.n && this.o == fVar.o && p.a(this.c, fVar.c) && p.a(this.g, fVar.g) && p.a(this.h, fVar.h) && p.a(this.l, fVar.l);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return p.b(Integer.valueOf(super.hashCode()), this.c, Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.f21839k), this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o));
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        new b.C0972b().a(this, h4hVar, iLogger);
        h4hVar.g("data");
        t(h4hVar, iLogger);
        Map<String, Object> map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.p.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void v(@Nullable Map<String, Object> map) {
        this.f21840r = map;
    }

    public void w(long j) {
        this.f = j;
    }

    public void x(int i) {
        this.f21839k = i;
    }

    public void y(int i) {
        this.m = i;
    }

    public void z(int i) {
        this.i = i;
    }
}

package io.sentry.protocol;

import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Long f21818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f21819b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public Boolean e;

    @Nullable
    public Boolean f;

    @Nullable
    public Boolean g;

    @Nullable
    public Boolean h;

    @Nullable
    public u i;

    @Nullable
    public Map<String, io.sentry.t> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21820k;

    public static final class a implements fsd<v> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            v vVar = new v();
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "daemon":
                        vVar.g = f4hVar.t();
                        break;
                    case "priority":
                        vVar.f21819b = f4hVar.h0();
                        break;
                    case "held_locks":
                        Map mapV = f4hVar.v(iLogger, new io.sentry.t.a());
                        if (mapV == null) {
                            break;
                        } else {
                            vVar.j = new HashMap(mapV);
                            break;
                        }
                        break;
                    case "id":
                        vVar.f21818a = f4hVar.j0();
                        break;
                    case "main":
                        vVar.h = f4hVar.t();
                        break;
                    case "name":
                        vVar.c = f4hVar.B();
                        break;
                    case "state":
                        vVar.d = f4hVar.B();
                        break;
                    case "crashed":
                        vVar.e = f4hVar.t();
                        break;
                    case "current":
                        vVar.f = f4hVar.t();
                        break;
                    case "stacktrace":
                        vVar.i = (u) f4hVar.A(iLogger, new u.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            vVar.A(concurrentHashMap);
            f4hVar.endObject();
            return vVar;
        }
    }

    public void A(@Nullable Map<String, Object> map) {
        this.f21820k = map;
    }

    @Nullable
    public Map<String, io.sentry.t> k() {
        return this.j;
    }

    @Nullable
    public Long l() {
        return this.f21818a;
    }

    @Nullable
    public String m() {
        return this.c;
    }

    @Nullable
    public u n() {
        return this.i;
    }

    @Nullable
    public Boolean o() {
        return this.f;
    }

    @Nullable
    public Boolean p() {
        return this.h;
    }

    public void q(@Nullable Boolean bool) {
        this.e = bool;
    }

    public void r(@Nullable Boolean bool) {
        this.f = bool;
    }

    public void s(@Nullable Boolean bool) {
        this.g = bool;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21818a != null) {
            h4hVar.g("id").i(this.f21818a);
        }
        if (this.f21819b != null) {
            h4hVar.g("priority").i(this.f21819b);
        }
        if (this.c != null) {
            h4hVar.g("name").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("state").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("crashed").k(this.e);
        }
        if (this.f != null) {
            h4hVar.g("current").k(this.f);
        }
        if (this.g != null) {
            h4hVar.g("daemon").k(this.g);
        }
        if (this.h != null) {
            h4hVar.g(FaceSchema.FACE_PAGE_MAIN).k(this.h);
        }
        if (this.i != null) {
            h4hVar.g("stacktrace").j(iLogger, this.i);
        }
        if (this.j != null) {
            h4hVar.g("held_locks").j(iLogger, this.j);
        }
        Map<String, Object> map = this.f21820k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21820k.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public void t(@Nullable Map<String, io.sentry.t> map) {
        this.j = map;
    }

    public void u(@Nullable Long l) {
        this.f21818a = l;
    }

    public void v(@Nullable Boolean bool) {
        this.h = bool;
    }

    public void w(@Nullable String str) {
        this.c = str;
    }

    public void x(@Nullable Integer num) {
        this.f21819b = num;
    }

    public void y(@Nullable u uVar) {
        this.i = uVar;
    }

    public void z(@Nullable String str) {
        this.d = str;
    }
}

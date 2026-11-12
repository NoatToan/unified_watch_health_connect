package io.sentry.protocol;

import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
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
public final class o implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21802b;

    @Nullable
    public String c;

    @Nullable
    public Long d;

    @Nullable
    public u e;

    @Nullable
    public g f;

    @Nullable
    public Map<String, Object> g;

    public static final class a implements fsd<o> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            o oVar = new o();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "thread_id":
                        oVar.d = f4hVar.j0();
                        break;
                    case "module":
                        oVar.c = f4hVar.B();
                        break;
                    case "type":
                        oVar.f21801a = f4hVar.B();
                        break;
                    case "value":
                        oVar.f21802b = f4hVar.B();
                        break;
                    case "mechanism":
                        oVar.f = (g) f4hVar.A(iLogger, new g.a());
                        break;
                    case "stacktrace":
                        oVar.e = (u) f4hVar.A(iLogger, new u.a());
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
            oVar.q(map);
            return oVar;
        }
    }

    @Nullable
    public g g() {
        return this.f;
    }

    @Nullable
    public String h() {
        return this.c;
    }

    @Nullable
    public u i() {
        return this.e;
    }

    @Nullable
    public Long j() {
        return this.d;
    }

    @Nullable
    public String k() {
        return this.f21801a;
    }

    public void l(@Nullable g gVar) {
        this.f = gVar;
    }

    public void m(@Nullable String str) {
        this.c = str;
    }

    public void n(@Nullable u uVar) {
        this.e = uVar;
    }

    public void o(@Nullable Long l) {
        this.d = l;
    }

    public void p(@Nullable String str) {
        this.f21801a = str;
    }

    public void q(@Nullable Map<String, Object> map) {
        this.g = map;
    }

    public void r(@Nullable String str) {
        this.f21802b = str;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21801a != null) {
            h4hVar.g("type").c(this.f21801a);
        }
        if (this.f21802b != null) {
            h4hVar.g("value").c(this.f21802b);
        }
        if (this.c != null) {
            h4hVar.g(RnReportConst.ApiReport.PARAM_MODULE).c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("thread_id").i(this.d);
        }
        if (this.e != null) {
            h4hVar.g("stacktrace").j(iLogger, this.e);
        }
        if (this.f != null) {
            h4hVar.g("mechanism").j(iLogger, this.f);
        }
        Map<String, Object> map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.g.get(str));
            }
        }
        h4hVar.endObject();
    }
}

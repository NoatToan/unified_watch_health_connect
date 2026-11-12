package io.sentry.protocol;

import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
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
public final class a0 implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f21772b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public Double e;

    @Nullable
    public Double f;

    @Nullable
    public Double g;

    @Nullable
    public Double h;

    @Nullable
    public String i;

    @Nullable
    public Double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public List<a0> f21773k;

    @Nullable
    public Map<String, Object> l;

    public static final class a implements fsd<a0> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            a0 a0Var = new a0();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "rendering_system":
                        a0Var.f21771a = f4hVar.B();
                        break;
                    case "identifier":
                        a0Var.c = f4hVar.B();
                        break;
                    case "height":
                        a0Var.f = f4hVar.W();
                        break;
                    case "x":
                        a0Var.g = f4hVar.W();
                        break;
                    case "y":
                        a0Var.h = f4hVar.W();
                        break;
                    case "tag":
                        a0Var.d = f4hVar.B();
                        break;
                    case "type":
                        a0Var.f21772b = f4hVar.B();
                        break;
                    case "alpha":
                        a0Var.j = f4hVar.W();
                        break;
                    case "width":
                        a0Var.e = f4hVar.W();
                        break;
                    case "children":
                        a0Var.f21773k = f4hVar.C(iLogger, this);
                        break;
                    case "visibility":
                        a0Var.i = f4hVar.B();
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
            a0Var.q(map);
            return a0Var;
        }
    }

    public void l(@Nullable Double d) {
        this.j = d;
    }

    public void m(@Nullable List<a0> list) {
        this.f21773k = list;
    }

    public void n(@Nullable Double d) {
        this.f = d;
    }

    public void o(@Nullable String str) {
        this.c = str;
    }

    public void p(String str) {
        this.f21772b = str;
    }

    public void q(@Nullable Map<String, Object> map) {
        this.l = map;
    }

    public void r(@Nullable String str) {
        this.i = str;
    }

    public void s(@Nullable Double d) {
        this.e = d;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21771a != null) {
            h4hVar.g("rendering_system").c(this.f21771a);
        }
        if (this.f21772b != null) {
            h4hVar.g("type").c(this.f21772b);
        }
        if (this.c != null) {
            h4hVar.g("identifier").c(this.c);
        }
        if (this.d != null) {
            h4hVar.g("tag").c(this.d);
        }
        if (this.e != null) {
            h4hVar.g("width").i(this.e);
        }
        if (this.f != null) {
            h4hVar.g("height").i(this.f);
        }
        if (this.g != null) {
            h4hVar.g("x").i(this.g);
        }
        if (this.h != null) {
            h4hVar.g("y").i(this.h);
        }
        if (this.i != null) {
            h4hVar.g("visibility").c(this.i);
        }
        if (this.j != null) {
            h4hVar.g(SleepAnalyzerAlpha.NAME_ALPHA).i(this.j);
        }
        List<a0> list = this.f21773k;
        if (list != null && !list.isEmpty()) {
            h4hVar.g("children").j(iLogger, this.f21773k);
        }
        Map<String, Object> map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.l.get(str));
            }
        }
        h4hVar.endObject();
    }

    public void t(@Nullable Double d) {
        this.g = d;
    }

    public void u(@Nullable Double d) {
        this.h = d;
    }
}

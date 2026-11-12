package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import defpackage.kvl;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f21799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f21800b;

    @Nullable
    public Set<q> c;

    @Nullable
    public Set<String> d;

    @Nullable
    public Map<String, Object> e;

    public static final class a implements fsd<n> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f4hVar.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "name":
                        strNextString = f4hVar.nextString();
                        break;
                    case "version":
                        strNextString2 = f4hVar.nextString();
                        break;
                    case "packages":
                        List listC = f4hVar.C(iLogger, new q.a());
                        if (listC == null) {
                            break;
                        } else {
                            arrayList.addAll(listC);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) f4hVar.q0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
            if (strNextString == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextString2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.a(SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            n nVar = new n(strNextString, strNextString2);
            nVar.c = new CopyOnWriteArraySet(arrayList);
            nVar.d = new CopyOnWriteArraySet(arrayList2);
            nVar.i(map);
            return nVar;
        }
    }

    public n(@NotNull String str, @NotNull String str2) {
        this.f21799a = (String) io.sentry.util.p.c(str, "name is required.");
        this.f21800b = (String) io.sentry.util.p.c(str2, "version is required.");
    }

    @NotNull
    public static n k(@Nullable n nVar, @NotNull String str, @NotNull String str2) {
        io.sentry.util.p.c(str, "name is required.");
        io.sentry.util.p.c(str2, "version is required.");
        if (nVar == null) {
            return new n(str, str2);
        }
        nVar.h(str);
        nVar.j(str2);
        return nVar;
    }

    public void c(@NotNull String str, @NotNull String str2) {
        kvl.c().b(str, str2);
    }

    @NotNull
    public Set<String> d() {
        Set<String> set = this.d;
        return set != null ? set : kvl.c().d();
    }

    @NotNull
    public String e() {
        return this.f21799a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f21799a.equals(nVar.f21799a) && this.f21800b.equals(nVar.f21800b);
    }

    @NotNull
    public Set<q> f() {
        Set<q> set = this.c;
        return set != null ? set : kvl.c().e();
    }

    @NotNull
    public String g() {
        return this.f21800b;
    }

    public void h(@NotNull String str) {
        this.f21799a = (String) io.sentry.util.p.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.p.b(this.f21799a, this.f21800b);
    }

    public void i(@Nullable Map<String, Object> map) {
        this.e = map;
    }

    public void j(@NotNull String str) {
        this.f21800b = (String) io.sentry.util.p.c(str, "version is required.");
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("name").c(this.f21799a);
        h4hVar.g("version").c(this.f21800b);
        Set<q> setF = f();
        Set<String> setD = d();
        if (!setF.isEmpty()) {
            h4hVar.g("packages").j(iLogger, setF);
        }
        if (!setD.isEmpty()) {
            h4hVar.g("integrations").j(iLogger, setD);
        }
        Map<String, Object> map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.e.get(str));
            }
        }
        h4hVar.endObject();
    }
}

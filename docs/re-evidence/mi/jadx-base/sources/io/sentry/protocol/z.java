package io.sentry.protocol;

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
public final class z implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f21826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<a0> f21827b;

    @Nullable
    public Map<String, Object> c;

    public static final class a implements fsd<z> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            String strB = null;
            List listC = null;
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("rendering_system")) {
                    strB = f4hVar.B();
                } else if (strNextName.equals("windows")) {
                    listC = f4hVar.C(iLogger, new a0.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            f4hVar.endObject();
            z zVar = new z(strB, listC);
            zVar.a(map);
            return zVar;
        }
    }

    public z(@Nullable String str, @Nullable List<a0> list) {
        this.f21826a = str;
        this.f21827b = list;
    }

    public void a(@Nullable Map<String, Object> map) {
        this.c = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21826a != null) {
            h4hVar.g("rendering_system").c(this.f21826a);
        }
        if (this.f21827b != null) {
            h4hVar.g("windows").j(iLogger, this.f21827b);
        }
        Map<String, Object> map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.c.get(str));
            }
        }
        h4hVar.endObject();
    }
}

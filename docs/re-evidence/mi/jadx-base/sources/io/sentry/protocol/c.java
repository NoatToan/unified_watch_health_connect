package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public m f21776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<DebugImage> f21777b;

    @Nullable
    public Map<String, Object> c;

    public static final class a implements fsd<c> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            c cVar = new c();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals("images")) {
                    cVar.f21777b = f4hVar.C(iLogger, new DebugImage.a());
                } else if (strNextName.equals("sdk_info")) {
                    cVar.f21776a = (m) f4hVar.A(iLogger, new m.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    f4hVar.l0(iLogger, map, strNextName);
                }
            }
            f4hVar.endObject();
            cVar.e(map);
            return cVar;
        }
    }

    @Nullable
    public List<DebugImage> c() {
        return this.f21777b;
    }

    public void d(@Nullable List<DebugImage> list) {
        this.f21777b = list != null ? new ArrayList(list) : null;
    }

    public void e(@Nullable Map<String, Object> map) {
        this.c = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21776a != null) {
            h4hVar.g("sdk_info").j(iLogger, this.f21776a);
        }
        if (this.f21777b != null) {
            h4hVar.g("images").j(iLogger, this.f21777b);
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

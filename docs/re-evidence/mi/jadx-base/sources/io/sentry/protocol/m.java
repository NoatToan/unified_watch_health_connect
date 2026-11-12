package io.sentry.protocol;

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
public final class m implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f21798b;

    @Nullable
    public Integer c;

    @Nullable
    public Integer d;

    @Nullable
    public Map<String, Object> e;

    public static final class a implements fsd<m> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            m mVar = new m();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "sdk_name":
                        mVar.f21797a = f4hVar.B();
                        break;
                    case "version_patchlevel":
                        mVar.d = f4hVar.h0();
                        break;
                    case "version_major":
                        mVar.f21798b = f4hVar.h0();
                        break;
                    case "version_minor":
                        mVar.c = f4hVar.h0();
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
            mVar.e(map);
            return mVar;
        }
    }

    public void e(@Nullable Map<String, Object> map) {
        this.e = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21797a != null) {
            h4hVar.g("sdk_name").c(this.f21797a);
        }
        if (this.f21798b != null) {
            h4hVar.g("version_major").i(this.f21798b);
        }
        if (this.c != null) {
            h4hVar.g("version_minor").i(this.c);
        }
        if (this.d != null) {
            h4hVar.g("version_patchlevel").i(this.d);
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

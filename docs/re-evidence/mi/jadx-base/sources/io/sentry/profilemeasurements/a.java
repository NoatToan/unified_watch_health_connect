package io.sentry.profilemeasurements;

import com.mibi.sdk.component.Constants;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.util.p;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class a implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f21760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f21761b;

    @NotNull
    public Collection<b> c;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C0969a implements fsd<a> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                if (strNextName.equals(Constants.KEY_RECHARGE_VALUES)) {
                    List listC = f4hVar.C(iLogger, new b.a());
                    if (listC != null) {
                        aVar.c = listC;
                    }
                } else if (strNextName.equals("unit")) {
                    String strB = f4hVar.B();
                    if (strB != null) {
                        aVar.f21761b = strB;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                }
            }
            aVar.c(concurrentHashMap);
            f4hVar.endObject();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(@Nullable Map<String, Object> map) {
        this.f21760a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return p.a(this.f21760a, aVar.f21760a) && this.f21761b.equals(aVar.f21761b) && new ArrayList(this.c).equals(new ArrayList(aVar.c));
    }

    public int hashCode() {
        return p.b(this.f21760a, this.f21761b, this.c);
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("unit").j(iLogger, this.f21761b);
        h4hVar.g(Constants.KEY_RECHARGE_VALUES).j(iLogger, this.c);
        Map<String, Object> map = this.f21760a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21760a.get(str);
                h4hVar.g(str);
                h4hVar.j(iLogger, obj);
            }
        }
        h4hVar.endObject();
    }

    public a(@NotNull String str, @NotNull Collection<b> collection) {
        this.f21761b = str;
        this.c = collection;
    }
}

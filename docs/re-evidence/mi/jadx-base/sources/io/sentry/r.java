package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class r implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f21830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f21831b;

    @NotNull
    public final SentryItemType c;
    public final int d;

    @Nullable
    public final Callable<Integer> e;

    @Nullable
    public final String f;

    @Nullable
    public Map<String, Object> g;

    public static final class a implements fsd<r> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            f4hVar.beginObject();
            HashMap map = null;
            SentryItemType sentryItemType = null;
            String strB = null;
            String strB2 = null;
            String strB3 = null;
            int iNextInt = 0;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "length":
                        iNextInt = f4hVar.nextInt();
                        break;
                    case "filename":
                        strB2 = f4hVar.B();
                        break;
                    case "attachment_type":
                        strB3 = f4hVar.B();
                        break;
                    case "type":
                        sentryItemType = (SentryItemType) f4hVar.A(iLogger, new SentryItemType.a());
                        break;
                    case "content_type":
                        strB = f4hVar.B();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        f4hVar.l0(iLogger, map, strNextName);
                        break;
                }
            }
            if (sentryItemType == null) {
                throw c("type", iLogger);
            }
            r rVar = new r(sentryItemType, iNextInt, strB, strB2, strB3);
            rVar.c(map);
            f4hVar.endObject();
            return rVar;
        }

        public final Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }
    }

    @ApiStatus.Internal
    public r(@NotNull SentryItemType sentryItemType, int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.c = (SentryItemType) io.sentry.util.p.c(sentryItemType, "type is required");
        this.f21830a = str;
        this.d = i;
        this.f21831b = str2;
        this.e = null;
        this.f = str3;
    }

    public int a() {
        Callable<Integer> callable = this.e;
        if (callable == null) {
            return this.d;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @NotNull
    public SentryItemType b() {
        return this.c;
    }

    public void c(@Nullable Map<String, Object> map) {
        this.g = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.f21830a != null) {
            h4hVar.g("content_type").c(this.f21830a);
        }
        if (this.f21831b != null) {
            h4hVar.g("filename").c(this.f21831b);
        }
        h4hVar.g("type").j(iLogger, this.c);
        if (this.f != null) {
            h4hVar.g("attachment_type").c(this.f);
        }
        h4hVar.g("length").d(a());
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

    public r(@NotNull SentryItemType sentryItemType, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.c = (SentryItemType) io.sentry.util.p.c(sentryItemType, "type is required");
        this.f21830a = str;
        this.d = -1;
        this.f21831b = str2;
        this.e = callable;
        this.f = str3;
    }

    public r(@NotNull SentryItemType sentryItemType, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2) {
        this(sentryItemType, callable, str, str2, (String) null);
    }
}

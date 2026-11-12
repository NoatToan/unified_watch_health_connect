package io.sentry.protocol;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements cud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f21788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f21789b;
    public double c;
    public int d;

    @Nullable
    public Map<String, String> e;

    @Nullable
    public Map<String, Object> f;

    public static final class a implements fsd<i> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            i iVar = new i();
            f4hVar.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "max":
                        iVar.c(f4hVar.nextDouble());
                        break;
                    case "min":
                        iVar.d(f4hVar.nextDouble());
                        break;
                    case "sum":
                        iVar.e(f4hVar.nextDouble());
                        break;
                    case "tags":
                        iVar.e = io.sentry.util.b.c((Map) f4hVar.q0());
                        break;
                    case "count":
                        iVar.b(f4hVar.nextInt());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        f4hVar.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            iVar.f(concurrentHashMap);
            f4hVar.endObject();
            return iVar;
        }
    }

    public i() {
    }

    public i(double d, double d2, double d3, int i, @Nullable Map<String, String> map) {
        this.e = map;
        this.f21788a = d;
        this.f21789b = d2;
        this.d = i;
        this.c = d3;
        this.f = null;
    }

    public void b(int i) {
        this.d = i;
    }

    public void c(double d) {
        this.f21789b = d;
    }

    public void d(double d) {
        this.f21788a = d;
    }

    public void e(double d) {
        this.c = d;
    }

    public void f(@Nullable Map<String, Object> map) {
        this.f = map;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        h4hVar.g("min").e(this.f21788a);
        h4hVar.g(VibrateModeSetFragment.MAX).e(this.f21789b);
        h4hVar.g("sum").e(this.c);
        h4hVar.g("count").d(this.d);
        if (this.e != null) {
            h4hVar.g("tags");
            h4hVar.j(iLogger, this.e);
        }
        h4hVar.endObject();
    }
}

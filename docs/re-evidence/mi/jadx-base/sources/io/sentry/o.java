package io.sentry;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.f4h;
import defpackage.h4h;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Contexts;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public io.sentry.protocol.p f21755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Contexts f21756b;

    @Nullable
    public io.sentry.protocol.n c;

    @Nullable
    public io.sentry.protocol.k d;

    @Nullable
    public Map<String, String> e;

    @Nullable
    public String f;

    @Nullable
    public String g;

    @Nullable
    public String h;

    @Nullable
    public io.sentry.protocol.y i;

    @Nullable
    public transient Throwable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f21757k;

    @Nullable
    public String l;

    @Nullable
    public List<io.sentry.a> m;

    @Nullable
    public io.sentry.protocol.c n;

    @Nullable
    public Map<String, Object> o;

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean a(@NotNull o oVar, @NotNull String str, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            str.hashCode();
            byte b2 = -1;
            switch (str.hashCode()) {
                case -1840434063:
                    if (str.equals("debug_meta")) {
                        b2 = 0;
                    }
                    break;
                case -758770169:
                    if (str.equals("server_name")) {
                        b2 = 1;
                    }
                    break;
                case -567312220:
                    if (str.equals("contexts")) {
                        b2 = 2;
                    }
                    break;
                case -85904877:
                    if (str.equals("environment")) {
                        b2 = 3;
                    }
                    break;
                case -51457840:
                    if (str.equals("breadcrumbs")) {
                        b2 = 4;
                    }
                    break;
                case 113722:
                    if (str.equals("sdk")) {
                        b2 = 5;
                    }
                    break;
                case 3083686:
                    if (str.equals("dist")) {
                        b2 = 6;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b2 = 7;
                    }
                    break;
                case 3599307:
                    if (str.equals(SceneRecogBroadcastReceiver.FROM_USER)) {
                        b2 = 8;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b2 = 9;
                    }
                    break;
                case 278118624:
                    if (str.equals("event_id")) {
                        b2 = 10;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        b2 = 11;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    oVar.n = (io.sentry.protocol.c) f4hVar.A(iLogger, new io.sentry.protocol.c.a());
                    return true;
                case 1:
                    oVar.f21757k = f4hVar.B();
                    return true;
                case 2:
                    oVar.f21756b.putAll(new Contexts.a().a(f4hVar, iLogger));
                    return true;
                case 3:
                    oVar.g = f4hVar.B();
                    return true;
                case 4:
                    oVar.m = f4hVar.C(iLogger, new io.sentry.a.C0967a());
                    return true;
                case 5:
                    oVar.c = (io.sentry.protocol.n) f4hVar.A(iLogger, new io.sentry.protocol.n.a());
                    return true;
                case 6:
                    oVar.l = f4hVar.B();
                    return true;
                case 7:
                    oVar.e = io.sentry.util.b.c((Map) f4hVar.q0());
                    return true;
                case 8:
                    oVar.i = (io.sentry.protocol.y) f4hVar.A(iLogger, new io.sentry.protocol.y.a());
                    return true;
                case 9:
                    oVar.o = io.sentry.util.b.c((Map) f4hVar.q0());
                    return true;
                case 10:
                    oVar.f21755a = (io.sentry.protocol.p) f4hVar.A(iLogger, new io.sentry.protocol.p.a());
                    return true;
                case 11:
                    oVar.f = f4hVar.B();
                    return true;
                case 12:
                    oVar.d = (io.sentry.protocol.k) f4hVar.A(iLogger, new io.sentry.protocol.k.a());
                    return true;
                case 13:
                    oVar.h = f4hVar.B();
                    return true;
                default:
                    return false;
            }
        }
    }

    public static final class b {
        public void a(@NotNull o oVar, @NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            if (oVar.f21755a != null) {
                h4hVar.g("event_id").j(iLogger, oVar.f21755a);
            }
            h4hVar.g("contexts").j(iLogger, oVar.f21756b);
            if (oVar.c != null) {
                h4hVar.g("sdk").j(iLogger, oVar.c);
            }
            if (oVar.d != null) {
                h4hVar.g("request").j(iLogger, oVar.d);
            }
            if (oVar.e != null && !oVar.e.isEmpty()) {
                h4hVar.g("tags").j(iLogger, oVar.e);
            }
            if (oVar.f != null) {
                h4hVar.g("release").c(oVar.f);
            }
            if (oVar.g != null) {
                h4hVar.g("environment").c(oVar.g);
            }
            if (oVar.h != null) {
                h4hVar.g("platform").c(oVar.h);
            }
            if (oVar.i != null) {
                h4hVar.g(SceneRecogBroadcastReceiver.FROM_USER).j(iLogger, oVar.i);
            }
            if (oVar.f21757k != null) {
                h4hVar.g("server_name").c(oVar.f21757k);
            }
            if (oVar.l != null) {
                h4hVar.g("dist").c(oVar.l);
            }
            if (oVar.m != null && !oVar.m.isEmpty()) {
                h4hVar.g("breadcrumbs").j(iLogger, oVar.m);
            }
            if (oVar.n != null) {
                h4hVar.g("debug_meta").j(iLogger, oVar.n);
            }
            if (oVar.o == null || oVar.o.isEmpty()) {
                return;
            }
            h4hVar.g("extra").j(iLogger, oVar.o);
        }
    }

    public o(@NotNull io.sentry.protocol.p pVar) {
        this.f21756b = new Contexts();
        this.f21755a = pVar;
    }

    @Nullable
    public List<io.sentry.a> B() {
        return this.m;
    }

    @NotNull
    public Contexts C() {
        return this.f21756b;
    }

    @Nullable
    public io.sentry.protocol.c D() {
        return this.n;
    }

    @Nullable
    public String E() {
        return this.l;
    }

    @Nullable
    public String F() {
        return this.g;
    }

    @Nullable
    public io.sentry.protocol.p G() {
        return this.f21755a;
    }

    @Nullable
    public Map<String, Object> H() {
        return this.o;
    }

    @Nullable
    public String I() {
        return this.h;
    }

    @Nullable
    public String J() {
        return this.f;
    }

    @Nullable
    public io.sentry.protocol.k K() {
        return this.d;
    }

    @Nullable
    public io.sentry.protocol.n L() {
        return this.c;
    }

    @Nullable
    public String M() {
        return this.f21757k;
    }

    @ApiStatus.Internal
    @Nullable
    public Map<String, String> N() {
        return this.e;
    }

    @Nullable
    public Throwable O() {
        Throwable th = this.j;
        return th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).getThrowable() : th;
    }

    @ApiStatus.Internal
    @Nullable
    public Throwable P() {
        return this.j;
    }

    @Nullable
    public io.sentry.protocol.y Q() {
        return this.i;
    }

    public void R(@Nullable List<io.sentry.a> list) {
        this.m = io.sentry.util.b.b(list);
    }

    public void S(@Nullable io.sentry.protocol.c cVar) {
        this.n = cVar;
    }

    public void T(@Nullable String str) {
        this.l = str;
    }

    public void U(@Nullable String str) {
        this.g = str;
    }

    public void V(@Nullable io.sentry.protocol.p pVar) {
        this.f21755a = pVar;
    }

    public void W(@NotNull String str, @NotNull Object obj) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        this.o.put(str, obj);
    }

    public void X(@Nullable Map<String, Object> map) {
        this.o = io.sentry.util.b.d(map);
    }

    public void Y(@Nullable String str) {
        this.h = str;
    }

    public void Z(@Nullable String str) {
        this.f = str;
    }

    public void a0(@Nullable io.sentry.protocol.k kVar) {
        this.d = kVar;
    }

    public void b0(@Nullable io.sentry.protocol.n nVar) {
        this.c = nVar;
    }

    public void c0(@Nullable String str) {
        this.f21757k = str;
    }

    public void d0(@NotNull String str, @NotNull String str2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, str2);
    }

    public void e0(@Nullable Map<String, String> map) {
        this.e = io.sentry.util.b.d(map);
    }

    public void f0(@Nullable io.sentry.protocol.y yVar) {
        this.i = yVar;
    }

    public o() {
        this(new io.sentry.protocol.p());
    }
}

package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import defpackage.bx1;
import defpackage.c8c;
import defpackage.gvl;
import defpackage.tvl;
import io.sentry.SentryLevel;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Device;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class i0 implements bx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryAndroidOptions f21474b;

    @NotNull
    public final r0 c;

    @NotNull
    public final gvl d;

    public i0(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull r0 r0Var) {
        this.f21473a = u0.a(context);
        this.f21474b = sentryAndroidOptions;
        this.c = r0Var;
        this.d = new gvl(new tvl(sentryAndroidOptions));
    }

    public final void A(@NotNull io.sentry.o oVar) {
        if (oVar.I() == null) {
            oVar.Y("java");
        }
    }

    public final void B(@NotNull io.sentry.o oVar) {
        if (oVar.J() == null) {
            oVar.Z((String) io.sentry.cache.h.i(this.f21474b, "release.json", String.class));
        }
    }

    public final void C(@NotNull io.sentry.s sVar) {
        String str = (String) io.sentry.cache.p.x(this.f21474b, "replay.json", String.class);
        if (!new File(this.f21474b.getCacheDirPath(), "replay_" + str).exists()) {
            if (!n(sVar)) {
                return;
            }
            File[] fileArrListFiles = new File(this.f21474b.getCacheDirPath()).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= sVar.u0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.p.A(this.f21474b, str, "replay.json");
        sVar.C().put(Contexts.REPLAY_ID, str);
    }

    public final void D(@NotNull io.sentry.o oVar) {
        if (oVar.K() == null) {
            oVar.a0((io.sentry.protocol.k) io.sentry.cache.p.x(this.f21474b, "request.json", io.sentry.protocol.k.class));
        }
    }

    public final void E(@NotNull io.sentry.o oVar) {
        Map map = (Map) io.sentry.cache.p.x(this.f21474b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (oVar.N() == null) {
            oVar.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!oVar.N().containsKey(entry.getKey())) {
                oVar.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public final void F(@NotNull io.sentry.o oVar) {
        if (oVar.L() == null) {
            oVar.b0((io.sentry.protocol.n) io.sentry.cache.h.i(this.f21474b, "sdk-version.json", io.sentry.protocol.n.class));
        }
    }

    public final void G(@NotNull io.sentry.o oVar) {
        try {
            u0.a aVarQ = u0.q(this.f21473a, this.f21474b.getLogger(), this.c);
            if (aVarQ != null) {
                for (Map.Entry<String, String> entry : aVarQ.a().entrySet()) {
                    oVar.d0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f21474b.getLogger().a(SentryLevel.ERROR, "Error getting side loaded info.", th);
        }
    }

    public final void H(@NotNull io.sentry.s sVar) {
        m(sVar);
        G(sVar);
    }

    public final void I(@NotNull io.sentry.s sVar) {
        io.sentry.v vVar = (io.sentry.v) io.sentry.cache.p.x(this.f21474b, "trace.json", io.sentry.v.class);
        if (sVar.C().getTrace() != null || vVar == null || vVar.h() == null || vVar.k() == null) {
            return;
        }
        sVar.C().setTrace(vVar);
    }

    public final void J(@NotNull io.sentry.s sVar) {
        String str = (String) io.sentry.cache.p.x(this.f21474b, "transaction.json", String.class);
        if (sVar.v0() == null) {
            sVar.G0(str);
        }
    }

    public final void K(@NotNull io.sentry.o oVar) {
        if (oVar.Q() == null) {
            oVar.f0((io.sentry.protocol.y) io.sentry.cache.p.x(this.f21474b, "user.json", io.sentry.protocol.y.class));
        }
    }

    @Override // defpackage.ae8
    @Nullable
    public io.sentry.s a(@NotNull io.sentry.s sVar, @NotNull c8c c8cVar) {
        Object objG = io.sentry.util.j.g(c8cVar);
        if (!(objG instanceof io.sentry.hints.c)) {
            this.f21474b.getLogger().c(SentryLevel.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return sVar;
        }
        v(sVar, objG);
        A(sVar);
        l(sVar);
        s(sVar);
        if (!((io.sentry.hints.c) objG).shouldEnrich()) {
            this.f21474b.getLogger().c(SentryLevel.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return sVar;
        }
        e(sVar, objG);
        d(sVar, objG);
        H(sVar);
        return sVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public io.sentry.protocol.w b(@NotNull io.sentry.protocol.w wVar, @NotNull c8c c8cVar) {
        return wVar;
    }

    public final void d(@NotNull io.sentry.s sVar, @NotNull Object obj) {
        B(sVar);
        u(sVar);
        t(sVar);
        r(sVar);
        F(sVar);
        o(sVar, obj);
        z(sVar);
    }

    public final void e(@NotNull io.sentry.s sVar, @NotNull Object obj) {
        D(sVar);
        K(sVar);
        E(sVar);
        p(sVar);
        w(sVar);
        q(sVar);
        J(sVar);
        x(sVar, obj);
        y(sVar);
        I(sVar);
        C(sVar);
    }

    @Nullable
    public final io.sentry.protocol.v f(@Nullable List<io.sentry.protocol.v> list) {
        if (list == null) {
            return null;
        }
        for (io.sentry.protocol.v vVar : list) {
            String strM = vVar.m();
            if (strM != null && strM.equals(FaceSchema.FACE_PAGE_MAIN)) {
                return vVar;
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public final Device g() {
        Device device = new Device();
        if (this.f21474b.isSendDefaultPii()) {
            device.g0(u0.e(this.f21473a));
        }
        device.c0(Build.MANUFACTURER);
        device.Q(Build.BRAND);
        device.V(u0.g(this.f21474b.getLogger()));
        device.e0(Build.MODEL);
        device.f0(Build.ID);
        device.M(u0.d(this.c));
        ActivityManager.MemoryInfo memoryInfoI = u0.i(this.f21473a, this.f21474b.getLogger());
        if (memoryInfoI != null) {
            device.d0(i(memoryInfoI));
        }
        device.p0(this.c.f());
        DisplayMetrics displayMetricsF = u0.f(this.f21473a, this.f21474b.getLogger());
        if (displayMetricsF != null) {
            device.o0(Integer.valueOf(displayMetricsF.widthPixels));
            device.n0(Integer.valueOf(displayMetricsF.heightPixels));
            device.l0(Float.valueOf(displayMetricsF.density));
            device.m0(Integer.valueOf(displayMetricsF.densityDpi));
        }
        if (device.J() == null) {
            device.Y(h());
        }
        List<Integer> listC = io.sentry.android.core.internal.util.f.a().c();
        if (!listC.isEmpty()) {
            device.k0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            device.j0(Integer.valueOf(listC.size()));
        }
        return device;
    }

    @Nullable
    public final String h() {
        try {
            return d1.a(this.f21473a);
        } catch (Throwable th) {
            this.f21474b.getLogger().a(SentryLevel.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    @NotNull
    public final Long i(@NotNull ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    @NotNull
    public final io.sentry.protocol.j j() {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.j(YRNConstants.PLATFORM);
        jVar.m(Build.VERSION.RELEASE);
        jVar.h(Build.DISPLAY);
        try {
            jVar.i(u0.h(this.f21474b.getLogger()));
        } catch (Throwable th) {
            this.f21474b.getLogger().a(SentryLevel.ERROR, "Error getting OperatingSystem.", th);
        }
        return jVar;
    }

    public final boolean k(@NotNull Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).d());
        }
        return false;
    }

    public final void l(@NotNull io.sentry.o oVar) {
        String str;
        io.sentry.protocol.j operatingSystem = oVar.C().getOperatingSystem();
        oVar.C().setOperatingSystem(j());
        if (operatingSystem != null) {
            String strG = operatingSystem.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            oVar.C().put(str, operatingSystem);
        }
    }

    public final void m(@NotNull io.sentry.o oVar) {
        io.sentry.protocol.y yVarQ = oVar.Q();
        if (yVarQ == null) {
            yVarQ = new io.sentry.protocol.y();
            oVar.f0(yVarQ);
        }
        if (yVarQ.k() == null) {
            yVarQ.n(h());
        }
        if (yVarQ.l() == null) {
            yVarQ.o("{{auto}}");
        }
    }

    public final boolean n(@NotNull io.sentry.s sVar) {
        String str = (String) io.sentry.cache.h.i(this.f21474b, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.t.a().nextDouble()) {
                return true;
            }
            this.f21474b.getLogger().c(SentryLevel.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", sVar.G());
            return false;
        } catch (Throwable th) {
            this.f21474b.getLogger().a(SentryLevel.ERROR, "Error parsing replay sample rate.", th);
            return false;
        }
    }

    public final void o(@NotNull io.sentry.o oVar, @NotNull Object obj) {
        io.sentry.protocol.a app = oVar.C().getApp();
        if (app == null) {
            app = new io.sentry.protocol.a();
        }
        app.n(u0.c(this.f21473a, this.f21474b.getLogger()));
        app.q(Boolean.valueOf(!k(obj)));
        PackageInfo packageInfoK = u0.k(this.f21473a, this.f21474b.getLogger(), this.c);
        if (packageInfoK != null) {
            app.m(packageInfoK.packageName);
        }
        String strJ = oVar.J() != null ? oVar.J() : (String) io.sentry.cache.h.i(this.f21474b, "release.json", String.class);
        if (strJ != null) {
            try {
                String strSubstring = strJ.substring(strJ.indexOf(64) + 1, strJ.indexOf(43));
                String strSubstring2 = strJ.substring(strJ.indexOf(43) + 1);
                app.p(strSubstring);
                app.l(strSubstring2);
            } catch (Throwable unused) {
                this.f21474b.getLogger().c(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", strJ);
            }
        }
        oVar.C().setApp(app);
    }

    public final void p(@NotNull io.sentry.o oVar) {
        List list = (List) io.sentry.cache.p.y(this.f21474b, "breadcrumbs.json", List.class, new io.sentry.a.C0967a());
        if (list == null) {
            return;
        }
        if (oVar.B() == null) {
            oVar.R(new ArrayList(list));
        } else {
            oVar.B().addAll(list);
        }
    }

    public final void q(@NotNull io.sentry.o oVar) {
        Contexts contexts = (Contexts) io.sentry.cache.p.x(this.f21474b, "contexts.json", Contexts.class);
        if (contexts == null) {
            return;
        }
        Contexts contextsC = oVar.C();
        for (Map.Entry<String, Object> entry : new Contexts(contexts).entrySet()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof io.sentry.v)) {
                if (!contextsC.containsKey(entry.getKey())) {
                    contextsC.put(entry.getKey(), value);
                }
            }
        }
    }

    public final void r(@NotNull io.sentry.o oVar) {
        io.sentry.protocol.c cVarD = oVar.D();
        if (cVarD == null) {
            cVarD = new io.sentry.protocol.c();
        }
        if (cVarD.c() == null) {
            cVarD.d(new ArrayList());
        }
        List<DebugImage> listC = cVarD.c();
        if (listC != null) {
            String str = (String) io.sentry.cache.h.i(this.f21474b, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listC.add(debugImage);
            }
            oVar.S(cVarD);
        }
    }

    public final void s(@NotNull io.sentry.o oVar) {
        if (oVar.C().getDevice() == null) {
            oVar.C().setDevice(g());
        }
    }

    public final void t(@NotNull io.sentry.o oVar) {
        String str;
        if (oVar.E() == null) {
            oVar.T((String) io.sentry.cache.h.i(this.f21474b, "dist.json", String.class));
        }
        if (oVar.E() != null || (str = (String) io.sentry.cache.h.i(this.f21474b, "release.json", String.class)) == null) {
            return;
        }
        try {
            oVar.T(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f21474b.getLogger().c(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    public final void u(@NotNull io.sentry.o oVar) {
        if (oVar.F() == null) {
            String environment = (String) io.sentry.cache.h.i(this.f21474b, "environment.json", String.class);
            if (environment == null) {
                environment = this.f21474b.getEnvironment();
            }
            oVar.U(environment);
        }
    }

    public final void v(@NotNull io.sentry.s sVar, @NotNull Object obj) {
        io.sentry.protocol.g gVar = new io.sentry.protocol.g();
        if (((io.sentry.hints.c) obj).shouldEnrich()) {
            gVar.j("AppExitInfo");
        } else {
            gVar.j("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (k(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        io.sentry.protocol.v vVarF = f(sVar.t0());
        if (vVarF == null) {
            vVarF = new io.sentry.protocol.v();
            vVarF.y(new io.sentry.protocol.u());
        }
        sVar.z0(this.d.e(vVarF, gVar, applicationNotResponding));
    }

    public final void w(@NotNull io.sentry.o oVar) {
        Map map = (Map) io.sentry.cache.p.x(this.f21474b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (oVar.H() == null) {
            oVar.X(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!oVar.H().containsKey(entry.getKey())) {
                oVar.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final void x(@NotNull io.sentry.s sVar, @NotNull Object obj) {
        List<String> list = (List) io.sentry.cache.p.x(this.f21474b, "fingerprint.json", List.class);
        if (sVar.q0() == null) {
            sVar.A0(list);
        }
        boolean zK = k(obj);
        if (sVar.q0() == null) {
            String[] strArr = new String[2];
            strArr[0] = "{{ default }}";
            strArr[1] = zK ? "background-anr" : "foreground-anr";
            sVar.A0(Arrays.asList(strArr));
        }
    }

    public final void y(@NotNull io.sentry.s sVar) {
        SentryLevel sentryLevel = (SentryLevel) io.sentry.cache.p.x(this.f21474b, "level.json", SentryLevel.class);
        if (sVar.r0() == null) {
            sVar.B0(sentryLevel);
        }
    }

    public final void z(@NotNull io.sentry.o oVar) {
        Map map = (Map) io.sentry.cache.h.i(this.f21474b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (oVar.N() == null) {
            oVar.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!oVar.N().containsKey(entry.getKey())) {
                oVar.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}

package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.r0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class m {
    public static final Charset g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r0 f21520b;

    @NotNull
    public final ILogger c;

    @NotNull
    public final String[] d;

    @NotNull
    public final String[] e;

    @NotNull
    public final Runtime f;

    public m(@NotNull Context context, @NotNull r0 r0Var, @NotNull ILogger iLogger) {
        this(context, r0Var, iLogger, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    public final boolean a() {
        for (String str : this.d) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (RuntimeException e) {
                this.c.b(SentryLevel.ERROR, e, "Error when trying to check if root file %s exists.", str);
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final boolean b(@NotNull ILogger iLogger) {
        r0 r0Var = new r0(iLogger);
        PackageManager packageManager = this.f21519a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.e) {
                try {
                    if (r0Var.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean c() {
        Process processExec = null;
        try {
            try {
                processExec = this.f.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), g));
                try {
                    boolean z = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    processExec.destroy();
                    return z;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th3;
            }
        } catch (IOException unused) {
            this.c.c(SentryLevel.DEBUG, "SU isn't found on this Device.", new Object[0]);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th4) {
            this.c.a(SentryLevel.DEBUG, "Error when trying to check if SU exists.", th4);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    public final boolean d() {
        String strA = this.f21520b.a();
        return strA != null && strA.contains("test-keys");
    }

    public boolean e() {
        return d() || a() || c() || b(this.c);
    }

    public m(@NotNull Context context, @NotNull r0 r0Var, @NotNull ILogger iLogger, @NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Runtime runtime) {
        this.f21519a = (Context) io.sentry.util.p.c(context, "The application context is required.");
        this.f21520b = (r0) io.sentry.util.p.c(r0Var, "The BuildInfoProvider is required.");
        this.c = (ILogger) io.sentry.util.p.c(iLogger, "The Logger is required.");
        this.d = (String[]) io.sentry.util.p.c(strArr, "The root Files are required.");
        this.e = (String[]) io.sentry.util.p.c(strArr2, "The root packages are required.");
        this.f = (Runtime) io.sentry.util.p.c(runtime, "The Runtime is required.");
    }
}

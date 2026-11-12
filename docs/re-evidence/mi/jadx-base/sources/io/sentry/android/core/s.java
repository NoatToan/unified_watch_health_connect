package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import defpackage.m05;
import defpackage.sqh;
import defpackage.vvc;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import miuix.animation.internal.FolmeCore;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class s implements vvc {

    @NotNull
    public final ILogger h;

    @NotNull
    public final r0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21586a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21587b = 0;
    public long c = 1;
    public long d = 1;
    public final long e = FolmeCore.NANOS_TO_S;
    public double f = 1.0E9d / 1;

    @NotNull
    public final File g = new File("/proc/self/stat");
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Pattern f21588k = Pattern.compile("[\n\t\r ]");

    public s(@NotNull ILogger iLogger, @NotNull r0 r0Var) {
        this.h = (ILogger) io.sentry.util.p.c(iLogger, "Logger is required.");
        this.i = (r0) io.sentry.util.p.c(r0Var, "BuildInfoProvider is required.");
    }

    @Override // defpackage.vvc
    @SuppressLint({"NewApi"})
    public void c() {
        if (this.i.d() < 21) {
            this.j = false;
            return;
        }
        this.j = true;
        this.c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f = 1.0E9d / this.c;
        this.f21587b = e();
    }

    @Override // defpackage.vvc
    @SuppressLint({"NewApi"})
    public void d(@NotNull sqh sqhVar) {
        if (this.i.d() < 21 || !this.j) {
            return;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j = jElapsedRealtimeNanos - this.f21586a;
        this.f21586a = jElapsedRealtimeNanos;
        long jE = e();
        long j2 = jE - this.f21587b;
        this.f21587b = jE;
        sqhVar.a(new m05(System.currentTimeMillis(), ((j2 / j) / this.d) * 100.0d));
    }

    public final long e() {
        String strC;
        try {
            strC = io.sentry.util.e.c(this.g);
        } catch (IOException e) {
            this.j = false;
            this.h.a(SentryLevel.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f21588k.split(strC.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
                this.h.a(SentryLevel.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }
}

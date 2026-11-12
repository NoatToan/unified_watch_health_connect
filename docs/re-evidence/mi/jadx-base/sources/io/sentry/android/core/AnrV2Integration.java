package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.c8c;
import defpackage.dm1;
import defpackage.ftc;
import defpackage.n0a;
import defpackage.ucd;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements ucd, Closeable {
    public static final long d = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.sentry.transport.p f21377b;

    @Nullable
    public SentryAndroidOptions c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f21378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ftc f21379b;

        @NotNull
        public final SentryAndroidOptions c;
        public final long d;

        public a(@NotNull Context context, @NotNull ftc ftcVar, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.transport.p pVar) {
            this.f21378a = context;
            this.f21379b = ftcVar;
            this.c = sentryAndroidOptions;
            this.d = pVar.a() - AnrV2Integration.d;
        }

        public final byte[] a(@NotNull InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr, 0, 1024);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @NotNull
        public final c b(@NotNull ApplicationExitInfo applicationExitInfo, boolean z) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream != null) {
                            traceInputStream.close();
                        }
                        return cVar;
                    }
                    byte[] bArrA = a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrA)));
                        try {
                            List<io.sentry.protocol.v> listF = new io.sentry.android.core.internal.threaddump.c(this.c, z).f(io.sentry.android.core.internal.threaddump.b.c(bufferedReader));
                            if (listF.isEmpty()) {
                                c cVar2 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar2;
                            }
                            c cVar3 = new c(c.a.DUMP, bArrA, listF);
                            bufferedReader.close();
                            return cVar3;
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        this.c.getLogger().a(SentryLevel.WARNING, "Failed to parse ANR thread dump", th3);
                        return new c(c.a.ERROR, bArrA);
                    }
                } catch (Throwable th4) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                this.c.getLogger().a(SentryLevel.WARNING, "Failed to read ANR thread dump", th6);
                return new c(c.a.NO_DUMP);
            }
        }

        public final void c(@NotNull ApplicationExitInfo applicationExitInfo, boolean z) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z2 = applicationExitInfo.getImportance() != 100;
            c cVarB = b(applicationExitInfo, z2);
            if (cVarB.f21380a == c.a.NO_DUMP) {
                this.c.getLogger().c(SentryLevel.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            b bVar = new b(this.c.getFlushTimeoutMillis(), this.c.getLogger(), timestamp, z, z2);
            c8c c8cVarE = io.sentry.util.j.e(bVar);
            io.sentry.s sVar = new io.sentry.s();
            c.a aVar = cVarB.f21380a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.h hVar = new io.sentry.protocol.h();
                hVar.d("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                sVar.C0(hVar);
            } else if (aVar == c.a.DUMP) {
                sVar.E0(cVarB.c);
            }
            sVar.B0(SentryLevel.FATAL);
            sVar.F0(yq5.d(timestamp));
            if (this.c.isAttachAnrThreadDump() && (bArr = cVarB.f21381b) != null) {
                c8cVarE.o(dm1.b(bArr));
            }
            if (this.f21379b.t(sVar, c8cVarE).equals(io.sentry.protocol.p.f21803b) || bVar.g()) {
                return;
            }
            this.c.getLogger().c(SentryLevel.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", sVar.G());
        }

        public final void d(@NotNull List<ApplicationExitInfo> list, @Nullable Long l) {
            Collections.reverse(list);
            Iterator<ApplicationExitInfo> it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = n0a.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    if (applicationExitInfoA.getTimestamp() < this.d) {
                        this.c.getLogger().c(SentryLevel.DEBUG, "ANR happened too long ago %s.", applicationExitInfoA);
                    } else if (l == null || applicationExitInfoA.getTimestamp() > l.longValue()) {
                        c(applicationExitInfoA, false);
                    } else {
                        this.c.getLogger().c(SentryLevel.DEBUG, "ANR has already been reported %s.", applicationExitInfoA);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List historicalProcessExitReasons = ((ActivityManager) this.f21378a.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.c.getLogger().c(SentryLevel.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.g envelopeDiskCache = this.c.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.c.isEnableAutoSessionTracking()) {
                io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
                if (!fVar.L()) {
                    this.c.getLogger().c(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    fVar.B();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lX = io.sentry.android.core.cache.b.X(this.c);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = n0a.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    arrayList.remove(applicationExitInfoA);
                    applicationExitInfo = applicationExitInfoA;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.c.getLogger().c(SentryLevel.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.d) {
                this.c.getLogger().c(SentryLevel.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lX != null && applicationExitInfo.getTimestamp() <= lX.longValue()) {
                this.c.getLogger().c(SentryLevel.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.c.isReportHistoricalAnrs()) {
                d(arrayList, lX);
            }
            c(applicationExitInfo, true);
        }
    }

    @ApiStatus.Internal
    public static final class b extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {
        public final long d;
        public final boolean e;
        public final boolean f;

        public b(long j, @NotNull ILogger iLogger, long j2, boolean z, boolean z2) {
            super(j, iLogger);
            this.d = j2;
            this.e = z;
            this.f = z2;
        }

        @Override // io.sentry.hints.a
        public Long b() {
            return Long.valueOf(this.d);
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return false;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.f
        public boolean e(@Nullable io.sentry.protocol.p pVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void f(@NotNull io.sentry.protocol.p pVar) {
        }

        @Override // io.sentry.hints.c
        public boolean shouldEnrich() {
            return this.e;
        }
    }

    public AnrV2Integration(@NotNull Context context) {
        this(context, io.sentry.transport.n.b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // defpackage.ucd
    @SuppressLint({"NewApi"})
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.c.isAnrEnabled()));
        if (this.c.getCacheDirPath() == null) {
            this.c.getLogger().c(SentryLevel.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.c.isAnrEnabled()) {
            try {
                sentryOptions.getExecutorService().submit(new a(this.f21376a, ftcVar, this.c, this.f21377b));
            } catch (Throwable th) {
                sentryOptions.getLogger().a(SentryLevel.DEBUG, "Failed to start AnrProcessor.", th);
            }
            sentryOptions.getLogger().c(SentryLevel.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.k.a("AnrV2");
        }
    }

    public AnrV2Integration(@NotNull Context context, @NotNull io.sentry.transport.p pVar) {
        this.f21376a = u0.a(context);
        this.f21377b = pVar;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f21380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f21381b;

        @Nullable
        public final List<io.sentry.protocol.v> c;

        public enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        public c(@NotNull a aVar) {
            this.f21380a = aVar;
            this.f21381b = null;
            this.c = null;
        }

        public c(@NotNull a aVar, byte[] bArr) {
            this.f21380a = aVar;
            this.f21381b = bArr;
            this.c = null;
        }

        public c(@NotNull a aVar, byte[] bArr, @Nullable List<io.sentry.protocol.v> list) {
            this.f21380a = aVar;
            this.f21381b = bArr;
            this.c = list;
        }
    }
}

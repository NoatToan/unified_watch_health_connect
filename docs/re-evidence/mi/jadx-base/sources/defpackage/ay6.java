package defpackage;

import io.sentry.DataCategory;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.hints.e;
import io.sentry.hints.g;
import io.sentry.hints.h;
import io.sentry.hints.j;
import io.sentry.hints.o;
import io.sentry.transport.z;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ay6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ftc f3562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ILogger f3563b;
    public final long c;
    public final Queue<String> d;

    public static final class a implements e, j, o, h, g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3564a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3565b = false;
        public final CountDownLatch c = new CountDownLatch(1);
        public final long d;

        @NotNull
        public final ILogger e;

        @NotNull
        public final String f;

        @NotNull
        public final Queue<String> g;

        public a(long j, @NotNull ILogger iLogger, @NotNull String str, @NotNull Queue<String> queue) {
            this.d = j;
            this.f = str;
            this.g = queue;
            this.e = iLogger;
        }

        @Override // io.sentry.hints.g
        public void a() {
            this.g.add(this.f);
        }

        @Override // io.sentry.hints.j
        public boolean b() {
            return this.f3564a;
        }

        @Override // io.sentry.hints.o
        public void c(boolean z) {
            this.f3565b = z;
            this.c.countDown();
        }

        @Override // io.sentry.hints.j
        public void d(boolean z) {
            this.f3564a = z;
        }

        @Override // io.sentry.hints.h
        public boolean g() {
            try {
                return this.c.await(this.d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.e.a(SentryLevel.ERROR, "Exception while awaiting on lock.", e);
                return false;
            }
        }

        @Override // io.sentry.hints.o
        public boolean isSuccess() {
            return this.f3565b;
        }
    }

    public ay6(@NotNull ftc ftcVar, @NotNull ILogger iLogger, long j, int i) {
        this.f3562a = ftcVar;
        this.f3563b = iLogger;
        this.c = j;
        this.d = lvo.g(new tw3(i));
    }

    public abstract boolean c(String str);

    public final /* synthetic */ boolean d(File file, String str) {
        return c(str);
    }

    public void e(@NotNull File file) {
        try {
            ILogger iLogger = this.f3563b;
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            iLogger.c(sentryLevel, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f3563b.c(SentryLevel.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
                return;
            }
            if (!file.isDirectory()) {
                this.f3563b.c(SentryLevel.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                this.f3563b.c(SentryLevel.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: zx6
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f41769a.d(file2, str);
                }
            });
            ILogger iLogger2 = this.f3563b;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0);
            objArr[1] = file.getAbsolutePath();
            iLogger2.c(sentryLevel, "Processing %d items from cache dir %s", objArr);
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.d.contains(absolutePath)) {
                        this.f3563b.c(SentryLevel.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        z zVarG = this.f3562a.g();
                        if (zVarG != null && zVarG.o(DataCategory.All)) {
                            this.f3563b.c(SentryLevel.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f3563b.c(SentryLevel.DEBUG, "Processing file: %s", absolutePath);
                            f(file2, io.sentry.util.j.e(new a(this.c, this.f3563b, absolutePath, this.d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f3563b.c(SentryLevel.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            this.f3563b.b(SentryLevel.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    public abstract void f(@NotNull File file, @NotNull c8c c8cVar);
}

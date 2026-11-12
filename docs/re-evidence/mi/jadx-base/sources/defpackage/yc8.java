package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.hints.h;
import io.sentry.util.j;
import io.sentry.util.p;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class yc8 extends ay6 implements ksc {

    @NotNull
    public final ftc e;

    @NotNull
    public final eyc f;

    @NotNull
    public final ILogger g;

    public yc8(@NotNull ftc ftcVar, @NotNull eyc eycVar, @NotNull ILogger iLogger, long j, int i) {
        super(ftcVar, iLogger, j, i);
        this.e = (ftc) p.c(ftcVar, "Hub is required.");
        this.f = (eyc) p.c(eycVar, "Serializer is required.");
        this.g = (ILogger) p.c(iLogger, "Logger is required.");
    }

    @Override // defpackage.ksc
    public void a(@NotNull String str, @NotNull c8c c8cVar) {
        p.c(str, "Path is required.");
        f(new File(str), c8cVar);
    }

    @Override // defpackage.ay6
    public boolean c(@NotNull String str) {
        return str.endsWith(".envelope");
    }

    @Override // defpackage.ay6
    public /* bridge */ /* synthetic */ void e(@NotNull File file) {
        super.e(file);
    }

    @Override // defpackage.ay6
    public void f(@NotNull final File file, @NotNull c8c c8cVar) {
        ILogger iLogger;
        j.a aVar;
        if (!file.isFile()) {
            this.g.c(SentryLevel.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.g.c(SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        if (!file.getParentFile().canWrite()) {
            this.g.c(SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
            return;
        }
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        jul julVarE = this.f.e(bufferedInputStream);
                        if (julVarE == null) {
                            this.g.c(SentryLevel.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.e.p(julVarE, c8cVar);
                        }
                        j.q(c8cVar, h.class, this.g, new j.a() { // from class: vc8
                            @Override // io.sentry.util.j.a
                            public final void accept(Object obj) {
                                this.f36737a.j((h) obj);
                            }
                        });
                        bufferedInputStream.close();
                        iLogger = this.g;
                        aVar = new j.a() { // from class: wc8
                            @Override // io.sentry.util.j.a
                            public final void accept(Object obj) {
                                this.f37834a.l(file, (io.sentry.hints.j) obj);
                            }
                        };
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    this.g.b(SentryLevel.ERROR, e, "I/O on file '%s' failed.", file.getAbsolutePath());
                    iLogger = this.g;
                    aVar = new j.a() { // from class: wc8
                        @Override // io.sentry.util.j.a
                        public final void accept(Object obj) {
                            this.f37834a.l(file, (io.sentry.hints.j) obj);
                        }
                    };
                }
            } catch (FileNotFoundException e2) {
                this.g.b(SentryLevel.ERROR, e2, "File '%s' cannot be found.", file.getAbsolutePath());
                iLogger = this.g;
                aVar = new j.a() { // from class: wc8
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        this.f37834a.l(file, (io.sentry.hints.j) obj);
                    }
                };
            } catch (Throwable th3) {
                this.g.b(SentryLevel.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
                j.q(c8cVar, io.sentry.hints.j.class, this.g, new j.a() { // from class: xc8
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        this.f38965a.k(th3, file, (io.sentry.hints.j) obj);
                    }
                });
                iLogger = this.g;
                aVar = new j.a() { // from class: wc8
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        this.f37834a.l(file, (io.sentry.hints.j) obj);
                    }
                };
            }
            j.q(c8cVar, io.sentry.hints.j.class, iLogger, aVar);
        } catch (Throwable th4) {
            j.q(c8cVar, io.sentry.hints.j.class, this.g, new j.a() { // from class: wc8
                @Override // io.sentry.util.j.a
                public final void accept(Object obj) {
                    this.f37834a.l(file, (io.sentry.hints.j) obj);
                }
            });
            throw th4;
        }
    }

    public final /* synthetic */ void j(h hVar) {
        if (hVar.g()) {
            return;
        }
        this.g.c(SentryLevel.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public final /* synthetic */ void k(Throwable th, File file, io.sentry.hints.j jVar) {
        jVar.d(false);
        this.g.b(SentryLevel.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    public final /* synthetic */ void l(File file, io.sentry.hints.j jVar) {
        if (jVar.b()) {
            this.g.c(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            m(file, "after trying to capture it");
            this.g.c(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public final void m(@NotNull File file, @NotNull String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.g.c(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.g.b(SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }
}

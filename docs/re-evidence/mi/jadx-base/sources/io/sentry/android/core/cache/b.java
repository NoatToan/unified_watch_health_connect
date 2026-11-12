package io.sentry.android.core.cache;

import defpackage.c8c;
import defpackage.jul;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.cache.c;
import io.sentry.cache.f;
import io.sentry.transport.p;
import io.sentry.util.e;
import io.sentry.util.j;
import java.io.File;
import java.io.FileOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b extends f {

    @NotNull
    public final p h;

    public b(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, io.sentry.android.core.internal.util.b.b());
    }

    public static boolean V(@NotNull SentryOptions sentryOptions) {
        String outboxPath = sentryOptions.getOutboxPath();
        if (outboxPath == null) {
            sentryOptions.getLogger().c(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean zExists = file.exists();
            if (zExists && !file.delete()) {
                sentryOptions.getLogger().c(SentryLevel.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return zExists;
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    @Nullable
    public static Long X(@NotNull SentryOptions sentryOptions) {
        File file = new File((String) io.sentry.util.p.c(sentryOptions.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
            if (!file.exists() || !file.canRead()) {
                sentryOptions.getLogger().c(SentryLevel.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
                return null;
            }
            String strC = e.c(file);
            if (strC.equals(AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return Long.valueOf(Long.parseLong(strC.trim()));
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.ERROR, "Error reading last ANR marker", th);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public void S(@NotNull jul julVar, @NotNull c8c c8cVar) {
        super.S(julVar, c8cVar);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f21673a;
        io.sentry.android.core.performance.e eVarO = AppStartMetrics.n().o();
        if (j.h(c8cVar, UncaughtExceptionHandlerIntegration.a.class) && eVarO.p()) {
            long jA = this.h.a() - eVarO.m();
            if (jA <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jA));
                Z();
            }
        }
        j.o(c8cVar, AnrV2Integration.b.class, new j.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                this.f21446a.W(sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
    }

    public final /* synthetic */ void W(SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar) {
        Long lB = bVar.b();
        sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "Writing last reported ANR marker with timestamp %d", lB);
        Y(lB);
    }

    public final void Y(@Nullable Long l) {
        String cacheDirPath = this.f21673a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f21673a.getLogger().c(SentryLevel.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l).getBytes(c.e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f21673a.getLogger().a(SentryLevel.ERROR, "Error writing the ANR marker to the disk", th3);
        }
    }

    public final void Z() {
        String outboxPath = this.f21673a.getOutboxPath();
        if (outboxPath == null) {
            this.f21673a.getLogger().c(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th) {
            this.f21673a.getLogger().a(SentryLevel.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    public b(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull p pVar) {
        super(sentryAndroidOptions, (String) io.sentry.util.p.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.h = pVar;
    }
}

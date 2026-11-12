package io.sentry;

import defpackage.eyc;
import defpackage.ftc;
import defpackage.jul;
import defpackage.yq5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Runnable {
    public static final Charset c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ftc f21717b;

    public i(@NotNull SentryOptions sentryOptions, @NotNull ftc ftcVar) {
        this.f21716a = sentryOptions;
        this.f21717b = ftcVar;
    }

    @Nullable
    public final Date a(@NotNull File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), c));
            try {
                String line = bufferedReader.readLine();
                this.f21716a.getLogger().c(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateE = yq5.e(line);
                bufferedReader.close();
                return dateE;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.f21716a.getLogger().a(SentryLevel.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            this.f21716a.getLogger().b(SentryLevel.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f21716a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f21716a.getLogger().c(SentryLevel.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f21716a.isEnableAutoSessionTracking()) {
            this.f21716a.getLogger().c(SentryLevel.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f21716a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).L()) {
            this.f21716a.getLogger().c(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileF = io.sentry.cache.f.F(cacheDirPath);
        eyc serializer = this.f21716a.getSerializer();
        if (fileF.exists()) {
            this.f21716a.getLogger().c(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileF), c));
                try {
                    Session session = (Session) serializer.b(bufferedReader, Session.class);
                    if (session == null) {
                        this.f21716a.getLogger().c(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", fileF.getAbsolutePath());
                    } else {
                        File file = new File(this.f21716a.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f21716a.getLogger().c(SentryLevel.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file);
                            if (!file.delete()) {
                                this.f21716a.getLogger().c(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            session.p(Session.State.Crashed, null, true);
                            date = dateA;
                        }
                        if (session.f() == null) {
                            session.d(date);
                        }
                        this.f21717b.l(jul.a(serializer, session, this.f21716a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                this.f21716a.getLogger().a(SentryLevel.ERROR, "Error processing previous session.", th3);
            }
            if (fileF.delete()) {
                return;
            }
            this.f21716a.getLogger().c(SentryLevel.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}

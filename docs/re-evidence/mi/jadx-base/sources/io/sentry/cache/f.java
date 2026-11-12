package io.sentry.cache;

import defpackage.c8c;
import defpackage.fvl;
import defpackage.gul;
import defpackage.jul;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.transport.s;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class f extends c implements g {
    public final CountDownLatch f;

    @NotNull
    public final Map<jul, String> g;

    public f(@NotNull SentryOptions sentryOptions, @NotNull String str, int i) {
        super(sentryOptions, str, i);
        this.g = new WeakHashMap();
        this.f = new CountDownLatch(1);
    }

    @NotNull
    public static g A(@NotNull SentryOptions sentryOptions) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        int maxCacheItems = sentryOptions.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(sentryOptions, cacheDirPath, maxCacheItems);
        }
        sentryOptions.getLogger().c(SentryLevel.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return s.e();
    }

    @NotNull
    public static File C(@NotNull String str) {
        return new File(str, "session.json");
    }

    @NotNull
    public static File F(@NotNull String str) {
        return new File(str, "previous_session.json");
    }

    public static /* synthetic */ boolean G(File file, String str) {
        return str.endsWith(".envelope");
    }

    public void B() {
        this.f.countDown();
    }

    @NotNull
    public final synchronized File E(@NotNull jul julVar) {
        String str;
        try {
            if (this.g.containsKey(julVar)) {
                str = this.g.get(julVar);
            } else {
                String str2 = UUID.randomUUID() + ".envelope";
                this.g.put(julVar, str2);
                str = str2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(this.c.getAbsolutePath(), str);
    }

    public final void H(@NotNull c8c c8cVar) {
        Date dateD;
        Object objG = io.sentry.util.j.g(c8cVar);
        if (objG instanceof io.sentry.hints.a) {
            File fileF = F(this.c.getAbsolutePath());
            if (!fileF.exists()) {
                this.f21673a.getLogger().c(SentryLevel.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            ILogger logger = this.f21673a.getLogger();
            SentryLevel sentryLevel = SentryLevel.WARNING;
            logger.c(sentryLevel, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileF), c.e));
                try {
                    Session session = (Session) this.f21674b.a().b(bufferedReader, Session.class);
                    if (session != null) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objG;
                        Long lB = aVar.b();
                        if (lB != null) {
                            dateD = yq5.d(lB.longValue());
                            Date dateK = session.k();
                            if (dateK != null) {
                                if (dateD.before(dateK)) {
                                }
                            }
                            this.f21673a.getLogger().c(sentryLevel, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            bufferedReader.close();
                            return;
                        }
                        dateD = null;
                        session.q(Session.State.Abnormal, null, true, aVar.d());
                        session.d(dateD);
                        T(fileF, session);
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
                this.f21673a.getLogger().a(SentryLevel.ERROR, "Error processing previous session.", th3);
            }
        }
    }

    public final void I(@NotNull File file, @NotNull jul julVar) {
        Iterable<fvl> iterableC = julVar.c();
        if (!iterableC.iterator().hasNext()) {
            this.f21673a.getLogger().c(SentryLevel.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        fvl next = iterableC.iterator().next();
        if (!SentryItemType.Session.equals(next.F().b())) {
            this.f21673a.getLogger().c(SentryLevel.INFO, "Current envelope has a different envelope type %s", next.F().b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.E()), c.e));
            try {
                Session session = (Session) this.f21674b.a().b(bufferedReader, Session.class);
                if (session == null) {
                    this.f21673a.getLogger().c(SentryLevel.ERROR, "Item of type %s returned null by the parser.", next.F().b());
                } else {
                    T(file, session);
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
            this.f21673a.getLogger().a(SentryLevel.ERROR, "Item failed to process.", th3);
        }
    }

    public boolean L() {
        try {
            return this.f.await(this.f21673a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f21673a.getLogger().c(SentryLevel.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // io.sentry.cache.g
    public void O(@NotNull jul julVar) {
        io.sentry.util.p.c(julVar, "Envelope is required.");
        File fileE = E(julVar);
        if (!fileE.exists()) {
            this.f21673a.getLogger().c(SentryLevel.DEBUG, "Envelope was not cached: %s", fileE.getAbsolutePath());
            return;
        }
        this.f21673a.getLogger().c(SentryLevel.DEBUG, "Discarding envelope from cache: %s", fileE.getAbsolutePath());
        if (fileE.delete()) {
            return;
        }
        this.f21673a.getLogger().c(SentryLevel.ERROR, "Failed to delete envelope: %s", fileE.getAbsolutePath());
    }

    public final void P() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f21673a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(yq5.g(yq5.c()).getBytes(c.e));
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
            this.f21673a.getLogger().a(SentryLevel.ERROR, "Error writing the crash marker file to the disk", th3);
        }
    }

    public final void R(@NotNull File file, @NotNull jul julVar) {
        if (file.exists()) {
            this.f21673a.getLogger().c(SentryLevel.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f21673a.getLogger().c(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f21674b.a().d(julVar, fileOutputStream);
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
            this.f21673a.getLogger().b(SentryLevel.ERROR, th3, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    public void S(@NotNull jul julVar, @NotNull c8c c8cVar) {
        io.sentry.util.p.c(julVar, "Envelope is required.");
        u(z());
        File fileC = C(this.c.getAbsolutePath());
        File fileF = F(this.c.getAbsolutePath());
        if (io.sentry.util.j.h(c8cVar, io.sentry.hints.k.class) && !fileC.delete()) {
            this.f21673a.getLogger().c(SentryLevel.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.j.h(c8cVar, io.sentry.hints.a.class)) {
            H(c8cVar);
        }
        if (io.sentry.util.j.h(c8cVar, io.sentry.hints.m.class)) {
            if (fileC.exists()) {
                this.f21673a.getLogger().c(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileC), c.e));
                    try {
                        Session session = (Session) this.f21674b.a().b(bufferedReader, Session.class);
                        if (session != null) {
                            T(fileF, session);
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
                    this.f21673a.getLogger().a(SentryLevel.ERROR, "Error processing session.", th3);
                }
            }
            I(fileC, julVar);
            boolean zExists = new File(this.f21673a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f21673a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f21673a.getLogger().c(SentryLevel.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f21673a.getLogger().c(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            gul.a().b(zExists);
            B();
        }
        File fileE = E(julVar);
        if (fileE.exists()) {
            this.f21673a.getLogger().c(SentryLevel.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileE.getAbsolutePath());
            return;
        }
        this.f21673a.getLogger().c(SentryLevel.DEBUG, "Adding Envelope to offline storage: %s", fileE.getAbsolutePath());
        R(fileE, julVar);
        if (io.sentry.util.j.h(c8cVar, UncaughtExceptionHandlerIntegration.a.class)) {
            P();
        }
    }

    public final void T(@NotNull File file, @NotNull Session session) {
        if (file.exists()) {
            this.f21673a.getLogger().c(SentryLevel.DEBUG, "Overwriting session to offline storage: %s", session.j());
            if (!file.delete()) {
                this.f21673a.getLogger().c(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.e));
                try {
                    this.f21674b.a().a(session, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            this.f21673a.getLogger().b(SentryLevel.ERROR, th5, "Error writing Session to offline storage: %s", session.j());
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<jul> iterator() {
        File[] fileArrZ = z();
        ArrayList arrayList = new ArrayList(fileArrZ.length);
        for (File file : fileArrZ) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f21674b.a().e(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                this.f21673a.getLogger().c(SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                this.f21673a.getLogger().a(SentryLevel.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e);
            }
        }
        return arrayList.iterator();
    }

    @NotNull
    public final File[] z() {
        File[] fileArrListFiles;
        return (!i() || (fileArrListFiles = this.c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return f.G(file, str);
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }
}

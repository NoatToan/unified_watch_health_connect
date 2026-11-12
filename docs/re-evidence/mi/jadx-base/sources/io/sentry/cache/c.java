package io.sentry.cache;

import defpackage.eyc;
import defpackage.fvl;
import defpackage.jul;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.clientreport.DiscardReason;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final Charset e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public SentryOptions f21673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.sentry.util.m<eyc> f21674b = new io.sentry.util.m<>(new io.sentry.util.m.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.m.a
        public final Object a() {
            return this.f21672a.m();
        }
    });

    @NotNull
    public final File c;
    public final int d;

    public c(@NotNull SentryOptions sentryOptions, @NotNull String str, int i) {
        io.sentry.util.p.c(str, "Directory is required.");
        this.f21673a = (SentryOptions) io.sentry.util.p.c(sentryOptions, "SentryOptions is required.");
        this.c = new File(str);
        this.d = i;
    }

    public static /* synthetic */ int o(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    @NotNull
    public final jul g(@NotNull jul julVar, @NotNull fvl fvlVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<fvl> it = julVar.c().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(fvlVar);
        return new jul(julVar.b(), arrayList);
    }

    @Nullable
    public final Session h(@NotNull jul julVar) {
        for (fvl fvlVar : julVar.c()) {
            if (j(fvlVar)) {
                return t(fvlVar);
            }
        }
        return null;
    }

    public boolean i() {
        if (this.c.isDirectory() && this.c.canWrite() && this.c.canRead()) {
            return true;
        }
        this.f21673a.getLogger().c(SentryLevel.ERROR, "The directory for caching files is inaccessible.: %s", this.c.getAbsolutePath());
        return false;
    }

    public final boolean j(@Nullable fvl fvlVar) {
        if (fvlVar == null) {
            return false;
        }
        return fvlVar.F().b().equals(SentryItemType.Session);
    }

    public final boolean k(@NotNull jul julVar) {
        return julVar.c().iterator().hasNext();
    }

    public final boolean l(@NotNull Session session) {
        return session.l().equals(Session.State.Ok) && session.j() != null;
    }

    public final /* synthetic */ eyc m() {
        return this.f21673a.getSerializer();
    }

    public final void q(@NotNull File file, @NotNull File[] fileArr) {
        Boolean boolG;
        fvl fvlVarC;
        Session sessionT;
        jul julVarR = r(file);
        if (julVarR == null || !k(julVarR)) {
            return;
        }
        this.f21673a.getClientReportRecorder().c(DiscardReason.CACHE_OVERFLOW, julVarR);
        Session sessionH = h(julVarR);
        if (sessionH == null || !l(sessionH) || (boolG = sessionH.g()) == null || !boolG.booleanValue()) {
            return;
        }
        for (File file2 : fileArr) {
            jul julVarR2 = r(file2);
            if (julVarR2 != null && k(julVarR2)) {
                Iterator<fvl> it = julVarR2.c().iterator();
                while (true) {
                    fvlVarC = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    fvl next = it.next();
                    if (j(next) && (sessionT = t(next)) != null && l(sessionT)) {
                        Boolean boolG2 = sessionT.g();
                        if (boolG2 != null && boolG2.booleanValue()) {
                            this.f21673a.getLogger().c(SentryLevel.ERROR, "Session %s has 2 times the init flag.", sessionH.j());
                            return;
                        }
                        if (sessionH.j() != null && sessionH.j().equals(sessionT.j())) {
                            sessionT.n();
                            try {
                                fvlVarC = fvl.C(this.f21674b.a(), sessionT);
                                it.remove();
                                break;
                            } catch (IOException e2) {
                                this.f21673a.getLogger().b(SentryLevel.ERROR, e2, "Failed to create new envelope item for the session %s", sessionH.j());
                                break;
                            }
                        }
                    }
                }
                if (fvlVarC != null) {
                    jul julVarG = g(julVarR2, fvlVarC);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.f21673a.getLogger().c(SentryLevel.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    v(julVarG, file2, jLastModified);
                    return;
                }
            }
        }
    }

    @Nullable
    public final jul r(@NotNull File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                jul julVarE = this.f21674b.a().e(bufferedInputStream);
                bufferedInputStream.close();
                return julVarE;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f21673a.getLogger().a(SentryLevel.ERROR, "Failed to deserialize the envelope.", e2);
            return null;
        }
    }

    @Nullable
    public final Session t(@NotNull fvl fvlVar) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(fvlVar.E()), e));
            try {
                Session session = (Session) this.f21674b.a().b(bufferedReader, Session.class);
                bufferedReader.close();
                return session;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f21673a.getLogger().a(SentryLevel.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    public void u(@NotNull File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.d) {
            this.f21673a.getLogger().c(SentryLevel.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i = (length - this.d) + 1;
            w(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i, length);
            for (int i2 = 0; i2 < i; i2++) {
                File file = fileArr[i2];
                q(file, fileArr2);
                if (!file.delete()) {
                    this.f21673a.getLogger().c(SentryLevel.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }

    public final void v(@NotNull jul julVar, @NotNull File file, long j) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f21674b.a().d(julVar, fileOutputStream);
                file.setLastModified(j);
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
            this.f21673a.getLogger().a(SentryLevel.ERROR, "Failed to serialize the new envelope to the disk.", th3);
        }
    }

    public final void w(@NotNull File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return c.o((File) obj, (File) obj2);
                }
            });
        }
    }
}

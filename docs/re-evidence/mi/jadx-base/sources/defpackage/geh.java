package defpackage;

import com.mibi.sdk.common.CommonConstants;
import io.sentry.ILogger;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.hints.h;
import io.sentry.hints.i;
import io.sentry.hints.o;
import io.sentry.protocol.w;
import io.sentry.util.b;
import io.sentry.util.j;
import io.sentry.util.n;
import io.sentry.util.p;
import io.sentry.util.s;
import io.sentry.y;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class geh extends ay6 implements ksc {
    public static final Charset i = Charset.forName("UTF-8");

    @NotNull
    public final ftc e;

    @NotNull
    public final jsc f;

    @NotNull
    public final eyc g;

    @NotNull
    public final ILogger h;

    public geh(@NotNull ftc ftcVar, @NotNull jsc jscVar, @NotNull eyc eycVar, @NotNull ILogger iLogger, long j, int i2) {
        super(ftcVar, iLogger, j, i2);
        this.e = (ftc) p.c(ftcVar, "Hub is required.");
        this.f = (jsc) p.c(jscVar, "Envelope reader is required.");
        this.g = (eyc) p.c(eycVar, "Serializer is required.");
        this.h = (ILogger) p.c(iLogger, "Logger is required.");
    }

    @Override // defpackage.ksc
    public void a(@NotNull String str, @NotNull c8c c8cVar) {
        p.c(str, "Path is required.");
        f(new File(str), c8cVar);
    }

    @Override // defpackage.ay6
    public boolean c(@Nullable String str) {
        return (str == null || str.startsWith(CommonConstants.KEY_SESSION) || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // defpackage.ay6
    public /* bridge */ /* synthetic */ void e(@NotNull File file) {
        super.e(file);
    }

    @Override // defpackage.ay6
    public void f(@NotNull final File file, @NotNull c8c c8cVar) {
        ILogger iLogger;
        j.a aVar;
        p.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.h.c(SentryLevel.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    jul julVarA = this.f.a(bufferedInputStream);
                    if (julVarA == null) {
                        this.h.c(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        p(julVarA, c8cVar);
                        this.h.c(SentryLevel.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    iLogger = this.h;
                    aVar = new j.a() { // from class: eeh
                        @Override // io.sentry.util.j.a
                        public final void accept(Object obj) {
                            this.f16563a.k(file, (io.sentry.hints.j) obj);
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
                this.h.a(SentryLevel.ERROR, "Error processing envelope.", e);
                iLogger = this.h;
                aVar = new j.a() { // from class: eeh
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        this.f16563a.k(file, (io.sentry.hints.j) obj);
                    }
                };
            }
            j.q(c8cVar, io.sentry.hints.j.class, iLogger, aVar);
        } catch (Throwable th3) {
            j.q(c8cVar, io.sentry.hints.j.class, this.h, new j.a() { // from class: eeh
                @Override // io.sentry.util.j.a
                public final void accept(Object obj) {
                    this.f16563a.k(file, (io.sentry.hints.j) obj);
                }
            });
            throw th3;
        }
    }

    @NotNull
    public final qkp i(@Nullable y yVar) {
        String strA;
        if (yVar != null && (strA = yVar.a()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strA));
                if (s.e(dValueOf, false)) {
                    return new qkp(Boolean.TRUE, dValueOf);
                }
                this.h.c(SentryLevel.ERROR, "Invalid sample rate parsed from TraceContext: %s", strA);
            } catch (Exception unused) {
                this.h.c(SentryLevel.ERROR, "Unable to parse sample rate from TraceContext: %s", strA);
            }
        }
        return new qkp(Boolean.TRUE);
    }

    public final /* synthetic */ void k(File file, io.sentry.hints.j jVar) {
        if (jVar.b()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.h.c(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            this.h.b(SentryLevel.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    public final void l(@NotNull fvl fvlVar, int i2) {
        this.h.c(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i2), fvlVar.F().b());
    }

    public final void m(int i2) {
        this.h.c(SentryLevel.DEBUG, "Item %d is being captured.", Integer.valueOf(i2));
    }

    public final void n(@Nullable io.sentry.protocol.p pVar) {
        this.h.c(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", pVar);
    }

    public final void o(@NotNull jul julVar, @Nullable io.sentry.protocol.p pVar, int i2) {
        this.h.c(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i2), julVar.b().a(), pVar);
    }

    public final void p(@NotNull jul julVar, @NotNull c8c c8cVar) throws IOException {
        Object objG;
        this.h.c(SentryLevel.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(b.e(julVar.c())));
        int i2 = 0;
        for (fvl fvlVar : julVar.c()) {
            i2++;
            if (fvlVar.F() == null) {
                this.h.c(SentryLevel.ERROR, "Item %d has no header", Integer.valueOf(i2));
            } else if (SentryItemType.Event.equals(fvlVar.F().b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(fvlVar.E()), i));
                    try {
                        io.sentry.s sVar = (io.sentry.s) this.g.b(bufferedReader, io.sentry.s.class);
                        if (sVar == null) {
                            l(fvlVar, i2);
                        } else {
                            if (sVar.L() != null) {
                                j.s(c8cVar, sVar.L().e());
                            }
                            if (julVar.b().a() == null || julVar.b().a().equals(sVar.G())) {
                                this.e.t(sVar, c8cVar);
                                m(i2);
                                if (!q(c8cVar)) {
                                    n(sVar.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                o(julVar, sVar.G(), i2);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                        objG = j.g(c8cVar);
                        if (!(objG instanceof o) && !((o) objG).isSuccess()) {
                            this.h.c(SentryLevel.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i2));
                            return;
                        }
                        j.o(c8cVar, i.class, new j.a() { // from class: feh
                            @Override // io.sentry.util.j.a
                            public final void accept(Object obj) {
                                ((i) obj).reset();
                            }
                        });
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    this.h.a(SentryLevel.ERROR, "Item failed to process.", th3);
                }
            } else {
                if (SentryItemType.Transaction.equals(fvlVar.F().b())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(fvlVar.E()), i));
                        try {
                            w wVar = (w) this.g.b(bufferedReader2, w.class);
                            if (wVar == null) {
                                l(fvlVar, i2);
                            } else if (julVar.b().a() == null || julVar.b().a().equals(wVar.G())) {
                                y yVarC = julVar.b().c();
                                if (wVar.C().getTrace() != null) {
                                    wVar.C().getTrace().n(i(yVarC));
                                }
                                this.e.w(wVar, yVarC, c8cVar);
                                m(i2);
                                if (!q(c8cVar)) {
                                    n(wVar.G());
                                    bufferedReader2.close();
                                    return;
                                }
                            } else {
                                o(julVar, wVar.G(), i2);
                                bufferedReader2.close();
                            }
                            bufferedReader2.close();
                        } catch (Throwable th4) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        this.h.a(SentryLevel.ERROR, "Item failed to process.", th6);
                    }
                } else {
                    this.e.p(new jul(julVar.b().a(), julVar.b().b(), fvlVar), c8cVar);
                    this.h.c(SentryLevel.DEBUG, "%s item %d is being captured.", fvlVar.F().b().getItemType(), Integer.valueOf(i2));
                    if (!q(c8cVar)) {
                        this.h.c(SentryLevel.WARNING, "Timed out waiting for item type submission: %s", fvlVar.F().b().getItemType());
                        return;
                    }
                }
                objG = j.g(c8cVar);
                if (!(objG instanceof o)) {
                }
                j.o(c8cVar, i.class, new j.a() { // from class: feh
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        ((i) obj).reset();
                    }
                });
            }
        }
    }

    public final boolean q(@NotNull c8c c8cVar) {
        Object objG = j.g(c8cVar);
        if (objG instanceof h) {
            return ((h) objG).g();
        }
        n.a(h.class, objG, this.h);
        return true;
    }
}

package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryReplayEvent;
import io.sentry.Session;
import io.sentry.clientreport.c;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.j;
import io.sentry.l;
import io.sentry.o;
import io.sentry.protocol.w;
import io.sentry.r;
import io.sentry.util.e;
import io.sentry.util.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class fvl {
    public static final Charset d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f18295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Callable<byte[]> f18296b;

    @Nullable
    public byte[] c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public byte[] f18297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Callable<byte[]> f18298b;

        public a(@Nullable Callable<byte[]> callable) {
            this.f18298b = callable;
        }

        @NotNull
        public static byte[] b(@Nullable byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        @NotNull
        public byte[] a() throws Exception {
            Callable<byte[]> callable;
            if (this.f18297a == null && (callable = this.f18298b) != null) {
                this.f18297a = callable.call();
            }
            return b(this.f18297a);
        }
    }

    public fvl(@NotNull r rVar, byte[] bArr) {
        this.f18295a = (r) p.c(rVar, "SentryEnvelopeItemHeader is required.");
        this.c = bArr;
        this.f18296b = null;
    }

    @NotNull
    public static fvl A(@NotNull final j jVar, final long j, @NotNull final eyc eycVar) throws SentryEnvelopeException {
        final File fileC = jVar.C();
        final a aVar = new a(new Callable() { // from class: nul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.T(fileC, j, jVar, eycVar);
            }
        });
        return new fvl(new r(SentryItemType.Profile, new Callable() { // from class: oul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.U(aVar);
            }
        }, "application-json", fileC.getName()), (Callable<byte[]>) new Callable() { // from class: pul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static fvl B(@NotNull final eyc eycVar, @NotNull final ILogger iLogger, @NotNull final SentryReplayEvent sentryReplayEvent, @Nullable final l lVar, final boolean z) {
        final File fileH0 = sentryReplayEvent.h0();
        final a aVar = new a(new Callable() { // from class: kul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.W(eycVar, sentryReplayEvent, lVar, fileH0, iLogger, z);
            }
        });
        return new fvl(new r(SentryItemType.ReplayVideo, new Callable() { // from class: vul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.X(aVar);
            }
        }, null, null), (Callable<byte[]>) new Callable() { // from class: xul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static fvl C(@NotNull final eyc eycVar, @NotNull final Session session) throws IOException {
        p.c(eycVar, "ISerializer is required.");
        p.c(session, "Session is required.");
        final a aVar = new a(new Callable() { // from class: yul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.Z(eycVar, session);
            }
        });
        return new fvl(new r(SentryItemType.Session, new Callable() { // from class: zul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.a0(aVar);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: avl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static /* synthetic */ byte[] H(dm1 dm1Var, long j, eyc eycVar, ILogger iLogger) throws Exception {
        if (dm1Var.e() != null) {
            byte[] bArrE = dm1Var.e();
            v(bArrE.length, j, dm1Var.g());
            return bArrE;
        }
        if (dm1Var.i() != null) {
            byte[] bArrB = io.sentry.util.l.b(eycVar, iLogger, dm1Var.i());
            if (bArrB != null) {
                v(bArrB.length, j, dm1Var.g());
                return bArrB;
            }
        } else if (dm1Var.h() != null) {
            return e.b(dm1Var.h(), j);
        }
        throw new SentryEnvelopeException(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable or a path is set.", dm1Var.g()));
    }

    public static /* synthetic */ Integer I(a aVar) throws Exception {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] K(eyc eycVar, c cVar) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, d));
            try {
                eycVar.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
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
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ Integer L(a aVar) throws Exception {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] N(eyc eycVar, o oVar) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, d));
            try {
                eycVar.a(oVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
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
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ Integer O(a aVar) throws Exception {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ Integer R(a aVar) throws Exception {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] T(File file, long j, j jVar, eyc eycVar) throws Exception {
        if (!file.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strC = io.sentry.vendor.a.c(e.b(file.getPath(), j), 3);
        if (strC.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        jVar.G(strC);
        jVar.F();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, d));
                    try {
                        eycVar.a(jVar, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
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
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                file.delete();
                throw th5;
            }
        } catch (IOException e) {
            throw new SentryEnvelopeException(String.format("Failed to serialize profiling trace data\n%s", e.getMessage()));
        }
    }

    public static /* synthetic */ Integer U(a aVar) throws Exception {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] W(eyc eycVar, SentryReplayEvent sentryReplayEvent, l lVar, File file, ILogger iLogger, boolean z) throws Exception {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    eycVar.a(sentryReplayEvent, bufferedWriter);
                    linkedHashMap.put(SentryItemType.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (lVar != null) {
                        eycVar.a(lVar, bufferedWriter);
                        linkedHashMap.put(SentryItemType.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = e.b(file.getPath(), 10485760L);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(SentryItemType.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrC0 = c0(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z) {
                            e.a(file.getParentFile());
                        } else {
                            file.delete();
                        }
                    }
                    return bArrC0;
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
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                iLogger.a(SentryLevel.ERROR, "Could not serialize replay recording", th5);
                return null;
            } finally {
                if (file != null) {
                    if (z) {
                        e.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ Integer X(a aVar) throws Exception {
        return Integer.valueOf(aVar.a().length);
    }

    public static /* synthetic */ byte[] Z(eyc eycVar, Session session) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, d));
            try {
                eycVar.a(session, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
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
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static /* synthetic */ Integer a0(a aVar) throws Exception {
        return Integer.valueOf(aVar.a().length);
    }

    public static byte[] c0(@NotNull Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void v(long j, long j2, @NotNull String str) throws SentryEnvelopeException {
        if (j > j2) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static fvl w(@NotNull final eyc eycVar, @NotNull final ILogger iLogger, @NotNull final dm1 dm1Var, final long j) {
        final a aVar = new a(new Callable() { // from class: evl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.H(dm1Var, j, eycVar, iLogger);
            }
        });
        return new fvl(new r(SentryItemType.Attachment, (Callable<Integer>) new Callable() { // from class: lul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.I(aVar);
            }
        }, dm1Var.f(), dm1Var.g(), dm1Var.d()), (Callable<byte[]>) new Callable() { // from class: mul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static fvl x(@NotNull final eyc eycVar, @NotNull final c cVar) throws IOException {
        p.c(eycVar, "ISerializer is required.");
        p.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: tul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.K(eycVar, cVar);
            }
        });
        return new fvl(new r(SentryItemType.resolve(cVar), new Callable() { // from class: uul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.L(aVar);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: wul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static fvl y(@NotNull final eyc eycVar, @NotNull final o oVar) {
        p.c(eycVar, "ISerializer is required.");
        p.c(oVar, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: qul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.N(eycVar, oVar);
            }
        });
        return new fvl(new r(SentryItemType.resolve(oVar), new Callable() { // from class: rul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.O(aVar);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: sul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static fvl z(@NotNull final io.sentry.metrics.a aVar) {
        final a aVar2 = new a(new Callable() { // from class: bvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
        return new fvl(new r(SentryItemType.Statsd, new Callable() { // from class: cvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fvl.R(aVar2);
            }
        }, "application/octet-stream", null), (Callable<byte[]>) new Callable() { // from class: dvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar2.a();
            }
        });
    }

    @Nullable
    public c D(@NotNull eyc eycVar) throws Exception {
        r rVar = this.f18295a;
        if (rVar == null || rVar.b() != SentryItemType.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(E()), d));
        try {
            c cVar = (c) eycVar.b(bufferedReader, c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NotNull
    public byte[] E() throws Exception {
        Callable<byte[]> callable;
        if (this.c == null && (callable = this.f18296b) != null) {
            this.c = callable.call();
        }
        return this.c;
    }

    @NotNull
    public r F() {
        return this.f18295a;
    }

    @Nullable
    public w G(@NotNull eyc eycVar) throws Exception {
        r rVar = this.f18295a;
        if (rVar == null || rVar.b() != SentryItemType.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(E()), d));
        try {
            w wVar = (w) eycVar.b(bufferedReader, w.class);
            bufferedReader.close();
            return wVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public fvl(@NotNull r rVar, @Nullable Callable<byte[]> callable) {
        this.f18295a = (r) p.c(rVar, "SentryEnvelopeItemHeader is required.");
        this.f18296b = (Callable) p.c(callable, "DataFactory is required.");
        this.c = null;
    }
}

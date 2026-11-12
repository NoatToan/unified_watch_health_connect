package u7;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lu7/w0;", "Lu7/t0;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", "file", "<init>", "(Lt13/g;Ljava/io/File;)V", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w0 implements t0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f169343j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f169344k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f169345l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f169346m = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f169347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f169348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.f f169349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f169350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f169351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f169352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z53.b f169353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f169354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f169355i;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu7/l1;", "invoke", "()Lu7/l1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<l1> {
        public b() {
            super(0);
        }

        @Override // e23.a
        public final l1 invoke() throws Throwable {
            l1.f169184b.getClass();
            System.loadLibrary("datastore_shared_counter");
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new z0(w0.this).invoke(), 939524096);
                try {
                    int fd3 = parcelFileDescriptorOpen.getFd();
                    NativeSharedCounter nativeSharedCounter = l1.f169185c;
                    if (nativeSharedCounter.nativeTruncateFile(fd3) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd3);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    l1 l1Var = new l1(jNativeCreateSharedCounter, null);
                    parcelFileDescriptorOpen.close();
                    return l1Var;
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<File> {
        public c() {
            super(0);
        }

        @Override // e23.a
        public final File invoke() {
            w0 w0Var = w0.this;
            File file = new File(w0Var.f169348b.getAbsolutePath() + w0Var.f169350d);
            w0.f(w0Var, file);
            return file;
        }
    }

    public w0(t13.g gVar, File file) {
        gVar.getClass();
        file.getClass();
        this.f169347a = gVar;
        this.f169348b = file;
        f1.f169129b.getClass();
        this.f169349c = r53.s.i(new e1(file, null));
        this.f169350d = ".lock";
        this.f169351e = ".version";
        this.f169352f = "fcntl failed: EAGAIN";
        this.f169353g = z53.c.a();
        this.f169354h = o13.m.b(new c());
        this.f169355i = o13.m.b(new b());
    }

    public static final void f(w0 w0Var, File file) {
        w0Var.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                vb.h.C(v.h.v(file, "Unable to create parent directories of "));
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd A[Catch: all -> 0x00e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:60:0x00dd, B:72:0x00f8, B:73:0x00fb), top: B:83:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:60:0x00dd, B:72:0x00f8, B:73:0x00fb), top: B:83:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [e23.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, u7.b1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // u7.t0
    public final Object a(e23.p pVar, v13.c cVar) throws Throwable {
        ?? b1Var;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        z53.b bVar;
        boolean z14;
        FileInputStream fileInputStream;
        z53.b bVar2;
        boolean z15;
        ?? r14 = pVar;
        if (cVar instanceof b1) {
            b1 b1Var2 = (b1) cVar;
            int i14 = b1Var2.f169098g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b1Var2.f169098g = i14 - Integer.MIN_VALUE;
                b1Var = b1Var2;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objInvoke = b1Var.f169096e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r15 = b1Var.f169098g;
        try {
            try {
                if (r15 != 0) {
                    if (r15 == 1) {
                        z15 = b1Var.f169095d;
                        bVar2 = b1Var.f169092a;
                        o13.r.b(objInvoke);
                        if (z15) {
                            bVar2.e(null);
                        }
                        return objInvoke;
                    }
                    if (r15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z14 = b1Var.f169095d;
                    fileLock = b1Var.f169094c;
                    fileInputStream = b1Var.f169093b;
                    bVar = b1Var.f169092a;
                    try {
                        o13.r.b(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        jg.b.l(fileInputStream, null);
                        if (z14) {
                            bVar.e(null);
                        }
                        return objInvoke;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                o13.r.b(objInvoke);
                z53.b bVar3 = this.f169353g;
                boolean zF = bVar3.f();
                try {
                    if (zF) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f169354h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e4) {
                                String message2 = e4.getMessage();
                                if ((message2 == null || !d53.u.y(message2, this.f169352f, false)) && ((message = e4.getMessage()) == null || !d53.u.y(message, f169344k, false))) {
                                    throw e4;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                b1Var.f169092a = bVar3;
                                b1Var.f169093b = fileInputStream2;
                                b1Var.f169094c = fileLockTryLock;
                                b1Var.f169095d = zF;
                                b1Var.f169098g = 2;
                                objInvoke = r14.invoke(boolValueOf, b1Var);
                                if (objInvoke != aVar) {
                                    bVar = bVar3;
                                    z14 = zF;
                                    fileInputStream = fileInputStream2;
                                    fileLock = fileLockTryLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    jg.b.l(fileInputStream, null);
                                    if (z14) {
                                        bVar.e(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        b1Var.f169092a = bVar3;
                        b1Var.f169095d = zF;
                        b1Var.f169098g = 1;
                        objInvoke = r14.invoke(bool, b1Var);
                        if (objInvoke != aVar) {
                            bVar2 = bVar3;
                            z15 = zF;
                            if (z15) {
                                bVar2.e(null);
                            }
                            return objInvoke;
                        }
                    }
                    return aVar;
                } catch (Throwable th6) {
                    th = th6;
                    b1Var = bVar3;
                    r14 = zF;
                    if (r14 != 0) {
                        b1Var.e(null);
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                ?? r16 = b1Var;
                try {
                    throw th7;
                } catch (Throwable th8) {
                    try {
                        jg.b.l(r15, th7);
                        throw th8;
                    } catch (Throwable th9) {
                        th = th9;
                        r14 = r14;
                        b1Var = r16;
                        if (r14 != 0) {
                            b1Var.e(null);
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    @Override // u7.t0
    public final Object b(g0 g0Var) {
        o13.t tVar = this.f169355i;
        if (tVar.isInitialized()) {
            return new Integer(l1.f169185c.nativeIncrementAndGetCounterValue(((l1) tVar.getValue()).f169186a));
        }
        return ge1.b.e0(this.f169347a, new y0(this, null), g0Var);
    }

    @Override // u7.t0
    public final r53.i<Unit> c() {
        return this.f169349c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:42:0x00bc, B:56:0x00da, B:57:0x00dd), top: B:65:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00da A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {all -> 0x00c0, blocks: (B:42:0x00bc, B:56:0x00da, B:57:0x00dd), top: B:65:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, u13.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [z53.a] */
    @Override // u7.t0
    public final Object d(e23.l lVar, v13.c cVar) throws Throwable {
        a1 a1Var;
        w0 w0Var;
        FileOutputStream fileOutputStream;
        Throwable th3;
        e23.l lVar2;
        Closeable closeable;
        ?? r14;
        ?? r15;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r16;
        ?? r17;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f169085f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f169085f = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        ?? r18 = a1Var.f169083d;
        ?? r19 = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f169085f;
        try {
            try {
                try {
                    if (i15 == 0) {
                        o13.r.b(r18);
                        a1Var.f169080a = this;
                        a1Var.f169081b = lVar;
                        z53.b bVar = this.f169353g;
                        a1Var.f169082c = bVar;
                        a1Var.f169085f = 1;
                        if (bVar.c(a1Var) != r19) {
                            w0Var = this;
                            r18 = bVar;
                        }
                        return r19;
                    }
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) a1Var.f169082c;
                            closeable2 = (Closeable) a1Var.f169081b;
                            z53.a aVar = (z53.a) a1Var.f169080a;
                            try {
                                o13.r.b(r18);
                                r17 = aVar;
                                r16 = r18;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    jg.b.l(closeable2, null);
                                    r17.e(null);
                                    return r16;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r18 = r17;
                                    r18.e(null);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th3 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th3;
                            }
                        }
                        closeable = (Closeable) a1Var.f169082c;
                        r14 = (z53.a) a1Var.f169081b;
                        lVar2 = (e23.l) a1Var.f169080a;
                        try {
                            o13.r.b(r18);
                            r14 = r14;
                            r15 = r18;
                            fileLock2 = (FileLock) r15;
                            try {
                                a1Var.f169080a = r14;
                                a1Var.f169081b = closeable;
                                a1Var.f169082c = fileLock2;
                                a1Var.f169085f = 3;
                                objInvoke = lVar2.invoke(a1Var);
                                if (objInvoke != r19) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r16 = objInvoke;
                                    r17 = r14;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    jg.b.l(closeable2, null);
                                    r17.e(null);
                                    return r16;
                                }
                                return r19;
                            } catch (Throwable th6) {
                                fileLock = fileLock2;
                                th3 = th6;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th3;
                            }
                        } catch (Throwable th7) {
                            th3 = th7;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th3;
                        }
                    }
                    z53.a aVar2 = (z53.a) a1Var.f169082c;
                    e23.l lVar3 = (e23.l) a1Var.f169081b;
                    w0Var = (w0) a1Var.f169080a;
                    o13.r.b(r18);
                    r18 = aVar2;
                    lVar = lVar3;
                    a aVar3 = f169343j;
                    a1Var.f169080a = lVar;
                    a1Var.f169081b = r18;
                    a1Var.f169082c = fileOutputStream;
                    a1Var.f169085f = 2;
                    Object objA = a.a(aVar3, fileOutputStream, a1Var);
                    if (objA != r19) {
                        lVar2 = lVar;
                        closeable = fileOutputStream;
                        r14 = r18;
                        r15 = objA;
                        fileLock2 = (FileLock) r15;
                        a1Var.f169080a = r14;
                        a1Var.f169081b = closeable;
                        a1Var.f169082c = fileLock2;
                        a1Var.f169085f = 3;
                        objInvoke = lVar2.invoke(a1Var);
                        if (objInvoke != r19) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r16 = objInvoke;
                            r17 = r14;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            jg.b.l(closeable2, null);
                            r17.e(null);
                            return r16;
                        }
                    }
                    return r19;
                } catch (Throwable th8) {
                    th3 = th8;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th3;
                }
                fileOutputStream = new FileOutputStream((File) w0Var.f169354h.getValue());
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            r18 = a1Var;
            try {
                throw th10;
            } catch (Throwable th11) {
                jg.b.l(r19, th10);
                throw th11;
            }
        }
    }

    @Override // u7.t0
    public final Object e(v13.c cVar) {
        o13.t tVar = this.f169355i;
        if (tVar.isInitialized()) {
            return new Integer(l1.f169185c.nativeGetCounterValue(((l1) tVar.getValue()).f169186a));
        }
        return ge1.b.e0(this.f169347a, new x0(this, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lu7/w0$a;", "", "<init>", "()V", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:31|17|18|33) */
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            r1 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r1 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        
            r11.f169331a = r12;
            r11.f169332b = r3;
            r11.f169335e = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            if (o53.m0.b(r3, r11) == r13) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        
            return r13;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:27:0x0074). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object a(a aVar, FileOutputStream fileOutputStream, v13.c cVar) throws IOException {
            v0 v0Var;
            long j8;
            v0 v0Var2;
            aVar.getClass();
            if (cVar instanceof v0) {
                v0Var = (v0) cVar;
                int i14 = v0Var.f169335e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    v0Var.f169335e = i14 - Integer.MIN_VALUE;
                } else {
                    v0Var = new v0(aVar, cVar);
                }
            } else {
                v0Var = new v0(aVar, cVar);
            }
            Object obj = v0Var.f169333c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = v0Var.f169335e;
            if (i15 == 0) {
                o13.r.b(obj);
                j8 = w0.f169345l;
                v0Var2 = v0Var;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j8 = v0Var.f169332b;
                fileOutputStream = v0Var.f169331a;
                o13.r.b(obj);
                v0Var2 = v0Var;
                j8 *= (long) 2;
            }
            if (j8 <= w0.f169346m) {
                FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                fileLockLock.getClass();
                return fileLockLock;
            }
            FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
            fileLockLock2.getClass();
            return fileLockLock2;
        }

        private a() {
        }
    }
}

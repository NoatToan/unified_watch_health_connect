package u7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu7/o0;", "T", "Lu7/t1;", "Ljava/io/File;", "file", "Lu7/k1;", "serializer", "Lu7/t0;", "coordinator", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/io/File;Lu7/k1;Lu7/t0;Le23/a;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o0<T> implements t1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f169260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1<T> f169261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f169262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f169263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f169264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z53.b f169265f;

    public o0(File file, k1<T> k1Var, t0 t0Var, e23.a<Unit> aVar) {
        file.getClass();
        k1Var.getClass();
        t0Var.getClass();
        aVar.getClass();
        this.f169260a = file;
        this.f169261b = k1Var;
        this.f169262c = t0Var;
        this.f169263d = aVar;
        this.f169264e = new AtomicBoolean(false);
        this.f169265f = z53.c.a();
    }

    @Override // u7.t1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final t0 getF169262c() {
        return this.f169262c;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079 A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007a, blocks: (B:34:0x0079, B:43:0x008a, B:42:0x0087, B:39:0x0082), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [u7.o0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [u7.o0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u7.m0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [u7.o0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [u7.u1] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // u7.t1
    public final Object c(u1 u1Var, v13.c cVar) throws Throwable {
        ?? m0Var;
        Throwable th3;
        j0 j0Var;
        ?? r14;
        ?? r15;
        if (cVar instanceof m0) {
            m0 m0Var2 = (m0) cVar;
            int i14 = m0Var2.f169230f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var2.f169230f = i14 - Integer.MIN_VALUE;
                m0Var = m0Var2;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object obj = m0Var.f169228d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f169230f;
        try {
            if (i15 != 0) {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u1Var = m0Var.f169227c;
                j0Var = m0Var.f169226b;
                m0Var = m0Var.f169225a;
                try {
                    o13.r.b(obj);
                    r15 = m0Var;
                    r14 = u1Var;
                    try {
                        j0Var.close();
                        th = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r14 != 0) {
                        r15.f169265f.e(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th3 = th5;
                    try {
                        j0Var.close();
                    } catch (Throwable th6) {
                        o13.g.a(th3, th6);
                    }
                    throw th3;
                }
            }
            o13.r.b(obj);
            if (this.f169264e.get()) {
                vb.h.z("StorageConnection has already been disposed.");
                return null;
            }
            boolean zF = this.f169265f.f();
            try {
                j0 j0Var2 = new j0(this.f169260a, this.f169261b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zF);
                    m0Var.f169225a = this;
                    m0Var.f169226b = j0Var2;
                    m0Var.f169227c = zF;
                    m0Var.f169230f = 1;
                    Object objInvoke = u1Var.invoke(j0Var2, boolValueOf, m0Var);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    obj = objInvoke;
                    r14 = zF;
                    r15 = this;
                    j0Var = j0Var2;
                    j0Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r14 != 0) {
                        r15.f169265f.e(null);
                    }
                    return obj;
                } catch (Throwable th7) {
                    th3 = th7;
                    u1Var = zF;
                    m0Var = this;
                    j0Var = j0Var2;
                    j0Var.close();
                    throw th3;
                }
            } catch (Throwable th8) {
                th = th8;
                u1Var = zF;
                m0Var = this;
                if (u1Var != 0) {
                    m0Var.f169265f.e(null);
                }
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            if (u1Var != 0) {
                m0Var.f169265f.e(null);
            }
            throw th;
        }
    }

    @Override // u7.c
    public final void close() {
        this.f169264e.set(true);
        this.f169263d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[Catch: all -> 0x0118, IOException -> 0x011a, TRY_ENTER, TryCatch #1 {IOException -> 0x011a, blocks: (B:44:0x00d3, B:46:0x00d9, B:53:0x00f7, B:54:0x0117, B:62:0x0125, B:69:0x0132, B:68:0x012f), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[Catch: all -> 0x0118, IOException -> 0x011a, TRY_LEAVE, TryCatch #1 {IOException -> 0x011a, blocks: (B:44:0x00d3, B:46:0x00d9, B:53:0x00f7, B:54:0x0117, B:62:0x0125, B:69:0x0132, B:68:0x012f), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7 A[Catch: all -> 0x0118, IOException -> 0x011a, TRY_ENTER, TryCatch #1 {IOException -> 0x011a, blocks: (B:44:0x00d3, B:46:0x00d9, B:53:0x00f7, B:54:0x0117, B:62:0x0125, B:69:0x0132, B:68:0x012f), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0125 A[Catch: all -> 0x0118, IOException -> 0x011a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x011a, blocks: (B:44:0x00d3, B:46:0x00d9, B:53:0x00f7, B:54:0x0117, B:62:0x0125, B:69:0x0132, B:68:0x012f), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00f7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // u7.t1
    public final Object d(g0 g0Var, v13.c cVar) throws IOException {
        n0 n0Var;
        File file;
        o0<T> o0Var;
        z53.a aVar;
        e23.p pVar;
        q0 q0Var;
        Throwable th3;
        q0 q0Var2;
        File file2;
        o0<T> o0Var2;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f169248g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f169248g = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object obj = n0Var.f169246e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f169248g;
        boolean z14 = true;
        try {
            try {
                try {
                    try {
                        if (i15 == 0) {
                            o13.r.b(obj);
                            if (this.f169264e.get()) {
                                vb.h.z("StorageConnection has already been disposed.");
                                return null;
                            }
                            File file3 = this.f169260a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    vb.h.C(v.h.v(file3, "Unable to create parent directories of "));
                                    return null;
                                }
                            }
                            n0Var.f169242a = this;
                            n0Var.f169243b = g0Var;
                            z53.b bVar = this.f169265f;
                            n0Var.f169244c = bVar;
                            n0Var.f169248g = 1;
                            if (bVar.c(n0Var) != aVar2) {
                                o0Var = this;
                                aVar = bVar;
                                pVar = g0Var;
                            }
                            return aVar2;
                        }
                        if (i15 != 1) {
                            if (i15 != 2) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            q0Var2 = n0Var.f169245d;
                            File file4 = (File) n0Var.f169244c;
                            aVar = (z53.a) n0Var.f169243b;
                            o0Var2 = n0Var.f169242a;
                            try {
                                o13.r.b(obj);
                                file2 = file4;
                                Unit unit = Unit.INSTANCE;
                                try {
                                    q0Var2.close();
                                    th = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    File file5 = o0Var2.f169260a;
                                    a.f169074a.getClass();
                                    try {
                                        Files.move(file2.toPath(), file5.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException unused) {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        throw new IOException("Unable to rename " + file2 + " to " + o0Var2.f169260a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                                aVar.e(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th5) {
                                th3 = th5;
                                try {
                                    q0Var2.close();
                                } catch (Throwable th6) {
                                    o13.g.a(th3, th6);
                                }
                                throw th3;
                            }
                        }
                        z53.a aVar3 = (z53.a) n0Var.f169244c;
                        e23.p pVar2 = (e23.p) n0Var.f169243b;
                        o0Var = n0Var.f169242a;
                        o13.r.b(obj);
                        aVar = aVar3;
                        pVar = pVar2;
                        n0Var.f169242a = o0Var;
                        n0Var.f169243b = aVar;
                        n0Var.f169244c = file;
                        n0Var.f169245d = q0Var;
                        n0Var.f169248g = 2;
                        if (pVar.invoke(q0Var, n0Var) != aVar2) {
                            file2 = file;
                            o0Var2 = o0Var;
                            q0Var2 = q0Var;
                            Unit unit3 = Unit.INSTANCE;
                            q0Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                File file6 = o0Var2.f169260a;
                                a.f169074a.getClass();
                                Files.move(file2.toPath(), file6.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                if (!z14) {
                                    throw new IOException("Unable to rename " + file2 + " to " + o0Var2.f169260a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            Unit unit4 = Unit.INSTANCE;
                            aVar.e(null);
                            return Unit.INSTANCE;
                        }
                        return aVar2;
                    } catch (Throwable th7) {
                        th3 = th7;
                        q0Var2 = q0Var;
                        q0Var2.close();
                        throw th3;
                    }
                    q0Var = new q0(file, o0Var.f169261b);
                } catch (IOException e4) {
                    e = e4;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(o0Var.f169260a.getAbsolutePath() + ".tmp");
            } catch (Throwable th8) {
                aVar.e(null);
                throw th8;
            }
        } catch (IOException e14) {
            e = e14;
            file = aVar2;
        }
    }
}

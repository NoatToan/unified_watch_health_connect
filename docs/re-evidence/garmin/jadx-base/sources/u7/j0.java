package u7;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu7/j0;", "T", "Lu7/h1;", "Ljava/io/File;", "file", "Lu7/k1;", "serializer", "<init>", "(Ljava/io/File;Lu7/k1;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class j0<T> implements h1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f169170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1<T> f169171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f169172c;

    public j0(File file, k1<T> k1Var) {
        file.getClass();
        k1Var.getClass();
        this.f169170a = file;
        this.f169171b = k1Var;
        this.f169172c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [u7.j0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, u7.j0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [u7.j0] */
    public static Object f(j0 j0Var, v13.c cVar) {
        i0 i0Var;
        Throwable th3;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th4;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f169163e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f169163e = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(j0Var, cVar);
            }
        } else {
            i0Var = new i0(j0Var, cVar);
        }
        Object obj = i0Var.f169161c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = i0Var.f169163e;
        try {
            if (r14 != 0) {
                if (r14 == 1) {
                    fileInputStream = i0Var.f169160b;
                    r14 = (j0) i0Var.f169159a;
                    try {
                        o13.r.b(obj);
                        jg.b.l(fileInputStream, null);
                        return obj;
                    } catch (Throwable th5) {
                        th4 = th5;
                        try {
                            throw th4;
                        } catch (Throwable th6) {
                            jg.b.l(fileInputStream, th4);
                            throw th6;
                        }
                    }
                }
                if (r14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) i0Var.f169159a;
                try {
                    o13.r.b(obj);
                    jg.b.l(closeable, null);
                    return obj;
                } catch (Throwable th7) {
                    th3 = th7;
                    try {
                        throw th3;
                    } catch (Throwable th8) {
                        jg.b.l(closeable, th3);
                        throw th8;
                    }
                }
            }
            o13.r.b(obj);
            if (j0Var.f169172c.get()) {
                vb.h.z("This scope has already been closed.");
                return null;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(j0Var.f169170a);
                try {
                    k1<T> k1Var = j0Var.f169171b;
                    i0Var.f169159a = j0Var;
                    i0Var.f169160b = fileInputStream2;
                    i0Var.f169163e = 1;
                    Object from = k1Var.readFrom(fileInputStream2, i0Var);
                    if (from != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = from;
                        jg.b.l(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    r14 = j0Var;
                    fileInputStream = fileInputStream2;
                    th4 = th9;
                    throw th4;
                }
            } catch (FileNotFoundException unused) {
                File file = j0Var.f169170a;
                k1<T> k1Var2 = j0Var.f169171b;
                if (!file.exists()) {
                    return k1Var2.getDefaultValue();
                }
                FileInputStream fileInputStream3 = new FileInputStream(j0Var.f169170a);
                try {
                    i0Var.f169159a = fileInputStream3;
                    i0Var.f169160b = null;
                    i0Var.f169163e = 2;
                    Object from2 = k1Var2.readFrom(fileInputStream3, i0Var);
                    if (from2 != aVar) {
                        obj = from2;
                        closeable = fileInputStream3;
                        jg.b.l(closeable, null);
                        return obj;
                    }
                } catch (Throwable th10) {
                    th3 = th10;
                    closeable = fileInputStream3;
                    throw th3;
                }
            }
            return aVar;
        } catch (FileNotFoundException unused2) {
            j0Var = r14;
        }
    }

    @Override // u7.c
    public final void close() {
        this.f169172c.set(true);
    }

    @Override // u7.h1
    public final Object e(u1 u1Var) {
        return f(this, u1Var);
    }
}

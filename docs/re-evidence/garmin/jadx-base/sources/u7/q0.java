package u7;

import java.io.File;
import java.io.FileOutputStream;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu7/q0;", "T", "Lu7/j0;", "Lu7/y1;", "Ljava/io/File;", "file", "Lu7/k1;", "serializer", "<init>", "(Ljava/io/File;Lu7/k1;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q0<T> extends j0<T> implements y1<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(File file, k1<T> k1Var) {
        super(file, k1Var);
        file.getClass();
        k1Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u7.y1
    public final Object b(Object obj, v13.c cVar) {
        p0 p0Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f169288e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f169288e = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object obj2 = p0Var.f169286c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f169288e;
        if (i15 == 0) {
            o13.r.b(obj2);
            if (this.f169172c.get()) {
                vb.h.z("This scope has already been closed.");
                return null;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f169170a);
            try {
                k1<T> k1Var = this.f169171b;
                w1 w1Var = new w1(fileOutputStream3);
                p0Var.f169284a = fileOutputStream3;
                p0Var.f169285b = fileOutputStream3;
                p0Var.f169288e = 1;
                if (k1Var.writeTo(obj, w1Var, p0Var) == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = p0Var.f169285b;
            fileOutputStream = p0Var.f169284a;
            try {
                o13.r.b(obj2);
            } catch (Throwable th4) {
                th = th4;
                try {
                    throw th;
                } catch (Throwable th5) {
                    jg.b.l(fileOutputStream, th);
                    throw th5;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit = Unit.INSTANCE;
        jg.b.l(fileOutputStream, null);
        return Unit.INSTANCE;
    }
}

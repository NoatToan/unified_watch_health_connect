package m63;

import kotlinx.serialization.SerializationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/b;", "", "T", "Li63/c;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<T> implements i63.c<T> {
    public i63.b<T> a(l63.c cVar, String str) {
        return cVar.getF129870c().d(str, c());
    }

    public i63.i<T> b(l63.f fVar, T t7) {
        t7.getClass();
        return fVar.getF129837e().e(c(), t7);
    }

    public abstract k23.d<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i63.b
    public final T deserialize(l63.e eVar) {
        eVar.getClass();
        k63.e f158591b = getF158591b();
        l63.c cVarC = eVar.c(f158591b);
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        int i14 = l63.c.f110557a;
        T t7 = null;
        while (true) {
            int iE = cVarC.e(getF158591b());
            if (iE == -1) {
                if (t7 != null) {
                    cVarC.b(f158591b);
                    return t7;
                }
                vb.h.y((String) r0Var.f105810a, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iE != 0) {
                T t14 = r0Var.f105810a;
                if (iE != 1) {
                    StringBuilder sb3 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t14;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb3.append(str);
                    sb3.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb3.append(iE);
                    throw new SerializationException(sb3.toString());
                }
                if (t14 == 0) {
                    vb.h.s("Cannot read polymorphic value before its type token");
                    return null;
                }
                r0Var.f105810a = t14;
                t7 = (T) cVarC.l(getF158591b(), iE, gl1.d.v(this, cVarC, (String) t14), null);
            } else {
                r0Var.f105810a = (T) cVarC.r(getF158591b(), iE);
            }
        }
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, T t7) {
        t7.getClass();
        i63.i<? super T> iVarW = gl1.d.w(this, fVar, t7);
        k63.e f158591b = getF158591b();
        l63.d dVarC = fVar.c(f158591b);
        dVarC.k(getF158591b(), 0, iVarW.getF158591b().getF103221c());
        dVarC.e(getF158591b(), 1, iVarW, t7);
        dVarC.b(f158591b);
    }
}

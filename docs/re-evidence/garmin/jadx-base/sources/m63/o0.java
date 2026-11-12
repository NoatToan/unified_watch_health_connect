package m63;

import kotlinx.serialization.SerializationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lm63/o0;", "K", "V", "R", "Li63/c;", "keySerializer", "valueSerializer", "<init>", "(Li63/c;Li63/c;)V", "Lm63/w0;", "Lm63/g1;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o0<K, V, R> implements i63.c<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<K> f117002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63.c<V> f117003b;

    private o0(i63.c<K> cVar, i63.c<V> cVar2) {
        this.f117002a = cVar;
        this.f117003b = cVar2;
    }

    public abstract K a(R r14);

    public abstract V b(R r14);

    public abstract R c(K k14, V v14);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i63.b
    public final R deserialize(l63.e eVar) {
        Object obj = k1.f116971c;
        eVar.getClass();
        k63.e f94809a = getF94809a();
        l63.c cVarC = eVar.c(f94809a);
        int i14 = l63.c.f110557a;
        Object objL = obj;
        Object objL2 = objL;
        while (true) {
            int iE = cVarC.e(getF94809a());
            if (iE == -1) {
                if (objL == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objL2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                R r14 = (R) c(objL, objL2);
                cVarC.b(f94809a);
                return r14;
            }
            if (iE == 0) {
                objL = cVarC.l(getF94809a(), 0, this.f117002a, null);
            } else {
                if (iE != 1) {
                    throw new SerializationException(am.j.h(iE, "Invalid index: "));
                }
                objL2 = cVarC.l(getF94809a(), 1, this.f117003b, null);
            }
        }
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, R r14) {
        l63.d dVarC = fVar.c(getF94809a());
        dVarC.e(getF94809a(), 0, this.f117002a, a(r14));
        dVarC.e(getF94809a(), 1, this.f117003b, b(r14));
        dVarC.b(getF94809a());
    }

    public /* synthetic */ o0(i63.c cVar, i63.c cVar2, p005kotlin.jvm.internal.j jVar) {
        this(cVar, cVar2);
    }
}

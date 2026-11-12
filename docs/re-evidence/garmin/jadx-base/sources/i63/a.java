package i63;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.SerializationException;
import m63.k1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Li63/a;", "", "T", "Li63/c;", "Lk23/d;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(Lk23/d;Li63/c;[Li63/c;)V", "(Lk23/d;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<T> f91880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f91881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c<?>> f91882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k63.b f91883d;

    public a(k23.d<T> dVar, c<T> cVar, c<?>[] cVarArr) {
        dVar.getClass();
        cVarArr.getClass();
        this.f91880a = dVar;
        this.f91881b = cVar;
        List<c<?>> listAsList = Arrays.asList(cVarArr);
        listAsList.getClass();
        this.f91882c = listAsList;
        this.f91883d = new k63.b(k63.k.e("kotlinx.serialization.ContextualSerializer", k63.l.a.f103251a, new k63.e[0], new ho0.g(this, 20)), dVar);
    }

    @Override // i63.b
    public final T deserialize(l63.e eVar) {
        eVar.getClass();
        p63.e f129822e = eVar.getF129870c();
        List<c<?>> list = this.f91882c;
        k23.d<T> dVar = this.f91880a;
        c<T> cVarB = f129822e.b(dVar, list);
        if (cVarB == null && (cVarB = this.f91881b) == null) {
            throw new SerializationException(k1.g(dVar));
        }
        return (T) eVar.h(cVarB);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f91883d;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, T t7) {
        t7.getClass();
        p63.e f129837e = fVar.getF129837e();
        List<c<?>> list = this.f91882c;
        k23.d<T> dVar = this.f91880a;
        c<T> cVarB = f129837e.b(dVar, list);
        if (cVarB == null && (cVarB = this.f91881b) == null) {
            throw new SerializationException(k1.g(dVar));
        }
        fVar.l(cVarB, t7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(k23.d<T> dVar) {
        this(dVar, null, k1.f116970b);
        dVar.getClass();
    }
}

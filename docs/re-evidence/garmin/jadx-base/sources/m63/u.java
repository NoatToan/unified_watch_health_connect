package m63;

import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm63/u;", "T", "Lm63/v1;", "Lkotlin/Function1;", "Lk23/d;", "Li63/c;", "compute", "<init>", "(Le23/l;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u<T> implements v1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<k23.d<?>, i63.c<T>> f117021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, j<T>> f117022b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(e23.l<? super k23.d<?>, ? extends i63.c<T>> lVar) {
        lVar.getClass();
        this.f117021a = lVar;
        this.f117022b = new ConcurrentHashMap<>();
    }

    @Override // m63.v1
    public final i63.c<T> a(k23.d<Object> dVar) {
        j<T> jVarPutIfAbsent;
        Class<?> clsU = dh.b.u(dVar);
        ConcurrentHashMap<Class<?>, j<T>> concurrentHashMap = this.f117022b;
        j<T> jVar = concurrentHashMap.get(clsU);
        if (jVar == null && (jVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsU, (jVar = new j<>(this.f117021a.invoke(dVar))))) != null) {
            jVar = jVarPutIfAbsent;
        }
        return jVar.f116964a;
    }
}

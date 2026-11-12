package n23;

import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln23/i;", "V", "Ln23/a;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Le23/l;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i<V> extends a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Class<?>, V> f122498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, V> f122499b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(e23.l<? super Class<?>, ? extends V> lVar) {
        lVar.getClass();
        this.f122498a = lVar;
        this.f122499b = new ConcurrentHashMap<>();
    }

    public final V a(Class<?> cls) {
        cls.getClass();
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f122499b;
        V v14 = (V) concurrentHashMap.get(cls);
        if (v14 != null) {
            return v14;
        }
        V vInvoke = this.f122498a.invoke(cls);
        V v15 = (V) concurrentHashMap.putIfAbsent(cls, vInvoke);
        return v15 == null ? vInvoke : v15;
    }
}

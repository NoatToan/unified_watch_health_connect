package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls53/z;", "T", "Lr53/j;", "Lq53/w;", "channel", "<init>", "(Lq53/w;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z<T> implements r53.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q53.w<T> f157608a;

    /* JADX WARN: Multi-variable type inference failed */
    public z(q53.w<? super T> wVar) {
        this.f157608a = wVar;
    }

    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        Object objH = this.f157608a.h(t7, dVar);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
    }
}

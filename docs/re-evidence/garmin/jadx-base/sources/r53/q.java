package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class q<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f150802a;

    public q(Object obj) {
        this.f150802a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        this.f150802a.add(t7);
        return Unit.INSTANCE;
    }
}

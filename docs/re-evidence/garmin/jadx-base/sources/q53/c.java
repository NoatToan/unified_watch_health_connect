package q53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.q<Throwable, Object, t13.g, Unit> {
    public c(Object obj) {
        super(3, obj, b.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // e23.q
    public final Unit invoke(Throwable th3, Object obj, t13.g gVar) {
        e23.l<E, Unit> lVar = ((b) this.receiver).f142959b;
        lVar.getClass();
        og.a.t(lVar, obj, gVar);
        return Unit.INSTANCE;
    }
}

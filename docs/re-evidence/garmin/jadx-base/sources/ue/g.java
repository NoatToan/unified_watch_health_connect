package ue;

import androidx.work.CoroutineWorker;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lue/m;", "<anonymous>", "(Lo53/b0;)Lue/m;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f170064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CoroutineWorker coroutineWorker, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f170064b = coroutineWorker;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f170064b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super m> dVar) {
        g gVar = (g) create(b0Var, dVar);
        Unit unit = Unit.INSTANCE;
        gVar.invokeSuspend(unit);
        return unit;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170063a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f170063a = 1;
        this.f170064b.getClass();
        vb.h.z("Not implemented");
        return null;
    }
}

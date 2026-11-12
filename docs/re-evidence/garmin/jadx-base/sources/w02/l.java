package w02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.ReorderableLazyListKt$ReorderableLazyItem$2$1", f = "ReorderableLazyList.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f181112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f181113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f181114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z14, r rVar, Object obj, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f181112a = z14;
        this.f181113b = rVar;
        this.f181114c = obj;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f181112a, this.f181113b, this.f181114c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Object obj2 = this.f181114c;
        boolean z14 = this.f181112a;
        r rVar = this.f181113b;
        if (z14) {
            rVar.f181133l.add(obj2);
        } else {
            rVar.f181133l.remove(obj2);
        }
        return Unit.INSTANCE;
    }
}

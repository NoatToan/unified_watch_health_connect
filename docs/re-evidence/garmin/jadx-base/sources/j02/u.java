package j02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.ReorderableLazyCollectionState$moveDraggingItemToEnd$job$1", f = "ReorderableLazyCollection.kt", l = {496}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<Object> f96155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g<Object> f96156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g<Object> f96157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s<Object> sVar, g<Object> gVar, g<Object> gVar2, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f96155b = sVar;
        this.f96156c = gVar;
        this.f96157d = gVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f96155b, this.f96156c, this.f96157d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96154a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f96154a = 1;
            if (s.b(this.f96155b, this.f96156c, this.f96157d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

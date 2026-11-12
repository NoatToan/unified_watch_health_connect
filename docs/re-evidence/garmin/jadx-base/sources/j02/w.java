package j02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.ReorderableLazyCollectionState$moveItems$2$1", f = "ReorderableLazyCollection.kt", l = {567}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<Object> f96167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s<Object> sVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f96167b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f96167b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96166a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.f0 f0VarL = r53.s.L(this.f96167b.f96146u, 2);
            this.f96166a = 1;
            if (r53.s.j(f0VarL, this) == aVar) {
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

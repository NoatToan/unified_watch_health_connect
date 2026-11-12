package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li53/c;", "Lpe0/a;", "dogs", "", "<anonymous>", "(Li53/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityDogs$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<i53.c<? extends pe0.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(t tVar, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f146289b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(this.f146289b, dVar);
        k0Var.f146288a = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(i53.c<? extends pe0.a> cVar, t13.d<? super Unit> dVar) {
        return ((k0) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i53.c cVar = (i53.c) this.f146288a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = t.A2;
        ((r53.z1) this.f146289b.f146567w1.getValue()).setValue(cVar);
        return Unit.INSTANCE;
    }
}

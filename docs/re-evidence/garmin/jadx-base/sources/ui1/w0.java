package ui1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.SubscriptionsRepository$transferSubscription$2", f = "SubscriptionsRepository.kt", l = {137}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.l<t13.d<? super c83.a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f171405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f171406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f171407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(o0 o0Var, g0 g0Var, t13.d<? super w0> dVar) {
        super(1, dVar);
        this.f171406b = o0Var;
        this.f171407c = g0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w0(this.f171406b, this.f171407c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<String>> dVar) {
        return ((w0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171405a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<String>> i0VarD = this.f171406b.f171348a.d(this.f171407c);
        this.f171405a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

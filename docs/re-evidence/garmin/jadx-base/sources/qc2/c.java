package qc2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "Lsc2/j;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.gcapi.GC1ForGC1Request$run$2", f = "GC1ForGC1Request.kt", l = {62}, m = "invokeSuspend")
public final class c extends v13.i implements e23.p<b0, t13.d<? super wc2.a<? extends sc2.j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f144388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f144388b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f144388b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super wc2.a<? extends sc2.j>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144387a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f144387a = 1;
        int i15 = d.f144389k;
        Object objA = this.f144388b.a(this);
        return objA == aVar ? aVar : objA;
    }
}

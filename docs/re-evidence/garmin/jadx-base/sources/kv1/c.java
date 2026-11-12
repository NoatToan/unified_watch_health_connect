package kv1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfu1/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$createATP$2", f = "FBTPlansRepo.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super c83.a0<fu1.l>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xw1.c f106729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, xw1.c cVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f106728b = bVar;
        this.f106729c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f106728b, this.f106729c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fu1.l>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106727a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<fu1.l>> i0VarG = this.f106728b.f106720a.g(this.f106729c);
        this.f106727a = 1;
        Object objAwait = i0VarG.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

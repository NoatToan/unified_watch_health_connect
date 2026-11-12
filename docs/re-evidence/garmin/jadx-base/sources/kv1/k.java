package kv1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljv1/y;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$getRecentTrainingStats$2", f = "FBTPlansRepo.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super c83.a0<jv1.y>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f106761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f106762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, String str, String str2, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f106760b = bVar;
        this.f106761c = str;
        this.f106762d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f106760b, this.f106761c, this.f106762d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<jv1.y>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106759a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<jv1.y>> i0VarD = this.f106760b.f106720a.d(this.f106761c, this.f106762d);
        this.f106759a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

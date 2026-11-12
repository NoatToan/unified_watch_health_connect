package kv1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/n;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo$getActivityPolyline$2", f = "FBTPlansRepo.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super c83.a0<ps.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f106743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, long j8, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f106742b = bVar;
        this.f106743c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f106742b, this.f106743c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ps.n>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106741a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<ps.n>> i0VarH = this.f106742b.f106721b.H(this.f106743c, new Integer(500), null);
        this.f106741a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

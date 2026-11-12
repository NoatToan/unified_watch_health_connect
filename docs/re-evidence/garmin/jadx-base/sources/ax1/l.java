package ax1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lww1/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.BasicPlansRepo$getItpPlan$2", f = "BasicPlansRepo.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super a0<ww1.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f13642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, long j8, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f13642b = iVar;
        this.f13643c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f13642b, this.f13643c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ww1.i>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13641a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ww1.i>> i0VarD = this.f13642b.f13634a.d(this.f13643c);
        this.f13641a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

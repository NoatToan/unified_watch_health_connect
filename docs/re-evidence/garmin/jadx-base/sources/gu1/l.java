package gu1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lxw1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.network.ATPRepo$updateAthletePlan$2", f = "ATPRepo.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super a0<xw1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f79090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f79091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw1.c f79092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, long j8, xw1.c cVar, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f79090b = bVar;
        this.f79091c = j8;
        this.f79092d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f79090b, this.f79091c, this.f79092d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<xw1.c>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79089a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<xw1.c>> i0VarY = this.f79090b.f79048a.y(this.f79091c, this.f79092d);
        this.f79089a = 1;
        Object objAwait = i0VarY.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

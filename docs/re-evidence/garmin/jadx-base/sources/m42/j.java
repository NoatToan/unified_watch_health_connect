package m42;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll42/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.data.repository.WeightsRepository$getMultiWeightWeeklyReportAsync$2", f = "WeightsRepository.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements l<t13.d<? super a0<l42.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f116634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f116635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, o oVar2, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f116634b = oVar;
        this.f116635c = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f116634b, this.f116635c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<l42.e>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116633a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<l42.e>> i0VarC = b.a.a(b.f116608a).c(fz0.d.a(this.f116634b), fz0.d.a(this.f116635c));
        this.f116633a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

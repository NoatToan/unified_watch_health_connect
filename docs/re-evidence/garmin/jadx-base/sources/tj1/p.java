package tj1;

import c83.a0;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ltj1/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.network.GeoCodingRepo$getReversedGeocodes$2", f = "GeoCodingRepo.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super a0<List<? extends l>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f165162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f165163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f165164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, double d14, double d15, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f165162b = nVar;
        this.f165163c = d14;
        this.f165164d = d15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f165162b, this.f165163c, this.f165164d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends l>>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165161a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<List<l>>> i0VarB = this.f165162b.f165156a.b(this.f165163c, this.f165164d);
        this.f165161a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

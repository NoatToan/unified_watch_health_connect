package re1;

import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qe1.j;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lqe1/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.data.repository.RunningEconomyRepositoryImpl$getWeeklyRunningEconomyMetrics$2", f = "RunningEconomyRepositoryImpl.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<List<? extends j>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f152203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f152204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f152205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, o oVar, o oVar2, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f152203b = hVar;
        this.f152204c = oVar;
        this.f152205d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f152203b, this.f152204c, this.f152205d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends j>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152202a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<j>>> i0VarD = this.f152203b.f152209a.d(new fz0.f(this.f152204c), new fz0.f(this.f152205d));
        this.f152202a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

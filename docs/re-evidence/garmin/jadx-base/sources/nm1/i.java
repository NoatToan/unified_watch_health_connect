package nm1;

import c83.a0;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lkm1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.data.repository.SleepRepositoryImpl$getDailySleepChartData$2", f = "SleepRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super a0<km1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f126637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f126638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, DateTime dateTime, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f126637b = bVar;
        this.f126638c = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f126637b, this.f126638c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<km1.c>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126636a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<km1.c>> i0VarC = this.f126637b.f126612a.c(fz0.d.b(this.f126638c), 60);
        this.f126636a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

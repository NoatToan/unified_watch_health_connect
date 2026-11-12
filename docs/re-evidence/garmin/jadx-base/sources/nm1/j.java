package nm1;

import c83.a0;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmm1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.data.repository.SleepRepositoryImpl$getSleepResultsDailySummary$2", f = "SleepRepositoryImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super a0<mm1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f126640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f126641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f126642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, DateTime dateTime, DateTime dateTime2, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f126640b = bVar;
        this.f126641c = dateTime;
        this.f126642d = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f126640b, this.f126641c, this.f126642d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<mm1.b>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126639a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<mm1.b>> i0VarE = this.f126640b.f126612a.e(fz0.d.b(this.f126641c), fz0.d.b(this.f126642d));
        this.f126639a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

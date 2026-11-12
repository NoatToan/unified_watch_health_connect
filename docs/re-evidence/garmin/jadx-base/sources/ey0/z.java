package ey0;

import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getTrainingLoadData$2", f = "MultiDayActivitiesRepository.kt", l = {217}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super c83.a0<TrainingStatusReportDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz0.c f67268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, String str, fz0.c cVar, fz0.c cVar2, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f67265b = g0Var;
        this.f67266c = str;
        this.f67267d = cVar;
        this.f67268e = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f67265b, this.f67266c, this.f67267d, this.f67268e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<TrainingStatusReportDTO>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67264a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<TrainingStatusReportDTO>> i0VarD = g0.a(this.f67265b).d(this.f67266c, this.f67267d, this.f67268e);
        this.f67264a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

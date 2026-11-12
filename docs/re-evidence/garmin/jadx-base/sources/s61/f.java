package s61;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.repo.PerformanceRepo$getWeeklyTrainingStatus$2", f = "PerformanceRepo.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<TrainingStatusReportDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f157640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f157641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f157642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, String str, String str2, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f157640b = aVar;
        this.f157641c = str;
        this.f157642d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f157640b, this.f157641c, this.f157642d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<TrainingStatusReportDTO>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157639a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<TrainingStatusReportDTO>> i0VarA = this.f157640b.f157623a.a(this.f157641c, this.f157642d);
        this.f157639a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

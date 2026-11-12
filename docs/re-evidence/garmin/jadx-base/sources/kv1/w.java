package kv1;

import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.UserPreferenceRepo$getLastTrainingStatusDeviceId$2", f = "UserPreferenceRepo.kt", l = {11}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super c83.a0<TrainingStatusDeviceDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f106801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f106801b = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f106801b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<TrainingStatusDeviceDTO>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106800a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<TrainingStatusDeviceDTO>> i0VarA = this.f106801b.f106799a.a();
        this.f106800a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

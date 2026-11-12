package iw;

import c83.a0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.repo.PersonalPrefsRepo$saveLastTrainingStatusDevice$2", f = "PersonalPrefsRepo.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f95271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainingStatusDeviceDTO f95272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, TrainingStatusDeviceDTO trainingStatusDeviceDTO, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f95271b = eVar;
        this.f95272c = trainingStatusDeviceDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f95271b, this.f95272c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95270a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarC = this.f95271b.f95263a.c(this.f95272c);
        this.f95270a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

package k12;

import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/settings/model/StepLengthDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo$getWalkingStepLength$2", f = "UsersRepo.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super c83.a0<StepLengthDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d dVar, t13.d<? super z> dVar2) {
        super(1, dVar2);
        this.f102396b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f102396b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<StepLengthDTO>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102395a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<StepLengthDTO>> i0VarT = this.f102396b.f102316a.t();
        this.f102395a = 1;
        Object objAwait = i0VarT.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}

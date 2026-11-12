package gg1;

import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.GCMUserSettingsViewModel$editRunningStepLength$1", f = "GCMUserSettingsViewModel.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f77379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StepLengthDTO f77380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g0 g0Var, StepLengthDTO stepLengthDTO, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f77379b = g0Var;
        this.f77380c = stepLengthDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f77379b, this.f77380c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f77378a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        k12.d dVar = this.f77379b.f77234a;
        this.f77378a = 1;
        dVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new k12.k(dVar, this.f77380c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

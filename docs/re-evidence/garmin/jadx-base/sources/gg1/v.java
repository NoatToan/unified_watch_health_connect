package gg1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.GCMUserSettingsViewModel$addWheelchairPushLength$1", f = "GCMUserSettingsViewModel.kt", l = {39}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f77332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wi1.i f77333c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g0 g0Var, wi1.i iVar, t13.d<? super v> dVar) {
        super(1, dVar);
        this.f77332b = g0Var;
        this.f77333c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f77332b, this.f77333c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f77331a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        k12.d dVar = this.f77332b.f77234a;
        this.f77331a = 1;
        dVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new k12.g(dVar, this.f77333c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

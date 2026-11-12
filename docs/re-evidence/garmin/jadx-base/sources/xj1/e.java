package xj1;

import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingDetailsFragment;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps.EmergencyCallingDetailsFragment$showAdminCannotBeRemovedDialog$1", f = "EmergencyCallingDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f191169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmergencyCallingDetailsFragment f191170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o0 o0Var, EmergencyCallingDetailsFragment emergencyCallingDetailsFragment, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f191169a = o0Var;
        this.f191170b = emergencyCallingDetailsFragment;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f191169a, this.f191170b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f191169a.u6(this.f191170b);
        return Unit.INSTANCE;
    }
}

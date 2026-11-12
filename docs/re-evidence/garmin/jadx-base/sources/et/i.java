package et;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.screens.ActivityRecordingScreenKt$ActivityRecordingScreen$1$1", f = "ActivityRecordingScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f65254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f65255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f65254a = p1Var;
        this.f65255b = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f65254a, this.f65255b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (this.f65254a.getF182175a().booleanValue()) {
            this.f65255b.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}

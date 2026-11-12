package zo1;

import android.app.Activity;
import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRidePrivacyHelpScreen$SetupMainScreen$2$1", f = "GroupRidePrivacyHelpScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f206224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f206225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, Context context, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f206224a = zVar;
        this.f206225b = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f206224a, this.f206225b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b0 b0Var = this.f206224a.f206496f;
        if (b0Var != null) {
            b0Var.f206235b.k(null, Boolean.FALSE);
        }
        Activity activityW = o72.t.w(this.f206225b);
        if (activityW != null) {
            activityW.setResult(-1);
        }
        if (activityW != null) {
            activityW.finish();
        }
        return Unit.INSTANCE;
    }
}

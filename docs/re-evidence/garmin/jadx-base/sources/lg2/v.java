package lg2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.buttons.StopButtonAnimatedVisibilityKt$StopButtonAnimatedVisibility$1$1", f = "StopButtonAnimatedVisibility.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f112373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag2.e f112374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f112375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z14, ag2.e eVar, p1<Boolean> p1Var, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f112373a = z14;
        this.f112374b = eVar;
        this.f112375c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f112373a, this.f112374b, this.f112375c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = this.f112373a;
        p1<Boolean> p1Var = this.f112375c;
        if (z14) {
            p1Var.setValue(Boolean.FALSE);
        } else if (this.f112374b == ag2.e.START_RECORDING) {
            p1Var.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}

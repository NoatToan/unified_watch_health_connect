package et;

import i3.mc;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activityrecording.presentation.screens.ActivityRecordingScreenKt$ActivityRecordingScreen$dismissOnAction$1$1$1", f = "ActivityRecordingScreen.kt", l = {93}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f65259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f65260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mc mcVar, p1<Boolean> p1Var, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f65259b = mcVar;
        this.f65260c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f65259b, this.f65260c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65258a;
        if (i14 == 0) {
            r.b(obj);
            this.f65260c.setValue(Boolean.TRUE);
            this.f65258a = 1;
            if (this.f65259b.d(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

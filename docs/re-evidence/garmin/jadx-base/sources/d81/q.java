package d81;

import ch.qos.logback.core.net.SyslogConstants;
import h2.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.presentation.composable.EnduranceScoreOneYearScreenKt$EnduranceScoreOneYearPage$2$3$1", f = "EnduranceScoreOneYearScreen.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f58364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f58365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j0 j0Var, int i14, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f58365b = j0Var;
        this.f58366c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f58365b, this.f58366c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f58364a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f58364a = 1;
            if (j0.w(this.f58365b, this.f58366c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

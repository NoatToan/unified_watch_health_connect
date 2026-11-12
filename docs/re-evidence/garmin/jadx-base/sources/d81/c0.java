package d81;

import h2.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.presentation.composable.StaminaComparisonScreenKt$StaminaComparisonScreen$2$1$1$1", f = "StaminaComparisonScreen.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f58296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f58297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f58299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(j0 j0Var, int i14, n1 n1Var, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f58297b = j0Var;
        this.f58298c = i14;
        this.f58299d = n1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f58297b, this.f58298c, this.f58299d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f58296a;
        int i15 = this.f58298c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f58296a = 1;
            if (j0.w(this.f58297b, i15, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f58299d.t(i15);
        return Unit.INSTANCE;
    }
}

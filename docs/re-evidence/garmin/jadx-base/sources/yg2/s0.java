package yg2;

import i3.fe;
import l72.d3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutViewKt$WorkoutView$2$1$1$1$1$1$1", f = "WorkoutView.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f197199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(fe feVar, String str, String str2, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f197199b = feVar;
        this.f197200c = str;
        this.f197201d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s0(this.f197199b, this.f197200c, this.f197201d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197198a;
        if (i14 == 0) {
            o13.r.b(obj);
            zg2.c.f204692a.getClass();
            zg2.c.d("WorkoutView", "Show snackbar.");
            this.f197198a = 1;
            if (d3.c(this.f197199b, this.f197200c, this.f197201d, this) == aVar) {
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

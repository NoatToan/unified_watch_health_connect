package et1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.UserTrailReviewsScreenKt$UserTrailReviewsScreen$4$1$3$1$4$1", f = "UserTrailReviewsScreen.kt", l = {267}, m = "invokeSuspend", v = 2)
public final class k2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.a0 f65685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f65686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<us1.o> f65687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(pt1.a0 a0Var, e2.i0 i0Var, p3.p1<us1.o> p1Var, t13.d<? super k2> dVar) {
        super(2, dVar);
        this.f65685b = a0Var;
        this.f65686c = i0Var;
        this.f65687d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k2(this.f65685b, this.f65686c, this.f65687d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65684a;
        if (i14 == 0) {
            o13.r.b(obj);
            pt1.a0 a0Var = this.f65685b;
            us1.o oVar = a0Var.f140807e;
            p3.p1<us1.o> p1Var = this.f65687d;
            if (oVar != p1Var.getF182175a()) {
                p1Var.setValue(a0Var.f140807e);
                this.f65684a = 1;
                e2.i0.a aVar2 = e2.i0.f62432x;
                if (this.f65686c.l(0, 0, this) == aVar) {
                    return aVar;
                }
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

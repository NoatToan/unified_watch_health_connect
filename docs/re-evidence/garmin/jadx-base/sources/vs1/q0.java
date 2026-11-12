package vs1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.UserReviewsUseCase$updateUserReviewsSorting$1", f = "UserReviewsUseCase.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f179883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ us1.o f179884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h0 h0Var, us1.o oVar, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f179883b = h0Var;
        this.f179884c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q0(this.f179883b, this.f179884c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179882a;
        if (i14 == 0) {
            o13.r.b(obj);
            h0 h0Var = this.f179883b;
            i53.c<pt1.x> cVar = h0Var.f179815e.getValue().f140806d;
            f12.l lVar = h0Var.f179816f;
            us1.o oVar = this.f179884c;
            lVar.u2(oVar.ordinal(), "userTrailsSortOrder");
            z1<pt1.a0> z1Var = h0Var.f179815e;
            pt1.a0 a0VarA = pt1.a0.a(z1Var.getValue(), false, false, false, h0.a(h0Var, cVar, oVar), this.f179884c, null, null, null, null, false, false, 2023);
            this.f179882a = 1;
            if (z1Var.emit(a0VarA, this) == aVar) {
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

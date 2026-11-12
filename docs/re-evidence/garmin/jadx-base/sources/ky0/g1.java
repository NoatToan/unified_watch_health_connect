package ky0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$10", f = "MultiDayActivitiesDetailViewModel.kt", l = {491}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107332b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(w0 w0Var, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f107332b = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g1(this.f107332b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107331a;
        w0 w0Var = this.f107332b;
        if (i14 == 0) {
            o13.r.b(obj);
            gy0.o0 o0Var = (gy0.o0) w0Var.C.getValue();
            b63.o oVarZ4 = w0Var.z4();
            b63.o oVarY4 = w0Var.y4();
            this.f107331a = 1;
            o0Var.getClass();
            obj = (oVarZ4 == null || oVarY4 == null) ? null : o0Var.f80205a.l(oVarZ4, oVarY4, g22.l.e(b63.u.INSTANCE).b(), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        cy0.i iVar = (cy0.i) obj;
        if (iVar != null) {
            p2 p2Var = w0Var.W0;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, iVar));
        }
        return Unit.INSTANCE;
    }
}

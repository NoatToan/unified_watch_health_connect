package ey1;

import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$getActivities$2", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {794}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f67408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f67410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f67411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f67412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j jVar, DateTime dateTime, DateTime dateTime2, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f67410c = jVar;
        this.f67411d = dateTime;
        this.f67412e = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f67410c, this.f67411d, this.f67412e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67409b;
        if (i14 == 0) {
            o13.r.b(obj);
            j jVar = this.f67410c;
            p2 p2Var2 = jVar.f67353v;
            nx1.f fVar = jVar.f67338e;
            this.f67408a = p2Var2;
            this.f67409b = 1;
            obj = fVar.b(this.f67411d, this.f67412e, this);
            if (obj == aVar) {
                return aVar;
            }
            p2Var = p2Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2Var = this.f67408a;
            o13.r.b(obj);
        }
        p2Var.setValue(((o2) obj).getValue());
        return Unit.INSTANCE;
    }
}

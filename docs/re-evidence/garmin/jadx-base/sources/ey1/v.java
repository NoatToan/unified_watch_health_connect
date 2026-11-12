package ey1;

import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$quitTrainingPlan$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {842, 843}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f67435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f67436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f67437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt1.j f67438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<ww1.e> f67439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j jVar, Long l14, boolean z14, rt1.j jVar2, List<ww1.e> list, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f67435b = jVar;
        this.f67436c = l14;
        this.f67437d = z14;
        this.f67438e = jVar2;
        this.f67439f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f67435b, this.f67436c, this.f67437d, this.f67438e, this.f67439f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4.b(r10.f67436c, r10.f67437d, r10.f67438e, r10.f67439f, r10) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67434a;
        j jVar = this.f67435b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p2 p2Var = jVar.f67355x;
        Boolean bool = Boolean.TRUE;
        this.f67434a = 1;
        p2Var.k(null, bool);
        if (Unit.INSTANCE != aVar) {
        }
        return aVar;
        st1.c cVar = jVar.f67340g;
        this.f67434a = 2;
    }
}

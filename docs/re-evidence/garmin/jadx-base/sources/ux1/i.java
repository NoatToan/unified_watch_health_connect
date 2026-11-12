package ux1;

import android.app.Activity;
import android.content.Intent;
import c.q;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.SetupStrengthTrainingPlanActivity;
import dy1.n;
import e23.p;
import lc.u0;
import lc.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.x3;
import ro0.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.screen.dashboard.TrainingPlanDashboardScreenKt$TrainingPlanDashboardScreen$1$1", f = "TrainingPlanDashboardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey1.j f173064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q<n.c, Boolean> f173065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<n.f, Boolean> f173066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f173067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f173068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f173069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x3<n> f173070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(ey1.j jVar, q<n.c, Boolean> qVar, q<n.f, Boolean> qVar2, e23.a<Unit> aVar, Activity activity, y yVar, x3<? extends n> x3Var, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f173064a = jVar;
        this.f173065b = qVar;
        this.f173066c = qVar2;
        this.f173067d = aVar;
        this.f173068e = activity;
        this.f173069f = yVar;
        this.f173070g = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f173064a, this.f173065b, this.f173066c, this.f173067d, this.f173068e, this.f173069f, this.f173070g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        n f182175a = this.f173070g.getF182175a();
        boolean z14 = f182175a instanceof n.c;
        ey1.j jVar = this.f173064a;
        if (z14) {
            jVar.B.setValue(null);
            this.f173065b.a((n.c) f182175a, null);
        } else if (f182175a instanceof n.f) {
            jVar.B.setValue(null);
            this.f173066c.a((n.f) f182175a, null);
        } else if (s.g(f182175a, n.a.f61579a)) {
            this.f173067d.invoke();
        } else if (f182175a instanceof n.b) {
            n.b bVar = (n.b) f182175a;
            HelpActivity.a.e(HelpActivity.f36653a, this.f173068e, l.STP_DASHBOARD, null, h7.c.a(new o13.p("TITLE", bVar.f61580a), new o13.p("PLAN_TYPE", bVar.f61581b), new o13.p("HAS_EXPLORATION_BENCHMARKING_PHASE", Boolean.valueOf(bVar.f61582c)), new o13.p("HAS_DELOAD_PHASE", Boolean.valueOf(bVar.f61583d))), 4);
        } else if (f182175a instanceof n.e) {
            y.k(new ay1.b(((n.e) f182175a).f61587a).c(), this.f173069f);
        } else if (f182175a instanceof n.d) {
            Activity activity = this.f173068e;
            if (activity != null) {
                SetupStrengthTrainingPlanActivity.a aVar2 = SetupStrengthTrainingPlanActivity.f45640a;
                Long l14 = new Long(((n.d) f182175a).f61586a);
                aVar2.getClass();
                Intent intent = new Intent(activity, (Class<?>) SetupStrengthTrainingPlanActivity.class);
                intent.putExtra("restarted_stp_id_key", l14.longValue());
                activity.startActivityForResult(intent, 100);
            }
        } else if (f182175a != null) {
            u0.r();
            return null;
        }
        jVar.B.setValue(null);
        return Unit.INSTANCE;
    }
}

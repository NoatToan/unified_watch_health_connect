package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/v0;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityIntervals$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ps.v0>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146824b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(t tVar, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f146824b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x0 x0Var = new x0(this.f146824b, dVar);
        x0Var.f146823a = obj;
        return x0Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ps.v0> v2Var, t13.d<? super Unit> dVar) {
        return ((x0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146823a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            int i14 = t.A2;
            t tVar = this.f146824b;
            r53.z1<ps.p> z1VarU4 = tVar.U4();
            ps.p value = tVar.U4().getValue();
            long j8 = tVar.f146575z;
            ps.v0 v0Var = (ps.v0) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            ps.p activitySplits = v0Var.getActivitySplits();
            List<ps.o0> listF = activitySplits != null ? activitySplits.f() : null;
            ps.p activitySplits2 = v0Var.getActivitySplits();
            List<ps.x0> listG = activitySplits2 != null ? activitySplits2.g() : null;
            ps.p1 splitSummary = v0Var.getSplitSummary();
            List<ps.o1> listB = splitSummary != null ? splitSummary.b() : null;
            ps.y1 typedSplits = v0Var.getTypedSplits();
            List<ps.x1> listD = typedSplits != null ? typedSplits.d() : null;
            value.getClass();
            z1VarU4.setValue(new ps.p(j8, listF, listG, listB, listD));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching intervals: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}

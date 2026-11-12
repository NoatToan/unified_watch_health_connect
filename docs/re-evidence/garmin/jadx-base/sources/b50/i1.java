package b50;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$sendPowerGuideToDevice$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(p pVar, long j8, t13.d<? super i1> dVar) {
        super(2, dVar);
        this.f15991b = pVar;
        this.f15992c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i1 i1Var = new i1(this.f15991b, this.f15992c, dVar);
        i1Var.f15990a = obj;
        return i1Var;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((i1) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var = (v2) this.f15990a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof v2.b;
        p pVar = this.f15991b;
        if (z14) {
            pVar.z4(new e50.b.a0(this.f15992c));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            pVar.z4(new e50.b.s(e50.g.OPERATION_SEND_POWER_GUIDE_TO_DEVICE));
        }
        return Unit.INSTANCE;
    }
}

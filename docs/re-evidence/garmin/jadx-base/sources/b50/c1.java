package b50;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$sendCourseToDevice$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.p<v2<? extends Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(p pVar, long j8, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f15962b = pVar;
        this.f15963c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c1 c1Var = new c1(this.f15962b, this.f15963c, dVar);
        c1Var.f15961a = obj;
        return c1Var;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends Object> v2Var, t13.d<? super Unit> dVar) {
        return ((c1) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var = (v2) this.f15961a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof v2.b;
        p pVar = this.f15962b;
        if (z14) {
            pVar.z4(new e50.b.z(this.f15963c));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            pVar.z4(new e50.b.s(e50.g.OPERATION_SEND_TO_DEVICE));
        }
        return Unit.INSTANCE;
    }
}

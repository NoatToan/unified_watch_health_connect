package i21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.k1;
import v01.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$onLogFood$1", f = "NutritionReportsViewModel.kt", l = {425}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f87355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f87356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f87357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i01.e f87358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<b11.i> f87359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(d dVar, b63.o oVar, i01.e eVar, List<? extends b11.i> list, t13.d<? super r> dVar2) {
        super(2, dVar2);
        this.f87356c = dVar;
        this.f87357d = oVar;
        this.f87358e = eVar;
        this.f87359f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f87356c, this.f87357d, this.f87358e, this.f87359f, dVar);
        rVar.f87355b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object value;
        b0 b0Var = (b0) this.f87355b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87354a;
        b63.o oVar = this.f87357d;
        d dVar = this.f87356c;
        if (i14 == 0) {
            o13.r.b(obj);
            n1 n1Var = dVar.f87274f;
            this.f87355b = b0Var;
            this.f87354a = 1;
            objE0 = ge1.b.e0(n1Var.f174480c, new k1(this.f87359f, n1Var, oVar, this.f87358e, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to log food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "NutritionReportsViewModel", strD);
            p2 p2Var = dVar.f87285q;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, c.a((c) value, new a(b.a.f87240b, null, 2, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            dVar.Q4(p13.w.c(oVar));
        }
        return Unit.INSTANCE;
    }
}

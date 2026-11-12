package w61;

import androidx.lifecycle.t0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/performance/model/a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$refreshCurrentTrainingStatus$1", f = "TrainingStatusViewModel.kt", l = {302, 302}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<t0<fw.m<? extends com.garmin.android.apps.connectmobile.performance.model.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f183231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f183232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f183233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f183234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(x xVar, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f183234d = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f183234d, dVar);
        n0Var.f183233c = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<fw.m<? extends com.garmin.android.apps.connectmobile.performance.model.a>> t0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f183233c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183232b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f183233c = null;
            this.f183231a = t0Var;
            this.f183232b = 1;
            obj = x.y4(this.f183234d, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            t0Var = this.f183231a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f183233c = null;
        this.f183231a = null;
        this.f183232b = 2;
    }
}

package w61;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getTrainingStatus$2", f = "TrainingStatusViewModel.kt", l = {460, 462, 463, 464}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<t0<fw.m<? extends CurrentTrainingStatusDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f183184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f183185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f183186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(x xVar, String str, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f183185c = xVar;
        this.f183186d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f183185c, this.f183186d, dVar);
        g0Var.f183184b = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<fw.m<? extends CurrentTrainingStatusDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        t0 t0Var = (t0) this.f183184b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183183a;
        if (i14 == 0) {
            o13.r.b(obj);
            fw.m mVarF = fw.m.a.f(fw.m.f73767e, null, null, 3);
            this.f183184b = t0Var;
            this.f183183a = 1;
            if (t0Var.emit(mVarF, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                fw.m mVarG = fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1);
                this.f183184b = null;
                this.f183183a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                fw.m mVarB = fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5);
                this.f183184b = null;
                this.f183183a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        s61.a aVar2 = this.f183185c.Z;
        this.f183184b = t0Var;
        this.f183183a = 2;
        aVar2.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new s61.b(aVar2, this.f183186d, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                fw.m mVarG2 = fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1);
                this.f183184b = null;
                this.f183183a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                fw.m mVarB2 = fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5);
                this.f183184b = null;
                this.f183183a = 4;
            }
        }
        return aVar;
    }
}

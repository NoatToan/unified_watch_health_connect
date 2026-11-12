package wt1;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lxw1/d;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.TrainingPlanViewModel$getActivePlan$1", f = "TrainingPlanViewModel.kt", l = {9, 9}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<t0<v2<? extends xw1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f187136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f187138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f187139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f187139d = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f187139d, dVar);
        sVar.f187138c = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends xw1.d>> t0Var, t13.d<? super Unit> dVar) {
        return ((s) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f187138c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187137b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f187136a;
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
        gu1.b bVar = this.f187139d.f187140a;
        this.f187138c = null;
        this.f187136a = t0Var;
        this.f187137b = 1;
        obj = bVar.a(this);
        if (obj != aVar) {
        }
        return aVar;
        this.f187138c = null;
        this.f187136a = null;
        this.f187137b = 2;
    }
}

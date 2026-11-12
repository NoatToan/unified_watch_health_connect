package eu1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.training.atp.domain.QuitActiveTrainingPlanUseCase$invoke$2", f = "QuitActiveTrainingPlanUseCase.kt", l = {14, 18}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f66111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f66112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f66112c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f66112c, dVar);
        cVar.f66111b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (com.garmin.android.apps.connectmobile.f0.J(r10, new gu1.j(r10, r2, null), r9) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f66111b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66110a;
        d dVar = this.f66112c;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        gu1.b bVar = dVar.f66113a;
        this.f66111b = b0Var;
        this.f66110a = 1;
        obj = bVar.a(this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            xw1.d dVar2 = (xw1.d) ((v2.b) v2Var).f47386a;
            Long l14 = dVar2 != null ? new Long(dVar2.getAthletePlanId()) : null;
            if (l14 != null) {
                gu1.b bVar2 = dVar.f66113a;
                long jLongValue = l14.longValue();
                this.f66111b = null;
                this.f66110a = 2;
            } else {
                a2 a2Var = a2.CONSENT;
                String strF = b71.i.f("Unable to retrieve active ATP ", v2Var);
                i2.f36769a.getClass();
                i2.a.e(a2Var, strF);
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

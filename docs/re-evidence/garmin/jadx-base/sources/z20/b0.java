package z20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lab1/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.UpdateCoursePowerGuideUseCase$invoke$1", f = "UpdateCoursePowerGuideUseCase.kt", l = {30, 34}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<r53.j<? super v2<? extends ab1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab1.g f201880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f201881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f201882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ab1.g gVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, c0 c0Var, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f201880c = gVar;
        this.f201881d = eVar;
        this.f201882e = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f201880c, this.f201881d, this.f201882e, dVar);
        b0Var.f201879b = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends ab1.d>> jVar, t13.d<? super Unit> dVar) {
        return ((b0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (r15 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        r53.j jVar = (r53.j) this.f201879b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201878a;
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
        Long l14 = this.f201880c.f2568a;
        if (l14 != null) {
            ab1.d dVar = new ab1.d(l14, this.f201880c, null, null, 8, null);
            ab1.g powerGuidanceSummary = dVar.getPowerGuidanceSummary();
            ab1.p.a aVar3 = ab1.p.f2628e;
            com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f201881d;
            com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
            aVar3.getClass();
            powerGuidanceSummary.i(ab1.p.a.a(iVarM));
            ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).q(dVar, eVar);
            sa1.m mVar = this.f201882e.f201888a;
            long jLongValue = l14.longValue();
            this.f201879b = jVar;
            this.f201878a = 1;
            obj = f0.J(mVar, new sa1.v(mVar, jLongValue, dVar, null), this);
        } else {
            aVar = new v2.a(new Exception("Invalid powerGuidancePk."), null, null, 6, null);
            this.f201879b = null;
            this.f201878a = 2;
        }
        return aVar2;
        aVar = (v2) obj;
        this.f201879b = null;
        this.f201878a = 2;
    }
}

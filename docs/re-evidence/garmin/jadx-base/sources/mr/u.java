package mr;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.q1;
import r53.c2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase$getActivityDetailsFlow$1", f = "GetCompactActivityDetailsUseCase.kt", l = {81, 86}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<r53.j<? super ActivityDetailChartDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f120318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f120319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ps.r f120320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f120321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g0 g0Var, long j8, ps.r rVar, x0 x0Var, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f120318c = g0Var;
        this.f120319d = j8;
        this.f120320e = rVar;
        this.f120321f = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f120318c, this.f120319d, this.f120320e, this.f120321f, dVar);
        uVar.f120317b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super ActivityDetailChartDTO> jVar, t13.d<? super Unit> dVar) {
        return ((u) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r1.emit(r3, r16) == r2) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objX;
        r53.j jVar = (r53.j) this.f120317b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120316a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objX = obj;
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
        am.m mVar = this.f120318c.f120273a;
        ms.b0 b0Var = new ms.b0();
        q1 summaryDTO = this.f120320e.getSummaryDTO();
        c2 c2Var = new c2(new am.q(mVar, this.f120319d, b0Var.a(summaryDTO != null ? summaryDTO.getNumberOfActiveLengths() : null), 1400, null, !uw0.a.a(this.f120321f), null));
        x53.c cVar = o53.s0.f129406a;
        r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
        this.f120317b = jVar;
        this.f120316a = 1;
        objX = r53.s.x(iVarA, this);
        if (objX != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objX;
        ActivityDetailChartDTO activityDetailChartDTO = v2Var instanceof v2.b ? (ActivityDetailChartDTO) ((v2.b) v2Var).f47386a : null;
        this.f120317b = null;
        this.f120316a = 2;
    }
}

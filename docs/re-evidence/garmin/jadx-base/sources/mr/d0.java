package mr;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.a1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lnr/v;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase$getDeviceData$1", f = "GetCompactActivityDetailsUseCase.kt", l = {212, 216}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<r53.j<? super nr.v>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ps.r f120259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f120260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ps.r rVar, g0 g0Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f120259c = rVar;
        this.f120260d = g0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f120259c, this.f120260d, dVar);
        d0Var.f120258b = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super nr.v> jVar, t13.d<? super Unit> dVar) {
        return ((d0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nr.v vVar;
        Integer deviceApplicationInstallationId;
        Integer agentApplicationInstallationId;
        r53.j jVar = (r53.j) this.f120258b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120257a;
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
        ps.r rVar = this.f120259c;
        if (oe2.f.A(rVar)) {
            a1 metadataDTO = rVar.getMetadataDTO();
            int iIntValue = 0;
            String strValueOf = String.valueOf((metadataDTO == null || (agentApplicationInstallationId = metadataDTO.getAgentApplicationInstallationId()) == null) ? 0 : agentApplicationInstallationId.intValue());
            if (metadataDTO != null && (deviceApplicationInstallationId = metadataDTO.getDeviceApplicationInstallationId()) != null) {
                iIntValue = deviceApplicationInstallationId.intValue();
            }
            String strValueOf2 = String.valueOf(iIntValue);
            this.f120258b = jVar;
            this.f120257a = 1;
            obj = g0.d(this.f120260d, strValueOf, strValueOf2, this);
        } else {
            vVar = null;
            this.f120258b = null;
            this.f120257a = 2;
        }
        return aVar;
        vVar = (nr.v) obj;
        this.f120258b = null;
        this.f120257a = 2;
    }
}

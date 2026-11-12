package po2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.TransitCardOperationFlowBuilder$launchSyncPolling$1", f = "TransitCardOperationFlowBuilder.kt", l = {242, 245}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f139376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139377b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k0<Object> k0Var, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f139377b = k0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s0(this.f139377b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r3.b(r8, r9) == r0) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ms2.d dVarG;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f139376a;
        k0<Object> k0Var = this.f139377b;
        if (i14 != 0) {
            if (i14 == 1) {
                try {
                    o13.r.b(obj);
                } catch (Throwable th3) {
                    this.f139376a = 2;
                }
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
        while (!k0Var.f139265h) {
            ps2.w wVar = ps2.w.f140538a;
            long j8 = k0Var.f139260c;
            is2.b bVar = is2.b.FITPAY;
            wVar.getClass();
            ps2.n nVarI = ps2.w.i(j8);
            if (nVarI == null) {
                dVarG = null;
            } else {
                dVarG = nVarI.g(bVar);
                if (!(dVarG != null ? dVarG instanceof zn2.t : true)) {
                    dVarG = null;
                }
            }
            zn2.t tVar = dVarG instanceof zn2.t ? (zn2.t) dVarG : null;
            if (tVar != null) {
                tVar.m();
            } else {
                k0.f139257k.info("Cannot find NewFitPayDeviceServiceProvider when launchSyncPolling");
                Unit unit = Unit.INSTANCE;
            }
            long j14 = k0Var.f139259b;
            this.f139376a = 1;
            if (o53.m0.b(j14, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}

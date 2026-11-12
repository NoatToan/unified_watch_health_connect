package bo2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$checkProviderStatusAndSetupIfNeeded$2", f = "AlipayAppletInstallationViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f19264b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f19264b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a enumC1069a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19263a;
        if (i14 == 0) {
            r.b(obj);
            e.a aVar2 = e.f19250d;
            e eVar = this.f19264b;
            if (eVar.C4().f205983e) {
                e.f19250d.f19254a.a().debug("setup complete");
                enumC1069a = com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE;
            } else {
                z0 z0VarC4 = eVar.C4();
                this.f19263a = 1;
                obj = z0VarC4.r(false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (enumC1069a == com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE) {
                return Unit.INSTANCE;
            }
            kg.f.n("Cannot setup provider for Alipay applet installation");
            return null;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        if (((Boolean) obj).booleanValue()) {
            e.f19250d.f19254a.a().debug("setup complete");
            enumC1069a = com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE;
        } else {
            aq2.b.f12463a.getClass();
            if (aq2.b.f12464b) {
                e.f19250d.f19254a.a().debug("fitPay API is under maintenance");
                enumC1069a = com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.UNDER_MAINTENANCE;
            } else {
                e.f19250d.f19254a.a().debug("setup failed");
                enumC1069a = com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_FAILED;
            }
        }
        if (enumC1069a == com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE) {
            return Unit.INSTANCE;
        }
        kg.f.n("Cannot setup provider for Alipay applet installation");
        return null;
    }
}

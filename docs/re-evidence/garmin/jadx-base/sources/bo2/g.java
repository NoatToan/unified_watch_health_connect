package bo2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$checkFitPayAccountRequiredAndCreateIfNeeded$2", f = "AlipayAppletInstallationViewModel.kt", l = {102}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f19262b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f19262b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19261a;
        e eVar = this.f19262b;
        if (i14 == 0) {
            r.b(obj);
            e.a aVar2 = e.f19250d;
            if (eVar.C4().f205979a.s() instanceof sn2.a.C3030a) {
                return Unit.INSTANCE;
            }
            g1 g1Var = eVar.C4().f205979a;
            this.f19261a = 1;
            obj = g1Var.m(true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            kg.f.n("Create FitPay account failed");
            return null;
        }
        e.a aVar3 = e.f19250d;
        eVar.C4().s();
        return Unit.INSTANCE;
    }
}

package bo2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$createOwnerData$2", f = "AlipayAppletInstallationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f19265a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f19265a = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f19265a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        w wVar = w.f140538a;
        e.a aVar2 = e.f19250d;
        long jB4 = this.f19265a.B4();
        wVar.getClass();
        ps2.n nVarI = w.i(jB4);
        if (nVarI == null) {
            kg.f.n("Failed to get PayDevice for creating owner data");
            return null;
        }
        ps2.e eVar = new ps2.e(nVarI, 2);
        int i14 = w03.b.f181178a;
        new z03.c(eVar).e();
        return Unit.INSTANCE;
    }
}

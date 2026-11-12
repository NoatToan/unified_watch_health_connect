package ki1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$sendCancelFindMyBand$1", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f104898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l lVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f104898b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f104898b, dVar);
        pVar.f104897a = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        b0 b0Var = (b0) this.f104897a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "FindMyDeviceViewModel", "[sendCancelFindMyBand] cancelling find my band");
        l lVar = this.f104898b;
        p2 p2Var = lVar.f104868q;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.C2009b.f104821a));
        fi1.a aVar3 = (fi1.a) lVar.f104860i.getValue();
        ii1.k kVar = lVar.f104857f;
        String str = aVar3.f71765e;
        String str2 = aVar3.f71764d;
        o oVar = new o(b0Var, 0);
        o oVar2 = new o(b0Var, 1);
        kVar.getClass();
        str.getClass();
        str2.getClass();
        xt2.a aVarA = kVar.f93786a.a(str);
        if (aVarA == null) {
            String strConcat = "FindMyWatchDataHandler is null for macAddress: ".concat(str);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "SendCancelFindMyBandUseCase", strConcat);
            oVar2.invoke();
        } else {
            aVarA.c(new ii1.j(oVar2, oVar));
        }
        return Unit.INSTANCE;
    }
}

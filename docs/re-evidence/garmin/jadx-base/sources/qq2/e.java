package qq2;

import com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import w2.a0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailPresenter$onSetExpressTransitConfirmed$1", f = "RabbitCardDetailPresenter.kt", l = {117}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f146079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.rabbit.ui.b f146080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.feature.garminpay.providers.rabbit.ui.b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f146080c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f146080c, dVar);
        eVar.f146079b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146078a;
        com.garmin.feature.garminpay.providers.rabbit.ui.b bVar2 = this.f146080c;
        try {
            if (i14 == 0) {
                r.b(obj);
                int i15 = q.f128596b;
                IRabbitCardDetailModel iRabbitCardDetailModelF0 = bVar2.f0();
                this.f146079b = null;
                this.f146078a = 1;
                if (iRabbitCardDetailModelF0.i0(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            bVar = Unit.INSTANCE;
            int i16 = q.f128596b;
        } catch (Throwable th3) {
            int i17 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            String strI = a0.i(bVar2.f0().getDevice());
            bVar2.f0().getDevice().getUnitID();
            com.garmin.feature.garminpay.providers.rabbit.ui.b.h0(bVar2, thB, strI);
        }
        return Unit.INSTANCE;
    }
}

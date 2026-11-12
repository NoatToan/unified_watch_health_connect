package jr2;

import e23.p;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class h extends q implements p<ps2.n, t13.d<? super Unit>, Object> {
    public h(Object obj) {
        super(2, obj, kr2.h.class, "expertInitializeChipForFelica", "expertInitializeChipForFelica(Lcom/garmin/garminpay/wallet/DeviceWallet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // e23.p
    public final Object invoke(ps2.n nVar, t13.d<? super Unit> dVar) throws Throwable {
        ((kr2.h) this.receiver).getClass();
        Object objE0 = ge1.b.e0(s0.f129406a, new kr2.j(nVar, null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }
}

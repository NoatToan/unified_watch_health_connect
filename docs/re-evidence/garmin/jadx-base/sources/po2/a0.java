package po2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException;
import java.util.concurrent.TimeoutException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$shiftOutCard$1", f = "SnowballCardDetailPresenter.kt", l = {304}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f139069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.snowball.ui.d f139070b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$shiftOutCard$1$1", f = "SnowballCardDetailPresenter.kt", l = {305}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.snowball.ui.d f139072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f139072b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f139072b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139071a;
            if (i14 == 0) {
                o13.r.b(obj);
                m mVar = (m) this.f139072b.f0();
                this.f139071a = 1;
                if (mVar.X(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar, t13.d<? super a0> dVar2) {
        super(2, dVar2);
        this.f139070b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f139070b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f139069a;
        com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar = this.f139070b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.d.f51273c.trace("shiftOutCard()");
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).S5(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).getF52032a().getString(R.string.wallet_transferring_card), ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).getF52032a().getString(R.string.wallet_dont_disconnect_device));
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).f1();
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(dVar, null);
                this.f139069a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).h6(((m) dVar.f0()).getDevice().getUnitID(), ((m) dVar.f0()).d());
        } catch (Throwable th3) {
            try {
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.d.f51273c.warn("Shift out card failed", (Throwable) th3);
                if (th3 instanceof MaintenanceException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).c2(new o(4));
                } else if (th3 instanceof ProviderErrorCodeException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).d8(new x(dVar, 25), th3.getErrorCode());
                } else if (th3 instanceof TimeoutException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).B5(new x(dVar, 26), ((m) dVar.f0()).d());
                } else if (th3 instanceof NfcTransferCoroutineException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).h4(new x(dVar, 27), w2.a0.i(((m) dVar.f0()).getDevice()));
                } else {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).d8(new x(dVar, 28), null);
                }
            } finally {
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).T4();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
            }
        }
        return Unit.INSTANCE;
    }
}

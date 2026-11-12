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
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$removeCard$1", f = "SnowballCardDetailPresenter.kt", l = {361}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f139490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.snowball.ui.d f139491b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$removeCard$1$1", f = "SnowballCardDetailPresenter.kt", l = {362}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.snowball.ui.d f139493b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f139493b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f139493b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139492a;
            if (i14 == 0) {
                o13.r.b(obj);
                m mVar = (m) this.f139493b.f0();
                this.f139492a = 1;
                if (mVar.e0(this) == aVar) {
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
    public z(com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar, t13.d<? super z> dVar2) {
        super(2, dVar2);
        this.f139491b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f139491b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f139490a;
        com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar = this.f139491b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.d.f51273c.trace("removeCard()");
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).S5(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).getF52032a().getString(R.string.wallet_deleting_card), ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).getF52032a().getString(R.string.wallet_dont_disconnect_device));
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).f1();
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(dVar, null);
                this.f139490a = 1;
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
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).t4(((m) dVar.f0()).getDevice().getUnitID(), ((m) dVar.f0()).d());
        } catch (Throwable th3) {
            try {
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.d.f51273c.warn("Remove card failed", (Throwable) th3);
                if (th3 instanceof MaintenanceException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c2(new x(dVar, 20));
                } else if (th3 instanceof ProviderErrorCodeException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).Z2(new x(dVar, 21), th3.getErrorCode());
                } else if (th3 instanceof TimeoutException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).B5(new x(dVar, 22), ((m) dVar.f0()).d());
                } else if (th3 instanceof NfcTransferCoroutineException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).h4(new x(dVar, 23), w2.a0.i(((m) dVar.f0()).getDevice()));
                } else {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).Z2(new x(dVar, 24), null);
                }
            } finally {
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).T4();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
            }
        }
        return Unit.INSTANCE;
    }
}

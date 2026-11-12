package vn2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import com.garmin.feature.garminpay.providers.felica.exception.HasBeenPunchedException;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ty1.g2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvn2/b0;", "Lsy2/b;", "Lvn2/z0;", "Lcom/garmin/feature/garminpay/providers/felica/ui/b;", "Lvn2/a1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends sy2.b<z0, com.garmin.feature.garminpay.providers.felica.ui.b> implements a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f178864c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178865a;

        static {
            int[] iArr = new int[tn2.y0.a.values().length];
            try {
                iArr[tn2.y0.a.NEED_RECOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tn2.y0.a.NEED_DELETION_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tn2.y0.a.NEED_REFUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tn2.y0.a.NEED_DELETION_AND_CALL_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[tn2.y0.a.NEED_CALL_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f178865a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Long, Unit> {
        public c(Object obj) {
            super(1, obj, b0.class, "showDeleteLongWaitingMessage", "showDeleteLongWaitingMessage(J)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Long l14) {
            long jLongValue = l14.longValue();
            b0 b0Var = (b0) this.receiver;
            Logger logger = b0.f178864c;
            b0Var.l0(R.string.wallet_deleting_card, jLongValue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<Long, Unit> {
        public d(Object obj) {
            super(1, obj, b0.class, "showRecoverLongWaitingMessage", "showRecoverLongWaitingMessage(J)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Long l14) {
            long jLongValue = l14.longValue();
            b0 b0Var = (b0) this.receiver;
            Logger logger = b0.f178864c;
            b0Var.l0(R.string.wallet_charging_your_card, jLongValue);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f178864c = gt2.b.f79005a.h("PAY#FN#FNCardDetailPresenter");
    }

    @Override // vn2.a1
    @SuppressLint({"CheckResult"})
    public final void A(Activity activity) {
        f178864c.trace("onShowMoreTransactionsClicked()");
        f0().t0().j(l13.a.f108327b).g(r03.a.a()).h(new y(new a0(this, 1), 14), new y(new a0(this, 2), 15));
    }

    @Override // vn2.a1
    @SuppressLint({"CheckResult"})
    public final void I(FelicaCardDetailActivity felicaCardDetailActivity) {
        Logger logger = f178864c;
        logger.trace("onTopUpClicked()");
        com.garmin.feature.garminpay.providers.felica.ui.b view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        if (f0().c()) {
            logger.trace("continueToMaintenanceAndGooglePayCheck()");
            f0().e(tn2.f0.a.TOPUP).d(f0().i(felicaCardDetailActivity)).k(l13.a.f108327b).h(r03.a.a()).i(new h(new g2(18, this, felicaCardDetailActivity), 27), new v(this, 0));
            return;
        }
        logger.trace("onTopUpClicked():device disconnected");
        getView().hideProgressOverlay();
        getView().u1(new b1(7), f0().getDeviceUnitId(), f0().getDeviceName());
    }

    @Override // vn2.a1
    public final void L() {
        f178864c.trace("onCallServiceCenterClicked()");
        getView().call();
    }

    @Override // vn2.a1
    public final void O() {
        f178864c.trace("onTermsAndConditionsClicked()");
        getView().T8("https://www.jreast.co.jp/mobilesuica/wearablesuica/index.html");
    }

    @Override // vn2.a1
    public final void P() {
        Logger logger = f178864c;
        logger.trace("onSetPasscodeSuccessfully()");
        logger.trace("addMetadataToDevice()");
        getView().U5(R.string.wallet_recovering_card);
        u uVar = new u(this, 0);
        int i14 = w03.b.f181178a;
        new e13.b(uVar).j(l13.a.f108327b).g(r03.a.a()).h(new h(new t(this, 4), 24), new h(new t(this, 5), 26));
    }

    @Override // vn2.a1
    public final void Q() {
        getView().k6(f0().getDeviceUnitId(), f0().getCid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vn2.a1
    @SuppressLint({"CheckResult"})
    public final void W(Intent intent) {
        intent.getClass();
        f178864c.trace("onTopUpSuccessfully()");
        int intExtra = intent.getIntExtra("extras.key.topup.amount", 0);
        com.garmin.feature.garminpay.providers.felica.ui.b view2 = getView();
        tn2.e eVar = new tn2.e(null, 1, 0 == true ? 1 : 0);
        String str = eVar.f12684a.format(Integer.valueOf(intExtra));
        str.getClass();
        view2.s7(w5.r.v(R.string.wallet_message_recharge_success, str));
        f0().f().j(l13.a.f108327b).g(r03.a.a()).h(new y(new t(this, 15), 5), new y(new vb1.d(24), 12));
    }

    @Override // vn2.a1
    @SuppressLint({"CheckResult"})
    public final void X(FelicaCardDetailActivity felicaCardDetailActivity) {
        f178864c.trace("onExportTransactionHistoryClicked()");
        j22.b.f96736a.getClass();
        int i14 = 1;
        if (!j22.b.d()) {
            j22.b.x(felicaCardDetailActivity, 1, j22.a.f96722k);
            return;
        }
        com.garmin.feature.garminpay.providers.felica.ui.b view2 = getView();
        int i15 = vq2.e.f179461z0;
        view2.S5(null, null);
        f0().e(tn2.f0.a.GET_USAGE_HISTORY).c(f0().o0()).j(l13.a.f108328c).g(r03.a.a()).h(new y(new a0(this, 3), 16), new h(new t(this, i14), 21));
    }

    @Override // vn2.a1
    @SuppressLint({"CheckResult"})
    public final void b() {
        f178864c.trace("onViewResume()");
        com.garmin.feature.garminpay.providers.felica.ui.b view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        int i15 = 0;
        f0().D(false).j(l13.a.f108327b).g(r03.a.a()).h(new h(new t(this, i15), 25), new y(new t(this, 8), i15));
    }

    @SuppressLint({"CheckResult"})
    public final void g0(z0.e eVar) {
        f178864c.trace("doRemoveCard():".concat(eVar.getClass().getSimpleName()));
        getView().S5(w5.r.u(R.string.wallet_deleting_card), w5.r.u(R.string.wallet_dont_disconnect_device));
        getView().h();
        getView().j();
        u uVar = new u(this, 1);
        int i14 = w03.b.f181178a;
        new e13.b(uVar).j(l13.a.f108327b).g(r03.a.a()).h(new y(new w(eVar, this, 3), 8), new y(new t(this, 25), 9));
    }

    public final void h0(Throwable th3) {
        Logger logger = f178864c;
        logger.trace("handleRefundExceptions()", th3);
        if (th3 instanceof DeviceNotConnectedException) {
            getView().u1(new b1(7), f0().getDeviceUnitId(), f0().getDeviceName());
        } else if (th3 instanceof ServerInMaintenanceException) {
            ServerInMaintenanceException serverInMaintenanceException = (ServerInMaintenanceException) th3;
            getView().Q0(tn2.f0.a.REFUND, serverInMaintenanceException.getStartTime(), serverInMaintenanceException.getEndTime(), new ya0.j(12));
        } else if (!(th3 instanceof HasBeenPunchedException)) {
            logger.error("Unhandled exception!: ", th3);
            getView().c();
        } else {
            com.garmin.feature.garminpay.providers.felica.ui.b view2 = getView();
            int i14 = yn2.b.G0;
            view2.C1(new ya1.h(27));
        }
    }

    public final void i0(z0.e eVar) {
        f178864c.trace("handleRefundStatus():".concat(eVar.getClass().getSimpleName()));
        if ((eVar instanceof z0.e.c) || (eVar instanceof z0.e.a)) {
            if (eVar.f178979a <= 0) {
                getView().Z5(new w(this, eVar, 0));
                return;
            } else {
                getView().Z5(new w(this, eVar, 1));
                return;
            }
        }
        if (eVar instanceof z0.e.b) {
            getView().Z5(new w(eVar, this, 2));
        } else {
            lc.u0.r();
        }
    }

    public final void j0(Throwable th3, e23.l<? super String, Unit> lVar) {
        f178864c.trace("handleRemoveFailed()", th3);
        if (th3 instanceof DeviceNotConnectedException) {
            com.garmin.feature.garminpay.providers.felica.ui.b view2 = getView();
            String deviceName = f0().getDeviceName();
            view2.u1(new t(this, 13), f0().getDeviceUnitId(), deviceName);
            return;
        }
        if (th3 instanceof HasBeenPunchedException) {
            getView().C1(new t(this, 14));
            return;
        }
        if (!(th3 instanceof FNServerIncorrectResponseException)) {
            lVar.invoke("");
            return;
        }
        FNServerIncorrectResponseException fNServerIncorrectResponseException = (FNServerIncorrectResponseException) th3;
        if (fNServerIncorrectResponseException.isServerInUrgentMaintenance()) {
            getView().e2(new t(this, 16));
        } else if (fNServerIncorrectResponseException.isExpectedFNServerError()) {
            lVar.invoke(fNServerIncorrectResponseException.getFNServerErrorMessage());
        } else {
            lVar.invoke("");
        }
    }

    @SuppressLint({"CheckResult"})
    public final void k0(tn2.y0.c cVar) {
        Logger logger = f178864c;
        logger.trace("handleSyncResult()");
        tn2.y0.a aVar = cVar.f165748c;
        int i14 = aVar == null ? -1 : b.f178865a[aVar.ordinal()];
        if (i14 == -1) {
            if (cVar.f165747b) {
                logger.trace("handleSyncResult():NEED_METADATA");
                getView().d1(f0().getDeviceUnitId(), f0().getDeviceName());
                return;
            } else {
                logger.trace("getCardDetailAndShowDetail()");
                f0().q().j(l13.a.f108327b).g(r03.a.a()).h(new y(new t(this, 19), 3), new y(new t(this, 20), 4));
                return;
            }
        }
        if (i14 == 1) {
            logger.trace("handleSyncResult():NEED_RECOVERY");
            getView().U5(R.string.wallet_recovering_card);
            getView().h();
            getView().j();
            f0().k0(new d(this)).c(f0().D(true)).j(l13.a.f108327b).g(r03.a.a()).h(new h(new t(this, 9), 28), new h(new g2(19, this, cVar), 29));
            return;
        }
        if (i14 == 2) {
            logger.trace("handleSyncResult():NEED_DELETION_ONLY");
            x xVar = new x(this, 0);
            x xVar2 = new x(this, 1);
            logger.trace("needToRemoveCardForErrorHandling()");
            getView().Z5(new tn2.s0(this, 16, xVar, xVar2));
            return;
        }
        if (i14 == 3 || i14 == 4) {
            logger.trace("handleSyncResult():NEED_REFUND,NEED_DELETION_AND_CALL_CENTER");
            ug2.h hVar = new ug2.h(28, cVar, this);
            x xVar3 = new x(this, 2);
            logger.trace("needToRemoveCardForErrorHandling()");
            getView().Z5(new tn2.s0(this, 16, hVar, xVar3));
            return;
        }
        if (i14 != 5) {
            lc.u0.r();
        } else {
            logger.trace("handleSyncResult():NEED_CALL_CENTER");
            getView().C3(R.string.title_error_occurred, w5.r.v(R.string.wallet_suica_message_error_contact_support_center, "0492679114"), "0492679114", R.string.lbl_cancel, new t(this, 10));
        }
    }

    public final void l0(int i14, long j8) {
        getView().S5(w5.r.u(i14), w5.r.v(R.string.wallet_long_waiting_message, Integer.valueOf((int) Math.ceil(j8 / 60000.0d))));
    }

    @Override // vn2.a1
    @SuppressLint({"CheckResult"})
    public final void q() {
        f178864c.trace("onRemoveCardClicked()");
        com.garmin.feature.garminpay.providers.felica.ui.b view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        u uVar = new u(this, 1);
        int i15 = w03.b.f181178a;
        new e13.b(uVar).j(l13.a.f108327b).g(r03.a.a()).h(new h(new t(this, 2), 22), new h(new t(this, 3), 23));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvn2/b0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

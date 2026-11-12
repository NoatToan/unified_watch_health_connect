package vn2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.Editable;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvn2/k0;", "Lsy2/b;", "Lvn2/c1;", "Lvn2/e1;", "Lvn2/d1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends sy2.b<c1, e1> implements d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f178905d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DecimalFormat f178906c = new DecimalFormat("###,###,###");

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Long, Unit> {
        public b(Object obj) {
            super(1, obj, k0.class, "showTopUpLongWaitingMessage", "showTopUpLongWaitingMessage(J)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Long l14) {
            long jLongValue = l14.longValue();
            k0 k0Var = (k0) this.receiver;
            Logger logger = k0.f178905d;
            k0Var.getView().S5(w5.r.u(R.string.wallet_charging_your_card), w5.r.v(R.string.wallet_long_waiting_message, Integer.valueOf((int) Math.ceil(jLongValue / 60000.0d))));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f178905d = gt2.b.f79005a.h("PAY#FN#FelicaTopUpPresenter");
    }

    @Override // yn2.c
    public final void U(Throwable th3) {
        th3.getClass();
        f178905d.error("Google Pay Failed: ", th3);
        getView().i9(f0().getGarminJpPhoneNumber(), new j0(this, 0));
        getView().hideProgressOverlay();
    }

    @Override // sy2.d
    @SuppressLint({"CheckResult"})
    public final void a0() {
        f178905d.trace("onViewCreated");
        f0().f().j(l13.a.f108327b).g(r03.a.a()).h(new y(new h0(this, 2), 22), new y(new h0(this, 3), 23));
    }

    @Override // yn2.c
    @SuppressLint({"CheckResult"})
    public final c g(JSONObject jSONObject) {
        f178905d.trace("onPaymentSuccess()");
        com.google.firebase.remoteconfig.b bVar = new com.google.firebase.remoteconfig.b(9, this, jSONObject);
        int i14 = w03.b.f181178a;
        z03.m mVarH = new z03.d(bVar).k(l13.a.f108327b).h(r03.a.a());
        y yVar = new y(new h0(this, 7), 20);
        w03.a.d dVar = w03.a.f181172c;
        w03.a.c cVar = w03.a.f181171b;
        z03.n nVarF = mVarH.f(yVar, dVar, cVar, cVar, cVar, cVar);
        final int i15 = 0;
        final int i16 = 1;
        new z03.e(nVarF, new u03.a(this) { // from class: vn2.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f178898b;

            {
                this.f178898b = this;
            }

            @Override // u03.a
            public final void run() {
                int i17 = i15;
                k0 k0Var = this.f178898b;
                switch (i17) {
                    case 0:
                        Logger logger = k0.f178905d;
                        k0Var.getView().hideProgressOverlay();
                        k0Var.getView().E4(R.string.wallet_top_up);
                        k0Var.getView().e();
                        k0Var.getView().i();
                        break;
                    default:
                        Logger logger2 = k0.f178905d;
                        e1 view2 = k0Var.getView();
                        Intent intent = new Intent();
                        intent.putExtra("extras.key.topup.amount", k0Var.f0().getChargingAmount());
                        Unit unit = Unit.INSTANCE;
                        view2.q4(-1, intent);
                        break;
                }
            }
        }).i(new y(new h0(this, 1), 21), new u03.a(this) { // from class: vn2.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f178898b;

            {
                this.f178898b = this;
            }

            @Override // u03.a
            public final void run() {
                int i17 = i16;
                k0 k0Var = this.f178898b;
                switch (i17) {
                    case 0:
                        Logger logger = k0.f178905d;
                        k0Var.getView().hideProgressOverlay();
                        k0Var.getView().E4(R.string.wallet_top_up);
                        k0Var.getView().e();
                        k0Var.getView().i();
                        break;
                    default:
                        Logger logger2 = k0.f178905d;
                        e1 view2 = k0Var.getView();
                        Intent intent = new Intent();
                        intent.putExtra("extras.key.topup.amount", k0Var.f0().getChargingAmount());
                        Unit unit = Unit.INSTANCE;
                        view2.q4(-1, intent);
                        break;
                }
            }
        });
        return c.f178867a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vn2.d1
    @SuppressLint({"CheckResult"})
    public final c l(Editable editable) {
        DecimalFormat decimalFormat = this.f178906c;
        try {
            String string = editable.toString();
            if (d53.w.J(string)) {
                e1 view2 = getView();
                T tC = f0().j().j(l13.a.f108327b).c();
                tC.getClass();
                view2.P6(((Number) tC).intValue());
                getView().c0();
                return c.f178867a;
            }
            Number number = decimalFormat.parse(string);
            if (number == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue = number.intValue();
            String str = decimalFormat.format(Integer.valueOf(iIntValue));
            if (!p005kotlin.jvm.internal.s.g(str, string)) {
                editable.replace(0, editable.length(), str);
            }
            f0().N(iIntValue).j(l13.a.f108327b).g(r03.a.a()).h(new y(new ap.b(this, iIntValue, 19), 26), new y(new vb1.d(28), 27));
            return c.f178867a;
        } catch (Throwable unused) {
            f178905d.trace("Input other error:" + ((Object) editable));
            getView().x1(w5.r.u(R.string.wallet_error_hint_half_width_number_only));
        }
    }

    @Override // vn2.d1
    @SuppressLint({"CheckResult"})
    public final c m(String str) {
        str.getClass();
        Logger logger = f178905d;
        logger.trace("onGooglePayClicked");
        getView().z2();
        try {
            if (d53.w.J(str)) {
                logger.trace("onGooglePayClicked:inputEmpty");
                getView().R6();
                getView().Z0();
                return c.f178867a;
            }
            Number number = this.f178906c.parse(str);
            if (number == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            f0().N(number.intValue()).j(l13.a.f108327b).g(r03.a.a()).h(new y(new h0(this, 0), 24), new y(new h0(this, 6), 25));
            return c.f178867a;
        } catch (Throwable th3) {
            logger.trace("onGooglePayClicked:exception - " + th3);
            getView().J3(new b1(5));
            getView().Z0();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvn2/k0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package vn2;

import android.annotation.SuppressLint;
import android.text.Editable;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvn2/m;", "Lsy2/b;", "Lvn2/w0;", "Lvn2/y0;", "Lvn2/x0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends sy2.b<w0, y0> implements x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f178912c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178913a;

        static {
            int[] iArr = new int[xn2.z.a.values().length];
            try {
                iArr[xn2.z.a.JR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xn2.z.a.Garmin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f178913a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f178912c = gt2.b.f79005a.h("PAY#FN#FelicaAddCardPresenter");
    }

    @Override // xn2.z
    public final void E(xn2.z.a aVar) {
        aVar.getClass();
        f178912c.trace("onDeclineClicked()");
        getView().c();
    }

    @Override // xn2.w
    public final void J(Editable editable, Editable editable2, DateTime dateTime, pn2.u uVar, Editable editable3) {
        Logger logger = f178912c;
        logger.trace("onNextStepClicked()");
        if (w2.a0.p(this, editable, editable2, dateTime, uVar, editable3)) {
            logger.trace("There are invalid inputs and they have been processed.");
            return;
        }
        w0 w0VarF0 = f0();
        String string = editable.toString();
        String string2 = editable2.toString();
        String strPrint = DateTimeFormat.forPattern("yyyyMMdd").print(dateTime);
        strPrint.getClass();
        w0VarF0.x0(new pn2.t(string, string2, strPrint, uVar.f138811a, editable3.toString()));
        pn2.t userInfoDto = f0().getUserInfoDto();
        userInfoDto.getClass();
        g0(userInfoDto, true);
    }

    @Override // xn2.a0
    public final void K() {
        f178912c.trace("onGarminPrivacyPolicyClicked()");
        getView().m4(f0().getDeviceRecord());
    }

    @Override // xn2.a0
    public final void R() {
        f178912c.trace("onGarminTermsAndConditionClicked()");
        getView().y3(f0().getDeviceRecord());
    }

    @Override // xn2.c0
    public final void S() {
        getView().E3(f0().getChargingAmount());
    }

    @Override // yn2.c
    public final void U(Throwable th3) {
        f178912c.error("onPaymentFailed", th3);
        getView().i9(f0().getGarminJpPhoneNumber(), new k(this, 0));
    }

    @Override // vn2.x0
    @SuppressLint({"CheckResult"})
    public final void a() {
        getView().t0();
        getView().h();
        getView().j();
        q03.b bVarB0 = f0().B0();
        w0 w0VarF0 = f0();
        pn2.t userInfoDto = f0().getUserInfoDto();
        userInfoDto.getClass();
        String strValueOf = String.valueOf(f0().getChargingAmount());
        String paymentToken = f0().getPaymentToken();
        paymentToken.getClass();
        bVarB0.d(w0VarF0.p(userInfoDto, strValueOf, paymentToken, new j(this, 4))).k(l13.a.f108327b).h(r03.a.a()).i(new h(new j(this, 5), 3), new l(this, 0));
    }

    @Override // sy2.d
    public final void a0() {
        getView().n9();
    }

    @Override // yn2.c
    public final c g(JSONObject jSONObject) {
        try {
            f0().z(jSONObject.getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token"));
            f178912c.trace("onPaymentSuccess()");
            getView().e4();
        } catch (Exception e4) {
            U(e4);
        }
        return c.f178867a;
    }

    @SuppressLint({"CheckResult"})
    public final void g0(pn2.t tVar, boolean z14) {
        e13.p pVarG = f0().s0().j(l13.a.f108327b).g(r03.a.a());
        h hVar = new h(new j(this, 13), 9);
        int i14 = w03.b.f181178a;
        new e13.d(new e13.f(pVarG, hVar), new l(this, 5)).h(new h(new ad0.f(this, tVar, z14, 28), 10), new h(new j(this, 1), 2));
    }

    @Override // xn2.z
    public final void h(xn2.z.a aVar) {
        aVar.getClass();
        f178912c.trace("onContinueClicked():" + aVar.name());
        int i14 = b.f178913a[aVar.ordinal()];
        if (i14 == 1) {
            getView().i6();
        } else if (i14 == 2) {
            getView().V2();
        } else {
            lc.u0.r();
        }
    }

    @Override // xn2.j0
    @SuppressLint({"CheckResult"})
    public final void j() {
        f178912c.trace("onEnteringUserInfo()");
        y0 view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        getView().h();
        getView().j();
        q03.i userInfo = f0().getUserInfo();
        q03.q qVar = l13.a.f108327b;
        userInfo.getClass();
        w03.b.a(qVar, "scheduler is null");
        new b13.i(new b13.j(userInfo, qVar), r03.a.a()).b(new h(new j(this, 0), 4), new h(new j(this, 10), 8), new l(this, 4));
    }

    @Override // xn2.c0
    public final void k(int i14) {
        f178912c.trace("onBalanceOptionSelected()");
        f0().k(i14);
    }

    @Override // vn2.x0
    @SuppressLint({"CheckResult"})
    public final void o() {
        y0 view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        f0().y0().h(l13.a.f108327b).k(r03.a.a()).i(new h(new j(this, 12), 7), new l(this, 3));
    }

    @Override // xn2.d0
    @SuppressLint({"CheckResult"})
    public final void p(hn2.c cVar) {
        f178912c.trace("onNextClicked()");
        f0().i(cVar).k(l13.a.f108327b).h(r03.a.a()).i(new h(new j(this, 7), 6), new l(this, 2));
    }

    @Override // xn2.d0
    @SuppressLint({"CheckResult"})
    public final void x() {
        f178912c.trace("onEnteringProvisionIntroduction()");
        y0 view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        f0().f0().d(f0().e(tn2.f0.a.PROVISION)).k(l13.a.f108327b).h(r03.a.a()).i(new h(new j(this, 6), 5), new l(this, 1));
    }

    @Override // xn2.c0
    public final void y() {
        getView().T2(Integer.valueOf(f0().getChargingAmount()));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvn2/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

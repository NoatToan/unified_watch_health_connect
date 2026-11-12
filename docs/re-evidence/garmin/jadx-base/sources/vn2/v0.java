package vn2;

import android.annotation.SuppressLint;
import android.text.Editable;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvn2/v0;", "Lsy2/b;", "Lvn2/i1;", "Lvn2/k1;", "Lvn2/j1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 extends sy2.b<i1, k1> implements j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f178959c;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f178959c = gt2.b.f79005a.h("PAY#FN#FelicaUpdateUserInfoPresenter");
    }

    @Override // xn2.w
    @SuppressLint({"CheckResult"})
    public final void J(Editable editable, Editable editable2, DateTime dateTime, pn2.u uVar, Editable editable3) {
        Logger logger = f178959c;
        logger.trace("onNextStepClicked()");
        if (w2.a0.p(this, editable, editable2, dateTime, uVar, editable3)) {
            logger.trace("There are invalid inputs and they have been processed.");
            return;
        }
        k1 view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        q03.b bVarX = f0().x(editable.toString(), editable2.toString(), dateTime, uVar, editable3.toString());
        q03.i userInfo = f0().getUserInfo();
        bVarX.getClass();
        w03.b.a(userInfo, "next is null");
        b13.d dVar = new b13.d(userInfo, bVarX);
        q03.q qVar = l13.a.f108327b;
        w03.b.a(qVar, "scheduler is null");
        new b13.i(new b13.j(dVar, qVar), r03.a.a()).b(new t0(new r0(this, 0), 3), new t0(new r0(this, 4), 4), w03.a.f181171b);
    }

    @Override // sy2.d
    @SuppressLint({"CheckResult"})
    public final void a0() {
        f178959c.trace("onMVPReady()");
        k1 view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        q03.i userInfo = f0().getUserInfo();
        q03.q qVar = l13.a.f108327b;
        userInfo.getClass();
        w03.b.a(qVar, "scheduler is null");
        new b13.i(new b13.j(userInfo, qVar), r03.a.a()).b(new t0(new r0(this, 6), 5), new y(new r0(this, 7), 29), new s0(this, 0));
    }

    @Override // xn2.h0
    @SuppressLint({"CheckResult"})
    public final void c() {
        f178959c.trace("onEditClicked()");
        f0().e(tn2.f0.a.UPDATE_USER_INFO).k(l13.a.f108327b).h(r03.a.a()).i(new t0(new r0(this, 1), 0), new s0(this, 1));
    }

    @Override // xn2.w
    @SuppressLint({"CheckResult"})
    public final void n() {
        f178959c.trace("onCancelEditingUserInfo()");
        getView().k7();
    }

    @Override // xn2.k0
    public final void t(String str) {
        f178959c.trace("onVerifyUserIdentity()");
        if (d53.w.z(str, ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).h().f77335a.f204880a, false) && d53.w.z(str, "ticket=", false)) {
            getView().e3();
            getView().e9(f0().o());
        }
    }

    @Override // xn2.h0
    @SuppressLint({"CheckResult"})
    public final void v() {
        f178959c.trace("onSignInDialogConfirmed()");
        k1 view2 = getView();
        int i14 = vq2.e.f179461z0;
        view2.S5(null, null);
        f0().K(getView().getF52032a()).j(l13.a.f108327b).g(r03.a.a()).h(new t0(new r0(this, 2), 1), new t0(new r0(this, 3), 2));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvn2/v0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

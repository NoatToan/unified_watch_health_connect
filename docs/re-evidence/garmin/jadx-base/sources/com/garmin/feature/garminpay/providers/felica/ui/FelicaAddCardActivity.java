package com.garmin.feature.garminpay.providers.felica.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import br2.i;
import br2.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.FitPayTermsAndConditionsWebViewActivity;
import com.garmin.feature.garminpay.ui.privacy.FitPayPrivacyPolicyActivity;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import sy2.g;
import vn2.e;
import vn2.w0;
import vn2.x0;
import vn2.y0;
import wr2.v;
import xy2.n;
import yr2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaAddCardActivity;", "Lhn2/c;", "Lvn2/y0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FelicaAddCardActivity extends hn2.c implements y0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f50949l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f50950m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x0 f50953i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FelicaAddCardActivity f50951g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f50952h = m.b(new vn2.d(this, 0));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f50954j = m.b(new vn2.d(this, 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f50955k = m.b(new vn2.d(this, 2));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/ui/FelicaAddCardActivity$b", "Lbr2/i$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements i.b {
        public b() {
        }

        @Override // br2.i.b
        public final void a() {
            x0 x0Var = FelicaAddCardActivity.this.f50953i;
            if (x0Var != null) {
                x0Var.a();
            } else {
                s.m("presenter");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/ui/FelicaAddCardActivity$c", "Lbr2/j$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements j.b {
        public c() {
        }

        @Override // br2.j.b
        public final void a() {
            x0 x0Var = FelicaAddCardActivity.this.f50953i;
            if (x0Var != null) {
                x0Var.o();
            } else {
                s.m("presenter");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/feature/garminpay/providers/felica/ui/FelicaAddCardActivity$d", "Lwr2/v;", "Landroid/widget/TextView;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements v<TextView> {
        public d() {
        }

        @Override // wr2.v
        public final void x0(View view2) {
            TextView textView = (TextView) view2;
            textView.getClass();
            FelicaAddCardActivity felicaAddCardActivity = FelicaAddCardActivity.this;
            String string = felicaAddCardActivity.getString(R.string.wallet_message_rapid_pass_card_guide);
            string.getClass();
            textView.setText(f.a(new uo1.a(felicaAddCardActivity, 22), string));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f50950m = gt2.b.f79005a.h("PAY#FN#FelicaAddCardActivity");
    }

    @Override // vn2.y0
    public final void A4() {
        f50950m.trace("navigateToGarminTermsAndConditions()");
        runOnUiThread(new vn2.f(this, 1));
    }

    @Override // xn2.g0
    public final void E3(int i14) {
        f50950m.trace("showBalancePickerDialog()");
        runOnUiThread(new e(this, i14, 1));
    }

    @Override // yn2.d
    public final un2.a F5() {
        return (un2.a) this.f50952h.getValue();
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final hn2.c getF52032a() {
        return this.f50951g;
    }

    @Override // yn2.d
    public final void T2(Integer num) {
        f50950m.trace("navigateToGooglePay(), amount = " + num);
        super.T2(num);
    }

    @Override // vn2.y0
    public final void V2() {
        f50950m.trace("navigateToJRTermsAndConditions()");
        runOnUiThread(new vn2.f(this, 2));
    }

    @Override // sy2.e
    public final void a(x0 x0Var) {
        x0 x0Var2 = x0Var;
        x0Var2.getClass();
        this.f50953i = x0Var2;
    }

    @Override // sy2.e
    public final x0 b() {
        x0 x0Var = this.f50953i;
        if (x0Var != null) {
            return x0Var;
        }
        s.m("presenter");
        throw null;
    }

    @Override // vn2.y0
    public final void b7(int[] iArr, pn2.t tVar, boolean z14) {
        iArr.getClass();
        tVar.getClass();
        f50950m.trace("navigateToProvision()");
        runOnUiThread(new cd0.v(this, z14, iArr, 5));
    }

    @Override // z6.e, vn2.y0
    public final void c() {
        f50950m.trace("finishView()");
        runOnUiThread(new vn2.f(this, 4));
    }

    @Override // vn2.y0
    public final void e4() {
        f50950m.trace("navigateToDownloadingCard()");
        runOnUiThread(new vn2.f(this, 6));
    }

    @Override // vn2.y0
    public final void h() {
        f50950m.trace("disablePhysicalBackButton()");
        X9(false);
    }

    @Override // vn2.y0
    public final void i() {
        f50950m.trace("enablePhysicalBackButton()");
        X9(true);
    }

    @Override // vn2.y0
    public final void i6() {
        f50950m.trace("navigateToUserProvisionInfo()");
        runOnUiThread(new vn2.f(this, 3));
    }

    @Override // xn2.y
    public final void k0() {
        f50950m.trace("clearAllInputError()");
        runOnUiThread(new vn2.f(this, 5));
    }

    @Override // vn2.y0
    public final void l1() {
        f50950m.trace("navigateToSetupExpressTransit()");
        runOnUiThread(new vn2.f(this, 0));
    }

    @Override // vn2.y0
    public final void m4(sd2.f fVar) {
        fVar.getClass();
        f50950m.trace("navigateToGarminPrivacyPolicyWebPage()");
        FitPayPrivacyPolicyActivity.f52141k.getClass();
        Intent intent = new Intent(this, (Class<?>) FitPayPrivacyPolicyActivity.class);
        String string = getString(R.string.txt_privacy_policy);
        string.getClass();
        intent.putExtra("WebPageDataKey", new hr2.a(string, is2.b.FITPAY, fVar, null, 8, null));
        startActivity(intent);
    }

    @Override // vn2.y0
    public final void n9() {
        f50950m.trace("navigateToProvisionIntroduction()");
        runOnUiThread(new vn2.f(this, 7));
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        f50950m.trace("onActivityResult()");
        if (i14 != 51887) {
            super.onActivityResult(i14, i15, intent);
            Unit unit = Unit.INSTANCE;
            return;
        }
        f50950m.trace("onGooglePayLayoutDismiss()");
        x0 x0Var = this.f50953i;
        if (x0Var != null) {
            x0Var.c0(i15, intent);
        } else {
            s.m("presenter");
            throw null;
        }
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        Fragment fragmentG = getSupportFragmentManager().G("PAY#FN#GarminT&CFrag");
        Fragment fragmentG2 = getSupportFragmentManager().G("PAY#FN#JRT&CFrag");
        if ((fragmentG == null || !fragmentG.isVisible()) && (fragmentG2 == null || !fragmentG2.isVisible())) {
            super.onBackPressed();
        } else {
            c();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_simple_frame_layout, hn2.c.a.BACK, "");
        t0 t0Var = s0.f105811a;
        new g(t0Var.b(w0.class), t0Var.b(x0.class), t0Var.b(y0.class)).a(this);
    }

    @Override // xn2.y
    public final void q3(int i14, String str, boolean z14) {
        f50950m.trace("showInputError()");
        runOnUiThread(new vn2.g(this, i14, str, z14, 0));
    }

    @Override // vn2.y0
    public final void s(int i14) {
        f50950m.trace("updateDownloadCardProgress(" + i14 + ")");
        runOnUiThread(new e(this, i14, 0));
    }

    @Override // vn2.y0
    public final void t0() {
        f50950m.trace("acquireWakeLock()");
        ((PowerManager.WakeLock) this.f50954j.getValue()).acquire(180000L);
    }

    @Override // vn2.y0
    public final void w8() {
        f50950m.trace("releaseWakeLock()");
        t tVar = this.f50954j;
        if (((PowerManager.WakeLock) tVar.getValue()).isHeld()) {
            ((PowerManager.WakeLock) tVar.getValue()).release();
        }
    }

    @Override // vn2.y0
    public final void y3(sd2.f fVar) {
        fVar.getClass();
        f50950m.trace("navigateToGarminTermsAndConditionsWebPage()");
        if (((l) zf.b.r()).n()) {
            LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, this, 0, lc2.a.GARMIN_PAY_TERMS_AND_CONDITIONS, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, getString(R.string.garmin_pay_terms), 112);
            return;
        }
        FitPayTermsAndConditionsWebViewActivity.f51545k.getClass();
        Intent intent = new Intent(this, (Class<?>) FitPayTermsAndConditionsWebViewActivity.class);
        String string = getString(R.string.label_terms_and_conditions);
        string.getClass();
        intent.putExtra("WebPageDataKey", new hr2.a(string, is2.b.FITPAY, fVar, null, 8, null));
        startActivity(intent);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaAddCardActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "POWER_LOCK_TAG", "", "POWER_TIMEOUT_IN_MILLI", "J", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaAddCardActivity$a$a;", "Lxy2/m;", "Lvn2/w0;", "", "deviceUnitId", "<init>", "(J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1031a extends xy2.m<w0> {
            public static final Parcelable.Creator<C1031a> CREATOR = new C1032a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f50956a;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1032a implements Parcelable.Creator<C1031a> {
                @Override // android.os.Parcelable.Creator
                public final C1031a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1031a(parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final C1031a[] newArray(int i14) {
                    return new C1031a[i14];
                }
            }

            public C1031a(long j8) {
                this.f50956a = j8;
            }

            @Override // xy2.i
            public final Object b() {
                return new vn2.i(this.f50956a);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeLong(this.f50956a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaAddCardActivity$a$b;", "Lxy2/n;", "Lvn2/x0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends n<x0> {
            public static final Parcelable.Creator<b> CREATOR = new C1033a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1033a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return new b();
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i14) {
                    return new b[i14];
                }
            }

            @Override // xy2.i
            public final Object b() {
                return new vn2.m();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8) {
            Intent intentD = sn.a.d(context, context, FelicaAddCardActivity.class);
            intentD.putExtra("extra.synthesize.model_factory", new C1031a(j8));
            intentD.putExtra("extra.synthesize.presenter_factory", new b());
            return intentD;
        }

        private a() {
        }
    }
}

package com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.z0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundActivity;
import com.nimbusds.jose.jwk.JWKParameterNames;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import po2.l;
import po2.r;
import qw0.y;
import xy2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity;", "Li/c;", "<init>", "()V", "Landroid/view/View;", "unused", "", "showAddCardUI", "(Landroid/view/View;)V", "showTermsAndConditionsUI", "showInitialChargeUI", "showDownloadCardUI", "showRapidPassSetupUI", "showCardDetailUI", "showPhoneNumberUI", "showPNRefundFailedUI", "c", IntegerTokenConverter.CONVERTER_KEY, "f", JWKParameterNames.RSA_EXPONENT, "h", "d", "g", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SnowballUIReviewActivity extends i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51313a = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$b;", "Lxy2/n;", "Lyp2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends n<yp2.b> {
        public static final Parcelable.Creator<b> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
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
            return new yp2.f();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$c;", "Lxy2/n;", "Lpo2/l;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends n<l> {
        public static final Parcelable.Creator<c> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new c();
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        @Override // xy2.i
        public final Object b() {
            return new r();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$d;", "Lxy2/n;", "Lpo2/n;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends n<po2.n> {
        public static final Parcelable.Creator<d> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new d();
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        @Override // xy2.i
        public final Object b() {
            return new com.garmin.feature.garminpay.providers.gpay.snowball.ui.d();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$e;", "Lxy2/n;", "Lpo2/l;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends n<l> {
        public static final Parcelable.Creator<e> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new e();
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        @Override // xy2.i
        public final Object b() {
            return new com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.a();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$f;", "Lxy2/n;", "Lpo2/l;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends n<l> {
        public static final Parcelable.Creator<f> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new f();
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        @Override // xy2.i
        public final Object b() {
            return new com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.b();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$g;", "Lxy2/n;", "Lpo2/l;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends n<l> {
        public static final Parcelable.Creator<g> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new g();
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        @Override // xy2.i
        public final Object b() {
            return new com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.c();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$h;", "Lxy2/n;", "Lpo2/l;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends n<l> {
        public static final Parcelable.Creator<h> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new h();
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i14) {
                return new h[i14];
            }
        }

        @Override // xy2.i
        public final Object b() {
            return new com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.d();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$i;", "Lxy2/n;", "Lpo2/l;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i extends n<l> {
        public static final Parcelable.Creator<i> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new i();
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i14) {
                return new i[i14];
            }
        }

        @Override // xy2.i
        public final Object b() {
            return new com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.e();
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f51314a;

        public j(e23.l lVar) {
            lVar.getClass();
            this.f51314a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51314a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51314a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public final <ActivityType extends Activity & sy2.e<PresenterType>, PresenterType extends sy2.d<?, ?>> Intent O9(k23.d<ActivityType> dVar, n<PresenterType> nVar) {
        qy2.a aVar = qy2.a.f148592a;
        Intent intent = new Intent(this, (Class<?>) dh.b.u(dVar));
        intent.putExtra("extra.synthesize.presenter_factory", nVar);
        qy2.a.a(aVar, intent, 2);
        return intent;
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_snowball_ui_review);
        wr2.e.f186838m.f(this, new j(new y(this, 19)));
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        startActivity(O9(s0.f105811a.b(NewFitPayTransitRefundActivity.class), new b()));
    }

    public final void showAddCardUI(View unused) {
        unused.getClass();
        startActivity(O9(s0.f105811a.b(SnowballAddCardActivity.class), new c()));
    }

    public final void showCardDetailUI(View unused) {
        unused.getClass();
        startActivityForResult(O9(s0.f105811a.b(SnowballCardDetailActivity.class), new d()), 101);
    }

    public final void showDownloadCardUI(View unused) {
        unused.getClass();
        startActivity(O9(s0.f105811a.b(SnowballAddCardActivity.class), new e()));
    }

    public final void showInitialChargeUI(View unused) {
        unused.getClass();
        startActivity(O9(s0.f105811a.b(SnowballAddCardActivity.class), new f()));
    }

    public final void showPNRefundFailedUI(View unused) {
        unused.getClass();
        Toast.makeText(this, "WARNING: mock payload has a hard-coded Snowball device ID", 1).show();
        new go2.b(to2.c.REFUND_FAILED, t0.b(new p(to2.a.EnumC3119a.FITPAY_PAYLOAD.f165868a, "{\n\"refundId\": \"e814b759-c4b9-4a5d-bdba-caae72de6ad9\",\n\"state\": \"ACTION_REQUIRED\",\n\"transitCardId\": \"b36827af-ad28-481c-b28f-63bb5a159f9f\",\n\"userId\": \"388e1ac6-5bb0-49e3-a9b8-fc786c60a02e\",\n\"purchaseId\": null,\n\"providerId\": \"2a3c7bb8-39be-4a50-bd0e-9b75f56434c1\",\n\"productId\": \"f240c97b-439e-4cf2-9335-3478949c952e\",\n\"productName\": \"Beijing T-Union Transit Card\",\n\"operationType\": \"DELETE\",\n\"refundAmount\": \"10.00\",\n\"initiatedBy\": \"CARDHOLDER\",\n\"errorReason\": \"PAYMENT_INFORMATION_INVALID\",\n\"timeToCompleteMs\": null,\n\"timeToFailMs\": 330,\n\"createdTs\": \"2021-06-18T21:27:16+0000\"\n}"))).a(new ro0.g(this, 3));
    }

    public final void showPhoneNumberUI(View unused) {
        unused.getClass();
        startActivity(O9(s0.f105811a.b(SnowballAddCardActivity.class), new g()));
    }

    public final void showRapidPassSetupUI(View unused) {
        unused.getClass();
        startActivity(O9(s0.f105811a.b(SnowballAddCardActivity.class), new h()));
    }

    public final void showTermsAndConditionsUI(View unused) {
        unused.getClass();
        startActivity(O9(s0.f105811a.b(SnowballAddCardActivity.class), new i()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/SnowballUIReviewActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE_REVIEW_SNOWBALL_MANAGE_CARD_GUI", "I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

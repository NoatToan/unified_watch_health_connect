package com.garmin.feature.garminpay.providers.rabbit.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.R;
import hn2.c;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import xy2.m;
import xy2.n;
import yr2.f;
import yr2.g;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/RabbitCardDetailActivity;", "Lhn2/c;", "Lqq2/b;", "<init>", "()V", "Landroid/view/View;", "view", "", "onCallRabbitClicked", "(Landroid/view/View;)V", "onVisitRabbitFAQsClicked", "onDisableOrEnableCardClicked", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RabbitCardDetailActivity extends c implements qq2.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51749j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qq2.a f51750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RabbitCardDetailActivity f51751h = this;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f51752i = f0.w(this);

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final c getF52032a() {
        return this.f51751h;
    }

    @Override // qq2.b
    public final void N6(String str, String str2, String str3) {
        str.getClass();
        ((TextView) findViewById(R.id.call_rabbit)).setText(getString(R.string.wallet_call) + StringUtils.SPACE + getString(R.string.operator_rabbit));
        ((TextView) findViewById(R.id.faq_need_text)).setText(getString(R.string.wallet_visit_provider_faq, getString(R.string.operator_rabbit)));
        ((TextView) findViewById(R.id.card_number)).setText(str);
        ((TextView) findViewById(R.id.device_name)).setText(str2);
        com.bumptech.glide.b.c(this).e(this).l(str3).E((ImageView) findViewById(R.id.device_image));
    }

    @Override // qq2.b
    public final void T3() {
        ((LinearLayout) findViewById(R.id.card_status_section)).setVisibility(8);
    }

    @Override // qq2.b
    public final void Z(boolean z14) {
        TextView textView = (TextView) findViewById(R.id.transactions_title);
        TextView textView2 = (TextView) findViewById(R.id.transactions_description);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        if (!z14) {
            textView.setText(getString(R.string.wallet_more_information));
            textView2.setText(getString(R.string.wallet_rabbit_transaction_instruction_no_app));
        } else {
            textView.setText(getString(R.string.wallet_transactions));
            String string = getString(R.string.wallet_rabbit_transaction_instruction, getString(R.string.wallet_my_rabbit), getString(R.string.wallet_my_rabbit));
            string.getClass();
            textView2.setText(f.a(new qd0.a(this, 23), string));
        }
    }

    @Override // qq2.b
    public final void Z7(String str, boolean z14) {
        if (z14) {
            ((TextView) findViewById(R.id.card_status)).setText(R.string.wallet_disable_card);
            ((TextView) findViewById(R.id.card_status_description)).setText(getString(R.string.message_rabbit_disable_card, str));
            ((LinearLayout) findViewById(R.id.card_description_layout)).setVisibility(8);
        } else {
            ((TextView) findViewById(R.id.card_status)).setText(R.string.wallet_enable_card);
            ((TextView) findViewById(R.id.card_status_description)).setText(getString(R.string.wallet_enable_card_prompt_message, str));
            ((LinearLayout) findViewById(R.id.card_description_layout)).setVisibility(0);
            ((TextView) findViewById(R.id.card_description)).setText(getString(R.string.message_rabbit_card_disabled, str));
        }
    }

    @Override // sy2.e
    public final void a(qq2.a aVar) {
        qq2.a aVar2 = aVar;
        aVar2.getClass();
        this.f51750g = aVar2;
    }

    @Override // sy2.e
    /* JADX INFO: renamed from: ca, reason: merged with bridge method [inline-methods] */
    public final qq2.a b() {
        qq2.a aVar = this.f51750g;
        if (aVar != null) {
            return aVar;
        }
        s.m("presenter");
        throw null;
    }

    @Override // qq2.b
    /* JADX INFO: renamed from: getScope, reason: from getter */
    public final i0 getF51752i() {
        return this.f51752i;
    }

    @Override // qq2.b
    public final void m1() {
        ((LinearLayout) findViewById(R.id.card_status_section)).setVisibility(0);
    }

    public final void onCallRabbitClicked(View view2) {
        view2.getClass();
        b().G();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_rabbit_card_detail, c.a.BACK, getString(R.string.wallet_card_detail));
        View viewFindViewById = findViewById(R.id.card_image);
        viewFindViewById.getClass();
        oq2.b.f133301a.getClass();
        kj0.b.f104940a.getClass();
        j.b((ImageView) viewFindViewById, g.b(kj0.b.a()).concat("/com.garmin.connect.mobile/garmin-pay/image/image_rabbit.png"), 30, 4);
        t0 t0Var = s0.f105811a;
        new sy2.g(t0Var.b(IRabbitCardDetailModel.class), t0Var.b(qq2.a.class), t0Var.b(qq2.b.class)).a(this);
    }

    public final void onDisableOrEnableCardClicked(View view2) {
        view2.getClass();
        b().i();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        b().onResume();
    }

    public final void onVisitRabbitFAQsClicked(View view2) {
        view2.getClass();
        b().u();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/RabbitCardDetailActivity$a;", "", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/RabbitCardDetailActivity$a$a;", "Lxy2/m;", "Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel;", "", "cardNumber", "Lsd2/f;", "device", "<init>", "(Ljava/lang/String;Lsd2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1071a extends m<IRabbitCardDetailModel> {
            public static final Parcelable.Creator<C1071a> CREATOR = new C1072a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f51753a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final sd2.f f51754b;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1072a implements Parcelable.Creator<C1071a> {
                @Override // android.os.Parcelable.Creator
                public final C1071a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1071a(parcel.readString(), (sd2.f) parcel.readParcelable(C1071a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final C1071a[] newArray(int i14) {
                    return new C1071a[i14];
                }
            }

            public C1071a(String str, sd2.f fVar) {
                str.getClass();
                fVar.getClass();
                this.f51753a = str;
                this.f51754b = fVar;
            }

            @Override // xy2.i
            public final Object b() {
                return new com.garmin.feature.garminpay.providers.rabbit.ui.a(this.f51753a, this.f51754b);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f51753a);
                parcel.writeParcelable(this.f51754b, i14);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/RabbitCardDetailActivity$a$b;", "Lxy2/n;", "Lqq2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends n<qq2.a> {
            public static final Parcelable.Creator<b> CREATOR = new C1073a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1073a implements Parcelable.Creator<b> {
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
                return new com.garmin.feature.garminpay.providers.rabbit.ui.b();
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

        private a() {
        }
    }
}

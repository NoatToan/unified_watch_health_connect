package com.garmin.feature.garminpay.providers.gpay.ui.transitrefund;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundActivity;
import d53.w;
import o13.t;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import sy2.g;
import xy2.m;
import xy2.n;
import yp2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/transitrefund/NewFitPayTransitRefundActivity;", "Lhn2/c;", "Lyp2/c;", "<init>", "()V", "Landroid/view/View;", "view", "", "onSubmitClicked", "(Landroid/view/View;)V", "b", "c", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewFitPayTransitRefundActivity extends hn2.c implements yp2.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f51706l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f51707m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yp2.b f51708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NewFitPayTransitRefundActivity f51709h = this;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f51710i = f0.w(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f51711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f51712k;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/transitrefund/NewFitPayTransitRefundActivity$b;", "Lxy2/m;", "Lyp2/a;", "", "cardName", "userId", "refundId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends m<yp2.a> {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51715c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(String str, String str2, String str3) {
            com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
            this.f51713a = str;
            this.f51714b = str2;
            this.f51715c = str3;
        }

        @Override // xy2.i
        public final Object b() {
            return new yp2.e(this.f51713a, this.f51714b, this.f51715c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f51713a);
            parcel.writeString(this.f51714b);
            parcel.writeString(this.f51715c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/transitrefund/NewFitPayTransitRefundActivity$c;", "Lxy2/n;", "Lyp2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends n<yp2.b> {
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
            return new f();
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/transitrefund/NewFitPayTransitRefundActivity$d", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements TextWatcher {
        public d() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002f  */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z14;
            NewFitPayTransitRefundActivity newFitPayTransitRefundActivity = NewFitPayTransitRefundActivity.this;
            Button button = (Button) newFitPayTransitRefundActivity.findViewById(R.id.button_submit);
            if (w.J(String.valueOf(editable))) {
                z14 = false;
            } else {
                a aVar = NewFitPayTransitRefundActivity.f51706l;
                if (w.J(((EditText) newFitPayTransitRefundActivity.f51712k.getValue()).getText().toString())) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
            button.setEnabled(z14);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/transitrefund/NewFitPayTransitRefundActivity$e", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements TextWatcher {
        public e() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002f  */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z14;
            NewFitPayTransitRefundActivity newFitPayTransitRefundActivity = NewFitPayTransitRefundActivity.this;
            Button button = (Button) newFitPayTransitRefundActivity.findViewById(R.id.button_submit);
            if (w.J(String.valueOf(editable))) {
                z14 = false;
            } else {
                a aVar = NewFitPayTransitRefundActivity.f51706l;
                if (w.J(((EditText) newFitPayTransitRefundActivity.f51711j.getValue()).getText().toString())) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
            button.setEnabled(z14);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51707m = gt2.b.f79005a.h("PAY#SB#SnowballRefundFormActivity");
    }

    public NewFitPayTransitRefundActivity() {
        final int i14 = 0;
        this.f51711j = o13.m.b(new e23.a(this) { // from class: yp2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayTransitRefundActivity f198700b;

            {
                this.f198700b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                NewFitPayTransitRefundActivity newFitPayTransitRefundActivity = this.f198700b;
                switch (i15) {
                    case 0:
                        NewFitPayTransitRefundActivity.a aVar = NewFitPayTransitRefundActivity.f51706l;
                        return (EditText) newFitPayTransitRefundActivity.findViewById(R.id.edit_text_account);
                    default:
                        NewFitPayTransitRefundActivity.a aVar2 = NewFitPayTransitRefundActivity.f51706l;
                        return (EditText) newFitPayTransitRefundActivity.findViewById(R.id.edit_text_real_name);
                }
            }
        });
        final int i15 = 1;
        this.f51712k = o13.m.b(new e23.a(this) { // from class: yp2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayTransitRefundActivity f198700b;

            {
                this.f198700b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                NewFitPayTransitRefundActivity newFitPayTransitRefundActivity = this.f198700b;
                switch (i16) {
                    case 0:
                        NewFitPayTransitRefundActivity.a aVar = NewFitPayTransitRefundActivity.f51706l;
                        return (EditText) newFitPayTransitRefundActivity.findViewById(R.id.edit_text_account);
                    default:
                        NewFitPayTransitRefundActivity.a aVar2 = NewFitPayTransitRefundActivity.f51706l;
                        return (EditText) newFitPayTransitRefundActivity.findViewById(R.id.edit_text_real_name);
                }
            }
        });
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final hn2.c getF52032a() {
        return this.f51709h;
    }

    @Override // sy2.e
    public final void a(yp2.b bVar) {
        yp2.b bVar2 = bVar;
        bVar2.getClass();
        this.f51708g = bVar2;
    }

    @Override // sy2.e
    public final yp2.b b() {
        yp2.b bVar = this.f51708g;
        if (bVar != null) {
            return bVar;
        }
        s.m("presenter");
        throw null;
    }

    @Override // z6.e, vn2.y0
    public final void c() {
        finishAndRemoveTask();
    }

    @Override // yp2.c
    /* JADX INFO: renamed from: getScope, reason: from getter */
    public final i0 getF51710i() {
        return this.f51710i;
    }

    @Override // yp2.c
    public final void h5(String str) {
        ((TextView) findViewById(R.id.text_description)).setText(str);
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finishAndRemoveTask();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_new_fitpay_transit_refund_form, hn2.c.a.UP, getString(R.string.wallet_title_refund));
        EditText editText = (EditText) this.f51711j.getValue();
        editText.getClass();
        editText.addTextChangedListener(new d());
        EditText editText2 = (EditText) this.f51712k.getValue();
        editText2.getClass();
        editText2.addTextChangedListener(new e());
        t0 t0Var = s0.f105811a;
        new g(t0Var.b(yp2.a.class), t0Var.b(yp2.b.class), t0Var.b(yp2.c.class)).a(this);
    }

    public final void onSubmitClicked(View view2) {
        view2.getClass();
        f51707m.trace("onSubmitClicked()");
        String string = ((TextView) findViewById(R.id.edit_text_account)).getText().toString();
        String string2 = ((TextView) findViewById(R.id.edit_text_real_name)).getText().toString();
        yp2.b bVar = this.f51708g;
        if (bVar != null) {
            bVar.D(string, string2);
        } else {
            s.m("presenter");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/transitrefund/NewFitPayTransitRefundActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, String str, String str2, String str3) {
            context.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            Intent intent = new Intent(context, (Class<?>) NewFitPayTransitRefundActivity.class);
            intent.putExtra("extra.synthesize.model_factory", new b(str, str2, str3));
            intent.putExtra("extra.synthesize.presenter_factory", new c());
            return intent;
        }

        private a() {
        }
    }
}

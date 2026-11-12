package com.garmin.feature.garminpay.providers.felica.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.textfield.TextInputLayout;
import hn2.c;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import sy2.g;
import tn2.e;
import v.b0;
import vb1.d;
import vc0.v;
import vg1.z0;
import vn2.c1;
import vn2.d1;
import vn2.e1;
import vn2.g0;
import vn2.k0;
import xy2.n;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTopUpActivity;", "Lhn2/c;", "Lvn2/e1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FelicaTopUpActivity extends c implements e1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f50969p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Logger f50970q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f50972h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f50975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextInputLayout f50976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f50977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f50978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f50979o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FelicaTopUpActivity f50971g = this;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f50973i = m.b(new v(this, 11));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f50974j = new e(null, 1, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/ui/FelicaTopUpActivity$b", "Landroid/text/TextWatcher;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f50982a;

        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
            if (this.f50982a) {
                return;
            }
            this.f50982a = true;
            d1 d1Var = FelicaTopUpActivity.this.f50972h;
            if (d1Var == null) {
                s.m("presenter");
                throw null;
            }
            d1Var.l(editable);
            this.f50982a = false;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f50970q = gt2.b.f79005a.h("PAY#FN#FelicaTopUpActivity");
    }

    @Override // vn2.e1
    public final void E4(int i14) {
        f50970q.trace("updateActionBarTitle()");
        String string = getString(i14);
        string.getClass();
        W9(string, c.a.BACK);
    }

    @Override // yn2.d
    public final un2.a F5() {
        return (un2.a) this.f50973i.getValue();
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final c getF52032a() {
        return this.f50971g;
    }

    @Override // vn2.e1
    public final void P6(int i14) {
        f50970q.trace("showCurrentBalance()");
        TextView textView = this.f50978n;
        if (textView == null) {
            s.m("balanceDescriptionView");
            throw null;
        }
        textView.setText(getString(R.string.wallet_current_balance));
        TextView textView2 = this.f50979o;
        if (textView2 != null) {
            textView2.setText(this.f50974j.a(Integer.valueOf(i14)));
        } else {
            s.m("balanceView");
            throw null;
        }
    }

    @Override // vn2.e1
    public final void R6() {
        f50970q.trace("showEmptyTopUpAmountInputErrorDialog()");
        Z5(new d(25));
    }

    @Override // yn2.d
    public final void T2(Integer num) {
        runOnUiThread(new b0(this, 10));
        super.T2(num);
    }

    @Override // vn2.e1
    public final void Z0() {
        f50970q.trace("enableGooglePayButton()");
        View view2 = this.f50977m;
        if (view2 != null) {
            view2.setEnabled(true);
        } else {
            s.m("googlePayView");
            throw null;
        }
    }

    @Override // sy2.e
    public final void a(d1 d1Var) {
        d1 d1Var2 = d1Var;
        d1Var2.getClass();
        this.f50972h = d1Var2;
    }

    @Override // sy2.e
    public final d1 b() {
        d1 d1Var = this.f50972h;
        if (d1Var != null) {
            return d1Var;
        }
        s.m("presenter");
        throw null;
    }

    @Override // vn2.e1
    public final void c0() {
        f50970q.trace("hideAmountWarning()");
        TextInputLayout textInputLayout = this.f50976l;
        if (textInputLayout == null) {
            s.m("topUpAmountView");
            throw null;
        }
        textInputLayout.setError(null);
        TextInputLayout textInputLayout2 = this.f50976l;
        if (textInputLayout2 != null) {
            textInputLayout2.setErrorEnabled(false);
        } else {
            s.m("topUpAmountView");
            throw null;
        }
    }

    @Override // vn2.e1
    public final void e6(int i14, int i15) {
        f50970q.trace("showNewBalance()");
        TextView textView = this.f50978n;
        if (textView == null) {
            s.m("balanceDescriptionView");
            throw null;
        }
        textView.setText(getString(R.string.wallet_new_balance));
        TextView textView2 = this.f50979o;
        if (textView2 == null) {
            s.m("balanceView");
            throw null;
        }
        textView2.setText(this.f50974j.a(Integer.valueOf(i14 + i15)));
    }

    @Override // vn2.e1
    public final void h() {
        f50970q.trace("disablePhysicalBackButton()");
        X9(false);
    }

    @Override // vn2.e1
    public final void i() {
        f50970q.trace("enablePhysicalBackButton()");
        X9(true);
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        f50970q.trace("onActivityResult()");
        if (i14 != 51887) {
            super.onActivityResult(i14, i15, intent);
            Unit unit = Unit.INSTANCE;
            return;
        }
        f50970q.trace("onGooglePayLayoutDismiss()");
        d1 d1Var = this.f50972h;
        if (d1Var == null) {
            s.m("presenter");
            throw null;
        }
        d1Var.c0(i15, intent);
        Z0();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_felica_topup, c.a.BACK, getString(R.string.wallet_top_up));
        View viewFindViewById = findViewById(R.id.suica_image);
        viewFindViewById.getClass();
        this.f50975k = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.top_up_amount);
        viewFindViewById2.getClass();
        this.f50976l = (TextInputLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.google_pay);
        viewFindViewById3.getClass();
        this.f50977m = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.balance_description);
        viewFindViewById4.getClass();
        this.f50978n = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.balance);
        viewFindViewById5.getClass();
        this.f50979o = (TextView) viewFindViewById5;
        ImageView imageView = this.f50975k;
        if (imageView == null) {
            s.m("suicaImageView");
            throw null;
        }
        pn2.a.f138690a.getClass();
        j.b(imageView, pn2.a.f(), 30, 4);
        TextInputLayout textInputLayout = this.f50976l;
        if (textInputLayout == null) {
            s.m("topUpAmountView");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        editText.getClass();
        TextInputLayout textInputLayout2 = this.f50976l;
        if (textInputLayout2 == null) {
            s.m("topUpAmountView");
            throw null;
        }
        String currencySymbol = this.f50974j.getF165547b().getCurrencySymbol();
        currencySymbol.getClass();
        textInputLayout2.setPrefixText(currencySymbol);
        editText.setOnFocusChangeListener(new mu0.c(1));
        editText.addTextChangedListener(new b());
        View view2 = this.f50977m;
        if (view2 == null) {
            s.m("googlePayView");
            throw null;
        }
        view2.setOnClickListener(new z0(this, 2));
        t0 t0Var = s0.f105811a;
        new g(t0Var.b(c1.class), t0Var.b(d1.class), t0Var.b(e1.class)).a(this);
    }

    @Override // vn2.e1
    public final void q4(int i14, Intent intent) {
        f50970q.trace("finishView()");
        if (intent != null) {
            setResult(i14, intent);
        } else {
            setResult(i14);
        }
        finish();
    }

    @Override // vn2.e1
    public final void x1(String str) {
        f50970q.trace("showOtherAmountWarning()");
        TextInputLayout textInputLayout = this.f50976l;
        if (textInputLayout == null) {
            s.m("topUpAmountView");
            throw null;
        }
        textInputLayout.setError(str);
        TextInputLayout textInputLayout2 = this.f50976l;
        if (textInputLayout2 != null) {
            textInputLayout2.setErrorEnabled(true);
        } else {
            s.m("topUpAmountView");
            throw null;
        }
    }

    @Override // vn2.e1
    public final void z2() {
        f50970q.trace("disableGooglePayButton()");
        View view2 = this.f50977m;
        if (view2 != null) {
            view2.setEnabled(false);
        } else {
            s.m("googlePayView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTopUpActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTopUpActivity$a$a;", "Lxy2/m;", "Lvn2/c1;", "", "cId", "", "deviceUnitId", "<init>", "(Ljava/lang/String;J)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1037a extends xy2.m<c1> {
            public static final Parcelable.Creator<C1037a> CREATOR = new C1038a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f50980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f50981b;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1038a implements Parcelable.Creator<C1037a> {
                @Override // android.os.Parcelable.Creator
                public final C1037a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C1037a(parcel.readString(), parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final C1037a[] newArray(int i14) {
                    return new C1037a[i14];
                }
            }

            public C1037a(String str, long j8) {
                str.getClass();
                this.f50980a = str;
                this.f50981b = j8;
            }

            @Override // xy2.i
            public final Object b() {
                return new g0(this.f50980a, this.f50981b);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f50980a);
                parcel.writeLong(this.f50981b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/FelicaTopUpActivity$a$b;", "Lxy2/n;", "Lvn2/d1;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends n<d1> {
            public static final Parcelable.Creator<b> CREATOR = new C1039a();

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1039a implements Parcelable.Creator<b> {
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
                return new k0();
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

        public static Intent a(c cVar, String str, long j8) {
            cVar.getClass();
            str.getClass();
            Intent intent = new Intent(cVar, (Class<?>) FelicaTopUpActivity.class);
            intent.putExtra("extra.synthesize.model_factory", new C1037a(str, j8));
            intent.putExtra("extra.synthesize.presenter_factory", new b());
            return intent;
        }

        private a() {
        }
    }
}

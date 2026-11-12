package so2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import com.google.android.material.textfield.TextInputEditText;
import o72.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lso2/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f160478d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f160479e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SnowballAddCardActivity.j f160480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f160481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f160482c = "";

    static {
        int i14 = gt2.c.f79010a;
        f160479e = gt2.b.f79005a.h("PAY#SB#PhoneNumFrag");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_snowball_phone_number, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f160480a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View viewRequireView = requireView();
        viewRequireView.getClass();
        u6(viewRequireView);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        Logger logger = f160479e;
        if (arguments == null || (string = arguments.getString("extra.card_name")) == null) {
            logger.error("The card name is not passed.");
            return;
        }
        this.f160481b = string;
        hn2.c cVarF = t.F(this);
        if (cVarF == null) {
            logger.error("Failed to cast activity to GarminPayBaseActivity");
            return;
        }
        String string2 = cVarF.getString(R.string.wallet_enter_phone_number);
        string2.getClass();
        cVarF.W9(string2, hn2.c.a.BACK);
        cVarF.X9(true);
        View view3 = getView();
        if (view3 != null) {
            TextView textView = (TextView) view3.findViewById(R.id.text_description);
            String str = this.f160481b;
            if (str == null) {
                s.m("cardName");
                throw null;
            }
            textView.setText(getString(R.string.wallet_hint_chinese_phone_number_needed, str));
            ((TextView) view3.findViewById(R.id.phone_consent_item1_line2)).setText(getString(R.string.wallet_contact_info) + getString(R.string.wallet_contact_info_snowball));
            ((TextView) view3.findViewById(R.id.phone_consent_item2_line2)).setText(getString(R.string.wallet_contact_info) + getString(R.string.wallet_contact_info_bmac));
            TextInputEditText textInputEditText = (TextInputEditText) view3.findViewById(R.id.edit_text_phone_number);
            textInputEditText.addTextChangedListener(new d(this));
            textInputEditText.setOnFocusChangeListener(new c32.f(this, 12));
            textInputEditText.requestFocus();
            ((Button) view3.findViewById(R.id.button_next)).setOnClickListener(new oq.a(this, 26));
        }
    }

    public final void u6(View view2) {
        Context context = getContext();
        if (context == null) {
            f160479e.trace("Context is null");
            return;
        }
        Object systemService = context.getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lso2/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "EXTRA_CARD_NAME", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

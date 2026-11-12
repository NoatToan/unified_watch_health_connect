package sp2;

import android.text.Editable;
import android.text.TextWatcher;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.fragment.FitPayAdditionalInformationFragment;
import com.google.android.material.textfield.TextInputLayout;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsp2/a;", "Landroid/text/TextWatcher;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayAdditionalInformationFragment f160514a;

    public a(FitPayAdditionalInformationFragment fitPayAdditionalInformationFragment) {
        this.f160514a = fitPayAdditionalInformationFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        TextInputLayout textInputLayout = this.f160514a.f51658c;
        if (textInputLayout != null) {
            textInputLayout.setError(null);
        } else {
            s.m("addInfoCvvEditTextLayout");
            throw null;
        }
    }
}

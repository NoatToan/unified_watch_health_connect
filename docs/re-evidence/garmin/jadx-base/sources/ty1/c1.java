package ty1;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lty1/c1;", "Landroid/text/TextWatcher;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.s f167083a;

    public c1(com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar) {
        this.f167083a = sVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    @SuppressLint({"SetTextI18n"})
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        if (charSequence != null) {
            TextView textView = this.f167083a.f46241o;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("mCharacterCount");
                throw null;
            }
            textView.setText(charSequence.length() + "/2000");
        }
    }
}

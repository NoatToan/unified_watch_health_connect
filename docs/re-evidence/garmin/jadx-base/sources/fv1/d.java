package fv1;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfv1/d;", "Landroid/text/TextWatcher;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f73706a;

    public d(c cVar) {
        this.f73706a = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        AppCompatButton appCompatButton = this.f73706a.f73685m;
        if (appCompatButton != null) {
            appCompatButton.setEnabled(false);
        } else {
            s.m("nextButton");
            throw null;
        }
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

package ew1;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatButton;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew1/o;", "Landroid/text/TextWatcher;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f66628a;

    public o(n nVar) {
        this.f66628a = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        AppCompatButton appCompatButton = this.f66628a.f66602n;
        if (appCompatButton != null) {
            appCompatButton.setEnabled(false);
        } else {
            p005kotlin.jvm.internal.s.m("nextButton");
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

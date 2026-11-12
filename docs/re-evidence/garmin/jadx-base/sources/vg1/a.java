package vg1;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvg1/a;", "Landroid/text/TextWatcher;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f178064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatEditText f178065b;

    public a(b bVar, AppCompatEditText appCompatEditText) {
        this.f178064a = bVar;
        this.f178065b = appCompatEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        b bVar = this.f178064a;
        if (bVar.f178070c) {
            return;
        }
        int i14 = bVar.f178072e + bVar.f178071d;
        String string = editable.toString();
        String strConcat = string.substring(0, bVar.f178072e).concat(string.substring(i14, editable.length()));
        int i15 = bVar.f178072e;
        AppCompatEditText appCompatEditText = this.f178065b;
        appCompatEditText.setText(strConcat);
        appCompatEditText.setSelection(i15);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        b bVar = this.f178064a;
        bVar.f178071d = i16;
        bVar.f178072e = i14;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        char cCharAt;
        charSequence.getClass();
        boolean z14 = true;
        if (i15 < i16 && ('!' > (cCharAt = charSequence.charAt(i14)) || cCharAt >= 128)) {
            z14 = false;
        }
        this.f178064a.f178070c = z14;
    }
}

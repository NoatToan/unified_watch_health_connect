package c32;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc32/i;", "Landroid/text/TextWatcher;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24116a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f24118c;

    public i(int i14, EditText editText) {
        this.f24117b = i14;
        this.f24118c = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        byte[] bytes = charSequence.toString().getBytes(d53.c.f57666b);
        bytes.getClass();
        if (bytes.length <= this.f24117b) {
            this.f24116a = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        byte[] bytes = charSequence.toString().getBytes(d53.c.f57666b);
        bytes.getClass();
        if (bytes.length > this.f24117b) {
            String str = this.f24116a;
            EditText editText = this.f24118c;
            editText.setText(str);
            editText.setSelection(editText.length());
        }
    }
}

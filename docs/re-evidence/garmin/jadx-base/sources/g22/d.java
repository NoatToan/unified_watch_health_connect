package g22;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg22/d;", "Landroid/text/TextWatcher;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f75557a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f75558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f75559c;

    public d(Integer num, EditText editText) {
        this.f75558b = num;
        this.f75559c = editText;
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
        if (bytes.length <= this.f75558b.intValue()) {
            this.f75557a = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        byte[] bytes = charSequence.toString().getBytes(d53.c.f57666b);
        bytes.getClass();
        if (bytes.length > this.f75558b.intValue()) {
            String str = this.f75557a;
            EditText editText = this.f75559c;
            editText.setText(str);
            editText.setSelection(editText.length());
        }
    }
}

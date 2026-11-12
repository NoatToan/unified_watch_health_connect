package pv2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpv2/a;", "Landroid/text/TextWatcher;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f141640a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f141641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f141642c;

    public a(Integer num, EditText editText) {
        this.f141641b = num;
        this.f141642c = editText;
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
        if (bytes.length <= this.f141641b.intValue()) {
            this.f141640a = charSequence.toString();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        byte[] bytes = charSequence.toString().getBytes(d53.c.f57666b);
        bytes.getClass();
        if (bytes.length > this.f141641b.intValue()) {
            String str = this.f141640a;
            EditText editText = this.f141642c;
            editText.setText(str);
            editText.setSelection(editText.length());
        }
    }
}

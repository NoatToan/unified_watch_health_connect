package fb2;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class j extends b0<CharSequence> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f70356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f70357c;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            j.this.f(charSequence);
        }
    }

    public j(View view2, View view3, int i14, int i15, b0.a<CharSequence> aVar) {
        super(aVar);
        try {
            EditText editText = (EditText) view2;
            this.f70356b = editText;
            this.f70357c = (TextView) view3;
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i14)});
            editText.setInputType(editText.getInputType() | i15);
            editText.addTextChangedListener(new a());
        } catch (ClassCastException e4) {
            i2.i("InputFieldViewDecorator", "InputFieldViewDecorator: Views of types EditText and TextView are required: " + e4.getMessage());
        }
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70356b);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70356b);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70356b, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70356b, z14);
    }
}

package bd;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.preference.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f17468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f17469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RunnableC0247a f17470k = new RunnableC0247a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17471l = -1;

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    public class RunnableC0247a implements Runnable {
        public RunnableC0247a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.z6();
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f17469j = ((EditTextPreference) u6()).Q0;
        } else {
            this.f17469j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f17469j);
    }

    @Override // androidx.preference.a
    public final void v6(View view2) {
        super.v6(view2);
        EditText editText = (EditText) view2.findViewById(R.id.edit);
        this.f17468i = editText;
        if (editText == null) {
            vb.h.z("Dialog view must contain an EditText with id @android:id/edit");
            return;
        }
        editText.requestFocus();
        this.f17468i.setText(this.f17469j);
        EditText editText2 = this.f17468i;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) u6()).getClass();
    }

    @Override // androidx.preference.a
    public final void w6(boolean z14) {
        if (z14) {
            String string = this.f17468i.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) u6();
            if (editTextPreference.a(string)) {
                editTextPreference.E(string);
            }
        }
    }

    public final void z6() {
        long j8 = this.f17471l;
        if (j8 == -1 || j8 + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f17468i;
        if (editText == null || !editText.isFocused()) {
            this.f17471l = -1L;
            return;
        }
        if (((InputMethodManager) this.f17468i.getContext().getSystemService("input_method")).showSoftInput(this.f17468i, 0)) {
            this.f17471l = -1L;
            return;
        }
        EditText editText2 = this.f17468i;
        RunnableC0247a runnableC0247a = this.f17470k;
        editText2.removeCallbacks(runnableC0247a);
        this.f17468i.postDelayed(runnableC0247a, 50L);
    }
}

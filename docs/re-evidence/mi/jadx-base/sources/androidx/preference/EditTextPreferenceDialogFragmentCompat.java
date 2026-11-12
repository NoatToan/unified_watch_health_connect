package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f2708k = new a();
    public long l = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EditTextPreferenceDialogFragmentCompat.this.D();
        }
    }

    public static EditTextPreferenceDialogFragmentCompat C(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    public final EditTextPreference A() {
        return (EditTextPreference) s();
    }

    public final boolean B() {
        long j = this.l;
        return j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void D() {
        if (B()) {
            EditText editText = this.i;
            if (editText == null || !editText.isFocused()) {
                E(false);
            } else if (((InputMethodManager) this.i.getContext().getSystemService("input_method")).showSoftInput(this.i, 0)) {
                E(false);
            } else {
                this.i.removeCallbacks(this.f2708k);
                this.i.postDelayed(this.f2708k, 50L);
            }
        }
    }

    public final void E(boolean z) {
        this.l = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = A().o();
        } else {
            this.j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.j);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t() {
        return true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void u(View view) {
        super.u(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.i = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.i.setText(this.j);
        EditText editText2 = this.i;
        editText2.setSelection(editText2.getText().length());
        A().n();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void w(boolean z) {
        if (z) {
            String string = this.i.getText().toString();
            EditTextPreference editTextPreferenceA = A();
            if (editTextPreferenceA.callChangeListener(string)) {
                editTextPreferenceA.p(string);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void z() {
        E(true);
        D();
    }
}

package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class EditTextPreferenceDialogFragment extends PreferenceDialogFragment {
    public EditText i;
    public CharSequence j;

    @Deprecated
    public EditTextPreferenceDialogFragment() {
    }

    @Deprecated
    public static EditTextPreferenceDialogFragment i(String str) {
        EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = new EditTextPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragment.setArguments(bundle);
        return editTextPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean b() {
        return true;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void c(View view) {
        super.c(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.i = editText;
        editText.requestFocus();
        EditText editText2 = this.i;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.j);
        EditText editText3 = this.i;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void e(boolean z) {
        if (z) {
            String string = this.i.getText().toString();
            if (h().callChangeListener(string)) {
                h().p(string);
            }
        }
    }

    public final EditTextPreference h() {
        return (EditTextPreference) a();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.j = h().o();
        } else {
            this.j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.j);
    }
}

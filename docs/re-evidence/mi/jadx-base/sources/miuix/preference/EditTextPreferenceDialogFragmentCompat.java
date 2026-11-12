package miuix.preference;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import defpackage.f63;
import defpackage.jwc;
import defpackage.p6i;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes3.dex */
public class EditTextPreferenceDialogFragmentCompat extends androidx.preference.EditTextPreferenceDialogFragmentCompat {
    public p6i m;
    public jwc n;

    public class a implements jwc {
        public a() {
        }

        @Override // defpackage.jwc
        public View a(Context context) {
            return EditTextPreferenceDialogFragmentCompat.this.v(context);
        }

        @Override // defpackage.jwc
        public void b(View view) {
            EditTextPreferenceDialogFragmentCompat.this.u(view);
        }

        @Override // defpackage.jwc
        public void c(c.a aVar) {
            EditTextPreferenceDialogFragmentCompat.this.I(aVar);
        }

        @Override // defpackage.jwc
        public boolean d() {
            return true;
        }
    }

    public EditTextPreferenceDialogFragmentCompat() {
        a aVar = new a();
        this.n = aVar;
        this.m = new p6i(aVar, this);
    }

    public static EditTextPreferenceDialogFragmentCompat H(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    public void I(c.a aVar) {
        super.x(new f63(getContext(), aVar));
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return this.m.a(bundle);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void x(androidx.appcompat.app.a.C0006a c0006a) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }
}

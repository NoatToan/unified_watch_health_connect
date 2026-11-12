package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int i;
    public CharSequence[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f2715k;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
            listPreferenceDialogFragmentCompat.i = i;
            listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    public static ListPreferenceDialogFragmentCompat B(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    public final ListPreference A() {
        return (ListPreference) s();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f2715k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceA = A();
        if (listPreferenceA.o() == null || listPreferenceA.r() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.i = listPreferenceA.n(listPreferenceA.s());
        this.j = listPreferenceA.o();
        this.f2715k = listPreferenceA.r();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2715k);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void w(boolean z) {
        int i;
        if (!z || (i = this.i) < 0) {
            return;
        }
        String string = this.f2715k[i].toString();
        ListPreference listPreferenceA = A();
        if (listPreferenceA.callChangeListener(string)) {
            listPreferenceA.w(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void x(androidx.appcompat.app.a.C0006a c0006a) {
        super.x(c0006a);
        c0006a.k(this.j, this.i, new a());
        c0006a.i(null, null);
    }
}

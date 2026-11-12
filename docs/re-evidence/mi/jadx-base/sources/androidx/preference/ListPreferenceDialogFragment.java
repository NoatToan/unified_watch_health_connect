package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ListPreferenceDialogFragment extends PreferenceDialogFragment {
    public int i;
    public CharSequence[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f2713k;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ListPreferenceDialogFragment listPreferenceDialogFragment = ListPreferenceDialogFragment.this;
            listPreferenceDialogFragment.i = i;
            listPreferenceDialogFragment.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Deprecated
    public ListPreferenceDialogFragment() {
    }

    @Deprecated
    public static ListPreferenceDialogFragment i(String str) {
        ListPreferenceDialogFragment listPreferenceDialogFragment = new ListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragment.setArguments(bundle);
        return listPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void e(boolean z) {
        int i;
        ListPreference listPreferenceH = h();
        if (!z || (i = this.i) < 0) {
            return;
        }
        String string = this.f2713k[i].toString();
        if (listPreferenceH.callChangeListener(string)) {
            listPreferenceH.w(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void f(AlertDialog.Builder builder) {
        super.f(builder);
        builder.setSingleChoiceItems(this.j, this.i, new a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final ListPreference h() {
        return (ListPreference) a();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f2713k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceH = h();
        if (listPreferenceH.o() == null || listPreferenceH.r() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.i = listPreferenceH.n(listPreferenceH.s());
        this.j = listPreferenceH.o();
        this.f2713k = listPreferenceH.r();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2713k);
    }
}

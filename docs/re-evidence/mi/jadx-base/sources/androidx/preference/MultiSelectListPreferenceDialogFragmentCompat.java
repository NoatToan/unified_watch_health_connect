package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public Set<String> i = new HashSet();
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f2720k;
    public CharSequence[] l;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                multiSelectListPreferenceDialogFragmentCompat.j = multiSelectListPreferenceDialogFragmentCompat.i.add(multiSelectListPreferenceDialogFragmentCompat.l[i].toString()) | multiSelectListPreferenceDialogFragmentCompat.j;
            } else {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = MultiSelectListPreferenceDialogFragmentCompat.this;
                multiSelectListPreferenceDialogFragmentCompat2.j = multiSelectListPreferenceDialogFragmentCompat2.i.remove(multiSelectListPreferenceDialogFragmentCompat2.l[i].toString()) | multiSelectListPreferenceDialogFragmentCompat2.j;
            }
        }
    }

    public static MultiSelectListPreferenceDialogFragmentCompat B(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    public final MultiSelectListPreference A() {
        return (MultiSelectListPreference) s();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.i.clear();
            this.i.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f2720k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceA = A();
        if (multiSelectListPreferenceA.n() == null || multiSelectListPreferenceA.o() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.i.clear();
        this.i.addAll(multiSelectListPreferenceA.p());
        this.j = false;
        this.f2720k = multiSelectListPreferenceA.n();
        this.l = multiSelectListPreferenceA.o();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2720k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.l);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void w(boolean z) {
        if (z && this.j) {
            MultiSelectListPreference multiSelectListPreferenceA = A();
            if (multiSelectListPreferenceA.callChangeListener(this.i)) {
                multiSelectListPreferenceA.r(this.i);
            }
        }
        this.j = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void x(androidx.appcompat.app.a.C0006a c0006a) {
        super.x(c0006a);
        int length = this.l.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.i.contains(this.l[i].toString());
        }
        c0006a.f(this.f2720k, zArr, new a());
    }
}

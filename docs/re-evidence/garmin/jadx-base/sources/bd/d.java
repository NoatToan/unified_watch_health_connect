package bd;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class d extends androidx.preference.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f17477i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f17479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence[] f17480l;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i14, boolean z14) {
            d dVar = d.this;
            if (z14) {
                dVar.f17478j = dVar.f17477i.add(dVar.f17480l[i14].toString()) | dVar.f17478j;
            } else {
                dVar.f17478j = dVar.f17477i.remove(dVar.f17480l[i14].toString()) | dVar.f17478j;
            }
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f17477i;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f17478j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f17479k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f17480l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) u6();
        CharSequence[] charSequenceArr = multiSelectListPreference.Q0;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.R0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            vb.h.z("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.S0);
        this.f17478j = false;
        this.f17479k = multiSelectListPreference.Q0;
        this.f17480l = charSequenceArr2;
    }

    @Override // androidx.preference.a, androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f17477i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f17478j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f17479k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f17480l);
    }

    @Override // androidx.preference.a
    public final void w6(boolean z14) {
        if (z14 && this.f17478j) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) u6();
            HashSet hashSet = this.f17477i;
            if (multiSelectListPreference.a(hashSet)) {
                multiSelectListPreference.E(hashSet);
            }
        }
        this.f17478j = false;
    }

    @Override // androidx.preference.a
    public final void y6(androidx.appcompat.app.e.a aVar) {
        int length = this.f17480l.length;
        boolean[] zArr = new boolean[length];
        for (int i14 = 0; i14 < length; i14++) {
            zArr[i14] = this.f17477i.contains(this.f17480l[i14].toString());
        }
        aVar.setMultiChoiceItems(this.f17479k, zArr, new a());
    }
}

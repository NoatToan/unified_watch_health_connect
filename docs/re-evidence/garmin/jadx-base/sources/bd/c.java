package bd;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.preference.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence[] f17474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence[] f17475k;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            c cVar = c.this;
            cVar.f17473i = i14;
            cVar.f10191h = -1;
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f17473i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f17474j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f17475k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) u6();
        CharSequence[] charSequenceArr = listPreference.Q0;
        CharSequence[] charSequenceArr2 = listPreference.R0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            vb.h.z("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.f17473i = listPreference.E(listPreference.S0);
        this.f17474j = listPreference.Q0;
        this.f17475k = charSequenceArr2;
    }

    @Override // androidx.preference.a, androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f17473i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f17474j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f17475k);
    }

    @Override // androidx.preference.a
    public final void w6(boolean z14) {
        int i14;
        if (!z14 || (i14 = this.f17473i) < 0) {
            return;
        }
        String string = this.f17475k[i14].toString();
        ListPreference listPreference = (ListPreference) u6();
        if (listPreference.a(string)) {
            listPreference.F(string);
        }
    }

    @Override // androidx.preference.a
    public final void y6(androidx.appcompat.app.e.a aVar) {
        aVar.setSingleChoiceItems(this.f17474j, this.f17473i, new a());
        aVar.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }
}

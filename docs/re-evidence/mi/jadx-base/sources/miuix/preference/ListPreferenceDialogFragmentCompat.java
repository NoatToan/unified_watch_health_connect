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
public class ListPreferenceDialogFragmentCompat extends androidx.preference.ListPreferenceDialogFragmentCompat {
    public p6i l;
    public jwc m;

    public class a implements jwc {
        public a() {
        }

        @Override // defpackage.jwc
        public View a(Context context) {
            return ListPreferenceDialogFragmentCompat.this.v(context);
        }

        @Override // defpackage.jwc
        public void b(View view) {
            ListPreferenceDialogFragmentCompat.this.u(view);
        }

        @Override // defpackage.jwc
        public void c(c.a aVar) {
            ListPreferenceDialogFragmentCompat.this.F(aVar);
        }

        @Override // defpackage.jwc
        public boolean d() {
            return false;
        }
    }

    public ListPreferenceDialogFragmentCompat() {
        a aVar = new a();
        this.m = aVar;
        this.l = new p6i(aVar, this);
    }

    public static ListPreferenceDialogFragmentCompat E(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    public void F(c.a aVar) {
        super.x(new f63(getContext(), aVar));
    }

    @Override // androidx.preference.ListPreferenceDialogFragmentCompat, androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return this.l.a(bundle);
    }

    @Override // androidx.preference.ListPreferenceDialogFragmentCompat, androidx.preference.PreferenceDialogFragmentCompat
    public final void x(androidx.appcompat.app.a.C0006a c0006a) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }
}

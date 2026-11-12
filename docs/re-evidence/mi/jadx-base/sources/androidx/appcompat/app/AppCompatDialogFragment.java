package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import defpackage.if1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    public AppCompatDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new if1(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof if1)) {
            super.setupDialog(dialog, i);
            return;
        }
        if1 if1Var = (if1) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        if1Var.e(1);
    }

    public AppCompatDialogFragment(int i) {
        super(i);
    }
}

package i;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class m extends androidx.fragment.app.i {
    public m() {
    }

    @Override // androidx.fragment.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        return new l(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.i
    public void setupDialog(Dialog dialog, int i14) {
        if (!(dialog instanceof l)) {
            super.setupDialog(dialog, i14);
            return;
        }
        l lVar = (l) dialog;
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        lVar.supportRequestWindowFeature(1);
    }

    public m(int i14) {
        super(i14);
    }
}

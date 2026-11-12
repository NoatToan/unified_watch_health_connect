package com.permissionx.guolindev.dialog;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RationaleDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    public abstract View s();

    public abstract List<String> t();

    public abstract View u();
}

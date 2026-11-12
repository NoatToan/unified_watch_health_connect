package com.huawei.watchface.videoedit.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BaseDialogFragment extends DialogFragment {
    protected Dialog mDialog;
    protected int mRotation;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        this.mDialog = dialogOnCreateDialog;
        ((Window) Objects.requireNonNull(dialogOnCreateDialog.getWindow())).requestFeature(1);
        return this.mDialog;
    }

    public abstract void setRotation(int i);

    public void showDialog(FragmentManager fragmentManager, int i) {
        this.mRotation = i;
        super.show(fragmentManager, getClass().getSimpleName());
    }
}

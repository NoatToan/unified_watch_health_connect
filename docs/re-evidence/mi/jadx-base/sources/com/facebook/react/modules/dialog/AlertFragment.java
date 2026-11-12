package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public class AlertFragment extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogModule.b f7407a;

    public AlertFragment() {
        this.f7407a = null;
    }

    public static Dialog s(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.b bVar = this.f7407a;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return s(getActivity(), getArguments(), this);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.f7407a;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    @SuppressLint({"ValidFragment"})
    public AlertFragment(DialogModule.b bVar, Bundle bundle) {
        this.f7407a = bVar;
        setArguments(bundle);
    }
}

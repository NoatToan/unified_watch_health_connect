package com.huami.watch.ui.dialog;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class LoadingDialog {
    public static void dismiss(@Nullable DialogFragment dialogFragment) {
        if (dialogFragment == null) {
            return;
        }
        try {
            dialogFragment.dismissAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @NonNull
    @MainThread
    public static Builder setMessage(String str) {
        Builder builder = new Builder();
        builder.setMessage(str);
        return builder;
    }

    public static class Builder {
        public String a;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public boolean mCancelable = true;
        public boolean b = true;

        public DialogFragment build() {
            AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
            alertDialogFragment.setStyle(1);
            alertDialogFragment.setMessage(this.a);
            alertDialogFragment.setCancelable(this.mCancelable);
            alertDialogFragment.setOnCancelListener(this.mOnCancelListener);
            alertDialogFragment.setCanceledOnTouchOutside(this.b);
            return alertDialogFragment;
        }

        public Builder setCancelable(boolean z) {
            this.mCancelable = z;
            return this;
        }

        public Builder setCanceledOnTouchOutside(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setMessage(String str) {
            this.a = str;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.mOnCancelListener = onCancelListener;
            return this;
        }

        public DialogFragment show(FragmentManager fragmentManager, String str) {
            DialogFragment dialogFragmentBuild = build();
            try {
                dialogFragmentBuild.show(fragmentManager, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return dialogFragmentBuild;
        }

        public DialogFragment show(Activity activity, String str) {
            if (activity != null && !activity.isDestroyed()) {
                return show(activity.getFragmentManager(), str);
            }
            return build();
        }
    }
}

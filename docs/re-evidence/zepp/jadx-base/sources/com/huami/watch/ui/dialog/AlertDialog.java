package com.huami.watch.ui.dialog;

import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class AlertDialog extends LoadingDialog {

    public static class Builder extends LoadingDialog.Builder {
        private String c;
        public String d;
        public String e;
        public String f;
        public DialogInterface.OnClickListener g;
        public DialogInterface.OnClickListener h;
        public DialogInterface.OnClickListener i;
        public Fragment j;

        @Override // com.huami.watch.ui.dialog.LoadingDialog.Builder
        public DialogFragment build() {
            AlertDialogFragment alertDialogFragment = (AlertDialogFragment) super.build();
            alertDialogFragment.setStyle(0);
            alertDialogFragment.setTitle(this.c);
            Fragment fragment = this.j;
            if (fragment != null) {
                alertDialogFragment.setContent(fragment);
            }
            if (TextUtils.isEmpty(this.d)) {
                alertDialogFragment.setPositiveButton(this.e, this.h);
                alertDialogFragment.setNegativeButton(this.f, this.i);
            } else {
                alertDialogFragment.setNegativeButton(this.d, this.g);
            }
            return alertDialogFragment;
        }

        public Builder setContent(Fragment fragment) {
            this.j = fragment;
            return this;
        }

        public Builder setNegativeBtn(String str) {
            return setNegativeBtn(str, null);
        }

        public Builder setNeutralBtn(String str) {
            return setNeutralBtn(str, null);
        }

        public Builder setPositiveBtn(String str) {
            return setPositiveBtn(str, null);
        }

        public Builder setTitle(String str) {
            this.c = str;
            return this;
        }

        @Override // com.huami.watch.ui.dialog.LoadingDialog.Builder
        public Builder setCancelable(boolean z) {
            super.setCancelable(z);
            return this;
        }

        @Override // com.huami.watch.ui.dialog.LoadingDialog.Builder
        public Builder setMessage(String str) {
            super.setMessage(str);
            return this;
        }

        public Builder setNegativeBtn(String str, DialogInterface.OnClickListener onClickListener) {
            this.f = str;
            this.i = onClickListener;
            return this;
        }

        public Builder setNeutralBtn(String str, DialogInterface.OnClickListener onClickListener) {
            this.d = str;
            this.g = onClickListener;
            return this;
        }

        public Builder setPositiveBtn(String str, DialogInterface.OnClickListener onClickListener) {
            this.e = str;
            this.h = onClickListener;
            return this;
        }
    }

    @NonNull
    @MainThread
    public static Builder setContent(Fragment fragment) {
        Builder builder = new Builder();
        builder.setContent(fragment);
        return builder;
    }

    @NonNull
    @MainThread
    public static Builder setMessage(String str) {
        Builder builder = new Builder();
        builder.setMessage(str);
        return builder;
    }

    @NonNull
    @MainThread
    public static Builder setTitle(String str) {
        Builder builder = new Builder();
        builder.setTitle(str);
        return builder;
    }
}

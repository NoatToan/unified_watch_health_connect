package com.huami.assistant.ui.helper;

import android.app.Activity;
import android.app.DialogFragment;
import androidx.annotation.NonNull;
import com.huami.assistant.R;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ui.view.ToastWithIcon;
import com.huami.watch.ui.dialog.LoadingDialog;

/* JADX INFO: loaded from: classes5.dex */
public class LoadingDialogHelper {
    private Activity a;
    private DialogFragment b;

    public LoadingDialogHelper(Activity activity) {
        this.a = activity;
    }

    private void a() {
        LoadingDialog.dismiss(this.b);
    }

    private String b() {
        return this.a.getString(R.string.loading);
    }

    private void c(@NonNull String msg) {
        this.b = LoadingDialog.setMessage(msg).setCancelable(false).show(this.a, "AssistantLoadingDialogHelper");
    }

    public void setError(@NonNull String msg) {
        ToastWithIcon.showShort(this.a, msg, R.drawable.toast_icon_attention);
    }

    public void setSuccess(@NonNull String msg) {
        ToastWithIcon.showShort(this.a, msg, R.drawable.toast_icon_ok);
    }

    public void showOrError(Result result, @NonNull String msg, @NonNull String successMsg, @NonNull String errorMsg) {
        showOrHide(result, msg);
        if (result != null && result.isSuccess()) {
            setSuccess(successMsg);
        }
        if (result == null || !result.isError()) {
            return;
        }
        setError(errorMsg);
    }

    public void showOrHide(Result result) {
        showOrHide(result, b());
    }

    public void showOrHide(Result result, @NonNull String msg) {
        if (result == null || !result.isLoading()) {
            a();
        } else {
            c(msg);
        }
    }
}

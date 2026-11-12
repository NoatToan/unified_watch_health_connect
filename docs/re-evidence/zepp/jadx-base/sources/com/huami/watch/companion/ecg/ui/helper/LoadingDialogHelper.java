package com.huami.watch.companion.ecg.ui.helper;

import android.app.Activity;
import android.app.DialogFragment;
import android.widget.Toast;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.ui.dialog.LoadingDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002J,\u0010\f\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "", "", "msg", "", "c", "a", "Lcom/huami/watch/companion/arch/Result;", "result", "showOrHide", "successMsg", "errorMsg", "showOrError", "setSuccess", "setError", "Landroid/app/Activity;", "Landroid/app/Activity;", "mActivity", "Landroid/app/DialogFragment;", "b", "Landroid/app/DialogFragment;", "mLoadingDialog", "()Ljava/lang/String;", "defaultLoadingMsg", "<init>", "(Landroid/app/Activity;)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class LoadingDialogHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity mActivity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private DialogFragment mLoadingDialog;

    public LoadingDialogHelper(@NotNull Activity activity) {
        this.mActivity = activity;
    }

    private final void a() {
        LoadingDialog.dismiss(this.mLoadingDialog);
    }

    private final String b() {
        return this.mActivity.getString(R.string.loading);
    }

    private final void c(String msg) {
        this.mLoadingDialog = LoadingDialog.setMessage(msg).setCancelable(false).show(this.mActivity, "EcgLoadingDialogHelper");
    }

    public static /* synthetic */ void showOrHide$default(LoadingDialogHelper loadingDialogHelper, Result result, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = loadingDialogHelper.b();
        }
        loadingDialogHelper.showOrHide(result, str);
    }

    public final void setError(@NotNull String msg) {
        Toast.makeText(this.mActivity, msg, 0).show();
    }

    public final void setSuccess(@NotNull String msg) {
    }

    public final void showOrError(@Nullable Result<?> result, @NotNull String msg, @NotNull String successMsg, @NotNull String errorMsg) {
        showOrHide(result, msg);
        if (result != null && result.isSuccess()) {
            setSuccess(successMsg);
        }
        if (result == null || !result.isError()) {
            return;
        }
        setError(errorMsg);
    }

    public final void showOrHide(@Nullable Result<?> result, @NotNull String msg) {
        if (result == null || !result.isLoading()) {
            a();
        } else {
            c(msg);
        }
    }
}

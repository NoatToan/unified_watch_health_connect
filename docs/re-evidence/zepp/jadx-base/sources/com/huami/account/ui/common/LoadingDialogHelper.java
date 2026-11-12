package com.huami.account.ui.common;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.loading.LoadingDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J$\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/account/ui/common/LoadingDialogHelper;", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "Landroid/app/Activity;", "dialogContext", "", "message", "", "showLoadingDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "getLoadingDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog$OnAnimEndListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSuccess", "", "delayMills", "setFailed", "hideDialog", "a", "Landroid/app/Activity;", "activity", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "(Landroid/app/Activity;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoadingDialogHelper implements LoadingDialogContainer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    public LoadingDialogHelper(@NotNull Activity activity) {
        this.activity = activity;
    }

    @Override // com.huami.account.ui.common.LoadingDialogContainer
    @NotNull
    /* JADX INFO: renamed from: dialogContext, reason: from getter */
    public Activity getActivity() {
        return this.activity;
    }

    @Override // com.huami.account.ui.common.LoadingDialogContainer
    @Nullable
    public LoadingDialog getLoadingDialog() {
        return this.loadingDialog;
    }

    @Override // com.huami.account.ui.common.LoadingDialogContainer
    public void hideDialog() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        this.loadingDialog = null;
    }

    @Override // com.huami.account.ui.common.LoadingDialogContainer
    public void setFailed(@Nullable String message, @Nullable LoadingDialog.OnAnimEndListener listener) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            if (message == null) {
                message = "";
            }
            loadingDialog.setFailed(message, listener);
        }
        this.loadingDialog = null;
    }

    @Override // com.huami.account.ui.common.LoadingDialogContainer
    public void setSuccess(@Nullable String message, @Nullable LoadingDialog.OnAnimEndListener listener) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            if (message == null) {
                message = "";
            }
            loadingDialog.setSuccess(message, listener);
        }
        this.loadingDialog = null;
    }

    @Override // com.huami.account.ui.common.LoadingDialogContainer
    public void showLoadingDialog(@Nullable String message) {
        if (this.activity.isDestroyed()) {
            return;
        }
        LoadingDialog loadingDialogShowDialog = this.loadingDialog;
        if (loadingDialogShowDialog == null) {
            loadingDialogShowDialog = null;
        } else {
            loadingDialogShowDialog.show();
        }
        if (loadingDialogShowDialog == null) {
            loadingDialogShowDialog = LoadingDialog.showDialog(this.activity);
            this.loadingDialog = loadingDialogShowDialog;
        }
        loadingDialogShowDialog.setCancelable(false);
        if (TextUtils.isEmpty(message)) {
            return;
        }
        loadingDialogShowDialog.setMessage(message);
    }

    @Override // com.huami.account.ui.common.LoadingDialogContainer
    public void setSuccess(@Nullable String message, long delayMills, @Nullable LoadingDialog.OnAnimEndListener listener) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            if (message == null) {
                message = "";
            }
            loadingDialog.setSuccess(message, (int) delayMills, listener);
        }
        this.loadingDialog = null;
    }
}

package com.huami.account.ui.common;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.loading.LoadingDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J$\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u0011"}, d2 = {"Lcom/huami/account/ui/common/LoadingDialogContainer;", "", "Landroid/app/Activity;", "dialogContext", "", "message", "", "showLoadingDialog", "hideDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "getLoadingDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog$OnAnimEndListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSuccess", "", "delayMills", "setFailed", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface LoadingDialogContainer {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void setSuccess(@NotNull LoadingDialogContainer loadingDialogContainer, @Nullable String str, long j, @Nullable LoadingDialog.OnAnimEndListener onAnimEndListener) {
            loadingDialogContainer.setSuccess(str, onAnimEndListener);
        }
    }

    @NotNull
    Activity dialogContext();

    @Nullable
    LoadingDialog getLoadingDialog();

    void hideDialog();

    void setFailed(@Nullable String message, @Nullable LoadingDialog.OnAnimEndListener listener);

    void setSuccess(@Nullable String message, long delayMills, @Nullable LoadingDialog.OnAnimEndListener listener);

    void setSuccess(@Nullable String message, @Nullable LoadingDialog.OnAnimEndListener listener);

    void showLoadingDialog(@Nullable String message);
}

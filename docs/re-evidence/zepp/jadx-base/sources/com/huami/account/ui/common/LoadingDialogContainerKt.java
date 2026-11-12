package com.huami.account.ui.common;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.loading.LoadingDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\u001e\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/account/ui/common/LoadingDialogContainer;", "", "id", "", "a", "", "showLoadingDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog$OnAnimEndListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSuccess", "setFailed", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class LoadingDialogContainerKt {
    private static final String a(LoadingDialogContainer loadingDialogContainer, int i) {
        return loadingDialogContainer.dialogContext().getString(i);
    }

    public static final void setFailed(@NotNull LoadingDialogContainer loadingDialogContainer, int i, @Nullable LoadingDialog.OnAnimEndListener onAnimEndListener) {
        loadingDialogContainer.setFailed(a(loadingDialogContainer, i), onAnimEndListener);
    }

    public static /* synthetic */ void setFailed$default(LoadingDialogContainer loadingDialogContainer, int i, LoadingDialog.OnAnimEndListener onAnimEndListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            onAnimEndListener = null;
        }
        setFailed(loadingDialogContainer, i, onAnimEndListener);
    }

    public static final void setSuccess(@NotNull LoadingDialogContainer loadingDialogContainer, int i, @Nullable LoadingDialog.OnAnimEndListener onAnimEndListener) {
        loadingDialogContainer.setSuccess(a(loadingDialogContainer, i), onAnimEndListener);
    }

    public static /* synthetic */ void setSuccess$default(LoadingDialogContainer loadingDialogContainer, int i, LoadingDialog.OnAnimEndListener onAnimEndListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            onAnimEndListener = null;
        }
        setSuccess(loadingDialogContainer, i, onAnimEndListener);
    }

    public static final void showLoadingDialog(@NotNull LoadingDialogContainer loadingDialogContainer, int i) {
        loadingDialogContainer.showLoadingDialog(a(loadingDialogContainer, i));
    }
}

package com.huami.message.ui.base.dialog;

import android.app.Activity;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.message.ui.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002J\u001c\u0010\u000f\u001a\u00020\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\b\b\u0002\u0010\u000b\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/message/ui/base/dialog/LoadingDialogHelper;", "", "", "message", "", "showLoading", "hideLoading", "setSuccess", "setFail", "Lcom/huami/android/vo/Status;", "status", "loadingMsg", "showOrHide", "Lcom/huami/android/vo/Resource;", "resource", "showOrError", "errorMsg", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "()Ljava/lang/String;", "defaultLoadingMsg", "<init>", "(Landroid/app/Activity;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class LoadingDialogHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LoadingDialogHelper(@NotNull Activity activity) {
        this.context = activity;
    }

    private final String a() {
        return this.context.getString(R.string.loading);
    }

    public static /* synthetic */ void showLoading$default(LoadingDialogHelper loadingDialogHelper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadingDialogHelper.a();
        }
        loadingDialogHelper.showLoading(str);
    }

    public static /* synthetic */ void showOrError$default(LoadingDialogHelper loadingDialogHelper, Resource resource, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = loadingDialogHelper.a();
        }
        loadingDialogHelper.showOrError(resource, str);
    }

    public static /* synthetic */ void showOrHide$default(LoadingDialogHelper loadingDialogHelper, Status status, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = loadingDialogHelper.a();
        }
        loadingDialogHelper.showOrHide(status, str);
    }

    public final void hideLoading() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.loadingDialog.dismiss();
    }

    public final void setFail(@NotNull String message) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.loadingDialog.setFailed(message);
    }

    public final void setSuccess(@NotNull String message) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.loadingDialog.setSuccess(message);
    }

    public final void showLoading(@NotNull String message) {
        if (this.loadingDialog == null) {
            LoadingDialog loadingDialog = new LoadingDialog(this.context);
            this.loadingDialog = loadingDialog;
            loadingDialog.setCancelable(false);
        }
        this.loadingDialog.setMessage(message);
        if (this.loadingDialog.isShowing()) {
            return;
        }
        this.loadingDialog.show();
    }

    public final void showOrError(@NotNull Resource<?> resource, @NotNull String loadingMsg) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            showLoading(loadingMsg);
            return;
        }
        if (i == 2) {
            hideLoading();
        } else {
            if (i != 3) {
                return;
            }
            if (resource.getMessage() != null) {
                setFail(resource.getMessage());
            } else {
                hideLoading();
            }
        }
    }

    public final void showOrHide(@NotNull Status status, @NotNull String loadingMsg) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            showLoading(loadingMsg);
        } else if (i == 2 || i == 3) {
            hideLoading();
        }
    }

    public static /* synthetic */ void showOrError$default(LoadingDialogHelper loadingDialogHelper, Status status, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = loadingDialogHelper.a();
        }
        loadingDialogHelper.showOrError(status, str, str2);
    }

    public final void showOrError(@NotNull Status status, @NotNull String loadingMsg, @NotNull String errorMsg) {
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            showLoading(loadingMsg);
        } else if (i == 2) {
            hideLoading();
        } else {
            if (i != 3) {
                return;
            }
            setFail(errorMsg);
        }
    }
}

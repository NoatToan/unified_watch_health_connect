package com.xiaomi.hm.health.device.earbud.fragment.dialog;

import android.widget.Toast;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingResult;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingType;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J8\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J6\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/dialog/EarbudLoadingDialog;", "", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingResult;", "result", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "", "onSuccess", "onFail", "a", "b", "setResult", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "activity", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mDialog", "<init>", "(Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudLoadingDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseEarbudDeviceActivity<EarbudDeviceViewModel> activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudLoadingDialog(@NotNull BaseEarbudDeviceActivity<? extends EarbudDeviceViewModel> baseEarbudDeviceActivity) {
        this.activity = baseEarbudDeviceActivity;
    }

    private final void a(final EarbudLoadingResult result, final Function1<? super EarbudLoadingType, Unit> onSuccess, final Function1<? super EarbudLoadingType, Unit> onFail) {
        this.activity.setDisableClick(false);
        if (result.isLoading()) {
            LoadingDialog loadingDialog = this.mDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                LoadingDialog loadingDialog2 = this.mDialog;
                if (loadingDialog2 != null) {
                    loadingDialog2.dismiss();
                }
                this.mDialog = null;
            }
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this.activity, result.getType().getLoadingRes() > 0 ? this.activity.getString(result.getType().getLoadingRes()) : this.activity.getString(R.string.loading));
            this.mDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog == null) {
                return;
            }
            loadingDialogShowDialog.setCancelable(false);
            return;
        }
        if (!result.isSuccess()) {
            String string = result.getType().getFailRes() > 0 ? this.activity.getString(result.getType().getFailRes()) : this.activity.getString(R.string.earbud_music_oper_fail);
            LoadingDialog loadingDialog3 = this.mDialog;
            if (loadingDialog3 == null) {
                return;
            }
            loadingDialog3.setFailed(string, new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudLoadingDialog$onDialog$2
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@Nullable LoadingDialog dialog) {
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@Nullable LoadingDialog dialog) {
                    onFail.invoke(result.getType());
                }
            });
            return;
        }
        if (result.getType().getSuccessRes() > 0) {
            LoadingDialog loadingDialog4 = this.mDialog;
            if (loadingDialog4 == null) {
                return;
            }
            loadingDialog4.setSuccess(this.activity.getString(result.getType().getSuccessRes()), new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudLoadingDialog$onDialog$1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@Nullable LoadingDialog dialog) {
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@Nullable LoadingDialog dialog) {
                    onSuccess.invoke(result.getType());
                }
            });
            return;
        }
        LoadingDialog loadingDialog5 = this.mDialog;
        if (loadingDialog5 != null) {
            loadingDialog5.dismiss();
        }
        onSuccess.invoke(result.getType());
    }

    private final void b(EarbudLoadingResult result, Function1<? super EarbudLoadingType, Unit> onSuccess, Function1<? super EarbudLoadingType, Unit> onFail) {
        boolean z = false;
        if (!result.isLoading()) {
            if (result.isSuccess()) {
                this.activity.setDisableClick(false);
                onSuccess.invoke(result.getType());
                return;
            } else {
                this.activity.setDisableClick(false);
                Toast.makeText(this.activity, result.getType().getFailRes() > 0 ? this.activity.getString(result.getType().getFailRes()) : this.activity.getString(R.string.earbud_music_oper_fail), 0).show();
                onFail.invoke(result.getType());
                return;
            }
        }
        LoadingDialog loadingDialog = this.mDialog;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            z = true;
        }
        if (z) {
            LoadingDialog loadingDialog2 = this.mDialog;
            if (loadingDialog2 != null) {
                loadingDialog2.dismiss();
            }
            this.mDialog = null;
        }
        this.activity.setDisableClick(true);
    }

    public final synchronized void setResult(@NotNull EarbudLoadingResult result, @NotNull Function1<? super EarbudLoadingType, Unit> onSuccess, @NotNull Function1<? super EarbudLoadingType, Unit> onFail) {
        if (result.getType().getIsDialogTrans()) {
            b(result, onSuccess, onFail);
        } else {
            a(result, onSuccess, onFail);
        }
    }
}

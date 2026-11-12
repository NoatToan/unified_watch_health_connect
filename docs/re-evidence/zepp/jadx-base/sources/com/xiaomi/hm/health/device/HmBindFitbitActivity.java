package com.xiaomi.hm.health.device;

import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager;
import com.xiaomi.hm.health.device.virtual.VirtualBindResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/HmBindFitbitActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "v", "onBackClick", "startBind", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "x", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmBindFitbitActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    public void _$_clearFindViewByIdCache() {
    }

    public final void onBackClick(@NotNull View v) {
        onBackPressed();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_fitbit);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.white), true);
    }

    public final void startBind(@NotNull View v) {
        HmVirtualDeviceManager.INSTANCE.getInstance().startBind(this, new HmVirtualDeviceManager.BindCallback() { // from class: com.xiaomi.hm.health.device.HmBindFitbitActivity.startBind.1
            @Override // com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager.BindCallback
            public void onResult(@NotNull VirtualBindResult result) {
                LoadingDialog loadingDialog;
                if (Intrinsics.areEqual(result, VirtualBindResult.START_BIND.INSTANCE)) {
                    LoadingDialog loadingDialog2 = HmBindFitbitActivity.this.mLoadingDialog;
                    if (loadingDialog2 != null) {
                        loadingDialog2.dismiss();
                    }
                    HmBindFitbitActivity hmBindFitbitActivity = HmBindFitbitActivity.this;
                    hmBindFitbitActivity.mLoadingDialog = LoadingDialog.showDialog(hmBindFitbitActivity, hmBindFitbitActivity.getString(R.string.device_binding));
                    return;
                }
                if (Intrinsics.areEqual(result, VirtualBindResult.NO_NETWORK.INSTANCE)) {
                    HmBindFitbitActivity hmBindFitbitActivity2 = HmBindFitbitActivity.this;
                    IconToast.showShort(hmBindFitbitActivity2, R.drawable.ic_bind_fitbit_warn, hmBindFitbitActivity2.getString(R.string.no_network_connection));
                    return;
                }
                if (Intrinsics.areEqual(result, VirtualBindResult.HAS_BOUND.INSTANCE)) {
                    HmVirtualDeviceManager.jumpToDeviceActivity$default(HmVirtualDeviceManager.INSTANCE.getInstance(), HmBindFitbitActivity.this, null, 2, null);
                    HmBindFitbitActivity.this.finish();
                    return;
                }
                if (Intrinsics.areEqual(result, VirtualBindResult.NO_DEVICE.INSTANCE)) {
                    LoadingDialog loadingDialog3 = HmBindFitbitActivity.this.mLoadingDialog;
                    if (loadingDialog3 != null) {
                        loadingDialog3.dismiss();
                    }
                    HmBindFitbitActivity hmBindFitbitActivity3 = HmBindFitbitActivity.this;
                    IconToast.showShort(hmBindFitbitActivity3, R.drawable.ic_bind_fitbit_warn, hmBindFitbitActivity3.getString(R.string.fitbit_not_bound));
                    return;
                }
                if (!Intrinsics.areEqual(result, VirtualBindResult.SUCCESS.INSTANCE)) {
                    if (!Intrinsics.areEqual(result, VirtualBindResult.FAIL.INSTANCE) || (loadingDialog = HmBindFitbitActivity.this.mLoadingDialog) == null) {
                        return;
                    }
                    loadingDialog.setFailed(HmBindFitbitActivity.this.getString(R.string.state_bind_failed));
                    return;
                }
                LoadingDialog loadingDialog4 = HmBindFitbitActivity.this.mLoadingDialog;
                if (loadingDialog4 != null) {
                    loadingDialog4.setSuccess(HmBindFitbitActivity.this.getString(R.string.device_bind_success));
                }
                HmVirtualDeviceManager.jumpToDeviceActivity$default(HmVirtualDeviceManager.INSTANCE.getInstance(), HmBindFitbitActivity.this, null, 2, null);
                HmBindFitbitActivity.this.finish();
            }
        });
    }
}

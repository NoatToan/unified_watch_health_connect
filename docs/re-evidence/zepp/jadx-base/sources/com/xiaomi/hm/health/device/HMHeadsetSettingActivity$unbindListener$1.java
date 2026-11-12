package com.xiaomi.hm.health.device;

import android.widget.Button;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMHeadsetSettingActivity$unbindListener$1;
import com.xiaomi.hm.health.device.bind.IUnbindListener;
import com.xiaomi.hm.health.device.bind.UnbindError;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/HMHeadsetSettingActivity$unbindListener$1", "Lcom/xiaomi/hm/health/device/bind/IUnbindListener;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "onUnbindStart", "Lcom/xiaomi/hm/health/device/bind/UnbindError;", "error", "onUnbindFailure", "onUnbindSuccess", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMHeadsetSettingActivity$unbindListener$1 implements IUnbindListener {
    public final /* synthetic */ HMHeadsetSettingActivity a;

    public HMHeadsetSettingActivity$unbindListener$1(HMHeadsetSettingActivity hMHeadsetSettingActivity) {
        this.a = hMHeadsetSettingActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HMHeadsetSettingActivity hMHeadsetSettingActivity) {
        LoadingDialog loadingDialog = hMHeadsetSettingActivity.loadingDlg;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(hMHeadsetSettingActivity.getString(R.string.device_unbind_failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(HMHeadsetSettingActivity hMHeadsetSettingActivity) {
        LoadingDialog loadingDialog = hMHeadsetSettingActivity.loadingDlg;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        hMHeadsetSettingActivity.loadingDlg = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HMHeadsetSettingActivity hMHeadsetSettingActivity) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(hMHeadsetSettingActivity, hMHeadsetSettingActivity.getString(R.string.device_unbinding));
        loadingDialogShowDialog.setCancelable(false);
        Unit unit = Unit.INSTANCE;
        hMHeadsetSettingActivity.loadingDlg = loadingDialogShowDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HMHeadsetSettingActivity hMHeadsetSettingActivity) {
        LoadingDialog loadingDialog = hMHeadsetSettingActivity.loadingDlg;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setSuccess(hMHeadsetSettingActivity.getString(R.string.device_unbind_success));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HMHeadsetSettingActivity hMHeadsetSettingActivity) {
        LoadingDialog loadingDialog = hMHeadsetSettingActivity.loadingDlg;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        hMHeadsetSettingActivity.loadingDlg = null;
        hMHeadsetSettingActivity.finish();
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindFailure(@Nullable UnbindError error, @Nullable HMDeviceType type) {
        final HMHeadsetSettingActivity hMHeadsetSettingActivity = this.a;
        hMHeadsetSettingActivity.runOnUiThread(new Runnable() { // from class: uy2
            @Override // java.lang.Runnable
            public final void run() {
                HMHeadsetSettingActivity$unbindListener$1.f(hMHeadsetSettingActivity);
            }
        });
        Button button = (Button) this.a.findViewById(R.id.setting_unbind);
        final HMHeadsetSettingActivity hMHeadsetSettingActivity2 = this.a;
        button.postDelayed(new Runnable() { // from class: vy2
            @Override // java.lang.Runnable
            public final void run() {
                HMHeadsetSettingActivity$unbindListener$1.g(hMHeadsetSettingActivity2);
            }
        }, 1500L);
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindStart(@Nullable HMDeviceType type) {
        final HMHeadsetSettingActivity hMHeadsetSettingActivity = this.a;
        hMHeadsetSettingActivity.runOnUiThread(new Runnable() { // from class: xy2
            @Override // java.lang.Runnable
            public final void run() {
                HMHeadsetSettingActivity$unbindListener$1.h(hMHeadsetSettingActivity);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindSuccess(@Nullable HMDeviceType type) {
        final HMHeadsetSettingActivity hMHeadsetSettingActivity = this.a;
        hMHeadsetSettingActivity.runOnUiThread(new Runnable() { // from class: yy2
            @Override // java.lang.Runnable
            public final void run() {
                HMHeadsetSettingActivity$unbindListener$1.i(hMHeadsetSettingActivity);
            }
        });
        Button button = (Button) this.a.findViewById(R.id.setting_unbind);
        final HMHeadsetSettingActivity hMHeadsetSettingActivity2 = this.a;
        button.postDelayed(new Runnable() { // from class: wy2
            @Override // java.lang.Runnable
            public final void run() {
                HMHeadsetSettingActivity$unbindListener$1.j(hMHeadsetSettingActivity2);
            }
        }, 1500L);
    }
}

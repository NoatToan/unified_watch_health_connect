package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.update.DeviceOtaActivity;
import com.huawei.ui.device.activity.update.UpdateVersionActivity;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class ram {
    public static String e(Context context, int i) {
        if (context == null) {
            ReleaseLogUtil.e("DEVMGR_UpdateUtils", "getErrorMessage context is null");
            return "";
        }
        ReleaseLogUtil.d("DEVMGR_UpdateUtils", "getErrorMessage result is,", Integer.valueOf(i));
        if (i == 1) {
            return context.getString(R.string.IDS_update_download_check_failed);
        }
        if (i == 3) {
            return context.getString(R.string.IDS_update_network_abnormal);
        }
        if (i != 4) {
            return context.getString(R.string.IDS_update_download_failed);
        }
        return qrs.ah(BaseApplication.getContext()) ? context.getString(R.string.IDS_pad_phone_low_battery, UnitUtil.e(10.0d, 2, 0)) : context.getString(R.string.IDS_settings_firmware_upgrade_phone_low_battery);
    }

    public static void c(Context context, boolean z, String str) {
        ReleaseLogUtil.d("DEVMGR_UpdateUtils", " enterDeviceOtaActivity()");
        try {
            Intent intent = new Intent();
            intent.setClass(context, DeviceOtaActivity.class);
            intent.putExtra("is_package_already_exists", z);
            intent.putExtra("device_id", str);
            intent.addFlags(131072);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("UpdateUtils", "enterDeviceOtaActivity exception：", ExceptionUtils.c(e));
        }
    }

    public static void e(final UpdateVersionActivity updateVersionActivity, final DeviceInfo deviceInfo, final boolean z) {
        if (updateVersionActivity != null) {
            LogUtil.a("UpdateUtils", "showEnterpriseAgreementDialog enter");
            CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(updateVersionActivity).a(View.inflate(updateVersionActivity, R.layout.dialog_enterprise_customization_agreement, null)).a(R.string.IDS_hw_common_ui_dialog_cancel, new DialogInterface.OnClickListener() { // from class: ram.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("UpdateUtils", "start customAlertDialog, user click Negative button!");
                    dialogInterface.dismiss();
                }
            }).d(R.string.IDS_user_permission_ok, new DialogInterface.OnClickListener() { // from class: ram.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("UpdateUtils", "start showEnterpriseAgreementDialog,permission_ok: ", Boolean.valueOf(z));
                    if (z) {
                        updateVersionActivity.b();
                    }
                    nvd.i("1", deviceInfo.getDeviceIdentify(), updateVersionActivity);
                    max.c().c(deviceInfo, "1");
                }
            }).b();
            if (customAlertDialogB == null || customAlertDialogB.isShowing()) {
                return;
            }
            customAlertDialogB.setCancelable(false);
            customAlertDialogB.show();
        }
    }

    public static boolean d(DeviceInfo deviceInfo) {
        if (!eey.d(deviceInfo, 108) || Utils.k()) {
            return Build.VERSION.SDK_INT > 30 && CommonUtil.bg() && a(deviceInfo);
        }
        LogUtil.j("UpdateUtils", "isSupportWlanTransmit is Galileo");
        return false;
    }

    public static boolean a(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 35) || eey.d(deviceInfo, 76);
    }

    public static boolean b(Context context) {
        boolean z = false;
        if (context == null) {
            LogUtil.j("UpdateUtils", "isWifiEnabled context is null");
            return false;
        }
        Object systemService = context.getSystemService("wifi");
        if ((systemService instanceof WifiManager) && ((WifiManager) systemService).getWifiState() == 3) {
            z = true;
        }
        ReleaseLogUtil.d("DEVMGR_UpdateUtils", "isWifiEnabled:", Boolean.valueOf(z));
        return z;
    }

    public static class c extends Handler {
        private WeakReference<UpdateVersionActivity> d;

        public c(UpdateVersionActivity updateVersionActivity) {
            this.d = new WeakReference<>(updateVersionActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("UpdateUtils", "UpgradeHandler message is null");
                return;
            }
            UpdateVersionActivity updateVersionActivity = this.d.get();
            if (updateVersionActivity == null) {
                LogUtil.j("UpdateUtils", "UpgradeHandler activity is null");
                return;
            }
            ReleaseLogUtil.d("DEVMGR_UpdateUtils", "UpgradeHandler message is, ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                updateVersionActivity.d();
                return;
            }
            if (i == 2) {
                if (updateVersionActivity.isDestroyed()) {
                    return;
                }
                updateVersionActivity.e();
            } else {
                if (i != 3) {
                    LogUtil.a("UpdateUtils", "UpgradeHandler default");
                    return;
                }
                if (message.arg1 == 0 && (message.obj instanceof String)) {
                    a((String) message.obj);
                }
                updateVersionActivity.finish();
            }
        }

        private void a(String str) {
            Intent intent = new Intent();
            intent.putExtra("UNIQUE_ID", str);
            intent.setClassName(BaseApplication.getContext().getPackageName(), ComponentInfo.PluginWearAbility_A_0);
            dad.c().launchActivity(this.d.get(), intent);
            ReleaseLogUtil.d("DEVMGR_UpdateUtils", "launchActivity OtaTempActivity");
        }
    }
}

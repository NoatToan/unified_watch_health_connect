package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.utlis.clouddevice.DevicePopTipBiUtil;
import com.huawei.ui.homewear21.R;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class ruy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DeviceInfo f47745a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f47746b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static BackLogCallback<Integer> f47747c = null;
    public static int d = 0;
    public static boolean e = false;
    private static boolean f = false;
    private static NoTitleCustomAlertDialog h = null;
    public static String j = "";

    public static void e(final Activity activity, final DeviceInfo deviceInfo, BackLogCallback<Integer> backLogCallback) {
        j = deviceInfo.getDeviceIdentify();
        d = deviceInfo.getDeviceBluetoothType();
        f47745a = deviceInfo;
        f47747c = backLogCallback;
        f = true;
        tqp.b(deviceInfo, DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
        SimpleChain.b("secretReconnect").e(new SimpleChain.INext() { // from class: rva
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                ruy.a(emitter, activity, deviceInfo);
            }
        }).e(new SimpleChain.INext() { // from class: ruz
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                ruy.d(emitter, activity, deviceInfo);
            }
        }).d(new SimpleChain.Emitter() { // from class: rvb
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("SecretMessageUtils", "unbind success,wait reconnect");
            }
        }, new Object[0]);
    }

    public static void b(int i, int i2, Intent intent) {
        boolean z = f;
        if (!z) {
            ReleaseLogUtil.d("R_SecretMessageUtils", "onActivityResult isRuning:", Boolean.valueOf(z));
            return;
        }
        if (i == 608) {
            ReleaseLogUtil.d("R_SecretMessageUtils", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                health.compact.a.ReleaseLogUtil.c("R_SecretMessageUtils", "setString SENSITIVE_PERMISSION_STATUS restart");
                tqp.e(j, intent);
                e();
                return;
            }
            b();
        }
    }

    public static void b() {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null || activityJ.isFinishing() || activityJ.isDestroyed()) {
            LogUtil.a("SecretMessageUtils", "showMissSensitiveNotificationDialog activity is null or finishing or destroyed");
            return;
        }
        b(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION_SECONDARY, DevicePopTipBiUtil.Action.NONE, DevicePopTipBiUtil.Event.SHOW);
        a();
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activityJ).a(activityJ.getResources().getString(R.string.IDS_miss_sensitive_notification_content)).c(R.string.IDS_go_setting, new View.OnClickListener() { // from class: rvf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ruy.a(activityJ, view);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: rvc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ruy.b(view);
            }
        }).c();
        h = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        h.show();
    }

    static /* synthetic */ void a(Activity activity, View view) {
        LogUtil.a("SecretMessageUtils", "requestPermissions try again");
        b(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION_SECONDARY, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
        rdp.a(j, activity, d);
    }

    static /* synthetic */ void b(View view) {
        b(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION_SECONDARY, DevicePopTipBiUtil.Action.CANCEL, DevicePopTipBiUtil.Event.CLICK);
        e();
    }

    private static void b(DevicePopTipBiUtil.Content content, DevicePopTipBiUtil.Action action, DevicePopTipBiUtil.Event event) {
        DeviceInfo deviceInfo = f47745a;
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_SecretMessageUtils", "reportWechatTipBiEvent mCurrentDeviceInfo is null");
            return;
        }
        DevicePopTipBiUtil.TipType tipType = DevicePopTipBiUtil.TipType.TIP;
        String deviceName = deviceInfo.getDeviceName();
        int productType = deviceInfo.getProductType();
        DevicePopTipBiUtil.a(tipType, content, action, deviceName, String.valueOf(productType), deviceInfo.getHiLinkDeviceId(), DevicePopTipBiUtil.Page.TO_DO_PAGE, event);
    }

    private static void e() {
        BackLogCallback<Integer> backLogCallback = f47747c;
        if (backLogCallback != null) {
            backLogCallback.onSuccess(0);
            f47747c = null;
        }
        f47746b = false;
        e = false;
        j = "";
        d = 0;
        f47745a = null;
        a();
        f = false;
    }

    private static void a() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = h;
        if (noTitleCustomAlertDialog != null) {
            try {
                noTitleCustomAlertDialog.dismiss();
            } catch (IllegalArgumentException e2) {
                LogUtil.e("SecretMessageUtils", "Failed to dismiss dialog: ", ExceptionUtils.c(e2));
            } finally {
                h = null;
            }
        }
    }

    public static void a(SimpleChain.Emitter emitter, Activity activity, DeviceInfo deviceInfo) {
        if (lwg.d().e(deviceInfo.getDeviceIdentify())) {
            b(activity);
            emitter.onError("device isOtaUpdate");
        } else {
            emitter.onSuccess(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(SimpleChain.Emitter emitter, Activity activity, DeviceInfo deviceInfo) {
        int deviceBluetoothType = deviceInfo.getDeviceBluetoothType();
        ReleaseLogUtil.d("R_SecretMessageUtils", "unbindAndReconnectDevice deviceBlueToothType:", Integer.valueOf(deviceBluetoothType));
        rdp.a(deviceInfo.getDeviceIdentify(), activity, deviceBluetoothType);
        emitter.onSuccess(new Object[0]);
    }

    private static void b(Activity activity) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(activity.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: rux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("SecretMessageUtils", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }
}

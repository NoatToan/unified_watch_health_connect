package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.device.callback.ScaleDialogCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dys;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class dys {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dys f32530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32531c = new Object();
    private CustomAlertDialog d;
    private NoTitleCustomAlertDialog e;

    public static dys a() {
        dys dysVar;
        synchronized (f32531c) {
            if (f32530b == null) {
                f32530b = new dys();
            }
            dysVar = f32530b;
        }
        return dysVar;
    }

    public boolean e(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "checkPairStatusAndBluetooth activity is null or uniqueId is null");
            return false;
        }
        if (!(dmp.d().b(str, true) instanceof efx)) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "checkPairStatusAndBluetooth pair invalid");
            if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                c(activity, 1);
                return true;
            }
        }
        return false;
    }

    public void c(final Activity activity, int i) {
        Dialog dialogC;
        if (activity == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showOpenBluetoothSwitch context is null");
            return;
        }
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showOpenBluetoothSwitch dialogType: ", Integer.valueOf(i));
        if (i == 1) {
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
            builder.a(R.string.IDS_device_bluetooth_open).b(R.string.IDS_device_bluetooth_open_request).e(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: dyp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_ScaleDialogHelper", "showOpenBluetoothSwitch title NegativeButton");
                }
            }).a(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: dzc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.c(activity, view);
                }
            });
            dialogC = builder.b();
        } else if (i != 2) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showOpenBluetoothSwitch else type");
            dialogC = null;
        } else {
            String string = activity.getResources().getString(R.string.IDS_app_name_health);
            String string2 = activity.getResources().getString(R.string.IDS_device_bt_open_request_info);
            NoTitleCustomAlertDialog.Builder builder2 = new NoTitleCustomAlertDialog.Builder(activity);
            builder2.a(String.format(Locale.ENGLISH, string2, string)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: dzm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32542a.b(activity, view);
                }
            }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: dzn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_ScaleDialogHelper", "showOpenBluetoothSwitch no title NegativeButton");
                }
            });
            dialogC = builder2.c();
        }
        if (dialogC != null) {
            dialogC.setCancelable(false);
            dialogC.show();
        }
    }

    /* synthetic */ void c(Activity activity, View view) {
        e(activity);
    }

    /* synthetic */ void b(Activity activity, View view) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showOpenBluetoothSwitch no title enable bluetooth");
        e(activity);
    }

    public void e(Activity activity) {
        if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(activity, PermissionUtil.PermissionType.SCAN, new CustomPermissionAction(activity) { // from class: dys.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    dys.this.c();
                }
            });
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        BTDeviceMgrUtil.c().c(new BtSwitchStateCallback() { // from class: dzk
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public final void onBtSwitchStateCallback(int i) {
                ReleaseLogUtil.d("PluginDevice_ScaleDialogHelper", "enable bluetooth result ", Integer.valueOf(i));
            }
        });
    }

    public void b(final Activity activity) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showBluetoothGpsDialog enter");
        if (activity == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showBluetoothGpsDialog, context is null");
        } else {
            if (activity.isFinishing()) {
                LogUtil.j("PluginDevice_ScaleDialogHelper", "showBluetoothGpsDialog,activity is finishing");
                return;
            }
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).b(R.string.IDS_open_location_service).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dyo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_ScaleDialogHelper", "showBluetoothGpsDialog negativeButton onclick");
                }
            }).c(R.string.IDS_open_location_service_allow, new View.OnClickListener() { // from class: dyx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dys.a(activity, view);
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        }
    }

    static /* synthetic */ void a(Activity activity, View view) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showBluetoothGpsDialog setPositiveButton startActivity");
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        try {
            ecj.e(activity, intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PluginDevice_ScaleDialogHelper", "showBluetoothGpsDialog ActivityNotFoundException");
            intent.setAction("android.settings.SETTINGS");
            ecj.e(activity, intent);
        }
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showBluetoothGpsDialog setPositiveButton startSystemActivity done");
    }

    public void c(final Activity activity) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showConfigNetworkGpsDialog enter");
        if (activity == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showConfigNetworkGpsDialog, context is null");
            return;
        }
        if (activity.isFinishing()) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showConfigNetworkGpsDialog,activity is finishing");
            return;
        }
        if (this.e == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
            builder.b(R.string.IDS_device_wifi_gps_service_prompt_msg).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: dzh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dys.d(activity, view);
                }
            }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dzg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("PluginDevice_ScaleDialogHelper", "showConfigNetworkGpsDialog: click negative button");
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.e = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.e;
        if (noTitleCustomAlertDialog == null || noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        this.e.show();
    }

    static /* synthetic */ void d(Activity activity, View view) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showConfigNetworkGpsDialog: click positive button");
        Intent intent = new Intent();
        intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
        try {
            ecj.e(activity, intent);
        } catch (ActivityNotFoundException unused) {
            intent.setAction("android.settings.SETTINGS");
            ecj.e(activity, intent);
        }
    }

    public void b(final Context context) {
        int i;
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showWifiSwitchEnableDialog enter");
        if (context == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showWifiEnableDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        if (Utils.o()) {
            i = R.string.IDS_device_wifi_open_over_sea;
        } else {
            i = R.string.IDS_device_wifi_open_wifi_tip_msg;
        }
        builder.b(i).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.d("PluginDevice_ScaleDialogHelper", "showWifiEnableDialog() do nothing");
            }
        }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.health.device.util.ScaleDialogHelper$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dys.c(context, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static /* synthetic */ void c(Context context, View view) {
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService instanceof WifiManager) {
            if (((WifiManager) systemService).setWifiEnabled(true)) {
                LogUtil.a("PluginDevice_ScaleDialogHelper", "showWifiEnableDialog() wifi is open");
            } else {
                ecs.l(context);
            }
        }
    }

    public void e(Context context, final ScaleDialogCallback scaleDialogCallback) {
        int i;
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showWifiSwitchEnableDialog callback enter");
        if (context == null || scaleDialogCallback == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showWifiSwitchEnableDialog callback or context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        if (Utils.o()) {
            i = R.string.IDS_device_wifi_open_over_sea;
        } else {
            i = R.string.IDS_device_wifi_open_wifi_tip_msg;
        }
        builder.b(i).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dys.i(scaleDialogCallback, view);
            }
        }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: dzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dys.m(scaleDialogCallback, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void i(ScaleDialogCallback scaleDialogCallback, View view) {
        LogUtil.d("PluginDevice_ScaleDialogHelper", "showWifiSwitchEnableDialog() negative do nothing");
        scaleDialogCallback.operationResult(1);
    }

    static /* synthetic */ void m(ScaleDialogCallback scaleDialogCallback, View view) {
        LogUtil.d("PluginDevice_ScaleDialogHelper", "showWifiSwitchEnableDialog() positive");
        scaleDialogCallback.operationResult(0);
    }

    public void d(Context context) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showOtaDisconnectDialog enter");
        if (context == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showOtaDisconnectDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.b(R.string.IDS_device_wifi_ota_prompt_msg);
        builder.c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: dyy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.j("PluginDevice_ScaleDialogHelper", "showOtaDisconnectDialog click positive");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void d(Context context, final ScaleDialogCallback scaleDialogCallback) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showWeightMeasureFailedDialog enter");
        if (context == null || scaleDialogCallback == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showWeightMeasureFailedDialog callback or context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.b(R.string.IDS_device_measure_fail);
        builder.c(R.string.IDS_device_permisson, new View.OnClickListener() { // from class: dyu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(0);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void i(Activity activity) {
        if (activity == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showWifiOtaActivationPromptDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(R.string.IDS_device_wifi_ota_prompt_msg).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: dzd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_ScaleDialogHelper", "showWifiOtaActivationPromptDialog PositiveButton");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing() || activity.isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    public void g(Activity activity) {
        if (activity == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showWifiOtaGuideInactivePromptDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(R.string.IDS_device_wifi_ota_activation_prompt_msg).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: dza
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_ScaleDialogHelper", "showWifiOtaGuideInactivePromptDialog PositiveButton");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing() || activity.isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    public void d(final Activity activity) {
        int i;
        if (activity == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showOpenPhoneWifiList context is null");
            return;
        }
        if (qrs.ah(BaseApplication.getContext())) {
            i = R.string.IDS_device_open_tablet_wifi;
        } else {
            i = R.string.IDS_device_open_phone_wifi;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(i).c(R.string.IDS_device_wifi_go_connect, new View.OnClickListener() { // from class: dyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dys.e(activity, view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_ScaleDialogHelper", "showOpenPhoneWifiList click cancel");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing() || activity.isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void e(Activity activity, View view) {
        LogUtil.a("PluginDevice_ScaleDialogHelper", "showOpenPhoneWifiList click positive");
        try {
            activity.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            LogUtil.a("PluginDevice_ScaleDialogHelper", "showOpenPhoneWifiList ActivityNotFoundException");
        }
    }

    public void a(Activity activity) {
        if (activity == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showLoadingFailDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(R.string.IDS_device_hagrid_loading_info_failed_prompt).c(R.string.IDS_device_measureactivity_result_confirm, new View.OnClickListener() { // from class: dzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PluginDevice_ScaleDialogHelper", "showLoadingFailDialog click");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void e(Activity activity, final ScaleDialogCallback scaleDialogCallback) {
        if (activity == null || scaleDialogCallback == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showDeviceShareNotBelongUserDialog context is null");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.e(BaseApplication.getContext().getString(R.string.IDS_device_bluetooth_open)).a(BaseApplication.getContext().getString(R.string.IDS_device_hygride_paired_fail_tips)).b(BaseApplication.getContext().getString(R.string.IDS_device_hagrid_scale_use_guide_know_detail), new View.OnClickListener() { // from class: dzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(0);
            }
        }).a(BaseApplication.getContext().getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: dzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(1);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public void b(Activity activity, final ScaleDialogCallback scaleDialogCallback) {
        if (activity == null || scaleDialogCallback == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showDeviceBindInvalidDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(R.string.IDS_device_bluetooth_rebind_msg_new).c(com.huawei.ui.commonui.R.string.IDS_btsdk_confirm_repair, new View.OnClickListener() { // from class: dyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(0);
            }
        }).a(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dyv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(1);
            }
        });
        builder.c().show();
    }

    public void b(Activity activity, View view, final ScaleDialogCallback scaleDialogCallback) {
        if (activity == null || scaleDialogCallback == null || view == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showConfigureAutoUpgradeDialog context is null");
            return;
        }
        CustomAlertDialog customAlertDialog = this.d;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            this.d.dismiss();
            LogUtil.j("PluginDevice_ScaleDialogHelper", "configureAutoUpgradeDialog is showing");
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(activity);
        builder.a(view).d(R.string.IDS_device_auto_upgrade_tip).d(R.string.IDS_device_upgrade_now, new DialogInterface.OnClickListener() { // from class: dyw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f32532b.d(scaleDialogCallback, dialogInterface, i);
            }
        }).a(R.string.IDS_device_hygride_button_cancel, new DialogInterface.OnClickListener() { // from class: dzb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f32537a.a(scaleDialogCallback, dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.d = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.d.show();
    }

    /* synthetic */ void d(ScaleDialogCallback scaleDialogCallback, DialogInterface dialogInterface, int i) {
        scaleDialogCallback.operationResult(0);
        this.d = null;
    }

    /* synthetic */ void a(ScaleDialogCallback scaleDialogCallback, DialogInterface dialogInterface, int i) {
        scaleDialogCallback.operationResult(1);
        this.d = null;
    }

    public void a(Context context, final ScaleDialogCallback scaleDialogCallback) {
        if (context == null || scaleDialogCallback == null) {
            LogUtil.j("PluginDevice_ScaleDialogHelper", "showOpenSystemMessageSwitch context is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_hwh_agreement_ove_msg).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: dzq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(0);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(1);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void b(Context context, final ScaleDialogCallback scaleDialogCallback) {
        String string;
        String string2;
        if (Utils.o()) {
            string = context.getString(R.string.enable_the_network_over_sea);
            string2 = context.getString(R.string.IDS_device_wifi_tip_over_sea);
        } else {
            string = context.getString(R.string.enable_the_network);
            string2 = context.getString(R.string.IDS_device_request_auto_sync_data_open_wifi_tip_msg);
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(string).a(string2).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(1);
            }
        }).a(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: dzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                scaleDialogCallback.operationResult(0);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    public void b() {
        d();
    }

    private static void d() {
        synchronized (f32531c) {
            f32530b = null;
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.view.View;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes7.dex */
public class dxe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomViewDialog f32479c;
    private NoTitleCustomAlertDialog e;

    public boolean c(Context context) {
        if (context != null) {
            return PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED;
        }
        LogUtil.j("GpslUtil", "checkGpsIsAcceptPermission, context is null");
        return false;
    }

    public void e(Context context) {
        LogUtil.a("GpslUtil", "enter createGpsAskDialog ****");
        if (context == null) {
            LogUtil.j("GpslUtil", "createGpsAskDialog, context or handler is null");
            return;
        }
        if (context instanceof DeviceMainActivity) {
            final DeviceMainActivity deviceMainActivity = (DeviceMainActivity) context;
            if (deviceMainActivity.isFinishing()) {
                LogUtil.j("GpslUtil", "createGpsAskDialog,activity is finishing");
                return;
            }
            NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.e;
            if (noTitleCustomAlertDialog != null) {
                if (noTitleCustomAlertDialog.isShowing()) {
                    this.e.dismiss();
                }
                this.e = null;
            }
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_ask_location_permission_content).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dxb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.c(view);
                }
            }).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: dxa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32473c.e(deviceMainActivity, view);
                }
            }).c();
            this.e = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.e.show();
        }
    }

    /* synthetic */ void c(View view) {
        LogUtil.a("GpslUtil", "createGpsAskDialog setNegativeButton");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.e;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.e = null;
        }
    }

    /* synthetic */ void e(DeviceMainActivity deviceMainActivity, View view) {
        LogUtil.a("GpslUtil", "createGpsAskDialog enable");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.e;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.e = null;
        }
        e(deviceMainActivity);
    }

    private void e(final DeviceMainActivity deviceMainActivity) {
        PermissionUtil.d(deviceMainActivity, PermissionUtil.PermissionType.LOCATION, new PermissionsResultAction() { // from class: dxe.1
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("GpslUtil", "requestPermission onGranted");
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("GpslUtil", "requestPermission onDenied");
                dxe.this.a(deviceMainActivity);
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                super.onForeverDenied(permissionType);
                LogUtil.a("GpslUtil", "requestPermission onForeverDenied");
                dxe.this.a(deviceMainActivity);
            }
        });
    }

    public void a(final DeviceMainActivity deviceMainActivity) {
        if (deviceMainActivity == null) {
            LogUtil.j("GpslUtil", "createGpsDialog, context is null");
            return;
        }
        LogUtil.a("GpslUtil", "enter createGpsDialog");
        if (deviceMainActivity.isFinishing()) {
            LogUtil.j("GpslUtil", "createGpsDialog,activity is finishing");
            return;
        }
        CustomViewDialog customViewDialog = this.f32479c;
        if (customViewDialog != null) {
            if (customViewDialog.isShowing()) {
                this.f32479c.dismiss();
            }
            this.f32479c = null;
        }
        View viewInflate = View.inflate(deviceMainActivity, R.layout.dialog_user_auth_message, null);
        String string = deviceMainActivity.getResources().getString(R.string.IDS_open_location_permission_content, "");
        ((HealthTextView) viewInflate.findViewById(R.id.dialog_text_alert_message)).setText(deviceMainActivity.getResources().getString(R.string.IDS_location_permission_use, ""));
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(deviceMainActivity).b(true).a(string).d(viewInflate).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        }).d(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: dxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(deviceMainActivity, view);
            }
        }).d();
        this.f32479c = customViewDialogD;
        customViewDialogD.setCancelable(false);
        this.f32479c.show();
    }

    /* synthetic */ void d(View view) {
        CustomViewDialog customViewDialog = this.f32479c;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
            this.f32479c = null;
        }
    }

    /* synthetic */ void a(DeviceMainActivity deviceMainActivity, View view) {
        CustomViewDialog customViewDialog = this.f32479c;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
            this.f32479c = null;
        }
        a(deviceMainActivity, 2);
    }

    public void a(DeviceMainActivity deviceMainActivity, int i) {
        if (deviceMainActivity == null) {
            LogUtil.j("GpslUtil", "startAppSettingActivity, context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", deviceMainActivity.getPackageName(), null));
        deviceMainActivity.startActivityForResult(intent, i);
    }

    public boolean b(Context context) {
        boolean zA = a(context);
        LogUtil.a("GpslUtil", "gpsLocationisEnable isGpsEnable is ", Boolean.valueOf(zA));
        return zA;
    }

    public boolean a(Context context) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        if (context == null) {
            LogUtil.j("GpslUtil", "context is null");
            return false;
        }
        Object systemService = context.getSystemService("location");
        if (systemService instanceof LocationManager) {
            LocationManager locationManager = (LocationManager) systemService;
            zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            zIsProviderEnabled = locationManager.isProviderEnabled("network");
        } else {
            zIsProviderEnabled = false;
            zIsProviderEnabled2 = false;
        }
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }
}

package com.huawei.health.ecologydevice.ui.util;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.elh;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class PermissionDialogHelper {
    private Activity d;
    private PermissionDialogCallback e;

    public interface OpenBlueToothAction {
        void onPermissionDenied();

        void onPermissionGranted();
    }

    public interface PermissionDialogCallback {
        void onResult(boolean z);
    }

    public static /* synthetic */ void c(View view) {
    }

    public PermissionDialogHelper(Activity activity, PermissionDialogCallback permissionDialogCallback) {
        this.d = activity;
        this.e = permissionDialogCallback;
    }

    public void d(elh elhVar, String str) {
        int iC = elhVar.v().c();
        LogUtil.a("PermissionDialogHelper", "ProductIntroductionFragment onClick scanMode is ", Integer.valueOf(iC));
        if ((iC != 1 && iC != 2) || BluetoothAdapter.getDefaultAdapter().getState() == 12) {
            HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
            if (honourDeviceConstantsApi.isHonourDevice(str)) {
                LogUtil.a("PermissionDialogHelper", "isHonourDevice");
                if (!honourDeviceConstantsApi.getAm16PermissionTip()) {
                    LogUtil.a("PermissionDialogHelper", "isHonourDevice showPermissionDialogTip");
                    e();
                    return;
                } else {
                    LogUtil.a("PermissionDialogHelper", "isHonourDevice checkHavePermission");
                    d(PermissionUtil.PermissionType.PHONE_STATE);
                    return;
                }
            }
            this.e.onResult(BluetoothAdapter.getDefaultAdapter().isEnabled());
            return;
        }
        this.e.onResult(BluetoothAdapter.getDefaultAdapter().isEnabled());
    }

    public static boolean d(String str) {
        boolean z = Build.VERSION.SDK_INT >= 29;
        if (!"825c82bd-84fe-44a0-9884-6a764bd73183".contains(str) || CommonUtil.bg() || !z) {
            return false;
        }
        LogUtil.j("PermissionDialogHelper", "not support hdp protocol");
        return true;
    }

    private void e() {
        Activity activity = this.d;
        if (activity != null) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(String.format(Locale.ENGLISH, activity.getResources().getString(R.string.IDS_plugin_device_am16_permission_tips), this.d.getResources().getString(R.string.IDS_DEVICE_HONOUR_WIRED_830_41))).d(this.d.getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: ero
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionDialogHelper.c(view);
                }
            }).a(this.d.getString(R.string.IDS_user_permission_ok), new View.OnClickListener() { // from class: ern
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33392c.d(view);
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        }
    }

    public /* synthetic */ void d(View view) {
        ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).setAm16PermissionTip();
        d(PermissionUtil.PermissionType.PHONE_STATE);
    }

    public void d(PermissionUtil.PermissionType permissionType) {
        if (this.d != null) {
            LogUtil.a("PermissionDialogHelper", "checkHavePermission");
            PermissionUtil.d(this.d, permissionType, new CustomPermissionAction(this.d) { // from class: com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    PermissionDialogHelper permissionDialogHelper = PermissionDialogHelper.this;
                    permissionDialogHelper.b(permissionDialogHelper.d);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType2) {
                    super.onForeverDenied(permissionType2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        PermissionUtil.d(activity, PermissionUtil.PermissionType.AUDIO_CALLS, new PermissionsResultAction() { // from class: com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("PermissionDialogHelper", "onGranted");
                PermissionDialogHelper.this.e.onResult(BluetoothAdapter.getDefaultAdapter().isEnabled());
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("PermissionDialogHelper", "onDenied ", str);
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                super.onForeverDenied(permissionType);
                qrs.a(PermissionDialogHelper.this.d, PermissionDialogHelper.this.d.getString(R.string.IDS_device_am16_permission_str));
            }
        });
    }

    public static PermissionUtil.PermissionType c() {
        if (Build.VERSION.SDK_INT > 30) {
            return PermissionUtil.PermissionType.SCAN;
        }
        return PermissionUtil.PermissionType.LOCATION;
    }

    private static PermissionUtil.PermissionResult c(Context context, PermissionUtil.PermissionType permissionType) {
        if (context == null) {
            LogUtil.a("PermissionDialogHelper", "Permission context is null!");
            return PermissionUtil.PermissionResult.DENIED;
        }
        if (Build.VERSION.SDK_INT < 29) {
            LogUtil.a("PermissionDialogHelper", "Permission small than Q result be Denied");
            return PermissionUtil.PermissionResult.DENIED;
        }
        return PermissionUtil.e(context, permissionType);
    }

    public static void e(Activity activity, PermissionUtil.PermissionType permissionType, CustomPermissionAction customPermissionAction) {
        if (activity == null) {
            LogUtil.j("PermissionDialogHelper", "Activity is null!");
            customPermissionAction.onDenied("activity is null!");
        } else if (c(activity, permissionType) == PermissionUtil.PermissionResult.GRANTED) {
            LogUtil.a("PermissionDialogHelper", "Permission permission check onGrand");
            customPermissionAction.onGranted();
        } else {
            PermissionUtil.d(activity, permissionType, customPermissionAction);
        }
    }

    public static boolean c(Activity activity) {
        return Build.VERSION.SDK_INT <= 30 || PermissionUtil.e(activity, PermissionUtil.PermissionType.SCAN) == PermissionUtil.PermissionResult.GRANTED;
    }

    public static void d(Activity activity, OpenBlueToothAction openBlueToothAction) {
        if (activity == null) {
            LogUtil.e("PermissionDialogHelper", "openBlueTooth the activity is null!");
        } else if (Build.VERSION.SDK_INT <= 30) {
            LogUtil.a("PermissionDialogHelper", "openBlueTooth Phone is below to Android 12");
            openBlueToothAction.onPermissionGranted();
        } else {
            PermissionUtil.d(activity, PermissionUtil.PermissionType.SCAN, new AnonymousClass4(activity, openBlueToothAction, activity));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper$4, reason: invalid class name */
    public class AnonymousClass4 extends CustomPermissionAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OpenBlueToothAction f6663b;
        final /* synthetic */ Activity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, OpenBlueToothAction openBlueToothAction, Activity activity) {
            super(context);
            this.f6663b = openBlueToothAction;
            this.e = activity;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("PermissionDialogHelper", "openBlueTooth doActionWithPermissions onGranted");
            this.f6663b.onPermissionGranted();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            LogUtil.a("PermissionDialogHelper", "openBlueTooth doActionWithPermissions onDenied");
            this.f6663b.onPermissionDenied();
            qpx.e(this.e, R.string.IDS_nearby_permission_exception);
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            LogUtil.a("PermissionDialogHelper", "openBlueTooth doActionWithPermissions onForeverDenied");
            final OpenBlueToothAction openBlueToothAction = this.f6663b;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: erp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    openBlueToothAction.onPermissionDenied();
                }
            };
            final OpenBlueToothAction openBlueToothAction2 = this.f6663b;
            onForeverDenied(permissionType, onClickListener, new View.OnClickListener() { // from class: erm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    openBlueToothAction2.onPermissionDenied();
                }
            });
        }
    }

    public static void d(final Activity activity, final int i) {
        d(activity, new OpenBlueToothAction() { // from class: com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.1
            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionGranted() {
                try {
                    activity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), i);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("PermissionDialogHelper", "openBlueTooth from activity ActivityNotFoundException!");
                }
            }

            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionDenied() {
                LogUtil.e("PermissionDialogHelper", "openBlueTooth from activity onPermissionDenied!");
            }
        });
    }

    public static void a(final Fragment fragment, final int i) {
        if (fragment == null) {
            LogUtil.e("PermissionDialogHelper", "openBlueTooth from fragment the fragment is null!");
        } else {
            d(fragment.getActivity(), new OpenBlueToothAction() { // from class: com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.3
                @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
                public void onPermissionGranted() {
                    try {
                        fragment.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), i);
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("PermissionDialogHelper", "openBlueTooth from fragment ActivityNotFoundException!");
                    }
                }

                @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
                public void onPermissionDenied() {
                    LogUtil.e("PermissionDialogHelper", "openBlueTooth from fragment onPermissionDenied!");
                }
            });
        }
    }
}

package com.huawei.ui.device.utlis;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class BluetoothPermisionUtils {
    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT <= 30) {
            return PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED;
        }
        return d(context);
    }

    public static boolean d(Context context) {
        if (Build.VERSION.SDK_INT <= 30) {
            ReleaseLogUtil.d("R_BluetoothPermisionUtils", "checkNearbyPermission SDK_INT <= R");
            return true;
        }
        if (context == null) {
            ReleaseLogUtil.d("R_BluetoothPermisionUtils", "checkNearbyPermission context == null");
            return false;
        }
        PermissionUtil.PermissionResult permissionResultE = PermissionUtil.e(context, PermissionUtil.PermissionType.SCAN);
        ReleaseLogUtil.d("R_BluetoothPermisionUtils", "checkNearbyPermission result=", permissionResultE);
        return permissionResultE == PermissionUtil.PermissionResult.GRANTED;
    }

    public static void e(final Activity activity, final boolean z) {
        if (activity == null) {
            LogUtil.j("BluetoothPermisionUtils", "gotoSettingActivity activity == null");
        } else {
            new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_hwh_home_other_permissions_title).a(activity.getString(R.string.IDS_hw_bluetooth_permission_guide)).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: rdr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BluetoothPermisionUtils.c(z, activity, view);
                }
            }).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: rds
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BluetoothPermisionUtils.b(activity, z, view);
                }
            }).b().show();
        }
    }

    public static /* synthetic */ void c(boolean z, Activity activity, View view) {
        if (z) {
            activity.finish();
        }
    }

    public static /* synthetic */ void b(Activity activity, boolean z, View view) {
        qrs.al(activity);
        if (z) {
            activity.finish();
        }
    }

    public static abstract class NearbyPermissionAction extends CustomPermissionAction {
        private final Context mContext;

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
        }

        public NearbyPermissionAction(Context context) {
            super(context);
            this.mContext = context;
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            BluetoothPermisionUtils.e((Activity) this.mContext, false);
        }
    }
}

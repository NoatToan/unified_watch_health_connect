package com.mipay.sdk.permission;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.mipay.sdk.app.WebConstants;
import com.miui.tsmclient.util.Constants;

/* JADX INFO: loaded from: classes.dex */
public class PermissionManager {
    private static final String LOG_TAG = "PermissionManager";

    public interface OnPermissionCancelListener {
        void OnCancel();
    }

    public static boolean checkPermission(Activity activity, String str) {
        if (activity.getApplicationInfo().targetSdkVersion >= 23) {
            return activity.checkSelfPermission(str) == 0;
        }
        return isOperationAllow(activity, str);
    }

    private static boolean isOperationAllow(Context context, String str) {
        int i;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.uid;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            i = 0;
        }
        int iPermissionToOpCode = permissionToOpCode(appOpsManager, str);
        if (iPermissionToOpCode < 0) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.app.AppOpsManager");
            Class cls2 = Integer.TYPE;
            int iIntValue = ((Integer) ReflectUtil.invokeMethod(ReflectUtil.findMethod(cls, "checkOpNoThrow", cls2, cls2, String.class), appOpsManager, Integer.valueOf(iPermissionToOpCode), Integer.valueOf(i), context.getPackageName())).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append("checkOpNoThrow result: ");
            sb.append(iIntValue);
            return iIntValue == 0 || iIntValue == 3;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    private static int permissionToOpCode(AppOpsManager appOpsManager, String str) {
        try {
            String[] strArr = (String[]) ReflectUtil.evaluateField(ReflectUtil.findField(Class.forName("android.app.AppOpsManager"), "sOpPerms"), appOpsManager);
            for (int i = 0; i < strArr.length; i++) {
                if (TextUtils.equals(strArr[i], str)) {
                    return i;
                }
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void showApplyForPermissionDialog(final Activity activity, final OnPermissionCancelListener onPermissionCancelListener, final String str) {
        new Handler(activity.getApplicationContext().getMainLooper()).post(new Runnable() { // from class: com.mipay.sdk.permission.PermissionManager.1
            @Override // java.lang.Runnable
            public void run() {
                new AlertDialog.Builder(activity).setTitle(str).setNegativeButton(WebConstants.getString(WebConstants.ID_CANCEL_TEXT), new DialogInterface.OnClickListener() { // from class: com.mipay.sdk.permission.PermissionManager.1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        OnPermissionCancelListener onPermissionCancelListener2 = onPermissionCancelListener;
                        if (onPermissionCancelListener2 != null) {
                            onPermissionCancelListener2.OnCancel();
                        }
                    }
                }).setPositiveButton(WebConstants.getString(WebConstants.ID_OK_TEXT), new DialogInterface.OnClickListener() { // from class: com.mipay.sdk.permission.PermissionManager.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        try {
                            dialogInterface.dismiss();
                            Intent intent = new Intent();
                            intent.setAction(Constants.ACTION_APP_PERM_EDITOR);
                            intent.putExtra(Constants.EXTRA_PKG_NAME, activity.getPackageName());
                            activity.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Intent intent2 = new Intent();
                            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent2.setData(Uri.parse("package:" + activity.getPackageName()));
                            activity.startActivity(intent2);
                        }
                    }
                }).create().show();
            }
        });
    }
}

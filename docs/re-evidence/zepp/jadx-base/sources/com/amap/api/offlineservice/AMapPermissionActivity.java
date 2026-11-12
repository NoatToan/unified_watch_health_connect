package com.amap.api.offlineservice;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AMapPermissionActivity extends Activity {
    public String[] needPermissions = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE"};
    private boolean a = true;

    @TargetApi(23)
    private List<String> a(String[] strArr) {
        try {
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 23 && getApplicationInfo().targetSdkVersion >= 23) {
                for (String str : strArr) {
                    if (a(str) != 0 || b(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private boolean b(String str) {
        try {
            return ((Boolean) getClass().getMethod("shouldShowRequestPermissionRationale", String.class).invoke(this, str)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.app.Activity
    @TargetApi(23)
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            if (Build.VERSION.SDK_INT < 23 || i != 0 || a(iArr)) {
                return;
            }
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("提示");
                builder.setMessage("当前应用缺少必要权限。\\n\\n请点击\\\"设置\\\"-\\\"权限\\\"-打开所需权限");
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: com.amap.api.offlineservice.AMapPermissionActivity.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        try {
                            AMapPermissionActivity.this.finish();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                builder.setPositiveButton("设置", new DialogInterface.OnClickListener() { // from class: com.amap.api.offlineservice.AMapPermissionActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        try {
                            AMapPermissionActivity.a(AMapPermissionActivity.this);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                builder.setCancelable(false);
                builder.show();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.a = false;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        List<String> listA;
        try {
            super.onResume();
            int i = Build.VERSION.SDK_INT;
            if (i < 23 || !this.a) {
                return;
            }
            String[] strArr = this.needPermissions;
            if (i >= 23) {
                try {
                    if (getApplicationInfo().targetSdkVersion < 23 || (listA = a(strArr)) == null || listA.size() <= 0) {
                        return;
                    }
                    try {
                        getClass().getMethod("requestPermissions", String[].class, Integer.TYPE).invoke(this, (String[]) listA.toArray(new String[listA.size()]), 0);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private int a(String str) {
        try {
            return ((Integer) getClass().getMethod("checkSelfPermission", String.class).invoke(this, str)).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean a(int[] iArr) {
        try {
            for (int i : iArr) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static /* synthetic */ void a(AMapPermissionActivity aMapPermissionActivity) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + aMapPermissionActivity.getPackageName()));
            aMapPermissionActivity.startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

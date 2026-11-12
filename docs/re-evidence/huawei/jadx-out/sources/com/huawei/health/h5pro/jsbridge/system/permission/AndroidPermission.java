package com.huawei.health.h5pro.jsbridge.system.permission;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import com.huawei.health.h5pro.core.R;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionRequestCallback;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import defpackage.exo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidPermission implements IPermission {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<String> f6861c;
    private Context d;
    private Map<PermissionCallback, List<String>> e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<PermissionCallback, int[]> f6863b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f6862a = new HashSet();

    public interface PermissionCallback {
        void onComplete(int[] iArr);

        void onFailure(String str);
    }

    private String a() {
        return this.d.getResources().getString(R.string.IDS_permission_guide_dialog_content);
    }

    private List<String> a(Activity activity) {
        ArrayList arrayList;
        PackageInfo packageInfo;
        String[] strArr;
        synchronized (this) {
            arrayList = new ArrayList();
            try {
                LogUtil.d("AndroidPermission", activity.getPackageName());
                packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 4096);
            } catch (PackageManager.NameNotFoundException e) {
                LogUtil.e("AndroidPermission", "getManifestPermissions: " + e.getMessage());
                packageInfo = null;
            }
            if (packageInfo != null && (strArr = packageInfo.requestedPermissions) != null) {
                Collections.addAll(arrayList, strArr);
                LogUtil.d("AndroidPermission", "Manifest contained permission: " + Arrays.toString(strArr));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", applicationContext.getPackageName(), null));
        ((Activity) this.d).startActivityForResult(intent, 875);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String[] strArr, PermissionCallback permissionCallback) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        this.e.put(permissionCallback, arrayList);
        this.f6863b.put(permissionCallback, new int[strArr.length]);
        String[] strArrB = b(arrayList);
        if (strArrB.length == 0) {
            return;
        }
        ActivityCompat.requestPermissions((Activity) this.d, strArrB, 758);
    }

    private void b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d);
        String strA = a();
        builder.setTitle(R.string.IDS_permission_guide_dialog_title);
        builder.setMessage(strA);
        builder.setPositiveButton(R.string.IDS_permission_guide_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: com.huawei.health.h5pro.jsbridge.system.permission.AndroidPermission.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                AndroidPermission androidPermission = AndroidPermission.this;
                androidPermission.a(androidPermission.d);
            }
        });
        builder.setNegativeButton(R.string.IDS_permission_guide_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: com.huawei.health.h5pro.jsbridge.system.permission.AndroidPermission.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    private void b(String str, int i) {
        for (PermissionCallback permissionCallback : this.e.keySet()) {
            List<String> list = this.e.get(permissionCallback);
            int[] iArr = this.f6863b.get(permissionCallback);
            if (list != null && list.contains(str)) {
                int iIndexOf = list.indexOf(str);
                this.e.put(permissionCallback, list);
                if (iArr != null && iArr.length > iIndexOf) {
                    iArr[iIndexOf] = i;
                }
            }
            if (list == null || list.isEmpty() || iArr == null || d(iArr)) {
                permissionCallback.onComplete(iArr);
                this.e.remove(permissionCallback);
            }
        }
        this.f6862a.remove(str);
    }

    private String[] b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : new ArrayList(list)) {
            if (!d(str)) {
                b(str, -1);
            } else if (exo.a(this.d, str)) {
                b(str, 1);
            } else if (this.f6862a.add(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private boolean d(String str) {
        if (f6861c == null) {
            f6861c = a((Activity) this.d);
        }
        return f6861c.contains(str);
    }

    private boolean d(int[] iArr) {
        for (int i : iArr) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.permission.IPermission
    public void destroy() {
        if (this.d == null) {
            return;
        }
        this.d = null;
        this.e.clear();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.permission.IPermission
    public void onMount(Context context) {
        if (context instanceof Activity) {
            this.d = context;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.permission.IPermission
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 758) {
            int iMin = Math.min(strArr.length, iArr.length);
            boolean z = false;
            for (int i2 = 0; i2 < iMin; i2++) {
                if (iArr[i2] == 0) {
                    b(strArr[i2], 1);
                } else if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) this.d, strArr[i2])) {
                    b(strArr[i2], -1);
                } else {
                    b(strArr[i2], -2);
                    z = true;
                }
            }
            if (z) {
                b();
            }
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.permission.IPermission
    public void requestPermissions(final String[] strArr, final PermissionCallback permissionCallback) {
        if (this.d == null) {
            permissionCallback.onFailure("h5proContext is null");
        } else {
            PermissionUtil.getInstance().checkAndRequestPermissions((Activity) this.d, strArr, 758, new H5ProPermissionRequestCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.permission.AndroidPermission.1
                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionRequestCallback
                public void onDefault() {
                    LogUtil.i("AndroidPermission", "requestPermissions: onDefault");
                    AndroidPermission.this.a(strArr, permissionCallback);
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onDenied(String str) {
                    LogUtil.i("AndroidPermission", a.a("requestPermissions: onDenied -> ", str));
                    int[] iArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        iArr[i] = -1;
                    }
                    permissionCallback.onComplete(iArr);
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onForeverDenied(String[] strArr2) {
                    int[] iArr = new int[strArr2.length];
                    for (int i = 0; i < strArr2.length; i++) {
                        iArr[i] = -2;
                    }
                    permissionCallback.onComplete(iArr);
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onGranted() {
                    LogUtil.i("AndroidPermission", "requestPermissions: onGranted");
                    int[] iArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        iArr[i] = 1;
                    }
                    permissionCallback.onComplete(iArr);
                }
            });
        }
    }
}

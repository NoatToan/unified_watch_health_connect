package com.huawei.health.h5pro.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.huawei.health.h5pro.ext.H5ProResidentExtManager;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionExtApi;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionRequestCallback;
import com.huawei.health.h5pro.ext.permission.PermissionResultHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class PermissionUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f6999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f7000b;
    private static volatile PermissionUtil d;
    private static final Object e;

    static {
        String[] strArr;
        if (Build.VERSION.SDK_INT < 33) {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        } else {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        }
        f7000b = strArr;
        f6999a = new String[]{"android.permission.CAMERA"};
        d = null;
        e = new Object();
    }

    private PermissionUtil() {
    }

    public static PermissionUtil getInstance() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new PermissionUtil();
                }
            }
        }
        return d;
    }

    public boolean checkPermission(Context context, String[] strArr) {
        if (context == null || strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public void requestPermission(Activity activity, String[] strArr, int i) {
        if (activity == null || strArr == null || strArr.length == 0) {
            return;
        }
        ActivityCompat.requestPermissions(activity, strArr, i);
    }

    public boolean checkWebKitPermission(Context context, String[] strArr) {
        if (context == null || strArr == null || strArr.length == 0) {
            return false;
        }
        boolean zCheckPermission = false;
        for (String str : strArr) {
            if (TextUtils.equals("android.webkit.resource.AUDIO_CAPTURE", str)) {
                zCheckPermission = checkPermission(context, new String[]{"android.permission.RECORD_AUDIO"});
            } else if (TextUtils.equals("android.webkit.resource.VIDEO_CAPTURE", str)) {
                zCheckPermission = checkPermission(context, new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"});
            } else {
                LogUtil.i("H5PRO_PermissionUtil", "Not supported：" + str);
                zCheckPermission = false;
            }
            if (!zCheckPermission) {
                return zCheckPermission;
            }
        }
        return zCheckPermission;
    }

    public void requestWebKitPermission(Activity activity, String[] strArr, int i) {
        if (activity == null || strArr == null || strArr.length == 0) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (TextUtils.equals("android.webkit.resource.AUDIO_CAPTURE", str)) {
                arrayList = c(arrayList, new String[]{"android.permission.RECORD_AUDIO"});
            } else if (TextUtils.equals("android.webkit.resource.VIDEO_CAPTURE", str)) {
                arrayList = c(arrayList, new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"});
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        requestPermission(activity, (String[]) arrayList.toArray(new String[0]), i);
    }

    private ArrayList<String> c(ArrayList<String> arrayList, String[] strArr) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public void checkAndRequestPermissions(Activity activity, String[] strArr, int i, H5ProPermissionCallback h5ProPermissionCallback) {
        checkAndRequestPermissions(activity, strArr, i, true, h5ProPermissionCallback);
    }

    public void checkAndRequestPermissions(Activity activity, final String[] strArr, final int i, boolean z, final H5ProPermissionCallback h5ProPermissionCallback) {
        H5ProPermissionExtApi permissionExtApi = H5ProResidentExtManager.getPermissionExtApi();
        if (permissionExtApi == null) {
            b(activity, strArr, i, h5ProPermissionCallback);
        } else {
            final WeakReference weakReference = new WeakReference(activity);
            permissionExtApi.checkAndRequestPermissions((Context) weakReference.get(), strArr, z, new H5ProPermissionRequestCallback() { // from class: com.huawei.health.h5pro.utils.PermissionUtil.4
                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onGranted() {
                    LogUtil.i("H5PRO_PermissionUtil", "checkAndRequestPermissions: ext -> onGranted");
                    h5ProPermissionCallback.onGranted();
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onDenied(String str) {
                    LogUtil.i("H5PRO_PermissionUtil", "checkAndRequestPermissions: ext -> onDenied");
                    h5ProPermissionCallback.onDenied(str);
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
                public void onForeverDenied(String[] strArr2) {
                    LogUtil.i("H5PRO_PermissionUtil", "checkAndRequestPermissions: ext -> onForeverDenied");
                    h5ProPermissionCallback.onForeverDenied(strArr2);
                }

                @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionRequestCallback
                public void onDefault() {
                    LogUtil.i("H5PRO_PermissionUtil", "checkAndRequestPermissions: ext -> onDefault");
                    PermissionUtil.this.b((Activity) weakReference.get(), strArr, i, h5ProPermissionCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity, String[] strArr, int i, H5ProPermissionCallback h5ProPermissionCallback) {
        LogUtil.i("H5PRO_PermissionUtil", "checkAndRequestPermissions: default");
        if (h5ProPermissionCallback instanceof H5ProPermissionRequestCallback) {
            ((H5ProPermissionRequestCallback) h5ProPermissionCallback).onDefault();
        } else if (!getInstance().checkPermission(activity, strArr)) {
            requestPermission(activity, strArr, i);
        } else {
            h5ProPermissionCallback.onGranted();
        }
    }

    public void handlePermissionResult(int i, String[] strArr, int[] iArr, PermissionResultHandler permissionResultHandler) {
        H5ProPermissionExtApi permissionExtApi = H5ProResidentExtManager.getPermissionExtApi();
        if (permissionExtApi == null || !permissionExtApi.isSupport(strArr)) {
            permissionResultHandler.handle(i, strArr, iArr);
        } else {
            permissionExtApi.notifyPermissionsChange(strArr, iArr);
        }
    }

    public boolean isAllPermitted(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

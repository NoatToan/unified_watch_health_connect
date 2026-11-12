package com.huawei.hwcommonmodel.utils;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import defpackage.ltd;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class PermissionUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f17225b;
    private static final PermissionType[] d = {PermissionType.STORAGE_LOCATION, PermissionType.LOCATION_WITH_BACKGROUND, PermissionType.AUDIO_LOCATION, PermissionType.ACTIVITY_LOCATION, PermissionType.ACTIVITY_MEDIA_VIDEO_IMAGES, PermissionType.ACTIVITY};
    private static final PermissionType[] e = {PermissionType.STORAGE_LOCATION, PermissionType.LOCATION_WITH_BACKGROUND, PermissionType.AUDIO_LOCATION, PermissionType.ACTIVITY_LOCATION};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final PermissionType[] f17226c = {PermissionType.STORAGE, PermissionType.STORAGE_LOCATION, PermissionType.MEDIA_VIDEO_IMAGES, PermissionType.CAMERA_IMAGE, PermissionType.STORAGE_NETWORK_WIFI, PermissionType.AUDIO_LOCATION, PermissionType.MANAGE_EXTERNAL_STORAGE, PermissionType.SCAN, PermissionType.MEDIA_AUDIO, PermissionType.STORAGE_LOCATION, PermissionType.ACTIVITY_MEDIA_VIDEO_IMAGES};

    /* JADX INFO: loaded from: classes2.dex */
    public enum PermissionResult {
        GRANTED,
        DENIED,
        FOREVER_DENIED
    }

    public enum PermissionType {
        STORAGE,
        LOCATION,
        LOCATION_WITH_BACKGROUND,
        STORAGE_LOCATION,
        ACTIVITY_LOCATION,
        MEDIA_VIDEO_IMAGES,
        ACTIVITY_MEDIA_VIDEO_IMAGES,
        MEDIA_AUDIO,
        CAMERA_IMAGE,
        NONE,
        STORAGE_NETWORK_WIFI,
        AUDIO_CALLS,
        PHONE_STATE,
        READ_CONTACT,
        READ_WRITE_CONTACT,
        CAMERA,
        DISTRIBUTED_DATASYNC,
        RECORD_AUDIO,
        CALENDAR,
        SCAN,
        AUDIO_LOCATION,
        MANAGE_EXTERNAL_STORAGE,
        ACTIVITY,
        COARSE_LOCATION
    }

    private PermissionUtil() {
    }

    public static String[] c(PermissionType permissionType) {
        if (n(permissionType)) {
            return f(permissionType);
        }
        if (h(permissionType)) {
            return g(permissionType);
        }
        return j(permissionType);
    }

    private static String[] j(PermissionType permissionType) {
        if (b(permissionType)) {
            return i(permissionType);
        }
        return a(permissionType);
    }

    private static String[] a(PermissionType permissionType) {
        int iOrdinal = permissionType.ordinal();
        if (iOrdinal != 20) {
            if (iOrdinal != 21) {
                if (iOrdinal != 23) {
                    switch (iOrdinal) {
                        case 0:
                        case 5:
                        case 6:
                            break;
                        case 1:
                        case 2:
                        case 4:
                            return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                        case 3:
                            break;
                        default:
                            switch (iOrdinal) {
                                case 8:
                                    return new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
                                case 9:
                                    return new String[]{"PERMISSION_NONE"};
                                case 10:
                                    return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE"};
                                case 11:
                                    return new String[]{"android.permission.RECORD_AUDIO", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.MODIFY_AUDIO_SETTINGS"};
                                case 12:
                                    return new String[]{"android.permission.READ_PHONE_STATE"};
                                default:
                                    return e(permissionType);
                            }
                    }
                } else {
                    return new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
                }
            }
            return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    private static String[] e(PermissionType permissionType) {
        String[] strArr = new String[0];
        int iOrdinal = permissionType.ordinal();
        if (iOrdinal != 7) {
            switch (iOrdinal) {
                case 13:
                    return new String[]{"android.permission.READ_CONTACTS"};
                case 14:
                    return new String[]{"android.permission.READ_CONTACTS"};
                case 15:
                    return new String[]{"android.permission.CAMERA"};
                case 16:
                    return new String[]{"com.huawei.permission.DISTRIBUTED_DATASYNC"};
                case 17:
                    return new String[]{"android.permission.RECORD_AUDIO"};
                case 18:
                    return new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
                case 19:
                    return new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
                default:
                    LogUtil.e("PermissionUtil", "permissionType unknow:", permissionType);
                    return strArr;
            }
        }
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    private static String[] i(PermissionType permissionType) {
        String[] strArr = new String[0];
        int iOrdinal = permissionType.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return new String[]{"android.permission.ACTIVITY_RECOGNITION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
                }
                if (iOrdinal == 6) {
                    return new String[]{"android.permission.ACTIVITY_RECOGNITION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
                }
                if (iOrdinal != 20) {
                    if (iOrdinal == 22) {
                        return new String[]{"android.permission.ACTIVITY_RECOGNITION"};
                    }
                    LogUtil.e("PermissionUtil", "permissionType unknow:", permissionType);
                    return strArr;
                }
            }
            return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
        }
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    }

    private static String[] g(PermissionType permissionType) {
        String[] strArr = new String[0];
        int iOrdinal = permissionType.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return new String[]{"android.permission.ACTIVITY_RECOGNITION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                }
                if (iOrdinal == 6) {
                    return new String[]{"android.permission.ACTIVITY_RECOGNITION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
                }
                if (iOrdinal != 20) {
                    LogUtil.e("PermissionUtil", "permissionType unknow:", permissionType);
                    return strArr;
                }
            }
            return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        }
        return new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"};
    }

    private static String[] f(PermissionType permissionType) {
        String[] strArr = new String[0];
        int iOrdinal = permissionType.ordinal();
        if (iOrdinal == 0) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        }
        if (iOrdinal != 10) {
            switch (iOrdinal) {
                case 3:
                    return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                case 4:
                    return new String[]{"android.permission.ACTIVITY_RECOGNITION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                case 5:
                    return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                case 6:
                    return new String[]{"android.permission.ACTIVITY_RECOGNITION", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                case 7:
                    return new String[]{"android.permission.READ_MEDIA_AUDIO"};
                case 8:
                    return new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
                default:
                    switch (iOrdinal) {
                        case 19:
                            return new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.NEARBY_WIFI_DEVICES"};
                        case 20:
                            return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                        case 21:
                            return new String[]{"android.permission.MANAGE_EXTERNAL_STORAGE"};
                        default:
                            LogUtil.e("PermissionUtil", "permissionType unknow:", permissionType);
                            return strArr;
                    }
            }
        }
        return new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE"};
    }

    public static boolean b(PermissionType permissionType) {
        if (a()) {
            for (PermissionType permissionType2 : d) {
                if (permissionType2 == permissionType) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean h(PermissionType permissionType) {
        ReleaseLogUtil.c("PermissionUtil", "isAndroidR ", Boolean.valueOf(e()));
        if (e()) {
            for (PermissionType permissionType2 : e) {
                if (permissionType2 == permissionType) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean n(PermissionType permissionType) {
        if (f()) {
            ReleaseLogUtil.c("PermissionUtil", "isAndroidT");
            for (PermissionType permissionType2 : f17226c) {
                if (permissionType2 == permissionType) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT > 34;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT == 29;
    }

    public static boolean j() {
        if (e() || EnvironmentInfo.l()) {
            return CommonUtil.bg() || NotificationManagerCompat.from(BaseApplication.b()).areNotificationsEnabled();
        }
        LogUtil.b("PermissionUtil", "isUseOnlyAllowedLocation false");
        return false;
    }

    public static PermissionResult d(Context context, String[] strArr) {
        LogUtil.c("PermissionUtil", "checkPermissions::enter");
        if (context == null) {
            ReleaseLogUtil.d("R_PermissionUtil", "checkPermissions::context is null");
            return PermissionResult.DENIED;
        }
        if (strArr.length <= 0) {
            LogUtil.e("PermissionUtil", "checkPermissions::permissions empty");
            return PermissionResult.DENIED;
        }
        if ("PERMISSION_NONE".equals(strArr[0])) {
            return PermissionResult.GRANTED;
        }
        if (b(context, strArr)) {
            return PermissionResult.GRANTED;
        }
        if (!(context instanceof Activity)) {
            LogUtil.d("PermissionUtil", "checkPermissions only take Activity as context");
            return PermissionResult.DENIED;
        }
        for (String str : strArr) {
            if (e(context, str)) {
                return PermissionResult.FOREVER_DENIED;
            }
        }
        return PermissionResult.DENIED;
    }

    private static boolean e(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e("PermissionUtil", "isForeverDenied null");
            return true;
        }
        if (CommonUtil.av() && d(str)) {
            ReleaseLogUtil.c("PermissionUtil", "isAndroidOncePermission permission = ", str);
            return false;
        }
        boolean zE = ltd.e().e(context, str);
        if (!zE && f() && "android.permission.MANAGE_EXTERNAL_STORAGE".equals(str)) {
            return true;
        }
        boolean zE2 = CommonUtil.e(context, str);
        boolean zShouldShowRequestPermissionRationale = ((Activity) context).shouldShowRequestPermissionRationale(str);
        ReleaseLogUtil.c("PermissionUtil", "shouldShowRationale = ", Boolean.valueOf(zShouldShowRequestPermissionRationale), " permission = ", str);
        return (zE || zE2 || zShouldShowRequestPermissionRationale) ? false : true;
    }

    public static PermissionResult e(Context context, PermissionType permissionType) {
        String[] strArrC;
        if (PermissionType.LOCATION_WITH_BACKGROUND == permissionType) {
            strArrC = j(permissionType);
        } else {
            strArrC = c(permissionType);
        }
        LogUtil.c("PermissionUtil", "permissions to request:", strArrC);
        return d(context, strArrC);
    }

    public static void d(Context context, PermissionType permissionType, PermissionsResultAction permissionsResultAction) {
        LogUtil.c("PermissionUtil", "doActionWithPermissions::enter");
        if (!(context instanceof Activity)) {
            LogUtil.d("PermissionUtil", "doActionWithPermissions only take Activity as context");
            return;
        }
        String[] strArrC = c(permissionType);
        LogUtil.c("PermissionUtil", "permissions to request:", Arrays.toString(strArrC));
        int iOrdinal = d(context, strArrC).ordinal();
        if (iOrdinal == 0) {
            permissionsResultAction.onGranted();
            return;
        }
        if (iOrdinal == 1) {
            permissionsResultAction.setPermissionType(permissionType);
            a((Activity) context, strArrC, permissionsResultAction);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            permissionsResultAction.onForeverDenied(permissionType);
        }
    }

    public static boolean b(Context context, String[] strArr) {
        for (String str : strArr) {
            if (!ltd.e().e(context, str)) {
                ReleaseLogUtil.c("R_PermissionUtil", "isHasPermissions permissions are not granted: ", str);
                return false;
            }
        }
        return true;
    }

    public static void a(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction) {
        LogUtil.b("PermissionUtil", "enter requestPermission(): activity = ", activity, ",permissions", Arrays.toString(strArr), ",action = ", permissionsResultAction);
        ltd.e().e(activity, strArr, permissionsResultAction);
        CommonUtil.d(activity, strArr);
    }

    public static PermissionType e(int i) {
        if (i == 264) {
            return PermissionType.STORAGE;
        }
        return PermissionType.LOCATION;
    }

    public static boolean d(PermissionType permissionType) {
        String[] strArrC = c(permissionType);
        if (CollectionUtils.d(strArrC)) {
            ReleaseLogUtil.d("R_PermissionUtil", "isForeverDeniedByHuawei permissionArray ", strArrC, " permissionType ", permissionType);
            return false;
        }
        for (String str : strArrC) {
            if (e(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str) {
        if (!CommonUtil.av() || !d(str)) {
            return false;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null || activityJ.isFinishing() || activityJ.isDestroyed()) {
            ReleaseLogUtil.d("R_PermissionUtil", "isForeverDeniedByHuawei activity ", activityJ, " permission ", str);
            return false;
        }
        return !activityJ.shouldShowRequestPermissionRationale(str);
    }

    public static boolean d(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(j(PermissionType.LOCATION_WITH_BACKGROUND)));
        arrayList.add("android.permission.CAMERA");
        arrayList.add("android.permission.RECORD_AUDIO");
        return e() && arrayList.contains(str);
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        AlarmManager alarmManager = (AlarmManager) BaseApplication.b().getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager != null) {
            return alarmManager.canScheduleExactAlarms();
        }
        return false;
    }
}

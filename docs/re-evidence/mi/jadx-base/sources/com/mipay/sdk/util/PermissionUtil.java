package com.mipay.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.mipay.sdk.web.R;
import com.xiaomi.accounts.Manifest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PermissionUtil {
    private static final Map<String, String> PERMISSION_GROUP_MAP;

    static {
        HashMap map = new HashMap();
        PERMISSION_GROUP_MAP = map;
        map.put("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION");
        map.put("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION");
        map.put("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION");
        map.put("android.permission.CAMERA", "android.permission-group.CAMERA");
        map.put("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE");
        map.put("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE");
        map.put("android.permission.READ_MEDIA_IMAGES", "android.permission-group.STORAGE");
        map.put("android.permission.READ_MEDIA_VIDEO", "android.permission-group.STORAGE");
        map.put("android.permission.READ_MEDIA_AUDIO", "android.permission-group.STORAGE");
        map.put("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE");
        map.put("android.permission.READ_CALL_LOG", "android.permission-group.PHONE");
        map.put("android.permission.WRITE_CALL_LOG", "android.permission-group.PHONE");
        map.put("android.permission.CALL_PHONE", "android.permission-group.PHONE");
        map.put("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE");
        map.put("android.permission.USE_SIP", "android.permission-group.PHONE");
        map.put("android.permission.SET_PROCESS_LIMIT", "android.permission-group.PHONE");
        map.put("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR");
        map.put("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR");
        map.put("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE");
        map.put("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS");
        map.put(Manifest.permission.GET_ACCOUNTS, "android.permission-group.CONTACTS");
        map.put("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS");
        map.put("android.permission.READ_SMS", "android.permission-group.SMS");
        map.put("android.permission.RECEIVE_SMS", "android.permission-group.SMS");
        map.put("android.permission.SEND_SMS", "android.permission-group.SMS");
        map.put("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS");
        map.put("android.permission.RECEIVE_MMS", "android.permission-group.SMS");
        map.put("android.permission.BODY_SENSORS", "android.permission-group.SENSORS");
        map.put("android.permission.BODY_SENSORS_BACKGROUND", "android.permission-group.SENSORS");
    }

    private PermissionUtil() {
    }

    public static List<String> getPermanentlyDeniedPermissions(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                if (isPermanentlyDenied(activity, str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static String getPermissionDialogMessage(Context context, List<String> list) {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.permission_rationale_header));
        sb.append("\n");
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            String str2 = PERMISSION_GROUP_MAP.get(str);
            String string2 = "";
            if (TextUtils.isEmpty(str2)) {
                try {
                    PermissionInfo permissionInfo = packageManager.getPermissionInfo(str, 0);
                    string = permissionInfo.loadLabel(packageManager).toString();
                    try {
                        string2 = permissionInfo.loadDescription(packageManager).toString();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    string = "";
                }
            } else {
                PermissionGroupInfo permissionGroupInfo = packageManager.getPermissionGroupInfo(str2, 0);
                string = permissionGroupInfo.loadLabel(packageManager).toString();
                string2 = permissionGroupInfo.loadDescription(packageManager).toString();
            }
            sb.append(string);
            if (TextUtils.isEmpty(string2)) {
                sb.append("\n");
            } else {
                sb.append(":");
                sb.append(string2);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static String[] getUngrantedPermissions(Context context, String... strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!isPermissionGranted(context, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public static boolean isAllGranted(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermanentlyDenied(Activity activity, String str) {
        return (isPermissionGranted(activity, str) || activity.shouldShowRequestPermissionRationale(str)) ? false : true;
    }

    public static boolean isPermissionGranted(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean isPermissionsGranted(Context context, String... strArr) {
        for (String str : strArr) {
            if (!isPermissionGranted(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean openPermissionSetting(Activity activity, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivityForResult(intent, i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

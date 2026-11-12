package defpackage;

import android.content.Context;
import com.huawei.ui.main.R;
import com.huawei.wearengine.auth.Permission;

/* JADX INFO: loaded from: classes43.dex */
public class trq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    public static String c(Context context, String str, String str2, boolean z) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "device_manager":
                b2 = 0;
                break;
            case "notify":
                b2 = 1;
                break;
            case "sensor":
                b2 = 2;
                break;
            case "motion_sensor":
                b2 = 3;
                break;
            case "wear_user_status":
                b2 = 4;
                break;
            case "device_sn":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            if (yic.a().contains(str2)) {
                return context.getString(R.string.IDS_wear_device_describe);
            }
            return e(context, z, R.string.IDS_permission_wear_engine_device_manager_describe, R.string.IDS_wear_device_describe);
        }
        if (b2 == 1) {
            return e(context, z, R.string.IDS_permission_wear_engine_notify_describe, R.string.IDS_wear_notify_describe);
        }
        if (b2 == 2) {
            return e(context, z, R.string.IDS_permission_wear_engine_sensor_describe, R.string.IDS_wear_human_sensor_describe);
        }
        if (b2 == 3) {
            return context.getString(R.string.IDS_wear_motion_sensor_desc);
        }
        if (b2 == 4) {
            return context.getString(R.string.IDS_wear_user_status_desc);
        }
        if (b2 == 5) {
            return context.getString(R.string.IDS_wear_device_sn_desc);
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    public static String d(Context context, String str, boolean z) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "device_manager":
                b2 = 0;
                break;
            case "notify":
                b2 = 1;
                break;
            case "sensor":
                b2 = 2;
                break;
            case "motion_sensor":
                b2 = 3;
                break;
            case "wear_user_status":
                b2 = 4;
                break;
            case "device_sn":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return e(context, z, R.string.IDS_permission_wear_engine_device_manager, R.string.IDS_wear_device);
        }
        if (b2 == 1) {
            return context.getString(R.string.IDS_permission_wear_engine_notify);
        }
        if (b2 == 2) {
            return e(context, z, R.string.IDS_permission_wear_engine_sensor, R.string.IDS_wear_human_sensor);
        }
        if (b2 == 3) {
            return context.getString(R.string.IDS_wear_motion_sensor);
        }
        if (b2 == 4) {
            return context.getString(R.string.IDS_wear_user_status);
        }
        if (b2 == 5) {
            return context.getString(R.string.IDS_wear_device_sn);
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    public static Permission a(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "device_manager":
                b2 = 0;
                break;
            case "notify":
                b2 = 1;
                break;
            case "sensor":
                b2 = 2;
                break;
            case "motion_sensor":
                b2 = 3;
                break;
            case "wear_user_status":
                b2 = 4;
                break;
            case "device_sn":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return Permission.DEVICE_MANAGER;
        }
        if (b2 == 1) {
            return Permission.NOTIFY;
        }
        if (b2 == 2) {
            return Permission.SENSOR;
        }
        if (b2 == 3) {
            return Permission.MOTION_SENSOR;
        }
        if (b2 == 4) {
            return Permission.WEAR_USER_STATUS;
        }
        if (b2 != 5) {
            return null;
        }
        return Permission.DEVICE_SN;
    }

    private static String e(Context context, boolean z, int i, int i2) {
        if (z) {
            return context.getString(i);
        }
        return context.getString(i2);
    }
}

package defpackage;

import android.content.Context;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class mjl {
    public static void e(Context context, int i) {
        String str;
        if (context == null) {
            return;
        }
        if (i == 0) {
            str = CardMgrSdkConst.KEY_RECOMMEND;
        } else if (i == 2) {
            str = WatchFaceProvider.BACKGROUND_LABEL;
        } else {
            str = "";
        }
        SharedPreferenceManager.e(context, String.valueOf(1000001), "sp_ota_update_type", str, new StorageParams(0));
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        return SharedPreferenceManager.e(context, String.valueOf(1000001), "sp_ota_update_type");
    }

    public static void b(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(1000002), "sp_ota_update_tlv", str, new StorageParams(0));
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        return SharedPreferenceManager.e(context, String.valueOf(1000002), "sp_ota_update_tlv");
    }

    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(1000003), "sp_ota_update_version", str, new StorageParams(0));
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        return SharedPreferenceManager.e(context, String.valueOf(1000003), "sp_ota_update_version");
    }

    public static void e(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(1000004), "sp_ota_update_connect_version", str, new StorageParams(0));
    }

    public static void c(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(1000005), "sp_ota_update_device_mac", str, new StorageParams(0));
    }

    public static void d(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(1000006), "sp_ota_update_start_version", str, new StorageParams(0));
    }

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        return SharedPreferenceManager.e(context, String.valueOf(1000006), "sp_ota_update_start_version");
    }

    public static void e(Context context) {
        if (context == null) {
            return;
        }
        e(context, 1);
        e(context, "");
        c(context, "");
        a(context, "");
        d(context, "");
        b(context, "");
    }

    public static void j(Context context) {
        if (context == null) {
            return;
        }
        e(context, 1);
        e(context, "");
        c(context, "");
        a(context, "");
        d(context, "");
        b(context, "");
        SharedPreferenceManager.d(context, 0L, "ota_datatime");
        SharedPreferenceManager.d(context, 0L, "EXCE_OTA_APP_UPG_TRANS_START");
        SharedPreferenceManager.d(context, 0L, "EXCE_OTA_APP_UPG_TRANS_STOP_TIME");
    }
}

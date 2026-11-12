package defpackage;

import android.text.TextUtils;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class jey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38516a = phs.d + "dynamic_track_map_resource" + File.separator;

    public static String b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(f38516a);
        sb.append("language");
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str3);
        sb.append(".json");
        return sb.toString();
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(f38516a);
        sb.append(NetworkService.Constants.CONFIG_SERVICE);
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        sb.append(".json");
        return sb.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(f38516a);
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(f38516a);
        sb.append("image");
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        sb.append(".png");
        return sb.toString();
    }

    public static String e(String str, String str2, String str3, int i) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(f38516a);
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        if (i == 1) {
            sb.append("10.0");
            sb.append(File.separator);
        }
        sb.append(str3);
        sb.append(File.separator);
        if (i == 1) {
            sb.append("style.data");
        } else {
            sb.append(str3);
            sb.append(".json");
        }
        return sb.toString();
    }

    public static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(f38516a);
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append("10.0");
        sb.append(File.separator);
        sb.append(str3);
        sb.append(File.separator);
        sb.append("style_extra.data");
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public static String a(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "gaode_map":
                b2 = 0;
                break;
            case "google_map":
                b2 = 1;
                break;
            case "huawei_map":
                b2 = 2;
                break;
            case "mark_config":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return "GaoDeMapCustomStyle";
        }
        if (b2 == 1) {
            return "GoogleMapCustomStyle";
        }
        if (b2 == 2) {
            return "HmsCustomStyle";
        }
        if (b2 == 3) {
            return "CustomMarkStyle";
        }
        LogUtil.j("DynamicCustomMapConfigParam", "mapType is exception ", str);
        return "";
    }

    public static String c(int i) {
        if (i == 1) {
            return "gaode_map";
        }
        if (i == 2) {
            return "google_map";
        }
        if (i == 3) {
            return "huawei_map";
        }
        LogUtil.j("DynamicCustomMapConfigParam", "getMapFileName is exception ", Integer.valueOf(i));
        return "";
    }
}

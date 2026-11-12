package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hihealthservice.auth.WhiteListApp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.UriConstants;
import health.compact.a.GRSManager;
import health.compact.a.HiCommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lkc {
    private static final List<String> d;

    static {
        ArrayList arrayList = new ArrayList(10);
        d = arrayList;
        arrayList.add("com.huawei.ah100");
        arrayList.add("com.huawei.bone");
        arrayList.add("com.huawei.ohos.health.device");
    }

    static boolean b(String str) {
        boolean zContains = d.contains(str);
        LogUtil.a("Debug_HiWhiteListAppUtil", "isWhiteListApp, packageName is ", str, " isWhiteApp is ", Boolean.valueOf(zContains));
        return !HiCommonUtil.a(str) && zContains;
    }

    public static void d() {
        a();
    }

    private static void a() {
        HashMap map = new HashMap(16);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add("com.huawei.android.hms.health.profile.readonly");
        arrayList.add("com.huawei.android.hms.health.health.wgt");
        arrayList.add("com.huawei.android.hms.health.health.wgt.readonly");
        WhiteListApp whiteListAppA = a("com.huawei.ah100", arrayList);
        map.put(whiteListAppA.getPackageName(), whiteListAppA);
        kyl.c().b(map);
    }

    private static WhiteListApp a(String str, List<String> list) {
        WhiteListApp whiteListApp = new WhiteListApp();
        whiteListApp.setPackageName(str);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        whiteListApp.setAppId(strValueOf);
        whiteListApp.setAccessToken(str);
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainWwwHuawei");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("Debug_HiWhiteListAppUtil", "createWhiteListApp url is empty");
            return whiteListApp;
        }
        String strE = e(list, str, url);
        LogUtil.a("Debug_HiWhiteListAppUtil", "appScopes are ", strE);
        whiteListApp.setAppScopes(strE);
        String strD = d(list, strValueOf, url);
        LogUtil.a("Debug_HiWhiteListAppUtil", "userScopes are ", strD);
        whiteListApp.setUserScopes(strD);
        return whiteListApp;
    }

    private static String e(List<String> list, String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayList = new ArrayList(10);
        sb.append("{\"scopes\":[{\"id\":13,\"name\":\"SCOPE_ACCOUNT_BASEPROFILE\",\"permissions\":[\"com.huawei.android.hms.account.getBaseProfile\"],\"uri\":\"");
        sb.append(str2);
        sb.append("/auth/account/base.profile\"}");
        for (String str3 : list) {
            if (HiScopeUtil.e(str3) && !arrayList.contains(str3)) {
                String strE = e(str3, str2);
                String strA = a(str3, str2);
                if (!HiCommonUtil.a(strE)) {
                    sb.append(strE);
                }
                if (!HiCommonUtil.a(strA)) {
                    sb.append(a(str3, str2));
                }
                arrayList.add(str3);
            }
        }
        sb.append(",{\"id\":9999,\"name\":\"DEFAULT_SCOPE\",\"permissions\":[\"com.huawei.android.hms.account.getOpenID\"],\"uri\":\"");
        sb.append(str2);
        sb.append("/default/scopes\"}],\"certFingerprint\":\"");
        sb.append(str);
        sb.append("\",\"appAttr\":{\"appCnName\":\"");
        sb.append(str);
        sb.append("\"}}");
        return sb.toString();
    }

    private static String d(List<String> list, String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayList = new ArrayList(10);
        sb.append("{\"scope\":\"");
        sb.append(str2);
        sb.append(UriConstants.BASE_ACCOUNT_SCOPE);
        for (String str3 : list) {
            if (HiScopeUtil.e(str3) && !arrayList.contains(str3)) {
                String strD = d(str3, str2);
                String strB = b(str3, str2);
                if (!HiCommonUtil.a(strD)) {
                    sb.append(strD);
                }
                if (!HiCommonUtil.a(strB)) {
                    sb.append(a(str3, str2));
                }
                arrayList.add(str3);
            }
        }
        sb.append("\",\"open_id\":\"com.huawei.ah100\",\"expire_in\":788400000,\"client_id\":\"");
        sb.append(str);
        sb.append("\"}");
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    private static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        str.hashCode();
        switch (str) {
            case "com.huawei.android.hms.health.sport":
                sb.append(",{\"id\":103,\"name\":\"SCOPE_HEALTH_SPORT\",\"permissions\":[\"com.huawei.android.hms.health.sport\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/sport\"}");
                break;
            case "com.huawei.android.hms.health.health.slp.readonly":
                sb.append(",{\"id\":108,\"name\":\"SCOPE_HEALTH_HEALTH_SLP_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.slp.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.slp.readonly\"}");
                break;
            case "com.huawei.android.hms.health.health.wgt.readonly":
                sb.append(",{\"id\":106,\"name\":\"SCOPE_HEALTH_HEALTH_WGT_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.wgt.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.wgt.readonly\"}");
                break;
            case "com.huawei.android.hms.health.health.slp":
                sb.append(",{\"id\":107,\"name\":\"SCOPE_HEALTH_HEALTH_SLP\",\"permissions\":[\"com.huawei.android.hms.health.health.slp\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.slp\"}");
                break;
            case "com.huawei.android.hms.health.health.wgt":
                sb.append(",{\"id\":105,\"name\":\"SCOPE_HEALTH_HEALTH_WGT\",\"permissions\":[\"com.huawei.android.hms.health.health.wgt\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.wgt\"}");
                break;
            case "com.huawei.android.hms.health.profile.readonly":
                sb.append(",{\"id\":102,\"name\":\"SCOPE_HEALTH_PROFILE_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.profile.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/profile.readonly\"}");
                break;
            case "com.huawei.android.hms.health.sport.readonly":
                sb.append(",{\"id\":104,\"name\":\"SCOPE_HEALTH_SPORT_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.sport.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/sport.readonly\"}");
                break;
            case "com.huawei.android.hms.health.profile":
                sb.append(",{\"id\":101,\"name\":\"SCOPE_HEALTH_PROFILE\",\"permissions\":[\"com.huawei.android.hms.health.profile\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/profile\"}");
                break;
            case "com.huawei.android.hms.health.health.hr":
                sb.append(",{\"id\":109,\"name\":\"SCOPE_HEALTH_HEALTH_HR\",\"permissions\":[\"com.huawei.android.hms.health.health.hr\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.hr\"}");
                break;
            default:
                return null;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        str.hashCode();
        switch (str) {
            case "com.huawei.android.hms.health.health.hr.readonly":
                sb.append(",{\"id\":110,\"name\":\"SCOPE_HEALTH_HEALTH_HR_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.hr.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.hr.readonly\"}");
                break;
            case "com.huawei.android.hms.health.health.bg.readonly":
                sb.append(",{\"id\":114,\"name\":\"SCOPE_HEALTH_HEALTH_BG_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.bg.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.bg.readonly\"}");
                break;
            case "com.huawei.android.hms.health.health.bf.readonly":
                sb.append(",{\"id\":116,\"name\":\"SCOPE_HEALTH_HEALTH_BF_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.bf.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.bf.readonly\"}");
                break;
            case "com.huawei.android.hms.health.health.ecg.readonly":
                sb.append(",{\"id\":112,\"name\":\"SCOPE_HEALTH_HEALTH_ECG_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.ecg.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.ecg.readonly\"}");
                break;
            case "com.huawei.android.hms.health.motionpath":
                sb.append(",{\"id\":117,\"name\":\"SCOPE_HEALTH_MOTIONPATH\",\"permissions\":[\"com.huawei.android.hms.health.motionpath\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/motionpath\"}");
                break;
            case "com.huawei.android.hms.health.health.ecg":
                sb.append(",{\"id\":111,\"name\":\"SCOPE_HEALTH_HEALTH_ECG\",\"permissions\":[\"com.huawei.android.hms.health.health.ecg\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.ecg\"}");
                break;
            case "com.huawei.android.hms.health.motionpath.readonly":
                sb.append(",{\"id\":118,\"name\":\"SCOPE_HEALTH_MOTIONPATH_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.motionpath.readonly\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/motionpath.readonly\"}");
                break;
            case "com.huawei.android.hms.health.health.bf":
                sb.append(",{\"id\":115,\"name\":\"SCOPE_HEALTH_HEALTH_BF\",\"permissions\":[\"com.huawei.android.hms.health.health.bf\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.bf\"}");
                break;
            case "com.huawei.android.hms.health.health.bg":
                sb.append(",{\"id\":113,\"name\":\"SCOPE_HEALTH_HEALTH_BG\",\"permissions\":[\"com.huawei.android.hms.health.health.bg\"],\"uri\":\"");
                sb.append(str2);
                sb.append("/health/health.bg\"}");
                break;
            default:
                return null;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    private static String d(String str, String str2) {
        str.hashCode();
        switch (str) {
            case "com.huawei.android.hms.health.sport":
                return " " + str2 + "/health/sport";
            case "com.huawei.android.hms.health.health.slp.readonly":
                return " " + str2 + UriConstants.READ_SLEEP_DATA;
            case "com.huawei.android.hms.health.health.wgt.readonly":
                return " " + str2 + UriConstants.READ_WEIGHT;
            case "com.huawei.android.hms.health.health.slp":
                return " " + str2 + "/health/health.slp";
            case "com.huawei.android.hms.health.health.wgt":
                return " " + str2 + "/health/health.wgt";
            case "com.huawei.android.hms.health.profile.readonly":
                return " " + str2 + UriConstants.READ_PERSONAL_PROFILE;
            case "com.huawei.android.hms.health.sport.readonly":
                return " " + str2 + UriConstants.READ_SPORTS_DATA;
            case "com.huawei.android.hms.health.profile":
                return " " + str2 + UriConstants.READ_WRITE_PERSONAL_PROFILE;
            case "com.huawei.android.hms.health.health.hr":
                return " " + str2 + "/health/health.hr";
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    private static String b(String str, String str2) {
        str.hashCode();
        switch (str) {
            case "com.huawei.android.hms.health.health.hr.readonly":
                return " " + str2 + UriConstants.READ_HEART_RATE;
            case "com.huawei.android.hms.health.health.bg.readonly":
                return " " + str2 + UriConstants.READ_BLOOD_SUGAR;
            case "com.huawei.android.hms.health.health.bf.readonly":
                return " " + str2 + "/health/health.bf.readonly";
            case "com.huawei.android.hms.health.health.ecg.readonly":
                return " " + str2 + "/health/health.ecg.readonly";
            case "com.huawei.android.hms.health.motionpath":
                return " " + str2 + "/health/motionpath";
            case "com.huawei.android.hms.health.health.ecg":
                return " " + str2 + "/health/health.ecg";
            case "com.huawei.android.hms.health.motionpath.readonly":
                return " " + str2 + UriConstants.READ_MOVEMENT_TRACKS;
            case "com.huawei.android.hms.health.health.bf":
                return " " + str2 + "/health/health.bf";
            case "com.huawei.android.hms.health.health.bg":
                return " " + str2 + "/health/health.bg";
            default:
                return null;
        }
    }
}

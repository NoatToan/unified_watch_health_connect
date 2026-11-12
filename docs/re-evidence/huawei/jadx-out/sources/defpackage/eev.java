package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class eev {
    private static int c(int i) {
        if (i == -2 || i == 5 || i == 7 || i == 0 || i == 1 || i == 18 || i == 19 || i == 23 || i == 24 || i == 44 || i == 45) {
            return 2;
        }
        switch (i) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return 2;
            default:
                return -1;
        }
    }

    private static int f(int i) {
        if (i == 2 || i == 3 || i == 20 || i == 21) {
            return 1;
        }
        if (i != 32) {
            switch (i) {
                case 8:
                case 9:
                    return 1;
                case 10:
                    break;
                default:
                    return -1;
            }
        }
        return 3;
    }

    public static int b(int i) {
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        if (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null || pluginInfoByDeviceType.i().af() == -1) {
            return -1;
        }
        return pluginInfoByDeviceType.i().af();
    }

    public static boolean e(int i) {
        Map<String, String> mapH;
        pic picVarC = EzPluginManager.b().c(i);
        if (picVarC != null && picVarC.h() != null && (mapH = picVarC.h().h()) != null) {
            String str = mapH.get("upgrade_start");
            String str2 = mapH.get("upgrade_end");
            if (str != null && str2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    LogUtil.a("PluginCommonUtil", "isSupportUpdate mDeviceSupportStart = ", Long.valueOf(Long.parseLong(str)), ",time = ", Long.valueOf(jCurrentTimeMillis), ",mDeviceSupportEnd = ", Long.valueOf(Long.parseLong(str2)));
                    if (Long.parseLong(str) <= jCurrentTimeMillis && Long.parseLong(str2) >= jCurrentTimeMillis) {
                        return true;
                    }
                } catch (NumberFormatException unused) {
                    LogUtil.e("PluginCommonUtil", "isSupportUpdate Exception.");
                }
            }
        }
        return false;
    }

    public static boolean b(int i, boolean z, boolean z2) {
        pic picVarC = EzPluginManager.b().c(i);
        if (picVarC == null || picVarC.h() == null) {
            return (!z || z2 || i == 12) ? false : true;
        }
        return b(picVarC, i, z, z2);
    }

    private static boolean b(pic picVar, int i, boolean z, boolean z2) {
        if (picVar.h().j() == 1) {
            return true;
        }
        if (picVar.h().j() != 2) {
            return (!z || z2 || i == 12) ? false : true;
        }
        LogUtil.a("PluginCommonUtil", "isDisplayUpdate support AutoDownload with WLAN is false");
        return false;
    }

    public static boolean d(Map<String, String> map) {
        if (map == null) {
            return true;
        }
        String strA = a(map);
        if (TextUtils.isEmpty(strA)) {
            return true;
        }
        int iE = CommonUtil.e(BaseApplication.getContext());
        LogUtil.a("PluginCommonUtil", "isPublishVersion publishVersion : ", strA, " currentVersion: ", Integer.valueOf(iE));
        return e(strA, iE);
    }

    private static String a(Map<String, String> map) {
        LogUtil.a("PluginCommonUtil", "is domestic version");
        if (map.get("domestic") != null) {
            return map.get("domestic");
        }
        return null;
    }

    private static boolean e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : str.replace(" ", "").split(",")) {
            if (!TextUtils.isEmpty(str2) && a(str2, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str, int i) {
        if (str.contains(Constants.LINK)) {
            String[] strArrSplit = str.split(Constants.LINK);
            if (strArrSplit.length != 2) {
                return false;
            }
            int iA = lsk.a(strArrSplit[0], 10);
            int iA2 = lsk.a(strArrSplit[1], 10);
            LogUtil.a("PluginCommonUtil", "isInPublishVersion beginVersion : ", Integer.valueOf(iA), " endVersion: ", Integer.valueOf(iA2));
            if (i >= iA && i <= iA2) {
                return true;
            }
        } else {
            int iA3 = lsk.a(str, 10);
            LogUtil.a("PluginCommonUtil", "isInPublishVersion numVersion : ", Integer.valueOf(iA3));
            if (iA3 == i) {
                return true;
            }
        }
        return false;
    }

    public static JSONObject b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PluginCommonUtil", "getAiTipsProductByHiLinkId hiLinkDeviceId is empty");
            return null;
        }
        try {
            pic picVarE = e(str);
            if (picVarE == null) {
                LogUtil.j("PluginCommonUtil", "getAiTipsProductByHiLinkId ezPluginInfo is null");
                return null;
            }
            String string = new JSONObject(picVarE.h().b()).getString("ai_tips_product_" + str);
            if (TextUtils.isEmpty(string)) {
                LogUtil.j("PluginCommonUtil", "getAiTipsProductByHiLinkId hiLinkDeviceInfo is empty");
                return null;
            }
            return new JSONObject(string);
        } catch (JSONException unused) {
            LogUtil.e("PluginCommonUtil", "getAiTipsProductByHiLinkId JSONException");
            return null;
        }
    }

    private static pic e(String str) throws JSONException {
        List<phz> listD = EzPluginManager.b().d();
        pic picVarE = null;
        if (listD == null || listD.isEmpty()) {
            LogUtil.j("PluginCommonUtil", "getEzPluginInfo indexInfoList is null or indexInfoList is empty");
            return null;
        }
        Iterator<phz> it = listD.iterator();
        while (it.hasNext()) {
            picVarE = e(it.next().a(), str);
            if (picVarE != null) {
                LogUtil.a("PluginCommonUtil", "getEzPluginInfo ezPluginInfo not null");
                break;
            }
        }
        return picVarE;
    }

    private static pic e(String str, String str2) throws JSONException {
        pic picVarA = EzPluginManager.b().a(str);
        if (picVarA == null) {
            LogUtil.j("PluginCommonUtil", "getPluginInfo pluginInfo is null");
            return null;
        }
        phv phvVarH = picVarA.h();
        if (phvVarH == null || TextUtils.isEmpty(phvVarH.b())) {
            LogUtil.j("PluginCommonUtil", "getPluginInfo pluginInfoForWear is null or aiTips is empty");
            return null;
        }
        if (new JSONObject(phvVarH.b()).has("ai_tips_product_" + str2)) {
            return picVarA;
        }
        return null;
    }

    public static int d(int i) {
        int iC = c(i);
        if (iC == -1) {
            iC = f(i);
        }
        if (iC == -1) {
            iC = a(i);
        }
        LogUtil.a("PluginCommonUtil", "getDeviceClassification() deviceType: ", Integer.valueOf(i), " deviceClassification: ", Integer.valueOf(iC));
        return iC;
    }

    private static int a(int i) {
        int iB = b(i);
        if (iB == 1) {
            return 2;
        }
        if (iB == 2) {
            return 1;
        }
        return iB == 5 ? 3 : -1;
    }
}

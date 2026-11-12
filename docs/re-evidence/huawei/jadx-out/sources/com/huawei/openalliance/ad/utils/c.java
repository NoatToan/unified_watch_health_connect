package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.PromoteInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.UiEngineMethodName;
import com.huawei.openalliance.ad.constant.UiEngineParam;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fadata.PPSAbilityDataContent;
import com.huawei.openalliance.ad.ft;
import com.huawei.openalliance.ad.gr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.mz;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class c {
    private static String c(Context context, ContentRecord contentRecord) {
        String name;
        int iD = contentRecord.D();
        if (iD == 0) {
            return null;
        }
        PromoteInfo promoteInfoAh = contentRecord.ah();
        if (iD == 10) {
            if (promoteInfoAh != null && promoteInfoAh.getType() == 2 && !TextUtils.isEmpty(promoteInfoAh.getName())) {
                return context.getResources().getString(R.string.hiad_wechat_mini_spec, promoteInfoAh.getName());
            }
            String string = context.getResources().getString(R.string.hiad_wechat_mini_spec, "");
            if (string == null) {
                return null;
            }
            return string.trim();
        }
        if (iD == 11) {
            return context.getResources().getString(R.string.hiad_share_wx);
        }
        if (iD == 8) {
            return context.getResources().getString(R.string.hiad_appGallery);
        }
        if (promoteInfoAh != null) {
            name = promoteInfoAh.getName();
            if (promoteInfoAh.getType() == 1) {
                boolean zIsEmpty = TextUtils.isEmpty(name);
                Resources resources = context.getResources();
                if (!zIsEmpty) {
                    return resources.getString(R.string.hiad_fast_app_spec, name);
                }
                String string2 = resources.getString(R.string.hiad_fast_app_spec, "");
                if (string2 == null) {
                    return null;
                }
                return string2.trim();
            }
        } else {
            name = null;
        }
        if (TextUtils.isEmpty(name)) {
            AppInfo appInfoAg = contentRecord.ag();
            if (appInfoAg == null) {
                return null;
            }
            if (!TextUtils.isEmpty(appInfoAg.getAppName()) && k.a(context, appInfoAg.getPackageName())) {
                return appInfoAg.getAppName();
            }
        }
        return name;
    }

    public static boolean b(Integer num) {
        return num != null && num.intValue() == 7;
    }

    public static boolean b(Context context, ContentRecord contentRecord) {
        return (context == null || contentRecord == null || contentRecord.ag() == null || contentRecord.D() != 7 || k.a(context, contentRecord.ag().getPackageName())) ? false : true;
    }

    public static boolean b() {
        String strA = com.huawei.openalliance.ad.e.a();
        return !TextUtils.isEmpty(strA) && 30461200 <= Integer.parseInt(strA);
    }

    private static String b(ContentRecord contentRecord, Context context, boolean z) {
        AppInfo appInfoAg = contentRecord.ag();
        if (appInfoAg == null) {
            Resources resources = context.getResources();
            return z ? resources.getString(R.string.hiad_click_to_learn_more) : resources.getString(R.string.hiad_click_material, context.getResources().getString(R.string.hiad_learn_more));
        }
        if (!k.a(context, appInfoAg.getPackageName())) {
            return null;
        }
        if (TextUtils.isEmpty(appInfoAg.getAppName()) || !k.a(context, appInfoAg.getPackageName())) {
            Resources resources2 = context.getResources();
            return z ? resources2.getString(R.string.hiad_click_to_learn_more) : resources2.getString(R.string.hiad_click_material, context.getResources().getString(R.string.hiad_learn_more));
        }
        Resources resources3 = context.getResources();
        return z ? resources3.getString(R.string.hiad_click_open_to, appInfoAg.getAppName()) : resources3.getString(R.string.hiad_click_material_open, appInfoAg.getAppName());
    }

    public static String b(ContentRecord contentRecord) {
        String str;
        if (contentRecord == null) {
            str = "content record is null, get the app package name is null";
        } else {
            if (contentRecord.ag() != null) {
                return contentRecord.ag().getPackageName();
            }
            str = "getAppInfo is null, get the app package name is null";
        }
        hw.a("AdDataUtil", str);
        return null;
    }

    private static String b(Context context, PromoteInfo promoteInfo, boolean z) {
        if (promoteInfo == null || promoteInfo.getType() != 2 || TextUtils.isEmpty(promoteInfo.getName())) {
            return z ? context.getResources().getString(R.string.hiad_click_to_open_wechat_mini_spec) : context.getResources().getString(R.string.hiad_click_material_open, context.getResources().getString(R.string.hiad_wechat_mini_spec, ""));
        }
        Resources resources = context.getResources();
        return z ? resources.getString(R.string.hiad_click_open_to, promoteInfo.getName()) : resources.getString(R.string.hiad_click_material_open, promoteInfo.getName());
    }

    public static boolean a(String str, Map<String, Integer> map) {
        String str2;
        if (br.a(map)) {
            str2 = "unsupportedTags is empty";
        } else {
            hw.b("AdDataUtil", "tag: %s, unsupportedTags: %s", str, map);
            Map map2 = (Map) bk.b(str, Map.class, Integer.class);
            if (!br.a(map2)) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    hw.a("AdDataUtil", "unsupportedTag: %s, templateTags: %s", entry, map2);
                    Integer value = entry.getValue();
                    if (value != null && value.intValue() >= -1 && value.intValue() <= 9 && map2.containsKey(entry.getKey()) && value.equals(map2.get(entry.getKey()))) {
                        return true;
                    }
                }
                return false;
            }
            str2 = "tag is empty";
        }
        hw.b("AdDataUtil", str2);
        return false;
    }

    public static boolean a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(UiEngineParam.DSL_DIR_PATH, str);
        bundle.putString(UiEngineParam.STYLE_PKG_VERSION, str2);
        gr grVar = new gr(a(UiEngineMethodName.UPDATE_STYLE, bundle, (IObjectWrapper) null));
        boolean zA = grVar.a(UiEngineParam.UPDATE_STYLE_RESULT);
        String strA = grVar.a(UiEngineParam.UPDATE_ERROR_MSG, "");
        hw.b("AdDataUtil", "update style result:%s", Boolean.valueOf(zA));
        if (!zA) {
            hw.a("AdDataUtil", "error msg:%s", strA);
        }
        return zA;
    }

    public static boolean a(Integer num) {
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 1 && iIntValue != 2 && iIntValue != 6) {
            switch (iIntValue) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean a(ContentRecord contentRecord, AppStatus appStatus) {
        return contentRecord == null || appStatus == null || contentRecord.D() != 7 || appStatus != AppStatus.INSTALLED;
    }

    public static boolean a(ContentRecord contentRecord) {
        return contentRecord != null && dg.d(contentRecord.o()) && contentRecord.o().contains(".");
    }

    public static boolean a(CtrlExt ctrlExt, Integer num) {
        return a(ctrlExt) && a(num);
    }

    public static boolean a(CtrlExt ctrlExt) {
        if (ctrlExt == null) {
            return false;
        }
        return "1".equals(ctrlExt.a());
    }

    public static boolean a(com.huawei.hms.ads.uiengine.e eVar) {
        if (b() && eVar != null) {
            return false;
        }
        hw.c("AdDataUtil", "not support engine down or engineUtil is null");
        return true;
    }

    public static boolean a(Context context, ContentRecord contentRecord, String str, Asset asset) {
        try {
            Pair<String, String> pairA = a(context, str, Constants.TPLATE_CACHE);
            if (pairA == null || TextUtils.isEmpty((CharSequence) pairA.first) || TextUtils.isEmpty((CharSequence) pairA.second)) {
                return false;
            }
            if (asset != null) {
                asset.b((String) pairA.first);
            }
            if (contentRecord == null) {
                return true;
            }
            contentRecord.q((String) pairA.second);
            return true;
        } catch (Throwable th) {
            hw.b("AdDataUtil", "get path err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean a(Context context, ContentRecord contentRecord, String str) {
        Pair<String, String> pairA = a(context, str, "normal");
        if (pairA == null || TextUtils.isEmpty((CharSequence) pairA.first) || TextUtils.isEmpty((CharSequence) pairA.second)) {
            return false;
        }
        if (contentRecord == null) {
            return true;
        }
        contentRecord.i((String) pairA.first);
        contentRecord.q((String) pairA.second);
        return true;
    }

    public static boolean a(Context context, DefaultTemplate defaultTemplate, String str, int i) {
        String str2;
        if (context == null) {
            return false;
        }
        String strA = com.huawei.openalliance.ad.e.a();
        if (TextUtils.isEmpty(strA) || 30459301 > Integer.parseInt(strA)) {
            str2 = "uiengine not support";
        } else if (defaultTemplate == null || !defaultTemplate.c()) {
            str2 = "data is invalid";
        } else {
            if (a(i, defaultTemplate.a())) {
                if (defaultTemplate.b() == null) {
                    hw.b("AdDataUtil", "isShowV2Tpt, no fcCtl");
                    return true;
                }
                Integer numB = defaultTemplate.b();
                int iIntValue = numB.intValue();
                int iA = ft.a(context).a(str);
                hw.b("AdDataUtil", "isShowV2Tpt, tptFcCtl = %s, showTimes = %s", numB, Integer.valueOf(iA));
                return iIntValue > iA;
            }
            str2 = "templateId is invalid";
        }
        hw.b("AdDataUtil", str2);
        return false;
    }

    private static boolean a(int i, String str) {
        com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
        if (eVarB == null) {
            return false;
        }
        try {
            return eVarB.a(str, i, (Bundle) null);
        } catch (Throwable th) {
            hw.b("AdDataUtil", "check valid err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static void a(Map<String, List<INativeAd>> map, String str, List<INativeAd> list) {
        if (map == null || TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        List<INativeAd> list2 = map.get(str);
        if (list2 != null) {
            list2.addAll(list);
        } else {
            map.put(str, list);
        }
    }

    public static void a(String str, IPPSUiEngineCallback iPPSUiEngineCallback) {
        if (dg.b(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("queryH5Dsl", str);
        a("queryH5Dsl", bundle, (IObjectWrapper) null, iPPSUiEngineCallback);
    }

    public static void a(String str, Bundle bundle, IObjectWrapper iObjectWrapper, IPPSUiEngineCallback iPPSUiEngineCallback) {
        try {
            com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
            if (eVarB != null) {
                eVarB.a(str, bundle, iObjectWrapper, iPPSUiEngineCallback);
            }
        } catch (Throwable th) {
            hw.c("AdDataUtil", "async invoke ui engine method %s, err: %s", str, th.getClass().getSimpleName());
        }
    }

    public static List<String> a() {
        try {
            if (com.huawei.openalliance.ad.e.b() != null) {
                return com.huawei.openalliance.ad.e.b().a((Bundle) null);
            }
        } catch (Throwable th) {
            hw.b("AdDataUtil", "get blackTptIdList err: %s", th.getClass().getSimpleName());
        }
        return null;
    }

    public static String a(ContentRecord contentRecord, Context context, boolean z) {
        int iD;
        PPSAbilityDataContent pPSAbilityDataContent;
        if (contentRecord == null || (iD = contentRecord.D()) == 0 || iD == 1) {
            return null;
        }
        if (iD == 8) {
            return a(context, contentRecord.f(), z);
        }
        if (iD == 9 && (pPSAbilityDataContent = (PPSAbilityDataContent) bk.b(contentRecord.aS(), PPSAbilityDataContent.class, new Class[0])) != null) {
            return a(context, pPSAbilityDataContent.a(), z);
        }
        PromoteInfo promoteInfoAh = contentRecord.ah();
        if (iD == 10) {
            return b(context, promoteInfoAh, z);
        }
        if (iD == 11) {
            return a(context, z);
        }
        return (promoteInfoAh == null || promoteInfoAh.getType() != 1) ? b(contentRecord, context, z) : a(context, promoteInfoAh, z);
    }

    private static String a(Context context, boolean z) {
        return context.getResources().getString(z ? R.string.hiad_click_open_to : R.string.hiad_click_material_open, context.getResources().getString(R.string.hiad_share_wx));
    }

    private static String a(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z ? context.getResources().getString(R.string.hiad_click_to_open_harmony_service) : context.getResources().getString(R.string.hiad_click_material_open, context.getResources().getString(R.string.hiad_harmony_service_spec, ""));
        }
        Resources resources = context.getResources();
        return z ? resources.getString(R.string.hiad_click_open_to, str) : resources.getString(R.string.hiad_click_material_open, str);
    }

    public static String a(Context context, ContentRecord contentRecord, int i) {
        if (context == null || contentRecord == null) {
            return null;
        }
        String strC = c(context, contentRecord);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        Resources resources = context.getResources();
        return i == 0 ? resources.getString(R.string.hiad_touch_jump_to, strC) : resources.getString(R.string.hiad_jump_to, strC);
    }

    public static String a(Context context, ContentRecord contentRecord) {
        List<String> listM;
        if (contentRecord != null && contentRecord.j() != null) {
            MetaData metaDataJ = contentRecord.j();
            if (2 == contentRecord.F()) {
                listM = metaDataJ.N();
            } else {
                listM = (9 == contentRecord.F() || 12 == contentRecord.F()) ? metaDataJ.M() : null;
            }
            if (!bm.a(listM)) {
                return bd.b(context, listM.get(0));
            }
        }
        return null;
    }

    private static String a(Context context, PromoteInfo promoteInfo, boolean z) {
        if (TextUtils.isEmpty(promoteInfo.getName())) {
            return z ? context.getResources().getString(R.string.hiad_click_to_open_quick_app) : context.getResources().getString(R.string.hiad_click_material_open, context.getResources().getString(R.string.hiad_fast_app_spec, ""));
        }
        Resources resources = context.getResources();
        return z ? resources.getString(R.string.hiad_click_open_to, promoteInfo.getName()) : resources.getString(R.string.hiad_click_material_open, promoteInfo.getName());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public static String a(Context context, int i, boolean z) {
        int i2;
        String strA = a(context, R.string.hiad_click_card_to_open);
        if (context != null) {
            if (i == 7 || i == 8) {
                i2 = R.string.hiad_click_open_to;
            } else if (i == 12) {
                if (z) {
                    i2 = R.string.hiad_click_open_to;
                } else {
                    i2 = R.string.hiad_click_material_open;
                }
            }
            return a(context, i2);
        }
        return strA;
    }

    private static String a(Context context, int i) {
        return context.getResources().getString(i, context.getResources().getString(R.string.hiad_appGallery));
    }

    public static Pair<String, String> a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("cacheType", str2);
            CallResult callResultA = mz.a(context).a(RTCMethods.QUERY_FILE_PATH, jSONObject.toString(), String.class);
            if (200 == callResultA.getCode()) {
                hw.b("AdDataUtil", "getFilePathFromKit success");
                JSONObject jSONObject2 = new JSONObject((String) callResultA.getData());
                return new Pair<>(jSONObject2.optString("filePath"), jSONObject2.optString(MapKeyNames.CONTENT_DOWN_METHOD));
            }
            hw.b("AdDataUtil", "getFilePathFromKit fail");
            return null;
        } catch (Throwable th) {
            hw.c("AdDataUtil", "getFilePathFromKit err: %s", th.getClass().getSimpleName());
        }
    }

    public static Bundle a(String str, Bundle bundle, IObjectWrapper iObjectWrapper) {
        try {
            com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
            if (eVarB != null) {
                return eVarB.a(str, bundle, iObjectWrapper);
            }
            return null;
        } catch (Throwable th) {
            hw.c("AdDataUtil", "invoke ui engine method %s, err: %s", str, th.getClass().getSimpleName());
            return null;
        }
    }
}

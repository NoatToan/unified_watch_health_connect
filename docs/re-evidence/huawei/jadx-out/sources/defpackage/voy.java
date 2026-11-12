package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.main.stories.healthzone.model.GetSpecifiedAuthUserReq;
import com.huawei.ui.main.stories.healthzone.model.HasFollowListCallBack;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class voy {
    public static boolean a(Context context, List<voo> list, String str) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "isMemberListSameToLocal context is null");
            return true;
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), str);
        LogUtil.a("HealthZone_HealthZoneUtil", "localList is ", strE);
        if (c(context) == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "getLocalBelong is null");
            return true;
        }
        if (!c(context).equals(LoginInit.getInstance(context).getAccountInfo(1011))) {
            strE = "";
        }
        if (TextUtils.isEmpty(strE) && njy.e(list)) {
            LogUtil.a("HealthZone_HealthZoneUtil", "localMemberInfoCloudList and locallist is empty1");
            return true;
        }
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        for (voo vooVar : list) {
            voh vohVar = new voh();
            vohVar.c(vooVar.e());
            vohVar.c(vooVar.c());
            vohVar.d(vooVar.a());
            arrayList.add(vohVar);
            LogUtil.d("HealthZone_HealthZoneUtil", "localMemberInfo = ", Integer.valueOf(vohVar.d()));
        }
        if (njy.e(arrayList) && TextUtils.isEmpty(strE)) {
            LogUtil.a("HealthZone_HealthZoneUtil", "localMemberInfoCloudList and locallist is empty2");
            return true;
        }
        return b(new Gson().toJson(arrayList), strE);
    }

    public static void d(Context context, List<voo> list, String str) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "saveFollowListToLocal context is null");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        if (list != null) {
            for (voo vooVar : list) {
                voh vohVar = new voh();
                vohVar.c(vooVar.e());
                vohVar.c(vooVar.c());
                vohVar.d(vooVar.a());
                arrayList.add(vohVar);
            }
        }
        if (njy.e(arrayList)) {
            SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), str, "", null);
        } else {
            SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), str, new Gson().toJson(arrayList), null);
        }
    }

    public static void b(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "saveFollowListToLocal context is null");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), str2, str, null);
        }
    }

    public static String b(Context context, String str) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "saveFollowListToLocal context is null");
            return "";
        }
        return SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), str);
    }

    public static boolean b(String str, String str2) {
        List<voh> listE = e(str);
        List<voh> listE2 = e(str2);
        Comparator<voh> comparator = new Comparator<voh>() { // from class: voy.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(voh vohVar, voh vohVar2) {
                if (vohVar.b() > vohVar2.b()) {
                    return 1;
                }
                return vohVar.b() < vohVar2.b() ? -1 : 0;
            }
        };
        Collections.sort(listE, comparator);
        Collections.sort(listE2, comparator);
        return listE.equals(listE2);
    }

    public static List<voh> e(String str) {
        JsonSyntaxException e;
        List<voh> list;
        ArrayList arrayList = new ArrayList();
        try {
            list = (List) new Gson().fromJson(str, new TypeToken<List<voh>>() { // from class: com.huawei.ui.main.stories.healthzone.util.HealthZoneUtil$2
            }.getType());
            if (list != null) {
                return list;
            }
            try {
                return new ArrayList(10);
            } catch (JsonSyntaxException e2) {
                e = e2;
                LogUtil.e("HealthZone_HealthZoneUtil", "parseStringToFollowList:", LogAnonymous.b(e));
                return list;
            }
        } catch (JsonSyntaxException e3) {
            e = e3;
            list = arrayList;
        }
    }

    public static List<voh> c(Context context, String str) {
        JsonSyntaxException e;
        List<voh> arrayList = new ArrayList<>(10);
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "getMemberListFromLocal context is null");
            return arrayList;
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), str);
        if (c(context) == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "getLocalBelong is null");
            return arrayList;
        }
        if (!c(context).equals(LoginInit.getInstance(context).getAccountInfo(1011))) {
            return arrayList;
        }
        if (strE == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "localList is null");
            return arrayList;
        }
        try {
            List<voh> list = (List) new Gson().fromJson(strE, new TypeToken<List<voh>>() { // from class: com.huawei.ui.main.stories.healthzone.util.HealthZoneUtil$3
            }.getType());
            if (list != null) {
                return list;
            }
            try {
                return new ArrayList(10);
            } catch (JsonSyntaxException e2) {
                e = e2;
                arrayList = list;
                LogUtil.e("HealthZone_HealthZoneUtil", "getMemberListFromLocal:", LogAnonymous.b(e));
                return arrayList;
            }
        } catch (JsonSyntaxException e3) {
            e = e3;
        }
    }

    public static void b(Context context, vof vofVar) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "saveLocalImage context is null");
            return;
        }
        List<vof> listA = a(context);
        if (vofVar == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "saveLocalImage localHealthZoneImage is null");
            return;
        }
        boolean z = false;
        for (vof vofVar2 : listA) {
            if (vofVar2 != null && vofVar.d() == vofVar2.d()) {
                vofVar2.b(vofVar.c());
                z = true;
            }
        }
        if (!z) {
            listA.add(vofVar);
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (vof vofVar3 : listA) {
                if (vofVar3 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mHuid", vofVar3.d());
                    jSONObject.put("mImageUrl", vofVar3.c());
                    jSONArray.put(jSONObject);
                }
            }
            SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "key_health_zone_image", jSONArray.toString(), null);
        } catch (JSONException e) {
            LogUtil.e("HealthZone_HealthZoneUtil", "saveLocalImage", LogAnonymous.b(e));
        }
    }

    public static String d(Context context, long j) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "getLocalImageUrl context is null");
            return null;
        }
        for (vof vofVar : a(context)) {
            if (vofVar != null && j == vofVar.d()) {
                return vofVar.c();
            }
        }
        return null;
    }

    private static List<vof> a(Context context) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "key_health_zone_image");
        ArrayList arrayList = new ArrayList(10);
        try {
            JSONArray jSONArray = new JSONArray(strE);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add((vof) new Gson().fromJson(jSONArray.getString(i), vof.class));
            }
        } catch (JSONException e) {
            LogUtil.e("HealthZone_HealthZoneUtil", "getLocalImageList:", LogAnonymous.b(e));
        }
        return arrayList;
    }

    public static void b(Context context) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "saveLocalBelong context is null");
        } else {
            SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "key_health_zone_belong", String.valueOf(LoginInit.getInstance(context).getAccountInfo(1011)), null);
        }
    }

    public static String c(Context context) {
        if (context == null) {
            LogUtil.j("HealthZone_HealthZoneUtil", "getLocalBelong context is null");
            return "";
        }
        return SharedPreferenceManager.e(context, String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "key_health_zone_belong");
    }

    public static String a(String str) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), str);
    }

    public static void a(final HasFollowListCallBack hasFollowListCallBack) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: voy.3
            @Override // java.lang.Runnable
            public void run() {
                voy.d(hasFollowListCallBack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final HasFollowListCallBack hasFollowListCallBack) {
        voq.c(new ICloudOperationResult<vob>() { // from class: voy.1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void operationResult(vob vobVar, String str, boolean z) {
                if (z) {
                    if (vobVar == null) {
                        LogUtil.j("HealthZone_HealthZoneUtil", "getUserListByAuthUser getFollowRelationsRsp is null");
                        voy.e(hasFollowListCallBack);
                        return;
                    }
                    List<voc> listD = vobVar.d();
                    if (njy.e(listD)) {
                        LogUtil.a("HealthZone_HealthZoneUtil", "getUserListByAuthUser getFollowRelations is empty");
                        voy.e(hasFollowListCallBack);
                        return;
                    }
                    for (voc vocVar : listD) {
                        if (vocVar != null && vocVar.a() == 2) {
                            hasFollowListCallBack.hasFollowList(true);
                            return;
                        }
                    }
                }
                voy.e(hasFollowListCallBack);
            }
        });
    }

    public static void e(final HasFollowListCallBack hasFollowListCallBack) {
        voq.a(new GetSpecifiedAuthUserReq(), new ICloudOperationResult<voa>() { // from class: voy.5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(voa voaVar, String str, boolean z) {
                if (!z) {
                    hasFollowListCallBack.hasFollowList(false);
                    return;
                }
                if (voaVar == null) {
                    hasFollowListCallBack.hasFollowList(false);
                    LogUtil.e("HealthZone_HealthZoneUtil", "getUserListByFollowUser getAuthRelationsRsp is null");
                } else if (voaVar.a() == null) {
                    hasFollowListCallBack.hasFollowList(false);
                    LogUtil.a("HealthZone_HealthZoneUtil", "getUserListByFollowUser getAuthRelations is empty");
                } else {
                    hasFollowListCallBack.hasFollowList(true);
                }
            }
        });
    }

    public static boolean a() {
        String strA = a("sIsFirstHealth");
        return TextUtils.isEmpty(strA) || !strA.equals("1");
    }

    public static Map<String, Integer> e(List<String> list) {
        if (list == null || list.size() == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (String str : list) {
            Integer num = (Integer) map.get(str);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            map.put(str, Integer.valueOf(iIntValue));
        }
        return map;
    }

    public static boolean d(List<voh> list, Map<String, Integer> map) {
        if (list != null && list.size() != 0 && map != null && map.size() != 0) {
            List listAsList = Arrays.asList(HealthZonePushReceiver.SLEEP_SCORE_NOTIFY, HealthZonePushReceiver.FAMILY_CARE_NOTIFY, "4000");
            int iIntValue = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (listAsList.contains(entry.getKey())) {
                    iIntValue += entry.getValue().intValue();
                }
            }
            if (iIntValue > 0 && list.size() == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public static void c(final ResponseCallback<List<vop>> responseCallback) {
        ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "getFamilySpacePendingMsg enter");
        voq.e(new ICloudOperationResult<vor>() { // from class: voy.4
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(vor vorVar, String str, boolean z) {
                LogUtil.a("HealthZone_HealthZoneUtil", "getFamilySpacePendingMsg pendingMessageDataRsp ", Boolean.valueOf(z));
                if (vorVar == null) {
                    ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "pendingMessageDataRsp is null");
                    responseCallback.onResponse(-1, null);
                    return;
                }
                if (!z) {
                    ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "getPendingMessage fail");
                    responseCallback.onResponse(-1, null);
                    return;
                }
                List<vop> listC = vorVar.c();
                if (listC == null) {
                    listC = new ArrayList<>(10);
                    LogUtil.j("HealthZone_HealthZoneUtil", "pendingInfoList is empty");
                    responseCallback.onResponse(-1, null);
                }
                ArrayList arrayList = new ArrayList();
                for (vop vopVar : listC) {
                    if (vopVar.b() != null && TextUtils.equals("1", vopVar.b())) {
                        arrayList.add(vopVar);
                    }
                }
                LogUtil.a("HealthZone_HealthZoneUtil", "pendingInfoList: ", arrayList.toString());
                responseCallback.onResponse(0, arrayList);
            }
        });
    }

    public static void a(final ResponseCallback<Map<String, voo>> responseCallback) {
        ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "getFamilyMemberInfoList enter");
        voq.d(new ICloudOperationResult<vol>() { // from class: voy.8
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void operationResult(vol volVar, String str, boolean z) {
                LogUtil.a("HealthZone_HealthZoneUtil", "memberInfoDataRsp ", Boolean.valueOf(z));
                if (volVar == null) {
                    ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "memberInfoDataRsp is null");
                    responseCallback.onResponse(-1, null);
                    return;
                }
                if (!z) {
                    ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "getMemberInfoList fail");
                    responseCallback.onResponse(-1, null);
                    return;
                }
                List<voo> listC = volVar.c();
                if (njy.e(listC)) {
                    ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "memberInfoList is empty");
                    responseCallback.onResponse(-1, null);
                    return;
                }
                LogUtil.a("HealthZone_HealthZoneUtil", "memberInfoList: ", listC.toString());
                HashMap map = new HashMap();
                for (voo vooVar : listC) {
                    map.put(String.valueOf(vooVar.e()), vooVar);
                }
                responseCallback.onResponse(0, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0037 A[SYNTHETIC] */
    public static void e(Map<String, String> map, ResponseCallback<Map<String, String>> responseCallback) {
        boolean z;
        ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "filterPendingMembersByCache enter");
        if (njy.e(map)) {
            ReleaseLogUtil.d("HealthZone_HealthZoneUtil", "filterPendingMembersByCache map is null or empty");
            responseCallback.onResponse(-1, null);
            return;
        }
        HashMap map2 = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String strE = lua.e("family_space_module", "Family_ask_" + key, "0");
            LogUtil.a("HealthZone_HealthZoneUtil", "cacheValue: ", strE);
            try {
                if (!"0".equals(strE)) {
                    if (!"NA".equals(strE)) {
                        String[] strArrSplit = strE.split("_");
                        if (strArrSplit.length == 2) {
                            if (Long.parseLong(strArrSplit[1]) > jCurrentTimeMillis) {
                            }
                            ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "cacheValue: ", Boolean.valueOf(z));
                            if (!z) {
                                map2.put(key, value);
                            }
                        } else {
                            LogUtil.j("HealthZone_HealthZoneUtil", "Invalid cache format for HUID: " + key + ", value: " + strE);
                        }
                    }
                    z = true;
                    ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "cacheValue: ", Boolean.valueOf(z));
                    if (!z) {
                        map2.put(key, value);
                    }
                }
            } catch (NumberFormatException e) {
                LogUtil.e("HealthZone_HealthZoneUtil", "Failed to parse cache for HUID: " + key + ", value: " + strE, ExceptionUtils.c(e));
                ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "filterPendingMembersByCache exception,", ExceptionUtils.c(e));
            }
            z = false;
            ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "cacheValue: ", Boolean.valueOf(z));
            if (!z) {
                map2.put(key, value);
            }
        }
        ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "Filter completed, Original: " + map.size() + ", Filtered: " + map2.size());
        responseCallback.onResponse(0, map2);
    }

    public static void c(String str) {
        ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "closeFamilyCacheByCache enter");
        String str2 = "Family_ask_" + str;
        String strE = lua.e("family_space_module", str2, "0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("TAG", "closeFamilyCacheByCache cachedValue: ", strE);
        if (TextUtils.equals("0", strE)) {
            lua.f("family_space_module", str2, "1_" + lsl.d(jCurrentTimeMillis, 7));
            return;
        }
        if (TextUtils.equals("NA", strE)) {
            return;
        }
        String[] strArrSplit = strE.split("_");
        if (strArrSplit.length != 2) {
            lua.f("family_space_module", str2, "1_" + lsl.d(jCurrentTimeMillis, 7));
            return;
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            long j = Long.parseLong(strArrSplit[1]);
            if (i >= 3 || j >= jCurrentTimeMillis) {
                if (i >= 3) {
                    lua.f("family_space_module", str2, "NA");
                    ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "closeFamilyCacheByCache SP NA");
                    return;
                }
                return;
            }
            lua.f("family_space_module", str2, (i + 1) + "_" + lsl.d(jCurrentTimeMillis, 7));
        } catch (NumberFormatException e) {
            lua.f("family_space_module", str2, "1_" + lsl.d(jCurrentTimeMillis, 7));
            ReleaseLogUtil.d("R_HealthZone_HealthZoneUtil", "closeFamilyCacheByCache exception,", ExceptionUtils.c(e));
        }
    }
}

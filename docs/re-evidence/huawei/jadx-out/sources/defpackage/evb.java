package defpackage;

import android.text.TextUtils;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
class evb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f33508a;

    evb() {
    }

    static ResourceResultInfo c(JSONObject jSONObject) {
        if (!d(jSONObject)) {
            ReleaseLogUtil.d("MarketingDataParser", "result is invaild.");
            return null;
        }
        try {
            String string = jSONObject.getString("resultInfo");
            if (string.isEmpty()) {
                ReleaseLogUtil.d("MarketingDataParser", "processSingleFromJsonObject failed, resultInfo is null");
                return null;
            }
            ResourceResultInfo resourceResultInfo = (ResourceResultInfo) HiJsonUtil.d(string, ResourceResultInfo.class);
            LogUtil.b("MarketingDataParser", "processSingleFromJsonObject success");
            return resourceResultInfo;
        } catch (JSONException e) {
            ReleaseLogUtil.b("MarketingDataParser", "process single resourceResultInfo failed, exception:" + e);
            return null;
        }
    }

    static Map<Integer, ResourceResultInfo> c(String str, String str2) {
        try {
            return e(new JSONObject(str), str2, true);
        } catch (JSONException e) {
            ReleaseLogUtil.b("MarketingDataParser", "processMultiResultFromString failed, exception:" + e);
            return null;
        }
    }

    static Map<Integer, ResourceResultInfo> e(JSONObject jSONObject, String str, boolean z) {
        HashMap map = new HashMap();
        if (!d(jSONObject)) {
            ReleaseLogUtil.d("MarketingDataParser", "result is invaild.");
            return null;
        }
        try {
            String string = jSONObject.getString("resultInfo");
            if (string.isEmpty()) {
                ReleaseLogUtil.d("MarketingDataParser", "handleFeatureMarketingData no data");
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(string);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String string2 = itKeys.next().toString();
                ResourceResultInfo resourceResultInfo = (ResourceResultInfo) HiJsonUtil.d(jSONObject2.getString(string2), ResourceResultInfo.class);
                int totalNum = resourceResultInfo.getTotalNum();
                if (z && totalNum > 50) {
                    map.putAll(b(Integer.parseInt(string2), str, (totalNum / 500) + 1));
                } else {
                    map.put(Integer.valueOf(Integer.parseInt(string2)), resourceResultInfo);
                }
                LogUtil.c("MarketingDataParser", "one of multi resourceResultInfo parse success, positionID: " + string2);
            }
            return map;
        } catch (NumberFormatException | JSONException e) {
            ReleaseLogUtil.b("MarketingDataParser", "process multi resourceResultInfo failed, exception:" + e);
            return map;
        }
    }

    private static boolean d(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("resultCode");
            if (i != 0) {
                LogUtil.e("MarketingDataParser", "handleFeatureMarketingData resultCode = ", Integer.valueOf(i), ",resultDesc = ", jSONObject.getString("resultDesc"));
                if ((i == 1002 || i == 1004) && f33508a < 20) {
                    LogUtil.e("MarketingDataParser", "Token invaild, try login in.");
                    f33508a++;
                    LoginInit.tryLoginWhenTokenInvalid();
                }
                return false;
            }
            f33508a = 0;
            return true;
        } catch (JSONException unused) {
            LogUtil.d("MarketingDataParser", "check result valid JSONException.");
            return false;
        }
    }

    private static Map<Integer, ResourceResultInfo> b(int i, String str, int i2) {
        ReleaseLogUtil.c("MarketingDataParser", "resource count is more than 500, requesting more...");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 1; i3 <= i2; i3++) {
            String strA = evf.a(arrayList, str, i3, false);
            if (!TextUtils.isEmpty(strA)) {
                arrayList2.add(strA);
            }
        }
        if (njy.e(arrayList2)) {
            ReleaseLogUtil.d("MarketingDataParser", "result invalid");
            return new HashMap();
        }
        return d(i, arrayList2);
    }

    private static Map<Integer, ResourceResultInfo> d(int i, List<String> list) {
        Iterator<String> it = list.iterator();
        ResourceResultInfo resourceResultInfoC = null;
        while (it.hasNext()) {
            try {
                JSONObject jSONObject = new JSONObject(it.next());
                if (resourceResultInfoC == null) {
                    resourceResultInfoC = c(jSONObject);
                } else {
                    ResourceResultInfo resourceResultInfoC2 = c(jSONObject);
                    if (resourceResultInfoC2 != null) {
                        resourceResultInfoC.getResources().addAll(resourceResultInfoC2.getResources());
                    }
                }
            } catch (JSONException e) {
                ReleaseLogUtil.b("MarketingDataParser", "combineSingleSourcesMultiPage failed, exception:" + e);
                return null;
            }
        }
        HashMap map = new HashMap();
        map.put(Integer.valueOf(i), resourceResultInfoC);
        return map;
    }
}

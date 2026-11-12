package com.xiaomi.hm.health.device.webapi;

import android.util.Base64;
import com.huami.devicex.injection.basic.HRDataManagerApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.exception.GettingTokenErrorException;
import com.huami.network.hmnetwork.exception.GettingTokenInUIThreadException;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.util.HealthDataParser;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes17.dex */
public class HeartRateWeb {
    private static final String a = "HeartRateWeb";
    private static final String b = "type";
    private static final String c = "deviceType";
    private static final String d = "limit";
    private static final String e = "startTime";
    private static final String f = "endTime";
    private static final String g = "timestamp_list";
    private static final String h = "v1/data/heart_rate.json";
    private static final String i = "users/{userId}/heartRate";
    private static final String j = "users/{userId}/heartRate?deviceType={dt}&type={type}";
    private static final String k = "users/{userId}/heartRate/{time}";
    private static final int l = 1;
    private static final Lazy<DeviceManagerApi> m = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<HRDataManagerApi> n = KoinJavaComponent.inject(HRDataManagerApi.class);

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ List[] a;

        public a(List[] listArr) {
            this.a = listArr;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.d(HeartRateWeb.a, "heart rate onCancel :" + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.d(HeartRateWeb.a, "heart rate load completed", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess()) {
                HMLog.i(HeartRateWeb.a, "fetch hr list failed", new Object[0]);
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.d(HeartRateWeb.a, "fetch hr list response text : \n" + str, new Object[0]);
            this.a[0] = HeartRateWeb.e(str);
        }
    }

    private static int b(String str, int i2) {
        int heartRate = i2 == 1 ? HealthDataParser.toHeartRate(str) : 0;
        if (n.getValue().isValidHeartRate(heartRate)) {
            return heartRate;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode == null || bArrDecode.length <= 0) {
            return 0;
        }
        return bArrDecode[0] & 255;
    }

    private static String c(List<HeartRate> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<HeartRate> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(getJSONObject(it2.next()));
        }
        return jSONArray.toString();
    }

    private static String d(List<HeartRate> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<HeartRate> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().getTime());
        }
        return jSONArray.toString();
    }

    public static void deleteManualHeartRateData(List<HeartRate> list, IHMSimpleHttpResponseHandler iHMSimpleHttpResponseHandler) {
        if (list.size() <= 0) {
            return;
        }
        String strD = d(list);
        HMLog.d(a, "heart rate time list : " + strD, new Object[0]);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("type", 2);
        systemParams.put(g, strD);
        String url = HMServerDef.getUrl(h);
        HMLog.d(a, "params : " + systemParams.toString(), new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.DELETE, true, iHMSimpleHttpResponseHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HeartRate> e(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("items");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                    HeartRate heartRate = new HeartRate();
                    int iOptInt = jSONObject.optInt("type");
                    heartRate.setState(1);
                    heartRate.setTime(Long.valueOf(jSONObject.optLong("generatedTime")));
                    heartRate.setType(Integer.valueOf(iOptInt == 1 ? 2 : iOptInt));
                    heartRate.setDevice_id(jSONObject.optString("deviceId"));
                    heartRate.setDevice_source(Integer.valueOf(jSONObject.optInt("deviceSource")));
                    int iB = b(jSONObject.getString(ParamKey.heartRateData), iOptInt);
                    if (iB <= 0) {
                        HMLog.i(a, "hr error:" + iB, new Object[0]);
                    } else {
                        heartRate.setHr(Integer.valueOf(iB));
                        arrayList.add(heartRate);
                    }
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static JSONObject getJSONObject(HeartRate heartRate) {
        JSONObject jSONObject = new JSONObject();
        int iIntValue = heartRate.getHr().intValue();
        try {
            jSONObject.put("generatedTime", heartRate.getTime());
            jSONObject.put(ParamKey.heartRateData, Base64.encodeToString(new byte[]{(byte) iIntValue}, 2));
            jSONObject.put("type", 1);
            jSONObject.put("deviceId", heartRate.getDevice_id());
            jSONObject.put("deviceSource", heartRate.getDevice_source());
            jSONObject.put("timeZone", "" + ((Calendar.getInstance().getTimeZone().getRawOffset() / 3600) / 1000));
        } catch (JSONException e2) {
            HMLog.d(a, "toJSONObject:" + e2.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    public static List<HeartRate> getManualHeartRateDataByTimeInSyncWay(Long l2, int i2) {
        if (l2 == null) {
            l2 = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2.longValue() * 1000);
        calendar.add(2, -2);
        return getManualHeartRateDataByTimeInSyncWay(calendar.getTimeInMillis() / 1000, l2.longValue(), i2);
    }

    public static void syncHeartRateDataToServer(List<HeartRate> list, IHMHttpResponseHandler iHMHttpResponseHandler) {
        String strC = c(list);
        HMLog.d(a, "need sync heart rate data : " + strC, new Object[0]);
        String strReplace = HMServerDef.getUrl(j).replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()).replace("{dt}", "" + m.getValue().getMajorDeviceType().getValue()).replace("{type}", "1");
        try {
            HMLog.i(a, "add json: " + strC, new Object[0]);
            HashSet hashSet = new HashSet();
            hashSet.add(strC);
            hashSet.add("application/json");
            HMWebUtil.doSeparateRequest(strReplace, HMWebUtil.getSystemHeader(), (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) iHMHttpResponseHandler, new HMHttpConfig[0]);
        } catch (GettingTokenErrorException e2) {
            e2.printStackTrace();
        } catch (GettingTokenInUIThreadException e3) {
            e3.printStackTrace();
        }
    }

    public static List<HeartRate> getManualHeartRateDataByTimeInSyncWay(long j2, long j3, int i2) {
        if (j3 == 0) {
            j3 = System.currentTimeMillis() / 1000;
        }
        long jMillsToSecond = ExtentionUtilsKt.millsToSecond(j2, false);
        long jMillsToSecond2 = ExtentionUtilsKt.millsToSecond(j3, false);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("type", 2);
        systemParams.put("startTime", Long.valueOf(jMillsToSecond));
        systemParams.put("endTime", Long.valueOf(jMillsToSecond2));
        String url = HMServerDef.getUrl(i.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
        HMLog.i(a, "getManualHeartRateDataByTime url = " + url, new Object[0]);
        List<HeartRate>[] listArr = new List[1];
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, new a(listArr));
        return listArr[0];
    }
}

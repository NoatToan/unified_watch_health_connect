package com.xiaomi.hm.health.device.webapi.sport;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.data.DateFormatApi;
import com.huami.devicex.injection.data.OriginSportDataApi;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.manager.DataCacheApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class HMSportWebAPI {
    private static String A = null;
    public static final String VALUE_DETAIL = "detail";
    private static final String a = "v1/data/band_data.json";
    private static final String b = "v1/user/manualData.json";
    private static final String c = "v1/data/watch_data.json";
    private static final String d = "last_deviceid";
    private static final String e = "last_source";
    private static final String f = "device_type";
    private static final String g = "query_type";
    private static final String h = "from_date";
    private static final String i = "to_date";
    private static final String j = "from_time";
    private static final String k = "to_time";
    private static final String l = "summary";
    private static final String m = "type";
    private static final String n = "date";
    private static final String o = "data_json";
    private static final String p = "uuid";
    private static final String q = "last_sync_data_time";
    private static final String r = "byteLength";
    private static final String s = "apps/com.huami.midong/settings?settingName=huami.web.urls&mode=SINGLE";
    private static final Lazy<DeviceRepositoryApi> t = KoinJavaComponent.inject(DeviceRepositoryApi.class);
    private static final Lazy<DeviceManagerApi> u = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<DataCacheApi> v = KoinJavaComponent.inject(DataCacheApi.class);
    private static final Lazy<DateFormatApi> w = KoinJavaComponent.inject(DateFormatApi.class);
    private static final Lazy<PropertyStoreApi> x = KoinJavaComponent.inject(PropertyStoreApi.class);
    private static final Lazy<OriginSportDataApi> y = KoinJavaComponent.inject(OriginSportDataApi.class);
    private static final String z = "HMSportWebAPI";

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ CopyOnWriteArrayList b;
        public final /* synthetic */ DownloadSummaryAllSuccessedListner c;

        public a(ArrayList arrayList, CopyOnWriteArrayList copyOnWriteArrayList, DownloadSummaryAllSuccessedListner downloadSummaryAllSuccessedListner) {
            this.a = arrayList;
            this.b = copyOnWriteArrayList;
            this.c = downloadSummaryAllSuccessedListner;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.i(HMSportWebAPI.z, " download result: " + this.b.isEmpty() + ";dateDatas size = " + this.a.size(), new Object[0]);
            this.c.downloadAllSummaryOk(this.b.isEmpty(), this.a);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            try {
                JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody()));
                String strOptString = jSONObject.optString("code");
                if (!"1".equals(strOptString)) {
                    HMLog.i(HMSportWebAPI.z, " sync invalid code : " + strOptString, new Object[0]);
                    return;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                if (jSONArrayOptJSONArray == null) {
                    HMLog.i(HMSportWebAPI.z, "解析json失败,list == null", new Object[0]);
                    return;
                }
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    HMLog.i(HMSportWebAPI.z, " listSize: " + length, new Object[0]);
                    for (int i = 0; i < length; i++) {
                        try {
                            this.a.add(HMSportWebAPI.j(jSONArrayOptJSONArray.getJSONObject(i), HMDeviceType.MILI.getValue()));
                        } catch (Exception e) {
                            e.printStackTrace();
                            HMLog.i(HMSportWebAPI.z, "解析json失败,有无效数据!!!~~~~~~~~~~~", new Object[0]);
                        }
                    }
                }
                for (HMHttpRequestData hMHttpRequestData : this.b) {
                    if (hMHttpRequestData.getTag().equals(hMHttpResponseData.getTag())) {
                        this.b.remove(hMHttpRequestData);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ CopyOnWriteArrayList b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        public b(ArrayList arrayList, CopyOnWriteArrayList copyOnWriteArrayList, long j, long j2) {
            this.a = arrayList;
            this.b = copyOnWriteArrayList;
            this.c = j;
            this.d = j2;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.i(HMSportWebAPI.z, " download result: " + this.b.isEmpty() + ";dateDatas size = " + this.a.size(), new Object[0]);
            if (this.b.isEmpty()) {
                if (!this.a.isEmpty()) {
                    HMDaoManager.getInstance().getDateDataDao().insertOrReplaceInTx(this.a);
                }
                ((PropertyStoreApi) HMSportWebAPI.x.getValue()).clearWatchMissData();
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(HMSportWebAPI.z, " download error " + SportDay.fromString(((DateFormatApi) HMSportWebAPI.w.getValue()).formatDateSimple(this.c)) + ";" + SportDay.fromString(((DateFormatApi) HMSportWebAPI.w.getValue()).formatDateSimple(this.d)), new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            try {
                JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody()));
                String strOptString = jSONObject.optString("code");
                if (!"1".equals(strOptString)) {
                    HMLog.i(HMSportWebAPI.z, " sync invalid code : " + strOptString, new Object[0]);
                    return;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                if (jSONArrayOptJSONArray == null) {
                    HMLog.i(HMSportWebAPI.z, "解析json失败,list == null", new Object[0]);
                    return;
                }
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    HMLog.i(HMSportWebAPI.z, " listSize: " + length, new Object[0]);
                    for (int i = 0; i < length; i++) {
                        try {
                            this.a.add(HMSportWebAPI.k(jSONArrayOptJSONArray.getJSONObject(i), HMDeviceType.WATCH.getValue()));
                        } catch (Exception e) {
                            e.printStackTrace();
                            HMLog.i(HMSportWebAPI.z, "解析json失败,有无效数据!!!~~~~~~~~~~~", new Object[0]);
                        }
                    }
                }
                for (HMHttpRequestData hMHttpRequestData : this.b) {
                    if (hMHttpRequestData.getTag().equals(hMHttpResponseData.getTag())) {
                        this.b.remove(hMHttpRequestData);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ CopyOnWriteArrayList a;
        public final /* synthetic */ HashMap b;
        public final /* synthetic */ DateDataDao c;

        public c(CopyOnWriteArrayList copyOnWriteArrayList, HashMap map, DateDataDao dateDataDao) {
            this.a = copyOnWriteArrayList;
            this.b = map;
            this.c = dateDataDao;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(HMSportWebAPI.z, "uploadDateDatas onCancel: type=" + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.i(HMSportWebAPI.z, "onCompleted sync result: " + this.a.isEmpty(), new Object[0]);
            if (this.a.isEmpty()) {
                Analytics.event(DeviceXFunctionsKt.getContext(), StatEvent.UPLOAD_STEPS_SUCCESS, NetUtil.getNetType(DeviceXFunctionsKt.getContext()));
            } else if (NetUtil.isNetworkConnected(DeviceXFunctionsKt.getContext())) {
                TextUtils.isEmpty(HMSportWebAPI.A);
            } else {
                Analytics.event(DeviceXFunctionsKt.getContext(), StatEvent.UPLOAD_STEPS_FAILED_NO_NET);
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(HMSportWebAPI.z, "onError :  " + th.toString(), new Object[0]);
            HMSportWebAPI.A = th.getClass().getSimpleName();
            if (TextUtils.isEmpty(HMSportWebAPI.A)) {
                Analytics.event(DeviceXFunctionsKt.getContext(), "SyncFail_Network_" + NetUtil.getNetType(DeviceXFunctionsKt.getContext()), "unknown");
                return;
            }
            Analytics.event(DeviceXFunctionsKt.getContext(), "SyncFail_Network_" + NetUtil.getNetType(DeviceXFunctionsKt.getContext()), HMSportWebAPI.A);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            try {
                String strOptString = new JSONObject(new String(hMHttpResponseData.getResponseBody())).optString("code");
                if (!"1".equals(strOptString)) {
                    HMLog.i(HMSportWebAPI.z, " sync invalid code : " + strOptString, new Object[0]);
                    HMSportWebAPI.A = strOptString;
                    return;
                }
                for (HMHttpRequestData hMHttpRequestData : this.a) {
                    if (hMHttpRequestData.getTag().equals(hMHttpResponseData.getTag())) {
                        DateData dateData = (DateData) this.b.get(hMHttpRequestData.getTag());
                        HMLog.i(HMSportWebAPI.z, "上传成功，修改同步状态 date == :" + dateData.getDate() + ";" + dateData.getSummary(), new Object[0]);
                        dateData.setSync(1);
                        this.c.insertOrReplace(dateData);
                        this.a.remove(hMHttpRequestData);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class d extends IHMHttpResponseHandler {
        public final /* synthetic */ CopyOnWriteArrayList a;
        public final /* synthetic */ HashMap b;
        public final /* synthetic */ ManualDataDao c;

        public d(CopyOnWriteArrayList copyOnWriteArrayList, HashMap map, ManualDataDao manualDataDao) {
            this.a = copyOnWriteArrayList;
            this.b = map;
            this.c = manualDataDao;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(HMSportWebAPI.z, "uploadManualData onCancel: type=" + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(HMSportWebAPI.z, "uploadManualData onError: " + th.toString(), new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            try {
                String strOptString = new JSONObject(new String(hMHttpResponseData.getResponseBody())).optString("code");
                if (!"1".equals(strOptString)) {
                    HMLog.i(HMSportWebAPI.z, " sync invalid code : " + strOptString, new Object[0]);
                    return;
                }
                for (HMHttpRequestData hMHttpRequestData : this.a) {
                    if (hMHttpRequestData.getTag().equals(hMHttpResponseData.getTag())) {
                        ManualData manualData = (ManualData) this.b.get(hMHttpRequestData.getTag());
                        HMLog.i(HMSportWebAPI.z, "上传成功，修改同步状态 date == :" + manualData.getDate(), new Object[0]);
                        manualData.setSynced(1);
                        this.c.update(manualData);
                        this.a.remove(hMHttpRequestData);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class e extends IHMHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(HMSportWebAPI.z, "getAllManualData onCancel: type=" + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(HMSportWebAPI.z, "getAllManualData onError: " + th.toString(), new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            try {
                if (!hMHttpResponseData.isSuccess()) {
                    HMLog.i(HMSportWebAPI.z, "sync from server error", new Object[0]);
                    return;
                }
                ((PropertyStoreApi) HMSportWebAPI.x.getValue()).setManualDataSyncState(true);
                JSONArray jSONArrayOptJSONArray = new JSONObject(new String(hMHttpResponseData.getResponseBody())).optJSONArray("data");
                if (jSONArrayOptJSONArray == null) {
                    HMLog.i(HMSportWebAPI.z, "解析json失败,list == null", new Object[0]);
                    return;
                }
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < length; i++) {
                        try {
                            arrayList.add(HMSportWebAPI.i(jSONArrayOptJSONArray.getJSONObject(i)));
                        } catch (Exception e) {
                            e.printStackTrace();
                            HMLog.i(HMSportWebAPI.z, "解析json失败,有无效数据!!!~~~~~~~~~~~", new Object[0]);
                        }
                    }
                    HMDaoManager.getInstance().getManualDataDao().insertInTx(arrayList);
                    ((DataCacheApi) HMSportWebAPI.v.getValue()).initSummeryData();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                HMLog.i(HMSportWebAPI.z, "sync manual data from server error : " + e2.toString(), new Object[0]);
            }
        }
    }

    public static void downloadAllWatchDatasByMonth(long j2, long j3, String str) {
        SportDay monthStartDay;
        SportDay monthEndDay;
        SportDay sportDay;
        Lazy<DateFormatApi> lazy = w;
        SportDay sportDayFromString = SportDay.fromString(lazy.getValue().formatDateSimple(j2));
        SportDay sportDayFromString2 = SportDay.fromString(lazy.getValue().formatDateSimple(j3));
        x.getValue().saveWatchMissData(sportDayFromString.getKey(), sportDayFromString2.getKey());
        HMLog.i(z, "fDay  : " + sportDayFromString + "; tday : " + sportDayFromString2, new Object[0]);
        int iOffsetMonth = sportDayFromString2.offsetMonth(sportDayFromString);
        StringBuilder sb = new StringBuilder();
        sb.append("offM  : ");
        sb.append(iOffsetMonth);
        HMLog.i(z, sb.toString(), new Object[0]);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ArrayList arrayList = new ArrayList();
        if (iOffsetMonth == 0) {
            HMLog.i(z, "download one month  : " + iOffsetMonth, new Object[0]);
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put(g, str);
            systemParams.put(j, "" + j2);
            systemParams.put(k, "" + j3);
            systemParams.put(r, "8");
            copyOnWriteArrayList = copyOnWriteArrayList;
            copyOnWriteArrayList.add(new HMHttpRequestData(HMServerDef.getUrl(c), systemParams, Support.RequestSupport.GET));
        } else {
            SportDay sportDayFromString3 = SportDay.fromString(sportDayFromString.getKey());
            int i2 = 0;
            while (i2 <= iOffsetMonth) {
                if (i2 == 0) {
                    sportDay = sportDayFromString;
                    monthEndDay = sportDayFromString.getMonthEndDay();
                    monthStartDay = sportDay;
                } else if (i2 == iOffsetMonth) {
                    monthStartDay = sportDayFromString2.getMonthStartDay();
                    sportDay = sportDayFromString;
                    monthEndDay = sportDayFromString2;
                } else {
                    monthStartDay = sportDayFromString3.getMonthStartDay();
                    monthEndDay = sportDayFromString3.getMonthEndDay();
                    sportDay = sportDayFromString;
                }
                sportDayFromString3 = sportDayFromString3.addMonth(1);
                HMLog.i(z, "start  : " + monthStartDay.getKey() + ", end : " + monthEndDay.getKey() + ";cursorDay = " + sportDayFromString3.getKey(), new Object[0]);
                Map<String, Object> systemParams2 = HMWebUtil.getSystemParams();
                systemParams2.put(g, str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(monthStartDay.getTimestamp());
                systemParams2.put(j, sb2.toString());
                systemParams2.put(k, "" + monthEndDay.getTimestamp());
                systemParams2.put(r, "8");
                copyOnWriteArrayList.add(new HMHttpRequestData(HMServerDef.getUrl(c), systemParams2, Support.RequestSupport.GET));
                i2++;
                sportDayFromString = sportDay;
                iOffsetMonth = iOffsetMonth;
            }
        }
        HMWebUtil.doRequestList(copyOnWriteArrayList, true, false, new b(arrayList, copyOnWriteArrayList, j2, j3));
    }

    public static void getAllManualData() {
        boolean zIsSyncedManualData = x.getValue().isSyncedManualData();
        HMLog.i(z, "isSyncedManualData : " + zIsSyncedManualData, new Object[0]);
        if (zIsSyncedManualData) {
            return;
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("type", "sleep");
        HMWebUtil.doRequest(HMServerDef.getUrl(b), systemParams, Support.RequestSupport.GET, new e());
    }

    public static void getAllSportDataResult(DownloadSummaryAllSuccessedListner downloadSummaryAllSuccessedListner) {
        Lazy<DateFormatApi> lazy = w;
        String dateSimple = lazy.getValue().formatDateSimple(lazy.getValue().getCreateTime());
        HMLog.i(z, "registerDate  : " + dateSimple, new Object[0]);
        SportDay sportDayFromString = SportDay.fromString(dateSimple);
        SportDay today = SportDay.getToday();
        if (sportDayFromString.isToday()) {
            sportDayFromString = sportDayFromString.setKey("2014-01-01");
        }
        int iOffsetYear = today.offsetYear(sportDayFromString);
        HMLog.i(z, "offY  : " + iOffsetYear, new Object[0]);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 <= iOffsetYear; i2++) {
            SportDay yearStartDay = today.getYearStartDay();
            SportDay yearEndDay = today.getYearEndDay();
            HMLog.i(z, "start  : " + yearStartDay.getKey() + ", end : " + yearEndDay.getKey(), new Object[0]);
            today = today.addYear(-1);
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("from_date", yearStartDay.getKey());
            systemParams.put(i, yearEndDay.getKey());
            systemParams.put(g, "summary");
            copyOnWriteArrayList.add(new HMHttpRequestData(HMServerDef.getUrl(a), systemParams, Support.RequestSupport.GET));
        }
        HMWebUtil.doRequestList(copyOnWriteArrayList, true, false, new a(arrayList, copyOnWriteArrayList, downloadSummaryAllSuccessedListner));
    }

    public static void getPaiMoreUrl(IHMHttpResponseHandler iHMHttpResponseHandler) {
        HMWebUtil.doRequest(HMServerDef.getUrl(s), null, Support.RequestSupport.GET, iHMHttpResponseHandler);
    }

    public static void getPartialSportDataResult(String str, String str2, IHMHttpResponseHandler iHMHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(g, "detail");
        systemParams.put("from_date", "" + str);
        systemParams.put(i, "" + str2);
        systemParams.put(r, "8");
        HMWebUtil.doRequest(HMServerDef.getUrl(a), systemParams, Support.RequestSupport.GET, iHMHttpResponseHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ManualData i(JSONObject jSONObject) throws JSONException {
        ManualData manualData = new ManualData();
        manualData.setDate(jSONObject.optString("date_time"));
        manualData.setSummary(jSONObject.optString("summary"));
        manualData.setType(jSONObject.optString("type"));
        manualData.setSynced(1);
        return manualData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DateData j(JSONObject jSONObject, int i2) throws JSONException {
        DateData dateData = new DateData();
        dateData.setDate(jSONObject.optString("date_time"));
        dateData.setSummary(new String(Base64.decode(jSONObject.optString("summary"), 2)));
        dateData.setType(Integer.valueOf(i2));
        dateData.setSync(1);
        dateData.setSync_qqhealth(1);
        if (!jSONObject.isNull("source")) {
            String strOptString = jSONObject.optString("source");
            if (!TextUtils.isEmpty(strOptString)) {
                dateData.setSource(Integer.valueOf(strOptString));
            }
        }
        if (!jSONObject.isNull("data")) {
            dateData.setData(y.getValue().netSportDataStringToJson(jSONObject.optString("data")));
        }
        if (!jSONObject.isNull("data_hr")) {
            dateData.setData_hr(Base64.decode(jSONObject.optString("data_hr"), 2));
        }
        if (!jSONObject.isNull("summary_hr")) {
            dateData.setSummary_hr(jSONObject.optString("summary_hr"));
        }
        return dateData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DateData k(JSONObject jSONObject, int i2) {
        DateData dateData = new DateData();
        dateData.setDate(jSONObject.optString("date"));
        dateData.setSummary(jSONObject.optString("summary"));
        dateData.setType(Integer.valueOf(i2));
        dateData.setSync(1);
        dateData.setSync_qqhealth(1);
        if (!jSONObject.isNull("deviceSource")) {
            String strOptString = jSONObject.optString("deviceSource");
            if (!TextUtils.isEmpty(strOptString)) {
                dateData.setSource(Integer.valueOf(strOptString));
            }
        }
        if (!jSONObject.isNull("mergedRawData")) {
            dateData.setData(y.getValue().netSportDataStringToJson(jSONObject.optString("mergedRawData")));
        }
        if (!jSONObject.isNull(ParamKey.heartRateData)) {
            dateData.setData_hr(Base64.decode(jSONObject.optString(ParamKey.heartRateData), 2));
        }
        return dateData;
    }

    @Nullable
    private static JSONObject l(DateData dateData) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (dateData.getData_hr() != null && dateData.getData_hr().length > 0) {
                v.getValue().printHrData("before sync to server " + dateData.getDate(), dateData.getData_hr());
                jSONObject.put("data_hr", Base64.encodeToString(dateData.getData_hr(), 2));
            }
            jSONObject.put("date", dateData.getDate());
            jSONObject.put("data", new JSONArray(dateData.getData()));
            jSONObject.put("summary", dateData.getSummary());
            jSONObject.put("indexs", dateData.getIndexs());
            jSONObject.put("summary_hr", dateData.getSummary_hr());
            jSONObject.put("source", dateData.getSource());
            jSONObject.put("type", dateData.getType());
            return jSONObject;
        } catch (Exception e2) {
            HMLog.i(z, dateData.getDate() + ",error toJSONObject:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static void syncWatchDatafromServer(long j2, long j3, String str, IHMHttpResponseHandler iHMHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(g, str);
        systemParams.put(j, "" + j2);
        systemParams.put(k, "" + j3);
        systemParams.put(r, "8");
        HMWebUtil.doRequest(HMServerDef.getUrl(c), systemParams, Support.RequestSupport.GET, iHMHttpResponseHandler);
    }

    public static boolean uploadDateDatas(boolean z2) {
        List<DateData> list;
        Device deviceFindDeviceById;
        int i2 = 0;
        try {
            DateDataDao dateDataDao = HMDaoManager.getInstance().getDateDataDao();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            HashMap map = new HashMap();
            List<DateData> list2 = dateDataDao.queryBuilder().where(DateDataDao.Properties.Sync.eq(0), DateDataDao.Properties.Summary.isNotNull(), DateDataDao.Properties.Data.isNotNull()).build().forCurrentThread().list();
            if (list2 != null && !list2.isEmpty()) {
                int i3 = 0;
                while (i3 < list2.size()) {
                    DateData dateData = list2.get(i3);
                    JSONObject jSONObjectL = l(dateData);
                    if (jSONObjectL == null) {
                        HMLog.w(z, "待同步数据有误 : " + dateData.getDate(), new Object[i2]);
                        list = list2;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObjectL);
                        Lazy<DeviceManagerApi> lazy = u;
                        HMDeviceType majorDeviceType = lazy.getValue().getMajorDeviceType();
                        String boundDeviceId = lazy.getValue().getBoundDeviceId(majorDeviceType);
                        int value = lazy.getValue().getBoundDeviceSource(majorDeviceType).getValue();
                        if (value == HMDeviceSource.VDEVICE.getValue()) {
                            value = dateData.getSource().intValue();
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int value2 = HMDeviceType.MILI.getValue();
                        HMLog.i(z, "pageData = " + dateData.getDate() + "; deviceId = " + boundDeviceId, new Object[i2]);
                        boolean zIsEmpty = TextUtils.isEmpty(boundDeviceId);
                        String str = EcgData.DEFAULT_DIGIT_VALUE;
                        if (zIsEmpty) {
                            HMLog.i(z, "old data device null", new Object[i2]);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            value2 = HMDeviceType.SENSORHUB.getValue();
                            list = list2;
                        } else {
                            list = list2;
                            HMLog.i(z, "deviceId not null : " + boundDeviceId, new Object[0]);
                            try {
                                deviceFindDeviceById = t.getValue().findDeviceById(boundDeviceId);
                            } catch (Exception unused) {
                                boundDeviceId = EcgData.DEFAULT_DIGIT_VALUE;
                                deviceFindDeviceById = null;
                            }
                            if (deviceFindDeviceById != null) {
                                jCurrentTimeMillis = deviceFindDeviceById.getDevice_sync_data_time().longValue();
                                value2 = deviceFindDeviceById.getDevice_type().intValue();
                                str = boundDeviceId;
                            } else {
                                HMLog.i(z, "data device null", new Object[0]);
                            }
                        }
                        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
                        systemParams.put(o, jSONArray.toString());
                        systemParams.put(d, str);
                        systemParams.put(e, Integer.valueOf(value));
                        systemParams.put(q, Long.valueOf(jCurrentTimeMillis / 1000));
                        systemParams.put("device_type", "" + value2);
                        systemParams.put("uuid", "" + x.getValue().readUUID());
                        if (y.getValue().is8Bytes(dateData.getData())) {
                            systemParams.put(r, "8");
                        }
                        String url = HMServerDef.getUrl(a);
                        HMLog.d(z, "syncAllPagesToServer params:" + systemParams, new Object[0]);
                        HMHttpRequestData hMHttpRequestData = new HMHttpRequestData(url, systemParams, Support.RequestSupport.POST);
                        map.put(hMHttpRequestData.getTag(), dateData);
                        copyOnWriteArrayList.add(hMHttpRequestData);
                    }
                    i3++;
                    list2 = list;
                    i2 = 0;
                }
                A = null;
                HMWebUtil.doRequestList(copyOnWriteArrayList, true, z2, new c(copyOnWriteArrayList, map, dateDataDao));
                boolean zIsEmpty2 = copyOnWriteArrayList.isEmpty();
                HMLog.i(z, " sync result: " + zIsEmpty2, new Object[0]);
                return zIsEmpty2;
            }
            HMLog.i(z, "没有需要同步的数据", new Object[0]);
            return true;
        } catch (Exception e2) {
            HMLog.i(z, "组装上传出现异常 : " + e2.toString(), new Object[0]);
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean uploadManualData(boolean z2) {
        try {
            ManualDataDao manualDataDao = HMDaoManager.getInstance().getManualDataDao();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            HashMap map = new HashMap();
            List<ManualData> list = manualDataDao.queryBuilder().where(ManualDataDao.Properties.Synced.eq(0), new WhereCondition[0]).list();
            if (list != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ManualData manualData = list.get(i2);
                    Map<String, Object> systemParams = HMWebUtil.getSystemParams();
                    systemParams.put("summary", "" + manualData.getSummary());
                    systemParams.put("type", manualData.getType());
                    systemParams.put("date", manualData.getDate());
                    String url = HMServerDef.getUrl(b);
                    HMLog.d(z, "syncAllPagesToServer params:" + systemParams, new Object[0]);
                    HMHttpRequestData hMHttpRequestData = new HMHttpRequestData(url, systemParams, Support.RequestSupport.POST);
                    map.put(hMHttpRequestData.getTag(), manualData);
                    copyOnWriteArrayList.add(hMHttpRequestData);
                }
                HMWebUtil.doRequestList(copyOnWriteArrayList, true, z2, new d(copyOnWriteArrayList, map, manualDataDao));
                boolean zIsEmpty = copyOnWriteArrayList.isEmpty();
                HMLog.i(z, " sync result: " + zIsEmpty, new Object[0]);
                return zIsEmpty;
            }
            HMLog.i(z, "没有需要同步的数据", new Object[0]);
            return true;
        } catch (Exception e2) {
            HMLog.i(z, "组装上传出现异常 : " + e2.getMessage(), new Object[0]);
            return false;
        }
    }
}

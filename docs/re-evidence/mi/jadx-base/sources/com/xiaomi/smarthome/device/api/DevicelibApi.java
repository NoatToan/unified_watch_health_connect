package com.xiaomi.smarthome.device.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.mibi.sdk.component.Constants;
import com.xiaomi.passport.sim.SIMInfo;
import com.xiaomi.smarthome.core.entity.net.Crypto;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.stat.StatDepApi;
import com.xiaomi.smarthome.device.WuGanDeviceStatus;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.AsyncHandle;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.frame.JsonParser;
import com.xiaomi.smarthome.framework.api.AsyncResponseCallback;
import com.xiaomi.smarthome.framework.api.model.SyncUpCommandResult;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.miio.MiioUtil;
import com.xiaomi.smarthome.network.NetworkDepApi;
import com.xiaomi.smarthome.network.SmartHomeRequestManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DevicelibApi {
    private static boolean isPushIdEmptyHasUploadStat = false;

    public static AsyncHandle batchGetDeviceProps(Context context, JSONArray jSONArray, AsyncCallback<String, Error> asyncCallback, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            if (asyncCallback == null) {
                return null;
            }
            asyncCallback.onFailure(new Error(-1, "param is null"));
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from_flag", str);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", jSONArray.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/device/batchdevicedatas").addQueries(arrayList).build(), new JsonParser<String>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.9
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public String parse(JSONObject jSONObject2) throws JSONException {
                if (jSONObject2 == null) {
                    return null;
                }
                return "" + jSONObject2.toString();
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle bindDevice(Context context, String str, String str2, int i, AsyncCallback<Integer, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("token", str2);
            jSONObject.put("pid", i);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/home/binddevice").addQueries(arrayList).build(), new JsonParser<Integer>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public Integer parse(JSONObject jSONObject2) throws JSONException {
                return Integer.valueOf(jSONObject2.getInt(Constants.KEY_PAY_RESULT_RET));
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle checkPlcSubDeviceBindStatus(Context context, JSONArray jSONArray, String str, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
            jSONObject.put("params", jSONArray);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        JsonParser<JSONObject> jsonParser = new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.2
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2;
            }
        };
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/smarthome/product/app/plc/v1/getPlcSubDeviceBindStatus").addQueries(arrayList).build(), jsonParser, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle delDevice(Context context, JSONObject jSONObject, final AsyncResponseCallback<Void> asyncResponseCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "delDevice");
            jSONObject2.put("param", jSONObject);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject2.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/home/mdata").addQueries(arrayList).build(), new JsonParser<SyncUpCommandResult>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public SyncUpCommandResult parse(JSONObject jSONObject3) throws JSONException {
                SyncUpCommandResult syncUpCommandResult = new SyncUpCommandResult();
                syncUpCommandResult.errorCode = jSONObject3.optInt(Constants.KEY_PAY_RESULT_RET);
                syncUpCommandResult.lastModified = jSONObject3.optLong("lastModify");
                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("init");
                if (jSONObjectOptJSONObject != null) {
                    syncUpCommandResult.init = MiioUtil.JsonToMap(jSONObjectOptJSONObject);
                }
                return syncUpCommandResult;
            }
        }, Crypto.RC4, new AsyncCallback<SyncUpCommandResult, Error>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.11
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                asyncResponseCallback.onFailure(error.getCode());
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(SyncUpCommandResult syncUpCommandResult) {
                if (syncUpCommandResult.isExecuteSuccess()) {
                    asyncResponseCallback.onSuccess(null);
                } else {
                    asyncResponseCallback.onFailure(ErrorCode.INVALID.getCode());
                }
            }
        });
    }

    public static AsyncHandle delSubDevice(Context context, JSONObject jSONObject, final AsyncResponseCallback<Void> asyncResponseCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", "delSubDevice");
            jSONObject2.put("param", jSONObject);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject2.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/home/mdata").addQueries(arrayList).build(), new JsonParser<SyncUpCommandResult>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public SyncUpCommandResult parse(JSONObject jSONObject3) throws JSONException {
                SyncUpCommandResult syncUpCommandResult = new SyncUpCommandResult();
                syncUpCommandResult.errorCode = jSONObject3.optInt(Constants.KEY_PAY_RESULT_RET);
                syncUpCommandResult.lastModified = jSONObject3.optLong("lastModify");
                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("init");
                if (jSONObjectOptJSONObject != null) {
                    syncUpCommandResult.init = MiioUtil.JsonToMap(jSONObjectOptJSONObject);
                }
                return syncUpCommandResult;
            }
        }, Crypto.RC4, new AsyncCallback<SyncUpCommandResult, Error>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.13
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                asyncResponseCallback.onFailure(error.getCode());
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(SyncUpCommandResult syncUpCommandResult) {
                if (syncUpCommandResult.isExecuteSuccess()) {
                    asyncResponseCallback.onSuccess(null);
                } else {
                    asyncResponseCallback.onFailure(ErrorCode.INVALID.getCode());
                }
            }
        });
    }

    public static AsyncHandle getDeviceCategory(Context context, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JsonParser<JSONObject> jsonParser = new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.4
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject) throws JSONException {
                return jSONObject;
            }
        };
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/v2/product/category_v3").addQueries(arrayList).build(), jsonParser, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle getDeviceCategoryV2(Context context, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JsonParser<JSONObject> jsonParser = new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.6
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject) throws JSONException {
                return jSONObject;
            }
        };
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/v2/product/category_v2").addQueries(arrayList).build(), jsonParser, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle getDeviceExtraInfo(Context context, ArrayList<String> arrayList, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("dids", jSONArray);
        } catch (JSONException unused) {
        }
        arrayList2.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/device/extra_info").addQueries(arrayList2).build(), new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.7
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2;
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle getDeviceLocationList(Context context, JSONArray jSONArray, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeviceTagInterface.ROUTER_BSSID, jSONArray);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/location/list").addQueries(arrayList).build(), new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.3
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2;
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle getGeekDeviceDesc(Context context, Set<String> set, AsyncCallback<String, Error> asyncCallback) {
        if (set != null && set.size() > 0) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : set.toArray()) {
                    jSONArray.put(obj);
                }
                jSONObject.put("models", jSONArray);
                arrayList.add(new KeyValuePair("data", jSONObject.toString()));
                return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/home/getmodeluiconfig").addQueries(arrayList).build(), new JsonParser<String>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.8
                    @Override // com.xiaomi.smarthome.frame.JsonParser
                    public String parse(JSONObject jSONObject2) throws JSONException {
                        if (jSONObject2 == null) {
                            return null;
                        }
                        return "" + jSONObject2.toString();
                    }
                }, Crypto.RC4, asyncCallback);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static AsyncHandle getLiveCameraList(Context context, double d, double d2, AsyncCallback<JSONArray, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("longitude", d);
            jSONObject.put("latitude", d2);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/home/broadcastlist").addQueries(arrayList).build(), new JsonParser<JSONArray>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.14
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONArray parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2.optJSONArray("places");
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle getProductBrands(Context context, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JsonParser<JSONObject> jsonParser = new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.5
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject) throws JSONException {
                return jSONObject;
            }
        };
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/v2/product/get_product_brands").addQueries(arrayList).build(), jsonParser, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle queryModelFunction(Context context, final String[] strArr, Set<String> set, AsyncCallback<SparseArray<List<String>>, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (String str : strArr) {
            try {
                jSONArray2.put(str);
            } catch (JSONException unused) {
            }
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("models", jSONArray);
        jSONObject.put("tags", jSONArray2);
        JsonParser<SparseArray<List<String>>> jsonParser = new JsonParser<SparseArray<List<String>>>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public SparseArray<List<String>> parse(JSONObject jSONObject2) throws JSONException {
                SparseArray<List<String>> sparseArray = new SparseArray<>();
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("tagModels");
                int i = 0;
                while (true) {
                    String[] strArr2 = strArr;
                    if (i >= strArr2.length) {
                        return sparseArray;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(strArr2[i]);
                    HashSet hashSet = new HashSet();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        hashSet.add(jSONArrayOptJSONArray.optString(i2));
                    }
                    sparseArray.put(i, new ArrayList(hashSet));
                    i++;
                }
            }
        };
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/v2/group/query_model_func").addQueries(arrayList).build(), jsonParser, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle queryPrebindInfo(Context context, String str, AsyncCallback<String, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("dids", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/smc/prebind_info").addQueries(arrayList).build(), new JsonParser<String>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.26
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public String parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2.toString();
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle queryWuGanAddingDeviceStatus(Context context, final Set<String> set, AsyncCallback<List<WuGanDeviceStatus>, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dids", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/smc/dev_status").addQueries(arrayList).build(), new JsonParser<List<WuGanDeviceStatus>>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.24
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public List<WuGanDeviceStatus> parse(JSONObject jSONObject2) throws JSONException {
                ArrayList arrayList2 = new ArrayList();
                if (jSONObject2 == null) {
                    MiJiaLog.writeLogOnAll(LogType.GENERAL, "wugan", "queryWuGanAddingDeviceStatus onResp: response is null");
                    return arrayList2;
                }
                LogType logType = LogType.GENERAL;
                MiJiaLog.writeLogOnAll(logType, "wugan", "queryWuGanAddingDeviceStatus onResp: response is=" + jSONObject2.toString());
                JSONObject jSONObject3 = jSONObject2.getJSONObject("dev_status");
                if (jSONObject3 == null) {
                    return arrayList2;
                }
                MiJiaLog.writeLogOnAll(logType, "wugan", "queryWuGanAddingDeviceStatus onResp:\n" + jSONObject3.toString());
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new WuGanDeviceStatus(jSONObject3.getJSONObject((String) it2.next())));
                }
                return arrayList2;
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle queryWuGanDeviceStatus(Context context, AsyncCallback<List<WuGanDeviceStatus>, Error> asyncCallback) {
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/smc/batch_dev_status").build(), new JsonParser<List<WuGanDeviceStatus>>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.23
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public List<WuGanDeviceStatus> parse(JSONObject jSONObject) throws JSONException {
                ArrayList arrayList = new ArrayList();
                if (jSONObject == null) {
                    MiJiaLog.writeLogOnAll(LogType.GENERAL, "wugan", "queryWuGanDeviceStatus onResp null json");
                    return arrayList;
                }
                LogType logType = LogType.GENERAL;
                MiJiaLog.writeLogOnAll(logType, "wugan", "queryWuGanDeviceStatus onResp:\n" + jSONObject.toString());
                JSONArray jSONArray = jSONObject.getJSONArray("devices");
                if (jSONArray != null && jSONArray.length() != 0) {
                    MiJiaLog.writeLogOnAll(logType, "wugan", "queryWuGanDeviceStatus onResp:\n" + jSONArray.toString());
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(new WuGanDeviceStatus(jSONArray.getJSONObject(i)));
                    }
                }
                return arrayList;
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle reportGPSInfo(Context context, String str, double d, double d2, String str2, String str3, String str4, String str5, String str6, AsyncCallback<Void, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("lng", d);
            jSONObject.put("lat", d2);
            jSONObject.put("adminArea", str2);
            jSONObject.put("countryCode", str3);
            jSONObject.put("locality", str4);
            jSONObject.put("thoroughfare", str5);
            jSONObject.put("language", "zh_CN");
            jSONObject.put("subLocality", str6);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/location/set").addQueries(arrayList).build(), null, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle setShowMode(Context context, String str, int i, AsyncCallback<Boolean, Error> asyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("show_mode", i);
        } catch (JSONException unused) {
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/device/set_show_mode").addQueries(arrayList).build(), new JsonParser<Boolean>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                int iOptInt = jSONObject2.optInt("code", -1);
                boolean z = false;
                boolean zOptBoolean = jSONObject2.optBoolean("result", false);
                if (iOptInt == 0 && zOptBoolean) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle startPlcDeviceBind(Context context, JSONArray jSONArray, String str, AsyncCallback<JSONObject, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
            jSONObject.put("params", jSONArray);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        JsonParser<JSONObject> jsonParser = new JsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.1
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2;
            }
        };
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/smarthome/product/app/plc/v1/startPlcSubDeviceBind").addQueries(arrayList).build(), jsonParser, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle subscribeDevice(Context context, String str, int i, List<String> list, int i2, AsyncCallback<Boolean, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            String pushId = NetworkDepApi.getInstance().getPushId();
            String fcmToken = NetworkDepApi.getInstance().getFcmToken();
            if (TextUtils.isEmpty(pushId)) {
                MiJiaLog.writeLogOnAll(LogType.NETWORK, "DevicelibApi", "subscribeDeviceBatchV2 pushId is null");
                if (asyncCallback != null) {
                    asyncCallback.sendFailureMessage(new Error(-8, "pushId -is null from app"));
                }
                return new AsyncHandle(null);
            }
            jSONObject.put("did", str);
            jSONObject.put("pid", i);
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < list.size(); i3++) {
                jSONArray.put(list.get(i3));
            }
            jSONObject.put("method", jSONArray);
            jSONObject.put("supportUpinfo", true);
            jSONObject.put("pushid", pushId);
            if (MiJiaEnvironment.isGooglePlayChannel() && !TextUtils.isEmpty(fcmToken)) {
                jSONObject.put("fcmToken", fcmToken);
            }
            jSONObject.put("expire", i2);
            arrayList.add(new KeyValuePair("data", jSONObject.toString()));
            return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/mipush/eventsub").addQueries(arrayList).build(), new JsonParser<Boolean>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.xiaomi.smarthome.frame.JsonParser
                public Boolean parse(JSONObject jSONObject2) throws JSONException {
                    return Boolean.valueOf(jSONObject2.getBoolean(Constants.KEY_PAY_RESULT_RET));
                }
            }, Crypto.RC4, asyncCallback);
        } catch (JSONException unused) {
        }
    }

    public static AsyncHandle subscribeDeviceBatchV2(Context context, JSONObject jSONObject, String str, int i, AsyncCallback<String, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("didList", jSONObject);
            String pushId = NetworkDepApi.getInstance().getPushId();
            String fcmToken = NetworkDepApi.getInstance().getFcmToken();
            if (TextUtils.isEmpty(pushId)) {
                MiJiaLog.writeLogOnAll(LogType.NETWORK, "DevicelibApi", "subscribeDeviceBatchV2 pushId is null");
                if (asyncCallback != null) {
                    asyncCallback.sendFailureMessage(new Error(-8, "pushId -is null from app"));
                }
                return new AsyncHandle(null);
            }
            jSONObject2.put("pushId", pushId);
            if (MiJiaEnvironment.isGooglePlayChannel() && !TextUtils.isEmpty(fcmToken)) {
                jSONObject2.put("fcmToken", fcmToken);
            }
            jSONObject2.put("expire", i);
            jSONObject2.put("supportUpinfo", true);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put(SIMInfo.SIM_INFO_TYPE_SUB_ID, str);
            }
            arrayList.add(new KeyValuePair("data", jSONObject2.toString()));
            return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/mipush/eventsubbatch").addQueries(arrayList).build(), new JsonParser<String>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.22
                @Override // com.xiaomi.smarthome.frame.JsonParser
                public String parse(JSONObject jSONObject3) throws JSONException {
                    return jSONObject3.getString(SIMInfo.SIM_INFO_TYPE_SUB_ID);
                }
            }, Crypto.RC4, asyncCallback);
        } catch (JSONException unused) {
        }
    }

    public static AsyncHandle subscribeDeviceV2(Context context, String str, int i, List<String> list, String str2, int i2, String str3, AsyncCallback<Boolean, Error> asyncCallback) {
        String pushId = NetworkDepApi.getInstance().getPushId();
        String fcmToken = NetworkDepApi.getInstance().getFcmToken();
        if (TextUtils.isEmpty(pushId)) {
            if (!isPushIdEmptyHasUploadStat) {
                StatDepApi.get().upload_pushid_empty(str3);
                isPushIdEmptyHasUploadStat = true;
            }
            MiJiaLog.writeLogOnAll(LogType.NETWORK, "DevicelibApi", "subscribeDeviceBatchV2 pushId is null");
            if (asyncCallback != null) {
                asyncCallback.sendFailureMessage(new Error(-8, "pushId -is null from app"));
            }
            return new AsyncHandle(null);
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("pid", i);
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < list.size(); i3++) {
                jSONArray.put(list.get(i3));
            }
            jSONObject.put("method", jSONArray);
            jSONObject.put("supportUpinfo", true);
            jSONObject.put("pushid", pushId);
            if (MiJiaEnvironment.isGooglePlayChannel() && !TextUtils.isEmpty(fcmToken)) {
                jSONObject.put("fcmToken", fcmToken);
            }
            jSONObject.put("expire", i2);
            jSONObject.put("subid", str2);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/mipush/eventsub").addQueries(arrayList).build(), new JsonParser<Boolean>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                return Boolean.valueOf(jSONObject2.getBoolean(Constants.KEY_PAY_RESULT_RET));
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle unsubscribeDevice(Context context, String str, int i, List<String> list, AsyncCallback<Boolean, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("pid", i);
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < list.size(); i2++) {
                jSONArray.put(list.get(i2));
            }
            jSONObject.put("method", jSONArray);
            jSONObject.put("pushid", NetworkDepApi.getInstance().getPushId());
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/mipush/eventunsub").addQueries(arrayList).build(), new JsonParser<Boolean>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                return Boolean.valueOf(jSONObject2.getBoolean(Constants.KEY_PAY_RESULT_RET));
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle unsubscribeDeviceBatchV2(Context context, String str, AsyncCallback<Void, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SIMInfo.SIM_INFO_TYPE_SUB_ID, str);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/mipush/eventunsubbatch").addQueries(arrayList).build(), null, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle unsubscribeDeviceV2(Context context, String str, int i, List<String> list, String str2, AsyncCallback<Boolean, Error> asyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("pid", i);
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < list.size(); i2++) {
                jSONArray.put(list.get(i2));
            }
            jSONObject.put("method", jSONArray);
            jSONObject.put("pushid", NetworkDepApi.getInstance().getPushId());
            jSONObject.put("subid", str2);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/mipush/eventunsub").addQueries(arrayList).build(), new JsonParser<Boolean>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                return Boolean.valueOf(jSONObject2.getBoolean(Constants.KEY_PAY_RESULT_RET));
            }
        }, Crypto.RC4, asyncCallback);
    }

    public static AsyncHandle setShowMode(Context context, Set<String> set, int i, AsyncCallback<Boolean, Error> asyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (set != null && set.size() > 0) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            jSONObject.put("didlist", jSONArray);
            jSONObject.put("show_mode", i);
        } catch (JSONException unused) {
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return SmartHomeRequestManager.getInstance().sendSmartHomeRequest(context, new NetRequest.Builder().method("POST").path("/device/set_multi_show_mode").addQueries(arrayList).build(), new JsonParser<Boolean>() { // from class: com.xiaomi.smarthome.device.api.DevicelibApi.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.frame.JsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                int iOptInt = jSONObject2.optInt("code", -1);
                boolean z = false;
                boolean zOptBoolean = jSONObject2.optBoolean("result", false);
                if (iOptInt == 0 && zOptBoolean) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, Crypto.RC4, asyncCallback);
    }
}

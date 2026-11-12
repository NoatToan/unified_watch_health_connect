package com.huawei.operation.ble;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.beans.HealthDataQueryOption;
import com.huawei.operation.share.ResultCallback;
import com.huawei.operation.utils.BleJsBiOperate;
import com.huawei.operation.utils.Utils;
import defpackage.njz;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class DataProcessor {
    private static final int HASH_MAP_DEFAULT_CAPACITY = 16;
    private static final int SUBSCRIPT_ZERO = 0;
    private static final String TAG = "DataProcessor";
    private HashMap<String, String> mCallbackMap;
    private ContentValues mDeviceInfo;
    private Handler mHandler;
    private boolean mIsRetryFailed;
    private String mProductId;
    private String mUniqueId;
    private String mUserUuid;
    private int[] mWeightDataIntTypes = BleConstants.getWeightDataIntTypesClone();
    private int[] mBloodSugarDataTypes = BleConstants.getBloodSugarDataTypesClone();
    private String[] mBloodSugarDataKeyTypes = BleConstants.getBloodSugarDataKeyTypesClone();
    private int[] mBloodPressureDataTypes = BleConstants.getBloodPressureDataValueTypesClone();
    private String[] mWeightDataTypesKey = BleConstants.getWeightDataTypesKeyClone();
    private String[] mWeightDataTypes = BleConstants.getWeightDataJsonTypesClone();

    public DataProcessor(Builder builder) {
        this.mDeviceInfo = builder.mDeviceInfo;
        this.mProductId = builder.mProductId;
        this.mUniqueId = builder.mUniqueId;
        this.mHandler = builder.mHandler;
        this.mCallbackMap = builder.mCallbackMap;
    }

    public static class Builder {
        private HashMap<String, String> mCallbackMap;
        private ContentValues mDeviceInfo;
        private Handler mHandler;
        private String mProductId;
        private String mUniqueId;

        public Builder setDeviceInfo(ContentValues contentValues) {
            this.mDeviceInfo = contentValues;
            return this;
        }

        public Builder setProductId(String str) {
            this.mProductId = str;
            return this;
        }

        public Builder setUniqueId(String str) {
            this.mUniqueId = str;
            return this;
        }

        public Builder setHandler(Handler handler) {
            this.mHandler = handler;
            return this;
        }

        public Builder setCallbackMap(HashMap<String, String> map) {
            this.mCallbackMap = map;
            return this;
        }

        public DataProcessor build() {
            return new DataProcessor(this);
        }
    }

    public void setIsRetryFailed(boolean z) {
        this.mIsRetryFailed = z;
    }

    public void setUserUuid(String str) {
        this.mUserUuid = str;
    }

    private void callBackJsExecQueryData(String str, String str2, boolean z) {
        LogUtil.a(TAG, "callBackJsExecQueryData");
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        bundle.putString("function", this.mCallbackMap.get(z ? BleConstants.ON_HAS_HEALTH_DATA_RESULT_NAME : BleConstants.ON_GET_DATA_RESULT_NAME));
        bundle.putString("errCode", str);
        if (str2 != null) {
            bundle.putString("data", str2);
        } else {
            try {
                jSONObject.put("resultCode", str);
                jSONObject.put("data", "");
            } catch (JSONException unused) {
                LogUtil.e(TAG, "callBackJsExecQueryData JSONException");
            }
            bundle.putString("data", jSONObject.toString());
        }
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10010;
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    private void callBackJsResult(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("function", this.mCallbackMap.get(str));
        bundle.putString("errCode", str2);
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = i;
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    private void saveDataToPlatform(final BleJsBiOperate bleJsBiOperate, List<HiHealthData> list, final int i, boolean z, final String str) {
        String str2;
        LogUtil.a(TAG, "saveHealthDataToPlatform");
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(list);
        if (z) {
            str2 = BleConstants.SAVE_MULTIPLE_HEALTH_DATA;
        } else {
            str2 = BleConstants.SAVE_HEALTH_DATA;
        }
        final String str3 = str2;
        BleJsDataApi.getInstance().saveSample(hiDataInsertOption, 3, new ResultCallback() { // from class: com.huawei.operation.ble.DataProcessor$$ExternalSyntheticLambda0
            @Override // com.huawei.operation.share.ResultCallback
            public final void onResult(int i2, Object obj) {
                this.f$0.m1523x67952e1c(i, str, bleJsBiOperate, str3, i2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$saveDataToPlatform$0$com-huawei-operation-ble-DataProcessor, reason: not valid java name */
    /* synthetic */ void m1523x67952e1c(int i, String str, BleJsBiOperate bleJsBiOperate, String str2, int i2, Object obj) {
        LogUtil.a(TAG, "saveHealthDataToPlatform resultCode：", Integer.valueOf(i2));
        if (i2 == 0 && (i == 10001 || i == 10002 || i == 10006)) {
            LogUtil.a(TAG, "saveHealthDataToPlatform: syncCloudAfterInsert");
            Utils.syncCloudAfterInsert();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "callbackFunc is null");
            return;
        }
        if (i2 == 0) {
            bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, str2, i, String.valueOf(i2));
        } else if (!this.mIsRetryFailed) {
            bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, str2, i, String.valueOf(i2));
            this.mIsRetryFailed = true;
        }
        callBackJsResult(str, 10009, String.valueOf(Utils.filterResultCode(i2)));
    }

    public void execQuery(String str) {
        int i;
        BleJsBiOperate bleJsBiOperate = new BleJsBiOperate();
        bleJsBiOperate.init();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("type");
            try {
                long j = jSONObject.getLong("startTime");
                long j2 = jSONObject.getLong("endTime");
                LogUtil.a(TAG, "execQuery type : ", Integer.valueOf(i2), " startTime : endTime ", Long.valueOf(j), " : ", Long.valueOf(j2));
                if (j >= 0 && j <= j2) {
                    if (i2 != 2104 && i2 != HiHealthDataType.d) {
                        if (i2 == 2103) {
                            execQueryDataApi(j, j2, i2, null);
                            return;
                        }
                        if (i2 == 10006) {
                            execQueryWeight(j, j2);
                            return;
                        }
                        if (i2 == 10001) {
                            HealthDataQueryOption healthDataQueryOptionBuildBloodSugarQueryOption = buildBloodSugarQueryOption(i2, jSONObject, bleJsBiOperate);
                            if (healthDataQueryOptionBuildBloodSugarQueryOption != null) {
                                execQueryDataApi(j, j2, i2, healthDataQueryOptionBuildBloodSugarQueryOption);
                                return;
                            }
                            return;
                        }
                        if (i2 == 10002) {
                            execQueryBloodPressure(j, j2);
                            return;
                        }
                        if (i2 == 30029) {
                            execQueryDataApi(j, j2, i2, null);
                            return;
                        } else if (i2 == 2109) {
                            execQueryDataApi(j, j2, i2, null);
                            return;
                        } else {
                            bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.GET_HEALTH_DATA, i2, BleConstants.PARAM_INVALID_STRING);
                            callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, false);
                            return;
                        }
                    }
                    execQueryDataApi(j, j2, i2, null);
                    return;
                }
                LogUtil.j(TAG, "execQuery startTime < 0 or startTime > endTime");
                bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.GET_HEALTH_DATA, i2, BleConstants.PARAM_INVALID_STRING);
                callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, false);
            } catch (JSONException unused) {
                i = i2;
                LogUtil.e(TAG, "execQueryData JSONException");
                bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.GET_HEALTH_DATA, i, BleConstants.PARAM_INVALID_STRING);
                callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, false);
            }
        } catch (JSONException unused2) {
            i = 0;
        }
    }

    private HealthDataQueryOption buildBloodSugarQueryOption(int i, JSONObject jSONObject, BleJsBiOperate bleJsBiOperate) {
        int iOptInt = jSONObject.optInt(BleConstants.LIMIT);
        int iOptInt2 = iOptInt != 0 ? 0 : jSONObject.optInt(BleConstants.QUERY_KIND);
        if (iOptInt < 0 || iOptInt2 < 0 || iOptInt2 > 2) {
            bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.GET_HEALTH_DATA, i, BleConstants.PARAM_INVALID_STRING);
            callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, false);
            return null;
        }
        HealthDataQueryOption healthDataQueryOption = new HealthDataQueryOption();
        healthDataQueryOption.setQueryKind(iOptInt2);
        healthDataQueryOption.setLimit(iOptInt);
        return healthDataQueryOption;
    }

    public void hasHealthDataQuery(String str) {
        int i;
        LogUtil.a(TAG, "hasHealthDataQuery");
        BleJsBiOperate bleJsBiOperate = new BleJsBiOperate();
        bleJsBiOperate.init();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("type");
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                LinkedHashMap linkedHashMap = new LinkedHashMap(16);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    linkedHashMap.put(Long.valueOf(jSONArray.getJSONObject(i3).getLong("startTime")), 0);
                }
                if (jSONArray.length() >= 1) {
                    long j = jSONArray.getJSONObject(0).getLong("startTime");
                    long j2 = jSONArray.getJSONObject(jSONArray.length() - 1).getLong("startTime");
                    LogUtil.a(TAG, "hasHealthDataQuery type = ", Integer.valueOf(i2), ",startTime = ", Long.valueOf(j), ",endTime = ", Long.valueOf(j2));
                    if (j >= 0 && j <= j2) {
                        if (i2 == 10001) {
                            HealthDataQueryOption healthDataQueryOption = new HealthDataQueryOption();
                            healthDataQueryOption.setStartTimes(linkedHashMap);
                            execQueryDataApi(j, j2, i2, healthDataQueryOption);
                            return;
                        } else {
                            LogUtil.j(TAG, "hasHealthDataQuery type: ", Integer.valueOf(i2));
                            callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, true);
                            return;
                        }
                    }
                    LogUtil.a(TAG, "hasHealthDataQuery startTime < 0 or startTime > endTime");
                    bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.HAS_HEALTH_DATA, i2, BleConstants.PARAM_INVALID_STRING);
                    callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, true);
                    return;
                }
                LogUtil.j(TAG, "hasHealthDataQuery dataArray length is 0");
                bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.HAS_HEALTH_DATA, i2, BleConstants.PARAM_INVALID_STRING);
                callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, true);
            } catch (JSONException unused) {
                i = i2;
                LogUtil.e(TAG, "hasHealthDataQuery JSONException");
                bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.HAS_HEALTH_DATA, i, BleConstants.PARAM_INVALID_STRING);
                callBackJsExecQueryData(BleConstants.PARAM_INVALID_STRING, null, true);
            }
        } catch (JSONException unused2) {
            i = 0;
        }
    }

    private String getOneBloodSugar(List<HiHealthData> list, JSONObject jSONObject, long j, long j2) {
        LogUtil.a(TAG, "getOneBloodSugar");
        int i = 0;
        while (true) {
            String[] strArr = this.mBloodSugarDataKeyTypes;
            if (i < strArr.length) {
                if (jSONObject.has(strArr[i])) {
                    double dOptDouble = jSONObject.optDouble(this.mBloodSugarDataKeyTypes[i]);
                    if (dOptDouble < 1.0d || dOptDouble > 33.0d) {
                        return BleConstants.PARAM_INVALID_STRING;
                    }
                    HiHealthData hiHealthDataBuildHiHealthData = buildHiHealthData(this.mBloodSugarDataTypes[i], j, j2);
                    hiHealthDataBuildHiHealthData.setValue(dOptDouble);
                    HiBloodSugarMetaData hiBloodSugarMetaData = new HiBloodSugarMetaData();
                    hiBloodSugarMetaData.setConfirmed(jSONObject.optBoolean(BleConstants.IS_CONFIRMED));
                    hiHealthDataBuildHiHealthData.setMetaData(HiJsonUtil.d(hiBloodSugarMetaData));
                    list.add(hiHealthDataBuildHiHealthData);
                }
                i++;
            } else {
                return "0";
            }
        }
    }

    private void execQueryBloodPressure(long j, long j2) {
        LogUtil.a(TAG, "execQueryBloodPressure");
        final BleJsBiOperate bleJsBiOperate = new BleJsBiOperate();
        bleJsBiOperate.init();
        HiAggregateOption hiAggregateOption = getHiAggregateOption(j, j2, new String[]{BleConstants.BLOOD_PRESSURE}, new int[]{10002});
        hiAggregateOption.setDeviceUuid(this.mUniqueId);
        hiAggregateOption.setReadType(2);
        HiAggregateOption hiAggregateOption2 = getHiAggregateOption(j, j2, new String[]{BleConstants.BLOODPRESSURE_SPHYGMUS}, new int[]{2018});
        hiAggregateOption2.setDeviceUuid(this.mUniqueId);
        hiAggregateOption2.setReadType(2);
        BleJsDataApi.getInstance().execQueryBloodPressure(hiAggregateOption, hiAggregateOption2, new ResultCallback() { // from class: com.huawei.operation.ble.DataProcessor$$ExternalSyntheticLambda2
            @Override // com.huawei.operation.share.ResultCallback
            public final void onResult(int i, Object obj) {
                this.f$0.m1520x9ee78428(bleJsBiOperate, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$execQueryBloodPressure$1$com-huawei-operation-ble-DataProcessor, reason: not valid java name */
    /* synthetic */ void m1520x9ee78428(BleJsBiOperate bleJsBiOperate, int i, Object obj) {
        LogUtil.a(TAG, "execQueryBloodPressure resultCode = ", Integer.valueOf(i));
        bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.GET_HEALTH_DATA, 10002, String.valueOf(i));
        if (obj instanceof String) {
            callBackJsExecQueryData(String.valueOf(i), (String) obj, false);
        } else {
            callBackJsExecQueryData(String.valueOf(i), null, false);
        }
    }

    private HiAggregateOption getHiAggregateOption(long j, long j2, String[] strArr, int[] iArr) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("");
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setTimeRange(j, j2);
        return hiAggregateOption;
    }

    private String getOneBloodPressure(List<HiHealthData> list, JSONObject jSONObject, long j, long j2) {
        LogUtil.a(TAG, "getOneBloodPressure");
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()), Double.valueOf(jSONObject.optDouble(BleConstants.BLOODPRESSURE_SYSTOLIC)));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value()), Double.valueOf(jSONObject.optDouble(BleConstants.BLOODPRESSURE_DIASTOLIC)));
        if (jSONObject.has(BleConstants.BLOODPRESSURE_SPHYGMUS)) {
            map.put(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()), Double.valueOf(jSONObject.optDouble(BleConstants.BLOODPRESSURE_SPHYGMUS)));
        }
        HiHealthData hiHealthDataBuildHiHealthData = buildHiHealthData(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value(), j, j2);
        hiHealthDataBuildHiHealthData.setFieldsValue(HiJsonUtil.d(map));
        list.add(hiHealthDataBuildHiHealthData);
        if (jSONObject.has(BleConstants.REST_HEARTRATE)) {
            double dOptDouble = jSONObject.optDouble(BleConstants.REST_HEARTRATE);
            HiHealthData hiHealthDataBuildHiHealthData2 = buildHiHealthData(2018, j, j2);
            hiHealthDataBuildHiHealthData2.setValue(dOptDouble);
            list.add(hiHealthDataBuildHiHealthData2);
            return "0";
        }
        return "0";
    }

    private HiHealthData buildHiHealthData(int i, long j, long j2) {
        HiHealthData hiHealthData = new HiHealthData(i);
        hiHealthData.setDeviceUuid(this.mUniqueId);
        hiHealthData.setTimeInterval(j, j2);
        return hiHealthData;
    }

    private boolean checkDataKeyValid(int i, JSONObject jSONObject) {
        LogUtil.a(TAG, "checkDataKeyValid, type = ", Integer.valueOf(i));
        if (i == 10002) {
            return jSONObject.has(BleConstants.BLOODPRESSURE_SYSTOLIC) && jSONObject.has(BleConstants.BLOODPRESSURE_DIASTOLIC);
        }
        if (i == 10006) {
            return true;
        }
        if (i == 2103) {
            return jSONObject.has(BleConstants.BLOOD_OXYGEN);
        }
        if (i == HiHealthDataType.d || i == 2104) {
            return jSONObject.has(BleConstants.TEMPERATURE);
        }
        if (i == 2109) {
            return jSONObject.has(BleConstants.URIC_ACID);
        }
        return i == 10001 || i == 30029;
    }

    private boolean checkDataValueValid(int i, JSONObject jSONObject) {
        LogUtil.a(TAG, "checkDataValueValid");
        if (i == 10002) {
            return checkBloodPressureValueValid(jSONObject);
        }
        if (i == 10006) {
            return checkWeightValueValid(jSONObject);
        }
        if (i == 2103) {
            double dOptDouble = jSONObject.optDouble(BleConstants.BLOOD_OXYGEN);
            return dOptDouble > 0.0d && dOptDouble <= 100.0d;
        }
        if (i == HiHealthDataType.d || i == 2104) {
            double dOptDouble2 = jSONObject.optDouble(BleConstants.TEMPERATURE);
            return dOptDouble2 >= 34.0d && dOptDouble2 <= 42.0d;
        }
        if (i == 2109) {
            return jSONObject.optInt(BleConstants.URIC_ACID) > 0;
        }
        return i == 10001 || i == 30029;
    }

    private boolean checkWeightValueValid(JSONObject jSONObject) {
        double dOptDouble = jSONObject.optDouble("weight");
        if (dOptDouble >= 0.1d && dOptDouble <= 500.0d) {
            double dOptDouble2 = jSONObject.optDouble(BleConstants.PROTEIN_VALUE);
            if (dOptDouble2 >= 0.0d && dOptDouble2 <= 500.0d) {
                double dOptDouble3 = jSONObject.optDouble(BleConstants.BMI);
                if (dOptDouble3 >= 1.0d && dOptDouble3 <= 200.0d) {
                    double dOptDouble4 = jSONObject.optDouble(BleConstants.MUSCLE_MASS);
                    if (dOptDouble4 < 0.1d || dOptDouble4 > 150.0d || jSONObject.optDouble(BleConstants.BASAL_METABOLISM) <= 0.0d) {
                        return false;
                    }
                    double dOptDouble5 = jSONObject.optDouble(BleConstants.MOISTURE);
                    if (dOptDouble5 > 0.0d && dOptDouble5 <= 500.0d) {
                        double dOptDouble6 = jSONObject.optDouble(BleConstants.VISCERAL_FAT_LEVEL);
                        if (dOptDouble6 >= 1.0d && dOptDouble6 <= 59.0d) {
                            double dOptDouble7 = jSONObject.optDouble(BleConstants.BONE_SALT);
                            if (dOptDouble7 >= 0.5d && dOptDouble7 <= 5.0d) {
                                return checkWeightValueValidMore(jSONObject);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean checkWeightValueValidMore(JSONObject jSONObject) {
        double dOptDouble = jSONObject.optDouble(BleConstants.PROTEIN_RATE);
        if (dOptDouble <= 0.0d || dOptDouble > 100.0d) {
            return false;
        }
        double dOptDouble2 = jSONObject.optDouble(BleConstants.BODY_SCORE);
        if (dOptDouble2 <= 0.0d || dOptDouble2 > 100.0d) {
            return false;
        }
        double dOptDouble3 = jSONObject.optDouble(BleConstants.BODY_AGE);
        if (dOptDouble3 < 5.0d || dOptDouble3 > 99.0d) {
            return false;
        }
        double dOptDouble4 = jSONObject.optDouble(BleConstants.BODY_FAT_RATE);
        if (dOptDouble4 <= 0.0d || dOptDouble4 > 100.0d) {
            return false;
        }
        double dOptDouble5 = jSONObject.optDouble(BleConstants.IMPEDANCE);
        if (dOptDouble5 < 0.1d || dOptDouble5 > 100000.0d) {
            return false;
        }
        double dOptDouble6 = jSONObject.optDouble(BleConstants.MOISTURE_RATE);
        if (dOptDouble6 <= 0.0d || dOptDouble6 > 100.0d) {
            return false;
        }
        double dOptDouble7 = jSONObject.optDouble(BleConstants.SKELETAL_MUSCLE_MASS);
        return dOptDouble7 >= 1.0d && dOptDouble7 <= 150.0d;
    }

    private boolean checkBloodPressureValueValid(JSONObject jSONObject) {
        double dOptDouble = jSONObject.optDouble(BleConstants.BLOODPRESSURE_SYSTOLIC);
        double dOptDouble2 = jSONObject.optDouble(BleConstants.BLOODPRESSURE_DIASTOLIC);
        if (Double.isNaN(dOptDouble) || dOptDouble < 10.0d || dOptDouble > 500.0d || Double.isNaN(dOptDouble2) || dOptDouble2 < 10.0d || dOptDouble2 > 500.0d) {
            return false;
        }
        if (jSONObject.has(BleConstants.BLOODPRESSURE_SPHYGMUS)) {
            double dOptDouble3 = jSONObject.optDouble(BleConstants.BLOODPRESSURE_SPHYGMUS);
            if (Double.isNaN(dOptDouble3) || dOptDouble3 < 1.0d || dOptDouble3 > 200.0d) {
                return false;
            }
        }
        if (!jSONObject.has(BleConstants.REST_HEARTRATE)) {
            return true;
        }
        double dOptDouble4 = jSONObject.optDouble(BleConstants.REST_HEARTRATE);
        return !Double.isNaN(dOptDouble4) && dOptDouble4 >= 1.0d && dOptDouble4 <= 200.0d;
    }

    private void execQueryDataApi(long j, long j2, final int i, HealthDataQueryOption healthDataQueryOption) {
        int[] iArr;
        LogUtil.a(TAG, "execQueryDataApi");
        final BleJsBiOperate bleJsBiOperate = new BleJsBiOperate();
        bleJsBiOperate.init();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (i == 10001) {
            iArr = this.mBloodSugarDataTypes;
            if (healthDataQueryOption != null && healthDataQueryOption.getLimit() != 0) {
                hiDataReadOption.setCount(healthDataQueryOption.getLimit());
            }
        } else {
            iArr = i == 30029 ? new int[]{30002} : new int[]{i};
        }
        hiDataReadOption.setTimeInterval(j, j2);
        boolean z = false;
        hiDataReadOption.setOwnerId(0);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setDeviceUuid(this.mUniqueId);
        hiDataReadOption.setReadType(2);
        LogUtil.a(TAG, "execQueryDataApi hiDataReadOption: ", hiDataReadOption.toString(), "; mCode: ", CommonUtil.n(this.mUniqueId));
        if (healthDataQueryOption != null && healthDataQueryOption.getStartTimes() != null) {
            z = true;
        }
        final boolean z2 = z;
        final String str = z2 ? BleConstants.HAS_HEALTH_DATA : BleConstants.GET_HEALTH_DATA;
        BleJsDataApi.getInstance().execQuery(hiDataReadOption, i, healthDataQueryOption, new ResultCallback() { // from class: com.huawei.operation.ble.DataProcessor$$ExternalSyntheticLambda3
            @Override // com.huawei.operation.share.ResultCallback
            public final void onResult(int i2, Object obj) {
                this.f$0.m1521lambda$execQueryDataApi$2$comhuaweioperationbleDataProcessor(bleJsBiOperate, str, i, z2, i2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$execQueryDataApi$2$com-huawei-operation-ble-DataProcessor, reason: not valid java name */
    /* synthetic */ void m1521lambda$execQueryDataApi$2$comhuaweioperationbleDataProcessor(BleJsBiOperate bleJsBiOperate, String str, int i, boolean z, int i2, Object obj) {
        LogUtil.a(TAG, "execQueryDataApi resultCode = ", Integer.valueOf(i2));
        bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, str, i, String.valueOf(i2));
        if (obj instanceof String) {
            callBackJsExecQueryData(String.valueOf(i2), (String) obj, z);
        } else {
            callBackJsExecQueryData(String.valueOf(i2), null, z);
        }
    }

    public void saveData(String str) {
        int i;
        LogUtil.a(TAG, "saveData function");
        BleJsBiOperate bleJsBiOperate = new BleJsBiOperate();
        bleJsBiOperate.init();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("type");
            if (i2 == 2104) {
                try {
                    i2 = HiHealthDataType.d;
                } catch (JSONException unused) {
                    i = i2;
                    LogUtil.e(TAG, "saveData JSONException");
                    bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.SAVE_HEALTH_DATA, i, BleConstants.PARAM_INVALID_STRING);
                    callBackJsResult(BleConstants.ON_SAVE_MEASURE_RESULT_NAME, 10009, BleConstants.PARAM_INVALID_STRING);
                    return;
                }
            }
            LogUtil.a(TAG, "saveData, type = ", Integer.valueOf(i2));
            ArrayList arrayList = new ArrayList(10);
            if (!isParserOneDataSuccess(arrayList, jSONObject, i2)) {
                LogUtil.j(TAG, "saveData failed");
                bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.SAVE_HEALTH_DATA, i2, BleConstants.PARAM_INVALID_STRING);
                callBackJsResult(BleConstants.ON_SAVE_MEASURE_RESULT_NAME, 10009, BleConstants.PARAM_INVALID_STRING);
            } else {
                saveDataToPlatform(bleJsBiOperate, arrayList, i2, false, BleConstants.ON_SAVE_MEASURE_RESULT_NAME);
                if (i2 == 30029) {
                    saveRopeSkipCaloriesData(bleJsBiOperate, arrayList, false);
                }
            }
        } catch (JSONException unused2) {
            i = 0;
        }
    }

    public void saveMultipleData(String str) {
        int i;
        LogUtil.a(TAG, "saveMultipleData");
        BleJsBiOperate bleJsBiOperate = new BleJsBiOperate();
        bleJsBiOperate.init();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("type");
            if (i2 == 2104) {
                try {
                    i2 = HiHealthDataType.d;
                } catch (JSONException unused) {
                    i = i2;
                    LogUtil.e(TAG, "saveMultipleData, the first level of JSONObject parsing error");
                    bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.SAVE_MULTIPLE_HEALTH_DATA, i, BleConstants.PARAM_INVALID_STRING);
                    callBackJsResult(BleConstants.ON_SAVE_MULTIPLE_MEASURE_RESULT_NAME, 10013, BleConstants.PARAM_INVALID_STRING);
                    return;
                }
            }
            LogUtil.a(TAG, "saveMultipleData, type = ", Integer.valueOf(i2));
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray != null && jSONArray.length() != 0 && jSONArray.length() <= 1000) {
                LogUtil.a(TAG, "saveMultipleData dataObject size: ", Integer.valueOf(jSONArray.length()));
                ArrayList arrayList = new ArrayList(10);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    if (!isParserOneDataSuccess(arrayList, jSONArray.getJSONObject(i3), i2)) {
                        LogUtil.j(TAG, "saveMultipleData failed index: ", Integer.valueOf(i3));
                        bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.SAVE_MULTIPLE_HEALTH_DATA, i2, BleConstants.PARAM_INVALID_STRING);
                        callBackJsResult(BleConstants.ON_SAVE_MULTIPLE_MEASURE_RESULT_NAME, 10013, BleConstants.PARAM_INVALID_STRING);
                        return;
                    }
                }
                if (arrayList.size() > 0) {
                    bleJsBiOperate.tickBiDataSize(this.mDeviceInfo, arrayList, this.mProductId, i2);
                }
                saveDataToPlatform(bleJsBiOperate, arrayList, i2, true, BleConstants.ON_SAVE_MULTIPLE_MEASURE_RESULT_NAME);
                if (i2 == 30029) {
                    saveRopeSkipCaloriesData(bleJsBiOperate, arrayList, true);
                    return;
                }
                return;
            }
            LogUtil.j(TAG, "saveMultipleData resultCode = ", BleConstants.PARAM_INVALID_STRING);
            bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.SAVE_MULTIPLE_HEALTH_DATA, i2, BleConstants.PARAM_INVALID_STRING);
            callBackJsResult(BleConstants.ON_SAVE_MULTIPLE_MEASURE_RESULT_NAME, 10013, BleConstants.PARAM_INVALID_STRING);
        } catch (JSONException unused2) {
            i = 0;
        }
    }

    private boolean isParserOneDataSuccess(List<HiHealthData> list, JSONObject jSONObject, int i) {
        long jCurrentTimeMillis;
        long j;
        try {
            long jOptLong = jSONObject.optLong("startTime");
            long jOptLong2 = jSONObject.optLong("endTime");
            if (jOptLong <= 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                j = jCurrentTimeMillis;
            } else {
                jCurrentTimeMillis = jOptLong;
                j = jOptLong2;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("value");
            if (i == 10001) {
                jSONObjectOptJSONObject.put(BleConstants.IS_CONFIRMED, jSONObject.optBoolean(BleConstants.IS_CONFIRMED));
            }
            if (jCurrentTimeMillis <= j && jSONObjectOptJSONObject != null) {
                String oneHiHealthData = getOneHiHealthData(i, list, jSONObjectOptJSONObject, jCurrentTimeMillis, j);
                LogUtil.a(TAG, "isParserOneDataSuccess condition = ", oneHiHealthData);
                return String.valueOf(0).equals(oneHiHealthData);
            }
            LogUtil.j(TAG, "isParserOneDataSuccess msg startTime > endTime or valueObject = null");
            return false;
        } catch (JSONException e) {
            LogUtil.e(TAG, "isParserOneDataSuccess msg = ", e.getMessage());
            return false;
        }
    }

    private void saveRopeSkipCaloriesData(BleJsBiOperate bleJsBiOperate, List<HiHealthData> list, boolean z) {
        LogUtil.a(TAG, "saveRopeSkipCaloriesData");
        List<HiHealthData> listAssembleRopeCaloriePoints = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).assembleRopeCaloriePoints(list);
        if (listAssembleRopeCaloriePoints.isEmpty()) {
            return;
        }
        saveDataToPlatform(bleJsBiOperate, listAssembleRopeCaloriePoints, 30001, z, null);
    }

    private String getOneHiHealthData(int i, List<HiHealthData> list, JSONObject jSONObject, long j, long j2) {
        LogUtil.a(TAG, "getOneHiHealthData saveType = ", Integer.valueOf(i));
        if (!checkDataKeyValid(i, jSONObject) || !checkDataValueValid(i, jSONObject)) {
            LogUtil.j(TAG, "getOneHiHealthData params is invalid");
            return BleConstants.PARAM_INVALID_STRING;
        }
        String str = BleConstants.PARAM_INVALID_STRING;
        if (i == HiHealthDataType.d || i == 2104) {
            return getOneTemperature(list, jSONObject, j, j2, i);
        }
        if (i == 2103) {
            return getOneBloodOxygen(list, jSONObject, j, j2);
        }
        if (i == 10006) {
            return getOneWeight(list, jSONObject, j, j2);
        }
        if (i == 10001) {
            return getOneBloodSugar(list, jSONObject, j, j2);
        }
        if (i == 10002) {
            return getOneBloodPressure(list, jSONObject, j, j2);
        }
        if (i == 2109) {
            return getOneUricAcid(list, jSONObject, j, j2);
        }
        if (i == 30029) {
            return getOneSequenceData(i, list, jSONObject, j, j2);
        }
        LogUtil.j(TAG, "getOneHiHealthData not this type");
        return str;
    }

    private String getOneBloodOxygen(List<HiHealthData> list, JSONObject jSONObject, long j, long j2) {
        LogUtil.a(TAG, "getOneBloodOxygen");
        double dOptDouble = jSONObject.optDouble(BleConstants.BLOOD_OXYGEN);
        HiHealthData hiHealthDataBuildHiHealthData = buildHiHealthData(2103, j, j2);
        hiHealthDataBuildHiHealthData.setValue(dOptDouble);
        list.add(hiHealthDataBuildHiHealthData);
        return "0";
    }

    private String getOneTemperature(List<HiHealthData> list, JSONObject jSONObject, long j, long j2, int i) {
        LogUtil.a(TAG, "getOneTemperature");
        double dOptDouble = jSONObject.optDouble(BleConstants.TEMPERATURE);
        HiHealthData hiHealthDataBuildHiHealthData = buildHiHealthData(i, j, j2);
        hiHealthDataBuildHiHealthData.setValue(dOptDouble);
        list.add(hiHealthDataBuildHiHealthData);
        return "0";
    }

    private void execQueryWeight(long j, long j2) {
        LogUtil.a(TAG, "execQueryWeight");
        final BleJsBiOperate bleJsBiOperate = new BleJsBiOperate();
        bleJsBiOperate.init();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        hiAggregateOption.setTimeRange(j, j2);
        BleJsDataApi.getInstance().execQueryWeight(hiAggregateOption, this.mUniqueId, new ResultCallback() { // from class: com.huawei.operation.ble.DataProcessor$$ExternalSyntheticLambda4
            @Override // com.huawei.operation.share.ResultCallback
            public final void onResult(int i, Object obj) {
                this.f$0.m1522lambda$execQueryWeight$3$comhuaweioperationbleDataProcessor(bleJsBiOperate, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$execQueryWeight$3$com-huawei-operation-ble-DataProcessor, reason: not valid java name */
    /* synthetic */ void m1522lambda$execQueryWeight$3$comhuaweioperationbleDataProcessor(BleJsBiOperate bleJsBiOperate, int i, Object obj) {
        LogUtil.a(TAG, "execQueryWeight resultCode = ", Integer.valueOf(i));
        bleJsBiOperate.biApiCalling(this.mDeviceInfo, this.mProductId, BleConstants.GET_HEALTH_DATA, 10006, String.valueOf(i));
        if (obj instanceof String) {
            callBackJsExecQueryData(String.valueOf(i), (String) obj, false);
        } else {
            callBackJsExecQueryData(String.valueOf(i), null, false);
        }
    }

    private String getOneWeight(List<HiHealthData> list, JSONObject jSONObject, long j, long j2) {
        LogUtil.a(TAG, "getOneWeight");
        HiHealthData hiHealthDataBuildHiHealthData = buildHiHealthData(10006, j, j2);
        hiHealthDataBuildHiHealthData.setMetaData(this.mUserUuid);
        int i = 0;
        while (true) {
            String[] strArr = this.mWeightDataTypes;
            if (i >= strArr.length) {
                break;
            }
            if (jSONObject.has(strArr[i])) {
                hiHealthDataBuildHiHealthData.putDouble(this.mWeightDataTypesKey[i], jSONObject.optDouble(this.mWeightDataTypes[i]));
            }
            i++;
        }
        if (!hiHealthDataBuildHiHealthData.containsKey("protein")) {
            hiHealthDataBuildHiHealthData.putDouble("protein", handleNewProtein(hiHealthDataBuildHiHealthData));
        }
        list.add(hiHealthDataBuildHiHealthData);
        return String.valueOf(0);
    }

    private double handleNewProtein(HiHealthData hiHealthData) {
        if (!hiHealthData.containsKey("bodyWeight") || !hiHealthData.containsKey(BleConstants.BODY_FAT_RATE) || !hiHealthData.containsKey(BleConstants.BONE_SALT) || !hiHealthData.containsKey(BleConstants.MOISTURE)) {
            return 0.0d;
        }
        return HiCommonUtil.a(hiHealthData.getDouble("bodyWeight"), hiHealthData.getDouble(BleConstants.BODY_FAT_RATE), hiHealthData.getDouble(BleConstants.MOISTURE), hiHealthData.getDouble(BleConstants.BONE_SALT));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058 A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:3:0x000b, B:5:0x001b, B:7:0x003a, B:12:0x0058, B:14:0x0065, B:8:0x003f), top: B:19:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0065 A[Catch: JSONException -> 0x0084, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0084, blocks: (B:3:0x000b, B:5:0x001b, B:7:0x003a, B:12:0x0058, B:14:0x0065, B:8:0x003f), top: B:19:0x000b }] */
    private String getOneSequenceData(int i, List<HiHealthData> list, JSONObject jSONObject, long j, long j2) {
        HiTrackMetaData ropeSkippingMetaData;
        LogUtil.a(TAG, "getOneSequenceData");
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.serializeSpecialFloatingPointValues();
            Gson gsonCreate = gsonBuilder.create();
            if (i == 30029) {
                int i2 = jSONObject.getInt(BleConstants.SPORT_TYPE);
                LogUtil.a(TAG, "getOneSequenceData sportType: " + i2);
                ropeSkippingMetaData = i2 == 283 ? parseRopeSkippingMetaData(jSONObject) : null;
                if (ropeSkippingMetaData == null) {
                    LogUtil.j(TAG, "getOneSequenceData metaData = null");
                    return BleConstants.PARAM_INVALID_STRING;
                }
                String json = gsonCreate.toJson(ropeSkippingMetaData, HiTrackMetaData.class);
                HiHealthData hiHealthDataBuildHiHealthData = buildHiHealthData(30001, j, j2);
                hiHealthDataBuildHiHealthData.setMetaData(json);
                hiHealthDataBuildHiHealthData.setSequenceData("0");
                list.add(hiHealthDataBuildHiHealthData);
                return String.valueOf(0);
            }
            LogUtil.j(TAG, "getOneSequenceData saveType: " + i);
            if (ropeSkippingMetaData == null) {
                LogUtil.j(TAG, "getOneSequenceData metaData = null");
                return BleConstants.PARAM_INVALID_STRING;
            }
            String json2 = gsonCreate.toJson(ropeSkippingMetaData, HiTrackMetaData.class);
            HiHealthData hiHealthDataBuildHiHealthData2 = buildHiHealthData(30001, j, j2);
            hiHealthDataBuildHiHealthData2.setMetaData(json2);
            hiHealthDataBuildHiHealthData2.setSequenceData("0");
            list.add(hiHealthDataBuildHiHealthData2);
            return String.valueOf(0);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "getOneSequenceData JSONException");
            return BleConstants.PARAM_INVALID_STRING;
        }
    }

    private HiTrackMetaData parseRopeSkippingMetaData(JSONObject jSONObject) {
        LogUtil.a(TAG, "parseRopeSkippingMetaData");
        HiTrackMetaData hiTrackMetaData = new HiTrackMetaData();
        try {
            hiTrackMetaData.setSportType(jSONObject.getInt(BleConstants.SPORT_TYPE));
            boolean z = false;
            hiTrackMetaData.setHasTrackPoint(false);
            long j = jSONObject.getLong("totalTime");
            hiTrackMetaData.setTotalTime(j);
            int i = jSONObject.getInt(BleConstants.TOTAL_CALORIES);
            hiTrackMetaData.setTotalCalories(i);
            boolean z2 = j >= 0 && i >= 0;
            JSONObject jSONObject2 = jSONObject.getJSONObject(BleConstants.EXTEND_TRACK_DATA_MAP);
            HashMap map = new HashMap(16);
            if (buildRopeMapDataSuccess(map, jSONObject2)) {
                z = z2;
            }
            hiTrackMetaData.setExtendTrackDataMap(map);
            String str = (String) map.get("skipSpeed");
            if (!TextUtils.isEmpty(str)) {
                hiTrackMetaData.setAbnormalTrack(njz.e(Float.valueOf(str).floatValue(), null));
            }
            hiTrackMetaData.setChiefSportDataType(7);
            hiTrackMetaData.setSportDataSource(5);
            if (z) {
                return hiTrackMetaData;
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "parseRopeSkippingMetaData JSONException");
        }
        return null;
    }

    private boolean buildRopeMapDataSuccess(Map map, JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("skipNum");
            LogUtil.a(TAG, "skipNumStr = " + string);
            map.put("skipNum", string);
            long j = Long.parseLong(string);
            String string2 = jSONObject.getString("skipSpeed");
            map.put("skipSpeed", string2);
            long j2 = Long.parseLong(string2);
            if (j >= 0 && j2 >= 0) {
                if (jSONObject.has("stumblingRope")) {
                    String string3 = jSONObject.getString("stumblingRope");
                    map.put("stumblingRope", string3);
                    if (Long.parseLong(string3) < 0) {
                        return false;
                    }
                } else {
                    map.put("stumblingRope", "-1");
                }
                if (jSONObject.has("maxSkippingTimes")) {
                    String string4 = jSONObject.getString("maxSkippingTimes");
                    map.put("maxSkippingTimes", string4);
                    return Long.parseLong(string4) >= 0;
                }
                map.put("maxSkippingTimes", "-1");
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "parseRopeSkippingMetaData NumberFormatException");
            return false;
        }
    }

    private String getOneUricAcid(List<HiHealthData> list, JSONObject jSONObject, long j, long j2) {
        LogUtil.a(TAG, "getOneUricAcid");
        int iOptInt = jSONObject.optInt(BleConstants.URIC_ACID);
        HiHealthData hiHealthDataBuildHiHealthData = buildHiHealthData(2109, j, j2);
        hiHealthDataBuildHiHealthData.setValue(iOptInt);
        list.add(hiHealthDataBuildHiHealthData);
        return String.valueOf(0);
    }

    public void deleteMultipleHealthData(String str) {
        LogUtil.a(TAG, BleConstants.ON_DELETE_MEASURE_RESULT_NAME);
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("type");
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                LogUtil.a(TAG, "deleteMultipleHealthData type = ", Integer.valueOf(i2));
                if (jSONArray.length() == 0) {
                    LogUtil.a(TAG, "deleteMultipleHealthData dataArray.length() = 0");
                    callBackJsResult(BleConstants.ON_DELETE_MEASURE_RESULT_NAME, 10015, BleConstants.PARAM_INVALID_STRING);
                    return;
                }
                if (i2 == 10001) {
                    deleteOneHealthData(jSONArray, 0, BleConstants.BLOOD_SUGAR_TYPE);
                    return;
                }
                if (i2 == 10002) {
                    deleteOneHealthData(jSONArray, 0, BleConstants.BLOOD_PRESSURE_TYPE);
                    return;
                }
                if (i2 == 10006) {
                    deleteOneHealthData(jSONArray, 0, BleConstants.WEIGHT_TYPE);
                    return;
                }
                if (i2 == 30029) {
                    deleteOneHealthData(jSONArray, 0, BleConstants.SKIPPING_ROPE_TYPE);
                    return;
                }
                if (i2 != 2104 && i2 != HiHealthDataType.d) {
                    if (i2 == 2103) {
                        deleteOneHealthData(jSONArray, 0, BleConstants.BLOOD_OXYGEN_TYPE);
                        return;
                    } else if (i2 == 2109) {
                        deleteOneHealthData(jSONArray, 0, BleConstants.URIC_ACID_TYPE);
                        return;
                    } else {
                        LogUtil.a(TAG, "deleteMultipleHealthData Types that cannot be deleted");
                        callBackJsResult(BleConstants.ON_DELETE_MEASURE_RESULT_NAME, 10015, BleConstants.PARAM_INVALID_STRING);
                        return;
                    }
                }
                deleteOneHealthData(jSONArray, 0, BleConstants.BODY_THERMOMETER_TYPE);
            } catch (JSONException unused) {
                i = i2;
                LogUtil.e(TAG, "deleteMultipleHealthData JSONException, type = ", Integer.valueOf(i));
                callBackJsResult(BleConstants.ON_DELETE_MEASURE_RESULT_NAME, 10015, String.valueOf(4));
            }
        } catch (JSONException unused2) {
        }
    }

    private void deleteOneHealthData(final JSONArray jSONArray, final int i, final String str) {
        int[] iArr;
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            long j = jSONObject.getLong("startTime");
            long j2 = jSONObject.getLong("endTime");
            LogUtil.a(TAG, "deleteOneHealthData startTime = ", Long.valueOf(j), ",endTime = ", Long.valueOf(j2));
            HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
            hiDataDeleteOption.setTimeInterval(j, j2);
            int i2 = jSONObject.getJSONObject("value").getInt(str);
            if (i2 == 10002) {
                iArr = this.mBloodPressureDataTypes;
            } else if (i2 == 10006) {
                iArr = this.mWeightDataIntTypes;
            } else {
                iArr = new int[]{i2};
            }
            hiDataDeleteOption.setTypes(iArr);
            BleJsDataApi.getInstance().deleteSample(hiDataDeleteOption, 3, new ResultCallback() { // from class: com.huawei.operation.ble.DataProcessor$$ExternalSyntheticLambda1
                @Override // com.huawei.operation.share.ResultCallback
                public final void onResult(int i3, Object obj) {
                    this.f$0.m1519x9e3bcd26(i, jSONArray, str, i3, obj);
                }
            });
        } catch (JSONException unused) {
            LogUtil.e(TAG, "deleteOneHealthData JSONException, index = ", Integer.valueOf(i));
            callBackJsResult(BleConstants.ON_DELETE_MEASURE_RESULT_NAME, 10015, String.valueOf(4));
        }
    }

    /* JADX INFO: renamed from: lambda$deleteOneHealthData$4$com-huawei-operation-ble-DataProcessor, reason: not valid java name */
    /* synthetic */ void m1519x9e3bcd26(int i, JSONArray jSONArray, String str, int i2, Object obj) {
        LogUtil.a(TAG, "deleteOneHealthData resultCode：", Integer.valueOf(i2));
        if (i2 != 0 || i == jSONArray.length() - 1) {
            callBackJsResult(BleConstants.ON_DELETE_MEASURE_RESULT_NAME, 10015, String.valueOf(Utils.filterResultCode(i2)));
        } else {
            deleteOneHealthData(jSONArray, i + 1, str);
        }
    }
}

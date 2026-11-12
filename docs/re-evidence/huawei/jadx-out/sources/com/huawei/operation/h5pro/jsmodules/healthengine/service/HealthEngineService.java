package com.huawei.operation.h5pro.jsmodules.healthengine.service;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.AppInfoUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiHealthDataQueryOption;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import defpackage.krm;
import defpackage.krn;
import defpackage.krp;
import defpackage.krq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes41.dex */
public class HealthEngineService {
    public static final HealthEngineService INSTANCE = new HealthEngineService();
    private static final String TAG = "H5PRO_HealthEngineService";

    private HealthEngineService() {
    }

    public HealthKitDictQuery parseQueryParam(String str) {
        QueryDataParamObj queryDataParamObj = (QueryDataParamObj) GsonUtil.parseContainsMapJson(str, QueryDataParamObj.class);
        HiHealthDataQueryOption hiHealthDataQueryOption = null;
        if (queryDataParamObj == null) {
            return null;
        }
        QueryDataParamObj.QueryDataOption queryOption = queryDataParamObj.getQueryOption();
        if (queryOption != null) {
            hiHealthDataQueryOption = new HiHealthDataQueryOption();
            hiHealthDataQueryOption.setLimit(queryOption.getLimit());
            hiHealthDataQueryOption.setOffset(queryOption.getOffset());
            hiHealthDataQueryOption.setOrder(queryOption.getOrder());
        }
        HealthKitDictQuery healthKitDictQuery = new HealthKitDictQuery(queryDataParamObj.getType(), queryDataParamObj.getStartTime(), queryDataParamObj.getEndTime(), hiHealthDataQueryOption);
        if (queryDataParamObj.getValueFilterType() > 0) {
            healthKitDictQuery.setValueFilterType(queryDataParamObj.getValueFilterType());
        }
        if (queryDataParamObj.getAggregateType() > 0) {
            healthKitDictQuery.putAggregateType(queryDataParamObj.getAggregateType());
        }
        if (queryDataParamObj.getGroupUnitType() > 0) {
            healthKitDictQuery.putGroupUnitType(queryDataParamObj.getGroupUnitType());
        }
        if (queryDataParamObj.getSubTypes() != null) {
            healthKitDictQuery.putSubTypes(queryDataParamObj.getSubTypes());
        }
        if (!TextUtils.isEmpty(queryDataParamObj.getFilterKeys()) && !TextUtils.isEmpty(queryDataParamObj.getFilterValues())) {
            healthKitDictQuery.setFilterKeys(queryDataParamObj.getFilterKeys());
            healthKitDictQuery.setFilterValues(queryDataParamObj.getFilterValues());
        }
        Map<String, Object> bundle = queryDataParamObj.getBundle();
        if (bundle != null && !bundle.isEmpty()) {
            for (Map.Entry<String, Object> entry : bundle.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    if (entry.getValue() instanceof Integer) {
                        healthKitDictQuery.putValue(entry.getKey(), ((Integer) entry.getValue()).intValue());
                    } else if (entry.getValue() instanceof Double) {
                        healthKitDictQuery.putValue(entry.getKey(), ((Double) entry.getValue()).doubleValue());
                    } else if (entry.getValue() instanceof String) {
                        healthKitDictQuery.putValue(entry.getKey(), (String) entry.getValue());
                    } else if (entry.getValue() instanceof Boolean) {
                        healthKitDictQuery.putValue(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                    } else {
                        LogUtil.i(TAG, "bundle: Only Integer, Double, Boolean,and String are supported. " + entry.getKey());
                    }
                }
            }
        }
        return healthKitDictQuery;
    }

    public void onQueryResult(H5ProJsCbkInvoker<Object> h5ProJsCbkInvoker, long j, Object obj) {
        if (h5ProJsCbkInvoker == null) {
            LogUtil.w(TAG, "onQueryResult: callbackInvoker is null");
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            LogUtil.i(TAG, "onQueryResult: size: " + list.size());
            if (list.isEmpty()) {
                h5ProJsCbkInvoker.onSuccess(list, j);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof krm) {
                    arrayList.add((krm) obj2);
                } else if (obj2 instanceof krq) {
                    arrayList.add((krq) obj2);
                } else if (!(obj2 instanceof krp)) {
                    LogUtil.d(TAG, "onQueryResult: Unknown type of data -> " + obj2);
                } else {
                    arrayList.add((krp) obj2);
                }
            }
            h5ProJsCbkInvoker.onSuccess(arrayList, j);
            return;
        }
        h5ProJsCbkInvoker.onSuccess(obj, j);
    }

    public krn getH5AppContext(Context context, H5ProInstance h5ProInstance) {
        return new krn(context, buildH5ProAppInfo(h5ProInstance));
    }

    private H5ProAppInfo buildH5ProAppInfo(H5ProInstance h5ProInstance) {
        H5ProAppInfo h5ProAppInfo = new H5ProAppInfo();
        com.huawei.health.h5pro.vengine.H5ProAppInfo appInfo = h5ProInstance.getAppInfo();
        if (appInfo == null) {
            LogUtil.w(TAG, "buildH5ProAppInfo originInfo is null");
            return h5ProAppInfo;
        }
        h5ProAppInfo.setAppId(appInfo.getAppId());
        h5ProAppInfo.setAccessToken(h5ProInstance.getAccessToken());
        h5ProAppInfo.setAppName(appInfo.getAppName());
        if (!TextUtils.isEmpty(appInfo.getPkgName())) {
            h5ProAppInfo.setPkgName(appInfo.getPkgName());
        } else {
            String hostOrPkgNameFroUrl = AppInfoUtil.getInstance().getHostOrPkgNameFroUrl(h5ProInstance.getUrl(), appInfo);
            if (!TextUtils.isEmpty(hostOrPkgNameFroUrl)) {
                h5ProAppInfo.setPkgName(hostOrPkgNameFroUrl);
            } else {
                h5ProAppInfo.setPkgName("com.huawei.health.h5pro.lightapp.unknow");
            }
        }
        h5ProAppInfo.setCertPrint(appInfo.getCertPrint());
        h5ProAppInfo.setUrl("");
        return h5ProAppInfo;
    }

    public int[] toIntArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            LogUtil.w(TAG, "toIntArray: jsonArray is null");
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (!(obj instanceof Integer)) {
                    LogUtil.w(TAG, "toIntArray: value is not type Integer");
                    return iArr;
                }
                iArr[i] = ((Integer) obj).intValue();
            } catch (JSONException e) {
                LogUtil.e(TAG, "toIntArray: exception -> ", e);
            }
        }
        return iArr;
    }
}

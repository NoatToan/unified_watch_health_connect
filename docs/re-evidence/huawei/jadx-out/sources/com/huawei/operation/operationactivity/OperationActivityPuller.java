package com.huawei.operation.operationactivity;

import android.text.TextUtils;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import defpackage.njy;
import defpackage.nsj;
import defpackage.nsk;
import defpackage.nsq;
import defpackage.oet;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class OperationActivityPuller {
    private static final int HAS_NO_MORE_DATA = 0;
    private static final int MAX_REQUEST_NUMBER = 20;
    private static final int NEXT_PAGE = 1;
    private static final String TAG = "OperationActivity_OperationActivityPuller";
    private static String sGetActivitiesUrl;

    private OperationActivityPuller() {
    }

    public static void getOperationActivity(final nsk nskVar, final OperationActivityCallback operationActivityCallback) {
        LogUtil.a(TAG, "getOperationActivity() enter");
        GRSManager.c(BaseApplication.getContext()).d("activityUrl", new GrsQueryCallback() { // from class: com.huawei.operation.operationactivity.OperationActivityPuller.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                OperationActivityPuller.onResponseResult(str, nskVar, operationActivityCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j(OperationActivityPuller.TAG, "GRSManager onCallBackFail ACTIVITY_KEY failCode = ", Integer.valueOf(i));
                OperationActivityCallback operationActivityCallback2 = operationActivityCallback;
                if (operationActivityCallback2 != null) {
                    operationActivityCallback2.onResponse(i, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onResponseResult(String str, nsk nskVar, OperationActivityCallback operationActivityCallback) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "GRSManager onResponseResult ACTIVITY_KEY url is empty.");
            if (operationActivityCallback != null) {
                operationActivityCallback.onResponse(-1, null);
                return;
            }
            return;
        }
        sGetActivitiesUrl = str + "/activity/getActivities";
        ArrayList arrayList = new ArrayList(10);
        int iC = 0;
        int i = 0;
        boolean z = false;
        int iE = 0;
        do {
            nsq nsqVarPullOperationActivity = pullOperationActivity(nskVar, iC);
            i++;
            if (nsqVarPullOperationActivity != null && String.valueOf(0).equals(nsqVarPullOperationActivity.d())) {
                iC = nsqVarPullOperationActivity.c() + 1;
                iE = nsqVarPullOperationActivity.e();
                LogUtil.a(TAG, "onCallBackSuccess hasMore = ", Integer.valueOf(iE), ", requestNumber = ", Integer.valueOf(i));
                List<nsj> listA = nsqVarPullOperationActivity.a();
                if (njy.b(listA)) {
                    arrayList.addAll(listA);
                }
            } else {
                LogUtil.j(TAG, "response is null");
                z = true;
            }
            if (iE <= 0 || z) {
                break;
            }
        } while (i < 20);
        if (z) {
            LogUtil.j(TAG, "isRequestProceed is true");
            if (operationActivityCallback != null) {
                operationActivityCallback.onResponse(1008, null);
                return;
            }
            return;
        }
        if (operationActivityCallback != null) {
            operationActivityCallback.onResponse(0, arrayList);
            LogUtil.a(TAG, "listSize = ", Integer.valueOf(arrayList.size()));
        }
    }

    private static nsq pullOperationActivity(nsk nskVar, int i) {
        JSONObject operationActivityParams = getOperationActivityParams(nskVar, i);
        String str = (String) oet.d().e(sGetActivitiesUrl, new HealthDataCloudFactory(BaseApplication.getContext()).getHeaders(), operationActivityParams.toString(), String.class);
        LogUtil.d(TAG, "jsonResult = ", str);
        return OperationActivityParser.analyzeOperationActivityResponse(str);
    }

    private static JSONObject getOperationActivityParams(nsk nskVar, int i) {
        JSONObject commonRequestParams = getCommonRequestParams();
        try {
            commonRequestParams.put("pageNo", i);
            if (nskVar != null) {
                List<Integer> listA = nskVar.a();
                if (njy.b(listA)) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<Integer> it = listA.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().intValue());
                    }
                    commonRequestParams.put("activityTypeList", jSONArray);
                }
                commonRequestParams.put("joinStatus", nskVar.e());
                int iB = nskVar.b();
                if (iB >= 0 && iB <= 3) {
                    commonRequestParams.put("finishFlag", iB);
                }
                if (nskVar.c() == 1) {
                    commonRequestParams.put("queryType", 1);
                }
            }
            commonRequestParams.put(IAchieveDBMgr.PARAM_PAGE_SIZE, 20);
            if (!CommonUtil.ap() && !CommonUtil.cl()) {
                commonRequestParams.put("isBeta", 0);
                return commonRequestParams;
            }
            commonRequestParams.put("isBeta", 1);
            return commonRequestParams;
        } catch (JSONException e) {
            LogUtil.e(TAG, "getOperationActivityParams exception = ", e.getMessage());
            return commonRequestParams;
        }
    }

    private static JSONObject getCommonRequestParams() {
        return new JSONObject(new ActivityInfoListFactory(BaseApplication.getContext()).getBody(null));
    }
}

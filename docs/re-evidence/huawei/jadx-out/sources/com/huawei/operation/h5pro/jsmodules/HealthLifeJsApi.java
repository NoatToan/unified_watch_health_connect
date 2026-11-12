package com.huawei.operation.h5pro.jsmodules;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.services.codec.TypeToken;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import defpackage.ffv;
import defpackage.nrh;
import defpackage.qev;
import defpackage.qex;
import defpackage.qey;
import defpackage.qfj;
import defpackage.qfn;
import defpackage.qfr;
import defpackage.qfv;
import defpackage.qfw;
import defpackage.qgc;
import defpackage.qqw;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class HealthLifeJsApi extends JsBaseModule {
    @JavascriptInterface
    public void createPlanDetail(final long j, String str) {
        ReleaseLogUtil.c(this.TAG, "createPlanDetail param ", str);
        ffv.a((qex) HiJsonUtil.d(str, qex.class), (ResponseCallback<qey>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda3
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1556xf2b3d862(j, i, (qey) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$createPlanDetail$0$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1556xf2b3d862(long j, int i, qey qeyVar) {
        LogUtil.b(this.TAG, "createPlanDetail errorCode ", Integer.valueOf(i), " planDetail ", qeyVar);
        if (i == 0) {
            onSuccessCallback(j, qeyVar);
        } else {
            onFailureCallback(j, "");
        }
    }

    @JavascriptInterface
    public void batchHandleTasks(final long j, String str) {
        ReleaseLogUtil.c(this.TAG, "batchHandleTasks param ", str);
        BatchHandleTasksParam batchHandleTasksParam = (BatchHandleTasksParam) HiJsonUtil.d(str, BatchHandleTasksParam.class);
        if (batchHandleTasksParam == null) {
            onFailureCallback(j, "");
            return;
        }
        qfv qfvVar = (qfv) HiJsonUtil.d(batchHandleTasksParam.requestBody, qfv.class);
        if (qfvVar == null) {
            onFailureCallback(j, "");
            return;
        }
        qfvVar.b((qfw) HiJsonUtil.d(batchHandleTasksParam.config, qfw.class));
        if (TextUtils.isEmpty(qfvVar.d())) {
            qfvVar.c(batchHandleTasksParam.planId);
        }
        ffv.c(qfvVar, (ResponseCallback<qgc>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda5
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1555xe552028b(j, i, (qgc) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$batchHandleTasks$1$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1555xe552028b(long j, int i, qgc qgcVar) {
        LogUtil.b(this.TAG, "batchHandleTasks errorCode ", Integer.valueOf(i), " queryTasksResp ", qgcVar);
        if (i == 0) {
            onSuccessCallback(j, qgcVar);
        } else {
            onFailureCallback(j, "");
        }
    }

    @JavascriptInterface
    public void querySchedule(final long j, String str) {
        ReleaseLogUtil.c(this.TAG, "querySchedule param ", str);
        qfn qfnVar = (qfn) HiJsonUtil.d(str, qfn.class);
        List listSingletonList = Collections.EMPTY_LIST;
        if (qfnVar != null && qfnVar.b() != DateFormatUtil.a(System.currentTimeMillis())) {
            listSingletonList = Collections.singletonList("all");
        }
        ffv.d("gotoHealthLife", listSingletonList, qfnVar, new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1560xdf592991(j, i, (qfj) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$querySchedule$2$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1560xdf592991(long j, int i, qfj qfjVar) {
        LogUtil.b(this.TAG, "querySchedule errorCode ", Integer.valueOf(i), " querySchedulesResp ", qfjVar);
        if (i == 0) {
            onSuccessCallback(j, qfjVar);
        } else {
            onFailureCallback(j, "");
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class BatchHandleTasksParam {

        @SerializedName(NetworkService.Constants.CONFIG_SERVICE)
        String config;

        @SerializedName("planId")
        String planId;

        @SerializedName("requestBody")
        String requestBody;

        private BatchHandleTasksParam() {
        }
    }

    @JavascriptInterface
    public void queryPlanDetail(final long j, String str) {
        ReleaseLogUtil.c(this.TAG, "queryPlanDetail param ", str);
        ffv.d((qev) HiJsonUtil.d(str, qev.class), (ResponseCallback<List<qey>>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda2
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1559x32efd4d(j, i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$queryPlanDetail$3$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1559x32efd4d(long j, int i, List list) {
        LogUtil.b(this.TAG, "queryPlanDetail errorCode ", Integer.valueOf(i), " list ", list);
        if (i == 0) {
            onSuccessCallback(j, list);
        } else {
            onFailureCallback(j, "");
        }
    }

    @JavascriptInterface
    public void switchHealthLifeMode(final long j, int i) {
        ReleaseLogUtil.c(this.TAG, "switchHealthLifeMode healthLifeMode ", Integer.valueOf(i));
        ffv.e(i, (ResponseCallback<String>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f$0.m1561xc6d7eea5(j, i2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$switchHealthLifeMode$4$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1561xc6d7eea5(long j, int i, String str) {
        LogUtil.b(this.TAG, "switchHealthLifeMode errorCode ", Integer.valueOf(i), " string ", str);
        if (i == 0) {
            try {
                onSuccessCallback(j, new JSONObject(str));
                return;
            } catch (JSONException e) {
                ReleaseLogUtil.b(this.TAG, "switchHealthLifeMode exception ", ExceptionUtils.c(e));
                onFailureCallback(j, str);
                return;
            }
        }
        onFailureCallback(j, str);
    }

    @JavascriptInterface
    public void getLeafProgress(final long j, String str) {
        Map map = (Map) HiJsonUtil.d(str, new TypeToken<Map<String, Integer>>() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi.1
        }.getType());
        ReleaseLogUtil.c(this.TAG, "getLeafProgress param ", str, " map ", map);
        if (map == null) {
            return;
        }
        Integer num = (Integer) map.get("startDay");
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) map.get("endDay");
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        if (num2 != null) {
            iA = num2.intValue();
        }
        LogUtil.b(this.TAG, "getLeafProgress startDay ", Integer.valueOf(iIntValue), " endDay ", Integer.valueOf(iA));
        ffv.e(iIntValue, iA, (ResponseCallback<List<nrh>>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda7
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1558x71c5c94c(j, i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getLeafProgress$5$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1558x71c5c94c(long j, int i, List list) {
        LogUtil.b(this.TAG, "getLeafProgress errorCode ", Integer.valueOf(i), " list ", list);
        if (i == 0) {
            onSuccessCallback(j, list);
        } else {
            onFailureCallback(j, "");
        }
    }

    @JavascriptInterface
    public void drinkWater(final long j, int i) {
        ReleaseLogUtil.c(this.TAG, "drinkWater intake ", Integer.valueOf(i));
        ffv.a(i, (ResponseCallback<qfr>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f$0.m1557xe90d47d3(j, i2, (qfr) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$drinkWater$6$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1557xe90d47d3(long j, int i, qfr qfrVar) {
        LogUtil.b(this.TAG, "drinkWater errorCode ", Integer.valueOf(i), " updateScheduleResp ", qfrVar);
        if (i == 0) {
            onSuccessCallback(j, qfrVar);
        } else {
            onFailureCallback(j, "");
        }
    }

    @JavascriptInterface
    public void updateDietRecord(long j, String str) {
        Map map = (Map) HiJsonUtil.d(str, new TypeToken<Map<String, String>>() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi.2
        }.getType());
        ReleaseLogUtil.c(this.TAG, "updateDietRecord param ", str, " map ", map);
        if (map == null) {
            onFailureCallback(j, "param is invalid");
            return;
        }
        String strD = qqw.d(map, "curValue", "");
        String strD2 = qqw.d(map, "goalValue", "");
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strD2)) {
            onFailureCallback(j, "param is invalid");
        } else if (!ffv.t()) {
            onSuccessCallback(j, "");
        } else {
            ffv.d(strD2, strD, new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.HealthLifeJsApi$$ExternalSyntheticLambda6
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m1562x7ae1c7a3(i, (String) obj);
                }
            });
            onSuccessCallback(j, "");
        }
    }

    /* JADX INFO: renamed from: lambda$updateDietRecord$7$com-huawei-operation-h5pro-jsmodules-HealthLifeJsApi, reason: not valid java name */
    /* synthetic */ void m1562x7ae1c7a3(int i, String str) {
        LogUtil.b(this.TAG, "updateDietRecord status ", Integer.valueOf(i), " data ", str);
    }
}

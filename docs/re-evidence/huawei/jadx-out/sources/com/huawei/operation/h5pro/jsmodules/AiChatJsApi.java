package com.huawei.operation.h5pro.jsmodules;

import android.webkit.JavascriptInterface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AiChatJsApi extends JsBaseModule {
    private static final int DIET_UPDATE = 27004;
    private static final int INT_PLAN_CREATE = 27005;
    private static final int INT_PLAN_STOP = 27006;
    private static final int INT_PLAN_UPDATE = 27002;
    private static final int WEIGHT_UPDATE = 27003;

    private static WeightApi getWeightApi() {
        return (WeightApi) Services.d("Main", WeightApi.class);
    }

    @JavascriptInterface
    public void eventNotify(long j, String str) {
        LogUtil.a(this.TAG, "eventNotify param is ", str);
        if (str == null) {
            onFailureCallback(j, "param is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("eventCode")) {
                onFailureCallback(j, "JSONException");
                return;
            }
            switch (jSONObject.getInt("eventCode")) {
                case INT_PLAN_UPDATE /* 27002 */:
                case INT_PLAN_CREATE /* 27005 */:
                case INT_PLAN_STOP /* 27006 */:
                    ObserverManagerUtil.e(ObserveLabels.UPDATE_STAY_FIT_PLAN, new Object[0]);
                    PluginSuggestion.getInstance().startSendIntelligentPlan();
                    break;
                case WEIGHT_UPDATE /* 27003 */:
                    syncCloud(DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value());
                    break;
                case DIET_UPDATE /* 27004 */:
                    WeightApi weightApi = getWeightApi();
                    if (weightApi == null) {
                        ReleaseLogUtil.d(this.TAG, "syncData weightApi is null");
                        onFailureCallback(j, "syncData fail");
                        return;
                    }
                    weightApi.syncData();
                    break;
                default:
                    onFailureCallback(j, "illegal eventCode");
                    return;
            }
            onSuccessCallback(j);
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "getMessage JSONException");
            onFailureCallback(j, "JSONException");
        }
    }

    private void syncCloud(int i) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(new ArrayList<Integer>(i) { // from class: com.huawei.operation.h5pro.jsmodules.AiChatJsApi.1
            final /* synthetic */ int val$dictValue;

            {
                this.val$dictValue = i;
                add(Integer.valueOf(i));
            }
        });
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncAction(0);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, new HiCommonListener() { // from class: com.huawei.operation.h5pro.jsmodules.AiChatJsApi.2
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i2, Object obj) {
                LogUtil.a(AiChatJsApi.this.TAG, "syncCloud onSuccess errorCode ", Integer.valueOf(i2), " object ", obj);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i2, Object obj) {
                LogUtil.j(AiChatJsApi.this.TAG, "syncCloud onFailure errorCode ", Integer.valueOf(i2), " errorMessage ", obj);
            }
        });
    }
}

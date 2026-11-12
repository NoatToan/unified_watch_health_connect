package com.huawei.hwarkuix.oHProEngine;

import android.content.Context;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import ohos.ace.adapter.capability.bridge.BridgeErrorCode;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import ohos.ace.adapter.capability.bridge.MethodData;
import ohos.ace.adapter.capability.bridge.TaskOption;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class OHProBridgePlugin extends BridgePlugin {
    private static final String TAG = "OHProBridgePlugin";
    private static final String TAG_RELEASE = "R_OHProBridgePlugin";

    public OHProBridgePlugin(Context context, String str, int i) {
        super(context, str, i);
        LogUtil.a(TAG, "module constructed: " + str);
    }

    public OHProBridgePlugin(Context context, String str, int i, BridgePlugin.BridgeType bridgeType) {
        super(context, str, i, bridgeType);
        LogUtil.a(TAG, "module constructed: " + str);
    }

    public OHProBridgePlugin(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
        LogUtil.a(TAG, "module constructed: " + str);
    }

    public OHProBridgePlugin(Context context, String str, BridgeManager bridgeManager, BridgePlugin.BridgeType bridgeType) {
        super(context, str, bridgeManager, bridgeType);
        LogUtil.a(TAG, "module constructed: " + str);
    }

    public OHProBridgePlugin(Context context, String str, BridgeManager bridgeManager, BridgePlugin.BridgeType bridgeType, TaskOption taskOption) {
        super(context, str, bridgeManager, bridgeType, taskOption);
        LogUtil.a(TAG, "module constructed: " + str);
    }

    @Override // ohos.ace.adapter.capability.bridge.BridgePlugin
    public Object jsCallMethod(Object obj, MethodData methodData) {
        String bridgeName = getBridgeName();
        Object objValueOf = Constants.NULL;
        LogUtil.a(TAG, "jsCallMethod bridge:", bridgeName, " method:", methodData != null ? methodData.getMethodName() : Constants.NULL);
        Object objJsCallMethod = super.jsCallMethod(obj, methodData);
        if ((objJsCallMethod instanceof BridgeErrorCode) && methodData != null) {
            String bridgeName2 = getBridgeName();
            String methodName = methodData.getMethodName();
            if (methodData.getMethodParameter() != null) {
                objValueOf = Integer.valueOf(methodData.getMethodParameter().length);
            }
            LogUtil.a(TAG, "jsCallMethod bridgeErrorCode:", objJsCallMethod, "  bridge:", bridgeName2, " method:", methodName, " parameter.length:", objValueOf);
        }
        return objJsCallMethod;
    }

    @Override // ohos.ace.adapter.capability.bridge.BridgePlugin
    public void sendMessage(Object obj) {
        try {
            super.sendMessage(obj);
        } catch (Throwable th) {
            ReleaseLogUtil.d(TAG_RELEASE, "sendMessage Exception: ", DfxUtils.d(Thread.currentThread(), th));
        }
    }

    public void ohProOnSuccess(long j, Object obj) {
        Object obj2;
        if (getBridgeType() == BridgePlugin.BridgeType.BINARY_TYPE) {
            HashMap map = new HashMap();
            map.put("callbackId", Long.valueOf(j));
            map.put("errCode", 0);
            map.put("data", obj);
            obj2 = map;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("callbackId", j);
                jSONObject.put("errCode", 0);
                jSONObject.put("data", obj);
                obj2 = jSONObject;
            } catch (JSONException e) {
                LogUtil.j(TAG, "onSuccess result json put Error:" + e.getMessage());
                obj2 = jSONObject;
            }
        }
        sendMessage(obj2);
        LogUtil.a(TAG, "onSuccess message sent: " + obj2);
    }

    public void ohProOnFailure(long j, Object obj) {
        Object obj2;
        if (getBridgeType() == BridgePlugin.BridgeType.BINARY_TYPE) {
            HashMap map = new HashMap();
            map.put("callbackId", Long.valueOf(j));
            map.put("errCode", -1);
            map.put("data", obj);
            obj2 = map;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("callbackId", j);
                jSONObject.put("errCode", -1);
                jSONObject.put("data", obj);
                obj2 = jSONObject;
            } catch (JSONException e) {
                LogUtil.j(TAG, "onFailure result json put Error:" + e.getMessage());
                obj2 = jSONObject;
            }
        }
        sendMessage(obj2);
        LogUtil.a(TAG, "onFailure message sent: " + obj2);
    }
}

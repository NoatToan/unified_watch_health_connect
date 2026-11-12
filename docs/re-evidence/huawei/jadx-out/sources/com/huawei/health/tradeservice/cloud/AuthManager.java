package com.huawei.health.tradeservice.cloud;

import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.CloudParamKeys;
import defpackage.ily;
import defpackage.peh;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes32.dex */
public class AuthManager {
    private static final String OP_KEY_RESULT_CODE = "resultCode";
    private static final String TAG = "TradeService_AuthManager";

    private AuthManager() {
    }

    public static void resourceAuthInfo(int i, String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "resourceAuthInfo enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j(TAG, "resourceAuthInfo isBrowseMode");
            iBaseResponseCallback.a(-2, null);
            return;
        }
        HashMap<String, String> map = new HashMap<>(16);
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("country", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put("resType", String.valueOf(i));
        map.put("resId", str);
        LogUtil.a(TAG, "resourceAuthInfo get params: ", map.toString());
        TradeServiceCloudMgr.getInstance().resourceAuthInfo(new ResourceAuthReq(), map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.AuthManager.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("resultCode", String.valueOf(i2));
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_TRADE_RES_80070003.value(), linkedHashMap);
                if (obj instanceof ResourceAuthRsp) {
                    ResourceAuthRsp resourceAuthRsp = (ResourceAuthRsp) obj;
                    ReleaseLogUtil.d(AuthManager.TAG, "resourceAuthInfo: ", peh.c(resourceAuthRsp));
                    iBaseResponseCallback.a(i2, Integer.valueOf(resourceAuthRsp.getAuthResult()));
                    return;
                }
                iBaseResponseCallback.a(i2, null);
            }
        });
    }

    public static void functionAuthInfo(String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "functionAuthInfo enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j(TAG, "functionAuthInfo isBrowseMode");
            iBaseResponseCallback.a(-2, null);
            return;
        }
        HashMap<String, String> map = new HashMap<>(16);
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("country", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        LogUtil.a(TAG, "functionAuthInfo get params: ", map.toString());
        TradeServiceCloudMgr.getInstance().functionAuthInfo(new FunctionAuthReq(), str, map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.AuthManager.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("resultCode", String.valueOf(i));
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_TRADE_FUNC_80070004.value(), linkedHashMap);
                if (obj instanceof FunctionAuthRsp) {
                    iBaseResponseCallback.a(i, ((FunctionAuthRsp) obj).getFunctionAuthResult());
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }
}

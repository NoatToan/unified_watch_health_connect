package com.huawei.operation.cloud;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.CloudParamKeys;
import defpackage.dlv;
import defpackage.oet;
import defpackage.pja;
import defpackage.pjd;
import defpackage.pjg;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes41.dex */
public class OperationCloudUtil {
    private static final String FUNCTION_ENTRANCE = "/operationgeneral/app/v1/functionentrance";
    private static final String FUNCTION_ENTRANCE_ANON = "/operationgeneral/app/v1/functionentrance/anon";
    private static final String R_TAG = "R_OperationCloudUtil";
    private static final String TAG = "OperationCloudUtil";

    private OperationCloudUtil() {
    }

    private static boolean isVerifyNetwork() {
        boolean zAb = CommonUtil.ab(BaseApplication.b());
        boolean zH = Utils.h();
        ReleaseLogUtil.c(R_TAG, "isVerify isNetworkConnected ", Boolean.valueOf(zAb), " isAllowLogin ", Boolean.valueOf(zH));
        return zAb && zH;
    }

    private static <T> void callHttpGet(String str, Map<String, String> map, Map<String, String> map2, Class<T> cls, ResultCallback<T> resultCallback) {
        LogUtil.a(TAG, "callHttpGet url ", str, " headers ", map, " queryParams ", map2, " responseType ", cls, " callback ", resultCallback);
        try {
            oet.d().e(str, map, map2, cls, resultCallback);
        } catch (OutOfMemoryError e) {
            ReleaseLogUtil.b(R_TAG, "callHttpGet error ", ExceptionUtils.c(e));
        }
    }

    private static String getFunctionEntranceUrl(boolean z) {
        String url = GRSManager.c(BaseApplication.b()).getUrl("healthOperationUrl");
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append(z ? FUNCTION_ENTRANCE : FUNCTION_ENTRANCE_ANON);
        return sb.toString();
    }

    private static Map<String, String> getFunctionEntranceQueryParams() {
        HashMap map = new HashMap();
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(qrs.d()));
        map.put("countryCode", GRSManager.c(BaseApplication.b()).getCommonCountryCode());
        map.put("clientVersion", AppBundleBuildConfig.m());
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void functionEntrance(final String str, final boolean z, final ResponseCallback<List<pjd>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d(R_TAG, "functionEntrance callback is null tag ", str, " isLogin ", Boolean.valueOf(z));
            return;
        }
        if (!isVerifyNetwork()) {
            responseCallback.onResponse(-1, null);
            return;
        }
        boolean zO = Utils.o();
        ReleaseLogUtil.c(R_TAG, "functionEntrance tag ", str, " isLogin ", Boolean.valueOf(z), " isOversea ", Boolean.valueOf(zO));
        if (!zO) {
            responseCallback.onResponse(-1, null);
        } else if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.cloud.OperationCloudUtil$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    OperationCloudUtil.functionEntrance(str, z, responseCallback);
                }
            });
        } else {
            callHttpGet(getFunctionEntranceUrl(z), dlv.d(), getFunctionEntranceQueryParams(), pja.class, new ResultCallback<pja>() { // from class: com.huawei.operation.cloud.OperationCloudUtil.1
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(pja pjaVar) {
                    LogUtil.a(OperationCloudUtil.TAG, "functionEntrance onSuccess tag ", str, " response ", pjaVar);
                    responseCallback.onResponse(pjaVar.e(), pjaVar.b());
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.d(OperationCloudUtil.R_TAG, "functionEntrance onFailure tag ", str, " throwable ", ExceptionUtils.c(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    public static void functionEntrance(String str, boolean z) {
        functionEntrance(str, z, new ResponseCallback() { // from class: com.huawei.operation.cloud.OperationCloudUtil$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                OperationCloudUtil.lambda$functionEntrance$1(i, (List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$functionEntrance$1(int i, List list) {
        ReleaseLogUtil.c(R_TAG, "functionEntrance errorCode ", Integer.valueOf(i));
        if (i != 0) {
            return;
        }
        String strD = HiJsonUtil.d(list);
        String strC = pjg.c();
        boolean zEquals = Objects.equals(strD, strC);
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.c(R_TAG, "functionEntrance isSuccess ", Boolean.valueOf(pjg.b()));
        } else {
            pjg.b((List<pjd>) list);
        }
        LogUtil.a(TAG, "functionEntrance isSame ", Boolean.valueOf(zEquals), " json ", strD, " cacheJson ", strC);
        if (zEquals) {
            return;
        }
        ReleaseLogUtil.c(R_TAG, "functionEntrance isSame false");
        ObserverManagerUtil.e("OPERATION_FUNCTION_ENTRANCE", Integer.valueOf(i), list);
    }
}

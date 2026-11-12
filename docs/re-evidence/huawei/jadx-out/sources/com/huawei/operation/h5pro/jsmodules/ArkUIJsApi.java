package com.huawei.operation.h5pro.jsmodules;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.JsonParseException;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.operation.h5pro.jsmodules.healthengine.service.HealthEngineService;
import com.huawei.operation.utils.CheckAuthPermissionUtils;
import defpackage.nqk;
import defpackage.nql;
import defpackage.nqr;
import defpackage.nrb;
import defpackage.nrl;
import defpackage.nro;
import defpackage.nrt;
import defpackage.nrv;
import defpackage.nry;
import defpackage.nsc;
import defpackage.nsd;
import defpackage.nse;
import defpackage.nsi;
import defpackage.nsl;
import defpackage.peh;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ArkUIJsApi extends JsBaseModule {
    private static final String AGGREGATE_SPORT_KEY = "SPORT";
    private static final String DAILY_ACTIVITIES_KEY = "DAILY_ACTIVITIES";
    public static final String MODEL = "ArkUIJsApi";
    private static final int SPORTID = 30001;
    private static final String TAG = "ArkUIJsApi";
    private final nry mReadDataProcess = new nry();
    private final nsd mReadSportDataProcess = new nsd();
    private final nrl mAggregateDataProcess = new nrl();
    private final nro mAggregateSportDataProcess = new nro();
    private final nrv mAggregateSportSequenceDataProcess = new nrv();
    private final nsc mReadDataSourceProcess = new nsc();
    private final nrt mDeleteDataProcess = new nrt();
    private final nse mSaveDataProcess = new nse();
    private final nsi mSubscribeDataProcess = new nsi();
    private final nsl mUnSubscribeDataProcess = new nsl();
    private List<String> mParamList = new ArrayList();

    @JavascriptInterface
    public void readData(long j, String str) {
        LogUtil.a("ArkUIJsApi", "readData origin request = ", str);
        IBaseResponseCallback callback = getCallback(j);
        int iCheckAuthPermission = CheckAuthPermissionUtils.checkAuthPermission(str, 1, this.mContext, CheckAuthPermissionUtils.SupportMethod.READ_DATA, HealthEngineService.INSTANCE.getH5AppContext(this.mContext, this.mH5ProInstance));
        if (iCheckAuthPermission != 0) {
            LogUtil.c("ArkUIJsApi", "readData authPermission fail");
            callback.a(iCheckAuthPermission, str);
        } else {
            nql.d(str, isSportSequenceReadRequest(str) ? this.mReadSportDataProcess : this.mReadDataProcess, callback);
        }
    }

    @JavascriptInterface
    public void aggregateHealthData(long j, String str) {
        LogUtil.a("ArkUIJsApi", "callbackId ", Long.valueOf(j), " aggregateHealthData origin request = ", str);
        IBaseResponseCallback callback = getCallback(j);
        if (isAggregateSportStatData(str)) {
            nql.d(str, this.mAggregateSportSequenceDataProcess, callback);
        } else {
            callback.a(-1, "not support");
        }
    }

    private boolean isAggregateSportStatData(String str) {
        nqr nqrVar = (nqr) peh.b(str, nqr.class);
        if (nqrVar != null && nqrVar.a() != null && nqrVar.a().getmId() == 30001) {
            return true;
        }
        LogUtil.d("ArkUIJsApi", "isAggregateSportStatData false");
        return false;
    }

    private boolean isSportSequenceReadRequest(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(nqk.i)) {
            return false;
        }
        try {
            nrb nrbVar = (nrb) peh.b(str, nrb.class);
            if (nrbVar != null && nrbVar.l() != null) {
                int i = nrbVar.l().getmId();
                return i == 30001 || i == 33001;
            }
            return false;
        } catch (JsonParseException e) {
            LogUtil.c("ArkUIJsApi", "parse sport sequence request failed", e);
            return false;
        } catch (Exception e2) {
            LogUtil.c("ArkUIJsApi", "Unexpected error parsing sport sequence request", e2);
            return false;
        }
    }

    @JavascriptInterface
    public void aggregateData(long j, String str) {
        LogUtil.a("ArkUIJsApi", "aggregateData origin request = ", str);
        IBaseResponseCallback callback = getCallback(j);
        int iCheckAuthPermission = CheckAuthPermissionUtils.checkAuthPermission(str, 1, this.mContext, CheckAuthPermissionUtils.SupportMethod.AGGREGATE_DATA, HealthEngineService.INSTANCE.getH5AppContext(this.mContext, this.mH5ProInstance));
        if (iCheckAuthPermission != 0) {
            LogUtil.c("ArkUIJsApi", "aggregateData authPermission fail");
            callback.a(iCheckAuthPermission, str);
        } else if (str.contains(AGGREGATE_SPORT_KEY)) {
            nql.d(str, this.mAggregateSportDataProcess, getCallback(j));
        } else {
            nql.d(str, this.mAggregateDataProcess, getCallback(j));
        }
    }

    @JavascriptInterface
    public void readDataSource(long j, String str) {
        LogUtil.a("ArkUIJsApi", "readDataSource origin request = ", str);
        IBaseResponseCallback callback = getCallback(j);
        int iCheckAuthPermission = CheckAuthPermissionUtils.checkAuthPermission(str, 1, this.mContext, CheckAuthPermissionUtils.SupportMethod.READ_DATA_SOURCE, HealthEngineService.INSTANCE.getH5AppContext(this.mContext, this.mH5ProInstance));
        if (iCheckAuthPermission != 0) {
            LogUtil.c("ArkUIJsApi", "readDataSource authPermission fail");
            callback.a(iCheckAuthPermission, str);
        } else {
            nql.d(str, this.mReadDataSourceProcess, callback);
        }
    }

    @JavascriptInterface
    public void deleteData(long j, String str) {
        LogUtil.a("ArkUIJsApi", "deleteData origin request = ", str);
        IBaseResponseCallback callback = getCallback(j);
        int iCheckAuthPermission = CheckAuthPermissionUtils.checkAuthPermission(str, 2, this.mContext, CheckAuthPermissionUtils.SupportMethod.DELETE_DATA, HealthEngineService.INSTANCE.getH5AppContext(this.mContext, this.mH5ProInstance));
        if (iCheckAuthPermission != 0) {
            LogUtil.c("ArkUIJsApi", "deleteData authPermission fail");
            callback.a(iCheckAuthPermission, str);
        } else {
            nql.d(str, this.mDeleteDataProcess, callback);
        }
    }

    @JavascriptInterface
    public void saveData(long j, String str) {
        LogUtil.a("ArkUIJsApi", "saveData origin request = ", str, ", tid: ", Long.valueOf(Thread.currentThread().getId()));
        nql.d(str, this.mSaveDataProcess, getCallback(j));
    }

    @JavascriptInterface
    public void subscribeHealthData(long j, String str) {
        LogUtil.a("ArkUIJsApi", "subscribeHealthData origin request = ", str);
        IBaseResponseCallback callback = getCallback(j);
        int iCheckAuthPermission = CheckAuthPermissionUtils.checkAuthPermission(str, 1, this.mContext, CheckAuthPermissionUtils.SupportMethod.SUBSCRIBE_DATA, HealthEngineService.INSTANCE.getH5AppContext(this.mContext, this.mH5ProInstance));
        if (iCheckAuthPermission != 0) {
            LogUtil.c("ArkUIJsApi", "subscribeHealthData authPermission fail");
            callback.a(iCheckAuthPermission, str);
        } else {
            this.mParamList.add(str);
            LogUtil.a("ArkUIJsApi", "subscribeHealthData,request:", str);
            nql.d(str, this.mSubscribeDataProcess, callback);
        }
    }

    @JavascriptInterface
    public void unsubscribeHealthData(long j, String str) {
        LogUtil.a("ArkUIJsApi", "unsubscribeHealthData origin request = ", str);
        IBaseResponseCallback callback = getCallback(j);
        int iCheckAuthPermission = CheckAuthPermissionUtils.checkAuthPermission(str, 1, this.mContext, CheckAuthPermissionUtils.SupportMethod.UNSUBSCRIBE_DATA, HealthEngineService.INSTANCE.getH5AppContext(this.mContext, this.mH5ProInstance));
        if (iCheckAuthPermission != 0) {
            LogUtil.c("ArkUIJsApi", "unsubscribeHealthData authPermission fail");
            callback.a(iCheckAuthPermission, str);
        } else {
            this.mParamList.remove(str);
            LogUtil.a("ArkUIJsApi", "unsubscribeHealthData,request:", str);
            nql.d(str, this.mUnSubscribeDataProcess, callback);
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        LogUtil.a("ArkUIJsApi", "onDestroy,unsubscribeHealthData callback:", this.mParamList);
        IBaseResponseCallback iBaseResponseCallback = new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.ArkUIJsApi$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("ArkUIJsApi", "ArkUIJsApi onDestroy");
            }
        };
        Iterator<String> it = this.mParamList.iterator();
        while (it.hasNext()) {
            nql.d(it.next(), this.mUnSubscribeDataProcess, iBaseResponseCallback);
        }
        this.mParamList.clear();
        super.onDestroy();
    }

    private IBaseResponseCallback getCallback(final long j) {
        return new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.ArkUIJsApi$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1549x353ac326(j, i, obj);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getCallback$1$com-huawei-operation-h5pro-jsmodules-ArkUIJsApi, reason: not valid java name */
    /* synthetic */ void m1549x353ac326(long j, int i, Object obj) {
        if (i == 0) {
            onSuccessCallback(j, obj);
        } else {
            onFailureCallback(j, "", i);
        }
    }
}

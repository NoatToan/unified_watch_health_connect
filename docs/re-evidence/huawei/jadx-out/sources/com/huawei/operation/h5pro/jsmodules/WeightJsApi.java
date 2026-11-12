package com.huawei.operation.h5pro.jsmodules;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import defpackage.etv;
import defpackage.iun;
import defpackage.iuo;
import defpackage.ivd;
import defpackage.qpx;
import defpackage.xkb;
import health.compact.a.CommonUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class WeightJsApi extends JsBaseModule {
    private static final int AGDS_REQUESET_CODE = 7667714;
    private int mAgdsBiFrom;
    private long mAgdsCallbackId;
    private String mFaCardModuleName = FaCardAgdsApi.DIET_FA_CARD;

    @JavascriptInterface
    public void initUser(final long j) {
        ReleaseLogUtil.c(this.TAG, "initUser callbackId ", Long.valueOf(j));
        iun.c(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1589x3c602bd(j, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initUser$0$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1589x3c602bd(long j, int i, Object obj) {
        onSuccessCallback(j);
    }

    @JavascriptInterface
    public void setCurrentUser(String str) {
        ReleaseLogUtil.c(this.TAG, "setCurrentUser userId ", str);
        iun.j(str);
    }

    @JavascriptInterface
    public void getChildHeightUpdateTime(long j) {
        String strA = iun.a();
        ReleaseLogUtil.c(this.TAG, "getChildHeightUpdateTime timeMillis ", strA, " callbackId ", Long.valueOf(j));
        onSuccessCallback(j, strA);
    }

    @JavascriptInterface
    public void saveChildHeightUpdateTime() {
        ReleaseLogUtil.c(this.TAG, "saveChildHeightUpdateTime");
        iun.e();
    }

    @JavascriptInterface
    public void isSupportAiBodyShape(long j) {
        boolean zD = iun.d();
        ReleaseLogUtil.c(this.TAG, "isSupportAiBodyShape isSupport ", Boolean.valueOf(zD), " callbackId ", Long.valueOf(j));
        onSuccessCallback(j, Boolean.valueOf(zD));
    }

    @JavascriptInterface
    public void getPeerAnalysis(long j, String str) {
        LogUtil.a(this.TAG, "getPeerAnalysis param is ", str);
        if (str == null) {
            return;
        }
        onSuccessCallback(j, iun.a(str));
    }

    @JavascriptInterface
    public void getWeightUnit(long j) {
        LogUtil.a(this.TAG, "getWeightUnit start");
        onSuccessCallback(j, Integer.valueOf(UnitUtil.e()));
    }

    @JavascriptInterface
    public void saveWeightUnit(long j, String str) {
        LogUtil.a(this.TAG, "getWeightUnit start, callbackId ", Long.valueOf(j), " param ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("weightUnit")) {
                onFailureCallback(j, "JSONException");
            } else {
                UnitUtil.i(jSONObject.getInt("weightUnit"));
                onSuccessCallback(j);
            }
        } catch (JSONException unused) {
            LogUtil.e(this.TAG, "getMessage JSONException");
            onFailureCallback(j, "JSONException");
        }
    }

    @JavascriptInterface
    public void getWeightPageTimeRange(long j, String str) {
        ReleaseLogUtil.c(this.TAG, "getCurrentTimeRange ,callbackId ", Long.valueOf(j), " param ", str);
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(TypedValues.Custom.S_DIMENSION)) {
                ObserverManagerUtil.e("WEIGHT_DATA_CHANGE_TIME_TO_H5", Integer.valueOf(jSONObject.getInt(TypedValues.Custom.S_DIMENSION)));
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.b(this.TAG, "getWeightPageTimeRange JSONException");
        }
    }

    @JavascriptInterface
    public void getTrunkFatRateGrades(long j, String str) {
        LogUtil.a(this.TAG, "getTrunkFatRateGrades callbackId is ", Long.valueOf(j), " param ", str);
        if (str == null) {
            return;
        }
        String strE = iun.e(str);
        LogUtil.a(this.TAG, "getTrunkFatRateGrades grades is ", strE);
        onSuccessCallback(j, strE);
    }

    private void dialogCallback(long j, int i, int i2) {
        HashMap map = new HashMap(1);
        map.put("state", Integer.valueOf(i2));
        if (i != 0) {
            onFailureCallback(j, HiJsonUtil.d(map), i);
        } else {
            if (i2 == 0) {
                return;
            }
            onSuccessCallback(j, map);
        }
    }

    @JavascriptInterface
    public void showUserInfoDialog(long j) {
        boolean zO = iuo.o();
        ReleaseLogUtil.c(this.TAG, "showUserInfoDialog callbackId ", Long.valueOf(j), " mContext ", this.mContext, " isSupportShowUserInfoDialog ", Boolean.valueOf(zO));
        if (!zO) {
            dialogCallback(j, -1, -1);
        } else {
            showUserInfoDialogNoLimit(j);
        }
    }

    @JavascriptInterface
    public void showUserInfoDialogNoLimit(final long j) {
        ReleaseLogUtil.c(this.TAG, "showUserInfoDialogNoLimit callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.b(this.mContext, (ResponseCallback<Integer>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda10
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1599x806052d5(j, i, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUserInfoDialogNoLimit$1$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1599x806052d5(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showUserInfoDialog resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void showInputDialog(final long j) {
        ReleaseLogUtil.c(this.TAG, "showInputDialog callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.a(this.mContext, (ResponseCallback<Integer>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda13
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1595x2bc9709b(j, i, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showInputDialog$2$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1595x2bc9709b(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showInputDialog resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void showAutoUpdateWeightDialog(final long j) {
        ReleaseLogUtil.c(this.TAG, "showAutoUpdateWeightDialog callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.c(this.mContext, new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda8
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1592xb8987860(j, i, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showAutoUpdateWeightDialog$3$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1592xb8987860(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showAutoUpdateWeightDialog resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void showSetGoalDialog(final long j) {
        ReleaseLogUtil.c(this.TAG, "showSetGoalDialog callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.e(this.mContext, (ResponseCallback<Integer>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda3
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1596xb5c5cdee(j, i, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showSetGoalDialog$4$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1596xb5c5cdee(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showSetGoalDialog resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void showBindDeviceDialog(final long j) {
        ReleaseLogUtil.c(this.TAG, "showBindDeviceDialog callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.d(this.mContext, (ResponseCallback<Integer>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda2
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1593xe671717b(j, i, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showBindDeviceDialog$5$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1593xe671717b(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showBindDeviceDialog resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void showUserInfoDialogForMeasureStart(final long j) {
        ReleaseLogUtil.c(this.TAG, "showUserInfoDialogForMeasureStart callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.f(this.mContext, new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda6
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1598x836cb4fd(j, i, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUserInfoDialogForMeasureStart$6$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1598x836cb4fd(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showUserInfoDialogForMeasureStart resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void showUserInfoDialogForMeasureFinish(final long j) {
        ReleaseLogUtil.c(this.TAG, "showUserInfoDialogForMeasureFinish callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.j(this.mContext, new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1597xb8f2ab6b(j, i, (Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUserInfoDialogForMeasureFinish$7$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1597xb8f2ab6b(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showUserInfoDialogForMeasureFinish resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void showGoalMotivationDialog(final long j, String str) {
        JSONObject jSONObject;
        LogUtil.a(this.TAG, "showGoalMotivationDialog callbackId ", Long.valueOf(j), " param ", str, " mContext ", this.mContext);
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(this.TAG, "showGoalMotivationDialog exception ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(this.TAG, "showGoalMotivationDialog jsonObject is null");
            return;
        }
        iun.b(this.mContext, new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda5
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1594x6c550882(j, i, (Integer) obj);
            }
        }, (float) jSONObject.optDouble("bodyWeightDiff"), jSONObject.optInt("progress"), jSONObject.optString("weightTargetDifferences"));
    }

    /* JADX INFO: renamed from: lambda$showGoalMotivationDialog$8$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1594x6c550882(long j, int i, Integer num) {
        ReleaseLogUtil.c(this.TAG, "showGoalMotivationDialog resultCode ", Integer.valueOf(i), " state ", num);
        dialogCallback(j, i, num.intValue());
    }

    @JavascriptInterface
    public void initGoalMotivationCache(final long j) {
        ReleaseLogUtil.c(this.TAG, "initGoalMotivationCache callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.g(new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda14
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1588x30ff90a0(j, i, (WeightTargetDifferences) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initGoalMotivationCache$9$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1588x30ff90a0(long j, int i, WeightTargetDifferences weightTargetDifferences) {
        LogUtil.a(this.TAG, "initGoalMotivationCache onResponse differences ", weightTargetDifferences);
        onSuccessCallback(j, weightTargetDifferences);
    }

    @JavascriptInterface
    public void autoUpdateUserWeight(final long j, String str) {
        JSONObject jSONObject;
        LogUtil.a(this.TAG, "autoUpdateUserWeight callbackId ", Long.valueOf(j), " param ", str, " mContext ", this.mContext);
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(this.TAG, "autoUpdateUserWeight exception ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(this.TAG, "autoUpdateUserWeight jsonObject is null");
        } else {
            iun.e((float) jSONObject.optDouble("weight"), jSONObject.optLong("measureTime"), (ResponseCallback<Object>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m1586xc86f3b76(j, i, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$autoUpdateUserWeight$10$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1586xc86f3b76(long j, int i, Object obj) {
        LogUtil.a(this.TAG, "autoUpdateUserWeight status ", Integer.valueOf(i), " object ", obj);
        onSuccessCallback(j, obj);
    }

    @JavascriptInterface
    public void showBluetoothClaimDataDialog(long j) {
        ReleaseLogUtil.c(this.TAG, "showBluetoothClaimDataDialog callbackId ", Long.valueOf(j), " mContext ", this.mContext);
        iun.g();
        onSuccessCallback(j, "success");
    }

    @JavascriptInterface
    public void initCardRedDot() {
        ReleaseLogUtil.c(this.TAG, "initCardRedDot mContext ", this.mContext);
        iun.b();
    }

    @JavascriptInterface
    public void calculateGoal(final long j, String str) {
        LogUtil.a(this.TAG, "calculateGoal param ", str, " callbackId ", Long.valueOf(j));
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            bundle.putInt("age", CommonUtils.j(jSONObject.optString("age")));
            bundle.putInt(CommonConstant.KEY_GENDER, CommonUtils.j(jSONObject.optString(CommonConstant.KEY_GENDER)));
            bundle.putInt("height", CommonUtils.j(jSONObject.optString("height")));
            bundle.putDouble("weight", CommonUtils.a(jSONObject.optString("weight")));
            bundle.putDouble("targetWeight", CommonUtils.a(jSONObject.optString("targetWeight")));
            bundle.putInt("fatBurnChoice", CommonUtils.j(jSONObject.optString("fatBurnChoice")));
            bundle.putInt("weightManagerType", CommonUtils.j(jSONObject.optString("weightManagerType")));
            bundle.putBoolean("targetSettingChanged", jSONObject.optBoolean("targetSettingChanged"));
            bundle.putLong("modifiedTime", System.currentTimeMillis());
            bundle.putBoolean("isRefreshInitWeight", true);
            iun.b(bundle, (ResponseCallback<ivd>) new ResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda4
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m1587x97b98ad8(j, i, (ivd) obj);
                }
            });
        } catch (JSONException e) {
            String strC = ExceptionUtils.c(e);
            ReleaseLogUtil.b(this.TAG, "calculateGoal exception ", strC);
            onFailureCallback(j, strC);
        }
    }

    /* JADX INFO: renamed from: lambda$calculateGoal$12$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1587x97b98ad8(long j, int i, ivd ivdVar) {
        LogUtil.a(this.TAG, "calculateGoal onResponse errorCode ", Integer.valueOf(i), " weightManager ", ivdVar);
        if (i == 0) {
            onSuccessCallback(j, ivdVar);
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    xkb.a(System.currentTimeMillis());
                }
            });
        } else {
            onFailureCallback(j, HiJsonUtil.d(ivdVar));
        }
    }

    @JavascriptInterface
    public void openFaCardAgds(final long j, String str) {
        ReleaseLogUtil.c(this.TAG, "openFaCardAgds callbackId ", Long.valueOf(j), " param ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = (String) jSONObject.get("faCardModuleName");
            this.mFaCardModuleName = str2;
            this.mAgdsBiFrom = ((Integer) jSONObject.get("agdsBiFrom")).intValue();
            ReleaseLogUtil.c(this.TAG, "openFaCardAgds faCardModuleName: ", str2, ", mAgdsBiFrom: ", Integer.valueOf(this.mAgdsBiFrom));
            this.mAgdsCallbackId = j;
            FaCardAgdsApi faCardAgdsApiB = etv.b();
            if (faCardAgdsApiB == null) {
                ReleaseLogUtil.c(this.TAG, "openFaCardAgds faCardAgdsApi null:");
                onFailureCallback(j, "open faild");
            } else {
                faCardAgdsApiB.open(AGDS_REQUESET_CODE, str2, new FaCardAgdsApi.OpenAgdsResultCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda9
                    @Override // com.huawei.health.facardagds.FaCardAgdsApi.OpenAgdsResultCallback
                    public final void onResponse(int i) {
                        this.f$0.m1591x3daa0a2(j, i);
                    }
                });
            }
        } catch (JSONException e) {
            ReleaseLogUtil.b(this.TAG, "openFaCardAgds exception ", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: renamed from: lambda$openFaCardAgds$13$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1591x3daa0a2(long j, int i) {
        ReleaseLogUtil.c(this.TAG, "openFaCardAgds errorCode:", Integer.valueOf(i));
        if (i != 0) {
            onFailureCallback(j, "open faild");
        }
    }

    @JavascriptInterface
    public void notifyCheckUpdate(long j, String str) {
        JSONObject jSONObject;
        LogUtil.a(this.TAG, "notifyCheckUpdate callbackId ", Long.valueOf(j), " param ", str, " mContext ", this.mContext);
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.b(this.TAG, "notifyCheckUpdate exception ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.d(this.TAG, "notifyCheckUpdate jsonObject is null");
            return;
        }
        String strOptString = jSONObject.optString("uniqueId");
        String strOptString2 = jSONObject.optString("productId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            ReleaseLogUtil.d(this.TAG, "notifyCheckUpdate uniqueId or productId is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", strOptString);
        contentValues.put("productId", strOptString2);
        Intent intent = new Intent("action_start_check_scale");
        intent.putExtra("commonDeviceInfo", contentValues);
        BaseApplication.b().sendBroadcast(intent, LocalBroadcast.f36595c);
        onSuccessCallback(j, "success");
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.c(this.TAG, "openFaCardAgds requestCode: ", Integer.valueOf(i), "resultCode: ", Integer.valueOf(i2));
        FaCardAgdsApi faCardAgdsApiB = etv.b();
        if (faCardAgdsApiB == null) {
            ReleaseLogUtil.c(this.TAG, "openFaCardAgds faCardAgdsApi null:");
        }
        if (faCardAgdsApiB != null && i == AGDS_REQUESET_CODE) {
            int loadResultCode = faCardAgdsApiB.getLoadResultCode(intent);
            ReleaseLogUtil.c(this.TAG, "onActivityResult loadResultcode:", Integer.valueOf(loadResultCode));
            faCardAgdsApiB.addToDeskTopBi(intent, this.mAgdsBiFrom);
            if (loadResultCode == 3) {
                onFailureCallback(this.mAgdsCallbackId, "open faild", loadResultCode);
                qpx.e(BaseApplication.b(), R.string.wallet_unenable_country);
            } else {
                onSuccessCallback(this.mAgdsCallbackId, Integer.valueOf(loadResultCode));
            }
            faCardAgdsApiB.close();
        }
        if (faCardAgdsApiB == null || i != 100) {
            return;
        }
        if (i2 == faCardAgdsApiB.getResultcodeAgreeProtocol()) {
            faCardAgdsApiB.open(AGDS_REQUESET_CODE, this.mFaCardModuleName, new FaCardAgdsApi.OpenAgdsResultCallback() { // from class: com.huawei.operation.h5pro.jsmodules.WeightJsApi$$ExternalSyntheticLambda7
                @Override // com.huawei.health.facardagds.FaCardAgdsApi.OpenAgdsResultCallback
                public final void onResponse(int i3) {
                    this.f$0.m1590xf64d22a2(i3);
                }
            });
        } else if (i2 == faCardAgdsApiB.getResultcodeNotAgreeProtocol()) {
            ReleaseLogUtil.c(this.TAG, "openFaCardAgds NotAgreeProtocol");
        }
    }

    /* JADX INFO: renamed from: lambda$onActivityResult$14$com-huawei-operation-h5pro-jsmodules-WeightJsApi, reason: not valid java name */
    /* synthetic */ void m1590xf64d22a2(int i) {
        ReleaseLogUtil.c(this.TAG, "openFaCardAgds errorCode:", Integer.valueOf(i));
    }

    @JavascriptInterface
    public void closeFaCardAgds() {
        ReleaseLogUtil.c(this.TAG, "closeFaCardAgds");
        etv.b().close();
    }
}

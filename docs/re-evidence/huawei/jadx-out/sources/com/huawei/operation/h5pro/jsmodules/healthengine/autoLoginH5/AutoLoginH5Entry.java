package com.huawei.operation.h5pro.jsmodules.healthengine.autoLoginH5;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import defpackage.lpu;
import defpackage.qrs;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AutoLoginH5Entry extends JsBaseModule {
    private static final String RELEASE_TAG = "R_H5PRO_AutoLoginH5Entry";
    private static final String TAG = "H5PRO_AutoLoginH5Entry";

    @JavascriptInterface
    public void returnMessageToThirdApp(long j, String str) {
        LogUtil.i(TAG, "returnMessageToThirdApp");
        if (TextUtils.isEmpty(str)) {
            LogUtil.w(TAG, " params is null");
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.healthengine.autoLoginH5.AutoLoginH5Entry$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AutoLoginH5Entry.lambda$returnMessageToThirdApp$0();
            }
        });
        try {
            String strB = SharedPreferenceManager.b("HealthKit", "thirdUrlScheme", "");
            if (TextUtils.isEmpty(strB)) {
                ReleaseLogUtil.a(RELEASE_TAG, "returnMessageToThirdApp, thirdScheme is empty");
                onFailureCallback(j, "returnMessageToThirdApp, thirdScheme is empty");
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("code");
            Uri.Builder builderBuildUpon = Uri.parse(strB).buildUpon();
            if (!TextUtils.isEmpty(strOptString)) {
                ReleaseLogUtil.d(RELEASE_TAG, "returnMessageToThirdApp, auth success");
                builderBuildUpon.appendQueryParameter("code", strOptString);
            } else {
                ReleaseLogUtil.d(RELEASE_TAG, "returnMessageToThirdApp, auth fail");
                builderBuildUpon.appendQueryParameter("errorCode", String.valueOf(219));
            }
            String strOptString2 = jSONObject.optString("state");
            if (!TextUtils.isEmpty(strOptString2)) {
                builderBuildUpon.appendQueryParameter("state", strOptString2);
            }
            String string = builderBuildUpon.build().toString();
            LogUtil.i(TAG, "returnMessageToThirdApp, response thirdUrl: ", string);
            final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(string));
            intent.setFlags(268435456);
            if (this.mContext == null) {
                LogUtil.w(TAG, "context is null");
                return;
            }
            ResolveInfo resolveInfoResolveActivity = this.mContext.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                qrs.e(resolveInfoResolveActivity.activityInfo.packageName, this.mContext, resolveInfoResolveActivity.loadLabel(this.mContext.getPackageManager()).toString(), new View.OnClickListener() { // from class: com.huawei.operation.h5pro.jsmodules.healthengine.autoLoginH5.AutoLoginH5Entry$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.m1606x1bb4112c(intent, view);
                    }
                }, new View.OnClickListener() { // from class: com.huawei.operation.h5pro.jsmodules.healthengine.autoLoginH5.AutoLoginH5Entry$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.m1607xf9a7770b(view);
                    }
                });
                onSuccessCallback(j);
                return;
            }
            LogUtil.e(TAG, "Activity not found");
            onFailureCallback(j, "Activity not found");
            if (this.mContext instanceof Activity) {
                ((Activity) this.mContext).finish();
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, "JSONException -> " + e.getMessage());
            onFailureCallback(j, "Param parse fails");
            if (this.mContext instanceof Activity) {
                ((Activity) this.mContext).finish();
            }
        }
    }

    static /* synthetic */ void lambda$returnMessageToThirdApp$0() {
        String strB = SharedPreferenceManager.b("HealthKit", "clientId", "");
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.e(RELEASE_TAG, "returnMessageToThirdApp, clientId is empty");
        } else {
            lpu.b(strB);
        }
    }

    /* JADX INFO: renamed from: lambda$returnMessageToThirdApp$1$com-huawei-operation-h5pro-jsmodules-healthengine-autoLoginH5-AutoLoginH5Entry, reason: not valid java name */
    /* synthetic */ void m1606x1bb4112c(Intent intent, View view) {
        qrs.b(this.mContext, intent);
        if (this.mContext instanceof Activity) {
            ((Activity) this.mContext).finish();
        }
    }

    /* JADX INFO: renamed from: lambda$returnMessageToThirdApp$2$com-huawei-operation-h5pro-jsmodules-healthengine-autoLoginH5-AutoLoginH5Entry, reason: not valid java name */
    /* synthetic */ void m1607xf9a7770b(View view) {
        if (this.mContext instanceof Activity) {
            ((Activity) this.mContext).finish();
        }
    }
}

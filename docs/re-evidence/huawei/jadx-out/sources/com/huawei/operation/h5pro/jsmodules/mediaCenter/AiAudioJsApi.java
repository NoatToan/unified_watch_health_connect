package com.huawei.operation.h5pro.jsmodules.mediaCenter;

import android.webkit.JavascriptInterface;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.fam;
import defpackage.ofe;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AiAudioJsApi extends JsBaseModule {
    private static final String TAG = "AiAudioJsApi";

    @JavascriptInterface
    public void getAlAudioData(long j) {
        String strC = ofe.c(fam.d().b().getBody(fam.d().e((String) null, (String) null)));
        LogUtil.a(TAG, "getAlAudioData: ", strC);
        onSuccessCallback(j, strC);
    }

    @JavascriptInterface
    public void generateAiAudio(final long j, final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.AiAudioJsApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m1609x649991d8(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$generateAiAudio$1$com-huawei-operation-h5pro-jsmodules-mediaCenter-AiAudioJsApi, reason: not valid java name */
    /* synthetic */ void m1609x649991d8(String str, final long j) throws Throwable {
        String strOptString;
        LogUtil.a(TAG, "generateAiAudio : ", str);
        String strOptString2 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("randomId", null);
            try {
                strOptString2 = jSONObject.optString(ParsedFieldTag.KAKA_TASK_SCENARIO, null);
            } catch (JSONException unused) {
                LogUtil.a(TAG, "JSONException");
            }
        } catch (JSONException unused2) {
            strOptString = "";
        }
        fam.d().d(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.AiAudioJsApi$$ExternalSyntheticLambda5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1608x710a0d97(j, i, obj);
            }
        }, strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: lambda$generateAiAudio$0$com-huawei-operation-h5pro-jsmodules-mediaCenter-AiAudioJsApi, reason: not valid java name */
    /* synthetic */ void m1608x710a0d97(long j, int i, Object obj) {
        if (i != 0) {
            onFailureCallback(j, "generate fail");
        } else {
            onSuccessCallback(j, obj);
        }
    }

    @JavascriptInterface
    public void onRefreshAudioInfo(final long j, String str) {
        LogUtil.a(TAG, "onAiAudioChange: ", str);
        String strOptString = null;
        try {
            strOptString = new JSONObject(str).optString("audioId", null);
        } catch (JSONException unused) {
            LogUtil.a(TAG, "JSONException");
        }
        fam.d().c(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.AiAudioJsApi$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1610x1c31e8a2(j, i, obj);
            }
        }, strOptString, true);
    }

    /* JADX INFO: renamed from: lambda$onRefreshAudioInfo$2$com-huawei-operation-h5pro-jsmodules-mediaCenter-AiAudioJsApi, reason: not valid java name */
    /* synthetic */ void m1610x1c31e8a2(long j, int i, Object obj) {
        if (i != 0) {
            onFailureCallback(j, "refreshAiAudio fail");
        } else {
            onSuccessCallback(j, obj);
        }
    }

    @JavascriptInterface
    public void playControl(final long j, String str) throws Throwable {
        LogUtil.a(TAG, "playControl: ", str);
        String strOptString = null;
        int iOptInt = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("audioId", null);
            iOptInt = jSONObject.optInt("control", -1);
        } catch (JSONException unused) {
            LogUtil.a(TAG, "JSONException");
        }
        fam.d().e(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.AiAudioJsApi$$ExternalSyntheticLambda2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1611xcd24f60a(j, i, obj);
            }
        }, strOptString, iOptInt);
    }

    /* JADX INFO: renamed from: lambda$playControl$3$com-huawei-operation-h5pro-jsmodules-mediaCenter-AiAudioJsApi, reason: not valid java name */
    /* synthetic */ void m1611xcd24f60a(long j, int i, Object obj) {
        if (i != 0) {
            onFailureCallback(j, "playControl fail");
        } else {
            onSuccessCallback(j, obj);
        }
    }

    @JavascriptInterface
    public void stopPlayback(final long j, final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.AiAudioJsApi$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m1613xfcd38e5a(str, j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$stopPlayback$5$com-huawei-operation-h5pro-jsmodules-mediaCenter-AiAudioJsApi, reason: not valid java name */
    /* synthetic */ void m1613xfcd38e5a(String str, final long j) throws Throwable {
        LogUtil.a(TAG, "stopPlayback: ", str);
        String strOptString = null;
        try {
            strOptString = new JSONObject(str).optString("audioId", null);
        } catch (JSONException unused) {
            LogUtil.a(TAG, "JSONException");
        }
        fam.d().c(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.mediaCenter.AiAudioJsApi$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1612x9440a19(j, i, obj);
            }
        }, strOptString);
    }

    /* JADX INFO: renamed from: lambda$stopPlayback$4$com-huawei-operation-h5pro-jsmodules-mediaCenter-AiAudioJsApi, reason: not valid java name */
    /* synthetic */ void m1612x9440a19(long j, int i, Object obj) {
        if (i != 0) {
            onFailureCallback(j, "stopPlayback fail");
        } else {
            onSuccessCallback(j, obj);
        }
    }
}

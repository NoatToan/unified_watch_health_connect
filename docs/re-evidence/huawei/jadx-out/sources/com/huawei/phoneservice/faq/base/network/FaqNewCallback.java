package com.huawei.phoneservice.faq.base.network;

import android.app.Activity;
import com.google.gson.Gson;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.phoneservice.faq.base.util.k;
import defpackage.zcp;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FaqNewCallback<T> extends Callback<ResponseBody> {
    private WeakReference<Activity> activityWeak;
    private final Class<T> clazz;
    private Gson gson;

    public abstract void onResult(Throwable th, T t);

    @Override // com.huawei.hms.network.httpclient.Callback
    public void onResponse(Submit<ResponseBody> submit, Response<ResponseBody> response) throws IOException {
        zcp.c(submit, "");
        zcp.c(response, "");
        String strByte2Str = StringUtils.byte2Str(response.getBody().bytes());
        try {
            String string = null;
            if (k.b(strByte2Str)) {
                zcp.e(null, "");
            } else {
                JSONObject jSONObject = new JSONObject(strByte2Str);
                String strOptString = jSONObject.optString("responseDesc");
                int iOptInt = jSONObject.optInt("responseCode");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("responseData");
                int iOptInt2 = jSONObject.optInt("code");
                String strOptString2 = jSONObject.optString("msg");
                if (iOptInt != 200) {
                    if (iOptInt2 != 0) {
                        onFailureCallback(new FaqWebServiceException(iOptInt2, strOptString2));
                        return;
                    } else {
                        onFailureCallback(new FaqWebServiceException(iOptInt, strOptString));
                        return;
                    }
                }
                if (jSONObjectOptJSONObject != null) {
                    string = jSONObjectOptJSONObject.toString();
                }
            }
            onResponse(string);
        } catch (Exception e) {
            onFailureCallback(e);
        }
    }

    @Override // com.huawei.hms.network.httpclient.Callback
    public void onFailure(Submit<ResponseBody> submit, Throwable th) {
        zcp.c(submit, "");
        zcp.c(th, "");
        try {
            onFailureCallback(th);
        } catch (Throwable th2) {
            com.huawei.phoneservice.faq.base.util.g.b("FaqNewCallback", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResponse$lambda$0(FaqNewCallback faqNewCallback, String str) {
        zcp.c(faqNewCallback, "");
        faqNewCallback.doResult(str);
    }

    private final void onResponse(final String str) {
        WeakReference<Activity> weakReference = this.activityWeak;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.phoneservice.faq.base.network.f
                @Override // java.lang.Runnable
                public final void run() {
                    FaqNewCallback.onResponse$lambda$0(this.f21571c, str);
                }
            });
        } else {
            doResult(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFailureCallback$lambda$1(FaqNewCallback faqNewCallback, Throwable th) {
        zcp.c(faqNewCallback, "");
        faqNewCallback.onResult(th, null);
    }

    private final void onFailureCallback(final Throwable th) {
        WeakReference<Activity> weakReference = this.activityWeak;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.phoneservice.faq.base.network.c
                @Override // java.lang.Runnable
                public final void run() {
                    FaqNewCallback.onFailureCallback$lambda$1(this.d, th);
                }
            });
        } else {
            onResult(th, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void doResult(String str) {
        try {
            onResult(null, this.gson.fromJson(str, (Class) this.clazz));
        } catch (Throwable th) {
            onResult(th, null);
            com.huawei.phoneservice.faq.base.util.g.b("doResult", th);
        }
    }

    public FaqNewCallback(Class<T> cls, Activity activity) {
        zcp.c(cls, "");
        this.clazz = cls;
        this.gson = new Gson();
        this.activityWeak = new WeakReference<>(activity);
    }
}

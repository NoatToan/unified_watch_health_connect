package com.huawei.phoneservice.faq.base.network;

import android.app.Activity;
import com.google.gson.Gson;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.phoneservice.faq.base.util.k;
import defpackage.zcp;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FaqCallback<T> implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f21552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Gson f21553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f21554c;

    public abstract void onResult(Throwable th, T t);

    @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
    public void onResponse(Submit submit, Response response) throws IOException {
        zcp.c(submit, "");
        zcp.c(response, "");
        String strByte2Str = StringUtils.byte2Str(response.getBody().bytes());
        try {
            String string = null;
            if (k.b(strByte2Str)) {
                zcp.e(null, "");
            } else {
                JSONObject jSONObject = new JSONObject(strByte2Str);
                int iOptInt = jSONObject.optInt("responseCode");
                String strOptString = jSONObject.optString("responseDesc");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("responseData");
                int iOptInt2 = jSONObject.optInt("code");
                String strOptString2 = jSONObject.optString("msg");
                if (iOptInt != 200) {
                    if (iOptInt2 != 0) {
                        a(response, new FaqWebServiceException(iOptInt2, strOptString2));
                        return;
                    } else {
                        a(response, new FaqWebServiceException(iOptInt, strOptString));
                        return;
                    }
                }
                if (jSONObjectOptJSONObject != null) {
                    string = jSONObjectOptJSONObject.toString();
                }
            }
            a(response, string);
        } catch (Exception e) {
            a(response, e);
        }
    }

    @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
    public void onFailure(Submit submit, Throwable th) {
        zcp.c(submit, "");
        zcp.c(th, "");
        try {
            a((Response) null, th);
        } catch (Throwable th2) {
            com.huawei.phoneservice.faq.base.util.g.b("FaqCallback", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(String str) {
        try {
            onResult(null, this.f21553b.fromJson(str, (Class) this.f21552a));
        } catch (Throwable th) {
            onResult(th, null);
            com.huawei.phoneservice.faq.base.util.g.b("doResult", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FaqCallback faqCallback, Throwable th) {
        zcp.c(faqCallback, "");
        faqCallback.onResult(th, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FaqCallback faqCallback, String str) {
        zcp.c(faqCallback, "");
        faqCallback.a(str);
    }

    private final void a(Response response, final Throwable th) {
        WeakReference<Activity> weakReference = this.f21554c;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.phoneservice.faq.base.network.d
                @Override // java.lang.Runnable
                public final void run() {
                    FaqCallback.a(this.e, th);
                }
            });
        } else {
            onResult(th, null);
        }
    }

    private final void a(Response response, final String str) {
        WeakReference<Activity> weakReference = this.f21554c;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.phoneservice.faq.base.network.e
                @Override // java.lang.Runnable
                public final void run() {
                    FaqCallback.a(this.f21569b, str);
                }
            });
        } else {
            a(str);
        }
    }

    public FaqCallback(Class<T> cls, Activity activity) {
        zcp.c(cls, "");
        this.f21552a = cls;
        this.f21553b = new Gson();
        this.f21554c = new WeakReference<>(activity);
    }
}

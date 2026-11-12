package com.huawei.health.h5pro.jsbridge.system.eventhub;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class EventHubEntry extends JsBaseModule {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, List<Long>> f6794c = new HashMap<>();

    private String e(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.w(this.TAG, "getEventName: params is empty");
            onFailureCallback(j, "params is empty");
            return "";
        }
        if (!H5ProEventHubManager.isAllowedUseApi(this.mH5ProInstance)) {
            LogUtil.w(this.TAG, "getEventName: API usage is not allowed");
            onFailureCallback(j, "API usage is not allowed");
            return "";
        }
        try {
            return new JSONObject(str).optString("eventName", "");
        } catch (JSONException e) {
            LogUtil.e(this.TAG, b.a(e, new StringBuilder("getEventName: exception -> ")));
            onFailureCallback(j, e.getMessage());
            return "";
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
    }

    @JavascriptInterface
    public void once(final long j, String str) {
        LogUtil.i(this.TAG, "once: enter");
        final String strE = e(j, str);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        H5ProEventHubManager.addOnceObserver(strE, new H5ProEventHubObserver() { // from class: com.huawei.health.h5pro.jsbridge.system.eventhub.EventHubEntry.5
            @Override // com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubObserver
            public void onEventChanged(String str2) {
                LogUtil.i(EventHubEntry.this.TAG, "once: onEventChanged -> " + strE);
                EventHubEntry.this.onSuccessCallback(j, str2);
            }
        });
    }

    @JavascriptInterface
    public void subscribe(final long j, String str) {
        LogUtil.i(this.TAG, "subscribe: enter");
        final String strE = e(j, str);
        if (TextUtils.isEmpty(strE)) {
            onCompleteCallback(j, str, -1);
            return;
        }
        List<Long> arrayList = this.f6794c.containsKey(strE) ? this.f6794c.get(strE) : null;
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.f6794c.put(strE, arrayList);
        }
        arrayList.add(Long.valueOf(j));
        H5ProEventHubManager.addObserver(strE, new H5ProEventHubObserver() { // from class: com.huawei.health.h5pro.jsbridge.system.eventhub.EventHubEntry.2
            @Override // com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubObserver
            public void onEventChanged(String str2) {
                LogUtil.i(EventHubEntry.this.TAG, "subscribe: onEventChanged -> " + strE);
                EventHubEntry.this.onSuccessCallback(j, str2);
            }
        });
    }

    @JavascriptInterface
    public void trigger(long j, String str) {
        LogUtil.i(this.TAG, "trigger: enter");
        String strE = e(j, str);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        Pair<Boolean, String> pairTrigger = H5ProEventHubManager.trigger(strE, str);
        if (((Boolean) pairTrigger.first).booleanValue()) {
            onSuccessCallback(j);
        } else {
            onFailureCallback(j, (String) pairTrigger.second);
        }
    }

    @JavascriptInterface
    public void unsubscribe(long j, String str) {
        LogUtil.i(this.TAG, "unsubscribe: enter");
        String strE = e(j, str);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        H5ProEventHubManager.removeObserver(strE);
        List<Long> list = this.f6794c.get(strE);
        if (list != null && !list.isEmpty()) {
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                onCompleteCallback(it.next().longValue(), "", 0);
            }
        }
        this.f6794c.remove(strE);
        onSuccessCallback(j);
    }
}

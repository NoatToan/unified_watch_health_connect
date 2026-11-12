package com.huawei.health.h5pro.load;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.jsbridge.system.prerequest.PreRequestEntry;
import com.huawei.health.h5pro.jsbridge.system.prerequest.PreResult;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class JsInterfacePreRequestTask implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<H5ProInstance> f6963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6964c;
    private WeakReference<PreRequestEntry> e;

    public JsInterfacePreRequestTask(String str, Context context, H5ProInstance h5ProInstance, PreRequestEntry preRequestEntry) {
        this.f6964c = str;
        this.f6962a = context != null ? context.getApplicationContext() : null;
        this.f6963b = new WeakReference<>(h5ProInstance);
        this.e = new WeakReference<>(preRequestEntry);
    }

    private String a() {
        return LogUtil.getTag(this.f6964c, "JsInterfacePreRequestTask");
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtil.i(a(), "enter");
        if (this.f6962a == null) {
            LogUtil.w("JsInterfacePreRequestTask", "appContext is null");
            return;
        }
        H5ProInstance h5ProInstance = this.f6963b.get();
        if (h5ProInstance == null) {
            LogUtil.w(a(), "h5ProInstance is null");
            return;
        }
        final PreRequestEntry preRequestEntry = this.e.get();
        if (preRequestEntry == null) {
            LogUtil.w(a(), "launchOptionEntry is null");
        }
        final Map<Long, JsInterfacePreRequestObj> preRequestList = JsInterfacePreRequestUtils.getPreRequestList(this.f6962a, this.f6964c, h5ProInstance.getPath(), h5ProInstance.readPreRequestsJson());
        if (CommonUtil.isMapEmpty(preRequestList)) {
            return;
        }
        final H5ProJsCbkInvoker<Object> jsCbkInvoker = h5ProInstance.getJsCbkInvoker();
        if (jsCbkInvoker instanceof H5ProBridgeManager.CbkInvoker) {
            ((H5ProBridgeManager.CbkInvoker) jsCbkInvoker).registerCustomCallback(new H5ProCustomJsInterfaceCbk() { // from class: com.huawei.health.h5pro.load.JsInterfacePreRequestTask.1
                @Override // com.huawei.health.h5pro.load.H5ProCustomJsInterfaceCbk
                public void onCallback(long j, Object obj) {
                    JsInterfacePreRequestObj jsInterfacePreRequestObj = (JsInterfacePreRequestObj) preRequestList.get(Long.valueOf(j));
                    if (preRequestEntry == null || jsInterfacePreRequestObj == null) {
                        return;
                    }
                    PreResult preResult = obj instanceof JSONObject ? new PreResult(jsInterfacePreRequestObj.getRequestTime(), new Gson().fromJson(obj.toString(), JsonObject.class)) : new PreResult(jsInterfacePreRequestObj.getRequestTime(), obj);
                    String requestKey = jsInterfacePreRequestObj.getRequestKey();
                    if (preRequestEntry.putPreRequestResult(requestKey, preResult)) {
                        jsCbkInvoker.invokeJsFunc("window.nativeEvent", requestKey, preResult.getData());
                    }
                }
            });
            for (Long l : preRequestList.keySet()) {
                H5ProBridgeManager.getInstance().preExecute(h5ProInstance, l.longValue(), preRequestList.get(l));
            }
        }
    }
}

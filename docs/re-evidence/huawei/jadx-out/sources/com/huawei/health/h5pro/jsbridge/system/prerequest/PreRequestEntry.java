package com.huawei.health.h5pro.jsbridge.system.prerequest;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class PreRequestEntry extends JsBaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, PreResult> f6875b = new HashMap(3);
    private Set<String> d = new HashSet();

    @JavascriptInterface
    public void clearAll() {
        synchronized (this) {
            LogUtil.i(this.TAG, "clearAll enter");
            if (CommonUtil.isMapEmpty(this.f6875b)) {
                return;
            }
            this.f6875b.clear();
            this.d.clear();
        }
    }

    @JavascriptInterface
    public void clearPreResult(String str) {
        synchronized (this) {
            LogUtil.i(this.TAG, "clearPreResult enter");
            if (TextUtils.isEmpty(str)) {
                LogUtil.w(this.TAG, "clearPreResult: requestKey is null");
            } else if (CommonUtil.isMapEmpty(this.f6875b)) {
                LogUtil.w(this.TAG, "clearPreResult: preResult is null");
            } else {
                this.d.add(str);
                this.f6875b.remove(str);
            }
        }
    }

    @JavascriptInterface
    public String getAllPreResults() {
        synchronized (this) {
            LogUtil.i(this.TAG, "getAllPreResults enter");
            if (CommonUtil.isMapEmpty(this.f6875b)) {
                LogUtil.w(this.TAG, "getAllPreResults: preResult is null");
                return "";
            }
            if (!this.d.isEmpty()) {
                Iterator<String> it = this.d.iterator();
                while (it.hasNext()) {
                    this.f6875b.remove(it.next());
                }
            }
            if (CommonUtil.isMapEmpty(this.f6875b)) {
                LogUtil.w(this.TAG, "getAllPreResults: preResult is null");
                return "";
            }
            return GsonUtil.contentValueToJson(this.f6875b);
        }
    }

    @JavascriptInterface
    public String getPreResult(String str) {
        synchronized (this) {
            LogUtil.i(this.TAG, "getPreResult enter");
            if (TextUtils.isEmpty(str)) {
                LogUtil.w(this.TAG, "getPreResult: requestKey is null");
                return "";
            }
            if (CommonUtil.isMapEmpty(this.f6875b)) {
                LogUtil.w(this.TAG, "getPreResult: preResultCache is null");
                return "";
            }
            if (this.d.contains(str)) {
                LogUtil.w(this.TAG, "getPreResult: preResultCache deleted");
                return "";
            }
            PreResult preResult = this.f6875b.get(str);
            if (preResult == null) {
                LogUtil.w(this.TAG, "getPreResult: preResult is null");
                return "";
            }
            return GsonUtil.contentValueToJson(preResult);
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        clearAll();
    }

    public boolean putPreRequestResult(String str, PreResult preResult) {
        synchronized (this) {
            LogUtil.i(this.TAG, a.a("putPreRequestResult enter: ", str));
            if (this.d.contains(str)) {
                return false;
            }
            this.f6875b.put(str, preResult);
            return true;
        }
    }
}

package com.huawei.health.h5pro.jsbridge.system.uikit;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class UiKitEntry extends JsBaseModule {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UiKit f6941c;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.f6941c = new AndroidUiKit(this.mContext);
    }

    @JavascriptInterface
    public void pickData(final long j, String str) {
        String[] strArr = null;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("dataList");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                strArr = new String[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    strArr[i] = jSONArrayOptJSONArray.getString(i);
                }
                this.f6941c.pickData(strArr, new DataCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.uikit.UiKitEntry.4
                    @Override // com.huawei.health.h5pro.jsbridge.system.uikit.DataCallback
                    public void onSelected(int i2) {
                        UiKitEntry.this.onSuccessCallback(j, Integer.valueOf(i2));
                    }

                    @Override // com.huawei.health.h5pro.jsbridge.system.uikit.DataCallback
                    public void onUnselected() {
                        UiKitEntry.this.onFailureCallback(j, "unselected");
                    }
                });
                return;
            }
            onFailureCallback(j, "param invalid");
        } catch (Exception e) {
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void pickDate(final long j) {
        this.f6941c.pickDate(new DateCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.uikit.UiKitEntry.2
            @Override // com.huawei.health.h5pro.jsbridge.system.uikit.DateCallback
            public void onSelected(int i, int i2, int i3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("year", i);
                    jSONObject.put("month", i2 + 1);
                    jSONObject.put("day", i3);
                    UiKitEntry.this.onSuccessCallback(j, jSONObject.toString());
                } catch (JSONException e) {
                    UiKitEntry.this.onFailureCallback(j, e.getMessage());
                }
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.uikit.DateCallback
            public void onUnselected() {
                UiKitEntry.this.onFailureCallback(j, "unselected");
            }
        });
    }

    @JavascriptInterface
    public void pickTime(final long j) {
        this.f6941c.pickTime(new TimeCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.uikit.UiKitEntry.1
            @Override // com.huawei.health.h5pro.jsbridge.system.uikit.TimeCallback
            public void onSelected(int i, int i2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hour", i);
                    jSONObject.put("minute", i2);
                    UiKitEntry.this.onSuccessCallback(j, jSONObject.toString());
                } catch (JSONException e) {
                    UiKitEntry.this.onFailureCallback(j, e.getMessage());
                }
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.uikit.TimeCallback
            public void onUnselected() {
                UiKitEntry.this.onFailureCallback(j, "unselected");
            }
        });
    }
}

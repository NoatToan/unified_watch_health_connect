package com.huawei.health.h5pro.jsbridge.system.util;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class UtilEntry extends JsBaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorManagerApi f6954a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Util f6955c;
    private AudioManagerApi e;

    private AudioManagerApi.AudioVolumeListener c(final long j) {
        return new AudioManagerApi.AudioVolumeListener() { // from class: com.huawei.health.h5pro.jsbridge.system.util.UtilEntry.2
            @Override // com.huawei.health.h5pro.jsbridge.system.util.AudioManagerApi.AudioVolumeListener
            public void onFailure(int i, String str) {
                LogUtil.e(UtilEntry.this.TAG, "getAudioVolumeListener: exception(onFailure) -> " + i + " - " + str);
                UtilEntry.this.onFailureCallback(j, str, i);
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.util.AudioManagerApi.AudioVolumeListener
            public void onSuccess(int i, int i2, int i3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("volume", i);
                    jSONObject.put("maxVolume", i2);
                    jSONObject.put("minVolume", i3);
                    UtilEntry.this.onSuccessCallback(j, jSONObject);
                } catch (JSONException e) {
                    LogUtil.e(UtilEntry.this.TAG, b.a(e, new StringBuilder("getAudioVolumeListener: exception(onSuccess) -> ")));
                    UtilEntry.this.onFailureCallback(j, e.getMessage());
                }
            }
        };
    }

    @JavascriptInterface
    public void deviceInfo(long j) {
        JSONObject jSONObjectDeviceInfo = this.f6955c.deviceInfo(this.mContext);
        if (jSONObjectDeviceInfo != null) {
            onSuccessCallback(j, jSONObjectDeviceInfo);
        } else {
            onFailureCallback(j, "fail to get device info");
        }
    }

    @JavascriptInterface
    public void getAudioVolume(long j, String str) {
        try {
            String strOptString = new JSONObject(str).optString("audioType");
            if (this.e == null) {
                this.e = new AudioManagerApi(this.mContext);
            }
            this.e.d(strOptString, c(j));
        } catch (JSONException e) {
            LogUtil.e(this.TAG, b.a(e, new StringBuilder("getAudioVolume: exception(param) -> ")));
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void getLaunchTime(long j) {
        H5ProInstance h5ProInstance = this.mH5ProInstance;
        if (h5ProInstance != null) {
            onSuccessCallback(j, Long.valueOf(h5ProInstance.getLaunchTime()));
        } else {
            onFailureCallback(j, "H5ProInstance is null");
        }
    }

    @JavascriptInterface
    public boolean isAppInstalled(String str) {
        return this.f6955c.isAppInstalled(this.mContext, str);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        this.f6955c = new UtilImpl(this.mH5ProInstance);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        unregisterSensorListener();
        AudioManagerApi audioManagerApi = this.e;
        if (audioManagerApi != null) {
            audioManagerApi.d();
            this.e = null;
        }
        super.onDestroy();
    }

    @JavascriptInterface
    public void openSystemSettings(long j, String str) {
        if (TextUtils.isEmpty(str) || this.mContext == null) {
            onFailureCallback(j, "invalid param");
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString("action");
            if (TextUtils.isEmpty(strOptString)) {
                onFailureCallback(j, "openSystemSettings fail:param invalid");
                return;
            }
            try {
                Intent intent = new Intent(strOptString);
                if (TextUtils.equals(strOptString, "android.settings.APPLICATION_DETAILS_SETTINGS")) {
                    intent.setData(Uri.fromParts("package", this.mContext.getApplicationContext().getPackageName(), null));
                }
                this.mContext.startActivity(intent);
                onSuccessCallback(j);
            } catch (ActivityNotFoundException unused) {
                onFailureCallback(j, "Activity not found");
            }
        } catch (JSONException unused2) {
            onFailureCallback(j, "openSystemSettings fail:param invalid");
        }
    }

    @JavascriptInterface
    public void registerAudioVolumeChangeListener(long j, String str) {
        try {
            String strOptString = new JSONObject(str).optString("audioType");
            if (this.e == null) {
                this.e = new AudioManagerApi(this.mContext);
            }
            this.e.b(strOptString, c(j));
        } catch (JSONException e) {
            LogUtil.e(this.TAG, b.a(e, new StringBuilder("registerAudioVolumeChangeListener: exception(param) -> ")));
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void registerSensorListener(final long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("sensorType");
            String strOptString2 = jSONObject.optString("samplingPeriodUs", SensorManagerApi.SamplingPeriodUs.SENSOR_DELAY_UI.name());
            if (this.f6954a == null) {
                this.f6954a = new SensorManagerApi(this.mContext);
            }
            this.f6954a.a(strOptString, strOptString2, new SensorManagerApi.SensorDataCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.util.UtilEntry.1
                @Override // com.huawei.health.h5pro.jsbridge.system.util.SensorManagerApi.SensorDataCallback
                public void onComplete() {
                    LogUtil.i(UtilEntry.this.TAG, "registerSensorListener: onComplete");
                    UtilEntry.this.onCompleteCallback(j, "onComplete", 1);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.util.SensorManagerApi.SensorDataCallback
                public void onFailure(int i, String str2) {
                    LogUtil.w(UtilEntry.this.TAG, i + " <- errorCode - registerSensorListener - errorMsg -> " + str2);
                    UtilEntry.this.onFailureCallback(j, str2, i);
                }

                @Override // com.huawei.health.h5pro.jsbridge.system.util.SensorManagerApi.SensorDataCallback
                public void onSuccess(JSONObject jSONObject2) {
                    UtilEntry.this.onSuccessCallback(j, jSONObject2);
                }
            });
        } catch (JSONException e) {
            LogUtil.e(this.TAG, b.a(e, new StringBuilder("getSensorData: exception(param) -> ")));
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void setAudioVolume(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("audioType");
            int iOptInt = jSONObject.optInt("audioVolume", 0);
            if (this.e == null) {
                this.e = new AudioManagerApi(this.mContext);
            }
            this.e.d(strOptString, iOptInt, c(j));
        } catch (JSONException e) {
            LogUtil.e(this.TAG, b.a(e, new StringBuilder("setAudioVolume: exception(param) -> ")));
            onFailureCallback(j, e.getMessage());
        }
    }

    @JavascriptInterface
    public void unregisterSensorListener() {
        SensorManagerApi sensorManagerApi = this.f6954a;
        if (sensorManagerApi != null) {
            sensorManagerApi.d();
        }
        this.f6954a = null;
    }
}

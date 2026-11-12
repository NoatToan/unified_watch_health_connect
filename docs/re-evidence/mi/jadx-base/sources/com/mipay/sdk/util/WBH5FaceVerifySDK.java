package com.mipay.sdk.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.xiaomi.onetrack.util.z;

/* JADX INFO: loaded from: classes.dex */
public class WBH5FaceVerifySDK {
    private static final String TAG = "WBH5FaceVerifySDK";
    private static final int VIDEO_REQUEST = 17;
    private static WBH5FaceVerifySDK instance;
    private ValueCallback<Uri[]> mUploadCallbackAboveL;
    private ValueCallback<Uri> mUploadMessage;

    private WBH5FaceVerifySDK() {
    }

    public static synchronized WBH5FaceVerifySDK getInstance() {
        try {
            if (instance == null) {
                instance = new WBH5FaceVerifySDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    private void recordVideo(Activity activity) {
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", 1);
            intent.addFlags(1);
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            activity.startActivityForResult(intent, 17);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isFaceUrl(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("https://miniprogram-kyc.tencentcloudapi.com");
    }

    public boolean isTencentH5FaceVerify(WebView webView, WebChromeClient.FileChooserParams fileChooserParams, String str) {
        if ("video/kyc".equals(str) || "video/webank".equals(str)) {
            return true;
        }
        if (fileChooserParams != null && fileChooserParams.getAcceptTypes() != null && fileChooserParams.getAcceptTypes().length > 0 && ("video/kyc".equals(fileChooserParams.getAcceptTypes()[0]) || "video/webank".equals(fileChooserParams.getAcceptTypes()[0]))) {
            return true;
        }
        if (webView == null || TextUtils.isEmpty(webView.getUrl())) {
            return false;
        }
        return isTencentH5FaceVerify(webView.getUrl());
    }

    public boolean receiveH5FaceVerifyResult(int i, int i2, Intent intent) {
        if (i != 17) {
            return false;
        }
        if (this.mUploadMessage == null && this.mUploadCallbackAboveL == null) {
            return true;
        }
        Uri data = (intent == null || i2 != -1) ? null : intent.getData();
        Uri[] uriArr = data == null ? null : new Uri[]{data};
        ValueCallback<Uri[]> valueCallback = this.mUploadCallbackAboveL;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            setUploadCallbackAboveL(null);
        } else {
            this.mUploadMessage.onReceiveValue(data);
            setUploadMessage(null);
        }
        return true;
    }

    @TargetApi(21)
    public void recordVideoForApi21(WebView webView, ValueCallback<Uri[]> valueCallback, Activity activity, WebChromeClient.FileChooserParams fileChooserParams) {
        StringBuilder sb = new StringBuilder();
        sb.append("recordVideoForApi21 url=");
        sb.append(webView.getUrl());
        setUploadCallbackAboveL(valueCallback);
        recordVideo(activity);
    }

    public void recordVideoForApiBelow21(ValueCallback<Uri> valueCallback, String str, Activity activity) {
        setUploadMessage(valueCallback);
        recordVideo(activity);
    }

    public void resetReceive() {
        ValueCallback<Uri[]> valueCallback = this.mUploadCallbackAboveL;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
            this.mUploadCallbackAboveL = null;
        }
        ValueCallback<Uri> valueCallback2 = this.mUploadMessage;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
            this.mUploadMessage = null;
        }
    }

    public void setUploadCallbackAboveL(ValueCallback<Uri[]> valueCallback) {
        this.mUploadCallbackAboveL = valueCallback;
    }

    public void setUploadMessage(ValueCallback<Uri> valueCallback) {
        this.mUploadMessage = valueCallback;
    }

    public void setWebViewSettings(WebView webView, Context context) {
        if (webView == null) {
            return;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setTextZoom(100);
        settings.setAllowFileAccess(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setLoadWithOverviewMode(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabasePath(context.getDir("databases", 0).getPath());
        settings.setPluginState(WebSettings.PluginState.ON_DEMAND);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        settings.setUserAgentString(settings.getUserAgentString() + ";webank/h5face;webank/1.0;kyc/h5face;kyc/2.0");
    }

    public boolean isTencentH5FaceVerify(String str) {
        try {
            String str2 = str.split("//")[1].split(z.f14007a)[0];
            StringBuilder sb = new StringBuilder();
            sb.append("isTencentH5FaceVerify thirdUrlName=");
            sb.append(str2);
            return str2.contains("kyc") || str2.contains("ida");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

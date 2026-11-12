package com.huami.discovery.bridge.jsbridge.api;

import android.content.Context;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.callback.VerifiedCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface JsBridgeApi {
    void checkAppInstall(String str, JsCallBackFunction jsCallBackFunction);

    void exit(String str, JsCallBackFunction jsCallBackFunction);

    void functionButtonsEvent(String str, JsCallBackFunction jsCallBackFunction);

    String getDevicesInfo();

    void getLocation(String str, JsCallBackFunction jsCallBackFunction);

    String getSmartDevices(int[] iArr, int i);

    void getStatusBarHeight(String str, JsCallBackFunction jsCallBackFunction);

    void getUserToken(String str, JsCallBackFunction jsCallBackFunction);

    void getUsersInfo(String str, JsCallBackFunction jsCallBackFunction);

    String navigateTo(Context context, String str);

    boolean navigateTo(Context context, String str, String str2);

    void openExternalApp(String str, JsCallBackFunction jsCallBackFunction);

    void openInBrowser(String str, JsCallBackFunction jsCallBackFunction);

    void pushBoltNotice(String str, JsCallBackFunction jsCallBackFunction);

    void pushDeviceCustomNotice(String str, JsCallBackFunction jsCallBackFunction);

    void pushDeviceNotice(String str, JsCallBackFunction jsCallBackFunction);

    void pushNotice(String str, JsCallBackFunction jsCallBackFunction);

    void pushSystemNotice(String str, JsCallBackFunction jsCallBackFunction);

    void requestToVerify(Map<String, String> map, JsCallBackFunction jsCallBackFunction, VerifiedCallback verifiedCallback);

    void setCancelAuth(String str, JsCallBackFunction jsCallBackFunction);

    void setFunctionButtons(String str, JsCallBackFunction jsCallBackFunction);

    void setTitleBgColor(String str, JsCallBackFunction jsCallBackFunction);

    void setTitleFgColor(String str, JsCallBackFunction jsCallBackFunction);

    void setTitleVisibility(String str, JsCallBackFunction jsCallBackFunction);

    void share(String str, JsCallBackFunction jsCallBackFunction);

    void syncWatchSkin(String str, JsCallBackFunction jsCallBackFunction);

    void thirdMonitor(String str, boolean z, String str2);

    void weixinPay(String str, JsCallBackFunction jsCallBackFunction);
}

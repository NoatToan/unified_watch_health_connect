package com.huami.midong.webview.nativejsapi;

/* JADX INFO: loaded from: classes11.dex */
public enum JsBridgeNativeAPIEnum {
    FUNC_VERIFY_JSAPI(com.huami.discovery.bridge.jsbridge.JsBridgeNativeAPI.FUNC_VERIFY_JSAPI),
    FUNC_SET_TITLE_VISIBLE("setTitleVisibility"),
    FUNC_SET_TITLE_BG_COLOR("setTitleBgColor"),
    FUNC_SET_TITLE_FG_COLOR("setTitleFgColor"),
    FUNC_WEBVIEW_EXIT("exit"),
    FUNC_NAVIGATE_TO("navigateTo"),
    FUNC_OPEN_EXTERNAL_APP("openExternalApp"),
    FUNC_CHECK_APP_INSTALL("checkAppInstall"),
    FUNC_OPEN_IN_BROWSER("openInBrowser"),
    FUNC_GET_LOCATION("getLocation"),
    FUNC_GET_USER_TOKEN("getUserToken"),
    FUNC_GET_USERS_INFO("getUsersInfo"),
    FUNC_SHARE("share"),
    FUNC_SET_RIGHT_BTNS("setFunctionButtons"),
    FUNC_BTN_CLICK_EVENT("functionButtonsEvent"),
    FUNC_WEIXIN_PAY("weixinPay"),
    FUNC_SET_CANCEL_AUTH("setCancelAuth"),
    FUNC_SYNC_WATCH_SKIN("syncWatchSkin"),
    FUNC_PUSH_DEVICE_NOTICE("pushDeviceNotice"),
    FUNC_SHOW_DEVICE_X_CODE("showDeviceXCode"),
    FUNC_DOWNLOAD_ESIM("downloadEsim");

    private String func;

    JsBridgeNativeAPIEnum(String str) {
        this.func = str;
    }

    public static JsBridgeNativeAPIEnum get(String str) {
        for (JsBridgeNativeAPIEnum jsBridgeNativeAPIEnum : values()) {
            if (jsBridgeNativeAPIEnum.getFunc().equals(str)) {
                return jsBridgeNativeAPIEnum;
            }
        }
        return null;
    }

    public String getFunc() {
        return this.func;
    }

    public void setFunc(String str) {
        this.func = str;
    }
}

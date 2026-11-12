package com.huami.discovery.bridge.bracelet;

/* JADX INFO: loaded from: classes8.dex */
public interface BraceletCallback {
    void finishActivity();

    void handleBackAction(String str, String str2);

    boolean handleBackPressed(boolean z);

    void handleInvokeAction(String str, String str2);

    void handleLoginAction(int i, String str);

    void onCallJs(String str, Object... objArr);

    void onShowFunction(String str, boolean z);

    void onWebShare(String str);

    void setSystemBarColor(int i);

    void setTitleBarBackgroundColor(int i);

    void setTitleBarVisible(boolean z);

    void setTitleText(String str);
}

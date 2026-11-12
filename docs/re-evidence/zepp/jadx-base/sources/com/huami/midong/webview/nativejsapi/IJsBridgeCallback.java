package com.huami.midong.webview.nativejsapi;

import android.content.Context;
import com.huami.midong.webview.nativejsapi.apis.JsGetUserTokenFunc;
import com.huami.midong.webview.nativejsapi.apis.JsPushDeviceNoticeFunc;
import com.huami.midong.webview.nativejsapi.jsshare.JSShareCreator;

/* JADX INFO: loaded from: classes11.dex */
public interface IJsBridgeCallback {
    long cancelDeviceNotice(JsPushDeviceNoticeFunc.Reminders reminders);

    void doShare(JSShareCreator.Content content);

    void exitWeb(boolean z);

    String getUserInfo(Context context);

    JsGetUserTokenFunc.LoginInfo getUserToken();

    String navigateTo(String str);

    long pushDeviceNotice(JsPushDeviceNoticeFunc.Notice notice, JsPushDeviceNoticeFunc.Reminders reminders, long j, long j2);
}

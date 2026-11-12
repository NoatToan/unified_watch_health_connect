package com.huami.discovery.bridge.jsbridge;

import android.view.View;
import android.webkit.WebView;
import com.huami.discovery.bridge.jsbridge.share.ShareAnalyzeUtil;
import com.huami.discovery.bridge.model.JsCashierReq;

/* JADX INFO: loaded from: classes8.dex */
public interface JsBridgeCallback {
    void aliPay(String str, JsCallBackFunction jsCallBackFunction);

    void loadPage(String str);

    void onFinishActivity();

    void onShowCashierDesk(JsCashierReq jsCashierReq, JsCallBackFunction jsCallBackFunction);

    void onShowFunctionSheet(ShareAnalyzeUtil.JSShareStruct jSShareStruct, WebView webView);

    void onShowShareDialog(ShareAnalyzeUtil.JSShareStruct jSShareStruct, WebView webView);

    void setFunctionButtonVisible(boolean z, View.OnClickListener onClickListener);

    void setIsRefresh(boolean z);

    void setTitleBarBackgroundColor(int i);

    void setTitleFgColor(int i);

    void setTitleText(String str);

    void setTitleVisibility(boolean z);

    void showCancelAuthButton(boolean z, View.OnClickListener onClickListener);
}

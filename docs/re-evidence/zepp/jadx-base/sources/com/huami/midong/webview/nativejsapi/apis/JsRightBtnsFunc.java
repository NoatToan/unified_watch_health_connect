package com.huami.midong.webview.nativejsapi.apis;

import android.widget.Toast;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.nativejsapi.jsshare.JSShareCreator;
import com.huami.midong.webview.nativejsapi.jsshare.JsMenuParser;
import com.huami.midong.webview.widget.WebToolBar;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class JsRightBtnsFunc extends JsBridgeFunc {
    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, JsCallBackFunction jsCallBackFunction) {
        boolean z = false;
        Log.d(JsBridgeFunc.TAG, "FUNC_SET_RIGHT_BTNS data:" + str, new Object[0]);
        JsMenuParser.MenuResult menuResult = JsMenuParser.parse(str);
        if (menuResult.error != null) {
            String json = new Gson().toJson(menuResult.error);
            jsCallBackFunction.onCallBack(json);
            Toast.makeText(this.mNativeApi.getContext(), json, 0).show();
            return;
        }
        JsMenuParser.Menu menu = menuResult.menuMap.get("refresh");
        JsMenuParser.Menu menu2 = menuResult.menuMap.get("share");
        JsMenuParser.Menu menu3 = menuResult.menuMap.get("resize");
        boolean z2 = menu != null && menu.display;
        boolean z3 = menu2 != null && menu2.display;
        if (menu3 != null && menu3.display) {
            z = true;
        }
        if (this.mNativeApi.getJsTitleCallback() != null) {
            if (z3 && menu2.shareContent == null) {
                String title = this.mNativeApi.getWebView().getTitle();
                String url = this.mNativeApi.getWebView().getUrl();
                String url2 = this.mNativeApi.getWebView().getUrl();
                JSShareCreator.Content content = new JSShareCreator.Content();
                menu2.shareContent = content;
                content.setDefaultShareItem("card", title, url, url2);
            }
            WebToolBar.MenuBuilder menuBuilder = new WebToolBar.MenuBuilder();
            if (z3) {
                menuBuilder.addShare(menu2.shareContent);
            }
            if (z2) {
                menuBuilder.addRefresh();
            }
            if (z) {
                menuBuilder.addResize();
            }
            this.mNativeApi.getJsTitleCallback().setMenu(menuBuilder.build());
        }
        jsCallBackFunction.onCallBack("{\"status\":\"success\"}");
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_SET_RIGHT_BTNS;
    }
}

package com.huami.midong.webview.nativejsapi.jsshare;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JsMenuParser {
    public static final String BTN_REFRESH = "refresh";
    public static final String BTN_RESIZE = "resize";
    public static final String BTN_SHARE = "share";
    private static final String TAG = "JsBridgeMenuParser";

    public static class Menu {
        public String btnType;
        public boolean display;
        public String shareConfig;
        public JSShareCreator.Content shareContent;
    }

    private static List<String> getSupportedBn() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("resize");
        arrayList.add("share");
        arrayList.add("refresh");
        return arrayList;
    }

    public static MenuResult parse(String str) {
        MenuResult menuResult = new MenuResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            List<String> supportedBn = getSupportedBn();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                if (!supportedBn.contains(itKeys.next())) {
                    menuResult.error = new JsBridgeError(4040401L, new String[0]);
                    return menuResult;
                }
            }
            if (jSONObject.has("refresh")) {
                Menu menu = new Menu();
                menu.display = true;
                menu.display = jSONObject.optJSONObject("refresh").optBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY);
                menu.btnType = "refresh";
                menuResult.menuMap.put("refresh", menu);
            }
            if (jSONObject.has("share")) {
                Menu menu2 = new Menu();
                menu2.display = true;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("share");
                menu2.display = jSONObjectOptJSONObject.optBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY);
                if (jSONObjectOptJSONObject.has("config")) {
                    String string = jSONObjectOptJSONObject.optJSONObject("config").toString();
                    menu2.shareConfig = string;
                    if (!TextUtils.isEmpty(string)) {
                        JSShareCreator.Content shareContent = JSShareCreator.parseShareContent(menu2.shareConfig);
                        menu2.shareContent = shareContent;
                        JsBridgeError jsBridgeError = shareContent.error;
                        if (jsBridgeError != null) {
                            menuResult.error = jsBridgeError;
                        }
                    }
                }
                menu2.btnType = "share";
                menuResult.menuMap.put("share", menu2);
            }
        } catch (JSONException e) {
            menuResult.error = JsBridgeError.jsonParseError();
            Log.e(TAG, e.getMessage(), e, new Object[0]);
        }
        return menuResult;
    }

    public static class MenuResult {
        public JsBridgeError error;
        public Map<String, Menu> menuMap;

        public MenuResult(int i) {
            this.menuMap = new HashMap(i);
        }

        public MenuResult() {
            this.menuMap = new HashMap();
        }
    }
}

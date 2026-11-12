package com.huami.discovery.bridge.jsbridge.share;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class FunctionBtnAnalyzeUtil {
    public static final String BTN_REFRESH = "refresh";
    public static final String BTN_RESIZE = "resize";
    public static final String BTN_SHARE = "share";
    private static final String a = "FunctionBtnAnalyzeUtil";
    private static Set<String> b;

    public static class FunctionBtnStruct {
        public Map<String, JSBtnItem> btnItemMap;
        public JsBridgeError jsBridgeError;
    }

    public static class JSBtnItem {
        public String a;
        public String b;
        public boolean display;
        public ShareAnalyzeUtil.JSShareStruct shareStruct;
    }

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("resize");
        b.add("share");
        b.add("refresh");
    }

    public static FunctionBtnStruct analyzeFuncBtnCode(String str) {
        FunctionBtnStruct functionBtnStruct = new FunctionBtnStruct();
        functionBtnStruct.btnItemMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int size = b.size();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                b.add(itKeys.next());
            }
            if (b.size() > size) {
                functionBtnStruct.jsBridgeError = new JsBridgeError(4040401L, new String[0]);
                return functionBtnStruct;
            }
            JSBtnItem jSBtnItem = new JSBtnItem();
            jSBtnItem.display = true;
            if (jSONObject.has("refresh")) {
                jSBtnItem.display = jSONObject.optJSONObject("refresh").optBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY);
                HMLog.i(a, "refresh:" + jSBtnItem.display, new Object[0]);
            }
            jSBtnItem.b = "refresh";
            functionBtnStruct.btnItemMap.put("refresh", jSBtnItem);
            JSBtnItem jSBtnItem2 = new JSBtnItem();
            jSBtnItem2.display = true;
            if (jSONObject.has("share")) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("share");
                jSBtnItem2.display = jSONObjectOptJSONObject.optBoolean(ServerProtocol.DIALOG_PARAM_DISPLAY);
                if (jSONObjectOptJSONObject.has("config")) {
                    jSBtnItem2.a = jSONObjectOptJSONObject.optJSONObject("config").toString();
                    HMLog.i(a, "shareConfig=" + jSBtnItem2.a, new Object[0]);
                    if (!TextUtils.isEmpty(jSBtnItem2.a)) {
                        ShareAnalyzeUtil.JSShareStruct jSShareStructAnalyzeShareCode = ShareAnalyzeUtil.analyzeShareCode(jSBtnItem2.a);
                        jSBtnItem2.shareStruct = jSShareStructAnalyzeShareCode;
                        JsBridgeError jsBridgeError = jSShareStructAnalyzeShareCode.jsBridgeError;
                        if (jsBridgeError != null) {
                            functionBtnStruct.jsBridgeError = jsBridgeError;
                        }
                    }
                }
            }
            jSBtnItem2.b = "share";
            functionBtnStruct.btnItemMap.put("share", jSBtnItem2);
            return functionBtnStruct;
        } catch (JSONException e) {
            e.printStackTrace();
            functionBtnStruct.jsBridgeError = JsBridgeError.jsonParseError();
        }
    }
}

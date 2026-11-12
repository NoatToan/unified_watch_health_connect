package com.xiaomi.ai.domain.mobileapp.provider;

import com.google.gson.JsonObject;
import com.xiaomi.ai.api.Application;
import com.xiaomi.ai.domain.mobileapp.common.ActionType;
import com.xiaomi.ai.domain.mobileapp.common.Prompt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PromptGenerator {
    public static final int MIAI_SUPPORT_INSTRUCTION_BUILD_NO = 304002000;
    public static final int SUPPORT_CLOSE_CLIENT_VERSION = 300000106;
    public static final int SUPPORT_INSTALL_AND_UNINSTALL_CLIENT_VERSION = 300000108;

    public static Pair<List<Application.Hint>, Map<String, String>> genHints(Prompt prompt) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        if (prompt == null) {
            return Pair.of(arrayList, map);
        }
        for (int i = 0; i < prompt.hints.size(); i++) {
            JsonObject asJsonObject = prompt.hints.get(i).getAsJsonObject();
            if (asJsonObject != null && asJsonObject.has("text") && asJsonObject.has("action")) {
                Application.Hint hint = new Application.Hint(parseActionToHintTag(asJsonObject.get("action").getAsString()), asJsonObject.get("text").getAsString());
                arrayList.add(hint);
                map.put(hint.getTag().toString(), hint.getDescription());
            }
        }
        return Pair.of(arrayList, map);
    }

    private static JSONArray makeHintsClose(String str, String str2, String str3, boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (z) {
            if (!str.equals(str2)) {
                str3 = "已关闭";
            }
            jSONObject.put("text", str3);
            jSONObject.put("action", "CLOSE");
            jSONObject2.put("text", "没有可以关闭的app");
            jSONObject2.put("action", "NOT_FOUND_CLOSE");
            jSONObject3.put("text", "应用太多啦，请告诉我具体想关闭的应用哦");
            jSONObject3.put("action", "TOO_MANY_CLOSE");
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            jSONArray.put(jSONObject3);
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("text", "现在的小爱还不会关闭应用，等待升级到最新版吧");
            jSONObject4.put("action", "NOT_FOUND");
            jSONArray.put(jSONObject4);
        }
        return jSONArray;
    }

    private static JSONArray makeHintsDefault() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", "小爱还不支持该操作，请等待更新吧");
        jSONObject.put("action", "QUERY");
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    private static JSONArray makeHintsInstall(int i, String str, boolean z, boolean z2) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (z2) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            if (i == 1) {
                jSONObject.put("text", String.format("你已安装%s，正在打开", str));
                jSONObject.put("action", "INSTALL");
                jSONObject2.put("text", String.format("你已安装多个%s应用，请问你要打开第几个？", str));
                jSONObject2.put("action", "QUERY");
                jSONObject3.put("text", String.format("找到%s啦，快点击安装吧", str));
                jSONObject3.put("action", "NOT_FOUND");
            } else if (i >= 2) {
                jSONObject.put("text", "你已安装%s, 正在打开");
                jSONObject.put("action", "INSTALL");
                jSONObject2.put("text", String.format("你已安装多个%s应用，请问你要打开第几个？", str));
                jSONObject2.put("action", "QUERY");
                jSONObject3.put("text", String.format("为你找到多个%s应用，请问你想下载第几个？", str));
                jSONObject3.put("action", "NOT_FOUND");
            }
            jSONObject4.put("text", "小爱还不支持安装该应用哦");
            jSONObject4.put("action", "NOT_SUPPORT");
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            jSONArray.put(jSONObject3);
            jSONArray.put(jSONObject4);
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("text", "小爱还不支持安装应用，先手动安装吧");
            jSONObject5.put("action", "INSTALL");
            jSONArray.put(jSONObject5);
        }
        return jSONArray;
    }

    private static JSONArray makeHintsOpen(String str, int i, String str2, boolean z, String str3, String str4) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        if (!str.equals(str3)) {
            str4 = "好";
        }
        if (i == 1) {
            jSONObject.put("text", str4);
            jSONObject.put("action", "OPEN");
            jSONObject2.put("text", "找到以下应用，请问你需要打开第几个？");
            jSONObject2.put("action", "QUERY");
            jSONObject3.put("text", String.format("你还没有%s，快点安装吧", str2));
            jSONObject3.put("action", "NOT_FOUND");
        } else if (i >= 2) {
            jSONObject.put("text", str4);
            jSONObject.put("action", "OPEN");
            jSONObject2.put("text", "找到以下应用，请问你需要打开第几个？");
            jSONObject2.put("action", "QUERY");
            jSONObject3.put("text", String.format("为你找到多个%s应用，请问你想下载第几个？", str2));
            jSONObject3.put("action", "NOT_FOUND");
        }
        jSONObject4.put("text", "小爱还不支持打开该应用哦");
        jSONObject4.put("action", "NOT_SUPPORT");
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONArray.put(jSONObject3);
        jSONArray.put(jSONObject4);
        return jSONArray;
    }

    private static JSONArray makeHintsUnInstall() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", "当前版本还不支持卸载应用，先手动卸载吧");
        jSONObject.put("action", "UNINSTALL");
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public static JSONArray makePromptHints(JSONObject jSONObject, int i) throws JSONException {
        return makePromptHints(jSONObject, i, "OPEN", "好");
    }

    private static Application.HintTag parseActionToHintTag(String str) {
        str.hashCode();
        switch (str) {
            case "UNINSTALL":
                return Application.HintTag.EXECUTE;
            case "INSTALL":
                return Application.HintTag.EXECUTE;
            case "NOT_SUPPORT":
                return Application.HintTag.NOT_SUPPORTED;
            case "CLOSE_CURRENT":
                return Application.HintTag.EXECUTE;
            case "NOT_FOUND_CLOSE":
                return Application.HintTag.NOT_INSTALLED;
            case "OPEN":
                return Application.HintTag.EXECUTE;
            case "CLOSE":
                return Application.HintTag.EXECUTE;
            case "QUERY":
                return Application.HintTag.TOO_MANY;
            case "TOO_MANY_CLOSE":
                return Application.HintTag.TOO_MANY;
            case "NOT_FOUND":
                return Application.HintTag.NOT_INSTALLED;
            default:
                return Application.HintTag.UNKNOWN;
        }
    }

    public static Application.ApplicationOp parseIntentionAction(String str) {
        str.hashCode();
        switch (str) {
            case "UNINSTALL":
                return Application.ApplicationOp.UNINSTALL;
            case "INSTALL":
                return Application.ApplicationOp.INSTALL;
            case "CLOSE_CURRENT":
                return Application.ApplicationOp.CLOSE;
            case "OPEN":
                return Application.ApplicationOp.OPEN;
            case "CLOSE":
                return Application.ApplicationOp.CLOSE;
            default:
                return Application.ApplicationOp.UNKNOWN;
        }
    }

    public static JSONArray makePromptHints(JSONObject jSONObject, int i, String str, String str2) throws JSONException {
        String strOptString = jSONObject.optString("action", "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("apps");
        return makePromptHints(strOptString, jSONObject.optString("name", ""), jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0, i, jSONObject.optBoolean("download_now", false), str, str2);
    }

    public static JSONArray makePromptHints(String str, String str2, int i, int i2, boolean z) throws JSONException {
        return makePromptHints(str, str2, i, i2, z, "OPEN", "好");
    }

    public static JSONArray makePromptHints(String str, String str2, int i, int i2, boolean z, String str3, String str4) throws JSONException {
        boolean z2 = i2 >= 300000106;
        boolean z3 = i2 >= 300000108;
        if (ActionType.OPEN.getAction().equals(str)) {
            return makeHintsOpen(str, i, str2, z, str3, str4);
        }
        if (!ActionType.CLOSE.getAction().equals(str) && !ActionType.CLOSE_CURRENT.getAction().equals(str)) {
            if (ActionType.INSTALL.getAction().equals(str)) {
                return makeHintsInstall(i, str2, z, z3);
            }
            if (ActionType.UNINSTALL.getAction().equals(str)) {
                return makeHintsUnInstall();
            }
            return makeHintsDefault();
        }
        return makeHintsClose(str, str3, str4, z2);
    }
}

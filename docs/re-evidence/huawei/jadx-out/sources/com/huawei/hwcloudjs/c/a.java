package com.huawei.hwcloudjs.c;

import com.huawei.hwcloudjs.f.d;
import com.huawei.hwcloudjs.service.jsapi.JsCoreApi;
import com.huawei.hwcloudjs.service.jsmsg.NativeMsg;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17042a = "EventUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17043b = "javascript:hbs.handleMessage(%s);";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f17044c = "_event_type";
    private static final String d = "_event_type_inner";
    private static final String e = "_event_type_3rd";
    private static final String f = "_event_index";
    private static final String g = "_event_args";
    public static final String h = "event_inner_error";
    public static final String i = "event_inner_ready";
    public static final String j = "ChannelMessageEvent_";

    public static String a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(f17044c, d);
            jSONObject2.put(f, str);
            jSONObject2.put(g, jSONObject.toString());
        } catch (JSONException unused) {
            d.b(f17042a, "genInnerEvent error", true);
        }
        return String.format(Locale.ENGLISH, f17043b, jSONObject2.toString());
    }

    public static String a(NativeMsg nativeMsg) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f17044c, e);
            String type = nativeMsg.getType();
            if ("channelMessage".equals(type) && (nativeMsg instanceof JsCoreApi.ChannelMessageReq)) {
                type = j + ((JsCoreApi.ChannelMessageReq) nativeMsg).getChannelName();
            }
            jSONObject.put(f, type);
            jSONObject.put(g, nativeMsg.toJsonString());
        } catch (JSONException unused) {
            d.b(f17042a, "gen3rdEvent error", true);
        }
        return String.format(Locale.ENGLISH, f17043b, jSONObject.toString());
    }
}

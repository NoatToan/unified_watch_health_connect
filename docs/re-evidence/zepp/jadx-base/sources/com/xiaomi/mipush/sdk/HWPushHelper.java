package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class HWPushHelper {
    private static boolean a = false;

    public static void convertMessage(Intent intent) {
        g.a(intent);
    }

    public static boolean hasNetwork(Context context) {
        return g.m3478a(context);
    }

    public static boolean isHmsTokenSynced(Context context) {
        String strA = g.a(c.ASSEMBLE_PUSH_HUAWEI);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        String strA2 = g.a(context, strA);
        String strA3 = x.a(context).a(am.UPLOAD_HUAWEI_TOKEN);
        return (TextUtils.isEmpty(strA2) || TextUtils.isEmpty(strA3) || !"synced".equals(strA3)) ? false : true;
    }

    public static boolean isUserOpenHmsPush(Context context) {
        return MiPushClient.getOpenHmsPush(context);
    }

    public static boolean needConnect() {
        return a;
    }

    public static void notifyHmsNotificationMessageClicked(Context context, String str) throws JSONException {
        String string = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has("pushMsg")) {
                            string = jSONObject.getString("pushMsg");
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d(e.toString());
            }
        }
        PushMessageReceiver pushMessageReceiverA = g.a(context);
        if (pushMessageReceiverA != null) {
            MiPushMessage miPushMessageA = g.a(string);
            if (miPushMessageA.getExtra().containsKey("notify_effect")) {
                return;
            }
            pushMessageReceiverA.onNotificationMessageClicked(context, miPushMessageA);
        }
    }

    public static void notifyHmsPassThoughMessageArrived(Context context, String str) throws JSONException {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("content")) {
                    string = jSONObject.getString("content");
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d(e.toString());
        }
        PushMessageReceiver pushMessageReceiverA = g.a(context);
        if (pushMessageReceiverA != null) {
            pushMessageReceiverA.onReceivePassThroughMessage(context, g.a(string));
        }
    }

    public static void registerHuaWeiAssemblePush(Context context) {
        AbstractPushManager abstractPushManagerA = d.a(context).a(c.ASSEMBLE_PUSH_HUAWEI);
        if (abstractPushManagerA != null) {
            abstractPushManagerA.register();
        }
    }

    public static void reportError(String str, int i) {
        g.a(str, i);
    }

    public static synchronized void setConnectTime(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
    }

    public static synchronized void setGetTokenTime(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
    }

    public static void setNeedConnect(boolean z) {
        a = z;
    }

    public static synchronized boolean shouldGetToken(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_get_token_time", -1L)) > 172800000;
    }

    public static synchronized boolean shouldTryConnect(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1L)) > 5000;
    }

    public static void uploadToken(Context context, String str) {
        g.a(context, c.ASSEMBLE_PUSH_HUAWEI, str);
    }
}

package com.facebook.gamingservices;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GamingPayload {
    private static final String a = "GamingPayload";
    private static final String b = "context_token_id";
    private static final String c = "game_request_id";
    private static final String d = "payload";
    private static final String e = "al_applink_data";
    private static final String f = "extras";
    private static final String g = "tournament_id";
    private static Map<String, String> h;

    private GamingPayload() {
    }

    @Nullable
    public static String getGameRequestID() {
        Map<String, String> map = h;
        if (map != null && map.containsKey(c)) {
            return h.get(c);
        }
        return null;
    }

    @Nullable
    public static String getPayload() {
        Map<String, String> map = h;
        if (map != null && map.containsKey("payload")) {
            return h.get("payload");
        }
        return null;
    }

    @Nullable
    public static String getTournamentId() {
        Map<String, String> map = h;
        if (map != null && map.containsKey("tournament_id")) {
            return h.get("tournament_id");
        }
        return null;
    }

    public static void loadPayloadFromCloudGame(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            map.put(c, jSONObject.optString(c));
            map.put("payload", jSONObject.optString("payload"));
            map.put("tournament_id", jSONObject.optString("tournament_id"));
            h = map;
        } catch (JSONException e2) {
            Log.e(a, e2.toString(), e2);
        }
    }

    public static void loadPayloadFromIntent(Intent intent) {
        Bundle extras;
        Bundle bundle;
        HashMap map = new HashMap();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("al_applink_data") || (bundle = extras.getBundle("al_applink_data").getBundle("extras")) == null) {
            return;
        }
        String string = bundle.getString(c);
        String string2 = bundle.getString("payload");
        String string3 = bundle.getString(b);
        String string4 = bundle.getString("tournament_id");
        if (string3 != null) {
            GamingContext.setCurrentGamingContext(new GamingContext(string3));
        }
        map.put(c, string);
        map.put("payload", string2);
        map.put("tournament_id", string4);
        h = map;
    }
}

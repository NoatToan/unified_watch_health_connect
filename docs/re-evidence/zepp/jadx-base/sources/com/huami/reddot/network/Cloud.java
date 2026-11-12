package com.huami.reddot.network;

import androidx.annotation.NonNull;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.reddot.entity.RedDotItem;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class Cloud {
    public static final String TAG = "Discovery-Cloud";
    private static final String a = "com.xiaomi.hm.health";
    public static final String b = "legacy/apps/com.xiaomi.hm.health/discoveryUpdates";

    public interface API {
        Map<String, Object> params();

        String url();
    }

    public static class DiscoveryResult {
        public String data;
        public ArrayList<RedDotItem> dotItems;
        public boolean success;
    }

    public static String a(@NonNull JSONObject jSONObject) throws JSONException {
        return jSONObject.getString("data");
    }

    public static boolean b(@NonNull JSONObject jSONObject) throws JSONException {
        return jSONObject.getInt("code") == 1;
    }

    public static String host() {
        return HMServerDef.getHost();
    }
}

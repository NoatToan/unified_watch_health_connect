package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class ymm {
    public static String a(ykf ykfVar) {
        if (ykfVar == null) {
            yis.c("P2pJsonUtil", "buildMessageExJson message is null");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message_enable_encrypt", ykfVar.e());
        } catch (JSONException unused) {
            yis.c("P2pJsonUtil", "buildMessageExJson JSONException");
        }
        return jSONObject.toString();
    }
}

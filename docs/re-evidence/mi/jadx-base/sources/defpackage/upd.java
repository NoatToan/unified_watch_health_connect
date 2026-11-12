package defpackage;

import com.nimbusds.jose.shaded.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class upd {
    public static String a(String str) {
        return "\"" + JSONObject.escape(str) + "\"";
    }
}

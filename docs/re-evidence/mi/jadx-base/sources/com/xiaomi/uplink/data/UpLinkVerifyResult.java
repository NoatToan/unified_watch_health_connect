package com.xiaomi.uplink.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UpLinkVerifyResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14302a;

    public UpLinkVerifyResult(JSONObject jSONObject) throws JSONException {
        this.f14302a = jSONObject.getString("ticket");
    }

    public String toString() {
        return "UpLinkVerifyResult{, ticket='" + this.f14302a + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}

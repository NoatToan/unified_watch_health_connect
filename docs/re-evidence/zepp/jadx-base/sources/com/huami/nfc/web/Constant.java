package com.huami.nfc.web;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u001a\u0016\u0010\u000b\u001a\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\"\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lorg/json/JSONObject;", "json", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "action", "Lokhttp3/RequestBody;", "requestBody", "", "", "", "jsonBody", "KEY_LONGITUDE", "Ljava/lang/String;", "KEY_LATITUDE", "web_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "Constant")
public final class Constant {

    @NotNull
    public static final String KEY_LATITUDE = "latitude";

    @NotNull
    public static final String KEY_LONGITUDE = "longitude";

    @NotNull
    public static final JSONObject jsonBody(@NotNull Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @NotNull
    public static final RequestBody requestBody(@NotNull JSONObject jSONObject, @NotNull Function1<? super JSONObject, Unit> function1) {
        function1.invoke(jSONObject);
        return RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
    }

    public static /* synthetic */ RequestBody requestBody$default(JSONObject jSONObject, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = new JSONObject();
        }
        return requestBody(jSONObject, function1);
    }

    @NotNull
    public static final RequestBody requestBody(@NotNull Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
    }
}

package com.huami.ecg.core.web;

import java.util.Map;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"", "", "kvs", "Lokhttp3/RequestBody;", "buildRequestJsonBody", "json", "ecg-core_release"}, k = 2, mv = {1, 4, 0})
public final class BaseEcgWebApiKt {
    @NotNull
    public static final RequestBody buildRequestJsonBody(@NotNull Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
    }

    @NotNull
    public static final RequestBody buildRequestJsonBody(@NotNull String str) {
        return RequestBody.create(MediaType.parse("application/json"), str);
    }
}

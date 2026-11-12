package com.huami.nfc.bus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\bH\u0000\u001a+\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\t2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¨\u0006\u000b"}, d2 = {"Lorg/json/JSONObject;", "json", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "action", "Lokhttp3/RequestBody;", "requestBody", "", "Lorg/json/JSONArray;", "requestBodyWithArray", "nfc-bus_release"}, k = 2, mv = {1, 5, 1})
public final class ExpansionsKt {
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
    public static final RequestBody requestBodyWithArray(@NotNull JSONArray jSONArray, @NotNull Function1<? super JSONArray, Unit> function1) {
        function1.invoke(jSONArray);
        return RequestBody.create(MediaType.parse("application/json"), jSONArray.toString());
    }

    public static /* synthetic */ RequestBody requestBodyWithArray$default(JSONArray jSONArray, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONArray = new JSONArray();
        }
        return requestBodyWithArray(jSONArray, function1);
    }

    @NotNull
    public static final RequestBody requestBody(@NotNull String str) {
        return RequestBody.create(MediaType.parse("application/json"), str);
    }
}

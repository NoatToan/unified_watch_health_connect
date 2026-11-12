package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.x3;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes45.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultCollectAll")})
public class CommonH5Thread extends BaseHttpRequest<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30351c;
    public final String d;
    public final JsonDeserializer e = new JsonDeserializer() { // from class: com.huawei.watchface.mvp.model.thread.CommonH5Thread$$ExternalSyntheticLambda0
        @Override // com.google.gson.JsonDeserializer
        public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return this.f$0.a(jsonElement, type, jsonDeserializationContext);
        }
    };

    public CommonH5Thread(String str, String str2, String str3, String str4) {
        this.d = str;
        this.f30349a = str2;
        this.f30350b = str3;
        this.f30351c = str4;
    }

    private String buildRequestParams() {
        if (!TextUtils.isEmpty(this.f30350b)) {
            return c(this.f30350b);
        }
        HwLog.i("CommonH5Thread", "buildRequestParams bodyStr is empty");
        return "";
    }

    public final /* synthetic */ Map a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        for (String str : asJsonObject.keySet()) {
            linkedHashMap.put(str, a(asJsonObject.get(str)));
        }
        return linkedHashMap;
    }

    public String b(String str) {
        return str;
    }

    public final String c(String str) {
        if (TextUtils.isEmpty(this.f30351c)) {
            HwLog.i("CommonH5Thread", "setAccessTokenBody tokenNames is empty");
            return str;
        }
        String[] strArrSplit = this.f30351c.split(",");
        String strB = x3.b(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getAccountToken());
        if (strB == null) {
            HwLog.e("CommonH5Thread", "setAccessTokenBody Failed to get account token");
            return str;
        }
        for (String str2 : strArrSplit) {
            str = str.replaceAll(Pattern.quote(str2) + "=([^&]*)", str2 + "=" + strB);
        }
        return str;
    }

    public String e() {
        LinkedHashMap reqHeaders = getReqHeaders();
        return a(this.d, buildRequestParams(), reqHeaders);
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        if (TextUtils.isEmpty(this.f30349a)) {
            HwLog.i("CommonH5Thread", "setAccessTokenBody headerStr is empty");
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) GsonHelper.fromJson(this.f30349a, LinkedHashMap.class, (JsonDeserializer<Map<String, Object>>) this.e);
        if (ArrayUtils.a(linkedHashMap)) {
            return new LinkedHashMap();
        }
        c(linkedHashMap);
        return linkedHashMap;
    }

    public final Object a(JsonElement jsonElement) {
        return jsonElement.getAsString();
    }

    public final void c(LinkedHashMap linkedHashMap) {
        if (TextUtils.isEmpty(this.f30351c)) {
            HwLog.i("CommonH5Thread", "setAccessToken tokenNames is empty");
            return;
        }
        String[] strArrSplit = this.f30351c.split(",");
        String accountToken = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getAccountToken();
        if (x3.b(accountToken) == null) {
            HwLog.e("CommonH5Thread", "Failed to get account token");
            return;
        }
        for (String str : strArrSplit) {
            if (linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, accountToken);
            }
        }
    }
}

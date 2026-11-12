package com.huawei.health.h5pro.load;

import com.alipay.sdk.m.s.e;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.h5pro.exception.H5ProException;
import com.huawei.health.h5pro.load.expression.ExpressionParser;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.operation.ble.BleConstants;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class JsInterfacePreRequestObj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isAsync")
    private boolean f6959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("methodName")
    private String f6960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(BleConstants.KEY_PATH)
    private String f6961c;

    @SerializedName(e.n)
    private JsonElement d;

    @SerializedName("moduleName")
    private String e;

    @SerializedName("requestKey")
    private String h;

    @SerializedName("type")
    private int j;

    @SerializedName("platformList")
    private List<String> f = null;
    private long i = new Date().getTime();

    private void e(H5ProInstance h5ProInstance, JsonObject jsonObject) throws H5ProException {
        for (String str : jsonObject.keySet()) {
            JsonElement jsonElement = jsonObject.get(str);
            if (jsonElement.isJsonObject()) {
                e(h5ProInstance, jsonElement.getAsJsonObject());
            } else if (jsonElement.isJsonArray()) {
                a(h5ProInstance, jsonElement.getAsJsonArray());
            } else if (jsonElement.isJsonPrimitive()) {
                d(h5ProInstance, jsonObject, str, jsonElement);
            }
        }
    }

    public String getMethodName() {
        return this.f6960b;
    }

    public String getModuleName() {
        return this.e;
    }

    public JsonElement getParams() {
        return this.d;
    }

    public String getParamsStr(H5ProInstance h5ProInstance) throws H5ProException {
        JsonElement jsonElement = this.d;
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return "";
        }
        if (this.d.isJsonObject()) {
            JsonObject jsonObjectDeepCopy = this.d.getAsJsonObject().deepCopy();
            e(h5ProInstance, jsonObjectDeepCopy);
            return jsonObjectDeepCopy.toString();
        }
        if (!this.d.isJsonPrimitive()) {
            return "";
        }
        JsonPrimitive asJsonPrimitive = this.d.getAsJsonPrimitive();
        return asJsonPrimitive.isString() ? asJsonPrimitive.getAsString() : "";
    }

    public String getPath() {
        return this.f6961c;
    }

    public List<String> getPlatformList() {
        return this.f;
    }

    public String getRequestKey() {
        return this.h;
    }

    public long getRequestTime() {
        return this.i;
    }

    public int getType() {
        return this.j;
    }

    public boolean isAsync() {
        return this.f6959a;
    }

    public void setAsync(boolean z) {
        this.f6959a = z;
    }

    public void setMethodName(String str) {
        this.f6960b = str;
    }

    public void setModuleName(String str) {
        this.e = str;
    }

    public void setParams(JsonElement jsonElement) {
        this.d = jsonElement;
    }

    public void setPath(String str) {
        this.f6961c = str;
    }

    public void setPlatformList(List<String> list) {
        this.f = list;
    }

    public void setRequestKey(String str) {
        this.h = str;
    }

    public void setType(int i) {
        this.j = i;
    }

    private void a(H5ProInstance h5ProInstance, JsonArray jsonArray) throws H5ProException {
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement.isJsonObject()) {
                e(h5ProInstance, jsonElement.getAsJsonObject());
                return;
            }
            if (jsonElement.isJsonArray()) {
                a(h5ProInstance, jsonElement.getAsJsonArray());
                return;
            }
            if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString()) {
                return;
            }
            String asString = jsonElement.getAsString();
            if (!ExpressionParser.isMatchExpression(asString)) {
                return;
            }
            Object obj = ExpressionParser.parse(h5ProInstance, asString);
            if (obj instanceof Number) {
                jsonArray.set(i, new JsonPrimitive((Number) obj));
            } else if (obj instanceof String) {
                jsonArray.set(i, new JsonPrimitive((String) obj));
            } else if (obj instanceof Boolean) {
                jsonArray.set(i, new JsonPrimitive((Boolean) obj));
            } else if (obj instanceof JsonElement) {
                jsonArray.set(i, (JsonElement) obj);
            } else {
                StringBuilder sb = new StringBuilder("parseTheExpression: '");
                sb.append(asString);
                sb.append("' needs to return the JsonElement subclass! is null? -> ");
                sb.append(obj == null);
                LogUtil.e("H5PRO_ExpressionParser", sb.toString());
            }
        }
    }

    private void d(H5ProInstance h5ProInstance, JsonObject jsonObject, String str, JsonElement jsonElement) throws H5ProException {
        if (jsonElement.getAsJsonPrimitive().isString()) {
            String asString = jsonElement.getAsString();
            if (ExpressionParser.isMatchExpression(asString)) {
                Object obj = ExpressionParser.parse(h5ProInstance, asString);
                if (obj instanceof Number) {
                    jsonObject.addProperty(str, (Number) obj);
                    return;
                }
                if (obj instanceof String) {
                    jsonObject.addProperty(str, (String) obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    jsonObject.addProperty(str, (Boolean) obj);
                    return;
                }
                if (obj instanceof JsonElement) {
                    jsonObject.add(str, (JsonElement) obj);
                    return;
                }
                StringBuilder sb = new StringBuilder("parseTheExpression: '");
                sb.append(asString);
                sb.append("' needs to return the JsonElement subclass! is null? -> ");
                sb.append(obj == null);
                LogUtil.e("H5PRO_ExpressionParser", sb.toString());
            }
        }
    }
}

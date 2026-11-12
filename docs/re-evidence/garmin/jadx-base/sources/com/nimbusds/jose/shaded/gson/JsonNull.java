package com.nimbusds.jose.shaded.gson;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonNull extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    @Deprecated
    public JsonNull() {
    }

    public boolean equals(Object obj) {
        return obj instanceof JsonNull;
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public JsonNull deepCopy() {
        return INSTANCE;
    }
}

package com.twitter.sdk.android.core.models;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public class BindingValuesAdapter implements JsonSerializer<BindingValues>, JsonDeserializer<BindingValues> {
    private static final String a = "STRING";
    private static final String b = "IMAGE";
    private static final String c = "USER";
    private static final String d = "BOOLEAN";
    private static final String e = "type";
    private static final String f = "string_value";
    private static final String g = "image_value";
    private static final String h = "user_value";
    private static final String i = "boolean_value";

    public Object a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        JsonElement jsonElement = jsonObject.get("type");
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return null;
        }
        String asString = jsonElement.getAsString();
        asString.hashCode();
        switch (asString) {
            case "STRING":
                return jsonDeserializationContext.deserialize(jsonObject.get(f), String.class);
            case "USER":
                return jsonDeserializationContext.deserialize(jsonObject.get(h), UserValue.class);
            case "IMAGE":
                return jsonDeserializationContext.deserialize(jsonObject.get(g), ImageValue.class);
            case "BOOLEAN":
                return jsonDeserializationContext.deserialize(jsonObject.get(i), Boolean.class);
            default:
                return null;
        }
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(BindingValues bindingValues, Type type, JsonSerializationContext jsonSerializationContext) {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public BindingValues deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return new BindingValues();
        }
        Set<Map.Entry<String, JsonElement>> setEntrySet = jsonElement.getAsJsonObject().entrySet();
        HashMap map = new HashMap(32);
        for (Map.Entry<String, JsonElement> entry : setEntrySet) {
            map.put(entry.getKey(), a(entry.getValue().getAsJsonObject(), jsonDeserializationContext));
        }
        return new BindingValues(map);
    }
}

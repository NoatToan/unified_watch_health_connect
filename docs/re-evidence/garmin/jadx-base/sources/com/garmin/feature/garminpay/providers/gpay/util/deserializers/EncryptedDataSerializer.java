package com.garmin.feature.garminpay.providers.gpay.util.deserializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;
import jo2.b;
import jo2.g;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/EncryptedDataSerializer;", "Lcom/google/gson/JsonSerializer;", "", "", "Lcom/google/gson/JsonElement;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EncryptedDataSerializer implements JsonSerializer<Map<String, ? extends JsonElement>> {
    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Map<String, ? extends JsonElement> map, Type type, JsonSerializationContext jsonSerializationContext) {
        Map<String, ? extends JsonElement> map2 = map;
        map2.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        g gVar = g.f99843a;
        b bVar = b.KEY_API;
        String string = jsonSerializationContext.serialize(map2).toString();
        string.getClass();
        gVar.getClass();
        return new JsonPrimitive(g.b(bVar, string));
    }
}

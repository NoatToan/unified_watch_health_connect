package com.garmin.feature.garminpay.providers.gpay.snowball.alipay;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/alipay/AliPayLocalDateTimeTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/LocalDateTime;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AliPayLocalDateTimeTypeAdapter implements JsonDeserializer<LocalDateTime>, JsonSerializer<LocalDateTime> {
    @Override // com.google.gson.JsonDeserializer
    public final LocalDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        if (asString.length() == 0) {
            return null;
        }
        return DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseLocalDateTime(jsonElement.getAsString());
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        LocalDateTime localDateTime2 = localDateTime;
        type.getClass();
        jsonSerializationContext.getClass();
        return new JsonPrimitive(localDateTime2 == null ? "" : DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(localDateTime2));
    }
}

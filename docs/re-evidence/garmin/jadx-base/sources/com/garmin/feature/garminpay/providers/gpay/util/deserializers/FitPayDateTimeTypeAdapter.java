package com.garmin.feature.garminpay.providers.gpay.util.deserializers;

import aq2.j;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.nimbusds.jose.shaded.gson.internal.a;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/FitPayDateTimeTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayDateTimeTypeAdapter implements JsonDeserializer<DateTime>, JsonSerializer<DateTime> {
    @Override // com.google.gson.JsonDeserializer
    public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        a.p(jsonElement, type, jsonDeserializationContext);
        try {
            j.f12491a.getClass();
            Object value = j.f12494d.getValue();
            value.getClass();
            DateTime dateTime = ((DateTimeFormatter) value).parseDateTime(jsonElement.getAsString());
            dateTime.getClass();
            return dateTime;
        } catch (Throwable th3) {
            throw new JsonParseException(jsonElement + " is not valid string for being deserialized into DateTime", th3);
        }
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        DateTime dateTime2 = dateTime;
        if (dateTime2 == null) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            jsonNull.getClass();
            return jsonNull;
        }
        j.f12491a.getClass();
        Object value = j.f12494d.getValue();
        value.getClass();
        return new JsonPrimitive(((DateTimeFormatter) value).print(dateTime2));
    }
}

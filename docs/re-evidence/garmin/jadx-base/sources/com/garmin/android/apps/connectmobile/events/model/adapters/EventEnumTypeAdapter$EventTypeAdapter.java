package com.garmin.android.apps.connectmobile.events.model.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg0.f;
import java.lang.reflect.Type;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/events/model/adapters/EventEnumTypeAdapter$EventTypeAdapter", "Lcom/google/gson/JsonDeserializer;", "Lgg0/f;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventEnumTypeAdapter$EventTypeAdapter implements JsonDeserializer<f>, JsonSerializer<f> {
    @Override // com.google.gson.JsonDeserializer
    public final f deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        if (asString.length() == 0) {
            return null;
        }
        f.a aVar = f.f77128d;
        String asString2 = jsonElement.getAsString();
        aVar.getClass();
        return f.a.a(asString2);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(f fVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        f fVar2 = fVar;
        if (fVar2 == null || (str = fVar2.f77147a) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

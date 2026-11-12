package com.garmin.android.apps.connectmobile.workouts.data.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/data/model/EventLegActivityTypeAdapter$EventLegActivityTypeSelectionAdapter", "Lcom/google/gson/JsonDeserializer;", "Lm52/c;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventLegActivityTypeAdapter$EventLegActivityTypeSelectionAdapter implements JsonDeserializer<m52.c>, JsonSerializer<m52.c> {
    @Override // com.google.gson.JsonDeserializer
    public final m52.c deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        if (asString.length() == 0) {
            return null;
        }
        m52.c.a aVar = m52.c.f116667g;
        String asString2 = jsonElement.getAsString();
        aVar.getClass();
        return m52.c.a.a(asString2);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(m52.c cVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String strName;
        m52.c cVar2 = cVar;
        type.getClass();
        jsonSerializationContext.getClass();
        if (cVar2 == null || (strName = cVar2.name()) == null) {
            strName = "";
        }
        return new JsonPrimitive(strName);
    }
}

package com.garmin.android.apps.connectmobile.contacts.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import l20.f;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
public class ContactInfoSMSOptInStatusTypeAdapter$ContactInfoSMSOptInStatusAdapter implements JsonDeserializer<f>, JsonSerializer<f> {
    @Override // com.google.gson.JsonDeserializer
    public final f deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object obj = null;
        if (jsonElement.getAsString().length() == 0) {
            return null;
        }
        String asString = jsonElement.getAsString();
        f.f108980b.getClass();
        for (Object obj2 : f.f108987i) {
            if (s.g(((f) obj2).f108988a, asString)) {
                obj = obj2;
                break;
            }
        }
        f fVar = (f) obj;
        return fVar == null ? f.UNKNOWN : fVar;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(f fVar, Type type, JsonSerializationContext jsonSerializationContext) {
        f fVar2 = fVar;
        return new JsonPrimitive(fVar2 == null ? "" : fVar2.f108988a);
    }
}

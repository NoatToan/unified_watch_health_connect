package com.garmin.android.apps.connectmobile.contacts.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/contacts/model/ContactInfoDeclineReasonTypeAdapter$ContactInfoDeclineReasonAdapter", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/contacts/model/b;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactInfoDeclineReasonTypeAdapter$ContactInfoDeclineReasonAdapter implements JsonDeserializer<b>, JsonSerializer<b> {
    @Override // com.google.gson.JsonDeserializer
    public final b deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        Object obj = null;
        if (asString.length() == 0) {
            return null;
        }
        b.a aVar = b.f32746b;
        String asString2 = jsonElement.getAsString();
        aVar.getClass();
        for (Object obj2 : b.f32750f) {
            if (s.g(((b) obj2).f32751a, asString2)) {
                obj = obj2;
                break;
            }
        }
        b bVar = (b) obj;
        return bVar == null ? b.DECLINE : bVar;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(b bVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        b bVar2 = bVar;
        type.getClass();
        jsonSerializationContext.getClass();
        if (bVar2 == null || (str = bVar2.f32751a) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

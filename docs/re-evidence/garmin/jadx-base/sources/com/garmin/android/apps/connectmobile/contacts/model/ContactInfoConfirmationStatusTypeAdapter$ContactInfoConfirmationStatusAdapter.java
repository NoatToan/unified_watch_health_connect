package com.garmin.android.apps.connectmobile.contacts.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/contacts/model/ContactInfoConfirmationStatusTypeAdapter$ContactInfoConfirmationStatusAdapter", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactInfoConfirmationStatusTypeAdapter$ContactInfoConfirmationStatusAdapter implements JsonDeserializer<a>, JsonSerializer<a> {
    @Override // com.google.gson.JsonDeserializer
    public final a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        if (asString.length() == 0) {
            return null;
        }
        a.C0538a c0538a = a.f32736b;
        String asString2 = jsonElement.getAsString();
        c0538a.getClass();
        return a.C0538a.a(asString2);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(a aVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        a aVar2 = aVar;
        type.getClass();
        jsonSerializationContext.getClass();
        if (aVar2 == null || (str = aVar2.f32745a) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

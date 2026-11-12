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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/data/model/TriathlonTypeAdapter$TriathlonTypeSelectionAdapter", "Lcom/google/gson/JsonDeserializer;", "Lm52/i;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TriathlonTypeAdapter$TriathlonTypeSelectionAdapter implements JsonDeserializer<m52.i>, JsonSerializer<m52.i> {
    @Override // com.google.gson.JsonDeserializer
    public final m52.i deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        Object obj = null;
        if (asString.length() == 0) {
            return null;
        }
        m52.i.a aVar = m52.i.f116734c;
        String asString2 = jsonElement.getAsString();
        aVar.getClass();
        for (Object obj2 : m52.i.f116741j) {
            if (p005kotlin.jvm.internal.s.g(((m52.i) obj2).f116742a, asString2)) {
                obj = obj2;
                break;
            }
        }
        return (m52.i) obj;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(m52.i iVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String strName;
        m52.i iVar2 = iVar;
        type.getClass();
        jsonSerializationContext.getClass();
        if (iVar2 == null || (strName = iVar2.name()) == null) {
            strName = "";
        }
        return new JsonPrimitive(strName);
    }
}

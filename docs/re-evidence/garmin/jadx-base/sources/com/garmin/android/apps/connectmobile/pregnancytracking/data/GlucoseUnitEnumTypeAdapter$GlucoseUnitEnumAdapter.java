package com.garmin.android.apps.connectmobile.pregnancytracking.data;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import f12.l;
import java.lang.reflect.Type;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/data/GlucoseUnitEnumTypeAdapter$GlucoseUnitEnumAdapter", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/data/a;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GlucoseUnitEnumTypeAdapter$GlucoseUnitEnumAdapter implements JsonDeserializer<a>, JsonSerializer<a> {
    @Override // com.google.gson.JsonDeserializer
    public final a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        if (jsonElement.getAsString().length() == 0) {
            return null;
        }
        a.C0760a c0760a = a.f40420b;
        String asString = jsonElement.getAsString();
        c0760a.getClass();
        if (asString != null) {
            for (a aVar : a.values()) {
                if (s.g(aVar.f40424a, asString)) {
                    return aVar;
                }
            }
        }
        return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? a.MILLI_MOLES_PER_LITER : a.MILLI_GRAMS_PER_DECILITER;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(a aVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        a aVar2 = aVar;
        type.getClass();
        jsonSerializationContext.getClass();
        if (aVar2 == null || (str = aVar2.f40424a) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

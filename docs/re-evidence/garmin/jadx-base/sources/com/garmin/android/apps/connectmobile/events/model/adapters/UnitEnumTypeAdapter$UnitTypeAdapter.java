package com.garmin.android.apps.connectmobile.events.model.adapters;

import com.airbnb.lottie.animation.keyframe.a;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import d53.u;
import gg0.h;
import java.lang.reflect.Type;
import p005kotlin.Metadata;
import w13.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/events/model/adapters/UnitEnumTypeAdapter$UnitTypeAdapter", "Lcom/google/gson/JsonDeserializer;", "Lgg0/h;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnitEnumTypeAdapter$UnitTypeAdapter implements JsonDeserializer<h>, JsonSerializer<h> {
    @Override // com.google.gson.JsonDeserializer
    public final h deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        if (asString.length() == 0) {
            return null;
        }
        h.a aVar = h.f77156b;
        String asString2 = jsonElement.getAsString();
        aVar.getClass();
        if (asString2 != null) {
            c cVar = h.f77160f;
            p13.c.b bVarN = a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                h hVar = (h) bVarN.next();
                if (u.q(hVar.f77161a, asString2, true)) {
                    return hVar;
                }
            }
        }
        return h.DISTANCE;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(h hVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        h hVar2 = hVar;
        if (hVar2 == null || (str = hVar2.f77161a) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

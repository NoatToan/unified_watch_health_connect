package com.garmin.android.apps.connectmobile.events.model.adapters;

import com.airbnb.lottie.animation.keyframe.a;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import d53.u;
import gg0.i;
import java.lang.reflect.Type;
import p005kotlin.Metadata;
import w13.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/garmin/android/apps/connectmobile/events/model/adapters/UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter", "Lcom/google/gson/JsonDeserializer;", "Lgg0/i;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnitTypeEnumTypeAdapter$UnitTypeTypeAdapter implements JsonDeserializer<i>, JsonSerializer<i> {
    @Override // com.google.gson.JsonDeserializer
    public final i deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        asString.getClass();
        if (asString.length() == 0) {
            return null;
        }
        i.a aVar = i.f77162b;
        String asString2 = jsonElement.getAsString();
        aVar.getClass();
        if (asString2 != null) {
            c cVar = i.f77170j;
            p13.c.b bVarN = a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                i iVar = (i) bVarN.next();
                if (u.q(iVar.f77171a, asString2, true)) {
                    return iVar;
                }
            }
        }
        return i.MILE;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(i iVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        i iVar2 = iVar;
        if (iVar2 == null || (str = iVar2.f77171a) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

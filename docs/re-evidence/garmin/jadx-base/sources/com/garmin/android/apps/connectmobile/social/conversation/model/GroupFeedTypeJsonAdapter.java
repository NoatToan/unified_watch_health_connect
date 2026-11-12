package com.garmin.android.apps.connectmobile.social.conversation.model;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import d53.u;
import java.lang.reflect.Type;
import jo1.d;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/model/GroupFeedTypeJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Ljo1/d;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupFeedTypeJsonAdapter implements JsonDeserializer<d>, JsonSerializer<d> {
    @Override // com.google.gson.JsonDeserializer
    public final d deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            for (d dVar : d.values()) {
                if (u.q(dVar.f99779a, jsonElement != null ? jsonElement.getAsString() : null, true)) {
                    return dVar;
                }
            }
            return null;
        } catch (Exception e4) {
            String message = e4.getMessage();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AllFeedDTO", message);
            return null;
        }
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(d dVar, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        d dVar2 = dVar;
        if (dVar2 == null || (str = dVar2.f99779a) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

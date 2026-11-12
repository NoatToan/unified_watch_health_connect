package com.garmin.android.apps.connectmobile.userprofile.model;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/ProfileImageUrlJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileImageUrlJsonAdapter implements JsonDeserializer<j>, JsonSerializer<j> {
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // com.google.gson.JsonDeserializer
    public final j deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String asString;
        JsonElement jsonElement2;
        JsonObject asJsonObject = jsonElement != null ? jsonElement.getAsJsonObject() : null;
        w13.c cVar = k.f46891k;
        int iA = t0.a(y.r(cVar, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : cVar) {
            k kVar = (k) obj;
            if (asJsonObject == null || (jsonElement2 = asJsonObject.get(kVar.name())) == null) {
                asString = null;
            } else {
                if (jsonElement2.equals(JsonNull.INSTANCE)) {
                    jsonElement2 = null;
                }
                if (jsonElement2 != null) {
                    asString = jsonElement2.getAsString();
                } else {
                    asString = null;
                }
            }
            linkedHashMap.put(obj, asString);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null && g22.n.d(str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return new j(linkedHashMap2);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(j jVar, Type type, JsonSerializationContext jsonSerializationContext) {
        j jVar2 = jVar;
        if (jVar2 != null) {
            try {
                return new Gson().toJsonTree(jVar2.f46872a);
            } catch (Exception e4) {
                String str = j.f46871k;
                String strH = f3.h(e4, "toJsonElement: exception caught: [", "]");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.p(a2Var, str, strH);
            }
        }
        return null;
    }
}

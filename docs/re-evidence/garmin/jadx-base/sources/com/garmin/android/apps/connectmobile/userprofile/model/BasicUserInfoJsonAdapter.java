package com.garmin.android.apps.connectmobile.userprofile.model;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/BasicUserInfoJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/c;", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BasicUserInfoJsonAdapter implements JsonDeserializer<c> {
    @Override // com.google.gson.JsonDeserializer
    public final c deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject asJsonObject;
        String string = (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : asJsonObject.toString();
        c.f46826o.getClass();
        return (c) GsonUtil.f47253b.fromJson(string, c.class);
    }
}

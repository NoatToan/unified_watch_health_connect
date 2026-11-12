package com.garmin.android.apps.connectmobile.social.conversation.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import g22.k;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/model/GCDateTimeDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCDateTimeDeserializer implements JsonDeserializer<DateTime> {
    @Override // com.google.gson.JsonDeserializer
    public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String asString;
        DateTime dateTimeQ;
        return (jsonElement == null || (asString = jsonElement.getAsString()) == null || (dateTimeQ = k.q(asString, "yyyy-MM-dd'T'HH:mm:ss.SSS", null)) == null) ? new DateTime() : dateTimeQ;
    }
}

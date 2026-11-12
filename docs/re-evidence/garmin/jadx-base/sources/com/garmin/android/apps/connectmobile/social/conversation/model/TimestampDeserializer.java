package com.garmin.android.apps.connectmobile.social.conversation.model;

import c22.j0;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/model/TimestampDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Ljava/util/Date;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TimestampDeserializer implements JsonDeserializer<Date>, JsonSerializer<Date> {
    @Override // com.google.gson.JsonDeserializer
    public final Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            Date date = j0.f23102d.parseDateTime(u.v(String.valueOf(jsonElement), "\"", "", false)).toDate();
            date.getClass();
            return date;
        } catch (Exception e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.e(a2.GENERAL, "Convert timestamp failed. \n Exception: " + e4);
            return new Date();
        }
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        String str;
        Date date2 = date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        if (date2 == null || (str = simpleDateFormat.format(date2)) == null) {
            str = "";
        }
        return new JsonPrimitive(str);
    }
}

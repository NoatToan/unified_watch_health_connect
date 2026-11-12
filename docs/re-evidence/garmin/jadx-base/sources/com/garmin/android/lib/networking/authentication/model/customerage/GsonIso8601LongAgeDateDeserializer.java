package com.garmin.android.lib.networking.authentication.model.customerage;

import am.j;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/lib/networking/authentication/model/customerage/GsonIso8601LongAgeDateDeserializer;", "Lcom/google/gson/JsonDeserializer;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GsonIso8601LongAgeDateDeserializer implements JsonDeserializer<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f50083a;

    public GsonIso8601LongAgeDateDeserializer() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f50083a = simpleDateFormat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        r2 = r2.getAsString();
     */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String asString;
        if (jsonElement == null || jsonElement.isJsonNull() || asString == null || asString.length() == 0) {
            return null;
        }
        try {
            Date date = this.f50083a.parse(asString);
            if (date != null) {
                return Long.valueOf(date.getTime());
            }
            return null;
        } catch (ParseException unused) {
            throw new JsonParseException(j.m("unparseable date [", asString, "], supported format is [yyyy-MM-dd]"));
        }
    }
}

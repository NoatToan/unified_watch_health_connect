package com.garmin.android.apps.connectmobile.util.adapters;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import g22.k;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import org.joda.time.IllegalInstantException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/adapters/YearMonthDaySepHrMinSecMsDateTimeJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class YearMonthDaySepHrMinSecMsDateTimeJsonAdapter implements JsonDeserializer<DateTime>, JsonSerializer<DateTime> {
    static {
        new a(null);
    }

    @Override // com.google.gson.JsonDeserializer
    public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String asString;
        DateTime dateTimeQ;
        return (jsonElement == null || (asString = jsonElement.getAsString()) == null || (dateTimeQ = k.q(asString, "yyyy-MM-dd'T'HH:mm:ss.SSS", null)) == null) ? new DateTime() : dateTimeQ;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        DateTime dateTime2 = dateTime;
        String str = "";
        if (dateTime2 != null) {
            try {
                String string = dateTime2.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                if (string != null) {
                    str = string;
                }
            } catch (IllegalInstantException e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "YearMonthDaySepHrMinSecMsDateTimeJsonAdapter", "Failed to serialize: [" + e4 + "]");
            }
        }
        return new JsonPrimitive(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/adapters/YearMonthDaySepHrMinSecMsDateTimeJsonAdapter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PATTERN", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

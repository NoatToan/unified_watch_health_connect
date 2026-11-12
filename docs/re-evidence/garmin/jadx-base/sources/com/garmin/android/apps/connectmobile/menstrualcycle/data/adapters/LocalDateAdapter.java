package com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters;

import am.j;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/adapters/LocalDateAdapter;", "Lcom/google/gson/TypeAdapter;", "Lorg/joda/time/LocalDate;", "<init>", "()V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class LocalDateAdapter extends TypeAdapter<LocalDate> {
    static {
        new a(null);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LocalDate read2(JsonReader jsonReader) throws IOException {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            return LocalDate.parse(strNextString, DateTimeFormat.forPattern("yyyy-MM-dd"));
        } catch (Exception e4) {
            h.u(j.m("Cannot parse local date value: ", strNextString, "."), e4);
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, LocalDate localDate) {
        LocalDate localDate2 = localDate;
        jsonWriter.getClass();
        if (localDate2 == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(localDate2.toString("yyyy-MM-dd"));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/adapters/LocalDateAdapter$a;", "", "<init>", "()V", "", "PATTERN", "Ljava/lang/String;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

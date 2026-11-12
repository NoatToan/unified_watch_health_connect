package com.garmin.android.apps.connectmobile.courses.biz.gson;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import fb1.c;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/biz/gson/IntTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "a", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntTypeAdapter extends TypeAdapter<Integer> {
    static {
        new a(null);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Integer read2(JsonReader jsonReader) {
        String strNextString;
        if ((jsonReader != null ? jsonReader.peek() : null) == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader != null) {
            try {
                strNextString = jsonReader.nextString();
            } catch (NumberFormatException e4) {
                String strN = c.n("NumberFormatException: ", e4.getMessage());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "IntTypeAdapter", strN);
            }
        } else {
            strNextString = null;
        }
        if (strNextString != null) {
            return Integer.valueOf(Integer.parseInt(strNextString));
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Integer num) throws IOException {
        Integer num2 = num;
        if (num2 != null) {
            if (jsonWriter != null) {
                jsonWriter.value(num2);
            }
        } else if (jsonWriter == null || jsonWriter.getSerializeNulls()) {
            if (jsonWriter != null) {
                jsonWriter.nullValue();
            }
        } else {
            jsonWriter.setSerializeNulls(true);
            jsonWriter.nullValue();
            jsonWriter.setSerializeNulls(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/biz/gson/IntTypeAdapter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

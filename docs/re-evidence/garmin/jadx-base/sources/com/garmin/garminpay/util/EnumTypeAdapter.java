package com.garmin.garminpay.util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.Enum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f52322a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f52323b = new HashMap();

    public EnumTypeAdapter(Class<T> cls) {
        for (T t7 : cls.getEnumConstants()) {
            String strName = t7.name();
            this.f52322a.put(strName, t7);
            this.f52323b.put(t7, strName);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonToken.NULL) {
            return (Enum) this.f52322a.get(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        Enum r14 = (Enum) obj;
        jsonWriter.value(r14 == null ? null : (String) this.f52323b.get(r14));
    }
}

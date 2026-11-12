package com.garmin.android.apps.connectmobile.util.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/gson/GCMEnumTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "GCMEnumTypeAdapter", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMEnumTypeAdapterFactory implements TypeAdapterFactory {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/gson/GCMEnumTypeAdapterFactory$GCMEnumTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "Ljava/lang/Class;", "classOfT", "<init>", "(Ljava/lang/Class;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GCMEnumTypeAdapter<T> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f47255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f47256b;

        public GCMEnumTypeAdapter(Class<? super T> cls) {
            cls.getClass();
            this.f47255a = new HashMap();
            this.f47256b = new HashMap();
            Object[] enumConstants = cls.getEnumConstants();
            if (enumConstants != null) {
                for (Object obj : enumConstants) {
                    obj.getClass();
                    String strName = ((Enum) obj).name();
                    this.f47255a.put(strName, obj);
                    this.f47256b.put(obj, strName);
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final T read2(JsonReader jsonReader) {
            jsonReader.getClass();
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) this.f47255a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, T t7) {
            jsonWriter.getClass();
            jsonWriter.value(t7 == null ? null : (String) this.f47256b.get(t7));
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        gson.getClass();
        typeToken.getClass();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || s.g(rawType, Enum.class)) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        rawType.getClass();
        return new GCMEnumTypeAdapter(rawType);
    }
}

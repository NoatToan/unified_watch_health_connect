package com.twitter.sdk.android.core.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class SafeMapAdapter implements TypeAdapterFactory {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends TypeAdapter<T> {
        public final /* synthetic */ TypeAdapter a;
        public final /* synthetic */ TypeToken b;

        public a(TypeAdapter typeAdapter, TypeToken typeToken) {
            this.a = typeAdapter;
            this.b = typeToken;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public T read2(JsonReader jsonReader) throws IOException {
            T t = (T) this.a.read2(jsonReader);
            if (Map.class.isAssignableFrom(this.b.getRawType())) {
                return t == null ? (T) Collections.EMPTY_MAP : (T) Collections.unmodifiableMap((Map) t);
            }
            return t;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            this.a.write(jsonWriter, t);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new a(gson.getDelegateAdapter(this, typeToken), typeToken);
    }
}

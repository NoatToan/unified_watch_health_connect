package com.garmin.feature.garminpay.network;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/network/EmptyTypeAdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "EmptyCheckTypeAdapter", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmptyTypeAdapterFactory implements TypeAdapterFactory {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/network/EmptyTypeAdapterFactory$EmptyCheckTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "Lcom/google/gson/Gson;", "gson", "delegateAdapter", "<init>", "(Lcom/garmin/feature/garminpay/network/EmptyTypeAdapterFactory;Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class EmptyCheckTypeAdapter<T> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeAdapter<T> f50947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TypeAdapter<JsonElement> f50948b;

        public EmptyCheckTypeAdapter(EmptyTypeAdapterFactory emptyTypeAdapterFactory, Gson gson, TypeAdapter<T> typeAdapter) {
            gson.getClass();
            typeAdapter.getClass();
            this.f50947a = typeAdapter;
            this.f50948b = gson.getAdapter(JsonElement.class);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final T read2(JsonReader jsonReader) {
            JsonElement jsonElement = this.f50948b.read2(jsonReader);
            if (jsonElement.isJsonObject() && jsonElement.getAsJsonObject().entrySet().isEmpty()) {
                return null;
            }
            return this.f50947a.fromJsonTree(jsonElement);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, T t7) {
            this.f50947a.write(jsonWriter, t7);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        gson.getClass();
        typeToken.getClass();
        if (typeToken.getRawType().isPrimitive() || String.class.equals(typeToken.getRawType()) || typeToken.getRawType().isArray() || Collection.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, typeToken);
        delegateAdapter.getClass();
        return new EmptyCheckTypeAdapter(this, gson, delegateAdapter);
    }
}

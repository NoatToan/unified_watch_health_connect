package com.garmin.net.omtanalytics.impl.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f52533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f52535c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f52536d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f52537e;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z14) {
        if (str == null || cls == null) {
            throw null;
        }
        this.f52533a = cls;
        this.f52534b = str;
        this.f52537e = z14;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.f52533a) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : this.f52535c.entrySet()) {
            TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put((String) entry.getKey(), delegateAdapter);
            linkedHashMap2.put((Class) entry.getValue(), delegateAdapter);
        }
        return new TypeAdapter<R>() { // from class: com.garmin.net.omtanalytics.impl.util.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public final R read2(JsonReader jsonReader) {
                JsonElement jsonElement = Streams.parse(jsonReader);
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory.this;
                JsonElement jsonElementRemove = runtimeTypeAdapterFactory.f52537e ? jsonElement.getAsJsonObject().get(runtimeTypeAdapterFactory.f52534b) : jsonElement.getAsJsonObject().remove(runtimeTypeAdapterFactory.f52534b);
                if (jsonElementRemove == null) {
                    StringBuilder sb3 = new StringBuilder("cannot deserialize ");
                    sb3.append(runtimeTypeAdapterFactory.f52533a);
                    String str = runtimeTypeAdapterFactory.f52534b;
                    sb3.append(" because it does not define a field named ");
                    sb3.append(str);
                    throw new JsonParseException(sb3.toString());
                }
                String asString = jsonElementRemove.getAsString();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(asString);
                if (typeAdapter != null) {
                    return (R) typeAdapter.fromJsonTree(jsonElement);
                }
                throw new JsonParseException("cannot deserialize " + runtimeTypeAdapterFactory.f52533a + " subtype named " + asString + "; did you forget to register a subtype?");
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, R r14) {
                Class<?> cls = r14.getClass();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory.this;
                LinkedHashMap linkedHashMap3 = runtimeTypeAdapterFactory.f52536d;
                String str = runtimeTypeAdapterFactory.f52534b;
                String str2 = (String) linkedHashMap3.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter == null) {
                    throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                JsonObject asJsonObject = typeAdapter.toJsonTree(r14).getAsJsonObject();
                if (runtimeTypeAdapterFactory.f52537e) {
                    Streams.write(asJsonObject, jsonWriter);
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                if (asJsonObject.has(str)) {
                    throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + str);
                }
                jsonObject.add(str, new JsonPrimitive(str2));
                for (Map.Entry<String, JsonElement> entry2 : asJsonObject.entrySet()) {
                    jsonObject.add(entry2.getKey(), entry2.getValue());
                }
                Streams.write(jsonObject, jsonWriter);
            }
        }.nullSafe();
    }
}

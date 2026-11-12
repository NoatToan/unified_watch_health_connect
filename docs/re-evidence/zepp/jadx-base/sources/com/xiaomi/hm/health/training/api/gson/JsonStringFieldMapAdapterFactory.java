package com.xiaomi.hm.health.training.api.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public class JsonStringFieldMapAdapterFactory implements TypeAdapterFactory {

    public static class MapperAdapter<T> implements JsonSerializer<T>, JsonDeserializer<T> {
        private JsonParser a = new JsonParser();

        @Override // com.google.gson.JsonDeserializer
        public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return (T) jsonDeserializationContext.deserialize(this.a.parse(jsonElement.getAsString()), type);
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(jsonSerializationContext.serialize(t, type).toString());
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return TreeTypeAdapter.newFactoryWithMatchRawType(typeToken, new MapperAdapter()).create(gson, typeToken);
    }
}

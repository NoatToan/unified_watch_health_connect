package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class bu7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Gson f4609a = new GsonBuilder().registerTypeAdapter(Integer.class, new b()).registerTypeAdapter(Integer.TYPE, new b()).registerTypeAdapter(Double.class, new a()).registerTypeAdapter(Double.TYPE, new a()).registerTypeAdapter(Long.class, new c()).registerTypeAdapter(Long.TYPE, new c()).create();

    public static class a implements JsonSerializer<Float>, JsonDeserializer<Float> {
        @Override // com.google.gson.JsonDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                if (jsonElement.getAsString().equals("") || jsonElement.getAsString().equals(AbstractJsonLexerKt.NULL)) {
                    return Float.valueOf(0.0f);
                }
            } catch (Exception unused) {
            }
            try {
                return Float.valueOf(jsonElement.getAsFloat());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(Float f, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(f);
        }
    }

    public static class b implements JsonSerializer<Integer>, JsonDeserializer<Integer> {
        @Override // com.google.gson.JsonDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                if (jsonElement.getAsString().equals("") || jsonElement.getAsString().equals(AbstractJsonLexerKt.NULL)) {
                    return 0;
                }
            } catch (Exception unused) {
            }
            try {
                return Integer.valueOf(jsonElement.getAsInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(Integer num, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(num);
        }
    }

    public static class c implements JsonSerializer<Long>, JsonDeserializer<Long> {
        @Override // com.google.gson.JsonDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                if (!jsonElement.getAsString().equals("") && !jsonElement.getAsString().equals(AbstractJsonLexerKt.NULL)) {
                    int iIndexOf = jsonElement.getAsString().indexOf(".");
                    if (iIndexOf > -1) {
                        return Long.valueOf(Long.parseLong(jsonElement.getAsString().substring(0, iIndexOf)));
                    }
                    try {
                        return Long.valueOf(jsonElement.getAsLong());
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                return 0L;
            } catch (Exception unused) {
            }
        }

        @Override // com.google.gson.JsonSerializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(Long l, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(l);
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        if (str != null && cls != null) {
            if (f4609a == null) {
                f4609a = new Gson();
            }
            try {
                return (T) f4609a.fromJson(str, (Class) cls);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static <T> List<T> b(String str, Class<T> cls) {
        if (str != null && cls != null) {
            ArrayList arrayList = new ArrayList();
            try {
                if (f4609a == null) {
                    f4609a = new Gson();
                }
                Iterator<JsonElement> it = new JsonParser().parse(str).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    arrayList.add(f4609a.fromJson(it.next(), (Class) cls));
                }
                return arrayList;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}

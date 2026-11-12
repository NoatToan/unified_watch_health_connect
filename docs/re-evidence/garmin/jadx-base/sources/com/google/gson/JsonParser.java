package com.google.gson;

import com.google.errorprone.annotations.InlineMe;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonParser {
    @Deprecated
    public JsonParser() {
    }

    public static JsonElement parseReader(JsonReader jsonReader) {
        Strictness strictness = jsonReader.getStrictness();
        if (strictness == Strictness.LEGACY_STRICT) {
            jsonReader.setStrictness(Strictness.LENIENT);
        }
        try {
            try {
                JsonElement jsonElement = Streams.parse(jsonReader);
                jsonReader.setStrictness(strictness);
                return jsonElement;
            } catch (Throwable th3) {
                jsonReader.setStrictness(strictness);
                throw th3;
            }
        } catch (OutOfMemoryError | StackOverflowError e4) {
            throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e4);
        }
    }

    public static JsonElement parseString(String str) {
        return parseReader(new StringReader(str));
    }

    @InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseString(json)")
    @Deprecated
    public JsonElement parse(String str) {
        return parseString(str);
    }

    @InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public JsonElement parse(Reader reader) {
        return parseReader(reader);
    }

    @InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public JsonElement parse(JsonReader jsonReader) {
        return parseReader(jsonReader);
    }

    public static JsonElement parseReader(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement reader2 = parseReader(jsonReader);
            if (!reader2.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return reader2;
        } catch (MalformedJsonException | NumberFormatException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e14) {
            throw new JsonIOException(e14);
        }
    }
}

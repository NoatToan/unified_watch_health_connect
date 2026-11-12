package com.nimbusds.jose.shaded.gson;

import com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader;
import com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeWriter;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonToken;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) {
        return read2(new JsonReader(reader));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return read2(new JsonTreeReader(jsonElement));
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.nimbusds.jose.shaded.gson.TypeAdapter.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public T read2(JsonReader jsonReader) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return (T) TypeAdapter.this.read2(jsonReader);
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t7) {
                if (t7 == null) {
                    jsonWriter.nullValue();
                } else {
                    TypeAdapter.this.write(jsonWriter, t7);
                }
            }
        };
    }

    /* JADX INFO: renamed from: read */
    public abstract T read2(JsonReader jsonReader);

    public final String toJson(T t7) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t7);
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    public final JsonElement toJsonTree(T t7) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t7);
            return jsonTreeWriter.get();
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t7);

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, T t7) {
        write(new JsonWriter(writer), t7);
    }
}

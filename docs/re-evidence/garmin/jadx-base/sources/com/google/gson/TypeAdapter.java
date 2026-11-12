package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeAdapter<T> {

    public final class NullSafeTypeAdapter extends TypeAdapter<T> {
        private NullSafeTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) TypeAdapter.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + TypeAdapter.this + "]";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t7) {
            if (t7 == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter.this.write(jsonWriter, t7);
            }
        }
    }

    public final T fromJson(Reader reader) {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return read(new JsonTreeReader(jsonElement));
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return !(this instanceof NullSafeTypeAdapter) ? new NullSafeTypeAdapter() : this;
    }

    public abstract T read(JsonReader jsonReader);

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

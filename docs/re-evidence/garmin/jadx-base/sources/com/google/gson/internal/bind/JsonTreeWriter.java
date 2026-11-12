package com.google.gson.internal.bind;

import androidx.room.a0;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.messaging.l;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import j20.x;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonTreeWriter extends JsonWriter {
    private String pendingName;
    private JsonElement product;
    private final List<JsonElement> stack;
    private static final Writer UNWRITABLE_WRITER = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i14, int i15) {
            throw new AssertionError();
        }
    };
    private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
        this.stack = new ArrayList();
        this.product = JsonNull.INSTANCE;
    }

    private JsonElement peek() {
        return (JsonElement) a.c(1, this.stack);
    }

    private void put(JsonElement jsonElement) {
        if (this.pendingName != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) peek()).add(this.pendingName, jsonElement);
            }
            this.pendingName = null;
            return;
        }
        if (this.stack.isEmpty()) {
            this.product = jsonElement;
            return;
        }
        JsonElement jsonElementPeek = peek();
        if (jsonElementPeek instanceof JsonArray) {
            ((JsonArray) jsonElementPeek).add(jsonElement);
        } else {
            x.h();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter beginArray() {
        JsonArray jsonArray = new JsonArray();
        put(jsonArray);
        this.stack.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter beginObject() {
        JsonObject jsonObject = new JsonObject();
        put(jsonObject);
        this.stack.add(jsonObject);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.stack.isEmpty()) {
            this.stack.add(SENTINEL_CLOSED);
        } else {
            h.C("Incomplete document");
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter endArray() {
        if (this.stack.isEmpty() || this.pendingName != null) {
            x.h();
            return null;
        }
        if (!(peek() instanceof JsonArray)) {
            x.h();
            return null;
        }
        List<JsonElement> list = this.stack;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter endObject() {
        if (this.stack.isEmpty() || this.pendingName != null) {
            x.h();
            return null;
        }
        if (!(peek() instanceof JsonObject)) {
            x.h();
            return null;
        }
        List<JsonElement> list = this.stack;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() {
    }

    public JsonElement get() {
        if (this.stack.isEmpty()) {
            return this.product;
        }
        a0.s(this.stack, "Expected one JSON element but was ");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.stack.isEmpty() || this.pendingName != null) {
            h.z("Did not expect a name");
            return null;
        }
        if (peek() instanceof JsonObject) {
            this.pendingName = str;
            return this;
        }
        h.z("Please begin an object before writing a name.");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter nullValue() {
        put(JsonNull.INSTANCE);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                l.j(number, "JSON forbids NaN and infinities: ");
                return null;
            }
        }
        put(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(boolean z14) {
        put(new JsonPrimitive(Boolean.valueOf(z14)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        put(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(float f14) {
        if (!isLenient() && (Float.isNaN(f14) || Float.isInfinite(f14))) {
            l.d(f14, "JSON forbids NaN and infinities: ");
            return null;
        }
        put(new JsonPrimitive(Float.valueOf(f14)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(double d14) {
        if (!isLenient() && (Double.isNaN(d14) || Double.isInfinite(d14))) {
            l.c(d14, "JSON forbids NaN and infinities: ");
            return null;
        }
        put(new JsonPrimitive(Double.valueOf(d14)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(long j8) {
        put(new JsonPrimitive(Long.valueOf(j8)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @CanIgnoreReturnValue
    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        put(new JsonPrimitive(str));
        return this;
    }
}

package com.google.gson;

import c22.t;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setStrictness(Strictness.LENIENT);
        this.lock = new Object();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z14;
        synchronized (this.lock) {
            try {
                try {
                    try {
                        z14 = this.parser.peek() != JsonToken.END_DOCUMENT;
                    } catch (IOException e4) {
                        throw new JsonIOException(e4);
                    }
                } catch (MalformedJsonException e14) {
                    throw new JsonSyntaxException(e14);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        try {
            return Streams.parse(this.parser);
        } catch (OutOfMemoryError | StackOverflowError e4) {
            throw new JsonParseException("Failed parsing JSON source to Json", e4);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }
}

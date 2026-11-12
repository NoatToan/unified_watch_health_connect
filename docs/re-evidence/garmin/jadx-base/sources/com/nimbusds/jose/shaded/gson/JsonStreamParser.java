package com.nimbusds.jose.shaded.gson;

import c22.t;
import com.nimbusds.jose.shaded.gson.internal.Streams;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonToken;
import com.nimbusds.jose.shaded.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
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
                    z14 = this.parser.peek() != JsonToken.END_DOCUMENT;
                } catch (MalformedJsonException e4) {
                    throw new JsonSyntaxException(e4);
                } catch (IOException e14) {
                    throw new JsonIOException(e14);
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
        } catch (OutOfMemoryError e4) {
            throw new JsonParseException("Failed parsing JSON source to Json", e4);
        } catch (StackOverflowError e14) {
            throw new JsonParseException("Failed parsing JSON source to Json", e14);
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

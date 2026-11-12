package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes21.dex */
public class yl<T> implements Iterator<T>, Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final yl<?> f53607b = new yl<>(null, null, null, null, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f53608a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JsonDeserializer<T> f53609c;
    protected final DeserializationContext d;
    protected final JsonParser e;
    protected int f;
    protected final JsonStreamContext g;
    protected final JavaType h;
    protected final T j;

    /* JADX WARN: Multi-variable type inference failed */
    public yl(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z, Object obj) {
        this.h = javaType;
        this.e = jsonParser;
        this.d = deserializationContext;
        this.f53609c = jsonDeserializer;
        this.f53608a = z;
        if (obj == 0) {
            this.j = null;
        } else {
            this.j = obj;
        }
        if (jsonParser == null) {
            this.g = null;
            this.f = 0;
            return;
        }
        JsonStreamContext parsingContext = jsonParser.getParsingContext();
        if (z && jsonParser.isExpectedStartArrayToken()) {
            jsonParser.clearCurrentToken();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.START_OBJECT || jsonTokenCurrentToken == JsonToken.START_ARRAY) {
                parsingContext = parsingContext.getParent();
            }
        }
        this.g = parsingContext;
        this.f = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return d();
        } catch (ym e) {
            return ((Boolean) e(e)).booleanValue();
        } catch (IOException e2) {
            return ((Boolean) c(e2)).booleanValue();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return e();
        } catch (ym e) {
            return (T) e(e);
        } catch (IOException e2) {
            return (T) c(e2);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f != 0) {
            this.f = 0;
            JsonParser jsonParser = this.e;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public boolean d() throws IOException {
        JsonToken jsonTokenNextToken;
        JsonParser jsonParser;
        int i = this.f;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            b();
        } else if (i != 2) {
            return true;
        }
        if (this.e.currentToken() == null && ((jsonTokenNextToken = this.e.nextToken()) == null || jsonTokenNextToken == JsonToken.END_ARRAY)) {
            this.f = 0;
            if (this.f53608a && (jsonParser = this.e) != null) {
                jsonParser.close();
            }
            return false;
        }
        this.f = 3;
        return true;
    }

    public T e() throws IOException {
        T tDeserialize;
        int i = this.f;
        if (i == 0) {
            return (T) a();
        }
        int i2 = 2;
        int i3 = 1;
        if ((i == i3 || i == i2) && !d()) {
            return (T) a();
        }
        try {
            T t = this.j;
            if (t == null) {
                tDeserialize = this.f53609c.deserialize(this.e, this.d);
            } else {
                this.f53609c.deserialize(this.e, this.d, t);
                tDeserialize = this.j;
            }
            return tDeserialize;
        } finally {
            this.f = i3;
            this.e.clearCurrentToken();
        }
    }

    protected void b() throws IOException {
        JsonParser jsonParser = this.e;
        if (jsonParser.getParsingContext() == this.g) {
            return;
        }
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY || jsonTokenNextToken == JsonToken.END_OBJECT) {
                if (jsonParser.getParsingContext() == this.g) {
                    jsonParser.clearCurrentToken();
                    return;
                }
            } else if (jsonTokenNextToken == JsonToken.START_ARRAY || jsonTokenNextToken == JsonToken.START_OBJECT) {
                jsonParser.skipChildren();
            } else if (jsonTokenNextToken == null) {
                return;
            }
        }
    }

    protected <R> R a() {
        throw new NoSuchElementException();
    }

    protected <R> R e(ym ymVar) {
        throw new yr(ymVar.getMessage(), ymVar);
    }

    protected <R> R c(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }
}

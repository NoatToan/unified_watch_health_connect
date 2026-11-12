package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class b5f<T> implements Iterator<T>, Closeable {
    public static final b5f<?> i = new b5f<>(null, null, null, null, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f3819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeserializationContext f3820b;
    public final esd<T> c;
    public final JsonParser d;
    public final fud e;
    public final T f;
    public final boolean g;
    public int h;

    /* JADX WARN: Multi-variable type inference failed */
    public b5f(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, esd<?> esdVar, boolean z, Object obj) {
        this.f3819a = javaType;
        this.d = jsonParser;
        this.f3820b = deserializationContext;
        this.c = esdVar;
        this.g = z;
        if (obj == 0) {
            this.f = null;
        } else {
            this.f = obj;
        }
        if (jsonParser == null) {
            this.e = null;
            this.h = 0;
            return;
        }
        fud fudVarB0 = jsonParser.b0();
        if (z && jsonParser.B0()) {
            jsonParser.l();
        } else {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.START_OBJECT || jsonTokenK == JsonToken.START_ARRAY) {
                fudVarB0 = fudVarB0.e();
            }
        }
        this.e = fudVarB0;
        this.h = 2;
    }

    public <R> R a(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    public <R> R b(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    public void c() throws IOException {
        JsonParser jsonParser = this.d;
        if (jsonParser.b0() == this.e) {
            return;
        }
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            if (jsonTokenG0 == JsonToken.END_ARRAY || jsonTokenG0 == JsonToken.END_OBJECT) {
                if (jsonParser.b0() == this.e) {
                    jsonParser.l();
                    return;
                }
            } else if (jsonTokenG0 == JsonToken.START_ARRAY || jsonTokenG0 == JsonToken.START_OBJECT) {
                jsonParser.O0();
            } else if (jsonTokenG0 == null) {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.h != 0) {
            this.h = 0;
            JsonParser jsonParser = this.d;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public <R> R d() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return l();
        } catch (JsonMappingException e) {
            return ((Boolean) b(e)).booleanValue();
        } catch (IOException e2) {
            return ((Boolean) a(e2)).booleanValue();
        }
    }

    public boolean l() throws IOException {
        JsonToken jsonTokenG0;
        JsonParser jsonParser;
        int i2 = this.h;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            c();
        } else if (i2 != 2) {
            return true;
        }
        if (this.d.K() != null || ((jsonTokenG0 = this.d.G0()) != null && jsonTokenG0 != JsonToken.END_ARRAY)) {
            this.h = 3;
            return true;
        }
        this.h = 0;
        if (this.g && (jsonParser = this.d) != null) {
            jsonParser.close();
        }
        return false;
    }

    public T m() throws IOException {
        T tDeserialize;
        int i2 = this.h;
        if (i2 == 0) {
            return (T) d();
        }
        int i3 = 2;
        int i4 = 1;
        if ((i2 == i4 || i2 == i3) && !l()) {
            return (T) d();
        }
        try {
            T t = this.f;
            if (t == null) {
                tDeserialize = this.c.deserialize(this.d, this.f3820b);
            } else {
                this.c.deserialize(this.d, this.f3820b, t);
                tDeserialize = this.f;
            }
            return tDeserialize;
        } finally {
            this.h = i4;
            this.d.l();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return m();
        } catch (JsonMappingException e) {
            throw new RuntimeJsonMappingException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

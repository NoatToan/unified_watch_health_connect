package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f28583a = new Object();

    public Object a(DeserializationContext deserializationContext, Class<?> cls, Object obj, Throwable th) throws IOException {
        return f28583a;
    }

    @Deprecated
    public Object b(DeserializationContext deserializationContext, Class<?> cls, JsonParser jsonParser, String str) throws IOException {
        return f28583a;
    }

    public Object c(DeserializationContext deserializationContext, Class<?> cls, b bVar, JsonParser jsonParser, String str) throws IOException {
        return b(deserializationContext, cls, jsonParser, str);
    }

    public JavaType d(DeserializationContext deserializationContext, JavaType javaType, r4q r4qVar, String str) throws IOException {
        return null;
    }

    public Object e(DeserializationContext deserializationContext, Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str) throws IOException {
        return f28583a;
    }

    public boolean f(DeserializationContext deserializationContext, JsonParser jsonParser, esd<?> esdVar, Object obj, String str) throws IOException {
        return false;
    }

    public JavaType g(DeserializationContext deserializationContext, JavaType javaType, String str, r4q r4qVar, String str2) throws IOException {
        return null;
    }

    public Object h(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) throws IOException {
        return f28583a;
    }

    public Object i(DeserializationContext deserializationContext, JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        return f28583a;
    }

    public Object j(DeserializationContext deserializationContext, Class<?> cls, Number number, String str) throws IOException {
        return f28583a;
    }

    public Object k(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) throws IOException {
        return f28583a;
    }
}

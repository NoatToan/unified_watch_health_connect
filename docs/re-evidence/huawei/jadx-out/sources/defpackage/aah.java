package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class aah implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ys f172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettableBeanProperty f173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JsonDeserializer<Object> f174c;
    protected final JavaType d;
    public final ObjectIdGenerator<?> e;
    public final ObjectIdResolver h;

    protected aah(JavaType javaType, ys ysVar, ObjectIdGenerator<?> objectIdGenerator, JsonDeserializer<?> jsonDeserializer, SettableBeanProperty settableBeanProperty, ObjectIdResolver objectIdResolver) {
        this.d = javaType;
        this.f172a = ysVar;
        this.e = objectIdGenerator;
        this.h = objectIdResolver;
        this.f174c = jsonDeserializer;
        this.f173b = settableBeanProperty;
    }

    public static aah a(JavaType javaType, ys ysVar, ObjectIdGenerator<?> objectIdGenerator, JsonDeserializer<?> jsonDeserializer, SettableBeanProperty settableBeanProperty, ObjectIdResolver objectIdResolver) {
        return new aah(javaType, ysVar, objectIdGenerator, jsonDeserializer, settableBeanProperty, objectIdResolver);
    }

    public JsonDeserializer<Object> b() {
        return this.f174c;
    }

    public JavaType c() {
        return this.d;
    }

    public boolean e() {
        return this.e.maySerializeAsObject();
    }

    public boolean b(String str, JsonParser jsonParser) {
        return this.e.isValidReferencePropertyName(str, jsonParser);
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this.f174c.deserialize(jsonParser, deserializationContext);
    }
}

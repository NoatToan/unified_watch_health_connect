package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.huawei.operation.utils.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class zj implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final KeyDeserializer f54171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f54172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final BeanProperty f54173c;
    protected final AnnotatedMember d;
    final boolean e;
    protected final TypeDeserializer f;
    protected JsonDeserializer<Object> g;

    public zj(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        this.f54173c = beanProperty;
        this.d = annotatedMember;
        this.f54172b = javaType;
        this.g = jsonDeserializer;
        this.f = typeDeserializer;
        this.f54171a = keyDeserializer;
        this.e = annotatedMember instanceof acj;
    }

    public zj c(JsonDeserializer<Object> jsonDeserializer) {
        return new zj(this.f54173c, this.d, this.f54172b, this.f54171a, jsonDeserializer, this.f);
    }

    public void c(yi yiVar) {
        this.d.fixAccess(yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    Object readResolve() {
        AnnotatedMember annotatedMember = this.d;
        if (annotatedMember == null || annotatedMember.getAnnotated() == null) {
            throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
        }
        return this;
    }

    public BeanProperty c() {
        return this.f54173c;
    }

    public boolean a() {
        return this.g != null;
    }

    public JavaType b() {
        return this.f54172b;
    }

    public final void e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            KeyDeserializer keyDeserializer = this.f54171a;
            d(obj, keyDeserializer == null ? str : keyDeserializer.deserializeKey(str, deserializationContext), c(jsonParser, deserializationContext));
        } catch (zm e) {
            if (this.g.getObjectIdReader() == null) {
                throw ym.from(jsonParser, "Unresolved forward reference but no identity info.", e);
            }
            e.e().a((ReadableObjectId.Referring) new b(this, e, this.f54172b.getRawClass(), obj, str));
        }
    }

    public Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return this.g.getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this.f;
        if (typeDeserializer != null) {
            return this.g.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return this.g.deserialize(jsonParser, deserializationContext);
    }

    public void d(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (this.e) {
                Map map = (Map) ((acj) this.d).getValue(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((aco) this.d).e(obj, obj2, obj3);
        } catch (Exception e) {
            a(e, obj2, obj3);
        }
    }

    protected void a(Exception exc, Object obj, Object obj2) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String strB = ahw.b(obj2);
            StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
            sb.append(obj);
            sb.append("' of class " + d() + " (expected type: ");
            sb.append(this.f54172b);
            sb.append("; actual type: ");
            sb.append(strB);
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            String strA = ahw.a((Throwable) exc);
            if (strA != null) {
                sb.append(", problem: ");
                sb.append(strA);
            } else {
                sb.append(" (no error message provided)");
            }
            throw new ym((Closeable) null, sb.toString(), exc);
        }
        ahw.c((Throwable) exc);
        ahw.i(exc);
        Throwable thB = ahw.b((Throwable) exc);
        throw new ym((Closeable) null, ahw.a(thB), thB);
    }

    private String d() {
        return this.d.getDeclaringClass().getName();
    }

    public String toString() {
        return "[any property on class " + d() + "]";
    }

    static class b extends ReadableObjectId.Referring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f54174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final zj f54175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f54176c;

        public b(zj zjVar, zm zmVar, Class<?> cls, Object obj, String str) {
            super(zmVar, cls);
            this.f54175b = zjVar;
            this.f54174a = obj;
            this.f54176c = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (!hasId(obj)) {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
            }
            this.f54175b.d(this.f54174a, this.f54176c, obj2);
        }
    }
}

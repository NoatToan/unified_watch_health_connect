package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class t69 extends StdDeserializer<Object> implements aj4 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f34362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34363b;
    public final AnnotatedMethod c;
    public final esd<?> d;
    public final b e;
    public final SettableBeanProperty[] f;
    public transient ldi g;

    public t69(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, b bVar, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this.c = annotatedMethod;
        this.f34363b = true;
        this.f34362a = javaType.hasRawClass(String.class) ? null : javaType;
        this.d = null;
        this.e = bVar;
        this.f = settableBeanPropertyArr;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            return b(e, handledType(), settableBeanProperty.getName(), deserializationContext);
        }
    }

    public Object a(JsonParser jsonParser, DeserializationContext deserializationContext, ldi ldiVar) throws IOException {
        qdi qdiVarG = ldiVar.g(jsonParser, deserializationContext, null);
        JsonToken jsonTokenK = jsonParser.K();
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyE = ldiVar.e(strJ);
            if (settableBeanPropertyE != null) {
                qdiVarG.b(settableBeanPropertyE, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyE));
            } else {
                qdiVarG.i(strJ);
            }
            jsonTokenK = jsonParser.G0();
        }
        return ldiVar.a(deserializationContext, qdiVarG);
    }

    public Object b(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType javaType;
        return (this.d == null && (javaType = this.f34362a) != null && this.f == null) ? new t69(this, (esd<?>) deserializationContext.findContextualValueDeserializer(javaType, beanProperty)) : this;
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objD0;
        esd<?> esdVar = this.d;
        if (esdVar != null) {
            objD0 = esdVar.deserialize(jsonParser, deserializationContext);
        } else {
            if (!this.f34363b) {
                jsonParser.O0();
                try {
                    return this.c.call();
                } catch (Exception e) {
                    return deserializationContext.handleInstantiationProblem(this._valueClass, null, h04.g0(e));
                }
            }
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_STRING || jsonTokenK == JsonToken.FIELD_NAME) {
                objD0 = jsonParser.d0();
            } else {
                if (this.f != null && jsonParser.C0()) {
                    if (this.g == null) {
                        this.g = ldi.c(deserializationContext, this.e, this.f, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                    }
                    jsonParser.G0();
                    return a(jsonParser, deserializationContext, this.g);
                }
                objD0 = jsonParser.u0();
            }
        }
        try {
            return this.c.callOnWith(this._valueClass, objD0);
        } catch (Exception e2) {
            Throwable thG0 = h04.g0(e2);
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) && (thG0 instanceof IllegalArgumentException)) {
                return null;
            }
            return deserializationContext.handleInstantiationProblem(this._valueClass, objD0, thG0);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return this.d == null ? deserialize(jsonParser, deserializationContext) : q4qVar.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return true;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public final Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        Throwable thH = h04.H(th);
        h04.d0(thH);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (thH instanceof IOException) {
            if (!z || !(thH instanceof JsonProcessingException)) {
                throw ((IOException) thH);
            }
        } else if (!z) {
            h04.f0(thH);
        }
        return thH;
    }

    public t69(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this.c = annotatedMethod;
        this.f34363b = false;
        this.f34362a = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public t69(t69 t69Var, esd<?> esdVar) {
        super(t69Var._valueClass);
        this.f34362a = t69Var.f34362a;
        this.c = t69Var.c;
        this.f34363b = t69Var.f34363b;
        this.e = t69Var.e;
        this.f = t69Var.f;
        this.d = esdVar;
    }
}

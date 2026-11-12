package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class abb extends StdDeserializer<Object> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final aco f198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final SettableBeanProperty[] f199c;
    protected final JsonDeserializer<?> d;
    protected final JavaType e;
    private transient aag h;
    protected final ValueInstantiator j;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    public abb(Class<?> cls, aco acoVar, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this.f198b = acoVar;
        this.f197a = true;
        this.e = javaType.hasRawClass(String.class) ? null : javaType;
        this.d = null;
        this.j = valueInstantiator;
        this.f199c = settableBeanPropertyArr;
    }

    public abb(Class<?> cls, aco acoVar) {
        super(cls);
        this.f198b = acoVar;
        this.f197a = false;
        this.e = null;
        this.d = null;
        this.j = null;
        this.f199c = null;
    }

    protected abb(abb abbVar, JsonDeserializer<?> jsonDeserializer) {
        super(abbVar._valueClass);
        this.e = abbVar.e;
        this.f198b = abbVar.f198b;
        this.f197a = abbVar.f197a;
        this.j = abbVar.j;
        this.f199c = abbVar.f199c;
        this.d = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JavaType javaType;
        return (this.d == null && (javaType = this.e) != null && this.f199c == null) ? new abb(this, (JsonDeserializer<?>) deserializationContext.findContextualValueDeserializer(javaType, beanProperty)) : this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object text;
        JsonDeserializer<?> jsonDeserializer = this.d;
        if (jsonDeserializer != null) {
            text = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else if (this.f197a) {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (this.f199c != null) {
                if (!jsonParser.isExpectedStartObjectToken()) {
                    JavaType valueType = getValueType(deserializationContext);
                    deserializationContext.reportInputMismatch(valueType, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", ahw.a(valueType), this.f198b, jsonParser.currentToken());
                }
                if (this.h == null) {
                    this.h = aag.c(deserializationContext, this.j, this.f199c, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.nextToken();
                return c(jsonParser, deserializationContext, this.h);
            }
            if (jsonTokenCurrentToken == JsonToken.VALUE_STRING || jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
                text = jsonParser.getText();
            } else if (jsonTokenCurrentToken == JsonToken.VALUE_NUMBER_INT) {
                text = jsonParser.getNumberValue();
            } else {
                text = jsonParser.getValueAsString();
            }
        } else {
            jsonParser.skipChildren();
            try {
                return this.f198b.call();
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._valueClass, null, ahw.f(e));
            }
        }
        try {
            return this.f198b.e(this._valueClass, text);
        } catch (Exception e2) {
            Throwable thF = ahw.f(e2);
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) && (thF instanceof IllegalArgumentException)) {
                return null;
            }
            return deserializationContext.handleInstantiationProblem(this._valueClass, text, thF);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        if (this.d == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext, aag aagVar) throws IOException {
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, null);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyE = aagVar.e(strCurrentName);
            if (!aaiVarE.e(strCurrentName) || settableBeanPropertyE != null) {
                if (settableBeanPropertyE != null) {
                    aaiVarE.b(settableBeanPropertyE, a(jsonParser, deserializationContext, settableBeanPropertyE));
                } else {
                    jsonParser.skipChildren();
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return aagVar.a(deserializationContext, aaiVarE);
    }

    protected final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            return a(e, handledType(), settableBeanProperty.getName(), deserializationContext);
        }
    }

    protected Object a(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw ym.wrapWithPath(d(th, deserializationContext), obj, str);
    }

    private Throwable d(Throwable th, DeserializationContext deserializationContext) throws IOException {
        Throwable thB = ahw.b(th);
        ahw.e(thB);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (thB instanceof IOException) {
            if (!z || !(thB instanceof wr)) {
                throw ((IOException) thB);
            }
        } else if (!z) {
            ahw.i(thB);
        }
        return thB;
    }
}

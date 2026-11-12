package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class zd extends JsonDeserializer<Object> implements ContextualDeserializer, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f53984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f53985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f53986c;
    protected final boolean d;
    protected final Map<String, SettableBeanProperty> e;
    protected transient Map<String, SettableBeanProperty> f;
    protected final JavaType g;
    protected final aah i;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return null;
    }

    public zd(zi ziVar, BeanDescription beanDescription, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType type = beanDescription.getType();
        this.g = type;
        this.i = ziVar.i();
        this.e = map;
        this.f = map2;
        Class<?> rawClass = type.getRawClass();
        this.f53985b = rawClass.isAssignableFrom(String.class);
        boolean z = true;
        this.d = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this.f53986c = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.f53984a = z;
    }

    protected zd(BeanDescription beanDescription) {
        JavaType type = beanDescription.getType();
        this.g = type;
        this.i = null;
        this.e = null;
        Class<?> rawClass = type.getRawClass();
        this.f53985b = rawClass.isAssignableFrom(String.class);
        boolean z = true;
        this.d = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this.f53986c = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z = false;
        }
        this.f53984a = z;
    }

    protected zd(zd zdVar, aah aahVar, Map<String, SettableBeanProperty> map) {
        this.g = zdVar.g;
        this.e = zdVar.e;
        this.f53985b = zdVar.f53985b;
        this.d = zdVar.d;
        this.f53986c = zdVar.f53986c;
        this.f53984a = zdVar.f53984a;
        this.i = aahVar;
        this.f = map;
    }

    public static zd d(BeanDescription beanDescription) {
        return new zd(beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        AnnotatedMember member;
        acv acvVarFindObjectIdInfo;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (beanProperty == null || annotationIntrospector == null || (member = beanProperty.getMember()) == null || (acvVarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) == null) {
            return this.f == null ? this : new zd(this, this.i, null);
        }
        ObjectIdResolver objectIdResolverObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, acvVarFindObjectIdInfo);
        acv acvVarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, acvVarFindObjectIdInfo);
        Class<? extends ObjectIdGenerator<?>> clsE = acvVarFindObjectReferenceInfo.e();
        if (clsE == ObjectIdGenerators.PropertyGenerator.class) {
            ys ysVarC = acvVarFindObjectReferenceInfo.c();
            Map<String, SettableBeanProperty> map = this.f;
            SettableBeanProperty settableBeanProperty2 = map == null ? null : map.get(ysVarC.b());
            if (settableBeanProperty2 == null) {
                deserializationContext.reportBadDefinition(this.g, String.format("Invalid Object Id definition for %s: cannot find property with name %s", ahw.u(handledType()), ahw.e(ysVarC)));
            }
            JavaType type = settableBeanProperty2.getType();
            objectIdGeneratorObjectIdGeneratorInstance = new aak(acvVarFindObjectReferenceInfo.f());
            javaType = type;
            settableBeanProperty = settableBeanProperty2;
        } else {
            objectIdResolverObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, acvVarFindObjectReferenceInfo);
            JavaType javaType2 = deserializationContext.getTypeFactory().a(deserializationContext.constructType((Class<?>) clsE), ObjectIdGenerator.class)[0];
            objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, acvVarFindObjectReferenceInfo);
            settableBeanProperty = null;
            javaType = javaType2;
        }
        return new zd(this, aah.a(javaType, acvVarFindObjectReferenceInfo.c(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, objectIdResolverObjectIdResolverInstance), null);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this.g.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public aah getObjectIdReader() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this.e;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        JsonToken jsonTokenCurrentToken;
        if (this.i != null && (jsonTokenCurrentToken = jsonParser.currentToken()) != null) {
            if (jsonTokenCurrentToken.isScalarValue()) {
                return b(jsonParser, deserializationContext);
            }
            if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
                jsonTokenCurrentToken = jsonParser.nextToken();
            }
            if (jsonTokenCurrentToken == JsonToken.FIELD_NAME && this.i.e() && this.i.b(jsonParser.currentName(), jsonParser)) {
                return b(jsonParser, deserializationContext);
            }
        }
        Object objC = c(jsonParser, deserializationContext);
        return objC != null ? objC : typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(this.g.getRawClass(), new ValueInstantiator.b(this.g), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 6:
                if (this.f53985b) {
                    return jsonParser.getText();
                }
                return null;
            case 7:
                if (this.f53986c) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                return null;
            case 8:
                if (this.f53984a) {
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
                return null;
            case 9:
                if (this.d) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this.d) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objC = this.i.c(jsonParser, deserializationContext);
        ReadableObjectId readableObjectIdFindObjectId = deserializationContext.findObjectId(objC, this.i.e, this.i.h);
        Object objA = readableObjectIdFindObjectId.a();
        if (objA != null) {
            return objA;
        }
        throw new zm(jsonParser, "Could not resolve Object Id [" + objC + "] -- unresolved forward-reference?", jsonParser.getCurrentLocation(), readableObjectIdFindObjectId);
    }
}

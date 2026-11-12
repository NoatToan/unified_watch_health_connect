package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class afk extends ContainerSerializer<Map.Entry<?, ?>> implements ContextualSerializer {
    public static final Object d = JsonInclude.Include.NON_EMPTY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected PropertySerializerMap f362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected JsonSerializer<Object> f364c;
    protected final JavaType e;
    protected final boolean f;
    protected JsonSerializer<Object> g;
    protected final BeanProperty h;
    protected final Object i;
    protected final JavaType j;
    protected final TypeSerializer k;
    protected final boolean m;

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    public afk(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(javaType);
        this.f363b = javaType;
        this.e = javaType2;
        this.j = javaType3;
        this.m = z;
        this.k = typeSerializer;
        this.h = beanProperty;
        this.f362a = PropertySerializerMap.emptyForProperties();
        this.i = null;
        this.f = false;
    }

    protected afk(afk afkVar, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z) {
        super(Map.class, false);
        this.f363b = afkVar.f363b;
        this.e = afkVar.e;
        this.j = afkVar.j;
        this.m = afkVar.m;
        this.k = afkVar.k;
        this.f364c = jsonSerializer;
        this.g = jsonSerializer2;
        this.f362a = PropertySerializerMap.emptyForProperties();
        this.h = afkVar.h;
        this.i = obj;
        this.f = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new afk(this, this.h, typeSerializer, this.f364c, this.g, this.i, this.f);
    }

    public afk d(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z) {
        return new afk(this, beanProperty, this.k, jsonSerializer, jsonSerializer2, obj, z);
    }

    public afk d(Object obj, boolean z) {
        return (this.i == obj && this.f == z) ? this : new afk(this, this.h, this.k, this.f364c, this.g, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerSerializerInstance;
        JsonSerializer<?> jsonSerializerSerializerInstance2;
        JsonSerializer<?> jsonSerializerHandleSecondaryContextualization;
        Object obj;
        JsonInclude.b bVarFindPropertyInclusion;
        JsonInclude.Include includeD;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        Object objD = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (member == null || annotationIntrospector == null) {
            jsonSerializerSerializerInstance = null;
            jsonSerializerSerializerInstance2 = null;
        } else {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            jsonSerializerSerializerInstance2 = objFindKeySerializer != null ? serializerProvider.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            jsonSerializerSerializerInstance = objFindContentSerializer != null ? serializerProvider.serializerInstance(member, objFindContentSerializer) : null;
        }
        if (jsonSerializerSerializerInstance == null) {
            jsonSerializerSerializerInstance = this.g;
        }
        JsonSerializer<?> jsonSerializerFindContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializerSerializerInstance);
        if (jsonSerializerFindContextualConvertingSerializer == null && this.m && !this.j.isJavaLangObject()) {
            jsonSerializerFindContextualConvertingSerializer = serializerProvider.findContentValueSerializer(this.j, beanProperty);
        }
        JsonSerializer<?> jsonSerializer = jsonSerializerFindContextualConvertingSerializer;
        if (jsonSerializerSerializerInstance2 == null) {
            jsonSerializerSerializerInstance2 = this.f364c;
        }
        if (jsonSerializerSerializerInstance2 == null) {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.findKeySerializer(this.e, beanProperty);
        } else {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.handleSecondaryContextualization(jsonSerializerSerializerInstance2, beanProperty);
        }
        JsonSerializer<?> jsonSerializer2 = jsonSerializerHandleSecondaryContextualization;
        Object obj2 = this.i;
        boolean zIncludeFilterSuppressNulls = this.f;
        if (beanProperty == null || (bVarFindPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), null)) == null || (includeD = bVarFindPropertyInclusion.d()) == JsonInclude.Include.USE_DEFAULTS) {
            obj = obj2;
        } else {
            int i = AnonymousClass4.d[includeD.ordinal()];
            zIncludeFilterSuppressNulls = true;
            if (i == 1) {
                objD = ahr.d(this.j);
                if (objD != null && objD.getClass().isArray()) {
                    objD = aht.b(objD);
                }
            } else if (i != 2) {
                if (i == 3) {
                    objD = d;
                } else if (i == 4) {
                    objD = serializerProvider.includeFilterInstance(null, bVarFindPropertyInclusion.a());
                    if (objD != null) {
                        zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(objD);
                    }
                } else if (i != 5) {
                    zIncludeFilterSuppressNulls = false;
                }
            } else if (this.j.isReferenceType()) {
                objD = d;
            }
            obj = objD;
        }
        return d(beanProperty, jsonSerializer2, jsonSerializer, obj, zIncludeFilterSuppressNulls);
    }

    /* JADX INFO: renamed from: afk$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            d = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JsonSerializer<?> getContentSerializer() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean isEmpty(SerializerProvider serializerProvider, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this.f;
        }
        if (this.i == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializerE = this.g;
        if (jsonSerializerE == null) {
            Class<?> cls = value.getClass();
            JsonSerializer<Object> jsonSerializerSerializerFor = this.f362a.serializerFor(cls);
            if (jsonSerializerSerializerFor == null) {
                try {
                    jsonSerializerE = e(this.f362a, cls, serializerProvider);
                } catch (ym unused) {
                    return false;
                }
            } else {
                jsonSerializerE = jsonSerializerSerializerFor;
            }
        }
        Object obj = this.i;
        if (obj == d) {
            return jsonSerializerE.isEmpty(serializerProvider, value);
        }
        return obj.equals(value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject(entry);
        d(entry, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.setCurrentValue(entry);
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(entry, JsonToken.START_OBJECT));
        d(entry, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    protected void d(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer;
        JsonSerializer<Object> jsonSerializerE;
        TypeSerializer typeSerializer = this.k;
        Object key = entry.getKey();
        if (key == null) {
            jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this.e, this.h);
        } else {
            jsonSerializerFindNullKeySerializer = this.f364c;
        }
        Object value = entry.getValue();
        if (value == null) {
            if (this.f) {
                return;
            } else {
                jsonSerializerE = serializerProvider.getDefaultNullValueSerializer();
            }
        } else {
            jsonSerializerE = this.g;
            if (jsonSerializerE == null) {
                Class<?> cls = value.getClass();
                JsonSerializer<Object> jsonSerializerSerializerFor = this.f362a.serializerFor(cls);
                if (jsonSerializerSerializerFor != null) {
                    jsonSerializerE = jsonSerializerSerializerFor;
                } else if (this.j.hasGenericTypes()) {
                    jsonSerializerE = b(this.f362a, serializerProvider.constructSpecializedType(this.j, cls), serializerProvider);
                } else {
                    jsonSerializerE = e(this.f362a, cls, serializerProvider);
                }
            }
            Object obj = this.i;
            if (obj != null && ((obj == d && jsonSerializerE.isEmpty(serializerProvider, value)) || this.i.equals(value))) {
                return;
            }
        }
        jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
        try {
            if (typeSerializer == null) {
                jsonSerializerE.serialize(value, jsonGenerator, serializerProvider);
            } else {
                jsonSerializerE.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
            }
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, entry, "" + key);
        }
    }

    protected final JsonSerializer<Object> e(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws ym {
        PropertySerializerMap.d dVarFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this.h);
        if (propertySerializerMap != dVarFindAndAddSecondarySerializer.f4190a) {
            this.f362a = dVarFindAndAddSecondarySerializer.f4190a;
        }
        return dVarFindAndAddSecondarySerializer.f4191b;
    }

    protected final JsonSerializer<Object> b(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws ym {
        PropertySerializerMap.d dVarFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this.h);
        if (propertySerializerMap != dVarFindAndAddSecondarySerializer.f4190a) {
            this.f362a = dVarFindAndAddSecondarySerializer.f4190a;
        }
        return dVarFindAndAddSecondarySerializer.f4191b;
    }
}

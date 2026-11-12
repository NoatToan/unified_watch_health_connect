package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ij1;
import defpackage.qh2;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements cj4 {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected com.fasterxml.jackson.databind.ser.impl.a _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected eud<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected eud<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final e5q _valueTypeSerializer;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7693a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f7693a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7693a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7693a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7693a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7693a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7693a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, e5q e5qVar, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = e5qVar;
        this._property = beanProperty;
        this._dynamicValueSerializers = com.fasterxml.jackson.databind.ser.impl.a.a();
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    public final eud<Object> _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.a aVar, Class<?> cls, wwl wwlVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.ser.impl.a.d dVarG = aVar.g(cls, wwlVar, this._property);
        com.fasterxml.jackson.databind.ser.impl.a aVar2 = dVarG.f7701b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return dVarG.f7700a;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
        return new MapEntrySerializer(this, this._property, e5qVar, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarSerializerInstance;
        eud<?> eudVarSerializerInstance2;
        Object obj;
        boolean z;
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        boolean zIncludeFilterSuppressNulls;
        AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
        Object objA = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (member == null || annotationIntrospector == null) {
            eudVarSerializerInstance = null;
            eudVarSerializerInstance2 = null;
        } else {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            eudVarSerializerInstance2 = objFindKeySerializer != null ? wwlVar.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            eudVarSerializerInstance = objFindContentSerializer != null ? wwlVar.serializerInstance(member, objFindContentSerializer) : null;
        }
        if (eudVarSerializerInstance == null) {
            eudVarSerializerInstance = this._valueSerializer;
        }
        eud<?> eudVarFindContextualConvertingSerializer = findContextualConvertingSerializer(wwlVar, beanProperty, eudVarSerializerInstance);
        if (eudVarFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            eudVarFindContextualConvertingSerializer = wwlVar.findValueSerializer(this._valueType, beanProperty);
        }
        eud<?> eudVar = eudVarFindContextualConvertingSerializer;
        if (eudVarSerializerInstance2 == null) {
            eudVarSerializerInstance2 = this._keySerializer;
        }
        eud<?> eudVarFindKeySerializer = eudVarSerializerInstance2 == null ? wwlVar.findKeySerializer(this._keyType, beanProperty) : wwlVar.handleSecondaryContextualization(eudVarSerializerInstance2, beanProperty);
        Object obj2 = this._suppressableValue;
        boolean z2 = this._suppressNulls;
        if (beanProperty == null || (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(wwlVar.getConfig(), null)) == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            obj = obj2;
        } else {
            int i = a.f7693a[contentInclusion.ordinal()];
            z2 = true;
            if (i == 1) {
                objA = qh2.a(this._valueType);
                if (objA != null && objA.getClass().isArray()) {
                    objA = ij1.b(objA);
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        objA = wwlVar.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                        if (objA != null) {
                            zIncludeFilterSuppressNulls = wwlVar.includeFilterSuppressNulls(objA);
                            z = zIncludeFilterSuppressNulls;
                            obj = objA;
                        }
                    } else if (i != 5) {
                        zIncludeFilterSuppressNulls = false;
                        z = zIncludeFilterSuppressNulls;
                        obj = objA;
                    }
                    return withResolved(beanProperty, eudVarFindKeySerializer, eudVar, obj, z);
                }
                objA = MARKER_FOR_EMPTY;
            } else if (this._valueType.isReferenceType()) {
                objA = MARKER_FOR_EMPTY;
            }
            obj = objA;
        }
        z = z2;
        return withResolved(beanProperty, eudVarFindKeySerializer, eudVar, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public eud<?> getContentSerializer() {
        return this._valueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        eud<Object> eudVar_findAndAddDynamic;
        e5q e5qVar = this._valueTypeSerializer;
        Object key = entry.getKey();
        eud<Object> eudVarFindNullKeySerializer = key == null ? wwlVar.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
        Object value = entry.getValue();
        if (value != null) {
            eudVar_findAndAddDynamic = this._valueSerializer;
            if (eudVar_findAndAddDynamic == null) {
                Class<?> cls = value.getClass();
                eud<Object> eudVarI = this._dynamicValueSerializers.i(cls);
                if (eudVarI == null) {
                    eudVar_findAndAddDynamic = this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, wwlVar.constructSpecializedType(this._valueType, cls), wwlVar) : _findAndAddDynamic(this._dynamicValueSerializers, cls, wwlVar);
                } else {
                    eudVar_findAndAddDynamic = eudVarI;
                }
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == MARKER_FOR_EMPTY && eudVar_findAndAddDynamic.isEmpty(wwlVar, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            eudVar_findAndAddDynamic = wwlVar.getDefaultNullValueSerializer();
        }
        eudVarFindNullKeySerializer.serialize(key, jsonGenerator, wwlVar);
        try {
            if (e5qVar == null) {
                eudVar_findAndAddDynamic.serialize(value, jsonGenerator, wwlVar);
            } else {
                eudVar_findAndAddDynamic.serializeWithType(value, jsonGenerator, wwlVar, e5qVar);
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, entry, "" + key);
        }
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z) {
        return (this._suppressableValue == obj && this._suppressNulls == z) ? this : new MapEntrySerializer(this, this._property, this._valueTypeSerializer, this._keySerializer, this._valueSerializer, obj, z);
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, eud<?> eudVar, eud<?> eudVar2, Object obj, boolean z) {
        return new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, eudVar, eudVar2, obj, z);
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        eud<Object> eudVar_findAndAddDynamic = this._valueSerializer;
        if (eudVar_findAndAddDynamic == null) {
            Class<?> cls = value.getClass();
            eud<Object> eudVarI = this._dynamicValueSerializers.i(cls);
            if (eudVarI == null) {
                try {
                    eudVar_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, cls, wwlVar);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                eudVar_findAndAddDynamic = eudVarI;
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? eudVar_findAndAddDynamic.isEmpty(wwlVar, value) : obj.equals(value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.O0(entry);
        serializeDynamic(entry, jsonGenerator, wwlVar);
        jsonGenerator.m0();
    }

    @Override // defpackage.eud
    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        jsonGenerator.M(entry);
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    public final eud<Object> _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.a aVar, JavaType javaType, wwl wwlVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.ser.impl.a.d dVarF = aVar.f(javaType, wwlVar, this._property);
        com.fasterxml.jackson.databind.ser.impl.a aVar2 = dVarF.f7701b;
        if (aVar != aVar2) {
            this._dynamicValueSerializers = aVar2;
        }
        return dVarF.f7700a;
    }

    @Deprecated
    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, eud<?> eudVar2) {
        this(mapEntrySerializer, beanProperty, e5qVar, eudVar, eudVar2, mapEntrySerializer._suppressableValue, mapEntrySerializer._suppressNulls);
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, eud<?> eudVar2, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = eudVar;
        this._valueSerializer = eudVar2;
        this._dynamicValueSerializers = com.fasterxml.jackson.databind.ser.impl.a.a();
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}

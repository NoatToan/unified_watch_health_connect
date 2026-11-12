package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ij1;
import defpackage.ksd;
import defpackage.qh2;
import defpackage.wwl;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements cj4 {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient com.fasterxml.jackson.databind.ser.impl.a _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final eud<Object> _valueSerializer;
    protected final e5q _valueTypeSerializer;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7712a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f7712a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7712a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7712a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7712a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7712a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7712a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, e5q e5qVar, eud<Object> eudVar) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = e5qVar;
        this._valueSerializer = eudVar;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = com.fasterxml.jackson.databind.ser.impl.a.a();
    }

    private final eud<Object> _findCachedSerializer(wwl wwlVar, Class<?> cls) throws JsonMappingException {
        eud<Object> eudVarI = this._dynamicSerializers.i(cls);
        if (eudVarI != null) {
            return eudVarI;
        }
        eud<Object> eudVarFindValueSerializer = this._referredType.hasGenericTypes() ? wwlVar.findValueSerializer(wwlVar.constructSpecializedType(this._referredType, cls), this._property) : wwlVar.findValueSerializer(cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            eudVarFindValueSerializer = eudVarFindValueSerializer.unwrappingSerializer(nameTransformer);
        }
        eud<Object> eudVar = eudVarFindValueSerializer;
        this._dynamicSerializers = this._dynamicSerializers.h(cls, eudVar);
        return eudVar;
    }

    private final eud<Object> _findSerializer(wwl wwlVar, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return wwlVar.findValueSerializer(javaType, beanProperty);
    }

    public abstract Object _getReferenced(T t);

    public abstract Object _getReferencedIfPresent(T t);

    public abstract boolean _isValuePresent(T t);

    public boolean _useStatic(wwl wwlVar, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing typingFindSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (typingFindSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (typingFindSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return wwlVar.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        eud<Object> eudVar_findSerializer = this._valueSerializer;
        if (eudVar_findSerializer == null) {
            eudVar_findSerializer = _findSerializer(ksdVar.a(), this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                eudVar_findSerializer = eudVar_findSerializer.unwrappingSerializer(nameTransformer);
            }
        }
        eudVar_findSerializer.acceptJsonFormatVisitor(ksdVar, this._referredType);
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object objA;
        e5q e5qVarA = this._valueTypeSerializer;
        if (e5qVarA != null) {
            e5qVarA = e5qVarA.a(beanProperty);
        }
        eud<?> eudVarFindAnnotatedContentSerializer = findAnnotatedContentSerializer(wwlVar, beanProperty);
        if (eudVarFindAnnotatedContentSerializer == null) {
            eudVarFindAnnotatedContentSerializer = this._valueSerializer;
            if (eudVarFindAnnotatedContentSerializer != null) {
                eudVarFindAnnotatedContentSerializer = wwlVar.handlePrimaryContextualization(eudVarFindAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(wwlVar, beanProperty, this._referredType)) {
                eudVarFindAnnotatedContentSerializer = _findSerializer(wwlVar, this._referredType, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> referenceTypeSerializerWithResolved = (this._property == beanProperty && this._valueTypeSerializer == e5qVarA && this._valueSerializer == eudVarFindAnnotatedContentSerializer) ? this : withResolved(beanProperty, e5qVarA, eudVarFindAnnotatedContentSerializer, this._unwrapper);
        if (beanProperty == null || (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(wwlVar.getConfig(), handledType())) == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return referenceTypeSerializerWithResolved;
        }
        int i = a.f7712a[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i != 1) {
            objA = null;
            if (i != 2) {
                if (i == 3) {
                    objA = MARKER_FOR_EMPTY;
                } else if (i == 4) {
                    objA = wwlVar.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                    if (objA != null) {
                        zIncludeFilterSuppressNulls = wwlVar.includeFilterSuppressNulls(objA);
                    }
                } else if (i != 5) {
                    zIncludeFilterSuppressNulls = false;
                }
            } else if (this._referredType.isReferenceType()) {
                objA = MARKER_FOR_EMPTY;
            }
        } else {
            objA = qh2.a(this._referredType);
            if (objA != null && objA.getClass().isArray()) {
                objA = ij1.b(objA);
            }
        }
        return (this._suppressableValue == objA && this._suppressNulls == zIncludeFilterSuppressNulls) ? referenceTypeSerializerWithResolved : referenceTypeSerializerWithResolved.withContentInclusion(objA, zIncludeFilterSuppressNulls);
    }

    public JavaType getReferredType() {
        return this._referredType;
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, T t) {
        if (!_isValuePresent(t)) {
            return true;
        }
        Object obj_getReferenced = _getReferenced(t);
        if (obj_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        eud<Object> eudVar_findCachedSerializer = this._valueSerializer;
        if (eudVar_findCachedSerializer == null) {
            try {
                eudVar_findCachedSerializer = _findCachedSerializer(wwlVar, obj_getReferenced.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? eudVar_findCachedSerializer.isEmpty(wwlVar, obj_getReferenced) : obj.equals(obj_getReferenced);
    }

    @Override // defpackage.eud
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                wwlVar.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        eud<Object> eudVar_findCachedSerializer = this._valueSerializer;
        if (eudVar_findCachedSerializer == null) {
            eudVar_findCachedSerializer = _findCachedSerializer(wwlVar, obj_getReferencedIfPresent.getClass());
        }
        e5q e5qVar = this._valueTypeSerializer;
        if (e5qVar != null) {
            eudVar_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, wwlVar, e5qVar);
        } else {
            eudVar_findCachedSerializer.serialize(obj_getReferencedIfPresent, jsonGenerator, wwlVar);
        }
    }

    @Override // defpackage.eud
    public void serializeWithType(T t, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                wwlVar.defaultSerializeNull(jsonGenerator);
            }
        } else {
            eud<Object> eudVar_findCachedSerializer = this._valueSerializer;
            if (eudVar_findCachedSerializer == null) {
                eudVar_findCachedSerializer = _findCachedSerializer(wwlVar, obj_getReferencedIfPresent.getClass());
            }
            eudVar_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, wwlVar, e5qVar);
        }
    }

    @Override // defpackage.eud
    public eud<T> unwrappingSerializer(NameTransformer nameTransformer) {
        eud<?> eudVarUnwrappingSerializer = this._valueSerializer;
        if (eudVarUnwrappingSerializer != null) {
            eudVarUnwrappingSerializer = eudVarUnwrappingSerializer.unwrappingSerializer(nameTransformer);
        }
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        return (this._valueSerializer == eudVarUnwrappingSerializer && this._unwrapper == nameTransformer) ? this : withResolved(this._property, this._valueTypeSerializer, eudVarUnwrappingSerializer, nameTransformer);
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, e5q e5qVar, eud<?> eudVar, NameTransformer nameTransformer, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = com.fasterxml.jackson.databind.ser.impl.a.a();
        this._property = beanProperty;
        this._valueTypeSerializer = e5qVar;
        this._valueSerializer = eudVar;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}

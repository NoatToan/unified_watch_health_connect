package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.huawei.hianalytics.core.storage.Event;
import defpackage.acv;
import defpackage.aeu;
import defpackage.aez;
import defpackage.afa;
import defpackage.afb;
import defpackage.afj;
import defpackage.afk;
import defpackage.afn;
import defpackage.afy;
import defpackage.age;
import defpackage.agu;
import defpackage.aht;
import defpackage.ahw;
import defpackage.ahy;
import defpackage.ym;
import defpackage.ys;
import defpackage.yt;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer, JsonFormatVisitable, SchemaAware {
    protected static final ys NAME_FOR_OBJECT_REF = new ys("#object-ref");
    public static final aez[] NO_PROPS = new aez[0];
    protected final afb _anyGetterWriter;
    protected final JavaType _beanType;
    protected final aez[] _filteredProps;
    protected final afj _objectIdWriter;
    protected final Object _propertyFilterId;
    protected final aez[] _props;
    protected final JsonFormat.Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    protected abstract BeanSerializerBase asArraySerializer();

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    protected abstract BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public abstract BeanSerializerBase withFilterId(Object obj);

    public abstract BeanSerializerBase withObjectIdWriter(afj afjVar);

    protected abstract BeanSerializerBase withProperties(aez[] aezVarArr, aez[] aezVarArr2);

    public BeanSerializerBase(JavaType javaType, afa afaVar, aez[] aezVarArr, aez[] aezVarArr2) {
        super(javaType);
        this._beanType = javaType;
        this._props = aezVarArr;
        this._filteredProps = aezVarArr2;
        if (afaVar == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
            this._serializationShape = null;
            return;
        }
        this._typeId = afaVar.j();
        this._anyGetterWriter = afaVar.b();
        this._propertyFilterId = afaVar.a();
        this._objectIdWriter = afaVar.f();
        this._serializationShape = afaVar.d().findExpectedFormat(null).b();
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, aez[] aezVarArr, aez[] aezVarArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = aezVarArr;
        this._filteredProps = aezVarArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, afj afjVar) {
        this(beanSerializerBase, afjVar, beanSerializerBase._propertyFilterId);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, afj afjVar, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = afjVar;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    @Deprecated
    protected BeanSerializerBase(BeanSerializerBase beanSerializerBase, String[] strArr) {
        this(beanSerializerBase, aht.b((Object[]) strArr), (Set<String>) null);
    }

    @Deprecated
    protected BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set) {
        this(beanSerializerBase, set, (Set<String>) null);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        aez[] aezVarArr = beanSerializerBase._props;
        aez[] aezVarArr2 = beanSerializerBase._filteredProps;
        int length = aezVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = aezVarArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            aez aezVar = aezVarArr[i];
            if (!ahy.b(aezVar.getName(), set, set2)) {
                arrayList.add(aezVar);
                if (aezVarArr2 != null) {
                    arrayList2.add(aezVarArr2[i]);
                }
            }
        }
        this._props = (aez[]) arrayList.toArray(new aez[arrayList.size()]);
        this._filteredProps = arrayList2 != null ? (aez[]) arrayList2.toArray(new aez[arrayList2.size()]) : null;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    @Deprecated
    protected BeanSerializerBase withIgnorals(Set<String> set) {
        return withByNameInclusion(set, null);
    }

    @Deprecated
    protected BeanSerializerBase withIgnorals(String[] strArr) {
        return withIgnorals(aht.b((Object[]) strArr));
    }

    protected BeanSerializerBase(BeanSerializerBase beanSerializerBase) {
        this(beanSerializerBase, beanSerializerBase._props, beanSerializerBase._filteredProps);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, rename(beanSerializerBase._props, nameTransformer), rename(beanSerializerBase._filteredProps, nameTransformer));
    }

    private static final aez[] rename(aez[] aezVarArr, NameTransformer nameTransformer) {
        if (aezVarArr == null || aezVarArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return aezVarArr;
        }
        int length = aezVarArr.length;
        aez[] aezVarArr2 = new aez[length];
        for (int i = 0; i < length; i++) {
            aez aezVar = aezVarArr[i];
            if (aezVar != null) {
                aezVarArr2[i] = aezVar.rename(nameTransformer);
            }
        }
        return aezVarArr2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    public void resolve(SerializerProvider serializerProvider) throws ym {
        aez aezVar;
        TypeSerializer typeSerializer;
        JsonSerializer<Object> jsonSerializerFindNullValueSerializer;
        aez aezVar2;
        aez[] aezVarArr = this._filteredProps;
        int length = aezVarArr == null ? 0 : aezVarArr.length;
        int length2 = this._props.length;
        for (int i = 0; i < length2; i++) {
            aez aezVar3 = this._props[i];
            if (!aezVar3.willSuppressNulls() && !aezVar3.hasNullSerializer() && (jsonSerializerFindNullValueSerializer = serializerProvider.findNullValueSerializer(aezVar3)) != null) {
                aezVar3.assignNullSerializer(jsonSerializerFindNullValueSerializer);
                if (i < length && (aezVar2 = this._filteredProps[i]) != null) {
                    aezVar2.assignNullSerializer(jsonSerializerFindNullValueSerializer);
                }
            }
            if (!aezVar3.hasSerializer()) {
                JsonSerializer<Object> jsonSerializerFindConvertingSerializer = findConvertingSerializer(serializerProvider, aezVar3);
                if (jsonSerializerFindConvertingSerializer == null) {
                    JavaType serializationType = aezVar3.getSerializationType();
                    if (serializationType == null) {
                        serializationType = aezVar3.getType();
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                aezVar3.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    JsonSerializer<Object> jsonSerializerFindValueSerializer = serializerProvider.findValueSerializer(serializationType, aezVar3);
                    jsonSerializerFindConvertingSerializer = (serializationType.isContainerType() && (typeSerializer = (TypeSerializer) serializationType.getContentType().getTypeHandler()) != null && (jsonSerializerFindValueSerializer instanceof ContainerSerializer)) ? ((ContainerSerializer) jsonSerializerFindValueSerializer).withValueTypeSerializer(typeSerializer) : jsonSerializerFindValueSerializer;
                    if (i >= length) {
                        aezVar3.assignSerializer(jsonSerializerFindConvertingSerializer);
                    } else {
                        aezVar3.assignSerializer(jsonSerializerFindConvertingSerializer);
                    }
                } else if (i >= length && (aezVar = this._filteredProps[i]) != null) {
                    aezVar.assignSerializer(jsonSerializerFindConvertingSerializer);
                } else {
                    aezVar3.assignSerializer(jsonSerializerFindConvertingSerializer);
                }
            }
        }
        afb afbVar = this._anyGetterWriter;
        if (afbVar != null) {
            afbVar.a(serializerProvider);
        }
    }

    protected JsonSerializer<Object> findConvertingSerializer(SerializerProvider serializerProvider, aez aezVar) throws ym {
        AnnotatedMember member;
        Object objFindSerializationConverter;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector == null || (member = aezVar.getMember()) == null || (objFindSerializationConverter = annotationIntrospector.findSerializationConverter(member)) == null) {
            return null;
        }
        Converter<Object, Object> converterConverterInstance = serializerProvider.converterInstance(aezVar.getMember(), objFindSerializationConverter);
        JavaType outputType = converterConverterInstance.getOutputType(serializerProvider.getTypeFactory());
        return new agu(converterConverterInstance, outputType, outputType.isJavaLangObject() ? null : serializerProvider.findValueSerializer(outputType, aezVar));
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonFormat.Shape shapeB;
        Object objFindFilterId;
        Set<String> setB;
        Set<String> setE;
        int i;
        BeanSerializerBase beanSerializerBaseWithFilterId;
        afj afjVarC;
        aez aezVar;
        Object obj;
        acv acvVarFindObjectReferenceInfo;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        aez[] aezVarArr = null;
        AnnotatedMember member = (beanProperty == null || annotationIntrospector == null) ? null : beanProperty.getMember();
        yt config = serializerProvider.getConfig();
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, this._handledType);
        if (cVarFindFormatOverrides == null || !cVarFindFormatOverrides.g()) {
            shapeB = null;
        } else {
            shapeB = cVarFindFormatOverrides.b();
            if (shapeB != JsonFormat.Shape.ANY && shapeB != this._serializationShape) {
                if (this._beanType.isEnumType()) {
                    int i2 = AnonymousClass4.d[shapeB.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        return serializerProvider.handlePrimaryContextualization(age.b(this._beanType.getRawClass(), serializerProvider.getConfig(), config.introspectClassAnnotations(this._beanType), cVarFindFormatOverrides), beanProperty);
                    }
                } else if (shapeB == JsonFormat.Shape.NATURAL && ((!this._beanType.isMapLikeType() || !Map.class.isAssignableFrom(this._handledType)) && Map.Entry.class.isAssignableFrom(this._handledType))) {
                    JavaType javaTypeFindSuperType = this._beanType.findSuperType(Map.Entry.class);
                    return serializerProvider.handlePrimaryContextualization(new afk(this._beanType, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1), false, null, beanProperty), beanProperty);
                }
            }
        }
        afj afjVarB = this._objectIdWriter;
        if (member != null) {
            setE = annotationIntrospector.findPropertyIgnoralByName(config, member).e();
            setB = annotationIntrospector.findPropertyInclusionByName(config, member).b();
            acv acvVarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (acvVarFindObjectIdInfo == null) {
                if (afjVarB != null && (acvVarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, null)) != null) {
                    afjVarB = this._objectIdWriter.a(acvVarFindObjectReferenceInfo.b());
                }
                i = 0;
            } else {
                acv acvVarFindObjectReferenceInfo2 = annotationIntrospector.findObjectReferenceInfo(member, acvVarFindObjectIdInfo);
                Class<? extends ObjectIdGenerator<?>> clsE = acvVarFindObjectReferenceInfo2.e();
                JavaType javaType = serializerProvider.getTypeFactory().a(serializerProvider.constructType(clsE), ObjectIdGenerator.class)[0];
                if (clsE == ObjectIdGenerators.PropertyGenerator.class) {
                    String strB = acvVarFindObjectReferenceInfo2.c().b();
                    int length = this._props.length;
                    i = 0;
                    while (true) {
                        if (i == length) {
                            serializerProvider.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", ahw.u(handledType()), ahw.e(strB)));
                        }
                        aezVar = this._props[i];
                        if (strB.equals(aezVar.getName())) {
                            break;
                        }
                        i++;
                    }
                    JavaType type = aezVar.getType();
                    afn afnVar = new afn(acvVarFindObjectReferenceInfo2, aezVar);
                    afjVarB = afj.b(type, null, afnVar, acvVarFindObjectReferenceInfo2.b());
                } else {
                    afjVarB = afj.b(javaType, acvVarFindObjectReferenceInfo2.c(), serializerProvider.objectIdGeneratorInstance(member, acvVarFindObjectReferenceInfo2), acvVarFindObjectReferenceInfo2.b());
                    i = 0;
                }
            }
            objFindFilterId = annotationIntrospector.findFilterId(member);
            if (objFindFilterId == null || ((obj = this._propertyFilterId) != null && objFindFilterId.equals(obj))) {
                objFindFilterId = null;
            }
        } else {
            objFindFilterId = null;
            setB = null;
            setE = null;
            i = 0;
        }
        if (i > 0) {
            aez[] aezVarArr2 = this._props;
            aez[] aezVarArr3 = (aez[]) Arrays.copyOf(aezVarArr2, aezVarArr2.length);
            aez aezVar2 = aezVarArr3[i];
            System.arraycopy(aezVarArr3, 0, aezVarArr3, 1, i);
            aezVarArr3[0] = aezVar2;
            aez[] aezVarArr4 = this._filteredProps;
            if (aezVarArr4 != null) {
                aezVarArr = (aez[]) Arrays.copyOf(aezVarArr4, aezVarArr4.length);
                aez aezVar3 = aezVarArr[i];
                System.arraycopy(aezVarArr, 0, aezVarArr, 1, i);
                aezVarArr[0] = aezVar3;
            }
            beanSerializerBaseWithFilterId = withProperties(aezVarArr3, aezVarArr);
        } else {
            beanSerializerBaseWithFilterId = this;
        }
        if (afjVarB != null && (afjVarC = afjVarB.c(serializerProvider.findValueSerializer(afjVarB.f359a, beanProperty))) != this._objectIdWriter) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withObjectIdWriter(afjVarC);
        }
        if ((setE != null && !setE.isEmpty()) || setB != null) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withByNameInclusion(setE, setB);
        }
        if (objFindFilterId != null) {
            beanSerializerBaseWithFilterId = beanSerializerBaseWithFilterId.withFilterId(objFindFilterId);
        }
        if (shapeB == null) {
            shapeB = this._serializationShape;
        }
        return shapeB == JsonFormat.Shape.ARRAY ? beanSerializerBaseWithFilterId.asArraySerializer() : beanSerializerBaseWithFilterId;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            d = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[JsonFormat.Shape.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public Iterator<PropertyWriter> properties() {
        return Arrays.asList(this._props).iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean usesObjectId() {
        return this._objectIdWriter != null;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.setCurrentValue(obj);
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        jsonGenerator.setCurrentValue(obj);
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.writeTypePrefix(jsonGenerator, writableTypeId_typeIdDef);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId_typeIdDef);
    }

    protected final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z) throws IOException {
        afj afjVar = this._objectIdWriter;
        afy afyVarFindObjectId = serializerProvider.findObjectId(obj, afjVar.f361c);
        if (afyVarFindObjectId.d(jsonGenerator, serializerProvider, afjVar)) {
            return;
        }
        Object objD = afyVarFindObjectId.d(obj);
        if (afjVar.f360b) {
            afjVar.d.serialize(objD, jsonGenerator, serializerProvider);
            return;
        }
        if (z) {
            jsonGenerator.writeStartObject(obj);
        }
        afyVarFindObjectId.e(jsonGenerator, serializerProvider, afjVar);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    protected final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        afj afjVar = this._objectIdWriter;
        afy afyVarFindObjectId = serializerProvider.findObjectId(obj, afjVar.f361c);
        if (afyVarFindObjectId.d(jsonGenerator, serializerProvider, afjVar)) {
            return;
        }
        Object objD = afyVarFindObjectId.d(obj);
        if (afjVar.f360b) {
            afjVar.d.serialize(objD, jsonGenerator, serializerProvider);
        } else {
            _serializeObjectId(obj, jsonGenerator, serializerProvider, typeSerializer, afyVarFindObjectId);
        }
    }

    protected void _serializeObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer, afy afyVar) throws IOException {
        afj afjVar = this._objectIdWriter;
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.writeTypePrefix(jsonGenerator, writableTypeId_typeIdDef);
        afyVar.e(jsonGenerator, serializerProvider, afjVar);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId_typeIdDef);
    }

    protected final WritableTypeId _typeIdDef(TypeSerializer typeSerializer, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this._typeId;
        if (annotatedMember == null) {
            return typeSerializer.typeId(obj, jsonToken);
        }
        Object value = annotatedMember.getValue(obj);
        if (value == null) {
            value = "";
        }
        return typeSerializer.typeId(obj, jsonToken, value);
    }

    @Deprecated
    protected final String _customTypeId(Object obj) {
        Object value = this._typeId.getValue(obj);
        if (value == null) {
            return "";
        }
        return value instanceof String ? (String) value : value.toString();
    }

    protected void serializeFields(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        aez[] aezVarArr;
        if (this._filteredProps != null && serializerProvider.getActiveView() != null) {
            aezVarArr = this._filteredProps;
        } else {
            aezVarArr = this._props;
        }
        int i = 0;
        try {
            int length = aezVarArr.length;
            while (i < length) {
                aez aezVar = aezVarArr[i];
                if (aezVar != null) {
                    aezVar.serializeAsField(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
            afb afbVar = this._anyGetterWriter;
            if (afbVar != null) {
                afbVar.d(obj, jsonGenerator, serializerProvider);
            }
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, i != aezVarArr.length ? aezVarArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            ym ymVar = new ym(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            ymVar.prependPath(new ym.e(obj, i != aezVarArr.length ? aezVarArr[i].getName() : "[anySetter]"));
            throw ymVar;
        }
    }

    protected void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        aez[] aezVarArr;
        if (this._filteredProps != null && serializerProvider.getActiveView() != null) {
            aezVarArr = this._filteredProps;
        } else {
            aezVarArr = this._props;
        }
        PropertyFilter propertyFilterFindPropertyFilter = findPropertyFilter(serializerProvider, this._propertyFilterId, obj);
        if (propertyFilterFindPropertyFilter == null) {
            serializeFields(obj, jsonGenerator, serializerProvider);
            return;
        }
        int i = 0;
        try {
            int length = aezVarArr.length;
            while (i < length) {
                aez aezVar = aezVarArr[i];
                if (aezVar != null) {
                    propertyFilterFindPropertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, aezVar);
                }
                i++;
            }
            afb afbVar = this._anyGetterWriter;
            if (afbVar != null) {
                afbVar.a(obj, jsonGenerator, serializerProvider, propertyFilterFindPropertyFilter);
            }
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, i != aezVarArr.length ? aezVarArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            ym ymVar = new ym(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            ymVar.prependPath(new ym.e(obj, i != aezVarArr.length ? aezVarArr[i].getName() : "[anySetter]"));
            throw ymVar;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    @Deprecated
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws ym {
        String strId;
        aeu aeuVarCreateSchemaNode = createSchemaNode("object", true);
        JsonSerializableSchema jsonSerializableSchema = (JsonSerializableSchema) this._handledType.getAnnotation(JsonSerializableSchema.class);
        if (jsonSerializableSchema != null && (strId = jsonSerializableSchema.id()) != null && !strId.isEmpty()) {
            aeuVarCreateSchemaNode.c("id", strId);
        }
        aeu aeuVarObjectNode = aeuVarCreateSchemaNode.objectNode();
        Object obj = this._propertyFilterId;
        PropertyFilter propertyFilterFindPropertyFilter = obj != null ? findPropertyFilter(serializerProvider, obj, null) : null;
        int i = 0;
        while (true) {
            aez[] aezVarArr = this._props;
            if (i < aezVarArr.length) {
                aez aezVar = aezVarArr[i];
                if (propertyFilterFindPropertyFilter == null) {
                    aezVar.depositSchemaProperty(aeuVarObjectNode, serializerProvider);
                } else {
                    propertyFilterFindPropertyFilter.depositSchemaProperty(aezVar, aeuVarObjectNode, serializerProvider);
                }
                i++;
            } else {
                aeuVarCreateSchemaNode.b(Event.EventConstants.PROPERTIES, aeuVarObjectNode);
                return aeuVarCreateSchemaNode;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        JsonObjectFormatVisitor jsonObjectFormatVisitorExpectObjectFormat;
        aez[] aezVarArr;
        if (jsonFormatVisitorWrapper == null || (jsonObjectFormatVisitorExpectObjectFormat = jsonFormatVisitorWrapper.expectObjectFormat(javaType)) == null) {
            return;
        }
        SerializerProvider provider = jsonFormatVisitorWrapper.getProvider();
        Class<?> activeView = null;
        int i = 0;
        if (this._propertyFilterId != null) {
            PropertyFilter propertyFilterFindPropertyFilter = findPropertyFilter(jsonFormatVisitorWrapper.getProvider(), this._propertyFilterId, null);
            int length = this._props.length;
            while (i < length) {
                propertyFilterFindPropertyFilter.depositSchemaProperty(this._props[i], jsonObjectFormatVisitorExpectObjectFormat, provider);
                i++;
            }
            return;
        }
        if (this._filteredProps != null && provider != null) {
            activeView = provider.getActiveView();
        }
        if (activeView != null) {
            aezVarArr = this._filteredProps;
        } else {
            aezVarArr = this._props;
        }
        int length2 = aezVarArr.length;
        while (i < length2) {
            aez aezVar = aezVarArr[i];
            if (aezVar != null) {
                aezVar.depositSchemaProperty(jsonObjectFormatVisitorExpectObjectFormat, provider);
            }
            i++;
        }
    }
}

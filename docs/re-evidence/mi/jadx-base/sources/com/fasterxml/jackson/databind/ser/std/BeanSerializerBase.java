package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.a4h;
import defpackage.ak4;
import defpackage.bpr;
import defpackage.c4h;
import defpackage.cj4;
import defpackage.dqk;
import defpackage.dud;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ij1;
import defpackage.kh2;
import defpackage.ksd;
import defpackage.odi;
import defpackage.qd1;
import defpackage.rfl;
import defpackage.wwl;
import defpackage.z3h;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> implements cj4, dqk, rfl {
    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    protected static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    protected final qd1 _anyGetterWriter;
    protected final JavaType _beanType;
    protected final BeanPropertyWriter[] _filteredProps;
    protected final a4h _objectIdWriter;
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter[] _props;
    protected final JsonFormat.Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7705a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f7705a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7705a[JsonFormat.Shape.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7705a[JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BeanSerializerBase(JavaType javaType, kh2 kh2Var, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this._beanType = javaType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        if (kh2Var == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
            this._serializationShape = null;
            return;
        }
        this._typeId = kh2Var.h();
        this._anyGetterWriter = kh2Var.c();
        this._propertyFilterId = kh2Var.e();
        this._objectIdWriter = kh2Var.f();
        JsonFormat.Value valueG = kh2Var.d().g(null);
        this._serializationShape = valueG != null ? valueG.getShape() : null;
    }

    private static final BeanPropertyWriter[] rename(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i] = beanPropertyWriter.rename(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    @Deprecated
    public final String _customTypeId(Object obj) {
        Object value = this._typeId.getValue(obj);
        if (value == null) {
            return "";
        }
        return value instanceof String ? (String) value : value.toString();
    }

    public void _serializeObjectId(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar, bpr bprVar) throws IOException {
        a4h a4hVar = this._objectIdWriter;
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(e5qVar, obj, JsonToken.START_OBJECT);
        e5qVar.g(jsonGenerator, writableTypeId_typeIdDef);
        bprVar.b(jsonGenerator, wwlVar, a4hVar);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, wwlVar);
        } else {
            serializeFields(obj, jsonGenerator, wwlVar);
        }
        e5qVar.h(jsonGenerator, writableTypeId_typeIdDef);
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, boolean z) throws IOException {
        a4h a4hVar = this._objectIdWriter;
        bpr bprVarFindObjectId = wwlVar.findObjectId(obj, a4hVar.c);
        if (bprVarFindObjectId.c(jsonGenerator, wwlVar, a4hVar)) {
            return;
        }
        Object objA = bprVarFindObjectId.a(obj);
        if (a4hVar.e) {
            a4hVar.d.serialize(objA, jsonGenerator, wwlVar);
            return;
        }
        if (z) {
            jsonGenerator.O0(obj);
        }
        bprVarFindObjectId.b(jsonGenerator, wwlVar, a4hVar);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, wwlVar);
        } else {
            serializeFields(obj, jsonGenerator, wwlVar);
        }
        if (z) {
            jsonGenerator.m0();
        }
    }

    public final WritableTypeId _typeIdDef(e5q e5qVar, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this._typeId;
        if (annotatedMember == null) {
            return e5qVar.d(obj, jsonToken);
        }
        Object value = annotatedMember.getValue(obj);
        if (value == null) {
            value = "";
        }
        return e5qVar.e(obj, jsonToken, value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        if (ksdVar == null) {
            return;
        }
        ksdVar.d(javaType);
    }

    public abstract BeanSerializerBase asArraySerializer();

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Shape shape;
        Object obj;
        a4h a4hVarC;
        BeanPropertyWriter beanPropertyWriter;
        Object obj2;
        z3h z3hVarFindObjectReferenceInfo;
        AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
        Set<String> set = null;
        AnnotatedMember member = (beanProperty == null || annotationIntrospector == null) ? null : beanProperty.getMember();
        SerializationConfig config = wwlVar.getConfig();
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
        if (valueFindFormatOverrides == null || !valueFindFormatOverrides.hasShape()) {
            shape = null;
        } else {
            shape = valueFindFormatOverrides.getShape();
            if (shape != JsonFormat.Shape.ANY && shape != this._serializationShape) {
                if (this._handledType.isEnum()) {
                    int i = a.f7705a[shape.ordinal()];
                    if (i == 1 || i == 2 || i == 3) {
                        return wwlVar.handlePrimaryContextualization(EnumSerializer.construct(this._beanType.getRawClass(), wwlVar.getConfig(), config.introspectClassAnnotations(this._beanType), valueFindFormatOverrides), beanProperty);
                    }
                } else if (shape == JsonFormat.Shape.NATURAL && ((!this._beanType.isMapLikeType() || !Map.class.isAssignableFrom(this._handledType)) && Map.Entry.class.isAssignableFrom(this._handledType))) {
                    JavaType javaTypeFindSuperType = this._beanType.findSuperType(Map.Entry.class);
                    return wwlVar.handlePrimaryContextualization(new MapEntrySerializer(this._beanType, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1), false, null, beanProperty), beanProperty);
                }
            }
        }
        a4h a4hVarA = this._objectIdWriter;
        if (member != null) {
            JsonIgnoreProperties.Value valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member);
            Set<String> setFindIgnoredForSerialization = valueFindPropertyIgnorals != null ? valueFindPropertyIgnorals.findIgnoredForSerialization() : null;
            z3h z3hVarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (z3hVarFindObjectIdInfo == null) {
                if (a4hVarA != null && (z3hVarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, null)) != null) {
                    a4hVarA = this._objectIdWriter.b(z3hVarFindObjectReferenceInfo.b());
                }
                obj = null;
            } else {
                z3h z3hVarFindObjectReferenceInfo2 = annotationIntrospector.findObjectReferenceInfo(member, z3hVarFindObjectIdInfo);
                Class<? extends ObjectIdGenerator<?>> clsC = z3hVarFindObjectReferenceInfo2.c();
                JavaType javaType = wwlVar.getTypeFactory().findTypeParameters(wwlVar.constructType(clsC), ObjectIdGenerator.class)[0];
                if (clsC == ObjectIdGenerators$PropertyGenerator.class) {
                    String simpleName = z3hVarFindObjectReferenceInfo2.d().getSimpleName();
                    int length = this._props.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 == length) {
                            wwlVar.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", handledType().getName(), simpleName));
                        }
                        beanPropertyWriter = this._props[i2];
                        if (simpleName.equals(beanPropertyWriter.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 > 0) {
                        BeanPropertyWriter[] beanPropertyWriterArr = this._props;
                        System.arraycopy(beanPropertyWriterArr, 0, beanPropertyWriterArr, 1, i2);
                        this._props[0] = beanPropertyWriter;
                        BeanPropertyWriter[] beanPropertyWriterArr2 = this._filteredProps;
                        if (beanPropertyWriterArr2 != null) {
                            BeanPropertyWriter beanPropertyWriter2 = beanPropertyWriterArr2[i2];
                            System.arraycopy(beanPropertyWriterArr2, 0, beanPropertyWriterArr2, 1, i2);
                            this._filteredProps[0] = beanPropertyWriter2;
                        }
                    }
                    obj = null;
                    a4hVarA = a4h.a(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(z3hVarFindObjectReferenceInfo2, beanPropertyWriter), z3hVarFindObjectReferenceInfo2.b());
                } else {
                    obj = null;
                    a4hVarA = a4h.a(javaType, z3hVarFindObjectReferenceInfo2.d(), wwlVar.objectIdGeneratorInstance(member, z3hVarFindObjectReferenceInfo2), z3hVarFindObjectReferenceInfo2.b());
                }
            }
            Object objFindFilterId = annotationIntrospector.findFilterId(member);
            if (objFindFilterId != null && ((obj2 = this._propertyFilterId) == null || !objFindFilterId.equals(obj2))) {
                obj = objFindFilterId;
            }
            set = setFindIgnoredForSerialization;
        } else {
            obj = null;
        }
        BeanSerializerBase beanSerializerBaseWithObjectIdWriter = (a4hVarA == null || (a4hVarC = a4hVarA.c(wwlVar.findValueSerializer(a4hVarA.f604a, beanProperty))) == this._objectIdWriter) ? this : withObjectIdWriter(a4hVarC);
        if (set != null && !set.isEmpty()) {
            beanSerializerBaseWithObjectIdWriter = beanSerializerBaseWithObjectIdWriter.withIgnorals(set);
        }
        if (obj != null) {
            beanSerializerBaseWithObjectIdWriter = beanSerializerBaseWithObjectIdWriter.withFilterId(obj);
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanSerializerBaseWithObjectIdWriter.asArraySerializer() : beanSerializerBaseWithObjectIdWriter;
    }

    public eud<Object> findConvertingSerializer(wwl wwlVar, BeanPropertyWriter beanPropertyWriter) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindSerializationConverter;
        AnnotationIntrospector annotationIntrospector = wwlVar.getAnnotationIntrospector();
        if (annotationIntrospector == null || (member = beanPropertyWriter.getMember()) == null || (objFindSerializationConverter = annotationIntrospector.findSerializationConverter(member)) == null) {
            return null;
        }
        ak4<Object, Object> ak4VarConverterInstance = wwlVar.converterInstance(beanPropertyWriter.getMember(), objFindSerializationConverter);
        JavaType javaTypeB = ak4VarConverterInstance.b(wwlVar.getTypeFactory());
        return new StdDelegatingSerializer(ak4VarConverterInstance, javaTypeB, javaTypeB.isJavaLangObject() ? null : wwlVar.findValueSerializer(javaTypeB, beanPropertyWriter));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    @Deprecated
    public zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException {
        String strId;
        c4h c4hVarCreateSchemaNode = createSchemaNode("object", true);
        dud dudVar = (dud) this._handledType.getAnnotation(dud.class);
        if (dudVar != null && (strId = dudVar.id()) != null && strId.length() > 0) {
            c4hVarCreateSchemaNode.j0("id", strId);
        }
        c4h c4hVarA0 = c4hVarCreateSchemaNode.a0();
        Object obj = this._propertyFilterId;
        odi odiVarFindPropertyFilter = obj != null ? findPropertyFilter(wwlVar, obj, null) : null;
        int i = 0;
        while (true) {
            BeanPropertyWriter[] beanPropertyWriterArr = this._props;
            if (i >= beanPropertyWriterArr.length) {
                c4hVarCreateSchemaNode.q0("properties", c4hVarA0);
                return c4hVarCreateSchemaNode;
            }
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (odiVarFindPropertyFilter == null) {
                beanPropertyWriter.depositSchemaProperty(c4hVarA0, wwlVar);
            } else {
                odiVarFindPropertyFilter.depositSchemaProperty(beanPropertyWriter, c4hVarA0, wwlVar);
            }
            i++;
        }
    }

    @Override // defpackage.eud
    public Iterator<PropertyWriter> properties() {
        return Arrays.asList(this._props).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    @Override // defpackage.dqk
    public void resolve(wwl wwlVar) throws JsonMappingException {
        BeanPropertyWriter beanPropertyWriter;
        e5q e5qVar;
        eud<Object> eudVarFindNullValueSerializer;
        BeanPropertyWriter beanPropertyWriter2;
        BeanPropertyWriter[] beanPropertyWriterArr = this._filteredProps;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this._props.length;
        for (int i = 0; i < length2; i++) {
            BeanPropertyWriter beanPropertyWriter3 = this._props[i];
            if (!beanPropertyWriter3.willSuppressNulls() && !beanPropertyWriter3.hasNullSerializer() && (eudVarFindNullValueSerializer = wwlVar.findNullValueSerializer(beanPropertyWriter3)) != null) {
                beanPropertyWriter3.assignNullSerializer(eudVarFindNullValueSerializer);
                if (i < length && (beanPropertyWriter2 = this._filteredProps[i]) != null) {
                    beanPropertyWriter2.assignNullSerializer(eudVarFindNullValueSerializer);
                }
            }
            if (!beanPropertyWriter3.hasSerializer()) {
                eud<Object> eudVarFindConvertingSerializer = findConvertingSerializer(wwlVar, beanPropertyWriter3);
                if (eudVarFindConvertingSerializer == null) {
                    JavaType serializationType = beanPropertyWriter3.getSerializationType();
                    if (serializationType == null) {
                        serializationType = beanPropertyWriter3.getType();
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                beanPropertyWriter3.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    eud<Object> eudVarFindValueSerializer = wwlVar.findValueSerializer(serializationType, beanPropertyWriter3);
                    eudVarFindConvertingSerializer = (serializationType.isContainerType() && (e5qVar = (e5q) serializationType.getContentType().getTypeHandler()) != null && (eudVarFindValueSerializer instanceof ContainerSerializer)) ? ((ContainerSerializer) eudVarFindValueSerializer).withValueTypeSerializer(e5qVar) : eudVarFindValueSerializer;
                    if (i < length) {
                        beanPropertyWriter3.assignSerializer(eudVarFindConvertingSerializer);
                    } else {
                        beanPropertyWriter3.assignSerializer(eudVarFindConvertingSerializer);
                    }
                } else if (i < length || (beanPropertyWriter = this._filteredProps[i]) == null) {
                    beanPropertyWriter3.assignSerializer(eudVarFindConvertingSerializer);
                } else {
                    beanPropertyWriter.assignSerializer(eudVarFindConvertingSerializer);
                }
            }
        }
        qd1 qd1Var = this._anyGetterWriter;
        if (qd1Var != null) {
            qd1Var.d(wwlVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;

    public void serializeFields(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || wwlVar.getActiveView() == null) ? this._props : this._filteredProps;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, wwlVar);
                }
                i++;
            }
            qd1 qd1Var = this._anyGetterWriter;
            if (qd1Var != null) {
                qd1Var.c(obj, jsonGenerator, wwlVar);
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.prependPath(new JsonMappingException.Reference(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]"));
            throw jsonMappingException;
        }
    }

    public void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || wwlVar.getActiveView() == null) ? this._props : this._filteredProps;
        odi odiVarFindPropertyFilter = findPropertyFilter(wwlVar, this._propertyFilterId, obj);
        if (odiVarFindPropertyFilter == null) {
            serializeFields(obj, jsonGenerator, wwlVar);
            return;
        }
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter != null) {
                    odiVarFindPropertyFilter.serializeAsField(obj, jsonGenerator, wwlVar, beanPropertyWriter);
                }
                i++;
            }
            qd1 qd1Var = this._anyGetterWriter;
            if (qd1Var != null) {
                qd1Var.b(obj, jsonGenerator, wwlVar, odiVarFindPropertyFilter);
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.prependPath(new JsonMappingException.Reference(obj, i != beanPropertyWriterArr.length ? beanPropertyWriterArr[i].getName() : "[anySetter]"));
            throw jsonMappingException;
        }
    }

    @Override // defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.M(obj);
            _serializeWithObjectId(obj, jsonGenerator, wwlVar, e5qVar);
            return;
        }
        jsonGenerator.M(obj);
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(e5qVar, obj, JsonToken.START_OBJECT);
        e5qVar.g(jsonGenerator, writableTypeId_typeIdDef);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, wwlVar);
        } else {
            serializeFields(obj, jsonGenerator, wwlVar);
        }
        e5qVar.h(jsonGenerator, writableTypeId_typeIdDef);
    }

    @Override // defpackage.eud
    public boolean usesObjectId() {
        return this._objectIdWriter != null;
    }

    @Override // defpackage.eud
    public abstract BeanSerializerBase withFilterId(Object obj);

    public abstract BeanSerializerBase withIgnorals(Set<String> set);

    @Deprecated
    public BeanSerializerBase withIgnorals(String[] strArr) {
        return withIgnorals(ij1.a(strArr));
    }

    public abstract BeanSerializerBase withObjectIdWriter(a4h a4hVar);

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        a4h a4hVar = this._objectIdWriter;
        bpr bprVarFindObjectId = wwlVar.findObjectId(obj, a4hVar.c);
        if (bprVarFindObjectId.c(jsonGenerator, wwlVar, a4hVar)) {
            return;
        }
        Object objA = bprVarFindObjectId.a(obj);
        if (a4hVar.e) {
            a4hVar.d.serialize(objA, jsonGenerator, wwlVar);
        } else {
            _serializeObjectId(obj, jsonGenerator, wwlVar, e5qVar, bprVarFindObjectId);
        }
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, a4h a4hVar) {
        this(beanSerializerBase, a4hVar, beanSerializerBase._propertyFilterId);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, a4h a4hVar, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = a4hVar;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    @Deprecated
    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, String[] strArr) {
        this(beanSerializerBase, ij1.a(strArr));
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase._props;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase._filteredProps;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = beanPropertyWriterArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (set == null || !set.contains(beanPropertyWriter.getName())) {
                arrayList.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList2.add(beanPropertyWriterArr2[i]);
                }
            }
        }
        this._props = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        this._filteredProps = arrayList2 != null ? (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]) : null;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase) {
        this(beanSerializerBase, beanSerializerBase._props, beanSerializerBase._filteredProps);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, rename(beanSerializerBase._props, nameTransformer), rename(beanSerializerBase._filteredProps, nameTransformer));
    }
}

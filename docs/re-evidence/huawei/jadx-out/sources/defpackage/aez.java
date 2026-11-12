package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.huawei.hms.network.embedded.g4;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class aez extends PropertyWriter implements Serializable {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final transient Annotations _contextAnnotations;
    protected final JavaType _declaredType;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected transient Field _field;
    protected final Class<?>[] _includeInViews;
    protected transient HashMap<Object, Object> _internalSettings;
    protected final AnnotatedMember _member;
    protected final xb _name;
    protected JavaType _nonTrivialBaseType;
    protected JsonSerializer<Object> _nullSerializer;
    protected JsonSerializer<Object> _serializer;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected TypeSerializer _typeSerializer;
    protected final ys _wrapperName;

    public boolean isUnwrapping() {
        return false;
    }

    public aez(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) {
        super(beanPropertyDefinition);
        this._member = annotatedMember;
        this._contextAnnotations = annotations;
        this._name = new xb(beanPropertyDefinition.getName());
        this._wrapperName = beanPropertyDefinition.getWrapperName();
        this._declaredType = javaType;
        this._serializer = jsonSerializer;
        this._dynamicSerializers = jsonSerializer == null ? PropertySerializerMap.emptyForProperties() : null;
        this._typeSerializer = typeSerializer;
        this._cfgSerializationType = javaType2;
        if (annotatedMember instanceof acj) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof aco) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        } else {
            this._accessorMethod = null;
            this._field = null;
        }
        this._suppressNulls = z;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    @Deprecated
    public aez(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z, Object obj) {
        this(beanPropertyDefinition, annotatedMember, annotations, javaType, jsonSerializer, typeSerializer, javaType2, z, obj, null);
    }

    public aez() {
        super(yq.f53746b);
        this._member = null;
        this._contextAnnotations = null;
        this._name = null;
        this._wrapperName = null;
        this._includeInViews = null;
        this._declaredType = null;
        this._serializer = null;
        this._dynamicSerializers = null;
        this._typeSerializer = null;
        this._cfgSerializationType = null;
        this._accessorMethod = null;
        this._field = null;
        this._suppressNulls = false;
        this._suppressableValue = null;
        this._nullSerializer = null;
    }

    public aez(aez aezVar) {
        this(aezVar, aezVar._name);
    }

    public aez(aez aezVar, ys ysVar) {
        super(aezVar);
        this._name = new xb(ysVar.b());
        this._wrapperName = aezVar._wrapperName;
        this._contextAnnotations = aezVar._contextAnnotations;
        this._declaredType = aezVar._declaredType;
        this._member = aezVar._member;
        this._accessorMethod = aezVar._accessorMethod;
        this._field = aezVar._field;
        this._serializer = aezVar._serializer;
        this._nullSerializer = aezVar._nullSerializer;
        if (aezVar._internalSettings != null) {
            this._internalSettings = new HashMap<>(aezVar._internalSettings);
        }
        this._cfgSerializationType = aezVar._cfgSerializationType;
        this._dynamicSerializers = aezVar._dynamicSerializers;
        this._suppressNulls = aezVar._suppressNulls;
        this._suppressableValue = aezVar._suppressableValue;
        this._includeInViews = aezVar._includeInViews;
        this._typeSerializer = aezVar._typeSerializer;
        this._nonTrivialBaseType = aezVar._nonTrivialBaseType;
    }

    protected aez(aez aezVar, xb xbVar) {
        super(aezVar);
        this._name = xbVar;
        this._wrapperName = aezVar._wrapperName;
        this._member = aezVar._member;
        this._contextAnnotations = aezVar._contextAnnotations;
        this._declaredType = aezVar._declaredType;
        this._accessorMethod = aezVar._accessorMethod;
        this._field = aezVar._field;
        this._serializer = aezVar._serializer;
        this._nullSerializer = aezVar._nullSerializer;
        if (aezVar._internalSettings != null) {
            this._internalSettings = new HashMap<>(aezVar._internalSettings);
        }
        this._cfgSerializationType = aezVar._cfgSerializationType;
        this._dynamicSerializers = aezVar._dynamicSerializers;
        this._suppressNulls = aezVar._suppressNulls;
        this._suppressableValue = aezVar._suppressableValue;
        this._includeInViews = aezVar._includeInViews;
        this._typeSerializer = aezVar._typeSerializer;
        this._nonTrivialBaseType = aezVar._nonTrivialBaseType;
    }

    public aez rename(NameTransformer nameTransformer) {
        String strTransform = nameTransformer.transform(this._name.getValue());
        return strTransform.equals(this._name.toString()) ? this : _new(ys.c(strTransform));
    }

    protected aez _new(ys ysVar) {
        return new aez(this, ysVar);
    }

    public void assignTypeSerializer(TypeSerializer typeSerializer) {
        this._typeSerializer = typeSerializer;
    }

    public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
        JsonSerializer<Object> jsonSerializer2 = this._serializer;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", ahw.b(jsonSerializer2), ahw.b(jsonSerializer)));
        }
        this._serializer = jsonSerializer;
    }

    public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
        JsonSerializer<Object> jsonSerializer2 = this._nullSerializer;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", ahw.b(jsonSerializer2), ahw.b(jsonSerializer)));
        }
        this._nullSerializer = jsonSerializer;
    }

    public aez unwrappingWriter(NameTransformer nameTransformer) {
        return new aft(this, nameTransformer);
    }

    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    public void fixAccess(yt ytVar) {
        this._member.fixAccess(ytVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    Object readResolve() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof acj) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof aco) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        }
        if (this._serializer == null) {
            this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        return this._name.getValue();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public ys getFullName() {
        return new ys(this._name.getValue());
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._declaredType;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public ys getWrapperName() {
        return this._wrapperName;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return null;
        }
        return (A) annotatedMember.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        Annotations annotations = this._contextAnnotations;
        if (annotations == null) {
            return null;
        }
        return (A) annotations.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._member;
    }

    protected void _depositSchemaProperty(aeu aeuVar, JsonNode jsonNode) {
        aeuVar.b(getName(), jsonNode);
    }

    public Object getInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this._internalSettings == null) {
            this._internalSettings = new HashMap<>();
        }
        return this._internalSettings.put(obj, obj2);
    }

    public Object removeInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        Object objRemove = map.remove(obj);
        if (this._internalSettings.size() == 0) {
            this._internalSettings = null;
        }
        return objRemove;
    }

    public SerializableString getSerializedName() {
        return this._name;
    }

    public boolean hasSerializer() {
        return this._serializer != null;
    }

    public boolean hasNullSerializer() {
        return this._nullSerializer != null;
    }

    public TypeSerializer getTypeSerializer() {
        return this._typeSerializer;
    }

    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }

    public boolean wouldConflictWithName(ys ysVar) {
        ys ysVar2 = this._wrapperName;
        if (ysVar2 != null) {
            return ysVar2.equals(ysVar);
        }
        return ysVar.e(this._name.getValue()) && !ysVar.e();
    }

    public JsonSerializer<Object> getSerializer() {
        return this._serializer;
    }

    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    @Deprecated
    public Class<?> getRawSerializationType() {
        JavaType javaType = this._cfgSerializationType;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    @Deprecated
    public Class<?> getPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getType();
        }
        return null;
    }

    @Deprecated
    public Type getGenericPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getGenericReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getGenericType();
        }
        return null;
    }

    public Class<?>[] getViews() {
        return this._includeInViews;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object objInvoke;
        Method method = this._accessorMethod;
        if (method == null) {
            objInvoke = this._field.get(obj);
        } else {
            objInvoke = method.invoke(obj, null);
        }
        if (objInvoke == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.writeFieldName(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, serializerProvider);
                return;
            }
            return;
        }
        JsonSerializer<?> jsonSerializer_findAndAddDynamic = this._serializer;
        if (jsonSerializer_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<?> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : jsonSerializerSerializerFor;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (jsonSerializer_findAndAddDynamic.isEmpty(serializerProvider, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.writeFieldName(this._name);
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            jsonSerializer_findAndAddDynamic.serialize(objInvoke, jsonGenerator, serializerProvider);
        } else {
            jsonSerializer_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        if (jsonGenerator.canOmitFields()) {
            return;
        }
        jsonGenerator.writeOmittedField(this._name.getValue());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object objInvoke;
        Method method = this._accessorMethod;
        if (method == null) {
            objInvoke = this._field.get(obj);
        } else {
            objInvoke = method.invoke(obj, null);
        }
        if (objInvoke == null) {
            JsonSerializer<Object> jsonSerializer = this._nullSerializer;
            if (jsonSerializer != null) {
                jsonSerializer.serialize(null, jsonGenerator, serializerProvider);
                return;
            } else {
                jsonGenerator.writeNull();
                return;
            }
        }
        JsonSerializer<?> jsonSerializer_findAndAddDynamic = this._serializer;
        if (jsonSerializer_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<?> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : jsonSerializerSerializerFor;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (jsonSerializer_findAndAddDynamic.isEmpty(serializerProvider, objInvoke)) {
                    serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer_findAndAddDynamic)) {
            return;
        }
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            jsonSerializer_findAndAddDynamic.serialize(objInvoke, jsonGenerator, serializerProvider);
        } else {
            jsonSerializer_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        JsonSerializer<Object> jsonSerializer = this._nullSerializer;
        if (jsonSerializer != null) {
            jsonSerializer.serialize(null, jsonGenerator, serializerProvider);
        } else {
            jsonGenerator.writeNull();
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
        if (jsonObjectFormatVisitor != null) {
            if (isRequired()) {
                jsonObjectFormatVisitor.property(this);
            } else {
                jsonObjectFormatVisitor.optionalProperty(this);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(aeu aeuVar, SerializerProvider serializerProvider) throws ym {
        JsonNode jsonNodeE;
        JavaType serializationType = getSerializationType();
        Type type = serializationType == null ? getType() : serializationType.getRawClass();
        JsonFormatVisitable serializer = getSerializer();
        if (serializer == null) {
            serializer = serializerProvider.findValueSerializer(getType(), this);
        }
        boolean zIsRequired = isRequired();
        if (serializer instanceof SchemaAware) {
            jsonNodeE = ((SchemaAware) serializer).getSchema(serializerProvider, type, !zIsRequired);
        } else {
            jsonNodeE = adc.e();
        }
        _depositSchemaProperty(aeuVar, jsonNodeE);
    }

    protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws ym {
        PropertySerializerMap.d dVarFindAndAddPrimarySerializer;
        JavaType javaType = this._nonTrivialBaseType;
        if (javaType != null) {
            dVarFindAndAddPrimarySerializer = propertySerializerMap.findAndAddPrimarySerializer(serializerProvider.constructSpecializedType(javaType, cls), serializerProvider, this);
        } else {
            dVarFindAndAddPrimarySerializer = propertySerializerMap.findAndAddPrimarySerializer(cls, serializerProvider, this);
        }
        if (propertySerializerMap != dVarFindAndAddPrimarySerializer.f4190a) {
            this._dynamicSerializers = dVarFindAndAddPrimarySerializer.f4190a;
        }
        return dVarFindAndAddPrimarySerializer.f4191b;
    }

    public final Object get(Object obj) throws Exception {
        Method method = this._accessorMethod;
        if (method == null) {
            return this._field.get(obj);
        }
        return method.invoke(obj, null);
    }

    protected boolean _handleSelfReference(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<?> jsonSerializer) throws IOException {
        if (jsonSerializer.usesObjectId()) {
            return false;
        }
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(jsonSerializer instanceof BeanSerializerBase)) {
                return false;
            }
            serializerProvider.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
            return false;
        }
        if (!serializerProvider.isEnabled(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this._nullSerializer == null) {
            return true;
        }
        if (!jsonGenerator.getOutputContext().inArray()) {
            jsonGenerator.writeFieldName(this._name);
        }
        this._nullSerializer.serialize(null, jsonGenerator, serializerProvider);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(getName());
        sb.append("' (");
        if (this._accessorMethod != null) {
            sb.append("via method ");
            sb.append(this._accessorMethod.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this._accessorMethod.getName());
        } else if (this._field != null) {
            sb.append("field \"");
            sb.append(this._field.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this._field.getName());
        } else {
            sb.append("virtual");
        }
        if (this._serializer == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this._serializer.getClass().getName());
        }
        sb.append(g4.l);
        return sb.toString();
    }
}

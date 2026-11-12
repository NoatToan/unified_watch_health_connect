package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.a;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.c4h;
import defpackage.e5q;
import defpackage.eud;
import defpackage.h04;
import defpackage.ih2;
import defpackage.itd;
import defpackage.ld1;
import defpackage.owl;
import defpackage.qqd;
import defpackage.rfl;
import defpackage.wwl;
import defpackage.zsd;
import defpackage.ztd;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class BeanPropertyWriter extends PropertyWriter implements Serializable {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final transient ld1 _contextAnnotations;
    protected final JavaType _declaredType;
    protected transient a _dynamicSerializers;
    protected transient Field _field;
    protected final Class<?>[] _includeInViews;
    protected transient HashMap<Object, Object> _internalSettings;
    protected final AnnotatedMember _member;
    protected final SerializedString _name;
    protected JavaType _nonTrivialBaseType;
    protected eud<Object> _nullSerializer;
    protected eud<Object> _serializer;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected e5q _typeSerializer;
    protected final PropertyName _wrapperName;

    @Deprecated
    public BeanPropertyWriter(ih2 ih2Var, AnnotatedMember annotatedMember, ld1 ld1Var, JavaType javaType, eud<?> eudVar, e5q e5qVar, JavaType javaType2, boolean z, Object obj) {
        this(ih2Var, annotatedMember, ld1Var, javaType, eudVar, e5qVar, javaType2, z, obj, null);
    }

    public void _depositSchemaProperty(c4h c4hVar, zsd zsdVar) {
        c4hVar.q0(getName(), zsdVar);
    }

    public eud<Object> _findAndAddDynamic(a aVar, Class<?> cls, wwl wwlVar) throws JsonMappingException {
        JavaType javaType = this._nonTrivialBaseType;
        a.d dVarD = javaType != null ? aVar.d(wwlVar.constructSpecializedType(javaType, cls), wwlVar, this) : aVar.e(cls, wwlVar, this);
        a aVar2 = dVarD.f7701b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return dVarD.f7700a;
    }

    public boolean _handleSelfReference(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, eud<?> eudVar) throws JsonMappingException {
        if (!wwlVar.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES) || eudVar.usesObjectId() || !(eudVar instanceof BeanSerializerBase)) {
            return false;
        }
        wwlVar.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
        return false;
    }

    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new BeanPropertyWriter(this, propertyName);
    }

    public void assignNullSerializer(eud<Object> eudVar) {
        eud<Object> eudVar2 = this._nullSerializer;
        if (eudVar2 != null && eudVar2 != eudVar) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", h04.g(this._nullSerializer), h04.g(eudVar)));
        }
        this._nullSerializer = eudVar;
    }

    public void assignSerializer(eud<Object> eudVar) {
        eud<Object> eudVar2 = this._serializer;
        if (eudVar2 != null && eudVar2 != eudVar) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", h04.g(this._serializer), h04.g(eudVar)));
        }
        this._serializer = eudVar;
    }

    public void assignTypeSerializer(e5q e5qVar) {
        this._typeSerializer = e5qVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException {
        if (itdVar != null) {
            if (isRequired()) {
                itdVar.i(this);
            } else {
                itdVar.g(this);
            }
        }
    }

    public void fixAccess(SerializationConfig serializationConfig) {
        this._member.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object get(Object obj) throws Exception {
        Method method = this._accessorMethod;
        return method == null ? this._field.get(obj) : method.invoke(obj, null);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return null;
        }
        return (A) annotatedMember.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        ld1 ld1Var = this._contextAnnotations;
        if (ld1Var == null) {
            return null;
        }
        return (A) ld1Var.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(this._name.getValue());
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

    public Object getInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._member;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, defpackage.ogg
    public String getName() {
        return this._name.getValue();
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
    public Class<?> getRawSerializationType() {
        JavaType javaType = this._cfgSerializationType;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    public owl getSerializedName() {
        return this._name;
    }

    public eud<Object> getSerializer() {
        return this._serializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._declaredType;
    }

    public e5q getTypeSerializer() {
        return this._typeSerializer;
    }

    public Class<?>[] getViews() {
        return this._includeInViews;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasNullSerializer() {
        return this._nullSerializer != null;
    }

    public boolean hasSerializer() {
        return this._serializer != null;
    }

    public boolean isUnwrapping() {
        return false;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        }
        if (this._serializer == null) {
            this._dynamicSerializers = a.a();
        }
        return this;
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

    public BeanPropertyWriter rename(NameTransformer nameTransformer) {
        String strTransform = nameTransformer.transform(this._name.getValue());
        return strTransform.equals(this._name.toString()) ? this : _new(PropertyName.construct(strTransform));
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        Method method = this._accessorMethod;
        Object objInvoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            eud<Object> eudVar = this._nullSerializer;
            if (eudVar != null) {
                eudVar.serialize(null, jsonGenerator, wwlVar);
                return;
            } else {
                jsonGenerator.s0();
                return;
            }
        }
        eud<?> eudVar_findAndAddDynamic = this._serializer;
        if (eudVar_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            a aVar = this._dynamicSerializers;
            eud<?> eudVarI = aVar.i(cls);
            eudVar_findAndAddDynamic = eudVarI == null ? _findAndAddDynamic(aVar, cls, wwlVar) : eudVarI;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (eudVar_findAndAddDynamic.isEmpty(wwlVar, objInvoke)) {
                    serializeAsPlaceholder(obj, jsonGenerator, wwlVar);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                serializeAsPlaceholder(obj, jsonGenerator, wwlVar);
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, wwlVar, eudVar_findAndAddDynamic)) {
            return;
        }
        e5q e5qVar = this._typeSerializer;
        if (e5qVar == null) {
            eudVar_findAndAddDynamic.serialize(objInvoke, jsonGenerator, wwlVar);
        } else {
            eudVar_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, wwlVar, e5qVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        Method method = this._accessorMethod;
        Object objInvoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.o0(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, wwlVar);
                return;
            }
            return;
        }
        eud<?> eudVar_findAndAddDynamic = this._serializer;
        if (eudVar_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            a aVar = this._dynamicSerializers;
            eud<?> eudVarI = aVar.i(cls);
            eudVar_findAndAddDynamic = eudVarI == null ? _findAndAddDynamic(aVar, cls, wwlVar) : eudVarI;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (eudVar_findAndAddDynamic.isEmpty(wwlVar, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, wwlVar, eudVar_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.o0(this._name);
        e5q e5qVar = this._typeSerializer;
        if (e5qVar == null) {
            eudVar_findAndAddDynamic.serialize(objInvoke, jsonGenerator, wwlVar);
        } else {
            eudVar_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, wwlVar, e5qVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        if (jsonGenerator.l()) {
            return;
        }
        jsonGenerator.E0(this._name.getValue());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        eud<Object> eudVar = this._nullSerializer;
        if (eudVar != null) {
            eudVar.serialize(null, jsonGenerator, wwlVar);
        } else {
            jsonGenerator.s0();
        }
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this._internalSettings == null) {
            this._internalSettings = new HashMap<>();
        }
        return this._internalSettings.put(obj, obj2);
    }

    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(getName());
        sb.append("' (");
        if (this._accessorMethod != null) {
            sb.append("via method ");
            sb.append(this._accessorMethod.getDeclaringClass().getName());
            sb.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
            sb.append(this._accessorMethod.getName());
        } else if (this._field != null) {
            sb.append("field \"");
            sb.append(this._field.getDeclaringClass().getName());
            sb.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
            sb.append(this._field.getName());
        } else {
            sb.append("virtual");
        }
        if (this._serializer == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this._serializer.getClass().getName());
        }
        sb.append(')');
        return sb.toString();
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }

    public boolean wouldConflictWithName(PropertyName propertyName) {
        PropertyName propertyName2 = this._wrapperName;
        if (propertyName2 != null) {
            return propertyName2.equals(propertyName);
        }
        return propertyName.hasSimpleName(this._name.getValue()) && !propertyName.hasNamespace();
    }

    public BeanPropertyWriter(ih2 ih2Var, AnnotatedMember annotatedMember, ld1 ld1Var, JavaType javaType, eud<?> eudVar, e5q e5qVar, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) {
        super(ih2Var);
        this._member = annotatedMember;
        this._contextAnnotations = ld1Var;
        this._name = new SerializedString(ih2Var.getName());
        this._wrapperName = ih2Var.getWrapperName();
        this._declaredType = javaType;
        this._serializer = eudVar;
        this._dynamicSerializers = eudVar == null ? a.a() : null;
        this._typeSerializer = e5qVar;
        this._cfgSerializationType = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
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

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(c4h c4hVar, wwl wwlVar) throws JsonMappingException {
        zsd zsdVarA;
        JavaType serializationType = getSerializationType();
        Type type = serializationType == null ? getType() : serializationType.getRawClass();
        Object serializer = getSerializer();
        if (serializer == null) {
            serializer = wwlVar.findValueSerializer(getType(), this);
        }
        boolean z = !isRequired();
        if (serializer instanceof rfl) {
            zsdVarA = ((rfl) serializer).getSchema(wwlVar, type, z);
        } else {
            zsdVarA = ztd.a();
        }
        _depositSchemaProperty(c4hVar, zsdVarA);
    }

    public BeanPropertyWriter() {
        super(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
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

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter);
        this._name = new SerializedString(propertyName.getSimpleName());
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._member = beanPropertyWriter._member;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super(beanPropertyWriter);
        this._name = serializedString;
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._member = beanPropertyWriter._member;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }
}

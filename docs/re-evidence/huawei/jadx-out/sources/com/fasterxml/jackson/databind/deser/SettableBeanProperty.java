package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.huawei.operation.utils.Constants;
import defpackage.aaa;
import defpackage.acv;
import defpackage.ahw;
import defpackage.aim;
import defpackage.yi;
import defpackage.ym;
import defpackage.yq;
import defpackage.ys;
import defpackage.zw;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    protected static final JsonDeserializer<Object> MISSING_VALUE_DESERIALIZER = new zw("No _valueDeserializer assigned");
    protected final transient Annotations _contextAnnotations;
    protected String _managedReferenceName;
    protected final NullValueProvider _nullProvider;
    protected acv _objectIdInfo;
    protected final ys _propName;
    protected int _propertyIndex;
    protected final JavaType _type;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;
    protected aim _viewMatcher;
    protected final ys _wrapperName;

    public abstract void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public abstract Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public void fixAccess(yi yiVar) {
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public Object getInjectableValueId() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract AnnotatedMember getMember();

    public boolean isIgnorable() {
        return false;
    }

    public boolean isInjectionOnly() {
        return false;
    }

    public void markAsIgnorable() {
    }

    public abstract void set(Object obj, Object obj2) throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj2) throws IOException;

    public abstract SettableBeanProperty withName(ys ysVar);

    public abstract SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider);

    public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer);

    public SettableBeanProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations) {
        this(beanPropertyDefinition.getFullName(), javaType, beanPropertyDefinition.getWrapperName(), typeDeserializer, annotations, beanPropertyDefinition.getMetadata());
    }

    public SettableBeanProperty(ys ysVar, JavaType javaType, ys ysVar2, TypeDeserializer typeDeserializer, Annotations annotations, yq yqVar) {
        super(yqVar);
        this._propertyIndex = -1;
        if (ysVar == null) {
            this._propName = ys.f53793b;
        } else {
            this._propName = ysVar.d();
        }
        this._type = javaType;
        this._wrapperName = ysVar2;
        this._contextAnnotations = annotations;
        this._viewMatcher = null;
        this._valueTypeDeserializer = typeDeserializer != null ? typeDeserializer.forProperty(this) : typeDeserializer;
        JsonDeserializer<Object> jsonDeserializer = MISSING_VALUE_DESERIALIZER;
        this._valueDeserializer = jsonDeserializer;
        this._nullProvider = jsonDeserializer;
    }

    public SettableBeanProperty(ys ysVar, JavaType javaType, yq yqVar, JsonDeserializer<Object> jsonDeserializer) {
        super(yqVar);
        this._propertyIndex = -1;
        if (ysVar == null) {
            this._propName = ys.f53793b;
        } else {
            this._propName = ysVar.d();
        }
        this._type = javaType;
        this._wrapperName = null;
        this._contextAnnotations = null;
        this._viewMatcher = null;
        this._valueTypeDeserializer = null;
        this._valueDeserializer = jsonDeserializer;
        this._nullProvider = jsonDeserializer;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        if (jsonDeserializer == null) {
            this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
        } else {
            this._valueDeserializer = jsonDeserializer;
        }
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = nullValueProvider == MISSING_VALUE_DESERIALIZER ? this._valueDeserializer : nullValueProvider;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, ys ysVar) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = ysVar;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }

    public SettableBeanProperty withSimpleName(String str) {
        ys ysVar = this._propName;
        ys ysVar2 = ysVar == null ? new ys(str) : ysVar.b(str);
        return ysVar2 == this._propName ? this : withName(ysVar2);
    }

    public void setManagedReferenceName(String str) {
        this._managedReferenceName = str;
    }

    public void setObjectIdInfo(acv acvVar) {
        this._objectIdInfo = acvVar;
    }

    public void setViews(Class<?>[] clsArr) {
        if (clsArr == null) {
            this._viewMatcher = null;
        } else {
            this._viewMatcher = aim.c(clsArr);
        }
    }

    public void assignIndex(int i) {
        if (this._propertyIndex != -1) {
            throw new IllegalStateException("Property '" + getName() + "' already had index (" + this._propertyIndex + "), trying to assign " + i);
        }
        this._propertyIndex = i;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
    public final String getName() {
        return this._propName.b();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public ys getFullName() {
        return this._propName;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public ys getWrapperName() {
        return this._wrapperName;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._contextAnnotations.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
        if (isRequired()) {
            jsonObjectFormatVisitor.property(this);
        } else {
            jsonObjectFormatVisitor.optionalProperty(this);
        }
    }

    public Class<?> getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    public String getManagedReferenceName() {
        return this._managedReferenceName;
    }

    public acv getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public boolean hasValueDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        return (jsonDeserializer == null || jsonDeserializer == MISSING_VALUE_DESERIALIZER) ? false : true;
    }

    public boolean hasValueTypeDeserializer() {
        return this._valueTypeDeserializer != null;
    }

    public JsonDeserializer<Object> getValueDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer == MISSING_VALUE_DESERIALIZER) {
            return null;
        }
        return jsonDeserializer;
    }

    public TypeDeserializer getValueTypeDeserializer() {
        return this._valueTypeDeserializer;
    }

    public NullValueProvider getNullValueProvider() {
        return this._nullProvider;
    }

    public boolean visibleInView(Class<?> cls) {
        aim aimVar = this._viewMatcher;
        return aimVar == null || aimVar.d(cls);
    }

    public boolean hasViews() {
        return this._viewMatcher != null;
    }

    public int getPropertyIndex() {
        return this._propertyIndex;
    }

    public int getCreatorIndex() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", getName(), getClass().getName()));
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        return objDeserialize == null ? this._nullProvider.getNullValue(deserializationContext) : objDeserialize;
    }

    public final Object deserializeWith(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (!aaa.c(this._nullProvider)) {
                return this._nullProvider.getNullValue(deserializationContext);
            }
        } else {
            if (this._valueTypeDeserializer != null) {
                deserializationContext.reportBadDefinition(getType(), String.format("Cannot merge polymorphic property '%s'", getName()));
            }
            Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj);
            if (objDeserialize != null) {
                return objDeserialize;
            }
            if (!aaa.c(this._nullProvider)) {
                return this._nullProvider.getNullValue(deserializationContext);
            }
        }
        return obj;
    }

    protected void _throwAsIOE(JsonParser jsonParser, Exception exc, Object obj) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String strB = ahw.b(obj);
            StringBuilder sb = new StringBuilder("Problem deserializing property '");
            sb.append(getName());
            sb.append("' (expected type: ");
            sb.append(getType());
            sb.append("; actual type: ");
            sb.append(strB);
            sb.append(Constants.RIGHT_BRACKET_ONLY);
            String strA = ahw.a((Throwable) exc);
            if (strA != null) {
                sb.append(", problem: ");
                sb.append(strA);
            } else {
                sb.append(" (no error message provided)");
            }
            throw ym.from(jsonParser, sb.toString(), exc);
        }
        _throwAsIOE(jsonParser, exc);
    }

    protected IOException _throwAsIOE(JsonParser jsonParser, Exception exc) throws IOException {
        ahw.c((Throwable) exc);
        ahw.i(exc);
        Throwable thB = ahw.b((Throwable) exc);
        throw ym.from(jsonParser, ahw.a(thB), thB);
    }

    @Deprecated
    protected IOException _throwAsIOE(Exception exc) throws IOException {
        return _throwAsIOE((JsonParser) null, exc);
    }

    protected void _throwAsIOE(Exception exc, Object obj) throws IOException {
        _throwAsIOE(null, exc, obj);
    }

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public static abstract class Delegating extends SettableBeanProperty {
        protected final SettableBeanProperty delegate;

        protected abstract SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty);

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.delegate = settableBeanProperty;
        }

        protected SettableBeanProperty _with(SettableBeanProperty settableBeanProperty) {
            return settableBeanProperty == this.delegate ? this : withDelegate(settableBeanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
            return _with(this.delegate.withValueDeserializer(jsonDeserializer));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withName(ys ysVar) {
            return _with(this.delegate.withName(ysVar));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
            return _with(this.delegate.withNullProvider(nullValueProvider));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void assignIndex(int i) {
            this.delegate.assignIndex(i);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void fixAccess(yi yiVar) {
            this.delegate.fixAccess(yiVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Class<?> getDeclaringClass() {
            return this.delegate.getDeclaringClass();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public String getManagedReferenceName() {
            return this.delegate.getManagedReferenceName();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public acv getObjectIdInfo() {
            return this.delegate.getObjectIdInfo();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasValueDeserializer() {
            return this.delegate.hasValueDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasValueTypeDeserializer() {
            return this.delegate.hasValueTypeDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public JsonDeserializer<Object> getValueDeserializer() {
            return this.delegate.getValueDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public TypeDeserializer getValueTypeDeserializer() {
            return this.delegate.getValueTypeDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean visibleInView(Class<?> cls) {
            return this.delegate.visibleInView(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasViews() {
            return this.delegate.hasViews();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getPropertyIndex() {
            return this.delegate.getPropertyIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getCreatorIndex() {
            return this.delegate.getCreatorIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object getInjectableValueId() {
            return this.delegate.getInjectableValueId();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean isInjectionOnly() {
            return this.delegate.isInjectionOnly();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return this.delegate.getMember();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return (A) this.delegate.getAnnotation(cls);
        }

        public SettableBeanProperty getDelegate() {
            return this.delegate;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            this.delegate.deserializeAndSet(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            return this.delegate.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void set(Object obj, Object obj2) throws IOException {
            this.delegate.set(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object setAndReturn(Object obj, Object obj2) throws IOException {
            return this.delegate.setAndReturn(obj, obj2);
        }
    }
}

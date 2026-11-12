package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import defpackage.esd;
import defpackage.h04;
import defpackage.ih2;
import defpackage.itd;
import defpackage.ld1;
import defpackage.q4q;
import defpackage.wwl;
import defpackage.z1h;
import defpackage.z3h;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    protected static final esd<Object> MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
    protected final transient ld1 _contextAnnotations;
    protected String _managedReferenceName;
    protected final z1h _nullProvider;
    protected z3h _objectIdInfo;
    protected final PropertyName _propName;
    protected int _propertyIndex;
    protected final JavaType _type;
    protected final esd<Object> _valueDeserializer;
    protected final q4q _valueTypeDeserializer;
    protected ViewMatcher _viewMatcher;
    protected final PropertyName _wrapperName;

    public static abstract class Delegating extends SettableBeanProperty {
        protected final SettableBeanProperty delegate;

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.delegate = settableBeanProperty;
        }

        public SettableBeanProperty _with(SettableBeanProperty settableBeanProperty) {
            return settableBeanProperty == this.delegate ? this : withDelegate(settableBeanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void assignIndex(int i) {
            this.delegate.assignIndex(i);
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
        public void fixAccess(DeserializationConfig deserializationConfig) {
            this.delegate.fixAccess(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return (A) this.delegate.getAnnotation(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getCreatorIndex() {
            return this.delegate.getCreatorIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Class<?> getDeclaringClass() {
            return this.delegate.getDeclaringClass();
        }

        public SettableBeanProperty getDelegate() {
            return this.delegate;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object getInjectableValueId() {
            return this.delegate.getInjectableValueId();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public String getManagedReferenceName() {
            return this.delegate.getManagedReferenceName();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return this.delegate.getMember();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public z3h getObjectIdInfo() {
            return this.delegate.getObjectIdInfo();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getPropertyIndex() {
            return this.delegate.getPropertyIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public esd<Object> getValueDeserializer() {
            return this.delegate.getValueDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public q4q getValueTypeDeserializer() {
            return this.delegate.getValueTypeDeserializer();
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
        public boolean hasViews() {
            return this.delegate.hasViews();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void set(Object obj, Object obj2) throws IOException {
            this.delegate.set(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object setAndReturn(Object obj, Object obj2) throws IOException {
            return this.delegate.setAndReturn(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean visibleInView(Class<?> cls) {
            return this.delegate.visibleInView(cls);
        }

        public abstract SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty);

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withName(PropertyName propertyName) {
            return _with(this.delegate.withName(propertyName));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withNullProvider(z1h z1hVar) {
            return _with(this.delegate.withNullProvider(z1hVar));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withValueDeserializer(esd<?> esdVar) {
            return _with(this.delegate.withValueDeserializer(esdVar));
        }
    }

    public SettableBeanProperty(ih2 ih2Var, JavaType javaType, q4q q4qVar, ld1 ld1Var) {
        this(ih2Var.getFullName(), javaType, ih2Var.getWrapperName(), q4qVar, ld1Var, ih2Var.getMetadata());
    }

    public void _throwAsIOE(JsonParser jsonParser, Exception exc, Object obj) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            _throwAsIOE(jsonParser, exc);
            return;
        }
        String strG = h04.g(obj);
        StringBuilder sb = new StringBuilder("Problem deserializing property '");
        sb.append(getName());
        sb.append("' (expected type: ");
        sb.append(getType());
        sb.append("; actual type: ");
        sb.append(strG);
        sb.append(")");
        String strN = h04.n(exc);
        if (strN != null) {
            sb.append(", problem: ");
            sb.append(strN);
        } else {
            sb.append(" (no error message provided)");
        }
        throw JsonMappingException.from(jsonParser, sb.toString(), exc);
    }

    public void assignIndex(int i) {
        if (this._propertyIndex == -1) {
            this._propertyIndex = i;
            return;
        }
        throw new IllegalStateException("Property '" + getName() + "' already had index (" + this._propertyIndex + "), trying to assign " + i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException {
        if (isRequired()) {
            itdVar.i(this);
        } else {
            itdVar.g(this);
        }
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        q4q q4qVar = this._valueTypeDeserializer;
        if (q4qVar != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
        }
        Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        return objDeserialize == null ? this._nullProvider.getNullValue(deserializationContext) : objDeserialize;
    }

    public abstract void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public abstract Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public final Object deserializeWith(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            return NullsConstantProvider.isSkipper(this._nullProvider) ? obj : this._nullProvider.getNullValue(deserializationContext);
        }
        if (this._valueTypeDeserializer != null) {
            deserializationContext.reportBadDefinition(getType(), String.format("Cannot merge polymorphic property '%s'", getName()));
        }
        Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj);
        if (objDeserialize == null) {
            return NullsConstantProvider.isSkipper(this._nullProvider) ? obj : this._nullProvider.getNullValue(deserializationContext);
        }
        return objDeserialize;
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._contextAnnotations.get(cls);
    }

    public int getCreatorIndex() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", getName(), getClass().getName()));
    }

    public Class<?> getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return this._propName;
    }

    public Object getInjectableValueId() {
        return null;
    }

    public String getManagedReferenceName() {
        return this._managedReferenceName;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public abstract AnnotatedMember getMember();

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, defpackage.ogg
    public final String getName() {
        return this._propName.getSimpleName();
    }

    public z1h getNullValueProvider() {
        return this._nullProvider;
    }

    public z3h getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public int getPropertyIndex() {
        return this._propertyIndex;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._type;
    }

    public esd<Object> getValueDeserializer() {
        esd<Object> esdVar = this._valueDeserializer;
        if (esdVar == MISSING_VALUE_DESERIALIZER) {
            return null;
        }
        return esdVar;
    }

    public q4q getValueTypeDeserializer() {
        return this._valueTypeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasValueDeserializer() {
        esd<Object> esdVar = this._valueDeserializer;
        return (esdVar == null || esdVar == MISSING_VALUE_DESERIALIZER) ? false : true;
    }

    public boolean hasValueTypeDeserializer() {
        return this._valueTypeDeserializer != null;
    }

    public boolean hasViews() {
        return this._viewMatcher != null;
    }

    public boolean isIgnorable() {
        return false;
    }

    public void markAsIgnorable() {
    }

    public abstract void set(Object obj, Object obj2) throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj2) throws IOException;

    public void setManagedReferenceName(String str) {
        this._managedReferenceName = str;
    }

    public void setObjectIdInfo(z3h z3hVar) {
        this._objectIdInfo = z3hVar;
    }

    public void setViews(Class<?>[] clsArr) {
        if (clsArr == null) {
            this._viewMatcher = null;
        } else {
            this._viewMatcher = ViewMatcher.construct(clsArr);
        }
    }

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public boolean visibleInView(Class<?> cls) {
        ViewMatcher viewMatcher = this._viewMatcher;
        return viewMatcher == null || viewMatcher.isVisibleForView(cls);
    }

    public abstract SettableBeanProperty withName(PropertyName propertyName);

    public abstract SettableBeanProperty withNullProvider(z1h z1hVar);

    public SettableBeanProperty withSimpleName(String str) {
        PropertyName propertyName = this._propName;
        PropertyName propertyName2 = propertyName == null ? new PropertyName(str) : propertyName.withSimpleName(str);
        return propertyName2 == this._propName ? this : withName(propertyName2);
    }

    public abstract SettableBeanProperty withValueDeserializer(esd<?> esdVar);

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, q4q q4qVar, ld1 ld1Var, PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = propertyName2;
        this._contextAnnotations = ld1Var;
        this._viewMatcher = null;
        this._valueTypeDeserializer = q4qVar != null ? q4qVar.forProperty(this) : q4qVar;
        esd<Object> esdVar = MISSING_VALUE_DESERIALIZER;
        this._valueDeserializer = esdVar;
        this._nullProvider = esdVar;
    }

    public IOException _throwAsIOE(JsonParser jsonParser, Exception exc) throws IOException {
        h04.e0(exc);
        h04.f0(exc);
        Throwable thH = h04.H(exc);
        throw JsonMappingException.from(jsonParser, h04.n(thH), thH);
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, esd<Object> esdVar) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = null;
        this._contextAnnotations = null;
        this._viewMatcher = null;
        this._valueTypeDeserializer = null;
        this._valueDeserializer = esdVar;
        this._nullProvider = esdVar;
    }

    @Deprecated
    public IOException _throwAsIOE(Exception exc) throws IOException {
        return _throwAsIOE((JsonParser) null, exc);
    }

    public void _throwAsIOE(Exception exc, Object obj) throws IOException {
        _throwAsIOE(null, exc, obj);
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

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, esd<?> esdVar, z1h z1hVar) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        if (esdVar == null) {
            this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
        } else {
            this._valueDeserializer = esdVar;
        }
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = z1hVar == MISSING_VALUE_DESERIALIZER ? this._valueDeserializer : z1hVar;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = propertyName;
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
}

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.esd;
import defpackage.h04;
import defpackage.z1h;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    protected final JavaType _containerType;
    protected final z1h _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public ContainerDeserializerBase(JavaType javaType, z1h z1hVar, Boolean bool) {
        super(javaType);
        this._containerType = javaType;
        this._unwrapSingle = bool;
        this._nullProvider = z1hVar;
        this._skipNullValues = NullsConstantProvider.isSkipper(z1hVar);
    }

    @Override // defpackage.esd
    public SettableBeanProperty findBackReference(String str) {
        esd<Object> contentDeserializer = getContentDeserializer();
        if (contentDeserializer != null) {
            return contentDeserializer.findBackReference(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", str, getClass().getName()));
    }

    public abstract esd<Object> getContentDeserializer();

    public JavaType getContentType() {
        JavaType javaType = this._containerType;
        return javaType == null ? TypeFactory.unknownType() : javaType.getContentType();
    }

    @Override // defpackage.esd
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        b valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            JavaType valueType = getValueType();
            deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
        }
        try {
            return valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return h04.c0(deserializationContext, e);
        }
    }

    public b getValueInstantiator() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public <BOGUS> BOGUS wrapAndThrow(Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        h04.d0(th);
        if (!(th instanceof IOException) || (th instanceof JsonMappingException)) {
            throw JsonMappingException.wrapWithPath(th, obj, (String) h04.U(str, "N/A"));
        }
        throw ((IOException) th);
    }

    public ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (z1h) null, (Boolean) null);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase._nullProvider, containerDeserializerBase._unwrapSingle);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, z1h z1hVar, Boolean bool) {
        super(containerDeserializerBase._containerType);
        this._containerType = containerDeserializerBase._containerType;
        this._nullProvider = z1hVar;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(z1hVar);
    }
}

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.aaa;
import defpackage.ahp;
import defpackage.ahw;
import defpackage.yi;
import defpackage.ym;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> implements ValueInstantiator.Gettable {
    protected final JavaType _containerType;
    protected final NullValueProvider _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public abstract JsonDeserializer<Object> getContentDeserializer();

    public ContainerDeserializerBase(JavaType javaType, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType);
        this._containerType = javaType;
        this._unwrapSingle = bool;
        this._nullProvider = nullValueProvider;
        this._skipNullValues = aaa.c(nullValueProvider);
    }

    public ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (NullValueProvider) null, (Boolean) null);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase._nullProvider, containerDeserializerBase._unwrapSingle);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, NullValueProvider nullValueProvider, Boolean bool) {
        super(containerDeserializerBase._containerType);
        this._containerType = containerDeserializerBase._containerType;
        this._nullProvider = nullValueProvider;
        this._unwrapSingle = bool;
        this._skipNullValues = aaa.c(nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public SettableBeanProperty findBackReference(String str) {
        JsonDeserializer<Object> contentDeserializer = getContentDeserializer();
        if (contentDeserializer == null) {
            throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", str, getClass().getName()));
        }
        return contentDeserializer.findBackReference(str);
    }

    public JavaType getContentType() {
        JavaType javaType = this._containerType;
        if (javaType == null) {
            return ahp.c();
        }
        return javaType.getContentType();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            JavaType valueType = getValueType();
            deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
        }
        try {
            return valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return ahw.b(deserializationContext, e);
        }
    }

    @Deprecated
    protected <BOGUS> BOGUS wrapAndThrow(Throwable th, Object obj, String str) throws IOException {
        return (BOGUS) wrapAndThrow(null, th, obj, str);
    }

    protected <BOGUS> BOGUS wrapAndThrow(DeserializationContext deserializationContext, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ahw.e(th);
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ahw.i(th);
        }
        if ((th instanceof IOException) && !(th instanceof ym)) {
            throw ((IOException) th);
        }
        throw ym.wrapWithPath(th, obj, (String) ahw.e(str, "N/A"));
    }
}

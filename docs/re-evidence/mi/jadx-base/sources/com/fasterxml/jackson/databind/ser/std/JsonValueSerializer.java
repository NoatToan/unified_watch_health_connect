package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.rfl;
import defpackage.wwl;
import defpackage.zsd;
import defpackage.ztd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class JsonValueSerializer extends StdSerializer<Object> implements cj4, rfl {
    protected final AnnotatedMember _accessor;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final eud<Object> _valueSerializer;

    public static class a extends e5q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e5q f7707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f7708b;

        public a(e5q e5qVar, Object obj) {
            this.f7707a = e5qVar;
            this.f7708b = obj;
        }

        @Override // defpackage.e5q
        public e5q a(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.e5q
        public String b() {
            return this.f7707a.b();
        }

        @Override // defpackage.e5q
        public JsonTypeInfo.As c() {
            return this.f7707a.c();
        }

        @Override // defpackage.e5q
        public WritableTypeId g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.f7625a = this.f7708b;
            return this.f7707a.g(jsonGenerator, writableTypeId);
        }

        @Override // defpackage.e5q
        public WritableTypeId h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.f7707a.h(jsonGenerator, writableTypeId);
        }
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, eud<?> eudVar) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueSerializer = eudVar;
        this._property = null;
        this._forceTypeInformation = true;
    }

    private static final Class<Object> _notNullClass(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    public boolean _acceptJsonFormatVisitorForEnum(ksd ksdVar, JavaType javaType, Class<?> cls) throws JsonMappingException {
        ksdVar.f(javaType);
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        JavaType type = this._accessor.getType();
        Class<?> declaringClass = this._accessor.getDeclaringClass();
        if (declaringClass != null && declaringClass.isEnum() && _acceptJsonFormatVisitorForEnum(ksdVar, javaType, declaringClass)) {
            return;
        }
        eud<Object> eudVarFindTypedValueSerializer = this._valueSerializer;
        if (eudVarFindTypedValueSerializer == null && (eudVarFindTypedValueSerializer = ksdVar.a().findTypedValueSerializer(type, false, this._property)) == null) {
            ksdVar.k(javaType);
        } else {
            eudVarFindTypedValueSerializer.acceptJsonFormatVisitor(ksdVar, type);
        }
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<?> eudVar = this._valueSerializer;
        if (eudVar != null) {
            return withResolved(beanProperty, wwlVar.handlePrimaryContextualization(eudVar, beanProperty), this._forceTypeInformation);
        }
        JavaType type = this._accessor.getType();
        if (!wwlVar.isEnabled(MapperFeature.USE_STATIC_TYPING) && !type.isFinal()) {
            return this;
        }
        eud<Object> eudVarFindPrimaryPropertySerializer = wwlVar.findPrimaryPropertySerializer(type, beanProperty);
        return withResolved(beanProperty, eudVarFindPrimaryPropertySerializer, isNaturalTypeWithStdHandling(type.getRawClass(), eudVarFindPrimaryPropertySerializer));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException {
        Object obj = this._valueSerializer;
        return obj instanceof rfl ? ((rfl) obj).getSchema(wwlVar, null) : ztd.a();
    }

    public boolean isNaturalTypeWithStdHandling(Class<?> cls, eud<?> eudVar) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return isDefaultSerializer(eudVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                wwlVar.defaultSerializeNull(jsonGenerator);
                return;
            }
            eud<Object> eudVarFindTypedValueSerializer = this._valueSerializer;
            if (eudVarFindTypedValueSerializer == null) {
                eudVarFindTypedValueSerializer = wwlVar.findTypedValueSerializer(value.getClass(), true, this._property);
            }
            eudVarFindTypedValueSerializer.serialize(value, jsonGenerator, wwlVar);
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, this._accessor.getName() + "()");
        }
    }

    @Override // defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                wwlVar.defaultSerializeNull(jsonGenerator);
                return;
            }
            eud<Object> eudVarFindValueSerializer = this._valueSerializer;
            if (eudVarFindValueSerializer == null) {
                eudVarFindValueSerializer = wwlVar.findValueSerializer(value.getClass(), this._property);
            } else if (this._forceTypeInformation) {
                WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(obj, JsonToken.VALUE_STRING));
                eudVarFindValueSerializer.serialize(value, jsonGenerator, wwlVar);
                e5qVar.h(jsonGenerator, writableTypeIdG);
                return;
            }
            eudVarFindValueSerializer.serializeWithType(value, jsonGenerator, wwlVar, new a(e5qVar, obj));
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, obj, this._accessor.getName() + "()");
        }
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this._accessor.getDeclaringClass() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + this._accessor.getName() + ")";
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, eud<?> eudVar, boolean z) {
        return (this._property == beanProperty && this._valueSerializer == eudVar && z == this._forceTypeInformation) ? this : new JsonValueSerializer(this, beanProperty, eudVar, z);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, eud<?> eudVar, boolean z) {
        super(_notNullClass(jsonValueSerializer.handledType()));
        this._accessor = jsonValueSerializer._accessor;
        this._valueSerializer = eudVar;
        this._property = beanProperty;
        this._forceTypeInformation = z;
    }
}

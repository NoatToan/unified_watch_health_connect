package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.EnumValues;
import defpackage.c4h;
import defpackage.cj4;
import defpackage.eud;
import defpackage.fh2;
import defpackage.ksd;
import defpackage.mj1;
import defpackage.owl;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements cj4 {
    private static final long serialVersionUID = 1;
    protected final Boolean _serializeAsIndex;
    protected final EnumValues _values;

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.getEnumClass(), false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
    }

    public static Boolean _isShapeWrittenUsingIndex(Class<?> cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape shape = value == null ? null : value.getShape();
        if (shape == null || shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = shape;
        objArr[1] = cls.getName();
        objArr[2] = z ? "class" : "property";
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }

    public static EnumSerializer construct(Class<?> cls, SerializationConfig serializationConfig, fh2 fh2Var, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.constructFromName(serializationConfig, cls), _isShapeWrittenUsingIndex(cls, value, true, null));
    }

    public final boolean _serializeAsIndex(wwl wwlVar) {
        Boolean bool = this._serializeAsIndex;
        return bool != null ? bool.booleanValue() : wwlVar.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        if (_serializeAsIndex(ksdVar.a())) {
            visitIntFormat(ksdVar, javaType, JsonParser.NumberType.INT);
        } else {
            ksdVar.f(javaType);
        }
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        Boolean bool_isShapeWrittenUsingIndex;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
        return (valueFindFormatOverrides == null || (bool_isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(handledType(), valueFindFormatOverrides, false, this._serializeAsIndex)) == this._serializeAsIndex) ? this : new EnumSerializer(this._values, bool_isShapeWrittenUsingIndex);
    }

    public EnumValues getEnumValues() {
        return this._values;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        if (_serializeAsIndex(wwlVar)) {
            return createSchemaNode("integer", true);
        }
        c4h c4hVarCreateSchemaNode = createSchemaNode("string", true);
        if (type != null && wwlVar.constructType(type).isEnumType()) {
            mj1 mj1VarM0 = c4hVarCreateSchemaNode.m0("enum");
            Iterator<owl> it = this._values.values().iterator();
            while (it.hasNext()) {
                mj1VarM0.e0(it.next().getValue());
            }
        }
        return c4hVarCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public final void serialize(Enum<?> r2, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (_serializeAsIndex(wwlVar)) {
            jsonGenerator.v0(r2.ordinal());
        } else if (wwlVar.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.Q0(r2.toString());
        } else {
            jsonGenerator.P0(this._values.serializedValueFor(r2));
        }
    }
}

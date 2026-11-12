package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public final class BooleanSerializer extends StdScalarSerializer<Object> implements cj4 {
    private static final long serialVersionUID = 1;
    protected final boolean _forPrimitive;

    public static final class a extends StdScalarSerializer<Object> implements cj4 {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7706a;

        public a(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class, false);
            this.f7706a = z;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitIntFormat(ksdVar, javaType, JsonParser.NumberType.INT);
        }

        @Override // defpackage.cj4
        public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, Boolean.class);
            return (valueFindFormatOverrides == null || valueFindFormatOverrides.getShape().isNumeric()) ? this : new BooleanSerializer(this.f7706a);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.v0(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
        public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
            jsonGenerator.f0(Boolean.TRUE.equals(obj));
        }
    }

    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this._forPrimitive = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.n(javaType);
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, Boolean.class);
        return (valueFindFormatOverrides == null || !valueFindFormatOverrides.getShape().isNumeric()) ? this : new a(this._forPrimitive);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode("boolean", !this._forPrimitive);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.f0(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        jsonGenerator.f0(Boolean.TRUE.equals(obj));
    }
}

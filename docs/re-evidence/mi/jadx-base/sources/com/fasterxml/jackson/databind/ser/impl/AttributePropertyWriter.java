package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import defpackage.ih2;
import defpackage.ld1;
import defpackage.wwl;

/* JADX INFO: loaded from: classes4.dex */
public class AttributePropertyWriter extends VirtualBeanPropertyWriter {
    private static final long serialVersionUID = 1;
    protected final String _attrName;

    public AttributePropertyWriter(String str, ih2 ih2Var, ld1 ld1Var, JavaType javaType, JsonInclude.Value value) {
        super(ih2Var, ld1Var, javaType, null, null, null, value, null);
        this._attrName = str;
    }

    public static AttributePropertyWriter construct(String str, ih2 ih2Var, ld1 ld1Var, JavaType javaType) {
        return new AttributePropertyWriter(str, ih2Var, ld1Var, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public Object value(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws Exception {
        return wwlVar.getAttribute(this._attrName);
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, ih2 ih2Var, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }

    public AttributePropertyWriter(String str, ih2 ih2Var, ld1 ld1Var, JavaType javaType) {
        this(str, ih2Var, ld1Var, javaType, ih2Var.c());
    }

    public AttributePropertyWriter(AttributePropertyWriter attributePropertyWriter) {
        super(attributePropertyWriter);
        this._attrName = attributePropertyWriter._attrName;
    }
}

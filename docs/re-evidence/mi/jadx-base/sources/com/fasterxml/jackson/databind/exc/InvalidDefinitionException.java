package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.fh2;
import defpackage.ih2;

/* JADX INFO: loaded from: classes4.dex */
public class InvalidDefinitionException extends JsonMappingException {
    protected transient fh2 _beanDesc;
    protected transient ih2 _property;
    protected final JavaType _type;

    public InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, fh2 fh2Var, ih2 ih2Var) {
        return new InvalidDefinitionException(jsonParser, str, fh2Var, ih2Var);
    }

    public fh2 getBeanDescription() {
        return this._beanDesc;
    }

    public ih2 getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, fh2 fh2Var, ih2 ih2Var) {
        return new InvalidDefinitionException(jsonGenerator, str, fh2Var, ih2Var);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public InvalidDefinitionException(JsonParser jsonParser, String str, fh2 fh2Var, ih2 ih2Var) {
        super(jsonParser, str);
        this._type = fh2Var == null ? null : fh2Var.z();
        this._beanDesc = fh2Var;
        this._property = ih2Var;
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, fh2 fh2Var, ih2 ih2Var) {
        super(jsonGenerator, str);
        this._type = fh2Var == null ? null : fh2Var.z();
        this._beanDesc = fh2Var;
        this._property = ih2Var;
    }
}

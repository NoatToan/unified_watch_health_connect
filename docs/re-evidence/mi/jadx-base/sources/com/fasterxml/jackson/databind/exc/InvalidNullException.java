package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import defpackage.h04;

/* JADX INFO: loaded from: classes4.dex */
public class InvalidNullException extends MismatchedInputException {
    private static final long serialVersionUID = 1;
    protected final PropertyName _propertyName;

    public InvalidNullException(DeserializationContext deserializationContext, String str, PropertyName propertyName) {
        super(deserializationContext.getParser(), str);
        this._propertyName = propertyName;
    }

    public static InvalidNullException from(DeserializationContext deserializationContext, PropertyName propertyName, JavaType javaType) {
        InvalidNullException invalidNullException = new InvalidNullException(deserializationContext, String.format("Invalid `null` value encountered for property %s", h04.Y(propertyName, "<UNKNOWN>")), propertyName);
        if (javaType != null) {
            invalidNullException.setTargetType(javaType);
        }
        return invalidNullException;
    }

    public PropertyName getPropertyName() {
        return this._propertyName;
    }
}

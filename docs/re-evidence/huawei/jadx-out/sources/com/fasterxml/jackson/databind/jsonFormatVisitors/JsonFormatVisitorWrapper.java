package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface JsonFormatVisitorWrapper extends JsonFormatVisitorWithSerializerProvider {
    JsonAnyFormatVisitor expectAnyFormat(JavaType javaType) throws ym;

    JsonArrayFormatVisitor expectArrayFormat(JavaType javaType) throws ym;

    JsonBooleanFormatVisitor expectBooleanFormat(JavaType javaType) throws ym;

    JsonIntegerFormatVisitor expectIntegerFormat(JavaType javaType) throws ym;

    JsonMapFormatVisitor expectMapFormat(JavaType javaType) throws ym;

    JsonNullFormatVisitor expectNullFormat(JavaType javaType) throws ym;

    JsonNumberFormatVisitor expectNumberFormat(JavaType javaType) throws ym;

    JsonObjectFormatVisitor expectObjectFormat(JavaType javaType) throws ym;

    JsonStringFormatVisitor expectStringFormat(JavaType javaType) throws ym;

    public static class d implements JsonFormatVisitorWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected SerializerProvider f4172a;

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonAnyFormatVisitor expectAnyFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonArrayFormatVisitor expectArrayFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonBooleanFormatVisitor expectBooleanFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonIntegerFormatVisitor expectIntegerFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonMapFormatVisitor expectMapFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonNullFormatVisitor expectNullFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonNumberFormatVisitor expectNumberFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonObjectFormatVisitor expectObjectFormat(JavaType javaType) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
        public JsonStringFormatVisitor expectStringFormat(JavaType javaType) throws ym {
            return null;
        }

        public d() {
        }

        public d(SerializerProvider serializerProvider) {
            this.f4172a = serializerProvider;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider
        public SerializerProvider getProvider() {
            return this.f4172a;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider
        public void setProvider(SerializerProvider serializerProvider) {
            this.f4172a = serializerProvider;
        }
    }
}

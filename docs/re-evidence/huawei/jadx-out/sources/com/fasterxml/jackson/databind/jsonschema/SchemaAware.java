package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import defpackage.ym;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public interface SchemaAware {
    JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws ym;

    JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) throws ym;
}

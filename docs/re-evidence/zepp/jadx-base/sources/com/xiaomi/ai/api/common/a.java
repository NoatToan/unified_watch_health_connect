package com.xiaomi.ai.api.common;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes18.dex */
class a extends StdSerializer<Object> {
    public a() {
        super(Object.class);
    }

    private void a(JsonGenerator jsonGenerator) throws JsonGenerationException {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        JsonStreamContext outputContext = jsonGenerator.getOutputContext();
        Object currentValue = outputContext.getCurrentValue();
        while (outputContext != null) {
            String currentName = "]";
            if (outputContext.inRoot()) {
                sb = new StringBuilder();
                sb.append("[");
                sb.append(currentValue.getClass().getName());
            } else if (outputContext.inArray()) {
                sb = new StringBuilder();
                sb.append("/[");
                sb.append(outputContext.getCurrentIndex());
            } else {
                sb = new StringBuilder();
                sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                currentName = outputContext.getCurrentName();
            }
            sb.append(currentName);
            sb2.insert(0, sb.toString());
            if (outputContext.getCurrentValue() != null) {
                currentValue = outputContext.getCurrentValue();
            }
            outputContext = outputContext.getParent();
        }
        Utils.dumpValue(currentValue, sb2);
        throw new JsonGenerationException(String.format("Missing required value: %s", sb2.toString()));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws JsonGenerationException {
        a(jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws JsonGenerationException {
        a(jsonGenerator);
    }
}

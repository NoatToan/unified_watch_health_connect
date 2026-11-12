package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public StackTraceElementDeserializer() {
        super((Class<?>) StackTraceElement.class);
    }

    @Deprecated
    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5) {
        return constructValue(deserializationContext, str, str2, str3, i, str4, str5, null);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i);
    }

    @Override // defpackage.esd
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK != JsonToken.START_OBJECT) {
            if (jsonTokenK != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.G0();
            StackTraceElement stackTraceElementDeserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.G0() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return stackTraceElementDeserialize;
        }
        String strD0 = null;
        String strD1 = null;
        String strD2 = null;
        String strD3 = "";
        String strD4 = strD3;
        String strD5 = strD4;
        int iR = -1;
        while (true) {
            JsonToken jsonTokenH0 = jsonParser.H0();
            if (jsonTokenH0 == JsonToken.END_OBJECT) {
                return constructValue(deserializationContext, strD3, strD4, strD5, iR, strD0, strD1, strD2);
            }
            String strJ = jsonParser.J();
            if ("className".equals(strJ)) {
                strD3 = jsonParser.d0();
            } else if ("classLoaderName".equals(strJ)) {
                strD2 = jsonParser.d0();
            } else if ("fileName".equals(strJ)) {
                strD5 = jsonParser.d0();
            } else if ("lineNumber".equals(strJ)) {
                iR = jsonTokenH0.isNumeric() ? jsonParser.R() : _parseIntPrimitive(jsonParser, deserializationContext);
            } else if ("methodName".equals(strJ)) {
                strD4 = jsonParser.d0();
            } else if (!"nativeMethod".equals(strJ)) {
                if ("moduleName".equals(strJ)) {
                    strD0 = jsonParser.d0();
                } else if ("moduleVersion".equals(strJ)) {
                    strD1 = jsonParser.d0();
                } else if (!"declaringClass".equals(strJ) && !"format".equals(strJ)) {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, strJ);
                }
            }
            jsonParser.O0();
        }
    }
}

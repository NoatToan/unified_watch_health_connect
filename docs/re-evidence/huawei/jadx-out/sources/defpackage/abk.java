package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class abk extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public abk() {
        super((Class<?>) StackTraceElement.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i_parseIntPrimitive;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            String text = null;
            String text2 = null;
            String text3 = null;
            String text4 = "";
            String text5 = text4;
            String text6 = text5;
            int i = -1;
            while (true) {
                JsonToken jsonTokenNextValue = jsonParser.nextValue();
                if (jsonTokenNextValue != JsonToken.END_OBJECT) {
                    String strCurrentName = jsonParser.currentName();
                    if ("className".equals(strCurrentName)) {
                        text4 = jsonParser.getText();
                    } else if ("classLoaderName".equals(strCurrentName)) {
                        text3 = jsonParser.getText();
                    } else if (ContentResource.FILE_NAME.equals(strCurrentName)) {
                        text6 = jsonParser.getText();
                    } else if ("lineNumber".equals(strCurrentName)) {
                        if (jsonTokenNextValue.isNumeric()) {
                            i_parseIntPrimitive = jsonParser.getIntValue();
                        } else {
                            i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
                        }
                        i = i_parseIntPrimitive;
                    } else if ("methodName".equals(strCurrentName)) {
                        text5 = jsonParser.getText();
                    } else if (!"nativeMethod".equals(strCurrentName)) {
                        if ("moduleName".equals(strCurrentName)) {
                            text = jsonParser.getText();
                        } else if ("moduleVersion".equals(strCurrentName)) {
                            text2 = jsonParser.getText();
                        } else if (!"declaringClass".equals(strCurrentName) && !"format".equals(strCurrentName)) {
                            handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, strCurrentName);
                        }
                    }
                    jsonParser.skipChildren();
                } else {
                    return c(deserializationContext, text4, text5, text6, i, text, text2, text3);
                }
            }
        } else {
            if (jsonTokenCurrentToken == JsonToken.START_ARRAY && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.nextToken();
                StackTraceElement stackTraceElementDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return stackTraceElementDeserialize;
            }
            return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    protected StackTraceElement c(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i);
    }
}

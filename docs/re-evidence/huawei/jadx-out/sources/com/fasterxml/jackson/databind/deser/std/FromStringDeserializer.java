package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import defpackage.abs;
import defpackage.ahw;
import defpackage.yj;
import defpackage.ym;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {
    public abstract T _deserialize(String str, DeserializationContext deserializationContext) throws IOException;

    @Deprecated
    protected final T _deserializeFromEmptyString() throws IOException {
        return null;
    }

    public static Class<?>[] types() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class};
    }

    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static FromStringDeserializer<?> findDeserializer(Class<?> cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == JavaType.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new e();
                }
                return null;
            }
            i = 12;
        }
        return new a(cls, i);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.OtherScalar;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        String valueAsString = jsonParser.getValueAsString();
        if (valueAsString == null) {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken != JsonToken.START_OBJECT) {
                return (T) _deserializeFromOther(jsonParser, deserializationContext, jsonTokenCurrentToken);
            }
            valueAsString = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        }
        if (!valueAsString.isEmpty()) {
            String strTrim = valueAsString.trim();
            if (!strTrim.isEmpty()) {
                try {
                    return _deserialize(strTrim, deserializationContext);
                } catch (IllegalArgumentException | MalformedURLException e2) {
                    String message = e2.getMessage();
                    if (message == null) {
                        str = "not a valid textual representation";
                    } else {
                        str = "not a valid textual representation, problem: " + message;
                    }
                    ym ymVarWeirdStringException = deserializationContext.weirdStringException(strTrim, this._valueClass, str);
                    ymVarWeirdStringException.initCause(e2);
                    throw ymVarWeirdStringException;
                }
            }
        }
        return (T) _deserializeFromEmptyString(deserializationContext);
    }

    protected Object _deserializeFromOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            if (embeddedObject == null) {
                return null;
            }
            return this._valueClass.isAssignableFrom(embeddedObject.getClass()) ? embeddedObject : _deserializeEmbedded(embeddedObject, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportInputMismatch(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        return null;
    }

    protected Object _deserializeFromEmptyString(DeserializationContext deserializationContext) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.EmptyString);
        if (coercionActionFindCoercionAction == CoercionAction.Fail) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", _coercedTypeDesc());
        }
        if (coercionActionFindCoercionAction == CoercionAction.AsNull) {
            return getNullValue(deserializationContext);
        }
        if (coercionActionFindCoercionAction == CoercionAction.AsEmpty) {
            return getEmptyValue(deserializationContext);
        }
        return _deserializeFromEmptyStringDefault(deserializationContext);
    }

    protected Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
        return getNullValue(deserializationContext);
    }

    public static class a extends FromStringDeserializer<Object> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final int f4130c;

        protected a(Class<?> cls, int i) {
            super(cls);
            this.f4130c = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            switch (this.f4130c) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, ahw.b((Throwable) e));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().b(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int iB = b(str);
                    if (iB < 0) {
                        return new Locale(str);
                    }
                    String strSubstring = str.substring(0, iB);
                    String strSubstring2 = str.substring(iB + 1);
                    int iB2 = b(strSubstring2);
                    if (iB2 < 0) {
                        return new Locale(strSubstring, strSubstring2);
                    }
                    return new Locale(strSubstring, strSubstring2.substring(0, iB2), strSubstring2.substring(iB2 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int iLastIndexOf = str.lastIndexOf(93);
                        if (iLastIndexOf == -1) {
                            throw new abs(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                        }
                        int iIndexOf = str.indexOf(58, iLastIndexOf);
                        return new InetSocketAddress(str.substring(0, iLastIndexOf + 1), iIndexOf > -1 ? Integer.parseInt(str.substring(iIndexOf + 1)) : 0);
                    }
                    int iIndexOf2 = str.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        int i = iIndexOf2 + 1;
                        if (str.indexOf(58, i) < 0) {
                            return new InetSocketAddress(str.substring(0, iIndexOf2), Integer.parseInt(str.substring(i)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                default:
                    yj.d();
                    return null;
            }
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            int i = this.f4130c;
            if (i == 3) {
                return URI.create("");
            }
            if (i == 8) {
                return Locale.ROOT;
            }
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        protected Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
            return getEmptyValue(deserializationContext);
        }

        protected int b(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '_' || cCharAt == '-') {
                    return i;
                }
            }
            return -1;
        }
    }

    static class e extends FromStringDeserializer<Object> {
        public e() {
            super(StringBuilder.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public LogicalType logicalType() {
            return LogicalType.Textual;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return new StringBuilder();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String valueAsString = jsonParser.getValueAsString();
            if (valueAsString != null) {
                return _deserialize(valueAsString, deserializationContext);
            }
            return super.deserialize(jsonParser, deserializationContext);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuilder(str);
        }
    }
}

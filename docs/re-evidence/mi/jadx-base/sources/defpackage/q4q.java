package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q4q {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31103a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f31103a = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31103a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31103a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31103a[JsonToken.VALUE_TRUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31103a[JsonToken.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        return deserializeIfNatural(jsonParser, deserializationContext, javaType.getRawClass());
    }

    public abstract Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract q4q forProperty(BeanProperty beanProperty);

    public abstract Class<?> getDefaultImpl();

    public abstract String getPropertyName();

    public abstract r4q getTypeIdResolver();

    public abstract JsonTypeInfo.As getTypeInclusion();

    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == null) {
            return null;
        }
        int i = a.f31103a[jsonTokenK.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && cls.isAssignableFrom(Boolean.class)) {
                            return Boolean.FALSE;
                        }
                    } else if (cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.TRUE;
                    }
                } else if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jsonParser.O());
                }
            } else if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(jsonParser.R());
            }
        } else if (cls.isAssignableFrom(String.class)) {
            return jsonParser.d0();
        }
        return null;
    }
}

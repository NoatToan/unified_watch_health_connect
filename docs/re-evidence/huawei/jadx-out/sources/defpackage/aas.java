package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class aas extends StdScalarDeserializer<Object> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ahv f180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object[] f181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ahv f182c;
    private final Enum<?> d;
    protected final Boolean e;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    public aas(ahz ahzVar, Boolean bool) {
        super(ahzVar.e());
        this.f182c = ahzVar.d();
        this.f181b = ahzVar.a();
        this.d = ahzVar.c();
        this.e = bool;
    }

    protected aas(aas aasVar, Boolean bool) {
        super(aasVar);
        this.f182c = aasVar.f182c;
        this.f181b = aasVar.f181b;
        this.d = aasVar.d;
        this.e = bool;
    }

    public static JsonDeserializer<?> d(yi yiVar, Class<?> cls, aco acoVar, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (yiVar.canOverrideAccessModifiers()) {
            ahw.a(acoVar.getMember(), yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new abb(cls, acoVar, acoVar.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public static JsonDeserializer<?> a(yi yiVar, Class<?> cls, aco acoVar) {
        if (yiVar.canOverrideAccessModifiers()) {
            ahw.a(acoVar.getMember(), yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new abb(cls, acoVar);
    }

    public aas c(Boolean bool) {
        return Objects.equals(this.e, bool) ? this : new aas(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (boolFindFormatFeature == null) {
            boolFindFormatFeature = this.e;
        }
        return c(boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return d(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            return c(jsonParser, deserializationContext, jsonParser.getIntValue());
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            return d(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass));
        }
        return c(jsonParser, deserializationContext);
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        Object objB;
        ahv ahvVarE = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? e(deserializationContext) : this.f182c;
        Object objB2 = ahvVarE.b(str);
        if (objB2 != null) {
            return objB2;
        }
        String strTrim = str.trim();
        return (strTrim == str || (objB = ahvVarE.b(strTrim)) == null) ? c(jsonParser, deserializationContext, ahvVarE, strTrim) : objB;
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.Integer);
        if (coercionActionFindCoercionAction == CoercionAction.Fail) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(b(), Integer.valueOf(i), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, handledType(), Integer.valueOf(i), "Integer value (" + i + Constants.RIGHT_BRACKET_ONLY);
        }
        int i2 = AnonymousClass2.f183a[coercionActionFindCoercionAction.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return getEmptyValue(deserializationContext);
        }
        if (i >= 0) {
            Object[] objArr = this.f181b;
            if (i < objArr.length) {
                return objArr[i];
            }
        }
        if (this.d != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this.d;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdNumberValue(b(), Integer.valueOf(i), "index value outside legal index range [0..%s]", Integer.valueOf(this.f181b.length - 1));
    }

    /* JADX INFO: renamed from: aas$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f183a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f183a = iArr;
            try {
                iArr[CoercionAction.AsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f183a[CoercionAction.AsEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f183a[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private final Object c(JsonParser jsonParser, DeserializationContext deserializationContext, ahv ahvVar, String str) throws IOException {
        char cCharAt;
        CoercionAction coercionAction_checkCoercionFail;
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            if (this.d != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.d;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            if (str.isEmpty()) {
                coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext, _findCoercionFromEmptyString(deserializationContext), handledType(), str, "empty String (\"\")");
            } else {
                coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext, _findCoercionFromBlankString(deserializationContext), handledType(), str, "blank String (all whitespace)");
            }
            int i = AnonymousClass2.f183a[coercionAction_checkCoercionFail.ordinal()];
            if (i == 2 || i == 3) {
                return getEmptyValue(deserializationContext);
            }
            return null;
        }
        if (Boolean.TRUE.equals(this.e)) {
            Object objE = ahvVar.e(strTrim);
            if (objE != null) {
                return objE;
            }
        } else if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && (cCharAt = strTrim.charAt(0)) >= '0' && cCharAt <= '9') {
            try {
                int i2 = Integer.parseInt(strTrim);
                if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    return deserializationContext.handleWeirdStringValue(b(), strTrim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (i2 >= 0) {
                    Object[] objArr = this.f181b;
                    if (i2 < objArr.length) {
                        return objArr[i2];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this.d != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this.d;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdStringValue(b(), strTrim, "not one of the values accepted for Enum class: %s", ahvVar.e());
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.START_ARRAY)) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(b(), jsonParser);
    }

    protected Class<?> b() {
        return handledType();
    }

    protected ahv e(DeserializationContext deserializationContext) {
        ahv ahvVarD;
        ahv ahvVar = this.f180a;
        if (ahvVar != null) {
            return ahvVar;
        }
        synchronized (this) {
            ahvVarD = ahz.b(deserializationContext.getConfig(), b()).d();
        }
        this.f180a = ahvVarD;
        return ahvVarD;
    }
}

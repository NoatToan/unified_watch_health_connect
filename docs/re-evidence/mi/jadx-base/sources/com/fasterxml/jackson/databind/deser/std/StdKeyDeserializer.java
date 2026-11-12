package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import defpackage.bip;
import defpackage.esd;
import defpackage.h04;
import defpackage.n2h;
import defpackage.qqd;
import defpackage.vzd;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class StdKeyDeserializer extends vzd implements Serializable {
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_BYTE = 2;
    public static final int TYPE_BYTE_ARRAY = 17;
    public static final int TYPE_CALENDAR = 11;
    public static final int TYPE_CHAR = 4;
    public static final int TYPE_CLASS = 15;
    public static final int TYPE_CURRENCY = 16;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_DOUBLE = 8;
    public static final int TYPE_FLOAT = 7;
    public static final int TYPE_INT = 5;
    public static final int TYPE_LOCALE = 9;
    public static final int TYPE_LONG = 6;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_URI = 13;
    public static final int TYPE_URL = 14;
    public static final int TYPE_UUID = 12;
    private static final long serialVersionUID = 1;
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    public static final class a extends vzd implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f7658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final esd<?> f7659b;

        public a(Class<?> cls, esd<?> esdVar) {
            this.f7658a = cls;
            this.f7659b = esdVar;
        }

        @Override // defpackage.vzd
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            bip bipVar = new bip(deserializationContext.getParser(), deserializationContext);
            bipVar.Q0(str);
            try {
                JsonParser jsonParserF1 = bipVar.f1();
                jsonParserF1.G0();
                Object objDeserialize = this.f7659b.deserialize(jsonParserF1, deserializationContext);
                return objDeserialize != null ? objDeserialize : deserializationContext.handleWeirdKey(this.f7658a, str, "not a valid representation", new Object[0]);
            } catch (Exception e) {
                return deserializationContext.handleWeirdKey(this.f7658a, str, "not a valid representation: %s", e.getMessage());
            }
        }
    }

    @qqd
    public static final class b extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumResolver f7660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnnotatedMethod f7661b;
        public EnumResolver c;
        public final Enum<?> d;

        public b(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this.f7660a = enumResolver;
            this.f7661b = annotatedMethod;
            this.d = enumResolver.getDefaultValue();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            AnnotatedMethod annotatedMethod = this.f7661b;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e) {
                    h04.h0(e);
                }
            }
            EnumResolver enumResolverA = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? a(deserializationContext) : this.f7660a;
            Enum<?> enumFindEnum = enumResolverA.findEnum(str);
            if (enumFindEnum != null) {
                return enumFindEnum;
            }
            if (this.d == null || !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? deserializationContext.handleWeirdKey(this._keyClass, str, "not one of values excepted for Enum class: %s", enumResolverA.getEnumIds()) : enumFindEnum;
            }
            return this.d;
        }

        public final EnumResolver a(DeserializationContext deserializationContext) {
            EnumResolver enumResolverConstructUnsafeUsingToString = this.c;
            if (enumResolverConstructUnsafeUsingToString == null) {
                synchronized (this) {
                    enumResolverConstructUnsafeUsingToString = EnumResolver.constructUnsafeUsingToString(this.f7660a.getEnumClass(), deserializationContext.getAnnotationIntrospector());
                    this.c = enumResolverConstructUnsafeUsingToString;
                }
            }
            return enumResolverConstructUnsafeUsingToString;
        }
    }

    public static final class c extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Constructor<?> f7662a;

        public c(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.f7662a = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this.f7662a.newInstance(str);
        }
    }

    public static final class d extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f7663a;

        public d(Method method) {
            super(-1, method.getDeclaringClass());
            this.f7663a = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this.f7663a.invoke(null, str);
        }
    }

    @qqd
    public static final class e extends StdKeyDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f7664a = new e(String.class);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f7665b = new e(Object.class);
        private static final long serialVersionUID = 1;

        public e(Class<?> cls) {
            super(-1, cls);
        }

        public static e a(Class<?> cls) {
            if (cls == String.class) {
                return f7664a;
            }
            return cls == Object.class ? f7665b : new e(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, defpackage.vzd
        public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }
    }

    public StdKeyDeserializer(int i, Class<?> cls) {
        this(i, cls, null);
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class) {
            return e.a(cls);
        }
        if (cls == UUID.class) {
            i = 12;
        } else if (cls == Integer.class) {
            i = 5;
        } else if (cls == Long.class) {
            i = 6;
        } else if (cls == Date.class) {
            i = 10;
        } else if (cls == Calendar.class) {
            i = 11;
        } else if (cls == Boolean.class) {
            i = 1;
        } else if (cls == Byte.class) {
            i = 2;
        } else if (cls == Character.class) {
            i = 4;
        } else if (cls == Short.class) {
            i = 3;
        } else if (cls == Float.class) {
            i = 7;
        } else if (cls == Double.class) {
            i = 8;
        } else if (cls == URI.class) {
            i = 13;
        } else if (cls == URL.class) {
            i = 14;
        } else if (cls == Class.class) {
            i = 15;
        } else {
            if (cls == Locale.class) {
                return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, cls);
    }

    public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                return "false".equals(str) ? Boolean.FALSE : deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int i_parseInt = _parseInt(str);
                return (i_parseInt < -128 || i_parseInt > 255) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i_parseInt);
            case 3:
                int i_parseInt2 = _parseInt(str);
                return (i_parseInt2 < -32768 || i_parseInt2 > 32767) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i_parseInt2);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e2) {
                    return _weirdKey(deserializationContext, str, e2);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e3) {
                    return _weirdKey(deserializationContext, str, e3);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e4) {
                    return _weirdKey(deserializationContext, str, e4);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e5) {
                    return _weirdKey(deserializationContext, str, e5);
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e6) {
                    return _weirdKey(deserializationContext, str, e6);
                }
            case 17:
                try {
                    return deserializationContext.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e7) {
                    return _weirdKey(deserializationContext, str, e7);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    public double _parseDouble(String str) throws IllegalArgumentException {
        return n2h.i(str);
    }

    public int _parseInt(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

    public long _parseLong(String str) throws IllegalArgumentException {
        return Long.parseLong(str);
    }

    public Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", h04.n(exc));
    }

    @Override // defpackage.vzd
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object obj_parse = _parse(str, deserializationContext);
            if (obj_parse != null) {
                return obj_parse;
            }
            if (this._keyClass.isEnum() && deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
        } catch (Exception e2) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e2.getClass().getName(), h04.n(e2));
        }
    }

    public Class<?> getKeyClass() {
        return this._keyClass;
    }

    public StdKeyDeserializer(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }
}

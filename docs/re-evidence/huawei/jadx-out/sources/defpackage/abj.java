package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
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

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abj extends KeyDeserializer implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final FromStringDeserializer<?> f219b;
    protected final Class<?> e;

    protected abj(int i, Class<?> cls) {
        this(i, cls, null);
    }

    protected abj(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this.f218a = i;
        this.e = cls;
        this.f219b = fromStringDeserializer;
    }

    public static abj d(Class<?> cls) {
        int i;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return c.c(cls);
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
                return new abj(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new abj(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new abj(i, cls);
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object objC = c(str, deserializationContext);
            if (objC != null) {
                return objC;
            }
            if (ahw.m(this.e) && deserializationContext.getConfig().d(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this.e, str, "not a valid representation", new Object[0]);
        } catch (Exception e2) {
            return deserializationContext.handleWeirdKey(this.e, str, "not a valid representation, problem: (%s) %s", e2.getClass().getName(), ahw.a((Throwable) e2));
        }
    }

    protected Object c(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this.f218a) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                return deserializationContext.handleWeirdKey(this.e, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int iC = c(str);
                if (iC < -128 || iC > 255) {
                    return deserializationContext.handleWeirdKey(this.e, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) iC);
            case 3:
                int iC2 = c(str);
                if (iC2 < -32768 || iC2 > 32767) {
                    return deserializationContext.handleWeirdKey(this.e, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) iC2);
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                return deserializationContext.handleWeirdKey(this.e, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(c(str));
            case 6:
                return Long.valueOf(e(str));
            case 7:
                return Float.valueOf((float) b(str));
            case 8:
                return Double.valueOf(b(str));
            case 9:
                try {
                    return this.f219b._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e2) {
                    return c(deserializationContext, str, e2);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e3) {
                    return c(deserializationContext, str, e3);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e4) {
                    return c(deserializationContext, str, e4);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e5) {
                    return c(deserializationContext, str, e5);
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused) {
                    return deserializationContext.handleWeirdKey(this.e, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this.f219b._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e6) {
                    return c(deserializationContext, str, e6);
                }
            case 17:
                try {
                    return deserializationContext.getConfig().getBase64Variant().b(str);
                } catch (IllegalArgumentException e7) {
                    return c(deserializationContext, str, e7);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this.e);
        }
    }

    protected int c(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

    protected long e(String str) throws IllegalArgumentException {
        return Long.parseLong(str);
    }

    protected double b(String str) throws IllegalArgumentException {
        return xd.e(str);
    }

    protected Object c(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this.e, str, "problem: %s", ahw.a((Throwable) exc));
    }

    @JacksonStdImpl
    static final class c extends abj {
        private static final long serialVersionUID = 1;
        private static final c d = new c(String.class);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f223c = new c(Object.class);

        @Override // defpackage.abj, com.fasterxml.jackson.databind.KeyDeserializer
        public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }

        private c(Class<?> cls) {
            super(-1, cls);
        }

        public static c c(Class<?> cls) {
            if (cls == String.class) {
                return d;
            }
            if (cls == Object.class) {
                return f223c;
            }
            return new c(cls);
        }
    }

    static final class a extends KeyDeserializer implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final JsonDeserializer<?> f220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Class<?> f221c;

        protected a(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this.f221c = cls;
            this.f220b = jsonDeserializer;
        }

        @Override // com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            aii aiiVar = new aii(deserializationContext.getParser(), deserializationContext);
            aiiVar.writeString(str);
            try {
                JsonParser jsonParserB = aiiVar.b();
                jsonParserB.nextToken();
                Object objDeserialize = this.f220b.deserialize(jsonParserB, deserializationContext);
                return objDeserialize != null ? objDeserialize : deserializationContext.handleWeirdKey(this.f221c, str, "not a valid representation", new Object[0]);
            } catch (Exception e) {
                return deserializationContext.handleWeirdKey(this.f221c, str, "not a valid representation: %s", e.getMessage());
            }
        }
    }

    @JacksonStdImpl
    static final class b extends abj {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final ahz f222c;
        protected ahz d;
        protected final aco i;
        protected final Enum<?> j;

        protected b(ahz ahzVar, aco acoVar) {
            super(-1, ahzVar.e());
            this.f222c = ahzVar;
            this.i = acoVar;
            this.j = ahzVar.c();
        }

        @Override // defpackage.abj
        public Object c(String str, DeserializationContext deserializationContext) throws IOException {
            aco acoVar = this.i;
            if (acoVar != null) {
                try {
                    return acoVar.call1(str);
                } catch (Exception e) {
                    ahw.g(e);
                }
            }
            ahz ahzVarE = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? e(deserializationContext) : this.f222c;
            Enum<?> enumE = ahzVarE.e(str);
            if (enumE != null) {
                return enumE;
            }
            if (this.j == null || !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? deserializationContext.handleWeirdKey(this.e, str, "not one of the values accepted for Enum class: %s", ahzVarE.b()) : enumE;
            }
            return this.j;
        }

        private ahz e(DeserializationContext deserializationContext) {
            ahz ahzVarB;
            ahz ahzVar = this.d;
            if (ahzVar != null) {
                return ahzVar;
            }
            synchronized (this) {
                ahzVarB = ahz.b(deserializationContext.getConfig(), this.f222c.e());
                this.d = ahzVarB;
            }
            return ahzVarB;
        }
    }

    static final class d extends abj {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Constructor<?> f224c;

        public d(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.f224c = constructor;
        }

        @Override // defpackage.abj
        public Object c(String str, DeserializationContext deserializationContext) throws Exception {
            return this.f224c.newInstance(str);
        }
    }

    static final class e extends abj {
        private static final long serialVersionUID = 1;
        final Method d;

        public e(Method method) {
            super(-1, method.getDeclaringClass());
            this.d = method;
        }

        @Override // defpackage.abj
        public Object c(String str, DeserializationContext deserializationContext) throws Exception {
            return this.d.invoke(null, str);
        }
    }
}

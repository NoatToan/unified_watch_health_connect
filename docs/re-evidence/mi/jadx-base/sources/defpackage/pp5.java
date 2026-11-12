package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.a;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pp5 {
    private static final int MAX_ERROR_STR_LEN = 500;

    public String _colonConcat(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }

    public String _desc(String str) {
        return str == null ? "[N/A]" : _truncate(str);
    }

    public final String _format(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public String _quotedString(String str) {
        return str == null ? "[N/A]" : String.format("\"%s\"", _truncate(str));
    }

    public final String _truncate(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
    }

    public abstract boolean canOverrideAccessModifiers();

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return javaType.getRawClass() == cls ? javaType : getConfig().constructSpecializedType(javaType, cls);
    }

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public ak4<Object, Object> converterInstance(fd1 fd1Var, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ak4) {
            return (ak4) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == ak4.a.class || h04.K(cls)) {
            return null;
        }
        if (ak4.class.isAssignableFrom(cls)) {
            MapperConfig<?> config = getConfig();
            config.getHandlerInstantiator();
            return (ak4) h04.k(cls, config.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public abstract Class<?> getActiveView();

    public abstract AnnotationIntrospector getAnnotationIntrospector();

    public abstract Object getAttribute(Object obj);

    public abstract MapperConfig<?> getConfig();

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract Locale getLocale();

    public abstract TimeZone getTimeZone();

    public abstract TypeFactory getTypeFactory();

    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public abstract boolean isEnabled(MapperFeature mapperFeature);

    public ObjectIdGenerator<?> objectIdGeneratorInstance(fd1 fd1Var, z3h z3hVar) throws JsonMappingException {
        Class<? extends ObjectIdGenerator<?>> clsC = z3hVar.c();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return ((ObjectIdGenerator) h04.k(clsC, config.canOverrideAccessModifiers())).forScope(z3hVar.f());
    }

    public a objectIdResolverInstance(fd1 fd1Var, z3h z3hVar) {
        Class<? extends a> clsE = z3hVar.e();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return (a) h04.k(clsE, config.canOverrideAccessModifiers());
    }

    public abstract <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException;

    public <T> T reportBadDefinition(Class<?> cls, String str) throws JsonMappingException {
        return (T) reportBadDefinition(constructType(cls), str);
    }

    public JavaType resolveSubType(JavaType javaType, String str) throws JsonMappingException {
        if (str.indexOf(60) > 0) {
            JavaType javaTypeConstructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (javaTypeConstructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
                return javaTypeConstructFromCanonical;
            }
        } else {
            try {
                Class<?> clsFindClass = getTypeFactory().findClass(str);
                if (javaType.isTypeOrSuperTypeOf(clsFindClass)) {
                    return getTypeFactory().constructSpecializedType(javaType, clsFindClass);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e) {
                throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", e.getClass().getName(), h04.n(e)));
            }
        }
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    public abstract pp5 setAttribute(Object obj, Object obj2);
}

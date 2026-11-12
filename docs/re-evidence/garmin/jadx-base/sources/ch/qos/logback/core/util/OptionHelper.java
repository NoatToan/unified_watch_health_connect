package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.android.SystemPropertiesProxy;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.NodeToStringTransformer;
import java.util.Properties;
import n23.j;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes7.dex */
public class OptionHelper {
    static final String DELIM_DEFAULT = ":-";
    static final int DELIM_DEFAULT_LEN = 2;
    static final String DELIM_START = "${";
    static final int DELIM_START_LEN = 2;
    static final char DELIM_STOP = '}';
    static final int DELIM_STOP_LEN = 1;
    static final String _IS_UNDEFINED = "_IS_UNDEFINED";

    public static String[] extractDefaultReplacement(String str) {
        String[] strArr = new String[2];
        if (str != null) {
            strArr[0] = str;
            int iIndexOf = str.indexOf(":-");
            if (iIndexOf != -1) {
                strArr[0] = str.substring(0, iIndexOf);
                strArr[1] = str.substring(iIndexOf + 2);
            }
        }
        return strArr;
    }

    public static String getAndroidSystemProperty(String str) {
        try {
            return SystemPropertiesProxy.getInstance().get(str, null);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String getEnv(String str) {
        try {
            return System.getenv(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static Properties getSystemProperties() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    public static String getSystemProperty(String str) {
        try {
            String property = System.getProperty(str);
            return property == null ? getAndroidSystemProperty(str) : property;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static Object instantiateByClassName(String str, Class<?> cls, Context context) {
        return instantiateByClassName(str, cls, Loader.getClassLoaderOfObject(context));
    }

    public static Object instantiateByClassNameAndParameter(String str, Class<?> cls, ClassLoader classLoader, Class<?> cls2, Object obj) throws DynamicClassLoadingException, IncompatibleClassException {
        str.getClass();
        try {
            Class<?> clsLoadClass = classLoader.loadClass(str);
            if (cls.isAssignableFrom(clsLoadClass)) {
                return cls2 == null ? clsLoadClass.getConstructor(null).newInstance(null) : clsLoadClass.getConstructor(cls2).newInstance(obj);
            }
            throw new IncompatibleClassException(cls, clsLoadClass);
        } catch (IncompatibleClassException e4) {
            throw e4;
        } catch (Throwable th3) {
            throw new DynamicClassLoadingException("Failed to instantiate type ".concat(str), th3);
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String propertyLookup(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        String property = propertyContainer.getProperty(str);
        if (property == null && propertyContainer2 != null) {
            property = propertyContainer2.getProperty(str);
        }
        if (property == null) {
            property = getSystemProperty(str, null);
        }
        return property == null ? getEnv(str) : property;
    }

    public static void setSystemProperties(ContextAware contextAware, Properties properties) {
        for (String str : properties.keySet()) {
            setSystemProperty(contextAware, str, properties.getProperty(str));
        }
    }

    public static void setSystemProperty(ContextAware contextAware, String str, String str2) {
        try {
            System.setProperty(str, str2);
        } catch (SecurityException e4) {
            contextAware.addError("Failed to set system property [" + str + "]", e4);
        }
    }

    public static String substVars(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        try {
            return NodeToStringTransformer.substituteVariable(str, propertyContainer, propertyContainer2);
        } catch (ScanException e4) {
            j.w(am.j.m("Failed to parse input [", str, "]"), e4);
            return null;
        }
    }

    public static boolean toBoolean(String str, boolean z14) {
        if (str != null) {
            String strTrim = str.trim();
            if (BooleanUtils.TRUE.equalsIgnoreCase(strTrim)) {
                return true;
            }
            if (BooleanUtils.FALSE.equalsIgnoreCase(strTrim)) {
                return false;
            }
        }
        return z14;
    }

    public static Object instantiateByClassName(String str, Class<?> cls, ClassLoader classLoader) {
        return instantiateByClassNameAndParameter(str, cls, classLoader, (Class<?>) null, (Object) null);
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (SecurityException unused) {
            return str2;
        }
    }

    public static String substVars(String str, PropertyContainer propertyContainer) {
        return substVars(str, propertyContainer, null);
    }

    public static Object instantiateByClassNameAndParameter(String str, Class<?> cls, Context context, Class<?> cls2, Object obj) {
        return instantiateByClassNameAndParameter(str, cls, Loader.getClassLoaderOfObject(context), cls2, obj);
    }
}

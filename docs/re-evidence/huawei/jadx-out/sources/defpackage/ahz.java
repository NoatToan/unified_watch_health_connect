package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ahz implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class<Enum<?>> f441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Enum<?>[] f442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Enum<?> f443c;
    protected final HashMap<String, Enum<?>> d;
    protected final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    protected static Class<Enum<?>> a(Class<?> cls) {
        return cls;
    }

    protected ahz(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> map, Enum<?> r4, boolean z) {
        this.f441a = cls;
        this.f442b = enumArr;
        this.d = map;
        this.f443c = r4;
        this.e = z;
    }

    public static ahz a(yi yiVar, Class<?> cls) {
        return c(cls, yiVar.getAnnotationIntrospector(), yiVar.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    protected static ahz c(Class<?> cls, AnnotationIntrospector annotationIntrospector, boolean z) {
        Class<Enum<?>> clsA = a(cls);
        Enum<?>[] enumArrC = c(cls);
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(clsA, enumArrC, new String[enumArrC.length]);
        String[][] strArr = new String[strArrFindEnumValues.length][];
        annotationIntrospector.findEnumAliases(clsA, enumArrC, strArr);
        HashMap map = new HashMap();
        int length = enumArrC.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r7 = enumArrC[i];
            String strName = strArrFindEnumValues[i];
            if (strName == null) {
                strName = r7.name();
            }
            map.put(strName, r7);
            String[] strArr2 = strArr[i];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!map.containsKey(str)) {
                        map.put(str, r7);
                    }
                }
            }
        }
        return new ahz(clsA, enumArrC, map, e(annotationIntrospector, clsA), z);
    }

    public static ahz b(yi yiVar, Class<?> cls) {
        return d(cls, yiVar.getAnnotationIntrospector(), yiVar.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    protected static ahz d(Class<?> cls, AnnotationIntrospector annotationIntrospector, boolean z) {
        Class<Enum<?>> clsA = a(cls);
        Enum<?>[] enumArrC = c(cls);
        HashMap map = new HashMap();
        String[][] strArr = new String[enumArrC.length][];
        annotationIntrospector.findEnumAliases(clsA, enumArrC, strArr);
        int length = enumArrC.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r4 = enumArrC[length];
                map.put(r4.toString(), r4);
                String[] strArr2 = strArr[length];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        if (!map.containsKey(str)) {
                            map.put(str, r4);
                        }
                    }
                }
            } else {
                return new ahz(clsA, enumArrC, map, e(annotationIntrospector, clsA), z);
            }
        }
    }

    public static ahz c(yi yiVar, Class<?> cls, AnnotatedMember annotatedMember) {
        return c(cls, annotatedMember, yiVar.getAnnotationIntrospector(), yiVar.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    protected static ahz c(Class<?> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector, boolean z) {
        Class<Enum<?>> clsA = a(cls);
        Enum<?>[] enumArrC = c(cls);
        HashMap map = new HashMap();
        int length = enumArrC.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r0 = enumArrC[length];
                try {
                    Object value = annotatedMember.getValue(r0);
                    if (value != null) {
                        map.put(value.toString(), r0);
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r0 + ": " + e.getMessage());
                }
            } else {
                return new ahz(clsA, enumArrC, map, e(annotationIntrospector, clsA), z);
            }
        }
    }

    public ahv d() {
        return ahv.d(this.d);
    }

    protected static Enum<?>[] c(Class<?> cls) {
        Enum<?>[] enumConstants = a(cls).getEnumConstants();
        if (enumConstants != null) {
            return enumConstants;
        }
        throw new IllegalArgumentException("No enum constants for class " + cls.getName());
    }

    protected static Enum<?> e(AnnotationIntrospector annotationIntrospector, Class<?> cls) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(a(cls));
        }
        return null;
    }

    public Enum<?> e(String str) {
        Enum<?> r0 = this.d.get(str);
        return (r0 == null && this.e) ? d(str) : r0;
    }

    protected Enum<?> d(String str) {
        for (Map.Entry<String, Enum<?>> entry : this.d.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Enum<?> c() {
        return this.f443c;
    }

    public Enum<?>[] a() {
        return this.f442b;
    }

    public Collection<String> b() {
        return this.d.keySet();
    }

    public Class<Enum<?>> e() {
        return this.f441a;
    }
}

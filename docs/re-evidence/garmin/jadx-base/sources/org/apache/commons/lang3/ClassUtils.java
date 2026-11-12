package org.apache.commons.lang3;

import am.j;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.mutable.MutableObject;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ClassUtils {
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    private static final Map<String, String> abbreviationMap;
    private static final Map<String, Class<?>> namePrimitiveMap;
    private static final Map<Class<?>, Class<?>> primitiveWrapperMap;
    private static final Map<String, String> reverseAbbreviationMap;
    private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap;
    public static final String PACKAGE_SEPARATOR = String.valueOf('.');
    public static final String INNER_CLASS_SEPARATOR = String.valueOf('$');

    public enum Interfaces {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap map = new HashMap();
        namePrimitiveMap = map;
        Class cls = Boolean.TYPE;
        map.put("boolean", cls);
        Class cls2 = Byte.TYPE;
        map.put("byte", cls2);
        Class cls3 = Character.TYPE;
        map.put("char", cls3);
        Class cls4 = Short.TYPE;
        map.put("short", cls4);
        Class cls5 = Integer.TYPE;
        map.put("int", cls5);
        Class cls6 = Long.TYPE;
        map.put("long", cls6);
        Class cls7 = Double.TYPE;
        map.put("double", cls7);
        Class cls8 = Float.TYPE;
        map.put("float", cls8);
        Class cls9 = Void.TYPE;
        map.put("void", cls9);
        HashMap map2 = new HashMap();
        primitiveWrapperMap = map2;
        map2.put(cls, Boolean.class);
        map2.put(cls2, Byte.class);
        map2.put(cls3, Character.class);
        map2.put(cls4, Short.class);
        map2.put(cls5, Integer.class);
        map2.put(cls6, Long.class);
        map2.put(cls7, Double.class);
        map2.put(cls8, Float.class);
        map2.put(cls9, cls9);
        wrapperPrimitiveMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Class<?> cls10 = (Class) entry.getKey();
            Class<?> cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                wrapperPrimitiveMap.put(cls11, cls10);
            }
        }
        HashMap map3 = new HashMap();
        map3.put("int", "I");
        map3.put("boolean", "Z");
        map3.put("float", "F");
        map3.put("long", "J");
        map3.put("short", "S");
        map3.put("byte", "B");
        map3.put("double", "D");
        map3.put("char", "C");
        HashMap map4 = new HashMap();
        for (Map.Entry entry2 : map3.entrySet()) {
            map4.put(entry2.getValue(), entry2.getKey());
        }
        abbreviationMap = Collections.unmodifiableMap(map3);
        reverseAbbreviationMap = Collections.unmodifiableMap(map4);
    }

    public static List<Class<?>> convertClassNamesToClasses(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Class.forName(it.next()));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static List<String> convertClassesToClassNames(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    public static String getAbbreviatedName(String str, int i14) {
        char c14;
        if (i14 <= 0) {
            h.s("len must be > 0");
            return null;
        }
        if (str == null) {
            return "";
        }
        if (str.length() <= i14) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i15 = 0;
        int i16 = 0;
        while (i15 < charArray.length) {
            int i17 = i16;
            while (i15 < charArray.length && (c14 = charArray[i15]) != '.') {
                i15++;
                charArray[i17] = c14;
                i17++;
            }
            int i18 = i16 + 1;
            if (!useFull(i17, i15, charArray.length, i14) && i18 <= i17) {
                i17 = i18;
            }
            if (i15 < charArray.length) {
                i16 = i17 + 1;
                charArray[i17] = charArray[i15];
                i15++;
            } else {
                i16 = i17;
            }
        }
        return new String(charArray, 0, i16);
    }

    private static void getAllInterfaces(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    getAllInterfaces(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> getAllSuperclasses(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    private static String getCanonicalName(String str) {
        String strDeleteWhitespace = StringUtils.deleteWhitespace(str);
        if (strDeleteWhitespace == null) {
            return null;
        }
        int i14 = 0;
        while (strDeleteWhitespace.startsWith("[")) {
            i14++;
            strDeleteWhitespace = strDeleteWhitespace.substring(1);
        }
        if (i14 < 1) {
            return strDeleteWhitespace;
        }
        if (strDeleteWhitespace.startsWith("L")) {
            strDeleteWhitespace = strDeleteWhitespace.substring(1, strDeleteWhitespace.endsWith(";") ? strDeleteWhitespace.length() - 1 : strDeleteWhitespace.length());
        } else if (!strDeleteWhitespace.isEmpty()) {
            strDeleteWhitespace = reverseAbbreviationMap.get(strDeleteWhitespace.substring(0, 1));
        }
        StringBuilder sb3 = new StringBuilder(strDeleteWhitespace);
        for (int i15 = 0; i15 < i14; i15++) {
            sb3.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return sb3.toString();
    }

    public static Class<?> getClass(ClassLoader classLoader, String str, boolean z14) throws ClassNotFoundException {
        try {
            Map<String, Class<?>> map = namePrimitiveMap;
            return map.containsKey(str) ? map.get(str) : Class.forName(toCanonicalName(str), z14, classLoader);
        } catch (ClassNotFoundException e4) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                try {
                    return getClass(classLoader, str.substring(0, iLastIndexOf) + '$' + str.substring(iLastIndexOf + 1), z14);
                } catch (ClassNotFoundException unused) {
                    throw e4;
                }
            }
            throw e4;
        }
    }

    public static String getName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getName();
    }

    public static String getPackageCanonicalName(Object obj, String str) {
        return obj == null ? str : getPackageCanonicalName(obj.getClass().getName());
    }

    public static String getPackageName(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }

    public static Method getPublicMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
            return method;
        }
        ArrayList<Class> arrayList = new ArrayList(getAllInterfaces(cls));
        arrayList.addAll(getAllSuperclasses(cls));
        for (Class cls2 : arrayList) {
            if (Modifier.isPublic(cls2.getModifiers())) {
                try {
                    Method method2 = cls2.getMethod(str, clsArr);
                    if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                    continue;
                }
            }
        }
        StringBuilder sbL = hb.a.l("Can't find a public method for ", str, StringUtils.SPACE);
        sbL.append(ArrayUtils.toString(clsArr));
        throw new NoSuchMethodException(sbL.toString());
    }

    public static String getShortCanonicalName(Object obj, String str) {
        return obj == null ? str : getShortCanonicalName(obj.getClass().getName());
    }

    public static String getShortClassName(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb3.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = fb1.c.m(1, 1, str);
            }
            Map<String, String> map = reverseAbbreviationMap;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iIndexOf = str.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace('$', '.');
        }
        return strSubstring + ((Object) sb3);
    }

    public static String getSimpleName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getSimpleName();
    }

    public static Iterable<Class<?>> hierarchy(final Class<?> cls, Interfaces interfaces) {
        final int i14 = 0;
        final Iterable<Class<?>> iterable = new Iterable() { // from class: org.apache.commons.lang3.a
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                switch (i14) {
                    case 0:
                        return ClassUtils.lambda$hierarchy$0((Class) cls);
                    default:
                        return ClassUtils.lambda$hierarchy$1((a) cls);
                }
            }
        };
        if (interfaces != Interfaces.INCLUDE) {
            return iterable;
        }
        final int i15 = 1;
        return new Iterable() { // from class: org.apache.commons.lang3.a
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                switch (i15) {
                    case 0:
                        return ClassUtils.lambda$hierarchy$0((Class) iterable);
                    default:
                        return ClassUtils.lambda$hierarchy$1((a) iterable);
                }
            }
        };
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2, boolean z14) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z14) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = primitiveToWrapper(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = wrapperToPrimitive(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        boolean zEquals = cls3.equals(cls);
        Class cls4 = Long.TYPE;
        Class cls5 = Double.TYPE;
        Class cls6 = Float.TYPE;
        if (zEquals) {
            return cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (cls4.equals(cls)) {
            return cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (Boolean.TYPE.equals(cls) || cls5.equals(cls)) {
            return false;
        }
        if (cls6.equals(cls)) {
            return cls5.equals(cls2);
        }
        if (Character.TYPE.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        Class cls7 = Short.TYPE;
        if (cls7.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (Byte.TYPE.equals(cls)) {
            return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        return false;
    }

    public static boolean isInnerClass(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static boolean isPrimitiveOrWrapper(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || isPrimitiveWrapper(cls);
    }

    public static boolean isPrimitiveWrapper(Class<?> cls) {
        return wrapperPrimitiveMap.containsKey(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$hierarchy$0(Class cls) {
        final MutableObject mutableObject = new MutableObject(cls);
        return new Iterator<Class<?>>() { // from class: org.apache.commons.lang3.ClassUtils.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return mutableObject.getValue2() != null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Class<?> next() {
                Class<?> cls2 = (Class) mutableObject.getValue2();
                mutableObject.setValue(cls2.getSuperclass());
                return cls2;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$hierarchy$1(Iterable iterable) {
        final HashSet hashSet = new HashSet();
        final Iterator it = iterable.iterator();
        return new Iterator<Class<?>>() { // from class: org.apache.commons.lang3.ClassUtils.2
            Iterator interfaces = Collections.EMPTY_SET.iterator();

            private void walkInterfaces(Set<Class<?>> set, Class<?> cls) {
                for (Class<?> cls2 : cls.getInterfaces()) {
                    if (!hashSet.contains(cls2)) {
                        set.add(cls2);
                    }
                    walkInterfaces(set, cls2);
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.interfaces.hasNext() || it.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Class<?> next() {
                if (this.interfaces.hasNext()) {
                    Class<?> cls = (Class) this.interfaces.next();
                    hashSet.add(cls);
                    return cls;
                }
                Class<?> cls2 = (Class) it.next();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                walkInterfaces(linkedHashSet, cls2);
                this.interfaces = linkedHashSet.iterator();
                return cls2;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static Class<?> primitiveToWrapper(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : primitiveWrapperMap.get(cls);
    }

    public static Class<?>[] primitivesToWrappers(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i14 = 0; i14 < clsArr.length; i14++) {
            clsArr2[i14] = primitiveToWrapper(clsArr[i14]);
        }
        return clsArr2;
    }

    private static String toCanonicalName(String str) {
        String strDeleteWhitespace = StringUtils.deleteWhitespace(str);
        Validate.notNull(strDeleteWhitespace, "className", new Object[0]);
        if (!strDeleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return strDeleteWhitespace;
        }
        StringBuilder sb3 = new StringBuilder();
        while (strDeleteWhitespace.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            strDeleteWhitespace = strDeleteWhitespace.substring(0, strDeleteWhitespace.length() - 2);
            sb3.append("[");
        }
        String str2 = abbreviationMap.get(strDeleteWhitespace);
        if (str2 != null) {
            sb3.append(str2);
        } else {
            j.y(sb3, "L", strDeleteWhitespace, ";");
        }
        return sb3.toString();
    }

    public static Class<?>[] toClass(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i14 = 0; i14 < objArr.length; i14++) {
            Object obj = objArr[i14];
            clsArr[i14] = obj == null ? null : obj.getClass();
        }
        return clsArr;
    }

    private static boolean useFull(int i14, int i15, int i16, int i17) {
        return i15 >= i16 || (i14 + i16) - i15 <= i17;
    }

    public static Class<?> wrapperToPrimitive(Class<?> cls) {
        return wrapperPrimitiveMap.get(cls);
    }

    public static Class<?>[] wrappersToPrimitives(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i14 = 0; i14 < clsArr.length; i14++) {
            clsArr2[i14] = wrapperToPrimitive(clsArr[i14]);
        }
        return clsArr2;
    }

    public static String getName(Class<?> cls, String str) {
        return cls == null ? str : cls.getName();
    }

    public static String getSimpleName(Class<?> cls, String str) {
        return cls == null ? str : cls.getSimpleName();
    }

    public static String getName(Object obj) {
        return getName(obj, "");
    }

    public static String getSimpleName(Object obj) {
        return getSimpleName(obj, "");
    }

    public static String getName(Class<?> cls) {
        return getName(cls, "");
    }

    public static String getSimpleName(Class<?> cls) {
        return getSimpleName(cls, "");
    }

    public static String getPackageCanonicalName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getPackageCanonicalName(cls.getName());
    }

    public static String getShortCanonicalName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getShortCanonicalName(cls.getName());
    }

    public static String getPackageCanonicalName(String str) {
        return getPackageName(getCanonicalName(str));
    }

    public static String getShortCanonicalName(String str) {
        return getShortClassName(getCanonicalName(str));
    }

    public static Iterable<Class<?>> hierarchy(Class<?> cls) {
        return hierarchy(cls, Interfaces.EXCLUDE);
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getAllInterfaces(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public static String getPackageName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getPackageName(cls.getName());
    }

    public static String getPackageName(Object obj, String str) {
        return obj == null ? str : getPackageName(obj.getClass());
    }

    public static Class<?> getClass(ClassLoader classLoader, String str) {
        return getClass(classLoader, str, true);
    }

    public static Class<?> getClass(String str) {
        return getClass(str, true);
    }

    public static Class<?> getClass(String str, boolean z14) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassUtils.class.getClassLoader();
        }
        return getClass(contextClassLoader, str, z14);
    }

    public static String getAbbreviatedName(Class<?> cls, int i14) {
        if (cls == null) {
            return "";
        }
        return getAbbreviatedName(cls.getName(), i14);
    }

    public static String getCanonicalName(Class<?> cls, String str) {
        String canonicalName;
        return (cls == null || (canonicalName = cls.getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String getCanonicalName(Object obj) {
        return getCanonicalName(obj, "");
    }

    public static String getCanonicalName(Object obj, String str) {
        String canonicalName;
        return (obj == null || (canonicalName = obj.getClass().getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String getCanonicalName(Class<?> cls) {
        return getCanonicalName(cls, "");
    }

    public static String getShortClassName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getShortClassName(cls.getName());
    }

    public static String getShortClassName(Object obj, String str) {
        return obj == null ? str : getShortClassName(obj.getClass());
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z14) {
        if (!ArrayUtils.isSameLength((Object[]) clsArr, (Object[]) clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        if (clsArr2 == null) {
            clsArr2 = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        for (int i14 = 0; i14 < clsArr.length; i14++) {
            if (!isAssignable(clsArr[i14], clsArr2[i14], z14)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2) {
        return isAssignable(cls, cls2, true);
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>... clsArr2) {
        return isAssignable(clsArr, clsArr2, true);
    }
}

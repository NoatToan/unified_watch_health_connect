package org.apache.commons.lang.p007enum;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Enum implements Comparable, Serializable {
    private static final Map c = Collections.unmodifiableMap(new HashMap(0));
    private static Map d = new WeakHashMap();
    public static /* synthetic */ Class e = null;
    public static /* synthetic */ Class f = null;
    private static final long serialVersionUID = -487045951170455942L;
    private final String a;
    private final transient int b;
    public transient String iToString = null;

    public static class a {
        public final Map a;
        public final Map b;
        public final List c;
        public final List d;

        public a() {
            HashMap map = new HashMap();
            this.a = map;
            this.b = Collections.unmodifiableMap(map);
            ArrayList arrayList = new ArrayList(25);
            this.c = arrayList;
            this.d = Collections.unmodifiableList(arrayList);
        }
    }

    public Enum(String str) {
        f(str);
        this.a = str;
        this.b = getEnumClass().hashCode() + 7 + (str.hashCode() * 3);
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    private static a b(Class cls) {
        a aVar = new a();
        for (Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            Class clsA = e;
            if (clsA == null) {
                clsA = a("org.apache.commons.lang.enum.Enum");
                e = clsA;
            }
            if (superclass == clsA) {
                break;
            }
            Class clsA2 = f;
            if (clsA2 == null) {
                clsA2 = a("org.apache.commons.lang.enum.ValuedEnum");
                f = clsA2;
            }
            if (superclass == clsA2) {
                break;
            }
            a aVar2 = (a) d.get(superclass);
            if (aVar2 != null) {
                aVar.c.addAll(aVar2.c);
                aVar.a.putAll(aVar2.a);
                break;
            }
        }
        return aVar;
    }

    private static a c(Class cls) {
        if (cls == null) {
            throw new IllegalArgumentException("The Enum Class must not be null");
        }
        Class clsA = e;
        if (clsA == null) {
            clsA = a("org.apache.commons.lang.enum.Enum");
            e = clsA;
        }
        if (!clsA.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("The Class must be a subclass of Enum");
        }
        a aVar = (a) d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            return (a) d.get(cls);
        } catch (Exception unused) {
            return aVar;
        }
    }

    private String e(Object obj) {
        try {
            return (String) obj.getClass().getMethod("getName", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw new IllegalStateException("This should not happen");
        }
    }

    private void f(String str) {
        a aVarB;
        if (StringUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The Enum name must not be empty or null");
        }
        Class<?> enumClass = getEnumClass();
        if (enumClass == null) {
            throw new IllegalArgumentException("getEnumClass() must not be null");
        }
        boolean z = false;
        for (Class<?> superclass = getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Class<?> clsA = e;
            if (clsA == null) {
                clsA = a("org.apache.commons.lang.enum.Enum");
                e = clsA;
            }
            if (superclass == clsA) {
                break;
            }
            Class<?> clsA2 = f;
            if (clsA2 == null) {
                clsA2 = a("org.apache.commons.lang.enum.ValuedEnum");
                f = clsA2;
            }
            if (superclass == clsA2) {
                break;
            }
            if (superclass == enumClass) {
                z = true;
                break;
            }
        }
        if (!z) {
            throw new IllegalArgumentException("getEnumClass() must return a superclass of this class");
        }
        Class clsA3 = e;
        if (clsA3 == null) {
            clsA3 = a("org.apache.commons.lang.enum.Enum");
            e = clsA3;
        }
        synchronized (clsA3) {
            aVarB = (a) d.get(enumClass);
            if (aVarB == null) {
                aVarB = b(enumClass);
                WeakHashMap weakHashMap = new WeakHashMap();
                weakHashMap.putAll(d);
                weakHashMap.put(enumClass, aVarB);
                d = weakHashMap;
            }
        }
        if (aVarB.a.containsKey(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("The Enum name must be unique, '");
            stringBuffer.append(str);
            stringBuffer.append("' has already been added");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        aVarB.a.put(str, this);
        aVarB.c.add(this);
    }

    public static Enum getEnum(Class cls, String str) {
        a aVarC = c(cls);
        if (aVarC == null) {
            return null;
        }
        return (Enum) aVarC.a.get(str);
    }

    public static List getEnumList(Class cls) {
        a aVarC = c(cls);
        return aVarC == null ? Collections.EMPTY_LIST : aVarC.d;
    }

    public static Map getEnumMap(Class cls) {
        a aVarC = c(cls);
        return aVarC == null ? c : aVarC.b;
    }

    public static Iterator iterator(Class cls) {
        return getEnumList(cls).iterator();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == this) {
            return 0;
        }
        if (obj.getClass() == getClass()) {
            return this.a.compareTo(((Enum) obj).a);
        }
        if (obj.getClass().getName().equals(getClass().getName())) {
            return this.a.compareTo(e(obj));
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Different enum class '");
        stringBuffer.append(ClassUtils.getShortClassName(obj.getClass()));
        stringBuffer.append("'");
        throw new ClassCastException(stringBuffer.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == getClass()) {
            return this.a.equals(((Enum) obj).a);
        }
        if (obj.getClass().getName().equals(getClass().getName())) {
            return this.a.equals(e(obj));
        }
        return false;
    }

    public Class getEnumClass() {
        return getClass();
    }

    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b;
    }

    public Object readResolve() {
        a aVar = (a) d.get(getEnumClass());
        if (aVar == null) {
            return null;
        }
        return aVar.a.get(getName());
    }

    public String toString() {
        if (this.iToString == null) {
            String shortClassName = ClassUtils.getShortClassName(getEnumClass());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(shortClassName);
            stringBuffer.append("[");
            stringBuffer.append(getName());
            stringBuffer.append("]");
            this.iToString = stringBuffer.toString();
        }
        return this.iToString;
    }
}

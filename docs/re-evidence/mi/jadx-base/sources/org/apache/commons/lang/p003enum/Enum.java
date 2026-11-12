package org.apache.commons.lang.p003enum;

import defpackage.k04;
import defpackage.llo;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Enum implements Comparable, Serializable {
    private static final Map EMPTY_MAP = Collections.unmodifiableMap(new HashMap(0));
    private static Map cEnumClasses = new WeakHashMap();
    static /* synthetic */ Class class$org$apache$commons$lang$enum$Enum = null;
    static /* synthetic */ Class class$org$apache$commons$lang$enum$ValuedEnum = null;
    private static final long serialVersionUID = -487045951170455942L;
    private final transient int iHashCode;
    private final String iName;
    protected transient String iToString = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f29437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f29438b;
        public final List c;
        public final List d;

        public a() {
            HashMap map = new HashMap();
            this.f29437a = map;
            this.f29438b = Collections.unmodifiableMap(map);
            ArrayList arrayList = new ArrayList(25);
            this.c = arrayList;
            this.d = Collections.unmodifiableList(arrayList);
        }
    }

    public Enum(String str) {
        init(str);
        this.iName = str;
        this.iHashCode = getEnumClass().hashCode() + 7 + (str.hashCode() * 3);
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static a createEntry(Class cls) {
        a aVar = new a();
        for (Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            Class clsClass$ = class$org$apache$commons$lang$enum$Enum;
            if (clsClass$ == null) {
                clsClass$ = class$("org.apache.commons.lang.enum.Enum");
                class$org$apache$commons$lang$enum$Enum = clsClass$;
            }
            if (superclass == clsClass$) {
                break;
            }
            Class clsClass$2 = class$org$apache$commons$lang$enum$ValuedEnum;
            if (clsClass$2 == null) {
                clsClass$2 = class$("org.apache.commons.lang.enum.ValuedEnum");
                class$org$apache$commons$lang$enum$ValuedEnum = clsClass$2;
            }
            if (superclass == clsClass$2) {
                break;
            }
            a aVar2 = (a) cEnumClasses.get(superclass);
            if (aVar2 != null) {
                aVar.c.addAll(aVar2.c);
                aVar.f29437a.putAll(aVar2.f29437a);
                break;
            }
        }
        return aVar;
    }

    private static a getEntry(Class cls) {
        if (cls == null) {
            throw new IllegalArgumentException("The Enum Class must not be null");
        }
        Class clsClass$ = class$org$apache$commons$lang$enum$Enum;
        if (clsClass$ == null) {
            clsClass$ = class$("org.apache.commons.lang.enum.Enum");
            class$org$apache$commons$lang$enum$Enum = clsClass$;
        }
        if (!clsClass$.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("The Class must be a subclass of Enum");
        }
        a aVar = (a) cEnumClasses.get(cls);
        if (aVar != null) {
            return aVar;
        }
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            return (a) cEnumClasses.get(cls);
        } catch (Exception unused) {
            return aVar;
        }
    }

    public static Enum getEnum(Class cls, String str) {
        a entry = getEntry(cls);
        if (entry == null) {
            return null;
        }
        return (Enum) entry.f29437a.get(str);
    }

    public static List getEnumList(Class cls) {
        a entry = getEntry(cls);
        return entry == null ? Collections.EMPTY_LIST : entry.d;
    }

    public static Map getEnumMap(Class cls) {
        a entry = getEntry(cls);
        return entry == null ? EMPTY_MAP : entry.f29438b;
    }

    private String getNameInOtherClassLoader(Object obj) {
        try {
            return (String) obj.getClass().getMethod("getName", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw new IllegalStateException("This should not happen");
        }
    }

    private void init(String str) {
        a aVarCreateEntry;
        if (llo.b(str)) {
            throw new IllegalArgumentException("The Enum name must not be empty or null");
        }
        Class<?> enumClass = getEnumClass();
        if (enumClass == null) {
            throw new IllegalArgumentException("getEnumClass() must not be null");
        }
        for (Class<?> superclass = getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Class<?> clsClass$ = class$org$apache$commons$lang$enum$Enum;
            if (clsClass$ == null) {
                clsClass$ = class$("org.apache.commons.lang.enum.Enum");
                class$org$apache$commons$lang$enum$Enum = clsClass$;
            }
            if (superclass == clsClass$) {
                break;
            }
            Class<?> clsClass$2 = class$org$apache$commons$lang$enum$ValuedEnum;
            if (clsClass$2 == null) {
                clsClass$2 = class$("org.apache.commons.lang.enum.ValuedEnum");
                class$org$apache$commons$lang$enum$ValuedEnum = clsClass$2;
            }
            if (superclass == clsClass$2) {
                break;
            }
            if (superclass == enumClass) {
                Class clsClass$3 = class$org$apache$commons$lang$enum$Enum;
                if (clsClass$3 == null) {
                    clsClass$3 = class$("org.apache.commons.lang.enum.Enum");
                    class$org$apache$commons$lang$enum$Enum = clsClass$3;
                }
                synchronized (clsClass$3) {
                    try {
                        aVarCreateEntry = (a) cEnumClasses.get(enumClass);
                        if (aVarCreateEntry == null) {
                            aVarCreateEntry = createEntry(enumClass);
                            WeakHashMap weakHashMap = new WeakHashMap();
                            weakHashMap.putAll(cEnumClasses);
                            weakHashMap.put(enumClass, aVarCreateEntry);
                            cEnumClasses = weakHashMap;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!aVarCreateEntry.f29437a.containsKey(str)) {
                    aVarCreateEntry.f29437a.put(str, this);
                    aVarCreateEntry.c.add(this);
                    return;
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("The Enum name must be unique, '");
                    stringBuffer.append(str);
                    stringBuffer.append("' has already been added");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
        }
        throw new IllegalArgumentException("getEnumClass() must return a superclass of this class");
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
            return this.iName.compareTo(((Enum) obj).iName);
        }
        if (obj.getClass().getName().equals(getClass().getName())) {
            return this.iName.compareTo(getNameInOtherClassLoader(obj));
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Different enum class '");
        stringBuffer.append(k04.c(obj.getClass()));
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
            return this.iName.equals(((Enum) obj).iName);
        }
        if (obj.getClass().getName().equals(getClass().getName())) {
            return this.iName.equals(getNameInOtherClassLoader(obj));
        }
        return false;
    }

    public Class getEnumClass() {
        return getClass();
    }

    public final String getName() {
        return this.iName;
    }

    public final int hashCode() {
        return this.iHashCode;
    }

    public Object readResolve() {
        a aVar = (a) cEnumClasses.get(getEnumClass());
        if (aVar == null) {
            return null;
        }
        return aVar.f29437a.get(getName());
    }

    public String toString() {
        if (this.iToString == null) {
            String strC = k04.c(getEnumClass());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strC);
            stringBuffer.append("[");
            stringBuffer.append(getName());
            stringBuffer.append("]");
            this.iToString = stringBuffer.toString();
        }
        return this.iToString;
    }
}

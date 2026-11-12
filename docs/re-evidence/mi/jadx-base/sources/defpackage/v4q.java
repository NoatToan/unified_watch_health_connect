package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public class v4q extends s4q {
    public final MapperConfig<?> c;
    public final Map<String, String> d;
    public final Map<String, JavaType> e;

    public v4q(MapperConfig<?> mapperConfig, JavaType javaType, Map<String, String> map, Map<String, JavaType> map2) {
        super(javaType, mapperConfig.getTypeFactory());
        this.c = mapperConfig;
        this.d = map;
        this.e = map2;
    }

    public static String g(Class<?> cls) {
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf < 0 ? name : name.substring(iLastIndexOf + 1);
    }

    public static v4q i(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        JavaType javaType2;
        if (z == z2) {
            throw new IllegalArgumentException();
        }
        HashMap map = null;
        Map map2 = z ? new HashMap() : null;
        if (z2) {
            map = new HashMap();
            map2 = new TreeMap();
        }
        if (collection != null) {
            for (NamedType namedType : collection) {
                Class<?> type = namedType.getType();
                String name = namedType.hasName() ? namedType.getName() : g(type);
                if (z) {
                    map2.put(type.getName(), name);
                }
                if (z2 && ((javaType2 = (JavaType) map.get(name)) == null || !type.isAssignableFrom(javaType2.getRawClass()))) {
                    map.put(name, mapperConfig.constructType(type));
                }
            }
        }
        return new v4q(mapperConfig, javaType, map2, map);
    }

    @Override // defpackage.r4q
    public String a(Object obj) {
        return j(obj.getClass());
    }

    @Override // defpackage.r4q
    public String b() {
        return new TreeSet(this.e.keySet()).toString();
    }

    @Override // defpackage.r4q
    public JavaType d(pp5 pp5Var, String str) {
        return h(str);
    }

    @Override // defpackage.r4q
    public String e(Object obj, Class<?> cls) {
        return obj == null ? j(cls) : a(obj);
    }

    public JavaType h(String str) {
        return this.e.get(str);
    }

    public String j(Class<?> cls) {
        String strG;
        if (cls == null) {
            return null;
        }
        Class<?> rawClass = this.f33295a.constructType(cls).getRawClass();
        String name = rawClass.getName();
        synchronized (this.d) {
            try {
                strG = this.d.get(name);
                if (strG == null) {
                    if (this.c.isAnnotationProcessingEnabled()) {
                        strG = this.c.getAnnotationIntrospector().findTypeName(this.c.introspectClassAnnotations(rawClass).u());
                    }
                    if (strG == null) {
                        strG = g(rawClass);
                    }
                    this.d.put(name, strG);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strG;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.e);
    }
}

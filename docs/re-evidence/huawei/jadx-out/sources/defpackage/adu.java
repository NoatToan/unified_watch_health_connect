package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class adu extends TypeIdResolverBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ConcurrentHashMap<String, String> f304a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final MapperConfig<?> f305c;
    protected final Map<String, JavaType> d;
    protected final boolean e;

    protected adu(MapperConfig<?> mapperConfig, JavaType javaType, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, JavaType> map) {
        super(javaType, mapperConfig.getTypeFactory());
        this.f305c = mapperConfig;
        this.f304a = concurrentHashMap;
        this.d = map;
        this.e = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    public static adu b(MapperConfig<?> mapperConfig, JavaType javaType, Collection<adg> collection, boolean z, boolean z2) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        if (z == z2) {
            throw new IllegalArgumentException();
        }
        if (z) {
            concurrentHashMap = new ConcurrentHashMap();
            map = null;
        } else {
            map = new HashMap();
            concurrentHashMap = new ConcurrentHashMap(4);
        }
        boolean zIsEnabled = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (collection != null) {
            for (adg adgVar : collection) {
                Class<?> clsA = adgVar.a();
                String strB = adgVar.c() ? adgVar.b() : c(clsA);
                if (z) {
                    concurrentHashMap.put(clsA.getName(), strB);
                }
                if (z2) {
                    if (zIsEnabled) {
                        strB = strB.toLowerCase();
                    }
                    JavaType javaType2 = (JavaType) map.get(strB);
                    if (javaType2 == null || !clsA.isAssignableFrom(javaType2.getRawClass())) {
                        map.put(strB, mapperConfig.constructType(clsA));
                    }
                }
            }
        }
        return new adu(mapperConfig, javaType, concurrentHashMap, map);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.NAME;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        return e(obj.getClass());
    }

    protected String e(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String strC = this.f304a.get(name);
        if (strC == null) {
            Class<?> rawClass = this._typeFactory.b(cls).getRawClass();
            if (this.f305c.isAnnotationProcessingEnabled()) {
                strC = this.f305c.getAnnotationIntrospector().findTypeName(this.f305c.introspectClassAnnotations(rawClass).getClassInfo());
            }
            if (strC == null) {
                strC = c(rawClass);
            }
            this.f304a.put(name, strC);
        }
        return strC;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValueAndType(Object obj, Class<?> cls) {
        if (obj == null) {
            return e(cls);
        }
        return idFromValue(obj);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JavaType typeFromId(DatabindContext databindContext, String str) {
        return a(str);
    }

    protected JavaType a(String str) {
        if (this.e) {
            str = str.toLowerCase();
        }
        return this.d.get(str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String getDescForKnownTypeIds() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry<String, JavaType> entry : this.d.entrySet()) {
            if (entry.getValue().isConcrete()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.d);
    }

    protected static String c(Class<?> cls) {
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf < 0 ? name : name.substring(iLastIndexOf + 1);
    }
}

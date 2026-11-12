package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f39361a = Arrays.asList(null, null).getClass();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f39362b;
    public static final Class<?> c;
    public static final Class<?> d;
    public static final Class<?> e;
    public static final Class<?> f;
    public static final Class<?> g;
    public static final Class<?> h;

    public static class b implements ak4<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JavaType f39363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39364b;

        @Override // defpackage.ak4
        public JavaType a(TypeFactory typeFactory) {
            return this.f39363a;
        }

        @Override // defpackage.ak4
        public JavaType b(TypeFactory typeFactory) {
            return this.f39363a;
        }

        public final void c(int i) {
            if (i == 1) {
                return;
            }
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + i + " entries");
        }

        @Override // defpackage.ak4
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f39364b) {
                case 1:
                    Set set = (Set) obj;
                    c(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    c(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    c(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        public b(int i, JavaType javaType) {
            this.f39363a = javaType;
            this.f39364b = i;
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set setSingleton = Collections.singleton(bool);
        f39362b = setSingleton.getClass();
        e = Collections.unmodifiableSet(setSingleton).getClass();
        List listSingletonList = Collections.singletonList(bool);
        c = listSingletonList.getClass();
        f = Collections.unmodifiableList(listSingletonList).getClass();
        g = Collections.unmodifiableList(new LinkedList()).getClass();
        Map mapSingletonMap = Collections.singletonMap(PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC);
        d = mapSingletonMap.getClass();
        h = Collections.unmodifiableMap(mapSingletonMap).getClass();
    }

    public static b a(int i, JavaType javaType, Class<?> cls) {
        return new b(i, javaType.findSuperType(cls));
    }

    public static esd<?> b(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        b bVarA;
        if (javaType.hasRawClass(f39361a)) {
            bVarA = a(7, javaType, List.class);
        } else if (javaType.hasRawClass(c)) {
            bVarA = a(2, javaType, List.class);
        } else if (javaType.hasRawClass(f39362b)) {
            bVarA = a(1, javaType, Set.class);
        } else if (javaType.hasRawClass(f) || javaType.hasRawClass(g)) {
            bVarA = a(5, javaType, List.class);
        } else {
            if (!javaType.hasRawClass(e)) {
                return null;
            }
            bVarA = a(4, javaType, Set.class);
        }
        return new StdDelegatingDeserializer(bVarA);
    }

    public static esd<?> c(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        b bVarA;
        if (javaType.hasRawClass(d)) {
            bVarA = a(3, javaType, Map.class);
        } else {
            if (!javaType.hasRawClass(h)) {
                return null;
            }
            bVarA = a(6, javaType, Map.class);
        }
        return new StdDelegatingDeserializer(bVarA);
    }
}

package defpackage;

import com.alipay.sdk.m.g.i;
import com.alipay.sdk.m.g.j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.alipay.b;

/* JADX INFO: loaded from: classes4.dex */
public class ls implements i, j {
    @Override // com.alipay.sdk.m.g.i, com.alipay.sdk.m.g.j
    public boolean a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }

    public Map<Object, Object> d(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type instanceof ParameterizedType) {
            return d(((ParameterizedType) type).getRawType());
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new IllegalArgumentException("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("unsupport type " + type, e);
        }
    }

    @Override // com.alipay.sdk.m.g.i
    public Object a(Object obj, Type type) {
        if (!obj.getClass().equals(b.class)) {
            return null;
        }
        b bVar = (b) obj;
        Map<Object, Object> mapD = d(type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Deserialize Map must be Generics!");
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        if (String.class != type2) {
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        Iterator itA = bVar.a();
        while (itA.hasNext()) {
            String str = (String) itA.next();
            mapD.put(str, mb.a((Class) type3) ? bVar.a(str) : lv.d(bVar.a(str), type3));
        }
        return mapD;
    }

    @Override // com.alipay.sdk.m.g.j
    public Object a(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new IllegalArgumentException("Map key must be String!");
            }
            treeMap.put((String) entry.getKey(), lw.d(entry.getValue()));
        }
        return treeMap;
    }
}

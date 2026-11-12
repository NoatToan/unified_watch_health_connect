package ng;

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

/* JADX INFO: loaded from: classes7.dex */
public final class h implements i, j {
    @Override // ng.j
    public final Object a(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                vb.h.s("Map key must be String!");
                return null;
            }
            treeMap.put((String) entry.getKey(), f.b(entry.getValue()));
        }
        return treeMap;
    }

    @Override // ng.i
    public final Object b(Object obj, Type type) {
        Map properties;
        String str;
        if (!obj.getClass().equals(org.json.alipay.b.class)) {
            return null;
        }
        org.json.alipay.b bVar = (org.json.alipay.b) obj;
        Type rawType = type;
        while (true) {
            if (rawType == Properties.class) {
                properties = new Properties();
                break;
            }
            if (rawType == Hashtable.class) {
                properties = new Hashtable();
                break;
            }
            if (rawType == IdentityHashMap.class) {
                properties = new IdentityHashMap();
                break;
            }
            if (rawType == SortedMap.class || rawType == TreeMap.class) {
                properties = new TreeMap();
                break;
            }
            if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                properties = new ConcurrentHashMap();
                break;
            }
            if (rawType == Map.class || rawType == HashMap.class) {
                properties = new HashMap();
                break;
            }
            if (rawType == LinkedHashMap.class) {
                properties = new LinkedHashMap();
                break;
            }
            if (!(rawType instanceof ParameterizedType)) {
                Class cls = (Class) rawType;
                if (cls.isInterface()) {
                    vb.h.s(n23.j.h("unsupport type ", rawType));
                    return null;
                }
                try {
                    properties = (Map) cls.newInstance();
                    break;
                } catch (Exception e4) {
                    n23.j.w(n23.j.h("unsupport type ", rawType), e4);
                    return null;
                }
            }
            rawType = ((ParameterizedType) rawType).getRawType();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (String.class == type2) {
                Iterator itA = bVar.a();
                while (itA.hasNext()) {
                    String str2 = (String) itA.next();
                    properties.put(str2, og.a.p((Class) type3) ? bVar.a(str2) : e.a(bVar.a(str2), type3));
                }
                return properties;
            }
            str = "Deserialize Map Key must be String.class";
        } else {
            str = "Deserialize Map must be Generics!";
        }
        vb.h.s(str);
        return null;
    }

    @Override // ng.i, ng.j
    public final boolean a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }
}

package defpackage;

import com.alipay.sdk.m.g.i;
import com.alipay.sdk.m.g.j;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;
import org.json.alipay.b;

/* JADX INFO: loaded from: classes4.dex */
public class lu implements i, j {
    @Override // com.alipay.sdk.m.g.i, com.alipay.sdk.m.g.j
    public boolean a(Class<?> cls) {
        return true;
    }

    @Override // com.alipay.sdk.m.g.i
    public Object a(Object obj, Type type) throws IllegalAccessException, InstantiationException {
        if (!obj.getClass().equals(b.class)) {
            return null;
        }
        b bVar = (b) obj;
        Class superclass = (Class) type;
        Object objNewInstance = superclass.newInstance();
        while (!superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (bVar.b(name)) {
                        field.setAccessible(true);
                        field.set(objNewInstance, lv.d(bVar.a(name), genericType));
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return objNewInstance;
    }

    @Override // com.alipay.sdk.m.g.j
    public Object a(Object obj) throws IllegalAccessException {
        TreeMap treeMap = new TreeMap();
        Class<?> superclass = obj.getClass();
        while (true) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (superclass.equals(Object.class)) {
                return treeMap;
            }
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object objB = b(field, obj);
                    if (objB != null) {
                        treeMap.put(field.getName(), objB);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    public static Object b(Field field, Object obj) throws IllegalAccessException {
        if (field == null || obj == null || "this$0".equals(field.getName())) {
            return null;
        }
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 == null) {
            return null;
        }
        field.setAccessible(zIsAccessible);
        return lw.d(obj2);
    }
}

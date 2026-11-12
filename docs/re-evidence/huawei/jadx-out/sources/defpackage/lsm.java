package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lsm {
    private static final Class[] d = {String.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Boolean.class, Character.class, Void.class, Class.class, Object.class};

    private static Object b(Object obj) {
        try {
            return obj.getClass().newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            LogUtil.e("HealthCloneUtil", "createNewObject Exception=", ExceptionUtils.c(e));
            return null;
        }
    }

    private static boolean b(Class cls) {
        if (cls.isPrimitive()) {
            return true;
        }
        for (Class cls2 : d) {
            if (cls.equals(cls2)) {
                return true;
            }
        }
        return false;
    }

    public static <T> T e(Object obj) {
        try {
            return (T) d(obj, -1);
        } catch (ClassCastException | IllegalAccessException | InstantiationException e) {
            LogUtil.e("HealthCloneUtil", "deep Exception=", ExceptionUtils.c(e));
            return null;
        }
    }

    private static Object d(Object obj, int i) throws IllegalAccessException, InstantiationException {
        if (obj == null) {
            return null;
        }
        if (i != 0) {
            Class<?> cls = obj.getClass();
            if (!b((Class) cls)) {
                int i2 = i - 1;
                if (obj instanceof Collection) {
                    Collection collection = (Collection) cls.newInstance();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        collection.add(d(it.next(), i2));
                    }
                    return collection;
                }
                if (obj instanceof Map) {
                    return a(obj, cls, i2);
                }
                if (cls.isArray()) {
                    return e(obj, i2);
                }
                return b(obj, cls, i2);
            }
        }
        return obj;
    }

    private static Map a(Object obj, Class cls, int i) throws IllegalAccessException, InstantiationException {
        Map map = (Map) cls.newInstance();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            map.put(entry.getKey(), d(entry.getValue(), i));
        }
        return map;
    }

    private static Object b(Object obj, Class cls, int i) throws IllegalAccessException, InstantiationException {
        Object objB = b(obj);
        if (objB == null) {
            return obj;
        }
        HashSet<Field> hashSet = new HashSet();
        while (cls != null && !cls.equals(Object.class)) {
            hashSet.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        for (final Field field : hashSet) {
            if (!Modifier.isFinal(field.getModifiers())) {
                AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: lsm.2
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        field.setAccessible(true);
                        return null;
                    }
                });
                field.set(objB, d(field.get(obj), i));
            }
        }
        return objB;
    }

    private static Object e(Object obj, int i) throws IllegalAccessException, InstantiationException {
        Object[] objArr = (Object[]) obj;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, objArr.getClass());
        for (int i2 = 0; i2 < objArr.length; i2++) {
            objArrCopyOf[i2] = d(objArr[i2], i);
        }
        return objArrCopyOf;
    }

    public static <T extends Parcelable> List<T> d(List<T> list, Parcelable.Creator<T> creator) {
        if (CollectionUtils.a(list)) {
            return new ArrayList();
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeTypedList(list);
            parcelObtain.setDataPosition(0);
            return parcelObtain.createTypedArrayList(creator);
        } catch (RuntimeException e) {
            LogUtil.j("HealthCloneUtil", "Deep copy failed for " + list.getClass().getSimpleName() + ", falling back to shallow copy. Error: " + e.getMessage());
            return list;
        } finally {
            parcelObtain.recycle();
        }
    }
}

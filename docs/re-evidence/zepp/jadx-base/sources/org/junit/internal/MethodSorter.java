package org.junit.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.FixMethodOrder;

/* JADX INFO: loaded from: classes23.dex */
public class MethodSorter {
    public static final Comparator<Method> DEFAULT = new a();
    public static final Comparator<Method> NAME_ASCENDING = new b();

    public static class a implements Comparator<Method> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            int iHashCode = method.getName().hashCode();
            int iHashCode2 = method2.getName().hashCode();
            if (iHashCode != iHashCode2) {
                return iHashCode < iHashCode2 ? -1 : 1;
            }
            return MethodSorter.NAME_ASCENDING.compare(method, method2);
        }
    }

    public static class b implements Comparator<Method> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            int iCompareTo = method.getName().compareTo(method2.getName());
            return iCompareTo != 0 ? iCompareTo : method.toString().compareTo(method2.toString());
        }
    }

    private MethodSorter() {
    }

    private static Comparator<Method> a(FixMethodOrder fixMethodOrder) {
        return fixMethodOrder == null ? DEFAULT : fixMethodOrder.value().getComparator();
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        Comparator<Method> comparatorA = a((FixMethodOrder) cls.getAnnotation(FixMethodOrder.class));
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (comparatorA != null) {
            Arrays.sort(declaredMethods, comparatorA);
        }
        return declaredMethods;
    }
}

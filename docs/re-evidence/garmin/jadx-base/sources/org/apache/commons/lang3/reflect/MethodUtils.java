package org.apache.commons.lang3.reflect;

import a73.n;
import a73.o;
import com.google.android.material.color.utilities.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import i3.e5;
import ig1.k0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import m9.a;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class MethodUtils {
    private static final Comparator<Method> METHOD_BY_SIGNATURE = Comparator.comparing(new f(10));

    private static int distance(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (!ClassUtils.isAssignable(clsArr, clsArr2, true)) {
            return -1;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < clsArr.length; i15++) {
            Class<?> cls = clsArr[i15];
            Class<?> cls2 = clsArr2[i15];
            if (cls != null && !cls.equals(cls2)) {
                i14 = (!ClassUtils.isAssignable(cls, cls2, true) || ClassUtils.isAssignable(cls, cls2, false)) ? i14 + 2 : i14 + 1;
            }
        }
        return i14;
    }

    public static Method getAccessibleMethod(Method method) {
        if (!MemberUtils.isAccessible(method)) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method accessibleMethodFromInterfaceNest = getAccessibleMethodFromInterfaceNest(declaringClass, name, parameterTypes);
        return accessibleMethodFromInterfaceNest == null ? getAccessibleMethodFromSuperclass(declaringClass, name, parameterTypes) : accessibleMethodFromInterfaceNest;
    }

    private static Method getAccessibleMethodFromInterfaceNest(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (Modifier.isPublic(cls2.getModifiers())) {
                    try {
                        return cls2.getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method accessibleMethodFromInterfaceNest = getAccessibleMethodFromInterfaceNest(cls2, str, clsArr);
                        if (accessibleMethodFromInterfaceNest != null) {
                            return accessibleMethodFromInterfaceNest;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    private static Method getAccessibleMethodFromSuperclass(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    private static List<Class<?>> getAllSuperclassesAndInterfaces(Class<?> cls) {
        Class<?> cls2;
        int i14;
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<Class<?>> allSuperclasses = ClassUtils.getAllSuperclasses(cls);
        List<Class<?>> allInterfaces = ClassUtils.getAllInterfaces(cls);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= allInterfaces.size() && i16 >= allSuperclasses.size()) {
                return arrayList;
            }
            if (i15 >= allInterfaces.size()) {
                i14 = i16 + 1;
                cls2 = allSuperclasses.get(i16);
            } else if (i16 >= allSuperclasses.size() || i15 < i16 || i16 >= i15) {
                int i17 = i16;
                cls2 = allInterfaces.get(i15);
                i15++;
                i14 = i17;
            } else {
                i14 = i16 + 1;
                cls2 = allSuperclasses.get(i16);
            }
            arrayList.add(cls2);
            i16 = i14;
        }
    }

    public static <A extends Annotation> A getAnnotation(Method method, Class<A> cls, boolean z14, boolean z15) {
        Validate.notNull(method, FirebaseAnalytics.Param.METHOD, new Object[0]);
        Validate.notNull(cls, "annotationCls", new Object[0]);
        if (!z15 && !MemberUtils.isAccessible(method)) {
            return null;
        }
        A a14 = (A) method.getAnnotation(cls);
        if (a14 == null && z14) {
            for (Class<?> cls2 : getAllSuperclassesAndInterfaces(method.getDeclaringClass())) {
                Method matchingMethod = z15 ? getMatchingMethod(cls2, method.getName(), method.getParameterTypes()) : getMatchingAccessibleMethod(cls2, method.getName(), method.getParameterTypes());
                if (matchingMethod != null && (a14 = (A) matchingMethod.getAnnotation(cls)) != null) {
                    break;
                }
            }
        }
        return a14;
    }

    public static Method getMatchingAccessibleMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            MemberUtils.setAccessibleWorkaround(method);
            return method;
        } catch (NoSuchMethodException unused) {
            Method[] methods = cls.getMethods();
            ArrayList arrayList = new ArrayList();
            for (Method method2 : methods) {
                if (method2.getName().equals(str) && MemberUtils.isMatchingMethod(method2, clsArr)) {
                    arrayList.add(method2);
                }
            }
            arrayList.sort(METHOD_BY_SIGNATURE);
            Iterator it = arrayList.iterator();
            Method method3 = null;
            while (it.hasNext()) {
                Method accessibleMethod = getAccessibleMethod((Method) it.next());
                if (accessibleMethod != null && (method3 == null || MemberUtils.compareMethodFit(accessibleMethod, method3, clsArr) < 0)) {
                    method3 = accessibleMethod;
                }
            }
            if (method3 != null) {
                MemberUtils.setAccessibleWorkaround(method3);
            }
            if (method3 != null && method3.isVarArgs() && method3.getParameterTypes().length > 0 && clsArr.length > 0) {
                Class<?>[] parameterTypes = method3.getParameterTypes();
                String name = ClassUtils.primitiveToWrapper(parameterTypes[parameterTypes.length - 1].getComponentType()).getName();
                Class<?> cls2 = clsArr[clsArr.length - 1];
                String name2 = cls2 == null ? null : cls2.getName();
                String name3 = cls2 == null ? null : cls2.getSuperclass().getName();
                if (name2 != null && name3 != null && !name.equals(name2) && !name.equals(name3)) {
                    return null;
                }
            }
            return method3;
        }
    }

    public static Method getMatchingMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Validate.notNull(cls, "cls", new Object[0]);
        Validate.notEmpty(str, "methodName", new Object[0]);
        List<Method> list = (List) Arrays.stream(cls.getDeclaredMethods()).filter(new a(str, 2)).collect(Collectors.toList());
        Stream streamFilter = ClassUtils.getAllSuperclasses(cls).stream().map(new f(7)).flatMap(new f(8)).filter(new a(str, 3));
        list.getClass();
        streamFilter.forEach(new o(list, 8));
        for (Method method : list) {
            if (Arrays.deepEquals(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        TreeMap treeMap = new TreeMap();
        list.stream().filter(new n(clsArr, 24)).forEach(new k0(1, clsArr, treeMap));
        if (treeMap.isEmpty()) {
            return null;
        }
        List list2 = (List) treeMap.values().iterator().next();
        if (list2.size() == 1) {
            return (Method) list2.get(0);
        }
        StringBuilder sbK = e5.k(str);
        sbK.append((String) Arrays.stream(clsArr).map(new f(9)).collect(Collectors.joining(",", "(", ")")));
        throw new IllegalStateException(String.format("Found multiple candidates for method %s on class %s : %s", sbK.toString(), cls.getName(), list2.stream().map(new f(10)).collect(Collectors.joining(",", "[", "]"))));
    }

    public static List<Method> getMethodsListWithAnnotation(Class<?> cls, Class<? extends Annotation> cls2, boolean z14, boolean z15) {
        Validate.notNull(cls, "cls", new Object[0]);
        Validate.notNull(cls2, "annotationCls", new Object[0]);
        List<Class> allSuperclassesAndInterfaces = z14 ? getAllSuperclassesAndInterfaces(cls) : new ArrayList();
        allSuperclassesAndInterfaces.add(0, cls);
        ArrayList arrayList = new ArrayList();
        for (Class cls3 : allSuperclassesAndInterfaces) {
            for (Method method : z15 ? cls3.getDeclaredMethods() : cls3.getMethods()) {
                if (method.getAnnotation(cls2) != null) {
                    arrayList.add(method);
                }
            }
        }
        return arrayList;
    }

    public static Method[] getMethodsWithAnnotation(Class<?> cls, Class<? extends Annotation> cls2, boolean z14, boolean z15) {
        return (Method[]) getMethodsListWithAnnotation(cls, cls2, z14, z15).toArray(ArrayUtils.EMPTY_METHOD_ARRAY);
    }

    public static Set<Method> getOverrideHierarchy(Method method, ClassUtils.Interfaces interfaces) {
        Validate.notNull(method);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> declaringClass = method.getDeclaringClass();
        Iterator<Class<?>> it = ClassUtils.hierarchy(declaringClass, interfaces).iterator();
        it.next();
        while (it.hasNext()) {
            Method matchingAccessibleMethod = getMatchingAccessibleMethod(it.next(), method.getName(), parameterTypes);
            if (matchingAccessibleMethod != null) {
                if (!Arrays.equals(matchingAccessibleMethod.getParameterTypes(), parameterTypes)) {
                    Map<TypeVariable<?>, Type> typeArguments = TypeUtils.getTypeArguments(declaringClass, matchingAccessibleMethod.getDeclaringClass());
                    int i14 = 0;
                    while (true) {
                        if (i14 >= parameterTypes.length) {
                            linkedHashSet.add(matchingAccessibleMethod);
                            break;
                        }
                        if (!TypeUtils.equals(TypeUtils.unrollVariables(typeArguments, method.getGenericParameterTypes()[i14]), TypeUtils.unrollVariables(typeArguments, matchingAccessibleMethod.getGenericParameterTypes()[i14]))) {
                            break;
                        }
                        i14++;
                    }
                } else {
                    linkedHashSet.add(matchingAccessibleMethod);
                }
            }
        }
        return linkedHashSet;
    }

    public static Object[] getVarArgs(Object[] objArr, Class<?>[] clsArr) {
        if (objArr.length == clsArr.length && (objArr[objArr.length - 1] == null || objArr[objArr.length - 1].getClass().equals(clsArr[clsArr.length - 1]))) {
            return objArr;
        }
        Object[] objArr2 = new Object[clsArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, clsArr.length - 1);
        Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
        int length = (objArr.length - clsArr.length) + 1;
        Object objNewInstance = Array.newInstance(ClassUtils.primitiveToWrapper(componentType), length);
        System.arraycopy(objArr, clsArr.length - 1, objNewInstance, 0, length);
        if (componentType.isPrimitive()) {
            objNewInstance = ArrayUtils.toPrimitive(objNewInstance);
        }
        objArr2[clsArr.length - 1] = objNewInstance;
        return objArr2;
    }

    public static Object invokeExactMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        Method accessibleMethod = getAccessibleMethod(obj.getClass(), str, ArrayUtils.nullToEmpty(clsArr));
        if (accessibleMethod != null) {
            return accessibleMethod.invoke(obj, objArrNullToEmpty);
        }
        StringBuilder sbL = hb.a.l("No such accessible method: ", str, "() on object: ");
        sbL.append(obj.getClass().getName());
        throw new NoSuchMethodException(sbL.toString());
    }

    public static Object invokeExactStaticMethod(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        Method accessibleMethod = getAccessibleMethod(cls, str, ArrayUtils.nullToEmpty(clsArr));
        if (accessibleMethod != null) {
            return accessibleMethod.invoke(null, objArrNullToEmpty);
        }
        StringBuilder sbL = hb.a.l("No such accessible method: ", str, "() on class: ");
        sbL.append(cls.getName());
        throw new NoSuchMethodException(sbL.toString());
    }

    public static Object invokeMethod(Object obj, boolean z14, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException {
        Method matchingAccessibleMethod;
        String str2;
        Class<?>[] clsArrNullToEmpty = ArrayUtils.nullToEmpty(clsArr);
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        if (z14) {
            matchingAccessibleMethod = getMatchingMethod(obj.getClass(), str, clsArrNullToEmpty);
            if (matchingAccessibleMethod != null && !matchingAccessibleMethod.isAccessible()) {
                matchingAccessibleMethod.setAccessible(true);
            }
            str2 = "No such method: ";
        } else {
            matchingAccessibleMethod = getMatchingAccessibleMethod(obj.getClass(), str, clsArrNullToEmpty);
            str2 = "No such accessible method: ";
        }
        if (matchingAccessibleMethod != null) {
            return matchingAccessibleMethod.invoke(obj, toVarArgs(matchingAccessibleMethod, objArrNullToEmpty));
        }
        throw new NoSuchMethodException(str2 + str + "() on object: " + obj.getClass().getName());
    }

    public static Object invokeStaticMethod(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        Method matchingAccessibleMethod = getMatchingAccessibleMethod(cls, str, ArrayUtils.nullToEmpty(clsArr));
        if (matchingAccessibleMethod != null) {
            return matchingAccessibleMethod.invoke(null, toVarArgs(matchingAccessibleMethod, objArrNullToEmpty));
        }
        StringBuilder sbL = hb.a.l("No such accessible method: ", str, "() on class: ");
        sbL.append(cls.getName());
        throw new NoSuchMethodException(sbL.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMatchingMethod$0(String str, Method method) {
        return method.getName().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMatchingMethod$1(String str, Method method) {
        return method.getName().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMatchingMethod$2(Class[] clsArr, Method method) {
        return ClassUtils.isAssignable((Class<?>[]) clsArr, method.getParameterTypes(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMatchingMethod$4(Class[] clsArr, TreeMap treeMap, Method method) {
        ((List) treeMap.computeIfAbsent(Integer.valueOf(distance(clsArr, method.getParameterTypes())), new f(11))).add(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$null$3(Integer num) {
        return new ArrayList();
    }

    private static Object[] toVarArgs(Method method, Object[] objArr) {
        return method.isVarArgs() ? getVarArgs(objArr, method.getParameterTypes()) : objArr;
    }

    public static Method[] getMethodsWithAnnotation(Class<?> cls, Class<? extends Annotation> cls2) {
        return getMethodsWithAnnotation(cls, cls2, false, false);
    }

    public static Method getAccessibleMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return getAccessibleMethod(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Object invokeExactStaticMethod(Class<?> cls, String str, Object... objArr) {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        return invokeExactStaticMethod(cls, str, objArrNullToEmpty, ClassUtils.toClass(objArrNullToEmpty));
    }

    public static Object invokeStaticMethod(Class<?> cls, String str, Object... objArr) {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        return invokeStaticMethod(cls, str, objArrNullToEmpty, ClassUtils.toClass(objArrNullToEmpty));
    }

    public static Object invokeExactMethod(Object obj, String str, Object... objArr) {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        return invokeExactMethod(obj, str, objArrNullToEmpty, ClassUtils.toClass(objArrNullToEmpty));
    }

    public static Object invokeExactMethod(Object obj, String str) {
        return invokeExactMethod(obj, str, ArrayUtils.EMPTY_OBJECT_ARRAY, null);
    }

    public static List<Method> getMethodsListWithAnnotation(Class<?> cls, Class<? extends Annotation> cls2) {
        return getMethodsListWithAnnotation(cls, cls2, false, false);
    }

    public static Object invokeMethod(Object obj, boolean z14, String str) {
        return invokeMethod(obj, z14, str, ArrayUtils.EMPTY_OBJECT_ARRAY, null);
    }

    public static Object invokeMethod(Object obj, String str, Object... objArr) {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        return invokeMethod(obj, str, objArrNullToEmpty, ClassUtils.toClass(objArrNullToEmpty));
    }

    public static Object invokeMethod(Object obj, boolean z14, String str, Object... objArr) {
        Object[] objArrNullToEmpty = ArrayUtils.nullToEmpty(objArr);
        return invokeMethod(obj, z14, str, objArrNullToEmpty, ClassUtils.toClass(objArrNullToEmpty));
    }

    public static Object invokeMethod(Object obj, String str) {
        return invokeMethod(obj, str, ArrayUtils.EMPTY_OBJECT_ARRAY, (Class<?>[]) null);
    }

    public static Object invokeMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
        return invokeMethod(obj, false, str, objArr, clsArr);
    }
}

package androidx.lifecycle;

import defpackage.yzp;
import defpackage.zcp;
import defpackage.zes;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u001e\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0001H\u0007J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    @JvmStatic
    public static final LifecycleEventObserver lifecycleEventObserver(Object object) {
        zcp.c(object, "");
        boolean z = object instanceof LifecycleEventObserver;
        boolean z2 = object instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
            zcp.e(list);
            List<Constructor<? extends GeneratedAdapter>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), object));
            }
            int size = list2.size();
            GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
            for (int i = 0; i < size; i++) {
                generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter(list2.get(i), object);
            }
            return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object object) {
        try {
            GeneratedAdapter generatedAdapterNewInstance = constructor.newInstance(object);
            zcp.b((Object) generatedAdapterNewInstance, "");
            return generatedAdapterNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> klass) {
        try {
            Package r0 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            zcp.b((Object) name, "");
            if (name.length() != 0) {
                zcp.b((Object) canonicalName, "");
                canonicalName = canonicalName.substring(name.length() + 1);
                zcp.b((Object) canonicalName, "");
            }
            zcp.b((Object) canonicalName, "");
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                adapterName = name + FilenameUtils.EXTENSION_SEPARATOR + adapterName;
            }
            Class<?> cls = Class.forName(adapterName);
            zcp.e(cls, "");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private final int getObserverConstructorType(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(klass);
        map.put(klass, Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final int resolveObserverCallbackType(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(klass);
        if (constructorGeneratedConstructor != null) {
            classToAdapters.put(klass, yzp.e(constructorGeneratedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (isLifecycleParent(superclass)) {
            zcp.b((Object) superclass, "");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
            zcp.e(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        zcp.b((Object) interfaces, "");
        for (Class<?> cls : interfaces) {
            if (isLifecycleParent(cls)) {
                zcp.b((Object) cls, "");
                if (getObserverConstructorType(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls);
                zcp.e(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }

    private final boolean isLifecycleParent(Class<?> klass) {
        return klass != null && LifecycleObserver.class.isAssignableFrom(klass);
    }

    @JvmStatic
    public static final String getAdapterName(String className) {
        zcp.c(className, "");
        return zes.a(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }
}

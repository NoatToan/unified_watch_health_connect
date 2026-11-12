package com.huawei.remoteLoader.client;

import android.os.IBinder;
import com.huawei.arengine.remoteLoader.IObjectWrapper;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes42.dex */
public final class ARObjectWrapper<T> extends IObjectWrapper.a {
    private final T wrappedObject;

    public static <T> IObjectWrapper wrap(T t) {
        return new ARObjectWrapper(t);
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper, Class<T> cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ARObjectWrapper) {
            return ((ARObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        if (iBinderAsBinder == null) {
            throw new IllegalArgumentException("Binder object is null.");
        }
        AccessibleObject accessibleObject = getAccessibleObject(iBinderAsBinder.getClass());
        if (accessibleObject == null || accessibleObject.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared private field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        accessibleObject.setAccessible(true);
        try {
            Object obj = accessibleObject instanceof Field ? ((Field) accessibleObject).get(iBinderAsBinder) : null;
            if (obj == null) {
                return null;
            }
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
            throw new IllegalArgumentException("remoteBinder is the wrong class.");
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
        }
    }

    private static AccessibleObject getAccessibleObject(Class<?> cls) {
        Field field = null;
        for (Field field2 : cls.getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                if (field != null) {
                    return null;
                }
                field = field2;
            }
        }
        return field;
    }

    private ARObjectWrapper(T t) {
        this.wrappedObject = t;
    }
}

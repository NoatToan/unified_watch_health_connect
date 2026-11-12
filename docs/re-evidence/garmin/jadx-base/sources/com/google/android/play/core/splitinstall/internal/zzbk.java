package com.google.android.play.core.splitinstall.internal;

import androidx.core.view.j;
import androidx.room.a0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbk {
    public static zzbi zza(Object obj, String str, Class cls) {
        return new zzbi(obj, zzh(obj, str), cls);
    }

    public static zzbj zzb(Object obj, String str, Class cls) {
        return new zzbj(obj, zzh(obj, str), cls);
    }

    public static Object zzc(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e4) {
            throw new zzbl("Failed to invoke default constructor on class ".concat(cls.getName()), e4);
        }
    }

    public static Object zzd(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(zzi(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e4) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e4);
        }
    }

    public static Object zze(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(zzi(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e4) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e4);
        }
    }

    public static Object zzf(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(zzi(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e4) {
            throw new zzbl(j.h(cls, "Failed to invoke static method isDexOptNeeded on type "), e4);
        }
    }

    public static Object zzg(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) {
        try {
            return cls2.cast(zzi(cls, "optimizedPathFor", cls3, cls4).invoke(null, obj, obj2));
        } catch (Exception e4) {
            throw new zzbl(j.h(cls, "Failed to invoke static method optimizedPathFor on type "), e4);
        }
    }

    private static Field zzh(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(a0.j("Failed to find a field named ", str, " on an object of instance ", obj.getClass().getName()));
    }

    private static Method zzi(Class cls, String str, Class... clsArr) {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}

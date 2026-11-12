package com.activeandroid.util;

import android.content.Context;
import android.os.Bundle;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.serializer.TypeSerializer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionUtils {
    public static Set<Field> getDeclaredColumnFields(Class<?> cls) {
        Set<Field> setEmptySet = Collections.emptySet();
        if (isSubclassOf(cls, Model.class) || Model.class.equals(cls)) {
            setEmptySet = new LinkedHashSet<>();
            Field[] declaredFields = cls.getDeclaredFields();
            Arrays.sort(declaredFields, new Comparator<Field>() { // from class: com.activeandroid.util.ReflectionUtils.1
                @Override // java.util.Comparator
                public int compare(Field field, Field field2) {
                    return field2.getName().compareTo(field.getName());
                }
            });
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Column.class)) {
                    setEmptySet.add(field);
                }
            }
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass != null) {
                setEmptySet.addAll(getDeclaredColumnFields(superclass));
            }
        }
        return setEmptySet;
    }

    public static <T> T getMetaData(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return (T) bundle.get(str);
            }
            return null;
        } catch (Exception unused) {
            Log.w("Couldn't find meta-data: " + str);
            return null;
        }
    }

    public static boolean isModel(Class<?> cls) {
        return isSubclassOf(cls, Model.class) && !Modifier.isAbstract(cls.getModifiers());
    }

    public static boolean isSubclassOf(Class<?> cls, Class<?> cls2) {
        if (cls.getSuperclass() == null) {
            return false;
        }
        if (cls.getSuperclass().equals(cls2)) {
            return true;
        }
        return isSubclassOf(cls.getSuperclass(), cls2);
    }

    public static boolean isTypeSerializer(Class<?> cls) {
        return isSubclassOf(cls, TypeSerializer.class);
    }
}

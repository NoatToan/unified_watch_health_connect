package com.huawei.hms.health;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
enum aabu {
    PARCELABLE,
    BINDER,
    STRING_LIST,
    LIST,
    BUNDLE,
    PARCELABLE_ARRAY,
    STRING_ARRAY,
    BYTE_ARRAY,
    INTERFACE,
    INT_ARRAY,
    LONG_ARRAY,
    FLOAT_ARRAY,
    DOUBLE_ARRAY,
    CHAR_ARRAY,
    BOOLEAN_ARRAY,
    INTEGER_TYPE,
    LONG_TYPE,
    CHARACTER_TYPE,
    BOOLEAN_TYPE,
    FLOAT_TYPE,
    DOUBLE_TYPE,
    STRING_TYPE,
    MAP_TYPE,
    BYTE_TYPE,
    SHORT_TYPE,
    INTEGER_OBJECT,
    LONG_OBJECT,
    FLOAT_OBJECT,
    DOUBLE_OBJECT,
    BOOLEAN_OBJECT;

    public static aabu aab(Field field) {
        aabu aabuVar;
        aabu aabuVar2;
        aabu aabuVar3;
        Class<?> type = field.getType();
        Class<?> componentType = type.getComponentType();
        aabu aabuVar4 = null;
        if (type.isArray() && componentType != null) {
            if (Parcelable.class.isAssignableFrom(componentType)) {
                aabuVar3 = PARCELABLE_ARRAY;
            } else if (String.class.isAssignableFrom(componentType)) {
                aabuVar3 = STRING_ARRAY;
            } else if (Byte.TYPE.isAssignableFrom(componentType)) {
                aabuVar3 = BYTE_ARRAY;
            } else if (Integer.TYPE.isAssignableFrom(componentType)) {
                aabuVar3 = INT_ARRAY;
            } else if (Long.TYPE.isAssignableFrom(componentType)) {
                aabuVar3 = LONG_ARRAY;
            } else if (Float.TYPE.isAssignableFrom(componentType)) {
                aabuVar3 = FLOAT_ARRAY;
            } else if (Double.TYPE.isAssignableFrom(componentType)) {
                aabuVar3 = DOUBLE_ARRAY;
            } else if (Character.TYPE.isAssignableFrom(componentType)) {
                aabuVar3 = CHAR_ARRAY;
            } else {
                aabuVar3 = Boolean.TYPE.isAssignableFrom(componentType) ? BOOLEAN_ARRAY : null;
            }
            if (aabuVar3 != null) {
                return aabuVar3;
            }
        }
        if (Bundle.class.isAssignableFrom(type)) {
            aabuVar = BUNDLE;
        } else if (Parcelable.class.isAssignableFrom(type)) {
            aabuVar = PARCELABLE;
        } else if (IBinder.class.isAssignableFrom(type)) {
            aabuVar = BINDER;
        } else if (IInterface.class.isAssignableFrom(type)) {
            aabuVar = INTERFACE;
        } else if (type == List.class || type == ArrayList.class) {
            aabuVar = aabs.aab(field, 0) == String.class ? STRING_LIST : LIST;
        } else {
            aabuVar = (type == Map.class || type == HashMap.class) ? MAP_TYPE : null;
        }
        if (aabuVar != null) {
            return aabuVar;
        }
        if (type == Integer.class) {
            aabuVar2 = INTEGER_OBJECT;
        } else if (type == Long.class) {
            aabuVar2 = LONG_OBJECT;
        } else if (type == Float.class) {
            aabuVar2 = FLOAT_OBJECT;
        } else if (type == Double.class) {
            aabuVar2 = DOUBLE_OBJECT;
        } else {
            aabuVar2 = type == Boolean.class ? BOOLEAN_OBJECT : null;
        }
        if (aabuVar2 != null) {
            return aabuVar2;
        }
        if (type == Byte.TYPE || type == Byte.class) {
            aabuVar4 = BYTE_TYPE;
        } else if (type == Short.TYPE || type == Short.class) {
            aabuVar4 = SHORT_TYPE;
        } else if (type == Integer.TYPE) {
            aabuVar4 = INTEGER_TYPE;
        } else if (type == Long.TYPE) {
            aabuVar4 = LONG_TYPE;
        } else if (type == Float.TYPE) {
            aabuVar4 = FLOAT_TYPE;
        } else if (type == Double.TYPE) {
            aabuVar4 = DOUBLE_TYPE;
        } else if (type == Character.TYPE || type == Character.class) {
            aabuVar4 = CHARACTER_TYPE;
        } else if (type == Boolean.TYPE) {
            aabuVar4 = BOOLEAN_TYPE;
        } else if (type == String.class) {
            aabuVar4 = STRING_TYPE;
        }
        if (aabuVar4 != null) {
            return aabuVar4;
        }
        StringBuilder sbAab = aab.aab("Type of ");
        sbAab.append(field.getName());
        sbAab.append(" not find match enum value : ");
        sbAab.append(type);
        aabz.aab("SafeParcelUtil", sbAab.toString());
        StringBuilder sbAab2 = aab.aab("Type of ");
        sbAab2.append(field.getName());
        sbAab2.append(" not find match enum value : ");
        sbAab2.append(type);
        throw new IllegalStateException(sbAab2.toString());
    }
}

package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hihealth.HiDataFilter;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public abstract class v {
    public static Field[] a(Class cls) {
        Field[] fieldArrA = cls.getSuperclass() != null ? a(cls.getSuperclass()) : null;
        Field[] declaredFields = cls.getDeclaredFields();
        if (fieldArrA == null || fieldArrA.length <= 0) {
            return declaredFields;
        }
        Field[] fieldArr = new Field[declaredFields.length + fieldArrA.length];
        System.arraycopy(fieldArrA, 0, fieldArr, 0, fieldArrA.length);
        System.arraycopy(declaredFields, 0, fieldArr, fieldArrA.length, declaredFields.length);
        return fieldArr;
    }

    public static Class a(Field field) {
        if (Map.class.isAssignableFrom(field.getType())) {
            return a(field, 1);
        }
        if (List.class.isAssignableFrom(field.getType())) {
            return a(field, 0);
        }
        return null;
    }

    public static Class a(Field field, int i) {
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
        if (actualTypeArguments.length <= i) {
            return null;
        }
        try {
            Type type = actualTypeArguments[i];
            if (type instanceof Class) {
                return (Class) type;
            }
            String string = type.toString();
            int iIndexOf = string.indexOf("class ");
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            int iIndexOf2 = string.indexOf(HiDataFilter.DataFilterExpression.LESS_THAN);
            if (iIndexOf2 < 0) {
                iIndexOf2 = string.length();
            }
            return Class.forName(string.substring(iIndexOf, iIndexOf2));
        } catch (Exception unused) {
            HiLog.w("ReflectAPI", "getType Exception");
            return null;
        }
    }
}

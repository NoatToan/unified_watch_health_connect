package com.xiaomi.smarthome.framework.plugin;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Map2ObjectUtils {
    public static Object mapToObject(Map<String, Object> map, Class<?> cls) throws Exception {
        if (map == null) {
            return null;
        }
        Object objNewInstance = cls.newInstance();
        for (Field field : objNewInstance.getClass().getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers)) {
                field.setAccessible(true);
                field.set(objNewInstance, map.get(field.getName()));
            }
        }
        return objNewInstance;
    }

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }
        return map;
    }
}

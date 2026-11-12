package com.xiaomi.ai.api.common;

import com.xiaomi.common.Optional;
import defpackage.zsd;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class Utils {
    private static Set<Class<?>> wrapperTypes = getWrapperTypes();

    public static void dumpValue(Object obj, StringBuilder sb) {
        if (obj != null) {
            try {
                sb.append("\n");
                sb.append(obj.getClass().getName());
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        }
        dumpValue(obj, "", sb, -1);
    }

    private static List<Field> getAllFields(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.getName().startsWith("java")) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private static Set<Class<?>> getWrapperTypes() {
        HashSet hashSet = new HashSet();
        hashSet.add(Boolean.class);
        hashSet.add(Character.class);
        hashSet.add(Byte.class);
        hashSet.add(Short.class);
        hashSet.add(Integer.class);
        hashSet.add(Long.class);
        hashSet.add(Float.class);
        hashSet.add(Double.class);
        hashSet.add(Void.class);
        return hashSet;
    }

    private static void dumpValue(Object obj, String str, StringBuilder sb, int i) throws IllegalAccessException {
        if (obj == null) {
            sb.append(AbstractJsonLexerKt.NULL);
            return;
        }
        if (obj instanceof zsd) {
            sb.append(obj);
            return;
        }
        String str2 = str + "  ";
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive() && !wrapperTypes.contains(cls) && !cls.isEnum()) {
            if (cls == String.class) {
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                return;
            }
            if (cls.equals(Optional.class)) {
                Optional optional = (Optional) obj;
                if (optional.c()) {
                    dumpValue(optional.b(), str, sb, -1);
                    return;
                } else {
                    sb.append(" // [Optional, Not Present] ");
                    return;
                }
            }
            int i2 = 0;
            if (cls.isArray()) {
                sb.append("[");
                int length = Array.getLength(obj);
                while (i2 < length) {
                    dumpValue(Array.get(obj, i2), str2, sb, i2);
                    i2++;
                }
                sb.append("\n");
                sb.append(str);
                sb.append("]");
                return;
            }
            if (Map.class.isAssignableFrom(cls)) {
                sb.append("{");
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    sb.append(str2);
                    sb.append(entry.getKey());
                    sb.append(": ");
                    dumpValue(entry.getValue(), str2, sb, i2);
                    i2++;
                }
                sb.append("\n");
                sb.append(str);
                sb.append("}");
                return;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                sb.append("[");
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    dumpValue(it.next(), str2, sb, i2);
                    i2++;
                }
                sb.append("\n");
                sb.append(str);
                sb.append("]");
                return;
            }
            if (i >= 0) {
                sb.append("\n");
                sb.append(str);
                sb.append("{ // ");
                sb.append(i);
            }
            for (Field field : getAllFields(cls)) {
                sb.append("\n");
                field.setAccessible(true);
                sb.append(str2);
                sb.append(field.getName());
                sb.append(": ");
                dumpValue(field.get(obj), str2, sb, -1);
                field.setAccessible(false);
            }
            if (i >= 0) {
                sb.append("\n");
                sb.append(str);
                sb.append("}");
                return;
            }
            return;
        }
        sb.append(obj);
    }
}

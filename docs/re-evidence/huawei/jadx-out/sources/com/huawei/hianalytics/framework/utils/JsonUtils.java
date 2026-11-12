package com.huawei.hianalytics.framework.utils;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.a0;
import com.huawei.hianalytics.framework.k;
import com.huawei.hianalytics.framework.l;
import com.huawei.hianalytics.framework.m;
import com.huawei.hianalytics.framework.n;
import com.huawei.hianalytics.framework.o;
import com.huawei.hianalytics.framework.p;
import com.huawei.hianalytics.framework.q;
import com.huawei.hianalytics.framework.s;
import com.huawei.hianalytics.framework.v;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JsonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f11529a = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Character.class, Boolean.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f11530b = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Boolean.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f11531c;

    static {
        HashMap map = new HashMap();
        f11531c = map;
        o oVar = new o();
        map.put(Integer.TYPE, oVar);
        map.put(Integer.class, oVar);
        p pVar = new p();
        map.put(Long.TYPE, pVar);
        map.put(Long.class, pVar);
        n nVar = new n();
        map.put(Float.TYPE, nVar);
        map.put(Float.class, nVar);
        m mVar = new m();
        map.put(Double.TYPE, mVar);
        map.put(Double.class, mVar);
        q qVar = new q();
        map.put(Short.TYPE, qVar);
        map.put(Short.class, qVar);
        l lVar = new l();
        map.put(Byte.TYPE, lVar);
        map.put(Byte.class, lVar);
        k kVar = new k();
        map.put(Boolean.TYPE, kVar);
        map.put(Boolean.class, kVar);
    }

    public static Object a(String str, Class cls, Class... clsArr) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            throw a(false, "string cannot be empty", new Object[0]);
        }
        if (cls.isPrimitive()) {
            throw a(true, "obj class (%s) cannot be primitive type", cls);
        }
        Class[] clsArr2 = f11529a;
        for (int i = 0; i < 10; i++) {
            if (cls == clsArr2[i]) {
                throw a(true, "obj class (%s) is invalid in conversion", cls);
            }
        }
        try {
            try {
                return a(new JSONObject(str), cls, clsArr);
            } catch (JSONException unused) {
                return a(new JSONArray(str), cls, clsArr);
            }
        } catch (JSONException unused2) {
            throw a(true, "string cannot be empty", new Object[0]);
        }
    }

    public static Object b(Class cls, Class cls2, Object obj) throws JSONException {
        if (!cls.isPrimitive()) {
            Class[] clsArr = f11530b;
            int i = 0;
            while (true) {
                if (i >= 9) {
                    if (List.class.isAssignableFrom(cls)) {
                        return a(cls, cls2, obj);
                    }
                    if (Map.class.isAssignableFrom(cls)) {
                        return a(cls, new Class[]{cls2}, obj);
                    }
                    if (obj instanceof JSONObject) {
                        return a((JSONObject) obj, cls, new Class[]{cls2});
                    }
                    if (obj instanceof JSONArray) {
                        return a((JSONArray) obj, cls, new Class[]{cls2});
                    }
                    throw a(true, "value from json error, field class: %s", cls);
                }
                if (cls == clsArr[i]) {
                    break;
                }
                i++;
            }
        }
        if (cls == String.class) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj != null) {
                return String.valueOf(obj);
            }
            return null;
        }
        if ((cls.isPrimitive() || Number.class.isAssignableFrom(cls)) && (obj instanceof Number)) {
            Number number = (Number) obj;
            s sVar = (s) f11531c.get(cls);
            if (sVar != null) {
                return sVar.a(number);
            }
            HiLog.w("JsonUtils", "cannot find value reader for: %s" + cls);
            return null;
        }
        if (cls != Boolean.class) {
            return obj;
        }
        s sVar2 = (s) f11531c.get(cls);
        if (sVar2 != null) {
            return sVar2.a(obj);
        }
        HiLog.w("JsonUtils", "cannot find value reader for: %s" + cls);
        return null;
    }

    public static String createABReqDefaultJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JsbMapKeyNames.H5_USER_ID, "");
            jSONObject.put("userAttribute", new JSONObject());
        } catch (Exception unused) {
            HiLog.e("JsonUtils", "json exception");
        }
        return jSONObject.toString();
    }

    public static JSONObject put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (JSONException unused) {
            HiLog.e("JsonUtils", "putJson exception");
            return jSONObject;
        }
    }

    public static String toJsonNoException(Object obj) {
        try {
            try {
                return a(obj);
            } catch (JSONException unused) {
                HiLog.w("JsonUtils", "toJson error");
                return "";
            }
        } catch (IllegalAccessException unused2) {
            throw a(true, "toJson error", new Object[0]);
        } catch (JSONException e) {
            throw e;
        }
    }

    public static <T> T toObjectNoException(String str, Class<T> cls, Class... clsArr) {
        try {
            return (T) a(str, cls, clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object a(JSONObject jSONObject, Class cls, Class[] clsArr) throws JSONException {
        if (!Collection.class.isAssignableFrom(cls)) {
            if (!cls.isArray()) {
                if (Map.class.isAssignableFrom(cls)) {
                    return a(cls, clsArr, jSONObject);
                }
                try {
                    return a(jSONObject, cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    throw a(true, "new instance failed for %s", cls);
                } catch (NoSuchMethodException unused2) {
                    throw a(true, "no default constructor for class %s", cls);
                }
            }
            throw a(true, "obj class %s is array type which mismatches with JsonObject", cls);
        }
        throw a(true, "class %s is Collection type which mismatches with JsonObject", cls);
    }

    public static String b(Object obj) {
        if (obj != null) {
            if (!(obj instanceof String) && !(obj instanceof Character)) {
                if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Double) || (obj instanceof Short)) {
                    return obj.toString();
                }
                if (obj instanceof List) {
                    return a((List) obj);
                }
                if (obj instanceof Map) {
                    return a((Map) obj);
                }
                if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (length <= 0) {
                        return "[]";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append('[');
                    for (int i = 0; i < length; i++) {
                        String strB = b(Array.get(obj, i));
                        if (strB != null) {
                            sb.append(strB);
                            sb.append(',');
                        }
                    }
                    int length2 = sb.length();
                    if (length2 > 0) {
                        int i2 = length2 - 1;
                        if (sb.charAt(i2) == ',') {
                            sb.delete(i2, length2);
                        }
                    }
                    sb.append(']');
                    return sb.toString();
                }
                return a(obj);
            }
            if (!a0.a(obj.toString())) {
                StringBuilder sb2 = new StringBuilder("\"");
                String string = obj.toString();
                sb2.append(string != null ? string.replace("\"", "\\\"") : null);
                sb2.append("\"");
                return sb2.toString();
            }
        }
        return null;
    }

    public static Object a(JSONObject jSONObject, Object obj) {
        Object objOpt;
        Object objB;
        for (Field field : v.a(obj.getClass())) {
            field.setAccessible(true);
            String name = field.getName();
            if (!Modifier.isStatic(field.getModifiers()) && !name.contains(SampleEvent.SEPARATOR) && (objOpt = jSONObject.opt(field.getName())) != null && objOpt != JSONObject.NULL) {
                try {
                    try {
                        objB = b(field.getType(), v.a(field), objOpt);
                        try {
                            field.set(obj, objB);
                        } catch (Exception unused) {
                            HiLog.w("JsonUtils", obj.getClass().getName() + ".fromJson error, fieldName: " + field.getName() + ", field:" + field);
                            if (objB != null && (objB instanceof String)) {
                                try {
                                    Class<?> type = field.getType();
                                    if (type.isPrimitive()) {
                                        if (type == Integer.TYPE) {
                                            field.set(obj, Integer.valueOf(Integer.parseInt((String) objB)));
                                        } else if (type == Float.TYPE) {
                                            field.set(obj, Float.valueOf(Float.parseFloat((String) objB)));
                                        } else if (type == Long.TYPE) {
                                            field.set(obj, Long.valueOf(Long.parseLong((String) objB)));
                                        } else if (type == Boolean.TYPE) {
                                            field.set(obj, Boolean.valueOf(Boolean.parseBoolean((String) objB)));
                                        } else if (type == Double.TYPE) {
                                            field.set(obj, Double.valueOf(Double.parseDouble((String) objB)));
                                        } else if (type == Short.TYPE) {
                                            field.set(obj, Short.valueOf(Short.parseShort((String) objB)));
                                        } else if (type == Byte.TYPE) {
                                            field.set(obj, Byte.valueOf(Byte.parseByte((String) objB)));
                                        } else if (type == Character.TYPE) {
                                            field.set(obj, Character.valueOf(((String) objB).charAt(0)));
                                        }
                                    }
                                } catch (Throwable unused2) {
                                    HiLog.e("JsonUtils", "processValueError");
                                }
                            }
                        }
                    } catch (RuntimeException unused3) {
                        HiLog.w("JsonUtils", obj.getClass().getName() + ".fromJson runtime exception, fieldName: " + field.getName() + ", field: " + field);
                    }
                } catch (Exception unused4) {
                    objB = null;
                }
            }
        }
        return obj;
    }

    public static Map a(Class cls, Class[] clsArr, Object obj) throws JSONException {
        Map linkedHashMap;
        Object objB;
        if (clsArr == null) {
            clsArr = new Class[]{String.class};
        }
        if (obj instanceof JSONObject) {
            if (cls == Map.class) {
                linkedHashMap = new LinkedHashMap();
            } else if (Map.class.isAssignableFrom(cls)) {
                try {
                    linkedHashMap = (Map) cls.newInstance();
                } catch (IllegalAccessException | InstantiationException unused) {
                    throw a(true, "fail to initiate %s", cls);
                }
            } else {
                throw a(true, "%s is not Map type", cls);
            }
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (clsArr.length == 1) {
                    objB = b(clsArr[0], null, jSONObject.get(next));
                } else {
                    objB = b(clsArr[0], clsArr[1], jSONObject.get(next));
                }
                if (objB != null) {
                    if (clsArr[0].isAssignableFrom(objB.getClass())) {
                        linkedHashMap.put(next, objB);
                    } else {
                        HiLog.e("JsonUtils", "mapFromJson error, memberClass:" + clsArr + ", valueClass:" + objB.getClass());
                    }
                }
            }
            return linkedHashMap;
        }
        throw a(true, "jsonValue is not JSONObject", new Object[0]);
    }

    public static List a(Class cls, Class cls2, Object obj) throws JSONException {
        List arrayList;
        if (cls2 == null) {
            cls2 = String.class;
        }
        if (obj instanceof JSONArray) {
            if (cls == List.class) {
                arrayList = new ArrayList();
            } else if (List.class.isAssignableFrom(cls)) {
                try {
                    arrayList = (List) cls.newInstance();
                } catch (IllegalAccessException | InstantiationException unused) {
                    throw a(true, "fail to initiate %s", cls);
                }
            } else {
                throw a(true, "%s is not List type", cls);
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objB = b(cls2, null, jSONArray.get(i));
                if (objB != null) {
                    if (cls2.isAssignableFrom(objB.getClass())) {
                        arrayList.add(objB);
                    } else {
                        HiLog.e("JsonUtils", "listFromJson error, memberClass:" + cls2 + ", valueClass:" + objB.getClass());
                    }
                }
            }
            return arrayList;
        }
        throw a(true, "jsonobject is not JSONArray", new Object[0]);
    }

    public static List a(JSONArray jSONArray, Class cls, Class[] clsArr) throws JSONException {
        if (List.class.isAssignableFrom(cls)) {
            return a(cls, (clsArr == null || clsArr.length <= 0) ? null : clsArr[0], jSONArray);
        }
        throw a(true, "obj class (%s) is not List type", cls);
    }

    public static JSONException a(boolean z, String str, Object... objArr) {
        String str2 = String.format(Locale.ENGLISH, str, objArr);
        if (z) {
            HiLog.w("JsonUtils", str2);
        }
        return new JSONException(str2);
    }

    public static String a(Object obj) throws JSONException {
        if (obj == null) {
            return "";
        }
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive()) {
            Class<?>[] clsArr = f11529a;
            for (int i = 0; i < 10; i++) {
                if (cls == clsArr[i]) {
                    throw a(true, "obj class (%s) is invalid in conversion", cls);
                }
            }
            if (obj instanceof List) {
                return a((List) obj);
            }
            if (obj instanceof Map) {
                return a((Map) obj);
            }
            Field[] fieldArrA = v.a(obj.getClass());
            if (fieldArrA.length <= 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            int length = fieldArrA.length;
            for (int i2 = 0; i2 < length; i2++) {
                Field field = fieldArrA[i2];
                field.setAccessible(true);
                fieldArrA[i2] = field;
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers()) && !name.contains(SampleEvent.SEPARATOR)) {
                    String name2 = fieldArrA[i2].getName();
                    String strB = b(fieldArrA[i2].get(obj));
                    if (strB != null) {
                        sb.append('\"');
                        sb.append(name2);
                        sb.append("\":");
                        sb.append(strB);
                        if (i2 < length - 1) {
                            sb.append(',');
                        }
                    }
                }
            }
            int length2 = sb.length();
            if (length2 > 0) {
                int i3 = length2 - 1;
                if (sb.charAt(i3) == ',') {
                    sb.delete(i3, length2);
                }
            }
            sb.append('}');
            return sb.toString();
        }
        throw a(true, "obj class (%s) cannot be primitive type", cls);
    }

    public static String a(List list) {
        if (list.size() <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strB = b(list.get(i));
            if (strB != null) {
                sb.append(strB);
                sb.append(',');
            }
        }
        int length = sb.length();
        if (length > 0) {
            int i2 = length - 1;
            if (sb.charAt(i2) == ',') {
                sb.delete(i2, length);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static String a(Map map) {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Set<Map.Entry> setEntrySet = map.entrySet();
        int size = setEntrySet.size();
        int i = 0;
        for (Map.Entry entry : setEntrySet) {
            i++;
            String str = (String) entry.getKey();
            String strB = b(entry.getValue());
            if (strB != null) {
                sb.append('\"');
                sb.append(str);
                sb.append("\":");
                sb.append(strB);
            }
            if (i < size && strB != null) {
                sb.append(',');
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

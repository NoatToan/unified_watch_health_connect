package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.annotations.SecretField;
import com.huawei.openalliance.ad.hw;
import java.lang.annotation.Annotation;
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

/* JADX INFO: loaded from: classes12.dex */
public abstract class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class[] f20492a = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Character.class, Boolean.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f20493b = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Boolean.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20494c = "bk";
    private static final Map<Class, h> d;

    interface h<D, S> {
        D b(S s);
    }

    private static boolean d(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Double) || (obj instanceof Short);
    }

    private static String d(Context context, Object obj, boolean z) {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < length; i++) {
            String strC = c(context, Array.get(obj, i), z);
            if (strC != null) {
                sb.append(strC);
                sb.append(',');
            }
        }
        a(sb);
        sb.append(']');
        return sb.toString();
    }

    private static List c(Context context, Class cls, Class cls2, Object obj) throws JSONException {
        List arrayList;
        if (cls2 == null) {
            cls2 = String.class;
        }
        if (!(obj instanceof JSONArray)) {
            throw a("jsonobject is not JSONArray", new Object[0]);
        }
        if (cls == List.class) {
            arrayList = new ArrayList();
        } else {
            if (!List.class.isAssignableFrom(cls)) {
                throw a("%s is not List type", cls);
            }
            try {
                arrayList = (List) cls.newInstance();
            } catch (IllegalAccessException unused) {
                throw a("Fail to initiate %s", cls);
            } catch (InstantiationException unused2) {
                throw a("Fail to initiate %s", cls);
            }
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objA = a(context, cls2, (Class) null, jSONArray.get(i));
            if (objA != null) {
                if (cls2.isAssignableFrom(objA.getClass())) {
                    arrayList.add(objA);
                } else {
                    hw.d(f20494c, "listFromJson error, memberClass:" + cls2 + ", valueClass:" + objA.getClass());
                }
            }
        }
        return arrayList;
    }

    public static String c(Object obj) {
        return c(null, obj);
    }

    private static String c(Context context, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            if (dg.b(obj.toString())) {
                return null;
            }
            return "\"" + dg.g(obj.toString()) + "\"";
        }
        if (d(obj)) {
            return obj.toString();
        }
        if (obj instanceof List) {
            return a(context, (List) obj, z);
        }
        if (obj instanceof Map) {
            return a(context, (Map) obj, z);
        }
        return obj.getClass().isArray() ? d(context, obj, z) : a(context, obj, z);
    }

    public static String c(Context context, Object obj) {
        String str;
        String str2;
        try {
            return a(context, obj, true);
        } catch (IllegalAccessException unused) {
            str = f20494c;
            str2 = "toAnonymousJson IllegalAccessException";
            hw.c(str, str2);
            return "";
        } catch (JSONException unused2) {
            str = f20494c;
            str2 = "toAnonymousJson JSONException";
            hw.c(str, str2);
            return "";
        }
    }

    private static <T> T c(Context context, JSONObject jSONObject, Class<T> cls, Class[] clsArr) throws JSONException {
        if (Collection.class.isAssignableFrom(cls)) {
            throw a("Obj class %s is Collection type which mismatches with JsonObject", cls);
        }
        if (cls.isArray()) {
            throw a("Obj class %s is array type which mismatches with JsonObject", cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (T) b(context, cls, (clsArr == null || clsArr.length <= 0) ? null : clsArr[0], jSONObject);
        }
        try {
            return (T) a(context, jSONObject, cls.getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (IllegalAccessException unused) {
            throw a("New instance failed for %s", cls);
        } catch (InstantiationException unused2) {
            throw a("New instance failed for %s", cls);
        } catch (NoSuchMethodException unused3) {
            throw a("No default constructor for class %s", cls);
        } catch (InvocationTargetException unused4) {
            throw a("New instance failed for %s", cls);
        }
    }

    private static <T> T c(Context context, String str, Class<T> cls, Class[] clsArr) throws JSONException {
        try {
            try {
                return (T) c(context, new JSONObject(str), cls, clsArr);
            } catch (JSONException unused) {
                throw a("Input string is not valid json string!", new Object[0]);
            }
        } catch (JSONException unused2) {
            return (T) a(context, new JSONArray(str), cls, clsArr);
        }
    }

    private static boolean b(Field field) {
        if (field == null) {
            return false;
        }
        String name = field.getName();
        return (Modifier.isStatic(field.getModifiers()) || name == null || name.contains(SampleEvent.SEPARATOR) || field.isAnnotationPresent(com.huawei.openalliance.ad.annotations.f.class)) ? false : true;
    }

    private static boolean b(Class cls) {
        if (cls.isPrimitive()) {
            return true;
        }
        int length = f20493b.length;
        for (int i = 0; i < length; i++) {
            if (cls == f20493b[i]) {
                return true;
            }
        }
        return false;
    }

    private static Map b(Context context, Class cls, Class cls2, Object obj) throws JSONException {
        Map linkedHashMap;
        if (cls2 == null) {
            cls2 = String.class;
        }
        if (!(obj instanceof JSONObject)) {
            throw a("jsonValue is not JSONObject", new Object[0]);
        }
        if (Map.class == cls) {
            linkedHashMap = new LinkedHashMap();
        } else {
            if (!Map.class.isAssignableFrom(cls)) {
                throw a("%s is not Map type", cls);
            }
            try {
                linkedHashMap = (Map) cls.newInstance();
            } catch (IllegalAccessException unused) {
                throw a("Fail to initiate %s", cls);
            } catch (InstantiationException unused2) {
                throw a("Fail to initiate %s", cls);
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = a(context, cls2, (Class) null, jSONObject.get(next));
            if (objA != null) {
                if (cls2.isAssignableFrom(objA.getClass())) {
                    linkedHashMap.put(next, objA);
                } else {
                    hw.d(f20494c, "mapFromJson error, memberClass:" + cls2 + ", valueClass:" + objA.getClass());
                }
            }
        }
        return linkedHashMap;
    }

    public static String b(Object obj) {
        return b(null, obj);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    private static String b(Context context, Object obj, boolean z) throws IllegalAccessException {
        String strC;
        Field[] fieldArrA = cr.a((Class) obj.getClass());
        if (fieldArrA.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            Field fieldA = cr.a(fieldArrA[i], true);
            fieldArrA[i] = fieldA;
            if (b(fieldA)) {
                String strA = a(fieldArrA[i]);
                Object obj2 = fieldArrA[i].get(obj);
                if (!(obj2 instanceof String) || !TextUtils.isEmpty((String) obj2)) {
                    if (z && fieldArrA[i].isAnnotationPresent(com.huawei.openalliance.ad.annotations.a.class)) {
                        if (obj2 != null) {
                            strC = "\"******\"";
                        } else {
                            strC = null;
                        }
                    } else if (z && fieldArrA[i].isAnnotationPresent(com.huawei.openalliance.ad.annotations.g.class)) {
                        if (obj2 != null) {
                            strC = "\"" + dg.i((String) obj2) + "\"";
                        } else {
                            strC = null;
                        }
                    } else if (context == null || !fieldArrA[i].isAnnotationPresent(SecretField.class)) {
                        strC = c(context, obj2, z);
                    } else {
                        byte[] bArrB = cw.b(context);
                        if (obj2 != null) {
                            strC = com.huawei.openalliance.ad.utils.g.a((String) obj2, bArrB);
                        } else {
                            strC = null;
                        }
                    }
                    if (strC != null) {
                        sb.append('\"');
                        sb.append(strA);
                        sb.append("\":");
                        sb.append(strC);
                        if (i < length - 1) {
                            sb.append(',');
                        }
                    }
                }
            }
        }
        a(sb);
        sb.append('}');
        return sb.toString();
    }

    public static String b(Context context, Object obj) {
        try {
            return a(context, obj);
        } catch (JSONException unused) {
            hw.c(f20494c, "toJson JSONException");
            return "";
        }
    }

    public static <T> T b(String str, Class<T> cls, Class... clsArr) {
        return (T) b((Context) null, str, cls, clsArr);
    }

    public static <T> T b(Context context, JSONObject jSONObject, Class<T> cls, Class... clsArr) throws JSONException {
        if (jSONObject == null) {
            throw a(false, "Input json obj cannot be null!", new Object[0]);
        }
        a((Class) cls);
        return (T) c(context, jSONObject, cls, clsArr);
    }

    public static <T> T b(Context context, String str, Class<T> cls, Class... clsArr) {
        String str2;
        String str3;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (T) a(context, str, cls, clsArr);
        } catch (JSONException unused) {
            str2 = f20494c;
            str3 = "toObject JSONException";
            hw.c(str2, str3);
            return null;
        } catch (Exception unused2) {
            str2 = f20494c;
            str3 = "toObject error";
            hw.c(str2, str3);
            return null;
        }
    }

    private static void a(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            int i = length - 1;
            if (sb.charAt(i) == ',') {
                sb.delete(i, length);
            }
        }
    }

    private static void a(Object obj, Field field, Object obj2) {
        Object objValueOf;
        if (obj2 == null || !(obj2 instanceof String)) {
            return;
        }
        try {
            Class<?> type = field.getType();
            if (type.isPrimitive()) {
                if (Integer.TYPE == type) {
                    objValueOf = Integer.valueOf(Integer.parseInt((String) obj2));
                } else if (Float.TYPE == type) {
                    objValueOf = Float.valueOf(Float.parseFloat((String) obj2));
                } else if (Long.TYPE == type) {
                    objValueOf = Long.valueOf(Long.parseLong((String) obj2));
                } else if (Boolean.TYPE == type) {
                    objValueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj2));
                } else if (Double.TYPE == type) {
                    objValueOf = Double.valueOf(Double.parseDouble((String) obj2));
                } else if (Short.TYPE == type) {
                    objValueOf = Short.valueOf(Short.parseShort((String) obj2));
                } else if (Byte.TYPE == type) {
                    objValueOf = Byte.valueOf(Byte.parseByte((String) obj2));
                } else if (Character.TYPE != type) {
                    return;
                } else {
                    objValueOf = Character.valueOf(((String) obj2).charAt(0));
                }
                field.set(obj, objValueOf);
            }
        } catch (Throwable unused) {
            hw.d(f20494c, "processValueError");
        }
    }

    private static void a(Object obj, Field field) {
        try {
            Annotation[] annotations = field.getAnnotations();
            if (annotations != null) {
                int length = annotations.length;
                for (int i = 0; i < length; i++) {
                    com.huawei.openalliance.ad.cz czVarA = com.huawei.openalliance.ad.cy.a(annotations[i]);
                    if (czVarA != null) {
                        czVarA.a(obj, field, annotations[i]);
                    }
                }
            }
        } catch (IllegalAccessException unused) {
            hw.c(f20494c, obj.getClass().getName() + "postProcessFieldAnnotation exception, fieldName: " + field.getName() + ", field: " + field);
        } catch (Throwable th) {
            hw.c(f20494c, obj.getClass().getName() + "postProcessFieldAnnotation " + th.getClass().getSimpleName() + ", fieldName: " + field.getName() + ", field: " + field);
        }
    }

    private static void a(Class cls) throws JSONException {
        if (cls.isPrimitive()) {
            throw a("Root obj class (%s) cannot be primitive type!", cls);
        }
        int length = f20492a.length;
        for (int i = 0; i < length; i++) {
            if (cls == f20492a[i]) {
                throw a("Root obj class (%s) is invalid in conversion", cls);
            }
        }
    }

    private static void a(Context context, Object obj, Field field, Object obj2) {
        Object objA = null;
        try {
            objA = a(context, field.getType(), cr.a(field), obj2);
            field.set(obj, objA);
        } catch (RuntimeException unused) {
            hw.c(f20494c, obj.getClass().getName() + ".fromJson runtime exception, fieldName: " + field.getName() + ", field: " + field);
        } catch (Exception unused2) {
            hw.c(f20494c, obj.getClass().getName() + ".fromJson error, fieldName: " + field.getName() + ", field:" + field);
            a(obj, field, objA);
        } finally {
            a(obj, field);
        }
    }

    private static JSONException a(boolean z, String str, Object... objArr) {
        String str2 = String.format(Locale.ENGLISH, str, objArr);
        if (z) {
            hw.c(f20494c, str2);
        }
        return new JSONException(str2);
    }

    private static JSONException a(String str, Object... objArr) {
        return a(true, str, objArr);
    }

    public static Map<String, String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(strTrim);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next).toString().trim());
            }
            return map;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String a(Field field) {
        com.huawei.openalliance.ad.annotations.d dVar = (com.huawei.openalliance.ad.annotations.d) field.getAnnotation(com.huawei.openalliance.ad.annotations.d.class);
        if (dVar != null && !TextUtils.isEmpty(dVar.a())) {
            return dVar.a();
        }
        String name = field.getName();
        return name.endsWith("__") ? name.substring(0, name.length() - 2) : name;
    }

    public static String a(Object obj) {
        return a((Context) null, obj);
    }

    private static String a(Context context, Map map, boolean z) {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Set<Map.Entry> setEntrySet = map.entrySet();
        int size = setEntrySet.size();
        int i = 0;
        for (Map.Entry entry : setEntrySet) {
            i++;
            String str = (String) entry.getKey();
            String strC = c(context, entry.getValue(), z);
            if (strC != null) {
                sb.append('\"');
                sb.append(str);
                sb.append("\":");
                sb.append(strC);
            }
            if (i < size && strC != null) {
                sb.append(',');
            }
        }
        a(sb);
        sb.append('}');
        return sb.toString();
    }

    private static String a(Context context, List list, boolean z) {
        if (list.size() <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String strC = c(context, list.get(i), z);
                if (strC != null) {
                    sb.append(strC);
                    sb.append(',');
                }
            }
            a(sb);
        } catch (Throwable th) {
            hw.c(f20494c, "list2Json exception: %", th.getClass().getSimpleName());
        }
        sb.append(']');
        return sb.toString();
    }

    private static String a(Context context, Object obj, boolean z) throws JSONException {
        if (obj == null) {
            return "";
        }
        a((Class) obj.getClass());
        if (obj instanceof List) {
            return a(context, (List) obj, z);
        }
        return obj instanceof Map ? a(context, (Map) obj, z) : b(context, obj, z);
    }

    public static String a(Context context, Object obj) throws JSONException {
        try {
            return a(context, obj, false);
        } catch (IllegalAccessException unused) {
            throw a("toJson error", new Object[0]);
        }
    }

    public static <T> T a(String str, Class<T> cls, Class... clsArr) {
        return (T) a((Context) null, str, cls, clsArr);
    }

    private static Object a(Class cls, Object obj) {
        if (String.class == cls) {
            return dg.a(obj);
        }
        if ((cls.isPrimitive() || Number.class.isAssignableFrom(cls)) && (obj instanceof Number)) {
            Number number = (Number) obj;
            h hVar = d.get(cls);
            if (hVar != null) {
                return hVar.b(number);
            }
            hw.c(f20494c, "cannot find value reader for: %s", cls);
            return null;
        }
        if (cls != Boolean.class) {
            return obj;
        }
        h hVar2 = d.get(cls);
        if (hVar2 != null) {
            return hVar2.b(obj);
        }
        hw.c(f20494c, "cannot find value reader for: %s", cls);
        return null;
    }

    private static <T> T a(Context context, JSONObject jSONObject, T t) {
        Object objOpt;
        Field[] fieldArrA = cr.a((Class) t.getClass());
        int length = fieldArrA.length;
        for (int i = 0; i < length; i++) {
            Field fieldA = cr.a(fieldArrA[i], true);
            if (b(fieldA) && (objOpt = jSONObject.opt(a(fieldA))) != null && JSONObject.NULL != objOpt) {
                if (context != null && fieldArrA[i].isAnnotationPresent(SecretField.class)) {
                    objOpt = com.huawei.openalliance.ad.utils.g.b((String) objOpt, cw.b(context));
                }
                a(context, t, fieldA, objOpt);
            }
        }
        return t;
    }

    public static <T> T a(Context context, JSONObject jSONObject, Class<T> cls, Class... clsArr) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return (T) b(context, jSONObject, cls, clsArr);
        } catch (Throwable unused) {
            hw.c(f20494c, "toObject error");
            return null;
        }
    }

    private static <T> T a(Context context, JSONArray jSONArray, Class<T> cls, Class[] clsArr) throws JSONException {
        if (List.class.isAssignableFrom(cls)) {
            return (T) c(context, cls, (clsArr == null || clsArr.length <= 0) ? null : clsArr[0], jSONArray);
        }
        throw a("Obj class (%s) is not List type", cls);
    }

    static class a implements h<Boolean, Object> {
        @Override // com.huawei.openalliance.ad.utils.bk.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean b(Object obj) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof String) {
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            }
            return null;
        }

        private a() {
        }
    }

    static class b implements h<Byte, Number> {
        @Override // com.huawei.openalliance.ad.utils.bk.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte b(Number number) {
            return Byte.valueOf(number.byteValue());
        }

        private b() {
        }
    }

    static class c implements h<Double, Number> {
        @Override // com.huawei.openalliance.ad.utils.bk.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double b(Number number) {
            return Double.valueOf(number.doubleValue());
        }

        private c() {
        }
    }

    static class d implements h<Float, Number> {
        @Override // com.huawei.openalliance.ad.utils.bk.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float b(Number number) {
            return Float.valueOf(number.floatValue());
        }

        private d() {
        }
    }

    static class e implements h<Integer, Number> {
        @Override // com.huawei.openalliance.ad.utils.bk.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer b(Number number) {
            return Integer.valueOf(number.intValue());
        }

        private e() {
        }
    }

    static class f implements h<Long, Number> {
        @Override // com.huawei.openalliance.ad.utils.bk.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long b(Number number) {
            return Long.valueOf(number.longValue());
        }

        private f() {
        }
    }

    static class g implements h<Short, Number> {
        @Override // com.huawei.openalliance.ad.utils.bk.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short b(Number number) {
            return Short.valueOf(number.shortValue());
        }

        private g() {
        }
    }

    public static <T> T a(Context context, String str, Class<T> cls, Class... clsArr) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            throw a(false, "Input json string cannot be empty!", new Object[0]);
        }
        a((Class) cls);
        return (T) c(context, str, cls, clsArr);
    }

    private static Object a(Context context, Class cls, Class cls2, Object obj) throws JSONException {
        if (b(cls)) {
            return a(cls, obj);
        }
        if (List.class.isAssignableFrom(cls)) {
            return c(context, cls, cls2, obj);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return b(context, cls, cls2, obj);
        }
        if (obj instanceof JSONObject) {
            return c(context, (JSONObject) obj, cls, new Class[]{cls2});
        }
        if (obj instanceof JSONArray) {
            return a(context, (JSONArray) obj, cls, new Class[]{cls2});
        }
        throw a("value from json error, field class: %s", cls);
    }

    static {
        HashMap map = new HashMap();
        d = map;
        e eVar = new e();
        map.put(Integer.TYPE, eVar);
        map.put(Integer.class, eVar);
        f fVar = new f();
        map.put(Long.TYPE, fVar);
        map.put(Long.class, fVar);
        d dVar = new d();
        map.put(Float.TYPE, dVar);
        map.put(Float.class, dVar);
        c cVar = new c();
        map.put(Double.TYPE, cVar);
        map.put(Double.class, cVar);
        g gVar = new g();
        map.put(Short.TYPE, gVar);
        map.put(Short.class, gVar);
        b bVar = new b();
        map.put(Byte.TYPE, bVar);
        map.put(Byte.class, bVar);
        a aVar = new a();
        map.put(Boolean.TYPE, aVar);
        map.put(Boolean.class, aVar);
    }
}

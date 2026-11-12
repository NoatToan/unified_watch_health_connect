package com.huawei.ads.fund.util;

import android.text.TextUtils;
import com.huawei.ads.fund.anno.AnonymousField;
import com.huawei.ads.fund.anno.JsonField;
import com.huawei.ads.fund.anno.NoJsonField;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.ayk;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class[] f4786a = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Character.class, Boolean.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f4787b = {String.class, Object.class, Integer.class, Short.class, Long.class, Byte.class, Float.class, Double.class, Boolean.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4788c = "JsonUtil";
    private static final Map<Class, i> d;

    interface i<D, S> {
        D a(S s);
    }

    public static <T> T toObjectNoException(String str, Class<T> cls, Class... clsArr) {
        String str2;
        String str3;
        try {
            return (T) toObject(str, cls, clsArr);
        } catch (JSONException unused) {
            str2 = f4788c;
            str3 = "toObject JSONException";
            HiAdLog.w(str2, str3);
            return null;
        } catch (Exception unused2) {
            str2 = f4788c;
            str3 = "toObject error";
            HiAdLog.w(str2, str3);
            return null;
        }
    }

    public static <T> T toObject(String str, Class<T> cls, Class... clsArr) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            throw a(false, "Input json string cannot be empty!", new Object[0]);
        }
        a((Class) cls);
        return (T) a(str, cls, clsArr);
    }

    public static String toJsonNoException(Object obj) {
        try {
            return toJson(obj);
        } catch (JSONException unused) {
            HiAdLog.w(f4788c, "toJson JSONException");
            return "";
        }
    }

    public static String toJson(Object obj) throws JSONException {
        try {
            return c(obj, false);
        } catch (IllegalAccessException unused) {
            throw a("toJson error", new Object[0]);
        }
    }

    public static Map<String, String> jsonToMap(String str) {
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

    public static <T> T injectJsonObjectToTargetObj(JSONObject jSONObject, T t) {
        Object objOpt;
        for (Field field : com.huawei.ads.fund.e.a(t.getClass())) {
            Field fieldA = com.huawei.ads.fund.e.a(field, true);
            if (b(fieldA) && (objOpt = jSONObject.opt(a(fieldA))) != null && JSONObject.NULL != objOpt) {
                a(t, fieldA, objOpt);
            }
        }
        return t;
    }

    private static String d(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            if (StringUtils.isBlank(obj.toString())) {
                return null;
            }
            return "\"" + StringUtils.a(obj.toString()) + "\"";
        }
        if (a(obj)) {
            return obj.toString();
        }
        if (obj instanceof List) {
            return a((List) obj, z);
        }
        if (obj instanceof Map) {
            return a((Map) obj, z);
        }
        return obj.getClass().isArray() ? a(obj, z) : c(obj, z);
    }

    public static JSONObject createJsonObj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            HiAdLog.w(f4788c, "create json obj err");
            return null;
        }
    }

    public static <T> T convertJsonArrayToPOJO(String str, Class<T> cls) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            throw a(false, "Input json string cannot be empty!", new Object[0]);
        }
        a((Class) cls);
        try {
            T tNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                injectJsonObjectToTargetObj(jSONArray.optJSONObject(i2), tNewInstance);
            }
            return tNewInstance;
        } catch (NoSuchMethodException unused) {
            throw a("No default constructor for class %s", cls);
        } catch (JSONException unused2) {
            throw a("Input string is not valid json string!", new Object[0]);
        } catch (Throwable unused3) {
            throw a("New instance failed for %s", cls);
        }
    }

    private static String c(Object obj, boolean z) throws JSONException {
        if (obj == null) {
            return "";
        }
        a((Class) obj.getClass());
        if (obj instanceof List) {
            return a((List) obj, z);
        }
        return obj instanceof Map ? a((Map) obj, z) : b(obj, z);
    }

    private static Object c(Class cls, Class cls2, Object obj) throws JSONException {
        if (b(cls)) {
            return a(cls, obj);
        }
        if (List.class.isAssignableFrom(cls)) {
            return a(cls, cls2, obj);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return b(cls, cls2, obj);
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj, cls, new Class[]{cls2});
        }
        if (obj instanceof JSONArray) {
            return a((JSONArray) obj, cls, new Class[]{cls2});
        }
        throw a("value from json error, field class: %s", cls);
    }

    private static boolean b(Field field) {
        if (field == null) {
            return false;
        }
        String name = field.getName();
        return (Modifier.isStatic(field.getModifiers()) || name == null || name.contains(SampleEvent.SEPARATOR) || field.isAnnotationPresent(NoJsonField.class)) ? false : true;
    }

    private static boolean b(Class cls) {
        if (cls.isPrimitive()) {
            return true;
        }
        int length = f4787b.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (cls == f4787b[i2]) {
                return true;
            }
        }
        return false;
    }

    private static void b(Object obj, Field field, Object obj2) {
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
            HiAdLog.e(f4788c, "processValueError");
        }
    }

    private static Map b(Class cls, Class cls2, Object obj) throws JSONException {
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
            Object objC = c(cls2, null, jSONObject.get(next));
            if (objC != null) {
                if (cls2.isAssignableFrom(objC.getClass())) {
                    linkedHashMap.put(next, objC);
                } else {
                    HiAdLog.e(f4788c, "mapFromJson error, memberClass:" + cls2 + ", valueClass:" + objC.getClass());
                }
            }
        }
        return linkedHashMap;
    }

    private static String b(Object obj, boolean z) throws IllegalAccessException {
        Field[] fieldArrA = com.huawei.ads.fund.e.a(obj.getClass());
        if (fieldArrA.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int length = fieldArrA.length;
        for (int i2 = 0; i2 < length; i2++) {
            Field fieldA = com.huawei.ads.fund.e.a(fieldArrA[i2], true);
            fieldArrA[i2] = fieldA;
            if (b(fieldA)) {
                String strA = a(fieldArrA[i2]);
                Object obj2 = fieldArrA[i2].get(obj);
                String strD = (z && fieldArrA[i2].isAnnotationPresent(AnonymousField.class)) ? obj2 != null ? "\"******\"" : null : d(obj2, z);
                if (strD != null) {
                    sb.append('\"');
                    sb.append(strA);
                    sb.append("\":");
                    sb.append(strD);
                    if (i2 < length - 1) {
                        sb.append(',');
                    }
                }
            }
        }
        a(sb);
        sb.append('}');
        return sb.toString();
    }

    private static boolean a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Double) || (obj instanceof Short);
    }

    private static void a(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            int i2 = length - 1;
            if (sb.charAt(i2) == ',') {
                sb.delete(i2, length);
            }
        }
    }

    private static void a(Object obj, Field field, Object obj2) {
        Object objC;
        try {
            try {
                try {
                    objC = c(field.getType(), com.huawei.ads.fund.e.a(field), obj2);
                    try {
                        field.set(obj, objC);
                    } catch (Exception unused) {
                        HiAdLog.w(f4788c, obj.getClass().getName() + ".fromJson error, fieldName: " + field.getName() + ", field:" + field);
                        b(obj, field, objC);
                    }
                } catch (RuntimeException unused2) {
                    HiAdLog.w(f4788c, obj.getClass().getName() + ".fromJson runtime exception, fieldName: " + field.getName() + ", field: " + field);
                }
            } finally {
                a(obj, field);
            }
        } catch (Exception unused3) {
            objC = null;
        }
    }

    private static void a(Object obj, Field field) {
        try {
            Annotation[] annotations = field.getAnnotations();
            if (annotations != null) {
                int length = annotations.length;
                for (int i2 = 0; i2 < length; i2++) {
                    com.huawei.ads.fund.c cVarC = ayk.c(annotations[i2]);
                    if (cVarC != null) {
                        cVarC.a(obj, field, annotations[i2]);
                    }
                }
            }
        } catch (IllegalAccessException unused) {
            HiAdLog.w(f4788c, obj.getClass().getName() + "postProcessFieldAnnotation exception, fieldName: " + field.getName() + ", field: " + field);
        } catch (Throwable th) {
            HiAdLog.w(f4788c, obj.getClass().getName() + "postProcessFieldAnnotation " + th.getClass().getSimpleName() + ", fieldName: " + field.getName() + ", field: " + field);
        }
    }

    private static void a(Class cls) throws JSONException {
        if (cls.isPrimitive()) {
            throw a("Root obj class (%s) cannot be primitive type!", cls);
        }
        int length = f4786a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (cls == f4786a[i2]) {
                throw a("Root obj class (%s) is invalid in conversion", cls);
            }
        }
    }

    private static JSONException a(boolean z, String str, Object... objArr) {
        String formatMsg = StringUtils.getFormatMsg(str, objArr);
        if (z) {
            HiAdLog.w(f4788c, formatMsg);
        }
        return new JSONException(formatMsg);
    }

    private static JSONException a(String str, Object... objArr) {
        return a(true, str, objArr);
    }

    private static List a(Class cls, Class cls2, Object obj) throws JSONException {
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
        for (int i2 = 0; i2 < length; i2++) {
            Object objC = c(cls2, null, jSONArray.get(i2));
            if (objC != null) {
                if (cls2.isAssignableFrom(objC.getClass())) {
                    arrayList.add(objC);
                } else {
                    HiAdLog.e(f4788c, "listFromJson error, memberClass:" + cls2 + ", valueClass:" + objC.getClass());
                }
            }
        }
        return arrayList;
    }

    private static String a(Map map, boolean z) {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Set<Map.Entry> setEntrySet = map.entrySet();
        int size = setEntrySet.size();
        int i2 = 0;
        for (Map.Entry entry : setEntrySet) {
            i2++;
            String str = (String) entry.getKey();
            String strD = d(entry.getValue(), z);
            if (strD != null) {
                sb.append('\"');
                sb.append(str);
                sb.append("\":");
                sb.append(strD);
            }
            if (i2 < size && strD != null) {
                sb.append(',');
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private static String a(List list, boolean z) {
        if (list.size() <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strD = d(list.get(i2), z);
            if (strD != null) {
                sb.append(strD);
                sb.append(',');
            }
        }
        a(sb);
        sb.append(']');
        return sb.toString();
    }

    private static String a(Field field) {
        JsonField jsonField = (JsonField) field.getAnnotation(JsonField.class);
        if (jsonField != null && !TextUtils.isEmpty(jsonField.value())) {
            return jsonField.value();
        }
        String name = field.getName();
        return name.endsWith("__") ? name.substring(0, name.length() - 2) : name;
    }

    private static String a(Object obj, boolean z) {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i2 = 0; i2 < length; i2++) {
            String strD = d(Array.get(obj, i2), z);
            if (strD != null) {
                sb.append(strD);
                sb.append(',');
            }
        }
        a(sb);
        sb.append(']');
        return sb.toString();
    }

    private static <T> T a(JSONObject jSONObject, Class<T> cls, Class[] clsArr) throws JSONException {
        if (Collection.class.isAssignableFrom(cls)) {
            throw a("Obj class %s is Collection type which mismatches with JsonObject", cls);
        }
        if (cls.isArray()) {
            throw a("Obj class %s is array type which mismatches with JsonObject", cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (T) b(cls, (clsArr == null || clsArr.length <= 0) ? null : clsArr[0], jSONObject);
        }
        try {
            return (T) injectJsonObjectToTargetObj(jSONObject, cls.getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException unused) {
            throw a("No default constructor for class %s", cls);
        } catch (Throwable unused2) {
            throw a("New instance failed for %s", cls);
        }
    }

    static class a implements i<Float, Object> {
        @Override // com.huawei.ads.fund.util.JsonUtil.i
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float a(Object obj) {
            if (obj instanceof Number) {
                return Float.valueOf(((Number) obj).floatValue());
            }
            if (obj instanceof String) {
                return StringUtils.toFloat((String) obj);
            }
            return null;
        }

        private a() {
        }
    }

    static class b implements i<Byte, Object> {
        @Override // com.huawei.ads.fund.util.JsonUtil.i
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Byte a(Object obj) {
            if (obj instanceof Number) {
                return Byte.valueOf(((Number) obj).byteValue());
            }
            if (obj instanceof String) {
                return StringUtils.toByte((String) obj);
            }
            return null;
        }

        private b() {
        }
    }

    static class d implements i<Boolean, Object> {
        @Override // com.huawei.ads.fund.util.JsonUtil.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            try {
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    return Boolean.valueOf(Boolean.parseBoolean((String) obj));
                }
                return null;
            } catch (Throwable unused) {
                HiAdLog.w(JsonUtil.f4788c, "read boolean - unKnow srcValue class");
                return null;
            }
        }

        private d() {
        }
    }

    static class e implements i<Double, Object> {
        @Override // com.huawei.ads.fund.util.JsonUtil.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(Object obj) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                return StringUtils.toDouble((String) obj);
            }
            return null;
        }

        private e() {
        }
    }

    static class f implements i<Short, Object> {
        @Override // com.huawei.ads.fund.util.JsonUtil.i
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Short a(Object obj) {
            if (obj instanceof Number) {
                return Short.valueOf(((Number) obj).shortValue());
            }
            if (obj instanceof String) {
                return StringUtils.toShort((String) obj);
            }
            return null;
        }

        private f() {
        }
    }

    static class g implements i<Integer, Object> {
        @Override // com.huawei.ads.fund.util.JsonUtil.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer a(Object obj) {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof String) {
                return StringUtils.toInteger((String) obj);
            }
            return null;
        }

        private g() {
        }
    }

    static class h implements i<Long, Object> {
        @Override // com.huawei.ads.fund.util.JsonUtil.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long a(Object obj) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (obj instanceof String) {
                return StringUtils.toLong((String) obj);
            }
            return null;
        }

        private h() {
        }
    }

    private static <T> T a(JSONArray jSONArray, Class<T> cls, Class[] clsArr) throws JSONException {
        if (List.class.isAssignableFrom(cls)) {
            return (T) a(cls, (clsArr == null || clsArr.length <= 0) ? null : clsArr[0], jSONArray);
        }
        throw a("Obj class (%s) is not List type", cls);
    }

    private static <T> T a(String str, Class<T> cls, Class[] clsArr) throws JSONException {
        try {
            try {
                return (T) a(new JSONObject(str), cls, clsArr);
            } catch (JSONException unused) {
                throw a("Input string is not valid json string!", new Object[0]);
            }
        } catch (JSONException unused2) {
            return (T) a(new JSONArray(str), cls, clsArr);
        }
    }

    private static Object a(Class cls, Object obj) {
        i iVar;
        if (String.class == cls) {
            return StringUtils.a(obj);
        }
        if ((cls.isPrimitive() || Number.class.isAssignableFrom(cls)) && ((obj instanceof Number) || (obj instanceof String))) {
            iVar = d.get(cls);
            if (iVar == null) {
                HiAdLog.w(f4788c, "cannot find value reader for: %s", cls);
                return null;
            }
        } else {
            if (cls != Boolean.class) {
                return obj;
            }
            iVar = d.get(cls);
            if (iVar == null) {
                HiAdLog.w(f4788c, "cannot find value reader for: %s", cls);
                return null;
            }
        }
        return iVar.a(obj);
    }

    static {
        HashMap map = new HashMap();
        d = map;
        g gVar = new g();
        map.put(Integer.TYPE, gVar);
        map.put(Integer.class, gVar);
        h hVar = new h();
        map.put(Long.TYPE, hVar);
        map.put(Long.class, hVar);
        a aVar = new a();
        map.put(Float.TYPE, aVar);
        map.put(Float.class, aVar);
        e eVar = new e();
        map.put(Double.TYPE, eVar);
        map.put(Double.class, eVar);
        f fVar = new f();
        map.put(Short.TYPE, fVar);
        map.put(Short.class, fVar);
        b bVar = new b();
        map.put(Byte.TYPE, bVar);
        map.put(Byte.class, bVar);
        d dVar = new d();
        map.put(Boolean.TYPE, dVar);
        map.put(Boolean.class, dVar);
    }
}

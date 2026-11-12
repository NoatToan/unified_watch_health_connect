package net.openid.appauth;

import android.net.Uri;
import defpackage.zre;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class JsonUtil {
    public static void d(JSONObject jSONObject, String str, int i) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        zre.c(Integer.valueOf(i), "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void e(JSONObject jSONObject, String str, String str2) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        zre.c(str2, (Object) "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static void d(JSONObject jSONObject, String str, JSONArray jSONArray) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        zre.c(jSONArray, "value must not be null");
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static void e(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        zre.c(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static void e(JSONObject jSONObject, String str, Uri uri) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (uri == null) {
            return;
        }
        try {
            jSONObject.put(str, uri.toString());
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static void d(JSONObject jSONObject, String str, Long l) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (l == null) {
            return;
        }
        try {
            jSONObject.put(str, l);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static void c(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e2) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e2);
        }
    }

    public static String d(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException("field \"" + str + "\" not found in json object");
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static String c(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List<String> g(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray == null) {
            throw new JSONException("field \"" + str + "\" is mapped to a null value");
        }
        return b(jSONArray);
    }

    public static Uri i(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        String string = jSONObject.getString(str);
        if (string == null) {
            throw new JSONException("field \"" + str + "\" is mapped to a null value");
        }
        return Uri.parse(string);
    }

    public static Uri f(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string == null) {
            throw new JSONException("field \"" + str + "\" is mapped to a null value");
        }
        return Uri.parse(string);
    }

    public static Long b(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List<String> e(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException("field \"" + str + "\" not found in json object");
        }
        return b(jSONObject.getJSONArray(str));
    }

    public static List<Uri> j(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException("field \"" + str + "\" not found in json object");
        }
        return c(jSONObject.getJSONArray(str));
    }

    public static Map<String, String> h(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, (String) zre.c(jSONObject2.getString(next), (Object) "additional parameter values must not be null"));
            }
        }
        return linkedHashMap;
    }

    public static JSONObject a(JSONObject jSONObject, String str) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        zre.c(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(zre.c(jSONArray.get(i)).toString());
            }
        }
        return arrayList;
    }

    public static Map<String, Object> c(JSONObject jSONObject) throws JSONException {
        zre.c(jSONObject, "json must not be null");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            map.put(next, objC);
        }
        return map;
    }

    public static List<Object> a(JSONArray jSONArray) throws JSONException {
        zre.c(jSONArray, "jsonArray must not be null");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objC = jSONArray.get(i);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static List<Uri> c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(Uri.parse(zre.c(jSONArray.get(i)).toString()));
            }
        }
        return arrayList;
    }

    public static JSONArray a(Iterable<?> iterable) {
        zre.c(iterable, "objects cannot be null");
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        return jSONArray;
    }

    public static JSONObject a(Map<String, String> map) {
        zre.c(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            zre.c(entry.getKey(), (Object) "map entries must not have null keys");
            zre.c(entry.getValue(), (Object) "map entries must not have null values");
            e(jSONObject, entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static <T> T b(JSONObject jSONObject, Field<T> field) {
        try {
            if (!jSONObject.has(field.key)) {
                return field.defaultValue;
            }
            return field.convert(jSONObject.getString(field.key));
        } catch (JSONException e2) {
            throw new IllegalStateException("unexpected JSONException", e2);
        }
    }

    public static abstract class Field<T> {
        public final T defaultValue;
        public final String key;

        abstract T convert(String str);

        Field(String str, T t) {
            this.key = str;
            this.defaultValue = t;
        }
    }

    public static final class d extends Field<Uri> {
        d(String str, Uri uri) {
            super(str, uri);
        }

        public d(String str) {
            this(str, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.JsonUtil.Field
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri convert(String str) {
            return Uri.parse(str);
        }
    }

    public static final class c extends Field<String> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.JsonUtil.Field
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String convert(String str) {
            return str;
        }

        c(String str, String str2) {
            super(str, str2);
        }

        public c(String str) {
            this(str, null);
        }
    }

    public static final class a extends Field<Boolean> {
        public a(String str, boolean z) {
            super(str, Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.JsonUtil.Field
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean convert(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    public static abstract class ListField<T> {
        public final List<T> defaultValue;
        public final String key;

        abstract T convert(String str);

        ListField(String str, List<T> list) {
            this.key = str;
            this.defaultValue = list;
        }
    }

    public static final class e extends ListField<String> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.JsonUtil.ListField
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String convert(String str) {
            return str;
        }

        public e(String str) {
            super(str, null);
        }

        public e(String str, List<String> list) {
            super(str, list);
        }
    }
}

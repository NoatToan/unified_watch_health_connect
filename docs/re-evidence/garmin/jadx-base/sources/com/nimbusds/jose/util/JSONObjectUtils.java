package com.nimbusds.jose.util;

import am.j;
import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.GsonBuilder;
import com.nimbusds.jose.shaded.gson.Strictness;
import com.nimbusds.jose.shaded.gson.ToNumberPolicy;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class JSONObjectUtils {
    private static final Gson GSON = new GsonBuilder().setStrictness(Strictness.STRICT).serializeNulls().setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE).disableHtmlEscaping().create();

    private JSONObjectUtils() {
    }

    public static Base64URL getBase64URL(Map<String, Object> map, String str) {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        return new Base64URL(string);
    }

    public static boolean getBoolean(Map<String, Object> map, String str) throws ParseException {
        Boolean bool = (Boolean) getGeneric(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        p.i(0, j.m("JSON object member ", str, " is missing or null"));
        return false;
    }

    public static double getDouble(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.doubleValue();
        }
        p.i(0, j.m("JSON object member ", str, " is missing or null"));
        return 0.0d;
    }

    public static Date getEpochSecondAsDate(Map<String, Object> map, String str) {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number == null) {
            return null;
        }
        return com.nimbusds.jwt.util.DateUtils.fromSecondsSinceEpoch(number.longValue());
    }

    public static float getFloat(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.floatValue();
        }
        p.i(0, j.m("JSON object member ", str, " is missing or null"));
        return 0.0f;
    }

    private static <T> T getGeneric(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t7 = (T) map.get(str);
        if (cls.isAssignableFrom(t7.getClass())) {
            return t7;
        }
        p.i(0, j.m("Unexpected type of JSON object member ", str, ""));
        return null;
    }

    public static int getInt(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        p.i(0, j.m("JSON object member ", str, " is missing or null"));
        return 0;
    }

    public static List<Object> getJSONArray(Map<String, Object> map, String str) {
        return (List) getGeneric(map, str, List.class);
    }

    public static Map<String, Object> getJSONObject(Map<String, Object> map, String str) throws ParseException {
        Map<String, Object> map2 = (Map) getGeneric(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        Iterator<String> it = map2.keySet().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                p.i(0, j.m("JSON object member ", str, " not a JSON object"));
                return null;
            }
        }
        return map2;
    }

    public static Map<String, Object>[] getJSONObjectArray(Map<String, Object> map, String str) throws ParseException {
        List<Object> jSONArray = getJSONArray(map, str);
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.isEmpty()) {
            return new HashMap[0];
        }
        for (Object obj : jSONArray) {
            if (obj != null && (obj instanceof Map)) {
                try {
                    return (Map[]) jSONArray.toArray(new Map[0]);
                } catch (ArrayStoreException unused) {
                }
            }
        }
        p.i(0, j.m("JSON object member ", str, " is not an array of JSON objects"));
        return null;
    }

    public static long getLong(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        p.i(0, j.m("JSON object member ", str, " is missing or null"));
        return 0L;
    }

    public static String getString(Map<String, Object> map, String str) {
        return (String) getGeneric(map, str, String.class);
    }

    public static String[] getStringArray(Map<String, Object> map, String str) throws ParseException {
        List<Object> jSONArray = getJSONArray(map, str);
        if (jSONArray == null) {
            return null;
        }
        try {
            return (String[]) jSONArray.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            p.i(0, j.m("JSON object member ", str, " is not an array of strings"));
            return null;
        }
    }

    public static List<String> getStringList(Map<String, Object> map, String str) {
        String[] stringArray = getStringArray(map, str);
        if (stringArray == null) {
            return null;
        }
        return Arrays.asList(stringArray);
    }

    public static URI getURI(Map<String, Object> map, String str) throws ParseException {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        try {
            return new URI(string);
        } catch (URISyntaxException e4) {
            p.i(0, e4.getMessage());
            return null;
        }
    }

    public static Map<String, Object> newJSONObject() {
        return new HashMap();
    }

    public static Map<String, Object> parse(String str, int i14) throws ParseException {
        if (str == null) {
            p.i(0, "The JSON object string must not be null");
            return null;
        }
        if (str.trim().isEmpty()) {
            p.i(0, "Invalid JSON object");
            return null;
        }
        if (i14 >= 0 && str.length() > i14) {
            p.i(0, e0.f(i14, "The parsed string is longer than the max accepted size of ", " characters"));
            return null;
        }
        try {
            return (Map) GSON.fromJson(str, TypeToken.getParameterized(Map.class, String.class, Object.class).getType());
        } catch (Exception unused) {
            p.i(0, "Invalid JSON object");
            return null;
        } catch (StackOverflowError unused2) {
            p.i(0, "Excessive JSON object and / or array nesting");
            return null;
        }
    }

    @Deprecated
    public static Map<String, Object> parseJSONObject(String str) {
        return parse(str);
    }

    public static String toJSONString(Map<String, ?> map) {
        Gson gson = GSON;
        Objects.requireNonNull(map);
        return gson.toJson(map);
    }

    public static Map<String, Object> parse(String str) {
        return parse(str, -1);
    }
}

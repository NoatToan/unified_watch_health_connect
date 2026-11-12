package defpackage;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class npd {
    public static Base64URL a(Map<String, Object> map, String str) throws ParseException {
        String strH = h(map, str);
        if (strH == null) {
            return null;
        }
        return new Base64URL(strH);
    }

    public static boolean b(Map<String, Object> map, String str) throws ParseException {
        Boolean bool = (Boolean) c(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException("JSON object member with key \"" + str + "\" is missing or null", 0);
    }

    public static <T> T c(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t = (T) map.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new ParseException("Unexpected type of JSON object member with key \"" + str + "\"", 0);
    }

    public static int d(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException("JSON object member with key \"" + str + "\" is missing or null", 0);
    }

    public static List<Object> e(Map<String, Object> map, String str) throws ParseException {
        return (List) c(map, str, List.class);
    }

    public static Map<String, Object> f(Map<String, Object> map, String str) throws ParseException {
        return (Map) c(map, str, JSONObject.class);
    }

    public static long g(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException("JSON object member with key \"" + str + "\" is missing or null", 0);
    }

    public static String h(Map<String, Object> map, String str) throws ParseException {
        return (String) c(map, str, String.class);
    }

    public static String[] i(Map<String, Object> map, String str) throws ParseException {
        List<Object> listE = e(map, str);
        if (listE == null) {
            return null;
        }
        try {
            return (String[]) listE.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException("JSON object member with key \"" + str + "\" is not an array of strings", 0);
        }
    }

    public static List<String> j(Map<String, Object> map, String str) throws ParseException {
        String[] strArrI = i(map, str);
        if (strArrI == null) {
            return null;
        }
        return Arrays.asList(strArrI);
    }

    public static URI k(Map<String, Object> map, String str) throws ParseException {
        String strH = h(map, str);
        if (strH == null) {
            return null;
        }
        try {
            return new URI(strH);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static Map<String, Object> l() {
        return new HashMap();
    }

    public static Map<String, Object> m(String str) throws ParseException {
        try {
            Object objB = new opd(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH).b(str);
            if (objB instanceof JSONObject) {
                return (JSONObject) objB;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e) {
            throw new ParseException("Invalid JSON: " + e.getMessage(), 0);
        } catch (Exception e2) {
            throw new ParseException("Unexpected exception: " + e2.getMessage(), 0);
        }
    }

    public static String n(Map<String, ?> map) {
        return JSONObject.toJSONString((Map<String, ? extends Object>) map);
    }
}

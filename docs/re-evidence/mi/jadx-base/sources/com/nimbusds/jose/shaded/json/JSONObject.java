package com.nimbusds.jose.shaded.json;

import defpackage.mpd;
import defpackage.tpd;
import defpackage.vpd;
import defpackage.ypd;
import defpackage.yud;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class JSONObject extends HashMap<String, Object> implements mpd, tpd {
    private static final long serialVersionUID = -503443796854799292L;

    public JSONObject() {
    }

    public static String escape(String str) {
        return ypd.a(str);
    }

    public static String toJSONString(Map<String, ? extends Object> map) {
        return toJSONString(map, ypd.f40395a);
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable, vpd vpdVar) throws IOException {
        if (map == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else {
            yud.i.a(map, appendable, vpdVar);
        }
    }

    public static void writeJSONKV(String str, Object obj, Appendable appendable, vpd vpdVar) throws IOException {
        if (str == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else if (vpdVar.h(str)) {
            appendable.append('\"');
            ypd.c(str, appendable, vpdVar);
            appendable.append('\"');
        } else {
            appendable.append(str);
        }
        appendable.append(AbstractJsonLexerKt.COLON);
        if (obj instanceof String) {
            vpdVar.p(appendable, (String) obj);
        } else {
            ypd.d(obj, appendable, vpdVar);
        }
    }

    public JSONObject appendField(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public Number getAsNumber(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj instanceof Number ? (Number) obj : Long.valueOf(obj.toString());
    }

    public String getAsString(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public void merge(Object obj) {
        merge(this, obj);
    }

    public String toString(vpd vpdVar) {
        return toJSONString(this, vpdVar);
    }

    @Override // defpackage.spd
    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSON(this, appendable, ypd.f40395a);
    }

    public JSONObject(Map<String, ?> map) {
        super(map);
    }

    public static JSONObject merge(JSONObject jSONObject, Object obj) {
        if (obj == null) {
            return jSONObject;
        }
        if (obj instanceof JSONObject) {
            return merge(jSONObject, (JSONObject) obj);
        }
        throw new RuntimeException("JSON merge can not merge JSONObject with " + obj.getClass());
    }

    public static String toJSONString(Map<String, ? extends Object> map, vpd vpdVar) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSON(map, sb, vpdVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return toJSONString(this, ypd.f40395a);
    }

    @Override // defpackage.tpd
    public void writeJSONString(Appendable appendable, vpd vpdVar) throws IOException {
        writeJSON(this, appendable, vpdVar);
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable) throws IOException {
        writeJSON(map, appendable, ypd.f40395a);
    }

    private static JSONObject merge(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj2 != null) {
                if (obj instanceof JSONArray) {
                    jSONObject.put(str, merge((JSONArray) obj, obj2));
                } else if (obj instanceof JSONObject) {
                    jSONObject.put(str, merge((JSONObject) obj, obj2));
                } else if (!obj.equals(obj2)) {
                    if (obj.getClass().equals(obj2.getClass())) {
                        throw new RuntimeException("JSON merge can not merge two " + obj.getClass().getName() + " Object together");
                    }
                    throw new RuntimeException("JSON merge can not merge " + obj.getClass().getName() + " with " + obj2.getClass().getName());
                }
            }
        }
        for (String str2 : jSONObject2.keySet()) {
            if (!jSONObject.containsKey(str2)) {
                jSONObject.put(str2, jSONObject2.get(str2));
            }
        }
        return jSONObject;
    }

    @Override // defpackage.lpd
    public String toJSONString() {
        return toJSONString(this, ypd.f40395a);
    }

    @Override // defpackage.mpd
    public String toJSONString(vpd vpdVar) {
        return toJSONString(this, vpdVar);
    }

    public static JSONArray merge(JSONArray jSONArray, Object obj) {
        if (obj == null) {
            return jSONArray;
        }
        if (jSONArray instanceof JSONArray) {
            return merge(jSONArray, (JSONArray) obj);
        }
        jSONArray.add(obj);
        return jSONArray;
    }

    private static JSONArray merge(JSONArray jSONArray, JSONArray jSONArray2) {
        jSONArray.addAll(jSONArray2);
        return jSONArray;
    }
}

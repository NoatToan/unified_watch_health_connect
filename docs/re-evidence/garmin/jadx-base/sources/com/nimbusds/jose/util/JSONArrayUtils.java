package com.nimbusds.jose.util;

import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.GsonBuilder;
import com.nimbusds.jose.shaded.gson.Strictness;
import com.nimbusds.jose.shaded.gson.ToNumberPolicy;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class JSONArrayUtils {
    private static final Gson GSON = new GsonBuilder().setStrictness(Strictness.STRICT).serializeNulls().setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE).disableHtmlEscaping().create();

    private JSONArrayUtils() {
    }

    public static List<Object> newJSONArray() {
        return new ArrayList();
    }

    public static List<Object> parse(String str) throws ParseException {
        if (str == null) {
            p.i(0, "The JSON array string must not be null");
            return null;
        }
        if (str.trim().isEmpty()) {
            p.i(0, "Invalid JSON array");
            return null;
        }
        try {
            return (List) GSON.fromJson(str, TypeToken.getParameterized(List.class, Object.class).getType());
        } catch (Exception unused) {
            p.i(0, "Invalid JSON array");
            return null;
        } catch (StackOverflowError unused2) {
            p.i(0, "Excessive JSON object and / or array nesting");
            return null;
        }
    }

    public static String toJSONString(List<?> list) {
        Gson gson = GSON;
        Objects.requireNonNull(list);
        return gson.toJson(list);
    }
}

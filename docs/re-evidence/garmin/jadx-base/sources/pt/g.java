package pt;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt/g;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f140567a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f140568b = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[][] f140569c = {new String[]{"Jan_Blue_Dot", "Jan_White_Dot", "Jan_Bar"}, new String[]{"Feb_Blue_Dot", "Feb_White_Dot", "Feb_Bar"}, new String[]{"Mar_Blue_Dot", "Mar_White_Dot", "Mar_Bar"}, new String[]{"Apr_Blue_Dot", "Apr_White_Dot", "Apr_Bar"}, new String[]{"May_Blue_Dot", "May_White_Dot", "May_Bar"}, new String[]{"Jun_Blue_Dot", "Jun_White_Dot", "Jun_Bar"}, new String[]{"Jul_Blue_Dot", "Jul_White_Dot", "Jul_Bar"}, new String[]{"Aug_Blue_Dot", "Aug_White_Dot", "Aug_Bar"}, new String[]{"Sep_Blue_Dot", "Sep_White_Dot", "Sep_Bar"}, new String[]{"Oct_Blue_Dot", "Oct_White_Dot", "Oct_Bar"}, new String[]{"Nov_Blue_Dot", "Nov_White_Dot", "Nov_Bar"}, new String[]{"Dec_Blue_Dot", "Dec_White_Dot", "Dec_Bar"}};

    private g() {
    }

    public static JsonObject a(JsonArray jsonArray) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            if (jsonElement instanceof JsonObject) {
                arrayList.add(jsonElement);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                JsonElement jsonElement2 = ((JsonObject) next).get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT);
                float asFloat = jsonElement2 != null ? jsonElement2.getAsFloat() : 0.0f;
                do {
                    Object next2 = it.next();
                    JsonElement jsonElement3 = ((JsonObject) next2).get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT);
                    float asFloat2 = jsonElement3 != null ? jsonElement3.getAsFloat() : 0.0f;
                    if (Float.compare(asFloat, asFloat2) < 0) {
                        next = next2;
                        asFloat = asFloat2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (JsonObject) obj;
    }

    public static JsonObject b(JsonArray jsonArray) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            if (jsonElement instanceof JsonObject) {
                arrayList.add(jsonElement);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                JsonElement jsonElement2 = ((JsonObject) next).get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT);
                float asFloat = jsonElement2 != null ? jsonElement2.getAsFloat() : 0.0f;
                do {
                    Object next2 = it.next();
                    JsonElement jsonElement3 = ((JsonObject) next2).get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT);
                    float asFloat2 = jsonElement3 != null ? jsonElement3.getAsFloat() : 0.0f;
                    if (Float.compare(asFloat, asFloat2) > 0) {
                        next = next2;
                        asFloat = asFloat2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (JsonObject) obj;
    }

    public static float c(JsonArray jsonArray) {
        JsonElement jsonElement;
        if (jsonArray == null || (jsonElement = jsonArray.get(1)) == null) {
            return 0.0f;
        }
        return jsonElement.getAsFloat();
    }

    public static void d(JsonObject jsonObject, List list, List list2, e23.s sVar) {
        String[][] strArr = f140569c;
        int length = strArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            String[] strArr2 = strArr[i15];
            int i17 = i16 + 1;
            String str = strArr2[0];
            String str2 = strArr2[1];
            String str3 = strArr2[2];
            JsonObject jsonObjectM = i.m(jsonObject, str);
            JsonObject jsonObjectM2 = i.m(jsonObject, str2);
            JsonObject jsonObjectM3 = i.m(jsonObject, str3);
            if (jsonObjectM != null && jsonObjectM2 != null && jsonObjectM3 != null) {
                Integer num = (Integer) h0.e0(i16, list);
                Integer num2 = (Integer) h0.e0(i16, list2);
                if (num == null || num2 == null) {
                    i.w(jsonObjectM, jsonObjectM2, jsonObjectM3);
                } else {
                    sVar.invoke(jsonObjectM, jsonObjectM2, jsonObjectM3, num, num2);
                }
            }
            i15++;
            i16 = i17;
        }
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        shortMonths.getClass();
        List listI0 = p13.u.i0(shortMonths);
        n.f140581a.getClass();
        for (Object obj : n.f140585e) {
            int i18 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            Object obj2 = listI0.get(i14);
            obj2.getClass();
            i.y(jsonObject, (String) obj, (String) obj2);
            i14 = i18;
        }
    }

    public static void e(JsonArray jsonArray, float f14) {
        if (jsonArray != null) {
            jsonArray.set(1, new JsonPrimitive(Float.valueOf(f14)));
        }
    }
}

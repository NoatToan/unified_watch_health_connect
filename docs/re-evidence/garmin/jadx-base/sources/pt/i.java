package pt;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import c22.l3;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.annual_report.data.model.FunFact;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpt/i;", "", "<init>", "()V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f140571a = new i();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpt/i$a;", "", "", TtmlNode.TAG_STYLE, "<init>", "(Ljava/lang/String;II)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        BUTT(1),
        /* JADX INFO: Fake field, exist only in values array */
        ROUND(2),
        SQUARE(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f140574a;

        a(int i14) {
            this.f140574a = i14;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140575a;

        static {
            int[] iArr = new int[FunFact.values().length];
            try {
                iArr[FunFact.PORT_RUNWAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunFact.ENGLISH_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FunFact.LONDON_PARIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FunFact.PYRAMID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FunFact.TOWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FunFact.MOUNTAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f140575a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"pt/i$c", "Lcom/airbnb/lottie/value/LottieValueCallback;", "", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends LottieValueCallback<CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f140576a;

        public c(String str) {
            this.f140576a = str;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final CharSequence getValue(LottieFrameInfo<CharSequence> lottieFrameInfo) {
            return this.f140576a;
        }
    }

    private i() {
    }

    public static void A(JsonObject jsonObject, String str, float f14) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonObject asJsonObject;
        JsonElement jsonElement4;
        str.getClass();
        JsonObject jsonObjectM = m(jsonObject, str);
        JsonArray asJsonArray = null;
        JsonObject asJsonObject2 = (jsonObjectM == null || (jsonElement3 = jsonObjectM.get("ks")) == null || (asJsonObject = jsonElement3.getAsJsonObject()) == null || (jsonElement4 = asJsonObject.get("a")) == null) ? null : jsonElement4.getAsJsonObject();
        if (asJsonObject2 != null && (jsonElement2 = asJsonObject2.get(JWKParameterNames.OCT_KEY_VALUE)) != null) {
            asJsonArray = jsonElement2.getAsJsonArray();
        }
        float asFloat = (asJsonArray == null || (jsonElement = asJsonArray.get(1)) == null) ? 0.0f : jsonElement.getAsFloat();
        if (asJsonArray != null) {
            asJsonArray.set(1, new JsonPrimitive(Float.valueOf(asFloat + f14)));
        }
        if (asJsonObject2 != null) {
            asJsonObject2.add(JWKParameterNames.OCT_KEY_VALUE, asJsonArray);
        }
    }

    public static String a(Context context, JsonObject jsonObject, String str, float f14, String str2, boolean z14) {
        JsonElement jsonElement;
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        JsonObject asJsonObject2;
        JsonElement jsonElement3;
        JsonArray asJsonArray;
        JsonElement jsonElement4;
        JsonObject asJsonObject3;
        JsonElement jsonElement5;
        JsonElement jsonElement6;
        JsonObject asJsonObject4;
        JsonElement jsonElement7;
        JsonObject asJsonObject5;
        JsonElement jsonElement8;
        String string = str2;
        Typeface typefaceQ = oe2.f.Q(context);
        JsonObject jsonObjectM = m(jsonObject, str);
        Float fT = t(jsonObjectM);
        JsonObject jsonObjectM2 = m(jsonObject, "Title_bg");
        float fN = n(jsonObject);
        if (jsonObjectM2 != null) {
            i iVar = f140571a;
            iVar.getClass();
            JsonObject jsonObjectK = k(jsonObjectM2, "sh");
            if (jsonObjectK != null && (jsonElement = jsonObjectK.get("ks")) != null && (asJsonObject = jsonElement.getAsJsonObject()) != null && (jsonElement2 = asJsonObject.get(JWKParameterNames.OCT_KEY_VALUE)) != null && (asJsonObject2 = jsonElement2.getAsJsonObject()) != null && (jsonElement3 = asJsonObject2.get("v")) != null && (asJsonArray = jsonElement3.getAsJsonArray()) != null) {
                ArrayList arrayList = new ArrayList();
                for (JsonElement jsonElement9 : asJsonArray) {
                    if (jsonElement9 instanceof JsonArray) {
                        arrayList.add(jsonElement9);
                    }
                }
                if (arrayList.size() > 1) {
                    float f15 = ((330.0f - f14) - 52.0f) - 16.0f;
                    JsonArray asJsonArray2 = ((JsonArray) arrayList.get(0)).getAsJsonArray();
                    float asFloat = (asJsonArray2 == null || (jsonElement8 = asJsonArray2.get(0)) == null) ? 0.0f : jsonElement8.getAsFloat();
                    iVar.getClass();
                    JsonObject jsonObjectK2 = k(jsonObjectM2, "st");
                    if (jsonObjectK2 != null && (jsonElement4 = jsonObjectK2.get("w")) != null && (asJsonObject3 = jsonElement4.getAsJsonObject()) != null && (jsonElement5 = asJsonObject3.get(JWKParameterNames.OCT_KEY_VALUE)) != null) {
                        float asFloat2 = jsonElement5.getAsFloat();
                        TextPaint textPaint = new TextPaint();
                        textPaint.setTypeface(typefaceQ);
                        if (fT != null) {
                            textPaint.setTextSize(fT.floatValue());
                        }
                        float fMeasureText = textPaint.measureText(string);
                        if (fMeasureText > f15 && z14) {
                            string = TextUtils.ellipsize(string, textPaint, f15, TextUtils.TruncateAt.END).toString();
                            fMeasureText = textPaint.measureText(string);
                        }
                        float fMin = Math.min(1.0f, f15 / fMeasureText);
                        float fMin2 = (((Math.min(fMeasureText, f15) + 52.0f) + 16.0f) - asFloat2) / fN;
                        if (jsonObjectM != null && (jsonElement6 = jsonObjectM.get("ks")) != null && (asJsonObject4 = jsonElement6.getAsJsonObject()) != null && (jsonElement7 = asJsonObject4.get("s")) != null && (asJsonObject5 = jsonElement7.getAsJsonObject()) != null) {
                            JsonArray jsonArray = new JsonArray();
                            float f16 = fMin * 100;
                            jsonArray.add(Float.valueOf(f16));
                            jsonArray.add(Float.valueOf(f16));
                            jsonArray.add((Number) 100);
                            asJsonObject5.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray);
                        }
                        JsonArray jsonArray2 = new JsonArray();
                        JsonElement jsonElement10 = ((JsonArray) arrayList.get(0)).get(0);
                        jsonArray2.add(jsonElement10 != null ? Float.valueOf(jsonElement10.getAsFloat()) : null);
                        JsonElement jsonElement11 = ((JsonArray) arrayList.get(0)).get(1);
                        jsonArray2.add(jsonElement11 != null ? Float.valueOf(jsonElement11.getAsFloat()) : null);
                        JsonArray jsonArray3 = new JsonArray();
                        jsonArray3.add(Float.valueOf(asFloat + fMin2));
                        JsonElement jsonElement12 = ((JsonArray) arrayList.get(1)).get(1);
                        jsonArray3.add(jsonElement12 != null ? Float.valueOf(jsonElement12.getAsFloat()) : null);
                        JsonArray jsonArray4 = new JsonArray();
                        jsonArray4.add(jsonArray2);
                        jsonArray4.add(jsonArray3);
                        asJsonObject2.add("v", jsonArray4);
                    }
                }
            }
        }
        return string;
    }

    public static /* synthetic */ void b(i iVar, Context context, JsonObject jsonObject, float f14, String str) {
        iVar.getClass();
        a(context, jsonObject, "Text_Topic", f14, str, false);
    }

    public static void c(JsonObject jsonObject, Color color) {
        color.getClass();
        JsonObject jsonObjectQ = q(jsonObject);
        if (jsonObjectQ != null) {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(Float.valueOf(color.red()));
            jsonArray.add(Float.valueOf(color.green()));
            jsonArray.add(Float.valueOf(color.blue()));
            jsonObjectQ.add("fc", jsonArray);
        }
    }

    public static void d(LottieDrawable lottieDrawable, String str, String str2) {
        str2.getClass();
        if (lottieDrawable != null) {
            lottieDrawable.addValueCallback(new KeyPath(str), LottieProperty.TEXT, new c(str2));
        }
    }

    public static final void e(JsonObject jsonObject, String str, float f14) {
        str.getClass();
        JsonObject jsonObjectQ = q(m(jsonObject, str));
        if (jsonObjectQ != null) {
            jsonObjectQ.addProperty("s", Float.valueOf(f14));
        }
    }

    public static void f(JsonObject jsonObject, float f14) {
        JsonElement jsonElement;
        JsonArray asJsonArray;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonArray asJsonArray2;
        JsonElement jsonElement4;
        JsonObject jsonObjectQ = q(m(jsonObject, "intro_layer_name"));
        boolean zHas = jsonObjectQ != null ? jsonObjectQ.has("sz") : false;
        float asFloat = (jsonObjectQ == null || (jsonElement3 = jsonObjectQ.get("sz")) == null || (asJsonArray2 = jsonElement3.getAsJsonArray()) == null || (jsonElement4 = asJsonArray2.get(0)) == null) ? 0.0f : jsonElement4.getAsFloat();
        if (zHas) {
            float f15 = 330.0f - f14;
            if (asFloat > f15) {
                JsonArray jsonArray = new JsonArray();
                jsonArray.add(Float.valueOf(f15));
                jsonArray.add((jsonObjectQ == null || (jsonElement = jsonObjectQ.get("sz")) == null || (asJsonArray = jsonElement.getAsJsonArray()) == null || (jsonElement2 = asJsonArray.get(1)) == null) ? null : Float.valueOf(jsonElement2.getAsFloat()));
                if (jsonObjectQ != null) {
                    jsonObjectQ.add("sz", jsonArray);
                }
            }
        }
    }

    public static final void g(Context context, JsonObject jsonObject, String str, String str2) {
        JsonArray jsonArray;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        Typeface typefaceQ = oe2.f.Q(context);
        JsonObject jsonObjectM = m(jsonObject, str);
        Float fT = t(jsonObjectM);
        String strP = p(jsonObjectM);
        if (strP == null) {
            strP = "";
        }
        JsonObject jsonObjectM2 = m(jsonObject, "Title_bg");
        float fN = n(jsonObject);
        if (jsonObjectM2 != null) {
            f140571a.getClass();
            JsonObject jsonObjectK = k(jsonObjectM2, "sh");
            if (jsonObjectK != null) {
                JsonObject jsonObject2 = (JsonObject) jsonObjectK.get("ks");
                Float fValueOf = null;
                JsonElement jsonElement6 = jsonObject2 != null ? jsonObject2.get(JWKParameterNames.OCT_KEY_VALUE) : null;
                JsonObject jsonObject3 = jsonElement6 instanceof JsonObject ? (JsonObject) jsonElement6 : null;
                if (jsonObject3 == null || (jsonArray = (JsonArray) jsonObject3.get("v")) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (JsonElement jsonElement7 : jsonArray) {
                    if (jsonElement7 instanceof JsonArray) {
                        arrayList.add(jsonElement7);
                    }
                }
                if (arrayList.size() > 1) {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTypeface(typefaceQ);
                    if (fT != null) {
                        textPaint.setTextSize(fT.floatValue());
                    }
                    float fMeasureText = textPaint.measureText(strP) / fN;
                    float fMeasureText2 = textPaint.measureText(str2) / fN;
                    Object obj = arrayList.get(0);
                    JsonArray jsonArray2 = obj instanceof JsonArray ? (JsonArray) obj : null;
                    float asFloat = (jsonArray2 == null || (jsonElement5 = jsonArray2.get(0)) == null) ? 0.0f : jsonElement5.getAsFloat();
                    Object obj2 = arrayList.get(1);
                    JsonArray jsonArray3 = obj2 instanceof JsonArray ? (JsonArray) obj2 : null;
                    float asFloat2 = ((((jsonArray3 == null || (jsonElement4 = jsonArray3.get(0)) == null) ? 0.0f : jsonElement4.getAsFloat()) - asFloat) - fMeasureText) + fMeasureText2;
                    float f14 = asFloat < 0.0f ? asFloat + asFloat2 : asFloat - asFloat2;
                    JsonArray jsonArray4 = new JsonArray();
                    Object obj3 = arrayList.get(0);
                    JsonArray jsonArray5 = obj3 instanceof JsonArray ? (JsonArray) obj3 : null;
                    jsonArray4.add((jsonArray5 == null || (jsonElement3 = jsonArray5.get(0)) == null) ? null : Float.valueOf(jsonElement3.getAsFloat()));
                    Object obj4 = arrayList.get(0);
                    JsonArray jsonArray6 = obj4 instanceof JsonArray ? (JsonArray) obj4 : null;
                    jsonArray4.add((jsonArray6 == null || (jsonElement2 = jsonArray6.get(1)) == null) ? null : Float.valueOf(jsonElement2.getAsFloat()));
                    JsonArray jsonArray7 = new JsonArray();
                    jsonArray7.add(Float.valueOf(f14));
                    Object obj5 = arrayList.get(1);
                    JsonArray jsonArray8 = obj5 instanceof JsonArray ? (JsonArray) obj5 : null;
                    if (jsonArray8 != null && (jsonElement = jsonArray8.get(1)) != null) {
                        fValueOf = Float.valueOf(jsonElement.getAsFloat());
                    }
                    jsonArray7.add(fValueOf);
                    JsonArray jsonArray9 = new JsonArray();
                    jsonArray9.add(jsonArray4);
                    jsonArray9.add(jsonArray7);
                    jsonObject3.add("v", jsonArray9);
                }
            }
        }
    }

    public static JsonObject h(JsonObject jsonObject, String str) {
        String asString;
        JsonElement jsonElement = jsonObject.get("assets");
        Object obj = null;
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : jsonArray) {
            if (jsonElement2 instanceof JsonObject) {
                arrayList.add(jsonElement2);
            }
        }
        for (Object obj2 : arrayList) {
            JsonElement jsonElement3 = ((JsonObject) obj2).get(TtmlNode.ATTR_ID);
            if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null && asString.equals(str)) {
                obj = obj2;
                break;
            }
        }
        return (JsonObject) obj;
    }

    public static final String i(Context context, int i14, FunFact funFact) {
        funFact.getClass();
        switch (b.f140575a[funFact.ordinal()]) {
            case 1:
                String quantityString = context.getResources().getQuantityString(R.plurals.activity_distance_fun_fact_port_runway, i14, Integer.valueOf(i14));
                quantityString.getClass();
                return quantityString;
            case 2:
                String string = context.getResources().getString(R.string.annual_report_activity_distance_fun_fact_eng_channel_other, Integer.valueOf(i14));
                string.getClass();
                return string;
            case 3:
                if (i14 == 2) {
                    String string2 = context.getString(R.string.annual_report_activity_distance_fun_fact_london_paris_twice);
                    string2.getClass();
                    return string2;
                }
                String string3 = context.getString(R.string.annual_report_activity_distance_fun_fact_london_paris_other, Integer.valueOf(i14));
                string3.getClass();
                return string3;
            case 4:
                if (i14 == 2) {
                    String string4 = context.getString(R.string.annual_report_activity_ascent_fun_fact_great_pyramid_twice);
                    string4.getClass();
                    return string4;
                }
                String quantityString2 = context.getResources().getQuantityString(R.plurals.activity_ascent_fun_fact_great_pyramid, i14, Integer.valueOf(i14));
                quantityString2.getClass();
                return quantityString2;
            case 5:
                String string5 = context.getResources().getString(R.string.annual_report_activity_ascent_fun_fact_eiffel_tower_other, Integer.valueOf(i14));
                string5.getClass();
                return string5;
            case 6:
                if (i14 == 2) {
                    String string6 = context.getString(R.string.annual_report_activity_ascent_fun_fact_mount_twice);
                    string6.getClass();
                    return string6;
                }
                String string7 = context.getString(R.string.annual_report_activity_ascent_fun_fact_mount_other, Integer.valueOf(i14));
                string7.getClass();
                return string7;
            default:
                u0.r();
                return null;
        }
    }

    public static final String j(int i14, int i15, Context context) {
        context.getClass();
        boolean z14 = am.j.z(f12.l.f68084a);
        String string = context.getString(z14 ? R.string.common_lbl_kilometers : R.string.common_lbl_miles);
        string.getClass();
        l3.f23124b.getClass();
        String strQ = l3.a.Q(context, i14, l3.f23131i, false, z14);
        x0 x0Var = x0.f105818a;
        String string2 = context.getString(R.string.annual_report_steps_fun_fact);
        string2.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{strQ, string, String.valueOf(i15)}, 3));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    public static JsonObject k(JsonObject jsonObject, String str) {
        JsonElement jsonElement;
        Object next;
        JsonElement jsonElement2;
        JsonElement jsonElement3 = jsonObject.get("shapes");
        Object obj = null;
        JsonArray jsonArray = jsonElement3 instanceof JsonArray ? (JsonArray) jsonElement3 : null;
        if (jsonArray != null) {
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement4 : jsonArray) {
                if (jsonElement4 instanceof JsonObject) {
                    arrayList.add(jsonElement4);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                jsonElement2 = ((JsonObject) next).get("ty");
            } while (!p005kotlin.jvm.internal.s.g(jsonElement2 != null ? jsonElement2.getAsString() : null, "gr"));
            JsonObject jsonObject2 = (JsonObject) next;
            if (jsonObject2 != null) {
                jsonElement = jsonObject2.get("it");
            } else {
                jsonElement = null;
            }
        } else {
            jsonElement = null;
        }
        JsonArray jsonArray2 = (JsonArray) jsonElement;
        if (jsonArray2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (JsonElement jsonElement5 : jsonArray2) {
            if (jsonElement5 instanceof JsonObject) {
                arrayList2.add(jsonElement5);
            }
        }
        for (Object obj2 : arrayList2) {
            JsonElement jsonElement6 = ((JsonObject) obj2).get("ty");
            if (p005kotlin.jvm.internal.s.g(jsonElement6 != null ? jsonElement6.getAsString() : null, str)) {
                obj = obj2;
                break;
            }
        }
        return (JsonObject) obj;
    }

    public static JsonArray l(JsonObject jsonObject) {
        JsonElement jsonElement;
        if (jsonObject == null || (jsonElement = jsonObject.get(JWKParameterNames.OCT_KEY_VALUE)) == null) {
            return null;
        }
        return jsonElement.getAsJsonArray();
    }

    public static final JsonObject m(JsonObject jsonObject, String str) {
        String asString;
        jsonObject.getClass();
        str.getClass();
        JsonElement jsonElement = jsonObject.get("layers");
        Object obj = null;
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : jsonArray) {
            if (jsonElement2 instanceof JsonObject) {
                arrayList.add(jsonElement2);
            }
        }
        for (Object obj2 : arrayList) {
            JsonElement jsonElement3 = ((JsonObject) obj2).get("nm");
            if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null && asString.equals(str)) {
                obj = obj2;
                break;
            }
        }
        return (JsonObject) obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    public static final float n(JsonObject jsonObject) {
        float asFloat;
        JsonElement jsonElement;
        JsonObject jsonObjectM = m(jsonObject, "Title_bg");
        if (jsonObjectM != null) {
            f140571a.getClass();
            JsonObject jsonObjectO = o(jsonObjectM);
            JsonElement jsonElement2 = jsonObjectO != null ? jsonObjectO.get(JWKParameterNames.RSA_EXPONENT) : null;
            JsonObject jsonObject2 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
            JsonElement jsonElement3 = jsonObject2 != null ? jsonObject2.get(JWKParameterNames.OCT_KEY_VALUE) : null;
            JsonArray jsonArray = jsonElement3 instanceof JsonArray ? (JsonArray) jsonElement3 : null;
            if (jsonArray != null) {
                Object objL0 = h0.l0(jsonArray);
                JsonObject jsonObject3 = objL0 instanceof JsonObject ? (JsonObject) objL0 : null;
                JsonElement jsonElement4 = jsonObject3 != null ? jsonObject3.get("s") : null;
                JsonArray jsonArray2 = jsonElement4 instanceof JsonArray ? (JsonArray) jsonElement4 : null;
                if (jsonArray2 == null || (jsonElement = (JsonElement) h0.l0(jsonArray2)) == null) {
                    asFloat = 100.0f;
                } else {
                    asFloat = jsonElement.getAsFloat();
                }
            } else {
                asFloat = 100.0f;
            }
        } else {
            asFloat = 100.0f;
        }
        return asFloat / 100.0f;
    }

    public static JsonObject o(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("shapes");
        Object obj = null;
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : jsonArray) {
            if (jsonElement2 instanceof JsonObject) {
                arrayList.add(jsonElement2);
            }
        }
        for (Object obj2 : arrayList) {
            JsonElement jsonElement3 = ((JsonObject) obj2).get("ty");
            if (p005kotlin.jvm.internal.s.g(jsonElement3 != null ? jsonElement3.getAsString() : null, "tm")) {
                obj = obj2;
                break;
            }
        }
        return (JsonObject) obj;
    }

    public static final String p(JsonObject jsonObject) {
        JsonObject jsonObjectQ = q(jsonObject);
        if (jsonObjectQ != null) {
            return jsonObjectQ.get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT).getAsString();
        }
        return null;
    }

    public static final JsonObject q(JsonObject jsonObject) {
        Object next;
        JsonElement jsonElement = null;
        JsonObject jsonObject2 = (JsonObject) (jsonObject != null ? jsonObject.get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT) : null);
        JsonObject jsonObject3 = (JsonObject) (jsonObject2 != null ? jsonObject2.get("d") : null);
        JsonArray jsonArray = (JsonArray) (jsonObject3 != null ? jsonObject3.get(JWKParameterNames.OCT_KEY_VALUE) : null);
        if (jsonArray != null) {
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement2 : jsonArray) {
                if (jsonElement2 instanceof JsonObject) {
                    arrayList.add(jsonElement2);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((JsonObject) next).get("s") instanceof JsonObject));
            JsonObject jsonObject4 = (JsonObject) next;
            if (jsonObject4 != null) {
                jsonElement = jsonObject4.get("s");
            }
        }
        return (JsonObject) jsonElement;
    }

    public static final Float r(JsonObject jsonObject) {
        JsonObject jsonObjectQ = q(jsonObject);
        if (jsonObjectQ != null) {
            return Float.valueOf(jsonObjectQ.get("lh").getAsFloat());
        }
        return null;
    }

    public static TextPaint s(JsonObject jsonObject, Typeface typeface) {
        Float fT = t(jsonObject);
        if (fT == null) {
            return null;
        }
        float fFloatValue = fT.floatValue();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(fFloatValue);
        return textPaint;
    }

    public static final Float t(JsonObject jsonObject) {
        JsonObject jsonObjectQ = q(jsonObject);
        if (jsonObjectQ != null) {
            return Float.valueOf(jsonObjectQ.get("s").getAsFloat());
        }
        return null;
    }

    public static JsonObject u(JsonObject jsonObject) {
        JsonElement jsonElement;
        if (jsonObject == null || (jsonElement = jsonObject.get("ks")) == null) {
            return null;
        }
        return jsonElement.getAsJsonObject();
    }

    public static void v(JsonObject jsonObject, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            f140571a.getClass();
            str.getClass();
            JsonObject jsonObjectM = m(jsonObject, str);
            if (jsonObjectM != null) {
                arrayList.add(jsonObjectM);
            }
        }
        JsonObject[] jsonObjectArr = (JsonObject[]) arrayList.toArray(new JsonObject[0]);
        w((JsonObject[]) Arrays.copyOf(jsonObjectArr, jsonObjectArr.length));
    }

    public static final void w(JsonObject... jsonObjectArr) {
        JsonElement jsonElement;
        JsonObject asJsonObject;
        for (JsonObject jsonObject : jsonObjectArr) {
            f140571a.getClass();
            JsonObject jsonObjectU = u(jsonObject);
            if (jsonObjectU != null && (jsonElement = jsonObjectU.get("o")) != null && (asJsonObject = jsonElement.getAsJsonObject()) != null) {
                asJsonObject.add(JWKParameterNames.OCT_KEY_VALUE, new JsonPrimitive((Number) 0));
            }
        }
    }

    public static final void x(JsonObject jsonObject, String str) {
        str.getClass();
        JsonObject jsonObjectQ = q(jsonObject);
        if (jsonObjectQ != null) {
            jsonObjectQ.addProperty(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, str);
        }
    }

    public static final void y(JsonObject jsonObject, String str, String str2) {
        jsonObject.getClass();
        str.getClass();
        str2.getClass();
        x(m(jsonObject, str), str2);
    }

    public static final void z(JsonObject jsonObject, String str, String str2, Typeface typeface) {
        jsonObject.getClass();
        str2.getClass();
        x(m(jsonObject, str), str2);
        JsonObject jsonObjectM = m(jsonObject, str);
        Float fT = t(jsonObjectM);
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface);
        if (fT != null) {
            textPaint.setTextSize(fT.floatValue());
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        int iHeight = rect.height();
        Float fR = r(jsonObjectM);
        float fFloatValue = fR != null ? fR.floatValue() : 0.0f;
        JsonObject jsonObjectQ = q(jsonObjectM);
        if (jsonObjectQ != null ? jsonObjectQ.has("ps") : false) {
            JsonElement jsonElement = jsonObjectM != null ? jsonObjectM.get("ks") : null;
            JsonObject jsonObject2 = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
            JsonElement jsonElement2 = jsonObject2 != null ? jsonObject2.get("p") : null;
            JsonObject jsonObject3 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
            if (jsonObject3 != null) {
                JsonArray asJsonArray = jsonObject3.getAsJsonArray(JWKParameterNames.OCT_KEY_VALUE);
                if (asJsonArray.size() <= 0) {
                    return;
                }
                float f14 = fFloatValue - iHeight;
                if (!asJsonArray.get(0).isJsonObject()) {
                    JsonArray jsonArray = new JsonArray();
                    jsonArray.add(Float.valueOf(asJsonArray.get(0).getAsFloat()));
                    jsonArray.add(Float.valueOf(asJsonArray.get(1).getAsFloat() - f14));
                    jsonArray.add(Float.valueOf(asJsonArray.get(2).getAsFloat()));
                    jsonObject3.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray);
                    return;
                }
                for (JsonElement jsonElement3 : asJsonArray) {
                    JsonArray asJsonArray2 = jsonElement3.getAsJsonObject().getAsJsonArray("s");
                    JsonArray jsonArray2 = new JsonArray();
                    jsonArray2.add(Float.valueOf(asJsonArray2.get(0).getAsFloat()));
                    jsonArray2.add(Float.valueOf(asJsonArray2.get(1).getAsFloat() - f14));
                    jsonArray2.add(Float.valueOf(asJsonArray2.get(2).getAsFloat()));
                    jsonElement3.getAsJsonObject().add("s", jsonArray2);
                }
            }
        }
    }
}

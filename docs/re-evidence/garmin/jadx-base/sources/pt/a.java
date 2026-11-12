package pt;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt/a;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f140560a = new a();

    private a() {
    }

    public static void a(JsonObject jsonObject, String str, String str2, Typeface typeface) {
        JsonObject jsonObjectM = i.m(jsonObject, "Top_Activities_Title");
        JsonObject jsonObjectM2 = i.m(jsonObject, str);
        Float fT = i.t(jsonObjectM);
        Float fR = i.r(jsonObjectM);
        float fFloatValue = fR != null ? fR.floatValue() : 0.0f;
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface);
        if (fT != null) {
            textPaint.setTextSize(fT.floatValue());
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint, (int) 330.0f).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        staticLayoutBuild.getClass();
        int lineCount = staticLayoutBuild.getLineCount();
        JsonElement jsonElement = jsonObjectM2 != null ? jsonObjectM2.get("ks") : null;
        JsonObject jsonObject2 = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        JsonElement jsonElement2 = jsonObject2 != null ? jsonObject2.get("p") : null;
        JsonObject jsonObject3 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
        if (jsonObject3 != null) {
            JsonArray asJsonArray = jsonObject3.getAsJsonArray(JWKParameterNames.OCT_KEY_VALUE);
            if (asJsonArray.size() <= 1) {
                return;
            }
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(Float.valueOf(asJsonArray.get(0).getAsFloat()));
            jsonArray.add(Float.valueOf(((lineCount - 1) * fFloatValue) + asJsonArray.get(1).getAsFloat()));
            if (asJsonArray.size() > 2) {
                jsonArray.add(Float.valueOf(asJsonArray.get(2).getAsFloat()));
            }
            jsonObject3.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray);
        }
    }
}

package pt;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import ds.e0;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.y;
import uu.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt/h;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f140570a = new h();

    private h() {
    }

    public static String a(DateTime dateTime) {
        j0.f23099a.getClass();
        return j0.k(dateTime, 'M');
    }

    public static String b(Number number, Context context) {
        context.getClass();
        number.getClass();
        boolean z14 = am.j.z(f12.l.f68084a);
        l3.a aVar = l3.f23124b;
        double dDoubleValue = number.doubleValue();
        DecimalFormat decimalFormat = l3.f23126d;
        aVar.getClass();
        return l3.a.Q(context, dDoubleValue, decimalFormat, true, z14);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005f  */
    public static String c(int i14, Context context) {
        String strConcat;
        context.getClass();
        Context context2 = new b(context).f140561a;
        String string = context2.getString(R.string.sleep_my_day_hour_unit);
        String strD = p6.b.d(context2, R.string.sleep_my_day_minute_unit, string);
        if (i14 != 0) {
            double d14 = i14;
            if (d14 < 60.0d) {
                strConcat = "0".concat(strD);
            } else if (d14 < 3600.0d) {
                l3.f23124b.getClass();
                strConcat = androidx.core.view.j.f((int) (d14 / 60.0d), strD);
            } else {
                long j8 = i14;
                l3.f23124b.getClass();
                strConcat = (((int) j8) / DateTimeConstants.SECONDS_PER_HOUR) + string + StringUtils.SPACE + l3.a.L1(j8) + strD;
            }
        } else {
            strConcat = "0".concat(strD);
        }
        String lowerCase = strConcat.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static String d(Context context, double d14) {
        context.getClass();
        boolean z14 = am.j.z(f12.l.f68084a);
        l3.f23124b.getClass();
        return l3.a.c0(context, d14, z14, true, false);
    }

    public static String e(Context context, JsonObject jsonObject, String str, String str2, Typeface typeface) {
        context.getClass();
        str.getClass();
        Float fT = i.t(i.m(jsonObject, "Text_Date"));
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface);
        if (fT != null) {
            textPaint.setTextSize(fT.floatValue());
        }
        x0 x0Var = x0.f105818a;
        String string = context.getString(R.string.string_space_dot_space_string_pattern);
        string.getClass();
        String str3 = String.format(string, Arrays.copyOf(new Object[]{str, str2}, 2));
        float fMeasureText = textPaint.measureText(str3);
        float fMeasureText2 = textPaint.measureText(str);
        float f14 = 230.0f - (fMeasureText - fMeasureText2);
        if (fMeasureText2 <= f14) {
            return TextUtils.ellipsize(str3, textPaint, 230.0f, TextUtils.TruncateAt.END).toString();
        }
        String string2 = TextUtils.ellipsize(str, textPaint, f14, TextUtils.TruncateAt.END).toString();
        String string3 = context.getString(R.string.string_space_dot_space_string_pattern);
        string3.getClass();
        return String.format(string3, Arrays.copyOf(new Object[]{string2, str2}, 2));
    }

    public static ArrayList f(tt.a aVar) {
        aVar.getClass();
        List<String> listC = aVar.c();
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(i0.b(0, (String) it.next()));
        }
        return arrayList;
    }

    public static v g(String str, float f14, TextPaint textPaint) {
        str.getClass();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, (int) f14).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        staticLayoutBuild.getClass();
        int lineCount = staticLayoutBuild.getLineCount();
        if (lineCount > 1) {
            String strG = "";
            for (int i14 = 0; i14 < lineCount; i14++) {
                strG = e5.g(strG, str.substring(staticLayoutBuild.getLineStart(i14), staticLayoutBuild.getLineEnd(i14)), "\n");
            }
            str = strG;
        }
        return new v(str, lineCount);
    }

    public static float h(TextPaint textPaint, String str) {
        Iterator it = w.W(str, new String[]{"\n"}).iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return 0.0f;
        }
        float fMeasureText = textPaint.measureText((String) it.next());
        while (it.hasNext()) {
            fMeasureText = Math.max(fMeasureText, textPaint.measureText((String) it.next()));
        }
        return fMeasureText;
    }

    public static final void i(Context context, JsonObject jsonObject, String str, String str2, float f14, float f15) {
        JsonElement jsonElement;
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        JsonObject asJsonObject2;
        JsonElement jsonElement3;
        e0.p(context, str, str2);
        i.f140571a.getClass();
        JsonObject jsonObjectM = i.m(jsonObject, "Data_Main");
        JsonObject jsonObjectM2 = i.m(jsonObject, "Unit");
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(oe2.f.Q(context));
        Float fT = i.t(jsonObjectM);
        if (fT != null) {
            textPaint.setTextSize(fT.floatValue());
        }
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTypeface(oe2.f.S(context));
        Float fT2 = i.t(jsonObjectM2);
        if (fT2 != null) {
            textPaint2.setTextSize(fT2.floatValue());
        }
        String strP = i.p(jsonObjectM);
        if (strP == null) {
            strP = "";
        }
        f140570a.getClass();
        float fH = h(textPaint, strP);
        float fH2 = h(textPaint, str);
        float fH3 = h(textPaint2, str2);
        float asFloat = 0.0f;
        if (!g22.n.d(str2)) {
            f15 = 0.0f;
        }
        float f16 = fH2 + f15 + fH3;
        if (f16 > f14) {
            float f17 = f14 / f16;
            textPaint.setTextSize(textPaint.getTextSize() * f17);
            i.e(jsonObject, "Data_Main", textPaint.getTextSize());
            textPaint2.setTextSize(textPaint2.getTextSize() * f17);
            i.e(jsonObject, "Unit", textPaint2.getTextSize());
        }
        float fH4 = h(textPaint, str);
        if (jsonObjectM2 != null && (jsonElement = jsonObjectM2.get("ks")) != null && (asJsonObject = jsonElement.getAsJsonObject()) != null && (jsonElement2 = asJsonObject.get("p")) != null && (asJsonObject2 = jsonElement2.getAsJsonObject()) != null) {
            JsonElement jsonElement4 = asJsonObject2.get(JWKParameterNames.OCT_KEY_VALUE);
            JsonArray asJsonArray = jsonElement4 != null ? jsonElement4.getAsJsonArray() : null;
            if (asJsonArray != null && (jsonElement3 = asJsonArray.get(0)) != null) {
                asFloat = jsonElement3.getAsFloat();
            }
            float f18 = (fH4 - fH) + asFloat;
            if (asJsonArray != null) {
                asJsonArray.set(0, new JsonPrimitive(Float.valueOf(f18)));
            }
            asJsonObject2.add(JWKParameterNames.OCT_KEY_VALUE, asJsonArray);
        }
        i.y(jsonObject, "Data_Main", str);
        i.y(jsonObject, "Unit", str2);
    }

    public static final void j(Context context, JsonObject jsonObject, String str, float f14) {
        context.getClass();
        Float fT = i.t(i.m(jsonObject, "Data_Main"));
        Typeface typefaceQ = oe2.f.Q(context);
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typefaceQ);
        if (fT != null) {
            textPaint.setTextSize(fT.floatValue());
        }
        float fMeasureText = textPaint.measureText(str);
        if (fMeasureText > f14) {
            i.e(jsonObject, "Data_Main", (f14 / fMeasureText) * textPaint.getTextSize());
        }
        i.y(jsonObject, "Data_Main", str);
    }

    public static void k(Context context, JsonObject jsonObject, String str, String str2, String... strArr) {
        TextPaint textPaintS;
        Float fR;
        str.getClass();
        i.f140571a.getClass();
        JsonObject jsonObjectM = i.m(jsonObject, str2);
        if (jsonObjectM == null || (textPaintS = i.s(jsonObjectM, oe2.f.Q(context))) == null || (fR = i.r(jsonObjectM)) == null) {
            return;
        }
        float fFloatValue = fR.floatValue();
        v vVarG = g(str, 300.0f, textPaintS);
        int i14 = vVarG.f140607b - 2;
        if (i14 > 0) {
            float f14 = (-fFloatValue) * i14;
            for (String str3 : p13.u.i0(strArr)) {
                i.f140571a.getClass();
                i.A(jsonObject, str3, f14);
            }
        }
        i.z(jsonObject, str2, vVarG.f140606a, oe2.f.Q(context));
    }
}

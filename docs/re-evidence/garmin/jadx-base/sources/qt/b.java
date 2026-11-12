package qt;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqt/b;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f147432a = new b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147433a;

        static {
            int[] iArr = new int[q91.d.values().length];
            try {
                iArr[q91.d.f143561h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.d.f143562i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q91.d.f143563j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q91.d.f143564k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q91.d.f143566l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q91.d.f143567m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q91.d.f143568n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q91.d.f143569o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q91.d.f143570p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q91.d.f143571q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q91.d.f143572r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q91.d.f143573t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q91.d.f143574v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[q91.d.f143575w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[q91.d.f143576x.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[q91.d.f143577y.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[q91.d.f143578z.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[q91.d.A.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[q91.d.B.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[q91.d.C.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[q91.d.D.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[q91.d.E.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[q91.d.F.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[q91.d.I.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[q91.d.P.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[q91.d.T.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[q91.d.X.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[q91.d.Y.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[q91.d.Z.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[q91.d.f143565k0.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[q91.d.H0.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[q91.d.U0.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[q91.d.V0.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[q91.d.W0.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[q91.d.X0.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[q91.d.Y0.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[q91.d.Z0.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[q91.d.f143555a1.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[q91.d.I0.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[q91.d.J0.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[q91.d.K0.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[q91.d.L0.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[q91.d.M0.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[q91.d.N0.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[q91.d.O0.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[q91.d.P0.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[q91.d.Q0.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[q91.d.R0.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[q91.d.S0.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[q91.d.T0.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            f147433a = iArr;
        }
    }

    private b() {
    }

    public static String a(int i14, String str) {
        x0 x0Var = x0.f105818a;
        return String.format(null, str, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
    }

    public static void b(JsonObject jsonObject, String str, String str2, String str3, String str4, Typeface typeface, Typeface typeface2, float f14, Float f15) {
        str3.getClass();
        str4.getClass();
        JsonObject jsonObjectM = pt.i.m(jsonObject, str);
        JsonObject jsonObjectM2 = pt.i.m(jsonObject, str2);
        if (f15 == null) {
            f15 = pt.i.t(jsonObjectM);
        }
        Float fT = pt.i.t(jsonObjectM2);
        String strP = pt.i.p(jsonObjectM);
        if (strP == null) {
            strP = "";
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface);
        if (f15 != null) {
            textPaint.setTextSize(f15.floatValue());
        }
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTypeface(typeface2);
        if (fT != null) {
            textPaint2.setTextSize(fT.floatValue());
        }
        float fMeasureText = textPaint.measureText(strP);
        float fMeasureText2 = textPaint.measureText(str3);
        float fMeasureText3 = textPaint2.measureText(str4);
        float f16 = fMeasureText2 - fMeasureText;
        float f17 = f14 - f16;
        if (fMeasureText3 > f17) {
            float textSize = (f17 / fMeasureText3) * textPaint2.getTextSize();
            StringBuilder sb3 = new StringBuilder("setupDataAndUnitWithTextSizeChange, maxUnitWidth = ");
            sb3.append(f14);
            sb3.append(",  unitText = ");
            sb3.append(str4);
            sb3.append(", unitTextWidth = ");
            l2.n(sb3, fMeasureText3, ", maxUnitTextWidth = ", f17, ", changeTextSize = ");
            sb3.append(textSize);
            String string = sb3.toString();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AchievementUtils", string);
            if (textSize > 0.0f) {
                pt.i.e(jsonObject, str2, textSize);
            }
        }
        pt.i.y(jsonObject, str, str3);
        pt.i.y(jsonObject, str2, str4);
        JsonElement jsonElement = jsonObjectM2 != null ? jsonObjectM2.get("ks") : null;
        JsonObject jsonObject2 = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        JsonElement jsonElement2 = jsonObject2 != null ? jsonObject2.get("p") : null;
        JsonObject jsonObject3 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
        if (jsonObject3 != null) {
            JsonArray asJsonArray = jsonObject3.getAsJsonArray(JWKParameterNames.OCT_KEY_VALUE);
            if (asJsonArray.size() <= 0) {
                return;
            }
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(Float.valueOf(asJsonArray.get(0).getAsFloat() + f16));
            jsonArray.add(Float.valueOf(asJsonArray.get(1).getAsFloat()));
            if (asJsonArray.size() > 2) {
                jsonArray.add(Float.valueOf(asJsonArray.get(2).getAsFloat()));
            }
            jsonObject3.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray);
        }
    }
}

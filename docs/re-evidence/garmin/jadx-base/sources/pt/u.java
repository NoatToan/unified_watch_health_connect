package pt;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.text.DateFormatSymbols;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.u0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt/u;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f140605a = new u();

    private u() {
    }

    public static Map a() {
        String[] months = new DateFormatSymbols().getMonths();
        months.getClass();
        List listI0 = p13.u.i0(months);
        return u0.e(new o13.p("01", ""), new o13.p("02", listI0.get(0)), new o13.p("03", listI0.get(1)), new o13.p("04", listI0.get(2)), new o13.p("05", listI0.get(3)), new o13.p("06", listI0.get(4)), new o13.p("07", listI0.get(5)), new o13.p("08", listI0.get(6)), new o13.p("09", listI0.get(7)), new o13.p("10", listI0.get(8)), new o13.p("11", listI0.get(9)), new o13.p("12", listI0.get(10)), new o13.p("13", listI0.get(11)), new o13.p("14", ""));
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.Float] */
    public static void b(LottieDrawable lottieDrawable, List list) {
        String str = (String) h0.b1(a().keySet()).get(list.indexOf(h0.N0(list, new t()).get(0)) + 1);
        String str2 = (String) h0.b1(a().values()).get(list.indexOf(h0.N0(list, new t()).get(0)) + 1);
        r0 r0Var = new r0();
        r0Var.f105810a = Float.valueOf(0.0f);
        KeyPath keyPath = new KeyPath(str);
        PointF pointF = LottieProperty.TRANSFORM_POSITION;
        lottieDrawable.addValueCallback(keyPath, pointF, new o(r0Var, new PointF()));
        lottieDrawable.addValueCallback(new KeyPath("Highlight"), pointF, new p(r0Var, new PointF()));
        lottieDrawable.addValueCallback(new KeyPath("Month"), pointF, new q(r0Var, new PointF()));
        lottieDrawable.addValueCallback(new KeyPath("Highlight_count_value"), pointF, new r(r0Var, new PointF()));
        i.f140571a.getClass();
        i.d(lottieDrawable, "Month", str2);
    }

    public static void c(List list, JsonObject jsonObject) {
        int i14;
        Object next;
        int i15 = 0;
        String str = (String) h0.b1(a().keySet()).get(list.indexOf(h0.N0(list, new t()).get(0)) + 1);
        int i16 = 0;
        for (Object obj : h0.b1(a().keySet())) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            String str2 = (String) obj;
            if (p005kotlin.jvm.internal.s.g(str2, str)) {
                i14 = i15;
            } else {
                Iterator it = h0.Z(list).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        double dDoubleValue = ((Number) next).doubleValue();
                        while (true) {
                            Object next2 = it.next();
                            i14 = i15;
                            double dDoubleValue2 = ((Number) next2).doubleValue();
                            if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                                dDoubleValue = dDoubleValue2;
                                next = next2;
                            }
                            if (!it.hasNext()) {
                                break;
                            } else {
                                i15 = i14;
                            }
                        }
                    } else {
                        i14 = i15;
                    }
                } else {
                    i14 = i15;
                    next = null;
                }
                Number numberValueOf = (Number) next;
                if (numberValueOf == null) {
                    numberValueOf = Double.valueOf(0.0d);
                }
                int iIndexOf = list.indexOf(numberValueOf);
                if (i16 != iIndexOf && i16 != iIndexOf + 1 && i16 != iIndexOf + 2) {
                    if (i16 > iIndexOf) {
                        i16 -= 2;
                    }
                    Number numberValueOf2 = (Number) list.get(i16);
                    if (numberValueOf2 == null) {
                        numberValueOf2 = Integer.valueOf(i14);
                    }
                    int i18 = numberValueOf2.intValue() == 0 ? 1 : i14;
                    double dDoubleValue3 = ((numberValueOf2.doubleValue() / numberValueOf.doubleValue()) * 99.9d) + 0.1d;
                    JsonObject jsonObjectM = i.m(jsonObject, str2);
                    if (jsonObjectM != null) {
                        i iVar = i.f140571a;
                        iVar.getClass();
                        JsonObject jsonObjectO = i.o(jsonObjectM);
                        if (jsonObjectO != null) {
                            float f14 = (float) dDoubleValue3;
                            JsonElement jsonElement = jsonObjectO.get(JWKParameterNames.RSA_EXPONENT);
                            JsonObject jsonObject2 = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
                            if (jsonObject2 != null) {
                                jsonObject2.addProperty(JWKParameterNames.OCT_KEY_VALUE, Float.valueOf(f14));
                            }
                            if (i18 != 0) {
                                i.a aVar = i.a.SQUARE;
                                iVar.getClass();
                                aVar.getClass();
                                JsonObject jsonObjectM2 = i.m(jsonObject, str2);
                                if (jsonObjectM2 != null) {
                                    iVar.getClass();
                                    JsonObject jsonObjectK = i.k(jsonObjectM2, "st");
                                    if (jsonObjectK != null) {
                                        jsonObjectK.addProperty("lc", Integer.valueOf(aVar.f140574a));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i16 = i17;
            i15 = i14;
        }
    }
}

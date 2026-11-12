package ot;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.p0;
import p13.t0;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lot/d;", "Lot/l;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/d;", "activityElevationData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/d;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends l implements bu.g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f133577w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tt.d f133578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f133579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f133580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f133581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o13.t f133582v;

    static {
        new a(null);
        f133577w = d.class.getSimpleName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, tt.d dVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133578r = dVar;
        this.f133579s = "ActivityAscentChapter";
        this.f133580t = new ArrayList();
        this.f133582v = o13.m.b(new o72.f(context, 22));
    }

    public static void r(d dVar, Context context, JsonObject jsonObject, float f14, int i14) {
        Double totalElevationGain;
        if ((i14 & 4) != 0) {
            f14 = 0.0f;
        }
        float f15 = (i14 & 8) != 0 ? 322.0f - f14 : 230.0f;
        tt.d dVar2 = dVar.f133578r;
        if (dVar2 == null || (totalElevationGain = dVar2.getTotalElevationGain()) == null) {
            return;
        }
        double dDoubleValue = totalElevationGain.doubleValue();
        pt.h.f140570a.getClass();
        pt.h.j(context, jsonObject, pt.h.d(context, dDoubleValue), f15);
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133587s() {
        return this.f133579s;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/activity_ascent";
    }

    /* JADX WARN: Code duplicated, block: B:154:0x044b A[PHI: r3 r5 r13 r14
      0x044b: PHI (r3v6 java.lang.Integer) = 
      (r3v4 java.lang.Integer)
      (r3v4 java.lang.Integer)
      (r3v4 java.lang.Integer)
      (r3v4 java.lang.Integer)
      (r3v4 java.lang.Integer)
      (r3v4 java.lang.Integer)
      (r3v4 java.lang.Integer)
      (r3v4 java.lang.Integer)
      (r3v43 java.lang.Integer)
     binds: [B:88:0x02a0, B:90:0x02ac, B:95:0x02bd, B:105:0x02ed, B:107:0x02f3, B:112:0x0302, B:114:0x0308, B:119:0x0313, B:288:0x044b] A[DONT_GENERATE, DONT_INLINE]
      0x044b: PHI (r5v1 java.util.ArrayList) = 
      (r5v0 java.util.ArrayList)
      (r5v0 java.util.ArrayList)
      (r5v0 java.util.ArrayList)
      (r5v0 java.util.ArrayList)
      (r5v0 java.util.ArrayList)
      (r5v0 java.util.ArrayList)
      (r5v0 java.util.ArrayList)
      (r5v0 java.util.ArrayList)
      (r5v8 java.util.ArrayList)
     binds: [B:88:0x02a0, B:90:0x02ac, B:95:0x02bd, B:105:0x02ed, B:107:0x02f3, B:112:0x0302, B:114:0x0308, B:119:0x0313, B:288:0x044b] A[DONT_GENERATE, DONT_INLINE]
      0x044b: PHI (r13v2 java.lang.String) = 
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v1 java.lang.String)
      (r13v35 java.lang.String)
     binds: [B:88:0x02a0, B:90:0x02ac, B:95:0x02bd, B:105:0x02ed, B:107:0x02f3, B:112:0x0302, B:114:0x0308, B:119:0x0313, B:288:0x044b] A[DONT_GENERATE, DONT_INLINE]
      0x044b: PHI (r14v1 java.lang.String) = 
      (r14v0 java.lang.String)
      (r14v0 java.lang.String)
      (r14v0 java.lang.String)
      (r14v0 java.lang.String)
      (r14v0 java.lang.String)
      (r14v0 java.lang.String)
      (r14v0 java.lang.String)
      (r14v0 java.lang.String)
      (r14v12 java.lang.String)
     binds: [B:88:0x02a0, B:90:0x02ac, B:95:0x02bd, B:105:0x02ed, B:107:0x02f3, B:112:0x0302, B:114:0x0308, B:119:0x0313, B:288:0x044b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        ArrayList arrayList;
        JsonObject jsonObject;
        String str;
        boolean z14;
        Integer num;
        ArrayList arrayList2;
        JsonObject asJsonObject;
        JsonElement next;
        JsonObject asJsonObject2;
        JsonElement jsonElement;
        Object next2;
        JsonObject asJsonObject3;
        int i15;
        Integer num2;
        JsonObject asJsonObject4;
        JsonElement next3;
        JsonObject asJsonObject5;
        JsonElement jsonElement2;
        JsonObject asJsonObject6;
        List<Double> listD;
        tt.e maxElevationActivity;
        tt.e maxElevationActivity2;
        tt.d dVar = this.f133578r;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listA = (dVar == null || (maxElevationActivity2 = dVar.getMaxElevationActivity()) == null) ? null : maxElevationActivity2.a();
        if (listA != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                List<Double> listC = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it.next()).C();
                listC.getClass();
                Double d14 = (Double) h0.d0(listC);
                if (d14 != null) {
                    arrayList3.add(d14);
                }
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList3) {
                if (zf.b.D(Double.valueOf(((Number) obj).doubleValue()))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = this.f133580t;
        if (arrayList != null) {
            arrayList4.clear();
            arrayList4.addAll(arrayList);
        }
        JsonObject jsonObjectC = c(d(context), pVar, pVar2, i14);
        b(context);
        String string = context.getString(R.string.lbl_activity_ascent);
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        pt.i.g(context, jsonObjectC, "Text_Topic", upperCase);
        pt.i iVar = pt.i.f140571a;
        float f14 = this.f133656j;
        String string2 = context.getString(R.string.lbl_activity_ascent);
        string2.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        pt.i.b(iVar, context, jsonObjectC, f14, upperCase2);
        String string3 = context.getString(R.string.annual_report_activity_ascent_intro_text);
        string3.getClass();
        pt.i.z(jsonObjectC, "intro_layer_name", string3, oe2.f.O(context));
        pt.i.f(jsonObjectC, this.f133656j);
        if ((dVar != null ? dVar.getFunFactCount() : null) != null && dVar.getFunFact() != null) {
            pt.i.z(jsonObjectC, "funfact_layer_name", pt.i.i(context, dVar.getFunFactCount().intValue(), dVar.getFunFact()), oe2.f.T(context));
        }
        r(this, context, jsonObjectC, this.f133656j, 8);
        pt.h hVar = pt.h.f140570a;
        o13.t tVar = this.f133582v;
        hVar.getClass();
        pt.h.k(context, jsonObjectC, (String) tVar.getValue(), "Ascent_Chart_Title_1", "Ascent_Chart", "Data_Sub", "Text_Date");
        if (((dVar == null || (maxElevationActivity = dVar.getMaxElevationActivity()) == null) ? null : maxElevationActivity.getElevationGain()) == null || dVar.getMaxElevationActivity().getName() == null || dVar.getMaxElevationActivity().getStartTimeLocal() == null) {
            JsonObject jsonObjectM = pt.i.m(jsonObjectC, "Data_Sub");
            if (jsonObjectM != null) {
                pt.i.w(jsonObjectM);
            }
            JsonObject jsonObjectM2 = pt.i.m(jsonObjectC, "Data_Sub_2");
            if (jsonObjectM2 != null) {
                pt.i.w(jsonObjectM2);
            }
            JsonObject jsonObjectM3 = pt.i.m(jsonObjectC, "Text_Date");
            if (jsonObjectM3 != null) {
                pt.i.w(jsonObjectM3);
            }
            JsonObject jsonObjectM4 = pt.i.m(jsonObjectC, "Text_Date_2");
            if (jsonObjectM4 != null) {
                pt.i.w(jsonObjectM4);
            }
        } else {
            String strD = pt.h.d(context, dVar.getMaxElevationActivity().getElevationGain().doubleValue());
            pt.i.y(jsonObjectC, "Data_Sub", strD);
            pt.i.y(jsonObjectC, "Data_Sub_2", strD);
            String name = dVar.getMaxElevationActivity().getName();
            String strA = pt.h.a(dVar.getMaxElevationActivity().getStartTimeLocal());
            x0 x0Var = x0.f105818a;
            String string4 = context.getString(R.string.string_space_dot_space_string_pattern);
            string4.getClass();
            String str2 = String.format(string4, Arrays.copyOf(new Object[]{name, strA}, 2));
            pt.i.z(jsonObjectC, "Text_Date", str2, oe2.f.T(context));
            pt.i.z(jsonObjectC, "Text_Date_2", str2, oe2.f.T(context));
        }
        pt.h.k(context, jsonObjectC, (String) tVar.getValue(), "Ascent_Chart_Title_2", "Data_Sub_2", "Text_Date_2");
        pt.n nVar = pt.n.f140581a;
        String string5 = context.getString(R.string.annual_report_activity_ascent_month_chart_title);
        string5.getClass();
        Typeface typefaceS = oe2.f.S(context);
        nVar.getClass();
        pt.n.e(jsonObjectC, string5, typefaceS);
        if (dVar != null && (listD = dVar.d()) != null) {
            pt.n.d(context, jsonObjectC, listD, new a51.m(context, 29));
            pt.n.b(listD, jsonObjectC);
        }
        pt.n.a(jsonObjectC, oe2.f.T(context));
        String strF = e0.f(arrayList4.size(), "setupAscentChart point size = ", StringUtils.SPACE);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, f133577w, strF);
        pt.c.f140562a.getClass();
        Integer num3 = 0;
        arrayList4.getClass();
        JsonElement jsonElement3 = jsonObjectC.get("layers");
        JsonArray jsonArray = jsonElement3 instanceof JsonArray ? (JsonArray) jsonElement3 : null;
        if (jsonArray != null) {
            ArrayList arrayList5 = new ArrayList();
            for (JsonElement jsonElement4 : jsonArray) {
                if (jsonElement4 instanceof JsonObject) {
                    arrayList5.add(jsonElement4);
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    jsonObject = jsonObjectC;
                    str = null;
                    break;
                }
                JsonObject jsonObject2 = (JsonObject) it3.next();
                JsonElement jsonElement5 = jsonObject2.get("nm");
                if (p005kotlin.jvm.internal.s.g(jsonElement5 != null ? jsonElement5.getAsString() : null, "Ascent_Chart")) {
                    int size = arrayList4.size();
                    JsonElement jsonElement6 = jsonObject2.get("shapes");
                    JsonArray jsonArray2 = jsonElement6 instanceof JsonArray ? (JsonArray) jsonElement6 : null;
                    String str3 = "s";
                    String str4 = JWKParameterNames.OCT_KEY_VALUE;
                    str = null;
                    jsonObject = jsonObjectC;
                    double d15 = 0.0d;
                    if (jsonArray2 != null && (asJsonObject4 = ((JsonElement) h0.a0(jsonArray2)).getAsJsonObject()) != null) {
                        JsonElement jsonElement7 = asJsonObject4.get("it");
                        JsonArray jsonArray3 = jsonElement7 instanceof JsonArray ? (JsonArray) jsonElement7 : null;
                        if (jsonArray3 == null) {
                            num = num3;
                            arrayList2 = arrayList4;
                            break;
                        }
                        Iterator<JsonElement> it4 = jsonArray3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it4.next();
                            Iterator<JsonElement> it5 = it4;
                            if (p005kotlin.jvm.internal.s.g(next3.getAsJsonObject().get("ty").getAsString(), "sh")) {
                                break;
                            }
                            it4 = it5;
                        }
                        JsonElement jsonElement8 = next3;
                        if (jsonElement8 != null && (asJsonObject5 = jsonElement8.getAsJsonObject()) != null) {
                            JsonElement jsonElement9 = asJsonObject5.get("ks");
                            JsonObject jsonObject3 = jsonElement9 instanceof JsonObject ? (JsonObject) jsonElement9 : null;
                            if (jsonObject3 == null || (jsonElement2 = jsonObject3.get(JWKParameterNames.OCT_KEY_VALUE)) == null) {
                                num = num3;
                                arrayList2 = arrayList4;
                                break;
                            }
                            JsonArray jsonArray4 = jsonElement2 instanceof JsonArray ? (JsonArray) jsonElement2 : null;
                            if (jsonArray4 == null) {
                                num = num3;
                                arrayList2 = arrayList4;
                                break;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            Iterator<JsonElement> it6 = jsonArray4.iterator();
                            while (it6.hasNext()) {
                                Iterator<JsonElement> it7 = it6;
                                JsonElement next4 = it7.next();
                                if (next4 instanceof JsonObject) {
                                    arrayList6.add(next4);
                                }
                                it6 = it7;
                            }
                            Iterator it8 = arrayList6.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    num = num3;
                                    arrayList2 = arrayList4;
                                    break;
                                }
                                JsonElement jsonElement10 = ((JsonObject) it8.next()).get(str3);
                                JsonArray jsonArray5 = jsonElement10 instanceof JsonArray ? (JsonArray) jsonElement10 : null;
                                if (jsonArray5 == null || (asJsonObject6 = ((JsonElement) h0.a0(jsonArray5)).getAsJsonObject()) == null) {
                                    arrayList2 = arrayList4;
                                } else {
                                    int i16 = size + 2;
                                    JsonArray asJsonArray = asJsonObject6.get("v").getAsJsonArray();
                                    arrayList2 = arrayList4;
                                    if (i16 == asJsonArray.size()) {
                                        num = num3;
                                        break;
                                    }
                                    double asDouble = (asJsonArray.get(0).getAsJsonArray().get(0).getAsDouble() - asJsonArray.get(1).getAsJsonArray().get(0).getAsDouble()) / ((double) (size - 1));
                                    JsonArray jsonArray6 = new JsonArray();
                                    JsonArray jsonArray7 = new JsonArray();
                                    JsonArray jsonArray8 = new JsonArray();
                                    jsonArray7.add(num3);
                                    jsonArray7.add(num3);
                                    Iterator<Integer> it9 = j23.t.o(0, i16).iterator();
                                    double asDouble2 = 0.0d;
                                    double asDouble3 = 0.0d;
                                    while (((j23.k) it9).f96801c) {
                                        int iNextInt = ((p0) it9).nextInt();
                                        jsonArray6.add(jsonArray7);
                                        Iterator<Integer> it10 = it9;
                                        if (iNextInt < 2) {
                                            jsonArray8.add(asJsonArray.get(iNextInt).getAsJsonArray());
                                        } else if (iNextInt == 2) {
                                            JsonArray asJsonArray2 = asJsonArray.get(iNextInt).getAsJsonArray();
                                            jsonArray8.add(asJsonArray2);
                                            asDouble2 = asJsonArray2.get(0).getAsDouble();
                                            asDouble3 = asJsonArray2.get(1).getAsDouble();
                                        } else {
                                            JsonArray jsonArray9 = new JsonArray();
                                            asDouble2 += asDouble;
                                            jsonArray9.add(Double.valueOf(asDouble2));
                                            jsonArray9.add(Double.valueOf(asDouble3));
                                            jsonArray8.add(jsonArray9);
                                        }
                                        it9 = it10;
                                    }
                                    asJsonObject6.add(IntegerTokenConverter.CONVERTER_KEY, jsonArray6);
                                    asJsonObject6.add("o", jsonArray6);
                                    asJsonObject6.add("v", jsonArray8);
                                }
                                arrayList4 = arrayList2;
                                it8 = it8;
                                str4 = str4;
                                str3 = str3;
                                num3 = num3;
                            }
                        } else {
                            num = num3;
                            arrayList2 = arrayList4;
                            break;
                        }
                    } else {
                        num = num3;
                        arrayList2 = arrayList4;
                        break;
                    }
                    String str5 = str3;
                    String str6 = str4;
                    JsonElement jsonElement11 = jsonObject2.get("shapes");
                    JsonArray jsonArray10 = jsonElement11 instanceof JsonArray ? (JsonArray) jsonElement11 : null;
                    if (jsonArray10 == null || (asJsonObject = ((JsonElement) h0.a0(jsonArray10)).getAsJsonObject()) == null) {
                        break;
                    }
                    JsonElement jsonElement12 = asJsonObject.get("it");
                    JsonArray jsonArray11 = jsonElement12 instanceof JsonArray ? (JsonArray) jsonElement12 : null;
                    if (jsonArray11 != null) {
                        Iterator<JsonElement> it11 = jsonArray11.iterator();
                        do {
                            if (!it11.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it11.next();
                        } while (!p005kotlin.jvm.internal.s.g(next.getAsJsonObject().get("ty").getAsString(), "sh"));
                        JsonElement jsonElement13 = next;
                        if (jsonElement13 == null || (asJsonObject2 = jsonElement13.getAsJsonObject()) == null) {
                            break;
                        }
                        JsonElement jsonElement14 = asJsonObject2.get("ks");
                        JsonObject jsonObject4 = jsonElement14 instanceof JsonObject ? (JsonObject) jsonElement14 : null;
                        if (arrayList2.size() >= 2) {
                            Double dP0 = h0.p0(arrayList2);
                            double dDoubleValue = dP0 != null ? dP0.doubleValue() : 0.0d;
                            Double dU0 = h0.u0(arrayList2);
                            double dDoubleValue2 = dU0 != null ? dU0.doubleValue() : 0.0d;
                            if (dDoubleValue != dDoubleValue2 && jsonObject4 != null && (jsonElement = jsonObject4.get(str6)) != null) {
                                JsonArray jsonArray12 = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
                                if (jsonArray12 != null) {
                                    ArrayList arrayList7 = new ArrayList();
                                    for (JsonElement jsonElement15 : jsonArray12) {
                                        if (jsonElement15 instanceof JsonObject) {
                                            arrayList7.add(jsonElement15);
                                        }
                                    }
                                    Iterator it12 = arrayList7.iterator();
                                    if (it12.hasNext()) {
                                        next2 = it12.next();
                                        if (it12.hasNext()) {
                                            JsonElement jsonElement16 = ((JsonObject) next2).get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT);
                                            float asFloat = jsonElement16 != null ? jsonElement16.getAsFloat() : 0.0f;
                                            do {
                                                Object next5 = it12.next();
                                                JsonElement jsonElement17 = ((JsonObject) next5).get(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT);
                                                float asFloat2 = jsonElement17 != null ? jsonElement17.getAsFloat() : 0.0f;
                                                if (Float.compare(asFloat, asFloat2) < 0) {
                                                    next2 = next5;
                                                    asFloat = asFloat2;
                                                }
                                            } while (it12.hasNext());
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    JsonObject jsonObject5 = (JsonObject) next2;
                                    if (jsonObject5 != null) {
                                        JsonElement jsonElement18 = jsonObject5.get(str5);
                                        JsonArray jsonArray13 = jsonElement18 instanceof JsonArray ? (JsonArray) jsonElement18 : null;
                                        if (jsonArray13 == null || (asJsonObject3 = ((JsonElement) h0.a0(jsonArray13)).getAsJsonObject()) == null) {
                                            break;
                                        }
                                        JsonArray asJsonArray3 = asJsonObject3.get("v").getAsJsonArray();
                                        JsonArray jsonArray14 = new JsonArray();
                                        JsonArray jsonArray15 = new JsonArray();
                                        JsonArray jsonArray16 = new JsonArray();
                                        int size2 = arrayList2.size();
                                        asJsonArray3.getClass();
                                        Iterator<JsonElement> it13 = asJsonArray3.iterator();
                                        double d16 = 0.0d;
                                        double d17 = 0.0d;
                                        int i17 = 0;
                                        while (it13.hasNext()) {
                                            JsonElement next6 = it13.next();
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                p13.x.q();
                                                throw null;
                                            }
                                            double d18 = dDoubleValue;
                                            JsonElement jsonElement19 = next6;
                                            JsonArray asJsonArray4 = jsonElement19.getAsJsonArray();
                                            Iterator<JsonElement> it14 = it13;
                                            JsonArray jsonArray17 = new JsonArray();
                                            double d19 = dDoubleValue2;
                                            JsonArray jsonArray18 = new JsonArray();
                                            JsonArray jsonArray19 = new JsonArray();
                                            if (i17 != 0) {
                                                i15 = size2;
                                                if (i17 != 1) {
                                                    double asDouble4 = asJsonArray4.get(1).getAsDouble();
                                                    double d24 = (asDouble4 - d15) / (d18 - d19);
                                                    double d25 = asDouble4 - (d18 * d24);
                                                    int i19 = i15 - 1;
                                                    double d26 = (d16 - d17) / ((double) i19);
                                                    int i24 = i17 - 2;
                                                    int i25 = i17;
                                                    ArrayList arrayList8 = arrayList2;
                                                    double dDoubleValue3 = (((Number) arrayList8.get(i24)).doubleValue() * d24) + d25;
                                                    jsonArray17.add(Double.valueOf((((double) i24) * d26) + d17));
                                                    jsonArray17.add(Double.valueOf(dDoubleValue3));
                                                    jsonArray14.add(jsonArray17);
                                                    if (i24 == 0 || i24 == i19) {
                                                        num2 = num;
                                                        jsonArray18.add(num2);
                                                        jsonArray18.add(num2);
                                                        jsonArray19.add(num2);
                                                        jsonArray19.add(num2);
                                                        jsonArray15.add(jsonArray18);
                                                        jsonArray16.add(jsonArray19);
                                                    } else {
                                                        double dDoubleValue4 = (((((Number) arrayList8.get(i25 - 1)).doubleValue() - ((Number) arrayList8.get(i24)).doubleValue()) * d24) / d26) + (((((Number) arrayList8.get(i24)).doubleValue() - ((Number) arrayList8.get(i25 - 3)).doubleValue()) * d24) / d26);
                                                        double d27 = 2;
                                                        double d28 = dDoubleValue4 / d27;
                                                        double dPow = d27 / Math.pow((d28 * d28) + ((double) 1), 0.5d);
                                                        double d29 = -dPow;
                                                        jsonArray18.add(Double.valueOf(d29));
                                                        jsonArray18.add(Double.valueOf(d29 * d28));
                                                        jsonArray15.add(jsonArray18);
                                                        jsonArray19.add(Double.valueOf(dPow));
                                                        jsonArray19.add(Double.valueOf(dPow * d28));
                                                        jsonArray16.add(jsonArray19);
                                                        num2 = num;
                                                    }
                                                    arrayList2 = arrayList8;
                                                } else {
                                                    num2 = num;
                                                    double asDouble5 = asJsonArray4.get(0).getAsDouble();
                                                    jsonArray14.add(jsonElement19);
                                                    jsonArray18.add(num2);
                                                    jsonArray18.add(num2);
                                                    jsonArray19.add(num2);
                                                    jsonArray19.add(num2);
                                                    jsonArray15.add(jsonArray18);
                                                    jsonArray16.add(jsonArray19);
                                                    d17 = asDouble5;
                                                }
                                                d16 = d16;
                                            } else {
                                                i15 = size2;
                                                num2 = num;
                                                double asDouble6 = asJsonArray4.get(0).getAsDouble();
                                                double asDouble7 = asJsonArray4.get(1).getAsDouble() / ((double) 2);
                                                jsonArray14.add(jsonElement19);
                                                jsonArray18.add(num2);
                                                jsonArray18.add(num2);
                                                jsonArray19.add(num2);
                                                jsonArray19.add(num2);
                                                jsonArray15.add(jsonArray18);
                                                jsonArray16.add(jsonArray19);
                                                d16 = asDouble6;
                                                d15 = asDouble7;
                                            }
                                            num = num2;
                                            it13 = it14;
                                            i17 = i18;
                                            dDoubleValue = d18;
                                            dDoubleValue2 = d19;
                                            size2 = i15;
                                        }
                                        asJsonObject3.add("v", jsonArray14);
                                        asJsonObject3.add(IntegerTokenConverter.CONVERTER_KEY, jsonArray15);
                                        asJsonObject3.add("o", jsonArray16);
                                        z14 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z14 = false;
        } else {
            jsonObject = jsonObjectC;
            str = null;
            z14 = false;
        }
        this.f133581u = Boolean.valueOf(z14);
        String string6 = jsonObject.toString();
        string6.getClass();
        byte[] bytes = string6.getBytes(d53.c.f57666b);
        bytes.getClass();
        return LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), str).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        Object next;
        Object next2;
        List<Double> listD;
        Marker marker;
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.lbl_activity_ascent);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        tt.d dVar = this.f133578r;
        Integer funFactCount = dVar != null ? dVar.getFunFactCount() : null;
        ArrayList arrayList2 = this.f133650d;
        if (funFactCount == null || dVar.getFunFactCount().intValue() < 1 || dVar.getFunFact() == null) {
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((Marker) next).getName(), "Funfact"));
            Marker marker2 = (Marker) next;
            if (marker2 != null) {
                arrayList.add(marker2);
            }
        }
        if ((dVar != null ? dVar.getMaxElevationActivity() : null) != null) {
            if (p005kotlin.jvm.internal.s.g(this.f133581u, Boolean.TRUE)) {
                for (Object obj2 : arrayList2) {
                    if (p005kotlin.jvm.internal.s.g(((Marker) obj2).getName(), "hide_ascent_view")) {
                        obj = obj2;
                        break;
                    }
                }
                marker = (Marker) obj;
            } else {
                for (Object obj3 : arrayList2) {
                    if (p005kotlin.jvm.internal.s.g(((Marker) obj3).getName(), "show_ascent_view")) {
                        obj = obj3;
                        break;
                    }
                }
                marker = (Marker) obj;
            }
            if (marker != null) {
                arrayList.add(marker);
            }
        } else {
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(((Marker) next2).getName(), "show_ascent_view"));
            Marker marker3 = (Marker) next2;
            for (Object obj4 : arrayList2) {
                if (p005kotlin.jvm.internal.s.g(((Marker) obj4).getName(), "hide_ascent_view")) {
                    obj = obj4;
                    break;
                }
            }
            Marker marker4 = (Marker) obj;
            if (marker3 != null && marker4 != null) {
                arrayList.add(marker3);
                arrayList.add(marker4);
            }
        }
        a(lottieDrawable, arrayList);
        if (dVar != null && (listD = dVar.d()) != null) {
            pt.n nVar = pt.n.f140581a;
            Integer numValueOf = Integer.valueOf(context.getColor(R.color.gcm_annual_report_activity_ascent_month_bar));
            c cVar = new c(context, 0);
            nVar.getClass();
            pt.n.c(context, numValueOf, lottieDrawable, listD, cVar);
        }
        p(context, lottieDrawable, t0.b(new o13.p("image_0", "bg_icon.png")));
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.ACTIVITY_ASCENT;
    }

    @Override // ot.l
    public final Map<String, String> l() {
        return t0.b(new o13.p("image_0", "sharing_bg.png"));
    }

    @Override // ot.l
    public final Object m(Context context, yt.o oVar) throws Throwable {
        List<Double> listD;
        tt.e maxElevationActivity;
        List<Double> listD2;
        LottieDrawable lottieDrawable = new LottieDrawable();
        JsonObject jsonObjectK = k(context, this, "sharing.json");
        tt.d dVar = this.f133578r;
        if (jsonObjectK != null) {
            r(this, context, jsonObjectK, 0.0f, 4);
            if (dVar != null && (listD2 = dVar.d()) != null) {
                pt.u.f140605a.getClass();
                pt.u.c(listD2, jsonObjectK);
            }
            if (((dVar == null || (maxElevationActivity = dVar.getMaxElevationActivity()) == null) ? null : maxElevationActivity.getElevationGain()) == null || dVar.getMaxElevationActivity().getName() == null || dVar.getMaxElevationActivity().getStartTimeLocal() == null) {
                JsonObject jsonObjectM = pt.i.m(jsonObjectK, "Data_Sub");
                if (jsonObjectM != null) {
                    pt.i.w(jsonObjectM);
                }
                JsonObject jsonObjectM2 = pt.i.m(jsonObjectK, "Text_Date");
                if (jsonObjectM2 != null) {
                    pt.i.w(jsonObjectM2);
                }
                JsonObject jsonObjectM3 = pt.i.m(jsonObjectK, "Text_Sub");
                if (jsonObjectM3 != null) {
                    pt.i.w(jsonObjectM3);
                }
            } else {
                pt.h hVar = pt.h.f140570a;
                double dDoubleValue = dVar.getMaxElevationActivity().getElevationGain().doubleValue();
                hVar.getClass();
                pt.i.y(jsonObjectK, "Data_Sub", pt.h.d(context, dDoubleValue));
                pt.i.y(jsonObjectK, "Text_Date", pt.h.e(context, jsonObjectK, dVar.getMaxElevationActivity().getName(), pt.h.a(dVar.getMaxElevationActivity().getStartTimeLocal()), oe2.f.T(context)));
            }
        }
        q(context, jsonObjectK, lottieDrawable);
        if (dVar != null && (listD = dVar.d()) != null) {
            pt.u.f140605a.getClass();
            pt.u.b(lottieDrawable, listD);
            Iterator<T> it = listD.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            double dDoubleValue2 = ((Number) it.next()).doubleValue();
            while (it.hasNext()) {
                dDoubleValue2 = Math.max(dDoubleValue2, ((Number) it.next()).doubleValue());
            }
            pt.h.f140570a.getClass();
            String strD = pt.h.d(context, dDoubleValue2);
            pt.i.f140571a.getClass();
            pt.i.d(lottieDrawable, "Highlight_count_value", strD);
        }
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.lbl_activity_ascent);
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        String string2 = context.getString(R.string.social_challenge_award_hint_most_ascent);
        string2.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        pt.i.d(lottieDrawable, "Text_Sub", upperCase2);
        Object objO = o(context, p13.w.c(new l.a(this, lottieDrawable, "ActivityAscentChapter")), oVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133578r == null || e() == null) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lot/d$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "ASCENT_SHARE_IMAGE_FILE_NAME", "", "REPOSITION_TEXT_LINE_THRESHOLD", "I", "ASCENT_CHART_TITLE_1", "ASCENT_CHART", "ASCENT_CHART_VIEW_VALUE", "ASCENT_CHART_VIEW_NAME_DATE", "ASCENT_CHART_TITLE_2", "ASCENT_CHART_VIEW_VALUE_2", "ASCENT_CHART_VIEW_NAME_DATE_2", "ASCENT_SHARE_IMAGE_MOST_ASCENT_ACTIVITY", "ASCENT_MARKER_HIDE_ASCENT_VIEW", "ASCENT_MARKER_SHOW_ASCENT_VIEW", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

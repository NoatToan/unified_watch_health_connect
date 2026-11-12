package pt;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpt/n;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f140581a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f140582b = R.color.gray_40_static;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f140583c = x.k("Jan_Data", "Feb_Data", "Mar_Data", "Apr_Data", "May_Data", "Jun_Data", "Jul_Data", "Aug_Data", "Sep_Data", "Oct_Data", "Nov_Data", "Dec_Data");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<String> f140584d = x.k("Jan_Chart", "Feb_Chart", "Mar_Chart", "Apr_Chart", "May_Chart", "Jun_Chart", "Jul_Chart", "Aug_Chart", "Sep_Chart", "Oct_Chart", "Nov_Chart", "Dec_Chart");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f140585e = x.k("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"pt/n$a", "Lcom/airbnb/lottie/value/LottieValueCallback;", "", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends LottieValueCallback<CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<Number> f140586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f140587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Number, String> f140588c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Number> list, int i14, e23.l<? super Number, String> lVar) {
            this.f140586a = list;
            this.f140587b = i14;
            this.f140588c = lVar;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final CharSequence getValue(LottieFrameInfo<CharSequence> lottieFrameInfo) {
            Number number = this.f140586a.get(this.f140587b);
            return number != null ? this.f140588c.invoke(number) : "";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"pt/n$b", "Lcom/airbnb/lottie/value/LottieValueCallback;", "", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends LottieValueCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f140589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f140590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f140591c;

        public b(int i14, int i15, Context context) {
            this.f140589a = i14;
            this.f140590b = i15;
            this.f140591c = context;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final Integer getValue(LottieFrameInfo<Integer> lottieFrameInfo) {
            if (this.f140589a == this.f140590b) {
                return -1;
            }
            return Integer.valueOf(a7.b.getColor(this.f140591c, n.f140582b));
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"pt/n$c", "Lcom/airbnb/lottie/value/LottieValueCallback;", "", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends LottieValueCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f140592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f140593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f140594c;

        public c(int i14, int i15, Integer num) {
            this.f140592a = i14;
            this.f140593b = i15;
            this.f140594c = num;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final Integer getValue(LottieFrameInfo<Integer> lottieFrameInfo) {
            if (this.f140592a == this.f140593b) {
                return -1;
            }
            return this.f140594c;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"pt/n$d", "Lcom/airbnb/lottie/value/LottieValueCallback;", "", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends LottieValueCallback<CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<String> f140595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f140596b;

        public d(List<String> list, int i14) {
            this.f140595a = list;
            this.f140596b = i14;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final CharSequence getValue(LottieFrameInfo<CharSequence> lottieFrameInfo) {
            return this.f140595a.get(this.f140596b);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"pt/n$e", "Lcom/airbnb/lottie/value/LottieValueCallback;", "", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends LottieValueCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f140597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f140598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f140599c;

        public e(int i14, int i15, Context context) {
            this.f140597a = i14;
            this.f140598b = i15;
            this.f140599c = context;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final Integer getValue(LottieFrameInfo<Integer> lottieFrameInfo) {
            if (this.f140597a == this.f140598b) {
                return -1;
            }
            return Integer.valueOf(a7.b.getColor(this.f140599c, n.f140582b));
        }
    }

    private n() {
    }

    public static void a(JsonObject jsonObject, Typeface typeface) {
        List<String> list = f140585e;
        Float fT = i.t(i.m(jsonObject, (String) h0.b0(list)));
        if (fT != null) {
            float fFloatValue = fT.floatValue();
            TextPaint textPaint = new TextPaint();
            textPaint.setTypeface(typeface);
            textPaint.setTextSize(fFloatValue);
            String[] shortMonths = new DateFormatSymbols().getShortMonths();
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                String str = (String) obj;
                shortMonths.getClass();
                String str2 = (String) p13.u.L(i14, shortMonths);
                if (str2 != null) {
                    float fMeasureText = textPaint.measureText(str2);
                    if (fMeasureText > 30.0f) {
                        i.e(jsonObject, str, (30.0f / fMeasureText) * fFloatValue);
                    }
                }
                i14 = i15;
            }
        }
    }

    public static void b(List list, JsonObject jsonObject) {
        Object next;
        JsonObject jsonObject2;
        Iterator it = h0.Z(list).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double dDoubleValue = ((Number) next).doubleValue();
                do {
                    Object next2 = it.next();
                    double dDoubleValue2 = ((Number) next2).doubleValue();
                    if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                        next = next2;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Number number = (Number) next;
        if (number != null) {
            int i14 = 0;
            for (Object obj : f140584d) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                JsonObject jsonObjectM = i.m(jsonObject, (String) obj);
                if (jsonObjectM != null) {
                    i.f140571a.getClass();
                    JsonObject jsonObjectO = i.o(jsonObjectM);
                    Number number2 = (Number) list.get(i14);
                    if (number2 == null) {
                        number2 = 0;
                    }
                    double dDoubleValue3 = (number2.doubleValue() / number.doubleValue()) * ((double) 100);
                    if (jsonObjectO != null) {
                        int iCeil = (int) Math.ceil(dDoubleValue3);
                        JsonElement jsonElement = jsonObjectO.get(JWKParameterNames.RSA_EXPONENT);
                        JsonObject jsonObject3 = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
                        JsonElement jsonElement2 = jsonObject3 != null ? jsonObject3.get(JWKParameterNames.OCT_KEY_VALUE) : null;
                        JsonArray jsonArray = jsonElement2 instanceof JsonArray ? (JsonArray) jsonElement2 : null;
                        if (jsonArray != null) {
                            ArrayList arrayList = new ArrayList();
                            for (JsonElement jsonElement3 : jsonArray) {
                                if (jsonElement3 instanceof JsonObject) {
                                    arrayList.add(jsonElement3);
                                }
                            }
                            jsonObject2 = (JsonObject) h0.n0(arrayList);
                        } else {
                            jsonObject2 = null;
                        }
                        if (jsonObject2 != null) {
                            jsonObject2.addProperty("s", Integer.valueOf(iCeil));
                        }
                    }
                }
                i14 = i15;
            }
        }
    }

    public static void c(Context context, Integer num, LottieDrawable lottieDrawable, List list, e23.l lVar) {
        Object next;
        Iterator it = h0.Z(list).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double dDoubleValue = ((Number) next).doubleValue();
                do {
                    Object next2 = it.next();
                    double dDoubleValue2 = ((Number) next2).doubleValue();
                    if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                        next = next2;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        int iIndexOf = list.indexOf((Number) next);
        int i14 = 0;
        int i15 = 0;
        for (Object obj : f140583c) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            String str = (String) obj;
            if (lottieDrawable != null) {
                lottieDrawable.addValueCallback(new KeyPath(str), LottieProperty.TEXT, new a(list, i15, lVar));
            }
            if (lottieDrawable != null) {
                lottieDrawable.addValueCallback(new KeyPath(str), LottieProperty.COLOR, new b(i15, iIndexOf, context));
            }
            i15 = i16;
        }
        int i17 = 0;
        for (Object obj2 : f140584d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                x.q();
                throw null;
            }
            String str2 = (String) obj2;
            if (lottieDrawable != null) {
                lottieDrawable.addValueCallback(new KeyPath(str2, "Shape 1", "Stroke 1"), LottieProperty.STROKE_COLOR, new c(i17, iIndexOf, num));
            }
            i17 = i18;
        }
        for (Object obj3 : f140585e) {
            int i19 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            String str3 = (String) obj3;
            String[] shortMonths = new DateFormatSymbols().getShortMonths();
            shortMonths.getClass();
            List listI0 = p13.u.i0(shortMonths);
            if (lottieDrawable != null) {
                lottieDrawable.addValueCallback(new KeyPath(str3), LottieProperty.TEXT, new d(listI0, i14));
            }
            if (lottieDrawable != null) {
                lottieDrawable.addValueCallback(new KeyPath(str3), LottieProperty.COLOR, new e(i14, iIndexOf, context));
            }
            i14 = i19;
        }
    }

    public static void d(Context context, JsonObject jsonObject, List list, e23.l lVar) {
        Object next;
        Iterator it = h0.Z(list).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double dDoubleValue = ((Number) next).doubleValue();
                do {
                    Object next2 = it.next();
                    double dDoubleValue2 = ((Number) next2).doubleValue();
                    if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                        next = next2;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Number number = (Number) next;
        int iIndexOf = list.indexOf(number);
        if (number != null) {
            List<String> list2 = f140583c;
            Float fT = i.t(i.m(jsonObject, list2.get(iIndexOf)));
            TextPaint textPaint = new TextPaint();
            textPaint.setTypeface(oe2.f.T(context));
            if (fT != null) {
                textPaint.setTextSize(fT.floatValue());
            }
            Number number2 = (Number) list.get(iIndexOf);
            float fMeasureText = textPaint.measureText((String) (number2 != null ? lVar.invoke(number2) : ""));
            if (fMeasureText > 72.0f) {
                float textSize = (72.0f / fMeasureText) * textPaint.getTextSize();
                int i14 = 0;
                for (Object obj : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    i.e(jsonObject, (String) obj, textSize);
                    i14 = i15;
                }
            }
        }
    }

    public static void e(JsonObject jsonObject, String str, Typeface typeface) {
        TextPaint textPaintS;
        i.f140571a.getClass();
        JsonObject jsonObjectM = i.m(jsonObject, "Chart_Title");
        if (jsonObjectM == null || (textPaintS = i.s(jsonObjectM, typeface)) == null) {
            return;
        }
        h.f140570a.getClass();
        v vVarG = h.g(str, 330.0f, textPaintS);
        i.x(jsonObjectM, vVarG.f140606a);
        if (vVarG.f140607b > 1) {
            i.A(jsonObject, "Chart_Title", 21.0f);
        }
    }
}

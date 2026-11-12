package v21;

import android.content.Context;
import b63.o;
import b63.p;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.w;
import g21.l;
import g21.v;
import i3.e5;
import j23.k;
import j23.t;
import java.text.DecimalFormatSymbols;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l42.j;
import lc.u0;
import m92.h0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.p0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv21/f;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f175333a = new f();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f175335b;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.BODY_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.BMI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f175334a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f175335b = iArr2;
        }
    }

    private f() {
    }

    public static int A(o oVar, o oVar2) {
        oVar.getClass();
        oVar2.getClass();
        return p.a(oVar, oVar2) / 7;
    }

    public static double a(int i14, int i15, double d14) {
        l3.f23124b.getClass();
        return Math.floor((((((double) i15) / 100.0d) * ((double) i14)) / d14) + 0.5d);
    }

    public static int b(int i14, double d14, double d15) {
        l3.f23124b.getClass();
        return (int) Math.floor((((d15 * d14) / ((double) i14)) * ((double) 100)) + 0.5d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o13.p c(f fVar, i53.f fVar2) {
        float f14;
        Float fValueOf;
        o13.p pVar;
        fVar.getClass();
        Float fValueOf2 = null;
        if (fVar2 == null || fVar2.isEmpty()) {
            return new o13.p(null, null);
        }
        float f15 = 4;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = fVar2.iterator();
        while (true) {
            f14 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((h0.e.a) next).f117347b >= 0.0f) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return new o13.p(Float.valueOf(0.0f), Float.valueOf(f15));
        }
        Iterator<E> it3 = fVar2.iterator();
        if (it3.hasNext()) {
            float fMin = ((h0.e.a) it3.next()).f117347b;
            while (it3.hasNext()) {
                fMin = Math.min(fMin, ((h0.e.a) it3.next()).f117347b);
            }
            fValueOf = Float.valueOf(fMin);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        Iterator<E> it4 = fVar2.iterator();
        if (it4.hasNext()) {
            float fMax = ((h0.e.a) it4.next()).f117347b;
            while (it4.hasNext()) {
                fMax = Math.max(fMax, ((h0.e.a) it4.next()).f117347b);
            }
            fValueOf2 = Float.valueOf(fMax);
        }
        float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
        if (fFloatValue == fFloatValue2) {
            float f16 = f15 / 2.0f;
            float fC = MathKt.c(fFloatValue);
            pVar = new o13.p(Float.valueOf(fC - f16), Float.valueOf(fC + f16));
        } else {
            float fFloor = (float) Math.floor(fFloatValue);
            float fCeil = (float) Math.ceil(fFloatValue2);
            float f17 = fCeil - fFloor;
            double dMax = (Math.max(f15, ((float) Math.ceil(f17 / f15)) * f15) - f17) / 2.0f;
            pVar = new o13.p(Float.valueOf(fFloor - ((float) Math.ceil(dMax))), Float.valueOf(fCeil + ((float) Math.floor(dMax))));
        }
        float fFloatValue3 = ((Number) pVar.f128594a).floatValue();
        float fFloatValue4 = ((Number) pVar.f128595b).floatValue();
        if (fFloatValue3 < 0.0f) {
            fFloatValue4 -= fFloatValue3;
        } else {
            f14 = fFloatValue3;
        }
        return new o13.p(Float.valueOf(f14), Float.valueOf(fFloatValue4));
    }

    public static b63.v d(b63.v vVar) {
        vVar.getClass();
        LocalTime localTime = vVar.f16219a;
        return (localTime.getMinute() == 0 && localTime.getSecond() == 0 && localTime.getNano() == 0) ? vVar : u(vVar);
    }

    public static b e(Double d14, Double d15, Double d16, Integer num) {
        Double dValueOf = d14 != null ? Double.valueOf(d14.doubleValue() * 4.0d) : null;
        Double dValueOf2 = d15 != null ? Double.valueOf(d15.doubleValue() * 9.0d) : null;
        Double dValueOf3 = d16 != null ? Double.valueOf(d16.doubleValue() * 4.0d) : null;
        return new b(dValueOf != null ? Float.valueOf((float) dValueOf.doubleValue()) : null, dValueOf2 != null ? Float.valueOf((float) dValueOf2.doubleValue()) : null, dValueOf3 != null ? Float.valueOf((float) dValueOf3.doubleValue()) : null, num != null ? Float.valueOf(num.intValue()) : null);
    }

    public static ArrayList f(List list, double d14) {
        Object obj;
        list.getClass();
        double dP0 = p13.h0.P0(list);
        if (dP0 <= 0.0d) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int iIntValue = 0; iIntValue < size; iIntValue++) {
                arrayList.add(Double.valueOf(0.0d));
            }
            return arrayList;
        }
        double d15 = d14 / dP0;
        ArrayList arrayList2 = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(Double.valueOf(Math.rint((((Number) it.next()).doubleValue() * d15) * 10.0d) / 10.0d));
        }
        double dRint = Math.rint((d14 - p13.h0.P0(arrayList2)) * 10.0d) / 10.0d;
        if (dRint == 0.0d) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Iterator<Integer> it3 = x.i(arrayList3).iterator();
        k kVar = (k) it3;
        if (kVar.f96801c) {
            p0 p0Var = (p0) it3;
            Object next = p0Var.next();
            if (kVar.f96801c) {
                double dDoubleValue = ((Number) arrayList3.get(((Number) next).intValue())).doubleValue();
                do {
                    Object next2 = p0Var.next();
                    double dDoubleValue2 = ((Number) arrayList3.get(((Number) next2).intValue())).doubleValue();
                    if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                        next = next2;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (kVar.f96801c);
            }
            obj = next;
        } else {
            obj = null;
        }
        Integer num = (Integer) obj;
        iIntValue = num != null ? num.intValue() : 0;
        arrayList3.set(iIntValue, Double.valueOf(Math.rint((((Number) arrayList3.get(iIntValue)).doubleValue() + dRint) * 10.0d) / 10.0d));
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList g(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((Number) it.next()).doubleValue()));
        }
        int iR0 = 100 - p13.h0.R0(arrayList);
        ArrayList arrayList2 = new ArrayList(y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            arrayList2.add(new o13.p(Integer.valueOf(i14), Double.valueOf(dDoubleValue - ((double) ((int) dDoubleValue)))));
            i14 = i15;
        }
        List listN0 = p13.h0.N0(arrayList2, new g());
        ArrayList arrayList3 = new ArrayList(arrayList);
        int size = listN0.size();
        if (iR0 > size) {
            iR0 = size;
        }
        for (int i16 = 0; i16 < iR0; i16++) {
            int iIntValue = ((Number) ((o13.p) listN0.get(i16)).f128594a).intValue();
            arrayList3.set(iIntValue, Integer.valueOf(((Number) arrayList3.get(iIntValue)).intValue() + 1));
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList h(int i14, List list) {
        list.getClass();
        double dP0 = p13.h0.P0(list);
        int i15 = 0;
        if (dP0 <= 0.0d) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int iD = 0; iD < size; iD = e5.d(0, iD, arrayList, 1)) {
            }
            return arrayList;
        }
        if (MathKt.b(dP0) != i14) {
            double d14 = ((double) i14) / dP0;
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Double.valueOf(((Number) it.next()).doubleValue() * d14));
            }
            list = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(y.r(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf((int) ((Number) it3.next()).doubleValue()));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        int iR0 = i14 - p13.h0.R0(arrayList4);
        ArrayList arrayList5 = new ArrayList(y.r(list, 10));
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            arrayList5.add(new o13.p(Integer.valueOf(i15), Double.valueOf(dDoubleValue - ((double) ((int) dDoubleValue)))));
            i15 = i16;
        }
        for (o13.p pVar : p13.h0.N0(arrayList5, new h())) {
            if (iR0 <= 0) {
                break;
            }
            int iIntValue = ((Number) pVar.f128594a).intValue();
            arrayList4.set(iIntValue, Integer.valueOf(((Number) arrayList4.get(iIntValue)).intValue() + 1));
            iR0--;
        }
        return arrayList4;
    }

    public static String i(Context context, float f14, v vVar) {
        context.getClass();
        int i14 = a.f175334a[vVar.ordinal()];
        if (i14 == 1) {
            l3.f23124b.getClass();
            return k42.b.j(context, f14, false, l3.f23130h);
        }
        if (i14 != 2) {
            if (i14 == 3) {
                return k42.b.d(Double.valueOf(f14), "", l3.f23126d);
            }
            u0.r();
            return null;
        }
        k42.b bVar = k42.b.f102880a;
        Double dValueOf = Double.valueOf(f14);
        bVar.getClass();
        return k42.b.g(dValueOf);
    }

    public static float j(List list) {
        Float fValueOf;
        list.getClass();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            float fMax = ((h0.e.a) it.next()).f117347b;
            while (it.hasNext()) {
                fMax = Math.max(fMax, ((h0.e.a) it.next()).f117347b);
            }
            fValueOf = Float.valueOf(fMax);
        } else {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        if (fFloatValue <= 0.0f) {
            return 3000.0f;
        }
        int i14 = (int) fFloatValue;
        return i14 < 100 ? c02.a.b(i14, 10) : c02.a.b(i14, 100);
    }

    public static String k(String str, Map map) {
        Set setEntrySet;
        Object next;
        String str2;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator it = setEntrySet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u.q((String) ((Map.Entry) next).getValue(), str, true));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (str2 = (String) entry.getKey()) != null) {
                return str2;
            }
        }
        String language = Locale.ENGLISH.getLanguage();
        language.getClass();
        return language;
    }

    public static float l(float f14, List list) {
        Object obj;
        list.getClass();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(((Number) next).floatValue() - f14);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(((Number) next2).floatValue() - f14);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f15 = (Float) obj;
        return f15 != null ? f15.floatValue() : f14;
    }

    public static String m(String str) {
        String strSubstring;
        str.getClass();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        String string = sb3.toString();
        int length2 = string.length();
        for (int i15 = 0; i15 < length2; i15++) {
            if (string.charAt(i15) != '0') {
                strSubstring = string.substring(i15);
                return d53.y.s0(6, strSubstring);
            }
        }
        strSubstring = "";
        return d53.y.s0(6, strSubstring);
    }

    public static String n(Context context, v vVar) {
        context.getClass();
        int i14 = a.f175334a[vVar.ordinal()];
        if (i14 == 1) {
            k42.b.f102880a.getClass();
            return k42.b.q(context);
        }
        if (i14 != 2) {
            return null;
        }
        return context.getString(R.string.percent_sign);
    }

    public static String o(int i14, int i15, String str) {
        Character chValueOf;
        str.getClass();
        char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        int length = str.length();
        int i16 = 0;
        while (true) {
            if (i16 >= length) {
                i16 = -1;
                break;
            }
            if (str.charAt(i16) == decimalSeparator) {
                break;
            }
            i16++;
        }
        StringBuilder sb3 = new StringBuilder();
        int i17 = 0;
        int i18 = 0;
        while (i17 < str.length()) {
            char cCharAt = str.charAt(i17);
            int i19 = i18 + 1;
            if (Character.isDigit(cCharAt) || (i15 > 0 && i18 == i16)) {
                sb3.append(cCharAt);
            }
            i17++;
            i18 = i19;
        }
        String string = sb3.toString();
        int i24 = 0;
        while (true) {
            if (i24 >= string.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt2 = string.charAt(i24);
            if (cCharAt2 == decimalSeparator) {
                chValueOf = Character.valueOf(cCharAt2);
                break;
            }
            i24++;
        }
        if (chValueOf == null) {
            return d53.y.s0(i14, string);
        }
        List listX = w.X(string, new char[]{chValueOf.charValue()});
        return d53.y.s0(i14, (String) listX.get(0)) + chValueOf + d53.y.s0(i15, (String) listX.get(1));
    }

    public static int p(float f14) {
        double d14;
        double d15;
        k42.b.f102880a.getClass();
        if (k42.b.l() == 0) {
            d14 = f14;
            l3.f23124b.getClass();
            d15 = 1000;
        } else {
            d14 = f14;
            l3.f23124b.getClass();
            d15 = 453.592d;
        }
        return (int) (d14 * d15);
    }

    public static double q(j jVar, v vVar) {
        jVar.getClass();
        int i14 = vVar == null ? -1 : a.f175334a[vVar.ordinal()];
        if (i14 == 1) {
            Double weight = jVar.getWeight();
            if (weight != null) {
                return k42.b.s(weight.doubleValue()) ? k42.b.c(weight.doubleValue() / ((double) 1000)) : weight.doubleValue();
            }
            return Double.NaN;
        }
        if (i14 == 2) {
            Double bodyFat = jVar.getBodyFat();
            if (zf.b.D(bodyFat)) {
                return bodyFat.doubleValue();
            }
            return Double.NaN;
        }
        if (i14 != 3) {
            return Double.NaN;
        }
        Double bmi = jVar.getBmi();
        Double weight2 = jVar.getWeight();
        if (bmi != null && !s.c(bmi, 0.0d)) {
            return bmi.doubleValue();
        }
        if (weight2 == null) {
            return Double.NaN;
        }
        String sourceType = jVar.getSourceType();
        k42.b bVar = k42.b.f102880a;
        if ("INDEX_SCALE".equals(sourceType) && !(jVar instanceof l42.g)) {
            return Double.NaN;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = weight2.doubleValue();
        aVar.getClass();
        double dB = k42.b.b(l3.a.P1(dDoubleValue));
        if (dB < 0.0d) {
            return Double.NaN;
        }
        return dB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean r(i53.f fVar, i53.f fVar2) {
        fVar.getClass();
        fVar2.getClass();
        if (fVar.size() != fVar2.size()) {
            return true;
        }
        int size = fVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (((h0.e.a) fVar.get(i14)).f117347b != ((h0.e.a) fVar2.get(i14)).f117347b) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(Integer num) {
        return num != null && num.intValue() > 0;
    }

    public static b63.v t(b63.v vVar) {
        b63.v vVar2;
        vVar.getClass();
        LocalTime localTime = vVar.f16219a;
        int minute = localTime.getMinute();
        int i14 = minute - 30;
        if (i14 >= 0) {
            vVar2 = new b63.v(localTime.getHour(), i14, 0, 0, 12, null);
        } else {
            int hour = localTime.getHour() - 1;
            vVar2 = hour < 0 ? d.f175318v : new b63.v(hour, minute + 30, 0, 0, 12, null);
        }
        return (b63.v) t.b(vVar2, d.f175318v);
    }

    public static b63.v u(b63.v vVar) {
        vVar.getClass();
        int hour = vVar.f16219a.getHour() + 1;
        if (hour > 23) {
            hour = 23;
        }
        return new b63.v(hour, 0, 0, 0);
    }

    public static Double v(String str) {
        str.getClass();
        String strReplace = str.replace(DecimalFormatSymbols.getInstance().getDecimalSeparator(), '.');
        strReplace.getClass();
        return d53.s.f(strReplace);
    }

    public static b63.v w(b63.v vVar) {
        b63.v vVar2;
        vVar.getClass();
        LocalTime localTime = vVar.f16219a;
        int minute = localTime.getMinute();
        int i14 = minute + 30;
        if (i14 < 60) {
            vVar2 = new b63.v(localTime.getHour(), i14, 0, 0, 12, null);
        } else {
            int hour = localTime.getHour() + 1;
            vVar2 = hour >= 24 ? d.f175319w : new b63.v(hour, minute - 30, 0, 0, 12, null);
        }
        b63.v vVar3 = d.f175319w;
        vVar2.getClass();
        vVar3.getClass();
        return vVar2.compareTo(vVar3) > 0 ? vVar3 : vVar2;
    }

    public static b63.v x(b63.v vVar) {
        LocalTime localTime = vVar.f16219a;
        return new b63.v((localTime.getHour() + 1) % 24, localTime.getMinute(), 0, 0, 12, null);
    }

    public static b63.v y(b63.v vVar) {
        vVar.getClass();
        return new b63.v(vVar.f16219a.getHour(), 0, 0, 0);
    }

    public static k01.d z(k01.d dVar) {
        if (dVar == null) {
            return null;
        }
        Double d14 = dVar.f102027f;
        Double d15 = dVar.f102028g;
        Double d16 = dVar.f102029h;
        Integer num = dVar.f102023b;
        if (num == null) {
            num = dVar.f102022a;
        }
        if (!zf.b.D(d16)) {
            d16 = dVar.f102025d;
        }
        if (!zf.b.D(d15)) {
            d15 = dVar.f102024c;
        }
        if (!zf.b.D(d14)) {
            d14 = dVar.f102026e;
        }
        if (num != null && zf.b.D(d15) && zf.b.D(d16) && zf.b.D(d14)) {
            return dVar;
        }
        return null;
    }
}

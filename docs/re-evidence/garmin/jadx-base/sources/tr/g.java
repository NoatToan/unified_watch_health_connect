package tr;

import am.j;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltr/g;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f166119a;

    public g(l22.b bVar) {
        bVar.getClass();
        this.f166119a = bVar;
    }

    public static String a(Double d14) {
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        if (dDoubleValue < 0.0d) {
            l3.f23124b.getClass();
            return l3.a.b1(0L);
        }
        l3.a aVar = l3.f23124b;
        long jB = MathKt.b(dDoubleValue) * 1000;
        aVar.getClass();
        return l3.a.b1(jB);
    }

    public static ArrayList d(ArrayList arrayList, double d14, RoundingMode roundingMode) {
        double dP0 = h0.P0(arrayList);
        if (dP0 > d14) {
            d14 = dP0;
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            double dDoubleValue2 = 0.0d;
            if (dDoubleValue != 0.0d && d14 != 0.0d) {
                dDoubleValue2 = BigDecimal.valueOf((dDoubleValue / d14) * 100.0d).setScale(0, roundingMode).doubleValue();
            }
            arrayList2.add(Double.valueOf(dDoubleValue2));
        }
        return arrayList2;
    }

    public String b(int i14, Double d14) {
        return "";
    }

    public String c(int i14, int i15, Double d14, Double d15) {
        int iDoubleValue;
        Integer numValueOf;
        if (i14 == i15) {
            iDoubleValue = d14 != null ? ((int) d14.doubleValue()) - 1 : 0;
            numValueOf = null;
        } else {
            iDoubleValue = d14 != null ? (int) d14.doubleValue() : 0;
            numValueOf = d15 != null ? Integer.valueOf(((int) d15.doubleValue()) - 1) : 0;
        }
        if (numValueOf == null) {
            return j.h(iDoubleValue, "> ");
        }
        return iDoubleValue + " - " + numValueOf;
    }

    public String e(int i14) {
        return this.f166119a.a(R.string.heart_rate_zone_name, String.valueOf(i14));
    }

    public abstract Integer f(int i14);
}

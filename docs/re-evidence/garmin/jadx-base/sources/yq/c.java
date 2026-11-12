package yq;

import c22.l3;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyq/c;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f198726a;

    public c(l22.b bVar) {
        bVar.getClass();
        this.f198726a = bVar;
    }

    public static int e(boolean z14) {
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        if (z14) {
            return zY ? R.string.lbl_kilometers : R.string.lbl_miles;
        }
        return (zY ? m3.KILOMETER : m3.MILE).f23164e;
    }

    public static int h(boolean z14) {
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        if (z14) {
            return zY ? R.string.common_kph_string : R.string.common_mph_string;
        }
        return (zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR).f23223e;
    }

    public final String a(Double d14, boolean z14) {
        double dDoubleValue;
        m3 m3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
        l22.b bVar = this.f198726a;
        if (!z14) {
            l3.a aVar = l3.f23124b;
            dDoubleValue = d14 != null ? d14.doubleValue() : Double.NaN;
            DecimalFormat decimalFormat = l3.f23129g;
            String strG = g();
            aVar.getClass();
            return l3.a.R(bVar, dDoubleValue, m3Var, decimalFormat, false, strG);
        }
        l3.a aVar2 = l3.f23124b;
        dDoubleValue = d14 != null ? d14.doubleValue() : Double.NaN;
        DecimalFormat decimalFormat2 = l3.f23129g;
        String strF = f();
        aVar2.getClass();
        oi0.b bVar2 = new oi0.b(bVar, l3.a.R(bVar, dDoubleValue, m3Var, decimalFormat2, true, strF));
        bVar2.s();
        bVar2.B();
        Unit unit = Unit.INSTANCE;
        return bVar2.f132238b;
    }

    public final String b(Double d14, boolean z14) {
        double dDoubleValue;
        q3 q3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        l22.b bVar = this.f198726a;
        if (!z14) {
            l3.a aVar = l3.f23124b;
            dDoubleValue = d14 != null ? d14.doubleValue() : Double.NaN;
            aVar.getClass();
            return l3.a.O0(bVar, dDoubleValue, q3Var, l3.f23130h, false, g());
        }
        l3.a aVar2 = l3.f23124b;
        dDoubleValue = d14 != null ? d14.doubleValue() : Double.NaN;
        aVar2.getClass();
        oi0.b bVar2 = new oi0.b(bVar, l3.a.O0(bVar, dDoubleValue, q3Var, l3.f23130h, true, f()));
        bVar2.t();
        bVar2.C();
        Unit unit = Unit.INSTANCE;
        return bVar2.f132238b;
    }

    public final String c(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return g();
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        String strW1 = l3.a.w1((long) (dDoubleValue * ((double) 1000)), null, true);
        return strW1 == null ? g() : strW1;
    }

    public final String d(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return f();
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        l22.b bVar = this.f198726a;
        return oi0.c.C(new oi0.h(bVar).a((long) (dDoubleValue * ((double) 1000)), true), bVar, new ya1.h(29));
    }

    public final String f() {
        return this.f198726a.getString(R.string.txt_empty_page_no_data);
    }

    public final String g() {
        return this.f198726a.getString(R.string.no_value);
    }
}

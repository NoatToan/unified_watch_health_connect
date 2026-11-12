package fi2;

import android.content.Context;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfi2/i0;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi2.d f71796c;

    static {
        new a(null);
        f71796c = new hi2.d("WeightPickerTransform", hi2.e.WEIGHT.f83902a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        o13.p pVar;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        String strE = ei2.h.e(bVar, map);
        f71796c.getClass();
        if (listC4 == null || strE.length() <= 0) {
            return "--";
        }
        String strD = d(bVar, String.valueOf(listC4.get(0).get(mh2.i.VALUE_ID.f118617a)));
        if (strD.length() <= 0) {
            hi2.a.f83879a.getClass();
            return hi2.a.C1658a.b(strE, hi2.a.f83881c);
        }
        boolean zEquals = strD.equals(mh2.m.METRIC.f118678a);
        Context context = this.f64388a;
        if (zEquals) {
            String string = context.getString(R.string.lbl_kg);
            hi2.a.C1658a c1658a = hi2.a.f83879a;
            double d14 = Double.parseDouble(strE);
            c1658a.getClass();
            String str = hi2.a.f83881c.format(d14 / ((double) 1000));
            str.getClass();
            pVar = new o13.p(string, str);
        } else {
            if (strD.equals(mh2.m.STATUTE_US.f118678a) ? true : strD.equals(mh2.m.STATUTE_UK.f118678a)) {
                String string2 = context.getString(R.string.lbl_lbs);
                hi2.a.C1658a c1658a2 = hi2.a.f83879a;
                double d15 = Double.parseDouble(strE);
                c1658a2.getClass();
                pVar = new o13.p(string2, hi2.a.C1658a.e(d15));
            } else {
                "Unknown MeasurementUnit: ".concat(strD);
                Logger logger = hi2.d.f83889c;
                hi2.a.C1658a c1658a3 = hi2.a.f83879a;
                double d16 = Double.parseDouble(strE);
                c1658a3.getClass();
                pVar = new o13.p("", hi2.a.C1658a.e(d16));
            }
        }
        String string3 = context.getString(R.string.generic_value_with_unit_string, (String) pVar.f128595b, (String) pVar.f128594a);
        string3.getClass();
        return string3;
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        List<Map<String, Object>> listC4 = bVar.C4(map);
        String strE = ei2.h.e(bVar, map);
        f71796c.getClass();
        HashMap map2 = new HashMap();
        if (listC4 != null) {
            double d14 = strE.length() > 0 ? Double.parseDouble(strE) : 0.0d;
            if (i14 == 1) {
                String strD = d(bVar, String.valueOf(listC4.get(0).get(mh2.i.VALUE_ID.f118617a)));
                if (strD.equals(mh2.m.METRIC.f118678a)) {
                    ds.e0.o(1, map2, mh2.i.DS_MINIMUM_VALUE.f118617a);
                    ds.e0.o(453, map2, mh2.i.DS_MAXIMUM_VALUE.f118617a);
                    try {
                        if (strE.length() > 0) {
                            String str = mh2.i.DS_SELECTED_VALUE.f118617a;
                            hi2.a.f83879a.getClass();
                            String str2 = hi2.a.f83881c.format(d14 / ((double) 1000));
                            str2.getClass();
                            map2.put(str, new Integer((int) Double.parseDouble(str2)));
                        }
                    } catch (NumberFormatException unused) {
                        Logger logger = hi2.d.f83889c;
                    }
                    map2.put(mh2.i.DS_LABEL_VALUE.f118617a, ".");
                } else {
                    if (strD.equals(mh2.m.STATUTE_US.f118678a) ? true : strD.equals(mh2.m.STATUTE_UK.f118678a)) {
                        ds.e0.o(2, map2, mh2.i.DS_MINIMUM_VALUE.f118617a);
                        ds.e0.o(999, map2, mh2.i.DS_MAXIMUM_VALUE.f118617a);
                        try {
                            if (strE.length() > 0) {
                                String str3 = mh2.i.DS_SELECTED_VALUE.f118617a;
                                hi2.a.f83879a.getClass();
                                map2.put(str3, new Integer((int) Double.parseDouble(hi2.a.C1658a.e(d14))));
                            }
                        } catch (NumberFormatException unused2) {
                            Logger logger2 = hi2.d.f83889c;
                        }
                        map2.put(mh2.i.DS_LABEL_VALUE.f118617a, ".");
                    }
                }
            } else if (i14 == 2) {
                String strD2 = d(bVar, String.valueOf(listC4.get(0).get(mh2.i.VALUE_ID.f118617a)));
                boolean zEquals = strD2.equals(mh2.m.METRIC.f118678a);
                Context context = this.f64388a;
                if (zEquals) {
                    ds.e0.o(0, map2, mh2.i.DS_MINIMUM_VALUE.f118617a);
                    ds.e0.o(9, map2, mh2.i.DS_MAXIMUM_VALUE.f118617a);
                    try {
                        hi2.a.f83879a.getClass();
                        String str4 = hi2.a.f83881c.format(d14 / ((double) 1000));
                        str4.getClass();
                        double d15 = Double.parseDouble(str4);
                        map2.put(mh2.i.DS_SELECTED_VALUE.f118617a, new Integer((int) ((d15 - ((double) ((int) d15))) * ((double) 10))));
                    } catch (NumberFormatException unused3) {
                        Logger logger3 = hi2.d.f83889c;
                    }
                    String str5 = mh2.i.DS_LABEL_VALUE.f118617a;
                    String string = context.getString(R.string.lbl_kg);
                    string.getClass();
                    map2.put(str5, string);
                } else {
                    if (strD2.equals(mh2.m.STATUTE_US.f118678a) ? true : strD2.equals(mh2.m.STATUTE_UK.f118678a)) {
                        ds.e0.o(0, map2, mh2.i.DS_MINIMUM_VALUE.f118617a);
                        ds.e0.o(9, map2, mh2.i.DS_MAXIMUM_VALUE.f118617a);
                        try {
                            hi2.a.f83879a.getClass();
                            double d16 = Double.parseDouble(hi2.a.C1658a.e(d14));
                            map2.put(mh2.i.DS_SELECTED_VALUE.f118617a, new Integer(MathKt.b((d16 - ((double) ((int) d16))) * ((double) 10))));
                        } catch (NumberFormatException unused4) {
                            Logger logger4 = hi2.d.f83889c;
                        }
                        String str6 = mh2.i.DS_LABEL_VALUE.f118617a;
                        String string2 = context.getString(R.string.lbl_lbs);
                        string2.getClass();
                        map2.put(str6, string2);
                    }
                }
            }
        }
        return map2;
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            List<Map<String, Object>> listC4 = bVar.C4(map);
            boolean zIsEmpty = list.isEmpty();
            String strValueOf = "";
            hi2.d dVar = f71796c;
            if (zIsEmpty) {
                dVar.getClass();
                bVar.L4("", String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
                return;
            }
            String strValueOf2 = String.valueOf(((Number) list.get(0)).intValue());
            if (listC4 != null) {
                if (list.size() > 1) {
                    x0 x0Var = x0.f105818a;
                    String str = String.format("%d.%d", Arrays.copyOf(new Object[]{list.get(0), list.get(1)}, 2));
                    dVar.getClass();
                    double d14 = Double.parseDouble(str);
                    String strD = d(bVar, String.valueOf(listC4.get(0).get(mh2.i.VALUE_ID.f118617a)));
                    if (strD.equals(mh2.m.METRIC.f118678a)) {
                        hi2.a.f83879a.getClass();
                        strValueOf = String.valueOf(d14 * ((double) 1000));
                    } else {
                        if (strD.equals(mh2.m.STATUTE_US.f118678a) ? true : strD.equals(mh2.m.STATUTE_UK.f118678a)) {
                            hi2.a.f83879a.getClass();
                            strValueOf = String.valueOf((d14 / 2.20462d) * ((double) 1000));
                        } else {
                            "Unknown MeasurementUnit: ".concat(strD);
                            Logger logger = hi2.d.f83889c;
                        }
                    }
                    strValueOf2 = strValueOf;
                }
            }
            bVar.L4(strValueOf2, String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfi2/i0$a;", "", "<init>", "()V", "", "DECIMAL_END", "I", "DECIMAL_START", "DEFAULT_KG_MAX_WEIGHT", "DEFAULT_KG_MIN_WEIGHT", "DEFAULT_LB_MAX_WEIGHT", "DEFAULT_LB_MIN_WEIGHT", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

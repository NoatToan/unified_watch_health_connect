package fi2;

import android.content.Context;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfi2/o;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71801c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        context.getClass();
        this.f71801c = new hi2.d("HeightPickerTransform", hi2.e.HEIGHT.f83902a);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        Map map2;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        String strE = ei2.h.e(bVar, map);
        if (strE.length() > 0 && listC4 != null && (map2 = (Map) p13.h0.d0(listC4)) != null) {
            String strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
            this.f71801c.getClass();
            if (strD.equals(mh2.m.METRIC.f118678a)) {
                hi2.a.f83879a.getClass();
                return androidx.core.view.j.f(hi2.a.C1658a.h(strE), " cm");
            }
            if (strD.equals(mh2.m.STATUTE_US.f118678a) ? true : strD.equals(mh2.m.STATUTE_UK.f118678a)) {
                hi2.a.C1658a c1658a = hi2.a.f83879a;
                double d14 = Double.parseDouble(strE);
                c1658a.getClass();
                hi2.a.C1658a.C1659a c1659aC = hi2.a.C1658a.c(d14);
                int i14 = c1659aC.f83883a;
                Context context = this.f64388a;
                String string = context.getString(R.string.lbl_foot);
                int i15 = c1659aC.f83884b;
                String string2 = context.getString(R.string.lbl_inch);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i14);
                sb3.append(StringUtils.SPACE);
                sb3.append(string);
                sb3.append(StringUtils.SPACE);
                sb3.append(i15);
                return hi2.a.C1658a.b(am.j.o(StringUtils.SPACE, string2, sb3), hi2.a.f83881c);
            }
            "Metric not found ".concat(strD);
            Logger logger = hi2.d.f83889c;
        }
        hi2.a.f83879a.getClass();
        String strB = hi2.a.C1658a.b(strE, hi2.a.f83881c);
        return strB.length() > 0 ? strB : "--";
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        Map map2;
        String strB4;
        String strE = ei2.h.e(bVar, map);
        List<Map<String, Object>> listC4 = bVar.C4(map);
        HashMap map3 = new HashMap();
        if (listC4 != null && (map2 = (Map) p13.h0.d0(listC4)) != null) {
            mh2.i iVar = mh2.i.VALUE_ID;
            String strD = d(bVar, String.valueOf(map2.get(iVar.f118617a)));
            this.f71801c.getClass();
            if (i14 != 1) {
                if (i14 == 2) {
                    Object obj = map2.get(iVar.f118617a);
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str = (String) obj;
                    if (str != null && (strB4 = bVar.B4(str)) != null && !strB4.equals(mh2.m.METRIC.f118678a)) {
                        if (strB4.equals(mh2.m.STATUTE_US.f118678a) ? true : strB4.equals(mh2.m.STATUTE_UK.f118678a)) {
                            ds.e0.o(0, map3, mh2.i.DS_MINIMUM_VALUE.f118617a);
                            ds.e0.o(11, map3, mh2.i.DS_MAXIMUM_VALUE.f118617a);
                            map3.put(mh2.i.DS_MAXIMUM_VALUE_FOR_DEPENDENCY.f118617a, new Integer(4));
                            if (strE.length() > 0) {
                                String str2 = mh2.i.DS_SELECTED_VALUE.f118617a;
                                hi2.a.C1658a c1658a = hi2.a.f83879a;
                                double d14 = Double.parseDouble(strE);
                                c1658a.getClass();
                                ds.e0.o(Integer.parseInt(String.valueOf(hi2.a.C1658a.c(d14).f83884b)), map3, str2);
                            }
                            map3.put(mh2.i.DS_LABEL_VALUE.f118617a, ei2.h.g(this, R.string.lbl_inch));
                            return map3;
                        }
                    }
                }
            } else {
                if (strD.equals(mh2.m.METRIC.f118678a)) {
                    ds.e0.o(30, map3, mh2.i.DS_MINIMUM_VALUE.f118617a);
                    map3.put(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(254));
                    if (strE.length() > 0) {
                        String str3 = mh2.i.DS_SELECTED_VALUE.f118617a;
                        hi2.a.f83879a.getClass();
                        ds.e0.o(hi2.a.C1658a.h(strE), map3, str3);
                    }
                    map3.put(mh2.i.DS_LABEL_VALUE.f118617a, ei2.h.g(this, R.string.lbl_cm));
                    return map3;
                }
                if (strD.equals(mh2.m.STATUTE_US.f118678a) ? true : strD.equals(mh2.m.STATUTE_UK.f118678a)) {
                    ds.e0.o(1, map3, mh2.i.DS_MINIMUM_VALUE.f118617a);
                    map3.put(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(8));
                    if (strE.length() > 0) {
                        String str4 = mh2.i.DS_SELECTED_VALUE.f118617a;
                        hi2.a.C1658a c1658a2 = hi2.a.f83879a;
                        double d15 = Double.parseDouble(strE);
                        c1658a2.getClass();
                        ds.e0.o(Integer.parseInt(String.valueOf(hi2.a.C1658a.c(d15).f83883a)), map3, str4);
                    }
                    map3.put(mh2.i.DS_LABEL_VALUE.f118617a, ei2.h.g(this, R.string.lbl_foot));
                }
            }
        }
        return map3;
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        Map map2;
        bVar.getClass();
        map.getClass();
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            List<Map<String, Object>> listC4 = bVar.C4(map);
            if (list.isEmpty()) {
                bVar.L4("", String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
                return;
            }
            String strValueOf = String.valueOf(((Number) list.get(0)).intValue());
            if (listC4 != null && (map2 = (Map) p13.h0.d0(listC4)) != null) {
                String strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                boolean zEquals = strD.equals(mh2.m.METRIC.f118678a);
                hi2.d dVar = this.f71801c;
                if (zEquals) {
                    Objects.toString(list.get(0));
                    dVar.getClass();
                    strValueOf = String.valueOf(((Number) list.get(0)).intValue());
                } else {
                    if (strD.equals(mh2.m.STATUTE_US.f118678a) ? true : strD.equals(mh2.m.STATUTE_UK.f118678a)) {
                        hi2.a.C1658a c1658a = hi2.a.f83879a;
                        int iIntValue = ((Number) list.get(0)).intValue();
                        int iIntValue2 = ((Number) list.get(1)).intValue();
                        c1658a.getClass();
                        strValueOf = hi2.a.f83881c.format((((double) iIntValue2) * 2.54d) + (((double) (iIntValue * 12)) * 2.54d));
                        strValueOf.getClass();
                        dVar.getClass();
                    } else {
                        Logger logger = hi2.d.f83889c;
                        dVar.getClass();
                    }
                }
            }
            bVar.L4(strValueOf, String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lfi2/o$a;", "", "<init>", "()V", "", "MAXIMUM_HEIGHT_FEET", "I", "MAXIMUM_HEIGHT_INCHES", "MAXIMUM_HEIGHT_INCHES_FOR_MAXIMUM_FEET", "MAXIMUM_HEIGHT_METRIC", "MINIMUM_HEIGHT_FEET", "MINIMUM_HEIGHT_INCHES", "MINIMUM_HEIGHT_METRIC", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

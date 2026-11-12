package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/p;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context);
        context.getClass();
        this.f71802c = new hi2.d("HydrationContainerTransform", hi2.e.HYDRATION.f83902a);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        String strB;
        HashMap map2 = new HashMap();
        List<Map> listG4 = ii2.b.G4(map);
        String string = null;
        if (listG4 != null) {
            for (Map map3 : listG4) {
                Object obj = map3.get(mh2.i.ID.f118617a);
                boolean zG = p005kotlin.jvm.internal.s.g(obj, mh2.m.VOLUME.f118678a);
                hi2.d dVar = this.f71802c;
                if (zG) {
                    Object obj2 = map3.get(mh2.i.VALUE_ID.f118617a);
                    if (!(obj2 instanceof String)) {
                        obj2 = null;
                    }
                    String str = (String) obj2;
                    if (str != null) {
                        String strD = d(bVar, str);
                        dVar.getClass();
                        String str2 = mh2.i.DS_VOLUME.f118617a;
                        if (strD.length() > 0) {
                            hi2.a.f83879a.getClass();
                            strB = hi2.a.C1658a.b(strD, hi2.a.f83881c);
                        } else {
                            strB = "--";
                        }
                        map2.put(str2, strB);
                    }
                } else if (p005kotlin.jvm.internal.s.g(obj, mh2.m.UNIT.f118678a)) {
                    Object obj3 = map3.get(mh2.i.VALUE_ID.f118617a);
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str3 = (String) obj3;
                    if (str3 != null) {
                        String strD2 = d(bVar, str3);
                        dVar.getClass();
                        String str4 = mh2.i.DS_UNIT.f118617a;
                        if (strD2.length() <= 0) {
                            strD2 = "--";
                        }
                        map2.put(str4, strD2);
                    }
                }
            }
            string = this.f64388a.getString(R.string.generic_value_with_unit_string, String.valueOf(map2.get(mh2.i.DS_VOLUME.f118617a)), String.valueOf(map2.get(mh2.i.DS_UNIT.f118617a)));
        }
        return string == null ? "--" : string;
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        bVar.getClass();
        List<Map> listG4 = ii2.b.G4(map);
        HashMap map2 = new HashMap();
        if (listG4 != null) {
            for (Map map3 : listG4) {
                Object obj = map3.get(mh2.i.ID.f118617a);
                boolean zG = p005kotlin.jvm.internal.s.g(obj, mh2.m.VOLUME.f118678a);
                hi2.d dVar = this.f71802c;
                if (zG) {
                    String strD = d(bVar, String.valueOf(map3.get(mh2.i.VALUE_ID.f118617a)));
                    dVar.getClass();
                    if (strD.length() > 0) {
                        hi2.a.f83879a.getClass();
                        int iH = hi2.a.C1658a.h(strD);
                        if (iH > 0) {
                            map2.put(mh2.i.DS_SELECTED_VALUE.f118617a, new Integer(iH));
                        }
                    }
                } else if (p005kotlin.jvm.internal.s.g(obj, mh2.m.UNIT.f118678a)) {
                    String strD2 = d(bVar, String.valueOf(map3.get(mh2.i.VALUE_ID.f118617a)));
                    dVar.getClass();
                    if (strD2.length() > 0) {
                        if (strD2.equals(ei2.h.g(this, R.string.common_cups))) {
                            ds.e0.o(0, map2, mh2.i.DS_SELECTED_UNIT.f118617a);
                        } else if (strD2.equals(ei2.h.g(this, R.string.common_ounces))) {
                            ds.e0.o(1, map2, mh2.i.DS_SELECTED_UNIT.f118617a);
                        } else if (strD2.equals(ei2.h.g(this, R.string.common_milliliters))) {
                            ds.e0.o(2, map2, mh2.i.DS_SELECTED_UNIT.f118617a);
                        }
                    }
                }
            }
            ds.e0.o(0, map2, mh2.i.DS_MINIMUM_VALUE.f118617a);
            map2.put(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(2));
            map2.put(mh2.i.DS_POSSIBLE_VALUES.f118617a, new String[]{ei2.h.g(this, R.string.common_cups), ei2.h.g(this, R.string.common_ounces), ei2.h.g(this, R.string.common_milliliters)});
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
            List<Map> listG4 = ii2.b.G4(map);
            listG4.getClass();
            for (Map map2 : listG4) {
                Object obj2 = map2.get(mh2.i.ID.f118617a);
                if (p005kotlin.jvm.internal.s.g(obj2, mh2.m.VOLUME.f118678a)) {
                    if (list.isEmpty()) {
                        Object obj3 = map2.get(mh2.i.VALUE_ID.f118617a);
                        obj3.getClass();
                        bVar.L4("", (String) obj3);
                    } else {
                        Object obj4 = map2.get(mh2.i.VALUE_ID.f118617a);
                        obj4.getClass();
                        bVar.L4(list.get(0), (String) obj4);
                    }
                } else if (p005kotlin.jvm.internal.s.g(obj2, mh2.m.UNIT.f118678a)) {
                    if (list.isEmpty()) {
                        Object obj5 = map2.get(mh2.i.VALUE_ID.f118617a);
                        obj5.getClass();
                        bVar.L4("", (String) obj5);
                    } else {
                        Object obj6 = map2.get(mh2.i.VALUE_ID.f118617a);
                        obj6.getClass();
                        bVar.L4(list.get(1), (String) obj6);
                    }
                }
            }
        }
    }
}

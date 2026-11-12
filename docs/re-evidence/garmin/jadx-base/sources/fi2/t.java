package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/t;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context) {
        super(context);
        context.getClass();
        this.f71806c = new hi2.d("NumberPickerTransform", null, 2, null);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        List<Map> list;
        String strC;
        String strE = ei2.h.e(bVar, map);
        hi2.a.f83879a.getClass();
        String strB = hi2.a.C1658a.b(strE, hi2.a.f83881c);
        this.f71806c.getClass();
        LinkedHashMap linkedHashMapE4 = bVar.E4(map);
        List<Map> list2 = j0.f134944a;
        mh2.m mVar = mh2.m.RANGE;
        if (linkedHashMapE4.containsKey(mVar.f118678a)) {
            Object obj = linkedHashMapE4.get(mVar.f118678a);
            if (!y0.h(obj)) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Object obj2 = map2 != null ? map2.get(mh2.i.VALUES_BEFORE.f118617a) : null;
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            List list3 = (List) obj2;
            Object obj3 = map2 != null ? map2.get(mh2.i.VALUES_AFTER.f118617a) : null;
            if (!(obj3 instanceof List)) {
                obj3 = null;
            }
            list = (List) obj3;
            list2 = list3;
        } else {
            list = list2;
        }
        if (list2 != null) {
            for (Map map3 : list2) {
                if (strE.equals(String.valueOf(map3.get(mh2.i.VALUE.f118617a)))) {
                    strB = String.valueOf(map3.get(mh2.i.DISPLAY.f118617a));
                }
            }
        }
        if (list != null) {
            for (Map map4 : list) {
                if (strE.equals(String.valueOf(map4.get(mh2.i.VALUE.f118617a)))) {
                    strB = String.valueOf(map4.get(mh2.i.DISPLAY.f118617a));
                }
            }
        }
        if (strB.length() <= 0) {
            return "--";
        }
        mh2.m mVar2 = mh2.m.LABEL;
        if (linkedHashMapE4.containsKey(mVar2.f118678a)) {
            Object obj4 = linkedHashMapE4.get(mVar2.f118678a);
            if (!y0.h(obj4)) {
                obj4 = null;
            }
            Map map5 = (Map) obj4;
            if (map5 != null) {
                Object obj5 = map5.get(mh2.i.DISPLAY.f118617a);
                if (!(obj5 instanceof String)) {
                    obj5 = null;
                }
                String str = (String) obj5;
                Context context = this.f64388a;
                if (str != null) {
                    hi2.i.f83907a.getClass();
                    strC = hi2.i.a.c(context, str, null);
                } else {
                    strC = "";
                }
                context.getString(R.string.generic_value_with_unit_string, strB, strC);
            }
        }
        return strB;
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        List<Map> list;
        List<Map> list2;
        Object obj;
        LinkedHashMap linkedHashMapE4 = bVar.E4(map);
        HashMap map2 = new HashMap();
        Map linkedHashMap = new LinkedHashMap();
        List<Map> list3 = j0.f134944a;
        mh2.m mVar = mh2.m.RANGE;
        if (linkedHashMapE4.containsKey(mVar.f118678a)) {
            Object obj2 = linkedHashMapE4.get(mVar.f118678a);
            if (!y0.h(obj2)) {
                obj2 = null;
            }
            linkedHashMap = (Map) obj2;
            Object obj3 = linkedHashMap != null ? linkedHashMap.get(mh2.i.VALUES_BEFORE.f118617a) : null;
            if (!(obj3 instanceof List)) {
                obj3 = null;
            }
            list = (List) obj3;
            Object obj4 = linkedHashMap != null ? linkedHashMap.get(mh2.i.VALUES_AFTER.f118617a) : null;
            if (!(obj4 instanceof List)) {
                obj4 = null;
            }
            list2 = (List) obj4;
        } else {
            list = list3;
            list2 = list;
        }
        mh2.m mVar2 = mh2.m.LIST;
        if (linkedHashMapE4.containsKey(mVar2.f118678a)) {
            Object obj5 = linkedHashMapE4.get(mVar2.f118678a);
            if (!y0.h(obj5)) {
                obj5 = null;
            }
            Map map3 = (Map) obj5;
            Object obj6 = map3 != null ? map3.get(mh2.i.VALUES.f118617a) : null;
            if (!(obj6 instanceof List)) {
                obj6 = null;
            }
            list3 = (List) obj6;
        }
        mh2.m mVar3 = mh2.m.LABEL;
        if (linkedHashMapE4.containsKey(mVar3.f118678a)) {
            Object obj7 = linkedHashMapE4.get(mVar3.f118678a);
            if (!(obj7 instanceof HashMap)) {
                obj7 = null;
            }
            HashMap map4 = (HashMap) obj7;
            if (map4 != null && (obj = map4.get(mh2.i.DISPLAY.f118617a)) != null) {
                map2.put(mh2.i.DS_LABEL_VALUE.f118617a, obj);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            for (Map map5 : list) {
                String str = (String) map5.get(mh2.i.DISPLAY.f118617a);
                if (str != null) {
                    String strH = ei2.h.h(this, str);
                    Object obj8 = map5.get(mh2.i.VALUE.f118617a);
                    linkedHashMap2.put(strH, obj8 != null ? obj8.toString() : null);
                }
            }
        }
        Integer num = (Integer) (linkedHashMap != null ? linkedHashMap.get(mh2.i.START.f118617a) : null);
        Integer num2 = (Integer) (linkedHashMap != null ? linkedHashMap.get(mh2.i.END.f118617a) : null);
        Integer num3 = (Integer) (linkedHashMap != null ? linkedHashMap.get(mh2.i.STEP.f118617a) : null);
        if (num != null && num2 != null && num3 != null) {
            if (num3.intValue() <= 0) {
                vb.h.s(androidx.room.a0.i("Step must be positive, was: ", num3, "."));
                return null;
            }
            int iIntValue = num.intValue();
            int iN = w5.r.n(num.intValue(), num2.intValue(), num3.intValue());
            int iIntValue2 = num3.intValue();
            if (iIntValue <= iN) {
                while (true) {
                    linkedHashMap2.put(String.valueOf(iIntValue), String.valueOf(iIntValue));
                    if (iIntValue == iN) {
                        break;
                    }
                    iIntValue += iIntValue2;
                }
            }
        }
        if (list2 != null) {
            for (Map map6 : list2) {
                String str2 = (String) map6.get(mh2.i.DISPLAY.f118617a);
                if (str2 != null) {
                    String strH2 = ei2.h.h(this, str2);
                    Object obj9 = map6.get(mh2.i.VALUE.f118617a);
                    linkedHashMap2.put(strH2, obj9 != null ? obj9.toString() : null);
                }
            }
        }
        if (list3 != null) {
            for (Map map7 : list3) {
                String str3 = (String) map7.get(mh2.i.DISPLAY.f118617a);
                if (str3 != null) {
                    Object obj10 = map7.get(mh2.i.VALUE.f118617a);
                    linkedHashMap2.put(str3, obj10 != null ? obj10.toString() : null);
                }
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            map2.put(mh2.i.DS_DATA_DISPLAY_VALUE_MAP.f118617a, linkedHashMap2);
        }
        String strE = ei2.h.e(bVar, map);
        if (strE.length() > 0) {
            hi2.a.f83879a.getClass();
            int iH = hi2.a.C1658a.h(strE);
            if (iH > 0) {
                map2.put(mh2.i.DS_SELECTED_VALUE.f118617a, String.valueOf(iH));
                return map2;
            }
            map2.put(mh2.i.DS_SELECTED_VALUE.f118617a, strE);
        }
        return map2;
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        bVar.L4(String.valueOf(obj), String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
    }
}

package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<String> f33763a;
    public static List<String> e;

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add("SLEEP_CARD_KEY_NEW");
        e.add("WEIGHT_CARD_KEY_NEW");
        e.add("PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW");
        ArrayList arrayList2 = new ArrayList();
        f33763a = arrayList2;
        arrayList2.add("BLOODSUGAR_CARD_KEY_NEW");
        f33763a.add("BLOODPRESSURE_CARD_KEY_NEW");
    }

    public static void d(String str) {
        Map map;
        String strE = lua.e(String.valueOf(10000), "healthCardClick", "");
        if (TextUtils.isEmpty(strE)) {
            map = new HashMap();
        } else {
            map = (Map) HiJsonUtil.d(strE, new TypeToken<Map<String, List<String>>>() { // from class: com.huawei.health.health.utils.functionsetcard.FunctionSetCardNewUtils$1
            }.getType());
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        if (map.containsKey(str) && njy.b((Collection) map.get(str))) {
            List list = (List) map.get(str);
            if (list.contains(String.valueOf(iA))) {
                return;
            }
            list.add(String.valueOf(iA));
            map.put(str, list);
            lua.f(String.valueOf(10000), "healthCardClick", HiJsonUtil.d(map));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(iA));
        map.put(str, arrayList);
        lua.f(String.valueOf(10000), "healthCardClick", HiJsonUtil.d(map));
    }

    public static void c(String str) {
        List arrayList;
        String strE = lua.e(String.valueOf(10000), "card_hide_to_show", "");
        if (TextUtils.isEmpty(strE)) {
            arrayList = new ArrayList();
        } else {
            arrayList = (List) HiJsonUtil.d(strE, new TypeToken<List<String>>() { // from class: com.huawei.health.health.utils.functionsetcard.FunctionSetCardNewUtils$3
            }.getType());
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        LogUtil.a("FunctionSetCardNewUtils", "deviceAbilityCheck showedCardList:", arrayList);
        lua.f(String.valueOf(10000), "card_hide_to_show", HiJsonUtil.d(arrayList));
    }

    public static List<String> d() {
        String strE = lua.e(String.valueOf(10000), "card_hide_to_show", "");
        if (TextUtils.isEmpty(strE)) {
            return new ArrayList();
        }
        return (List) HiJsonUtil.d(strE, new TypeToken<List<String>>() { // from class: com.huawei.health.health.utils.functionsetcard.FunctionSetCardNewUtils$4
        }.getType());
    }
}

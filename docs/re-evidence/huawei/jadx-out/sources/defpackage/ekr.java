package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class ekr {
    private static List<JSONObject> d(List<JSONObject> list, ekc.b.a aVar) {
        if (aVar == null) {
            return list;
        }
        a(list, (ekc.b.f) null, aVar);
        return list;
    }

    public static JSONObject b(ekc.b.e eVar, List<JSONObject> list) {
        if (eVar != null && eVar.getFilterConditions() != null && eVar.getFilterConditions().size() > 0 && !coq.d(list)) {
            List<JSONObject> listD = d(list, eVar.getAllDataSortCondition());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap map = new HashMap(16);
            String strE = "";
            ekc.b.f fVarE = null;
            for (JSONObject jSONObject : listD) {
                for (ekc.b.C0313b c0313b : eVar.getFilterConditions()) {
                    if (c0313b.getMatchingCondition() != null && c0313b.getMatchingCondition().size() > 0) {
                        map.clear();
                        b(strE, arrayList2, jSONObject, map, c0313b);
                        LogUtil.a("FilterDataUtil", "params ", map, " conditionRules ", strE);
                        if (!TextUtils.isEmpty(strE) && ela.d().a(strE, map)) {
                            LogUtil.a("FilterDataUtil", "use conditionRules ");
                            strE = e(strE, c0313b);
                            e(arrayList2, c0313b);
                            fVarE = e(fVarE, c0313b);
                            arrayList.add(jSONObject);
                            break;
                        }
                        if (TextUtils.isEmpty(strE) && ela.d().a(c0313b.getConditionRules(), map)) {
                            LogUtil.a("FilterDataUtil", "conditionRules is null ");
                            strE = e(strE, c0313b);
                            e(arrayList2, c0313b);
                            fVarE = e(fVarE, c0313b);
                            arrayList.add(jSONObject);
                            break;
                        }
                    }
                }
            }
            if (fVarE != null || !arrayList.isEmpty()) {
                return fVarE == null ? (JSONObject) arrayList.get(0) : a(fVarE, arrayList);
            }
        }
        return null;
    }

    private static void b(String str, List<String> list, JSONObject jSONObject, Map<String, Object> map, ekc.b.C0313b c0313b) {
        if (TextUtils.isEmpty(str)) {
            e(jSONObject, map, c0313b.getMatchingCondition());
        } else {
            e(jSONObject, map, list);
        }
    }

    private static ekc.b.f e(ekc.b.f fVar, ekc.b.C0313b c0313b) {
        return fVar == null ? c0313b.getSortCondition() : fVar;
    }

    private static void e(List<String> list, ekc.b.C0313b c0313b) {
        if (list.size() <= 0) {
            list.addAll(c0313b.getMatchingCondition());
        }
    }

    private static String e(String str, ekc.b.C0313b c0313b) {
        return TextUtils.isEmpty(str) ? c0313b.getConditionRules() : str;
    }

    private static JSONObject a(ekc.b.f fVar, List<JSONObject> list) {
        if (fVar == null || list.size() <= 0) {
            LogUtil.a("FilterDataUtil", "sortCondition == null || filterDataList.size() <= 0 ");
            return null;
        }
        a(list, fVar, (ekc.b.a) null);
        return list.get(0);
    }

    private static void a(List<JSONObject> list, final ekc.b.f fVar, final ekc.b.a aVar) {
        if (fVar == null && aVar == null) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: ekt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ekr.e(fVar, aVar, (JSONObject) obj, (JSONObject) obj2);
            }
        });
    }

    static /* synthetic */ int e(ekc.b.f fVar, ekc.b.a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!TextUtils.isEmpty(a(fVar, aVar))) {
            if (e(a(jSONObject, a(fVar, aVar)), a(jSONObject2, a(fVar, aVar))) && a(jSONObject, jSONObject2, fVar, aVar) != -10) {
                return a(jSONObject, jSONObject2, fVar, aVar);
            }
            return a(d(fVar, aVar), a(jSONObject, a(fVar, aVar)), a(jSONObject2, a(fVar, aVar)));
        }
        LogUtil.a("FilterDataUtil", "The configuration does not exist.");
        return a(d(fVar, aVar), a(jSONObject, "startTime"), a(jSONObject2, "startTime"));
    }

    private static String a(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        LogUtil.a("FilterDataUtil", "jsonObject or key is null");
        return "";
    }

    private static String a(ekc.b.f fVar, ekc.b.a aVar) {
        if (fVar != null) {
            return fVar.getKey();
        }
        if (aVar != null) {
            return aVar.getKey();
        }
        LogUtil.a("FilterDataUtil", "key is null");
        return "";
    }

    private static String d(ekc.b.f fVar, ekc.b.a aVar) {
        if (fVar != null) {
            return fVar.getSortRules();
        }
        if (aVar != null) {
            return aVar.getSortRules();
        }
        LogUtil.a("FilterDataUtil", "sortCondition or allDataSortCondition is null");
        return "";
    }

    private static int a(JSONObject jSONObject, JSONObject jSONObject2, ekc.b.f fVar, ekc.b.a aVar) {
        List<ekc.b.c> listB;
        if ((fVar == null && aVar == null) || jSONObject == null || jSONObject2 == null || (listB = b(fVar, aVar)) == null || listB.size() <= 0) {
            return -10;
        }
        for (int i = 0; i < listB.size(); i++) {
            ekc.b.c cVar = listB.get(i);
            if (!e(a(jSONObject, cVar.getKey()), a(jSONObject2, cVar.getKey()))) {
                return a(d(fVar, aVar), a(jSONObject, cVar.getKey()), a(jSONObject2, cVar.getKey()));
            }
        }
        return -10;
    }

    private static List<ekc.b.c> b(ekc.b.f fVar, ekc.b.a aVar) {
        List<ekc.b.c> arrayList = new ArrayList<>();
        if (fVar != null) {
            arrayList = fVar.getParamsLists();
        }
        return aVar != null ? aVar.getParamsLists() : arrayList;
    }

    private static boolean e(String str, String str2) {
        return Objects.equals(str, str2);
    }

    private static int a(String str, String str2, String str3) {
        str.hashCode();
        if (str.equals("Reverse")) {
            return ela.d().b(str3, str2);
        }
        if (str.equals("Positive")) {
            return ela.d().b(str2, str3);
        }
        return ela.d().b(str3, str2);
    }

    private static void e(JSONObject jSONObject, Map<String, Object> map, List<String> list) {
        for (String str : list) {
            if ("currentTime".equals(str)) {
                map.put(str, String.valueOf(System.currentTimeMillis()));
            } else {
                map.put(str, a(jSONObject, str));
            }
        }
    }
}

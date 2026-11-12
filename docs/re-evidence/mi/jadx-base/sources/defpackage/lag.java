package defpackage;

import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class lag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qpe f24827a = aqe.f(lag.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static lag f24828b = new lag();

    public enum a {
        PROCESSING,
        FOLLOWUP,
        FINISH,
        NONE
    }

    public static a b(String str) {
        a aVar = a.PROCESSING;
        if (str.equalsIgnoreCase(aVar.toString())) {
            return aVar;
        }
        a aVar2 = a.FOLLOWUP;
        if (str.equalsIgnoreCase(aVar2.toString())) {
            return aVar2;
        }
        a aVar3 = a.FINISH;
        return str.equalsIgnoreCase(aVar3.toString()) ? aVar3 : a.NONE;
    }

    public static lag d() {
        return f24828b;
    }

    public List<JSONObject> a(List<JSONObject> list, n08 n08Var) {
        if (list.isEmpty()) {
            return list;
        }
        try {
            if (f(n08Var)) {
                return Collections.emptyList();
            }
            JSONObject jSONObjectE = e(n08Var);
            if (jSONObjectE != null && System.currentTimeMillis() - jSONObjectE.optLong("timestamp") <= 30000) {
                a aVarB = b(jSONObjectE.optString("dialog_status", ""));
                a aVar = a.PROCESSING;
                if (aVarB == aVar && !g(n08Var)) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                String strC = c(jSONObjectE);
                if (aVarB == aVar) {
                    for (JSONObject jSONObject : list) {
                        if (c(jSONObject).equalsIgnoreCase(strC)) {
                            arrayList.add(jSONObject);
                            break;
                        }
                    }
                } else {
                    for (JSONObject jSONObject2 : list) {
                        if (c(jSONObject2).equalsIgnoreCase(strC) && a.FOLLOWUP == b(jSONObject2.optString("dialog_status", ""))) {
                            arrayList.add(jSONObject2);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.addAll(list);
                }
                return arrayList;
            }
            return list;
        } catch (JSONException e) {
            e.printStackTrace();
            f24827a.error("Fail to checkMultiTurn: " + e.toString());
            return list;
        }
    }

    public final String c(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("domain");
        if (!string.equals("smartApp")) {
            return string;
        }
        return string + ":" + jSONObject.getString("app");
    }

    public final JSONObject e(n08 n08Var) throws JSONException {
        JSONObject jSONObjectA = n08Var.getSession().a();
        JSONObject jSONObject = null;
        if (jSONObjectA == null) {
            return null;
        }
        Object objOpt = jSONObjectA.opt("intention");
        if (objOpt instanceof String) {
            jSONObject = new JSONObject((String) objOpt);
        } else if (objOpt instanceof JSONObject) {
            jSONObject = (JSONObject) objOpt;
        }
        if (jSONObject != null) {
            jSONObject.put("timestamp", n08Var.getSession().b());
        }
        return jSONObject;
    }

    public final boolean f(n08 n08Var) {
        JSONObject jSONObjectA = n08Var.getSession().a();
        return (jSONObjectA == null || !"openplatform".equalsIgnoreCase(jSONObjectA.optString("domain")) || q08.a(jSONObjectA.optString(OneTrack.Param.SESSION_ID))) ? false : true;
    }

    public final boolean g(n08 n08Var) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectA = n08Var.getSession().a();
        if (jSONObjectA == null) {
            return false;
        }
        Object objOpt = jSONObjectA.opt("answer");
        if (objOpt instanceof String) {
            jSONObject = new JSONObject((String) objOpt);
        } else if (objOpt instanceof JSONArray) {
            jSONObject = ((JSONArray) objOpt).getJSONObject(0);
        } else {
            jSONObject = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
        }
        if (jSONObject != null) {
            return jSONObject.optBoolean("from_edge_build", false);
        }
        return false;
    }
}

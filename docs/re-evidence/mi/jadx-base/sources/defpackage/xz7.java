package defpackage;

import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.domain.phonecall.PhonecallAppFacadeV3;
import com.xiaomi.ai.edge.common.model.EdgeNetworkType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class xz7 {
    public static List<Instruction> a(a08 a08Var) {
        ArrayList arrayList = null;
        if (a08Var == null) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            try {
                JSONArray jSONArray = a08Var.b().getJSONArray("instructions");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList2.add(APIUtils.readInstruction(jSONArray.get(i).toString()));
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static String b(JSONObject jSONObject, String str, n08 n08Var, k08 k08Var) {
        String strC = c(jSONObject, str, n08Var, k08Var);
        return !q08.a(strC) ? strC.replaceAll("(啊|吧|罢|的|啦|了|嘛|么|哪|呢|哇|呀)+$", "") : strC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.String] */
    public static String c(JSONObject jSONObject, String str, n08 n08Var, k08 k08Var) {
        ?? r12;
        if (jSONObject == null || k08Var == null || n08Var.getDevice().c() == EdgeNetworkType.OFFLINE) {
            return null;
        }
        if (PhonecallAppFacadeV3.getInstance().getDomain().equalsIgnoreCase(jSONObject.optString("domain"))) {
            return null;
        }
        long j = 0;
        ?? r13 = 0;
        long jCurrentTimeMillis = 0;
        while (j < 1000) {
            String strA = k08Var.a();
            if (!q08.a(strA)) {
                return strA;
            }
            ?? B = k08Var.b();
            if (str.equalsIgnoreCase(B)) {
                return B;
            }
            if (q08.a(B)) {
                if (!q08.a(r13)) {
                    return r13;
                }
                if (j >= 300) {
                    r12 = r13;
                    return null;
                }
            } else if (!B.equals(r13)) {
                jCurrentTimeMillis = System.currentTimeMillis();
                r12 = B;
            } else if (System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                r12 = r13;
                return B;
            }
            r12 = r13;
            r12 = r13;
            long j2 = j < 300 ? 10L : 5L;
            try {
                Thread.sleep(j2);
            } catch (InterruptedException unused) {
            }
            j += j2;
            r13 = r12;
        }
        String strA2 = k08Var.a();
        return q08.a(strA2) ? k08Var.b() : strA2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(JSONObject jSONObject, List<Instruction> list) {
        String domain;
        if (list != null && !list.isEmpty()) {
            Iterator<Instruction> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    domain = null;
                    break;
                }
                Instruction next = it.next();
                if (next.getFullName().equals(AIApiConstants.Nlp.AuxiliaryIntention)) {
                    if (Nlp.IntentionType.PHONE.equals(((Nlp.AuxiliaryIntention) next.getPayload()).getType())) {
                        domain = PhonecallAppFacadeV3.getInstance().getDomain();
                        break;
                    }
                }
            }
        } else {
            domain = null;
            break;
        }
        return q08.a(domain) ? jSONObject != null ? jSONObject.optString("domain", null) : null : domain;
    }

    public static String e(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString;
        if (jSONObject2 != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("answer");
            if (jSONObjectOptJSONObject != null) {
                jSONObject2 = jSONObjectOptJSONObject;
            }
            strOptString = jSONObject2.optString("domain", null);
        } else {
            strOptString = null;
        }
        return q08.a(strOptString) ? jSONObject != null ? jSONObject.optString("domain", null) : null : strOptString;
    }

    public static boolean f(String str, String str2) {
        return jk1.b().a(str, str2);
    }
}

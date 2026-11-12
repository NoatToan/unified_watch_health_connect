package defpackage;

import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.domain.mobileapp.MobileAppFacade;
import com.xiaomi.ai.domain.phonecall.PhonecallAppFacadeV3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class wz7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qpe f38499b = aqe.f(wz7.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<b> f38500a;

    public class a implements Comparator<JSONObject> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
            int iCompare = Double.compare(jSONObject2.optDouble("score", 0.0d), jSONObject.optDouble("score", 0.0d));
            if (iCompare != 0) {
                return iCompare;
            }
            return Double.compare(jSONObject2.optDouble("prob", 0.0d), jSONObject.optDouble("prob", 0.0d));
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public yz7 f38502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zz7 f38503b;
        public e6h c;

        public b(yz7 yz7Var, zz7 zz7Var, e6h e6hVar) {
            this.f38502a = yz7Var;
            this.f38503b = zz7Var;
            this.c = e6hVar;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final wz7 f38504a = new wz7(null);
    }

    public /* synthetic */ wz7(a aVar) {
        this();
    }

    public static wz7 a() {
        return c.f38504a;
    }

    public a08 b(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        a08 a08VarProvide;
        if (n08Var == null) {
            n08Var = new n08();
        }
        String strE = xz7.e(jSONObject, jSONObject2);
        Iterator<b> it = this.f38500a.iterator();
        while (true) {
            if (!it.hasNext()) {
                a08VarProvide = null;
                break;
            }
            b next = it.next();
            yz7 yz7Var = next.f38502a;
            if (yz7Var != null && yz7Var.getDomain().equalsIgnoreCase(strE)) {
                if (n08Var.getContext().d()) {
                    g(strE);
                }
                a08VarProvide = next.f38502a.provide(jSONObject, jSONObject2, n08Var);
                break;
            }
        }
        a08 a08Var = (a08VarProvide == null || a08VarProvide.b() != null) ? a08VarProvide : null;
        if (a08Var != null) {
            try {
                a08Var.b().getJSONArray("answer").getJSONObject(0).put("from_edge_build", true);
            } catch (JSONException e) {
                e.printStackTrace();
                f38499b.error("fail to add timestamp for edge nlp result: " + e.toString());
            }
        }
        return a08Var;
    }

    public b08 c(JSONObject jSONObject, List<Instruction> list, n08 n08Var) {
        long jG;
        a08 a08VarProvide;
        if (n08Var == null) {
            n08Var = new n08();
        }
        String strD = xz7.d(jSONObject, list);
        Iterator<b> it = this.f38500a.iterator();
        while (true) {
            jG = 0;
            if (!it.hasNext()) {
                a08VarProvide = null;
                break;
            }
            b next = it.next();
            zz7 zz7Var = next.f38503b;
            if (zz7Var != null && zz7Var.getDomain().equalsIgnoreCase(strD)) {
                if (n08Var.getContext().d()) {
                    f38499b.info("{},waitInitDataIfNeed start:List<Contact>size:{}", n08Var.getRequestId(), Integer.valueOf(c7g.e()));
                    jG = g(strD);
                }
                f38499b.info("{},provide3.0:ModelInitManager.isPhoneCallDataInit:{}", n08Var.getRequestId(), Boolean.valueOf(c7g.j()));
                a08VarProvide = next.f38503b.provide(jSONObject, list, n08Var);
                break;
            }
        }
        if (a08VarProvide != null && a08VarProvide.b() == null) {
            a08VarProvide = null;
        }
        List<Instruction> listA = xz7.a(a08VarProvide);
        if (listA == null) {
            return null;
        }
        JSONObject jSONObjectA = a08VarProvide.a();
        try {
            jSONObjectA = jSONObjectA.put("time_load_contact", jG);
        } catch (JSONException e) {
            f38499b.error("put time_load_contact error!", (Throwable) e);
        }
        f38499b.info("provide3.0 edgeEventInfoJS:{}", jSONObjectA);
        return new b08(listA, jSONObjectA);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    public JSONObject d(JSONObject jSONObject, n08 n08Var, k08 k08Var) {
        boolean z;
        String strB;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (n08Var == null) {
            n08Var = new n08();
        }
        JSONObject jSONObjectF = f(jSONObject, n08Var);
        if (jSONObjectF == null) {
            return null;
        }
        if (jSONObject.optDouble("confidence", 0.0d) <= 0.999d) {
            z = jSONObject.optBoolean("full_confident_asr", false);
        }
        String strOptString = jSONObject.optString(SearchIntents.EXTRA_QUERY, "");
        if (z) {
            strB = strOptString;
        } else {
            strB = xz7.b(jSONObjectF, strOptString, n08Var, k08Var);
            if (q08.a(strB) || xz7.f(strOptString, strB)) {
                strB = strOptString;
            } else {
                jSONObjectF = e(strB, n08Var);
            }
        }
        JSONObject jSONObject2 = (jSONObjectF == null || kug.b().a(strB, jSONObjectF)) ? jSONObjectF : null;
        if (jSONObject2 != null) {
            try {
                jSONObject2.put("nlp_edge_parse_cost", System.currentTimeMillis() - jCurrentTimeMillis);
                jSONObject2.put("nlp_edge_origin_query", strOptString);
                jSONObject2.put("nlp_edge_real_use_query", strB);
                jSONObject2.put("nlp_edge_full_confident_asr", z);
            } catch (JSONException unused) {
            }
        }
        return jSONObject2;
    }

    public final JSONObject e(String str, n08 n08Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SearchIntents.EXTRA_QUERY, str);
            jSONObject.put("confidence", 1.0d);
            return f(jSONObject, n08Var);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final JSONObject f(JSONObject jSONObject, n08 n08Var) {
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString(SearchIntents.EXTRA_QUERY, null);
        double dOptDouble = jSONObject.optDouble("confidence", 0.0d);
        if (q08.a(strOptString) || dOptDouble < 0.6d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f38500a) {
            if (bVar.c.a(jSONObject, n08Var)) {
                try {
                    zz7 zz7Var = bVar.f38503b;
                    jSONObject2 = zz7Var != null ? zz7Var.parse(strOptString, n08Var) : bVar.f38502a.parse(strOptString, n08Var);
                } catch (Exception unused) {
                    f38499b.info("fail to parse query in domain: " + bVar.f38502a.getDomain());
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    double dOptDouble2 = jSONObject2.optDouble("score", 0.0d);
                    if (dOptDouble2 >= 0.6d) {
                        bVar.c.b(jSONObject2, jSONObject, n08Var);
                        arrayList.add(jSONObject2);
                        if (dOptDouble2 > 0.99d) {
                            arrayList.clear();
                            arrayList.add(jSONObject2);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        List<JSONObject> listA = lag.d().a(arrayList, n08Var);
        Collections.sort(listA, new a());
        if (listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public final long g(String str) {
        if (!str.equalsIgnoreCase(PhonecallAppFacadeV3.getInstance().getDomain())) {
            return c7g.b();
        }
        for (long j = 3000; !c7g.j() && j > 0; j -= 100) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        long jB = c7g.b();
        c7g.n(-999L);
        f38499b.info("provide3.0,waitInitDataIfNeed end :isPhoneCallDataInit:{},initCost:{}", Boolean.valueOf(c7g.j()), Long.valueOf(jB));
        return jB;
    }

    public wz7() {
        ArrayList arrayList = new ArrayList();
        this.f38500a = arrayList;
        arrayList.add(new b(bbc.a(), null, new g6h()));
        this.f38500a.add(new b(null, PhonecallAppFacadeV3.getInstance(), new i6h()));
        this.f38500a.add(new b(MobileAppFacade.getInstance(), null, new h6h()));
    }
}

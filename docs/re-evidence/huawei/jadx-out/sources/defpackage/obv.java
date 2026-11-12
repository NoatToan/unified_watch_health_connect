package defpackage;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public class obv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44076a = "RequestGetDevServInfo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private obr f44078c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private obu f44077b = null;
    private obx d = null;

    public void c(obr obrVar) {
        this.f44078c = obrVar;
    }

    public void d(obu obuVar) {
        this.f44077b = obuVar;
    }

    public void a(obx obxVar) {
        this.d = obxVar;
    }

    public String e() {
        String str = f44076a;
        ocq.e(str, "Build RequestInfo JsonObj start");
        JSONArray jSONArray = new JSONArray();
        obr obrVar = this.f44078c;
        if (obrVar != null) {
            jSONArray.put(obrVar.e());
        }
        obx obxVar = this.d;
        if (obxVar != null) {
            jSONArray.put(obxVar.d());
        }
        obu obuVar = this.f44077b;
        if (obuVar != null) {
            jSONArray.put(obuVar.b());
        }
        if (ocq.f44154c.booleanValue()) {
            ocq.e(str, "Build RequestInfo JsonObj result:" + jSONArray.toString());
        }
        return jSONArray.toString();
    }
}

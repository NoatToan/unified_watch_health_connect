package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class s6q extends q6q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33355b;
    public y6q.c c;

    public s6q(String str, y6q.c cVar) {
        super(1);
        this.c = cVar;
        this.f33355b = str;
    }

    public static s6q b(JSONObject jSONObject) {
        y6q.c cVar;
        String string = null;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("file");
            if (jSONObject2.has("dataChannel")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("dataChannel");
                jpe.h("UDTFileTransferController", "method data channel json: " + jSONObject3);
                cVar = new y6q.c(jSONObject3);
            } else {
                cVar = null;
            }
            try {
                if (jSONObject2.has("target")) {
                    string = jSONObject2.getString("target");
                }
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
            }
        } catch (JSONException e2) {
            e = e2;
            cVar = null;
        }
        return new s6q(string, cVar);
    }

    @Override // defpackage.q6q
    public JSONObject a() {
        JSONObject jSONObjectA = super.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("target", this.f33355b);
            y6q.c cVar = this.c;
            if (cVar != null) {
                jSONObject.put("dataChannel", cVar.d());
            }
            jSONObjectA.put("file", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObjectA;
    }
}

package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class i6h extends f6h {
    public double c = c08.b().a().optDouble(c08.f4779b, 0.67d);

    @Override // defpackage.e6h
    public void b(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        if (d(jSONObject2) >= this.c) {
            c(jSONObject, true, 600);
        } else {
            c(jSONObject, true, 2000);
        }
    }
}

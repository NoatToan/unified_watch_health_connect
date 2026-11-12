package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class rqh extends g3s {
    public int h;
    public long i = -1;
    public long j = -1;

    public static rqh e() {
        return new rqh();
    }

    @Override // defpackage.g3s
    public JSONObject c() {
        try {
            JSONObject jSONObjectC = super.c();
            if (jSONObjectC == null) {
                return null;
            }
            jSONObjectC.put("code", this.h);
            jSONObjectC.put("perfCounts", this.i);
            jSONObjectC.put("perfLatencies", this.j);
            return jSONObjectC;
        } catch (JSONException e) {
            x9s.s(e);
            return null;
        }
    }

    @Override // defpackage.g3s
    public String d() {
        return super.d();
    }
}

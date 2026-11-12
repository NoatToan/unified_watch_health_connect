package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class od8 extends g3s {
    public String h;
    public int i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29032k;

    @Override // defpackage.g3s
    public JSONObject c() {
        try {
            JSONObject jSONObjectC = super.c();
            if (jSONObjectC == null) {
                return null;
            }
            jSONObjectC.put("eventId", this.h);
            jSONObjectC.put("eventType", this.i);
            jSONObjectC.put("eventTime", this.j);
            String str = this.f29032k;
            if (str == null) {
                str = "";
            }
            jSONObjectC.put("eventContent", str);
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

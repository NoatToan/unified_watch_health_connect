package defpackage;

import com.xiaomi.ai.edge.common.model.EdgeNetworkType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class f6h implements e6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f17459a = 0.6d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f17460b = 0.6d;

    @Override // defpackage.e6h
    public boolean a(JSONObject jSONObject, n08 n08Var) {
        double d = d(jSONObject);
        if (e(n08Var)) {
            return d >= this.f17459a;
        }
        return d >= this.f17460b;
    }

    public void c(JSONObject jSONObject, boolean z, int i) {
        if (jSONObject != null) {
            try {
                jSONObject.put("suggestWaitingOnline", z);
                if (z) {
                    jSONObject.put("suggestWaitingTimeout", i);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public double d(JSONObject jSONObject) {
        return jSONObject.optDouble("confidence", 0.0d);
    }

    public boolean e(n08 n08Var) {
        return n08Var != null && n08Var.getDevice().c() == EdgeNetworkType.OFFLINE;
    }
}

package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23465a = "loopType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23466b = "loopType";
    public String c = "CurrentLoopType";
    public int d = 0;

    public int a() {
        return this.d;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.d = jSONObject.getInt(this.f23466b);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("initFromJson: error ");
            sb.append(e.getMessage());
        }
    }
}

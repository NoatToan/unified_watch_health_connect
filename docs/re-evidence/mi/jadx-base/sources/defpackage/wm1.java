package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<km1> f38115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38116b = "list";
    public String c = "AudioList";
    public String d = "audioList";

    public List<km1> a() {
        return this.f38115a;
    }

    public void b(JSONObject jSONObject) {
        if (this.f38115a == null) {
            this.f38115a = new ArrayList();
        }
        this.f38115a.clear();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(this.f38116b);
            for (int i = 0; !jSONArray.isNull(i); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                km1 km1Var = new km1();
                km1Var.f(jSONObject2);
                this.f38115a.add(km1Var);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("initFromJson: error ");
            sb.append(e.getMessage());
        }
    }
}

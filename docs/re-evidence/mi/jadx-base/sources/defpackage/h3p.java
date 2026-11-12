package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class h3p extends g2h {
    public String i;

    public h3p(int i, int i2, String str, double d) {
        super(i, i2, str, d, d, false, false);
        n("temperature");
    }

    @Override // defpackage.yb8
    public String c() {
        return "<Temperature>";
    }

    @Override // defpackage.g2h, defpackage.yb8
    public List<q69> h() {
        HashMap map = new HashMap();
        if (o() != null) {
            map.put(l(), o());
        }
        HashMap map2 = new HashMap();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(RealNameWebViewActivity.NUMBER, Double.valueOf(k()));
        jsonObject.addProperty("type", "temperature");
        jsonObject.addProperty("unit", this.i);
        map2.put(l(), jsonObject);
        q69 q69Var = new q69(d(), b(), e(), map, null);
        q69Var.l(map2);
        return Collections.singletonList(q69Var);
    }

    @Override // defpackage.g2h
    public void m(JsonObject jsonObject) {
        jsonObject.addProperty("unit", this.i);
    }

    public void p(String str) {
        this.i = str;
    }
}

package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class m2h extends yb8 {
    public double d;

    public m2h(int i, int i2, String str, double d) {
        super(i, i2, str);
        this.d = d;
    }

    private String j(double d) {
        long j = (long) d;
        return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
    }

    @Override // defpackage.yb8
    public String c() {
        return "<Number>";
    }

    @Override // defpackage.yb8
    public List<q69> h() {
        HashMap map = new HashMap();
        map.put(RealNameWebViewActivity.NUMBER, j(this.d));
        return Collections.singletonList(new q69(d(), b(), e(), map, null));
    }

    @Override // defpackage.yb8
    public JsonObject i() {
        JsonObject jsonObjectA = a();
        jsonObjectA.addProperty("value", j(this.d));
        return jsonObjectA;
    }

    public double k() {
        return this.d;
    }
}

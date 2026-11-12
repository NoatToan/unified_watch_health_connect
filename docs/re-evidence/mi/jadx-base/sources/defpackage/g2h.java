package defpackage;

import androidx.health.connect.client.records.OvulationTestRecord;
import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g2h extends yb8 {
    public boolean d;
    public boolean e;
    public double f;
    public double g;
    public String h;

    public g2h(int i, int i2, String str, double d, double d2, boolean z, boolean z2) {
        super(i, i2, str);
        this.f = d;
        this.g = d2;
        this.e = z;
        this.d = z2;
    }

    @Override // defpackage.yb8
    public List<q69> h() {
        HashMap map = new HashMap();
        if (o() != null) {
            map.put(this.h, o());
        }
        return Collections.singletonList(new q69(d(), b(), e(), map, null));
    }

    @Override // defpackage.yb8
    public JsonObject i() {
        JsonObject jsonObjectA = a();
        if (this.d) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("low", j(this.f));
            jsonObject.addProperty(OvulationTestRecord.Result.HIGH, j(this.g));
            jsonObjectA.add(this.h, jsonObject);
        } else {
            jsonObjectA.addProperty(this.h, j(this.f));
        }
        m(jsonObjectA);
        return jsonObjectA;
    }

    public final String j(double d) {
        return this.e ? String.valueOf((int) d) : String.valueOf(d);
    }

    public double k() {
        return this.f;
    }

    public String l() {
        return this.h;
    }

    public void m(JsonObject jsonObject) {
    }

    public void n(String str) {
        this.h = str;
    }

    public String o() {
        if (!this.d) {
            return j(this.f);
        }
        double d = this.f;
        if (d == Double.MIN_VALUE && this.g == Double.MAX_VALUE) {
            return null;
        }
        if (d != Double.MIN_VALUE && this.g != Double.MAX_VALUE) {
            return j(this.f) + "<" + j(this.g);
        }
        if (d == Double.MIN_VALUE) {
            return "<" + j(this.g);
        }
        return ">" + j(this.f);
    }
}

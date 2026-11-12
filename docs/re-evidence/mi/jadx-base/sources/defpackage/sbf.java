package defpackage;

import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class sbf extends g2h {
    public String i;

    public sbf(int i, int i2, String str, double d) {
        super(i, i2, str, d, d, false, false);
        n("measure_unit");
    }

    @Override // defpackage.yb8
    public String c() {
        return "<MeasureUnit>";
    }

    @Override // defpackage.g2h, defpackage.yb8
    public List<q69> h() {
        HashMap map = new HashMap();
        if (o() != null) {
            map.put(l(), o());
        }
        map.put("norm_unit_name", this.i);
        return Collections.singletonList(new q69(d(), b(), e(), map, null));
    }

    @Override // defpackage.g2h
    public void m(JsonObject jsonObject) {
        jsonObject.addProperty("norm_unit_name", this.i);
    }

    public void p(String str) {
        this.i = str;
    }
}
